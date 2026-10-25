package l;

/* compiled from: I6PU */
/* renamed from: l.ܺ᩻᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16274 extends AbstractC9220 {
    @Override // l.AbstractRunnableC4281
    /* renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        Object obj2;
        FutureC3575 futureC35752;
        Throwable th;
        FutureC3575 futureC35753 = this.f5207;
        if (futureC35753 == null || (obj = futureC35753.f11341) == null || (futureC3575 = this.f27908) == null || (obj2 = futureC3575.f11341) == null || (futureC35752 = this.f5205) == null) {
            return null;
        }
        if (futureC35752.f11341 == null) {
            if (!(obj instanceof C24036) || (th = ((C24036) obj).f77869) == null) {
                if (!(obj2 instanceof C24036) || (th = ((C24036) obj2).f77869) == null) {
                    futureC35752.m10928();
                } else {
                    obj = obj2;
                }
            }
            futureC35752.m10913(obj, th);
        }
        this.f5207 = null;
        this.f27908 = null;
        this.f5205 = null;
        if (futureC3575.f11342 != null) {
            Object obj3 = futureC3575.f11341;
            if (obj3 == null) {
                futureC3575.m10922();
            }
            if (i >= 0 && (obj3 != null || futureC3575.f11341 != null)) {
                futureC3575.m10926();
            }
        }
        return futureC35752.m10908(futureC35753, i);
    }
}
