package l;

/* compiled from: VBIK */
/* renamed from: l.᩸᩷ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C21832 extends EnumC8095 {
    public /* synthetic */ C21832() {
        this("FORMAT_23X", 13);
    }

    public C21832(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        int m214872;
        int m215142;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        int read = interfaceC16186.read();
        m214872 = EnumC8095.m21487(read);
        m215142 = EnumC8095.m21514(read);
        return new C13033(this, m21487, 0, m21514, m214872, m215142);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        EnumC8095.m21512(abstractC4193.mo2706(), abstractC4193.mo2707());
        interfaceC2782.m8591();
    }
}
