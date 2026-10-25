package l;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: I4F9 */
/* renamed from: l.᩹ۧ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22235 implements Closeable {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f72139 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C20032.m46177("OkHttp Http2Connection", true));

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C1938 f72140;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f72142;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f72145;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f72146;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C6007 f72147;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f72148;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C1938 f72149;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0362 f72153;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72154;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f72155;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C21530 f72156;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7418 f72157;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f72158;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f72161;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72162;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Socket f72163;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f72144 = new LinkedHashMap();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f72143 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f72150 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f72141 = 0;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f72151 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f72160 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f72152 = 0;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f72159 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m49910(AbstractRunnableC15091 abstractRunnableC15091) {
        if (!this.f72154) {
            this.f72155.execute(abstractRunnableC15091);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m49922() {
        return this.f72149.m6395();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C10241 m49923(int i) {
        return (C10241) this.f72144.get(Integer.valueOf(i));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C10241 m49934(int i) {
        C10241 c10241;
        c10241 = (C10241) this.f72144.remove(Integer.valueOf(i));
        notifyAll();
        return c10241;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49936(long j) {
        if (this.f72154) {
            return false;
        }
        if (this.f72151 < this.f72141) {
            if (j >= this.f72152) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49939(long j) {
        long j2 = this.f72159 + j;
        this.f72159 = j2;
        if (j2 >= this.f72140.m6393() / 2) {
            m49926(0, this.f72159);
            this.f72159 = 0L;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49913(C22235 c22235) {
        c22235.f72160++;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49917(C22235 c22235) {
        c22235.f72150++;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49918(C22235 c22235) {
        c22235.f72143++;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49920(C22235 c22235) {
        c22235.f72151++;
    }

    public C22235(C3891 c3891) {
        C1938 c1938 = new C1938();
        this.f72140 = c1938;
        C1938 c19382 = new C1938();
        this.f72149 = c19382;
        this.f72142 = new LinkedHashSet();
        this.f72157 = InterfaceC7418.f22794;
        this.f72158 = true;
        this.f72153 = c3891.f12447;
        this.f72145 = 3;
        c1938.m6391(7, 16777216);
        String str = c3891.f12446;
        this.f72148 = str;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C20032.m46177("OkHttp " + str + " Writer", false));
        this.f72146 = scheduledThreadPoolExecutor;
        if (c3891.f12449 != 0) {
            C18708 c18708 = new C18708(this);
            long j = c3891.f12449;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c18708, j, j, TimeUnit.MILLISECONDS);
        }
        this.f72155 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C20032.m46177("OkHttp " + str + " Push Observer", true));
        c19382.m6391(7, 65535);
        c19382.m6391(5, 16384);
        this.f72161 = (long) c19382.m6393();
        this.f72163 = c3891.f12450;
        this.f72147 = new C6007(c3891.f12451);
        this.f72156 = new C21530(this, new C4596(c3891.f12448));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x0007, B:9:0x000e, B:10:0x0016, B:12:0x001a, B:14:0x002d, B:16:0x0035, B:20:0x003f, B:22:0x0045, B:23:0x004e, B:31:0x005d, B:32:0x0062), top: B:6:0x0007, outer: #1 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C10241 m49924(java.util.ArrayList r12, boolean r13) {
        /*
            r11 = this;
            r8 = r13 ^ 1
            l.ۛۧ֡ r0 = r11.f72147
            monitor-enter(r0)
            r1 = r11
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L65
            int r2 = r11.f72145     // Catch: java.lang.Throwable -> L14
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 <= r3) goto L16
            l.ܰ֫֡ r2 = l.EnumC13499.REFUSED_STREAM     // Catch: java.lang.Throwable -> L14
            r11.m49932(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r12 = move-exception
            goto L63
        L16:
            boolean r2 = r11.f72154     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L5d
            int r9 = r11.f72145     // Catch: java.lang.Throwable -> L14
            int r2 = r9 + 2
            r11.f72145 = r2     // Catch: java.lang.Throwable -> L14
            l.ۤۧ֡ r10 = new l.ۤۧ֡     // Catch: java.lang.Throwable -> L14
            r7 = 0
            r6 = 0
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L14
            if (r13 == 0) goto L3e
            long r2 = r11.f72161     // Catch: java.lang.Throwable -> L14
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L3e
            long r2 = r10.f30866     // Catch: java.lang.Throwable -> L14
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L3e
        L3c:
            r13 = 0
            goto L3f
        L3e:
            r13 = 1
        L3f:
            boolean r2 = r10.m25941()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L4e
            java.util.LinkedHashMap r2 = r11.f72144     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L14
            r2.put(r3, r10)     // Catch: java.lang.Throwable -> L14
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            l.ۛۧ֡ r1 = r11.f72147     // Catch: java.lang.Throwable -> L65
            r1.m16820(r12, r9, r8)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            if (r13 == 0) goto L5c
            l.ۛۧ֡ r12 = r11.f72147
            r12.flush()
        L5c:
            return r10
        L5d:
            l.᩺֫֡ r12 = new l.᩺֫֡     // Catch: java.lang.Throwable -> L14
            r12.<init>()     // Catch: java.lang.Throwable -> L14
            throw r12     // Catch: java.lang.Throwable -> L14
        L63:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r12     // Catch: java.lang.Throwable -> L65
        L65:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22235.m49924(java.util.ArrayList, boolean):l.ۤۧ֡");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f72147.m16822());
        r6 = r3;
        r8.f72161 -= r6;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49929(int r9, boolean r10, l.C12521 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            l.ۛۧ֡ r12 = r8.f72147
            r12.m16819(r10, r9, r11, r0)
            return
        Ld:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L68
            r0 = r8
            monitor-enter(r0)
        L13:
            long r3 = r8.f72161     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L31
            java.util.LinkedHashMap r3 = r8.f72144     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r3 == 0) goto L29
            r8.wait()     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L13
        L29:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
        L31:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L57
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L57
            l.ۛۧ֡ r3 = r8.f72147     // Catch: java.lang.Throwable -> L57
            int r3 = r3.m16822()     // Catch: java.lang.Throwable -> L57
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L57
            long r4 = r8.f72161     // Catch: java.lang.Throwable -> L57
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L57
            long r4 = r4 - r6
            r8.f72161 = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            long r12 = r12 - r6
            l.ۛۧ֡ r0 = r8.f72147
            if (r10 == 0) goto L52
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 != 0) goto L52
            r4 = 1
            goto L53
        L52:
            r4 = 0
        L53:
            r0.m16819(r4, r9, r11, r3)
            goto Ld
        L57:
            r9 = move-exception
            goto L66
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r9.interrupt()     // Catch: java.lang.Throwable -> L57
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L57
            r9.<init>()     // Catch: java.lang.Throwable -> L57
            throw r9     // Catch: java.lang.Throwable -> L57
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22235.m49929(int, boolean, l.۫ܽ֡, long):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49935(int i, EnumC13499 enumC13499) {
        try {
            this.f72146.execute(new C23646(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, enumC13499));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49926(int i, long j) {
        try {
            this.f72146.execute(new C6713(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49925(int i, int i2, boolean z) {
        try {
            try {
                this.f72147.m16813(i, i2, z);
            } catch (IOException unused) {
                EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
                m49933(enumC13499, enumC13499);
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49932(EnumC13499 enumC13499) {
        synchronized (this.f72147) {
            synchronized (this) {
                if (this.f72154) {
                    return;
                }
                this.f72154 = true;
                this.f72147.m16816(this.f72162, enumC13499, C20032.f64884);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m49933(EnumC13499.NO_ERROR, EnumC13499.CANCEL);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49933(EnumC13499 enumC13499, EnumC13499 enumC134992) {
        C10241[] c10241Arr = null;
        try {
            m49932(enumC13499);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f72144.isEmpty()) {
                c10241Arr = (C10241[]) this.f72144.values().toArray(new C10241[this.f72144.size()]);
                this.f72144.clear();
            }
        }
        if (c10241Arr != null) {
            for (C10241 c10241 : c10241Arr) {
                try {
                    c10241.m25937(enumC134992);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f72147.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f72163.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f72146.shutdown();
        this.f72155.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49911(C22235 c22235) {
        try {
            EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
            c22235.m49933(enumC13499, enumC13499);
        } catch (IOException unused) {
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49938() {
        C6007 c6007 = this.f72147;
        c6007.m16811();
        C1938 c1938 = this.f72140;
        c6007.m16821(c1938);
        if (c1938.m6393() != 65535) {
            c6007.m16814(0, r1 - 65535);
        }
        new Thread(this.f72156).start();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49937() {
        synchronized (this) {
            long j = this.f72151;
            long j2 = this.f72141;
            if (j < j2) {
                return;
            }
            this.f72141 = j2 + 1;
            this.f72152 = System.nanoTime() + 1000000000;
            try {
                this.f72146.execute(new C20825(this, this.f72148));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49930(ArrayList arrayList, int i) {
        synchronized (this) {
            if (this.f72142.contains(Integer.valueOf(i))) {
                m49935(i, EnumC13499.PROTOCOL_ERROR);
                return;
            }
            this.f72142.add(Integer.valueOf(i));
            try {
                m49910(new C9536(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, arrayList));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49931(ArrayList arrayList, int i, boolean z) {
        try {
            m49910(new C8830(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, arrayList, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49927(int i, InterfaceC6171 interfaceC6171, int i2, boolean z) {
        C12521 c12521 = new C12521();
        long j = i2;
        interfaceC6171.mo12313(j);
        interfaceC6171.mo4334(c12521, j);
        if (c12521.size() != j) {
            throw new IOException(c12521.size() + " != " + i2);
        }
        m49910(new C15884(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, c12521, i2, z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49928(int i, EnumC13499 enumC13499) {
        m49910(new C2480(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, enumC13499));
    }
}
