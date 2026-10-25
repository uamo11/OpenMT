package l;

/* compiled from: H56R */
/* renamed from: l.ܺᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16110 extends C1080 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49644 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2706 f49645;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49646;

    public C16110(C2706 c2706, int i) {
        this.f49645 = c2706;
        this.f49646 = i;
    }

    @Override // l.C1080, l.InterfaceC21882
    /* renamed from: ֫ */
    public final void mo3669() {
        this.f49645.f8452.setVisibility(0);
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        if (this.f49644) {
            return;
        }
        this.f49645.f8452.setVisibility(this.f49646);
    }

    @Override // l.C1080, l.InterfaceC21882
    public final void onAnimationCancel() {
        this.f49644 = true;
    }
}
