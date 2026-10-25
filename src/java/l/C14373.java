package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: 39KO */
/* renamed from: l.ܳ۟ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14373 extends AbstractFutureC7502 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17196 f43315;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    public C14373(C17196 c17196) {
        this.f43315 = c17196;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f43315.m40459();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            C17196 c17196 = this.f43315;
            c17196.getClass();
            return c17196.m40460(0L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        try {
            return this.f43315.m40456(j, timeUnit);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
