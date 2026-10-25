package l;

import bin.mt.plus.R;

/* compiled from: 94PF */
/* renamed from: l.ۘ᩸ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4213 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f13683;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0684 f13684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4213(C0684 c0684, AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440) {
        super(abstractActivityC3346, -1);
        this.f13684 = c0684;
        this.f13683 = abstractC15440;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        AbstractC15440 abstractC15440 = this.f13683;
        String name = abstractC15440.getName();
        String m31260 = m31260();
        if (name.equals(m31260)) {
            m31262();
            return;
        }
        AbstractC15440 m36526 = abstractC15440.m36514().m36526(m31260);
        boolean equalsIgnoreCase = name.equalsIgnoreCase(m31260);
        C0684 c0684 = this.f13684;
        if (!equalsIgnoreCase) {
            if (m36526.mo23120()) {
                m31263(R.string.MT_Protector_res_0x7f1206b1);
                return;
            }
            abstractC15440.mo23551(m36526);
            c0684.m2775();
            m31262();
            return;
        }
        AbstractC15440 m36520 = abstractC15440.m36520(".tmp");
        abstractC15440.mo23551(m36520);
        m36520.mo23551(m36526);
        c0684.m2775();
        m31262();
    }
}
