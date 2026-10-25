package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: 16SN */
/* renamed from: l.ܺ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16168 extends Reader {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5377 f49806;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f49807;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f49808;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final FileChannel f49809;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f49810;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f49811;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public char[] f49812;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f49813;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f49814;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f49815;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f49816;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f49817;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49818;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49819;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49820;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f49821;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16168 m38102(InterfaceC20758 interfaceC20758, C1143 c1143) {
        FileChannel open = C12084.open(interfaceC20758, EnumC3824.READ);
        try {
            return new C16168(open, c1143);
        } catch (IOException | Error | RuntimeException e) {
            try {
                open.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C16168(FileChannel fileChannel, C1143 c1143) {
        int i;
        this.f49820 = -1;
        this.f49809 = fileChannel;
        byte[] bArr = new byte[4];
        m38104(fileChannel, 0L, bArr, 4);
        int readInt = new C12951(bArr).readInt();
        if (readInt == 2053616492) {
            i = 8192;
        } else if (readInt == 2053617772) {
            i = 32768;
        } else {
            if (readInt != 2053619564) {
                throw new IOException("Unsupported legacy text file magic");
            }
            i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        this.f49816 = i;
        if (fileChannel.size() < i) {
            throw new EOFException("Truncated legacy text partition table");
        }
        int i2 = (i - 4) / 2;
        this.f49806 = c1143.m3921((((i2 * 2) + 23) & (-8)) + 4240);
        try {
            this.f49812 = new char[i2];
            this.f49814 = new byte[4096];
            int i3 = 0;
            int i4 = -1;
            int i5 = 0;
            while (i3 < i2) {
                int min = Math.min(this.f49814.length / 2, i2 - i3);
                m38104(fileChannel, (i3 * 2) + 4, this.f49814, min * 2);
                int i6 = 0;
                while (i6 < min) {
                    char m38105 = m38105(i6 * 2);
                    if (m38105 != 65535) {
                        if (m38105 < i2) {
                            char[] cArr = this.f49812;
                            if (cArr[m38105] == 0) {
                                cArr[m38105] = (char) (i3 + 1);
                                i4 = Math.max(i4, (int) m38105);
                                i5++;
                            }
                        }
                        throw new IOException("Invalid legacy text block order");
                    }
                    i6++;
                    i3++;
                }
            }
            if (i4 + 1 != i5) {
                throw new IOException("Missing legacy text block ordinal");
            }
            this.f49815 = i5;
            int i7 = 0;
            int i8 = 0;
            long j = 0;
            while (true) {
                int i9 = this.f49815;
                if (i7 < i9) {
                    m38103(i7);
                    j += this.f49818;
                    i8 = (i8 * 31) + this.f49819;
                    if (j > 2147483647L) {
                        throw new IOException("Legacy text exceeds coordinate limit");
                    }
                    i7++;
                } else {
                    int i10 = (int) j;
                    this.f49810 = i10;
                    this.f49817 = (i10 * 31) + (i9 == 0 ? 15739258 : i8);
                    this.f49820 = -1;
                    this.f49807 = 0;
                    this.f49818 = 0;
                    return;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f49806.close();
            throw e;
        }
    }

    public final int length() {
        return this.f49810;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38106() {
        return this.f49817;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38103(int i) {
        long j = ((this.f49812[i] - 1) * X931RNG.BLOCK64_RESEED_MAX) + this.f49816;
        this.f49808 = j;
        FileChannel fileChannel = this.f49809;
        if (j > fileChannel.size() - X931RNG.BLOCK64_RESEED_MAX) {
            throw new EOFException("Truncated legacy text block");
        }
        m38104(fileChannel, this.f49808, this.f49814, 12);
        C12951 c12951 = new C12951(this.f49814);
        int readInt = c12951.readInt();
        this.f49821 = c12951.readInt();
        int readInt2 = c12951.readInt();
        this.f49813 = readInt2;
        int i2 = this.f49821;
        if (i2 < 0 || readInt2 < 0 || i2 > 16378 || readInt2 > 16378 - i2) {
            throw new IOException("Invalid legacy text gap");
        }
        this.f49818 = 16378 - readInt2;
        this.f49819 = ((((((i2 * 31) + readInt2) * 31) + readInt) * 31) + this.f49812[i]) - 1;
        this.f49807 = 0;
        this.f49820 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private char m38105(int i) {
        byte[] bArr = this.f49814;
        return (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38104(FileChannel fileChannel, long j, byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        while (wrap.hasRemaining()) {
            int read = fileChannel.read(wrap, j);
            if (read < 0) {
                throw new EOFException("Truncated legacy text data");
            }
            if (read == 0) {
                throw new IOException("Legacy text read made no progress");
            }
            j += read;
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f49811) {
            throw new IOException("Legacy text reader is closed");
        }
        while (true) {
            int i = this.f49807;
            if (i != this.f49818) {
                m38104(this.f49809, (i * 2) + this.f49808 + 12 + (i >= this.f49821 ? this.f49813 : 0), this.f49814, 2);
                this.f49807++;
                return m38105(0);
            }
            int i2 = this.f49820 + 1;
            if (i2 == this.f49815) {
                return -1;
            }
            m38103(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        r4 = r10.f49821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (r2 >= r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r2 = java.lang.Math.min(java.lang.Math.min(r13 - r0, r3 - r2), r10.f49814.length / 2);
        r3 = r10.f49808 + 12;
        r5 = r10.f49807;
        r6 = (r5 * 2) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r5 < r10.f49821) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r3 = r10.f49813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        m38104(r10.f49809, r6 + r3, r10.f49814, r2 * 2);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r3 >= r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        r11[(r12 + r0) + r3] = m38105(r3 * 2);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r0 = r0 + r2;
        r10.f49807 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        r3 = 0;
     */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(char[] r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f49811
            java.lang.String r1 = "Legacy text reader is closed"
            if (r0 != 0) goto L7f
            l.C13409.m32419(r11, r12, r13)
            r0 = 0
            if (r13 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
        Le:
            if (r0 >= r13) goto L7a
            boolean r2 = r10.f49811
            if (r2 != 0) goto L74
        L14:
            int r2 = r10.f49807
            int r3 = r10.f49818
            if (r2 != r3) goto L27
            int r2 = r10.f49820
            int r2 = r2 + 1
            int r3 = r10.f49815
            if (r2 != r3) goto L23
            goto L7a
        L23:
            r10.m38103(r2)
            goto L14
        L27:
            int r4 = r10.f49821
            if (r2 >= r4) goto L2c
            r3 = r4
        L2c:
            int r4 = r13 - r0
            int r3 = r3 - r2
            int r2 = java.lang.Math.min(r4, r3)
            byte[] r3 = r10.f49814
            int r3 = r3.length
            int r3 = r3 / 2
            int r2 = java.lang.Math.min(r2, r3)
            long r3 = r10.f49808
            r5 = 12
            long r3 = r3 + r5
            int r5 = r10.f49807
            long r6 = (long) r5
            r8 = 2
            long r6 = r6 * r8
            long r6 = r6 + r3
            int r3 = r10.f49821
            if (r5 < r3) goto L50
            int r3 = r10.f49813
            goto L51
        L50:
            r3 = 0
        L51:
            long r3 = (long) r3
            long r6 = r6 + r3
            byte[] r3 = r10.f49814
            int r4 = r2 * 2
            java.nio.channels.FileChannel r5 = r10.f49809
            m38104(r5, r6, r3, r4)
            r3 = 0
        L5d:
            if (r3 >= r2) goto L6d
            int r4 = r12 + r0
            int r4 = r4 + r3
            int r5 = r3 * 2
            char r5 = r10.m38105(r5)
            r11[r4] = r5
            int r3 = r3 + 1
            goto L5d
        L6d:
            int r0 = r0 + r2
            int r3 = r10.f49807
            int r3 = r3 + r2
            r10.f49807 = r3
            goto Le
        L74:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r1)
            throw r11
        L7a:
            if (r0 != 0) goto L7e
            r11 = -1
            return r11
        L7e:
            return r0
        L7f:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16168.read(char[], int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f49806;
        if (this.f49811) {
            return;
        }
        this.f49811 = true;
        try {
            this.f49809.close();
        } finally {
            this.f49812 = null;
            this.f49814 = null;
            c5377.close();
        }
    }
}
