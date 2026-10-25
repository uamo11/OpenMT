package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* compiled from: 86JZ */
/* renamed from: l.᩺ۛۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22803 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f73632;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f73633;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long[] f73634;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long[] f73635;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12220 f73636;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f73637;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10104 f73638;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10104 m50895(InputStream inputStream) {
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            int read = inputStream.read();
            if (read < 0) {
                throw new EOFException("Truncated TGA header");
            }
            bArr[i] = (byte) read;
        }
        return new C10104(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22803 m50897(File file, C10104 c10104, InterfaceC17066 interfaceC17066) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            if (convertMaybeLegacyFileChannelFromLibrary.size() > 268435456) {
                throw new C5870("TGA input exceeds byte limit");
            }
            c10104.m25388(m50895(fileInputStream));
            C22803 c22803 = new C22803(c10104, new C12220(fileInputStream), true);
            c22803.m50900(null, null, 1, interfaceC17066);
            return c22803;
        } catch (IOException | Error | RuntimeException e) {
            fileInputStream.close();
            throw e;
        }
    }

    public C22803(C10104 c10104, C12220 c12220, boolean z) {
        int i;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f73638 = c10104;
        this.f73636 = c12220;
        i = c10104.f30423;
        long j = i;
        for (long j2 = 0; j2 < j; j2++) {
            c12220.m29710();
        }
        i2 = c10104.f30426;
        this.f73633 = new int[i2];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f73633;
            if (i7 >= iArr.length) {
                break;
            }
            i5 = c10104.f30420;
            int i8 = (i5 + 7) / 8;
            i6 = c10104.f30420;
            iArr[i7] = m50893(c12220, i8, i6 == 32);
            i7++;
        }
        this.f73632 = c12220.f36455;
        long[] jArr2 = null;
        if (z && C10104.m25379(c10104)) {
            i4 = c10104.f30425;
            jArr = new long[i4];
        } else {
            jArr = null;
        }
        this.f73635 = jArr;
        if (jArr != null) {
            i3 = c10104.f30425;
            jArr2 = new long[i3];
        }
        this.f73634 = jArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m50894(InputStream inputStream, C10104 c10104, Rect rect, int i, InterfaceC17066 interfaceC17066) {
        int i2;
        int i3;
        m50898(c10104, rect, i);
        m50899(interfaceC17066);
        int m50891 = m50891(rect.width(), i);
        int m508912 = m50891(rect.height(), i);
        int[] iArr = new int[m50891 * m508912];
        C22803 c22803 = new C22803(c10104, new C12220(inputStream), false);
        c22803.m50900(iArr, rect, i, interfaceC17066);
        if (c22803.f73637) {
            for (int i4 = 0; i4 < m508912; i4++) {
                m50899(interfaceC17066);
                int m25377 = C10104.m25377(c10104, (i4 * i) + rect.top);
                if (m25377 >= 0) {
                    i2 = c10104.f30425;
                    if (m25377 < i2) {
                        for (int i5 = 0; i5 < m50891; i5++) {
                            int m25371 = C10104.m25371(c10104, (i5 * i) + rect.left);
                            if (m25371 >= 0) {
                                i3 = c10104.f30418;
                                if (m25371 < i3) {
                                    int i6 = (i4 * m50891) + i5;
                                    iArr[i6] = iArr[i6] | (-16777216);
                                }
                            }
                        }
                    }
                }
            }
        }
        m50899(interfaceC17066);
        return Bitmap.createBitmap(iArr, m50891, m508912, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m50903(Rect rect, int i, InterfaceC17066 interfaceC17066) {
        Bitmap bitmap;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        C11515 c11515;
        C10104 c10104 = this.f73638;
        m50898(c10104, rect, i);
        m50899(interfaceC17066);
        int m50891 = m50891(rect.width(), i);
        int m508912 = m50891(rect.height(), i);
        int[] iArr2 = new int[m50891];
        Bitmap createBitmap = Bitmap.createBitmap(m50891, m508912, Bitmap.Config.ARGB_8888);
        int i7 = 0;
        int i8 = 0;
        while (i8 < m508912) {
            try {
                m50899(interfaceC17066);
                Arrays.fill(iArr2, i7);
                int m25377 = C10104.m25377(c10104, (i8 * i) + rect.top);
                if (m25377 >= 0) {
                    i4 = c10104.f30425;
                    if (m25377 < i4) {
                        int m25371 = C10104.m25371(c10104, rect.left);
                        int m253712 = C10104.m25371(c10104, ((m50891 - 1) * i) + rect.left);
                        int max = Math.max(i7, Math.min(m25371, m253712));
                        i5 = c10104.f30418;
                        int min = Math.min(i5 - 1, Math.max(m25371, m253712));
                        if (max <= min) {
                            i6 = c10104.f30418;
                            long j = m25377 * i6;
                            boolean m25379 = C10104.m25379(c10104);
                            C12220 c12220 = this.f73636;
                            if (m25379) {
                                i2 = i8;
                                i3 = m508912;
                                c12220.m29711(this.f73635[m25377]);
                                long j2 = this.f73634[m25377];
                                c11515 = new C11515(this, j2);
                                iArr = iArr2;
                                bitmap = createBitmap;
                                long j3 = (j + max) - j2;
                                for (long j4 = 0; j4 < j3; j4++) {
                                    if ((j4 & 1023) == 0) {
                                        try {
                                            m50899(interfaceC17066);
                                        } catch (IOException e) {
                                            e = e;
                                            bitmap.recycle();
                                            throw e;
                                        } catch (Error e2) {
                                            e = e2;
                                            bitmap.recycle();
                                            throw e;
                                        } catch (RuntimeException e3) {
                                            e = e3;
                                            bitmap.recycle();
                                            throw e;
                                        }
                                    }
                                    c11515.m28342();
                                }
                            } else {
                                i2 = i8;
                                i3 = m508912;
                                iArr = iArr2;
                                bitmap = createBitmap;
                                long j5 = j + max;
                                c12220.m29711((C10104.m25374(c10104) * j5) + this.f73632);
                                c11515 = new C11515(this, j5);
                            }
                            while (max <= min) {
                                if ((max & 1023) == 0) {
                                    m50899(interfaceC17066);
                                }
                                int m28342 = c11515.m28342();
                                int m25381 = C10104.m25381(c10104, max) - rect.left;
                                if (m25381 >= 0 && m25381 % i == 0 && m25381 / i < m50891) {
                                    int i9 = m25381 / i;
                                    if (this.f73637) {
                                        m28342 |= -16777216;
                                    }
                                    iArr[i9] = m28342;
                                }
                                max++;
                            }
                            int i10 = i2;
                            bitmap.setPixels(iArr, 0, m50891, 0, i2, m50891, 1);
                            i8 = i10 + 1;
                            i7 = 0;
                            m508912 = i3;
                            iArr2 = iArr;
                            createBitmap = bitmap;
                        }
                    }
                }
                i2 = i8;
                i3 = m508912;
                iArr = iArr2;
                bitmap = createBitmap;
                int i102 = i2;
                bitmap.setPixels(iArr, 0, m50891, 0, i2, m50891, 1);
                i8 = i102 + 1;
                i7 = 0;
                m508912 = i3;
                iArr2 = iArr;
                createBitmap = bitmap;
            } catch (IOException e4) {
                e = e4;
                bitmap = createBitmap;
                bitmap.recycle();
                throw e;
            } catch (Error e5) {
                e = e5;
                bitmap = createBitmap;
                bitmap.recycle();
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                bitmap = createBitmap;
                bitmap.recycle();
                throw e;
            }
        }
        return createBitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50900(int[] iArr, Rect rect, int i, InterfaceC17066 interfaceC17066) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int min;
        int i5;
        C10104 c10104;
        long j;
        int i6;
        Rect rect2;
        C10104 c101042;
        boolean z2;
        int i7;
        boolean z3;
        C10104 c101043;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C10104 c101044 = this.f73638;
        i2 = c101044.f30418;
        i3 = c101044.f30425;
        long j2 = i2 * i3;
        int m50891 = rect == null ? 0 : m50891(rect.width(), i);
        long j3 = 0;
        boolean z4 = true;
        boolean z5 = true;
        int i13 = 0;
        while (j3 < j2) {
            m50899(interfaceC17066);
            C12220 c12220 = this.f73636;
            long j4 = c12220.f36455;
            int m29710 = C10104.m25379(c101044) ? c12220.m29710() : 0;
            if (C10104.m25379(c101044)) {
                i4 = i13;
                min = (m29710 & 127) + 1;
                z = z5;
            } else {
                z = z5;
                i4 = i13;
                min = (int) Math.min(128L, j2 - j3);
            }
            long j5 = min;
            if (j5 > j2 - j3) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            long[] jArr = this.f73635;
            if (jArr != null) {
                j = j2;
                int i14 = i4;
                while (true) {
                    i11 = c101044.f30425;
                    if (i14 >= i11) {
                        i5 = min;
                        c10104 = c101044;
                        i6 = m50891;
                        break;
                    }
                    i6 = m50891;
                    i5 = min;
                    i12 = c101044.f30418;
                    c10104 = c101044;
                    if (i12 * i14 >= j3 + j5) {
                        break;
                    }
                    jArr[i14] = j4;
                    this.f73634[i14] = j3;
                    i14++;
                    m50891 = i6;
                    min = i5;
                    c101044 = c10104;
                }
                i4 = i14;
            } else {
                i5 = min;
                c10104 = c101044;
                j = j2;
                i6 = m50891;
            }
            boolean z6 = C10104.m25379(c10104) && (m29710 & 128) != 0;
            int m50890 = z6 ? m50890() : 0;
            if (z6 && iArr == null) {
                int i15 = m50890 >>> 24;
                boolean z7 = (i15 == 0) & z4;
                j3 += j5;
                rect2 = rect;
                z5 = (i15 == 255) & z;
                z4 = z7;
                c101042 = c10104;
            } else {
                int i16 = 0;
                int i17 = i5;
                while (i16 < i17) {
                    int m508902 = z6 ? m50890 : m50890();
                    int i18 = m508902 >>> 24;
                    z4 &= i18 == 0;
                    boolean z8 = z & (i18 == 255);
                    if (iArr != null) {
                        long j6 = i16 + j3;
                        i9 = c10104.f30418;
                        boolean z9 = z6;
                        i7 = m50890;
                        c101043 = c10104;
                        i8 = i17;
                        int m25381 = C10104.m25381(c101043, (int) (j6 % i9)) - rect.left;
                        i10 = c101043.f30418;
                        z2 = z9;
                        z3 = z8;
                        int m25384 = C10104.m25384(c101043, (int) (j6 / i10)) - rect.top;
                        if (m25381 >= 0 && m25384 >= 0 && m25381 < rect.width() && m25384 < rect.height() && m25381 % i == 0 && m25384 % i == 0) {
                            iArr[(m25381 / i) + ((m25384 / i) * i6)] = m508902;
                        }
                    } else {
                        z2 = z6;
                        i7 = m50890;
                        z3 = z8;
                        c101043 = c10104;
                        i8 = i17;
                    }
                    i16++;
                    m50890 = i7;
                    i17 = i8;
                    z = z3;
                    c10104 = c101043;
                    z6 = z2;
                }
                rect2 = rect;
                c101042 = c10104;
                j3 += j5;
                z5 = z;
            }
            c101044 = c101042;
            i13 = i4;
            j2 = j;
            m50891 = i6;
        }
        C10104 c101045 = c101044;
        this.f73637 = C10104.m25372(c101045) && (C10104.m25374(c101045) == 2 || C10104.m25374(c101045) == 4) && (!C10104.m25375(c101045) ? !(z4 || z5) : !z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m50890() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C10104 c10104 = this.f73638;
        i = c10104.f30417;
        C12220 c12220 = this.f73636;
        boolean z = true;
        if (i != 1) {
            i4 = c10104.f30417;
            if (i4 != 9) {
                i5 = c10104.f30417;
                if (i5 != 3) {
                    i7 = c10104.f30417;
                    if (i7 != 11) {
                        int m25374 = C10104.m25374(c10104);
                        i8 = c10104.f30413;
                        if (i8 != 32 && !C10104.m25375(c10104)) {
                            z = false;
                        }
                        return m50893(c12220, m25374, z);
                    }
                }
                int m29710 = c12220.m29710();
                i6 = c10104.f30413;
                return ((C10104.m25375(c10104) ? i6 == 16 ? c12220.m29710() : 255 : 255) << 24) | (m29710 << 16) | (m29710 << 8) | m29710;
            }
        }
        int m297102 = c12220.m29710();
        i2 = c10104.f30413;
        if (i2 == 16) {
            m297102 |= c12220.m29710() << 8;
        }
        i3 = c10104.f30416;
        int i9 = m297102 - i3;
        if (i9 < 0) {
            return -16777216;
        }
        int[] iArr = this.f73633;
        if (i9 < iArr.length) {
            return iArr[i9];
        }
        return -16777216;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50893(C12220 c12220, int i, boolean z) {
        int m29710 = c12220.m29710();
        int m297102 = c12220.m29710();
        if (i != 2) {
            return ((z ? i == 4 ? c12220.m29710() : 255 : 255) << 24) | (c12220.m29710() << 16) | (m297102 << 8) | m29710;
        }
        int i2 = (m297102 << 8) | m29710;
        int i3 = (i2 >> 10) & 31;
        int i4 = (i2 >> 5) & 31;
        int i5 = i2 & 31;
        return ((z && (i2 & 32768) == 0) ? 0 : -16777216) | (((i3 >> 2) | (i3 << 3)) << 16) | (((i4 << 3) | (i4 >> 2)) << 8) | (i5 << 3) | (i5 >> 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50898(C10104 c10104, Rect rect, int i) {
        if (rect.isEmpty() || rect.left < 0 || rect.top < 0 || rect.right > c10104.f30421 || rect.bottom > c10104.f30424 || i <= 0) {
            throw new IllegalArgumentException("Invalid TGA region or sample");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50891(int i, int i2) {
        long j = i;
        long j2 = i2;
        return (int) (((j + j2) - 1) / j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50892(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50899(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("TGA decoding canceled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f73636.f36456.close();
    }
}
