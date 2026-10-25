package l;

/* compiled from: VBIK */
/* renamed from: l.ۘۢܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C3862 extends EnumC8095 {
    public /* synthetic */ C3862() {
        this("FORMAT_11N", 3);
    }

    public C3862(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21504;
        int m21519;
        m21487 = EnumC8095.m21487(i);
        m21504 = EnumC8095.m21504(i);
        m21519 = EnumC8095.m21519(i);
        return new C22206(this, m21487, 0, 0, (m21519 << 28) >> 28, m21504);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int m21509;
        short m12642 = abstractC4193.m12642();
        m21509 = EnumC8095.m21509(abstractC4193.mo2705(), abstractC4193.m12646());
        EnumC8095.m21512(m12642, m21509);
        interfaceC2782.m8586();
    }
}
