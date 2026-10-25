package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 27ZX */
/* renamed from: l.ۤ᩻ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10618 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f31889;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f31891;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f31892;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31897 = false;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31893 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f31896 = new byte[1];

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f31894 = new byte[1024];

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6384 f31895 = new C6384();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31890 = 1;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10618(C1654 c1654, long j, byte[] bArr) {
        this.f31892 = c1654;
        this.f31891 = bArr;
        this.f31889 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f31897) {
            byte[] bArr = this.f31896;
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f31897) {
            return -1;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C16261 c16261;
        int i3;
        C7795 c7795;
        C16261 c162612;
        int i4;
        C7795 c77952;
        byte[] bArr2;
        C16261 c162613;
        C7795 c77953;
        C16261 c162614;
        C7795 c77954;
        C16261 c162615;
        C16261 c162616;
        C16261 c162617;
        InputStream inputStream;
        C7795 c77955;
        C7795 c77956;
        C16261 c162618;
        C7795 c77957;
        InputStream inputStream2;
        InputStream inputStream3;
        C16261 c162619;
        C16261 c1626110;
        C7795 c77958;
        C16261 c1626111;
        int i5 = i2;
        if (this.f31897) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i5 < 0 || i + i5 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f31893;
        if (i6 > 0) {
            if (i6 <= i5) {
                i5 = i6;
            }
            System.arraycopy(this.f31894, 0, bArr, i, i5);
            int i7 = this.f31893;
            if (i5 != i7) {
                byte[] bArr3 = this.f31894;
                System.arraycopy(bArr3, i5, bArr3, 0, i7 - i5);
            }
            this.f31893 -= i5;
            return i5;
        }
        C1654 c1654 = this.f31892;
        c16261 = c1654.f5774;
        if (c16261.f50016.length - 13 < i5) {
            c1626111 = c1654.f5774;
            i5 = c1626111.f50016.length - 13;
        }
        i3 = c1654.f5776;
        if (i3 == 0 && i5 > 1024) {
            i5 = 1024;
        }
        c7795 = c1654.f5779;
        c7795.getClass();
        c162612 = c1654.f5774;
        int length = c162612.f50016.length - 13;
        i4 = c1654.f5776;
        int i8 = i4 == 0 ? 1024 : length;
        while (true) {
            c77952 = c1654.f5779;
            int i9 = c77952.f24088;
            int i10 = this.f31890;
            bArr2 = this.f31891;
            if (i9 >= i10) {
                break;
            }
            try {
                long j = this.f31889;
                c77958 = c1654.f5779;
                C1654.m5561(c1654, bArr2, j, i8, c77958);
                this.f31889 += i8;
            } catch (Exception unused) {
                throw new IOException(d.O);
            }
        }
        c162613 = c1654.f5774;
        C6384 c6384 = this.f31895;
        c1654.m5565(c162613, c6384);
        this.f31895 = c6384;
        this.f31893 = c6384.f19747;
        int i11 = c6384.f19749;
        try {
            c77954 = c1654.f5779;
            C14144 m20823 = c77954.m20823(this.f31895.f19748);
            if (i11 != 101 && i11 != 103) {
                throw new IOException(d.O);
            }
            if (i11 == 101) {
                c162619 = c1654.f5774;
                c1654.m5564(c162619, this.f31893);
                c1626110 = c1654.f5774;
                int m38250 = c1626110.m38250();
                this.f31893 = 0;
                if (m38250 == 1) {
                    close();
                    return -1;
                }
                throw new IOException(d.O);
            }
            c162615 = c1654.f5774;
            c162615.f50018 = 0;
            c162616 = c1654.f5774;
            c1654.m5551(0, 4, c162616.f50016);
            c162617 = c1654.f5774;
            int m382502 = c162617.m38250();
            int i12 = this.f31893 - 4;
            this.f31893 = i12;
            int i13 = i12 - m382502;
            long j2 = m382502;
            if (m382502 <= 0) {
                return 0;
            }
            if (m382502 <= i5) {
                i5 = m382502;
            }
            inputStream = c1654.f5769;
            int read = inputStream.read(bArr, i, i5);
            if (read < 0) {
                return -1;
            }
            int i14 = m382502 - read;
            this.f31893 = i14;
            if (i14 > 0) {
                if (this.f31894.length < i14) {
                    this.f31894 = new byte[i14];
                }
                int i15 = 0;
                while (i14 > 0) {
                    inputStream3 = c1654.f5769;
                    int read2 = inputStream3.read(this.f31894, i15, i14);
                    if (read2 <= 0) {
                        break;
                    }
                    i15 += read2;
                    i14 -= read2;
                }
            }
            if (i13 > 0) {
                inputStream2 = c1654.f5769;
                inputStream2.skip(i13);
            }
            if (j2 < m20823.f42690) {
                c77956 = c1654.f5779;
                C6384 c63842 = this.f31895;
                c162618 = c1654.f5774;
                c77956.m20824(c162618, c63842);
                try {
                    long j3 = m20823.f42691 + j2;
                    int i16 = (int) (m20823.f42690 - j2);
                    c77957 = c1654.f5779;
                    C1654.m5561(c1654, bArr2, j3, i16, c77957);
                    this.f31889 = m20823.f42691 + m20823.f42690;
                } catch (Exception unused2) {
                    throw new IOException(d.O);
                }
            }
            int i17 = this.f31890;
            c77955 = c1654.f5779;
            if (i17 < c77955.f24090.length) {
                this.f31890++;
            }
            return read;
        } catch (C16532 e) {
            throw new IOException("error: " + e.toString(), e);
        } catch (C23317 e2) {
            this.f31889 = e2.f74943;
            skip(this.f31895.f19747);
            c77953 = c1654.f5779;
            C6384 c63843 = this.f31895;
            c162614 = c1654.f5774;
            c77953.m20824(c162614, c63843);
            return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C7795 c7795;
        C16261 c16261;
        if (this.f31897) {
            return;
        }
        this.f31897 = true;
        C1654 c1654 = this.f31892;
        c7795 = c1654.f5779;
        C6384 c6384 = this.f31895;
        c16261 = c1654.f5774;
        c7795.m20824(c16261, c6384);
        try {
            C1654.m5562(c1654, this.f31891, this.f31895);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
