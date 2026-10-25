package l;

/* compiled from: VBIK */
/* renamed from: l.֨ۢܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C1039 extends EnumC8095 {
    public /* synthetic */ C1039() {
        this("FORMAT_22X", 8);
    }

    public C1039(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        m21487 = EnumC8095.m21487(i);
        m21514 = EnumC8095.m21514(i);
        return new C12328(this, m21487, 0, 0, 0L, m21514, interfaceC16186.read());
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2705());
        int mo2706 = abstractC4193.mo2706();
        if (((-65536) & mo2706) == 0) {
            interfaceC2782.m8591();
            return;
        }
        throw new C0374("Register B out of range: ".concat(C14712.m35004(mo2706)), null);
    }
}
