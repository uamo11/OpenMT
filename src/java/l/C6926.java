package l;

import java.util.function.Predicate;

/* compiled from: B7KX */
/* renamed from: l.ۜᩳ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6926 implements Predicate {
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
        return ((AbstractC12612) obj).m14709(EnumC18550.f57522);
    }
}
