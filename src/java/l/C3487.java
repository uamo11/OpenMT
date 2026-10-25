package l;

/* compiled from: VBIK */
/* renamed from: l.ۗ᩷ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C3487 extends EnumC8095 {
    public /* synthetic */ C3487() {
        this("FORMAT_22C", 17);
    }

    public C3487(String str, int i) {
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
        int read = interfaceC16186.read();
        C9838.m24906(m21487);
        return new C12328(this, m21487, read, 0, 0L, m21504, m21519);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int m21509;
        int m12649 = abstractC4193.m12649();
        m21509 = EnumC8095.m21509(abstractC4193.mo2705(), abstractC4193.mo2706());
        EnumC8095.m21512(m12649, m21509);
        interfaceC2782.m8591();
    }
}
