package l;

/* compiled from: A451 */
/* renamed from: l.ۛ֫۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5746 extends AbstractC18715 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f17675;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1755 f17676;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f17677;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5746(C22406 c22406, C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(c22406, EnumC1296.f4575, abstractC5698, "access error");
        this.f17677 = c22406;
        this.f17676 = c1755;
        this.f17675 = abstractC4308;
    }

    @Override // l.AbstractC5473
    /* renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        AbstractC4308 abstractC43082;
        AbstractC5698 abstractC56982 = this.f59170;
        AbstractC10370 abstractC103702 = abstractC56982.f17562;
        C22406 c22406 = this.f17677;
        C6136 c6136 = c22406.f72594;
        C22364 c22364 = c22406.f72598;
        if (abstractC103702 == c6136.f18879 && abstractC56982.f17561 != abstractC4308.f13890) {
            return new C8295(c22406, EnumC1296.f4574).mo4076(enumC12986, interfaceC3109, abstractC5698, abstractC4308, abstractC10370, c2609, c26092);
        }
        long mo16084 = abstractC56982.mo16084() & 1;
        C1755 c1755 = this.f17676;
        if (mo16084 == 0 && (c1755 == null || (abstractC43082 = this.f17675) == null || c22406.m50329(c1755, abstractC43082, false))) {
            if ((abstractC56982.mo16084() & 6) != 0) {
                return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "report.access", abstractC56982, C19642.m45150(abstractC56982.mo16084() & 6), abstractC56982.m16072());
            }
            return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "not.def.public.cant.access", abstractC56982, abstractC56982.m16072());
        }
        if (abstractC56982.f17561.f17559 == EnumC1296.f4579) {
            return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "not.def.access.package.cant.access", abstractC56982, abstractC56982.m16072(), c22406.m50324(c1755, abstractC56982.m16089()));
        }
        if (abstractC56982.m16089() != c22406.f72605.f66473) {
            C0052 c0052 = c1755.f6075.f4739;
            C7814 m16089 = abstractC56982.m16089();
            if (c0052 != m16089.f24147 && !c0052.f913.containsKey(m16089.f24143)) {
                return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "not.def.access.class.intf.cant.access.reason", abstractC56982, abstractC56982.m16072(), abstractC56982.m16072().m16089(), c22406.m50324(c1755, abstractC56982.m16089()));
            }
        }
        return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "not.def.access.class.intf.cant.access", abstractC56982, abstractC56982.m16072());
    }
}
