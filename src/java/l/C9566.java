package l;

/* compiled from: A5H1 */
/* renamed from: l.ۢۨۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9566 extends C18032 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16620 f29022;

    public C9566(AbstractC16620 abstractC16620) {
        this.f29022 = abstractC16620;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        this.f29022.runAnimators();
        abstractC16620.removeListener(this);
    }
}
