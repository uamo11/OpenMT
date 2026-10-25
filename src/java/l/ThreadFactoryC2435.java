package l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: HA0I */
/* renamed from: l.ۖۡ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2435 implements ThreadFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ThreadFactory f7762 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7762.newThread(runnable);
        newThread.setName("JmDNS " + newThread.getName());
        return newThread;
    }
}
