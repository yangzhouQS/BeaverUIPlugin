// 从 docs-website 组件 md 生成 IDEA 插件三件套数据（TagConstant / DocumentConstant / live templates）
// 用法：node scripts/gen-plugin-data.mjs
// 数据源：../docs-website/component/*.md（83 份结构化 API 表）
import fs from 'node:fs'
import path from 'node:path'
import url from 'node:url'

const HERE = path.dirname(url.fileURLToPath(import.meta.url))
const MD_DIR = path.resolve(HERE, '..', '..', '2026-08-31beaver-ui', 'docs-website', 'component')
const OUT_DIR = path.resolve(HERE, '..', 'src', 'main')

// ============ 配置 ============
// 优先收录的自研/高频组件（其余 EP 组件也收，但排除已移除组件）
const PRIORITY = [
  'table-kit', 'list-kit', 'list', 'search-select', 'search-tree-select',
  'search-tree-panel', 'date-range-picker', 'panel', 'tool-bar', 'box',
  'flex-box', 'flex-line', 'filter-item', 'grid',
]
// 已移除组件（迁移指南清单，防误导提示）
const EXCLUDED = ['infinite-scroll', 'skeleton']
// EP 组件中值得提示的高频子集（避免 83 全量塞入插件，控制体积；优先级组件全收）
const EP_INCLUDE = [
  'button', 'input', 'select', 'date-picker', 'form', 'table', 'dialog',
  'radio', 'checkbox', 'switch', 'tag', 'pagination', 'message', 'notification',
  'dropdown', 'tabs', 'tree-select', 'cascader', 'popover', 'tooltip',
  'input-number', 'time-picker', 'divider', 'empty', 'progress', 'badge',
  'alert', 'card', 'avatar', 'breadcrumb', 'steps', 'menu', 'tooltip',
]

const SITE = 'https://beaver-ui.yearrow.com/component'

// ============ md 解析 ============
function parseMd(name, code) {
  const lines = code.split('\n')
  // 标题行：# List 列表 → 中文备注
  const h1 = (lines.find((l) => l.startsWith('# ')) || '').replace(/^#\s+/, '')
  const cnName = (h1.match(/[\u4e00-\u9fa5].*$/) || [''])[0].trim()

  // 收集各 section 表格：### Xxx Attributes/Events/Slots/Exposes 等
  const tables = [] // { section, rows: [{ name, desc, type, values, def }] }
  let section = ''
  let header = null
  for (const line of lines) {
    if (line.startsWith('### ')) { section = line.replace(/^###\s+/, '').trim(); continue }
    if (line.startsWith('## ')) { section = ''; continue }
    if (/^\|/.test(line)) {
      // md 表格内的转义管道（\| 或 \\|）先占位，避免 split('|') 切碎枚举段
      const guarded = line.replace(/\\\\\|/g, '\u0002').replace(/\\\|/g, '\u0002')
      const cells = guarded.split('|').map((c) => c.replace(/\u0002/g, '\\|').trim())
      if (cells[0] === '' ) cells.shift()
      if (cells[cells.length - 1] === '') cells.pop()
      if (cells.every((c) => /^:?-{2,}:?$/.test(c) || c === '')) continue // 分隔行
      if (/属性名|参数|事件名|插槽|方法名|名称/.test(cells[0]) && /说明/.test(cells[1] || '')) {
        header = cells; continue
      }
      if (header && cells.length >= 3) {
        // 按表头定位列：可选值列存在则用之；EP 四列表（无可选值列）
        // 时从类型列的 ^[enum]`...` 反引号段提取候选
        const hIdx = (h) => header.findIndex((c) => c.includes(h))
        const valuesIdx = hIdx('可选值') >= 0 ? hIdx('可选值') : -1
        const typeIdx = hIdx('类型') >= 0 ? hIdx('类型') : -1
        const defIdx = hIdx('默认值') >= 0 ? hIdx('默认值') : -1
        const isEvents = /事件名/.test(header[0]) || /事件/.test(header[0])
        const isSlots = /插槽名/.test(header[0]) || /插槽/.test(header[0])
        tables.push({
          section,
          name: cells[0],
          desc: cells[1] || '',
          type: typeIdx >= 0 ? cells[typeIdx] || '' : (cells[2] || ''),
          values: valuesIdx >= 0 ? (cells[valuesIdx] || '') : '',
          def: defIdx >= 0 ? (cells[defIdx] || '') : '',
          isEvents, isSlots,
        })
      }
    } else if (line.trim() && !line.startsWith('|')) {
      header = null
    }
  }
  return { name, cnName, tables }
}

// 属性值候选：可选值列直拆；无可选值列时从类型列 ^[enum]`...` 反引号段提取
function propCandidates(row) {
  const raw = row.values && row.values !== '—' ? row.values : row.type
  if (!raw) return []
  const enumMatch = raw.match(/`([^`]*)`/)
  const src = enumMatch ? enumMatch[1] : raw
  // 管道分隔（含转义 \|）统一占位为分隔符，拆分后再还原
  const cleaned = src
    .replace(/\\\s*\|/g, '\u0001')
    .replace(/^\^\[[^\]]*\]/, '')
  const TYPE_WORDS = new Set(['string', 'number', 'boolean', 'array', 'object', 'function', 'component', 'symbol', 'date', 'any', 'void', 'string[]', 'number[]', 'boolean[]'])
  return [...new Set(
    cleaned.split(/[\u0001/、,]/)
      .map((s) => s.trim()
        .replace(/\u0001/g, '|')
        .replace(/`/g, '')
        .replace(/'/g, '')
        .replace(/\\+/g, ' ')
        .replace(/^\^+/, '')
        .trim())
      .filter((s) => s && s !== '—' && s !== '*' && !s.includes('^[') && !/[<>（(]/.test(s) && !/^\[[a-z]+\]$/i.test(s) && !TYPE_WORDS.has(s) && s.length <= 24),
  )].slice(0, 12)
}

// Java 字符串字面量转义（双引号/反斜杠）
const javaEsc = (s) => s.replace(/\\/g, '\\\\').replace(/"/g, '\\"')
// HTML 转义
const esc = (s) => s.replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;').replace(/"/g, '&quot;')

// ============ 生成 ============
function pickComponents() {
  const files = fs.readdirSync(MD_DIR).filter((f) => f.endsWith('.md') && f !== 'overview.md' && f !== 'border.md' && f !== 'color.md')
  const picked = []
  for (const f of files) {
    const name = f.replace('.md', '')
    if (EXCLUDED.includes(name)) continue
    const isPriority = PRIORITY.includes(name)
    const isEpWanted = EP_INCLUDE.includes(name)
    if (!isPriority && !isEpWanted) continue
    picked.push(parseMd(name, fs.readFileSync(path.join(MD_DIR, f), 'utf-8')))
  }
  // 优先组件排前
  picked.sort((a, b) => {
    const ai = PRIORITY.indexOf(a.name), bi = PRIORITY.indexOf(b.name)
    return (ai === -1 ? 99 : ai) - (bi === -1 ? 99 : bi)
  })
  return picked
}

const comps = pickComponents()
console.log(`picked ${comps.length} components`)

// ---- 1) ElementTagConstant.java ----
function genTagConstant() {
  const blocks = []
  for (const c of comps) {
    const attrRows = c.tables.filter((t) => /Attributes|属性/.test(t.section))
    const mapEntries = []
    for (const row of attrRows) {
      // 链接形式 [name](#xx) 取纯名
      const attrName = row.name.replace(/\[([^\]]+)\].*/, '$1').trim()
      if (!attrName || attrName.startsWith('^')) continue
      const cands = propCandidates(row)
      if (cands.length > 0) {
        mapEntries.push(`        m.put("${attrName}", new String[]{${cands.map((v) => `"${javaEsc(v)}"`).join(', ')}});`)
      }
    }
    if (mapEntries.length === 0) continue
    blocks.push(`        // ${c.name} ${c.cnName}
        {
          HashMap<String, String[]> m = new HashMap<>();
${mapEntries.join('\n')}
          TAG_CONSTANT.put("b-${c.name}", m);
        }`)
  }
  return `package com.yearrow.beaverui.xml;

import java.util.HashMap;

/**
 * b-* 标签属性值候选（自动生成：scripts/gen-plugin-data.mjs ← docs-website/component/*.md）
 * 数据快照：beaver-ui 1.0.0
 */
public final class ElementTagConstant {
    public static final HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

    static {
${blocks.join('\n\n')}
    }

    private ElementTagConstant() {}
}
`
}

// ---- 2) DocumentConstant.java ----
function genDocConstant() {
  const fields = []
  for (const c of comps) {
    if (c.tables.length === 0) continue
    const url = `${SITE}/${c.name}`
    const groups = new Map()
    for (const row of c.tables) {
      const sec = row.section.replace(/^(.*?)(Attributes|Events|Slots|Exposes|属性|事件|插槽).*$/, '$1$2').trim()
      if (!groups.has(sec)) groups.set(sec, [])
      groups.get(sec).push(row)
    }
    const parts = []
    for (const [sec, rows] of groups) {
      const isEvents = /Events|事件/.test(sec)
      const isSlots = /Slots|插槽/.test(sec)
      const head = isEvents
        ? '<tr><th>事件名</th><th>说明</th><th>回调参数</th></tr>'
        : isSlots
          ? '<tr><th>插槽名</th><th>说明</th></tr>'
          : '<tr><th>参数</th><th>说明</th><th>类型</th><th>可选值</th><th>默认值</th></tr>'
      const body = rows.map((r) => {
        const dep = r.name.includes('deprecated') ? ' <b style="color:#f56c6c">[已废弃]</b>' : ''
        const nm = esc(r.name.replace(/\s*\^\(.*?\)/g, '').replace(/\s*\^\[.*?\]\(.*?\)/g, '').trim())
        if (isEvents || isSlots) return `<tr><td>${nm}${dep}</td><td>${esc(r.desc)}</td>${isEvents ? `<td>${esc(r.type)}</td>` : ''}</tr>`
        return `<tr><td>${nm}${dep}</td><td>${esc(r.desc)}</td><td>${esc(r.type)}</td><td>${esc(r.values)}</td><td>${esc(r.def)}</td></tr>`
      }).join('')
      parts.push(`<table><thead>${head}</thead><tbody>${body}</tbody></table>`)
    }
    // DocumentProvider 反射按「标签去 - 全小写」匹配 field 名（b-table-only → btableonly）
    const fieldName = ('b' + c.name).replace(/-/g, '')
    fields.push(`    /** b-${c.name} ${c.cnName} */\n    public static String ${fieldName} = "${esc(url)}" + "<br>" +\n        ${parts.map((p) => JSON.stringify(p)).join(' +\n        ')};`)
  }
  return `package com.yearrow.beaverui.document;

/**
 * 组件快速文档 HTML（自动生成：scripts/gen-plugin-data.mjs ← docs-website/component/*.md）
 * 数据快照：beaver-ui 1.0.0
 */
public final class DocumentConstant {
${fields.join('\n\n')}
}
`
}

// ---- 3) beaver.xml live templates ----
function genTemplates() {
  const T = (name, group, value, context) => `  <template name="b${name}" value="${esc(value)}" description="beaver-ui ${name}" toReformat="false" toShortenFQNames="true">
    <variable name="X" expression="" defaultValue="" alwaysStopAt="true"/>
    <context>
      <option name="${context}" value="true"/>
    </context>
  </template>`

  const items = [
    ['Button', `<b-button type="primary">\$X\$</b-button>`, 'HTML'],
    ['Input', `<b-input v-model="form.\$X\$" placeholder="请输入" clearable />`, 'HTML'],
    ['Select', `<b-select v-model="form.\$X\$" placeholder="请选择" clearable />`, 'HTML'],
    ['DatePicker', `<b-date-picker v-model="form.\$X\$" type="daterange" start-placeholder="开始时间" end-placeholder="结束时间" />`, 'HTML'],
    ['Dialog', `<b-dialog v-model="dialogVisible" title="\$X\$" width="600px">\n  <template #footer>\n    <b-button @click="dialogVisible = false">取消</b-button>\n    <b-button type="primary" @click="onConfirm">确定</b-button>\n  </template>\n</b-dialog>`, 'HTML'],
    ['Form', `<b-form ref="formRef" :model="form" :rules="rules" label-width="100px">\n  <b-form-item label="\$X\$" prop="name">\n    <b-input v-model="form.name" />\n  </b-form-item>\n</b-form>`, 'HTML'],
    ['TableOnly', `<b-table-only\n  :table-data="rows"\n  :column-configs="columns"\n  @reload="load"\n/>`, 'HTML'],
    ['TableAsync', `<b-table-async\n  ref="tableRef"\n  :table-data="tableData"\n  :column-configs="columns"\n  :table-loading="loading"\n  :input="{ take: 20, draw: 1 }"\n  @query-change="handleQueryChange"\n/>`, 'HTML'],
    ['ListAsync', `<b-list-async\n  :list-data="listData"\n  item-key="id"\n  @reload="load"\n>\n  <template #item="{ row }">\n    <b-box>\n      <p>\$X\$</p>\n    </b-box>\n  </template>\n</b-list-async>`, 'HTML'],
    ['SearchSelect', `<b-search-select\n  v-model="value"\n  @load="({ skip, take, keyword }, resolve) =>\n    searchApi({ keyword, skip, take }).then((r) => resolve(r.result))"\n/>`, 'HTML'],
    ['Panel', `<b-panel title="\$X\$">\n  <template #tool>\n    <b-button type="primary" link>更多</b-button>\n  </template>\n  内容\n</b-panel>`, 'HTML'],
    ['ToolBar', `<b-tool-bar>\n  <template #filter>\n    <b-col :span="6"><b-filter-item label="\$X\$" label-width="80"><b-input /></b-filter-item></b-col>\n  </template>\n  <template #tool>\n    <b-button type="primary" @click="onSearch">查询</b-button>\n  </template>\n</b-tool-bar>`, 'HTML'],
    ['FlexBox', `<b-flex-box :is-row="true" :item-num="2" :item-config="[{ tag: 'main' }, { tag: 'side', isFixed: true, size: '280px', showDragButton: true }]">\n  <template #main>\$X\$</template>\n  <template #side>侧栏</template>\n</b-flex-box>`, 'HTML'],
    ['DateRange', `<b-date-range-picker\n  v-model="range"\n  type="daterange"\n  :shortcuts="['month', 'quarter', 'year']"\n  default-shortcut="month"\n/>`, 'HTML'],
    ['Message', '<script setup>\nimport { BMessage } from \'@cs/beaver-ui\'\nconst onClick = () => BMessage.success(\'$\')\n</script>', 'VUE_TEMPLATE_TEXT'],
  ]
  return `<?xml version="1.0" encoding="UTF-8"?>
<templateSet group="beaver-ui">
<!-- 自动生成：scripts/gen-plugin-data.mjs；数据快照 beaver-ui 1.0.0 -->
${items.map(([n, v, ctx]) => T(n, 'beaver-ui', v, ctx)).join('\n')}
</templateSet>
`
}

// ---- 写出 ----
fs.mkdirSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'xml'), { recursive: true })
fs.mkdirSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'document'), { recursive: true })
fs.writeFileSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'xml', 'ElementTagConstant.java'), genTagConstant(), 'utf-8')
fs.writeFileSync(path.join(OUT_DIR, 'java', 'com', 'yearrow', 'beaverui', 'document', 'DocumentConstant.java'), genDocConstant(), 'utf-8')
fs.writeFileSync(path.join(OUT_DIR, 'resources', 'beaver.xml'), genTemplates(), 'utf-8')
console.log('generated: ElementTagConstant.java / DocumentConstant.java / beaver.xml')
