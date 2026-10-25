package l;

import java.util.function.Predicate;

/* compiled from: T7LF */
/* renamed from: l.ܺܰ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C15966 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49275;

    public /* synthetic */ C15966(int i) {
        this.f49275 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f49275) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f49275) {
            case 0:
                if ((((C0052) obj).f17563 & 4503599627370496L) != 0) {
                }
                break;
            default:
                if (((C0779) obj).m2971() == null) {
                }
                break;
        }
        return false;
    }
}
