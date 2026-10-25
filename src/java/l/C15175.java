package l;

import bin.mt.plus.R;

/* compiled from: 31K1 */
/* renamed from: l.ܶۤ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C15175 extends AbstractC7548 {

    /* renamed from: ᩹۟᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f46354;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f46355;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f46356;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f46357;

    static {
        ApplicationC12518.m30701(115);
        f46354 = new short[]{331, -17774, -17791, -17792, -17776, -17739, -17766, -17761, -17770, -17725, -17725, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17726, -17725, -17725, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, 6435, 16491, 16489, 16500, 16497, 16510, 16504, 16495, 16459, 16506, 16495, 16499};
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public native void mo1006();

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public native void mo1009();

    public C15175(ActivityC17169 activityC17169) {
        this.f46355 = activityC17169;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        boolean z = exc instanceof C12935;
        ActivityC17169 activityC17169 = this.f46355;
        if (z) {
            activityC17169.finish();
        } else {
            activityC17169.m10224((Throwable) exc, true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f46355.m10241(R.id.MT_Protector_res_0x7f0a045d).setVisibility(8);
    }
}
