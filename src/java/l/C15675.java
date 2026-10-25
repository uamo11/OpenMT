package l;

import java.util.Arrays;

/* compiled from: 098S */
/* renamed from: l.ܺۗ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C15675 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15675 f48241;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48242;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48243;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f48244;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native long m36884(long j);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36889(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    static {
        ApplicationC12518.m30701(118);
        f48241 = new C15675(1);
    }

    public C15675() {
        this.f48243 = 0;
        this.f48244 = new int[1];
        this.f48242 = 0;
    }

    public C15675(int i) {
        this.f48243 = 0;
        this.f48244 = new int[]{i};
        this.f48242 = 1;
    }

    public C15675(int[] iArr) {
        this.f48243 = 0;
        this.f48244 = iArr;
        this.f48242 = iArr.length;
    }

    public C15675(C17793 c17793) {
        this.f48243 = 0;
        int[] iArr = c17793.f52396;
        int length = iArr.length;
        this.f48242 = length;
        this.f48244 = Arrays.copyOf(iArr, length);
    }

    public C15675(C15675 c15675) {
        this.f48243 = 0;
        int i = c15675.f48242;
        this.f48242 = i;
        int[] iArr = c15675.f48244;
        int i2 = c15675.f48243;
        this.f48244 = Arrays.copyOfRange(iArr, i2, i + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r3.length != r0) goto L10;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17793 m36911(int r6) {
        /*
            r5 = this;
            int r0 = r5.f48242
            if (r0 == 0) goto L1d
            if (r6 != 0) goto L7
            goto L1d
        L7:
            l.ᩳۗ᩻ r1 = new l.ᩳۗ᩻
            int r2 = r5.f48243
            if (r2 > 0) goto L12
            int[] r3 = r5.f48244
            int r4 = r3.length
            if (r4 == r0) goto L19
        L12:
            int[] r3 = r5.f48244
            int r0 = r0 + r2
            int[] r3 = java.util.Arrays.copyOfRange(r3, r2, r0)
        L19:
            r1.<init>(r3, r6)
            return r1
        L1d:
            l.ᩳۗ᩻ r6 = l.C14264.f42957
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15675.m36911(int):l.ᩳۗ᩻");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36901(C15675 c15675) {
        int i = c15675.f48242;
        int i2 = this.f48242;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int[] iArr = c15675.f48244;
        int i3 = this.f48243;
        int i4 = c15675.f48243;
        while (i3 < this.f48242 + this.f48243) {
            int i5 = this.f48244[i3] - 2147483648;
            int i6 = iArr[i4] - 2147483648;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            i3++;
            i4++;
        }
        return 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final int m36892() {
        int i = this.f48242;
        if (i == 0) {
            return -1;
        }
        do {
            i--;
            if (i <= 0) {
                break;
            }
        } while (this.f48244[this.f48243 + i] == 0);
        int i2 = this.f48244[this.f48243 + i];
        if (i2 == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i2) + (((this.f48242 - 1) - i) << 5);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36912() {
        int i = this.f48242;
        if (i == 0) {
            this.f48243 = 0;
            return;
        }
        int i2 = this.f48243;
        if (this.f48244[i2] != 0) {
            return;
        }
        int i3 = i + i2;
        do {
            i2++;
            if (i2 >= i3) {
                break;
            }
        } while (this.f48244[i2] == 0);
        int i4 = this.f48243;
        int i5 = i2 - i4;
        int i6 = this.f48242 - i5;
        this.f48242 = i6;
        this.f48243 = i6 != 0 ? i4 + i5 : 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36904(int i, C15675 c15675) {
        if (i == 1) {
            int i2 = this.f48242;
            if (c15675.f48244.length < i2) {
                c15675.f48244 = new int[i2];
            }
            System.arraycopy(this.f48244, this.f48243, c15675.f48244, 0, i2);
            c15675.f48242 = i2;
            c15675.f48243 = 0;
            return;
        }
        if (i == 0) {
            c15675.f48242 = 0;
            c15675.f48243 = 0;
            int length = c15675.f48244.length;
            for (int i3 = 0; i3 < length; i3++) {
                c15675.f48244[i3] = 0;
            }
            return;
        }
        long j = i & 4294967295L;
        int[] iArr = c15675.f48244;
        int length2 = iArr.length;
        int i4 = this.f48242;
        int i5 = i4 + 1;
        if (length2 < i5) {
            iArr = new int[i5];
        }
        long j2 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            long j3 = ((this.f48244[this.f48243 + i6] & 4294967295L) * j) + j2;
            iArr[i6 + 1] = (int) j3;
            j2 = j3 >>> 32;
        }
        if (j2 == 0) {
            c15675.f48243 = 1;
            c15675.f48242 = this.f48242;
        } else {
            c15675.f48243 = 0;
            c15675.f48242 = this.f48242 + 1;
            iArr[0] = (int) j2;
        }
        c15675.f48244 = iArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36905() {
        return this.f48242 == 1 && this.f48244[this.f48243] == 1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36909() {
        return this.f48242 == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36900() {
        int i = this.f48242;
        return i == 0 || (this.f48244[(this.f48243 + i) - 1] & 1) == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15675 m36906(C15675 c15675) {
        if (!c15675.m36909() && (c15675.f48244[(c15675.f48243 + c15675.f48242) - 1] & 1) == 1) {
            return m36893(c15675);
        }
        if (m36900()) {
            throw new RuntimeException();
        }
        int m36892 = c15675.m36892();
        C15675 c156752 = new C15675(c15675);
        c156752.m36908(m36892);
        if (c156752.m36905()) {
            return m36902(m36892);
        }
        C15675 m36893 = m36893(c156752);
        C15675 m36902 = m36902(m36892);
        C15675 m36886 = m36886(new C15675(1), new C15675(c156752), m36892);
        C15675 m369022 = c156752.m36902(m36892);
        C15675 c156753 = new C15675();
        C15675 c156754 = new C15675();
        C15675 c156755 = new C15675();
        m36893.m36897(m36892);
        m36893.m36913(m36886, c156755);
        m36902.m36913(c156752, c156753);
        c156753.m36913(m369022, c156754);
        c156755.m36899(c156754);
        return c156755.m36896(c15675, c156753);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36908(int i) {
        int i2 = this.f48242;
        if (i2 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        this.f48242 = i2 - i3;
        if (i4 == 0) {
            return;
        }
        if (i4 >= 32 - Integer.numberOfLeadingZeros(this.f48244[this.f48243])) {
            m36895(32 - i4);
            this.f48242--;
        } else {
            m36891(i4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36897(int i) {
        int i2;
        if (this.f48242 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        int numberOfLeadingZeros = 32 - (32 - Integer.numberOfLeadingZeros(this.f48244[this.f48243]));
        if (i <= numberOfLeadingZeros) {
            m36895(i4);
            return;
        }
        int i5 = this.f48242 + i3;
        int i6 = i5 + 1;
        if (i4 > numberOfLeadingZeros) {
            i5 = i6;
        }
        int[] iArr = this.f48244;
        if (iArr.length < i5) {
            int[] iArr2 = new int[i5];
            for (int i7 = 0; i7 < this.f48242; i7++) {
                iArr2[i7] = this.f48244[this.f48243 + i7];
            }
            this.f48244 = iArr2;
            this.f48242 = i5;
            this.f48243 = 0;
        } else if (iArr.length - this.f48243 >= i5) {
            int i8 = 0;
            while (true) {
                int i9 = this.f48242;
                if (i8 >= i5 - i9) {
                    break;
                }
                this.f48244[this.f48243 + i9 + i8] = 0;
                i8++;
            }
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.f48242;
                if (i10 >= i2) {
                    break;
                }
                int[] iArr3 = this.f48244;
                iArr3[i10] = iArr3[this.f48243 + i10];
                i10++;
            }
            while (i2 < i5) {
                this.f48244[i2] = 0;
                i2++;
            }
            this.f48243 = 0;
        }
        this.f48242 = i5;
        if (i4 == 0) {
            return;
        }
        if (i4 <= numberOfLeadingZeros) {
            m36895(i4);
        } else {
            m36891(32 - i4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36888(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            long j2 = (iArr[length] & 4294967295L) + (4294967295L & iArr2[r7]) + j;
            iArr2[length + i] = (int) j2;
            j = j2 >>> 32;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36882(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = i & 4294967295L;
        int i4 = i3 + i2;
        int i5 = i2 - 1;
        long j2 = 0;
        while (i5 >= 0) {
            long j3 = ((iArr2[i5] & 4294967295L) * j) + j2;
            long j4 = iArr[i4] - j3;
            int i6 = i4 - 1;
            iArr[i4] = (int) j4;
            j2 = ((j4 & 4294967295L) > (((long) (~((int) j3))) & 4294967295L) ? 1 : 0) + (j3 >>> 32);
            i5--;
            i4 = i6;
        }
        return (int) j2;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final void m36891(int i) {
        int[] iArr = this.f48244;
        int i2 = 32 - i;
        int i3 = (this.f48243 + this.f48242) - 1;
        int i4 = iArr[i3];
        while (true) {
            int i5 = this.f48243;
            if (i3 > i5) {
                int i6 = iArr[i3 - 1];
                iArr[i3] = (i4 >>> i) | (i6 << i2);
                i3--;
                i4 = i6;
            } else {
                iArr[i5] = iArr[i5] >>> i;
                return;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final void m36895(int i) {
        int[] iArr = this.f48244;
        int i2 = 32 - i;
        int i3 = this.f48243;
        int i4 = iArr[i3];
        int i5 = (this.f48242 + i3) - 1;
        while (i3 < i5) {
            int i6 = i3 + 1;
            int i7 = iArr[i6];
            iArr[i3] = (i4 << i) | (i7 >>> i2);
            i3 = i6;
            i4 = i7;
        }
        int i8 = (this.f48243 + this.f48242) - 1;
        iArr[i8] = iArr[i8] << i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36899(C15675 c15675) {
        int i = this.f48242;
        int i2 = c15675.f48242;
        int i3 = i > i2 ? i : i2;
        int[] iArr = this.f48244;
        if (iArr.length < i3) {
            iArr = new int[i3];
        }
        int length = iArr.length - 1;
        long j = 0;
        while (i > 0 && i2 > 0) {
            long j2 = (this.f48244[this.f48243 + r2] & 4294967295L) + (c15675.f48244[c15675.f48243 + r3] & 4294967295L) + j;
            iArr[length] = (int) j2;
            j = j2 >>> 32;
            length--;
            i--;
            i2--;
        }
        while (i > 0) {
            i--;
            if (j == 0 && iArr == this.f48244 && length == this.f48243 + i) {
                return;
            }
            long j3 = (this.f48244[this.f48243 + i] & 4294967295L) + j;
            iArr[length] = (int) j3;
            length--;
            j = j3 >>> 32;
        }
        while (i2 > 0) {
            i2--;
            long j4 = (c15675.f48244[c15675.f48243 + i2] & 4294967295L) + j;
            iArr[length] = (int) j4;
            j = j4 >>> 32;
            length--;
        }
        if (j > 0) {
            i3++;
            if (iArr.length < i3) {
                int[] iArr2 = new int[i3];
                System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
                iArr2[0] = 1;
                iArr = iArr2;
            } else {
                iArr[length] = 1;
            }
        }
        this.f48244 = iArr;
        this.f48242 = i3;
        this.f48243 = iArr.length - i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36898(int i, C15675 c15675) {
        if (c15675.m36909()) {
            return;
        }
        int i2 = this.f48242;
        int i3 = c15675.f48242 + i;
        int i4 = i2 > i3 ? i2 : i3;
        int[] iArr = this.f48244;
        if (iArr.length < i4) {
            iArr = new int[i4];
        } else {
            Arrays.fill(iArr, this.f48243 + i2, iArr.length, 0);
        }
        int length = iArr.length;
        System.arraycopy(this.f48244, this.f48243, iArr, length - i2, i2);
        int i5 = i3 - i2;
        int i6 = (length - 1) - i2;
        int min = Math.min(i5, c15675.f48244.length - c15675.f48243);
        int i7 = i6 + 1;
        int i8 = i7 - i5;
        System.arraycopy(c15675.f48244, c15675.f48243, iArr, i8, min);
        for (int i9 = i8 + min; i9 < i7; i9++) {
            iArr[i9] = 0;
        }
        this.f48244 = iArr;
        this.f48242 = i4;
        this.f48243 = iArr.length - i4;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m36910(C15675 c15675) {
        C15675 c156752;
        C15675 c156753;
        int[] iArr = this.f48244;
        int m36901 = m36901(c15675);
        if (m36901 == 0) {
            this.f48242 = 0;
            this.f48243 = 0;
            return 0;
        }
        if (m36901 < 0) {
            c156753 = c15675;
            c156752 = this;
        } else {
            c156752 = c15675;
            c156753 = this;
        }
        int i = c156753.f48242;
        if (iArr.length < i) {
            iArr = new int[i];
        }
        int i2 = c156752.f48242;
        int length = iArr.length - 1;
        long j = 0;
        int i3 = i;
        while (i2 > 0) {
            i3--;
            i2--;
            j = ((c156753.f48244[c156753.f48243 + i3] & 4294967295L) - (c156752.f48244[c156752.f48243 + i2] & 4294967295L)) - ((int) (-(j >> 32)));
            iArr[length] = (int) j;
            length--;
        }
        while (i3 > 0) {
            i3--;
            j = (c156753.f48244[c156753.f48243 + i3] & 4294967295L) - ((int) (-(j >> 32)));
            iArr[length] = (int) j;
            length--;
        }
        this.f48244 = iArr;
        this.f48242 = i;
        this.f48243 = iArr.length - i;
        m36912();
        return m36901;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36913(C15675 c15675, C15675 c156752) {
        C15675 c156753 = this;
        C15675 c156754 = c15675;
        int i = c156753.f48242;
        int i2 = c156754.f48242;
        int i3 = i + i2;
        if (c156752.f48244.length < i3) {
            c156752.f48244 = new int[i3];
        }
        c156752.f48243 = 0;
        c156752.f48242 = i3;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long j = 0;
        int i6 = i4;
        while (i6 >= 0) {
            long j2 = ((c156754.f48244[c156754.f48243 + i6] & 4294967295L) * (c156753.f48244[(i - 1) + c156753.f48243] & 4294967295L)) + j;
            c156752.f48244[i5] = (int) j2;
            j = j2 >>> 32;
            i6--;
            i5--;
        }
        c156752.f48244[i - 1] = (int) j;
        int i7 = i - 2;
        while (i7 >= 0) {
            int i8 = i2 + i7;
            long j3 = 0;
            int i9 = i4;
            while (i9 >= 0) {
                long j4 = (c156754.f48244[c156754.f48243 + i9] & 4294967295L) * (c156753.f48244[c156753.f48243 + i7] & 4294967295L);
                long j5 = j4 + (r0[i8] & 4294967295L) + j3;
                c156752.f48244[i8] = (int) j5;
                j3 = j5 >>> 32;
                i9--;
                i8--;
                c156753 = this;
                c156754 = c15675;
                i2 = i2;
            }
            c156752.f48244[i7] = (int) j3;
            i7--;
            c156753 = this;
            c156754 = c15675;
            i2 = i2;
        }
        c156752.m36912();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15675 m36896(C15675 c15675, C15675 c156752) {
        int i = c15675.f48242;
        if (i < 80 || this.f48242 - i < 40) {
            return m36907(c15675, c156752);
        }
        return m36903(c15675, c156752);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15675 m36907(C15675 c15675, C15675 c156752) {
        int i;
        int[] copyOfRange;
        C15675 c156753;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        C15675 c156754;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        int min;
        long j2;
        int i18;
        int i19;
        long j3;
        if (c15675.f48242 == 0) {
            throw new RuntimeException();
        }
        if (this.f48242 == 0) {
            c156752.f48243 = 0;
            c156752.f48242 = 0;
            return new C15675();
        }
        int m36901 = m36901(c15675);
        if (m36901 < 0) {
            c156752.f48243 = 0;
            c156752.f48242 = 0;
            return new C15675(this);
        }
        if (m36901 != 0) {
            c156752.f48242 = 0;
            c156752.f48243 = 0;
            int length = c156752.f48244.length;
            for (int i20 = 0; i20 < length; i20++) {
                c156752.f48244[i20] = 0;
            }
            char c = ' ';
            if (c15675.f48242 == 1) {
                int i21 = c15675.f48244[c15675.f48243];
                long j4 = i21 & 4294967295L;
                int i22 = this.f48242;
                if (i22 == 1) {
                    long j5 = 4294967295L & this.f48244[this.f48243];
                    int i23 = (int) (j5 / j4);
                    i18 = (int) (j5 - (i23 * j4));
                    c156752.f48244[0] = i23;
                    c156752.f48242 = i23 == 0 ? 0 : 1;
                    c156752.f48243 = 0;
                } else {
                    if (c156752.f48244.length < i22) {
                        c156752.f48244 = new int[i22];
                    }
                    c156752.f48243 = 0;
                    c156752.f48242 = i22;
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i21);
                    int i24 = this.f48244[this.f48243];
                    long j6 = i24 & 4294967295L;
                    if (j6 < j4) {
                        j2 = 0;
                        c156752.f48244[0] = 0;
                    } else {
                        int i25 = (int) (j6 / j4);
                        c156752.f48244[0] = i25;
                        i24 = (int) (j6 - (i25 * j4));
                        j6 = i24 & 4294967295L;
                        j2 = 0;
                    }
                    int i26 = this.f48242;
                    while (true) {
                        int i27 = i26 - 1;
                        if (i27 <= 0) {
                            break;
                        }
                        int i28 = numberOfLeadingZeros;
                        long j7 = (this.f48244[(this.f48243 + this.f48242) - i27] & 4294967295L) | (j6 << c);
                        if (j7 >= j2) {
                            i19 = (int) (j7 / j4);
                            j3 = j7 - (i19 * j4);
                        } else {
                            long m36883 = m36883(i21, j7);
                            i19 = (int) (m36883 & 4294967295L);
                            j3 = m36883 >>> 32;
                        }
                        int i29 = (int) j3;
                        c156752.f48244[this.f48242 - i27] = i19;
                        j6 = i29 & 4294967295L;
                        numberOfLeadingZeros = i28;
                        i24 = i29;
                        i26 = i27;
                        c = ' ';
                    }
                    int i30 = numberOfLeadingZeros;
                    c156752.m36912();
                    i18 = i30 > 0 ? i24 % i21 : i24;
                }
                if (i18 == 0) {
                    return new C15675();
                }
                return new C15675(i18);
            }
            if (this.f48242 >= 6 && (min = Math.min(m36892(), c15675.m36892())) >= 96) {
                C15675 c156755 = new C15675(this);
                C15675 c156756 = new C15675(c15675);
                c156755.m36908(min);
                c156756.m36908(min);
                C15675 m36907 = c156755.m36907(c156756, c156752);
                m36907.m36897(min);
                return m36907;
            }
            int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(c15675.f48244[c15675.f48243]);
            int i31 = c15675.f48242;
            if (numberOfLeadingZeros2 > 0) {
                int[] iArr3 = new int[i31];
                i = i31;
                m36887(c15675.f48243, i31, c15675.f48244, 0, iArr3, numberOfLeadingZeros2);
                if (Integer.numberOfLeadingZeros(this.f48244[this.f48243]) >= numberOfLeadingZeros2) {
                    int[] iArr4 = new int[this.f48242 + 1];
                    c156753 = new C15675(iArr4);
                    c156753.f48242 = this.f48242;
                    c156753.f48243 = 1;
                    m36887(this.f48243, this.f48242, this.f48244, 1, iArr4, numberOfLeadingZeros2);
                    copyOfRange = iArr3;
                } else {
                    int[] iArr5 = new int[this.f48242 + 2];
                    C15675 c156757 = new C15675(iArr5);
                    c156757.f48242 = this.f48242 + 1;
                    c156757.f48243 = 1;
                    int i32 = this.f48243;
                    int i33 = 32 - numberOfLeadingZeros2;
                    int i34 = 1;
                    int i35 = 0;
                    while (true) {
                        i17 = this.f48242 + 1;
                        if (i34 >= i17) {
                            break;
                        }
                        int i36 = this.f48244[i32];
                        iArr5[i34] = (i35 << numberOfLeadingZeros2) | (i36 >>> i33);
                        i34++;
                        i32++;
                        i35 = i36;
                    }
                    iArr5[i17] = i35 << numberOfLeadingZeros2;
                    copyOfRange = iArr3;
                    c156753 = c156757;
                }
            } else {
                i = i31;
                int[] iArr6 = c15675.f48244;
                int i37 = c15675.f48243;
                copyOfRange = Arrays.copyOfRange(iArr6, i37, i37 + i);
                int[] iArr7 = new int[this.f48242 + 1];
                c156753 = new C15675(iArr7);
                System.arraycopy(this.f48244, this.f48243, iArr7, 1, this.f48242);
                c156753.f48242 = this.f48242;
                c156753.f48243 = 1;
            }
            int i38 = c156753.f48242;
            int i39 = i38 - i;
            int i40 = i39 + 1;
            if (c156752.f48244.length < i40) {
                c156752.f48244 = new int[i40];
                c156752.f48243 = 0;
            }
            c156752.f48242 = i40;
            int[] iArr8 = c156752.f48244;
            int i41 = c156753.f48242;
            if (i41 == i38) {
                c156753.f48243 = 0;
                c156753.f48244[0] = 0;
                c156753.f48242 = i41 + 1;
            }
            int i42 = copyOfRange[0];
            int i43 = numberOfLeadingZeros2;
            long j8 = i42 & 4294967295L;
            int i44 = copyOfRange[1];
            int i45 = 0;
            while (i45 < i39) {
                int[] iArr9 = c156753.f48244;
                int i46 = c156753.f48243;
                int i47 = iArr9[i45 + i46];
                int i48 = i47 - 2147483648;
                int i49 = i45 + 1;
                int i50 = iArr9[i49 + i46];
                if (i47 == i42) {
                    i9 = i47 + i50;
                    z2 = i9 + Integer.MIN_VALUE < i48;
                    i10 = -1;
                    i6 = i39;
                    i7 = i40;
                } else {
                    i6 = i39;
                    i7 = i40;
                    long j9 = (i47 << 32) | (i50 & 4294967295L);
                    if (j9 >= 0) {
                        i8 = (int) (j9 / j8);
                        j = j9 - (i8 * j8);
                    } else {
                        long m368832 = m36883(i42, j9);
                        i8 = (int) (m368832 & 4294967295L);
                        j = m368832 >>> 32;
                    }
                    int i51 = (int) j;
                    z2 = false;
                    int i52 = i8;
                    i9 = i51;
                    i10 = i52;
                }
                if (i10 == 0) {
                    i12 = i42;
                    i13 = i44;
                    i16 = i;
                    iArr2 = iArr8;
                    i15 = i43;
                } else {
                    if (z2) {
                        i11 = i48;
                        i12 = i42;
                        i13 = i44;
                        i14 = i;
                        iArr2 = iArr8;
                        i15 = i43;
                    } else {
                        long j10 = c156753.f48244[i45 + 2 + c156753.f48243] & 4294967295L;
                        int[] iArr10 = iArr8;
                        i15 = i43;
                        long j11 = i9 & 4294967295L;
                        i11 = i48;
                        i12 = i42;
                        i14 = i;
                        long j12 = i44 & 4294967295L;
                        i13 = i44;
                        iArr2 = iArr10;
                        long j13 = (i10 & 4294967295L) * j12;
                        if (m36889(j13, (j11 << 32) | j10)) {
                            long j14 = ((int) (j11 + j8)) & 4294967295L;
                            i10 = (j14 < j8 || !m36889(j13 - j12, (j14 << 32) | j10)) ? i10 - 1 : i10 - 2;
                        }
                    }
                    c156753.f48244[c156753.f48243 + i45] = 0;
                    i16 = i14;
                    if (m36882(i10, i16, r0, copyOfRange, r1) - 2147483648 > i11) {
                        m36888(i49 + c156753.f48243, copyOfRange, c156753.f48244);
                        i10--;
                    }
                    iArr2[i45] = i10;
                }
                i = i16;
                i45 = i49;
                i39 = i6;
                i40 = i7;
                i43 = i15;
                i42 = i12;
                i44 = i13;
                iArr8 = iArr2;
            }
            int i53 = i42;
            int i54 = i44;
            int i55 = i;
            int i56 = i39;
            int i57 = i40;
            int[] iArr11 = iArr8;
            int i58 = i43;
            int[] iArr12 = c156753.f48244;
            int i59 = c156753.f48243;
            int i60 = iArr12[i56 + i59];
            int i61 = i60 - 2147483648;
            int i62 = iArr12[i57 + i59];
            if (i60 == i53) {
                i3 = i60 + i62;
                z = i3 + Integer.MIN_VALUE < i61;
                i4 = -1;
            } else {
                long j15 = (i60 << 32) | (i62 & 4294967295L);
                if (j15 >= 0) {
                    i2 = (int) (j15 / j8);
                    i3 = (int) (j15 - (i2 * j8));
                } else {
                    long m368833 = m36883(i53, j15);
                    i2 = (int) (m368833 & 4294967295L);
                    i3 = (int) (m368833 >>> 32);
                }
                i4 = i2;
                z = false;
            }
            if (i4 != 0) {
                if (z) {
                    i5 = i61;
                    c156754 = c156753;
                    iArr = copyOfRange;
                } else {
                    long j16 = c156753.f48244[i56 + 2 + c156753.f48243] & 4294967295L;
                    i5 = i61;
                    c156754 = c156753;
                    long j17 = i54 & 4294967295L;
                    iArr = copyOfRange;
                    long j18 = (i4 & 4294967295L) * j17;
                    if (m36889(j18, ((i3 & 4294967295L) << 32) | j16)) {
                        long j19 = ((int) (r6 + j8)) & 4294967295L;
                        i4 = (j19 < j8 || !m36889(j18 - j17, (j19 << 32) | j16)) ? i4 - 1 : i4 - 2;
                    }
                }
                c156753 = c156754;
                c156753.f48244[i56 + c156753.f48243] = 0;
                int[] iArr13 = iArr;
                if (m36882(i4, i55, r0, iArr13, r10) - 2147483648 > i5) {
                    m36888(i57 + c156753.f48243, iArr13, c156753.f48244);
                    i4--;
                }
                iArr11[i56] = i4;
            }
            if (i58 > 0) {
                c156753.m36908(i58);
            }
            c156753.m36912();
            c156752.m36912();
            return c156753;
        }
        int[] iArr14 = c156752.f48244;
        c156752.f48242 = 1;
        iArr14[0] = 1;
        c156752.f48243 = 0;
        return new C15675();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15675 m36903(C15675 c15675, C15675 c156752) {
        long numberOfLeadingZeros;
        char c;
        C15675 c156753;
        int i;
        C15675 c156754;
        long j;
        int i2 = this.f48242;
        int i3 = c15675.f48242;
        c156752.f48242 = 0;
        c156752.f48243 = 0;
        if (i2 < i3) {
            return this;
        }
        int i4 = 1;
        int numberOfLeadingZeros2 = 1 << (32 - Integer.numberOfLeadingZeros(i3 / 80));
        int i5 = (((i3 + numberOfLeadingZeros2) - 1) / numberOfLeadingZeros2) * numberOfLeadingZeros2;
        long j2 = i5 * 32;
        int i6 = c15675.f48242;
        if (i6 == 0) {
            c = ' ';
            numberOfLeadingZeros = 0;
        } else {
            numberOfLeadingZeros = (i6 * 32) - Integer.numberOfLeadingZeros(c15675.f48244[c15675.f48243]);
            c = ' ';
        }
        int max = (int) Math.max(0L, j2 - numberOfLeadingZeros);
        C15675 c156755 = new C15675(c15675);
        if (max > 0) {
            c156755.m36897(max);
        }
        C15675 c156756 = new C15675(this);
        if (max > 0) {
            c156756.m36897(max);
        }
        int i7 = c156756.f48242;
        int numberOfLeadingZeros3 = (int) (((i7 == 0 ? 0L : (i7 * 32) - Integer.numberOfLeadingZeros(c156756.f48244[c156756.f48243])) + j2) / j2);
        if (numberOfLeadingZeros3 < 2) {
            numberOfLeadingZeros3 = 2;
        }
        C15675 m36885 = c156756.m36885(numberOfLeadingZeros3 - 1, numberOfLeadingZeros3, i5);
        int i8 = numberOfLeadingZeros3 - 2;
        C15675 m368852 = c156756.m36885(i8, numberOfLeadingZeros3, i5);
        m368852.m36898(i5, m36885);
        C15675 c156757 = new C15675();
        while (i8 > 0) {
            C15675 m36894 = m368852.m36894(c156755, c156757);
            C15675 m368853 = c156756.m36885(i8 - 1, numberOfLeadingZeros3, i5);
            m368853.m36898(i5, m36894);
            int i9 = i8 * i5;
            if (c156757.m36909()) {
                c156753 = c156756;
                i = i5;
                c156754 = m368853;
            } else {
                int i10 = c156752.f48242;
                int i11 = c156757.f48242 + i9;
                int i12 = i10 > i11 ? i10 : i11;
                int[] iArr = c156752.f48244;
                if (iArr.length < i12) {
                    iArr = new int[i12];
                }
                int length = iArr.length - i4;
                long j3 = 0;
                while (i10 > 0 && i11 > 0) {
                    int i13 = i10 - 1;
                    i11--;
                    C15675 c156758 = c156756;
                    int i14 = i5;
                    long j4 = (c156752.f48244[c156752.f48243 + i13] & 4294967295L) + ((c156757.f48243 + i11 < c156757.f48244.length ? r1[r5] : 0) & 4294967295L) + j3;
                    iArr[length] = (int) j4;
                    j3 = j4 >>> c;
                    length--;
                    i5 = i14;
                    m368853 = m368853;
                    i10 = i13;
                    c156756 = c156758;
                }
                c156753 = c156756;
                i = i5;
                c156754 = m368853;
                while (i10 > 0) {
                    i10--;
                    if (j3 != 0 || iArr != c156752.f48244 || length != c156752.f48243 + i10) {
                        long j5 = (c156752.f48244[c156752.f48243 + i10] & 4294967295L) + j3;
                        iArr[length] = (int) j5;
                        j3 = j5 >>> c;
                        length--;
                    }
                }
                while (i11 > 0) {
                    i11--;
                    long j6 = ((c156757.f48243 + i11 < c156757.f48244.length ? r4[r1] : 0) & 4294967295L) + j3;
                    iArr[length] = (int) j6;
                    j3 = j6 >>> c;
                    length--;
                }
                j = 0;
                if (j3 > 0) {
                    i12++;
                    if (iArr.length < i12) {
                        int[] iArr2 = new int[i12];
                        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
                        iArr2[0] = 1;
                        iArr = iArr2;
                    } else {
                        iArr[length] = 1;
                    }
                }
                c156752.f48244 = iArr;
                c156752.f48242 = i12;
                c156752.f48243 = iArr.length - i12;
                i8--;
                c156756 = c156753;
                i5 = i;
                m368852 = c156754;
                i4 = 1;
            }
            j = 0;
            i8--;
            c156756 = c156753;
            i5 = i;
            m368852 = c156754;
            i4 = 1;
        }
        C15675 m368942 = m368852.m36894(c156755, c156757);
        c156752.m36899(c156757);
        m368942.m36908(max);
        return m368942;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15675 m36894(C15675 c15675, C15675 c156752) {
        int i = c15675.f48242;
        if (i % 2 != 0 || i < 80) {
            return m36907(c15675, c156752);
        }
        C15675 c156753 = new C15675(this);
        int i2 = i / 2;
        int i3 = i2 * 32;
        if (i3 / 32 >= c156753.f48242) {
            c156753.f48242 = 0;
            c156753.f48243 = 0;
        } else {
            c156753.m36908(i3);
        }
        int i4 = this.f48242;
        if (i4 >= i2) {
            this.f48243 = (i4 - i2) + this.f48243;
            this.f48242 = i2;
        }
        C15675 c156754 = new C15675();
        m36898(i2, c156753.m36890(c15675, c156754));
        C15675 m36890 = m36890(c15675, c156752);
        c156752.m36898(i2, c156754);
        return m36890;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff A[LOOP:1: B:31:0x00f9->B:33:0x00ff, LOOP_END] */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C15675 m36890(l.C15675 r18, l.C15675 r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15675.m36890(l.ܺۗ᩻, l.ܺۗ᩻):l.ܺۗ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15675 m36885(int i, int i2, int i3) {
        int i4 = i * i3;
        int i5 = this.f48242;
        if (i4 >= i5) {
            return new C15675();
        }
        int i6 = i == i2 + (-1) ? i5 : (i + 1) * i3;
        if (i6 > i5) {
            return new C15675();
        }
        int[] iArr = this.f48244;
        int i7 = this.f48243;
        return new C15675(Arrays.copyOfRange(iArr, (i7 + i5) - i6, (i7 + i5) - i4));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36887(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        int i5 = 32 - i4;
        int i6 = iArr[i];
        int i7 = 0;
        while (i7 < i2 - 1) {
            i++;
            int i8 = iArr[i];
            iArr2[i3 + i7] = (i6 << i4) | (i8 >>> i5);
            i7++;
            i6 = i8;
        }
        iArr2[(i3 + i2) - 1] = i6 << i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m36883(int i, long j) {
        long j2 = i & 4294967295L;
        if (j2 == 1) {
            return ((int) j) & 4294967295L;
        }
        long j3 = (j >>> 1) / (j2 >>> 1);
        long j4 = j - (j3 * j2);
        while (j4 < 0) {
            j4 += j2;
            j3--;
        }
        while (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        return (j4 << 32) | (j3 & 4294967295L);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15675 m36902(int i) {
        if (m36900()) {
            throw new RuntimeException();
        }
        if (i <= 64) {
            int[] iArr = this.f48244;
            int i2 = this.f48243;
            int i3 = this.f48242;
            int i4 = iArr[(i2 + i3) - 1];
            int m48904 = C21639.m48904(i4, i4, 2, i4);
            int m489042 = C21639.m48904(i4, m48904, 2, m48904);
            int m489043 = C21639.m48904(i4, m489042, 2, m489042);
            int m489044 = C21639.m48904(i4, m489043, 2, m489043);
            if (i < 33) {
                if (i != 32) {
                    m489044 &= (1 << i) - 1;
                }
                return new C15675(m489044);
            }
            int i5 = i2 + i3;
            long j = iArr[i5 - 1] & 4294967295L;
            if (i3 > 1) {
                j |= iArr[i5 - 2] << 32;
            }
            long j2 = m489044 & 4294967295L;
            long j3 = (2 - (j * j2)) * j2;
            if (i != 64) {
                j3 &= (1 << i) - 1;
            }
            C15675 c15675 = new C15675(new int[]{(int) (j3 >>> 32), (int) j3});
            c15675.f48242 = 2;
            c15675.m36912();
            return c15675;
        }
        C15675 c156752 = new C15675(1);
        c156752.m36897(i);
        C15675 c156753 = new C15675(c156752);
        C15675 c156754 = new C15675(this);
        C15675 c156755 = new C15675();
        C15675 m36896 = c156752.m36896(c156754, c156755);
        C15675 c156756 = new C15675(c156755);
        C15675 c156757 = new C15675(1);
        C15675 c156758 = new C15675();
        while (!m36896.m36905()) {
            c156754 = c156754.m36896(m36896, c156755);
            if (c156754.f48242 == 0) {
                throw new RuntimeException();
            }
            if (c156755.f48242 == 1) {
                c156756.m36904(c156755.f48244[c156755.f48243], c156758);
            } else {
                c156755.m36913(c156756, c156758);
            }
            c156757.m36899(c156758);
            if (c156754.m36905()) {
                return c156757;
            }
            m36896 = m36896.m36896(c156754, c156758);
            if (m36896.f48242 == 0) {
                throw new RuntimeException();
            }
            if (c156758.f48242 == 1) {
                c156757.m36904(c156758.f48244[c156758.f48243], c156755);
            } else {
                c156758.m36913(c156757, c156755);
            }
            c156756.m36899(c156755);
        }
        c156753.m36910(c156756);
        return c156753;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15675 m36893(C15675 c15675) {
        int i;
        C15675 c156752 = new C15675(c15675);
        C15675 c156753 = new C15675(this);
        C15675 c156754 = new C15675(c156752);
        C3682 c3682 = new C3682(1);
        c3682.f11628 = 1;
        C3682 c36822 = new C3682();
        c36822.f11628 = 1;
        if (c156753.m36900()) {
            i = c156753.m36892();
            c156753.m36908(i);
            c36822.m36897(i);
        } else {
            i = 0;
        }
        while (!c156753.m36905()) {
            if (c156753.m36909()) {
                throw new RuntimeException();
            }
            if (c156753.m36901(c156754) < 0) {
                C15675 c156755 = c156754;
                c156754 = c156753;
                c156753 = c156755;
                C3682 c36823 = c36822;
                c36822 = c3682;
                c3682 = c36823;
            }
            if (((c156753.f48244[(c156753.f48243 + c156753.f48242) - 1] ^ c156754.f48244[(c156754.f48243 + c156754.f48242) - 1]) & 3) == 0) {
                c156753.m36910(c156754);
                int i2 = c3682.f11628;
                if (i2 == c36822.f11628) {
                    c3682.f11628 = i2 * c3682.m36910(c36822);
                } else {
                    c3682.m36899(c36822);
                }
            } else {
                c156753.m36899(c156754);
                int i3 = c3682.f11628;
                if (i3 == c36822.f11628) {
                    c3682.m36899(c36822);
                } else {
                    c3682.f11628 = i3 * c3682.m36910(c36822);
                }
            }
            int m36892 = c156753.m36892();
            c156753.m36908(m36892);
            c36822.m36897(m36892);
            i += m36892;
        }
        if (c3682.m36901(c156752) >= 0) {
            C15675 m36896 = c3682.m36896(c156752, new C15675());
            int i4 = m36896.f48242;
            if (c3682.f48244.length < i4) {
                c3682.f48244 = new int[i4];
            }
            System.arraycopy(m36896.f48244, m36896.f48243, c3682.f48244, 0, i4);
            c3682.f48242 = i4;
            c3682.f48243 = 0;
        }
        int i5 = c3682.f11628;
        if (i5 < 0) {
            if (i5 == 1) {
                c3682.m36899(c156752);
            } else {
                c3682.f11628 = i5 * c3682.m36910(c156752);
            }
        }
        return m36886(c3682, c156752, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15675 m36886(C15675 c15675, C15675 c156752, int i) {
        C15675 c156753 = new C15675();
        int i2 = c156752.f48244[(c156752.f48243 + c156752.f48242) - 1];
        int m48904 = C21639.m48904(i2, i2, 2, i2);
        int m489042 = C21639.m48904(i2, m48904, 2, m48904);
        int m489043 = C21639.m48904(i2, m489042, 2, m489042);
        int i3 = -C21639.m48904(i2, m489043, 2, m489043);
        int i4 = i >> 5;
        for (int i5 = 0; i5 < i4; i5++) {
            c156752.m36904(c15675.f48244[(c15675.f48243 + c15675.f48242) - 1] * i3, c156753);
            c15675.m36899(c156753);
            c15675.f48242--;
        }
        int i6 = i & 31;
        if (i6 != 0) {
            c156752.m36904((i3 * c15675.f48244[(c15675.f48243 + c15675.f48242) - 1]) & ((1 << i6) - 1), c156753);
            c15675.m36899(c156753);
            c15675.m36908(i6);
        }
        return c15675.m36901(c156752) >= 0 ? c15675.m36896(c156752, new C15675()) : c15675;
    }
}
