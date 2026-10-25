package l;

/* compiled from: 48Z0 */
/* renamed from: l.ۜ֡֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6402 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        if (c19662.mo44151() >= 4) {
            return null;
        }
        CharSequence m38335 = c19662.getLine().m38335();
        int length = m38335.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int mo44153 = c19662.mo44153(); mo44153 < length; mo44153++) {
            char charAt = m38335.charAt(mo44153);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i3++;
                } else if (charAt == '-') {
                    i++;
                } else {
                    if (charAt != '_') {
                        return null;
                    }
                    i2++;
                }
            }
        }
        if ((i < 3 || i2 != 0 || i3 != 0) && ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0))) {
            return null;
        }
        String.valueOf(m38335.subSequence(c19662.getIndex(), m38335.length()));
        C21073 c21073 = new C21073(new C20514());
        c21073.m47974(m38335.length());
        return c21073;
    }
}
