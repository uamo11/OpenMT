package l;

import bin.mt.plus.R;

/* compiled from: F1E5 */
/* renamed from: l.ܰ᩺᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14137 implements InterfaceC4469 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7788 f42650;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f42651;

    public C14137(ViewOnClickListenerC7788 viewOnClickListenerC7788, C22933 c22933) {
        this.f42650 = viewOnClickListenerC7788;
        this.f42651 = c22933;
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final boolean mo3373() {
        return this.f42651.m51053();
    }

    @Override // l.InterfaceC4469
    /* renamed from: ܽ */
    public final ActivityC17169 mo3376() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f42650.f24076;
        return activityC17169;
    }

    @Override // l.InterfaceC4469
    /* renamed from: ۧ */
    public final void mo3375(int i) {
        this.f42651.m51045(i);
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final void mo3371(int i) {
        this.f42651.m51040(C4925.m14306(R.string.MT_Protector_res_0x7f120202, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC4469
    /* renamed from: ֫ */
    public final void mo3372(C0941 c0941) {
        C3764 c3764;
        boolean z;
        ViewOnClickListenerC7788 viewOnClickListenerC7788 = this.f42650;
        c3764 = viewOnClickListenerC7788.f24074;
        z = viewOnClickListenerC7788.f24072;
        c3764.m11385(c0941, z);
    }

    @Override // l.InterfaceC4469
    /* renamed from: ۧ */
    public final void mo3374() {
        this.f42651.m51051();
    }

    @Override // l.InterfaceC4469
    /* renamed from: ܿ */
    public final boolean mo3377() {
        ActivityC17169 activityC17169;
        activityC17169 = this.f42650.f24076;
        return new C10114(activityC17169).m25396();
    }

    @Override // l.InterfaceC4469
    /* renamed from: ᩳ */
    public final void mo3378() {
        C21374.m48463(R.string.MT_Protector_res_0x7f120903);
    }
}
