package l;

/* compiled from: 542M */
/* renamed from: l.᩵۬֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19476 extends C1386 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f62968;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f62969;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f62970;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f62971;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19476(C15240 c15240, InterfaceC3109 interfaceC3109, String str, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        super(interfaceC3109);
        this.f62968 = c15240;
        this.f62971 = str;
        this.f62969 = abstractC4308;
        this.f62970 = abstractC43082;
    }

    @Override // l.C1386
    /* renamed from: ᩳ */
    public final void mo4874(EnumC20347 enumC20347) {
        C5931 c5931;
        C3581 c3581;
        C3581 c35812;
        C20661 c20661;
        C3581 c35813;
        boolean m36086;
        C6319 c6319;
        C3581 c35814;
        C3581 c35815;
        super.mo4874(enumC20347);
        int i = C2542.f8064[enumC20347.ordinal()];
        C15240 c15240 = this.f62968;
        if (i == 1) {
            InterfaceC3109 m4871 = m4871();
            c5931 = c15240.f46768;
            C16719 m16622 = c5931.m16622(this.f62971, new Object[0]);
            C11076 c11076 = C14001.f42334;
            c15240.m36178(m4871, new C11076("compiler", "prob.found.req", m16622, this.f62969, this.f62970));
            return;
        }
        if (i == 2) {
            c3581 = c15240.f46767;
            if (c3581 != null) {
                c35812 = c15240.f46767;
                c20661 = c15240.f46770;
                if (c35812.m16065((AbstractC5698) c20661.f66504.f13890) != null) {
                    c35813 = c15240.f46767;
                    m36086 = c15240.m36086(c35813);
                    if (m36086) {
                        c6319 = c15240.f46788;
                        c35814 = c15240.f46767;
                        if (c6319.m17477((AbstractC4308) c35814.f17560.mo12933().last())) {
                            return;
                        }
                        InterfaceC3109 m48712 = m4871();
                        c35815 = c15240.f46767;
                        AbstractC5698 abstractC5698 = (AbstractC5698) c35815.f11367.last();
                        C11076 c110762 = C14001.f42334;
                        c15240.m36191(m48712, new C11076("compiler", "varargs.unsafe.use.varargs.param", abstractC5698));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError("Unexpected lint: " + enumC20347);
    }
}
