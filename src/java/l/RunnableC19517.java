package l;

/* compiled from: RB93 */
/* renamed from: l.᩵ܳ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC19517 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f63077;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f63078;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63079;

    public RunnableC19517(C4888 c4888, C4888 c48882, boolean z, C2727 c2727) {
        this.f63077 = c4888;
        this.f63078 = c48882;
        this.f63079 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacksC9205 m14248 = this.f63077.m14248();
        ComponentCallbacksC9205 m142482 = this.f63078.m14248();
        AbstractC16176 abstractC16176 = C18294.f56886;
        if (this.f63079) {
            m142482.getEnterTransitionCallback();
        } else {
            m14248.getEnterTransitionCallback();
        }
    }
}
