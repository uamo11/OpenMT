package l;

import bin.mt.plus.R;

/* compiled from: D8GL */
/* renamed from: l.ᩳۤۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17988 extends AbstractDialogInterfaceOnClickListenerC1643 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f56101;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17988(ActivityC10227 activityC10227, ActivityC10227 activityC102272) {
        super(activityC102272);
        this.f56101 = activityC10227;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1643
    /* renamed from: ܽ */
    public final void mo5524() {
        C10516 c10516;
        String trim = m5521().trim();
        try {
            if (trim.isEmpty()) {
                throw new NumberFormatException();
            }
            int parseInt = Integer.parseInt(trim);
            if (parseInt < 1 || parseInt > 999) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1206a7);
                return;
            }
            c10516 = this.f56101.f30821;
            c10516.m26421(parseInt);
            m5518();
        } catch (NumberFormatException unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206a7);
        }
    }
}
