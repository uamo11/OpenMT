package l;

/* compiled from: A570 */
/* renamed from: l.᩵᩶ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C19688 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63603;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public short f63604;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f63605;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f63606;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f63607;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f63608;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f63609;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1342 f63610;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public short f63611;

    public C19688(C1342 c1342) {
        this.f63610 = c1342;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45279(C19688 c19688) {
        this.f63607 = c19688.f63607;
        this.f63609 = c19688.f63609;
        this.f63611 = (short) 0;
        this.f63608 = c19688.f63608;
        this.f63606 = c19688.f63606;
        this.f63604 = c19688.f63604;
        this.f63603 = c19688.f63603;
        this.f63605 = c19688.f63605;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45267(C6281 c6281, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m45268(c6281, C11926.m29095((String) obj).m29099(), 0);
        }
        C1342 c1342 = (C1342) obj;
        if ((c1342.f4880 & 4) != 0) {
            return c6281.m17300(c1342.f4874, "") | 12582912;
        }
        return c6281.m17302(c1342) | 16777216;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45268(C6281 c6281, String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return c6281.m17324(C15472.m36561(1, i + 1, str)) | 8388608;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt == '[') {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 == 'F') {
                            i2 = 4194306;
                        } else if (charAt2 == 'L') {
                            i2 = c6281.m17324(C15472.m36561(1, i3 + 1, str)) | 8388608;
                        } else if (charAt2 == 'S') {
                            i2 = 4194316;
                        } else if (charAt2 == 'Z') {
                            i2 = 4194313;
                        } else if (charAt2 == 'I') {
                            i2 = 4194305;
                        } else if (charAt2 != 'J') {
                            switch (charAt2) {
                                case 'B':
                                    i2 = 4194314;
                                    break;
                                case 'C':
                                    i2 = 4194315;
                                    break;
                                case 'D':
                                    i2 = 4194307;
                                    break;
                                default:
                                    throw new IllegalArgumentException(C20094.m46315("Invalid descriptor fragment: ", str.substring(i3)));
                            }
                        } else {
                            i2 = 4194308;
                        }
                        return i2 | ((i3 - i) << 26);
                    }
                    switch (charAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException(C20094.m46315("Invalid descriptor: ", str.substring(i)));
                    }
                }
            }
        }
        return 4194305;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45277(C6281 c6281, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f63607 = iArr;
        this.f63609 = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = c6281.m17324(c6281.m17316()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C11926 c11926 : C11926.m29092(str)) {
            int m45268 = m45268(c6281, c11926.m29099(), 0);
            int[] iArr2 = this.f63607;
            int i4 = i3 + 1;
            iArr2[i3] = m45268;
            if (m45268 == 4194308 || m45268 == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f63607[i3] = 4194304;
            i3++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45278(C6281 c6281, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f63607[i3] = m45267(c6281, objArr[i4]);
            if (objArr[i4] == 4 || objArr[i4] == 3) {
                i3 += 2;
                this.f63607[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f63607;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (objArr2[i7] == 4 || objArr2[i7] == 3) {
                i6++;
            }
        }
        this.f63609 = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f63609[i8] = m45267(c6281, objArr2[i9]);
            if (objArr2[i9] == 4 || objArr2[i9] == 3) {
                i8 += 2;
                this.f63609[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.f63604 = (short) 0;
        this.f63603 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45276() {
        return this.f63609.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m45264(int i) {
        int[] iArr = this.f63608;
        if (iArr == null || i >= iArr.length) {
            return i | 20971520;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 20971520 | i;
        iArr[i] = i3;
        return i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45274(int i, int i2) {
        if (this.f63608 == null) {
            this.f63608 = new int[10];
        }
        int length = this.f63608.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f63608, 0, iArr, 0, length);
            this.f63608 = iArr;
        }
        this.f63608[i] = i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45275(int i) {
        if (this.f63606 == null) {
            this.f63606 = new int[10];
        }
        int length = this.f63606.length;
        short s = this.f63604;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f63606, 0, iArr, 0, length);
            this.f63606 = iArr;
        }
        int[] iArr2 = this.f63606;
        short s2 = this.f63604;
        short s3 = (short) (s2 + 1);
        this.f63604 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f63611 + s3);
        C1342 c1342 = this.f63610;
        if (s4 > c1342.f4882) {
            c1342.f4882 = s4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45270(C6281 c6281, String str) {
        int m45268 = m45268(c6281, str, str.charAt(0) == '(' ? C11926.m29097(str) : 0);
        if (m45268 != 0) {
            m45275(m45268);
            if (m45268 == 4194308 || m45268 == 4194307) {
                m45275(4194304);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m45272() {
        short s = this.f63604;
        if (s > 0) {
            int[] iArr = this.f63606;
            short s2 = (short) (s - 1);
            this.f63604 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f63611 - 1);
        this.f63611 = s3;
        return (-s3) | 25165824;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45273(int i) {
        short s = this.f63604;
        if (s >= i) {
            this.f63604 = (short) (s - i);
        } else {
            this.f63611 = (short) (this.f63611 - (i - s));
            this.f63604 = (short) 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45269(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            m45273((C11926.m29094(str) >> 2) - 1);
        } else if (charAt == 'J' || charAt == 'D') {
            m45273(2);
        } else {
            m45273(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[LOOP:0: B:10:0x0011->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m45266(l.C6281 r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto L10
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == r2) goto L10
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r2) goto L57
        L10:
            r1 = 0
        L11:
            int r2 = r8.f63603
            if (r1 >= r2) goto L57
            int[] r2 = r8.f63605
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L2d
            int[] r2 = r8.f63607
            r2 = r2[r6]
            goto L37
        L2d:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r7) goto L38
            int[] r2 = r8.f63609
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
        L37:
            int r2 = r2 + r3
        L38:
            if (r10 != r2) goto L54
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L47
            java.lang.String r10 = r9.m17316()
            int r9 = r9.m17324(r10)
            goto L52
        L47:
            r10 = r10 & r5
            l.۫᩶ۚ r10 = r9.m17321(r10)
            java.lang.String r10 = r10.f39906
            int r9 = r9.m17324(r10)
        L52:
            r9 = r9 | r1
            return r9
        L54:
            int r1 = r1 + 1
            goto L11
        L57:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19688.m45266(l.ۛ᩶ۚ, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00b8  */
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo38091(int r18, int r19, l.AbstractC13336 r20, l.C6281 r21) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19688.mo38091(int, int, l.۬᩶ۚ, l.ۛ᩶ۚ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m45265(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f63607[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f63609[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45281(C6281 c6281, C19688 c19688, int i) {
        boolean z;
        int i2;
        int length = this.f63607.length;
        int length2 = this.f63609.length;
        boolean z2 = true;
        if (c19688.f63607 == null) {
            c19688.f63607 = new int[length];
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int[] iArr = this.f63608;
            if (iArr != null && i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 == 0) {
                    i2 = this.f63607[i3];
                } else {
                    i2 = m45265(i4, length2);
                }
            } else {
                i2 = this.f63607[i3];
            }
            if (this.f63605 != null) {
                i2 = m45266(c6281, i2);
            }
            z |= m45271(c6281, i2, c19688.f63607, i3);
        }
        if (i > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                z |= m45271(c6281, this.f63607[i5], c19688.f63607, i5);
            }
            if (c19688.f63609 == null) {
                c19688.f63609 = new int[1];
            } else {
                z2 = z;
            }
            return m45271(c6281, i, c19688.f63609, 0) | z2;
        }
        int length3 = this.f63609.length + this.f63611;
        if (c19688.f63609 == null) {
            c19688.f63609 = new int[this.f63604 + length3];
        } else {
            z2 = z;
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.f63609[i6];
            if (this.f63605 != null) {
                i7 = m45266(c6281, i7);
            }
            z2 |= m45271(c6281, i7, c19688.f63609, i6);
        }
        for (int i8 = 0; i8 < this.f63604; i8++) {
            int m45265 = m45265(this.f63606[i8], length2);
            if (this.f63605 != null) {
                m45265 = m45266(c6281, m45265);
            }
            z2 |= m45271(c6281, m45265, c19688.f63609, length3 + i8);
        }
        return z2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45271(C6281 c6281, int i, int[] iArr, int i2) {
        int min;
        int m17324;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int i5 = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i6 = i & (-67108864);
                if (i6 != 0 || (i & 62914560) == 8388608) {
                    if (i6 != 0 && (i & 62914560) != 8388608) {
                        i6 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    min = Math.min(i6, i4) | 8388608;
                    m17324 = c6281.m17324("java/lang/Object");
                    i5 = min | m17324;
                }
            } else if ((i3 & 62914560) == 8388608) {
                i5 = (i & (-67108864)) | 8388608 | c6281.m17299(i & 1048575, 1048575 & i3);
            } else {
                min = ((i & (-67108864)) - 67108864) | 8388608;
                m17324 = c6281.m17324("java/lang/Object");
                i5 = min | m17324;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            i5 = i;
        }
        if (i5 == i3) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45280(C21804 c21804) {
        int i;
        int[] iArr = this.f63607;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            int i5 = 0;
            do {
                int i6 = 2;
                if (i3 >= iArr.length) {
                    break loop0;
                }
                i = iArr[i3];
                if (i != 4194308 && i != 4194307) {
                    i6 = 1;
                }
                i3 += i6;
                i5++;
            } while (i == 4194304);
            i4 += i5;
        }
        int[] iArr2 = this.f63609;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c21804.m49143(this.f63610.f4874, i4, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c21804.m49148(i10, i13);
            i4 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 > 0) {
                int i15 = iArr2[i2];
                i2 += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
                c21804.m49148(i10, i15);
                i10++;
                i8 = i14;
            } else {
                c21804.m49151();
                return;
            }
        }
    }
}
