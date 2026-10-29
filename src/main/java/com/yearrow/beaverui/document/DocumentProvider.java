package com.yearrow.beaverui.document;

import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import com.yearrow.beaverui.xml.ElementTagConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 组件速查文档（Ctrl+Q）：
 * 1. 标签名上 —— 弹出该组件完整 API 表（DocumentConstant 常量）
 * 2. 属性值引号内 —— 弹出该属性的全部可选值清单（TAG_CONSTANT 候选）
 */
public class DocumentProvider extends AbstractDocumentationProvider {
    @Override
    @Nullable
    public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
        if (element instanceof IProperty) {
            return "\"" + renderPropertyValue((IProperty)element) + "\"" + getLocationString(element);
        }
        return null;
    }

    private static String getLocationString(PsiElement element) {
        PsiFile file = element.getContainingFile();
        return file != null ? " [" + file.getName() + "]" : "";
    }

    @NotNull
    private static String renderPropertyValue(IProperty prop) {
        String raw = prop.getValue();
        if (raw == null) {
            return "<i>empty</i>";
        }
        return StringUtil.escapeXml(raw);
    }

    @Override
    public String generateDoc(final PsiElement element, @Nullable final PsiElement originalElement) {
        if (originalElement == null) return null;

        // 分支一：属性值上下文（引号内 / 属性名上）—— 返回该属性可选值清单
        String attrDoc = tryAttributeDoc(originalElement);
        if (attrDoc != null) return attrDoc;

        // 分支二：标签名上下文 —— 返回组件完整 API 文档（原有逻辑）
        String text = originalElement.getText();
        if (text == null) return null;

        String textHandle = text.replaceAll("-", "").replaceAll("\n|\r\n", "");
        Class<?> clazz = DocumentConstant.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (textHandle.equals(field.getName()) && field.getType().toString().endsWith("java.lang.String")) {
                try {
                    return (String) field.get(DocumentConstant.class);
                } catch (IllegalAccessException e) {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * 属性值/属性名上下文的速查文档：
     * 光标位于 b-xxx 标签的某属性（名或值）内时，列出该属性的全部候选值。
     */
    @Nullable
    private static String tryAttributeDoc(PsiElement element) {
        XmlAttribute attribute = PsiTreeUtil.getParentOfType(element, XmlAttribute.class, false);
        if (attribute == null) return null;

        XmlTag tag = PsiTreeUtil.getParentOfType(attribute, XmlTag.class, false);
        if (tag == null) return null;

        String tagName = tag.getName();
        String attrName = attribute.getName();
        HashMap<String, HashMap<String, String[]>> tags = ElementTagConstant.TAG_CONSTANT;
        HashMap<String, String[]> attrs = tags.get(tagName);
        if (attrs == null) return null;
        final String[] values = attrs.get(attrName);
        if (values == null || values.length == 0) return null;

        String tagKey = tagName.startsWith("b-") ? tagName.substring(2) : tagName;
        String site = "https://beaver-ui.yearrow.com/component/" + tagKey;

        StringBuilder sb = new StringBuilder();
        sb.append("<b>").append(StringUtil.escapeXml(tagName)).append("</b> · ")
          .append("<code>").append(StringUtil.escapeXml(attrName)).append("</code> 可选值：");
        sb.append("<table><thead><tr><th>值</th></tr></thead><tbody>");
        for (String v : values) {
            sb.append("<tr><td><code>").append(StringUtil.escapeXml(v)).append("</code></td></tr>");
        }
        sb.append("</tbody></table>");
        sb.append("<br><a href=\"").append(site).append("\" target=\"_blank\">查看组件文档</a>");
        return sb.toString();
    }
}
