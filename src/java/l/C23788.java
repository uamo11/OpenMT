package l;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* compiled from: K51P */
/* renamed from: l.᩻ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23788 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StaticLayout m52463(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C9678 c9678) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            c9678.mo18541(obtain, textView);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }
}
