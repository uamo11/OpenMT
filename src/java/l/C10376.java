package l;

/* compiled from: F5MM */
/* renamed from: l.ۤܶܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10376 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6142 f31207;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10376(ActivityC6142 activityC6142, ActivityC6142 activityC61422) {
        super(activityC61422, -1);
        this.f31207 = activityC6142;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C13889 c13889;
        try {
            c13889 = this.f31207.f18917;
            c13889.f41404.f13572 = Integer.parseInt(m31260().trim());
            ActivityC21107.f68088 = true;
            m31262();
        } catch (Exception e) {
            m31251(e.getMessage());
        }
    }
}
