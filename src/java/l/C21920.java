package l;

/* compiled from: I6PU */
/* renamed from: l.᩸᩻᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C21920 extends AbstractC1458 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15071 f70175;

    @Override // l.AbstractRunnableC4281
    /* renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        InterfaceC15071 interfaceC15071;
        FutureC3575 futureC35752 = this.f5207;
        if (futureC35752 != null && (obj = futureC35752.f11341) != null && (futureC3575 = this.f5205) != null && (interfaceC15071 = this.f70175) != null) {
            if (futureC3575.m10917(obj, interfaceC15071, i > 0 ? null : this)) {
                this.f5207 = null;
                this.f5205 = null;
                this.f70175 = null;
                return futureC3575.m10908(futureC35752, i);
            }
        }
        return null;
    }
}
