package l;

import android.media.MediaDataSource;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: L8GV */
/* renamed from: l.ܰ᩻᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14159 implements Closeable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final long f42726;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f42727;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f42728;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f42729;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC23332 f42730;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f42731;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f42732;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23969 f42733;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile InputStream f42734;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CRC32 f42735;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10630 f42736;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Thread f42737;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42738;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f42739;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f42740;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized byte[] m33785(int i, int i2) {
        if (this.f42727) {
            throw new IOException("Closed");
        }
        long j = i * X931RNG.BLOCK64_RESEED_MAX;
        if (this.f42734 != null) {
            try {
                long j2 = this.f42731;
                if (j == j2) {
                    InputStream inputStream = this.f42734;
                    byte[] bArr = C22194.f71991;
                    byte[] bArr2 = new byte[i2];
                    C22194.m49857(inputStream, bArr2, i2);
                    this.f42731 = i2 + j;
                    return bArr2;
                }
                if (j > j2 && j - j2 < 327680) {
                    C22194.m49856(j - this.f42731, this.f42734);
                    this.f42731 = j;
                    byte[] bArr3 = new byte[i2];
                    C22194.m49857(this.f42734, bArr3, i2);
                    this.f42731 = i2 + j;
                    return bArr3;
                }
                C22194.m49850((Closeable) this.f42734);
                this.f42734 = null;
            } catch (IOException unused) {
                C22194.m49850((Closeable) this.f42734);
                this.f42734 = null;
            }
        }
        if (this.f42727) {
            throw new IOException("Closed");
        }
        InputStream mo35309 = this.f42730.mo35309(j);
        if (!(mo35309 instanceof BufferedInputStream) && !(mo35309 instanceof C4362)) {
            mo35309 = new BufferedInputStream(mo35309);
        }
        this.f42734 = mo35309;
        try {
            if (this.f42727) {
                throw new IOException("Closed");
            }
            byte[] bArr4 = C22194.f71991;
            byte[] bArr5 = new byte[i2];
            C22194.m49857(mo35309, bArr5, i2);
            this.f42731 = j + i2;
            return bArr5;
        } catch (IOException e) {
            C22194.m49850((Closeable) mo35309);
            this.f42734 = null;
            throw e;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33789() {
        synchronized (this.f42732) {
            if (!this.f42727 && this.f42737 == null && this.f42739 != null) {
                this.f42738++;
                Thread thread = new Thread(new RunnableC19009(2, this));
                this.f42737 = thread;
                thread.setDaemon(true);
                this.f42737.setName("NetworkFileCacheThread-" + this.f42740.hashCode());
                this.f42737.start();
                return;
            }
            if (this.f42737 == null || this.f42727 || this.f42739 == null) {
                throw new IllegalStateException();
            }
        }
    }

    public C14159(InterfaceC23332 interfaceC23332, String str, long j) {
        C2803 m8652 = C2803.m8652();
        m8652.m8656(320L);
        this.f42733 = m8652.m8654();
        this.f42728 = 0;
        this.f42732 = new AtomicInteger(1);
        this.f42735 = new CRC32();
        this.f42730 = interfaceC23332;
        this.f42740 = str;
        this.f42726 = j;
        long j2 = (j + 32767) / X931RNG.BLOCK64_RESEED_MAX;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        this.f42729 = i - 1;
        this.f42739 = null;
        this.f42736 = null;
    }

    public C14159(C14874 c14874, String str, long j, AbstractC15440 abstractC15440) {
        C2803 m8652 = C2803.m8652();
        m8652.m8656(320L);
        this.f42733 = m8652.m8654();
        int i = 0;
        this.f42728 = 0;
        this.f42732 = new AtomicInteger(1);
        this.f42735 = new CRC32();
        this.f42730 = c14874;
        this.f42740 = str;
        this.f42726 = j;
        long j2 = (32767 + j) / X931RNG.BLOCK64_RESEED_MAX;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f42729 = i2 - 1;
        abstractC15440.mo35195();
        C23411 m36513 = abstractC15440.m36513("rw");
        this.f42739 = m36513;
        this.f42736 = new C10630();
        try {
            if (m36513.length() < 12) {
                m33781();
                return;
            }
            if (m36513.readInt() != 358818181 || m36513.readLong() != j) {
                throw new IOException();
            }
            m36513.seek(12L);
            while (this.f42739.available() > 0) {
                if (this.f42739.available() < 32776) {
                    C23411 c23411 = this.f42739;
                    c23411.setLength(c23411.getFilePointer());
                    return;
                }
                int readInt = this.f42739.readInt();
                int mo21172 = this.f42739.mo21172();
                if (readInt > this.f42729 || mo21172 > 32768) {
                    throw new IOException();
                }
                int i3 = i + 1;
                this.f42736.mo23658(readInt, i);
                this.f42739.seek((i3 * 32776) + 12);
                i = i3;
            }
        } catch (Exception unused) {
            m33781();
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m33781() {
        C23411 c23411 = this.f42739;
        c23411.setLength(0L);
        c23411.writeInt(358818181);
        long j = this.f42726;
        c23411.write((int) (j & 255));
        c23411.write((int) ((j >>> 8) & 255));
        c23411.write((int) ((j >>> 16) & 255));
        c23411.write((int) ((j >>> 24) & 255));
        c23411.write((int) ((j >>> 32) & 255));
        c23411.write((int) ((j >>> 40) & 255));
        c23411.write((int) ((j >>> 48) & 255));
        c23411.write((int) ((j >>> 56) & 255));
        this.f42736.clear();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33790(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        long j2 = this.f42726;
        if (j >= j2) {
            return -1;
        }
        int min = (int) Math.min(i2, j2 - j);
        if (min == 0) {
            return 0;
        }
        int i3 = min;
        while (i3 > 0) {
            int i4 = (int) (j / X931RNG.BLOCK64_RESEED_MAX);
            long j3 = i4 * X931RNG.BLOCK64_RESEED_MAX;
            int i5 = i4 == this.f42729 ? (int) (j2 - j3) : 32768;
            int i6 = (int) (j - j3);
            int min2 = Math.min(i5 - i6, i3);
            System.arraycopy(m33779(i4, i5), i6, bArr, i, min2);
            i3 -= min2;
            i += min2;
            j += min2;
        }
        return min;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m33792() {
        return this.f42726;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33784(C14159 c14159) {
        int i;
        while (!c14159.f42727 && c14159.f42736.size() < c14159.f42729 + 1) {
            try {
                int i2 = c14159.f42728;
                int i3 = i2;
                while (true) {
                    if (i3 > c14159.f42729) {
                        i3 = -1;
                        break;
                    } else if (!c14159.f42736.mo23659(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 == -1) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i2) {
                            break;
                        }
                        if (!c14159.f42736.mo23659(i4)) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 == -1) {
                    break;
                }
                try {
                    if (i3 == c14159.f42729) {
                        i = (int) (c14159.f42726 - (i3 * X931RNG.BLOCK64_RESEED_MAX));
                    } else {
                        i = 32768;
                    }
                    c14159.m33779(i3, i);
                    if (i2 == c14159.f42728) {
                        c14159.f42728 = i3 + 1;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                synchronized (c14159) {
                    if (c14159.f42734 != null) {
                        C22194.m49850((Closeable) c14159.f42734);
                        c14159.f42734 = null;
                    }
                    c14159.m33783();
                    throw th;
                }
            }
        }
        synchronized (c14159) {
            if (c14159.f42734 != null) {
                C22194.m49850((Closeable) c14159.f42734);
                c14159.f42734 = null;
            }
        }
        c14159.m33783();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m33779(int i, int i2) {
        synchronized (this.f42732) {
            if (this.f42727) {
                throw new IOException("Closed");
            }
            this.f42738++;
        }
        try {
            try {
                return (byte[]) this.f42733.mo24975(Integer.valueOf(i), new CallableC10633(this, i, i2));
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Failed to load page " + i, e);
            }
        } finally {
            m33783();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m33783() {
        boolean z;
        synchronized (this.f42732) {
            z = true;
            this.f42738--;
            if (!this.f42727 || this.f42738 != 0) {
                z = false;
            }
        }
        if (z) {
            m33782();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33780(C14159 c14159, int i, int i2) {
        int m26664;
        byte[] bArr = null;
        if (c14159.f42739 != null && (m26664 = c14159.f42736.m26664(i)) != -1) {
            try {
                synchronized (c14159.f42739) {
                    try {
                        c14159.f42739.seek((m26664 * 32776) + 12);
                        int readInt = c14159.f42739.readInt();
                        int mo21172 = c14159.f42739.mo21172();
                        int mo211722 = c14159.f42739.mo21172();
                        if (readInt == i) {
                            if (mo21172 == i2) {
                                byte[] bArr2 = new byte[mo21172];
                                C23411 c23411 = c14159.f42739;
                                c23411.getClass();
                                c23411.m51858(bArr2, 0, mo21172);
                                CRC32 crc32 = c14159.f42735;
                                crc32.reset();
                                crc32.update(bArr2);
                                if (mo211722 == ((int) (crc32.getValue() & 65535))) {
                                    bArr = bArr2;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                c14159.m33781();
            }
        }
        if (bArr != null && bArr.length == i2) {
            return bArr;
        }
        c14159.f42728 = i;
        byte[] m33785 = c14159.m33785(i, i2);
        c14159.m33788(i, m33785);
        return m33785;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: all -> 0x0097, TryCatch #1 {, blocks: (B:8:0x0007, B:10:0x0016, B:12:0x0024, B:17:0x0037, B:19:0x0043, B:20:0x004a, B:22:0x0084, B:23:0x0090, B:24:0x0095), top: B:7:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[Catch: all -> 0x0097, TryCatch #1 {, blocks: (B:8:0x0007, B:10:0x0016, B:12:0x0024, B:17:0x0037, B:19:0x0043, B:20:0x004a, B:22:0x0084, B:23:0x0090, B:24:0x0095), top: B:7:0x0007, outer: #0 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33788(int r13, byte[] r14) {
        /*
            r12 = this;
            l.᩻ۖܽ r0 = r12.f42739
            if (r0 != 0) goto L6
            goto L9a
        L6:
            monitor-enter(r0)     // Catch: java.lang.Exception -> L9a
            l.ۤ᩻ᩴ r1 = r12.f42736     // Catch: java.lang.Throwable -> L97
            int r1 = r1.m26664(r13)     // Catch: java.lang.Throwable -> L97
            r2 = -1
            r4 = 32776(0x8008, double:1.61935E-319)
            r6 = 12
            if (r1 < 0) goto L32
            long r8 = (long) r1     // Catch: java.lang.Throwable -> L97
            long r8 = r8 * r4
            long r8 = r8 + r6
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            long r10 = r1.length()     // Catch: java.lang.Throwable -> L97
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L32
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            r1.seek(r8)     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            int r1 = r1.readInt()     // Catch: java.lang.Throwable -> L97
            if (r1 != r13) goto L32
            goto L33
        L32:
            r8 = r2
        L33:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L4a
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            long r8 = r1.length()     // Catch: java.lang.Throwable -> L97
            long r1 = r8 - r6
            long r1 = r1 % r4
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L4a
            long r1 = (long) r2     // Catch: java.lang.Throwable -> L97
            long r8 = r8 - r1
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            r1.setLength(r8)     // Catch: java.lang.Throwable -> L97
        L4a:
            long r1 = r8 - r6
            long r1 = r1 / r4
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            r1.seek(r8)     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            r1.writeInt(r13)     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            int r3 = r14.length     // Catch: java.lang.Throwable -> L97
            r1.m51859(r3)     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            java.util.zip.CRC32 r3 = r12.f42735     // Catch: java.lang.Throwable -> L97
            r3.reset()     // Catch: java.lang.Throwable -> L97
            r3.update(r14)     // Catch: java.lang.Throwable -> L97
            long r3 = r3.getValue()     // Catch: java.lang.Throwable -> L97
            r5 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L97
            r1.m51859(r4)     // Catch: java.lang.Throwable -> L97
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            r1.getClass()     // Catch: java.lang.Throwable -> L97
            int r3 = r14.length     // Catch: java.lang.Throwable -> L97
            r4 = 0
            r1.write(r14, r4, r3)     // Catch: java.lang.Throwable -> L97
            int r1 = r14.length     // Catch: java.lang.Throwable -> L97
            r3 = 32768(0x8000, float:4.5918E-41)
            if (r1 >= r3) goto L90
            l.᩻ۖܽ r1 = r12.f42739     // Catch: java.lang.Throwable -> L97
            int r14 = r14.length     // Catch: java.lang.Throwable -> L97
            int r3 = r3 - r14
            byte[] r14 = new byte[r3]     // Catch: java.lang.Throwable -> L97
            r1.getClass()     // Catch: java.lang.Throwable -> L97
            r1.write(r14, r4, r3)     // Catch: java.lang.Throwable -> L97
        L90:
            l.ۤ᩻ᩴ r14 = r12.f42736     // Catch: java.lang.Throwable -> L97
            r14.mo23658(r13, r2)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            throw r13     // Catch: java.lang.Exception -> L9a
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14159.m33788(int, byte[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaDataSource m33787() {
        return new C6399(this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 m33791() {
        return new C12044(this);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m33793() {
        synchronized (this.f42732) {
            if (this.f42727) {
                return false;
            }
            this.f42732.incrementAndGet();
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f42727 && this.f42732.decrementAndGet() <= 0) {
            C23411 c23411 = this.f42739;
            if (c23411 != null) {
                c23411.flush();
            }
            C1802.f6208.submit(new RunnableC21604(3, this));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33778(C14159 c14159) {
        SystemClock.sleep(200L);
        synchronized (c14159.f42732) {
            if (c14159.f42732.get() > 0) {
                return;
            }
            if (c14159.f42727) {
                return;
            }
            boolean z = true;
            c14159.f42727 = true;
            if (c14159.f42738 != 0) {
                z = false;
            }
            C22194.m49850((Closeable) c14159.f42734);
            Thread thread = c14159.f42737;
            if (thread != null && thread.isAlive()) {
                c14159.f42737.interrupt();
            }
            if (z) {
                c14159.m33782();
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m33782() {
        C22194.m49850((Closeable) this.f42734);
        this.f42734 = null;
        C22194.m49850(this.f42739);
        this.f42733.mo24977();
        this.f42733.mo24976();
        C10630 c10630 = this.f42736;
        if (c10630 != null) {
            c10630.clear();
            this.f42736.m26665();
        }
    }
}
