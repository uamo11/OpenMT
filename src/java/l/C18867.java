package l;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;

/* compiled from: LCCE */
/* renamed from: l.ᩴܺᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18867 extends AbstractC5461 implements InterfaceC8283 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59480;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f59481;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59482;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f59483;

    /* JADX WARN: Multi-variable type inference failed */
    public C18867(InputStream inputStream, byte[] bArr) {
        this.f59481 = inputStream;
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException(C19370.m44628(length, "Illegal buffer size: "));
        }
        this.f59483 = bArr;
        if (inputStream instanceof InterfaceC8283) {
        }
        if (inputStream instanceof InterfaceC1227) {
        }
        try {
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    static {
        EnumSet.allOf(EnumC4050.class);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f59482 == 0) {
            int read = this.f59481.read(this.f59483);
            this.f59482 = read;
            if (read <= 0) {
                this.f59482 = 0;
                return -1;
            }
            this.f59480 = 0;
        }
        this.f59482--;
        byte[] bArr = this.f59483;
        int i = this.f59480;
        this.f59480 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f59482;
        if (i2 <= i3) {
            System.arraycopy(this.f59483, this.f59480, bArr, i, i2);
            this.f59480 += i2;
            this.f59482 -= i2;
            return i2;
        }
        System.arraycopy(this.f59483, this.f59480, bArr, i, i3);
        this.f59482 = 0;
        this.f59480 = 0;
        byte[] bArr2 = this.f59483;
        if (i2 <= bArr2.length) {
            int read = this.f59481.read(bArr2);
            this.f59482 = read;
            if (read <= 0) {
                this.f59482 = 0;
                if (i3 == 0) {
                    return -1;
                }
            } else {
                this.f59480 = 0;
                int min = Math.min(i2 - i3, this.f59482);
                System.arraycopy(this.f59483, 0, bArr, i + i3, min);
                this.f59480 = min;
                this.f59482 -= min;
                return min + i3;
            }
        } else {
            int read2 = this.f59481.read(bArr, i + i3, i2 - i3);
            if (read2 >= 0) {
                return read2 + i3;
            }
            if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.f59482;
        long j2 = i;
        if (j <= j2) {
            int i2 = (int) j;
            this.f59480 += i2;
            this.f59482 = i - i2;
            return j;
        }
        long j3 = j - j2;
        this.f59482 = 0;
        long j4 = 0;
        while (j3 != 0) {
            InputStream inputStream = this.f59481;
            if (inputStream == System.in) {
                long j5 = j3;
                while (j5 > 0) {
                    int read = this.f59481.read(this.f59483, 0, (int) Math.min(r8.length, j5));
                    if (read <= 0) {
                        break;
                    }
                    j5 -= read;
                }
                j4 = j3 - j5;
            } else {
                j4 = inputStream.skip(j3);
            }
            if (j4 >= j3) {
                break;
            }
            if (j4 == 0) {
                this.f59481.read();
                throw null;
            }
            j3 -= j4;
        }
        return j - (j3 - j4);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f59481.available() + this.f59482, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f59481;
        if (inputStream == null) {
            return;
        }
        if (inputStream != System.in) {
            inputStream.close();
        }
        this.f59481 = null;
        this.f59483 = null;
    }

    @Override // java.io.InputStream
    @Deprecated
    public final void reset() {
        if (this.f59481 == null) {
            return;
        }
        this.f59480 = 0;
        this.f59482 = 0;
    }
}
