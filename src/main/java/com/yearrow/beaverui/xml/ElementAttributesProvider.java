package com.yearrow.beaverui.xml;

import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 标签属性描述：
 * 1. b-* 注册标签 —— 全部属性（TAG_CONSTANT，候选为空时仅属性名补全）+ #插槽伪属性（TAG_SLOTS）
 * 2. 任意标签 —— 追加全局指令（TAG_DIRECTIVES：v-loading / v-auto-tip / v-highlight-query / v-infinite-scroll 及配套属性）
 */
public class ElementAttributesProvider implements XmlAttributeDescriptorsProvider {
    /**
     * 给特定标签添加属性
     * @param xmlTag
     * @return
     */
    @Override
    public XmlAttributeDescriptor[] getAttributeDescriptors(XmlTag xmlTag) {
        final Project project = xmlTag.getProject();
        List<XmlAttributeDescriptor> descriptors = new ArrayList<>();

        // b-* 注册标签：全部属性（含无候选值属性，保证属性名补全完整）
        Map<String, String[]> attrs = ElementTagConstant.TAG_CONSTANT.get(xmlTag.getName());
        if (attrs != null) {
            for (Map.Entry<String, String[]> attr : attrs.entrySet()) {
                descriptors.add(new ElementAttributeDescriptor(project, attr.getKey(), attr.getValue()));
            }
            // #插槽伪属性：<b-panel # + Ctrl+Space 弹出插槽名（Vue 模板 #xxx="scope" 语法）
            String[] slots = ElementTagConstant.TAG_SLOTS.get(xmlTag.getName());
            if (slots != null) {
                for (String slot : slots) {
                    descriptors.add(new ElementAttributeDescriptor(project, "#" + slot, new String[0]));
                }
            }
        }

        // 全局指令及配套属性（任意标签可用，含非注册标签）
        for (Map.Entry<String, String[]> directive : ElementTagConstant.TAG_DIRECTIVES.entrySet()) {
            descriptors.add(new ElementAttributeDescriptor(project, directive.getKey(), directive.getValue()));
        }

        return descriptors.toArray(new XmlAttributeDescriptor[0]);
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(String s, XmlTag xmlTag) {
        return null;
    }
}
