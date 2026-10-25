package l;

/* compiled from: 73Q2 */
/* renamed from: l.֨ۜܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0956 extends AbstractC15772 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21685 f3599;

    @Override // l.AbstractC2368
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo3385() {
        return 8;
    }

    public C0956(C21685 c21685) {
        this.f3599 = c21685;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        c1662.m5622().m21325(this.f3599);
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        int m3383 = m3383(c1662);
        C21685 c21685 = this.f3599;
        int m48965 = c21685.m48965();
        if (c18241.m42506()) {
            c18241.m42501(0, m37189() + ' ' + c21685.toString());
            c18241.m42501(2, "type:     " + C14712.m35006(m48965) + (" // " + C21685.m48962(m48965)));
            c18241.m42501(2, "reserved: ".concat(C14712.m35006(0)));
            String str = " // " + c21685.m48966().toString();
            if (c21685.m48967()) {
                c18241.m42501(2, "fieldId:  " + C14712.m35006(m3383) + str);
            } else {
                c18241.m42501(2, "methodId: " + C14712.m35006(m3383) + str);
            }
            c18241.m42501(2, "reserved: ".concat(C14712.m35006(0)));
        }
        c18241.m42511(m48965);
        c18241.m42511(0);
        c18241.m42511(m3383(c1662));
        c18241.m42511(0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m3383(C1662 c1662) {
        C21685 c21685 = this.f3599;
        AbstractC13717 m48966 = c21685.m48966();
        if (c21685.m48967()) {
            return c1662.m5626().m18102((C8985) m48966);
        }
        if (c21685.m48964()) {
            if (m48966 instanceof C4046) {
                m48966 = ((C4046) m48966).m12144();
            }
            return c1662.m5627().m48538((AbstractC16745) m48966);
        }
        throw new IllegalStateException("Unhandled invocation type");
    }
}
