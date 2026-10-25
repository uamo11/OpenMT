package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 61L9 */
/* renamed from: l.᩹᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22540 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f72924;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72925;

    public C22540(ActivityC1748 activityC1748, boolean z) {
        this.f72924 = activityC1748;
        this.f72925 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f72924, R.string.MT_Protector_res_0x7f120808);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C7473 c7473;
        c7473 = this.f72924.f6064;
        c7473.m20092(this.f72925);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C7473 c7473;
        c7473 = this.f72924.f6064;
        if (c7473.m20083() == 0) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ed);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f72924.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
