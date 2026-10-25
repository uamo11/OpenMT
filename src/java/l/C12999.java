package l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: T22W */
/* renamed from: l.۬ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12999 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TextClassifier m31570(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
