package l;

/* compiled from: 3B3L */
/* renamed from: l.ۢܶᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9673 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f29276;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9170 f29277;

    public RunnableC9673(C22372 c22372, C9170 c9170) {
        this.f29276 = c22372;
        this.f29277 = c9170;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f29277.m23581()) {
            C22372 c22372 = this.f29276;
            if (c22372.m5414()) {
                return;
            }
            z = c22372.f72508;
            if (z) {
                c22372.m50171();
            } else {
                C4925.m14316(this, 100L);
            }
        }
    }
}
