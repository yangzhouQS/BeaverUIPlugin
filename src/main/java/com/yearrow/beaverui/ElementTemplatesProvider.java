package com.yearrow.beaverui;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

/**
 * 用于展示代码模板
 */
public class ElementTemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        /* 关联 beaver.xml（b-* 模板；element.xml 保留原始 fork 参考，不再注册） */
        return new String[]{"beaver"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
