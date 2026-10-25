package l;

import java.util.concurrent.Future;

/* compiled from: S38E */
/* renamed from: l.ۨܰܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11744 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m28740(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
