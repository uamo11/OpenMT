package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SAHW */
/* renamed from: l.᩷ۘ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC20618 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f66337;

    public RunnableC20618(WeakReference weakReference) {
        this.f66337 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        HashMap hashMap;
        WeakReference weakReference = this.f66337;
        Runnable runnable = (Runnable) weakReference.get();
        if (runnable == null) {
            scheduledThreadPoolExecutor = C9329.f28297;
            scheduledThreadPoolExecutor.remove(this);
            hashMap = C9329.f28298;
            hashMap.remove(weakReference);
            return;
        }
        runnable.run();
    }
}
