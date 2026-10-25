package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 09LR */
/* renamed from: l.ܳܶ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14613 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f44709;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44710;

    public C14613(ActivityC16024 activityC16024, boolean z) {
        this.f44709 = activityC16024;
        this.f44710 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20268(this.f44709, R.string.MT_Protector_res_0x7f1208d2, 100);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        C13670 c13670;
        AbstractC15440 abstractC154402;
        ActivityC16024 activityC16024 = this.f44709;
        abstractC15440 = activityC16024.f49439;
        C9285 c9285 = new C9285(abstractC15440.m36506());
        c13670 = activityC16024.f49434;
        c13670.m32875(c9285);
        abstractC154402 = activityC16024.f49441;
        byte[] m23823 = c9285.m23823();
        abstractC154402.getClass();
        abstractC154402.m36497(new C2742(0, m23823));
        activityC16024.f49435 = true;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C13670 c13670;
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        boolean z = this.f44710;
        ActivityC16024 activityC16024 = this.f44709;
        if (z) {
            activityC16024.finish();
        } else {
            c13670 = activityC16024.f49434;
            c13670.m32876(false);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44709.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
