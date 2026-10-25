package l;

/* compiled from: VBIK */
/* renamed from: l.᩷ۢܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C20796 extends EnumC8095 {
    public /* synthetic */ C20796() {
        this("FORMAT_4RCC", 32);
    }

    public C20796(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21514;
        m21487 = EnumC8095.m21487(i);
        if (m21487 != 251) {
            throw new UnsupportedOperationException(String.valueOf(m21487));
        }
        m21514 = EnumC8095.m21514(i);
        int read = interfaceC16186.read();
        int read2 = interfaceC16186.read();
        int read3 = interfaceC16186.read();
        C9838.m24906(m21487);
        return new C21501(this, m21487, read, read2, m21514, read3);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        EnumC8095.m21512(abstractC4193.m12649(), abstractC4193.mo2709());
        int mo2707 = abstractC4193.mo2707();
        if (((-65536) & mo2707) != 0) {
            throw new C0374("Register C out of range: ".concat(C14712.m35004(mo2707)), null);
        }
        abstractC4193.mo12643();
        interfaceC2782.m8592();
    }
}
