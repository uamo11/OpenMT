package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: 057Y */
/* renamed from: l.ۤܿ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C10428 extends InputStream implements DataInput, InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f31329;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31330;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31331;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteOrder f31332;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataInputStream f31333;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10428(byte[] r3) {
        /*
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r1 = 0
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.f31331 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10428.<init>(byte[]):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10428(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C10428(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f31333 = dataInputStream;
        dataInputStream.mark(0);
        this.f31330 = 0;
        this.f31332 = byteOrder;
        this.f31331 = inputStream instanceof C10428 ? ((C10428) inputStream).f31331 : -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26272(ByteOrder byteOrder) {
        this.f31332 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f31333.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f31330++;
        return this.f31333.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f31333.read(bArr, i, i2);
        this.f31330 += read;
        return read;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f31330++;
        return this.f31333.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f31330++;
        return this.f31333.readBoolean();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f31330 += 2;
        return this.f31333.readChar();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f31330 += 2;
        return this.f31333.readUTF();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f31330 += i2;
        this.f31333.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f31330 += bArr.length;
        this.f31333.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f31330++;
        int read = this.f31333.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f31330 += 2;
        DataInputStream dataInputStream = this.f31333;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f31330 += 4;
        DataInputStream dataInputStream = this.f31333;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26271(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f31333;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.f31329 == null) {
                    this.f31329 = new byte[8192];
                }
                skip = dataInputStream.read(this.f31329, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(C18307.m42645(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.f31330 += i2;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f31330 += 2;
        DataInputStream dataInputStream = this.f31333;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f31332);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j2;
        this.f31330 += 8;
        DataInputStream dataInputStream = this.f31333;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f31332;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j2 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f31332);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j2 = read8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int length() {
        return this.f31331;
    }
}
