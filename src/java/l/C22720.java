package l;

import android.content.Context;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: M799 */
/* renamed from: l.᩺ۗۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22720 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f73404;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Executor f73405;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f73406;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20177 f73407;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11432 f73408;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f73409;

    public C22720(Context context) {
        ExecutorService executorService = C1802.f6208;
        C20177 c20177 = new C20177();
        this.f73409 = new Object();
        this.f73404 = context.getApplicationContext();
        this.f73405 = executorService;
        this.f73407 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50778(InterfaceC17889 interfaceC17889, C12053 c12053, long j, int i, InterfaceC22015 interfaceC22015) {
        String m29435 = c12053.m29435();
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null) {
                if (c11432.f34192 == i) {
                    InterfaceC17889 interfaceC178892 = c11432.f34200;
                    String str = null;
                    String path = interfaceC178892 == null ? null : interfaceC178892.getPath();
                    if (interfaceC17889 != null) {
                        str = interfaceC17889.getPath();
                    }
                    if (C11003.equals(path, str) && C11003.equals(this.f73408.f34191, m29435)) {
                        C11432 c114322 = this.f73408;
                        c114322.f34200 = interfaceC17889;
                        c114322.f34194 = c12053;
                        c114322.f34191 = m29435;
                        c114322.f34198 = j;
                        c114322.f34189 = interfaceC22015;
                        if (c114322.f34190 == null && !this.f73406) {
                            c114322.f34197 = false;
                        }
                        return;
                    }
                }
            }
            C11432 c114323 = this.f73408;
            m50771(c114323);
            this.f73408 = new C11432(interfaceC17889, c12053, m29435, j, i, interfaceC22015);
            if (!this.f73406 && c114323 != null && c114323.f34190 != null) {
                this.f73406 = true;
                this.f73405.execute(new RunnableC0141(this, c114323));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50776(int i, int i2, long j) {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 == null) {
                return;
            }
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            int i3 = c11432.f34192;
            int i4 = c11432.f34199;
            long j2 = c11432.f34198;
            long max3 = Math.max(1L, 1000L);
            if (j2 <= 0) {
                j2 = C13132.FOREVER_NS;
            }
            C5787 c5787 = new C5787(i3, i4, max, max2, (Math.max(0L, Math.min(j, j2)) / max3) * max3);
            if (c5787.equals(c11432.f34196)) {
                return;
            }
            c11432.f34202 = c5787;
            if (!this.f73406) {
                m50773();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50775() {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null) {
                c11432.f34199++;
                c11432.f34202 = null;
                c11432.f34195 = true;
                if (!this.f73406) {
                    m50773();
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50779() {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null && !c11432.f34197) {
                if (c11432.f34190 != null || this.f73406) {
                    m50771(c11432);
                    if (!this.f73406) {
                        m50773();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50777(Runnable runnable) {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null) {
                m50771(c11432);
                c11432.f34193.add(runnable);
                if (!this.f73406) {
                    m50773();
                }
                return;
            }
            Object[] objArr = {runnable};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            arrayList.add(obj);
            List unmodifiableList = C20195.unmodifiableList(arrayList);
            this.f73406 = true;
            this.f73405.execute(new RunnableC0847(this, unmodifiableList));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m50771(C11432 c11432) {
        if (c11432 == null) {
            return;
        }
        c11432.f34199++;
        c11432.f34202 = null;
        c11432.f34195 = false;
        c11432.f34197 = true;
        c11432.f34201 = false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m50773() {
        List list;
        final C11432 c11432 = this.f73408;
        if (c11432 == null) {
            return;
        }
        boolean z = c11432.f34197;
        Executor executor = this.f73405;
        if (z && c11432.f34190 != null) {
            this.f73406 = true;
            executor.execute(new RunnableC0141(this, c11432));
            return;
        }
        if (z && c11432.f34190 == null) {
            c11432.f34197 = false;
            ArrayList arrayList = c11432.f34193;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                this.f73406 = true;
                executor.execute(new RunnableC0847(this, list));
                return;
            }
        }
        if (c11432.f34195) {
            final InterfaceC12842 interfaceC12842 = c11432.f34190;
            c11432.f34195 = false;
            if (interfaceC12842 != null && interfaceC12842.mo9070()) {
                this.f73406 = true;
                executor.execute(new Runnable() { // from class: l.ۚۗۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22720.m50766(C22720.this, interfaceC12842, c11432);
                    }
                });
                return;
            }
        }
        C5787 c5787 = c11432.f34202;
        if (c5787 == null) {
            return;
        }
        c11432.f34202 = null;
        c11432.f34196 = c5787;
        this.f73406 = true;
        executor.execute(new RunnableC7341(this, c11432, c5787));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50762(C22720 c22720, C11432 c11432) {
        c22720.m50767(c11432);
        c22720.m50774(c11432);
        c22720.m50770();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50766(C22720 c22720, InterfaceC12842 interfaceC12842, C11432 c11432) {
        try {
            interfaceC12842.mo9071();
        } catch (Throwable unused) {
        }
        if (c22720.m50772(c11432)) {
            c22720.m50767(c11432);
            c22720.m50774(c11432);
        }
        c22720.m50770();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50764(final l.C22720 r8, final l.C11432 r9, final l.C5787 r10) {
        /*
            r1 = 0
            l.۬ۗۜ r0 = r8.m50757(r9)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            long r2 = l.C5787.m16257(r10)     // Catch: java.lang.Throwable -> L25
            r4 = 1000(0x3e8, double:4.94E-321)
            long r3 = r2 * r4
            int r5 = l.C5787.m16256(r10)     // Catch: java.lang.Throwable -> L25
            int r6 = l.C5787.m16254(r10)     // Catch: java.lang.Throwable -> L25
            l.۠ۗۜ r7 = new l.۠ۗۜ     // Catch: java.lang.Throwable -> L25
            r7.<init>()     // Catch: java.lang.Throwable -> L25
            r2 = r0
            android.graphics.Bitmap r2 = r2.mo9068(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
            r8.m50759(r9, r0)     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r2 = r1
        L26:
            r8.m50758(r9, r10, r2)
            java.lang.Object r10 = r8.f73409
            r0 = r10
            monitor-enter(r0)
            r9.f34196 = r1     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            boolean r10 = r8.m50772(r9)
            if (r10 == 0) goto L3c
            r8.m50767(r9)
            r8.m50774(r9)
        L3c:
            r8.m50770()
            return
        L40:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22720.m50764(l.᩺ۗۜ, l.ۨۗۜ, l.ۛۗۜ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.InterfaceC12842 m50757(l.C11432 r8) {
        /*
            r7 = this;
            l.۬ۗۜ r0 = r8.f34190
            if (r0 == 0) goto L5
            return r0
        L5:
            l.᩶۫᩷ r0 = r7.f73407
            android.content.Context r1 = r7.f73404
            l.۫֡ۜ r2 = r8.f34194
            long r3 = r8.f34198
            r0.getClass()
            boolean r0 = r2.m29438()
            if (r0 == 0) goto L2e
            int r0 = l.C23068.f74198
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L2e
            l.ۤۗۜ r0 = new l.ۤۗۜ     // Catch: java.lang.Throwable -> L2e
            l.᩺ܶۜ r3 = l.C23068.m51227(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            l.۬ۗۜ r0 = l.C12137.m29563(r1, r2)
        L32:
            r1 = r0
            java.lang.Object r0 = r7.f73409
            monitor-enter(r0)
            boolean r2 = r8.f34197     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L43
            l.ۨۗۜ r2 = r7.f73408     // Catch: java.lang.Throwable -> L49
            if (r2 == r8) goto L3f
            goto L43
        L3f:
            r8.f34190 = r1     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return r1
        L43:
            r1.mo9069()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r8 = 0
            return r8
        L49:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22720.m50757(l.ۨۗۜ):l.۬ۗۜ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50769(C22720 c22720, C11432 c11432, C5787 c5787) {
        int i;
        synchronized (c22720.f73409) {
            if (!Thread.currentThread().isInterrupted() && c22720.f73408 == c11432 && !c11432.f34197) {
                int i2 = c11432.f34199;
                i = c5787.f17812;
                if (i2 == i) {
                }
            }
            throw new InterruptedIOException("Video preview request was canceled");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50759(final C11432 c11432, InterfaceC12842 interfaceC12842) {
        C13547 c13547;
        synchronized (this.f73409) {
            if (c11432.f34201) {
                return;
            }
            c11432.f34201 = true;
            try {
                c13547 = interfaceC12842.mo9072();
            } catch (Throwable unused) {
                c13547 = null;
            }
            final C13547 c135472 = c13547;
            if (c135472 == null) {
                return;
            }
            synchronized (this.f73409) {
                if (this.f73408 == c11432 && !c11432.f34197) {
                    final int i = c11432.f34192;
                    final int i2 = c11432.f34199;
                    C4925.m14315(new Runnable() { // from class: l.ܶۗۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22720.m50763(C22720.this, c11432, i2, i, c135472);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50763(C22720 c22720, C11432 c11432, int i, int i2, C13547 c13547) {
        synchronized (c22720.f73409) {
            if (c22720.f73408 == c11432 && c11432.f34199 == i && c11432.f34192 == i2 && !c11432.f34197) {
                c11432.f34189.mo5885(i2, c13547);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:12:0x001c, B:15:0x001e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x0028, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:12:0x001c, B:15:0x001e), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m50758(final l.C11432 r4, final l.C5787 r5, final android.graphics.Bitmap r6) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f73409
            monitor-enter(r0)
            l.ۨۗۜ r1 = r3.f73408     // Catch: java.lang.Throwable -> L28
            if (r1 != r4) goto L19
            int r1 = r4.f34199     // Catch: java.lang.Throwable -> L28
            int r2 = l.C5787.m16253(r5)     // Catch: java.lang.Throwable -> L28
            if (r1 != r2) goto L19
            int r1 = r4.f34192     // Catch: java.lang.Throwable -> L28
            int r2 = l.C5787.m16255(r5)     // Catch: java.lang.Throwable -> L28
            if (r1 != r2) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            l.᩸ۗۜ r0 = new l.᩸ۗۜ
            r0.<init>()
            l.C4925.m14315(r0)
            return
        L28:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22720.m50758(l.ۨۗۜ, l.ۛۗۜ, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0029, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:12:0x001c, B:15:0x001e, B:16:0x0020), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:12:0x001c, B:15:0x001e, B:16:0x0020), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50765(l.C22720 r2, l.C11432 r3, l.C5787 r4, android.graphics.Bitmap r5) {
        /*
            java.lang.Object r0 = r2.f73409
            monitor-enter(r0)
            l.ۨۗۜ r2 = r2.f73408     // Catch: java.lang.Throwable -> L29
            if (r2 != r3) goto L19
            int r2 = r3.f34199     // Catch: java.lang.Throwable -> L29
            int r1 = l.C5787.m16253(r4)     // Catch: java.lang.Throwable -> L29
            if (r2 != r1) goto L19
            int r2 = r3.f34192     // Catch: java.lang.Throwable -> L29
            int r1 = l.C5787.m16255(r4)     // Catch: java.lang.Throwable -> L29
            if (r2 != r1) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 != 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L1e:
            l.᩹ۗۜ r2 = r3.f34189     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            int r3 = l.C5787.m16255(r4)
            r2.mo5884(r3, r5)
            return
        L29:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22720.m50765(l.᩺ۗۜ, l.ۨۗۜ, l.ۛۗۜ, android.graphics.Bitmap):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m50772(C11432 c11432) {
        boolean z;
        synchronized (this.f73409) {
            z = c11432.f34197;
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50767(C11432 c11432) {
        InterfaceC12842 interfaceC12842;
        synchronized (this.f73409) {
            interfaceC12842 = c11432.f34190;
            c11432.f34190 = null;
            c11432.f34197 = false;
            c11432.f34201 = false;
        }
        m50768(interfaceC12842);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m50774(C11432 c11432) {
        List list;
        synchronized (this.f73409) {
            ArrayList arrayList = c11432.f34193;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50761(C22720 c22720, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c22720.m50770();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50770() {
        synchronized (this.f73409) {
            this.f73406 = false;
            m50773();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50768(InterfaceC12842 interfaceC12842) {
        if (interfaceC12842 != null) {
            interfaceC12842.mo9069();
        }
    }
}
