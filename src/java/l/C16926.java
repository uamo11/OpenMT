package l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: 51RR */
/* renamed from: l.ܽ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16926 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f51987 = new ThreadPoolExecutor(0, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Handler f51988;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HandlerThread f51989;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39771(Runnable runnable) {
        if (f51988 == null) {
            synchronized (C16926.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f51989 = handlerThread;
                handlerThread.start();
                f51988 = new Handler(f51989.getLooper());
            }
        }
        f51988.post(runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Executor m39770() {
        return new ExecutorC11283();
    }
}
