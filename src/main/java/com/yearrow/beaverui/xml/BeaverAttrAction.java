package com.yearrow.beaverui.xml;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.ui.popup.PopupChooserBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 属性候选快捷入口（默认快捷键 Ctrl+Alt+Q）：
 * 光标位于 b-* 标签的属性（名/值/空引号内）时，弹出该属性全部候选值，
 * 选中后直接插入到属性值引号内——弥补空引号内 Ctrl+Q 无元素可文档化的问题。
 */
public class BeaverAttrAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        Editor editor = e.getData(CommonDataKeys.EDITOR);
        if (project == null || editor == null) return;

        Caret caret = editor.getCaretModel().getCurrentCaret();

        // 路径一：XML PSI 解析（标准 .html / .vue 模板段）
        PsiFile file = PsiDocumentManager.getInstance(project).getPsiFile(editor.getDocument());
        if (file != null) {
            PsiElement element = file.findElementAt(caret.getOffset());
            if (element != null) {
                XmlAttribute attribute = PsiTreeUtil.getParentOfType(element, XmlAttribute.class, false);
                XmlTag tag = attribute != null ? PsiTreeUtil.getParentOfType(attribute, XmlTag.class, false) : null;
                if (attribute != null && tag != null) {
                    showCandidates(editor, tag.getName(), attribute.getName(), attribute);
                    return;
                }
            }
        }

        // 路径二：文本级兜底（Vue/其他模板 PSI 结构差异时仍可用）——
        // 从光标向前扫描本标签起始标签，解析出标签名与光标所在属性名
        fallbackByText(editor, caret.getOffset());
    }

    /** 文本兜底：定位光标所在标签与属性（不依赖 PSI） */
    private static void fallbackByText(Editor editor, int offset) {
        CharSequence text = editor.getDocument().getCharsSequence();
        // 向前找 '<'（标签开始），途中越过当前属性段
        int lt = -1;
        for (int i = offset - 1; i >= 0 && i >= offset - 3000; i--) {
            char c = text.charAt(i);
            if (c == '>') break;            // 越过上一个标签，放弃
            if (c == '<' && i + 1 < text.length() && text.charAt(i + 1) != '/' && text.charAt(i + 1) != '!') { lt = i; break; }
        }
        if (lt < 0) return;
        // 标签名
        int p = lt + 1;
        StringBuilder tagName = new StringBuilder();
        while (p < text.length() && !Character.isWhitespace(text.charAt(p)) && text.charAt(p) != '>' && text.charAt(p) != '/') {
            tagName.append(text.charAt(p));
            p++;
        }
        String tag = tagName.toString();
        HashMap<String, HashMap<String, String[]>> tags = ElementTagConstant.TAG_CONSTANT;
        HashMap<String, String[]> attrs = tags.get(tag);
        if (attrs == null) return;
        // 从标签名后到光标，取最后一个完整/进行中的属性名
        int attrStart = -1;
        boolean inAttr = false;
        StringBuilder attrName = new StringBuilder();
        for (int i = p; i < Math.min(offset + 1, text.length()); i++) {
            char c = text.charAt(i);
            if (c == '=' || Character.isWhitespace(c)) {
                if (attrName.length() > 0) { inAttr = true; }
                continue;
            }
            if (c == '"' || c == '\'') {
                // 进入值区：若此时尚无属性名则失败
                if (attrName.length() == 0) return;
                inAttr = true;
                continue;
            }
            if ((c == '-' || c == '_' || c == ':' || Character.isLetterOrDigit(c))) {
                if (!inAttr) attrName.append(c);
                continue;
            }
            if (c == '>') return;
        }
        String attr = attrName.toString();
        if (attr.isEmpty()) return;
        final String[] values = attrs.get(attr);
        if (values == null || values.length == 0) return;
        showCandidates(editor, tag, attr, null);
    }

    /** 弹候选并插入（attribute 为 null 时用文本方式写值） */
    private static void showCandidates(Editor editor, String tagName, String attrName, @Nullable XmlAttribute attribute) {
        HashMap<String, HashMap<String, String[]>> tags = ElementTagConstant.TAG_CONSTANT;
        HashMap<String, String[]> attrs = tags.get(tagName);
        if (attrs == null) return;
        final String[] values = attrs.get(attrName);
        if (values == null || values.length == 0) return;

        PopupChooserBuilder<String> builder = (PopupChooserBuilder<String>) JBPopupFactory.getInstance()
                .createPopupChooserBuilder(Arrays.asList(values))
                .setTitle("b-" + tagName + " · " + attrName + " 可选值")
                .setItemChosenCallback((selectedValue) -> insertValue(editor, attribute, selectedValue));
        JBPopup popup = builder.createPopup();
        popup.showInBestPositionFor(editor);
    }

    /** 把选中的值写入属性值引号内（attribute 为 null 时按文本方式定位引号） */
    private static void insertValue(Editor editor, XmlAttribute attribute, String value) {
        Document document = editor.getDocument();
        int caret = editor.getCaretModel().getOffset();

        int start;
        int end;
        if (attribute != null && attribute.getValueElement() != null) {
            TextRange full = attribute.getValueElement().getTextRange();
            start = full.getStartOffset() + 1;
            end = Math.max(full.getEndOffset() - 1, start);
        } else if (attribute != null) {
            int attrStart = attribute.getTextOffset();
            String text = attribute.getText();
            int inner = text.indexOf('"');
            if (inner < 0) {
                start = caret; end = caret;
            } else {
                start = attrStart + inner + 1;
                int close = text.indexOf('"', inner + 1);
                end = close >= 0 ? attrStart + close : start;
            }
        } else {
            // 文本兜底：从光标向两侧找最近的引号对
            CharSequence text = document.getCharsSequence();
            int open = -1;
            for (int i = caret - 1; i >= 0; i--) {
                char c = text.charAt(i);
                if (c == '"') { open = i; break; }
                if (c == '>' || c == '<') break;
            }
            if (open < 0) { start = caret; end = caret; }
            else {
                start = open + 1;
                int close = -1;
                for (int i = open + 1; i < text.length(); i++) {
                    if (text.charAt(i) == '"') { close = i; break; }
                }
                end = close >= 0 ? close : start;
            }
        }

        document.replaceString(start, end, value);
        editor.getCaretModel().moveToOffset(start + value.length());
    }
}
