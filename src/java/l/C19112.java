package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: T7B2 */
/* renamed from: l.᩵֡ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19112 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60206 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f60208;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20177 f60209;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f60210;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60211;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f60212;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f60213;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f60214;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15582 f60215;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9234 f60216;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final long f60207 = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final long f60205 = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60203 = {0};

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f60204 = new AtomicInteger();

    public C19112(ServiceC1618 serviceC1618) {
        C9234 c9234 = new C9234(serviceC1618.getApplicationContext(), new C20177());
        C15582 c15582 = new C15582();
        C20177 c20177 = new C20177();
        this.f60213 = new Object();
        this.f60208 = new LinkedHashMap();
        this.f60216 = c9234;
        this.f60215 = c15582;
        this.f60209 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44057() {
        synchronized (this.f60213) {
            if (this.f60211) {
                return;
            }
            this.f60211 = true;
            final long j = this.f60214 + 1;
            this.f60214 = j;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2178());
            this.f60210 = newSingleThreadScheduledExecutor;
            this.f60212 = newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.᩷֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C19112.m44044(C19112.this, j);
                }
            }, 0L, f60207, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44059() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f60213) {
            this.f60211 = false;
            this.f60214++;
            this.f60208.clear();
            ScheduledFuture scheduledFuture = this.f60212;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f60212 = null;
            }
            scheduledExecutorService = this.f60210;
            this.f60210 = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44044(C19112 c19112, long j) {
        C18406 c18406;
        long j2;
        if (c19112.m44045(j)) {
            try {
                c18406 = c19112.f60216.m23676();
            } catch (RuntimeException unused) {
                c18406 = new C18406(null, null, null, Collections.EMPTY_LIST);
            }
            C18406 c184062 = c18406;
            c19112.f60209.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c184062.f57145 != null) {
                ArrayList m44043 = c19112.m44043(c184062, elapsedRealtime);
                if (c184062.f57144 != null && c19112.m44045(j)) {
                    try {
                        c19112.f60215.m36751(c184062.f57145, c184062.f57144);
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                if (c184062.f57143 != null && c19112.m44045(j)) {
                    try {
                        c19112.f60215.m36751(c184062.f57145, c184062.f57143);
                    } catch (IOException | RuntimeException unused3) {
                    }
                }
                Iterator it = m44043.iterator();
                while (it.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!c19112.m44045(j)) {
                        return;
                    }
                    try {
                        c19112.f60215.m36751(c184062.f57145, inetAddress);
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
                return;
            }
            synchronized (c19112.f60213) {
                Iterator it2 = c19112.f60208.entrySet().iterator();
                while (it2.hasNext()) {
                    j2 = ((C8528) ((Map.Entry) it2.next()).getValue()).f26055;
                    if (elapsedRealtime - j2 > f60205) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m44043(C18406 c18406, long j) {
        long j2;
        InetAddress inetAddress;
        InetAddress inetAddress2;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f60213) {
            Iterator it = this.f60208.entrySet().iterator();
            while (it.hasNext()) {
                C8528 c8528 = (C8528) ((Map.Entry) it.next()).getValue();
                j2 = c8528.f26055;
                if (j - j2 <= f60205) {
                    inetAddress = c8528.f26054;
                    boolean z = false;
                    if (m44056(inetAddress)) {
                        if (!c18406.f57146.isEmpty()) {
                            Iterator it2 = c18406.f57146.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((C3589) it2.next()).m10985(inetAddress)) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = inetAddress.isSiteLocalAddress();
                        }
                    }
                    if (z) {
                        inetAddress2 = c8528.f26054;
                        arrayList.add(inetAddress2);
                    }
                }
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44045(long j) {
        boolean z;
        synchronized (this.f60213) {
            z = this.f60211 && this.f60214 == j;
        }
        return z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44053() {
        long j;
        while (true) {
            LinkedHashMap linkedHashMap = this.f60208;
            if (linkedHashMap.size() <= 8) {
                return;
            }
            String str = null;
            long j2 = C13132.FOREVER_NS;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                j = ((C8528) entry.getValue()).f26055;
                if (j < j2) {
                    j2 = ((C8528) entry.getValue()).f26055;
                    str = (String) entry.getKey();
                }
            }
            if (str == null) {
                return;
            } else {
                linkedHashMap.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (m44056(r7) != false) goto L25;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44058(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            goto L3f
        L4:
            java.lang.String r7 = r7.trim()
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lf
            goto L3f
        Lf:
            java.lang.String r1 = "\\."
            r2 = -1
            java.lang.String[] r7 = r7.split(r1, r2)
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L1b
            goto L3f
        L1b:
            byte[] r1 = new byte[r2]
            r2 = 0
        L1e:
            int r3 = r7.length
            if (r2 >= r3) goto L34
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L3f
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L3f
            if (r3 < 0) goto L3f
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L2e
            goto L3f
        L2e:
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L3f
            r1[r2] = r3     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + 1
            goto L1e
        L34:
            java.net.InetAddress r7 = java.net.InetAddress.getByAddress(r1)
            boolean r1 = m44056(r7)
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            r7 = r0
        L40:
            if (r7 != 0) goto L43
            goto L6f
        L43:
            l.᩶۫᩷ r0 = r6.f60209
            r0.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r3 = r7.getHostAddress()
            java.lang.Object r0 = r6.f60213
            monitor-enter(r0)
            java.util.LinkedHashMap r4 = r6.f60208     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L70
            l.ۡ֡ۢ r4 = (l.C8528) r4     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L68
            java.util.LinkedHashMap r4 = r6.f60208     // Catch: java.lang.Throwable -> L70
            l.ۡ֡ۢ r5 = new l.ۡ֡ۢ     // Catch: java.lang.Throwable -> L70
            r5.<init>(r7, r1)     // Catch: java.lang.Throwable -> L70
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L70
            goto L6b
        L68:
            l.C8528.m22215(r4, r1)     // Catch: java.lang.Throwable -> L70
        L6b:
            r6.m44053()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
        L6f:
            return
        L70:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19112.m44058(java.lang.String):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m44056(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m44050(inetAddress)) ? false : true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44050(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        return address.length == 4 && (address[0] & 255) == 255 && (address[1] & 255) == 255 && (address[2] & 255) == 255 && (address[3] & 255) == 255;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44046(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m44050(inetAddress)) ? false : true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InetAddress m44049(int i) {
        return m44048(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InetAddress m44048(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m44054(int i) {
        int m44052;
        int bitCount;
        InetAddress m44048 = m44048(i);
        if (!(m44048 instanceof Inet4Address) || (bitCount = Integer.bitCount((m44052 = m44052(m44048)))) == 0) {
            return -1;
        }
        if (m44052 == (bitCount == 32 ? -1 : (int) (4294967295 << (32 - bitCount)))) {
            return bitCount;
        }
        return -1;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m44052(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4) {
            return 0;
        }
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }
}
