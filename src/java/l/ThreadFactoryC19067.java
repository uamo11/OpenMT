package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: V6MU */
/* renamed from: l.ᩴ᩺ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC19067 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC1126(3, runnable), "GalleryPrefetch");
    }
}
