package l;

/* compiled from: C4QU */
/* renamed from: l.ܿۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC17330 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11521 f53079;

    public RunnableC17330(C11521 c11521, C20177 c20177) {
        this.f53079 = c11521;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        try {
            C9255.m23767();
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        C4925.m14315(new Runnable(z) { // from class: l.ᩳۨܿ
            @Override // java.lang.Runnable
            public final void run() {
                C14507.m34641(RunnableC17330.this.f53079);
            }
        });
    }
}
