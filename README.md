# BeaverUIPlugin

Beaver UI 组件库的 JetBrains IDE（IDEA / WebStorm）开发辅助插件。

## 功能

| 能力 | 入口 | 生效文件 |
| --- | --- | --- |
| **标签补全**——输入 `<b-` 弹出全部组件标签 | 输入时自动 / Ctrl+Space | .vue 模板段 / .html / .xml |
| **属性值候选**——`type=""` 引号内弹出枚举值（如 primary/success/…） | Ctrl+Space | 同上 |
| **组件速查文档**——标签名上弹出完整 API 表（属性/事件/插槽） | Ctrl+Q | .vue / .html / **.tsx** |
| **属性候选弹窗**——任意属性位置弹出全部候选值，选中直接写入引号内 | **Ctrl+Alt+Q** | .vue / .tsx（含空引号） |
| **代码模板**——高频组件骨架一键展开 | 缩写 + Tab | .vue（模板段与 script 段）/ .tsx / .jsx |
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

## 安装

1. 下载 [Releases](https://github.com/yangzhouQS/BeaverUIPlugin/releases) 中的 `BeaverUIPlugin-x.y.z.zip`
2. IDE → Settings → Plugins → ⚙ → **Install Plugin from Disk…** → 选择 zip → 重启

依赖：IDE 内置 Vue 插件（WebStorm 自带；IDEA 需装 Vue.js 插件）。

## 版本

- **1.0.0**：数据快照对应 beaver-ui 1.0.0（44 组件：table-kit/list-kit/search 系等自研套件 + 高频基础组件）；兼容 IDEA/WebStorm 2023.1+

## 致谢

基于 [ElementPlugin](https://github.com/jiaolong1021/ElementPlugin)（element-ui 插件，已停止维护）二次开发重构，感谢原作者 shenjiaolong1021。
