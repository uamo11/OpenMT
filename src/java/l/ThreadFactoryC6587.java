package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: A6XJ */
/* renamed from: l.ۜۛ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC6587 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = ServiceC19288.f60689;
        Thread thread = new Thread(runnable, "McpHealthMonitor");
        thread.setDaemon(true);
        return thread;
    }
}
