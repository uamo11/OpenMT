package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.ᩴܶܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18843 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f59430;

    public C18843(ActivityC8259 activityC8259) {
        this.f59430 = activityC8259;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f59430);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C1203 c1203;
        c1203 = this.f59430.f25415;
        c1203.f4340.m35982(new C12534(), ActivityC16315.m38430());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C1203 c1203;
        C1203 c12032;
        C1203 c12033;
        C1203 c12034;
        C1203 c12035;
        C1203 c12036;
        C1203 c12037;
        ActivityC8259 activityC8259 = this.f59430;
        c1203 = activityC8259.f25415;
        c12032 = activityC8259.f25415;
        c1203.f4348 = c12032.f4340.m35992();
        c12033 = activityC8259.f25415;
        if (c12033.f4348 == null) {
            c12036 = activityC8259.f25415;
            c12036.f4348 = "Error";
            c12037 = activityC8259.f25415;
            String m35991 = c12037.f4340.m35991();
            if (!m35991.contains(activityC8259.getString(R.string.MT_Protector_res_0x7f120757)) && !m35991.contains(activityC8259.getString(R.string.MT_Protector_res_0x7f120756))) {
                C21374.m48459((CharSequence) m35991);
                return;
            } else {
                activityC8259.m10221(m35991, false);
                return;
            }
        }
        c12034 = activityC8259.f25415;
        String str = c12034.f4348;
        c12035 = activityC8259.f25415;
        ActivityC14946.m35399(activityC8259, str, c12035.f4346, null, null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f59430.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
