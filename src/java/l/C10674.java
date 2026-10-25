package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: N9T0 */
/* renamed from: l.ۧ֨᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10674 implements InterfaceC12312 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f32100 = C11321.m27961(C10674.class);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f32101;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12209 f32102;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32104;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32105;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32107;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f32108;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32109;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f32110;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f32106 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f32103 = new byte[8];

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C5818 f32111 = null;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            C12209 c12209 = this.f32102;
            if (c12209 != null) {
                try {
                    c12209.m29688();
                    this.f32102 = null;
                } catch (C19369 e) {
                    throw C3037.m9289(e);
                }
            }
        } finally {
            this.f32110.m31374();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12209 m26784() {
        C12209 c12209 = this.f32102;
        if (c12209 != null && c12209.m29689()) {
            C12209 c122092 = this.f32102;
            c122092.m29686();
            return c122092;
        }
        C12209 m31362 = this.f32110.m31362(this.f32107, this.f32109, 7, 128, this.f32106);
        m31362.m29686();
        this.f32102 = m31362;
        return m31362;
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        short s = (short) i;
        byte[] bArr = this.f32103;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        short s = (short) i;
        byte[] bArr = this.f32103;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    public C10674(C12914 c12914) {
        this.f32109 = 0;
        this.f32110 = c12914;
        try {
            C3618 m31375 = c12914.m31375();
            try {
                this.f32107 = 17;
                this.f32109 = 1;
                m26784().m29688();
                this.f32104 = m31375.m11091() - 70;
                this.f32105 = m31375.getSendBufferSize() - 70;
                if (m31375.m11089(16384)) {
                    this.f32101 = true;
                    this.f32104 = Math.min(((C13722) m31375.m11094()).m32982() - 70, m31375.m11096() ? 65465 : 16777145);
                }
                if (m31375.m11089(32768) && !m31375.m11096()) {
                    this.f32105 = Math.min(((C13722) m31375.m11094()).m32997() - 70, 65465);
                }
                this.f32108 = 0L;
                m31375.close();
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        byte[] bArr = this.f32103;
        C2913.m8901((int) (j & 4294967295L), 4, bArr);
        C2913.m8901((int) ((j >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = this.f32103;
        C2913.m8901(floatToIntBits, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = this.f32103;
        C2913.m8901((int) (doubleToLongBits & 4294967295L), 4, bArr);
        C2913.m8901((int) ((doubleToLongBits >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        r0 = (int) (r19.f32108 - r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        r6.m29688();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #3 {all -> 0x00e9, blocks: (B:11:0x0012, B:12:0x001f, B:15:0x0026, B:17:0x002d, B:19:0x0047, B:35:0x00ab, B:22:0x00c0, B:28:0x00d7, B:45:0x005e, B:47:0x0067, B:49:0x0070, B:50:0x0071, B:52:0x008d, B:54:0x009b, B:57:0x00e4, B:58:0x00e8), top: B:10:0x0012, outer: #1, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10674.read(byte[], int, int):int");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int read = read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                throw new C19971();
            }
            i3 += read;
        } while (i3 < i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        this.f32108 += i;
        return i;
    }

    @Override // java.io.DataOutput
    public final void write(int i) {
        byte[] bArr = this.f32103;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        long m16318;
        C5818 c5818 = this.f32111;
        if (i2 <= 0) {
            return;
        }
        try {
            C12209 m26784 = m26784();
            try {
                C3618 m29693 = m26784.m29693();
                int i3 = i;
                int i4 = i2;
                do {
                    try {
                        int i5 = this.f32105;
                        int i6 = i4 > i5 ? i5 : i4;
                        if (m29693.m11100()) {
                            C9095 c9095 = new C9095(m29693.m11094(), m26784.m29690());
                            c9095.m23469(this.f32108);
                            c9095.m23468((i4 - i6) - i3);
                            c9095.m23467(i3, i6, bArr);
                            m16318 = ((C16149) m29693.m11087(c9095, null, EnumC0214.NO_RETRY)).m38067();
                        } else {
                            m29693.m11087(new C10052(m29693.m11094(), m26784.m29692(), this.f32108, (i4 - i6) - i3, bArr, i3, i6), c5818, EnumC0214.NO_RETRY);
                            m16318 = c5818.m16318();
                        }
                        this.f32108 += m16318;
                        i4 = (int) (i4 - m16318);
                        i3 = (int) (i3 + m16318);
                    } finally {
                    }
                } while (i4 > 0);
                m29693.close();
                m26784.m29688();
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    public final void seek(long j) {
        this.f32108 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) >= 0) {
            return bArr[0] != 0;
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) < 0) {
            throw new C19971();
        }
        return bArr[0];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 1) < 0) {
            throw new C19971();
        }
        return bArr[0] & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return C2913.m8900(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return C2913.m8900(0, bArr) & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 2) < 0) {
            throw new C19971();
        }
        return (char) C2913.m8900(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 4) < 0) {
            throw new C19971();
        }
        return C2913.m8904(0, bArr);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        if (read(this.f32103, 0, 8) >= 0) {
            return (C2913.m8904(4, r1) & 4294967295L) | ((C2913.m8904(0, r1) & 4294967295L) << 32);
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        byte[] bArr = this.f32103;
        if (read(bArr, 0, 4) >= 0) {
            return Float.intBitsToFloat(C2913.m8904(0, bArr));
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        if (read(this.f32103, 0, 8) >= 0) {
            return Double.longBitsToDouble((C2913.m8904(4, r1) & 4294967295L) | ((C2913.m8904(0, r1) & 4294967295L) << 32));
        }
        throw new C19971();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            byte[] bArr = this.f32103;
            int i2 = read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255;
            if (i2 != -1 && i2 != 10) {
                if (i2 == 13) {
                    long j = this.f32108;
                    if ((read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255) != 10) {
                        this.f32108 = j;
                    }
                } else {
                    stringBuffer.append((char) i2);
                    i = i2;
                }
            }
            z = true;
            i = i2;
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        int readUnsignedShort = readUnsignedShort();
        byte[] bArr = new byte[readUnsignedShort];
        read(bArr, 0, readUnsignedShort);
        try {
            return C2913.m8905(readUnsignedShort, bArr);
        } catch (IOException e) {
            throw new C3037("", e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f32103;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        byte[] bArr = this.f32103;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        byte[] bArr = this.f32103;
        C2913.m8901(i, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        int length = str.length();
        int i = length * 2;
        byte[] bArr = new byte[i];
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 + 1;
            char c = cArr[i3];
            bArr[i2] = (byte) (c >>> '\b');
            i2 += 2;
            bArr[i4] = (byte) c;
        }
        write(bArr, 0, i);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            i = 3;
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                i4 = 1;
            } else if (charAt > 2047) {
                i4 = 3;
            }
            i3 += i4;
            i2++;
        }
        byte[] bArr = new byte[i3];
        writeShort(i3);
        int length2 = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3 && i6 < length2) {
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 1 && charAt2 <= 127) {
                bArr[i5] = (byte) charAt2;
                i5++;
            } else if (charAt2 > 2047) {
                if (i3 - i5 < i) {
                    break;
                }
                bArr[i5] = (byte) (((charAt2 >> '\f') & 15) | BERTags.FLAGS);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                i5 += 3;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else {
                if (i3 - i5 < 2) {
                    break;
                }
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >> 6) & 31) | 192);
                i5 += 2;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            }
            i6++;
            i = 3;
        }
        write(bArr, 0, i3);
    }
}
