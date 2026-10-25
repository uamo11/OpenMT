package l;

/* compiled from: VBIK */
/* renamed from: l.۠᩷ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C8426 extends EnumC8095 {
    public /* synthetic */ C8426() {
        this("FORMAT_21H", 11);
    }

    public C8426(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        return new C22206(this, m21487, 0, 0, ((short) interfaceC16186.read()) << (m21487 == 21 ? (char) 16 : '0'), m21514);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        interfaceC2782.m8591();
    }
}
