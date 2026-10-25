package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: G1SB */
/* renamed from: l.۠᩻֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8498 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InputStream f25981;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f25984;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20493 f25986;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f25987;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f25988;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f25989;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC5179 f25990;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f25991;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f25992;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f25985 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25982 = false;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f25983 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C8498(InputStream inputStream, AbstractC5179 abstractC5179, boolean z, int i, C4265 c4265) {
        this.f25992 = -1L;
        this.f25991 = -1L;
        this.f25990 = abstractC5179;
        this.f25988 = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f25984 = dataInputStream;
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte == 0) {
            throw new C12026();
        }
        int i2 = (readUnsignedByte + 1) * 4;
        this.f25987 = i2;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) readUnsignedByte;
        dataInputStream.readFully(bArr, 1, i2 - 1);
        int i3 = i2 - 4;
        if (!C15055.m35595(0, bArr, i3, i3)) {
            throw new C22609("XZ Block Header is corrupt");
        }
        int i4 = bArr[1];
        if ((i4 & 60) != 0) {
            throw new C9413("Unsupported options in XZ Block Header");
        }
        int i5 = i4 & 3;
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        byte[][] bArr2 = new byte[i6][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
        try {
            long m14836 = (9223372036854775804L - i2) - abstractC5179.m14836();
            this.f25989 = m14836;
            if ((bArr[1] & 64) != 0) {
                long m35592 = C15055.m35592(byteArrayInputStream);
                this.f25991 = m35592;
                if (m35592 == 0 || m35592 > m14836) {
                    throw new C22609();
                }
                this.f25989 = m35592;
            }
            if ((bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
                this.f25992 = C15055.m35592(byteArrayInputStream);
            }
            for (int i7 = 0; i7 < i6; i7++) {
                jArr[i7] = C15055.m35592(byteArrayInputStream);
                long m355922 = C15055.m35592(byteArrayInputStream);
                if (m355922 > byteArrayInputStream.available()) {
                    throw new C22609();
                }
                byte[] bArr3 = new byte[(int) m355922];
                bArr2[i7] = bArr3;
                byteArrayInputStream.read(bArr3);
            }
            for (int available = byteArrayInputStream.available(); available > 0; available--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new C9413("Unsupported options in XZ Block Header");
                }
            }
            InterfaceC10615[] interfaceC10615Arr = new InterfaceC10615[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                long j = jArr[i8];
                if (j == 33) {
                    interfaceC10615Arr[i8] = new C14141(bArr2[i8]);
                } else if (j == 3) {
                    interfaceC10615Arr[i8] = new C3559(bArr2[i8]);
                } else {
                    if (j < 4 || j > 11) {
                        throw new C9413("Unknown Filter ID " + jArr[i8]);
                    }
                    interfaceC10615Arr[i8] = new C19082(j, bArr2[i8]);
                }
            }
            C14350.m34246(interfaceC10615Arr);
            if (i >= 0) {
                int i9 = 0;
                for (int i10 = 0; i10 < i6; i10++) {
                    i9 += interfaceC10615Arr[i10].mo10841();
                }
                if (i9 > i) {
                    throw new C17173(C19373.m44634("", i9, " KiB of memory would be needed; limit was ", " KiB", i));
                }
            }
            C20493 c20493 = new C20493(inputStream);
            this.f25986 = c20493;
            this.f25981 = c20493;
            while (i5 >= 0) {
                this.f25981 = interfaceC10615Arr[i5].mo10842(this.f25981, c4265);
                i5--;
            }
        } catch (IOException unused) {
            throw new C22609("XZ Block Header is corrupt");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f25983;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f25982) {
            return -1;
        }
        int read = this.f25981.read(bArr, i, i2);
        if (read > 0) {
            if (this.f25988) {
                this.f25990.mo1497(bArr, i, read);
            }
            this.f25985 += read;
            long m46958 = this.f25986.m46958();
            if (m46958 >= 0 && m46958 <= this.f25989) {
                long j = this.f25985;
                if (j >= 0) {
                    long j2 = this.f25992;
                    if (j2 == -1 || j <= j2) {
                        if (read < i2 || j == j2) {
                            if (this.f25981.read() != -1) {
                                throw new C22609();
                            }
                            m22194();
                            this.f25982 = true;
                            return read;
                        }
                    }
                }
            }
            throw new C22609();
        }
        if (read == -1) {
            m22194();
            this.f25982 = true;
        }
        return read;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22194() {
        long m46958 = this.f25986.m46958();
        long j = this.f25991;
        if (j == -1 || j == m46958) {
            long j2 = this.f25992;
            if (j2 == -1 || j2 == this.f25985) {
                while (true) {
                    long j3 = 1 + m46958;
                    long j4 = m46958 & 3;
                    DataInputStream dataInputStream = this.f25984;
                    if (j4 != 0) {
                        if (dataInputStream.readUnsignedByte() != 0) {
                            throw new C22609();
                        }
                        m46958 = j3;
                    } else {
                        AbstractC5179 abstractC5179 = this.f25990;
                        byte[] bArr = new byte[abstractC5179.m14836()];
                        dataInputStream.readFully(bArr);
                        if (!this.f25988 || Arrays.equals(abstractC5179.mo1498(), bArr)) {
                            return;
                        }
                        throw new C22609("Integrity check (" + abstractC5179.m14835() + ") does not match");
                    }
                }
            }
        }
        throw new C22609();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f25981.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f25981.close();
        } catch (IOException unused) {
        }
        this.f25981 = null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m22196() {
        return this.f25987 + this.f25986.m46958() + this.f25990.m14836();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22195() {
        return this.f25985;
    }
}
