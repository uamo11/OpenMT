package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.OutputStream;

/* compiled from: B2LU */
/* renamed from: l.ܺ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16248 extends FilterInputStream implements DataInput, InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C16248(C9900 c9900) {
        super(c9900);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i = C18366.f57059;
        C18366.m42795(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        C18366.m42795(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return C13426.m32444((byte) 0, (byte) 0, m38213(), m38213());
    }

    @Override // java.io.DataInput
    public final int readInt() {
        byte m38213 = m38213();
        byte m382132 = m38213();
        return C13426.m32444(m38213(), m38213(), m382132, m38213);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        byte m38213 = m38213();
        byte m382132 = m38213();
        byte m382133 = m38213();
        byte m382134 = m38213();
        byte m382135 = m38213();
        return ((m382132 & 255) << 8) | ((m382134 & 255) << 24) | ((m38213() & 255) << 40) | ((m38213() & 255) << 56) | ((m38213() & 255) << 48) | ((m382135 & 255) << 32) | ((m382133 & 255) << 16) | (m38213 & 255);
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
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte m38213() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }
}
