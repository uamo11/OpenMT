package l;

import bin.mt.plus.R;

/* compiled from: K5R1 */
/* renamed from: l.ۛ᩻ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6395 extends AbstractC23222 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f19794;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f19795;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3383 f19796;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f19797;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6395(ActivityC6604 activityC6604, ActivityC6604 activityC66042) {
        super(activityC66042);
        this.f19795 = activityC6604;
        this.f19794 = activityC6604.f20336.f75567.size();
        this.f19797 = 0;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final String mo12117() {
        int i = this.f19797;
        if (i >= this.f19794) {
            return null;
        }
        C13260 c13260 = this.f19795.f20336.f75567;
        this.f19797 = i + 1;
        C3383 item = c13260.getItem(i);
        this.f19796 = item;
        return item.getValue();
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final void mo12119(String str) {
        this.f19796.m10319(str);
        this.f19795.f20336.f75587 = true;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫ */
    public final void mo12118(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC6604 activityC6604 = this.f19795;
            C21374.m48459((CharSequence) activityC6604.getString(R.string.MT_Protector_res_0x7f120897, objArr));
            activityC6604.f20339.notifyDataSetChanged();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120a62);
    }
}
