package l;

/* compiled from: VBIK */
/* renamed from: l.ܰ᩷ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C14069 extends EnumC8095 {
    public /* synthetic */ C14069() {
        this("FORMAT_31C", 23);
    }

    public C14069(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        int readInt = interfaceC16186.readInt();
        C9838.m24906(m21487);
        return new C22206(this, m21487, readInt, 0, 0L, m21514);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int m12648 = abstractC4193.m12648();
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        EnumC8095.m21520(m12648);
        EnumC8095.m21516(m12648);
        interfaceC2782.m8589();
    }
}
