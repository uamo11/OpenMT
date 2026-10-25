package l;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: 9975 */
/* renamed from: l.᩻ۛۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23509 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51948(Process process, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (Build.VERSION.SDK_INT >= 26) {
            return process.waitFor(j, timeUnit);
        }
        long nanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                }
                nanos = timeUnit.toNanos(j) - (System.nanoTime() - nanoTime);
            }
        } while (nanos > 0);
        return false;
    }
}
