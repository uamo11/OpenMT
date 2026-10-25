package l;

import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.ۖܶܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2615 extends AbstractC17370 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f8249;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2615(ActivityC8259 activityC8259, ActivityC8259 activityC82592, boolean z) {
        super(activityC82592, z);
        this.f8249 = activityC8259;
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫ */
    public final void mo5652(C18076 c18076, String str) {
        C1203 c1203;
        C1203 c12032;
        C1203 c12033;
        C12609 c12609;
        C1203 c12034;
        C1203 c12035;
        C1203 c12036;
        ActivityC8259 activityC8259 = this.f8249;
        c1203 = activityC8259.f25415;
        c1203.f4345 = true;
        c12032 = activityC8259.f25415;
        c12032.f4342 = 0;
        c12033 = activityC8259.f25415;
        int size = c12033.f4340.f46672.size();
        for (int i = 0; i < size; i++) {
            c12034 = activityC8259.f25415;
            if (c18076.m42137(c12034.f4340.f46672.m47858(i))) {
                c12035 = activityC8259.f25415;
                int[] iArr = c12035.f4344;
                c12036 = activityC8259.f25415;
                int i2 = c12036.f4342;
                c12036.f4342 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC8259.setTitle(activityC8259.getString(R.string.MT_Protector_res_0x7f1203de, str));
        c12609 = activityC8259.f25417;
        c12609.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫ */
    public final void mo5651() {
        C1203 c1203;
        C1203 c12032;
        C12609 c12609;
        ActivityC8259 activityC8259 = this.f8249;
        c1203 = activityC8259.f25415;
        c1203.f4345 = false;
        c12032 = activityC8259.f25415;
        activityC8259.setTitle(c12032.f4346);
        c12609 = activityC8259.f25417;
        c12609.notifyDataSetChanged();
    }
}
