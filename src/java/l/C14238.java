package l;

/* compiled from: 17U9 */
/* renamed from: l.ܳۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14238 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33886(C17356[] c17356Arr) {
        for (C17356 c17356 : c17356Arr) {
            char m40688 = c17356.m40688();
            float[] m40687 = c17356.m40687();
            if (m40688 == 'A') {
                for (int i = 0; i < m40687.length; i += 7) {
                    int i2 = i + 5;
                    m40687[i2] = 24.0f - m40687[i2];
                    int i3 = i + 4;
                    m40687[i3] = 1.0f - m40687[i3];
                }
            } else if (m40688 == 'C') {
                for (int i4 = 0; i4 < m40687.length; i4 += 6) {
                    m40687[i4] = 24.0f - m40687[i4];
                    int i5 = i4 + 2;
                    m40687[i5] = 24.0f - m40687[i5];
                    int i6 = i4 + 4;
                    m40687[i6] = 24.0f - m40687[i6];
                }
            } else if (m40688 == 'H') {
                m40687[0] = 24.0f - m40687[0];
            } else {
                if (m40688 != 'Q') {
                    if (m40688 != 'V') {
                        if (m40688 == 'a') {
                            for (int i7 = 0; i7 < m40687.length; i7 += 7) {
                                int i8 = i7 + 5;
                                m40687[i8] = -m40687[i8];
                                int i9 = i7 + 4;
                                m40687[i9] = 1.0f - m40687[i9];
                            }
                        } else if (m40688 == 'c') {
                            for (int i10 = 0; i10 < m40687.length; i10 += 6) {
                                m40687[i10] = -m40687[i10];
                                int i11 = i10 + 2;
                                m40687[i11] = -m40687[i11];
                                int i12 = i10 + 4;
                                m40687[i12] = -m40687[i12];
                            }
                        } else if (m40688 == 'h') {
                            m40687[0] = -m40687[0];
                        } else {
                            if (m40688 != 'q') {
                                if (m40688 != 'v') {
                                    if (m40688 != 'L' && m40688 != 'M') {
                                        if (m40688 != 'S') {
                                            if (m40688 != 'T') {
                                                if (m40688 != 'l' && m40688 != 'm') {
                                                    if (m40688 != 's') {
                                                        if (m40688 != 't') {
                                                        }
                                                    }
                                                }
                                                for (int i13 = 0; i13 < m40687.length; i13 += 2) {
                                                    m40687[i13] = -m40687[i13];
                                                }
                                            }
                                        }
                                    }
                                    for (int i14 = 0; i14 < m40687.length; i14 += 2) {
                                        m40687[i14] = 24.0f - m40687[i14];
                                    }
                                }
                            }
                            for (int i15 = 0; i15 < m40687.length; i15 += 4) {
                                m40687[i15] = -m40687[i15];
                                int i16 = i15 + 2;
                                m40687[i16] = -m40687[i16];
                            }
                        }
                    }
                }
                for (int i17 = 0; i17 < m40687.length; i17 += 4) {
                    m40687[i17] = 24.0f - m40687[i17];
                    int i18 = i17 + 2;
                    m40687[i18] = 24.0f - m40687[i18];
                }
            }
        }
    }
}
