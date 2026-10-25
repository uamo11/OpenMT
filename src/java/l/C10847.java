package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: J9I9 */
/* renamed from: l.ۧ۟ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10847 extends AbstractFutureC7502 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14373 f32595;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1674 f32597;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f32598 = new AtomicBoolean(false);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f32596 = new ReentrantReadWriteLock();

    public C10847(C14373 c14373, InterfaceC1674 interfaceC1674) {
        this.f32595 = c14373;
        this.f32597 = interfaceC1674;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.f32598;
        this.f32596.writeLock().lock();
        try {
            if (!isDone() && !atomicBoolean.getAndSet(true)) {
                this.f32597.cancel();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f32596;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f32598.get();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f32596;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (!this.f32598.get()) {
                if (!this.f32595.isDone()) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f32595.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f32595.get(j, timeUnit);
    }
}
