package l;

import java.util.LinkedList;
import java.util.concurrent.Executor;

/* compiled from: 51RR */
/* renamed from: l.ۧ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ExecutorC11283 implements Executor {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedList f33810 = new LinkedList();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f33811;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f33810.offer(new RunnableC2110(this, runnable));
        if (this.f33811 == null) {
            m27896();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m27896() {
        Runnable runnable = (Runnable) this.f33810.poll();
        this.f33811 = runnable;
        if (runnable != null) {
            C16926.f51987.execute(runnable);
        }
    }
}
