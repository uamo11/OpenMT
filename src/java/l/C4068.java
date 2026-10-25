package l;

import java.io.Closeable;
import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: 3AO5 */
/* renamed from: l.ۘܽܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4068 implements DataInput, Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStream f12919;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12920;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12923;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f12924;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f12925;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f12922 = 0;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String[] f12921 = new String[32];

    public C4068(InputStream inputStream) {
        C11003.requireNonNull(inputStream);
        this.f12919 = inputStream;
        this.f12924 = new byte[32768];
        this.f12925 = 32768;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12224(int i) {
        int i2 = this.f12923;
        int i3 = this.f12920;
        int i4 = i2 - i3;
        byte[] bArr = this.f12924;
        System.arraycopy(bArr, i3, bArr, 0, i4);
        this.f12920 = 0;
        this.f12923 = i4;
        while (true) {
            i -= i4;
            if (i <= 0) {
                return;
            }
            int i5 = this.f12923;
            i4 = this.f12919.read(bArr, i5, this.f12925 - i5);
            if (i4 == -1) {
                throw new EOFException();
            }
            this.f12923 += i4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12919.close();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.f12925;
        byte[] bArr2 = this.f12924;
        if (i3 >= i2) {
            if (this.f12923 - this.f12920 < i2) {
                m12224(i2);
            }
            System.arraycopy(bArr2, this.f12920, bArr, i, i2);
            this.f12920 += i2;
            return;
        }
        int i4 = this.f12923;
        int i5 = this.f12920;
        int i6 = i4 - i5;
        System.arraycopy(bArr2, i5, bArr, i, i6);
        this.f12920 += i6;
        do {
            i += i6;
            i2 -= i6;
            if (i2 <= 0) {
                return;
            } else {
                i6 = this.f12919.read(bArr, i, i2);
            }
        } while (i6 != -1);
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        int readUnsignedShort = readUnsignedShort();
        if (this.f12925 >= readUnsignedShort) {
            if (this.f12923 - this.f12920 < readUnsignedShort) {
                m12224(readUnsignedShort);
            }
            String str = new String(this.f12924, this.f12920, readUnsignedShort, StandardCharsets.UTF_8);
            this.f12920 += readUnsignedShort;
            return str;
        }
        byte[] bArr = new byte[readUnsignedShort];
        readFully(bArr, 0, readUnsignedShort);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m12226() {
        int readUnsignedShort = readUnsignedShort();
        if (readUnsignedShort == 65535) {
            String readUTF = readUTF();
            int i = this.f12922;
            if (i < 65535) {
                String[] strArr = this.f12921;
                if (i == strArr.length) {
                    this.f12921 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
                }
                String[] strArr2 = this.f12921;
                int i2 = this.f12922;
                this.f12922 = i2 + 1;
                strArr2[i2] = readUTF;
            }
            return readUTF;
        }
        return this.f12921[readUnsignedShort];
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readByte() != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m12225() {
        if (this.f12923 - this.f12920 < 1) {
            m12224(1);
        }
        return this.f12924[this.f12920];
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        if (this.f12923 - this.f12920 < 1) {
            m12224(1);
        }
        int i = this.f12920;
        this.f12920 = i + 1;
        return this.f12924[i];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return readByte() & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        if (this.f12923 - this.f12920 < 2) {
            m12224(2);
        }
        int i = this.f12920;
        int i2 = i + 1;
        this.f12920 = i2;
        byte[] bArr = this.f12924;
        int i3 = (bArr[i] & 255) << 8;
        this.f12920 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return readShort() & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        if (this.f12923 - this.f12920 < 4) {
            m12224(4);
        }
        int i = this.f12920;
        int i2 = i + 1;
        this.f12920 = i2;
        byte[] bArr = this.f12924;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f12920 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f12920 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f12920 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        if (this.f12923 - this.f12920 < 8) {
            m12224(8);
        }
        int i = this.f12920;
        int i2 = i + 1;
        this.f12920 = i2;
        byte[] bArr = this.f12924;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f12920 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f12920 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i + 4;
        this.f12920 = i8;
        int i9 = i7 | (bArr[i6] & 255);
        int i10 = i + 5;
        this.f12920 = i10;
        int i11 = (bArr[i8] & 255) << 24;
        int i12 = i + 6;
        this.f12920 = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        this.f12920 = i + 7;
        int i14 = i13 | ((bArr[i12] & 255) << 8);
        this.f12920 = i + 8;
        return (i9 << 32) | (((bArr[r5] & 255) | i14) & 4294967295L);
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException();
    }
}
