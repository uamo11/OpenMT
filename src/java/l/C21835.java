package l;

/* compiled from: 61L9 */
/* renamed from: l.᩸᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21835 implements InterfaceC19449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f69959;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f69960;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69961;

    public C21835(ActivityC1748 activityC1748, boolean z, C12392 c12392) {
        this.f69959 = activityC1748;
        this.f69961 = z;
        this.f69960 = c12392;
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2703(boolean z) {
        C15858 c15858;
        C7473 c7473;
        C15858 c158582;
        ActivityC1748 activityC1748 = this.f69959;
        boolean z2 = this.f69961;
        if (z2) {
            c158582 = activityC1748.f6050;
            c158582.m37570(z);
        } else {
            c15858 = activityC1748.f6050;
            c15858.m37590(z);
        }
        c7473 = activityC1748.f6064;
        if (this.f69960 != c7473.m20095()) {
            return;
        }
        if (z2) {
            activityC1748.m5847();
        } else {
            activityC1748.m5842();
        }
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        C7473 c7473;
        C15858 c15858;
        C15858 c158582;
        ActivityC1748 activityC1748 = this.f69959;
        c7473 = activityC1748.f6064;
        if (this.f69960 != c7473.m20095()) {
            return;
        }
        c15858 = activityC1748.f6050;
        c15858.m37571(z);
        c158582 = activityC1748.f6050;
        c158582.m37592(z2);
    }
}
