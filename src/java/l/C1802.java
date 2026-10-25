package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PB32 */
/* renamed from: l.֫ۨۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1802 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Handler f6210;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f6211 = Executors.newSingleThreadExecutor();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f6208 = Executors.newCachedThreadPool();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f6209 = m5988(64);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f6207 = Executors.newFixedThreadPool(C17615.f53826);

    static {
        Thread thread = new Thread(new RunnableC7281(0));
        thread.setName("Custom-Looper");
        thread.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5989() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        C11003.requireNonNull(myLooper);
        f6210 = new Handler(myLooper);
        Looper.loop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m5988(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5992(ExecutorService executorService) {
        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Handler m5993() {
        while (true) {
            Handler handler = f6210;
            if (handler != null) {
                return handler;
            }
            Thread.yield();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5991(Runnable runnable, Object obj, long j) {
        Handler m5993 = m5993();
        m5993.removeCallbacksAndMessages(obj);
        m5993.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5990(Object obj, long j, Runnable runnable) {
        Handler m5993 = m5993();
        m5993.removeCallbacksAndMessages(obj);
        m5993.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m5987(ExecutorService executorService, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(executorService.submit((Callable) it.next()));
        }
        return arrayList2;
    }
}
