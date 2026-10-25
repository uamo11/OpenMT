package l;

import android.text.TextWatcher;

/* compiled from: V7S3 */
/* renamed from: l.ܰܽܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13945 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33386(TextWatcher textWatcher, CharSequence charSequence, int i, int i2, int i3) {
        int length = (charSequence.length() - i3) + i2;
        int length2 = charSequence.length();
        int min = Math.min(length, 100000);
        int min2 = Math.min(length2, 100000);
        if (i >= 100000) {
            return;
        }
        int min3 = Math.min(i2, min - i);
        int min4 = Math.min(i3, 100000 - i);
        int i4 = (min - min3) + min4;
        C4774 c4774 = (C4774) textWatcher;
        c4774.onTextChanged(new C23118(i4, charSequence), i, min3, min4);
        if (min2 == i4) {
            return;
        }
        if (min2 > i4) {
            c4774.onTextChanged(new C23118(min2, charSequence), i4, 0, min2 - i4);
        } else {
            c4774.onTextChanged(new C23118(min2, charSequence), min2, i4 - min2, 0);
        }
    }
}
