package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: I6UJ */
/* renamed from: l.᩶۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20194 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65353;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4671 f65354;

    public C20194(C4671 c4671) {
        this.f65354 = c4671;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledFuture m46430(RunnableC21359 runnableC21359, long j) {
        boolean z;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        ScheduledFuture<?> schedule;
        synchronized (this.f65354) {
            if (!this.f65353) {
                z = this.f65354.f14855;
                if (!z) {
                    scheduledThreadPoolExecutor = this.f65354.f14856;
                    schedule = scheduledThreadPoolExecutor.schedule(runnableC21359, j, TimeUnit.NANOSECONDS);
                }
            }
            throw new RejectedExecutionException("Persistence scheduler slot is closed");
        }
        return schedule;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i;
        synchronized (this.f65354) {
            if (this.f65353) {
                return;
            }
            this.f65353 = true;
            C4671 c4671 = this.f65354;
            i = c4671.f14854;
            c4671.f14854 = i - 1;
        }
    }
}
