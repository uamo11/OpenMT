package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: K29L */
/* renamed from: l.ܺۨ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15921 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49176 = AtomicReferenceFieldUpdater.newUpdater(C15921.class, Object.class, "lastScheduledTask");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49175 = AtomicIntegerFieldUpdater.newUpdater(C15921.class, "producerIndex");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49174 = AtomicIntegerFieldUpdater.newUpdater(C15921.class, "consumerIndex");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49173 = AtomicIntegerFieldUpdater.newUpdater(C15921.class, "blockingTasksInBuffer");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceArray f49177 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    public volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37686() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC14510 m37691() {
        AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) f49176.getAndSet(this, null);
        return abstractRunnableC14510 == null ? m37685() : abstractRunnableC14510;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC14510 m37688(AbstractRunnableC14510 abstractRunnableC14510) {
        AbstractRunnableC14510 abstractRunnableC145102 = (AbstractRunnableC14510) f49176.getAndSet(this, abstractRunnableC14510);
        if (abstractRunnableC145102 == null) {
            return null;
        }
        if (abstractRunnableC145102.f44494.mo18372() == 1) {
            f49173.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC145102;
        }
        int i = this.producerIndex & 127;
        while (this.f49177.get(i) != null) {
            Thread.yield();
        }
        this.f49177.lazySet(i, abstractRunnableC145102);
        f49175.incrementAndGet(this);
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m37690(C15921 c15921) {
        AbstractRunnableC14510 m37685 = c15921.m37685();
        if (m37685 != null) {
            m37688(m37685);
            return -1L;
        }
        return m37684(c15921, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m37687(C15921 c15921) {
        int i = c15921.producerIndex;
        AtomicReferenceArray atomicReferenceArray = c15921.f49177;
        for (int i2 = c15921.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c15921.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) atomicReferenceArray.get(i3);
            if (abstractRunnableC14510 != null && abstractRunnableC14510.f44494.mo18372() == 1) {
                while (!atomicReferenceArray.compareAndSet(i3, abstractRunnableC14510, null)) {
                    if (atomicReferenceArray.get(i3) != abstractRunnableC14510) {
                        break;
                    }
                }
                f49173.decrementAndGet(c15921);
                m37688(abstractRunnableC14510);
                return -1L;
            }
        }
        return m37684(c15921, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37689(C16627 c16627) {
        AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) f49176.getAndSet(this, null);
        if (abstractRunnableC14510 != null) {
            c16627.m24247(abstractRunnableC14510);
        }
        while (true) {
            AbstractRunnableC14510 m37685 = m37685();
            if (m37685 == null) {
                return;
            } else {
                c16627.m24247(m37685);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final long m37684(C15921 c15921, boolean z) {
        while (true) {
            AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) c15921.lastScheduledTask;
            if (abstractRunnableC14510 == null) {
                return -2L;
            }
            if (z && abstractRunnableC14510.f44494.mo18372() != 1) {
                return -2L;
            }
            C9573.f29035.getClass();
            long nanoTime = System.nanoTime() - abstractRunnableC14510.f44493;
            long j = C9573.f29031;
            if (nanoTime < j) {
                return j - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49176;
            while (!atomicReferenceFieldUpdater.compareAndSet(c15921, abstractRunnableC14510, null)) {
                if (atomicReferenceFieldUpdater.get(c15921) != abstractRunnableC14510) {
                    break;
                }
            }
            m37688(abstractRunnableC14510);
            return -1L;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC14510 m37685() {
        AbstractRunnableC14510 abstractRunnableC14510;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f49174.compareAndSet(this, i, i + 1) && (abstractRunnableC14510 = (AbstractRunnableC14510) this.f49177.getAndSet(i2, null)) != null) {
                if (abstractRunnableC14510.f44494.mo18372() == 1) {
                    f49173.decrementAndGet(this);
                }
                return abstractRunnableC14510;
            }
        }
    }
}
