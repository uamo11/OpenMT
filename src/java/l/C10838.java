package l;

/* compiled from: K5R1 */
/* renamed from: l.ۧۜᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10838 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f32586;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10838(ActivityC6604 activityC6604, ActivityC6604 activityC66042) {
        super(activityC66042, -1);
        this.f32586 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        if (m31260.length() > 0) {
            ActivityC6604 activityC6604 = this.f32586;
            activityC6604.f20336.f75577.m21920(m31260);
            activityC6604.f20339.notifyDataSetChanged();
            activityC6604.f20336.f75587 = true;
        }
        m31262();
    }
}
