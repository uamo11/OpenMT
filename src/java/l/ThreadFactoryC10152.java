package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: S4H6 */
/* renamed from: l.ۤ۟ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC10152 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Timer");
        thread.setDaemon(true);
        return thread;
    }
}
