package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: D70T */
/* renamed from: l.ۘۧܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3902 implements InterfaceC15895, InterfaceC6930 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f12472;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12473 = new AtomicInteger(1);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12474;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2491 f12475;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f12476;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11892(File file, C9047 c9047, InterfaceC17066 interfaceC17066) {
        int i = c9047 == null ? 0 : c9047.f27431;
        if (i <= 0) {
            throw new IllegalArgumentException("Hex literal range is empty");
        }
        C3902 m11891 = m11891(file, i, true, true);
        try {
            Iterator it = C19631.m45135(c9047).iterator();
            while (it.hasNext()) {
                m11891.mo11896((C21042) it.next(), interfaceC17066);
            }
            m11891.finish();
            return m11891;
        } catch (IOException | Error | RuntimeException e) {
            try {
                m11891.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C3902(int i, C2491 c2491, boolean z) {
        if (c2491.length() != i) {
            throw new IllegalArgumentException("Hex clipboard allocation length mismatch");
        }
        this.f12476 = i;
        this.f12475 = c2491;
        if (z) {
            this.f12472 = new byte[Math.min(i, 1048576)];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11890(File file, int i) {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        return m11891(file, i, true, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11889(int i, long j, C22951 c22951) {
        synchronized (C18177.f56530) {
            if (C18177.f56534 != c22951) {
                return null;
            }
            C2491 m51071 = c22951.m51071(i, j);
            if (m51071 == null) {
                return null;
            }
            try {
                return new C3902(i, m51071, true);
            } catch (Error | RuntimeException e) {
                try {
                    m51071.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11893(File file, byte[] bArr, int i, int i2, InterfaceC17066 interfaceC17066) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Hex literal file allocation is empty");
        }
        InterfaceC17066 m38504 = C16360.m38504(interfaceC17066);
        if (m38504.mo1526()) {
            throw new C23821();
        }
        int i3 = 0;
        C3902 m11891 = m11891(file, i2, true, false);
        while (i3 < i2) {
            try {
                if (m38504.mo1526()) {
                    throw new C23821();
                }
                int min = Math.min(1048576, i2 - i3);
                m11891.f12475.m7988(i3, bArr, i + i3, min);
                i3 += min;
            } catch (IOException | Error | RuntimeException e) {
                try {
                    m11891.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        if (m38504.mo1526()) {
            throw new C23821();
        }
        m11891.f12474 = i2;
        return m11891;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3902 m11894(File file, int i) {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        C22951 m51063 = C22951.m51063(file);
        C2491 c2491 = null;
        try {
            synchronized (C18177.f56530) {
                c2491 = m51063.m51070(i);
            }
            return new C3902(i, c2491, true);
        } catch (IOException | Error | RuntimeException e) {
            if (c2491 != null) {
                try {
                    c2491.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11888(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Hex clipboard allocation is empty");
        }
        return m11891((File) null, i, false, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3902 m11891(File file, int i, boolean z, boolean z2) {
        C2491 m51070;
        AutoCloseable autoCloseable = null;
        try {
            synchronized (C18177.f56530) {
                if (C18177.f56534 == null) {
                    if (!z) {
                        throw new IOException("Hex clipboard shared arena is unavailable");
                    }
                    C18177.f56534 = C22951.m51063(file);
                }
                m51070 = C18177.f56534.m51070(i);
            }
            return new C3902(i, m51070, z2);
        } catch (IOException | Error | RuntimeException e) {
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    @Override // l.InterfaceC15895
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo11896(C21042 c21042, InterfaceC17066 interfaceC17066) {
        m11895();
        int i = this.f12474;
        int i2 = c21042.f67894;
        int i3 = c21042.f67894;
        if (i + i2 > this.f12476 || this.f12472 == null) {
            throw new IOException("Hex clipboard file backing overflow");
        }
        int i4 = 0;
        while (i4 < i3) {
            if (interfaceC17066.mo1526()) {
                throw new C23821();
            }
            int min = Math.min(this.f12472.length, i3 - i4);
            c21042.m47875(i4, this.f12472, 0, min);
            if (interfaceC17066.mo1526()) {
                throw new C23821();
            }
            this.f12475.m7988(this.f12474, this.f12472, 0, min);
            i4 += min;
            this.f12474 += min;
        }
        return i;
    }

    @Override // l.InterfaceC15895
    public final void finish() {
        m11895();
        if (this.f12474 != this.f12476) {
            throw new IOException("Incomplete hex clipboard file backing");
        }
        this.f12472 = null;
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f12476;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) {
        m11895();
        if (this.f12474 != this.f12476 || this.f12472 != null) {
            throw new IOException("Hex clipboard file backing is incomplete");
        }
        this.f12475.m7987(i, bArr, i2, i3);
    }

    @Override // l.InterfaceC18883
    /* renamed from: ۫ */
    public final boolean mo10086() {
        return this.f12473.get() > 0 && this.f12475.isOpen();
    }

    @Override // l.InterfaceC18883
    /* renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f12473;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
            long j = i + 1;
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f12473;
        int decrementAndGet = atomicInteger.decrementAndGet();
        if (decrementAndGet == 0) {
            this.f12475.close();
        } else {
            if (decrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex clipboard file source already closed");
        }
    }

    @Override // l.InterfaceC4066
    /* renamed from: ֫ */
    public final Object mo10083() {
        return this.f12475;
    }

    @Override // l.InterfaceC6930
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long mo11897() {
        return this.f12476;
    }

    @Override // l.InterfaceC6930
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo11898() {
        return this.f12476;
    }

    @Override // l.InterfaceC4066
    /* renamed from: ܽ */
    public final long mo10087() {
        return this.f12475.length();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m11895() {
        if (this.f12473.get() <= 0 || !this.f12475.isOpen()) {
            throw new ClosedChannelException();
        }
    }
}
