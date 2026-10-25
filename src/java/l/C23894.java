package l;

/* compiled from: J8YO */
/* renamed from: l.᩻᩵֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23894 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        boolean m18802;
        char charAt;
        int mo44153 = c19662.mo44153();
        m18802 = C6961.m18802((InterfaceC19124) c19662, mo44153);
        if (!m18802) {
            return null;
        }
        int mo44151 = c19662.mo44151() + c19662.mo44150();
        int i = mo44151 + 1;
        CharSequence m38335 = c19662.getLine().m38335();
        int i2 = mo44153 + 1;
        if (i2 < m38335.length() && ((charAt = m38335.charAt(i2)) == '\t' || charAt == ' ')) {
            i = mo44151 + 2;
        }
        C21073 c21073 = new C21073(new C6961());
        c21073.m47971(i);
        return c21073;
    }
}
