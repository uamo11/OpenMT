package l;

/* compiled from: T91K */
/* renamed from: l.ۚۙۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5120 implements InterfaceC4869 {
    @Override // l.InterfaceC4869
    /* renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        C8665 c8665 = (C8665) abstractC0197;
        InterfaceC1592 mo22000 = interfaceC3458.mo10587().m43812().mo22000(C8665.class);
        if (mo22000 == null) {
            interfaceC3458.mo10586(c8665);
            return;
        }
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(c8665);
        if (length == interfaceC3458.length()) {
            interfaceC3458.builder().append((char) 65532);
        }
        C18981 mo10587 = interfaceC3458.mo10587();
        boolean z = c8665.mo1355() instanceof C2315;
        AbstractC11304 m43809 = mo10587.m43809();
        String m22423 = c8665.m22423();
        m43809.getClass();
        InterfaceC14040 mo10583 = interfaceC3458.mo10583();
        AbstractC15203.f46435.m29086(mo10583, m22423);
        AbstractC15203.f46437.m29086(mo10583, Boolean.valueOf(z));
        AbstractC15203.f46436.m29086(mo10583, null);
        interfaceC3458.mo10584(length, mo22000.mo5310(mo10587, mo10583));
    }
}
