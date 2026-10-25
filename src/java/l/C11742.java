package l;

/* compiled from: F1OQ */
/* renamed from: l.ۨܰۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11742 extends AbstractC16496 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2386 f35049;

    public C11742(C2386 c2386) {
        this.f35049 = c2386;
    }

    @Override // l.AbstractC16496
    public final void onPageSelected(int i) {
        C2386 c2386 = this.f35049;
        if (c2386.f7611 != i) {
            c2386.f7611 = i;
            c2386.f7610.m52011();
        }
    }

    @Override // l.AbstractC16496
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f35049.m7725();
        }
    }
}
