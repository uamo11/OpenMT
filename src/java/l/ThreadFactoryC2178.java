package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: T7B2 */
/* renamed from: l.ۖ֡ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2178 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger;
        StringBuilder sb = new StringBuilder("Remote LAN KeepAlive #");
        atomicInteger = C19112.f60204;
        sb.append(atomicInteger.incrementAndGet());
        Thread thread = new Thread(runnable, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
