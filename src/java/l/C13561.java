package l;

import java.io.StringWriter;

/* compiled from: 62DG */
/* renamed from: l.ܰۘ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13561 extends AbstractC21052 {
    @Override // l.AbstractC21052
    /* renamed from: ֫ */
    public final void mo19297(CharSequence charSequence, StringWriter stringWriter) {
        char[] cArr;
        String str;
        String str2;
        String charSequence2 = charSequence.toString();
        cArr = C2001.f6695;
        if (charSequence2 != null && cArr != null) {
            int length = charSequence2.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence2.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt && (!Character.isHighSurrogate(charAt) || i4 == i2 || (i3 < i && cArr[i4 + 1] == charSequence2.charAt(i3 + 1)))) {
                        stringWriter.write(34);
                        str = C2001.f6694;
                        str2 = C2001.f6693;
                        stringWriter.write(C9679.m24611(charSequence2, str, str2));
                        stringWriter.write(34);
                        return;
                    }
                }
            }
        }
        stringWriter.write(charSequence2);
    }
}
