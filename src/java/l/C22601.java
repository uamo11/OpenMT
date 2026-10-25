package l;

import java.io.DataInput;
import java.io.DataInputStream;

/* compiled from: P70J */
/* renamed from: l.᩹᩺ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22601 implements DataInput {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f73050;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataInputStream f73051;

    public C22601(DataInputStream dataInputStream, InterfaceC17066 interfaceC17066) {
        this.f73051 = dataInputStream;
        this.f73050 = interfaceC17066;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid checkpoint input range");
        }
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        int i3 = i2 + i;
        while (i < i3) {
            int min = Math.min(65536, i3 - i);
            this.f73051.readFully(bArr, i, min);
            i += min;
            C12723.m31011(interfaceC17066);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        InterfaceC17066 interfaceC17066;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        while (true) {
            interfaceC17066 = this.f73050;
            if (i2 >= i) {
                break;
            }
            C12723.m31011(interfaceC17066);
            int skipBytes = this.f73051.skipBytes(Math.min(65536, i - i2));
            if (skipBytes == 0) {
                break;
            }
            i2 += skipBytes;
        }
        C12723.m31011(interfaceC17066);
        return i2;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        C12723.m31011(this.f73050);
        return this.f73051.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        C12723.m31011(this.f73050);
        return this.f73051.readByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        C12723.m31011(this.f73050);
        return this.f73051.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        C12723.m31011(this.f73050);
        return this.f73051.readShort();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        C12723.m31011(this.f73050);
        return this.f73051.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        C12723.m31011(this.f73050);
        return this.f73051.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        C12723.m31011(this.f73050);
        return this.f73051.readInt();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        C12723.m31011(this.f73050);
        return this.f73051.readLong();
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        C12723.m31011(this.f73050);
        return this.f73051.readFloat();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        C12723.m31011(this.f73050);
        return this.f73051.readDouble();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        String readLine = this.f73051.readLine();
        C12723.m31011(interfaceC17066);
        return readLine;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        InterfaceC17066 interfaceC17066 = this.f73050;
        C12723.m31011(interfaceC17066);
        String readUTF = this.f73051.readUTF();
        C12723.m31011(interfaceC17066);
        return readUTF;
    }
}
