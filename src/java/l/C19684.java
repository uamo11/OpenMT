package l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: I7LP */
/* renamed from: l.᩵᩶֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19684 extends AbstractC16860 {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C16646 f63594;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f63595;

    @Override // l.AbstractC16860
    /* renamed from: ֫ */
    public final AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612) {
        C13464 c13464 = (C13464) this.f51738;
        Map map = this.f51739;
        return new C19684(this.f63595, (C13464) abstractC12612, c1755, c13464, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19684(C5572 c5572, C13464 c13464, C1755 c1755, C13464 c134642, Map map) {
        super(c5572, c13464, c1755, c134642, map);
        this.f63595 = c5572;
        this.f63594 = C16646.empty();
    }

    @Override // l.AbstractC16860
    /* renamed from: ۧ */
    public final AbstractC4308 mo18876(C23420 c23420) {
        C9310 c9310;
        C9310 c93102;
        C9310 c93103;
        C5572 c5572 = this.f63595;
        c9310 = c5572.f17262;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        c9310.getClass();
        C23420 mo38522 = c23420.mo38522(new C19935(c9310, interfaceC3953));
        AbstractC4308 abstractC4308 = c23420.f75219;
        if (abstractC4308.m12913(EnumC9454.VOID)) {
            InterfaceC3953 interfaceC39532 = c23420.f75215;
            c93102 = c5572.f17262;
            interfaceC39532.mo1084(this.f4048, c93102.f28210.m16617(C11886.f35459));
            c93103 = c5572.f17262;
            return c93103.f28251.m17535(abstractC4308);
        }
        Iterator it = ((C2609) this.f63594.orElseGet(new Supplier() { // from class: l.ۘ᩶֨
            @Override // java.util.function.Supplier
            public final Object get() {
                C18837 c18837 = new C18837();
                C19684 c19684 = C19684.this;
                new C18978(c19684, c18837).m33860(((C13464) c19684.f51738).f40199);
                C2609 m43517 = c18837.m43517();
                c19684.f63594 = C16646.of(m43517);
                return m43517;
            }
        })).iterator();
        while (it.hasNext()) {
            AbstractC12612 abstractC12612 = ((C2322) it.next()).f7456;
            C5572.m15818(abstractC12612, abstractC12612.f16086, c23420);
        }
        return mo38522.f75219;
    }
}
