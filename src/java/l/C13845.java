package l;

/* compiled from: 81ID */
/* renamed from: l.ܰ۬᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13845 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41284;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1832 f41285;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13845(C1832 c1832, AbstractActivityC3346 abstractActivityC3346, boolean z) {
        super(abstractActivityC3346, -1);
        this.f41285 = c1832;
        this.f41284 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        if (m31260().isEmpty()) {
            m31262();
        } else {
            new C23018(this).m20274();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ۖ */
    public final void mo31253() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        if (this.f41284) {
            dialogInterfaceC0206 = this.f41285.f6274;
            dialogInterfaceC0206.m1449();
        }
        String m31260 = m31260();
        if (m31260.isEmpty()) {
            return;
        }
        ApplicationC20075.f65008.edit().putString("dex_backup_name", m31260).apply();
    }
}
