package l;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: C6VW */
/* renamed from: l.ۡۡܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ExecutorC8782 implements Executor, AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f26754;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f26755;

    public ExecutorC8782(int i) {
        int max = Math.max(1, Math.min(4, i));
        this.f26755 = max;
        final AtomicInteger atomicInteger = new AtomicInteger();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: l.ۢۡܿ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Syntax-Highlight-" + atomicInteger.incrementAndGet());
            }
        });
        this.f26754 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26754.execute(runnable);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f26754.shutdownNow();
    }
}
