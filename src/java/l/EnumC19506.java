package l;

import java.util.concurrent.Executor;

/* compiled from: 92JP */
/* renamed from: l.᩵ܰܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC19506 implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
