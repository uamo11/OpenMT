package l;

import android.os.PowerManager;
import bin.mt.plus.R;

/* compiled from: H5HP */
/* renamed from: l.ۧܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11057 implements InterfaceC4469 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16700 f33231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f33232;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PowerManager.WakeLock f33233;

    public C11057(ViewOnClickListenerC16700 viewOnClickListenerC16700, C22933 c22933, PowerManager.WakeLock wakeLock) {
        this.f33231 = viewOnClickListenerC16700;
        this.f33232 = c22933;
        this.f33233 = wakeLock;
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final boolean mo3373() {
        return this.f33232.m51053();
    }

    @Override // l.InterfaceC4469
    /* renamed from: ܽ */
    public final ActivityC17169 mo3376() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f33231.f51283;
        return activityC17169;
    }

    @Override // l.InterfaceC4469
    /* renamed from: ۧ */
    public final void mo3375(int i) {
        this.f33232.m51045(i);
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final void mo3371(int i) {
        this.f33232.m51040(C4925.m14306(R.string.MT_Protector_res_0x7f120202, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final void mo3372(C0941 c0941) {
        C3764 c3764;
        boolean z;
        ViewOnClickListenerC16700 viewOnClickListenerC16700 = this.f33231;
        c3764 = viewOnClickListenerC16700.f51278;
        z = viewOnClickListenerC16700.f51267;
        c3764.m11406(c0941, z);
    }

    @Override // l.InterfaceC4469
    /* renamed from: ۧ */
    public final void mo3374() {
        this.f33232.m51051();
        PowerManager.WakeLock wakeLock = this.f33233;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    @Override // l.InterfaceC4469
    /* renamed from: ܿ */
    public final boolean mo3377() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f33231.f51283;
        return new C10114(activityC17169).m25396();
    }

    @Override // l.InterfaceC4469
    /* renamed from: ᩳ */
    public final void mo3378() {
        C21374.m48463(R.string.MT_Protector_res_0x7f120903);
    }
}
