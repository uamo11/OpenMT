package l;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* compiled from: WB13 */
/* renamed from: l.ۗ֫֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2919 implements InterfaceC18022 {
    @Override // l.InterfaceC18022
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3746 mo8914(View view, C3746 c3746) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            C11003.toString(c3746);
        }
        if (c3746.m11374() == 2) {
            return c3746;
        }
        ClipData m11372 = c3746.m11372();
        int m11373 = c3746.m11373();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m11372.getItemCount(); i++) {
            ClipData.Item itemAt = m11372.getItemAt(i);
            if ((m11373 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
