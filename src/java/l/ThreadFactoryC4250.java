package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: V6MU */
/* renamed from: l.ۘ᩺ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC4250 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "GalleryDecode");
    }
}
