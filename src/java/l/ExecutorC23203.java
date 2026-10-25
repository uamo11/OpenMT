package l;

import java.util.concurrent.Executor;

/* compiled from: G6MK */
/* renamed from: l.᩺᩵ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC23203 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable, "SessionRecoveryDiagnostics").start();
    }
}
