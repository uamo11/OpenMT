package l;

import java.io.StringWriter;

/* compiled from: Q2DX */
/* renamed from: l.۫ۘ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12151 extends AbstractC11446 {
    @Override // l.AbstractC11446
    /* renamed from: ֫ */
    public final int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) {
        if (i != 0) {
            throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
        }
        String charSequence2 = charSequence.toString();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = charSequence2.indexOf(92, i2);
            if (indexOf == -1) {
                break;
            }
            if (indexOf > i3) {
                stringWriter.write(charSequence2.substring(i3, indexOf));
            }
            i3 = indexOf + 1;
            i2 = indexOf + 2;
        }
        if (i3 < charSequence2.length()) {
            stringWriter.write(charSequence2.substring(i3));
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
