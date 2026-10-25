package l;

import java.util.Map;

/* compiled from: I7LP */
/* renamed from: l.ᩳ᩶֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18272 extends AbstractC16860 {

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f56809;

    @Override // l.AbstractC16860
    /* renamed from: ֫ */
    public final AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612) {
        C8379 c8379 = (C8379) this.f51738;
        Map map = this.f51739;
        return new C18272(this.f56809, (C8379) abstractC12612, c1755, c8379, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18272(C5572 c5572, C8379 c8379, C1755 c1755, C8379 c83792, Map map) {
        super(c5572, c8379, c1755, c83792, map);
        this.f56809 = c5572;
    }

    @Override // l.AbstractC16860
    /* renamed from: ۧ */
    public final AbstractC4308 mo18876(C23420 c23420) {
        C9310 c9310;
        C9310 c93102;
        C9310 c93103;
        C5572 c5572 = this.f56809;
        c9310 = c5572.f17262;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC4308 = c23420.f75219;
        c9310.getClass();
        C23420 mo38522 = c23420.mo38522(new C19935(c9310, interfaceC3953));
        AbstractC12612 abstractC12612 = this.f51738;
        C8379 c8379 = (C8379) abstractC12612;
        if (c8379.mo12874()) {
            return mo38522.mo13581(abstractC12612, c8379.f16086);
        }
        if (abstractC4308.m12913(EnumC9454.VOID)) {
            InterfaceC3953 interfaceC39532 = c23420.f75215;
            c93102 = c5572.f17262;
            interfaceC39532.mo1084(this.f4048, c93102.f28210.m16617(C11886.f35443));
            c93103 = c5572.f17262;
            return c93103.f28251.m17535(abstractC4308);
        }
        AbstractC12612 abstractC126122 = c8379.f25699;
        C5572.m15818(abstractC126122, abstractC126122.f16086, mo38522);
        AbstractC12612 abstractC126123 = c8379.f25700;
        C5572.m15818(abstractC126123, abstractC126123.f16086, mo38522);
        return mo38522.f75219;
    }
}
