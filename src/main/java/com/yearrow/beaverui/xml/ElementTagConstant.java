package com.yearrow.beaverui.xml;

import java.util.HashMap;

/**
 * b-* 标签属性值候选（自动生成：scripts/gen-plugin-data.mjs ← docs-website/component/*.md）
 * 数据快照：beaver-ui 1.0.0
 */
public final class ElementTagConstant {
    public static final HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

    static {
        // table-kit 表格套件
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          TAG_CONSTANT.put("b-table-kit", m);
        }

        // b-table-only（b-table-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          m.put("data", new String[]{"rows"});
          TAG_CONSTANT.put("b-table-only", m);
        }

        // b-table-async（b-table-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          m.put("table-data", new String[]{"{ result, count }"});
          m.put("input", new String[]{"{ take: 20, draw: 1 }"});
          TAG_CONSTANT.put("b-table-async", m);
        }

        // b-table-report（b-table-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          m.put("data", new String[]{"rows"});
          TAG_CONSTANT.put("b-table-report", m);
        }

        // b-tree-table（b-table-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          m.put("tree-config", new String[]{"lazy", "children", "transform"});
          m.put("row-key", new String[]{"id"});
          TAG_CONSTANT.put("b-tree-table", m);
        }

        // b-table-edit（b-table-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("column-configs", new String[]{"TableColumnConfig[]"});
          m.put("edit-config", new String[]{"click", "dblclick", "manual"});
          TAG_CONSTANT.put("b-table-edit", m);
        }

        // list-kit 列表套件
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("space-size", new String[]{"[number", "number]"});
          TAG_CONSTANT.put("b-list-kit", m);
        }

        // b-list-only（b-list-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("space-size", new String[]{"[number", "number]"});
          m.put("data", new String[]{"rows"});
          TAG_CONSTANT.put("b-list-only", m);
        }

        // b-list-async（b-list-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("space-size", new String[]{"[number", "number]"});
          m.put("list-data", new String[]{"{ result, count }"});
          TAG_CONSTANT.put("b-list-async", m);
        }

        // b-list-report（b-list-kit 壳组件）
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("space-size", new String[]{"[number", "number]"});
          m.put("data", new String[]{"rows"});
          TAG_CONSTANT.put("b-list-report", m);
        }

        // list 列表
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("mode", new String[]{"only", "async", "report", "cursor"});
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("space-size", new String[]{"default", "small", "large"});
          m.put("item-props", new String[]{"ListItemProps"});
          m.put("pager-config", new String[]{"ListPagerConfig"});
          m.put("input", new String[]{"ListQueryInput"});
          m.put("padding-size", new String[]{"large", "default", "small"});
          TAG_CONSTANT.put("b-list", m);
        }

        // search-select 远程搜索选择
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("v-model", new String[]{"null"});
          m.put("props", new String[]{"value", "subLabel", "nextLabel", "disabled）"});
          m.put("size", new String[]{"small", "default", "large"});
          TAG_CONSTANT.put("b-search-select", m);
        }

        // search-tree-select 搜索树选择
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("v-model", new String[]{"null"});
          m.put("props", new String[]{"value", "disabled）"});
          m.put("auto-expand", new String[]{"none", "first", "last"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("expand-icon", new String[]{"square", "caret"});
          TAG_CONSTANT.put("b-search-tree-select", m);
        }

        // date-range-picker 日期范围选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("v-model", new String[]{"Dayjs[]"});
          m.put("type", new String[]{"daterange", "datetimerange", "monthrange"});
          m.put("shortcuts", new String[]{"day", "week", "month", "quarter", "year", "all 子集"});
          m.put("default-shortcut", new String[]{"同上"});
          m.put("accounting-day", new String[]{"1-31"});
          m.put("size", new String[]{"large", "default", "small"});
          TAG_CONSTANT.put("b-date-range-picker", m);
        }

        // panel 面板
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("header", new String[]{"default", "card", "hidden"});
          m.put("padding-size", new String[]{"large", "default", "small"});
          m.put("clear-padding", new String[]{"right", "bottom", "left)[]"});
          m.put("shadow", new String[]{"always", "hover", "never"});
          m.put("body-style", new String[]{"StyleValue"});
          TAG_CONSTANT.put("b-panel", m);
        }

        // tool-bar 工具栏
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("padding-size", new String[]{"large", "default", "small"});
          m.put("clear-padding", new String[]{"right", "bottom", "left)[]"});
          TAG_CONSTANT.put("b-tool-bar", m);
        }

        // box 盒子
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("padding-size", new String[]{"large", "default", "small"});
          m.put("clear-padding", new String[]{"top", "right", "bottom", "left"});
          m.put("clear-border", new String[]{"top", "right", "bottom", "left"});
          m.put("shadow", new String[]{"always", "hover", "never"});
          TAG_CONSTANT.put("b-box", m);
        }

        // flex-box 弹性布局
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("item-config", new String[]{"FlexBoxItemConfig[]"});
          m.put("clearPadding", new String[]{"left", "right", "top", "bottom"});
          m.put("dragButtonPosition", new String[]{"left", "right", "top", "bottom"});
          TAG_CONSTANT.put("b-flex-box", m);
        }

        // flex-line 左右分栏
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("left-clear-padding", new String[]{"right", "bottom", "left)[]"});
          m.put("right-clear-padding", new String[]{"right", "bottom", "left)[]"});
          TAG_CONSTANT.put("b-flex-line", m);
        }

        // filter-item 筛选项
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("label-position", new String[]{"left", "top", "right"});
          m.put("size", new String[]{"large", "default", "small"});
          TAG_CONSTANT.put("b-filter-item", m);
        }

        // alert 提示
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"success", "warning", "info", "error"});
          m.put("effect", new String[]{"light", "dark"});
          TAG_CONSTANT.put("b-alert", m);
        }

        // avatar 头像
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("shape", new String[]{"circle", "square"});
          m.put("fit", new String[]{"fill", "contain", "cover", "none", "scale-down"});
          m.put("方法名", new String[]{"Type"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("shape", new String[]{"circle", "square"});
          m.put("effect", new String[]{"dark", "light"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
          TAG_CONSTANT.put("b-avatar", m);
        }

        // badge 徽章
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
          m.put("offset", new String[]{"[number", "number]"});
          m.put("badge-style", new String[]{"CSSProperties"});
          TAG_CONSTANT.put("b-badge", m);
        }

        // breadcrumb 面包屑
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("to", new String[]{"RouteLocationRaw"});
          TAG_CONSTANT.put("b-breadcrumb", m);
        }

        // button 
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("type", new String[]{"default", "primary", "success", "warning", "danger", "info"});
          m.put("native-type", new String[]{"button", "submit", "reset"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
          m.put("direction", new String[]{"horizontal", "vertical"});
          TAG_CONSTANT.put("b-button", m);
        }

        // cascader 级联选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("options", new String[]{"CascaderOption[]"});
          m.put("props", new String[]{"CascaderProps"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("clear-icon", new String[]{"Component"});
          m.put("effect", new String[]{"dark", "light"});
          m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
          m.put("tag-effect", new String[]{"light", "dark", "plain"});
          m.put("fallback-placements", new String[]{"Placement[]"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
          m.put("show-checked-strategy", new String[]{"parent", "child"});
          m.put("options", new String[]{"CascaderOption[]"});
          m.put("props", new String[]{"CascaderProps"});
          TAG_CONSTANT.put("b-cascader", m);
        }

        // checkbox 多选框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("props", new String[]{"{ value?: string", "label?: string", "disabled?: string}"});
          m.put("type", new String[]{"checkbox", "button"});
          m.put("名称", new String[]{"类型"});
          TAG_CONSTANT.put("b-checkbox", m);
        }

        // date-picker 日期选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("model-value / v-model", new String[]{"Date[]"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("type", new String[]{"year", "years", "month", "months", "dates", "datetime", "week", "quarter", "quarters", "datetimerange", "daterange", "monthrange"});
          m.put("default-value", new String[]{"Date", "[Date", "Date]"});
          m.put("default-time", new String[]{"Date", "[Date", "Date]"});
          m.put("id", new String[]{"[string", "string]"});
          m.put("name", new String[]{"[string", "string]"});
          m.put("prefix-icon", new String[]{"Component"});
          m.put("clear-icon", new String[]{"Component"});
          m.put("shortcuts", new String[]{"value: Date"});
          m.put("fallback-placements", new String[]{"Placement[]"});
          m.put("placement", new String[]{"Placement"});
          TAG_CONSTANT.put("b-date-picker", m);
        }

        // dialog 对话框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("transition", new String[]{"TransitionProps"});
          TAG_CONSTANT.put("b-dialog", m);
        }

        // divider 分割线
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"horizontal", "vertical"});
          m.put("border-style", new String[]{"none", "solid", "hidden", "dashed", "..."});
          m.put("content-position", new String[]{"left", "right", "center"});
          TAG_CONSTANT.put("b-divider", m);
        }

        // dropdown 下拉菜单
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"default", "primary", "success", "warning", "info", "danger"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end"});
          m.put("effect", new String[]{"dark", "light"});
          m.put("trigger", new String[]{"click", "hover", "contextmenu"});
          m.put("role", new String[]{"dialog", "grid", "group", "listbox", "menu", "navigation", "tooltip", "tree"});
          TAG_CONSTANT.put("b-dropdown", m);
        }

        // form 表单
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("rules", new String[]{"FormRules"});
          m.put("label-position", new String[]{"left", "right", "top"});
          m.put("require-asterisk-position", new String[]{"left", "right"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("scroll-into-view-options", new String[]{"ScrollIntoViewOptions"});
          m.put("prop", new String[]{"[string&#91;&#93;]"});
          m.put("label-position", new String[]{"left", "right", "top"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("validate-status", new String[]{"error", "validating", "success"});
          m.put("trigger", new String[]{"blur", "change"});
          TAG_CONSTANT.put("b-form", m);
        }

        // input-number 数字输入框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("controls-position", new String[]{"right"});
          m.put("value-on-clear", new String[]{"min", "max"});
          m.put("align", new String[]{"left", "center", "right"});
          TAG_CONSTANT.put("b-input-number", m);
        }

        // input 输入框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"text", "textarea", "password", "email", "search", "tel", "url"});
          m.put("model-modifiers", new String[]{"{ lazy?: true", "number?: true", "trim?: true }"});
          m.put("word-limit-position", new String[]{"inside", "outside"});
          m.put("clear-icon", new String[]{"Component"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("autosize", new String[]{"{ minRows?: number", "maxRows?: number }"});
          m.put("step", new String[]{":::"});
          m.put("resize", new String[]{"none", "both", "horizontal", "vertical"});
          m.put("input-style", new String[]{"CSSProperties", "CSSProperties[]"});
          TAG_CONSTANT.put("b-input", m);
        }

        // menu 菜单
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("mode", new String[]{"horizontal", "vertical"});
          m.put("menu-trigger", new String[]{"hover", "click"});
          m.put("popper-effect", new String[]{"dark", "light"});
          TAG_CONSTANT.put("b-menu", m);
        }

        // pagination 分页
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("pager-count", new String[]{"5", "7", "9", "11", "13", "15", "17", "19", "21"});
          m.put("layout", new String[]{"prev", "pager", "next", "jumper", "total", "slot)"});
          TAG_CONSTANT.put("b-pagination", m);
        }

        // popover 弹出框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("trigger", new String[]{"click", "focus", "hover", "contextmenu"});
          m.put("effect", new String[]{"dark", "light"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
          m.put("tooltip", new String[]{":::"});
          TAG_CONSTANT.put("b-popover", m);
        }

        // progress 进度条
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"line", "circle", "dashboard"});
          m.put("status", new String[]{"success", "exception", "warning"});
          m.put("stroke-linecap", new String[]{"butt", "round", "square"});
          TAG_CONSTANT.put("b-progress", m);
        }

        // radio 单选框
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("props", new String[]{"{ value?: string", "label?: string", "disabled?: string}"});
          m.put("type", new String[]{"radio", "button"});
          m.put("名称", new String[]{"类型"});
          TAG_CONSTANT.put("b-radio", m);
        }

        // select 选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          m.put("tag-tooltip", new String[]{"TagTooltipProps"});
          m.put("effect", new String[]{"dark", "light"});
          m.put("clear-icon", new String[]{"Component"});
          m.put("suffix-icon", new String[]{"Component"});
          m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
          m.put("tag-effect", new String[]{"light", "dark", "plain"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
          m.put("fallback-placements", new String[]{"Placement[]"});
          m.put("popper-options", new String[]{"popper.js.org", "docs", "v2", ") doc"});
          m.put("名称", new String[]{"类型"});
          m.put("Name", new String[]{"类型"});
          TAG_CONSTANT.put("b-select", m);
        }

        // steps 步骤条
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("direction", new String[]{"vertical", "horizontal"});
          m.put("process-status", new String[]{"wait", "process", "finish", "error", "success"});
          m.put("finish-status", new String[]{"wait", "process", "finish", "error", "success"});
          m.put("status", new String[]{"wait", "process", "finish", "error", "success"});
          TAG_CONSTANT.put("b-steps", m);
        }

        // switch 开关
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("size", new String[]{"large", "default", "small"});
          TAG_CONSTANT.put("b-switch", m);
        }

        // tabs 标签页
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"card", "border-card"});
          m.put("tab-position", new String[]{"top", "right", "bottom", "left"});
          m.put("名称", new String[]{"Type"});
          TAG_CONSTANT.put("b-tabs", m);
        }

        // tag 标签
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("type", new String[]{"primary", "success", "info", "warning", "danger"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("effect", new String[]{"dark", "light", "plain"});
          m.put("type", new String[]{"primary", "success", "info", "warning", "danger"});
          TAG_CONSTANT.put("b-tag", m);
        }

        // time-picker 时间选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("model-value / v-model", new String[]{"Date", "[Date", "Date]", "[number", "number]", "[string", "string]"});
          m.put("size", new String[]{"large", "default", "small"});
          m.put("fallback-placements", new String[]{"Placement[]"});
          m.put("placement", new String[]{"展示位置"});
          m.put("default-value", new String[]{"[Date", "Date]"});
          m.put("id", new String[]{"[string", "string]"});
          m.put("disabled-minutes", new String[]{"role: string"});
          m.put("disabled-seconds", new String[]{"minute: number", "role: string"});
          TAG_CONSTANT.put("b-time-picker", m);
        }

        // tooltip 文字提示
        {
          HashMap<String, String[]> m = new HashMap<>();
          m.put("effect", new String[]{"dark", "light"});
          m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
          m.put("fallback-placements", new String[]{"Placement[]"});
          m.put("popper-options", new String[]{"popper.js.org", "docs", "v2", ") 文档"});
          m.put("trigger", new String[]{"hover", "click", "focus", "contextmenu"});
          m.put("focus-on-target", new String[]{"false"});
          TAG_CONSTANT.put("b-tooltip", m);
        }
    }

    private ElementTagConstant() {}
}
