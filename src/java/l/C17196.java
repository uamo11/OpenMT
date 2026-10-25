package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: 79GJ */
/* renamed from: l.ܿ۟ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17196 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Condition f52731;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f52732;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16614 f52733;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2148 f52734;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Throwable f52735;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52736;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC16490 f52737;

    public C17196(String str) {
        InterfaceC16490 interfaceC16490 = C10951.f32985;
        this.f52734 = C11321.m27961(C17196.class);
        this.f52736 = str;
        this.f52737 = interfaceC16490;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f52732 = reentrantLock;
        this.f52731 = reentrantLock.newCondition();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40458(C16614 c16614) {
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            this.f52734.mo7082("Setting << {} >> to `{}`", this.f52736, c16614);
            this.f52733 = c16614;
            this.f52731.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40457(C2380 c2380) {
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            this.f52735 = this.f52737.mo5928(c2380);
            this.f52731.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m40456(long j, TimeUnit timeUnit) {
        Object m40460 = m40460(j, timeUnit);
        if (m40460 != null) {
            return m40460;
        }
        throw this.f52737.mo5928(new TimeoutException("Timeout expired"));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m40460(long j, TimeUnit timeUnit) {
        String str = this.f52736;
        InterfaceC2148 interfaceC2148 = this.f52734;
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            try {
                Throwable th = this.f52735;
                if (th != null) {
                    throw th;
                }
                C16614 c16614 = this.f52733;
                if (c16614 != null) {
                    return c16614;
                }
                interfaceC2148.mo7100(str, "Awaiting << {} >>");
                Condition condition = this.f52731;
                if (j == 0) {
                    while (this.f52733 == null && this.f52735 == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = this.f52735;
                if (th2 == null) {
                    return this.f52733;
                }
                interfaceC2148.mo7102("<< {} >> woke to: {}", str, th2);
                throw this.f52735;
            } catch (InterruptedException e) {
                throw this.f52737.mo5928(e);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40459() {
        boolean z;
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            if (this.f52735 == null) {
                if (this.f52733 != null) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f52736;
    }
}
