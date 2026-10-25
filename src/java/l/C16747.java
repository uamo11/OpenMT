package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: R704 */
/* renamed from: l.ܽܺܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16747 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ExecutorC8782 f51401 = new ExecutorC8782(Runtime.getRuntime().availableProcessors());

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f51402;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile C10193 f51403;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14986 f51404;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f51406;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f51407;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11604 f51409;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7370 f51410;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f51412;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f51413;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51415;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51416;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14986 f51418;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f51419;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51420;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f51421;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C5959 f51422;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12309 f51423;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22187 f51424;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23097 f51425;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ExecutorC1726 f51426;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f51427;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f51428;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20798 f51430;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51431;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Executor f51433;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51434;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f51405 = new Object();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f51432 = new ArrayDeque();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f51414 = new Object();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5980 f51411 = new C5980();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20632 f51417 = new C20632();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f51408 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f51429 = true;

    public C16747(ExecutorC1726 executorC1726, InterfaceC12309 interfaceC12309) {
        ExecutorC8782 executorC8782 = f51401;
        C11003.requireNonNull(executorC8782, "workerExecutor");
        this.f51433 = executorC8782;
        this.f51402 = executorC8782.f26755;
        this.f51426 = executorC1726;
        this.f51423 = interfaceC12309;
        this.f51427 = 4096;
        this.f51407 = 8000000L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39415(C23097 c23097, InterfaceC20445 interfaceC20445, C9302 c9302, int i) {
        m39396(c23097, interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length(), EnumC22892.FRESH, c9302, i, 0, 0, 0, -1, -1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39414(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3, C9302 c9302, int i4) {
        C11003.requireNonNull(interfaceC20445, TextBundle.TEXT_ENTRY);
        int mo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        long j = i2;
        long j2 = (length - i3) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || j2 < 0 || j2 > 2147483647L || i + j > j2) {
            throw new IndexOutOfBoundsException("Invalid syntax worker edit range");
        }
        m39396(c23097, interfaceC20445, mo26548, length, EnumC22892.EDIT, c9302, i4, i, i2, i3, -1, -1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39420(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, TextBundle.TEXT_ENTRY);
        int mo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        C11003.checkFromToIndex(i, i2, length);
        m39396(c23097, interfaceC20445, mo26548, length, EnumC22892.WINDOW, null, i3, 0, 0, 0, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39413(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        C14986 c14986;
        int mo26548 = interfaceC20445.mo26548();
        long j = i2;
        long length = (interfaceC20445.length() - i3) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || length < 0 || length > 2147483647L || i + j > length) {
            throw new IndexOutOfBoundsException("Invalid syntax window edit range");
        }
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51417.m47217();
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5980.m16784() != (c5959 == null ? null : c5959.f18266)) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39399();
                if (this.f51434 && this.f51425 == c23097 && this.f51421 == interfaceC20445 && this.f51410 != null && (c14986 = this.f51418) != null && this.f51415 + 1 == mo26548 && c14986.m35509() == length) {
                    this.f51418 = this.f51418.m35499(new C7931(i, i2 + i, i3));
                    this.f51415 = mo26548;
                } else {
                    m39401();
                }
            }
        } finally {
            m39398();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5959 m39421() {
        C5959 c5959;
        synchronized (this.f51405) {
            c5959 = this.f51422;
        }
        return c5959;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7370 m39423() {
        C7370 c7370;
        synchronized (this.f51405) {
            c7370 = this.f51410;
        }
        return c7370;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39412(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (i < 0 || i >= i2 || i2 > interfaceC20445.length()) {
            return;
        }
        synchronized (this.f51405) {
            if (this.f51421 != interfaceC20445) {
                return;
            }
            this.f51419 = interfaceC20445;
            this.f51406 = interfaceC20445.mo26548();
            long j = (i << 32) | (i2 & 4294967295L);
            this.f51408 = j;
            C11604 c11604 = this.f51409;
            if (c11604 == null) {
                C22187 c22187 = this.f51424;
                c11604 = c22187 == null ? null : c22187.f71979;
            }
            if (c11604 != null && C11604.m28489(c11604)) {
                c11604.f34598 = j;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10193 m39419() {
        return this.f51403;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39395(final C16747 c16747, C11604 c11604, C13035 c13035) {
        C11604 c116042;
        boolean z;
        long j;
        final long j2;
        synchronized (c16747.f51405) {
            C22187 c22187 = c16747.f51424;
            if (c22187 != null) {
                c116042 = c22187.f71979;
                if (c116042 == c11604) {
                    z = c11604.f34603;
                    if (!z) {
                        long j3 = c16747.f51413;
                        j = c11604.f34612;
                        if (j3 == j && C11604.m28489(c11604)) {
                            if (c16747.f51403 != null) {
                                c16747.f51403.f30627 = true;
                            }
                            c16747.f51403 = new C10193(c11604, c13035);
                            j2 = c11604.f34612;
                            c16747.m39390(new Runnable() { // from class: l.᩵ۡܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C16747.m39403(C16747.this, j2);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39403(C16747 c16747, long j) {
        synchronized (c16747.f51405) {
            C10193 c10193 = c16747.f51403;
            if (c10193 != null && c10193.f30628 == j && c10193.m25591()) {
                C20777.m47495(((C10899) c16747.f51423).f32771, c10193);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39409(InterfaceC20445 interfaceC20445) {
        long j;
        synchronized (this.f51405) {
            j = this.f51421 == interfaceC20445 ? this.f51413 : 0L;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39411(long j) {
        if (j != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(500L) + System.nanoTime();
            synchronized (this.f51405) {
                while (this.f51413 == j && (this.f51409 != null || this.f51424 != null)) {
                    long nanoTime = nanos - System.nanoTime();
                    if (nanoTime <= 0) {
                        return;
                    } else {
                        TimeUnit.NANOSECONDS.timedWait(this.f51405, nanoTime);
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39417(C5959 c5959) {
        boolean z;
        long j;
        int i;
        int i2;
        synchronized (this.f51405) {
            if (this.f51422 == c5959) {
                long j2 = this.f51413;
                j = c5959.f18268;
                if (j2 == j) {
                    i = c5959.f18269;
                    i2 = c5959.f18270;
                    z = m39397(i, i2);
                }
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39418(C7370 c7370) {
        boolean z;
        long j;
        int i;
        int i2;
        synchronized (this.f51405) {
            if (this.f51410 == c7370) {
                long j2 = this.f51413;
                j = c7370.f22638;
                if (j2 == j) {
                    i = c7370.f22637;
                    i2 = c7370.f22639;
                    z = m39397(i, i2);
                }
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39416(C4548 c4548) {
        Object obj;
        boolean z;
        long j;
        int i;
        int i2;
        synchronized (this.f51405) {
            obj = c4548.f14507;
            if (obj == this.f51414) {
                long j2 = this.f51413;
                j = c4548.f14512;
                if (j2 == j) {
                    i = c4548.f14510;
                    i2 = c4548.f14511;
                    z = m39397(i, i2);
                }
            }
        }
        return z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39422() {
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51411.m16785();
                this.f51417.m47217();
                C15650 c15650 = null;
                this.f51430 = null;
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5959 != null) {
                    c15650 = c5959.f18266;
                }
                if (c5980.m16784() != c15650) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39399();
                m39401();
            }
        } finally {
            m39398();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39410() {
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51411.m16783();
                this.f51417.m47214();
                this.f51425 = null;
                this.f51421 = null;
                this.f51419 = null;
                this.f51408 = -1L;
                this.f51434 = false;
                this.f51430 = null;
                this.f51422 = null;
                this.f51410 = null;
                m39399();
                m39401();
            }
        } finally {
            m39398();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0087 A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127 A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138 A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a A[Catch: all -> 0x0197, Merged into TryCatch #1 {all -> 0x019a, blocks: (B:10:0x0031, B:11:0x0035, B:112:0x0199, B:13:0x0036, B:16:0x003f, B:20:0x0047, B:24:0x0055, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:30:0x0098, B:32:0x00a4, B:34:0x00a8, B:36:0x00ac, B:38:0x00b0, B:40:0x00b6, B:42:0x00bf, B:43:0x00d3, B:45:0x00d9, B:47:0x00dd, B:49:0x00e1, B:51:0x00ea, B:53:0x00ee, B:54:0x00f2, B:56:0x00f8, B:58:0x00fc, B:60:0x0100, B:62:0x0104, B:65:0x011b, B:67:0x0127, B:68:0x012c, B:72:0x013b, B:74:0x0154, B:76:0x0158, B:78:0x015e, B:81:0x0165, B:83:0x016b, B:85:0x0172, B:87:0x017a, B:89:0x0180, B:90:0x0189, B:91:0x018d, B:98:0x0138, B:99:0x012a, B:100:0x0109, B:102:0x00e7, B:103:0x00d0, B:104:0x0087, B:106:0x008d, B:107:0x0093), top: B:9:0x0031 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m39396(l.C23097 r31, l.InterfaceC20445 r32, int r33, int r34, l.EnumC22892 r35, l.C9302 r36, int r37, int r38, int r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16747.m39396(l.᩺ܺܿ, l.᩶᩸ᩳ, int, int, l.᩺ۡܿ, l.ۢۖܿ, int, int, int, int, int, int):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v28 l.￡ﾩﾹￛﾡￜ﾿), method size: 1448
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39392(l.C16747 r17) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16747.m39392(l.ܽܺܿ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C20071 m39389(l.C22187 r18) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16747.m39389(l.᩹ۡܿ):l.᩶ۡܿ");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m39400() {
        long j;
        int i;
        int i2;
        EnumC22892 enumC22892;
        long j2;
        boolean z = false;
        Object obj = null;
        try {
            this.f51433.execute(new RunnableC6438(1, this));
        } catch (Error e) {
            synchronized (this.f51405) {
                this.f51420 = false;
                m39408();
                this.f51424 = null;
                this.f51411.m16785();
                this.f51417.m47217();
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5959 != null) {
                    obj = c5959.f18266;
                }
                if (c5980.m16784() != obj) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39398();
                throw e;
            }
        } catch (RuntimeException unused) {
            synchronized (this.f51405) {
                this.f51420 = false;
                C11604 c11604 = this.f51409;
                if (c11604 == null) {
                    C22187 c22187 = this.f51424;
                    c11604 = c22187 == null ? null : c22187.f71979;
                }
                if (c11604 != null) {
                    long j3 = this.f51413;
                    j2 = c11604.f34612;
                    if (j3 == j2 && C11604.m28489(c11604)) {
                        z = true;
                    }
                }
                m39408();
                this.f51424 = null;
                this.f51411.m16785();
                this.f51417.m47217();
                C5980 c59802 = this.f51411;
                C5959 c59592 = this.f51422;
                if (c59802.m16784() != (c59592 == null ? null : c59592.f18266)) {
                    c59802.m16783();
                    m39399();
                }
                m39407();
                if (z) {
                    Object obj2 = this.f51414;
                    j = c11604.f34612;
                    i = c11604.f34611;
                    i2 = c11604.f34605;
                    enumC22892 = c11604.f34600;
                    obj = new C4548(obj2, j, i, i2, enumC22892, C11604.m28490(c11604), C11604.m28495(c11604), EnumC3137.SCHEDULER_REJECTED);
                }
                m39398();
                if (obj != null) {
                    m39390(new RunnableC20004(2, this, obj));
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m39406(C16747 c16747, long j) {
        long j2;
        int i;
        int i2;
        synchronized (c16747.f51405) {
            C5959 c5959 = c16747.f51422;
            if (c5959 != null) {
                j2 = c5959.f18268;
                if (j2 == j && c16747.f51413 == j) {
                    i = c5959.f18269;
                    i2 = c5959.f18270;
                    if (c16747.m39397(i, i2)) {
                        ((C10899) c16747.f51423).f32771.m47481(c5959);
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39393(C16747 c16747, long j) {
        long j2;
        int i;
        int i2;
        synchronized (c16747.f51405) {
            C7370 c7370 = c16747.f51410;
            if (c7370 != null) {
                j2 = c7370.f22638;
                if (j2 == j && c16747.f51413 == j) {
                    i = c7370.f22637;
                    i2 = c7370.f22639;
                    if (c16747.m39397(i, i2)) {
                        ((C10899) c16747.f51423).f32771.m47482(c7370);
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39394(C16747 c16747, C4548 c4548) {
        long j;
        int i;
        int i2;
        synchronized (c16747.f51405) {
            long j2 = c16747.f51413;
            j = c4548.f14512;
            if (j2 == j) {
                i = c4548.f14510;
                i2 = c4548.f14511;
                if (c16747.m39397(i, i2)) {
                    C10899 c10899 = (C10899) c16747.f51423;
                    C20777.m47492(c10899.f32771, c4548);
                    c10899.f32772.postInvalidateOnAnimation();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39390(Runnable runnable) {
        try {
            this.f51426.execute(new RunnableC5254(0, runnable));
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m39404() {
        if (this.f51403 != null) {
            this.f51403.f30627 = true;
        }
        this.f51403 = null;
        long j = this.f51428 + 1;
        this.f51428 = j;
        this.f51413 = j;
        this.f51405.notifyAll();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m39399() {
        this.f51431 = false;
        this.f51404 = null;
        this.f51416 = 0;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m39401() {
        this.f51418 = null;
        this.f51415 = 0;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m39408() {
        C11604 c11604;
        boolean z;
        if (this.f51403 != null) {
            this.f51403.f30627 = true;
        }
        this.f51403 = null;
        C11604 c116042 = this.f51409;
        if (c116042 != null) {
            C11604.m28505(c116042);
        }
        C22187 c22187 = this.f51424;
        if (c22187 != null) {
            c11604 = c22187.f71979;
            C11604.m28505(c11604);
            z = this.f51424.f71980;
            if (!z) {
                this.f51432.add(this.f51424);
            }
        }
        this.f51409 = null;
        this.f51424 = null;
        this.f51405.notifyAll();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m39398() {
        C22187 c22187;
        while (true) {
            synchronized (this.f51405) {
                c22187 = (C22187) this.f51432.pollFirst();
            }
            if (c22187 == null) {
                return;
            } else {
                try {
                    C22187.m49834(c22187);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m39402(C11604 c11604) {
        C23097 c23097;
        InterfaceC20445 interfaceC20445;
        EnumC22892 enumC22892;
        boolean m50980;
        EnumC22892 enumC228922;
        boolean m509802;
        long j;
        if (this.f51403 != null) {
            long j2 = this.f51403.f30628;
            j = c11604.f34612;
            if (j2 == j) {
                this.f51403.f30627 = true;
                this.f51403 = null;
                this.f51412 = true;
            }
        }
        C23097 c230972 = this.f51425;
        c23097 = c11604.f34602;
        if (c230972 == c23097) {
            InterfaceC20445 interfaceC204452 = this.f51421;
            interfaceC20445 = c11604.f34601;
            if (interfaceC204452 == interfaceC20445) {
                boolean z = this.f51434;
                enumC22892 = c11604.f34600;
                m50980 = enumC22892.m50980();
                if (z == m50980) {
                    enumC228922 = c11604.f34600;
                    m509802 = enumC228922.m50980();
                    if (m509802) {
                        this.f51417.m47217();
                        m39407();
                        return;
                    }
                    this.f51411.m16785();
                    C5980 c5980 = this.f51411;
                    C5959 c5959 = this.f51422;
                    if (c5980.m16784() != (c5959 != null ? c5959.f18266 : null)) {
                        c5980.m16783();
                        m39399();
                        return;
                    }
                    return;
                }
            }
        }
        this.f51411.m16783();
        this.f51417.m47214();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39407() {
        C7370 c7370 = this.f51410;
        C14280 c14280 = c7370 == null ? null : c7370.f22640;
        C20632 c20632 = this.f51417;
        if (c20632.m47216() != c14280) {
            c20632.m47214();
            m39401();
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m39405() {
        if (this.f51420) {
            return false;
        }
        if (this.f51409 == null && this.f51424 == null) {
            return false;
        }
        this.f51420 = true;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4548 m39388(C11604 c11604, EnumC3137 enumC3137) {
        long j;
        boolean z;
        long j2;
        int i;
        int i2;
        EnumC22892 enumC22892;
        long j3 = this.f51413;
        j = c11604.f34612;
        if (j3 != j) {
            return null;
        }
        z = c11604.f34603;
        if (z || !C11604.m28489(c11604)) {
            return null;
        }
        j2 = c11604.f34612;
        i = c11604.f34611;
        i2 = c11604.f34605;
        enumC22892 = c11604.f34600;
        return new C4548(this.f51414, j2, i, i2, enumC22892, C11604.m28490(c11604), C11604.m28495(c11604), enumC3137);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3137 m39387(RuntimeException runtimeException) {
        if (runtimeException instanceof C8097) {
            int i = C21482.f69116[((C8097) runtimeException).m21522().ordinal()];
            if (i == 1) {
                return EnumC3137.REGEX_TIMEOUT;
            }
            if (i == 2) {
                return EnumC3137.REGEX_RESOURCE_LIMIT;
            }
            if (i == 3) {
                return EnumC3137.INVALID_RESULT;
            }
            if (i != 4) {
                throw new IncompatibleClassChangeError();
            }
            throw new IllegalArgumentException("Canceled syntax requests must not publish failures", runtimeException);
        }
        return EnumC3137.EXECUTION_BUG;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39391(C11604 c11604) {
        boolean z;
        z = c11604.f34603;
        if (z || !C11604.m28489(c11604)) {
            throw new C13719();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m39397(int i, int i2) {
        InterfaceC20445 interfaceC20445 = this.f51421;
        if (interfaceC20445 == null) {
            return false;
        }
        try {
            if (interfaceC20445.mo26548() == i && interfaceC20445.length() == i2) {
                return interfaceC20445.mo26548() == i;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
