package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* compiled from: K6PM */
/* renamed from: l.ۡۜ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractFutureC8723 implements Future, Serializable {
    public static final long serialVersionUID = -7721805057305804111L;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f26558;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f26561;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26562 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f26563;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C20718[] f26557 = new C20718[32];

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f26560 = new ReentrantLock();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f26559 = new ReferenceQueue();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo22553(Throwable th) {
    }

    /* renamed from: ܽ */
    public abstract boolean mo12866();

    /* renamed from: ᩳ */
    public abstract Object mo12867();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m22544(int i) {
        int i2;
        do {
            i2 = this.f26563;
            if (i2 < 0) {
                return i2;
            }
        } while (!f26558.compareAndSwapInt(this, f26561, i2, i2 | i));
        if ((i2 >>> 16) == 0) {
            return i;
        }
        synchronized (this) {
            notifyAll();
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22555() {
        int i = this.f26563;
        if (i < 0) {
            return i;
        }
        try {
            return mo12866() ? m22544(-268435456) : i;
        } catch (Throwable th) {
            return m22548(th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22552(long j) {
        int i = this.f26563;
        if (i < 0 || !f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.f26563 >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m22545() {
        boolean z = false;
        int m22555 = C17189.f52695.m40441(this) ? m22555() : 0;
        if (m22555 < 0 || (m22555 = this.f26563) < 0) {
            return m22555;
        }
        int i = m22555;
        do {
            if (f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
                synchronized (this) {
                    if (this.f26563 >= 0) {
                        try {
                            wait(0L);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
            i = this.f26563;
        } while (i >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m22550() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i = this.f26563;
        if (i >= 0) {
            i = C17189.f52695.m40441(this) ? m22555() : 0;
            if (i >= 0) {
                while (true) {
                    int i2 = this.f26563;
                    if (i2 < 0) {
                        return i2;
                    }
                    if (f26558.compareAndSwapInt(this, f26561, i2, i2 | 65536)) {
                        synchronized (this) {
                            if (this.f26563 >= 0) {
                                wait(0L);
                            } else {
                                notifyAll();
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m22549() {
        int m22555;
        int i = this.f26563;
        if (i < 0) {
            return i;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C3784)) {
            return m22545();
        }
        C3784 c3784 = (C3784) currentThread;
        C17895 c17895 = c3784.f11956;
        return (!c17895.m41867(this) || (m22555 = m22555()) >= 0) ? c3784.f11955.m40437(c17895, this, 0L) : m22555;
    }

    public void run() {
        int m22555 = m22555();
        if (m22555 >= 0) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof C3784) {
                C3784 c3784 = (C3784) currentThread;
                m22555 = c3784.f11955.m40437(c3784.f11956, this, 0L);
            } else {
                m22555 = m22545();
            }
        }
        int i = m22555 & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable m22547 = m22547();
            C14157 c14157 = C17189.f52693;
            throw m22547;
        }
    }

    static {
        Unsafe unsafe = C0961.f3616;
        f26558 = unsafe;
        try {
            f26561 = unsafe.objectFieldOffset(AbstractFutureC8723.class.getDeclaredField("᩸"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        r3[r0] = new l.C20718(r7, r8, r3[r0], l.AbstractFutureC8723.f26559);
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m22548(java.lang.Throwable r8) {
        /*
            r7 = this;
            int r0 = r7.f26563
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto L3c
            int r0 = java.lang.System.identityHashCode(r7)
            java.util.concurrent.locks.ReentrantLock r2 = l.AbstractFutureC8723.f26560
            r2.lock()
            m22551()     // Catch: java.lang.Throwable -> L37
            l.᩷ۜ᩵[] r3 = l.AbstractFutureC8723.f26557     // Catch: java.lang.Throwable -> L37
            r0 = r0 & 31
            r4 = r3[r0]     // Catch: java.lang.Throwable -> L37
        L18:
            if (r4 != 0) goto L26
            l.᩷ۜ᩵ r4 = new l.᩷ۜ᩵     // Catch: java.lang.Throwable -> L37
            r5 = r3[r0]     // Catch: java.lang.Throwable -> L37
            java.lang.ref.ReferenceQueue r6 = l.AbstractFutureC8723.f26559     // Catch: java.lang.Throwable -> L37
            r4.<init>(r7, r8, r5, r6)     // Catch: java.lang.Throwable -> L37
            r3[r0] = r4     // Catch: java.lang.Throwable -> L37
            goto L2c
        L26:
            java.lang.Object r5 = r4.get()     // Catch: java.lang.Throwable -> L37
            if (r5 != r7) goto L34
        L2c:
            r2.unlock()
            int r0 = r7.m22544(r1)
            goto L3c
        L34:
            l.᩷ۜ᩵ r4 = r4.f66712     // Catch: java.lang.Throwable -> L37
            goto L18
        L37:
            r8 = move-exception
            r2.unlock()
            throw r8
        L3c:
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r0
            if (r2 != r1) goto L44
            r7.mo22553(r8)
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractFutureC8723.m22548(java.lang.Throwable):int");
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private Throwable m22547() {
        Throwable th;
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f26560;
        reentrantLock.lock();
        try {
            m22551();
            C20718 c20718 = f26557[identityHashCode & 31];
            while (c20718 != null) {
                if (c20718.get() == this) {
                    break;
                }
                c20718 = c20718.f66712;
            }
            reentrantLock.unlock();
            if (c20718 == null || (th = c20718.f66710) == null) {
                return null;
            }
            if (c20718.f66713 != Thread.currentThread().getId()) {
                try {
                    Constructor<?> constructor = null;
                    for (Constructor<?> constructor2 : th.getClass().getConstructors()) {
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(th);
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(null);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m22551() {
        while (true) {
            Reference poll = f26559.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C20718) {
                int i = ((C20718) poll).f66711 & 31;
                C20718[] c20718Arr = f26557;
                C20718 c20718 = c20718Arr[i];
                C20718 c207182 = null;
                while (true) {
                    if (c20718 != null) {
                        C20718 c207183 = c20718.f66712;
                        if (c20718 != poll) {
                            c207182 = c20718;
                            c20718 = c207183;
                        } else if (c207182 == null) {
                            c20718Arr[i] = c207183;
                        } else {
                            c207182.f66712 = c207183;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final void m22546() {
        ReentrantLock reentrantLock = f26560;
        if (reentrantLock.tryLock()) {
            try {
                m22551();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m22544(-1073741824) & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26563 < 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.f26563 & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        int m22549 = (Thread.currentThread() instanceof C3784 ? m22549() : m22550()) & (-268435456);
        if (m22549 == -1073741824) {
            throw new CancellationException();
        }
        if (m22549 == Integer.MIN_VALUE) {
            throw new ExecutionException(m22547());
        }
        return mo12867();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r12, java.util.concurrent.TimeUnit r14) {
        /*
            r11 = this;
            long r12 = r14.toNanos(r12)
            boolean r14 = java.lang.Thread.interrupted()
            if (r14 != 0) goto Lab
            int r14 = r11.f26563
            if (r14 < 0) goto L7d
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7d
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 + r12
            int r12 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r12 != 0) goto L1f
            r3 = 1
        L1f:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            boolean r13 = r12 instanceof l.C3784
            if (r13 == 0) goto L32
            l.ۘۜ᩵ r12 = (l.C3784) r12
            l.ܿۜ᩵ r13 = r12.f11955
            l.ᩳۜ᩵ r12 = r12.f11956
            int r14 = r13.m40437(r12, r11, r3)
            goto L7d
        L32:
            l.ܿۜ᩵ r12 = l.C17189.f52695
            boolean r12 = r12.m40441(r11)
            if (r12 == 0) goto L40
            int r12 = r11.m22555()
            r14 = r12
            goto L42
        L40:
            r12 = 0
            r14 = 0
        L42:
            if (r14 < 0) goto L7d
        L44:
            int r9 = r11.f26563
            if (r9 < 0) goto L7e
            long r12 = java.lang.System.nanoTime()
            long r12 = r3 - r12
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 <= 0) goto L7e
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r12 = r14.toMillis(r12)
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 <= 0) goto L44
            sun.misc.Unsafe r5 = l.AbstractFutureC8723.f26558
            long r7 = l.AbstractFutureC8723.f26561
            r14 = 65536(0x10000, float:9.1835E-41)
            r10 = r9 | r14
            r6 = r11
            boolean r14 = r5.compareAndSwapInt(r6, r7, r9, r10)
            if (r14 == 0) goto L44
            r0 = r11
            monitor-enter(r0)
            int r14 = r11.f26563     // Catch: java.lang.Throwable -> L7a
            if (r14 < 0) goto L75
            r11.wait(r12)     // Catch: java.lang.Throwable -> L7a
            goto L78
        L75:
            r11.notifyAll()     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            goto L44
        L7a:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            throw r12
        L7d:
            r9 = r14
        L7e:
            if (r9 < 0) goto L82
            int r9 = r11.f26563
        L82:
            r12 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r13 = r9 & r12
            if (r13 == r12) goto La6
            r12 = -1073741824(0xffffffffc0000000, float:-2.0)
            if (r13 == r12) goto La0
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r12) goto L96
            java.util.concurrent.TimeoutException r12 = new java.util.concurrent.TimeoutException
            r12.<init>()
            throw r12
        L96:
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException
            java.lang.Throwable r13 = r11.m22547()
            r12.<init>(r13)
            throw r12
        La0:
            java.util.concurrent.CancellationException r12 = new java.util.concurrent.CancellationException
            r12.<init>()
            throw r12
        La6:
            java.lang.Object r12 = r11.mo12867()
            return r12
        Lab:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractFutureC8723.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m22556() {
        m22549();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22554() {
        int i;
        do {
            i = this.f26563;
            if (((short) i) != 0) {
                return false;
            }
        } while (!f26558.compareAndSwapInt(this, f26561, i, ((-65536) & i) | 1));
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object m22547;
        objectOutputStream.defaultWriteObject();
        int i = this.f26563 & (-268435456);
        if (i >= -268435456) {
            m22547 = null;
        } else if (i == -1073741824) {
            m22547 = new CancellationException();
        } else {
            m22547 = m22547();
        }
        objectOutputStream.writeObject(m22547);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        if (readObject != null) {
            m22548((Throwable) readObject);
        }
    }
}
