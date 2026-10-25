package l;

import java.util.Arrays;

/* compiled from: 6CC8 */
/* renamed from: l.ۤۖᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10010 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long[] f30148 = new long[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long[] f30147 = new long[0];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25184(long[] jArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            long j = jArr[i];
            jArr[i] = jArr[i2];
            jArr[i2] = j;
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
    public static int m25179(long[] r6, int r7, int r8, int r9, l.InterfaceC1583 r10) {
        /*
            r0 = r6[r7]
            r2 = r6[r8]
            int r0 = r10.mo5427(r0, r2)
            r1 = r6[r7]
            r3 = r6[r9]
            int r1 = r10.mo5427(r1, r3)
            r2 = r6[r8]
            r4 = r6[r9]
            int r6 = r10.mo5427(r2, r4)
            if (r0 >= 0) goto L20
            if (r6 >= 0) goto L1d
            goto L22
        L1d:
            if (r1 >= 0) goto L26
            goto L25
        L20:
            if (r6 <= 0) goto L23
        L22:
            return r8
        L23:
            if (r1 <= 0) goto L26
        L25:
            return r9
        L26:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10010.m25179(long[], int, int, int, l.֫ۘᩴ):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25182(long[] jArr, int i, int i2, InterfaceC1583 interfaceC1583) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (interfaceC1583.mo5427(jArr[i8], jArr[i7]) < 0) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    long j = jArr[i];
                    jArr[i] = jArr[i7];
                    jArr[i7] = j;
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
            i3 = m25179(jArr, i, i + i11, i + i12, interfaceC1583);
            i9 = m25179(jArr, i9 - i11, i9, i9 + i11, interfaceC1583);
            i4 = m25179(jArr, i10 - i12, i10 - i11, i10, interfaceC1583);
        } else {
            i3 = i;
            i4 = i10;
        }
        long j2 = jArr[m25179(jArr, i3, i9, i4, interfaceC1583)];
        int i13 = i;
        int i14 = i13;
        int i15 = i10;
        while (true) {
            if (i13 <= i10) {
                int mo5427 = interfaceC1583.mo5427(jArr[i13], j2);
                if (mo5427 <= 0) {
                    if (mo5427 == 0) {
                        long j3 = jArr[i14];
                        jArr[i14] = jArr[i13];
                        jArr[i13] = j3;
                        i14++;
                    }
                    i13++;
                }
            }
            while (i10 >= i13) {
                int mo54272 = interfaceC1583.mo5427(jArr[i10], j2);
                if (mo54272 < 0) {
                    break;
                }
                if (mo54272 == 0) {
                    long j4 = jArr[i10];
                    jArr[i10] = jArr[i15];
                    jArr[i15] = j4;
                    i15--;
                }
                i10--;
            }
            if (i13 > i10) {
                break;
            }
            long j5 = jArr[i13];
            jArr[i13] = jArr[i10];
            jArr[i10] = j5;
            i13++;
            i10--;
        }
        int i16 = i13 - i14;
        int min = Math.min(i14 - i, i16);
        m25184(jArr, i, i13 - min, min);
        int i17 = i15 - i10;
        int min2 = Math.min(i17, (i2 - i15) - 1);
        m25184(jArr, i13, i2 - min2, min2);
        if (i16 > 1) {
            m25182(jArr, i, i16 + i, interfaceC1583);
        }
        if (i17 > 1) {
            m25182(jArr, i2 - i17, i2, interfaceC1583);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25183(long[] jArr, int i, int i2, InterfaceC1583 interfaceC1583, long[] jArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (jArr2 == null) {
                jArr2 = Arrays.copyOf(jArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m25183(jArr2, i, i4, interfaceC1583, jArr);
            m25183(jArr2, i4, i2, interfaceC1583, jArr);
            if (interfaceC1583.mo5427(jArr2[i4 - 1], jArr2[i4]) <= 0) {
                System.arraycopy(jArr2, i, jArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC1583.mo5427(jArr2[i5], jArr2[i6]) <= 0)) {
                    jArr[i] = jArr2[i5];
                    i5++;
                } else {
                    jArr[i] = jArr2[i6];
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
            long j = jArr[i8];
            long j2 = jArr[i7];
            int i9 = i8;
            while (true) {
                if (interfaceC1583.mo5427(j, j2) < 0) {
                    jArr[i9] = j2;
                    if (i == i9 - 1) {
                        i9--;
                        break;
                    }
                    long j3 = jArr[i9 - 2];
                    i9--;
                    j2 = j3;
                }
            }
            jArr[i9] = j;
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
    public static int m25178(long[] r6, int r7, int r8, int r9) {
        /*
            r0 = r6[r7]
            r2 = r6[r8]
            int r0 = java.lang.Long.compare(r0, r2)
            r1 = r6[r7]
            r3 = r6[r9]
            int r1 = java.lang.Long.compare(r1, r3)
            r2 = r6[r8]
            r4 = r6[r9]
            int r6 = java.lang.Long.compare(r2, r4)
            if (r0 >= 0) goto L20
            if (r6 >= 0) goto L1d
            goto L22
        L1d:
            if (r1 >= 0) goto L26
            goto L25
        L20:
            if (r6 <= 0) goto L23
        L22:
            return r8
        L23:
            if (r1 <= 0) goto L26
        L25:
            return r9
        L26:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10010.m25178(long[], int, int, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25180(int i, int i2, long[] jArr) {
        int i3;
        int i4;
        int i5 = i2 - i;
        if (i5 < 16) {
            while (i < i2 - 1) {
                int i6 = i + 1;
                int i7 = i;
                for (int i8 = i6; i8 < i2; i8++) {
                    if (jArr[i8] < jArr[i7]) {
                        i7 = i8;
                    }
                }
                if (i7 != i) {
                    long j = jArr[i];
                    jArr[i] = jArr[i7];
                    jArr[i7] = j;
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
            i3 = m25178(jArr, i, i + i11, i + i12);
            i9 = m25178(jArr, i9 - i11, i9, i9 + i11);
            i4 = m25178(jArr, i10 - i12, i10 - i11, i10);
        } else {
            i3 = i;
            i4 = i10;
        }
        long j2 = jArr[m25178(jArr, i3, i9, i4)];
        int i13 = i;
        int i14 = i13;
        int i15 = i10;
        while (true) {
            if (i13 <= i10) {
                int compare = Long.compare(jArr[i13], j2);
                if (compare <= 0) {
                    if (compare == 0) {
                        long j3 = jArr[i14];
                        jArr[i14] = jArr[i13];
                        jArr[i13] = j3;
                        i14++;
                    }
                    i13++;
                }
            }
            while (i10 >= i13) {
                int compare2 = Long.compare(jArr[i10], j2);
                if (compare2 < 0) {
                    break;
                }
                if (compare2 == 0) {
                    long j4 = jArr[i10];
                    jArr[i10] = jArr[i15];
                    jArr[i15] = j4;
                    i15--;
                }
                i10--;
            }
            if (i13 > i10) {
                break;
            }
            long j5 = jArr[i13];
            jArr[i13] = jArr[i10];
            jArr[i10] = j5;
            i13++;
            i10--;
        }
        int i16 = i13 - i14;
        int min = Math.min(i14 - i, i16);
        m25184(jArr, i, i13 - min, min);
        int i17 = i15 - i10;
        int min2 = Math.min(i17, (i2 - i15) - 1);
        m25184(jArr, i13, i2 - min2, min2);
        if (i16 > 1) {
            m25180(i, i16 + i, jArr);
        }
        if (i17 > 1) {
            m25180(i2 - i17, i2, jArr);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25181(int i, long[] jArr) {
        int i2;
        if (i < 4000) {
            m25180(0, i, jArr);
            return;
        }
        if (i < 1024) {
            m25180(0, i, jArr);
            return;
        }
        int[] iArr = new int[1786];
        int[] iArr2 = new int[1786];
        int[] iArr3 = new int[1786];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int i3 = 256;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i4 = 1;
        int i5 = 1;
        long[] jArr2 = jArr;
        while (i5 > 0) {
            int i6 = i5 - 1;
            int i7 = iArr[i6];
            int i8 = iArr2[i6];
            int i9 = iArr3[i6];
            int i10 = i9 % 8;
            int i11 = i10 == 0 ? 128 : 0;
            int i12 = (7 - i10) * 8;
            int i13 = i8 + i7;
            int i14 = i13;
            while (true) {
                int i15 = i14 - 1;
                if (i14 == i7) {
                    break;
                }
                long[] jArr3 = jArr2;
                int i16 = (int) (((jArr2[i15] >>> i12) & 255) ^ i11);
                iArr4[i16] = iArr4[i16] + i4;
                jArr2 = jArr3;
                i14 = i15;
                i6 = i6;
            }
            int i17 = i6;
            long[] jArr4 = jArr2;
            int i18 = -1;
            int i19 = i7;
            for (int i20 = 0; i20 < i3; i20++) {
                int i21 = iArr4[i20];
                if (i21 != 0) {
                    i18 = i20;
                }
                i19 += i21;
                iArr5[i20] = i19;
            }
            int i22 = i13 - iArr4[i18];
            jArr2 = jArr4;
            i5 = i17;
            while (i7 <= i22) {
                long j = jArr2[i7];
                int[] iArr6 = iArr;
                int[] iArr7 = iArr2;
                long j2 = i11;
                int i23 = i11;
                int i24 = (int) (((j >>> i12) & 255) ^ j2);
                if (i7 < i22) {
                    long j3 = j;
                    while (true) {
                        int i25 = iArr5[i24] - 1;
                        iArr5[i24] = i25;
                        if (i25 <= i7) {
                            break;
                        }
                        long j4 = jArr[i25];
                        jArr[i25] = j3;
                        i24 = (int) (((j4 >>> i12) & 255) ^ j2);
                        j3 = j4;
                    }
                    jArr[i7] = j3;
                }
                if (i9 < 7 && (i2 = iArr4[i24]) > 1) {
                    if (i2 < 1024) {
                        m25180(i7, i2 + i7, jArr);
                    } else {
                        iArr6[i5] = i7;
                        iArr7[i5] = iArr4[i24];
                        iArr3[i5] = i9 + 1;
                        i5++;
                    }
                }
                i7 += iArr4[i24];
                iArr4[i24] = 0;
                i3 = 256;
                i4 = 1;
                jArr2 = jArr;
                iArr = iArr6;
                iArr2 = iArr7;
                i11 = i23;
            }
        }
    }
}
