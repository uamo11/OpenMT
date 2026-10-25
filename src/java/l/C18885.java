package l;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: SAOU */
/* renamed from: l.ᩴܽܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18885 implements DataOutput, Flushable, Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HashMap f59523 = new HashMap();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream f59524;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59525;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f59526;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f59527;

    public C18885(OutputStream outputStream) {
        C11003.requireNonNull(outputStream);
        this.f59524 = outputStream;
        this.f59526 = new byte[32768];
        this.f59527 = 32768;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43599() {
        int i = this.f59525;
        if (i > 0) {
            this.f59524.write(this.f59526, 0, i);
            this.f59525 = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        m43599();
        this.f59524.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59524.close();
    }

    @Override // java.io.DataOutput
    public final void write(int i) {
        writeByte(i);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f59527;
        if (i3 < i2) {
            m43599();
            this.f59524.write(bArr, i, i2);
        } else {
            if (i3 - this.f59525 < i2) {
                m43599();
            }
            System.arraycopy(bArr, i, this.f59526, this.f59525, i2);
            this.f59525 += i2;
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        if (this.f59527 - this.f59525 < str.length() + 2) {
            m43599();
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 65535) {
            throw new IOException("Modified UTF-8 length too large: " + bytes.length);
        }
        writeShort(bytes.length);
        write(bytes, 0, bytes.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43600(String str) {
        HashMap hashMap = this.f59523;
        Short sh = (Short) hashMap.get(str);
        if (sh != null) {
            writeShort(sh.shortValue());
            return;
        }
        writeShort(65535);
        writeUTF(str);
        hashMap.put(str, Short.valueOf((short) hashMap.size()));
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        writeByte(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        if (this.f59527 - this.f59525 < 1) {
            m43599();
        }
        int i2 = this.f59525;
        this.f59525 = i2 + 1;
        this.f59526[i2] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        if (this.f59527 - this.f59525 < 2) {
            m43599();
        }
        int i2 = this.f59525;
        int i3 = i2 + 1;
        this.f59525 = i3;
        byte[] bArr = this.f59526;
        bArr[i2] = (byte) ((i >> 8) & 255);
        this.f59525 = i2 + 2;
        bArr[i3] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        writeShort((short) i);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        if (this.f59527 - this.f59525 < 4) {
            m43599();
        }
        int i2 = this.f59525;
        int i3 = i2 + 1;
        this.f59525 = i3;
        byte[] bArr = this.f59526;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i2 + 2;
        this.f59525 = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i2 + 3;
        this.f59525 = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        this.f59525 = i2 + 4;
        bArr[i5] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        if (this.f59527 - this.f59525 < 8) {
            m43599();
        }
        int i = (int) (j >> 32);
        int i2 = this.f59525;
        int i3 = i2 + 1;
        this.f59525 = i3;
        byte[] bArr = this.f59526;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i2 + 2;
        this.f59525 = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i2 + 3;
        this.f59525 = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        int i6 = i2 + 4;
        this.f59525 = i6;
        bArr[i5] = (byte) (i & 255);
        int i7 = (int) j;
        int i8 = i2 + 5;
        this.f59525 = i8;
        bArr[i6] = (byte) ((i7 >> 24) & 255);
        int i9 = i2 + 6;
        this.f59525 = i9;
        bArr[i8] = (byte) ((i7 >> 16) & 255);
        int i10 = i2 + 7;
        this.f59525 = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        this.f59525 = i2 + 8;
        bArr[i10] = (byte) (i7 & 255);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        throw new UnsupportedOperationException();
    }
}
