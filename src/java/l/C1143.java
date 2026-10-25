package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: 56UC */
/* renamed from: l.֨۬ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1143 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f4144;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2555 f4145;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12951 f4146;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4147;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f4148;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4149;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f4150;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f4151;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0437[] f4152;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f4153 = new Object();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f4154;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10130 f4155;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CRC32 f4156;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized C0437 m3916() {
        int i = this.f4149;
        if (i == 0) {
            return null;
        }
        C0437[] c0437Arr = this.f4152;
        int i2 = i - 1;
        this.f4149 = i2;
        C0437 c0437 = c0437Arr[i2];
        c0437Arr[i2] = null;
        return c0437;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3923(C0437 c0437, boolean z) {
        if (z) {
            C0437[] c0437Arr = this.f4152;
            int i = this.f4149;
            this.f4149 = i + 1;
            c0437Arr[i] = c0437;
        } else {
            this.f4147--;
            c0437.f1929.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3925(C21605 c21605) {
        while (true) {
            long m8089 = this.f4145.m8089();
            if (m8089 == 0) {
                break;
            } else {
                this.f4151 -= m8089;
            }
        }
        while (m3918()) {
        }
        boolean z = false;
        loop2: while (true) {
            for (C18783 c18783 : this.f4144.values()) {
                if (c18783.f59298.f25202 == c21605 && (c18783.f59297 != 0 || c18783.f59295)) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            break loop2;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        Iterator it = this.f4144.entrySet().iterator();
        while (it.hasNext()) {
            C18783 c187832 = (C18783) ((Map.Entry) it.next()).getValue();
            C8199 c8199 = c187832.f59298;
            if (c8199.f25202 == c21605) {
                if (c187832.f59297 != 0 || c187832.f59295) {
                    throw new IllegalStateException("Text pages are still leased");
                }
                this.f4151 -= c8199.f25201;
                c187832.f59296 = null;
                it.remove();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m3926(char[] cArr) {
        if (cArr.length == 0) {
            return;
        }
        if (!this.f4145.m8090(cArr)) {
            this.f4151 -= C2555.m8087(cArr.length);
        }
        notifyAll();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m3931() {
        return this.f4151;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0437 m3920() {
        synchronized (this) {
            C0437 m3916 = m3916();
            if (m3916 != null) {
                return m3916;
            }
            int i = this.f4147;
            if (i == this.f4152.length) {
                return null;
            }
            this.f4147 = i + 1;
            try {
                try {
                    C5377 m3921 = m3921(16384L);
                    try {
                        return new C0437(m3921, this.f4154.length);
                    } catch (Error | RuntimeException e) {
                        m3921.close();
                        throw e;
                    }
                } catch (UncheckedIOException | C3966 unused) {
                    synchronized (this) {
                        this.f4147--;
                        return null;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f4147--;
                    throw th;
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m3918() {
        int i = this.f4149;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f4149 = i2;
        C0437[] c0437Arr = this.f4152;
        C0437 c0437 = c0437Arr[i2];
        c0437Arr[i2] = null;
        this.f4147--;
        c0437.f1929.close();
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m3929() {
        if (!Thread.holdsLock(this.f4153)) {
            throw new IllegalStateException("Recovery I/O lock is not held");
        }
        return this.f4154;
    }

    public C1143(long j) {
        C10130 c10130 = new C10130(8240);
        this.f4155 = c10130;
        byte[] m25438 = c10130.m25438();
        this.f4154 = m25438;
        this.f4146 = new C12951(m25438);
        this.f4156 = new CRC32();
        this.f4152 = new C0437[4];
        this.f4144 = new LinkedHashMap(16, 0.75f, true);
        this.f4151 = 16384L;
        this.f4148 = 16384L;
        if (j < X931RNG.BLOCK64_RESEED_MAX) {
            throw new IllegalArgumentException("Page cache budget is too small");
        }
        this.f4150 = j;
        this.f4145 = new C2555(j / 8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m3930() {
        return this.f4150;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m3927(int i) {
        int i2;
        C5377 c5377;
        if (i < 0) {
            throw new IllegalArgumentException("Negative workspace length");
        }
        if (i == 0 || i > 8192) {
            i2 = i;
        } else {
            int i3 = 16;
            while (i3 < i) {
                i3 <<= 1;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            return C2555.f8087;
        }
        synchronized (this) {
            char[] m8091 = this.f4145.m8091(i2);
            if (m8091 != null) {
                return m8091;
            }
            long m8087 = C2555.m8087(i2);
            long j = this.f4150;
            long j2 = this.f4151;
            if (m8087 <= j - j2) {
                c5377 = new C5377(this, m8087);
                long j3 = j2 + m8087;
                this.f4151 = j3;
                this.f4148 = Math.max(this.f4148, j3);
            } else {
                c5377 = null;
            }
            if (c5377 == null) {
                c5377 = m3921(C2555.m8087(i));
            } else {
                i = i2;
            }
            try {
                char[] cArr = new char[i];
                synchronized (this) {
                    c5377.f16730 = false;
                }
                return cArr;
            } finally {
                c5377.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        r0 = r8.f59298;
        r0.f25202.m48801(r0, r8.f59296);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        r13.f4144.remove(r8.f59298);
        r13.f4151 -= r8.f59298.f25201;
        r8.f59296 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
    
        r8.f59295 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0100, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0101, code lost:
    
        r8.f59295 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e5, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e6, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e8, code lost:
    
        r5 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        r5.add(r8.f59298);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f3, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f4, code lost:
    
        r8.f59295 = false;
        notifyAll();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5377 m3921(long r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1143.m3921(long):l.ۚ۬ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3924(C8199 c8199, C11002 c11002, C5377 c5377) {
        synchronized (this) {
            if (c5377.f16729 != this || !c5377.f16730 || c5377.f16731 != c8199.f25201 || c11002.m27312() != c8199.f25201 || this.f4144.containsKey(c8199)) {
                throw new IllegalStateException("Invalid page reservation transfer");
            }
            this.f4144.put(c8199, new C18783(c8199, c11002));
            c5377.f16730 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19489 m3922(C8199 c8199) {
        c8199.f25202.m48811();
        try {
            return m3919(c8199);
        } catch (Throwable th) {
            c8199.f25202.m48812();
            throw th;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C19489 m3919(C8199 c8199) {
        synchronized (c8199) {
            while (true) {
                synchronized (this) {
                    C18783 c18783 = (C18783) this.f4144.get(c8199);
                    if (c18783 != null && !c18783.f59295) {
                        c18783.f59297++;
                        return new C19489(this, c18783);
                    }
                    if (c18783 != null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted while loading text page", e);
                        }
                    } else {
                        return m3917(c8199);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C19489 m3917(l.C8199 r7) {
        /*
            r6 = this;
            l.֡۬ᩳ r0 = r6.m3916()
            r1 = 0
            long r2 = r7.f25201     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C3966 -> L16
            l.ۚ۬ᩳ r2 = r6.m3921(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C3966 -> L16
            goto L23
        Lc:
            r7 = move-exception
            r4 = r6
            goto L82
        L10:
            r7 = move-exception
            r4 = r6
            goto L7b
        L14:
            r2 = move-exception
            goto L17
        L16:
            r2 = move-exception
        L17:
            if (r0 == 0) goto L7a
            r6.m3923(r0, r1)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            r0 = 0
            long r2 = r7.f25201     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            l.ۚ۬ᩳ r2 = r6.m3921(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
        L23:
            if (r0 != 0) goto L2d
            l.֡۬ᩳ r0 = r6.m3920()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r7 = move-exception
            r4 = r6
            goto L6f
        L2d:
            r3 = r0
            l.᩸۬ᩳ r0 = r7.f25202     // Catch: java.lang.Throwable -> L6c
            l.ۧ۫ᩳ r4 = r0.m48798(r7, r3)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6c
            r6.m3924(r7, r4, r2)     // Catch: java.lang.Throwable -> L64
            java.util.LinkedHashMap r4 = r6.f4144     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L64
            l.ᩴ۬ᩳ r7 = (l.C18783) r7     // Catch: java.lang.Throwable -> L64
            int r4 = r7.f59297     // Catch: java.lang.Throwable -> L64
            r5 = 1
            int r4 = r4 + r5
            r7.f59297 = r4     // Catch: java.lang.Throwable -> L64
            l.᩵۬ᩳ r1 = new l.᩵۬ᩳ     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            r2.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            if (r3 == 0) goto L55
            r6.m3923(r3, r5)
        L55:
            return r1
        L56:
            r7 = move-exception
            r0 = 1
            r4 = r6
            goto L84
        L5a:
            r7 = move-exception
            r0 = 1
            r4 = r6
            r0 = r3
            r1 = 1
            goto L7b
        L60:
            r7 = move-exception
            r1 = 1
        L62:
            r4 = r6
            goto L66
        L64:
            r7 = move-exception
            goto L62
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r7 = move-exception
            goto L6e
        L6a:
            r7 = move-exception
            goto L66
        L6c:
            r7 = move-exception
            r4 = r6
        L6e:
            r0 = r3
        L6f:
            r2.close()     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r2 = move-exception
            r7.addSuppressed(r2)     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L81
        L77:
            throw r7     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L81
        L78:
            r7 = move-exception
            goto L7b
        L7a:
            throw r2     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
        L7b:
            java.io.UncheckedIOException r2 = new java.io.UncheckedIOException     // Catch: java.lang.Throwable -> L81
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L81
            throw r2     // Catch: java.lang.Throwable -> L81
        L81:
            r7 = move-exception
        L82:
            r3 = r0
            r0 = r1
        L84:
            if (r3 == 0) goto L89
            r4.m3923(r3, r0)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1143.m3917(l.۠۬ᩳ):l.᩵۬ᩳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3928(C8199 c8199) {
        if (c8199.f25202.f69370 != this) {
            throw new IllegalArgumentException("Page belongs to another cache");
        }
        if (c8199.f25208 < 0) {
            try {
                C19489 m3922 = m3922(c8199);
                try {
                    c8199.f25202.m48801(c8199, m3922.m44896());
                    m3922.close();
                } finally {
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        synchronized (this) {
            C18783 c18783 = (C18783) this.f4144.get(c8199);
            if (c18783 != null && c18783.f59297 == 0 && !c18783.f59295) {
                this.f4144.remove(c8199);
                this.f4151 -= c8199.f25201;
                c18783.f59296 = null;
            }
        }
    }
}
