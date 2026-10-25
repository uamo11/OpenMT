package l;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: D4TB */
/* renamed from: l.ۜۢ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6673 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18207(ExecutorService executorService) {
        ThreadPoolExecutor threadPoolExecutor;
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = (threadPoolExecutor = (ThreadPoolExecutor) executorService).isTerminated())) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executorService;
            scheduledThreadPoolExecutor.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        scheduledThreadPoolExecutor.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
