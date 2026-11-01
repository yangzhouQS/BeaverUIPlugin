package com.yearrow.beaverui.xml;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * TSX/JSX（Vue JSX）中的 b-* 补全：标签名 / 属性名 / 属性值。
 * XML 系扩展点（tagNameProvider/attributeDescriptors）不作用于 JSX 语法树，
 * 此处以文本启发式实现：在 TypeScript/JavaScript 语言域按光标前文本判定场景。
 */
public class BeaverJsxCompletionContributor extends CompletionContributor implements DumbAware {

    public BeaverJsxCompletionContributor() {
        // 全场景经 fillCompletionVariants 文本启发式处理（不依赖 JSX PSI pattern，
        // 规避 Vue JSX 与标准 JSX PSI 的结构差异）
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
        try {
            Document document = parameters.getEditor().getDocument();
            int offset = parameters.getOffset();
            CharSequence text = document.getCharsSequence();

            // 光标前最近一段 JSX 片段（截到上一个 '>' 或换行外的大括号闭合）
            int lineStart = 0;
            for (int i = offset - 1; i >= 0 && i >= offset - 400; i--) {
                char ch = text.charAt(i);
                if (ch == '>' || ch == '{' || ch == '}') { lineStart = i + 1; break; }
            }
            String prefixAll = text.subSequence(lineStart, offset).toString();

            // 场景一：标签名——形如 <b-bu（< 后跟 b- 前缀标识符）
            int lt = prefixAll.lastIndexOf('<');
            if (lt >= 0) {
                String afterLt = prefixAll.substring(lt + 1);
                if (afterLt.matches("b[\\w-]*") && !afterLt.contains(" ") && !prefixAll.substring(0, lt).trim().endsWith("=")) {
                    for (String tag : ElementTagConstant.TAG_CONSTANT.keySet()) {
                        result.addElement(LookupElementBuilder.create(tag));
                    }
                    return;
                }
            }

            // 定位光标所属标签名（属性名/属性值场景需要）
            String tagName = findEnclosingTag(text, offset);
            if (tagName == null) return;
            HashMap<String, String[]> attrs = ElementTagConstant.TAG_CONSTANT.get(tagName);
            if (attrs == null) return;

            // 场景二：属性名——光标在标签开区内、正在敲标识符（不含 = 或引号）
            if (isInTagOpen(text, offset, tagName)) {
                String seg = prefixAll;
                boolean typingAttr = !seg.contains("=") && !seg.contains("\"") && !seg.contains("'");
                if (typingAttr) {
                    for (String attr : attrs.keySet()) {
                        result.addElement(LookupElementBuilder.create(attr));
                    }
                    return;
                }
                // 场景三：属性值——光标在某属性的双引号内
                int q = lastUnmatchedOpenQuote(text, lineStart, offset);
                if (q >= 0) {
                    String attrName = attrNameBefore(text, lineStart, q);
                    if (attrName != null) {
                        String[] values = attrs.get(attrName);
                        if (values != null) {
                            for (String v : values) {
                                result.addElement(LookupElementBuilder.create(v));
                            }
                        }
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }

    /** 向前找未闭合标签的标签名（文本扫描） */
    private static String findEnclosingTag(CharSequence text, int offset) {
        for (int i = offset - 1; i >= 0 && i >= offset - 2000; i--) {
            char ch = text.charAt(i);
            if (ch == '>') return null; // 已离开标签开区
            if (ch == '<' && i + 1 < text.length()) {
                StringBuilder name = new StringBuilder();
                int j = i + 1;
                while (j < text.length()) {
                    char c = text.charAt(j);
                    if (Character.isLetterOrDigit(c) || c == '-') { name.append(c); j++; }
                    else break;
                }
                String n = name.toString();
                return ElementTagConstant.TAG_CONSTANT.containsKey(n) ? n : null;
            }
        }
        return null;
    }

    /** 光标是否仍在该标签的开标签内（未遇 '>'） */
    private static boolean isInTagOpen(CharSequence text, int offset, String tagName) {
        for (int i = offset - 1; i >= 0 && i >= offset - 2000; i--) {
            char ch = text.charAt(i);
            if (ch == '>') return false;
            if (ch == '<') {
                StringBuilder name = new StringBuilder();
                int j = i + 1;
                while (j < text.length()) {
                    char c = text.charAt(j);
                    if (Character.isLetterOrDigit(c) || c == '-') { name.append(c); j++; }
                    else break;
                }
                return name.toString().equals(tagName);
            }
        }
        return false;
    }

    /** 段内最后一个未闭合双引号位置（-1 无） */
    private static int lastUnmatchedOpenQuote(CharSequence text, int from, int to) {
        int open = -1;
        for (int i = from; i < to; i++) {
            char ch = text.charAt(i);
            if (ch == '"') {
                if (open >= 0) open = -1; // 闭合
                else open = i;
            }
        }
        return open;
    }

    /** 引号前的属性名（attrName=" 的 attrName） */
    private static String attrNameBefore(CharSequence text, int from, int quoteAt) {
        int i = quoteAt - 1;
        while (i >= from && Character.isWhitespace(text.charAt(i))) i--;
        if (i >= from && text.charAt(i) == '=') i--;
        while (i >= from && Character.isWhitespace(text.charAt(i))) i--;
        StringBuilder name = new StringBuilder();
        while (i >= from) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '-' || c == ':') { name.insert(0, c); i--; }
            else break;
        }
        return name.length() > 0 ? name.toString() : null;
    }
}
