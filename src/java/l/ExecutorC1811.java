package l;

import java.util.concurrent.Executor;

/* compiled from: 54FB */
/* renamed from: l.֫ۨ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ExecutorC1811 extends AbstractC15255 implements Executor {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final RunnableC17874 f6238;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final ExecutorC1811 f6239 = new ExecutorC1811();

    @Override // l.AbstractC2975
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        C8867 c8867 = C8867.f27003;
        int m48478 = C21402.m48478();
        if (64 >= m48478) {
            m48478 = 64;
        }
        int m48479 = C21402.m48479(m48478, 12, "kotlinx.coroutines.io.parallelism");
        c8867.getClass();
        if (m48479 < 1) {
            throw new IllegalArgumentException(C19370.m44628(m48479, "Expected positive parallelism level, but got ").toString());
        }
        f6238 = new RunnableC17874(c8867, m48479);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo6030(C23974.f77731, runnable);
    }

    @Override // l.AbstractC2975
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        f6238.mo6030(interfaceC14801, runnable);
    }
}
