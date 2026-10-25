package l;

/* compiled from: I6PU */
/* renamed from: l.ۚ᩻᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5692 extends AbstractC1458 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21423 f17551;

    @Override // l.AbstractRunnableC4281
    /* renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        InterfaceC21423 interfaceC21423;
        FutureC3575 futureC35752 = this.f5207;
        if (futureC35752 != null && (obj = futureC35752.f11341) != null && (futureC3575 = this.f5205) != null && (interfaceC21423 = this.f17551) != null) {
            if (futureC3575.f11341 == null) {
                if (obj instanceof C24036) {
                    Throwable th = ((C24036) obj).f77869;
                    if (th != null) {
                        futureC3575.m10913(obj, th);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!m5011()) {
                        }
                    } catch (Throwable th2) {
                        futureC3575.m10924(th2);
                    }
                }
                futureC3575.m10929(interfaceC21423.apply(obj));
            }
            this.f5207 = null;
            this.f5205 = null;
            this.f17551 = null;
            return futureC3575.m10908(futureC35752, i);
        }
        return null;
    }
}
