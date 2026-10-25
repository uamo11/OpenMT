package l;

/* compiled from: M7S7 */
/* renamed from: l.ܳ۠֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14390 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f43353 = {-1, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f43354;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f43355;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43356;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m34361(int i, int i2) {
        return i | (i2 << 8);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int m34370(int i, int i2) {
        return (i << 8) | i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m34366(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        iArr[i] = iArr2[i2];
        iArr2[i2] = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r8 >= r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return (r0[r1] & 255) - (r0[r8] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return 1;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m34371(int r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5.f43354
            r1 = r0[r6]
            int r1 = r1 + r8
            r2 = r0[r7]
            int r8 = r8 + r2
            r2 = 1
            int r6 = r6 + r2
            r6 = r0[r6]
            int r6 = r6 + 2
            int r7 = r7 + r2
            r7 = r0[r7]
            int r7 = r7 + 2
        L13:
            byte[] r0 = r5.f43355
            if (r1 >= r6) goto L24
            if (r8 >= r7) goto L24
            r3 = r0[r1]
            r4 = r0[r8]
            if (r3 != r4) goto L24
            int r1 = r1 + 1
            int r8 = r8 + 1
            goto L13
        L24:
            if (r1 >= r6) goto L33
            if (r8 >= r7) goto L32
            r6 = r0[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r0[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 - r7
            return r6
        L32:
            return r2
        L33:
            if (r8 >= r7) goto L37
            r6 = -1
            return r6
        L37:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34371(int, int, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34364(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f43354;
        int i6 = iArr[i3 + i4];
        int i7 = iArr[i2 + i6] + i;
        byte[] bArr = this.f43355;
        int i8 = bArr[i7] & 255;
        while (true) {
            int i9 = i4 * 2;
            int i10 = i9 + 1;
            if (i10 >= i5) {
                break;
            }
            int i11 = i9 + 2;
            int i12 = bArr[iArr[iArr[i3 + i10] + i2] + i] & 255;
            int i13 = bArr[iArr[iArr[i3 + i11] + i2] + i] & 255;
            if (i12 < i13) {
                i12 = i13;
            } else {
                i11 = i10;
            }
            if (i12 <= i8) {
                break;
            }
            iArr[i4 + i3] = iArr[i3 + i11];
            i4 = i11;
        }
        iArr[i3 + i4] = i6;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34373(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f43354;
        int i6 = iArr[iArr[i3] + i2] + i;
        byte[] bArr = this.f43355;
        int i7 = bArr[i6] & 255;
        int i8 = bArr[iArr[iArr[i4] + i2] + i] & 255;
        int i9 = bArr[i + iArr[i2 + iArr[i5]]] & 255;
        if (i7 <= i8) {
            i4 = i3;
            i3 = i4;
            i8 = i7;
            i7 = i8;
        }
        return i7 > i9 ? i8 > i9 ? i4 : i5 : i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34360(int i) {
        int i2 = 65280 & i;
        int[] iArr = f43353;
        return i2 != 0 ? iArr[(i >> 8) & 255] + 8 : iArr[i & 255];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m34362(int i, int i2, int i3, int i4) {
        int[] iArr;
        int i5;
        int i6 = i2 - 1;
        while (true) {
            i6++;
            iArr = this.f43354;
            if (i6 < i3) {
                int i7 = iArr[i6];
                if (iArr[i + i7] + i4 >= iArr[i + i7 + 1] + 1) {
                    iArr[i6] = ~i7;
                }
            }
            do {
                i3--;
                if (i6 >= i3) {
                    break;
                }
                i5 = iArr[i3];
            } while (iArr[i + i5] + i4 < iArr[i5 + i + 1] + 1);
            if (i3 <= i6) {
                break;
            }
            int i8 = ~iArr[i3];
            iArr[i3] = iArr[i6];
            iArr[i6] = i8;
        }
        if (i2 < i6) {
            iArr[i2] = ~iArr[i2];
        }
        return i6;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34376(int i, int i2, int i3) {
        int m34371;
        byte[] bArr;
        int[] iArr;
        int i4;
        int m34373;
        int i5;
        int i6;
        int m34360;
        int i7;
        int i8;
        int i9;
        int i10;
        C17213[] c17213Arr = new C17213[64];
        int i11 = i2;
        int i12 = i3;
        int m343602 = m34360(i3 - i2);
        C14390 c14390 = this;
        int i13 = 2;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i12 - i11;
            int[] iArr2 = c14390.f43354;
            if (i16 <= 8) {
                if (1 < i16) {
                    for (int i17 = i12 - 2; i11 <= i17; i17--) {
                        int i18 = iArr2[i17];
                        int i19 = i17 + 1;
                        do {
                            m34371 = c14390.m34371(i + i18, iArr2[i19] + i, i13);
                            if (m34371 <= 0) {
                                break;
                            }
                            do {
                                iArr2[i19 - 1] = iArr2[i19];
                                i19++;
                                if (i19 >= i12) {
                                    break;
                                }
                            } while (iArr2[i19] < 0);
                        } while (i12 > i19);
                        if (m34371 == 0) {
                            iArr2[i19] = ~iArr2[i19];
                        }
                        iArr2[i19 - 1] = i18;
                    }
                }
                if (i14 == 0) {
                    return;
                }
                i14--;
                C17213 c17213 = c17213Arr[i14];
                i11 = c17213.f52809;
                i12 = c17213.f52810;
                i13 = c17213.f52811;
                m343602 = c17213.f52812;
            } else {
                int i20 = m343602 - 1;
                byte[] bArr2 = c14390.f43355;
                if (m343602 == 0) {
                    int i21 = i16 % 2;
                    if (i21 == 0) {
                        int i22 = i16 - 1;
                        int i23 = (i22 / 2) + i11;
                        int i24 = iArr2[i23];
                        i9 = i20;
                        int i25 = bArr2[i13 + iArr2[i + i24]] & 255;
                        int i26 = i11 + i22;
                        int i27 = iArr2[i26];
                        if (i25 < (bArr2[i13 + iArr2[i + i27]] & 255)) {
                            iArr2[i26] = i24;
                            iArr2[i23] = i27;
                        }
                        i10 = i22;
                    } else {
                        i9 = i20;
                        i10 = i16;
                    }
                    int i28 = (i10 / 2) - 1;
                    while (i28 >= 0) {
                        m34364(i13, i, i11, i28, i10);
                        i28--;
                        bArr2 = bArr2;
                        iArr2 = iArr2;
                        m343602 = m343602;
                    }
                    bArr = bArr2;
                    iArr = iArr2;
                    i4 = m343602;
                    m343602 = i9;
                    if (i21 == 0) {
                        int i29 = i11 + i10;
                        int i30 = iArr[i11];
                        iArr[i11] = iArr[i29];
                        iArr[i29] = i30;
                        m34364(i13, i, i11, 0, i10);
                    }
                    while (true) {
                        i10--;
                        if (i10 <= 0) {
                            break;
                        }
                        int i31 = iArr[i11];
                        int i32 = i11 + i10;
                        iArr[i11] = iArr[i32];
                        m34364(i13, i, i11, 0, i10);
                        iArr[i32] = i31;
                    }
                    c14390 = this;
                } else {
                    bArr = bArr2;
                    iArr = iArr2;
                    i4 = m343602;
                    m343602 = i20;
                }
                if (m343602 < 0) {
                    int i33 = bArr[iArr[iArr[i11] + i] + i13] & 255;
                    int i34 = i11;
                    i11++;
                    int i35 = i34;
                    while (i11 < i12) {
                        i15 = bArr[iArr[iArr[i11] + i] + i13] & 255;
                        if (i15 != i33) {
                            if (1 < i11 - i35) {
                                break;
                            }
                            i35 = i11;
                            i33 = i15;
                        }
                        i11++;
                    }
                    if ((bArr[(iArr[iArr[i35] + i] + i13) - 1] & 255) < i33) {
                        i35 = c14390.m34362(i, i35, i11, i13);
                    }
                    int i36 = i11 - i35;
                    int i37 = i12 - i11;
                    if (i36 <= i37) {
                        if (1 < i36) {
                            c17213Arr[i14] = new C17213(i11, i12, i13, -1);
                            i13++;
                            m343602 = m34360(i36);
                            i14++;
                            i12 = i11;
                            i11 = i35;
                        } else {
                            m343602 = -1;
                        }
                    } else if (1 < i37) {
                        c17213Arr[i14] = new C17213(i35, i11, i13 + 1, m34360(i36));
                        i14++;
                        m343602 = -1;
                    } else {
                        i13++;
                        m343602 = m34360(i36);
                        i12 = i11;
                        i11 = i35;
                    }
                } else {
                    int i38 = (i16 / 2) + i11;
                    if (i16 > 512) {
                        int i39 = i16 >> 3;
                        int i40 = i39 << 1;
                        int i41 = i13;
                        int i42 = i12 - 1;
                        m34373 = m34373(i41, i, m34373(i41, i, i11, i11 + i39, i11 + i40), m34373(i41, i, i38 - i39, i38, i38 + i39), m34373(i41, i, i42 - i40, i42 - i39, i42));
                    } else if (i16 <= 32) {
                        m34373 = c14390.m34373(i13, i, i11, i38, i12 - 1);
                    } else {
                        int i43 = i16 >> 2;
                        int i44 = i11 + i43;
                        int i45 = i12 - 1;
                        int i46 = i45 - i43;
                        int i47 = bArr[iArr[iArr[i11] + i] + i13] & 255;
                        int i48 = bArr[iArr[iArr[i44] + i] + i13] & 255;
                        int i49 = bArr[iArr[iArr[i38] + i] + i13] & 255;
                        int i50 = bArr[iArr[iArr[i46] + i] + i13] & 255;
                        int i51 = bArr[i13 + iArr[i + iArr[i45]]] & 255;
                        if (i48 > i49) {
                            i38 = i44;
                            i44 = i38;
                            i49 = i48;
                            i48 = i49;
                        }
                        if (i50 > i51) {
                            i7 = i50;
                            i50 = i51;
                            m34373 = i46;
                        } else {
                            i7 = i51;
                            m34373 = i45;
                            i45 = i46;
                        }
                        if (i48 > i50) {
                            int i52 = i38;
                            i38 = m34373;
                            m34373 = i52;
                            int i53 = i7;
                            i7 = i49;
                            i49 = i53;
                        } else {
                            i44 = i45;
                            i48 = i50;
                        }
                        if (i47 > i49) {
                            i8 = i38;
                            i38 = i11;
                            int i54 = i49;
                            i49 = i47;
                            i47 = i54;
                        } else {
                            i8 = i11;
                        }
                        if (i47 > i48) {
                            i44 = i8;
                            i48 = i47;
                            i49 = i7;
                        } else {
                            m34373 = i38;
                        }
                        if (i49 > i48) {
                            m34373 = i44;
                        }
                    }
                    int i55 = iArr[m34373];
                    int i56 = bArr[iArr[i + i55] + i13] & 255;
                    int i57 = iArr[i11];
                    iArr[i11] = i55;
                    iArr[m34373] = i57;
                    int i58 = i11;
                    do {
                        i58++;
                        if (i58 >= i12) {
                            break;
                        } else {
                            i15 = bArr[iArr[iArr[i58] + i] + i13] & 255;
                        }
                    } while (i15 == i56);
                    if (i58 < i12 && i15 < i56) {
                        i5 = i58;
                        while (true) {
                            i58++;
                            if (i58 >= i12) {
                                break;
                            }
                            int i59 = iArr[i58];
                            i15 = bArr[iArr[i + i59] + i13] & 255;
                            if (i15 > i56) {
                                break;
                            }
                            if (i15 == i56) {
                                iArr[i58] = iArr[i5];
                                iArr[i5] = i59;
                                i5++;
                            }
                        }
                    } else {
                        i5 = i58;
                    }
                    int i60 = i12;
                    do {
                        i60--;
                        if (i58 >= i60) {
                            break;
                        } else {
                            i15 = bArr[iArr[iArr[i60] + i] + i13] & 255;
                        }
                    } while (i15 == i56);
                    if (i58 < i60 && i15 > i56) {
                        i6 = i60;
                        while (true) {
                            i60--;
                            if (i58 >= i60) {
                                break;
                            }
                            int i61 = iArr[i60];
                            i15 = bArr[iArr[i + i61] + i13] & 255;
                            if (i15 < i56) {
                                break;
                            }
                            if (i15 == i56) {
                                iArr[i60] = iArr[i6];
                                iArr[i6] = i61;
                                i6--;
                            }
                        }
                    } else {
                        i6 = i60;
                    }
                    while (i58 < i60) {
                        int i62 = iArr[i58];
                        iArr[i58] = iArr[i60];
                        iArr[i60] = i62;
                        while (true) {
                            i58++;
                            if (i58 >= i60) {
                                break;
                            }
                            int i63 = iArr[i58];
                            i15 = bArr[iArr[i + i63] + i13] & 255;
                            if (i15 > i56) {
                                break;
                            }
                            if (i15 == i56) {
                                iArr[i58] = iArr[i5];
                                iArr[i5] = i63;
                                i5++;
                            }
                        }
                        while (true) {
                            i60--;
                            if (i58 < i60) {
                                int i64 = iArr[i60];
                                i15 = bArr[iArr[i + i64] + i13] & 255;
                                if (i15 >= i56) {
                                    if (i15 == i56) {
                                        iArr[i60] = iArr[i6];
                                        iArr[i6] = i64;
                                        i6--;
                                    }
                                }
                            }
                        }
                    }
                    if (i5 <= i6) {
                        int i65 = i58 - 1;
                        int i66 = i5 - i11;
                        int i67 = i58 - i5;
                        if (i66 > i67) {
                            i66 = i67;
                        }
                        int i68 = i58 - i66;
                        int i69 = i11;
                        while (i66 > 0) {
                            int i70 = iArr[i69];
                            iArr[i69] = iArr[i68];
                            iArr[i68] = i70;
                            i66--;
                            i69++;
                            i68++;
                        }
                        int i71 = i6 - i65;
                        int i72 = (i12 - i6) - 1;
                        if (i71 <= i72) {
                            i72 = i71;
                        }
                        int i73 = i12 - i72;
                        while (i72 > 0) {
                            int i74 = iArr[i58];
                            iArr[i58] = iArr[i73];
                            iArr[i73] = i74;
                            i72--;
                            i58++;
                            i73++;
                        }
                        int i75 = i67 + i11;
                        int i76 = i12 - i71;
                        int m34362 = i56 <= (bArr[(iArr[iArr[i75] + i] + i13) + (-1)] & 255) ? i75 : m34362(i, i75, i76, i13);
                        int i77 = i75 - i11;
                        int i78 = i12 - i76;
                        if (i77 <= i78) {
                            int i79 = i76 - m34362;
                            if (i78 <= i79) {
                                int i80 = i14 + 1;
                                c17213Arr[i14] = new C17213(m34362, i76, i13 + 1, m34360(i79));
                                i14 += 2;
                                c17213Arr[i80] = new C17213(i76, i12, i13, m343602);
                            } else if (i77 <= i79) {
                                int i81 = i14 + 1;
                                c17213Arr[i14] = new C17213(i76, i12, i13, m343602);
                                i14 += 2;
                                c17213Arr[i81] = new C17213(m34362, i76, i13 + 1, m34360(i79));
                            } else {
                                int i82 = i14 + 1;
                                c17213Arr[i14] = new C17213(i76, i12, i13, m343602);
                                i14 += 2;
                                c17213Arr[i82] = new C17213(i11, i75, i13, m343602);
                                i13++;
                                m34360 = m34360(i79);
                                i12 = i76;
                                m343602 = m34360;
                                i11 = m34362;
                            }
                            i12 = i75;
                        } else {
                            int i83 = i76 - m34362;
                            if (i77 <= i83) {
                                int i84 = i14 + 1;
                                c17213Arr[i14] = new C17213(m34362, i76, i13 + 1, m34360(i83));
                                i14 += 2;
                                c17213Arr[i84] = new C17213(i11, i75, i13, m343602);
                            } else if (i78 <= i83) {
                                int i85 = i14 + 1;
                                c17213Arr[i14] = new C17213(i11, i75, i13, m343602);
                                i14 += 2;
                                c17213Arr[i85] = new C17213(m34362, i76, i13 + 1, m34360(i83));
                            } else {
                                int i86 = i14 + 1;
                                c17213Arr[i14] = new C17213(i11, i75, i13, m343602);
                                i14 += 2;
                                c17213Arr[i86] = new C17213(i76, i12, i13, m343602);
                                i13++;
                                m34360 = m34360(i83);
                                i12 = i76;
                                m343602 = m34360;
                                i11 = m34362;
                            }
                            i11 = i76;
                        }
                    } else {
                        if ((bArr[(iArr[iArr[i11] + i] + i13) - 1] & 255) < i56) {
                            i11 = m34362(i, i11, i12, i13);
                            m343602 = m34360(i12 - i11);
                        } else {
                            m343602 = i4;
                        }
                        i13++;
                    }
                    c14390 = this;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34367(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        while (i3 > 0) {
            m34366(i, i2, iArr, iArr2);
            i3--;
            i++;
            i2++;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34375(int i, int i2) {
        int[] iArr = this.f43354;
        int i3 = iArr[i2];
        if (i3 >= 0) {
            int i4 = iArr[i2 - 1];
            if (i4 < 0) {
                i4 = ~i4;
            }
            if (m34371(i4 + i, i + i3, 2) == 0) {
                iArr[i2] = ~iArr[i2];
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0092, code lost:
    
        if (r19 >= 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00ea, code lost:
    
        if ((r15 & 1) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00ec, code lost:
    
        r11 = r18 - 1;
        r14[r18] = r22[r16];
        r12 = r16 - 1;
        r22[r16] = r14[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00fa, code lost:
    
        if (r22[r12] < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0101, code lost:
    
        r18 = r11;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00fc, code lost:
    
        r15 = r15 ^ 1;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0108, code lost:
    
        r11 = r18 - 1;
        r14[r18] = ~r22[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x010f, code lost:
    
        if (r12 > r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0115, code lost:
    
        r13 = r12 - 1;
        r22[r12] = r14[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x011d, code lost:
    
        if ((r15 & 2) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x011f, code lost:
    
        r12 = r11 - 1;
        r14[r11] = r14[r7];
        r11 = r7 - 1;
        r14[r7] = r14[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x012d, code lost:
    
        if (r14[r11] < 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0134, code lost:
    
        r7 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x012f, code lost:
    
        r15 = r15 ^ 2;
        r7 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0137, code lost:
    
        r12 = r11 - 1;
        r14[r11] = r14[r7];
        r11 = r7 - 1;
        r14[r7] = r14[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0143, code lost:
    
        if (r11 >= r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x015d, code lost:
    
        r7 = r22[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x015f, code lost:
    
        if (r7 >= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0161, code lost:
    
        r15 = r15 | 1;
        r7 = ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0164, code lost:
    
        r7 = r7 + r23;
        r7 = r14[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0169, code lost:
    
        if (r7 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x016b, code lost:
    
        r15 = r15 | 2;
        r7 = ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x016e, code lost:
    
        r18 = r12;
        r16 = r13;
        r12 = r7 + r23;
        r7 = r11;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0145, code lost:
    
        if (r3 >= r13) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0147, code lost:
    
        r7 = r12 - 1;
        r14[r12] = r22[r13];
        r22[r13] = r14[r7];
        r12 = r7;
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0156, code lost:
    
        r14[r12] = r22[r13];
        r22[r13] = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0111, code lost:
    
        r22[r12] = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0106, code lost:
    
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0096, code lost:
    
        if ((r15 & 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0098, code lost:
    
        r12 = r18 - 1;
        r14[r18] = r14[r7];
        r13 = r7 - 1;
        r14[r7] = r14[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00a6, code lost:
    
        if (r14[r13] < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00ae, code lost:
    
        r18 = r12;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00a8, code lost:
    
        r15 = r15 ^ 2;
        r18 = r12;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00b2, code lost:
    
        r12 = r18 - 1;
        r14[r18] = r14[r7];
        r13 = r7 - 1;
        r14[r7] = r14[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00be, code lost:
    
        if (r13 >= r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00da, code lost:
    
        r7 = r14[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00dc, code lost:
    
        if (r7 >= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00de, code lost:
    
        r15 = r15 | 2;
        r7 = ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00e1, code lost:
    
        r18 = r12;
        r12 = r7 + r23;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00c0, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00c2, code lost:
    
        if (r3 >= r7) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00c4, code lost:
    
        r11 = r12 - 1;
        r14[r12] = r22[r7];
        r16 = r7 - 1;
        r22[r7] = r14[r11];
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00d2, code lost:
    
        r14[r12] = r22[r7];
        r22[r7] = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d9, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0260, code lost:
    
        r15 = r3;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m34368(int[] r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34368(int[], int, int, int, int, int, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34372(int i, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int[] iArr = this.f43354;
        return i5 < i3 ? iArr[i5] : iArr[(((i2 - i) + i4) % (i3 - i)) + i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34365(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f43354;
        int i7 = iArr[i4 + i5];
        int m34372 = m34372(i, i2, i3, i7);
        while (true) {
            int i8 = i5 * 2;
            int i9 = i8 + 1;
            if (i9 >= i6) {
                break;
            }
            int i10 = i8 + 2;
            int m343722 = m34372(i, i2, i3, iArr[i4 + i9]);
            int m343723 = m34372(i, i2, i3, iArr[i4 + i10]);
            if (m343722 < m343723) {
                m343722 = m343723;
            } else {
                i10 = i9;
            }
            if (m343722 <= m34372) {
                break;
            }
            iArr[i5 + i4] = iArr[i4 + i10];
            i5 = i10;
        }
        iArr[i4 + i5] = i7;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34377(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i5 % 2;
        int[] iArr = this.f43354;
        if (i7 == 0) {
            int i8 = i5 - 1;
            int i9 = (i8 / 2) + i4;
            int i10 = i4 + i8;
            if (m34372(i, i2, i3, iArr[i9]) < m34372(i, i2, i3, iArr[i10])) {
                int i11 = iArr[i10];
                iArr[i10] = iArr[i9];
                iArr[i9] = i11;
            }
            i6 = i8;
        } else {
            i6 = i5;
        }
        for (int i12 = (i6 / 2) - 1; i12 >= 0; i12--) {
            m34365(i, i2, i3, i4, i12, i6);
        }
        if (i7 == 0) {
            m34366(i4, i4 + i6, iArr, iArr);
            m34365(i, i2, i3, i4, 0, i6);
        }
        while (true) {
            i6--;
            if (i6 <= 0) {
                return;
            }
            int i13 = iArr[i4];
            int i14 = i4 + i6;
            iArr[i4] = iArr[i14];
            m34365(i, i2, i3, i4, 0, i6);
            iArr[i14] = i13;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m34380(int i, int i2, int i3, int i4, int i5) {
        int m34372;
        for (int i6 = i4 + 1; i6 < i5; i6++) {
            int[] iArr = this.f43354;
            int i7 = iArr[i6];
            int i8 = i6 - 1;
            do {
                m34372 = m34372(i, i2, i3, i7) - m34372(i, i2, i3, iArr[i8]);
                if (m34372 >= 0) {
                    break;
                }
                do {
                    iArr[i8 + 1] = iArr[i8];
                    i8--;
                    if (i4 > i8) {
                        break;
                    }
                } while (iArr[i8] < 0);
            } while (i8 >= i4);
            if (m34372 == 0) {
                iArr[i8] = ~iArr[i8];
            }
            iArr[i8 + 1] = i7;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m34369(int i) {
        int i2 = (-65536) & i;
        int[] iArr = f43353;
        return i2 != 0 ? ((-16777216) & i) != 0 ? iArr[(i >> 24) & 255] + 24 : iArr[(i >> 16) & 255] + 16 : (65280 & i) != 0 ? iArr[(i >> 8) & 255] + 8 : iArr[i & 255];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34374(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f43354;
        int m34372 = m34372(i, i2, i3, iArr[i4]);
        int m343722 = m34372(i, i2, i3, iArr[i5]);
        int m343723 = m34372(i, i2, i3, iArr[i6]);
        if (m34372 <= m343722) {
            i5 = i4;
            i4 = i5;
            m343722 = m34372;
            m34372 = m343722;
        }
        return m34372 > m343723 ? m343722 > m343723 ? i5 : i6 : i4;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m34378(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i5 - i4;
        int i8 = (i7 / 2) + i4;
        if (i7 > 512) {
            int i9 = i7 >> 3;
            int i10 = i9 << 1;
            int i11 = i5 - 1;
            return m34374(i, i2, i3, m34374(i, i2, i3, i4, i4 + i9, i4 + i10), m34374(i, i2, i3, i8 - i9, i8, i8 + i9), m34374(i, i2, i3, i11 - i10, i11 - i9, i11));
        }
        if (i7 > 32) {
            int i12 = i7 >> 2;
            int i13 = i4 + i12;
            int i14 = i5 - 1;
            int i15 = i14 - i12;
            int[] iArr = this.f43354;
            int m34372 = m34372(i, i2, i3, iArr[i4]);
            int m343722 = m34372(i, i2, i3, iArr[i13]);
            int m343723 = m34372(i, i2, i3, iArr[i8]);
            int m343724 = m34372(i, i2, i3, iArr[i15]);
            int m343725 = m34372(i, i2, i3, iArr[i14]);
            if (m343722 > m343723) {
                i8 = i13;
                i13 = i8;
                m343723 = m343722;
                m343722 = m343723;
            }
            if (m343724 > m343725) {
                m343724 = m343725;
                m343725 = m343724;
            } else {
                i14 = i15;
                i15 = i14;
            }
            if (m343722 > m343724) {
                int i16 = i8;
                i8 = i15;
                i15 = i16;
                int i17 = m343723;
                m343723 = m343725;
                m343725 = i17;
            } else {
                i13 = i14;
                m343722 = m343724;
            }
            if (m34372 > m343723) {
                i6 = i8;
                i8 = i4;
                int i18 = m343723;
                m343723 = m34372;
                m34372 = i18;
            } else {
                i6 = i4;
            }
            if (m34372 > m343722) {
                i13 = i6;
                m343722 = m34372;
            } else {
                m343725 = m343723;
                i15 = i8;
            }
            return m343725 > m343722 ? i13 : i15;
        }
        return m34374(i, i2, i3, i4, i8, i5 - 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34363(int i, int i2, int i3) {
        int i4;
        while (i2 < i3) {
            int[] iArr = this.f43354;
            if (iArr[i2] >= 0) {
                int i5 = i2;
                do {
                    iArr[iArr[i5] + i] = i5;
                    i5++;
                    if (i5 >= i3) {
                        break;
                    }
                } while (iArr[i5] >= 0);
                iArr[i2] = i2 - i5;
                if (i3 <= i5) {
                    return;
                } else {
                    i2 = i5;
                }
            }
            int i6 = i2;
            while (true) {
                iArr[i6] = ~iArr[i6];
                i4 = i6 + 1;
                if (iArr[i4] >= 0) {
                    break;
                } else {
                    i6 = i4;
                }
            }
            do {
                iArr[iArr[i2] + i] = i4;
                i2++;
            } while (i2 <= i4);
            i2 = i6 + 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x07ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x034f, code lost:
    
        r3 = r1;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0352, code lost:
    
        r0 = r3;
        r12 = r4;
        r3 = r9;
        r7 = r13;
        r8 = r14;
        r5 = r16;
        r13 = r18;
        r6 = r21;
        r11 = r22;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0259, code lost:
    
        r9 = r34;
        r14 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x03bb A[EDGE_INSN: B:433:0x03bb->B:434:0x03bb BREAK  A[LOOP:1: B:15:0x0063->B:131:0x0063], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x059a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:424:0x0533 -> B:405:0x057f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:425:0x0559 -> B:405:0x057f). Please report as a decompilation issue!!! */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m34379(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34379(int, int):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34381() {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34381():int");
    }

    public C14390(byte[] bArr, int i, int[] iArr) {
        this.f43355 = bArr;
        this.f43354 = iArr;
        this.f43356 = i;
    }
}
