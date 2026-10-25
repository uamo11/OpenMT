package l;

import java.util.function.Predicate;

/* compiled from: F416 */
/* renamed from: l.ۜۙ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6528 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20171;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20172;

    public /* synthetic */ C6528(int i, Object obj) {
        this.f20171 = i;
        this.f20172 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f20171) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f20171) {
            case 0:
                return ((AbstractC4308) obj).m12928(((C0384) this.f20172).f1817);
            default:
                return ((C0052) obj) != ((C1323) this.f20172).f4739;
        }
    }
}
