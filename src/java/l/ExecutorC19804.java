package l;

import java.util.concurrent.Executor;

/* compiled from: I6PU */
/* renamed from: l.᩵᩻᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ExecutorC19804 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        new Thread(runnable).start();
    }
}
