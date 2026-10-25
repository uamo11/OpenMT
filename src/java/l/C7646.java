package l;

import java.util.function.Predicate;

/* compiled from: R450 */
/* renamed from: l.۟ᩴ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7646 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5698 f23611;

    public /* synthetic */ C7646(AbstractC5698 abstractC5698) {
        this.f23611 = abstractC5698;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((AbstractC5698) obj) == this.f23611;
    }
}
