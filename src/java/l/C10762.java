package l;

import java.util.function.Predicate;

/* compiled from: F416 */
/* renamed from: l.ۧۙ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C10762 implements Predicate {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f32404;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32405 = 1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32406;

    public /* synthetic */ C10762(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        this.f32404 = abstractC4308;
        this.f32406 = abstractC43082;
    }

    public /* synthetic */ C10762(C9310 c9310, AbstractC4308 abstractC4308) {
        this.f32406 = c9310;
        this.f32404 = abstractC4308;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f32405) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f32405) {
            case 0:
                C6319 c6319 = ((C9310) this.f32406).f28251;
                return c6319.m17531((AbstractC4308) obj, this.f32404, c6319.f19598);
            default:
                return ((AbstractC14371) obj).test(this.f32404, (AbstractC4308) this.f32406);
        }
    }
}
