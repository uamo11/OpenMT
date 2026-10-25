package l;

import java.util.Arrays;

/* compiled from: M1PH */
/* renamed from: l.᩵ۢᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19389 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f62753 = new int[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f62752 = new int[0];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44663(int i, int i2, int i3, int[] iArr) {
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i5;
            i4++;
            i++;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m44658(int[] r3, int r4, int r5, int r6, l.InterfaceC4571 r7) {
        /*
            r0 = r3[r4]
            r1 = r3[r5]
            int r0 = r7.mo9675(r0, r1)
            r1 = r3[r4]
            r2 = r3[r6]
            int r1 = r7.mo9675(r1, r2)
            r2 = r3[r5]
            r3 = r3[r6]
            int r3 = r7.mo9675(r2, r3)
            if (r0 >= 0) goto L20
            if (r3 >= 0) goto L1d
            goto L22
        L1d:
            if (r1 >= 0) goto L26
            goto L25
        L20:
            if (r3 <= 0) goto L23
        L22:
            return r5
        L23:
            if (r1 <= 0) goto L26
        L25:
            return r6
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19389.m44658(int[], int, int, int, l.ۙۢᩴ):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44661(int[] iArr, int i, int i2, InterfaceC4571 interfaceC4571) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (interfaceC4571.mo9675(iArr[i8], iArr[i7]) < 0) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    int i9 = iArr[i];
                    iArr[i] = iArr[i7];
                    iArr[i7] = i9;
                }
                i = i6;
            }
            return;
        }
        int i10 = (i5 / 2) + i;
        int i11 = i2 - 1;
        if (i5 > 128) {
            int i12 = i5 / 8;
            int i13 = i12 * 2;
            i3 = m44658(iArr, i, i + i12, i + i13, interfaceC4571);
            i10 = m44658(iArr, i10 - i12, i10, i10 + i12, interfaceC4571);
            i4 = m44658(iArr, i11 - i13, i11 - i12, i11, interfaceC4571);
        } else {
            i3 = i;
            i4 = i11;
        }
        int i14 = iArr[m44658(iArr, i3, i10, i4, interfaceC4571)];
        int i15 = i;
        int i16 = i15;
        int i17 = i11;
        while (true) {
            if (i15 <= i11) {
                int mo9675 = interfaceC4571.mo9675(iArr[i15], i14);
                if (mo9675 <= 0) {
                    if (mo9675 == 0) {
                        int i18 = iArr[i16];
                        iArr[i16] = iArr[i15];
                        iArr[i15] = i18;
                        i16++;
                    }
                    i15++;
                }
            }
            while (i11 >= i15) {
                int mo96752 = interfaceC4571.mo9675(iArr[i11], i14);
                if (mo96752 < 0) {
                    break;
                }
                if (mo96752 == 0) {
                    int i19 = iArr[i11];
                    iArr[i11] = iArr[i17];
                    iArr[i17] = i19;
                    i17--;
                }
                i11--;
            }
            if (i15 > i11) {
                break;
            }
            int i20 = iArr[i15];
            iArr[i15] = iArr[i11];
            iArr[i11] = i20;
            i15++;
            i11--;
        }
        int i21 = i16 - i;
        int i22 = i15 - i16;
        int min = Math.min(i21, i22);
        m44663(i, i15 - min, min, iArr);
        int i23 = i17 - i11;
        int min2 = Math.min(i23, (i2 - i17) - 1);
        m44663(i15, i2 - min2, min2, iArr);
        if (i22 > 1) {
            m44661(iArr, i, i22 + i, interfaceC4571);
        }
        if (i23 > 1) {
            m44661(iArr, i2 - i23, i2, interfaceC4571);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44662(int[] iArr, int i, int i2, InterfaceC4571 interfaceC4571, int[] iArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (iArr2 == null) {
                iArr2 = Arrays.copyOf(iArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m44662(iArr2, i, i4, interfaceC4571, iArr);
            m44662(iArr2, i4, i2, interfaceC4571, iArr);
            if (interfaceC4571.mo9675(iArr2[i4 - 1], iArr2[i4]) <= 0) {
                System.arraycopy(iArr2, i, iArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC4571.mo9675(iArr2[i5], iArr2[i6]) <= 0)) {
                    iArr[i] = iArr2[i5];
                    i5++;
                } else {
                    iArr[i] = iArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            int i9 = iArr[i8];
            int i10 = iArr[i7];
            int i11 = i8;
            while (true) {
                if (interfaceC4571.mo9675(i9, i10) < 0) {
                    iArr[i11] = i10;
                    if (i == i11 - 1) {
                        i11--;
                        break;
                    }
                    int i12 = i11 - 1;
                    int i13 = iArr[i11 - 2];
                    i11 = i12;
                    i10 = i13;
                }
            }
            iArr[i11] = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m44657(int r3, int r4, int r5, int[] r6) {
        /*
            r0 = r6[r3]
            r1 = r6[r4]
            int r0 = java.lang.Integer.compare(r0, r1)
            r1 = r6[r3]
            r2 = r6[r5]
            int r1 = java.lang.Integer.compare(r1, r2)
            r2 = r6[r4]
            r6 = r6[r5]
            int r6 = java.lang.Integer.compare(r2, r6)
            if (r0 >= 0) goto L20
            if (r6 >= 0) goto L1d
            goto L22
        L1d:
            if (r1 >= 0) goto L26
            goto L25
        L20:
            if (r6 <= 0) goto L23
        L22:
            return r4
        L23:
            if (r1 <= 0) goto L26
        L25:
            return r5
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19389.m44657(int, int, int, int[]):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44659(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (iArr[i8] < iArr[i7]) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    int i9 = iArr[i];
                    iArr[i] = iArr[i7];
                    iArr[i7] = i9;
                }
                i = i6;
            }
            return;
        }
        int i10 = (i5 / 2) + i;
        int i11 = i2 - 1;
        if (i5 > 128) {
            int i12 = i5 / 8;
            int i13 = i12 * 2;
            i3 = m44657(i, i + i12, i + i13, iArr);
            i10 = m44657(i10 - i12, i10, i10 + i12, iArr);
            i4 = m44657(i11 - i13, i11 - i12, i11, iArr);
        } else {
            i3 = i;
            i4 = i11;
        }
        int i14 = iArr[m44657(i3, i10, i4, iArr)];
        int i15 = i;
        int i16 = i15;
        int i17 = i11;
        while (true) {
            if (i15 <= i11) {
                int compare = Integer.compare(iArr[i15], i14);
                if (compare <= 0) {
                    if (compare == 0) {
                        int i18 = iArr[i16];
                        iArr[i16] = iArr[i15];
                        iArr[i15] = i18;
                        i16++;
                    }
                    i15++;
                }
            }
            while (i11 >= i15) {
                int compare2 = Integer.compare(iArr[i11], i14);
                if (compare2 < 0) {
                    break;
                }
                if (compare2 == 0) {
                    int i19 = iArr[i11];
                    iArr[i11] = iArr[i17];
                    iArr[i17] = i19;
                    i17--;
                }
                i11--;
            }
            if (i15 > i11) {
                break;
            }
            int i20 = iArr[i15];
            iArr[i15] = iArr[i11];
            iArr[i11] = i20;
            i15++;
            i11--;
        }
        int i21 = i16 - i;
        int i22 = i15 - i16;
        int min = Math.min(i21, i22);
        m44663(i, i15 - min, min, iArr);
        int i23 = i17 - i11;
        int min2 = Math.min(i23, (i2 - i17) - 1);
        m44663(i15, i2 - min2, min2, iArr);
        if (i22 > 1) {
            m44659(i, i22 + i, iArr);
        }
        if (i23 > 1) {
            m44659(i2 - i23, i2, iArr);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44660(int i, int[] iArr) {
        int i2;
        if (i < 2000) {
            m44659(0, i, iArr);
            return;
        }
        if (i < 1024) {
            m44659(0, i, iArr);
            return;
        }
        int[] iArr2 = new int[766];
        int[] iArr3 = new int[766];
        int[] iArr4 = new int[766];
        iArr2[0] = 0;
        iArr3[0] = i;
        iArr4[0] = 0;
        int i3 = 256;
        int[] iArr5 = new int[256];
        int[] iArr6 = new int[256];
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            int i5 = iArr2[i4];
            int i6 = iArr3[i4];
            int i7 = iArr4[i4];
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 128 : 0;
            int i10 = (3 - i8) * 8;
            int i11 = i6 + i5;
            int i12 = i11;
            while (true) {
                int i13 = i12 - 1;
                if (i12 == i5) {
                    break;
                }
                int i14 = ((iArr[i13] >>> i10) & 255) ^ i9;
                iArr5[i14] = iArr5[i14] + 1;
                i12 = i13;
            }
            int i15 = -1;
            int i16 = i5;
            for (int i17 = 0; i17 < i3; i17++) {
                int i18 = iArr5[i17];
                if (i18 != 0) {
                    i15 = i17;
                }
                i16 += i18;
                iArr6[i17] = i16;
            }
            int i19 = i11 - iArr5[i15];
            while (i5 <= i19) {
                int i20 = iArr[i5];
                int i21 = ((i20 >>> i10) & 255) ^ i9;
                if (i5 < i19) {
                    while (true) {
                        int i22 = iArr6[i21] - 1;
                        iArr6[i21] = i22;
                        if (i22 <= i5) {
                            break;
                        }
                        int i23 = iArr[i22];
                        iArr[i22] = i20;
                        i21 = ((i23 >>> i10) & 255) ^ i9;
                        i20 = i23;
                    }
                    iArr[i5] = i20;
                }
                if (i7 < 3 && (i2 = iArr5[i21]) > 1) {
                    if (i2 < 1024) {
                        m44659(i5, i2 + i5, iArr);
                    } else {
                        iArr2[i4] = i5;
                        iArr3[i4] = iArr5[i21];
                        iArr4[i4] = i7 + 1;
                        i4++;
                    }
                }
                i5 += iArr5[i21];
                iArr5[i21] = 0;
                i3 = 256;
            }
        }
    }
}
