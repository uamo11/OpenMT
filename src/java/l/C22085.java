package l;

import bin.mt.plus.R;

/* compiled from: 75NJ */
/* renamed from: l.᩹ۚᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22085 extends AbstractC0525 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f71739;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22085(ActivityC16315 activityC16315) {
        super(true);
        this.f71739 = activityC16315;
    }

    @Override // l.AbstractC0525
    /* renamed from: ۧ */
    public final void mo1201() {
        C13064 c13064;
        int i;
        C16557 c16557;
        C13064 c130642;
        C16557 c165572;
        ActivityC16315 activityC16315 = this.f71739;
        c13064 = activityC16315.f50253;
        if (c13064.m31666(8388611)) {
            c16557 = activityC16315.f50244;
            if (c16557.m38954()) {
                c165572 = activityC16315.f50244;
                c165572.m38953(true);
                return;
            } else {
                c130642 = activityC16315.f50253;
                c130642.m31647(8388611);
                return;
            }
        }
        i = activityC16315.f50246;
        if (i != -1) {
            ComponentCallbacksC9205 m14862 = activityC16315.m2843().m14862(R.id.MT_Protector_res_0x7f0a010f);
            if ((m14862 instanceof C22372) && ((C22372) m14862).m50229()) {
                return;
            }
        }
        activityC16315.m38449(true);
    }
}
