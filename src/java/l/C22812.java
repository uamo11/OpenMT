package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: FAYC */
/* renamed from: l.᩺ۛ᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22812 extends Thread {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73649 = AtomicIntegerFieldUpdater.newUpdater(C22812.class, "workerCtl");
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC13639 f73650;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73651;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC7290 f73652;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f73653;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f73654;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15921 f73655;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73656;

    public C22812() {
        throw null;
    }

    public C22812(ExecutorC7290 executorC7290, int i) {
        this.f73652 = executorC7290;
        setDaemon(true);
        this.f73655 = new C15921();
        this.f73650 = EnumC13639.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = ExecutorC7290.f22378;
        this.f73651 = AbstractC19700.f63640.mo23493();
        m50914(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50908() {
        return this.indexInArray;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50914(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f73652.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50911(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m50913() {
        return this.nextParkedWorker;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC14510 m50910(boolean z) {
        AbstractRunnableC14510 m50907;
        AbstractRunnableC14510 m509072;
        long j;
        AbstractRunnableC14510 abstractRunnableC14510;
        if (this.f73650 != EnumC13639.CPU_ACQUIRED) {
            ExecutorC7290 executorC7290 = this.f73652;
            do {
                j = executorC7290.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (z) {
                        abstractRunnableC14510 = this.f73655.m37691();
                        if (abstractRunnableC14510 == null) {
                            abstractRunnableC14510 = (AbstractRunnableC14510) this.f73652.f22384.m24249();
                        }
                    } else {
                        abstractRunnableC14510 = (AbstractRunnableC14510) this.f73652.f22384.m24249();
                    }
                    return abstractRunnableC14510 == null ? m50906(true) : abstractRunnableC14510;
                }
            } while (!ExecutorC7290.f22375.compareAndSet(executorC7290, j, j - 4398046511104L));
            this.f73650 = EnumC13639.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m50909(this.f73652.f22383 * 2) == 0;
            if (z2 && (m509072 = m50907()) != null) {
                return m509072;
            }
            AbstractRunnableC14510 m37691 = this.f73655.m37691();
            if (m37691 != null) {
                return m37691;
            }
            if (!z2 && (m50907 = m50907()) != null) {
                return m50907;
            }
        } else {
            AbstractRunnableC14510 m509073 = m50907();
            if (m509073 != null) {
                return m509073;
            }
        }
        return m50906(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50912(EnumC13639 enumC13639) {
        EnumC13639 enumC136392 = this.f73650;
        boolean z = enumC136392 == EnumC13639.CPU_ACQUIRED;
        if (z) {
            ExecutorC7290.f22375.addAndGet(this.f73652, 4398046511104L);
        }
        if (enumC136392 != enumC13639) {
            this.f73650 = enumC13639;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0003, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22812.run():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50909(int i) {
        int i2 = this.f73651;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f73651 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC14510 m50907() {
        int m50909 = m50909(2);
        ExecutorC7290 executorC7290 = this.f73652;
        if (m50909 == 0) {
            AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) executorC7290.f22382.m24249();
            return abstractRunnableC14510 != null ? abstractRunnableC14510 : (AbstractRunnableC14510) executorC7290.f22384.m24249();
        }
        AbstractRunnableC14510 abstractRunnableC145102 = (AbstractRunnableC14510) executorC7290.f22384.m24249();
        return abstractRunnableC145102 != null ? abstractRunnableC145102 : (AbstractRunnableC14510) executorC7290.f22382.m24249();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC14510 m50906(boolean z) {
        long m37690;
        int i = (int) (this.f73652.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int m50909 = m50909(i);
        ExecutorC7290 executorC7290 = this.f73652;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            m50909++;
            if (m50909 > i) {
                m50909 = 1;
            }
            C22812 c22812 = (C22812) executorC7290.f22381.m14829(m50909);
            if (c22812 != null && c22812 != this) {
                if (z) {
                    m37690 = this.f73655.m37687(c22812.f73655);
                } else {
                    m37690 = this.f73655.m37690(c22812.f73655);
                }
                if (m37690 == -1) {
                    return this.f73655.m37691();
                }
                if (m37690 > 0) {
                    j = Math.min(j, m37690);
                }
            }
        }
        if (j == C13132.FOREVER_NS) {
            j = 0;
        }
        this.f73654 = j;
        return null;
    }
}
