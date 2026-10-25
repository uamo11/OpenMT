package l;

import java.util.NoSuchElementException;

/* compiled from: 97S2 */
/* renamed from: l.ܰۙ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C13598 implements InterfaceC19763 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ char[] f40550;

    @Override // l.InterfaceC19763
    /* renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        int i;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        C11233.m27805(charSequence, "$this$DelimitedRangesSequence");
        C11233.m27805(charSequence, "<this>");
        char[] cArr = this.f40550;
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            i = ((String) charSequence).indexOf(cArr[0], intValue);
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            int m19396 = C7249.m19396(charSequence);
            if (intValue <= m19396) {
                loop0: while (true) {
                    char charAt = charSequence.charAt(intValue);
                    for (char c : cArr) {
                        if (C0899.m3252(c, charAt, false)) {
                            i = intValue;
                            break loop0;
                        }
                    }
                    if (intValue == m19396) {
                        break;
                    }
                    intValue++;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return null;
        }
        return new C15818(Integer.valueOf(i), 1);
    }
}
