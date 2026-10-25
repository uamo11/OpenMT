package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.᩵ܶܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19549 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f63208;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63209;

    public C19549(ActivityC8259 activityC8259, boolean z) {
        this.f63208 = activityC8259;
        this.f63209 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f63208, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C1203 c1203;
        C1203 c12032;
        C1203 c12033;
        ActivityC8259 activityC8259 = this.f63208;
        c1203 = activityC8259.f25415;
        byte[] m35985 = c1203.f4340.m35985();
        c12032 = activityC8259.f25415;
        AbstractC15440 abstractC15440 = c12032.f4347;
        abstractC15440.getClass();
        abstractC15440.m36497(new C2742(0, m35985));
        c12033 = activityC8259.f25415;
        c12033.f4341 = false;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f63209) {
            this.f63208.finish();
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f63208.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
