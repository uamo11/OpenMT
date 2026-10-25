package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: DB1R */
/* renamed from: l.᩷ۤ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ThreadFactoryC20804 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C6692(runnable);
    }
}
