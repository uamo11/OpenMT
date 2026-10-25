package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* compiled from: G1S8 */
/* renamed from: l.֫ۜ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1651 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DataInputStream f5754;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1359 f5757;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21116 f5758;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22817 f5759;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f5762;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5760 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f5753 = false;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5756 = true;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f5755 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f5763 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f5761 = null;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final byte[] f5764 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m5549(int i) {
        return (m5547(i) / 1024) + IShizukuService.Stub.TRANSACTION_isHidden;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5547(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported dictionary size "));
        }
        return (i + 15) & (-16);
    }

    public C1651(InputStream inputStream, int i, C4265 c4265) {
        inputStream.getClass();
        this.f5762 = c4265;
        this.f5754 = new DataInputStream(inputStream);
        this.f5757 = new C1359(c4265);
        this.f5759 = new C22817(m5547(i), c4265);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f5764;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        return r0;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            if (r6 < 0) goto L7e
            if (r7 < 0) goto L7e
            int r0 = r6 + r7
            if (r0 < 0) goto L7e
            int r1 = r5.length
            if (r0 > r1) goto L7e
            r0 = 0
            if (r7 != 0) goto Lf
            return r0
        Lf:
            java.io.DataInputStream r1 = r4.f5754
            if (r1 == 0) goto L76
            java.io.IOException r1 = r4.f5761
            if (r1 != 0) goto L75
            boolean r1 = r4.f5763
            if (r1 == 0) goto L1c
            goto L2b
        L1c:
            if (r7 <= 0) goto L74
            int r1 = r4.f5760     // Catch: java.io.IOException -> L70
            if (r1 != 0) goto L2d
            r4.m5548()     // Catch: java.io.IOException -> L70
            boolean r1 = r4.f5763     // Catch: java.io.IOException -> L70
            if (r1 == 0) goto L2d
            if (r0 != 0) goto L74
        L2b:
            r5 = -1
            return r5
        L2d:
            int r1 = r4.f5760     // Catch: java.io.IOException -> L70
            int r1 = java.lang.Math.min(r1, r7)     // Catch: java.io.IOException -> L70
            boolean r2 = r4.f5753     // Catch: java.io.IOException -> L70
            if (r2 != 0) goto L3f
            l.᩺ۜ֨ r2 = r4.f5759     // Catch: java.io.IOException -> L70
            java.io.DataInputStream r3 = r4.f5754     // Catch: java.io.IOException -> L70
            r2.m50920(r1, r3)     // Catch: java.io.IOException -> L70
            goto L49
        L3f:
            l.᩺ۜ֨ r2 = r4.f5759     // Catch: java.io.IOException -> L70
            r2.m50922(r1)     // Catch: java.io.IOException -> L70
            l.᩷᩷֨ r1 = r4.f5758     // Catch: java.io.IOException -> L70
            r1.m48080()     // Catch: java.io.IOException -> L70
        L49:
            l.᩺ۜ֨ r1 = r4.f5759     // Catch: java.io.IOException -> L70
            int r1 = r1.m50917(r6, r5)     // Catch: java.io.IOException -> L70
            int r6 = r6 + r1
            int r7 = r7 - r1
            int r0 = r0 + r1
            int r2 = r4.f5760     // Catch: java.io.IOException -> L70
            int r2 = r2 - r1
            r4.f5760 = r2     // Catch: java.io.IOException -> L70
            if (r2 != 0) goto L1c
            l.֨᩷֨ r1 = r4.f5757     // Catch: java.io.IOException -> L70
            boolean r1 = r1.m4775()     // Catch: java.io.IOException -> L70
            if (r1 == 0) goto L6a
            l.᩺ۜ֨ r1 = r4.f5759     // Catch: java.io.IOException -> L70
            boolean r1 = r1.m50923()     // Catch: java.io.IOException -> L70
            if (r1 != 0) goto L6a
            goto L1c
        L6a:
            l.᩹᩻֨ r5 = new l.᩹᩻֨     // Catch: java.io.IOException -> L70
            r5.<init>()     // Catch: java.io.IOException -> L70
            throw r5     // Catch: java.io.IOException -> L70
        L70:
            r5 = move-exception
            r4.f5761 = r5
            throw r5
        L74:
            return r0
        L75:
            throw r1
        L76:
            l.ۖۜ֨ r5 = new l.ۖۜ֨
            java.lang.String r6 = "Stream closed"
            r5.<init>(r6)
            throw r5
        L7e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1651.read(byte[], int, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5548() {
        int readUnsignedByte = this.f5754.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f5763 = true;
            C22817 c22817 = this.f5759;
            if (c22817 != null) {
                C4265 c4265 = this.f5762;
                c22817.m50921(c4265);
                this.f5759 = null;
                this.f5757.m4774(c4265);
                this.f5757 = null;
                return;
            }
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f5755 = true;
            this.f5756 = false;
            this.f5759.m50925();
        } else if (this.f5756) {
            throw new C22609();
        }
        if (readUnsignedByte < 128) {
            if (readUnsignedByte > 2) {
                throw new C22609();
            }
            this.f5753 = false;
            this.f5760 = this.f5754.readUnsignedShort() + 1;
            return;
        }
        this.f5753 = true;
        int i = (readUnsignedByte & 31) << 16;
        this.f5760 = i;
        this.f5760 = this.f5754.readUnsignedShort() + 1 + i;
        int readUnsignedShort = this.f5754.readUnsignedShort() + 1;
        if (readUnsignedByte >= 192) {
            this.f5755 = false;
            int readUnsignedByte2 = this.f5754.readUnsignedByte();
            if (readUnsignedByte2 > 224) {
                throw new C22609();
            }
            int i2 = readUnsignedByte2 / 45;
            int i3 = readUnsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new C22609();
            }
            this.f5758 = new C21116(this.f5759, this.f5757, i5, i4, i2);
        } else {
            if (this.f5755) {
                throw new C22609();
            }
            if (readUnsignedByte >= 160) {
                this.f5758.mo8553();
            }
        }
        this.f5757.m4773(readUnsignedShort, this.f5754);
    }

    @Override // java.io.InputStream
    public final int available() {
        DataInputStream dataInputStream = this.f5754;
        if (dataInputStream == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f5761;
        if (iOException == null) {
            return this.f5753 ? this.f5760 : Math.min(this.f5760, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5754 != null) {
            C22817 c22817 = this.f5759;
            if (c22817 != null) {
                C4265 c4265 = this.f5762;
                c22817.m50921(c4265);
                this.f5759 = null;
                this.f5757.m4774(c4265);
                this.f5757 = null;
            }
            try {
                this.f5754.close();
            } finally {
                this.f5754 = null;
            }
        }
    }
}
