package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 07HC */
/* renamed from: l.᩷᩻᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21217 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f68363;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f68365;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22213 f68370;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f68371;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2036 f68373;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f68374;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24038 f68375;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f68372 = new AtomicInteger(0);

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f68367 = new LinkedBlockingQueue();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f68362 = C16895.m39756();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f68369 = new ConcurrentMapC10942();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f68366 = new AtomicBoolean(false);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicReference f68376 = new AtomicReference();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f68364 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f68368 = new ThreadLocal();

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(6:3|(1:5)|6|(1:12)|13|(1:15))|(11:25|(2:27|(2:29|(2:33|(2:35|(2:38|(2:42|(2:43|(2:45|(1:49)(2:56|54))(4:57|58|59|(1:61))))(0))(0)))(0))(2:65|(2:67|(2:68|(2:70|(1:86)(4:72|(3:75|(1:80)(3:83|82|81)|73)|84|85))(3:87|88|(2:90|(6:92|(1:94)|96|(2:98|(1:100))|102|(1:104)(0))))))(0)))|106|107|(1:109)(1:121)|(1:111)(1:120)|112|113|114|115|116)(0)|122|107|(0)(0)|(0)(0)|112|113|114|115|116) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0188, code lost:
    
        if (r4 > 31) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0192, code lost:
    
        if (r3[1] != 254) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        if ((r0 & 65472) != 65152) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        if (r3[1] != 168) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21217(l.AbstractC3163 r13, l.InterfaceC5627 r14) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21217.<init>(l.ۗۢ᩻, l.ۚ᩸ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48166(InterfaceC24038 interfaceC24038) {
        this.f68375 = interfaceC24038;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48165(String str, String str2, AbstractC15440 abstractC15440, long j, long j2, String str3, C17558 c17558, boolean z, boolean z2) {
        this.f68367.add(new C14865(str, str2, abstractC15440, j, j2, str3, c17558, z, z2));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48169() {
        C2036 c2036;
        if (this.f68367.isEmpty()) {
            return;
        }
        int i = this.f68365;
        this.f68371 = new CountDownLatch(i);
        for (final int i2 = 0; i2 < i; i2++) {
            C1802.f6208.submit(new Runnable(i2) { // from class: l.ᩳ᩻᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C21217.m48161(C21217.this);
                }
            });
        }
        while (true) {
            boolean await = this.f68371.await(500L, TimeUnit.MILLISECONDS);
            c2036 = this.f68373;
            if (!await) {
                if (c2036.mo1526()) {
                    m48168();
                    break;
                }
            } else {
                break;
            }
        }
        c2036.mo6622();
        Exception exc = (Exception) this.f68376.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48168() {
        this.f68366.set(true);
        for (C2872 c2872 : this.f68369.values()) {
            synchronized (c2872) {
                if (!c2872.f9158) {
                    c2872.f9158 = true;
                    synchronized (c2872.f9155) {
                        C0349.m1793(c2872.f9155);
                    }
                    c2872.f9157.mo23552();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48167() {
        return this.f68366.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x003c, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x003d, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0042, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0029, code lost:
    
        android.os.SystemClock.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r2 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        r3 = (l.C2872) r7.f68369.get(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3.f9145.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r2.m23663(r7.f68374, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        r0 = r7.f68364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        if (r3.f9158 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r7.f68369.remove(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        r4 = r3.f9162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007f, code lost:
    
        r4 = r7.f68376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0090, code lost:
    
        monitor-enter(r7.f68364);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a0, code lost:
    
        if (r3.f9158 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00af, code lost:
    
        monitor-enter(r7.f68364);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b0, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b6, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bf, code lost:
    
        if (r3.f9158 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c1, code lost:
    
        r7.f68369.remove(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x003a, code lost:
    
        r0 = r7.f68364;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m48161(l.C21217 r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21217.m48161(l.᩷᩻᩻):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C9222 m48164() {
        C7105 c7105;
        int size;
        C14865 c14865 = (C14865) this.f68367.poll();
        if (c14865 != null) {
            try {
                int incrementAndGet = this.f68372.incrementAndGet();
                String str = c14865.f45348;
                AbstractC15440 abstractC15440 = c14865.f45347;
                int lastIndexOf = str.lastIndexOf(47);
                if (lastIndexOf >= 0) {
                    str = str.substring(lastIndexOf + 1);
                }
                String str2 = str;
                abstractC15440.mo35195();
                boolean mo23120 = abstractC15440.mo23120();
                AbstractC15440 m36492 = mo23120 ? abstractC15440.m36524(str2 + ".downloading").m36492(true) : abstractC15440;
                C23411 m36513 = m36492.m36513("rw");
                m36513.setLength(c14865.f45340);
                C2872 c2872 = new C2872(incrementAndGet, c14865.f45343, str2, c14865.f45348, c14865.f45347, m36492, mo23120, m36513, c14865.f45340, c14865.f45342, c14865.f45341, c14865.f45345, c14865.f45346, c14865.f45344, this.f68368, this.f68375);
                this.f68369.put(c14865.f45348, c2872);
                int incrementAndGet2 = c2872.f9143.incrementAndGet();
                String str3 = c14865.f45348;
                long j = c14865.f45340;
                C9222 c9222 = new C9222(incrementAndGet, str2, incrementAndGet2, str3, j, 0L, j, m36513);
                this.f68362.add(c9222);
                return c9222;
            } catch (IOException e) {
                AtomicReference atomicReference = this.f68376;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                return null;
            }
        }
        if (!this.f68363) {
            return null;
        }
        synchronized (this.f68362) {
            ArrayList arrayList = new ArrayList();
            double d = 0.0d;
            long j2 = 0;
            for (C9222 c92222 : this.f68362) {
                C2872 c28722 = (C2872) this.f68369.get(c92222.f27921);
                if (c28722 != null) {
                    if (c28722.f9162.get() != null) {
                    }
                }
                long j3 = c92222.f27915 - c92222.f27912.get();
                long m12876 = c92222.f27913.m12876();
                double d2 = j3;
                double d3 = d2 / 1048576.0d;
                if (m12876 > 0) {
                    d3 = d2 / m12876;
                } else if (j3 <= 52428800) {
                    d3 = -1.0d;
                }
                if (d3 >= 0.0d) {
                    arrayList.add(new C7105(c92222, c28722, j3, d3));
                    d += d3;
                    j2 += j3;
                }
            }
            double d4 = 0.0d;
            if (d <= 0.0d || j2 <= 0) {
                c7105 = null;
            } else {
                Iterator it = arrayList.iterator();
                c7105 = null;
                while (it.hasNext()) {
                    C7105 c71052 = (C7105) it.next();
                    double d5 = d;
                    C7105 c71053 = c7105;
                    double d6 = ((c71052.f21811 / j2) * 0.3d) + ((c71052.f21812 / d) * 0.7d);
                    if (d6 > d4) {
                        d4 = d6;
                        c7105 = c71052;
                    } else {
                        c7105 = c71053;
                    }
                    d = d5;
                }
            }
        }
        if (c7105 == null || (size = this.f68365 - this.f68362.size()) <= 0) {
            return null;
        }
        C9222 m23662 = c7105.f21813.m23662(c7105.f21814, size, this.f68370);
        if (m23662 != null) {
            this.f68362.add(m23662);
        }
        return m23662;
    }
}
