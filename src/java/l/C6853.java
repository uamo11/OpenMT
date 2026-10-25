package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 09LR */
/* renamed from: l.ۜܶ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6853 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f21200;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21201;

    public C6853(ActivityC16024 activityC16024, boolean z) {
        this.f21200 = activityC16024;
        this.f21201 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20268(this.f21200, R.string.MT_Protector_res_0x7f1208d2, 100);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        C13670 c13670;
        AbstractC15440 abstractC154402;
        ActivityC16024 activityC16024 = this.f21200;
        abstractC15440 = activityC16024.f49439;
        C9285 c9285 = new C9285(abstractC15440.m36506());
        c13670 = activityC16024.f49434;
        c13670.m32875(c9285);
        abstractC154402 = activityC16024.f49441;
        abstractC154402.m36497(new C23786(0, c9285));
        activityC16024.f49435 = false;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C13670 c13670;
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        boolean z = this.f21201;
        ActivityC16024 activityC16024 = this.f21200;
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
        this.f21200.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
