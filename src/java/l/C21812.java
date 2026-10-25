package l;

import bin.mt.plus.R;

/* compiled from: 14V2 */
/* renamed from: l.᩸᩶ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21812 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19866 f69887;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20401 f69888;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21812(ActivityC20401 activityC20401, AbstractActivityC3346 abstractActivityC3346, String str, C19866 c19866) {
        super(abstractActivityC3346, -1);
        this.f69888 = activityC20401;
        this.f69889 = str;
        this.f69887 = c19866;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        if (m31260.length() == 0 || m31260.equalsIgnoreCase(this.f69889)) {
            m31262();
            return;
        }
        AbstractC15440 m45691 = this.f69887.m45691();
        AbstractC15440 m36524 = m45691.m36524(m31260.concat(".mtd"));
        if (m36524.mo23120()) {
            m31263(R.string.MT_Protector_res_0x7f1202a8);
            return;
        }
        m45691.mo23551(m36524);
        ActivityC20401.m46723(this.f69888);
        m31262();
    }
}
