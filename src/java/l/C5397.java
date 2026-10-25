package l;

import java.util.Arrays;

/* compiled from: XAZX */
/* renamed from: l.ۚܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5397 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f16802;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char[] f16803;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f16804;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16805;

    public C5397(int i) {
        this.f16802 = new int[Math.max(8, i)];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15405(int i) {
        int[] iArr = this.f16804;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15403(int i) {
        int[] iArr = this.f16804;
        if (iArr == null) {
            return 0;
        }
        return iArr[i + 1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5397 m15404(int i, int i2) {
        int i3 = i2 - i;
        C5397 c5397 = new C5397(i3);
        c5397.f16805 = i3;
        System.arraycopy(this.f16802, i, c5397.f16802, 0, i3);
        int m15405 = m15405(i);
        int m15403 = i2 == 0 ? m15405 : m15403(i2 - 1);
        if (m15403 != m15405) {
            c5397.f16804 = new int[c5397.f16802.length + 1];
            for (int i4 = 0; i4 <= c5397.f16805; i4++) {
                c5397.f16804[i4] = this.f16804[i + i4] - m15405;
            }
            c5397.f16803 = Arrays.copyOfRange(this.f16803, m15405, m15403);
        }
        return c5397;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5397 m15402(C5397 c5397, C5397 c53972) {
        C5397 c53973 = new C5397(c5397.f16805 + c53972.f16805);
        c53973.f16805 = c5397.f16805 + c53972.f16805;
        System.arraycopy(c5397.f16802, 0, c53973.f16802, 0, c5397.f16805);
        System.arraycopy(c53972.f16802, 0, c53973.f16802, c5397.f16805, c53972.f16805);
        int m15403 = c5397.m15403(c5397.f16805 - 1);
        long m154032 = m15403 + c53972.m15403(c53972.f16805 - 1);
        int i = (int) m154032;
        if (m154032 != i) {
            throw new ArithmeticException();
        }
        if (i != 0) {
            c53973.f16804 = new int[c53973.f16802.length + 1];
            c53973.f16803 = new char[i];
            for (int i2 = 0; i2 < c5397.f16805; i2++) {
                c53973.f16804[i2] = c5397.m15405(i2);
            }
            for (int i3 = 0; i3 < c53972.f16805; i3++) {
                c53973.f16804[c5397.f16805 + i3] = c53972.m15405(i3) + m15403;
            }
            c53973.f16804[c53973.f16805] = i;
            if (m15403 != 0) {
                System.arraycopy(c5397.f16803, 0, c53973.f16803, 0, m15403);
            }
            if (i != m15403) {
                System.arraycopy(c53972.f16803, 0, c53973.f16803, m15403, i - m15403);
            }
        }
        return c53973;
    }
}
