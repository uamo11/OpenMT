package l;

/* compiled from: VBIK */
/* renamed from: l.ۛ᩷ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C6309 extends EnumC8095 {
    public /* synthetic */ C6309() {
        this("FORMAT_32X", 20);
    }

    public C6309(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        return new C12328(this, m21487, 0, 0, m21514, interfaceC16186.read(), interfaceC16186.read());
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        abstractC4193.getClass();
        int mo2705 = abstractC4193.mo2705();
        if ((mo2705 & (-65536)) != 0) {
            throw new C0374("Register A out of range: ".concat(C14712.m35004(mo2705)), null);
        }
        int mo2706 = abstractC4193.mo2706();
        if ((mo2706 & (-65536)) != 0) {
            throw new C0374("Register B out of range: ".concat(C14712.m35004(mo2706)), null);
        }
        interfaceC2782.m8589();
    }
}
