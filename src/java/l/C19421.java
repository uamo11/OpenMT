package l;

/* compiled from: A451 */
/* renamed from: l.᩵ۧ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19421 extends AbstractC18715 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f62824;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C1755 f62825;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f62826;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19421(C22406 c22406, C1755 c1755, boolean z, AbstractC5698 abstractC5698) {
        super(c22406, EnumC1296.f4575, abstractC5698, "invisible class error");
        this.f62826 = c22406;
        this.f62825 = c1755;
        this.f62824 = z;
        this.f17562 = abstractC5698.f17562;
    }

    @Override // l.AbstractC5473
    /* renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        EnumC1296 enumC1296;
        C22406 c22406 = this.f62826;
        C22364 c22364 = c22406.f72598;
        if (this.f62824) {
            return null;
        }
        AbstractC5698 abstractC56982 = this.f59170;
        EnumC1296 enumC12962 = abstractC56982.f17559;
        EnumC1296 enumC12963 = EnumC1296.f4579;
        C1755 c1755 = this.f62825;
        if (enumC12962 == enumC12963) {
            return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "package.not.visible", abstractC56982, c22406.m50324(c1755, abstractC56982.m16089()));
        }
        C16719 m50324 = c22406.m50324(c1755, abstractC56982.m16089());
        if (interfaceC3109.mo9482() != null) {
            AbstractC5144 mo9482 = interfaceC3109.mo9482();
            AbstractC5698 abstractC56983 = abstractC56982;
            while (true) {
                EnumC1296 enumC12964 = abstractC56983.f17559;
                enumC1296 = EnumC1296.f4579;
                if (enumC12964 == enumC1296 || !mo9482.m14709(EnumC18550.f57581)) {
                    break;
                }
                abstractC56983 = abstractC56983.f17561;
                mo9482 = ((C6262) mo9482).f19397;
            }
            if (abstractC56983.f17559 == enumC1296) {
                mo9482.getClass();
                return c22406.f72607.m16619(enumC12986, c22364.m7266(), mo9482, "package.not.visible", abstractC56983, m50324);
            }
        }
        return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "not.def.access.package.cant.access", abstractC56982, abstractC56982.m16089(), m50324);
    }
}
