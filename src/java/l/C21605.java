package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* compiled from: 06UY */
/* renamed from: l.᩸۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21605 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f69369;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1143 f69370;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10316 f69371;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f69372;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f69373;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final UUID f69374;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f69375;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69376;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69378;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f69379;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5377 f69380;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69381;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f69382;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicLong f69383 = new AtomicLong(1);

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f69368 = 1;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f69377 = new FutureC3575();

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48811() {
        if (this.f69376) {
            throw new IllegalStateException("Page store is closed");
        }
        this.f69368++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48785(InterfaceC20758 interfaceC20758, C1143 c1143) {
        return m48793(new C13137(interfaceC20758, false), c1143);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48786(InterfaceC20758 interfaceC20758, C1143 c1143, UUID uuid) {
        return m48784(new C13137(interfaceC20758, true), c1143, 2048, 16, uuid, 1L);
    }

    public C21605(InterfaceC10316 interfaceC10316, C1143 c1143, int i, int i2, UUID uuid, long j) {
        this.f69371 = new C15959(interfaceC10316);
        this.f69370 = c1143;
        this.f69369 = i;
        this.f69373 = i2;
        this.f69374 = uuid;
        this.f69375 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48783(InterfaceC10316 interfaceC10316, C1143 c1143) {
        return m48784(interfaceC10316, c1143, 2048, 16, UUID.randomUUID(), 1L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48787(C21605 c21605, InterfaceC20758 interfaceC20758) {
        if (c21605.f69375 == C13132.FOREVER_NS) {
            throw new IOException("Recovery generation exhausted");
        }
        return m48784(new C13137(interfaceC20758, true), c21605.f69370, c21605.f69369, c21605.f69373, c21605.f69374, c21605.f69375 + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48784(InterfaceC10316 interfaceC10316, C1143 c1143, int i, int i2, UUID uuid, long j) {
        try {
            m48788(i, i2);
            C21605 c21605 = new C21605(interfaceC10316, c1143, i, i2, uuid, j);
            UUID uuid2 = c21605.f69374;
            C10130 c10130 = new C10130(64);
            c10130.writeInt(843338829);
            c10130.writeInt(1);
            c10130.m25431(uuid2.getMostSignificantBits());
            c10130.m25431(uuid2.getLeastSignificantBits());
            c10130.m25431(c21605.f69375);
            c10130.writeInt(i);
            c10130.writeInt(i2);
            c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
            while (c10130.size() < 64) {
                c10130.writeByte(0);
            }
            interfaceC10316.mo14383(0L, c10130.size(), c10130.m25438());
            interfaceC10316.mo14386();
            interfaceC10316.mo14385();
            c21605.f69379 = 64L;
            return c21605;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC10316.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21605 m48793(InterfaceC10316 interfaceC10316, C1143 c1143) {
        try {
            byte[] bArr = new byte[64];
            interfaceC10316.mo14384(0L, bArr, 0, 64);
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 843338829 || c12951.readInt() != 1) {
                throw new IOException("Unsupported recovery file");
            }
            UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
            long readLong = c12951.readLong();
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            m48788(readInt, readInt2);
            if (readLong <= 0 || c12951.readInt() != C1829.m6061(0, 40, bArr)) {
                throw new IOException("Invalid recovery file header");
            }
            while (c12951.available() != 0) {
                if (c12951.readByte() != 0) {
                    throw new IOException("Unsupported recovery file header");
                }
            }
            C21605 c21605 = new C21605(interfaceC10316, c1143, readInt, readInt2, uuid, readLong);
            c21605.f69379 = interfaceC10316.length();
            c21605.f69372 = true;
            return c21605;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC10316.close();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48788(int i, int i2) {
        if (i < 8 || i > 65536 || (i & 1) != 0 || i2 < 4 || i2 > 256 || (i2 & 1) != 0) {
            throw new IOException("Invalid recovery tree configuration");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m48810() {
        long andIncrement = this.f69383.getAndIncrement();
        if (andIncrement > 0) {
            return andIncrement;
        }
        throw new IllegalStateException("Page identity exhausted");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m48807() {
        return this.f69383.get();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m48805() {
        return this.f69372;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m48808() {
        long j;
        synchronized (this.f69370.f4153) {
            j = this.f69379;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48800(long j, long j2) {
        synchronized (this.f69370.f4153) {
            if (!this.f69372 || j < 64 || j > this.f69379 || j2 <= 0) {
                throw new IOException("Invalid recovery acceptance");
            }
            ((C15959) this.f69371).truncate(j);
            this.f69379 = j;
            try {
                ((C15959) this.f69371).mo14386();
                this.f69383.set(j2);
                this.f69372 = false;
                this.f69382 = false;
            } catch (IOException e) {
                this.f69382 = true;
                throw e;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x0073
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0047 A[Catch: all -> 0x0076, TryCatch #3 {all -> 0x0076, blocks: (B:15:0x003e, B:18:0x004a, B:19:0x004e, B:38:0x0075, B:42:0x0047), top: B:14:0x003e }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C15253 m48799() {
        /*
            r8 = this;
            l.֨۬ᩳ r0 = r8.f69370
            java.lang.Object r0 = r0.f4153
            monitor-enter(r0)
            r8.m48795()     // Catch: java.lang.Throwable -> L7d
            int r1 = r8.f69381     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L17
            l.ܶ۬ᩳ r2 = new l.ܶ۬ᩳ     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L7d
            int r1 = r1 + 1
            r8.f69381 = r1     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r2
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            l.֨۬ᩳ r0 = r8.f69370
            long r0 = r0.m3930()
            r2 = 32
            long r0 = r0 / r2
            r2 = 65536(0x10000, double:3.2379E-319)
            long r0 = java.lang.Math.min(r2, r0)
            int r1 = (int) r0
            r0 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 < r0) goto L3d
            l.֨۬ᩳ r0 = r8.f69370     // Catch: java.lang.Throwable -> L3d
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L3d
            r5 = 23
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 & r5
            l.ۚ۬ᩳ r0 = r0.m3921(r3)     // Catch: java.lang.Throwable -> L3d
            r3 = r0
            goto L3e
        L3d:
            r3 = r2
        L3e:
            l.ܶ۬ᩳ r4 = new l.ܶ۬ᩳ     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L47
            r1 = r2
            goto L4a
        L47:
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L76
            r1 = r0
        L4a:
            l.֨۬ᩳ r0 = r8.f69370     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.f4153     // Catch: java.lang.Throwable -> L76
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L76
            r8.m48795()     // Catch: java.lang.Throwable -> L73
            int r5 = r8.f69381     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L62
            l.ۤ۬ᩳ r5 = r8.f69371     // Catch: java.lang.Throwable -> L73
            l.ܺ۬ᩳ r5 = (l.C15959) r5     // Catch: java.lang.Throwable -> L73
            long r6 = r8.f69379     // Catch: java.lang.Throwable -> L73
            r5.m37736(r6, r1)     // Catch: java.lang.Throwable -> L73
            r8.f69380 = r3     // Catch: java.lang.Throwable -> L73
            goto L63
        L62:
            r2 = r3
        L63:
            int r1 = r8.f69381     // Catch: java.lang.Throwable -> L70
            int r1 = r1 + 1
            r8.f69381 = r1     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            return r4
        L70:
            r1 = move-exception
            r3 = r2
            goto L74
        L73:
            r1 = move-exception
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            if (r3 == 0) goto L7c
            r3.close()
        L7c:
            throw r0
        L7d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21605.m48799():l.ܶ۬ᩳ");
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48803() {
        synchronized (this.f69370.f4153) {
            m48795();
            try {
                ((C15959) this.f69371).mo14386();
            } catch (IOException e) {
                this.f69382 = true;
                throw e;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8199 m48796(int i, int i2, boolean z, Supplier supplier) {
        long m27307 = C11002.m27307(this.f69369, i2, z);
        C1143 c1143 = this.f69370;
        C5377 m3921 = c1143.m3921(m27307);
        try {
            C11002 c11002 = (C11002) supplier.get();
            C8199 c8199 = new C8199(this, m48810(), -1L, this.f69369, i, i2, z);
            if (c11002.f33098 != i || c11002.f33100 != i2 || c11002.m27319() != z) {
                throw new IllegalStateException("Invalid text page statistics");
            }
            c1143.m3924(c8199, c11002, m3921);
            m3921.close();
            return c8199;
        } catch (Throwable th) {
            try {
                m3921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8199 m48797(C11002 c11002) {
        boolean z;
        if (c11002.m27315() != this.f69369) {
            throw new IllegalArgumentException("Incompatible copied page capacity");
        }
        if (!c11002.m27319()) {
            for (int i = 0; i < c11002.f33098; i++) {
                if (c11002.m27310(i) > 255) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        C8199 c8199 = new C8199(this, m48810(), -1L, this.f69369, c11002.f33098, c11002.f33100, z);
        m48801(c8199, c11002);
        return c8199;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48801(C8199 c8199, C11002 c11002) {
        long j;
        IOException iOException;
        long j2;
        synchronized (this.f69370.f4153) {
            if (c8199.f25208 >= 0) {
                return;
            }
            m48795();
            int i = c8199.f25207 ? 1 : 2;
            int i2 = c11002.f33098 * i;
            int i3 = i2 + 16;
            int i4 = i2 + 48;
            int i5 = i2 + 64;
            long j3 = this.f69379;
            C1143 c1143 = this.f69370;
            C10130 c10130 = c1143.f4155;
            byte[] bArr = c1143.f4154;
            CRC32 crc32 = c1143.f4156;
            try {
                if (i5 <= bArr.length) {
                    try {
                        c10130.m25440();
                        c10130.m25420(32);
                        c10130.seek(-1L);
                        m48790(c10130, c8199);
                        try {
                            c11002.m27314(c8199.f25207, 0, bArr, c11002.f33098, c10130.size());
                            crc32.reset();
                            crc32.update(bArr, 32, i3);
                            int value = (int) crc32.getValue();
                            c10130.m25420(i4);
                            c10130.seek(-1L);
                            C1829.m6067(c10130, j3, i3);
                            c10130.seek(0L);
                            j2 = j3;
                            try {
                                C1829.m6066(c10130, 1, c8199.f25205, i3, value);
                                ((C15959) this.f69371).mo14383(j2, i5, bArr);
                                j = j2;
                            } catch (IOException e) {
                                e = e;
                                iOException = e;
                                j = j2;
                                try {
                                    ((C15959) this.f69371).truncate(j);
                                    this.f69379 = j;
                                    throw iOException;
                                } catch (IOException e2) {
                                    this.f69382 = true;
                                    iOException.addSuppressed(e2);
                                    throw iOException;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            j2 = j3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        j = j3;
                        iOException = e;
                        ((C15959) this.f69371).truncate(j);
                        this.f69379 = j;
                        throw iOException;
                    }
                } else {
                    j = j3;
                    try {
                        m48789(c8199, c11002, j, i3, i);
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        ((C15959) this.f69371).truncate(j);
                        this.f69379 = j;
                        throw iOException;
                    }
                }
                this.f69379 = i5 + j;
                c8199.f25208 = j;
            } catch (IOException e6) {
                e = e6;
                j = j3;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48789(C8199 c8199, C11002 c11002, long j, int i, int i2) {
        InterfaceC10316 interfaceC10316;
        C21605 c21605 = this;
        C1143 c1143 = c21605.f69370;
        C10130 c10130 = c1143.f4155;
        byte[] bArr = c1143.f4154;
        CRC32 crc32 = c1143.f4156;
        c10130.m25440();
        m48790(c10130, c8199);
        crc32.reset();
        crc32.update(bArr, 0, c10130.size());
        int length = bArr.length / i2;
        int i3 = 0;
        while (true) {
            int i4 = c11002.f33098;
            if (i3 >= i4) {
                break;
            }
            int min = Math.min(i4 - i3, length);
            int i5 = i3 + min;
            c11002.m27314(c8199.f25207, i3, bArr, i5, 0);
            crc32.update(bArr, 0, min * i2);
            i3 = i5;
        }
        int value = (int) crc32.getValue();
        c10130.m25440();
        byte[] bArr2 = bArr;
        C1829.m6066(c10130, 1, c8199.f25205, i, value);
        m48790(c10130, c8199);
        long j2 = j;
        int size = c10130.size();
        int i6 = 0;
        while (true) {
            int i7 = c11002.f33098;
            interfaceC10316 = c21605.f69371;
            if (i6 >= i7) {
                break;
            }
            int min2 = Math.min(i7 - i6, (bArr2.length - size) / i2);
            int i8 = i6 + min2;
            byte[] bArr3 = bArr2;
            c11002.m27314(c8199.f25207, i6, bArr2, i8, size);
            int i9 = (min2 * i2) + size;
            if (i9 == bArr3.length) {
                ((C15959) interfaceC10316).mo14383(j2, i9, bArr3);
                j2 += i9;
                size = 0;
            } else {
                size = i9;
            }
            bArr2 = bArr3;
            i6 = i8;
            c21605 = this;
        }
        byte[] bArr4 = bArr2;
        if (bArr4.length - size < 16) {
            ((C15959) interfaceC10316).mo14383(j2, size, bArr4);
            j2 += size;
            size = 0;
        }
        c10130.m25420(size);
        c10130.seek(-1L);
        C1829.m6067(c10130, j, i);
        ((C15959) interfaceC10316).mo14383(j2, c10130.size(), bArr4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48790(C10130 c10130, C8199 c8199) {
        c10130.writeInt(c8199.f25203);
        c10130.writeInt(c8199.f25206);
        c10130.writeInt(c8199.f25204);
        c10130.writeInt(c8199.f25207 ? 1 : 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11002 m48798(C8199 c8199, C0437 c0437) {
        C11002 m48782;
        if (c0437 == null) {
            synchronized (this.f69370.f4153) {
                C1143 c1143 = this.f69370;
                m48782 = m48782(c8199, c1143.f4154, c1143.f4146, c1143.f4156);
            }
            return m48782;
        }
        return m48782(c8199, c0437.f1926, c0437.f1928, c0437.f1927);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11002 m48782(C8199 c8199, byte[] bArr, C12951 c12951, CRC32 crc32) {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        long j3;
        C7493 c7493;
        int i4;
        long j4;
        int i5;
        if (c8199.f25202 == this) {
            int i6 = c8199.f25203;
            int i7 = this.f69369;
            if (i6 == i7 && (i = c8199.f25206) >= 0 && i <= i7 && (i2 = c8199.f25204) >= 0 && i2 <= i) {
                int i8 = c8199.f25207 ? 1 : 2;
                int i9 = i * i8;
                int i10 = i9 + 16;
                int i11 = i9 + 64;
                synchronized (this.f69370.f4153) {
                    j = c8199.f25208;
                    if (j >= 64) {
                        j2 = i11;
                        if (j <= this.f69379 - j2) {
                        }
                    }
                    throw new IOException("Truncated or unwritten text page");
                }
                int min = Math.min(i11, bArr.length);
                ((C15959) this.f69371).mo14384(j, bArr, 0, min);
                c12951.seek(0L);
                C7493 m6065 = C1829.m6065(c12951);
                if (m6065.f23083 != 1 || m6065.f23080 != c8199.f25205 || m6065.f23082 != i10) {
                    throw new IOException("Invalid text page reference");
                }
                if (c12951.readInt() != c8199.f25203 || c12951.readInt() != c8199.f25206 || c12951.readInt() != c8199.f25204 || c12951.readInt() != i8) {
                    throw new IOException("Invalid text page metadata");
                }
                crc32.reset();
                int i12 = min;
                crc32.update(bArr, 32, Math.min(i10, i12 - 32));
                C11002 c11002 = new C11002(c8199.f25203, c8199.f25206, c8199.f25204, c8199.f25207);
                int i13 = 48;
                long j5 = i12 + j;
                int i14 = i9;
                int i15 = 0;
                int i16 = 0;
                while (i14 != 0) {
                    if (i13 == i12) {
                        int min2 = Math.min(i14 + 16, bArr.length);
                        i3 = i14;
                        j3 = j;
                        c7493 = m6065;
                        ((C15959) this.f69371).mo14384(j5, bArr, 0, min2);
                        crc32.update(bArr, 0, Math.min(i3, min2));
                        i4 = min2;
                        j4 = j5 + min2;
                        i5 = 0;
                    } else {
                        i3 = i14;
                        j3 = j;
                        c7493 = m6065;
                        i4 = i12;
                        j4 = j5;
                        i5 = i13;
                    }
                    int min3 = Math.min(i3, i4 - i5);
                    i15 = c11002.m27311(bArr, i5, min3, i16, i15);
                    i16 = (min3 / i8) + i16;
                    i13 = i5 + min3;
                    i14 = i3 - min3;
                    m6065 = c7493;
                    i12 = i4;
                    j5 = j4;
                    j = j3;
                }
                long j6 = j;
                C7493 c74932 = m6065;
                if (i15 != c8199.f25204 || ((int) crc32.getValue()) != c74932.f23081) {
                    throw new IOException("Invalid text page checksum");
                }
                if (i12 - i13 < 16) {
                    ((C15959) this.f69371).mo14384((j6 + j2) - 16, bArr, 0, 16);
                    i13 = 0;
                }
                c12951.seek(i13);
                if (C1829.m6064(c12951, j6 + j2) == j6) {
                    return c11002;
                }
                throw new IOException("Invalid recovery footer reference");
            }
        }
        throw new IOException("Invalid text page shape");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7493 m48806(long j) {
        byte[] bArr = new byte[32];
        if (j < 64 || j > this.f69379 - 32) {
            throw new IOException("Invalid recovery record offset");
        }
        ((C15959) this.f69371).mo14384(j, bArr, 0, 32);
        C7493 m6065 = C1829.m6065(new C12951(bArr));
        if (m6065.f23082 + 48 <= this.f69379 - j) {
            return m6065;
        }
        throw new IOException("Truncated recovery record");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m48809(long j, byte[] bArr, int i, int i2) {
        long j2;
        synchronized (this.f69370.f4153) {
            m48795();
            if (i2 < 0 || i2 > bArr.length || i2 > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            j2 = this.f69379;
            try {
                int m6061 = C1829.m6061(0, i2, bArr);
                C1143 c1143 = this.f69370;
                C10130 c10130 = c1143.f4155;
                byte[] bArr2 = c1143.f4154;
                System.arraycopy(bArr, 0, bArr2, 32, i2);
                c10130.m25440();
                c10130.m25420(i2 + 32);
                C1829.m6066(c10130, i, j, i2, m6061);
                c10130.seek(-1L);
                C1829.m6067(c10130, j2, i2);
                ((C15959) this.f69371).mo14383(j2, c10130.size(), bArr2);
                this.f69379 = c10130.size() + j2;
            } catch (IOException e) {
                try {
                    ((C15959) this.f69371).truncate(j2);
                    this.f69379 = j2;
                    throw e;
                } catch (IOException e2) {
                    this.f69382 = true;
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        }
        return j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48802(long j, C7493 c7493) {
        byte[] bArr;
        synchronized (this.f69370.f4153) {
            int i = c7493.f23082;
            if (i > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            bArr = new byte[i];
            long j2 = j + 32;
            ((C15959) this.f69371).mo14384(j2, bArr, 0, i);
            int i2 = C1829.f6267;
            if (i != c7493.f23082 || C1829.m6061(0, i, bArr) != c7493.f23081) {
                throw new IOException("Invalid recovery payload checksum");
            }
            byte[] bArr2 = new byte[16];
            long j3 = j2 + i;
            ((C15959) this.f69371).mo14384(j3, bArr2, 0, 16);
            if (C1829.m6063(j3 + 16, bArr2) != j) {
                throw new IOException("Invalid recovery footer reference");
            }
        }
        return bArr;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m48795() {
        if (this.f69372) {
            throw new IOException("Recovery validation is required before append");
        }
        if (this.f69382) {
            throw new IOException("Recovery append requires reopening after I/O failure");
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m48804() {
        return this.f69377;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48812() {
        synchronized (this) {
            int i = this.f69368 - 1;
            this.f69368 = i;
            if (i != 0) {
                return;
            }
            this.f69376 = true;
            try {
                this.f69370.m3925(this);
                ((C15959) this.f69371).close();
                this.f69377.m10912((Object) null);
            } catch (IOException | Error | RuntimeException e) {
                this.f69377.m10914(e);
                if (e instanceof IOException) {
                    throw new UncheckedIOException((IOException) e);
                }
                if (!(e instanceof RuntimeException)) {
                    throw ((Error) e);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f69378) {
                return;
            }
            this.f69378 = true;
            m48812();
        }
    }
}
