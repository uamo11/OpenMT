package l;

/* compiled from: VBIK */
/* renamed from: l.᩺᩷ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C23242 extends EnumC8095 {
    public /* synthetic */ C23242() {
        this("FORMAT_31T", 22);
    }

    public C23242(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        int m23503 = interfaceC16186.m23503() - 1;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        int readInt = interfaceC16186.readInt() + m23503;
        if (m21487 == 43 || m21487 == 44) {
            interfaceC16186.m23504();
        }
        return new C22206(this, m21487, 0, readInt, 0L, m21514);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int m12641 = abstractC4193.m12641(interfaceC2782.m23503());
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        EnumC8095.m21520(m12641);
        EnumC8095.m21516(m12641);
        interfaceC2782.m8589();
    }
}
