package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: FAYC */
/* renamed from: l.۟ۛ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ExecutorC7290 implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f22379;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f22380;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5174 f22381;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16627 f22382;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f22383;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16627 f22384;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C15050 f22378 = new C15050("NOT_IN_STACK");

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f22377 = AtomicLongFieldUpdater.newUpdater(ExecutorC7290.class, "parkedWorkersStack");

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f22375 = AtomicLongFieldUpdater.newUpdater(ExecutorC7290.class, "controlState");

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22376 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7290.class, "_isTerminated");

    public ExecutorC7290(int i, int i2, long j) {
        this.f22383 = i;
        this.f22379 = i2;
        this.f22380 = j;
        if (i < 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C18307.m42645(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f22382 = new C16627();
        this.f22384 = new C16627();
        this.parkedWorkersStack = 0L;
        this.f22381 = new C5174(i + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19541(C22812 c22812) {
        long j;
        int m50908;
        if (c22812.m50913() != f22378) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            m50908 = c22812.m50908();
            c22812.m50911(this.f22381.m14829((int) (2097151 & j)));
        } while (!f22377.compareAndSet(this, j, m50908 | ((2097152 + j) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = l.ExecutorC7290.f22376
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof l.C22812
            r3 = 0
            if (r1 == 0) goto L17
            l.᩺ۛ᩵ r0 = (l.C22812) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            l.۟ۛ᩵ r1 = r0.f73652
            boolean r1 = l.C11233.m27802(r1, r8)
            if (r1 == 0) goto L23
            r3 = r0
        L23:
            l.ۚۛ᩵ r0 = r8.f22381
            monitor-enter(r0)
            long r4 = r8.controlState     // Catch: java.lang.Throwable -> L9e
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L59
            r0 = 1
        L31:
            l.ۚۛ᩵ r4 = r8.f22381
            java.lang.Object r4 = r4.m14829(r0)
            l.C11233.m27799(r4)
            l.᩺ۛ᩵ r4 = (l.C22812) r4
            if (r4 == r3) goto L54
        L3e:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L4d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3e
        L4d:
            l.ܺۨ᩵ r4 = r4.f73655
            l.ܽۨ᩵ r5 = r8.f22384
            r4.m37689(r5)
        L54:
            if (r0 == r1) goto L59
            int r0 = r0 + 1
            goto L31
        L59:
            l.ܽۨ᩵ r0 = r8.f22384
            r0.m24246()
            l.ܽۨ᩵ r0 = r8.f22382
            r0.m24246()
        L63:
            if (r3 == 0) goto L6b
            l.ܳۨ᩵ r0 = r3.m50910(r2)
            if (r0 != 0) goto L8d
        L6b:
            l.ܽۨ᩵ r0 = r8.f22382
            java.lang.Object r0 = r0.m24249()
            l.ܳۨ᩵ r0 = (l.AbstractRunnableC14510) r0
            if (r0 != 0) goto L8d
            l.ܽۨ᩵ r0 = r8.f22384
            java.lang.Object r0 = r0.m24249()
            l.ܳۨ᩵ r0 = (l.AbstractRunnableC14510) r0
            if (r0 != 0) goto L8d
            if (r3 == 0) goto L86
            l.ܰۛ᩵ r0 = l.EnumC13639.TERMINATED
            r3.m50912(r0)
        L86:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
            return
        L8d:
            r0.run()     // Catch: java.lang.Throwable -> L91
            goto L63
        L91:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L63
        L9e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ExecutorC7290.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m19540(runnable, C9573.f29033);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19540(Runnable runnable, InterfaceC23683 interfaceC23683) {
        AbstractRunnableC14510 c20862;
        AbstractRunnableC14510 abstractRunnableC14510;
        boolean m24247;
        C9573.f29035.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC14510) {
            c20862 = (AbstractRunnableC14510) runnable;
            c20862.f44493 = nanoTime;
            c20862.f44494 = interfaceC23683;
        } else {
            c20862 = new C20862(runnable, nanoTime, interfaceC23683);
        }
        Thread currentThread = Thread.currentThread();
        C22812 c22812 = null;
        C22812 c228122 = currentThread instanceof C22812 ? (C22812) currentThread : null;
        if (c228122 != null && C11233.m27802(c228122.f73652, this)) {
            c22812 = c228122;
        }
        if (c22812 == null || c22812.f73650 == EnumC13639.TERMINATED || (c20862.f44494.mo18372() == 0 && c22812.f73650 == EnumC13639.BLOCKING)) {
            abstractRunnableC14510 = c20862;
        } else {
            c22812.f73656 = true;
            abstractRunnableC14510 = c22812.f73655.m37688(c20862);
        }
        if (abstractRunnableC14510 != null) {
            if (abstractRunnableC14510.f44494.mo18372() == 1) {
                m24247 = this.f22384.m24247(abstractRunnableC14510);
            } else {
                m24247 = this.f22382.m24247(abstractRunnableC14510);
            }
            if (!m24247) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        if (c20862.f44494.mo18372() != 0) {
            long addAndGet = f22375.addAndGet(this, 2097152L);
            if (m19538() || m19537(addAndGet)) {
                return;
            }
            m19538();
            return;
        }
        m19543();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19543() {
        if (m19538() || m19537(this.controlState)) {
            return;
        }
        m19538();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final boolean m19537(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f22383;
        if (i < i2) {
            int m19539 = m19539();
            if (m19539 == 1 && i2 > 1) {
                m19539();
            }
            if (m19539 > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final int m19539() {
        synchronized (this.f22381) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f22383) {
                return 0;
            }
            if (i >= this.f22379) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f22381.m14829(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C22812 c22812 = new C22812(this, i3);
            this.f22381.m14830(i3, c22812);
            if (i3 != ((int) (2097151 & f22375.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c22812.start();
            return i2 + 1;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int m14828 = this.f22381.m14828();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < m14828; i6++) {
            C22812 c22812 = (C22812) this.f22381.m14829(i6);
            if (c22812 != null) {
                int m37686 = c22812.f73655.m37686();
                int i7 = C11524.f34409[c22812.f73650.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m37686);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m37686);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (m37686 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m37686);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder("DefaultDispatcher@");
        sb4.append(C11024.m27354(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f22383);
        sb4.append(", max = ");
        C5834.m16344(sb4, this.f22379, "}, Worker States {CPU = ", i, ", blocking = ");
        C5834.m16344(sb4, i2, ", parked = ", i3, ", dormant = ");
        C5834.m16344(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f22382.m24248());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f22384.m24248());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f22383 - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19542(C22812 c22812, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object m50913 = c22812.m50913();
                    while (true) {
                        if (m50913 == f22378) {
                            i3 = -1;
                            break;
                        }
                        if (m50913 == null) {
                            i3 = 0;
                            break;
                        }
                        C22812 c228122 = (C22812) m50913;
                        i3 = c228122.m50908();
                        if (i3 != 0) {
                            break;
                        } else {
                            m50913 = c228122.m50913();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f22377.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final boolean m19538() {
        C15050 c15050;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C22812 c22812 = (C22812) this.f22381.m14829((int) (2097151 & j));
            if (c22812 == null) {
                c22812 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object m50913 = c22812.m50913();
                while (true) {
                    c15050 = f22378;
                    if (m50913 == c15050) {
                        i = -1;
                        break;
                    }
                    if (m50913 == null) {
                        i = 0;
                        break;
                    }
                    C22812 c228122 = (C22812) m50913;
                    int m50908 = c228122.m50908();
                    if (m50908 != 0) {
                        i = m50908;
                        break;
                    }
                    m50913 = c228122.m50913();
                }
                if (i >= 0 && f22377.compareAndSet(this, j, i | j2)) {
                    c22812.m50911(c15050);
                }
            }
            if (c22812 == null) {
                return false;
            }
            if (C22812.f73649.compareAndSet(c22812, -1, 0)) {
                LockSupport.unpark(c22812);
                return true;
            }
        }
    }
}
