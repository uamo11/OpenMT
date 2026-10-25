package l;

import bin.mt.plus.R;

/* compiled from: I5G5 */
/* renamed from: l.۬ܿۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13256 implements InterfaceC21403 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC10435 f39700;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f39701;

    public C13256(ViewOnClickListenerC10435 viewOnClickListenerC10435, C22933 c22933) {
        this.f39700 = viewOnClickListenerC10435;
        this.f39701 = c22933;
    }

    @Override // l.InterfaceC21403
    /* renamed from: ֫ */
    public final boolean mo22513() {
        return this.f39701.m51053();
    }

    @Override // l.InterfaceC21403
    /* renamed from: ܽ */
    public final ActivityC17169 mo22516() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f39700.f31359;
        return activityC17169;
    }

    @Override // l.InterfaceC21403
    /* renamed from: ۧ */
    public final void mo22515(int i) {
        this.f39701.m51045(i);
    }

    @Override // l.InterfaceC21403
    /* renamed from: ֫ */
    public final void mo22512(int i, int i2) {
        ActivityC17169 activityC17169;
        ActivityC17169 activityC171692;
        ViewOnClickListenerC10435 viewOnClickListenerC10435 = this.f39700;
        activityC17169 = viewOnClickListenerC10435.f31359;
        activityC171692 = viewOnClickListenerC10435.f31359;
        activityC17169.m10218(R.string.MT_Protector_res_0x7f120491, activityC171692.getString(R.string.MT_Protector_res_0x7f120289, Integer.valueOf(i2), Integer.valueOf(i)), false);
    }

    @Override // l.InterfaceC21403
    /* renamed from: ۧ */
    public final void mo22514() {
        this.f39701.m51051();
    }
}
