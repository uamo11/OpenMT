package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: 2AYL */
/* renamed from: l.᩵۬᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19491 extends AbstractC0439 implements InterfaceC17373 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62988 = AtomicReferenceFieldUpdater.newUpdater(AbstractC19491.class, Object.class, "_queue");

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62989 = AtomicReferenceFieldUpdater.newUpdater(AbstractC19491.class, Object.class, "_delayed");
    public volatile /* synthetic */ Object _queue = null;
    public volatile /* synthetic */ Object _delayed = null;
    public volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m44897(AbstractC19491 abstractC19491) {
        return abstractC19491._isCompleted;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44901(long j, AbstractRunnableC3968 abstractRunnableC3968) {
        int m12005;
        Thread mo1995;
        if (this._isCompleted != 0) {
            m12005 = 1;
        } else {
            C18785 c18785 = (C18785) this._delayed;
            if (c18785 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62989;
                C18785 c187852 = new C18785();
                c187852.f59299 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c187852) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                C11233.m27799(obj);
                c18785 = (C18785) obj;
            }
            m12005 = abstractRunnableC3968.m12005(j, c18785, (RunnableC16667) this);
        }
        if (m12005 != 0) {
            if (m12005 == 1) {
                mo1994(j, abstractRunnableC3968);
                return;
            } else {
                if (m12005 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C18785 c187853 = (C18785) this._delayed;
        if ((c187853 != null ? (AbstractRunnableC3968) c187853.m29730() : null) != abstractRunnableC3968 || Thread.currentThread() == (mo1995 = mo1995())) {
            return;
        }
        LockSupport.unpark(mo1995);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44900() {
        C15050 c15050;
        if (!m8097()) {
            return false;
        }
        C18785 c18785 = (C18785) this._delayed;
        if (c18785 != null && !c18785.m29729()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C15756) {
            return ((C15756) obj).m37154();
        }
        c15050 = C5379.f16732;
        return obj == c15050;
    }

    @Override // l.AbstractC2557
    public void shutdown() {
        C15050 c15050;
        AbstractRunnableC3968 abstractRunnableC3968;
        C15050 c150502;
        C2537.m8048();
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            if (obj != null) {
                if (!(obj instanceof C15756)) {
                    c150502 = C5379.f16732;
                    if (obj != c150502) {
                        C15756 c15756 = new C15756(8, true);
                        c15756.m37151((Runnable) obj);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62988;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c15756)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C15756) obj).m37152();
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f62988;
            c15050 = C5379.f16732;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, c15050)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m44899() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            C18785 c18785 = (C18785) this._delayed;
            if (c18785 == null || (abstractRunnableC3968 = (AbstractRunnableC3968) c18785.m29731()) == null) {
                return;
            } else {
                mo1994(nanoTime, abstractRunnableC3968);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (((l.C15756) r0).m37154() == false) goto L76;
     */
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m44899() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC19491.m44899():long");
    }

    @Override // l.AbstractC2975
    /* renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        mo39181(runnable);
    }

    /* renamed from: ֫ */
    public void mo39181(Runnable runnable) {
        if (m44898(runnable)) {
            Thread mo1995 = mo1995();
            if (Thread.currentThread() != mo1995) {
                LockSupport.unpark(mo1995);
                return;
            }
            return;
        }
        RunnableC16667.f51171.mo39181(runnable);
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m44902() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m44898(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5._queue
            int r1 = r5._isCompleted
            if (r1 == 0) goto L7
            goto L48
        L7:
            r1 = 1
            if (r0 != 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = l.AbstractC19491.f62988
        Lc:
            r0 = 0
            boolean r0 = r2.compareAndSet(r5, r0, r6)
            if (r0 == 0) goto L14
            goto L62
        L14:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == 0) goto Lc
            goto L0
        L1b:
            boolean r2 = r0 instanceof l.C15756
            if (r2 == 0) goto L42
            r2 = r0
            l.ܺۛ᩵ r2 = (l.C15756) r2
            int r3 = r2.m37151(r6)
            if (r3 == 0) goto L62
            if (r3 == r1) goto L2e
            r0 = 2
            if (r3 == r0) goto L48
            goto L0
        L2e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = l.AbstractC19491.f62988
            l.ܺۛ᩵ r2 = r2.m37156()
        L34:
            boolean r1 = r3.compareAndSet(r5, r0, r2)
            if (r1 == 0) goto L3b
            goto L0
        L3b:
            java.lang.Object r1 = r3.get(r5)
            if (r1 == r0) goto L34
            goto L0
        L42:
            l.ܶۛ᩵ r2 = l.C5379.m15351()
            if (r0 != r2) goto L4a
        L48:
            r6 = 0
            return r6
        L4a:
            l.ܺۛ᩵ r2 = new l.ܺۛ᩵
            r3 = 8
            r2.<init>(r3, r1)
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.m37151(r3)
            r2.m37151(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = l.AbstractC19491.f62988
        L5c:
            boolean r4 = r3.compareAndSet(r5, r0, r2)
            if (r4 == 0) goto L63
        L62:
            return r1
        L63:
            java.lang.Object r4 = r3.get(r5)
            if (r4 == r0) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC19491.m44898(java.lang.Runnable):boolean");
    }
}
