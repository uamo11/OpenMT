package l;

/* compiled from: VBIK */
/* renamed from: l.֡ۢܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C0333 extends EnumC8095 {
    public /* synthetic */ C0333() {
        this("FORMAT_20T", 6);
    }

    public C0333(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        int m23503 = interfaceC16186.m23503() - 1;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        return new C10212(this, m21487, 0, m23503 + ((short) interfaceC16186.read()), m21514);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        abstractC4193.m12650(interfaceC2782.m23503());
        interfaceC2782.m8591();
    }
}
