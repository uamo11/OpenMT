package l;

/* compiled from: A451 */
/* renamed from: l.ܳۧ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14480 extends C6720 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f44366;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f44367;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14480(C22406 c22406, AbstractC5698 abstractC5698, C12364 c12364) {
        super(c22406, abstractC5698.f17559, "diamondError", c12364);
        this.f44366 = c22406;
        this.f44367 = abstractC5698;
    }

    @Override // l.C6720, l.AbstractC5473
    /* renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        boolean z;
        C16719 m6407;
        AbstractC5698 abstractC56982 = this.f44367;
        C16719 c16719 = abstractC56982.f17559 == EnumC1296.f4580 ? (C16719) ((C6720) abstractC56982.mo7048()).mo1315().f74208 : null;
        C22406 c22406 = this.f44366;
        if (c16719 != null) {
            z = c22406.f72577;
            if (z && (m6407 = C1945.m6407(c22406.f72607, interfaceC3109, c22406.f72598.m7266(), enumC12986, c16719)) != null) {
                return m6407;
            }
        }
        String str = c16719 == null ? "cant.apply.diamond" : "cant.apply.diamond.1";
        C5931 c5931 = c22406.f72607;
        C14397 m7266 = c22406.f72598.m7266();
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        C11576 c11576 = C11886.f35440;
        return c5931.m16619(enumC12986, m7266, interfaceC3109, str, new C11576("compiler", "diamond", abstractC19810), c16719);
    }
}
