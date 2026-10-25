package l;

import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.ۘܶܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4026 extends AbstractC23222 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3383 f12772;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f12773;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13260 f12774;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f12775;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4026(ActivityC8259 activityC8259, ActivityC8259 activityC82592) {
        super(activityC82592);
        C1203 c1203;
        this.f12773 = activityC8259;
        c1203 = activityC8259.f25415;
        this.f12774 = c1203.f4340.f46672;
        this.f12775 = 0;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12117() {
        int i = this.f12775;
        C13260 c13260 = this.f12774;
        if (i >= c13260.size()) {
            return null;
        }
        int i2 = this.f12775;
        this.f12775 = i2 + 1;
        C3383 item = c13260.getItem(i2);
        this.f12772 = item;
        return item.getValue();
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12119(String str) {
        C1203 c1203;
        this.f12772.m10319(str);
        c1203 = this.f12773.f25415;
        c1203.f4341 = true;
    }

    @Override // l.AbstractC23222
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12118(int i) {
        C12609 c12609;
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC8259 activityC8259 = this.f12773;
            C21374.m48459((CharSequence) activityC8259.getString(R.string.MT_Protector_res_0x7f120897, objArr));
            c12609 = activityC8259.f25417;
            c12609.notifyDataSetChanged();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120a62);
    }
}
