package l;

import java.util.Arrays;

/* compiled from: 21EM */
/* renamed from: l.۬֫ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12810 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f38455 = new char[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f38454 = new char[0];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31128(int i, int i2, char[] cArr, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            char c = cArr[i];
            cArr[i] = cArr[i2];
            cArr[i2] = c;
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
    public static int m31123(char[] r3, int r4, int r5, int r6, l.InterfaceC1790 r7) {
        /*
            char r0 = r3[r4]
            char r1 = r3[r5]
            int r0 = r7.mo5958(r0, r1)
            char r1 = r3[r4]
            char r2 = r3[r6]
            int r1 = r7.mo5958(r1, r2)
            char r2 = r3[r5]
            char r3 = r3[r6]
            int r3 = r7.mo5958(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: l.C12810.m31123(char[], int, int, int, l.֫ۧᩴ):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31126(char[] cArr, int i, int i2, InterfaceC1790 interfaceC1790) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (interfaceC1790.mo5958(cArr[i8], cArr[i7]) < 0) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    char c = cArr[i];
                    cArr[i] = cArr[i7];
                    cArr[i7] = c;
                }
                i = i6;
            }
            return;
        }
        int i9 = (i5 / 2) + i;
        int i10 = i2 - 1;
        if (i5 > 128) {
            int i11 = i5 / 8;
            int i12 = i11 * 2;
            i3 = m31123(cArr, i, i + i11, i + i12, interfaceC1790);
            i9 = m31123(cArr, i9 - i11, i9, i9 + i11, interfaceC1790);
            i4 = m31123(cArr, i10 - i12, i10 - i11, i10, interfaceC1790);
        } else {
            i3 = i;
            i4 = i10;
        }
        char c2 = cArr[m31123(cArr, i3, i9, i4, interfaceC1790)];
        int i13 = i;
        int i14 = i13;
        int i15 = i10;
        while (true) {
            if (i13 <= i10) {
                int mo5958 = interfaceC1790.mo5958(cArr[i13], c2);
                if (mo5958 <= 0) {
                    if (mo5958 == 0) {
                        char c3 = cArr[i14];
                        cArr[i14] = cArr[i13];
                        cArr[i13] = c3;
                        i14++;
                    }
                    i13++;
                }
            }
            while (i10 >= i13) {
                int mo59582 = interfaceC1790.mo5958(cArr[i10], c2);
                if (mo59582 < 0) {
                    break;
                }
                if (mo59582 == 0) {
                    char c4 = cArr[i10];
                    cArr[i10] = cArr[i15];
                    cArr[i15] = c4;
                    i15--;
                }
                i10--;
            }
            if (i13 > i10) {
                break;
            }
            char c5 = cArr[i13];
            cArr[i13] = cArr[i10];
            cArr[i10] = c5;
            i13++;
            i10--;
        }
        int i16 = i14 - i;
        int i17 = i13 - i14;
        int min = Math.min(i16, i17);
        m31128(i, i13 - min, cArr, min);
        int i18 = i15 - i10;
        int min2 = Math.min(i18, (i2 - i15) - 1);
        m31128(i13, i2 - min2, cArr, min2);
        if (i17 > 1) {
            m31126(cArr, i, i17 + i, interfaceC1790);
        }
        if (i18 > 1) {
            m31126(cArr, i2 - i18, i2, interfaceC1790);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31127(char[] cArr, int i, int i2, InterfaceC1790 interfaceC1790, char[] cArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (cArr2 == null) {
                cArr2 = Arrays.copyOf(cArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m31127(cArr2, i, i4, interfaceC1790, cArr);
            m31127(cArr2, i4, i2, interfaceC1790, cArr);
            if (interfaceC1790.mo5958(cArr2[i4 - 1], cArr2[i4]) <= 0) {
                System.arraycopy(cArr2, i, cArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC1790.mo5958(cArr2[i5], cArr2[i6]) <= 0)) {
                    cArr[i] = cArr2[i5];
                    i5++;
                } else {
                    cArr[i] = cArr2[i6];
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
            char c = cArr[i8];
            char c2 = cArr[i7];
            int i9 = i8;
            while (true) {
                if (interfaceC1790.mo5958(c, c2) < 0) {
                    cArr[i9] = c2;
                    if (i == i9 - 1) {
                        i9--;
                        break;
                    }
                    int i10 = i9 - 1;
                    char c3 = cArr[i9 - 2];
                    i9 = i10;
                    c2 = c3;
                }
            }
            cArr[i9] = c;
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
    public static int m31122(int r3, int r4, char[] r5, int r6) {
        /*
            char r0 = r5[r3]
            char r1 = r5[r4]
            int r0 = java.lang.Character.compare(r0, r1)
            char r1 = r5[r3]
            char r2 = r5[r6]
            int r1 = java.lang.Character.compare(r1, r2)
            char r2 = r5[r4]
            char r5 = r5[r6]
            int r5 = java.lang.Character.compare(r2, r5)
            if (r0 >= 0) goto L20
            if (r5 >= 0) goto L1d
            goto L22
        L1d:
            if (r1 >= 0) goto L26
            goto L25
        L20:
            if (r5 <= 0) goto L23
        L22:
            return r4
        L23:
            if (r1 <= 0) goto L26
        L25:
            return r6
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12810.m31122(int, int, char[], int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31125(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (cArr[i8] < cArr[i7]) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    char c = cArr[i];
                    cArr[i] = cArr[i7];
                    cArr[i7] = c;
                }
                i = i6;
            }
            return;
        }
        int i9 = (i5 / 2) + i;
        int i10 = i2 - 1;
        if (i5 > 128) {
            int i11 = i5 / 8;
            int i12 = i11 * 2;
            i3 = m31122(i, i + i11, cArr, i + i12);
            i9 = m31122(i9 - i11, i9, cArr, i9 + i11);
            i4 = m31122(i10 - i12, i10 - i11, cArr, i10);
        } else {
            i3 = i;
            i4 = i10;
        }
        char c2 = cArr[m31122(i3, i9, cArr, i4)];
        int i13 = i;
        int i14 = i13;
        int i15 = i10;
        while (true) {
            if (i13 <= i10) {
                int compare = Character.compare(cArr[i13], c2);
                if (compare <= 0) {
                    if (compare == 0) {
                        char c3 = cArr[i14];
                        cArr[i14] = cArr[i13];
                        cArr[i13] = c3;
                        i14++;
                    }
                    i13++;
                }
            }
            while (i10 >= i13) {
                int compare2 = Character.compare(cArr[i10], c2);
                if (compare2 < 0) {
                    break;
                }
                if (compare2 == 0) {
                    char c4 = cArr[i10];
                    cArr[i10] = cArr[i15];
                    cArr[i15] = c4;
                    i15--;
                }
                i10--;
            }
            if (i13 > i10) {
                break;
            }
            char c5 = cArr[i13];
            cArr[i13] = cArr[i10];
            cArr[i10] = c5;
            i13++;
            i10--;
        }
        int i16 = i14 - i;
        int i17 = i13 - i14;
        int min = Math.min(i16, i17);
        m31128(i, i13 - min, cArr, min);
        int i18 = i15 - i10;
        int min2 = Math.min(i18, (i2 - i15) - 1);
        m31128(i13, i2 - min2, cArr, min2);
        if (i17 > 1) {
            m31125(cArr, i, i17 + i);
        }
        if (i18 > 1) {
            m31125(cArr, i2 - i18, i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31124(char[] cArr, int i) {
        int i2;
        int i3 = 0;
        if (i < 2000) {
            m31125(cArr, 0, i);
            return;
        }
        if (i < 1024) {
            m31125(cArr, 0, i);
            return;
        }
        int i4 = 256;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            int i6 = iArr[i5];
            int i7 = iArr2[i5];
            int i8 = iArr3[i5];
            int i9 = (1 - (i8 % 2)) * 8;
            int i10 = i7 + i6;
            int i11 = i10;
            while (true) {
                int i12 = i11 - 1;
                if (i11 == i6) {
                    break;
                }
                int i13 = (cArr[i12] >>> i9) & 255;
                iArr4[i13] = iArr4[i13] + 1;
                i11 = i12;
            }
            int i14 = -1;
            int i15 = i6;
            while (i3 < i4) {
                int i16 = iArr4[i3];
                if (i16 != 0) {
                    i14 = i3;
                }
                i15 += i16;
                iArr5[i3] = i15;
                i3++;
            }
            int i17 = i10 - iArr4[i14];
            while (i6 <= i17) {
                char c = cArr[i6];
                int i18 = (c >>> i9) & 255;
                if (i6 < i17) {
                    while (true) {
                        int i19 = iArr5[i18] - 1;
                        iArr5[i18] = i19;
                        if (i19 <= i6) {
                            break;
                        }
                        char c2 = cArr[i19];
                        cArr[i19] = c;
                        i18 = (c2 >>> i9) & 255;
                        c = c2;
                    }
                    cArr[i6] = c;
                }
                if (i8 < 1 && (i2 = iArr4[i18]) > 1) {
                    if (i2 < 1024) {
                        m31125(cArr, i6, i2 + i6);
                    } else {
                        iArr[i5] = i6;
                        iArr2[i5] = iArr4[i18];
                        iArr3[i5] = i8 + 1;
                        i5++;
                    }
                }
                i6 += iArr4[i18];
                iArr4[i18] = 0;
                i4 = 256;
            }
            i3 = 0;
        }
    }
}
