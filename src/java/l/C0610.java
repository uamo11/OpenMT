package l;

/* compiled from: F925 */
/* renamed from: l.֡᩵֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0610 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        C5550 c5550;
        C14308 c14308;
        int mo44151 = c19662.mo44151();
        if (mo44151 >= 4) {
            return null;
        }
        int mo44153 = c19662.mo44153();
        CharSequence m38335 = c19662.getLine().m38335();
        int length = m38335.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = mo44153; i3 < length; i3++) {
            char charAt = m38335.charAt(i3);
            if (charAt == '`') {
                i++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i2++;
            }
        }
        if (i < 3 || i2 != 0) {
            if (i2 >= 3 && i == 0) {
                c5550 = new C5550('~', i2, mo44151);
            }
            c5550 = null;
        } else {
            if (C8751.m22635('`', m38335, mo44153 + i) == -1) {
                c5550 = new C5550('`', i, mo44151);
            }
            c5550 = null;
        }
        if (c5550 == null) {
            return null;
        }
        C21073 c21073 = new C21073(c5550);
        c14308 = c5550.f17161;
        c21073.m47974(c14308.m34145().intValue() + mo44153);
        return c21073;
    }
}
