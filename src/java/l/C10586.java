package l;

import bin.mt.plus.R;

/* compiled from: P676 */
/* renamed from: l.ۤ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10586 extends AbstractC23222 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11467 f31782;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f31783;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31784;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10586(ActivityC21107 activityC21107, ActivityC21107 activityC211072) {
        super(activityC211072);
        this.f31783 = activityC21107;
        this.f31784 = 0;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final String mo12117() {
        C18284 c18284;
        C18284 c182842;
        int i = this.f31784;
        ActivityC21107 activityC21107 = this.f31783;
        c18284 = activityC21107.f68093;
        if (i >= c18284.f56839.length) {
            return null;
        }
        c182842 = activityC21107.f68093;
        C11467[] c11467Arr = c182842.f56839;
        int i2 = this.f31784;
        this.f31784 = i2 + 1;
        C11467 c11467 = c11467Arr[i2];
        this.f31782 = c11467;
        return c11467.m28273();
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final void mo12119(String str) {
        this.f31782.m28272(str);
        ActivityC21107.f68088 = true;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final void mo12118(int i) {
        C12609 c12609;
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC21107 activityC21107 = this.f31783;
            C21374.m48459((CharSequence) activityC21107.getString(R.string.MT_Protector_res_0x7f120897, objArr));
            c12609 = activityC21107.f68092;
            c12609.notifyDataSetChanged();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120a62);
    }
}
