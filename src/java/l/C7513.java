package l;

import java.util.Arrays;

/* compiled from: R6N8 */
/* renamed from: l.۟ܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7513 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23106;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23107;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23108;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C7513 f23109;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f23110;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public char[] f23111;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f23112;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long[] f23113;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23114;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23115;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f23116;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f23117;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23118;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23119;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f23120;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Object[] f23121;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23122;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7513 f23123;

    public C7513(int i) {
        this(i, true);
    }

    public C7513(int i, boolean z) {
        this.f23119 = 1;
        int max = Math.max(8, i);
        Object[] objArr = new Object[(max + 63) >>> 6];
        this.f23121 = objArr;
        this.f23120 = new int[objArr.length];
        if (z) {
            this.f23111 = new char[max];
        } else {
            this.f23110 = new int[max];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20142() {
        char[] cArr = this.f23111;
        return cArr != null ? cArr.length : this.f23110.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20144(int i) {
        int m20142 = m20142();
        if (i <= m20142) {
            return;
        }
        int min = Math.min(1024, Math.max(i, m20142 * 2));
        int i2 = (min + 63) >>> 6;
        this.f23121 = Arrays.copyOf(this.f23121, i2);
        this.f23120 = Arrays.copyOf(this.f23120, i2);
        int i3 = m20142 >>> 6;
        if ((m20142 & 63) != 0 && this.f23121[i3] != null) {
            int min2 = Math.min(64, min - (i3 << 6));
            Object[] objArr = this.f23121;
            Object obj = objArr[i3];
            objArr[i3] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, min2) : Arrays.copyOf((int[]) obj, min2);
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            this.f23111 = Arrays.copyOf(cArr, min);
        } else {
            this.f23110 = Arrays.copyOf(this.f23110, min);
        }
        int[] iArr = this.f23112;
        if (iArr != null) {
            this.f23112 = Arrays.copyOf(iArr, min);
        }
        long[] jArr = this.f23113;
        if (jArr != null) {
            this.f23113 = Arrays.copyOf(jArr, i2);
            this.f23116 = Arrays.copyOf(this.f23116, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m20153(int i) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        Object obj = this.f23121[i2];
        return this.f23120[i2] + (obj instanceof char[] ? ((char[]) obj)[i3] : ((int[]) obj)[i3]);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20139(int i, int i2) {
        int i3 = i >>> 6;
        int i4 = i & 63;
        Object[] objArr = this.f23121;
        Object obj = objArr[i3];
        if (obj == null) {
            obj = new char[Math.min(64, m20142() - (i3 << 6))];
            objArr[i3] = obj;
            this.f23120[i3] = i2;
        }
        long j = i2 - this.f23120[i3];
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (j >= 0 && j <= 65535) {
                cArr[i4] = (char) j;
                return;
            }
            int[] iArr = new int[cArr.length];
            for (int i5 = 0; i5 < cArr.length; i5++) {
                iArr[i5] = cArr[i5];
            }
            this.f23121[i3] = iArr;
            obj = iArr;
        }
        ((int[]) obj)[i4] = (int) j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20151(int i) {
        int[] iArr = this.f23112;
        if (iArr != null) {
            return iArr[i];
        }
        long[] jArr = this.f23113;
        if (jArr == null) {
            return i * this.f23108;
        }
        int i2 = i >>> 6;
        return Long.bitCount(((-1) >>> (63 - (i & 63))) & jArr[i2]) + this.f23116[i2];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m20150(int i) {
        long[] jArr = this.f23117;
        return (jArr == null || (jArr[i >>> 6] & (1 << i)) == 0) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20147(int i, boolean z) {
        if (z) {
            if (this.f23117 == null) {
                this.f23117 = new long[16];
            }
            long[] jArr = this.f23117;
            int i2 = i >>> 6;
            jArr[i2] = (1 << i) | jArr[i2];
            return;
        }
        long[] jArr2 = this.f23117;
        if (jArr2 != null) {
            int i3 = i >>> 6;
            jArr2[i3] = (~(1 << i)) & jArr2[i3];
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20152(int i, C11747 c11747) {
        int i2;
        int m20151;
        m20139(i, c11747.f35062 - this.f23107);
        int i3 = c11747.f35063 - c11747.f35062;
        int i4 = 0;
        if (this.f23111 != null && ((-65536) & i3) != 0) {
            this.f23110 = new int[m20142()];
            for (int i5 = 0; i5 < this.f23106; i5++) {
                this.f23110[i5] = this.f23111[i5];
            }
            this.f23111 = null;
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            cArr[i] = (char) i3;
        } else {
            this.f23110[i] = i3;
        }
        int i6 = c11747.f35064;
        int i7 = this.f23106;
        if (i7 == 0) {
            this.f23122 = i6;
        }
        if (this.f23112 != null || ((i >= i7 && this.f23113 != null) || i6 != this.f23122 + m20151(i))) {
            if (this.f23112 == null && i == (i2 = this.f23106) && i2 > 0 && ((m20151 = i6 - (this.f23122 + m20151(i2 - 1))) == 0 || m20151 == 1)) {
                long[] jArr = this.f23113;
                if (jArr == null && this.f23106 == 1) {
                    this.f23108 = m20151;
                } else {
                    if (jArr == null) {
                        Object[] objArr = this.f23121;
                        this.f23113 = new long[objArr.length];
                        this.f23116 = new char[objArr.length];
                        for (int i8 = 1; i8 < this.f23106; i8++) {
                            if (this.f23108 == 1) {
                                long[] jArr2 = this.f23113;
                                int i9 = i8 >>> 6;
                                jArr2[i9] = jArr2[i9] | (1 << i8);
                            }
                        }
                        int i10 = 0;
                        while (true) {
                            long[] jArr3 = this.f23113;
                            if (i4 >= jArr3.length) {
                                break;
                            }
                            this.f23116[i4] = (char) i10;
                            i10 += Long.bitCount(jArr3[i4]);
                            i4++;
                        }
                    }
                    int i11 = i >>> 6;
                    if ((i & 63) == 0 && i11 > 0) {
                        char[] cArr2 = this.f23116;
                        int i12 = i11 - 1;
                        cArr2[i11] = (char) (Long.bitCount(this.f23113[i12]) + cArr2[i12]);
                    }
                    if (m20151 == 1) {
                        long[] jArr4 = this.f23113;
                        jArr4[i11] = jArr4[i11] | (1 << i);
                    } else {
                        long[] jArr5 = this.f23113;
                        jArr5[i11] = jArr5[i11] & (~(1 << i));
                    }
                }
            } else {
                m20140();
                this.f23112[i] = i6 - this.f23122;
            }
        }
        m20147(i, c11747.m28755());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20149(int i, C11747 c11747) {
        int m20153 = m20153(i) + this.f23107;
        char[] cArr = this.f23111;
        c11747.m28751(m20153, (cArr != null ? cArr[i] : this.f23110[i]) + m20153, m20151(i) + this.f23122);
        c11747.m28753(m20150(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20148(C11747 c11747) {
        m20144(this.f23106 + 1);
        m20152(this.f23106, c11747);
        int i = this.f23106 + 1;
        this.f23106 = i;
        this.f23114 = i;
        if (i == 1024) {
            m20136();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20146(int i, C11747 c11747) {
        int i2 = this.f23106;
        if (i == i2) {
            m20148(c11747);
            return;
        }
        m20144(i2 + 1);
        if (this.f23112 == null && (this.f23113 != null || this.f23108 != 0 || c11747.f35064 != this.f23122)) {
            m20140();
        }
        for (int i3 = this.f23106; i3 > i; i3--) {
            m20139(i3, m20153(i3 - 1));
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            System.arraycopy(cArr, i, cArr, i + 1, this.f23106 - i);
        } else {
            int[] iArr = this.f23110;
            System.arraycopy(iArr, i, iArr, i + 1, this.f23106 - i);
        }
        int[] iArr2 = this.f23112;
        if (iArr2 != null) {
            System.arraycopy(iArr2, i, iArr2, i + 1, this.f23106 - i);
        }
        for (int i4 = this.f23106; i4 > i; i4--) {
            m20147(i4, m20150(i4 - 1));
        }
        this.f23106++;
        m20152(i, c11747);
        m20141();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20145(int i, int i2, int i3, int i4) {
        if (i >= i2) {
            return;
        }
        if (i == 0 && i2 == this.f23106) {
            this.f23107 += i3;
            this.f23122 += i4;
            return;
        }
        if (i3 != 0) {
            for (int i5 = i >>> 6; i5 <= ((i2 - 1) >>> 6); i5++) {
                int i6 = i5 << 6;
                int min = Math.min(this.f23106, i6 + 64);
                if (i <= i6 && i2 >= min) {
                    int[] iArr = this.f23120;
                    iArr[i5] = iArr[i5] + i3;
                } else {
                    for (int max = Math.max(i, i6); max < Math.min(i2, min); max++) {
                        m20139(max, m20153(max) + i3);
                    }
                    m20137(i5, min - i6);
                }
            }
        }
        if (i4 != 0) {
            m20140();
            while (i < i2) {
                int[] iArr2 = this.f23112;
                iArr2[i] = iArr2[i] + i4;
                i++;
            }
            m20138();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20140() {
        if (this.f23112 != null) {
            return;
        }
        int[] iArr = new int[m20142()];
        for (int i = 0; i < this.f23106; i++) {
            iArr[i] = m20151(i);
        }
        this.f23112 = iArr;
        this.f23113 = null;
        this.f23116 = null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20138() {
        int[] iArr = this.f23112;
        if (iArr == null || this.f23106 == 0) {
            return;
        }
        int i = iArr[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = this.f23106;
            if (i2 < i4) {
                int[] iArr2 = this.f23112;
                int i5 = iArr2[i2] - iArr2[i2 - 1];
                if (i5 != 0 && i5 != 1) {
                    return;
                }
                i3 += i5;
                i2++;
            } else {
                if (i3 != 0 && i3 != i4 - 1) {
                    Object[] objArr = this.f23121;
                    this.f23113 = new long[objArr.length];
                    this.f23116 = new char[objArr.length];
                    for (int i6 = 1; i6 < this.f23106; i6++) {
                        int[] iArr3 = this.f23112;
                        if (iArr3[i6] != iArr3[i6 - 1]) {
                            long[] jArr = this.f23113;
                            int i7 = i6 >>> 6;
                            jArr[i7] = jArr[i7] | (1 << i6);
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        long[] jArr2 = this.f23113;
                        if (r1 >= jArr2.length) {
                            break;
                        }
                        this.f23116[r1] = (char) i8;
                        i8 += Long.bitCount(jArr2[r1]);
                        r1++;
                    }
                } else {
                    this.f23108 = i3 != 0 ? 1 : 0;
                }
                this.f23122 += i;
                this.f23112 = null;
                return;
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20141() {
        for (int i = 0; i < this.f23121.length; i++) {
            int min = Math.min(64, this.f23106 - (i << 6));
            if (min <= 0) {
                this.f23121[i] = null;
            } else {
                m20137(i, min);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20137(int i, int i2) {
        Object obj = this.f23121[i];
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i3 = iArr[0];
            int i4 = i3;
            for (int i5 = 1; i5 < i2; i5++) {
                i4 = Math.min(i4, iArr[i5]);
                i3 = Math.max(i3, iArr[i5]);
            }
            if (i3 - i4 > 65535) {
                return;
            }
            char[] cArr = new char[iArr.length];
            for (int i6 = 0; i6 < i2; i6++) {
                cArr[i6] = (char) (iArr[i6] - i4);
            }
            int[] iArr2 = this.f23120;
            iArr2[i] = iArr2[i] + i4;
            this.f23121[i] = cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m20136() {
        m20141();
        m20138();
        if (this.f23110 == null) {
            return;
        }
        for (int i = 0; i < this.f23106; i++) {
            if ((this.f23110[i] & (-65536)) != 0) {
                return;
            }
        }
        this.f23111 = new char[m20142()];
        for (int i2 = 0; i2 < this.f23106; i2++) {
            this.f23111[i2] = (char) this.f23110[i2];
        }
        this.f23110 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7513 m20143(int i, int i2) {
        int i3 = i2 - i;
        C7513 c7513 = new C7513(i3, this.f23111 != null);
        c7513.f23114 = i3;
        c7513.f23106 = i3;
        c7513.f23107 = this.f23107;
        c7513.f23122 = this.f23122;
        c7513.f23108 = this.f23108;
        if (i == 0 && i2 == this.f23106) {
            int[] iArr = this.f23120;
            int[] iArr2 = c7513.f23120;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            for (int i4 = 0; i4 < c7513.f23121.length; i4++) {
                int min = Math.min(64, c7513.m20142() - (i4 << 6));
                Object obj = this.f23121[i4];
                c7513.f23121[i4] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, min) : Arrays.copyOf((int[]) obj, min);
            }
        } else {
            for (int i5 = 0; i5 < c7513.f23106; i5++) {
                c7513.m20139(i5, m20153(i5 + i));
            }
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            System.arraycopy(cArr, i, c7513.f23111, 0, c7513.f23106);
        } else {
            System.arraycopy(this.f23110, i, c7513.f23110, 0, c7513.f23106);
        }
        if (this.f23112 == null && this.f23113 == null) {
            c7513.f23122 = (this.f23108 * i) + c7513.f23122;
        } else {
            long[] jArr = this.f23113;
            if (jArr != null && i == 0 && i2 == this.f23106) {
                c7513.f23113 = Arrays.copyOf(jArr, c7513.f23121.length);
                c7513.f23116 = Arrays.copyOf(this.f23116, c7513.f23121.length);
            } else {
                c7513.f23112 = new int[c7513.m20142()];
                for (int i6 = 0; i6 < c7513.f23106; i6++) {
                    c7513.f23112[i6] = m20151(i6 + i);
                }
            }
        }
        if (i != 0 || i2 != this.f23106) {
            c7513.m20136();
        }
        if (this.f23117 != null) {
            for (int i7 = i; i7 < i2; i7++) {
                c7513.m20147(i7 - i, m20150(i7));
            }
        }
        return c7513;
    }
}
