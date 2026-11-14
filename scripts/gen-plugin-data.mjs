// beaver-ui 数据集 → IDEA 插件三件套数据（ElementTagConstant / DocumentConstant / live templates）
// 用法：node scripts/gen-plugin-data.mjs
// 数据源：data/beaver-ui@1.0.1.json（beaver-ui-mcp `npm run dataset:build` 从文档站提取）
//        + beaver-ui/src/component.ts（B* 注册表 → b-* 标签的权威来源）
// 产物：src/main/java/.../xml/ElementTagConstant.java（属性候选 + 插槽 + 全局指令）
//       src/main/java/.../document/DocumentConstant.java（Ctrl+Q 速查 HTML）
//       src/main/resources/beaver.xml（Live Templates：template + tsx 双形态）
import fs from 'node:fs'
import path from 'node:path'
import url from 'node:url'

const HERE = path.dirname(url.fileURLToPath(import.meta.url))
const OUT_DIR = path.resolve(HERE, '..', 'src', 'main')

// ============ 配置 ============
const sourceConfig = JSON.parse(fs.readFileSync(path.resolve(HERE, '..', 'data', 'source.json'), 'utf-8'))
const datasetPath = path.resolve(HERE, '..', sourceConfig.dataset)
const componentTsPath = path.resolve(HERE, '..', sourceConfig.componentTs)
const SITE = sourceConfig.docsSite ?? 'https://beaver-ui.yearrow.com'
const SNAPSHOT = 'beaver-ui 1.0.1'

const dataset = JSON.parse(fs.readFileSync(datasetPath, 'utf-8'))
const componentTs = fs.readFileSync(componentTsPath, 'utf-8')

// ============ 标签注册表 ============
// component.ts 中的 B* 标识符 → b-* 标签。注意 BAlert 这类「单驼峰」直接跑通用
// camelToKebab 会得到 balert（B 前无小写边界），必须先剥掉首字母 B。
const ids = [...new Set(componentTs.match(/\bB[A-Z][A-Za-z0-9]*\b/g) ?? [])]
const camelToKebab = (s) => s.replace(/([a-z0-9])([A-Z])/g, '$1-$2').toLowerCase()
const registryOrder = []
for (const id of ids) {
  const tag = 'b-' + camelToKebab(id.replace(/^B/, ''))
  if (!registryOrder.includes(tag)) registryOrder.push(tag)
}
const registry = new Set(registryOrder)

// 套件页：页面主标签不在注册表（文档的是一组壳组件），通用子表复制到全部壳标签
const KIT_SPECIAL = {
  'table-kit': ['b-table-only', 'b-table-async', 'b-table-report', 'b-tree-table', 'b-table-edit'],
  'list-kit': ['b-list-only', 'b-list-async', 'b-list-report'],
}
// 指令文档页：不产出标签数据，属性并入全局指令候选
const DIRECTIVE_PAGES = ['loading', 'auto-tip', 'highlight-query']

const norm = (s) =>
  s.replace(/([a-z0-9])([A-Z])/g, '$1-$2').replace(/[\s_-]+/g, '-').replace(/^-+|-+$/g, '').toLowerCase()

const escHtml = (s) =>
  s.replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;').replace(/"/g, '&quot;')

const cleanDescribe = (s) => (s ?? '').replace(/\^new\b/gi, '').replace(/\^\s*$/, '').trim()

/** 成员属性名归一：model-value / v-model → v-model */
function memberName(name, isEvent) {
  let n = (name ?? '').trim()
  if (n.includes('/')) {
    const parts = n.split('/').map((p) => p.trim())
    n = parts.includes('v-model') ? 'v-model' : parts[0]
  }
  return isEvent ? '@' + n : n
}

/** 属性候选值：类型串按 | 拆分取 'x' 引号项；boolean → true/false；函数类型无候选 */
function candidatesOf(member) {
  const type = (member.type ?? '').trim()
  if (!type) return []
  if (/=>|function/i.test(type)) return []
  if (/^boolean\b/.test(type)) return ['true', 'false']
  const values = type
    .split('|')
    .map((part) => {
      const m = part.trim().match(/^'([^']*)'$/)
      return m ? m[1] : null
    })
    .filter((v) => v !== null && v !== '' && v !== 'deprecated' && !/^\(.+\)$/.test(v) && v.length <= 24)
  return [...new Set(values)].slice(0, 12)
}

// ============ 解析数据集 → 标签数据 ============
const pages = dataset.components
const pageNames = new Set(pages.map((p) => p.name))
const tagData = new Map() // tag → { page, attrs[], events[], slots[], exposes[] }

function emitTag(tag, pageEntry, sub) {
  tagData.set(tag, {
    page: pageEntry.name,
    attrs: dedupeRaw([
      ...(sub.attributes ?? []),
      ...((sub.attributes ?? []).length ? [] : []),
    ]),
    events: dedupeRaw(sub.events ?? []),
    slots: dedupeRaw(sub.slots ?? []),
    exposes: dedupeRaw(sub.exposes ?? []),
  })
}

function dedupeRaw(list) {
  const map = new Map()
  for (const item of list) map.set(item.name, item)
  return [...map.values()]
}

// --- pass 1：每个页面先认领自己的主标签（b-<page>）---
const mainAssign = new Map() // 页面 → { tag, subName }
for (const pageEntry of pages) {
  if (!['component', 'config'].includes(pageEntry.kind)) continue
  if (KIT_SPECIAL[pageEntry.name]) continue
  const mainTag = `b-${pageEntry.name}`
  if (!registry.has(mainTag)) continue
  const subs = pageEntry.subComponents ?? []
  const mainSub = subs.find((s) => norm(s.name) === pageEntry.name) ?? subs[0]
  if (!mainSub) continue
  if (tagData.has(mainTag)) continue
  emitTag(mainTag, pageEntry, mainSub)
  mainAssign.set(pageEntry.name, { tag: mainTag, subName: mainSub.name })
}

// --- pass 2：子组件标签 ---
for (const pageEntry of pages) {
  if (!['component', 'config'].includes(pageEntry.kind)) continue
  const page = pageEntry.name
  if (page === 'config-provider') continue // 其余子表为跨组件配置残留
  if (KIT_SPECIAL[page]) continue
  const main = mainAssign.get(page)
  for (const sub of pageEntry.subComponents ?? []) {
    const sk = norm(sub.name)
    if (main && sk === norm(main.subName)) continue
    if (pageNames.has(sk)) continue // 该子名是另一个文档页，标签归那个页面
    const candidates = [`b-${sk}`, `b-${page}-${sk}`]
    const tag = candidates.find((t) => registry.has(t) && !tagData.has(t))
    if (!tag) continue
    emitTag(tag, pageEntry, sub)
  }
}

// --- pass 3：套件页复制（通用子表为底，特定子表覆盖）---
for (const [page, tags] of Object.entries(KIT_SPECIAL)) {
  const pageEntry = pages.find((p) => p.name === page)
  if (!pageEntry) continue
  const generic = (pageEntry.subComponents ?? [])[0]
  if (!generic) continue
  const extraSubs = (pageEntry.subComponents ?? []).slice(1)
  for (const tag of tags) {
    if (!registry.has(tag)) continue
    const specific = extraSubs.find((sub) => norm(sub.name) && tag.endsWith(`-${norm(sub.name)}`))
    emitTag(tag, pageEntry, {
      name: tag,
      attributes: dedupeRaw([...(generic.attributes ?? []), ...(specific?.attributes ?? [])]),
      events: dedupeRaw([...(generic.events ?? []), ...(specific?.events ?? [])]),
      slots: dedupeRaw([...(generic.slots ?? []), ...(specific?.slots ?? [])]),
      exposes: dedupeRaw([...(generic.exposes ?? []), ...(specific?.exposes ?? [])]),
    })
  }
}

// ============ 全局指令候选 ============
const directives = []
for (const name of DIRECTIVE_PAGES) {
  const pageEntry = pages.find((p) => p.name === name)
  for (const member of pageEntry?.subComponents?.[0]?.attributes ?? []) {
    directives.push({ name: memberName(member.name, false), candidates: candidatesOf(member) })
  }
}
// v-infinite-scroll：beaver-ui 保留的 EP 同源指令（无文档页）
directives.push(
  { name: 'v-infinite-scroll', candidates: [] },
  { name: 'infinite-scroll-disabled', candidates: ['true', 'false'] },
  { name: 'infinite-scroll-delay', candidates: [] },
  { name: 'infinite-scroll-distance', candidates: [] },
  { name: 'infinite-scroll-immediate', candidates: ['true', 'false'] },
)

// ============ 生成 1) ElementTagConstant.java ============
const javaEsc = (s) => s.replace(/\\/g, '\\\\').replace(/"/g, '\\"')
const candArr = (list) => `new String[]{${list.map((v) => `"${javaEsc(v)}"`).join(', ')}}`

function genTagConstant() {
  const tagBlocks = []
  const slotBlocks = []
  for (const [tag, data] of tagData) {
    const attrEntries = []
    for (const member of data.attrs) {
      const name = memberName(member.name, false)
      if (!name || name === 'null') continue
      attrEntries.push(`      m.put("${javaEsc(name)}", ${candArr(candidatesOf(member))});`)
    }
    if (attrEntries.length === 0) continue
    tagBlocks.push(`    // ${tag}（${data.page}）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
${attrEntries.join('\n')}
      TAG_CONSTANT.put("${tag}", m);
    }`)
    if (data.slots.length) {
      slotBlocks.push(
        `    TAG_SLOTS.put("${tag}", new String[]{${data.slots
          .slice(0, 12)
          .map((s) => `"${javaEsc(s.name)}"`)
          .join(', ')}});`,
      )
    }
  }
  const directiveEntries = directives.map((d) => `    TAG_DIRECTIVES.put("${javaEsc(d.name)}", ${candArr(d.candidates)});`)
  return `package com.yearrow.beaverui.xml;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * b-* 标签属性候选 + 插槽名 + 全局指令（自动生成：scripts/gen-plugin-data.mjs ← beaver-ui 数据集）
 * 数据快照：${SNAPSHOT}（${tagData.size} 个标签 / ${directives.length} 条全局指令）
 *
 * TAG_CONSTANT：标签 → 全部属性（候选值为空数组时仅参与属性名补全，不参与值补全）
 * TAG_SLOTS：标签 → 插槽名（#xxx 伪属性与 v-slot 补全用）
 * TAG_DIRECTIVES：全局指令及配套属性（任意标签可用）
 */
public final class ElementTagConstant {
    public static final Map<String, Map<String, String[]>> TAG_CONSTANT = new LinkedHashMap<>();
    /** 标签 → 插槽名列表（<template #xxx> 补全用） */
    public static final Map<String, String[]> TAG_SLOTS = new LinkedHashMap<>();
    /** 全局指令及配套属性（任意标签可用） */
    public static final Map<String, String[]> TAG_DIRECTIVES = new LinkedHashMap<>();

    static {
${tagBlocks.join('\n\n')}
${slotBlocks.join('\n')}

${directiveEntries.join('\n')}
    }

    private ElementTagConstant() {}
}
`
}

// ============ 生成 2) DocumentConstant.java ============
function genDocConstant() {
  const fields = []
  for (const [tag, data] of tagData) {
    const url = `${SITE}/component/${data.page}`
    const parts = []
    const section = (title, rows, kind) => {
      if (!rows.length) return
      const head =
        kind === 'events'
          ? '<tr><th>事件名</th><th>说明</th><th>回调参数</th></tr>'
          : kind === 'slots'
            ? '<tr><th>插槽名</th><th>说明</th></tr>'
            : kind === 'exposes'
              ? '<tr><th>方法/属性</th><th>说明</th><th>类型</th></tr>'
              : '<tr><th>参数</th><th>说明</th><th>类型</th><th>可选值</th><th>默认值</th></tr>'
      const body = rows
        .map((r) => {
          const nm = memberName(r.name, kind === 'events').replace(/^@/, '')
          const dep = r.deprecated ? ' <b style="color:#f56c6c">[已废弃]</b>' : ''
          const since = r.since ? ` <i>(${r.since} 起)</i>` : ''
          const escName = escHtml(nm) + dep + since
          if (kind === 'events') return `<tr><td>${escName}</td><td>${escHtml(cleanDescribe(r.description))}</td><td>${escHtml(r.type ?? '')}</td></tr>`
          if (kind === 'slots') return `<tr><td>${escName}</td><td>${escHtml(cleanDescribe(r.description))}</td></tr>`
          if (kind === 'exposes') return `<tr><td>${escName}</td><td>${escHtml(cleanDescribe(r.description))}</td><td>${escHtml(r.type ?? '')}</td></tr>`
          const cands = candidatesOf(r).filter((v) => v !== 'true' && v !== 'false')
          return `<tr><td>${escName}</td><td>${escHtml(cleanDescribe(r.description))}</td><td>${escHtml(r.type ?? '')}</td><td>${escHtml(cands.join(' / ') || '—')}</td><td>${escHtml(r.default ?? '—')}</td></tr>`
        })
        .join('')
      parts.push(`<h4>${title}</h4><table><thead>${head}</thead><tbody>${body}</tbody></table>`)
    }
    const title = `b-${data.page}` === tag ? tag : tag
    section('Attributes 属性', data.attrs, 'attrs')
    section('Events 事件', data.events, 'events')
    section('Slots 插槽', data.slots, 'slots')
    section('Exposes 暴露', data.exposes, 'exposes')
    if (parts.length === 0) continue
    const docLink = `<a href='${url}'>查看 ${tag} 在线文档</a>`
    const fieldName = tag.replace(/-/g, '')
    fields.push(
      `    /** ${tag} */\n    public static String ${fieldName} = ${JSON.stringify(docLink)} + "<br>" +\n        ${parts.map((p) => JSON.stringify(p)).join(' +\n        ')};`,
    )
  }
  return `package com.yearrow.beaverui.document;

/**
 * 组件快速文档 HTML（自动生成：scripts/gen-plugin-data.mjs ← beaver-ui 数据集）
 * 数据快照：${SNAPSHOT}
 */
public final class DocumentConstant {
${fields.join('\n\n')}
}
`
}

// ============ 生成 3) beaver.xml live templates ============
function genTemplates() {
  // context ID 以 IDE 2024.2 发行版内置 liveTemplates 实测为准（此前误用 TSX/JSX——
  // 平台从未注册过这两个 ID，IDE 静默忽略，模板在 .tsx 中永远不生效）：
  //   标记区：HTML / XML / TSX_HTML（.tsx JSX 区）/ JSX_HTML（.jsx JSX 区）/ VUE_TEMPLATE（.vue 模板段）
  //   脚本区：VUE_SCRIPT（.vue script 段）/ TS_STATEMENT / JS_STATEMENT / *_TOP_LEVEL_STATEMENT
  const CTX_MARKUP = [
    'HTML', 'XML',
    'VUE_TEMPLATE',
    'TSX_HTML', 'JSX_HTML',
  ]
  const CTX_TSX = [
    'TSX_HTML', 'JSX_HTML',
    'VUE_SCRIPT', // .vue <script lang="tsx"> 段
  ]
  const CTX_SCRIPT = [
    'VUE_SCRIPT',
    'TS_STATEMENT', 'TS_TOP_LEVEL_STATEMENT',
    'JS_STATEMENT', 'JS_TOP_LEVEL_STATEMENT',
  ]

  const ctxOptions = (ids) => ids.map((id) => `<option name="${id}" value="true"/>`).join('')

  const T = (name, value, contexts = CTX_MARKUP) => `  <template name="b${name}" value="${escHtml(value)}" description="beaver-ui ${name}" toReformat="false" toShortenFQNames="true">
    <variable name="X" expression="" defaultValue="" alwaysStopAt="true"/>
    <context>
      ${ctxOptions(contexts)}
    </context>
  </template>`

  const items = [
    // ---- 基础表单 ----
    ['Button', `<b-button type="primary">$X$</b-button>`],
    ['Input', `<b-input v-model="form.$X$" placeholder="请输入" clearable />`],
    ['Select', `<b-select v-model="form.$X$" placeholder="请选择" clearable />`],
    ['SelectV2', `<b-select-v2 v-model="form.$X$" :options="options" placeholder="请选择" filterable clearable />`],
    ['Cascader', `<b-cascader v-model="form.$X$" :options="options" :props="{ checkStrictly: true }" clearable />`],
    ['TreeSelect', `<b-tree-select v-model="form.$X$" :data="treeData" :props="{ label: 'name' }" clearable />`],
    ['DatePicker', `<b-date-picker v-model="form.$X$" type="daterange" start-placeholder="开始时间" end-placeholder="结束时间" />`],
    ['DatePickerPanel', `<b-date-picker-panel v-model="date" type="date" />`],
    ['Calendar', `<b-calendar v-model="date" />`],
    ['Dialog', `<b-dialog v-model="dialogVisible" title="$X$" width="600px">\n  <template #footer>\n    <b-button @click="dialogVisible = false">取消</b-button>\n    <b-button type="primary" @click="onConfirm">确定</b-button>\n  </template>\n</b-dialog>`],
    ['Form', `<b-form ref="formRef" :model="form" :rules="rules" label-width="100px">\n  <b-form-item label="$X$" prop="name">\n    <b-input v-model="form.name" />\n  </b-form-item>\n</b-form>`],
    // ---- 布局 / 容器 ----
    ['Box', `<b-box padding-size="default" border>\n  $X$\n</b-box>`],
    ['Panel', `<b-panel title="$X$">\n  <template #tool>\n    <b-button type="primary" link>更多</b-button>\n  </template>\n  内容\n</b-panel>`],
    ['ToolBar', `<b-tool-bar>\n  <template #filter>\n    <b-col :span="6"><b-filter-item label="$X$" label-width="80"><b-input /></b-filter-item></b-col>\n  </template>\n  <template #tool>\n    <b-button type="primary" @click="onSearch">查询</b-button>\n  </template>\n</b-tool-bar>`],
    ['FlexBox', `<b-flex-box :item-num="2" :item-config="config" height="300px">\n  <template #item-1>\n    <div class="pane">固定区域 1（50px）</div>\n  </template>\n  <template #item-2>\n    <div class="pane">弹性区域 2（flex: 1）</div>\n  </template>\n</b-flex-box>\n\n<script setup>\nimport { ref } from 'vue'\nconst config = ref([\n  { tag: 'item-1', isFixed: true, size: '50px', paddingSize: 'default' },\n  { tag: 'item-2', isFixed: false, size: '', paddingSize: 'default' },\n])\n</${'script'}>`],
    ['FlexLine', `<b-flex-line left-width="50%">\n  <span>左区内容</span>\n  <template #right>\n    <b-button type="primary" link>$X$</b-button>\n  </template>\n</b-flex-line>`],
    ['Divider', `<b-divider foldable title="折叠区" v-model="folded">\n  $X$\n</b-divider>`],
    ['Navigation', `<b-navigation :routers="routers" />`],
    // ---- 表格套件 ----
    ['TableOnly', `<b-table-only\n  :table-data="rows"\n  :column-configs="columns"\n  :table-loading="loading"\n  height="320"\n/>`],
    ['TableAsync', `<b-table-async\n  ref="tableRef"\n  :table-data="tableData"\n  :column-configs="columns"\n  :table-loading="loading"\n  :input="{ take: 20, draw: 1 }"\n  @query-change="handleQueryChange"\n/>`],
    ['TableReport', `<b-table-report\n  :data="rows"\n  :columns="columns"\n  height="320"\n/>`],
    ['TreeTable', `<b-tree-table\n  :data="rows"\n  :columns="columns"\n  row-key="id"\n  :tree-config="{ children: 'children' }"\n  height="360"\n/>`],
    ['TableEdit', `<b-table-edit\n  ref="tableRef"\n  :column-configs="columns"\n  :table-data="rows"\n  :keyboard-config="{ enabled: true }"\n  :rules="{ name: [{ required: true, message: '名称必填' }] }"\n  height="320"\n>\n  <template #edit_name="{ row }">\n    <b-input v-model="row.name" size="small" />\n  </template>\n</b-table-edit>`],
    // ---- 列表套件 ----
    ['ListOnly', `<b-list-only :list-data="rows" height="240" fill wrap>\n  <template #item="{ row }">\n    <b-box>{{ row.$X$ }}</b-box>\n  </template>\n</b-list-only>`],
    ['ListAsync', `<b-list-async\n  :list-data="listData"\n  item-key="id"\n  @reload="load"\n>\n  <template #item="{ row }">\n    <b-box>\n      <p>$X$</p>\n    </b-box>\n  </template>\n</b-list-async>`],
    ['ListReport', `<b-list-report :list-data="rows" height="240">\n  <template #item="{ row }">\n    <b-box>{{ row.$X$ }}</b-box>\n  </template>\n</b-list-report>`],
    // ---- 搜索系列 ----
    ['SearchSelect', `<b-search-select\n  v-model="value"\n  @load="({ skip, take, keyword }, resolve) =>\n    searchApi({ keyword, skip, take }).then((r) => resolve(r.result))"\n/>`],
    ['SearchTreeSelect', `<b-search-tree-select\n  v-model="value"\n  :data="roots"\n  :page-size="20"\n  searchable\n  :props="{ label: 'name', value: 'id' }"\n  style="width: 320px"\n  @load="onLoad"\n  @load-search="onSearch"\n/>`],
    ['SearchTreePanel', `<b-search-tree-panel\n  v-model="value"\n  :data="roots"\n  :props="{ label: 'name', value: 'id' }"\n  @load="onLoad"\n/>`],
    // ---- 其他高频 ----
    ['LabelExtend', `<b-label-extend :content="text" placement="top" />`],
    ['Collapse', `<b-collapse v-model="active">\n  <b-collapse-item title="$X$" name="1">内容</b-collapse-item>\n</b-collapse>`],
    ['Transfer', `<b-transfer v-model="value" :data="transferData" :titles="['源', '目标']" filterable />`],
    ['DateRange', `<b-date-range-picker\n  v-model="range"\n  type="daterange"\n  :shortcuts="['month', 'quarter', 'year']"\n  default-shortcut="month"\n/>`],
    ['Message', `BMessage.success('$X$')`, CTX_SCRIPT],
    // ---- TSX 形态（{{ slot: () => ... }} 双花括号插槽）----
    ['GridTsx', `<b-grid\n  data={rows}\n  columns={columns}\n  height="360"\n  border\n>\n  {{\n    empty: () => <span>暂无记录</span>,\n  }}\n</b-grid>`, CTX_TSX],
    ['TableAsyncTsx', `<b-table-async\n  ref={tableRef}\n  table-data={tableData}\n  column-configs={columns}\n  input={{ take: 20, draw: 1 }}\n  onQueryChange={handleQueryChange}\n/>`, CTX_TSX],
    ['TableEditTsx', `<b-table-edit\n  ref={tableRef}\n  column-configs={columns}\n  table-data={rows}\n  height="320"\n>\n  {{\n    edit_name: ({ row }: any) => <b-input v-model={row.name} size="small" />,\n  }}\n</b-table-edit>`, CTX_TSX],
    ['ListAsyncTsx', `<b-list-async\n  list-data={listData}\n  item-key="id"\n  height="320"\n>\n  {{\n    item: ({ row }: any) => (\n      <b-box>{row.materialName}</b-box>\n    ),\n  }}\n</b-list-async>`, CTX_TSX],
    ['SearchSelectTsx', `<b-search-select\n  v-model={value}\n  load={({ skip, take, keyword }, resolve) =>\n    searchApi({ keyword, skip, take }).then((r) => resolve(r.result))\n  }\n/>`, CTX_TSX],
    ['SearchTreeSelectTsx', `<b-search-tree-select\n  v-model={value}\n  data={roots}\n  page-size={20}\n  searchable\n  props={{ label: 'name', value: 'id' }}\n  style="width: 320px"\n  onLoad={(node, resolve) => loadChildren(node, resolve)}\n/>`, CTX_TSX],
    ['FlexBoxTsx', `<b-flex-box\n  item-num={2}\n  item-config={[\n    { tag: 'item-1', isFixed: false, paddingSize: 'default' },\n    { tag: 'item-2', isFixed: true, size: '200px', paddingSize: 'default' },\n  ]}\n  height="280px"\n>\n  {{\n    "item-1": () => (<div class="pane pane-fluid">流体区（flex: 1）</div>),\n    "item-2": () => (<div class="pane pane-fixed">固定区 200px</div>),\n  }}\n</b-flex-box>`, CTX_TSX],
    ['FlexLineTsx', `<b-flex-line :gap={10}>\n  {{\n    default: () => (<div class="demo-area">左区（默认 50%）</div>),\n    right: () => (<div class="demo-area">右区（占满剩余，右对齐）</div>),\n  }}\n</b-flex-line>`, CTX_TSX],
    ['FilterItemTsx', `<b-filter-item label="项目名称" label-width={90}>\n  {{\n    default: ({ id }: any) => (<b-input id={id} placeholder="请输入项目名称" clearable />),\n  }}\n</b-filter-item>`, CTX_TSX],
    ['BoxTsx', `<b-box padding-size="default" border>\n  {{\n    default: () => (<div>$X$</div>),\n  }}\n</b-box>`, CTX_TSX],
  ]
  return `<?xml version="1.0" encoding="UTF-8"?>
<templateSet group="BeaverUI">
<!-- 自动生成：scripts/gen-plugin-data.mjs；数据快照 ${SNAPSHOT}
     组名从 beaver-ui 改为 BeaverUI：规避 IDE 模板缓存（删除组后记入
     deletedKeys，重装同名组不再加载，改组名即重新注册） -->
${items.map(([n, v, c]) => T(n, v, c)).join('\n')}
</templateSet>
`
}

// ============ 写出 ============
fs.mkdirSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'xml'), { recursive: true })
fs.mkdirSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'document'), { recursive: true })
fs.writeFileSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'xml', 'ElementTagConstant.java'), genTagConstant(), 'utf-8')
fs.writeFileSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'document', 'DocumentConstant.java'), genDocConstant(), 'utf-8')
fs.writeFileSync(path.join(OUT_DIR, 'resources', 'beaver.xml'), genTemplates(), 'utf-8')

const totalAttrs = [...tagData.values()].reduce((n, d) => n + d.attrs.length, 0)
const totalSlots = [...tagData.values()].reduce((n, d) => n + d.slots.length, 0)
console.log(`generated: ElementTagConstant.java / DocumentConstant.java / beaver.xml`)
console.log(`标签 ${tagData.size}｜属性 ${totalAttrs}｜插槽 ${totalSlots}｜全局指令 ${directives.length}`)
