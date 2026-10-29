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
import com.intellij.psi.xml.XmlAttributeValue;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.NotNull;

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
        PsiFile file = PsiDocumentManager.getInstance(project).getPsiFile(editor.getDocument());
        if (file == null) return;
        PsiElement element = file.findElementAt(caret.getOffset());
        if (element == null) return;

        XmlAttribute attribute = PsiTreeUtil.getParentOfType(element, XmlAttribute.class, false);
        if (attribute == null) return;
        XmlTag tag = PsiTreeUtil.getParentOfType(attribute, XmlTag.class, false);
        if (tag == null) return;

        String tagName = tag.getName();
        String attrName = attribute.getName();
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

    /** 把选中的值写入属性值引号内（无引号则补全引号） */
    private static void insertValue(Editor editor, XmlAttribute attribute, String value) {
        XmlAttributeValue valueEl = attribute.getValueElement();
        Document document = editor.getDocument();

        int start;
        int end;
        if (valueEl != null) {
            TextRange full = valueEl.getTextRange();
            start = full.getStartOffset() + 1;
            end = Math.max(full.getEndOffset() - 1, start);
        } else {
            // 无值引号（type=""）：定位到引号之间
            int attrStart = attribute.getTextOffset();
            String text = attribute.getText();
            int inner = text.indexOf('"');
            if (inner < 0) {
                // 属性无引号：补全引号
                int caret = editor.getCaretModel().getOffset();
                start = caret;
                end = caret;
                document.insertString(start, "\"" + value + "\"");
                editor.getCaretModel().moveToOffset(start + value.length() + 1);
                return;
            } else {
                start = attrStart + inner + 1;
                int close = text.indexOf('"', inner + 1);
                end = close >= 0 ? attrStart + close : start;
            }
        }

        document.replaceString(start, end, value);
        editor.getCaretModel().moveToOffset(start + value.length());
    }
}
