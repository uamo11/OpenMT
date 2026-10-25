package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: 46LQ */
/* renamed from: l.ۡۨۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC8857 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "GalleryGifDecode");
    }
}
