# BeaverUIPlugin

Beaver UI 组件库的 JetBrains IDE（IDEA / WebStorm）开发辅助插件。

## 功能

| 能力 | 入口 | 生效文件 |
| --- | --- | --- |
| **标签补全**——输入 `<b-` 弹出全部 106 个组件标签 | 输入时自动 / Ctrl+Space | .vue 模板段 / .html / .xml |
| **属性名补全**——标签内空格 + Ctrl+Space 弹出该组件**全部属性**（1837 条） | Ctrl+Space | 同上 |
| **属性值候选**——`type=""` 引号内弹出枚举值（如 primary/success/…），布尔属性给出 true/false | Ctrl+Space | 同上 |
| **插槽补全**——`<b-panel #` 弹出插槽伪属性（#default / #tool / …） | Ctrl+Space | .vue 模板段 / .html |
| **TSX 补全**——标签名 / 属性名 / 属性值，`{{ }}` 插槽对象内弹出 `slotName: () => ` 候选 | Ctrl+Space | .tsx / .jsx / .vue script |
| **全局指令**——任意标签可提示 v-loading / v-auto-tip / v-highlight-query / v-infinite-scroll 及配套属性 | Ctrl+Space | 同上 |
| **组件速查文档**——标签名上弹出完整 API 表（属性/事件/插槽/暴露），插槽属性上弹出插槽写法对照 | Ctrl+Q | .vue / .html / **.tsx** |
| **属性候选弹窗**——任意属性位置弹出全部候选值，选中直接写入引号内 | **Ctrl+Alt+Q** | .vue / .tsx（含空引号） |
| **代码模板**——高频组件骨架一键展开（44 条，含 10 条 TSX 形态） | 缩写 + Tab | .vue（模板段与 script 段）/ .tsx / .jsx |
| **在线文档跳转**——文档弹窗与候选弹窗均可跳转组件官网 | 点击链接 / 选末项 | beaver-ui.yearrow.com |

## 代码模板（Live Templates）

| 缩写 | 生成 |
| --- | --- |
| `bButton` / `bInput` / `bSelect` / `bDatePicker` | 基础表单组件骨架 |
| `bForm` | 表单 + 校验规则骨架 |
| `bDialog` | 对话框 + footer 按钮 |
| `bTableOnly` / `bTableAsync` | 表格套件（含 column-configs 旧版列协议） |
| `bListAsync` | 列表套件（#item 卡片插槽） |
| `bSearchSelect` | 远程搜索选择（load 协议：take = pageSize + 1） |
| `bPanel` / `bToolBar` | 面板 / 查询工具栏骨架 |
| `bFlexBox` / `bFlexLine` | 弹性分区 / 左右分栏（.vue 形态） |
| `bFlexBoxTsx` / `bFlexLineTsx` | 同上 **.tsx 形态**（`{{ slot: () => (...) }}` 双花括号插槽写法） |
| `bDateRange` | 报表期间选择器 |
| `bMessage` | BMessage 消息调用 |
| `bGrid` / `bGridTsx` | 全能表格（:data + :columns，#empty 插槽） |
| `bTableOnly` / `bTableAsync` / `bTableReport` / `bTreeTable` / `bTableEdit` | 表格套件（含 column-configs 列协议、行编辑、树配置） |
| `bListOnly` / `bListAsync` / `bListReport` | 列表套件（#item 卡片插槽） |
| `bSearchTreeSelect` / `bSearchTreePanel` | 搜索树选择 / 面板（分页懒加载协议） |
| `bSearchSelect` / `bSearchSelectTsx` | 远程搜索选择（load 协议：take = pageSize + 1） |
| `bBox` / `bBoxTsx` / `bPanel` / `bToolBar` | 盒子 / 面板 / 查询工具栏骨架 |
| `bFlexBox` / `bFlexLine` | 弹性分区 / 左右分栏（.vue 形态） |
| `bFlexBoxTsx` / `bFlexLineTsx` / `bFilterItemTsx` | 同上 **.tsx 形态**（`{{ slot: () => (...) }}` 双花括号插槽写法） |
| `bTableAsyncTsx` / `bTableEditTsx` / `bListAsyncTsx` | 表格/列表套件 **.tsx 形态**（onQueryChange 事件、编辑插槽） |
| `bDivider` / `bCollapse` / `bTransfer` / `bNavigation` / `bLabelExtend` / `bDatePickerPanel` / `bCalendar` | 折叠分割线 / 折叠面板 / 穿梭框 / 页面导航 / 溢出提示 / 日期面板 / 日历 |

## 安装

1. 下载 [Releases](https://github.com/yangzhouQS/BeaverUIPlugin/releases) 中的 `BeaverUIPlugin-x.y.z.zip`
2. IDE → Settings → Plugins → ⚙ → **Install Plugin from Disk…** → 选择 zip → 重启

依赖：IDE 内置 Vue 插件（WebStorm 自带；IDEA 需装 Vue.js 插件）。

## 版本

- **1.1.0**：数据全量对齐 beaver-ui 1.0.1——**106 个 b-* 标签 / 1837 条属性 / 194 个插槽 / 34 条指令**（旧版仅 44 组件且只收录带枚举值的属性）。
  - **属性名补全全覆盖**：所有属性（含无枚举值的）均参与模板属性名补全；TSX 属性名/属性值补全同步扩容
  - **插槽补全（新增）**：模板内 `<b-panel #` + Ctrl+Space 弹出插槽伪属性；TSX 在标签的 `{{ }}` 插槽对象内弹出 `slotName: () => ` 候选
  - **全局指令补全（新增）**：任意标签可提示 `v-loading` / `v-auto-tip` / `v-highlight-query` / `v-infinite-scroll` 及配套属性
  - **速查文档扩容**：Ctrl+Q 覆盖全部 106 标签（含 Exposes 暴露表），插槽属性上可查看插槽写法对照
  - **Live Templates 44 条**：新增 Grid / TableEdit / TreeTable / ListOnly / ListReport / SearchTreeSelect / Box / Navigation / LabelExtend / Collapse / Transfer 等模板与 **10 条 TSX 形态模板**
  - **数据流水线**：改由 beaver-ui 数据集（`data/beaver-ui@1.0.1.json`）+ `component.ts` 注册表驱动，组件库升级后 `node scripts/gen-plugin-data.mjs` 一键重新对齐
- **1.0.0**：数据快照对应 beaver-ui 1.0.0（44 组件）；兼容 IDEA/WebStorm 2023.1+

## 致谢

基于 [ElementPlugin](https://github.com/jiaolong1021/ElementPlugin)（element-ui 插件，已停止维护）二次开发重构，感谢原作者 shenjiaolong1021。
