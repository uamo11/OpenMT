package l;

/* compiled from: 51RR */
/* renamed from: l.֫᩹ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC2110 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f7044;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC11283 f7045;

    public RunnableC2110(ExecutorC11283 executorC11283, Runnable runnable) {
        this.f7045 = executorC11283;
        this.f7044 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC11283 executorC11283 = this.f7045;
        try {
            this.f7044.run();
        } finally {
            executorC11283.m27896();
        }
    }
}
