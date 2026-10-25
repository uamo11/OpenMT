package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R70I */
/* renamed from: l.ܺܽܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16059 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f49514;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f49515;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9047 f49516;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] f49517;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0579 f49518;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f49519;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49520 = new AtomicBoolean();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12100 f49521;

    public C16059(long j, long j2, long j3, C9047 c9047, C12100 c12100) {
        this.f49514 = j;
        this.f49519 = j2;
        this.f49515 = j3;
        this.f49516 = c9047;
        this.f49521 = c12100;
        this.f49517 = C19631.m45121(c9047);
        this.f49518 = new C0579(c9047);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m37965() {
        return this.f49515;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37964(byte[] bArr, int i, InterfaceC17066 interfaceC17066) {
        m37969();
        C0579 c0579 = this.f49518;
        c0579.getClass();
        C11003.requireNonNull(bArr, "pattern");
        int m2391 = c0579.m2391();
        if (i < 0 || i > m2391) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "fromIndex="));
        }
        if (bArr.length != 0) {
            int i2 = m2391 - i;
            if (bArr.length <= i2) {
                InterfaceC17066 m38504 = C16360.m38504(interfaceC17066);
                int[] m23244 = C9005.m23244(bArr);
                int min = Math.min(65536, i2);
                byte[] bArr2 = new byte[min];
                int i3 = 0;
                loop0: while (i < m2391 && !m38504.mo1526()) {
                    int min2 = Math.min(min, m2391 - i);
                    c0579.m2392(i, min2, bArr2);
                    for (int i4 = 0; i4 < min2; i4++) {
                        byte b = bArr2[i4];
                        while (i3 > 0 && bArr[i3] != b) {
                            i3 = m23244[i3 - 1];
                        }
                        if (bArr[i3] == b && (i3 = i3 + 1) == bArr.length) {
                            i = ((i + i4) - bArr.length) + 1;
                            break loop0;
                        }
                    }
                    i += min2;
                }
            }
            i = -1;
        }
        m37969();
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37967(byte[] bArr, int i, InterfaceC17066 interfaceC17066) {
        int i2;
        m37969();
        C0579 c0579 = this.f49518;
        c0579.getClass();
        C11003.requireNonNull(bArr, "pattern");
        int m2391 = c0579.m2391();
        if (i >= 0) {
            if (bArr.length == 0) {
                i2 = Math.min(i, m2391);
            } else {
                int min = Math.min(i, m2391 - bArr.length);
                if (min >= 0) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        bArr2[i3] = bArr[(bArr.length - i3) - 1];
                    }
                    int[] m23244 = C9005.m23244(bArr2);
                    InterfaceC17066 m38504 = C16360.m38504(interfaceC17066);
                    int min2 = Math.min(65536, bArr.length + min);
                    byte[] bArr3 = new byte[min2];
                    int length2 = (min + bArr.length) - 1;
                    int i4 = 0;
                    loop1: while (length2 >= 0 && !m38504.mo1526()) {
                        int max = Math.max(0, (length2 - min2) + 1);
                        int i5 = length2 - max;
                        c0579.m2392(max, i5 + 1, bArr3);
                        while (i5 >= 0) {
                            byte b = bArr3[i5];
                            while (i4 > 0 && bArr2[i4] != b) {
                                i4 = m23244[i4 - 1];
                            }
                            if (bArr2[i4] == b && (i4 = i4 + 1) == length) {
                                i2 = max + i5;
                                break loop1;
                            }
                            i5--;
                        }
                        length2 = max - 1;
                    }
                }
            }
            m37969();
            return i2;
        }
        i2 = -1;
        m37969();
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37966(OutputStream outputStream, int i) {
        m37969();
        this.f49518.m2393(outputStream, i);
        m37969();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f49520.compareAndSet(false, true)) {
            m37963(this.f49517);
        }
    }

    public final int length() {
        if (!this.f49520.get()) {
            return this.f49518.m2391();
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37968() {
        if (this.f49520.get()) {
            throw new IllegalStateException("HexSnapshot is closed");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37969() {
        if (!this.f49520.get()) {
            for (InterfaceC18883 interfaceC18883 : this.f49517) {
                if (!interfaceC18883.mo10086()) {
                    throw new C5519();
                }
            }
            return;
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37963(InterfaceC18883[] interfaceC18883Arr) {
        IOException iOException = null;
        for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
            try {
                interfaceC18883.close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    iOException.addSuppressed(e);
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
