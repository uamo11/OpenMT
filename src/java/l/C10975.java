package l;

import android.os.Looper;

/* compiled from: 22ZU */
/* renamed from: l.ۧۨۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10975 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Thread f33028 = Looper.getMainLooper().getThread();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27285() {
        return f33028 == Thread.currentThread();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27286() {
        if (m27285()) {
            throw new IllegalStateException("Blocking UI wait must not be called on the UI thread");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27284() {
        Thread currentThread = Thread.currentThread();
        return f33028 == currentThread || currentThread.getName().startsWith("binder:");
    }
}
