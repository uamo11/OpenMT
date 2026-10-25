package l;

/* compiled from: J8YO */
/* renamed from: l.ۜ᩵֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6961 extends AbstractC8540 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22630 f21456 = new C22630();

    @Override // l.InterfaceC2190
    /* renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f21456;
    }

    @Override // l.InterfaceC2190
    /* renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        char charAt;
        int mo44153 = interfaceC19124.mo44153();
        if (!m18802(interfaceC19124, mo44153)) {
            return null;
        }
        int mo44151 = interfaceC19124.mo44151() + interfaceC19124.mo44150();
        int i = mo44151 + 1;
        CharSequence m38335 = interfaceC19124.getLine().m38335();
        int i2 = mo44153 + 1;
        if (i2 < m38335.length() && ((charAt = m38335.charAt(i2)) == '\t' || charAt == ' ')) {
            i = mo44151 + 2;
        }
        return new C14721(-1, i, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18802(InterfaceC19124 interfaceC19124, int i) {
        CharSequence m38335 = interfaceC19124.getLine().m38335();
        return interfaceC19124.mo44151() < 4 && i < m38335.length() && m38335.charAt(i) == '>';
    }
}
