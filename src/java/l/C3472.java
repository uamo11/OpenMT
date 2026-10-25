package l;

import bin.mt.plus.R;

/* compiled from: K6KF */
/* renamed from: l.ۗ᩶᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3472 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13349 f10989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3472(C13349 c13349, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f10989 = c13349;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String trim = m31260().trim();
        if (!C11356.m28105(trim)) {
            m31263(R.string.MT_Protector_res_0x7f120056);
            return;
        }
        C11356.m28106(trim);
        this.f10989.mo6922();
        m31262();
    }
}
