package com.yearrow.beaverui.xml;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * b-* 标签属性候选 + 插槽名 + 全局指令（自动生成：scripts/gen-plugin-data.mjs ← beaver-ui 数据集）
 * 数据快照：beaver-ui 1.0.1（106 个标签 / 34 条全局指令）
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
    // b-alert（alert）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("title", new String[]{});
      m.put("type", new String[]{"success", "warning", "info", "error"});
      m.put("description", new String[]{});
      m.put("closable", new String[]{"true", "false"});
      m.put("center", new String[]{"true", "false"});
      m.put("close-text", new String[]{});
      m.put("show-icon", new String[]{"true", "false"});
      m.put("effect", new String[]{"light", "dark"});
      TAG_CONSTANT.put("b-alert", m);
    }

    // b-anchor（anchor）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("container", new String[]{});
      m.put("offset", new String[]{});
      m.put("bound", new String[]{});
      m.put("duration", new String[]{});
      m.put("marker", new String[]{"true", "false"});
      m.put("type", new String[]{"default", "underline"});
      m.put("direction", new String[]{"vertical", "horizontal"});
      m.put("select-scroll-top", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-anchor", m);
    }

    // b-avatar（avatar）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("icon", new String[]{});
      m.put("size", new String[]{"default", "small"});
      m.put("shape", new String[]{"circle", "square"});
      m.put("src", new String[]{});
      m.put("src-set", new String[]{});
      m.put("alt", new String[]{});
      m.put("fit", new String[]{"fill", "contain", "cover", "none", "scale-down"});
      TAG_CONSTANT.put("b-avatar", m);
    }

    // b-backtop（backtop）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("target", new String[]{});
      m.put("visibility-height", new String[]{});
      m.put("right", new String[]{});
      m.put("bottom", new String[]{});
      TAG_CONSTANT.put("b-backtop", m);
    }

    // b-badge（badge）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("value", new String[]{});
      m.put("max", new String[]{});
      m.put("is-dot", new String[]{"true", "false"});
      m.put("hidden", new String[]{"true", "false"});
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
      m.put("show-zero", new String[]{"true", "false"});
      m.put("color", new String[]{});
      m.put("offset", new String[]{});
      m.put("badge-style", new String[]{});
      m.put("badge-class", new String[]{});
      TAG_CONSTANT.put("b-badge", m);
    }

    // b-box（box）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("padding-size", new String[]{});
      m.put("clear-padding", new String[]{});
      m.put("border", new String[]{"true", "false"});
      m.put("clear-border", new String[]{});
      m.put("shadow", new String[]{});
      m.put("background", new String[]{"true", "false"});
      m.put("height", new String[]{});
      TAG_CONSTANT.put("b-box", m);
    }

    // b-breadcrumb（breadcrumb）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("separator", new String[]{});
      m.put("separator-icon", new String[]{});
      TAG_CONSTANT.put("b-breadcrumb", m);
    }

    // b-button（button）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("size", new String[]{"large", "default", "small"});
      m.put("type", new String[]{"default", "primary", "success", "warning", "danger", "info"});
      m.put("plain", new String[]{"true", "false"});
      m.put("text", new String[]{"true", "false"});
      m.put("bg", new String[]{"true", "false"});
      m.put("link", new String[]{"true", "false"});
      m.put("round", new String[]{"true", "false"});
      m.put("circle", new String[]{"true", "false"});
      m.put("dashed", new String[]{"true", "false"});
      m.put("loading", new String[]{"true", "false"});
      m.put("loading-icon", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("icon", new String[]{});
      m.put("autofocus", new String[]{"true", "false"});
      m.put("native-type", new String[]{"button", "submit", "reset"});
      m.put("auto-insert-space", new String[]{"true", "false"});
      m.put("color", new String[]{});
      m.put("dark", new String[]{"true", "false"});
      m.put("tag", new String[]{});
      TAG_CONSTANT.put("b-button", m);
    }

    // b-calendar（calendar）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("range", new String[]{});
      m.put("controller-type", new String[]{"button", "select"});
      m.put("formatter", new String[]{});
      m.put("hide-header", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-calendar", m);
    }

    // b-carousel（carousel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("height", new String[]{});
      m.put("initial-index", new String[]{});
      m.put("trigger", new String[]{"hover", "click"});
      m.put("autoplay", new String[]{"true", "false"});
      m.put("interval", new String[]{});
      m.put("indicator-position", new String[]{"none", "outside"});
      m.put("arrow", new String[]{"always", "hover", "never"});
      m.put("type", new String[]{"card"});
      m.put("card-scale", new String[]{});
      m.put("loop", new String[]{"true", "false"});
      m.put("direction", new String[]{"horizontal", "vertical"});
      m.put("pause-on-hover", new String[]{"true", "false"});
      m.put("motion-blur", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-carousel", m);
    }

    // b-cascader（cascader）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("placeholder", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("clear-icon", new String[]{});
      m.put("show-all-levels", new String[]{"true", "false"});
      m.put("collapse-tags", new String[]{"true", "false"});
      m.put("collapse-tags-tooltip", new String[]{"true", "false"});
      m.put("max-collapse-tags-tooltip-height", new String[]{});
      m.put("separator", new String[]{});
      m.put("filterable", new String[]{"true", "false"});
      m.put("filter-method", new String[]{});
      m.put("debounce", new String[]{});
      m.put("before-filter", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("effect", new String[]{"dark"});
      m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
      m.put("tag-effect", new String[]{"light", "dark", "plain"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("max-collapse-tags", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("fallback-placements", new String[]{});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("popper-append-to-body", new String[]{"true", "false"});
      m.put("show-checked-strategy", new String[]{"parent", "child"});
      m.put("virtual-scroll", new String[]{"true", "false"});
      m.put("fit-input-width", new String[]{"true", "false"});
      m.put("item-size", new String[]{});
      m.put("height", new String[]{});
      TAG_CONSTANT.put("b-cascader", m);
    }

    // b-checkbox（checkbox）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("true-value", new String[]{});
      m.put("false-value", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("name", new String[]{});
      m.put("checked", new String[]{"true", "false"});
      m.put("indeterminate", new String[]{"true", "false"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("tabindex", new String[]{});
      m.put("id", new String[]{});
      m.put("aria-controls", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("true-label", new String[]{});
      m.put("false-label", new String[]{});
      m.put("controls ^(a11y)", new String[]{});
      TAG_CONSTANT.put("b-checkbox", m);
    }

    // b-collapse（collapse）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("accordion", new String[]{"true", "false"});
      m.put("expand-icon-position", new String[]{"left", "right"});
      m.put("before-collapse", new String[]{});
      TAG_CONSTANT.put("b-collapse", m);
    }

    // b-color-picker-panel（color-picker-panel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("border", new String[]{});
      m.put("disabled", new String[]{});
      m.put("show-alpha", new String[]{});
      m.put("color-format", new String[]{});
      m.put("predefine", new String[]{});
      m.put("validate-event", new String[]{});
      m.put("hue-slider-class", new String[]{});
      m.put("hue-slider-style", new String[]{});
      TAG_CONSTANT.put("b-color-picker-panel", m);
    }

    // b-color-picker（color-picker）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("show-alpha", new String[]{"true", "false"});
      m.put("color-format", new String[]{"rgb", "prgb", "hex", "hex3", "hex4", "hex6", "hex8", "name", "hsl", "hsv"});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("predefine", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("tabindex", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("id", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("label ^(a11y)", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      TAG_CONSTANT.put("b-color-picker", m);
    }

    // b-config-provider（config-provider）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("locale", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("zIndex", new String[]{});
      m.put("namespace", new String[]{});
      m.put("button", new String[]{});
      m.put("link", new String[]{});
      m.put("dialog", new String[]{});
      m.put("message", new String[]{});
      m.put("experimental-features", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info", "default"});
      m.put("underline", new String[]{"always", "hover", "never"});
      TAG_CONSTANT.put("b-config-provider", m);
    }

    // b-date-picker-panel（date-picker-panel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("border", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("editable", new String[]{"true", "false"});
      m.put("type", new String[]{"year", "years", "month", "months", "date", "dates", "datetime", "week", "quarter", "quarters", "datetimerange", "daterange"});
      m.put("default-value", new String[]{});
      m.put("default-time", new String[]{});
      m.put("value-format", new String[]{});
      m.put("date-format", new String[]{});
      m.put("time-format", new String[]{});
      m.put("unlink-panels", new String[]{"true", "false"});
      m.put("single-panel", new String[]{"true", "false"});
      m.put("disabled-date", new String[]{});
      m.put("shortcuts", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("show-footer", new String[]{"true", "false"});
      m.put("show-confirm", new String[]{"true", "false"});
      m.put("show-week-number", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-date-picker-panel", m);
    }

    // b-date-picker（date-picker）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("readonly", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("editable", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("placeholder", new String[]{});
      m.put("start-placeholder", new String[]{});
      m.put("end-placeholder", new String[]{});
      m.put("type", new String[]{"year", "years", "month", "months", "date", "dates", "datetime", "week", "quarter", "quarters", "datetimerange", "daterange"});
      m.put("format", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("popper-options", new String[]{});
      m.put("range-separator", new String[]{});
      m.put("default-value", new String[]{});
      m.put("default-time", new String[]{});
      m.put("value-format", new String[]{});
      m.put("id", new String[]{});
      m.put("name", new String[]{});
      m.put("unlink-panels", new String[]{"true", "false"});
      m.put("single-panel", new String[]{"true", "false"});
      m.put("prefix-icon", new String[]{});
      m.put("clear-icon", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("disabled-date", new String[]{});
      m.put("shortcuts", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("fallback-placements", new String[]{});
      m.put("placement", new String[]{});
      m.put("show-footer", new String[]{"true", "false"});
      m.put("show-confirm", new String[]{"true", "false"});
      m.put("show-week-number", new String[]{"true", "false"});
      m.put("automatic-dropdown", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-date-picker", m);
    }

    // b-date-range-picker（date-range-picker）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("type", new String[]{});
      m.put("shortcuts", new String[]{});
      m.put("default-shortcut", new String[]{});
      m.put("accounting-day", new String[]{});
      m.put("range-limit", new String[]{});
      m.put("value-format", new String[]{});
      m.put("size", new String[]{});
      m.put("range-separator", new String[]{});
      m.put("start-placeholder", new String[]{});
      m.put("end-placeholder", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("readonly", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-date-range-picker", m);
    }

    // b-dialog（dialog）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{"true", "false"});
      m.put("title", new String[]{});
      m.put("width", new String[]{});
      m.put("fullscreen", new String[]{"true", "false"});
      m.put("top", new String[]{});
      m.put("modal", new String[]{"true", "false"});
      m.put("modal-penetrable", new String[]{"true", "false"});
      m.put("modal-class", new String[]{});
      m.put("header-class", new String[]{});
      m.put("body-class", new String[]{});
      m.put("footer-class", new String[]{});
      m.put("append-to-body", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("lock-scroll", new String[]{"true", "false"});
      m.put("open-delay", new String[]{});
      m.put("close-delay", new String[]{});
      m.put("close-on-click-modal", new String[]{"true", "false"});
      m.put("close-on-press-escape", new String[]{"true", "false"});
      m.put("show-close", new String[]{"true", "false"});
      m.put("before-close", new String[]{});
      m.put("draggable", new String[]{"true", "false"});
      m.put("overflow", new String[]{"true", "false"});
      m.put("center", new String[]{"true", "false"});
      m.put("align-center", new String[]{"true", "false"});
      m.put("destroy-on-close", new String[]{"true", "false"});
      m.put("close-icon", new String[]{});
      m.put("z-index", new String[]{});
      m.put("header-aria-level", new String[]{});
      m.put("transition", new String[]{});
      m.put("custom-class", new String[]{});
      TAG_CONSTANT.put("b-dialog", m);
    }

    // b-divider（divider）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{"true", "false"});
      m.put("foldable", new String[]{"true", "false"});
      m.put("title", new String[]{});
      m.put("default-expand", new String[]{"true", "false"});
      m.put("direction", new String[]{"horizontal", "vertical"});
      m.put("border-style", new String[]{"none", "solid", "hidden", "dashed"});
      m.put("content-position", new String[]{"left", "right", "center"});
      TAG_CONSTANT.put("b-divider", m);
    }

    // b-drawer（drawer）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{"true", "false"});
      m.put("append-to-body", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("lock-scroll", new String[]{"true", "false"});
      m.put("before-close", new String[]{});
      m.put("close-on-click-modal", new String[]{"true", "false"});
      m.put("close-on-press-escape", new String[]{"true", "false"});
      m.put("open-delay", new String[]{});
      m.put("close-delay", new String[]{});
      m.put("destroy-on-close", new String[]{"true", "false"});
      m.put("modal", new String[]{"true", "false"});
      m.put("modal-penetrable", new String[]{"true", "false"});
      m.put("direction", new String[]{"rtl", "ltr", "ttb", "btt"});
      m.put("resizable", new String[]{"true", "false"});
      m.put("show-close", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("title", new String[]{});
      m.put("with-header", new String[]{"true", "false"});
      m.put("modal-class", new String[]{});
      m.put("header-class", new String[]{});
      m.put("body-class", new String[]{});
      m.put("footer-class", new String[]{});
      m.put("z-index", new String[]{});
      m.put("header-aria-level", new String[]{});
      m.put("custom-class", new String[]{});
      TAG_CONSTANT.put("b-drawer", m);
    }

    // b-dropdown（dropdown）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{"default", "primary", "success", "warning", "info", "danger"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("button-props", new String[]{});
      m.put("max-height", new String[]{});
      m.put("split-button", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end"});
      m.put("effect", new String[]{"dark"});
      m.put("trigger", new String[]{"click", "hover"});
      m.put("trigger-keys", new String[]{});
      m.put("virtual-triggering", new String[]{"true", "false"});
      m.put("virtual-ref", new String[]{});
      m.put("hide-on-click", new String[]{"true", "false"});
      m.put("show-arrow", new String[]{"true", "false"});
      m.put("show-timeout", new String[]{});
      m.put("hide-timeout", new String[]{});
      m.put("role", new String[]{"dialog", "grid", "group", "listbox", "menu", "navigation", "tooltip", "tree"});
      m.put("tabindex", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("popper-options", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-dropdown", m);
    }

    // b-empty（empty）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("--b-empty-fill-color-0", new String[]{});
      m.put("--b-empty-fill-color-1", new String[]{});
      m.put("--b-empty-fill-color-2", new String[]{});
      m.put("--b-empty-fill-color-3", new String[]{});
      m.put("--b-empty-fill-color-4", new String[]{});
      m.put("--b-empty-fill-color-5", new String[]{});
      m.put("--b-empty-fill-color-6", new String[]{});
      m.put("--b-empty-fill-color-7", new String[]{});
      m.put("--b-empty-fill-color-8", new String[]{});
      m.put("--b-empty-fill-color-9", new String[]{});
      m.put("image", new String[]{});
      m.put("image-size", new String[]{});
      m.put("description", new String[]{});
      TAG_CONSTANT.put("b-empty", m);
    }

    // b-filter-item（filter-item）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("label", new String[]{});
      m.put("label-width", new String[]{});
      m.put("label-position", new String[]{"left", "top", "right"});
      m.put("description", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      TAG_CONSTANT.put("b-filter-item", m);
    }

    // b-flex-box（flex-box）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("is-row", new String[]{"true", "false"});
      m.put("item-num", new String[]{});
      m.put("item-config", new String[]{});
      m.put("width", new String[]{});
      m.put("height", new String[]{});
      TAG_CONSTANT.put("b-flex-box", m);
    }

    // b-flex-line（flex-line）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("left-width", new String[]{});
      m.put("gap", new String[]{});
      m.put("left-padding", new String[]{"true", "false"});
      m.put("left-clear-padding", new String[]{"right", "bottom"});
      m.put("right-padding", new String[]{"true", "false"});
      m.put("right-clear-padding", new String[]{"right", "bottom"});
      TAG_CONSTANT.put("b-flex-line", m);
    }

    // b-form（form）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("model", new String[]{});
      m.put("rules", new String[]{});
      m.put("inline", new String[]{"true", "false"});
      m.put("label-position", new String[]{"left", "right", "top"});
      m.put("label-width", new String[]{});
      m.put("label-suffix", new String[]{});
      m.put("hide-required-asterisk", new String[]{"true", "false"});
      m.put("require-asterisk-position", new String[]{"left", "right"});
      m.put("show-message", new String[]{"true", "false"});
      m.put("inline-message", new String[]{"true", "false"});
      m.put("status-icon", new String[]{"true", "false"});
      m.put("validate-on-rule-change", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("scroll-to-error", new String[]{"true", "false"});
      m.put("scroll-into-view-options", new String[]{});
      TAG_CONSTANT.put("b-form", m);
    }

    // b-grid（grid）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("selectRange", new String[]{});
      m.put("extend", new String[]{});
      m.put("autoClear", new String[]{});
      m.put("areaSelectable", new String[]{});
      m.put("getSelectedArea()", new String[]{});
      m.put("getSelectedAreaData()", new String[]{});
      m.put("setSelectedArea(area)", new String[]{});
      m.put("clearAreaSelection()", new String[]{});
      m.put("data", new String[]{});
      m.put("columns", new String[]{});
      m.put("height", new String[]{});
      m.put("size", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("align", new String[]{});
      m.put("show-header", new String[]{"true", "false"});
      m.put("footer-data", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("span-method", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("column-config", new String[]{});
      m.put("row-config", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("virtual-x-config", new String[]{});
      m.put("scrollbar-config", new String[]{});
      m.put("loading-config", new String[]{});
      m.put("empty-render", new String[]{});
      m.put("auto-resize", new String[]{"true", "false"});
      m.put("resize-config", new String[]{});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("tooltip-config", new String[]{});
      m.put("expand-config", new String[]{});
      m.put("zoom-config", new String[]{});
      m.put("merge-cells", new String[]{});
      m.put("seq-config", new String[]{});
      m.put("toolbar-config 增强", new String[]{});
      m.put("clip-config", new String[]{});
      m.put("row-config.height", new String[]{});
      m.put("row-resize-config", new String[]{});
      m.put("virtual-y-config.maxYHeight", new String[]{});
      m.put("custom-config", new String[]{});
      m.put("id", new String[]{});
      m.put("tooltip-config 增强", new String[]{});
      m.put("filter-config.showIcon", new String[]{"true", "false"});
      m.put("checkbox-config", new String[]{});
      m.put("radio-config", new String[]{});
      m.put("current-row-config", new String[]{});
      m.put("tree-config", new String[]{});
      m.put("sort-config", new String[]{});
      m.put("filter-config", new String[]{});
      m.put("edit-config", new String[]{});
      m.put("valid-config", new String[]{});
      m.put("pager-config", new String[]{});
      m.put("proxy-config", new String[]{});
      m.put("toolbar-config", new String[]{});
      m.put("export-config", new String[]{});
      m.put("keyboard-config", new String[]{});
      m.put("mouse-config", new String[]{});
      m.put("form-config", new String[]{});
      m.put("undo-redo-config", new String[]{});
      m.put("aggregate-config", new String[]{});
      m.put("row-drag-config", new String[]{});
      m.put("column-drag-config", new String[]{});
      m.put("menu-config", new String[]{});
      m.put("fnr-config", new String[]{});
      m.put("area-config", new String[]{});
      TAG_CONSTANT.put("b-grid", m);
    }

    // b-icon（icon）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("color", new String[]{});
      m.put("size", new String[]{});
      TAG_CONSTANT.put("b-icon", m);
    }

    // b-image（image）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("src", new String[]{});
      m.put("fit", new String[]{"fill", "contain", "cover", "none", "scale-down"});
      m.put("hide-on-click-modal", new String[]{"true", "false"});
      m.put("loading", new String[]{"eager", "lazy"});
      m.put("lazy", new String[]{"true", "false"});
      m.put("scroll-container", new String[]{});
      m.put("alt", new String[]{});
      m.put("referrerpolicy", new String[]{});
      m.put("crossorigin", new String[]{"anonymous", "use-credentials"});
      m.put("preview-src-list", new String[]{});
      m.put("z-index", new String[]{});
      m.put("initial-index", new String[]{});
      m.put("close-on-press-escape", new String[]{"true", "false"});
      m.put("preview-teleported", new String[]{"true", "false"});
      m.put("infinite", new String[]{"true", "false"});
      m.put("zoom-rate", new String[]{});
      m.put("scale", new String[]{});
      m.put("min-scale", new String[]{});
      m.put("max-scale", new String[]{});
      m.put("show-progress", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-image", m);
    }

    // b-input-number（input-number）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("min", new String[]{});
      m.put("max", new String[]{});
      m.put("step", new String[]{});
      m.put("step-strictly", new String[]{"true", "false"});
      m.put("precision", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("readonly", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("controls", new String[]{"true", "false"});
      m.put("controls-position", new String[]{"right"});
      m.put("name", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("id", new String[]{});
      m.put("value-on-clear", new String[]{"max"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("label ^(a11y)", new String[]{});
      m.put("inputmode", new String[]{});
      m.put("align", new String[]{"left", "center", "right"});
      m.put("disabled-scientific", new String[]{"true", "false"});
      m.put("tabindex", new String[]{});
      m.put("formatter", new String[]{});
      m.put("parser", new String[]{});
      TAG_CONSTANT.put("b-input-number", m);
    }

    // b-input-tag（input-tag）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("max", new String[]{});
      m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
      m.put("tag-effect", new String[]{"light", "dark", "plain"});
      m.put("effect", new String[]{"dark"});
      m.put("trigger", new String[]{"Enter", "Space"});
      m.put("draggable", new String[]{"true", "false"});
      m.put("delimiter", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("collapse-tags", new String[]{"true", "false"});
      m.put("collapse-tags-tooltip", new String[]{"true", "false"});
      m.put("save-on-blur", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("clear-icon", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("readonly", new String[]{"true", "false"});
      m.put("autofocus", new String[]{"true", "false"});
      m.put("id", new String[]{});
      m.put("tabindex", new String[]{});
      m.put("max-collapse-tags", new String[]{});
      m.put("maxlength", new String[]{});
      m.put("minlength", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("autocomplete", new String[]{});
      m.put("aria-label", new String[]{});
      TAG_CONSTANT.put("b-input-tag", m);
    }

    // b-input（input）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{"text", "textarea", "number", "password", "email", "search", "tel", "url"});
      m.put("v-model", new String[]{});
      m.put("model-modifiers", new String[]{});
      m.put("maxlength", new String[]{});
      m.put("minlength", new String[]{});
      m.put("show-word-limit", new String[]{"true", "false"});
      m.put("word-limit-position", new String[]{"inside", "outside"});
      m.put("placeholder", new String[]{});
      m.put("clearable", new String[]{"true", "false"});
      m.put("clear-icon", new String[]{});
      m.put("formatter", new String[]{});
      m.put("parser", new String[]{});
      m.put("show-password", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("prefix-icon", new String[]{});
      m.put("suffix-icon", new String[]{});
      m.put("rows", new String[]{});
      m.put("autosize", new String[]{"true", "false"});
      m.put("autocomplete", new String[]{});
      m.put("name", new String[]{});
      m.put("readonly", new String[]{"true", "false"});
      m.put("max", new String[]{});
      m.put("min", new String[]{});
      m.put("step", new String[]{});
      m.put("resize", new String[]{"none", "both", "horizontal", "vertical"});
      m.put("autofocus", new String[]{"true", "false"});
      m.put("form", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("tabindex", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("input-style", new String[]{});
      m.put("label ^(a11y)", new String[]{});
      m.put("inputmode", new String[]{});
      m.put("count-graphemes", new String[]{});
      TAG_CONSTANT.put("b-input", m);
    }

    // b-label-extend（label-extend）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("content", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("placement", new String[]{});
      m.put("effect", new String[]{});
      TAG_CONSTANT.put("b-label-extend", m);
    }

    // b-link（link）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info", "default"});
      m.put("underline", new String[]{"always", "hover", "never"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("href", new String[]{});
      m.put("target", new String[]{"_blank", "_parent", "_self", "_top"});
      m.put("icon", new String[]{});
      TAG_CONSTANT.put("b-link", m);
    }

    // b-list（list）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("mode", new String[]{"only", "async", "report", "cursor"});
      m.put("loading", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("item-key", new String[]{});
      m.put("direction", new String[]{"horizontal", "vertical"});
      m.put("wrap", new String[]{"true", "false"});
      m.put("fill", new String[]{"true", "false"});
      m.put("fill-ratio", new String[]{});
      m.put("space-size", new String[]{"default", "small"});
      m.put("space-style", new String[]{});
      m.put("alignment", new String[]{});
      m.put("item-props", new String[]{});
      m.put("pager-config", new String[]{});
      m.put("input", new String[]{});
      m.put("skip", new String[]{});
      m.put("take", new String[]{});
      m.put("order", new String[]{});
      m.put("conditionItems", new String[]{});
      TAG_CONSTANT.put("b-list", m);
    }

    // b-menu（menu）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("mode", new String[]{"horizontal", "vertical"});
      m.put("collapse", new String[]{"true", "false"});
      m.put("ellipsis", new String[]{"true", "false"});
      m.put("ellipsis-icon", new String[]{});
      m.put("popper-offset", new String[]{});
      m.put("default-active", new String[]{});
      m.put("default-openeds", new String[]{});
      m.put("unique-opened", new String[]{"true", "false"});
      m.put("menu-trigger", new String[]{"hover", "click"});
      m.put("router", new String[]{"true", "false"});
      m.put("collapse-transition", new String[]{"true", "false"});
      m.put("popper-effect", new String[]{"dark"});
      m.put("close-on-click-outside", new String[]{"true", "false"});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("show-timeout", new String[]{});
      m.put("hide-timeout", new String[]{});
      m.put("background-color", new String[]{});
      m.put("text-color", new String[]{});
      m.put("active-text-color", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-menu", m);
    }

    // b-navigation（navigation）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("routers", new String[]{});
      m.put("height", new String[]{});
      m.put("separator", new String[]{});
      m.put("title", new String[]{});
      m.put("to", new String[]{});
      TAG_CONSTANT.put("b-navigation", m);
    }

    // b-pagination（pagination）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("size", new String[]{"large", "default", "small"});
      m.put("background", new String[]{"true", "false"});
      m.put("page-size", new String[]{});
      m.put("default-page-size", new String[]{});
      m.put("total", new String[]{});
      m.put("page-count", new String[]{});
      m.put("pager-count", new String[]{});
      m.put("current-page", new String[]{});
      m.put("default-current-page", new String[]{});
      m.put("layout", new String[]{});
      m.put("page-sizes", new String[]{});
      m.put("append-size-to", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("prev-text", new String[]{});
      m.put("prev-icon", new String[]{});
      m.put("next-text", new String[]{});
      m.put("next-icon", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("teleported", new String[]{"true", "false"});
      m.put("hide-on-single-page", new String[]{"true", "false"});
      m.put("small", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-pagination", m);
    }

    // b-panel（panel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("header", new String[]{"default", "card", "hidden"});
      m.put("header-border", new String[]{"true", "false"});
      m.put("title", new String[]{});
      m.put("padding-size", new String[]{"large", "default", "small"});
      m.put("clear-padding", new String[]{"right", "bottom"});
      m.put("border", new String[]{"true", "false"});
      m.put("shadow", new String[]{"always", "hover", "never"});
      m.put("background", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("body-class", new String[]{});
      m.put("body-style", new String[]{});
      TAG_CONSTANT.put("b-panel", m);
    }

    // b-popconfirm（popconfirm）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("title", new String[]{});
      m.put("effect", new String[]{"dark"});
      m.put("confirm-button-text", new String[]{});
      m.put("cancel-button-text", new String[]{});
      m.put("confirm-button-type", new String[]{"primary", "success", "warning", "danger", "info", "text"});
      m.put("cancel-button-type", new String[]{"primary", "success", "warning", "danger", "info", "text"});
      m.put("icon", new String[]{});
      m.put("icon-color", new String[]{});
      m.put("hide-icon", new String[]{"true", "false"});
      m.put("hide-after", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("persistent", new String[]{"true", "false"});
      m.put("width", new String[]{});
      m.put("tooltip", new String[]{});
      TAG_CONSTANT.put("b-popconfirm", m);
    }

    // b-popover（popover）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("trigger", new String[]{"click", "focus", "hover"});
      m.put("trigger-keys", new String[]{});
      m.put("title", new String[]{});
      m.put("effect", new String[]{"dark"});
      m.put("content", new String[]{});
      m.put("width", new String[]{});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("visible", new String[]{"true", "false"});
      m.put("offset", new String[]{});
      m.put("transition", new String[]{});
      m.put("show-arrow", new String[]{"true", "false"});
      m.put("popper-options", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("show-after", new String[]{});
      m.put("hide-after", new String[]{});
      m.put("auto-close", new String[]{});
      m.put("tabindex", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("virtual-triggering", new String[]{"true", "false"});
      m.put("virtual-ref", new String[]{});
      m.put("tooltip", new String[]{});
      TAG_CONSTANT.put("b-popover", m);
    }

    // b-progress（progress）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("percentage", new String[]{});
      m.put("type", new String[]{"line", "circle", "dashboard"});
      m.put("stroke-width", new String[]{});
      m.put("text-inside", new String[]{"true", "false"});
      m.put("status", new String[]{"success", "exception", "warning"});
      m.put("indeterminate", new String[]{"true", "false"});
      m.put("duration", new String[]{});
      m.put("color", new String[]{});
      m.put("width", new String[]{});
      m.put("show-text", new String[]{"true", "false"});
      m.put("stroke-linecap", new String[]{"butt", "round", "square"});
      m.put("format", new String[]{});
      m.put("striped", new String[]{"true", "false"});
      m.put("striped-flow", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-progress", m);
    }

    // b-radio（radio）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("name", new String[]{});
      TAG_CONSTANT.put("b-radio", m);
    }

    // b-scrollbar（scrollbar）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("native", new String[]{"true", "false"});
      m.put("wrap-style", new String[]{});
      m.put("wrap-class", new String[]{});
      m.put("view-style", new String[]{});
      m.put("view-class", new String[]{});
      m.put("noresize", new String[]{"true", "false"});
      m.put("tag", new String[]{});
      m.put("always", new String[]{"true", "false"});
      m.put("min-size", new String[]{});
      m.put("id", new String[]{});
      m.put("role", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("aria-orientation", new String[]{"horizontal", "vertical"});
      m.put("tabindex", new String[]{});
      m.put("distance", new String[]{});
      TAG_CONSTANT.put("b-scrollbar", m);
    }

    // b-search-select（search-select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("props", new String[]{});
      m.put("page-size", new String[]{});
      m.put("height", new String[]{});
      m.put("width", new String[]{});
      m.put("dropdown-width", new String[]{});
      m.put("dropdown-max-width", new String[]{});
      m.put("searchable", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("allow-create", new String[]{"true", "false"});
      m.put("debounce", new String[]{});
      m.put("size", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("id", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("search-placeholder", new String[]{});
      m.put("default-text", new String[]{});
      TAG_CONSTANT.put("b-search-select", m);
    }

    // b-search-tree-panel（search-tree-panel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("reloadable", new String[]{"true", "false"});
      m.put("placeholder", new String[]{});
      m.put("dropdown-width", new String[]{});
      TAG_CONSTANT.put("b-search-tree-panel", m);
    }

    // b-search-tree-select（search-tree-select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("data", new String[]{});
      m.put("props", new String[]{});
      m.put("page-size", new String[]{});
      m.put("lazy", new String[]{"true", "false"});
      m.put("hide-leaf-icon", new String[]{"true", "false"});
      m.put("searchable", new String[]{"true", "false"});
      m.put("reloadable", new String[]{"true", "false"});
      m.put("pageable", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("auto-expand", new String[]{});
      m.put("default-expanded-keys", new String[]{});
      m.put("default-text", new String[]{});
      m.put("id", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("search-placeholder", new String[]{});
      m.put("width", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("dropdown-width", new String[]{});
      m.put("dropdown-height", new String[]{});
      m.put("show-line", new String[]{"true", "false"});
      m.put("expand-icon", new String[]{"square", "caret"});
      TAG_CONSTANT.put("b-search-tree-select", m);
    }

    // b-select-v2（select-v2）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("multiple", new String[]{"true", "false"});
      m.put("disabled", new String[]{});
      m.put("value-key", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("clear-icon", new String[]{});
      m.put("collapse-tags", new String[]{"true", "false"});
      m.put("multiple-limit", new String[]{});
      m.put("id", new String[]{});
      m.put("name", new String[]{});
      m.put("effect", new String[]{"dark"});
      m.put("autocomplete", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("filterable", new String[]{"true", "false"});
      m.put("allow-create", new String[]{"true", "false"});
      m.put("filter-method", new String[]{});
      m.put("loading", new String[]{"true", "false"});
      m.put("loading-text", new String[]{});
      m.put("reserve-keyword", new String[]{"true", "false"});
      m.put("default-first-option", new String[]{"true", "false"});
      m.put("no-match-text", new String[]{});
      m.put("no-data-text", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("popper-options", new String[]{});
      m.put("automatic-dropdown", new String[]{"true", "false"});
      m.put("fit-input-width", new String[]{"true", "false"});
      m.put("suffix-icon", new String[]{});
      m.put("height", new String[]{});
      m.put("item-height", new String[]{});
      m.put("estimated-option-height", new String[]{});
      m.put("scrollbar-always-on", new String[]{"true", "false"});
      m.put("remote", new String[]{"true", "false"});
      m.put("debounce", new String[]{});
      m.put("remote-method", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("offset", new String[]{});
      m.put("show-arrow", new String[]{"true", "false"});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("fallback-placements", new String[]{});
      m.put("collapse-tags-tooltip", new String[]{"true", "false"});
      m.put("tag-tooltip", new String[]{});
      m.put("max-collapse-tags", new String[]{});
      m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
      m.put("tag-effect", new String[]{"light", "dark", "plain"});
      m.put("aria-label", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("popper-append-to-body", new String[]{});
      m.put("tabindex", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("transition", new String[]{});
      m.put("show-after", new String[]{});
      m.put("hide-after", new String[]{});
      m.put("auto-close", new String[]{});
      TAG_CONSTANT.put("b-select-v2", m);
    }

    // b-select（select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("multiple", new String[]{"true", "false"});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("disabled", new String[]{});
      m.put("value-key", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("collapse-tags", new String[]{"true", "false"});
      m.put("collapse-tags-tooltip", new String[]{"true", "false"});
      m.put("tag-tooltip", new String[]{});
      m.put("multiple-limit", new String[]{});
      m.put("id", new String[]{});
      m.put("name", new String[]{});
      m.put("effect", new String[]{"dark"});
      m.put("autocomplete", new String[]{});
      m.put("placeholder", new String[]{});
      m.put("filterable", new String[]{"true", "false"});
      m.put("allow-create", new String[]{"true", "false"});
      m.put("filter-method", new String[]{});
      m.put("remote", new String[]{"true", "false"});
      m.put("debounce", new String[]{});
      m.put("remote-method", new String[]{});
      m.put("remote-show-suffix", new String[]{"true", "false"});
      m.put("loading", new String[]{"true", "false"});
      m.put("loading-text", new String[]{});
      m.put("no-match-text", new String[]{});
      m.put("no-data-text", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("reserve-keyword", new String[]{"true", "false"});
      m.put("default-first-option", new String[]{"true", "false"});
      m.put("teleported", new String[]{"true", "false"});
      m.put("append-to", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("automatic-dropdown", new String[]{"true", "false"});
      m.put("clear-icon", new String[]{});
      m.put("fit-input-width", new String[]{"true", "false"});
      m.put("suffix-icon", new String[]{});
      m.put("tag-type", new String[]{"success", "info", "warning", "danger"});
      m.put("tag-effect", new String[]{"light", "dark", "plain"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("offset", new String[]{});
      m.put("show-arrow", new String[]{"true", "false"});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("fallback-placements", new String[]{});
      m.put("max-collapse-tags", new String[]{});
      m.put("popper-options", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("suffix-transition", new String[]{"true", "false"});
      m.put("tabindex", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("transition", new String[]{});
      m.put("show-after", new String[]{});
      m.put("hide-after", new String[]{});
      m.put("auto-close", new String[]{});
      TAG_CONSTANT.put("b-select", m);
    }

    // b-skeleton（skeleton）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("animated", new String[]{"true", "false"});
      m.put("count", new String[]{});
      m.put("loading", new String[]{"true", "false"});
      m.put("rows", new String[]{});
      m.put("throttle", new String[]{});
      TAG_CONSTANT.put("b-skeleton", m);
    }

    // b-slider（slider）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("min", new String[]{});
      m.put("max", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("step", new String[]{});
      m.put("show-input", new String[]{"true", "false"});
      m.put("show-input-controls", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("input-size", new String[]{"large", "default", "small"});
      m.put("show-stops", new String[]{"true", "false"});
      m.put("show-tooltip", new String[]{"true", "false"});
      m.put("format-tooltip", new String[]{});
      m.put("range", new String[]{"true", "false"});
      m.put("vertical", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("range-start-label", new String[]{});
      m.put("range-end-label", new String[]{});
      m.put("format-value-text", new String[]{});
      m.put("tooltip-class", new String[]{});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("marks", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("persistent", new String[]{"true", "false"});
      m.put("label ^(a11y)", new String[]{});
      TAG_CONSTANT.put("b-slider", m);
    }

    // b-space（space）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("alignment", new String[]{"center", "normal", "stretch"});
      m.put("class", new String[]{});
      m.put("direction", new String[]{"vertical", "horizontal"});
      m.put("prefix-cls", new String[]{});
      m.put("style", new String[]{});
      m.put("spacer", new String[]{});
      m.put("size", new String[]{"default", "small"});
      m.put("wrap", new String[]{"true", "false"});
      m.put("fill", new String[]{"true", "false"});
      m.put("fill-ratio", new String[]{});
      TAG_CONSTANT.put("b-space", m);
    }

    // b-steps（steps）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("space", new String[]{});
      m.put("direction", new String[]{"vertical", "horizontal"});
      m.put("active", new String[]{});
      m.put("process-status", new String[]{"wait", "process", "finish", "error", "success"});
      m.put("finish-status", new String[]{"wait", "process", "finish", "error", "success"});
      m.put("align-center", new String[]{"true", "false"});
      m.put("simple", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-steps", m);
    }

    // b-switch（switch）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("loading", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("width", new String[]{});
      m.put("inline-prompt", new String[]{"true", "false"});
      m.put("active-icon", new String[]{});
      m.put("inactive-icon", new String[]{});
      m.put("active-action-icon", new String[]{});
      m.put("inactive-action-icon", new String[]{});
      m.put("active-text", new String[]{});
      m.put("inactive-text", new String[]{});
      m.put("active-value", new String[]{"true", "false"});
      m.put("inactive-value", new String[]{"true", "false"});
      m.put("name", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("before-change", new String[]{});
      m.put("id", new String[]{});
      m.put("tabindex", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("active-color", new String[]{});
      m.put("inactive-color", new String[]{});
      m.put("border-color", new String[]{});
      m.put("label ^(a11y)", new String[]{});
      TAG_CONSTANT.put("b-switch", m);
    }

    // b-tabs（tabs）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("default-value", new String[]{});
      m.put("type", new String[]{"card", "border-card"});
      m.put("closable", new String[]{"true", "false"});
      m.put("addable", new String[]{"true", "false"});
      m.put("editable", new String[]{"true", "false"});
      m.put("tab-position", new String[]{"top", "right", "bottom", "left"});
      m.put("stretch", new String[]{"true", "false"});
      m.put("before-leave", new String[]{});
      m.put("tabindex", new String[]{});
      TAG_CONSTANT.put("b-tabs", m);
    }

    // b-tag（tag）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{"primary", "success", "info", "warning", "danger"});
      m.put("closable", new String[]{"true", "false"});
      m.put("disable-transitions", new String[]{"true", "false"});
      m.put("hit", new String[]{"true", "false"});
      m.put("color", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("effect", new String[]{"dark", "light", "plain"});
      m.put("round", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-tag", m);
    }

    // b-text（text）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("truncated", new String[]{"true", "false"});
      m.put("line-clamp", new String[]{});
      m.put("tag", new String[]{});
      TAG_CONSTANT.put("b-text", m);
    }

    // b-time-picker（time-picker）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("readonly", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("editable", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("placeholder", new String[]{});
      m.put("start-placeholder", new String[]{});
      m.put("end-placeholder", new String[]{});
      m.put("is-range", new String[]{"true", "false"});
      m.put("arrow-control", new String[]{"true", "false"});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("popper-options", new String[]{});
      m.put("fallback-placements", new String[]{});
      m.put("placement", new String[]{});
      m.put("range-separator", new String[]{});
      m.put("format", new String[]{});
      m.put("default-value", new String[]{});
      m.put("value-format", new String[]{});
      m.put("id", new String[]{});
      m.put("name", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("prefix-icon", new String[]{});
      m.put("clear-icon", new String[]{});
      m.put("disabled-hours", new String[]{});
      m.put("disabled-minutes", new String[]{});
      m.put("disabled-seconds", new String[]{});
      m.put("teleported", new String[]{"true", "false"});
      m.put("tabindex", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("save-on-blur", new String[]{"true", "false"});
      m.put("label ^(a11y)", new String[]{});
      TAG_CONSTANT.put("b-time-picker", m);
    }

    // b-time-select（time-select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("editable", new String[]{"true", "false"});
      m.put("clearable", new String[]{"true", "false"});
      m.put("include-end-time", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("placeholder", new String[]{});
      m.put("name", new String[]{});
      m.put("effect", new String[]{"light"});
      m.put("prefix-icon", new String[]{});
      m.put("clear-icon", new String[]{});
      m.put("start", new String[]{});
      m.put("end", new String[]{});
      m.put("step", new String[]{});
      m.put("min-time", new String[]{});
      m.put("max-time", new String[]{});
      m.put("format", new String[]{});
      m.put("empty-values", new String[]{});
      m.put("value-on-clear", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      TAG_CONSTANT.put("b-time-select", m);
    }

    // b-timeline（timeline）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("reverse", new String[]{"true", "false"});
      m.put("mode", new String[]{"start", "alternate", "alternate-reverse", "end"});
      TAG_CONSTANT.put("b-timeline", m);
    }

    // b-tool-bar（tool-bar）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("divider", new String[]{"true", "false"});
      m.put("padding-size", new String[]{"large", "default", "small"});
      m.put("clear-padding", new String[]{"right", "bottom"});
      m.put("tool-max-width", new String[]{});
      m.put("border", new String[]{"true", "false"});
      m.put("background", new String[]{"true", "false"});
      m.put("filter-gutter", new String[]{});
      TAG_CONSTANT.put("b-tool-bar", m);
    }

    // b-tooltip（tooltip）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("append-to", new String[]{});
      m.put("effect", new String[]{"dark", "light"});
      m.put("content", new String[]{});
      m.put("raw-content", new String[]{"true", "false"});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("fallback-placements", new String[]{});
      m.put("visible", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("offset", new String[]{});
      m.put("transition", new String[]{});
      m.put("popper-options", new String[]{});
      m.put("arrow-offset", new String[]{});
      m.put("show-after", new String[]{});
      m.put("show-arrow", new String[]{"true", "false"});
      m.put("hide-after", new String[]{});
      m.put("auto-close", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("enterable", new String[]{"true", "false"});
      m.put("teleported", new String[]{"true", "false"});
      m.put("trigger", new String[]{"hover", "click", "focus"});
      m.put("virtual-triggering", new String[]{"true", "false"});
      m.put("virtual-ref", new String[]{});
      m.put("trigger-keys", new String[]{});
      m.put("persistent", new String[]{"true", "false"});
      m.put("aria-label", new String[]{});
      m.put("focus-on-target", new String[]{});
      TAG_CONSTANT.put("b-tooltip", m);
    }

    // b-transfer（transfer）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("data", new String[]{});
      m.put("filterable", new String[]{"true", "false"});
      m.put("filter-placeholder", new String[]{});
      m.put("filter-method", new String[]{});
      m.put("target-order", new String[]{"original", "push", "unshift"});
      m.put("titles", new String[]{});
      m.put("button-texts", new String[]{});
      m.put("render-content", new String[]{});
      m.put("format", new String[]{});
      m.put("props", new String[]{});
      m.put("left-default-checked", new String[]{});
      m.put("right-default-checked", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("virtual-scroll", new String[]{"true", "false"});
      m.put("item-size", new String[]{});
      TAG_CONSTANT.put("b-transfer", m);
    }

    // b-tree-select（tree-select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("tree", new String[]{});
      m.put("select", new String[]{});
      TAG_CONSTANT.put("b-tree-select", m);
    }

    // b-tree-v2（tree-v2）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("props", new String[]{});
      m.put("highlight-current", new String[]{"true", "false"});
      m.put("expand-on-click-node", new String[]{"true", "false"});
      m.put("check-on-click-node", new String[]{"true", "false"});
      m.put("check-on-click-leaf", new String[]{"true", "false"});
      m.put("default-expanded-keys", new String[]{});
      m.put("show-checkbox", new String[]{"true", "false"});
      m.put("check-strictly", new String[]{"true", "false"});
      m.put("default-checked-keys", new String[]{});
      m.put("current-node-key", new String[]{});
      m.put("filter-method", new String[]{});
      m.put("indent", new String[]{});
      m.put("icon", new String[]{});
      m.put("item-size", new String[]{});
      m.put("scrollbar-always-on", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("children", new String[]{});
      m.put("disabled", new String[]{});
      m.put("class", new String[]{});
      TAG_CONSTANT.put("b-tree-v2", m);
    }

    // b-tree（tree）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("node-key", new String[]{});
      m.put("props", new String[]{});
      m.put("render-after-expand", new String[]{"true", "false"});
      m.put("load", new String[]{});
      m.put("render-content", new String[]{});
      m.put("highlight-current", new String[]{"true", "false"});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-on-click-node", new String[]{"true", "false"});
      m.put("check-on-click-node", new String[]{"true", "false"});
      m.put("check-on-click-leaf", new String[]{"true", "false"});
      m.put("auto-expand-parent", new String[]{"true", "false"});
      m.put("default-expanded-keys", new String[]{});
      m.put("show-checkbox", new String[]{"true", "false"});
      m.put("check-strictly", new String[]{"true", "false"});
      m.put("default-checked-keys", new String[]{});
      m.put("current-node-key", new String[]{});
      m.put("filter-node-method", new String[]{});
      m.put("accordion", new String[]{"true", "false"});
      m.put("indent", new String[]{});
      m.put("icon", new String[]{});
      m.put("lazy", new String[]{"true", "false"});
      m.put("draggable", new String[]{"true", "false"});
      m.put("allow-drag", new String[]{});
      m.put("allow-drop", new String[]{});
      m.put("label", new String[]{});
      m.put("children", new String[]{});
      m.put("disabled", new String[]{});
      m.put("isLeaf", new String[]{});
      m.put("class", new String[]{});
      TAG_CONSTANT.put("b-tree", m);
    }

    // b-upload（upload）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("action", new String[]{});
      m.put("headers", new String[]{});
      m.put("method", new String[]{});
      m.put("multiple", new String[]{"true", "false"});
      m.put("data", new String[]{});
      m.put("name", new String[]{});
      m.put("with-credentials", new String[]{"true", "false"});
      m.put("show-file-list", new String[]{"true", "false"});
      m.put("drag", new String[]{"true", "false"});
      m.put("accept", new String[]{});
      m.put("crossorigin", new String[]{"anonymous", "use-credentials"});
      m.put("on-preview", new String[]{});
      m.put("on-remove", new String[]{});
      m.put("on-success", new String[]{});
      m.put("on-error", new String[]{});
      m.put("on-progress", new String[]{});
      m.put("on-change", new String[]{});
      m.put("on-exceed", new String[]{});
      m.put("before-upload", new String[]{});
      m.put("before-remove", new String[]{});
      m.put("file-list", new String[]{});
      m.put("list-type", new String[]{"text", "picture", "picture-card"});
      m.put("auto-upload", new String[]{"true", "false"});
      m.put("http-request", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("limit", new String[]{});
      m.put("directory", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-upload", m);
    }

    // b-watermark（watermark）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("width", new String[]{});
      m.put("height", new String[]{});
      m.put("rotate", new String[]{});
      m.put("z-index", new String[]{});
      m.put("image", new String[]{});
      m.put("content", new String[]{});
      m.put("font", new String[]{});
      m.put("gap", new String[]{});
      m.put("offset", new String[]{});
      m.put("color", new String[]{});
      m.put("fontSize", new String[]{});
      m.put("fontWeight", new String[]{"normal", "bold", "lighter", "bolder"});
      m.put("fontFamily", new String[]{});
      m.put("fontGap", new String[]{});
      m.put("fontStyle", new String[]{"none", "normal", "italic", "oblique"});
      m.put("textAlign", new String[]{"left", "right", "center", "start", "end"});
      m.put("textBaseline", new String[]{"top", "hanging", "middle", "alphabetic", "ideographic", "bottom"});
      TAG_CONSTANT.put("b-watermark", m);
    }

    // b-anchor-link（anchor）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("title", new String[]{});
      m.put("href", new String[]{});
      TAG_CONSTANT.put("b-anchor-link", m);
    }

    // b-avatar-group（avatar）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("size", new String[]{"default", "small"});
      m.put("shape", new String[]{"circle", "square"});
      m.put("collapse-avatars", new String[]{"true", "false"});
      m.put("collapse-avatars-tooltip", new String[]{"true", "false"});
      m.put("max-collapse-avatars", new String[]{});
      m.put("effect", new String[]{"dark"});
      m.put("placement", new String[]{"top", "top-start", "top-end", "bottom", "bottom-start", "bottom-end", "left", "left-start", "left-end", "right", "right-start", "right-end"});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("collapse-class", new String[]{});
      m.put("collapse-style", new String[]{});
      TAG_CONSTANT.put("b-avatar-group", m);
    }

    // b-breadcrumb-item（breadcrumb）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("to", new String[]{});
      m.put("replace", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-breadcrumb-item", m);
    }

    // b-button-group（button）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("size", new String[]{"large", "default", "small"});
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
      m.put("direction", new String[]{"horizontal", "vertical"});
      TAG_CONSTANT.put("b-button-group", m);
    }

    // b-carousel-item（carousel）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("name", new String[]{});
      m.put("label", new String[]{});
      TAG_CONSTANT.put("b-carousel-item", m);
    }

    // b-cascader-panel（cascader）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("virtual-scroll", new String[]{"true", "false"});
      m.put("item-size", new String[]{});
      m.put("height", new String[]{});
      m.put("expandTrigger", new String[]{"click", "hover"});
      m.put("multiple", new String[]{"true", "false"});
      m.put("checkStrictly", new String[]{"true", "false"});
      m.put("emitPath", new String[]{"true", "false"});
      m.put("lazy", new String[]{"true", "false"});
      m.put("lazyLoad", new String[]{});
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("children", new String[]{});
      m.put("disabled", new String[]{});
      m.put("leaf", new String[]{});
      m.put("hoverThreshold", new String[]{});
      m.put("checkOnClickNode", new String[]{"true", "false"});
      m.put("checkOnClickLeaf", new String[]{"true", "false"});
      m.put("showPrefix", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-cascader-panel", m);
    }

    // b-checkbox-group（checkbox）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("min", new String[]{});
      m.put("max", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("text-color", new String[]{});
      m.put("fill", new String[]{});
      m.put("tag", new String[]{});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("label ^(a11y)", new String[]{});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("type", new String[]{"checkbox", "button"});
      TAG_CONSTANT.put("b-checkbox-group", m);
    }

    // b-checkbox-button（checkbox）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("true-value", new String[]{});
      m.put("false-value", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("name", new String[]{});
      m.put("checked", new String[]{"true", "false"});
      m.put("true-label", new String[]{});
      m.put("false-label", new String[]{});
      TAG_CONSTANT.put("b-checkbox-button", m);
    }

    // b-collapse-item（collapse）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("name", new String[]{});
      m.put("title", new String[]{});
      m.put("icon", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-collapse-item", m);
    }

    // b-dropdown-item（dropdown）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("command", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("divided", new String[]{"true", "false"});
      m.put("icon", new String[]{});
      TAG_CONSTANT.put("b-dropdown-item", m);
    }

    // b-form-item（form）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("prop", new String[]{});
      m.put("label", new String[]{});
      m.put("label-position", new String[]{"left", "right", "top"});
      m.put("label-width", new String[]{});
      m.put("required", new String[]{"true", "false"});
      m.put("rules", new String[]{});
      m.put("error", new String[]{});
      m.put("show-message", new String[]{"true", "false"});
      m.put("inline-message", new String[]{"true", "false"});
      m.put("size", new String[]{"large", "default", "small"});
      m.put("for", new String[]{});
      m.put("validate-status", new String[]{"error", "validating", "success"});
      TAG_CONSTANT.put("b-form-item", m);
    }

    // b-grid-column（grid）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("type", new String[]{});
      m.put("field", new String[]{});
      m.put("width", new String[]{});
      m.put("fixed", new String[]{});
      m.put("align", new String[]{});
      m.put("visible", new String[]{"true", "false"});
      m.put("resizable", new String[]{"true", "false"});
      m.put("sortable", new String[]{"true", "false"});
      m.put("filters", new String[]{});
      m.put("filter-multiple", new String[]{"true", "false"});
      m.put("formatter", new String[]{});
      m.put("show-overflow", new String[]{"true", "false"});
      m.put("tree-node", new String[]{"true", "false"});
      m.put("edit-render", new String[]{});
      m.put("edit-rules", new String[]{});
      m.put("class-name", new String[]{});
      m.put("children", new String[]{});
      m.put("slots", new String[]{});
      TAG_CONSTANT.put("b-grid-column", m);
    }

    // b-image-viewer（image）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("url-list", new String[]{});
      m.put("z-index", new String[]{});
      m.put("initial-index", new String[]{});
      m.put("infinite", new String[]{"true", "false"});
      m.put("hide-on-click-modal", new String[]{"true", "false"});
      m.put("teleported", new String[]{"true", "false"});
      m.put("zoom-rate", new String[]{});
      m.put("scale", new String[]{});
      m.put("min-scale", new String[]{});
      m.put("max-scale", new String[]{});
      m.put("close-on-press-escape", new String[]{"true", "false"});
      m.put("show-progress", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-image-viewer", m);
    }

    // b-row（layout）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("gutter", new String[]{});
      m.put("justify", new String[]{"start", "end", "center", "space-around", "space-between", "space-evenly"});
      m.put("align", new String[]{"top", "middle", "bottom"});
      m.put("tag", new String[]{});
      TAG_CONSTANT.put("b-row", m);
    }

    // b-col（layout）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("span", new String[]{});
      m.put("offset", new String[]{});
      m.put("push", new String[]{});
      m.put("pull", new String[]{});
      m.put("xs", new String[]{});
      m.put("sm", new String[]{});
      m.put("md", new String[]{});
      m.put("lg", new String[]{});
      m.put("xl", new String[]{});
      m.put("tag", new String[]{});
      TAG_CONSTANT.put("b-col", m);
    }

    // b-sub-menu（menu）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("index", new String[]{});
      m.put("popper-class", new String[]{});
      m.put("popper-style", new String[]{});
      m.put("show-timeout", new String[]{});
      m.put("hide-timeout", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("teleported", new String[]{"true", "false"});
      m.put("popper-offset", new String[]{});
      m.put("expand-close-icon", new String[]{});
      m.put("expand-open-icon", new String[]{});
      m.put("collapse-close-icon", new String[]{});
      m.put("collapse-open-icon", new String[]{});
      TAG_CONSTANT.put("b-sub-menu", m);
    }

    // b-menu-item（menu）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("index", new String[]{});
      m.put("route", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-menu-item", m);
    }

    // b-menu-item-group（menu）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("title", new String[]{});
      TAG_CONSTANT.put("b-menu-item-group", m);
    }

    // b-radio-group（radio）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("v-model", new String[]{});
      m.put("size", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("validate-event", new String[]{"true", "false"});
      m.put("text-color", new String[]{});
      m.put("fill", new String[]{});
      m.put("aria-label", new String[]{});
      m.put("name", new String[]{});
      m.put("id", new String[]{});
      m.put("label ^(a11y)", new String[]{});
      m.put("options", new String[]{});
      m.put("props", new String[]{});
      m.put("type", new String[]{"radio", "button"});
      TAG_CONSTANT.put("b-radio-group", m);
    }

    // b-radio-button（radio）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("name", new String[]{});
      TAG_CONSTANT.put("b-radio-button", m);
    }

    // b-option-group（select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("label", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-option-group", m);
    }

    // b-option（select）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("value", new String[]{});
      m.put("label", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-option", m);
    }

    // b-skeleton-item（skeleton）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("variant", new String[]{"p", "text", "h1", "h3", "caption", "button", "image", "circle", "rect"});
      TAG_CONSTANT.put("b-skeleton-item", m);
    }

    // b-step（steps）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("title", new String[]{});
      m.put("description", new String[]{});
      m.put("icon", new String[]{});
      m.put("status", new String[]{"wait", "process", "finish", "error", "success"});
      TAG_CONSTANT.put("b-step", m);
    }

    // b-tab-pane（tabs）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("label", new String[]{});
      m.put("disabled", new String[]{"true", "false"});
      m.put("name", new String[]{});
      m.put("closable", new String[]{"true", "false"});
      m.put("lazy", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-tab-pane", m);
    }

    // b-check-tag（tag）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("checked", new String[]{"true", "false"});
      m.put("disabled", new String[]{"true", "false"});
      m.put("type", new String[]{"primary", "success", "info", "warning", "danger"});
      TAG_CONSTANT.put("b-check-tag", m);
    }

    // b-timeline-item（timeline）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("timestamp", new String[]{});
      m.put("hide-timestamp", new String[]{"true", "false"});
      m.put("center", new String[]{"true", "false"});
      m.put("placement", new String[]{"top", "bottom"});
      m.put("type", new String[]{"primary", "success", "warning", "danger", "info"});
      m.put("color", new String[]{});
      m.put("size", new String[]{"normal", "large"});
      m.put("icon", new String[]{});
      m.put("hollow", new String[]{"true", "false"});
      TAG_CONSTANT.put("b-timeline-item", m);
    }

    // b-table-only（table-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("show-header", new String[]{"true", "false"});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("highlight-current-row", new String[]{"true", "false"});
      m.put("current-row-key", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("row-style", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("cell-style", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("header-row-style", new String[]{});
      m.put("header-cell-class-name", new String[]{});
      m.put("header-cell-style", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-row-keys", new String[]{});
      m.put("default-sort", new String[]{});
      m.put("tooltip-effect", new String[]{});
      m.put("tooltip-options", new String[]{});
      m.put("tooltip-formatter", new String[]{});
      m.put("show-summary", new String[]{"true", "false"});
      m.put("sum-text", new String[]{});
      m.put("summary-method", new String[]{});
      m.put("span-method", new String[]{});
      m.put("select-on-indeterminate", new String[]{"true", "false"});
      m.put("table-loading", new String[]{"true", "false"});
      m.put("column-configs", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("├─ gt", new String[]{});
      m.put("├─ estimateHeight", new String[]{});
      m.put("├─ bufferSize", new String[]{});
      m.put("├─ maxYHeight", new String[]{});
      m.put("└─ enabled", new String[]{"true", "false"});
      m.put("virtual-x-config", new String[]{});
      m.put("├─ enabled", new String[]{"true", "false"});
      m.put("└─ bufferSize", new String[]{});
      TAG_CONSTANT.put("b-table-only", m);
    }

    // b-table-async（table-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("show-header", new String[]{"true", "false"});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("highlight-current-row", new String[]{"true", "false"});
      m.put("current-row-key", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("row-style", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("cell-style", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("header-row-style", new String[]{});
      m.put("header-cell-class-name", new String[]{});
      m.put("header-cell-style", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-row-keys", new String[]{});
      m.put("default-sort", new String[]{});
      m.put("tooltip-effect", new String[]{});
      m.put("tooltip-options", new String[]{});
      m.put("tooltip-formatter", new String[]{});
      m.put("show-summary", new String[]{"true", "false"});
      m.put("sum-text", new String[]{});
      m.put("summary-method", new String[]{});
      m.put("span-method", new String[]{});
      m.put("select-on-indeterminate", new String[]{"true", "false"});
      m.put("table-loading", new String[]{"true", "false"});
      m.put("column-configs", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("├─ gt", new String[]{});
      m.put("├─ estimateHeight", new String[]{});
      m.put("├─ bufferSize", new String[]{});
      m.put("├─ maxYHeight", new String[]{});
      m.put("└─ enabled", new String[]{"true", "false"});
      m.put("virtual-x-config", new String[]{});
      m.put("├─ enabled", new String[]{"true", "false"});
      m.put("└─ bufferSize", new String[]{});
      m.put("table-data", new String[]{});
      m.put("auto-load", new String[]{"true", "false"});
      m.put("input", new String[]{});
      m.put("pagination", new String[]{});
      TAG_CONSTANT.put("b-table-async", m);
    }

    // b-table-report（table-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("show-header", new String[]{"true", "false"});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("highlight-current-row", new String[]{"true", "false"});
      m.put("current-row-key", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("row-style", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("cell-style", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("header-row-style", new String[]{});
      m.put("header-cell-class-name", new String[]{});
      m.put("header-cell-style", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-row-keys", new String[]{});
      m.put("default-sort", new String[]{});
      m.put("tooltip-effect", new String[]{});
      m.put("tooltip-options", new String[]{});
      m.put("tooltip-formatter", new String[]{});
      m.put("show-summary", new String[]{"true", "false"});
      m.put("sum-text", new String[]{});
      m.put("summary-method", new String[]{});
      m.put("span-method", new String[]{});
      m.put("select-on-indeterminate", new String[]{"true", "false"});
      m.put("table-loading", new String[]{"true", "false"});
      m.put("column-configs", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("├─ gt", new String[]{});
      m.put("├─ estimateHeight", new String[]{});
      m.put("├─ bufferSize", new String[]{});
      m.put("├─ maxYHeight", new String[]{});
      m.put("└─ enabled", new String[]{"true", "false"});
      m.put("virtual-x-config", new String[]{});
      m.put("├─ enabled", new String[]{"true", "false"});
      m.put("└─ bufferSize", new String[]{});
      m.put("table-data", new String[]{});
      m.put("pagination", new String[]{});
      TAG_CONSTANT.put("b-table-report", m);
    }

    // b-tree-table（table-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("show-header", new String[]{"true", "false"});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("highlight-current-row", new String[]{"true", "false"});
      m.put("current-row-key", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("row-style", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("cell-style", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("header-row-style", new String[]{});
      m.put("header-cell-class-name", new String[]{});
      m.put("header-cell-style", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-row-keys", new String[]{});
      m.put("default-sort", new String[]{});
      m.put("tooltip-effect", new String[]{});
      m.put("tooltip-options", new String[]{});
      m.put("tooltip-formatter", new String[]{});
      m.put("show-summary", new String[]{"true", "false"});
      m.put("sum-text", new String[]{});
      m.put("summary-method", new String[]{});
      m.put("span-method", new String[]{});
      m.put("select-on-indeterminate", new String[]{"true", "false"});
      m.put("table-loading", new String[]{"true", "false"});
      m.put("column-configs", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("├─ gt", new String[]{});
      m.put("├─ estimateHeight", new String[]{});
      m.put("├─ bufferSize", new String[]{});
      m.put("├─ maxYHeight", new String[]{});
      m.put("└─ enabled", new String[]{"true", "false"});
      m.put("virtual-x-config", new String[]{});
      m.put("├─ enabled", new String[]{"true", "false"});
      m.put("└─ bufferSize", new String[]{});
      m.put("tree-config", new String[]{});
      m.put("checkbox-config", new String[]{});
      m.put("menu-config", new String[]{});
      m.put("show-menus", new String[]{"true", "false"});
      m.put("footer-data", new String[]{});
      TAG_CONSTANT.put("b-tree-table", m);
    }

    // b-table-edit（table-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("data", new String[]{});
      m.put("height", new String[]{});
      m.put("max-height", new String[]{});
      m.put("stripe", new String[]{"true", "false"});
      m.put("border", new String[]{"true", "false"});
      m.put("size", new String[]{});
      m.put("fit", new String[]{"true", "false"});
      m.put("show-header", new String[]{"true", "false"});
      m.put("show-overflow", new String[]{});
      m.put("show-header-overflow", new String[]{});
      m.put("highlight-current-row", new String[]{"true", "false"});
      m.put("current-row-key", new String[]{});
      m.put("row-key", new String[]{});
      m.put("row-class-name", new String[]{});
      m.put("row-style", new String[]{});
      m.put("cell-class-name", new String[]{});
      m.put("cell-style", new String[]{});
      m.put("header-row-class-name", new String[]{});
      m.put("header-row-style", new String[]{});
      m.put("header-cell-class-name", new String[]{});
      m.put("header-cell-style", new String[]{});
      m.put("empty-text", new String[]{});
      m.put("default-expand-all", new String[]{"true", "false"});
      m.put("expand-row-keys", new String[]{});
      m.put("default-sort", new String[]{});
      m.put("tooltip-effect", new String[]{});
      m.put("tooltip-options", new String[]{});
      m.put("tooltip-formatter", new String[]{});
      m.put("show-summary", new String[]{"true", "false"});
      m.put("sum-text", new String[]{});
      m.put("summary-method", new String[]{});
      m.put("span-method", new String[]{});
      m.put("select-on-indeterminate", new String[]{"true", "false"});
      m.put("table-loading", new String[]{"true", "false"});
      m.put("column-configs", new String[]{});
      m.put("virtual-y-config", new String[]{});
      m.put("├─ gt", new String[]{});
      m.put("├─ estimateHeight", new String[]{});
      m.put("├─ bufferSize", new String[]{});
      m.put("├─ maxYHeight", new String[]{});
      m.put("└─ enabled", new String[]{"true", "false"});
      m.put("virtual-x-config", new String[]{});
      m.put("├─ enabled", new String[]{"true", "false"});
      m.put("└─ bufferSize", new String[]{});
      m.put("edit-config", new String[]{});
      m.put("keyboard-config", new String[]{});
      m.put("rules", new String[]{});
      TAG_CONSTANT.put("b-table-edit", m);
    }

    // b-list-only（list-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("list-data", new String[]{});
      m.put("loading", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("direction", new String[]{});
      m.put("wrap", new String[]{"true", "false"});
      m.put("fill", new String[]{"true", "false"});
      m.put("space-size", new String[]{});
      m.put("list-item-props", new String[]{});
      m.put("alignment", new String[]{});
      m.put("fill-ratio", new String[]{});
      m.put("space-style", new String[]{});
      TAG_CONSTANT.put("b-list-only", m);
    }

    // b-list-async（list-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("list-data", new String[]{});
      m.put("loading", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("direction", new String[]{});
      m.put("wrap", new String[]{"true", "false"});
      m.put("fill", new String[]{"true", "false"});
      m.put("space-size", new String[]{});
      m.put("list-item-props", new String[]{});
      m.put("alignment", new String[]{});
      m.put("fill-ratio", new String[]{});
      m.put("space-style", new String[]{});
      m.put("input", new String[]{});
      m.put("pagination", new String[]{});
      TAG_CONSTANT.put("b-list-async", m);
    }

    // b-list-report（list-kit）
    {
      LinkedHashMap<String, String[]> m = new LinkedHashMap<>();
      m.put("list-data", new String[]{});
      m.put("loading", new String[]{"true", "false"});
      m.put("height", new String[]{});
      m.put("direction", new String[]{});
      m.put("wrap", new String[]{"true", "false"});
      m.put("fill", new String[]{"true", "false"});
      m.put("space-size", new String[]{});
      m.put("list-item-props", new String[]{});
      m.put("alignment", new String[]{});
      m.put("fill-ratio", new String[]{});
      m.put("space-style", new String[]{});
      TAG_CONSTANT.put("b-list-report", m);
    }
    TAG_SLOTS.put("b-alert", new String[]{"default", "title", "icon"});
    TAG_SLOTS.put("b-anchor", new String[]{"default"});
    TAG_SLOTS.put("b-avatar", new String[]{"default"});
    TAG_SLOTS.put("b-backtop", new String[]{"default"});
    TAG_SLOTS.put("b-badge", new String[]{"default", "content"});
    TAG_SLOTS.put("b-box", new String[]{"default"});
    TAG_SLOTS.put("b-breadcrumb", new String[]{"default"});
    TAG_SLOTS.put("b-button", new String[]{"default", "loading", "icon"});
    TAG_SLOTS.put("b-calendar", new String[]{"date-cell", "header"});
    TAG_SLOTS.put("b-carousel", new String[]{"default"});
    TAG_SLOTS.put("b-cascader", new String[]{"default", "empty", "prefix", "suggestion-item", "tag", "header", "footer"});
    TAG_SLOTS.put("b-checkbox", new String[]{"default"});
    TAG_SLOTS.put("b-collapse", new String[]{"default"});
    TAG_SLOTS.put("b-color-picker-panel", new String[]{"footer"});
    TAG_SLOTS.put("b-config-provider", new String[]{"default"});
    TAG_SLOTS.put("b-date-picker-panel", new String[]{"default", "prev-month", "next-month", "prev-year", "next-year"});
    TAG_SLOTS.put("b-date-picker", new String[]{"default", "range-separator", "prev-month", "next-month", "prev-year", "next-year"});
    TAG_SLOTS.put("b-dialog", new String[]{"default", "header", "footer", "title"});
    TAG_SLOTS.put("b-divider", new String[]{"default"});
    TAG_SLOTS.put("b-drawer", new String[]{"default", "header", "footer", "title"});
    TAG_SLOTS.put("b-dropdown", new String[]{"default", "dropdown"});
    TAG_SLOTS.put("b-empty", new String[]{"default", "image", "description"});
    TAG_SLOTS.put("b-filter-item", new String[]{"default", "label"});
    TAG_SLOTS.put("b-flex-box", new String[]{"item-N / 自定义 tag"});
    TAG_SLOTS.put("b-flex-line", new String[]{"default", "right"});
    TAG_SLOTS.put("b-form", new String[]{"default"});
    TAG_SLOTS.put("b-grid", new String[]{"empty", "toolbar-buttons", "toolbar-tools", "列 slots.default", "列 slots.header / slots.footer"});
    TAG_SLOTS.put("b-icon", new String[]{"default"});
    TAG_SLOTS.put("b-image", new String[]{"placeholder", "error", "\\[image viewer slots\\](#image-viewer-slots)"});
    TAG_SLOTS.put("b-input-number", new String[]{"decrease-icon", "increase-icon", "prefix", "suffix"});
    TAG_SLOTS.put("b-input-tag", new String[]{"tag", "prefix", "suffix"});
    TAG_SLOTS.put("b-input", new String[]{"prefix", "suffix", "prepend", "append", "password-icon"});
    TAG_SLOTS.put("b-link", new String[]{"default", "icon"});
    TAG_SLOTS.put("b-list", new String[]{"item", "empty", "pagination-left"});
    TAG_SLOTS.put("b-menu", new String[]{"default"});
    TAG_SLOTS.put("b-navigation", new String[]{"item", "tool"});
    TAG_SLOTS.put("b-pagination", new String[]{"default"});
    TAG_SLOTS.put("b-panel", new String[]{"default", "title", "tool"});
    TAG_SLOTS.put("b-popconfirm", new String[]{"reference", "actions"});
    TAG_SLOTS.put("b-popover", new String[]{"default", "reference"});
    TAG_SLOTS.put("b-progress", new String[]{"default"});
    TAG_SLOTS.put("b-radio", new String[]{"default"});
    TAG_SLOTS.put("b-scrollbar", new String[]{"default"});
    TAG_SLOTS.put("b-search-select", new String[]{"item", "header", "footer", "loading", "empty"});
    TAG_SLOTS.put("b-search-tree-select", new String[]{"node", "item"});
    TAG_SLOTS.put("b-select-v2", new String[]{"default", "header", "footer", "empty", "prefix", "tag", "loading", "label"});
    TAG_SLOTS.put("b-select", new String[]{"default", "header", "footer", "prefix", "empty", "tag", "loading", "label"});
    TAG_SLOTS.put("b-skeleton", new String[]{"default", "template"});
    TAG_SLOTS.put("b-space", new String[]{"default"});
    TAG_SLOTS.put("b-steps", new String[]{"default"});
    TAG_SLOTS.put("b-switch", new String[]{"active-action", "inactive-action", "active", "inactive"});
    TAG_SLOTS.put("b-tabs", new String[]{"default", "add-icon", "addIcon"});
    TAG_SLOTS.put("b-tag", new String[]{"default"});
    TAG_SLOTS.put("b-text", new String[]{"default"});
    TAG_SLOTS.put("b-timeline", new String[]{"default"});
    TAG_SLOTS.put("b-tool-bar", new String[]{"filter", "tool", "default"});
    TAG_SLOTS.put("b-tooltip", new String[]{"default", "content"});
    TAG_SLOTS.put("b-transfer", new String[]{"default", "left-footer", "right-footer", "left-empty", "right-empty"});
    TAG_SLOTS.put("b-tree-v2", new String[]{"default", "empty"});
    TAG_SLOTS.put("b-tree", new String[]{"default", "empty"});
    TAG_SLOTS.put("b-upload", new String[]{"default", "trigger", "tip", "file"});
    TAG_SLOTS.put("b-watermark", new String[]{"默认"});
    TAG_SLOTS.put("b-anchor-link", new String[]{"default", "sub-link"});
    TAG_SLOTS.put("b-breadcrumb-item", new String[]{"default"});
    TAG_SLOTS.put("b-button-group", new String[]{"default"});
    TAG_SLOTS.put("b-carousel-item", new String[]{"default"});
    TAG_SLOTS.put("b-cascader-panel", new String[]{"default", "empty"});
    TAG_SLOTS.put("b-checkbox-group", new String[]{"default"});
    TAG_SLOTS.put("b-checkbox-button", new String[]{"default"});
    TAG_SLOTS.put("b-collapse-item", new String[]{"default", "title", "icon"});
    TAG_SLOTS.put("b-dropdown-item", new String[]{"default", "icon"});
    TAG_SLOTS.put("b-form-item", new String[]{"default", "label", "error"});
    TAG_SLOTS.put("b-image-viewer", new String[]{"viewer", "progress", "toolbar", "viewer-error"});
    TAG_SLOTS.put("b-row", new String[]{"default"});
    TAG_SLOTS.put("b-col", new String[]{"default"});
    TAG_SLOTS.put("b-sub-menu", new String[]{"default", "title"});
    TAG_SLOTS.put("b-menu-item", new String[]{"default", "title"});
    TAG_SLOTS.put("b-menu-item-group", new String[]{"default", "title"});
    TAG_SLOTS.put("b-radio-group", new String[]{"default"});
    TAG_SLOTS.put("b-radio-button", new String[]{"default"});
    TAG_SLOTS.put("b-option-group", new String[]{"default"});
    TAG_SLOTS.put("b-option", new String[]{"default"});
    TAG_SLOTS.put("b-step", new String[]{"icon", "title", "description"});
    TAG_SLOTS.put("b-tab-pane", new String[]{"default", "label"});
    TAG_SLOTS.put("b-check-tag", new String[]{"default"});
    TAG_SLOTS.put("b-timeline-item", new String[]{"default", "dot"});
    TAG_SLOTS.put("b-table-only", new String[]{"setting", "bottom", "pagination", "empty"});
    TAG_SLOTS.put("b-table-async", new String[]{"setting", "bottom", "pagination", "empty"});
    TAG_SLOTS.put("b-table-report", new String[]{"setting", "bottom", "pagination", "empty"});
    TAG_SLOTS.put("b-tree-table", new String[]{"setting", "bottom", "pagination", "empty"});
    TAG_SLOTS.put("b-table-edit", new String[]{"setting", "bottom", "pagination", "empty"});
    TAG_SLOTS.put("b-list-only", new String[]{"item", "pagination", "empty"});
    TAG_SLOTS.put("b-list-async", new String[]{"item", "pagination", "empty"});
    TAG_SLOTS.put("b-list-report", new String[]{"item", "pagination", "empty"});

    TAG_DIRECTIVES.put("target", new String[]{});
    TAG_DIRECTIVES.put("body", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("fullscreen", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("lock", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("text", new String[]{});
    TAG_DIRECTIVES.put("spinner", new String[]{});
    TAG_DIRECTIVES.put("background", new String[]{});
    TAG_DIRECTIVES.put("customClass", new String[]{});
    TAG_DIRECTIVES.put("svg", new String[]{});
    TAG_DIRECTIVES.put("svgViewBox", new String[]{});
    TAG_DIRECTIVES.put("beforeClose", new String[]{});
    TAG_DIRECTIVES.put("closed", new String[]{});
    TAG_DIRECTIVES.put("v-loading", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("element-loading-text", new String[]{});
    TAG_DIRECTIVES.put("element-loading-spinner", new String[]{});
    TAG_DIRECTIVES.put("element-loading-svg", new String[]{});
    TAG_DIRECTIVES.put("element-loading-svg-view-box", new String[]{});
    TAG_DIRECTIVES.put("element-loading-background", new String[]{});
    TAG_DIRECTIVES.put("element-loading-custom-class", new String[]{});
    TAG_DIRECTIVES.put("v-auto-tip", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("always", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("content", new String[]{});
    TAG_DIRECTIVES.put("effect", new String[]{"dark", "light"});
    TAG_DIRECTIVES.put("placement", new String[]{"top", "top-start", "bottom"});
    TAG_DIRECTIVES.put("popperClass", new String[]{});
    TAG_DIRECTIVES.put("v-highlight-query", new String[]{});
    TAG_DIRECTIVES.put("query", new String[]{});
    TAG_DIRECTIVES.put("className", new String[]{});
    TAG_DIRECTIVES.put("caseSensitive", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("v-infinite-scroll", new String[]{});
    TAG_DIRECTIVES.put("infinite-scroll-disabled", new String[]{"true", "false"});
    TAG_DIRECTIVES.put("infinite-scroll-delay", new String[]{});
    TAG_DIRECTIVES.put("infinite-scroll-distance", new String[]{});
    TAG_DIRECTIVES.put("infinite-scroll-immediate", new String[]{"true", "false"});
    }

    private ElementTagConstant() {}
}
