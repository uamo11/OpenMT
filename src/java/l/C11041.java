package l;

import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: X4ZQ */
/* renamed from: l.ۧܰܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11041 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long f33184;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C9711 f33185;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static RunnableC6373 f33186;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static long f33187;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile long f33189;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C18177 f33190;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6807 f33192;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33193;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f33194;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33195;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f33196;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f33191 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f33188 = 8;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m27376(RunnableC6373 runnableC6373) {
        synchronized (C11041.class) {
            if (f33186 == runnableC6373 && runnableC6373.f19714 == null) {
                f33186 = null;
                runnableC6373.f19713 = null;
            }
        }
    }

    public C11041(C6807 c6807) {
        this.f33192 = c6807;
        this.f33190 = new C18177(EnumC7784.INSTANCE, c6807.getContext().getCacheDir());
        m27378();
        m27386();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18177 m27390(C18177 c18177) {
        C11003.requireNonNull(c18177, "document");
        this.f33189++;
        C18177 c181772 = this.f33190;
        this.f33190 = c18177;
        this.f33196 = 0;
        this.f33195 = 0;
        this.f33191 = true;
        this.f33194 = false;
        this.f33193 = Integer.toHexString(c18177.length()).length();
        m27378();
        this.f33192.m18477(this.f33195, this.f33196, false);
        this.f33192.m18475();
        C10607 c10607 = this.f33192.f21110;
        if (c10607 != null) {
            c10607.m26627();
        }
        return c181772;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18177 m27414() {
        return this.f33190;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27388(int i, int i2, byte[] bArr, boolean[] zArr) {
        return this.f33190.m42378(i, i2, bArr, zArr);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m27386() {
        int length = Integer.toHexString(this.f33190.length()).length();
        if (length != this.f33193) {
            this.f33193 = length;
            C10607 c10607 = this.f33192.f21110;
            if (c10607 != null) {
                c10607.m26627();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27409(int i, int i2) {
        int length = this.f33190.length();
        if (length == 0) {
            m27392(0, true);
            return;
        }
        this.f33189++;
        int min = i < 0 ? 0 : Math.min(i, length - 1);
        int min2 = i2 >= 0 ? Math.min(i2, length - 1) : 0;
        this.f33195 = Math.min(min, min2);
        this.f33196 = Math.max(min, min2);
        this.f33191 = true;
        this.f33194 = true;
        m27378();
        this.f33192.m18477(this.f33195, this.f33196, true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m27411() {
        int length = this.f33190.length();
        if (length == 0) {
            return 1;
        }
        long j = this.f33188;
        long j2 = ((length + j) - 1) / j;
        int i = (int) j2;
        if (j2 == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27415() {
        return this.f33190.length();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m27419() {
        return this.f33193;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27408(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        this.f33188 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27413() {
        return this.f33188;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27387(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative position");
        }
        return (int) Math.min((this.f33188 * i) + i2, this.f33190.length());
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m27404() {
        return this.f33196;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27418() {
        return this.f33195;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27392(int i, boolean z) {
        this.f33189++;
        int min = i < 0 ? 0 : Math.min(i, this.f33190.length());
        this.f33196 = min;
        this.f33195 = min;
        this.f33191 = min == this.f33190.length() || z;
        this.f33194 = false;
        m27378();
        this.f33192.m18477(min, min, false);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m27412() {
        return this.f33191;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m27406() {
        return this.f33194;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27391(int i) {
        int i2;
        int i3;
        if (this.f33194) {
            throw new IllegalStateException("Cannot input into a range selection");
        }
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("Nibble is outside 0..15");
        }
        int i4 = this.f33195;
        boolean z = i4 == this.f33190.length();
        if (z) {
            i2 = 0;
        } else {
            byte[] bArr = new byte[1];
            this.f33190.m42392(i4, 1, bArr);
            i2 = bArr[0] & 255;
        }
        if (this.f33191) {
            i3 = 15 & i2;
            i <<= 4;
        } else {
            i3 = i2 & 240;
        }
        int i5 = i | i3;
        C11122 m42391 = this.f33190.m42391();
        try {
            if (z) {
                m42391.m27598(i4, i4, new byte[]{(byte) i5}, 1, null);
            } else {
                long j = i4 + 1;
                int i6 = (int) j;
                if (j != i6) {
                    throw new ArithmeticException();
                }
                m42391.m27598(i4, i6, new byte[]{(byte) i5}, 1, null);
            }
            m42391.m27600((InterfaceC17066) null);
            m42391.close();
            if (this.f33191) {
                this.f33189++;
                this.f33191 = false;
                m27378();
                if (z) {
                    this.f33192.m18477(i4, i4, false);
                    m27386();
                }
            } else {
                long j2 = i4 + 1;
                int i7 = (int) j2;
                if (j2 != i7) {
                    throw new ArithmeticException();
                }
                m27392(i7, true);
            }
            this.f33192.m18475();
        } catch (Throwable th) {
            try {
                m42391.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27393(byte[] bArr) {
        int i;
        int i2 = this.f33195;
        if (this.f33194) {
            long j = this.f33196 + 1;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        } else {
            i = i2;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f33190.m42388(i2, i, bArr);
        long length = i2 + bArr.length;
        int i3 = (int) length;
        if (length != i3) {
            throw new ArithmeticException();
        }
        m27392(i3, true);
        m27386();
        this.f33192.m18475();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m27405() {
        if (!this.f33194) {
            throw new IllegalStateException("No range is selected");
        }
        long j = this.f33196 + 1;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        C18177 c18177 = this.f33190;
        int i2 = this.f33195;
        C11122 m42391 = c18177.m42391();
        try {
            m42391.m27597(i2, i);
            m42391.m27600((InterfaceC17066) null);
            m42391.close();
            m27392(i, true);
            this.f33192.m18475();
        } catch (Throwable th) {
            try {
                m42391.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27403() {
        m27378();
        if (this.f33190.m42390()) {
            m27380();
            m27386();
            this.f33192.m18475();
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m27417() {
        m27378();
        if (this.f33190.m42377()) {
            m27380();
            m27386();
            this.f33192.m18475();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27410() {
        return this.f33190.m42389();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27394() {
        return this.f33190.m42393();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14133 m27402() {
        long j;
        if (!this.f33194) {
            throw new IllegalStateException("No range is selected");
        }
        long j2 = (this.f33196 - this.f33195) + 1;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        if (i > 33554432) {
            throw new C21978();
        }
        C18177 c18177 = this.f33190;
        int i2 = this.f33195;
        int i3 = this.f33196;
        C16765 m42397 = c18177.m42397();
        try {
            synchronized (C11041.class) {
                long j3 = f33187;
                j = j3 + 1;
                if (!((1 ^ j3) < 0) && !((j3 ^ j) >= 0)) {
                    throw new ArithmeticException();
                }
                f33187 = j;
                f33184 = j;
            }
            return new C14133(this, c18177, m42397.m39441(), i2, i3, j, m42397);
        } catch (Throwable th) {
            m42397.close();
            throw th;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m27407() {
        if (!this.f33194) {
            return false;
        }
        long j = (this.f33196 - this.f33195) + 1;
        int i = (int) j;
        if (j == i) {
            return i > 33554432;
        }
        throw new ArithmeticException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27398(C14133 c14133, C9711 c9711) {
        C11041 c11041;
        C18177 c18177;
        long j;
        c11041 = c14133.f42622;
        if (c11041 != this) {
            return false;
        }
        c18177 = c14133.f42625;
        synchronized (c18177) {
            if (!m27397(c14133)) {
                return false;
            }
            synchronized (C11041.class) {
                j = c14133.f42621;
                if (j != f33184) {
                    return false;
                }
                C9711 c97112 = f33185;
                f33185 = c9711;
                if (c97112 == null) {
                    return true;
                }
                try {
                    c97112.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27397(C14133 c14133) {
        C11041 c11041;
        C18177 c18177;
        C18177 c181772;
        long j;
        int i;
        int i2;
        if (c14133 == null) {
            return false;
        }
        c11041 = c14133.f42622;
        if (c11041 != this) {
            return false;
        }
        C18177 c181773 = this.f33190;
        c18177 = c14133.f42625;
        if (c181773 != c18177) {
            return false;
        }
        c181772 = c14133.f42625;
        long m42385 = c181772.m42385();
        j = c14133.f42616;
        if (m42385 != j || !this.f33194) {
            return false;
        }
        int i3 = this.f33195;
        i = c14133.f42619;
        if (i3 != i) {
            return false;
        }
        int i4 = this.f33196;
        i2 = c14133.f42623;
        return i4 == i2;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1868 m27416() {
        int i;
        synchronized (C11041.class) {
            C9711 c9711 = f33185;
            C16765 c16765 = null;
            if (c9711 != null && c9711.length() != 0) {
                C21000 m24680 = c9711.m24680();
                int length = c9711.length();
                try {
                    C18177 c18177 = this.f33190;
                    C16765 m42397 = c18177.m42397();
                    try {
                        int i2 = this.f33195;
                        if (this.f33194) {
                            long j = this.f33196 + 1;
                            int i3 = (int) j;
                            if (j != i3) {
                                throw new ArithmeticException();
                            }
                            i = i3;
                        } else {
                            i = i2;
                        }
                        return new C1868(this, c9711, m24680, c18177, m42397, i2, i, length);
                    } catch (Error | RuntimeException e) {
                        c16765 = m42397;
                        e = e;
                        if (c16765 != null) {
                            c16765.close();
                        }
                        try {
                            m24680.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } catch (Error e3) {
                    e = e3;
                } catch (RuntimeException e4) {
                    e = e4;
                }
            }
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m27389(C1868 c1868, C23556 c23556) {
        C11041 c11041;
        C9711 c9711;
        C18177 c18177;
        C16059 c16059;
        int i;
        int i2;
        int i3;
        C9711 c97112;
        int i4;
        int i5;
        int i6;
        int i7;
        C18177 c181772;
        c11041 = c1868.f6366;
        if (c11041 != this) {
            throw new IllegalArgumentException("Paste request belongs to another HexData");
        }
        try {
            c1868.m6195(c23556);
            c18177 = c1868.f6362;
            c16059 = c1868.f6365;
            C11122 m42379 = c18177.m42379(c16059);
            try {
                i = c1868.f6372;
                i2 = c1868.f6361;
                m42379.m27598(i, i2, new byte[0], 0, null);
                i3 = c1868.f6372;
                c97112 = c1868.f6364;
                m42379.m27599(i3, c97112, c23556);
                i4 = c1868.f6372;
                i5 = c1868.f6363;
                long j = i4 + i5;
                int i8 = (int) j;
                if (j != i8) {
                    throw new ArithmeticException();
                }
                i6 = c1868.f6372;
                i7 = c1868.f6363;
                long j2 = i6 + i7;
                int i9 = (int) j2;
                if (j2 != i9) {
                    throw new ArithmeticException();
                }
                m42379.m27601(i8, i9);
                if (C20735.m47343(c23556.f75618)) {
                    throw new C23821();
                }
                if (!m42379.m27600(c23556)) {
                    throw new C23821();
                }
                c181772 = c1868.f6362;
                long m42385 = c181772.m42385();
                m42379.close();
                return m42385;
            } finally {
            }
        } catch (C5519 e) {
            c9711 = c1868.f6370;
            try {
                this.f33190.m42396();
            } catch (RuntimeException e2) {
                e.addSuppressed(e2);
            } catch (C5519 e3) {
                e3.addSuppressed(e);
                throw e3;
            } catch (IOException e4) {
                e4.addSuppressed(e);
                throw e4;
            }
            synchronized (C11041.class) {
                C9711 c97113 = null;
                if (c9711 != null) {
                    C9711 c97114 = f33185;
                    if (c97114 == c9711) {
                        f33185 = null;
                        c97113 = c97114;
                    }
                }
                if (c97113 != null) {
                    try {
                        c97113.close();
                    } catch (IOException e5) {
                        e.addSuppressed(e5);
                    }
                }
                throw new IOException("Hex clipboard source changed", e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27396(C1868 c1868, long j) {
        C18177 c18177;
        C18177 c181772;
        int i;
        int i2;
        C18177 c181773 = this.f33190;
        c18177 = c1868.f6362;
        if (c181773 != c18177) {
            return false;
        }
        c181772 = c1868.f6362;
        if (c181772.m42385() != j) {
            return false;
        }
        i = c1868.f6372;
        i2 = c1868.f6363;
        long j2 = i + i2;
        int i3 = (int) j2;
        if (j2 != i3) {
            throw new ArithmeticException();
        }
        m27392(i3, true);
        m27386();
        this.f33192.m18475();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27399(C18177 c18177, long j, long j2) {
        return this.f33190 == c18177 && c18177.m42385() == j && this.f33189 == j2;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m27385() {
        return this.f33189;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27400(C18177 c18177, long j, long j2, int i, int i2) {
        if (this.f33190 != c18177 || c18177.m42385() != j || this.f33189 != j2) {
            return false;
        }
        long j3 = i + i2;
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        m27392(i3, true);
        m27386();
        this.f33192.m18475();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27395(C1868 c1868) {
        C18177 c18177;
        if (c1868 == null) {
            return true;
        }
        C18177 c181772 = this.f33190;
        c18177 = c1868.f6362;
        return c181772 == c18177;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m27382() {
        boolean z;
        synchronized (C11041.class) {
            C9711 c9711 = f33185;
            z = (c9711 == null || c9711.length() == 0) ? false : true;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27374(File file) {
        boolean z;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        C11003.requireNonNull(file, "cacheDirectory");
        C11003.requireNonNull(executor, "executor");
        synchronized (C11041.class) {
            C9711 c9711 = f33185;
            if (c9711 != null && c9711.length() != 0) {
                RunnableC6373 runnableC6373 = f33186;
                if (runnableC6373 == null || !runnableC6373.m17674(c9711)) {
                    C12018 c12018 = new C12018(c9711, file);
                    if (runnableC6373 == null) {
                        runnableC6373 = new RunnableC6373(c12018);
                        f33186 = runnableC6373;
                        z = true;
                    } else {
                        runnableC6373.m17673(c12018);
                        z = false;
                    }
                    if (z) {
                        try {
                            executor.execute(runnableC6373);
                        } catch (RuntimeException unused) {
                            m27376(runnableC6373);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27377(C23306 c23306) {
        C12018 c12018;
        C9711 c9711;
        C9711 c97112;
        C9711 c97113;
        C21000 c21000;
        C21000 c210002;
        C9711 m47818;
        File file;
        C9711 c97114;
        Throwable th;
        C9711 c97115;
        c12018 = c23306.f74921;
        C9711 c97116 = null;
        try {
            c210002 = c23306.f74922;
            m47818 = c210002.m47818(null);
            try {
            } catch (Throwable unused) {
                c9711 = null;
                c97116 = m47818;
                c97112 = c9711;
                m27375(c97116);
                m27375(c9711);
                c97113 = c97112;
                m27375(c97113);
                c21000 = c23306.f74922;
                m27375(c21000);
            }
        } catch (Throwable unused2) {
            c9711 = null;
        }
        if (C18177.m42339(m47818)) {
            file = c12018.f35971;
            C9711 m42311 = C18177.m42311(m47818, file);
            try {
            } catch (Throwable unused3) {
                c9711 = m42311;
            }
            synchronized (C11041.class) {
                try {
                    C9711 c97117 = f33185;
                    c97115 = c12018.f35972;
                    if (c97117 == c97115) {
                        c97113 = f33185;
                        try {
                            f33185 = m42311;
                        } catch (Throwable th2) {
                            c97116 = c97113;
                            c9711 = m42311;
                            th = th2;
                            while (true) {
                                try {
                                    try {
                                        throw th;
                                    } catch (Throwable unused4) {
                                        c97112 = c97116;
                                        c97116 = m47818;
                                        m27375(c97116);
                                        m27375(c9711);
                                        c97113 = c97112;
                                        m27375(c97113);
                                        c21000 = c23306.f74922;
                                        m27375(c21000);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } else {
                        c97113 = null;
                        c97116 = m42311;
                    }
                    try {
                        m27375(m47818);
                        m27375(c97116);
                        m27375(c97113);
                        c21000 = c23306.f74922;
                        m27375(c21000);
                    } catch (Throwable th4) {
                        th = th4;
                        c97114 = c97116;
                        c97116 = c97113;
                        c9711 = c97114;
                        while (true) {
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    c97114 = m42311;
                    th = th5;
                }
            }
        } else {
            m27375(m47818);
            c21000 = c23306.f74922;
            m27375(c21000);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27375(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            C5368.m15342(autoCloseable);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27401() {
        m27379();
        m27386();
        this.f33192.m18475();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27379() {
        this.f33189++;
        int length = this.f33190.length();
        boolean z = true;
        if (this.f33194 && length != 0) {
            int i = this.f33195;
            this.f33195 = i < 0 ? 0 : Math.min(i, length - 1);
            int i2 = this.f33196;
            int min = i2 >= 0 ? Math.min(i2, length - 1) : 0;
            this.f33196 = min;
            int i3 = this.f33195;
            if (i3 > min) {
                this.f33195 = min;
                this.f33196 = i3;
            }
        } else {
            int min2 = Math.min(this.f33195, length);
            this.f33196 = min2;
            this.f33195 = min2;
            if (min2 != length && !this.f33191) {
                z = false;
            }
            this.f33191 = z;
            this.f33194 = false;
        }
        m27378();
        this.f33192.m18477(this.f33195, this.f33196, this.f33194);
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m27378() {
        this.f33190.m42381(this.f33195, this.f33196, this.f33191, this.f33194);
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m27380() {
        C4607 m42386 = this.f33190.m42386();
        if (m42386 == null) {
            m27379();
            return;
        }
        this.f33189++;
        this.f33195 = m42386.m13518();
        this.f33196 = m42386.m13520();
        this.f33191 = m42386.m13519();
        boolean m13517 = m42386.m13517();
        this.f33194 = m13517;
        this.f33192.m18477(this.f33195, this.f33196, m13517);
    }
}
