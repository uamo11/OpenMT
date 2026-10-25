package l;

import java.io.StringWriter;
import java.lang.reflect.Array;

/* compiled from: 62DG */
/* renamed from: l.۟ۘ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7212 extends AbstractC21052 {
    @Override // l.AbstractC21052
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19297(CharSequence charSequence, StringWriter stringWriter) {
        char[] cArr;
        String str;
        String str2;
        boolean z = false;
        if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
            stringWriter.write(charSequence.toString());
            return;
        }
        String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
        cArr = C2001.f6695;
        if (!C9679.m24615((CharSequence) charSequence2)) {
            if (!((cArr == null ? 0 : Array.getLength(cArr)) == 0)) {
                int length = charSequence2.length();
                int length2 = cArr.length;
                int i = length - 1;
                int i2 = length2 - 1;
                loop0: for (int i3 = 0; i3 < length; i3++) {
                    char charAt = charSequence2.charAt(i3);
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (cArr[i4] == charAt && (!Character.isHighSurrogate(charAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == charSequence2.charAt(i3 + 1)))) {
                            z = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        if (z) {
            str = C2001.f6693;
            str2 = C2001.f6694;
            stringWriter.write(C9679.m24611(charSequence2, str, str2));
            return;
        }
        stringWriter.write(charSequence.toString());
    }
}
