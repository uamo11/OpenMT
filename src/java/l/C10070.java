package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* compiled from: K6UK */
/* renamed from: l.ۤۙᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10070 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f30271;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f30272;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RunnableC21318 f30273;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f30274;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15007 f30275;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f30276;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30277;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20194 f30278;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f30279;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5795 f30280;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30281;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C8617 f30282;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21605 f30283;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Thread f30284;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30286;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f30287;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12891 f30288;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f30289;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30291;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Throwable f30292;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30293;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f30294;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f30290 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f30285 = new FutureC3575();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m25276(final C5795 c5795, boolean z) {
        if (this.f30281) {
            return m25271(new IllegalStateException("Persistence coordinator is closed"));
        }
        Throwable th = this.f30292;
        if (th != null) {
            return m25271(th);
        }
        FutureC3575 futureC3575 = this.f30279;
        if (futureC3575 == null) {
            this.f30280 = c5795;
            this.f30291 = z;
            this.f30279 = new FutureC3575();
            m25273();
            return this.f30279;
        }
        if (z) {
            return FutureC3575.m10905(-1L);
        }
        if (!this.f30291) {
            return futureC3575;
        }
        return futureC3575.m10927(new InterfaceC21423() { // from class: l.᩶ۙᩳ
            @Override // l.InterfaceC21423
            public final Object apply(Object obj) {
                FutureC3575 m25276;
                C10070 c10070 = C10070.this;
                C5795 c57952 = c5795;
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return FutureC3575.m10905(l2);
                }
                synchronized (c10070) {
                    m25276 = c10070.m25276(c57952, false);
                }
                return m25276;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C4425 m25277(C8617 c8617, C21605 c21605) {
        C4425 c4425;
        if (this.f30281 || this.f30292 != null || this.f30284 != Thread.currentThread() || c8617.m22370() < this.f30277 || c8617.m22370() < this.f30282.m22370()) {
            throw new IllegalStateException("Recovery generation cannot replace current writer");
        }
        c4425 = new C4425(this, c8617, c21605);
        c21605.m48811();
        return c4425;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25279(Throwable th) {
        this.f30292 = th;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25281(RunnableC21318 runnableC21318) {
        if (!this.f30281 && this.f30292 == null) {
            this.f30273 = runnableC21318;
            m25273();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25283() {
        if (this.f30281) {
            throw new IllegalStateException("Persistence coordinator is closed");
        }
        if (this.f30292 != null) {
            throw new IllegalStateException("Persistence requires reopening", this.f30292);
        }
        this.f30293 = true;
        this.f30274 = false;
        m25273();
    }

    public C10070(C8617 c8617, C21605 c21605, C20194 c20194, C12891 c12891) {
        this.f30282 = c8617;
        this.f30283 = c21605;
        this.f30288 = c12891;
        this.f30278 = c20194;
        try {
            c21605.m48811();
            this.f30277 = c8617.m22370();
        } catch (RuntimeException e) {
            c20194.close();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25280(l.C15007 r12, long r13) {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r0 = r11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L69
            boolean r3 = r11.f30281     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L5e
            java.lang.Throwable r3 = r11.f30292     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L54
            long r3 = r12.f45764     // Catch: java.lang.Throwable -> L66
            long r5 = r11.f30277     // Catch: java.lang.Throwable -> L66
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L4c
            r3 = 0
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 < 0) goto L4c
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L66
            l.ܶۙᩳ r5 = r11.f30275     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L24
            r11.f30286 = r3     // Catch: java.lang.Throwable -> L66
        L24:
            r11.f30294 = r3     // Catch: java.lang.Throwable -> L66
            long r3 = r11.f30287     // Catch: java.lang.Throwable -> L66
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r6 - r3
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 <= 0) goto L34
            goto L36
        L34:
            long r6 = r3 + r13
        L36:
            r11.f30287 = r6     // Catch: java.lang.Throwable -> L66
            r11.f30275 = r12     // Catch: java.lang.Throwable -> L49
            long r13 = r12.f45764     // Catch: java.lang.Throwable -> L49
            r11.f30277 = r13     // Catch: java.lang.Throwable -> L49
            r2 = 1
            r11.m25273()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L48
            r5.close()
        L48:
            return
        L49:
            r13 = move-exception
            r1 = r5
            goto L67
        L4c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Invalid persistence request"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L54:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Persistence requires reopening"
            java.lang.Throwable r3 = r11.f30292     // Catch: java.lang.Throwable -> L66
            r13.<init>(r14, r3)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L5e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Persistence coordinator is closed"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L66:
            r13 = move-exception
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L69
        L69:
            r13 = move-exception
            if (r1 == 0) goto L6f
            r1.close()
        L6f:
            if (r2 != 0) goto L74
            r12.close()
        L74:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10070.m25280(l.ܶۙᩳ, long):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m25275(long j) {
        synchronized (this) {
            Throwable th = this.f30292;
            if (th != null) {
                return m25271(th);
            }
            if (j >= 0 && j <= this.f30277) {
                long m22370 = this.f30282.m22370();
                if (j <= m22370) {
                    return FutureC3575.m10905(Long.valueOf(m22370));
                }
                if (this.f30281) {
                    return m25271(new IllegalStateException("Persistence coordinator is closed"));
                }
                C5378.removeIf(this.f30290, new C22064());
                if (this.f30290.size() >= this.f30288.f38700) {
                    return m25271(new RejectedExecutionException("Persistence waiter limit reached"));
                }
                FutureC3575 futureC3575 = new FutureC3575();
                this.f30290.add(new C12186(j, futureC3575));
                this.f30293 = true;
                this.f30274 = false;
                m25273();
                return futureC3575;
            }
            return m25271(new IllegalArgumentException("Unknown session revision"));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m25282() {
        return this.f30282.m22370();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m25284() {
        return this.f30285;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩸ۙᩳ] */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25273() {
        if (this.f30281 || this.f30271 || this.f30292 != null) {
            return;
        }
        if (this.f30280 == null && this.f30273 == null && (this.f30274 || this.f30275 == null)) {
            return;
        }
        long nanoTime = System.nanoTime();
        long j = 0;
        if (this.f30280 == null && this.f30273 == null && !this.f30293) {
            long j2 = this.f30287;
            C12891 c12891 = this.f30288;
            if (j2 < c12891.f38698) {
                j = Math.max(0L, Math.min(c12891.f38697 - (nanoTime - this.f30294), c12891.f38699 - (nanoTime - this.f30286)));
            }
        }
        ScheduledFuture scheduledFuture = this.f30272;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        final long j3 = this.f30276 + 1;
        this.f30276 = j3;
        this.f30272 = this.f30278.m46430(new Runnable() { // from class: l.᩸ۙᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C10070.m25268(C10070.this, j3);
            }
        }, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[Catch: all -> 0x0138, TryCatch #1 {, blocks: (B:42:0x008e, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:49:0x00a8, B:50:0x00ae, B:52:0x00b4, B:54:0x00bc, B:57:0x00c2, B:63:0x00c9, B:65:0x00d0, B:69:0x00d7, B:70:0x00d9), top: B:41:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7 A[Catch: all -> 0x0138, TryCatch #1 {, blocks: (B:42:0x008e, B:44:0x0092, B:46:0x0096, B:48:0x009c, B:49:0x00a8, B:50:0x00ae, B:52:0x00b4, B:54:0x00bc, B:57:0x00c2, B:63:0x00c9, B:65:0x00d0, B:69:0x00d7, B:70:0x00d9), top: B:41:0x008e }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m25268(l.C10070 r12, long r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10070.m25268(l.ۤۙᩳ, long):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25266(Runnable runnable) {
        boolean z = false;
        try {
            runnable.run();
            synchronized (this) {
                this.f30271 = false;
                m25273();
                if (this.f30281 && !this.f30289) {
                    z = true;
                }
                if (z) {
                    this.f30289 = true;
                }
            }
            if (z) {
                m25274();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f30271 = false;
                m25273();
                if (this.f30281 && !this.f30289) {
                    z = true;
                }
                if (z) {
                    this.f30289 = true;
                }
                if (z) {
                    m25274();
                }
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25267(InterfaceC3014 interfaceC3014) {
        long j;
        Error error;
        FutureC3575 futureC3575;
        Throwable th;
        boolean z;
        C15007 c15007 = null;
        try {
            j = interfaceC3014.run();
            error = null;
        } catch (Throwable th2) {
            j = -1;
            error = th2;
        }
        ArrayList arrayList = new ArrayList();
        long m22370 = this.f30282.m22370();
        synchronized (this) {
            this.f30271 = false;
            this.f30284 = null;
            futureC3575 = this.f30279;
            this.f30279 = null;
            th = this.f30292;
            C15007 c150072 = this.f30275;
            if (c150072 != null && c150072.f45764 <= m22370) {
                this.f30275 = null;
                this.f30287 = 0L;
                this.f30293 = false;
                c15007 = c150072;
            }
            Iterator it = this.f30290.iterator();
            while (it.hasNext()) {
                C12186 c12186 = (C12186) it.next();
                if (th != null || c12186.f36336 <= m22370) {
                    arrayList.add(c12186);
                    it.remove();
                }
            }
            m25273();
            z = this.f30281 && !this.f30289;
            if (z) {
                this.f30289 = true;
            }
        }
        if (c15007 != null) {
            try {
                c15007.close();
            } catch (Throwable th3) {
                if (z) {
                    m25274();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C12186 c121862 = (C12186) it2.next();
                    if (th == null) {
                        c121862.f36335.m10912(Long.valueOf(m22370));
                    } else {
                        c121862.f36335.m10914(th);
                    }
                }
                if (error == null) {
                    futureC3575.m10912(Long.valueOf(j));
                    throw th3;
                }
                futureC3575.m10914((Throwable) error);
                throw th3;
            }
        }
        if (z) {
            m25274();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C12186 c121863 = (C12186) it3.next();
            if (th == null) {
                c121863.f36335.m10912(Long.valueOf(m22370));
            } else {
                c121863.f36335.m10914(th);
            }
        }
        if (error == null) {
            futureC3575.m10912(Long.valueOf(j));
        } else {
            futureC3575.m10914((Throwable) error);
        }
        if (error instanceof Error) {
            throw error;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25278() {
        synchronized (this) {
            if (this.f30281) {
                return;
            }
            this.f30281 = true;
            ScheduledFuture scheduledFuture = this.f30272;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f30272 = null;
            this.f30276++;
            C15007 c15007 = this.f30275;
            this.f30275 = null;
            ArrayList arrayList = new ArrayList(this.f30290);
            this.f30290.clear();
            FutureC3575 futureC3575 = this.f30280 != null ? this.f30279 : null;
            this.f30280 = null;
            this.f30273 = null;
            if (futureC3575 != null) {
                this.f30279 = null;
            }
            boolean z = this.f30271;
            if (!z) {
                this.f30289 = true;
            }
            if (c15007 != null) {
                try {
                    c15007.close();
                } finally {
                    if (!z) {
                        m25274();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C12186) it.next()).f36335.m10914((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                    if (futureC3575 != null) {
                        futureC3575.m10914((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m25274() {
        C20194 c20194 = this.f30278;
        try {
            this.f30283.m48812();
            c20194.close();
            th = null;
        } catch (Throwable th) {
            th = th;
            c20194.close();
        }
        FutureC3575 futureC3575 = this.f30285;
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m25271(Throwable th) {
        FutureC3575 futureC3575 = new FutureC3575();
        futureC3575.m10914(th);
        return futureC3575;
    }
}
