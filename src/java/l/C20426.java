package l;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: G9ZA */
/* renamed from: l.᩶᩷᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20426 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f65892 = C11321.m27962(C20426.class.getName());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f65893;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f65894 = new ConcurrentMapC10942(50);

    public C20426(String str) {
        this.f65893 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46831(long j) {
        Thread currentThread = Thread.currentThread();
        ConcurrentMapC10942 concurrentMapC10942 = this.f65894;
        if (((Semaphore) concurrentMapC10942.get(currentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentMapC10942.putIfAbsent(currentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentMapC10942.get(currentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f65892.mo7081("Exception ", (Exception) e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46830() {
        Collection<Semaphore> values = this.f65894.values();
        for (Semaphore semaphore : values) {
            semaphore.release();
            values.remove(semaphore);
        }
    }

    public final String toString() {
        StringBuilder m32307 = C13325.m32307(1000, "Semaphore: ");
        m32307.append(this.f65893);
        ConcurrentMapC10942 concurrentMapC10942 = this.f65894;
        if (concurrentMapC10942.size() == 0) {
            m32307.append(" no semaphores.");
        } else {
            m32307.append(" semaphores:\n");
            for (Map.Entry entry : concurrentMapC10942.entrySet()) {
                m32307.append("\tThread: ");
                m32307.append(((Thread) entry.getKey()).getName());
                m32307.append(' ');
                m32307.append(entry.getValue());
                m32307.append('\n');
            }
        }
        return m32307.toString();
    }
}
