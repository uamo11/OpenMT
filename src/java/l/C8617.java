package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.UUID;
import moe.shizuku.server.IShizukuService;

/* compiled from: 86UT */
/* renamed from: l.ۡۗᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8617 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile long f26321;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26322;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14820 f26323;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14260 f26324;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21605 f26325;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26326;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22372(C9323 c9323) {
        C8617 c8617;
        C23433 c23433;
        c8617 = c9323.f28281;
        if (c8617 != this || c9323.f28282 == null || this.f26321 != -1) {
            throw new IllegalArgumentException("Invalid recovered journal state");
        }
        c23433 = c9323.f28284;
        this.f26325.m48800(c23433.f75237, c23433.f75249);
        this.f26326 = c23433.f75239;
        this.f26322 = c23433.f75238;
        this.f26321 = c23433.f75241;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22373(C12704 c12704, byte[] bArr, C2309 c2309) {
        m22367(c12704, bArr, c2309, C5131.f16061, 0L, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2 A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #17 {, blocks: (B:4:0x0005, B:6:0x000d, B:13:0x003b, B:14:0x0043, B:31:0x007c, B:83:0x01c2, B:89:0x01d2, B:90:0x01d5, B:147:0x01d6, B:148:0x01dd, B:158:0x022e, B:164:0x0251, B:168:0x0272, B:171:0x027d, B:172:0x0280, B:199:0x0260, B:200:0x0267, B:203:0x0281, B:204:0x0288), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C9323 m22371(l.C20612 r43) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8617.m22371(l.᩷ۗᩳ):l.ۢۗᩳ");
    }

    public C8617(C21605 c21605) {
        this(c21605, new RunnableC0709());
    }

    public C8617(C21605 c21605, Runnable runnable) {
        this.f26321 = -1L;
        this.f26322 = -1L;
        this.f26325 = c21605;
        C14820 c14820 = new C14820(c21605, runnable);
        this.f26323 = c14820;
        this.f26324 = new C14260(c21605, c14820, runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22370() {
        return this.f26321;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22374(C12704 c12704, byte[] bArr, C2309 c2309, C5131 c5131, long j) {
        m22367(c12704, bArr, c2309, c5131, j, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22367(C12704 c12704, byte[] bArr, C2309 c2309, C5131 c5131, long j, boolean z) {
        Throwable th;
        C8617 c8617 = 8192;
        if (bArr.length <= 8192) {
            long j2 = 0;
            if (j >= 0 && j > this.f26321 && c12704.m30979() >= 0 && c12704.m30979() >= this.f26322) {
                C11999 m32420 = c12704.m32420();
                C21605 c21605 = m32420.f35930;
                C21605 c216052 = this.f26325;
                if (c21605 != c216052) {
                    throw new IllegalArgumentException("Snapshot belongs to another recovery store");
                }
                c216052.m48811();
                try {
                    try {
                        C15253 m48799 = this.f26325.m48799();
                        try {
                            long m35224 = this.f26323.m35224(m32420);
                            long m33909 = c2309 == null ? 0L : this.f26324.m33909(c2309);
                            if (z) {
                                try {
                                    C21605 c216053 = this.f26325;
                                    c216053.f69370.m3925(c216053);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        m48799.close();
                                        throw th;
                                    } catch (Throwable th3) {
                                        try {
                                            th.addSuppressed(th3);
                                            throw th;
                                        } catch (UncheckedIOException e) {
                                            e = e;
                                            throw e.getCause();
                                        }
                                    }
                                }
                            }
                            synchronized (this.f26325.f69370.f4153) {
                                if (c5131 != null) {
                                    try {
                                        C21605 c216054 = this.f26325;
                                        long m48810 = c216054.m48810();
                                        C10130 m36879 = C15671.m36879(c5131);
                                        j2 = c216054.m48809(m48810, m36879.m25438(), 6, m36879.size());
                                    } finally {
                                        th = th;
                                        C8617 c86172 = this;
                                        while (true) {
                                            try {
                                                try {
                                                    break;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    th = th;
                                                    m48799.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                    }
                                }
                                long j3 = j2;
                                C21605 c216055 = this.f26325;
                                long j4 = m33909;
                                long m48809 = c216055.m48809(c216055.m48810(), bArr, 4, bArr.length);
                                this.f26325.m48803();
                                long m488102 = this.f26325.m48810();
                                long m48807 = this.f26325.m48807();
                                if (m48807 <= m488102) {
                                    throw new IOException("Recovery record identity exhausted");
                                }
                                C10130 c10130 = new C10130(c5131 != null ? IShizukuService.Stub.TRANSACTION_isHidden : c2309 == null ? 88 : 96);
                                c10130.m25431(this.f26325.f69374.getMostSignificantBits());
                                c10130.m25431(this.f26325.f69374.getLeastSignificantBits());
                                c10130.m25431(this.f26325.f69375);
                                c10130.m25431(j);
                                c10130.m25431(c12704.m30979());
                                c10130.m25431(m35224);
                                c10130.m25431(m48809);
                                c10130.m25431(this.f26326);
                                c10130.m25431(m48807);
                                c10130.writeInt(m32420.m29347());
                                c10130.writeInt(m32420.m29349());
                                c10130.writeInt(m32420.m29341());
                                c10130.writeInt(c5131 != null ? 2 : c2309 == null ? 0 : 1);
                                if (c2309 != null || c5131 != null) {
                                    c10130.m25431(j4);
                                }
                                if (c5131 != null) {
                                    c10130.m25431(j3);
                                }
                                C21605 c216056 = this.f26325;
                                c216056.getClass();
                                long m488092 = c216056.m48809(m488102, c10130.m25438(), 3, c10130.size());
                                this.f26325.m48803();
                                m48799.close();
                                this.f26326 = m488092;
                                this.f26322 = c12704.m30979();
                                this.f26321 = j;
                            }
                            m48799.close();
                            this.f26325.m48812();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c8617.f26325.m48812();
                        throw th;
                    }
                } catch (UncheckedIOException e2) {
                    e = e2;
                } catch (Throwable th8) {
                    th = th8;
                    c8617 = this;
                    c8617.f26325.m48812();
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("Invalid recovery commit state");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23433 m22368(long j, long j2) {
        int i;
        C23433 c23433;
        synchronized (this.f26325.f69370.f4153) {
            try {
                C7493 m48806 = this.f26325.m48806(j);
                if (m48806.f23083 != 3 || (((i = m48806.f23082) != 88 && i != 96 && i != 104) || m22364(j, m48806) != j2)) {
                    throw new IOException("Invalid recovery commit shape");
                }
                C12951 c12951 = new C12951(this.f26325.m48802(j, m48806));
                UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
                long readLong = c12951.readLong();
                long readLong2 = c12951.readLong();
                long readLong3 = c12951.readLong();
                long readLong4 = c12951.readLong();
                long readLong5 = c12951.readLong();
                long readLong6 = c12951.readLong();
                long readLong7 = c12951.readLong();
                int readInt = c12951.readInt();
                int readInt2 = c12951.readInt();
                int readInt3 = c12951.readInt();
                int readInt4 = c12951.readInt();
                int i2 = m48806.f23082;
                if (readInt4 != (i2 == 104 ? 2 : i2 == 96 ? 1 : 0)) {
                    throw new IOException("Invalid recovery commit extension");
                }
                long readLong8 = readInt4 >= 1 ? c12951.readLong() : 0L;
                long readLong9 = readInt4 == 2 ? c12951.readLong() : 0L;
                if (!uuid.equals(this.f26325.f69374) || readLong != this.f26325.f69375 || readLong2 < 0 || readLong3 < 0 || readLong4 < 0 || readLong4 >= j || readLong5 < 64 || readLong5 >= j || readLong6 < 0 || readLong6 >= j || readLong7 <= m48806.f23080 || readInt < 0 || readInt2 < 0 || readInt2 > readInt || readInt3 < -1 || readInt3 > 32 || ((readInt4 == 1 && readLong8 == 0) || ((readLong8 != 0 && (readLong8 < 64 || readLong8 >= j)) || ((readInt4 == 2 && (readLong9 < 64 || readLong9 >= j)) || c12951.available() != 0)))) {
                    throw new IOException("Invalid recovery commit metadata");
                }
                c23433 = new C23433(j, j2, readLong2, readLong3, readLong4, readLong5, readLong8, readLong9, readLong6, readLong7, readInt, readInt2, readInt3);
            } finally {
            }
        }
        return c23433;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5131 m22365(C23433 c23433) {
        C5131 m36878;
        if (c23433.f75243 == 0) {
            return C5131.f16061;
        }
        synchronized (this.f26325.f69370.f4153) {
            C7493 m48806 = this.f26325.m48806(c23433.f75243);
            if (m48806.f23083 != 6 || m48806.f23080 >= c23433.f75249 || m48806.f23082 > 4096 || m22364(c23433.f75243, m48806) > c23433.f75239) {
                throw new IOException("Invalid recovery load reference");
            }
            m36878 = C15671.m36878(this.f26325.m48802(c23433.f75243, m48806));
        }
        return m36878;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22369(C23433 c23433) {
        C23433 m22368;
        if (c23433.f75248 == 0) {
            return;
        }
        synchronized (this.f26325.f69370.f4153) {
            long m22364 = m22364(c23433.f75248, this.f26325.m48806(c23433.f75248));
            if (m22364 > c23433.f75239) {
                throw new IOException("Recovery parent overlaps commit");
            }
            m22368 = m22368(c23433.f75248, m22364);
        }
        if (m22368.f75241 >= c23433.f75241 || m22368.f75238 > c23433.f75238 || m22368.f75249 >= c23433.f75249) {
            throw new IOException("Invalid recovery parent order");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22364(long j, C7493 c7493) {
        return j + 32 + c7493.f23082 + 16;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m22363(long j, long j2) {
        synchronized (this.f26325.f69370.f4153) {
            byte[] m3929 = this.f26325.f69370.m3929();
            long j3 = j;
            while (j3 - j2 >= 16) {
                long max = Math.max(j2, j3 - m3929.length);
                int i = (int) (j3 - max);
                this.f26325.f69371.mo14384(max, m3929, 0, i);
                for (int i2 = i - 16; i2 >= 0; i2--) {
                    if (m3929[i2] == 77 && m3929[i2 + 1] == 50 && m3929[i2 + 2] == 69 && m3929[i2 + 3] == 70) {
                        long j4 = i2 + max + 16;
                        try {
                            if (C1829.m6063(j4, Arrays.copyOfRange(m3929, i2, i2 + 16)) >= j2) {
                                return j4;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
                if (max == j2) {
                    break;
                }
                j3 = 15 + max;
            }
            return -1L;
        }
    }
}
