package l;

import bin.mt.plus.R;

/* compiled from: 4AWI */
/* renamed from: l.۬ܿܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13261 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5417 f39713;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f39714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13261(ActivityC0477 activityC0477, ActivityC0477 activityC04772, C5417 c5417) {
        super(activityC04772, -1);
        this.f39714 = activityC0477;
        this.f39713 = c5417;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C6659 c6659;
        String m31260 = m31260();
        if (m31260.isEmpty()) {
            m31263(R.string.MT_Protector_res_0x7f120304);
            return;
        }
        this.f39713.m15501(m31260);
        C8239.m21822();
        c6659 = this.f39714.f2066;
        AbstractC12014 m2032 = c6659.m2032();
        C11003.requireNonNull(m2032);
        m2032.m29381();
        m31262();
    }
}
