package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SAHW */
/* renamed from: l.ۜۘ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC6506 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        HashMap hashMap2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor4;
        HashMap hashMap3;
        synchronized (C9329.class) {
            hashMap = C9329.f28298;
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == null) {
                    scheduledThreadPoolExecutor4 = C9329.f28297;
                    scheduledThreadPoolExecutor4.remove((Runnable) entry.getValue());
                    hashMap3 = C9329.f28298;
                    hashMap3.remove(entry.getKey());
                }
            }
            hashMap2 = C9329.f28298;
            if (hashMap2.isEmpty()) {
                scheduledThreadPoolExecutor = C9329.f28297;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor2 = C9329.f28297;
                    scheduledThreadPoolExecutor2.shutdown();
                    scheduledThreadPoolExecutor3 = C9329.f28297;
                    scheduledThreadPoolExecutor3.setCorePoolSize(0);
                    C9329.f28297 = null;
                }
            }
        }
    }
}
