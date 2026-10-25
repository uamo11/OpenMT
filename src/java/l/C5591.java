package l;

/* compiled from: 64NR */
/* renamed from: l.ۚ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5591 implements InterfaceC21882 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17303 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17304;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1357 f17305;

    public C5591(AbstractC1357 abstractC1357) {
        this.f17305 = abstractC1357;
    }

    @Override // l.InterfaceC21882
    /* renamed from: ֫ */
    public final void mo3669() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f17303 = false;
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        if (this.f17303) {
            return;
        }
        AbstractC1357 abstractC1357 = this.f17305;
        abstractC1357.f4918 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f17304);
    }

    @Override // l.InterfaceC21882
    public final void onAnimationCancel() {
        this.f17303 = true;
    }
}
