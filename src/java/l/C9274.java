package l;

/* compiled from: A451 */
/* renamed from: l.ۢ֫۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9274 extends AbstractC9707 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f28082;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9274(C22406 c22406) {
        super(c22406);
        this.f28082 = c22406;
    }

    @Override // l.AbstractC9707
    /* renamed from: ֫ */
    public final C19585 mo22279(C19585 c19585) {
        if (!c19585.m45024() || c19585.m45023(EnumC18879.NON_STATIC)) {
            return c19585;
        }
        return C19585.m45021(new C1781(this.f28082, c19585.f63278, false));
    }

    @Override // l.AbstractC9707
    /* renamed from: ֫ */
    public final C19585 mo22280(C19585 c19585, C19585 c195852) {
        boolean m45024 = c19585.m45024();
        AbstractC5698 abstractC5698 = c19585.f63278;
        if (!m45024 || !abstractC5698.mo15572() || (c195852.m45024() && !c195852.m45023(EnumC18879.STATIC))) {
            boolean m450242 = c195852.m45024();
            AbstractC5698 abstractC56982 = c195852.f63278;
            if (!m450242 || abstractC56982.mo15572() || (c19585.m45024() && !c19585.m45023(EnumC18879.NON_STATIC))) {
                boolean m450243 = c19585.m45024();
                C22406 c22406 = this.f28082;
                if (m450243 && c195852.m45024()) {
                    return C19585.m45021(c22406.m50319(abstractC5698, abstractC56982));
                }
                if (c19585.m45024() || c195852.m45024()) {
                    if (!c19585.m45024()) {
                        abstractC5698 = abstractC56982;
                    }
                    return C19585.m45021(new C1781(c22406, abstractC5698, true));
                }
                if (!c19585.m45022() || c195852.m45022()) {
                }
            }
            return c195852;
        }
        return c19585;
    }
}
