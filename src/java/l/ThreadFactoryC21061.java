package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: V7AU */
/* renamed from: l.᩷ᩴۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC21061 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "remote-auth-pairing");
        thread.setDaemon(true);
        return thread;
    }
}
