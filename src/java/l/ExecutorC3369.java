package l;

import java.util.concurrent.Executor;

/* compiled from: Y4G0 */
/* renamed from: l.ۗܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ExecutorC3369 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
