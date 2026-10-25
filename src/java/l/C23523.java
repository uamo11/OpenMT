package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: M1S8 */
/* renamed from: l.᩻ۜ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23523 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75510 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InputStream f75511;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10532 f75515;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f75517 = new byte[4096];

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75516 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75512 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f75513 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75518 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f75519 = null;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f75514 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C23523(InputStream inputStream, InterfaceC10532 interfaceC10532) {
        inputStream.getClass();
        this.f75511 = inputStream;
        this.f75515 = interfaceC10532;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f75514;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = this.f75517;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f75511 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f75519;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int min = Math.min(this.f75512, i2);
                System.arraycopy(bArr2, this.f75516, bArr, i, min);
                int i5 = this.f75516 + min;
                this.f75516 = i5;
                int i6 = this.f75512 - min;
                this.f75512 = i6;
                i += min;
                i2 -= min;
                i4 += min;
                int i7 = this.f75513;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.f75516 = 0;
                }
                if (i2 == 0 || this.f75518) {
                    break;
                }
                int i8 = this.f75516 + this.f75512 + this.f75513;
                int read = this.f75511.read(bArr2, i8, 4096 - i8);
                if (read == -1) {
                    this.f75518 = true;
                    this.f75512 = this.f75513;
                    this.f75513 = 0;
                } else {
                    int i9 = this.f75513 + read;
                    this.f75513 = i9;
                    int mo10634 = this.f75515.mo10634(this.f75516, i9, bArr2);
                    this.f75512 = mo10634;
                    this.f75513 -= mo10634;
                }
            } catch (IOException e) {
                this.f75519 = e;
                throw e;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f75511 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f75519;
        if (iOException != null) {
            throw iOException;
        }
        return this.f75512;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f75511;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f75511 = null;
            }
        }
    }
}
