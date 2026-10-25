package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SAHW */
/* renamed from: l.ۢۘ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9329 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ScheduledThreadPoolExecutor f28297;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f28298 = new HashMap();

    public final String toString() {
        return "EvictionTimer []";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m24011(RunnableC22693 runnableC22693, C2828 c2828, C2828 c28282) {
        synchronized (C9329.class) {
            if (f28297 == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC23439(0));
                f28297 = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                f28297.scheduleAtFixedRate(new RunnableC6506(), c2828.toMillis(), c28282.toMillis(), TimeUnit.MILLISECONDS);
            }
            WeakReference weakReference = new WeakReference(runnableC22693);
            RunnableC20618 runnableC20618 = new RunnableC20618(weakReference);
            runnableC22693.m50705(f28297.scheduleWithFixedDelay(runnableC20618, c2828.toMillis(), c28282.toMillis(), TimeUnit.MILLISECONDS));
            f28298.put(weakReference, runnableC20618);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m24012(RunnableC22693 runnableC22693, C2828 c2828, boolean z) {
        synchronized (C9329.class) {
            if (runnableC22693 != null) {
                try {
                    runnableC22693.m50704();
                    m24010(runnableC22693);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z && f28297 != null && f28298.isEmpty()) {
                f28297.shutdown();
                try {
                    f28297.awaitTermination(c2828.toMillis(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                f28297.setCorePoolSize(0);
                f28297 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24010(RunnableC22693 runnableC22693) {
        HashMap hashMap = f28298;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == runnableC22693) {
                f28297.remove((Runnable) entry.getValue());
                hashMap.remove(entry.getKey());
                return;
            }
        }
    }
}
