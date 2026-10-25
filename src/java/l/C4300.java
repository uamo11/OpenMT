package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: E177 */
/* renamed from: l.ۙ֡ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4300 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedList f13868 = new LinkedList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13869 = new AtomicBoolean(false);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13867 = new AtomicBoolean(false);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f13872 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f13871 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f13870 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f13866 = false;

    public C4300() {
    }

    public C4300(int i) {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12878() {
        synchronized (this.f13870) {
            if (this.f13869.get()) {
                return;
            }
            this.f13867.set(true);
            this.f13869.set(true);
            this.f13871 = System.currentTimeMillis();
            this.f13872 = 0L;
            this.f13868.clear();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12879() {
        synchronized (this.f13870) {
            this.f13869.set(false);
            this.f13868.clear();
            this.f13872 = 0L;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12877(long j) {
        if (j <= 0 || !this.f13869.get()) {
            return;
        }
        synchronized (this.f13870) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.f13868.isEmpty()) {
                C19823 c19823 = (C19823) this.f13868.getLast();
                if (currentTimeMillis - c19823.f64055 < 50) {
                    c19823.f64054 += j;
                    m12875(currentTimeMillis);
                    return;
                }
            }
            this.f13868.addLast(new C19823(currentTimeMillis, j));
            m12875(currentTimeMillis);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m12876() {
        long j;
        if (!this.f13869.get()) {
            return 0L;
        }
        synchronized (this.f13870) {
            m12875(System.currentTimeMillis());
            j = this.f13872;
            if (this.f13866) {
                j += Math.min(j / 12, 5242880L);
            }
        }
        return j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m12875(long j) {
        if (j - this.f13871 < 500) {
            return;
        }
        this.f13871 = j;
        LinkedList linkedList = this.f13868;
        if (linkedList.isEmpty()) {
            this.f13872 = 0L;
            return;
        }
        long j2 = j - 2000;
        while (!linkedList.isEmpty() && ((C19823) linkedList.getFirst()).f64055 < j2) {
            linkedList.removeFirst();
        }
        long j3 = ((C19823) linkedList.getFirst()).f64055;
        Iterator it = linkedList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C19823) it.next()).f64054;
        }
        long j5 = j - j3;
        AtomicBoolean atomicBoolean = this.f13867;
        if (atomicBoolean.get()) {
            if (j5 < 200) {
                this.f13872 = 0L;
                this.f13871 = j - 400;
                return;
            }
            atomicBoolean.set(false);
        }
        if (j5 == 0) {
            this.f13872 = 0L;
            return;
        }
        long j6 = (j4 * 1000) / j5;
        long j7 = this.f13872;
        if (j7 == 0 || j6 > j7) {
            this.f13872 = j6;
        } else {
            this.f13872 = Math.round((j7 * 0.19999999999999996d) + (j6 * 0.8d));
        }
        if (this.f13872 < 0) {
            this.f13872 = 0L;
        }
    }
}
