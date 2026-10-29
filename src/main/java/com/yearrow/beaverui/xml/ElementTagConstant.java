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
        m.put("map-config", new String[]{"{}"});
        m.put("rows-limit", new String[]{"10000"});
        m.put("rules", new String[]{"{}"});
        m.put("edit-rules", new String[]{"{}"});
        m.put("edit-config", new String[]{"{ trigger: click", "mode: cell }"});
        m.put("valid-config", new String[]{"{}"});
        m.put("keep-source", new String[]{"false"});
        m.put("mouse-config / keyboard-config", new String[]{"{}"});
        m.put("column-configs", new String[]{"[]"});
        m.put("table-data", new String[]{"[]"});
        m.put("table-loading", new String[]{"false"});
        m.put("height", new String[]{"100%"});
        m.put("table-data", new String[]{"{ result: []", "count: 0 }"});
        m.put("auto-load", new String[]{"false"});
        m.put("input", new String[]{"{}"});
        m.put("row-key", new String[]{"id"});
        m.put("tree-config", new String[]{"showLine:true", "square 图标"});
        m.put("menu-config", new String[]{"内置运维菜单"});
        m.put("show-menus", new String[]{"true"});
        m.put("footer-data", new String[]{"[]"});
        m.put("default-expand-all", new String[]{"false"});
          TAG_CONSTANT.put("b-table-kit", m);
        }

        // list-kit 列表套件
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("list-data", new String[]{"[]"});
        m.put("loading", new String[]{"false"});
        m.put("height", new String[]{"100%"});
        m.put("direction", new String[]{"horizontal"});
        m.put("wrap", new String[]{"true"});
        m.put("fill", new String[]{"false"});
        m.put("space-size", new String[]{"组件各异"});
        m.put("list-item-props", new String[]{"{}"});
        m.put("alignment", new String[]{"组件各异"});
        m.put("fill-ratio", new String[]{"100"});
        m.put("space-style", new String[]{"width: 100%"});
        m.put("input", new String[]{"{}"});
          TAG_CONSTANT.put("b-list-kit", m);
        }

        // list 列表
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("data", new String[]{"[]"});
        m.put("mode", new String[]{"async"});
        m.put("loading", new String[]{"false"});
        m.put("height", new String[]{"100%"});
        m.put("empty-text", new String[]{"暂无数据"});
        m.put("direction", new String[]{"vertical"});
        m.put("wrap", new String[]{"true"});
        m.put("fill", new String[]{"false"});
        m.put("fill-ratio", new String[]{"100"});
        m.put("space-size", new String[]{"small"});
        m.put("alignment", new String[]{"center"});
        m.put("item-props", new String[]{"{}"});
        m.put("pager-config", new String[]{"{}"});
        m.put("border", new String[]{"false"});
        m.put("shadow", new String[]{"false"});
        m.put("background", new String[]{"false"});
        m.put("padding-size", new String[]{"default"});
        m.put("page-size", new String[]{"20"});
        m.put("page-sizes", new String[]{"[10", "20", "50", "100]"});
        m.put("layout", new String[]{"sizes", "prev", "pager", "next", "total", "jumper"});
        m.put("prev-text", new String[]{"上一页"});
        m.put("next-text", new String[]{"下一页"});
          TAG_CONSTANT.put("b-list", m);
        }

        // search-select 远程搜索选择
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("size", new String[]{"small", "default", "large"});
          TAG_CONSTANT.put("b-search-select", m);
        }

        // search-tree-select 搜索树选择
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("auto-expand", new String[]{"none", "first", "last"});
        m.put("size", new String[]{"default"});
        m.put("expand-icon", new String[]{"caret"});
          TAG_CONSTANT.put("b-search-tree-select", m);
        }

        // search-tree-panel 搜索树面板
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("reloadable", new String[]{"true"});
        m.put("placeholder", new String[]{"请选择"});
        m.put("dropdown-width / dropdown-height", new String[]{"300px"});
          TAG_CONSTANT.put("b-search-tree-panel", m);
        }

        // date-range-picker 日期范围选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
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
        m.put("header", new String[]{"card"});
        m.put("header-border", new String[]{"false"});
        m.put("padding-size", new String[]{"default"});
        m.put("clear-padding", new String[]{"right"});
        m.put("border", new String[]{"false"});
        m.put("shadow", new String[]{"hover"});
        m.put("background", new String[]{"true"});
        m.put("height", new String[]{"100%"});
          TAG_CONSTANT.put("b-panel", m);
        }

        // tool-bar 工具栏
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("divider", new String[]{"false"});
        m.put("padding-size", new String[]{"default"});
        m.put("clear-padding", new String[]{"right"});
        m.put("tool-max-width", new String[]{"150px"});
        m.put("border", new String[]{"false"});
        m.put("background", new String[]{"true"});
        m.put("filter-gutter", new String[]{"6"});
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
        m.put("isFixed", new String[]{"false"});
        m.put("clearPadding", new String[]{"right"});
        m.put("showDragButton", new String[]{"false"});
        m.put("dragButtonPosition", new String[]{"right"});
        m.put("isHidden", new String[]{"false"});
        m.put("isFold", new String[]{"false"});
          TAG_CONSTANT.put("b-flex-box", m);
        }

        // flex-line 左右分栏
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("left-width", new String[]{"50%"});
        m.put("gap", new String[]{"0"});
        m.put("left-padding", new String[]{"false"});
        m.put("left-clear-padding", new String[]{"right"});
        m.put("right-padding", new String[]{"false"});
        m.put("right-clear-padding", new String[]{"right"});
          TAG_CONSTANT.put("b-flex-line", m);
        }

        // filter-item 筛选项
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("label-width", new String[]{"80px"});
        m.put("label-position", new String[]{"top"});
        m.put("description", new String[]{"false"});
        m.put("size", new String[]{"default"});
          TAG_CONSTANT.put("b-filter-item", m);
        }

        // alert 提示
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("type", new String[]{"success"});
        m.put("closable", new String[]{"true"});
        m.put("center", new String[]{"false"});
        m.put("show-icon", new String[]{"false"});
        m.put("effect", new String[]{"dark"});
          TAG_CONSTANT.put("b-alert", m);
        }

        // avatar 头像
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("size", new String[]{"default"});
        m.put("shape", new String[]{"square"});
        m.put("src-set", new String[]{"string"});
        m.put("fit", new String[]{"contain"});
        m.put("方法名", new String[]{"默认"});
        m.put("size", new String[]{"default"});
        m.put("shape", new String[]{"square"});
        m.put("collapse-avatars", new String[]{"false"});
        m.put("collapse-avatars-tooltip", new String[]{"false"});
        m.put("max-collapse-avatars", new String[]{"1"});
        m.put("effect", new String[]{"light", "[string]"});
        m.put("placement", new String[]{"top-start"});
          TAG_CONSTANT.put("b-avatar", m);
        }

        // badge 徽章
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("max", new String[]{"99"});
        m.put("is-dot", new String[]{"false"});
        m.put("hidden", new String[]{"false"});
        m.put("type", new String[]{"success"});
        m.put("show-zero", new String[]{"true"});
        m.put("offset", new String[]{"[0", "0]"});
          TAG_CONSTANT.put("b-badge", m);
        }

        // breadcrumb 面包屑
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("replace", new String[]{"false"});
          TAG_CONSTANT.put("b-breadcrumb", m);
        }

        // button 
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("size", new String[]{"default"});
        m.put("type", new String[]{"primary"});
        m.put("plain", new String[]{"false"});
        m.put("text", new String[]{"false"});
        m.put("bg", new String[]{"false"});
        m.put("link", new String[]{"false"});
        m.put("round", new String[]{"false"});
        m.put("circle", new String[]{"false"});
        m.put("dashed ^(2.13.3)", new String[]{"false"});
        m.put("loading", new String[]{"false"});
        m.put("loading-icon", new String[]{"Loading"});
        m.put("disabled", new String[]{"false"});
        m.put("autofocus", new String[]{"false"});
        m.put("native-type", new String[]{"submit"});
        m.put("auto-insert-space", new String[]{"false"});
        m.put("dark", new String[]{"false"});
        m.put("tag", new String[]{"button"});
        m.put("size", new String[]{"default"});
        m.put("type", new String[]{"success"});
        m.put("direction", new String[]{"vertical"});
          TAG_CONSTANT.put("b-button", m);
        }

        // cascader 级联选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("model-value / v-model", new String[]{"number[]"});
        m.put("size", new String[]{"default"});
        m.put("clear-icon", new String[]{"CircleClose"});
        m.put("show-all-levels", new String[]{"true"});
        m.put("collapse-tags-tooltip", new String[]{"false"});
        m.put("debounce", new String[]{"300"});
        m.put("teleported", new String[]{"true"});
        m.put("effect", new String[]{"light", "[string]"});
        m.put("tag-type", new String[]{"info"});
        m.put("tag-effect", new String[]{"dark"});
        m.put("validate-event", new String[]{"true"});
        m.put("max-collapse-tags", new String[]{"1"});
        m.put("persistent", new String[]{"true"});
        m.put("placement", new String[]{"top-start"});
        m.put("popper-append-to-body ^(deprecated)", new String[]{"true"});
        m.put("show-checked-strategy", new String[]{"child"});
        m.put("virtual-scroll ^(2.14.0)", new String[]{"false"});
        m.put("fit-input-width ^(2.14.0)", new String[]{"false"});
        m.put("item-size ^(2.14.0)", new String[]{"34"});
        m.put("height ^(2.14.0)", new String[]{"204"});
        m.put("model-value / v-model", new String[]{"number[]"});
        m.put("virtual-scroll ^(2.14.0)", new String[]{"false"});
        m.put("item-size ^(2.14.0)", new String[]{"34"});
        m.put("height ^(2.14.0)", new String[]{"204"});
          TAG_CONSTANT.put("b-cascader", m);
        }

        // checkbox 多选框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("disabled", new String[]{"false"});
        m.put("border", new String[]{"false"});
        m.put("size", new String[]{"default"});
        m.put("checked", new String[]{"false"});
        m.put("indeterminate", new String[]{"false"});
        m.put("validate-event", new String[]{"true"});
        m.put("model-value / v-model", new String[]{"number[]"});
        m.put("size", new String[]{"default"});
        m.put("disabled", new String[]{"false"});
        m.put("text-color", new String[]{"#ffffff"});
        m.put("fill", new String[]{"#409eff"});
        m.put("tag", new String[]{"div"});
        m.put("validate-event", new String[]{"true"});
        m.put("props", new String[]{"{value: value", "label: label", "disabled: disabled}"});
        m.put("type", new String[]{"button"});
        m.put("名称", new String[]{"默认值"});
        m.put("disabled", new String[]{"false"});
        m.put("checked", new String[]{"false"});
          TAG_CONSTANT.put("b-checkbox", m);
        }

        // date-picker 日期选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("model-value / v-model", new String[]{"string[]"});
        m.put("readonly", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("size", new String[]{"large"});
        m.put("editable", new String[]{"true"});
        m.put("clearable", new String[]{"true"});
        m.put("type", new String[]{"years"});
        m.put("format", new String[]{"YYYY-MM-DD"});
        m.put("popper-options", new String[]{"{}"});
        m.put("range-separator", new String[]{"-"});
        m.put("default-value", new String[]{"[Date", "Date]"});
        m.put("default-time", new String[]{"[Date", "Date]"});
        m.put("unlink-panels", new String[]{"false"});
        m.put("single-panel ^(2.14.0)", new String[]{"false"});
        m.put("clear-icon", new String[]{"CircleClose"});
        m.put("validate-event", new String[]{"true"});
        m.put("teleported", new String[]{"true"});
        m.put("fallback-placements", new String[]{"[bottom", "top", "right", "left]"});
        m.put("placement", new String[]{"bottom"});
        m.put("show-footer", new String[]{"true"});
        m.put("show-confirm", new String[]{"true"});
        m.put("show-week-number", new String[]{"你好"});
        m.put("automatic-dropdown", new String[]{"true"});
          TAG_CONSTANT.put("b-date-picker", m);
        }

        // dialog 对话框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("model-value / v-model", new String[]{"false"});
        m.put("fullscreen", new String[]{"false"});
        m.put("modal", new String[]{"true"});
        m.put("modal-penetrable", new String[]{"false"});
        m.put("append-to-body", new String[]{"false"});
        m.put("append-to", new String[]{"body"});
        m.put("lock-scroll", new String[]{"true"});
        m.put("open-delay", new String[]{"0"});
        m.put("close-delay", new String[]{"0"});
        m.put("close-on-click-modal", new String[]{"true"});
        m.put("close-on-press-escape", new String[]{"true"});
        m.put("show-close", new String[]{"true"});
        m.put("draggable", new String[]{"false"});
        m.put("overflow", new String[]{"false"});
        m.put("center", new String[]{"false"});
        m.put("align-center", new String[]{"false"});
        m.put("destroy-on-close", new String[]{"false"});
        m.put("header-aria-level ^(a11y)", new String[]{"2"});
        m.put("transition", new String[]{"dialog-fade"});
          TAG_CONSTANT.put("b-dialog", m);
        }

        // divider 分割线
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("foldable", new String[]{"false"});
        m.put("default-expand", new String[]{"true"});
        m.put("direction", new String[]{"vertical"});
        m.put("border-style", new String[]{"solid"});
        m.put("content-position", new String[]{"right"});
          TAG_CONSTANT.put("b-divider", m);
        }

        // dropdown 下拉菜单
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("type", new String[]{"default"});
        m.put("size", new String[]{"large"});
        m.put("split-button", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("placement", new String[]{"top-start"});
        m.put("effect", new String[]{"light", "[string]"});
        m.put("trigger", new String[]{"hover"});
        m.put("trigger-keys", new String[]{"[Enter", "Space", "ArrowDown", "NumpadEnter]"});
        m.put("hide-on-click", new String[]{"true"});
        m.put("show-arrow", new String[]{"true"});
        m.put("show-timeout", new String[]{"150"});
        m.put("hide-timeout", new String[]{"150"});
        m.put("role", new String[]{"grid"});
        m.put("tabindex", new String[]{"0"});
        m.put("teleported", new String[]{"true"});
        m.put("persistent", new String[]{"true"});
        m.put("disabled", new String[]{"false"});
        m.put("divided", new String[]{"false"});
          TAG_CONSTANT.put("b-dropdown", m);
        }

        // form 表单
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("inline", new String[]{"false"});
        m.put("label-position", new String[]{"right"});
        m.put("hide-required-asterisk", new String[]{"false"});
        m.put("require-asterisk-position", new String[]{"right"});
        m.put("show-message", new String[]{"true"});
        m.put("inline-message", new String[]{"false"});
        m.put("status-icon", new String[]{"false"});
        m.put("validate-on-rule-change", new String[]{"true"});
        m.put("size", new String[]{"large"});
        m.put("disabled", new String[]{"false"});
        m.put("scroll-to-error", new String[]{"false"});
        m.put("scroll-into-view-options", new String[]{"true"});
        m.put("label-position", new String[]{"right"});
        m.put("show-message", new String[]{"true"});
        m.put("inline-message", new String[]{"false"});
        m.put("size", new String[]{"large"});
        m.put("validate-status", new String[]{"error"});
        m.put("trigger", new String[]{"change"});
          TAG_CONSTANT.put("b-form", m);
        }

        // input-number 数字输入框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("min", new String[]{"Number.MIN_SAFE_INTEGER"});
        m.put("max", new String[]{"Number.MAX_SAFE_INTEGER"});
        m.put("step", new String[]{"1"});
        m.put("step-strictly", new String[]{"false"});
        m.put("size", new String[]{"default"});
        m.put("readonly", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("controls", new String[]{"true"});
        m.put("controls-position", new String[]{"right"});
        m.put("value-on-clear", new String[]{"max"});
        m.put("validate-event", new String[]{"true"});
        m.put("align", new String[]{"center"});
        m.put("disabled-scientific", new String[]{"false"});
        m.put("tabindex ^(2.14.0)", new String[]{"0"});
        m.put("formatter ^(2.14.0)", new String[]{":::"});
          TAG_CONSTANT.put("b-input-number", m);
        }

        // input 输入框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("type", new String[]{"textarea"});
        m.put("show-word-limit", new String[]{"false"});
        m.put("word-limit-position", new String[]{"outside"});
        m.put("clearable", new String[]{"false"});
        m.put("clear-icon", new String[]{"CircleClose"});
        m.put("show-password", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("size", new String[]{"default"});
        m.put("rows", new String[]{"2"});
        m.put("autosize", new String[]{"false"});
        m.put("autocomplete", new String[]{"off"});
        m.put("readonly", new String[]{"false"});
        m.put("resize", new String[]{"both"});
        m.put("autofocus", new String[]{"false"});
        m.put("validate-event", new String[]{"true"});
        m.put("input-style", new String[]{"CSSProperties[]"});
          TAG_CONSTANT.put("b-input", m);
        }

        // menu 菜单
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("mode", new String[]{"vertical"});
        m.put("collapse", new String[]{"false"});
        m.put("ellipsis", new String[]{"true"});
        m.put("popper-offset", new String[]{"6"});
        m.put("default-openeds", new String[]{"[]"});
        m.put("unique-opened", new String[]{"false"});
        m.put("menu-trigger", new String[]{"click"});
        m.put("router", new String[]{"false"});
        m.put("collapse-transition", new String[]{"true"});
        m.put("popper-effect", new String[]{"light", "[string]"});
        m.put("close-on-click-outside", new String[]{"false"});
        m.put("show-timeout", new String[]{"300"});
        m.put("hide-timeout", new String[]{"300"});
        m.put("background-color ^(deprecated)", new String[]{"#ffffff"});
        m.put("text-color ^(deprecated)", new String[]{"#303133"});
        m.put("active-text-color ^(deprecated)", new String[]{"#409eff"});
        m.put("persistent", new String[]{"true"});
        m.put("disabled", new String[]{"false"});
        m.put("teleported", new String[]{"undefined"});
        m.put("disabled", new String[]{"false"});
          TAG_CONSTANT.put("b-menu", m);
        }

        // pagination 分页
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("size", new String[]{"default"});
        m.put("background", new String[]{"false"});
        m.put("pager-count", new String[]{"7"});
        m.put("layout", new String[]{"prev", "pager", "next", "jumper", "total"});
        m.put("page-sizes", new String[]{"[10", "20", "30", "40", "50", "100]"});
        m.put("popper-style", new String[]{"aaa"});
        m.put("prev-icon", new String[]{"ArrowLeft"});
        m.put("next-icon", new String[]{"ArrowRight"});
        m.put("disabled", new String[]{"false"});
        m.put("teleported", new String[]{"true"});
        m.put("hide-on-single-page", new String[]{"false"});
        m.put("small ^(deprecated)", new String[]{"false"});
          TAG_CONSTANT.put("b-pagination", m);
        }

        // popover 弹出框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("trigger", new String[]{"focus"});
        m.put("trigger-keys", new String[]{"[Enter", "Space]"});
        m.put("effect", new String[]{"light", "[string]"});
        m.put("width", new String[]{"150"});
        m.put("placement", new String[]{"top-start"});
        m.put("disabled", new String[]{"false"});
        m.put("visible / v-model:visible", new String[]{"null"});
        m.put("offset", new String[]{"undefined"});
        m.put("show-arrow", new String[]{"true"});
        m.put("show-after", new String[]{"0"});
        m.put("hide-after", new String[]{"200"});
        m.put("auto-close", new String[]{"0"});
        m.put("tabindex", new String[]{"0"});
        m.put("teleported", new String[]{"true"});
        m.put("append-to", new String[]{"body"});
        m.put("persistent", new String[]{"true"});
          TAG_CONSTANT.put("b-popover", m);
        }

        // progress 进度条
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("percentage ^(required)", new String[]{"0"});
        m.put("type", new String[]{"circle"});
        m.put("stroke-width", new String[]{"6"});
        m.put("text-inside", new String[]{"false"});
        m.put("status", new String[]{"exception"});
        m.put("indeterminate", new String[]{"false"});
        m.put("duration", new String[]{"3"});
        m.put("width", new String[]{"126"});
        m.put("show-text", new String[]{"true"});
        m.put("stroke-linecap", new String[]{"round"});
        m.put("striped", new String[]{"false"});
        m.put("striped-flow", new String[]{"false"});
          TAG_CONSTANT.put("b-progress", m);
        }

        // radio 单选框
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("value", new String[]{":::"});
        m.put("label", new String[]{":::"});
        m.put("disabled", new String[]{"false"});
        m.put("border", new String[]{"false"});
        m.put("size", new String[]{"default"});
        m.put("size", new String[]{"default"});
        m.put("disabled", new String[]{"false"});
        m.put("validate-event", new String[]{"true"});
        m.put("text-color", new String[]{"#ffffff"});
        m.put("fill", new String[]{"#409eff"});
        m.put("props", new String[]{"{value: value", "label: label", "disabled: disabled}"});
        m.put("type", new String[]{"button"});
        m.put("名称", new String[]{"默认"});
        m.put("disabled", new String[]{"false"});
          TAG_CONSTANT.put("b-radio", m);
        }

        // select 选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("multiple", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("value-key", new String[]{"value"});
        m.put("size", new String[]{"large"});
        m.put("clearable", new String[]{"false"});
        m.put("collapse-tags", new String[]{"false"});
        m.put("collapse-tags-tooltip", new String[]{"false"});
        m.put("tag-tooltip", new String[]{"{}"});
        m.put("multiple-limit", new String[]{"0"});
        m.put("effect", new String[]{"light", "[string]"});
        m.put("autocomplete", new String[]{"off"});
        m.put("filterable", new String[]{"false"});
        m.put("allow-create", new String[]{"false"});
        m.put("remote", new String[]{"false"});
        m.put("debounce", new String[]{"300"});
        m.put("remote-show-suffix", new String[]{"false"});
        m.put("loading", new String[]{"false"});
        m.put("reserve-keyword", new String[]{"true"});
        m.put("default-first-option", new String[]{"false"});
        m.put("teleported", new String[]{"true"});
        m.put("persistent", new String[]{"true"});
        m.put("automatic-dropdown", new String[]{"false"});
        m.put("clear-icon", new String[]{"CircleClose"});
        m.put("fit-input-width", new String[]{"false"});
        m.put("suffix-icon", new String[]{"ArrowDown"});
        m.put("tag-type", new String[]{"success"});
        m.put("tag-effect", new String[]{"light"});
        m.put("validate-event", new String[]{"true"});
        m.put("offset", new String[]{"12"});
        m.put("show-arrow", new String[]{"true"});
        m.put("placement", new String[]{"top-start"});
        m.put("fallback-placements", new String[]{"[bottom-start", "top-start", "right", "left]"});
        m.put("max-collapse-tags", new String[]{"1"});
        m.put("popper-options", new String[]{"{}"});
        m.put("suffix-transition ^(deprecated)", new String[]{"true"});
        m.put("名称", new String[]{"默认值"});
        m.put("disabled", new String[]{"false"});
        m.put("Name", new String[]{"默认值"});
        m.put("disabled", new String[]{"false"});
          TAG_CONSTANT.put("b-select", m);
        }

        // steps 步骤条
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("direction", new String[]{"horizontal"});
        m.put("active", new String[]{"0"});
        m.put("process-status", new String[]{"process"});
        m.put("finish-status", new String[]{"process"});
        m.put("status", new String[]{"wait"});
          TAG_CONSTANT.put("b-steps", m);
        }

        // switch 开关
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("model-value / v-model", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("loading", new String[]{"false"});
        m.put("size", new String[]{"large"});
        m.put("inline-prompt", new String[]{"false"});
        m.put("active-value", new String[]{"true"});
        m.put("inactive-value", new String[]{"false"});
        m.put("validate-event", new String[]{"true"});
        m.put("before-change", new String[]{"boolean"});
          TAG_CONSTANT.put("b-switch", m);
        }

        // tabs 标签页
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("type", new String[]{"card"});
        m.put("closable", new String[]{"false"});
        m.put("addable", new String[]{"false"});
        m.put("editable", new String[]{"false"});
        m.put("tab-position", new String[]{"right"});
        m.put("stretch", new String[]{"false"});
        m.put("tabindex", new String[]{"0"});
        m.put("名称", new String[]{"默认值"});
        m.put("disabled", new String[]{"false"});
        m.put("closable", new String[]{"false"});
        m.put("lazy", new String[]{"false"});
          TAG_CONSTANT.put("b-tabs", m);
        }

        // tag 标签
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("type", new String[]{"success"});
        m.put("closable", new String[]{"false"});
        m.put("disable-transitions", new String[]{"false"});
        m.put("hit", new String[]{"false"});
        m.put("size", new String[]{"default"});
        m.put("effect", new String[]{"light"});
        m.put("round", new String[]{"false"});
        m.put("checked / v-model:checked", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("type", new String[]{"success"});
          TAG_CONSTANT.put("b-tag", m);
        }

        // time-picker 时间选择器
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("model-value / v-model", new String[]{"[Date", "Date]"});
        m.put("readonly", new String[]{"false"});
        m.put("disabled", new String[]{"false"});
        m.put("editable", new String[]{"true"});
        m.put("clearable", new String[]{"true"});
        m.put("size", new String[]{"default"});
        m.put("is-range", new String[]{"false"});
        m.put("arrow-control", new String[]{"false"});
        m.put("popper-options", new String[]{"{}"});
        m.put("fallback-placements", new String[]{"[bottom", "top", "right", "left]"});
        m.put("placement", new String[]{"bottom"});
        m.put("range-separator", new String[]{"-"});
        m.put("prefix-icon", new String[]{"Clock"});
        m.put("clear-icon", new String[]{"CircleClose"});
        m.put("teleported", new String[]{"true"});
        m.put("tabindex", new String[]{"0"});
        m.put("save-on-blur ^(2.13.4)", new String[]{"true"});
          TAG_CONSTANT.put("b-time-picker", m);
        }

        // tooltip 文字提示
        {
          HashMap<String, String[]> m = new HashMap<>();
        m.put("effect", new String[]{"light"});
        m.put("raw-content", new String[]{"false"});
        m.put("placement", new String[]{"top-start"});
        m.put("offset", new String[]{"12"});
        m.put("popper-options", new String[]{"{}"});
        m.put("arrow-offset", new String[]{"5"});
        m.put("show-after", new String[]{"0"});
        m.put("show-arrow", new String[]{"true"});
        m.put("hide-after", new String[]{"200"});
        m.put("auto-close", new String[]{"0"});
        m.put("enterable", new String[]{"true"});
        m.put("teleported", new String[]{"true"});
        m.put("trigger", new String[]{"click"});
        m.put("trigger-keys", new String[]{"[Enter", "Space]"});
        m.put("focus-on-target", new String[]{"false"});
          TAG_CONSTANT.put("b-tooltip", m);
        }
    }

    private ElementTagConstant() {}
}
