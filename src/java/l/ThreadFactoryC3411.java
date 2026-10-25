package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: T58S */
/* renamed from: l.ۗᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3411 implements ThreadFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10788 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f10788.getAndIncrement());
        return thread;
    }
}
