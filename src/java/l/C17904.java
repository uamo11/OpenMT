package l;

import java.util.function.Predicate;

/* compiled from: 43ZG */
/* renamed from: l.ᩳ۟ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C17904 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54670;

    public /* synthetic */ C17904(int i) {
        this.f54670 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f54670) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f54670) {
            case 0:
                break;
            default:
                if (((AbstractC5698) obj).f17559 == EnumC1296.f4571) {
                }
                break;
        }
        return false;
    }
}
