package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: 7B0R */
/* renamed from: l.᩶ܽ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC20285 implements ThreadFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f65531;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f65531);
        thread.setPriority(10);
        return thread;
    }
}
