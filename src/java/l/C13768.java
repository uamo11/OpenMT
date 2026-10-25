package l;

import java.util.function.Predicate;

/* compiled from: M7E7 */
/* renamed from: l.ܰۧ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C13768 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41069;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f41069) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f41069) {
            case 0:
                return ((AbstractC9701) obj).mo4066();
            default:
                return ((Long) obj).longValue() != -1;
        }
    }
}
