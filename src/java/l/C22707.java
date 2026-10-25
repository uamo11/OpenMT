package l;

import java.util.Arrays;

/* compiled from: I6ZU */
/* renamed from: l.᩺ۖܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22707 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C22707 f73353 = new C22707(new int[0]);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f73354;

    public C22707(int[] iArr) {
        this.f73354 = iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22707 m50722(C22707 c22707, int i, int i2) {
        C11003.requireNonNull(c22707, "old");
        return c22707.m50720(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22707 m50726(C22707 c22707) {
        int i;
        int[] iArr;
        C11003.requireNonNull(c22707, "other");
        int[] iArr2 = c22707.f73354;
        int[] iArr3 = this.f73354;
        if (iArr3.length == 0) {
            return c22707;
        }
        if (iArr2.length == 0) {
            return this;
        }
        long length = iArr3.length + iArr2.length;
        int i2 = (int) length;
        if (length != i2) {
            throw new ArithmeticException();
        }
        int[] iArr4 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= iArr3.length && i4 >= iArr2.length) {
                return m50721(i5, iArr4);
            }
            if (i4 >= iArr2.length || (i3 < iArr3.length && iArr3[i3] <= iArr2[i4])) {
                i = i3 + 2;
                iArr = iArr3;
            } else {
                iArr = iArr2;
                i = i3;
                i3 = i4;
                i4 += 2;
            }
            i5 = m50719(i5, iArr[i3], iArr[i3 + 1], iArr4);
            i3 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22707 m50725(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i3;
            long j2 = i2 + j;
            if (j2 <= i) {
                int[] iArr = this.f73354;
                if (iArr.length != 0 && iArr[iArr.length - 1] > i) {
                    throw new IndexOutOfBoundsException("Syntax dirty range exceeds old text");
                }
                if (iArr.length == 0 || (i3 == 0 && i4 == 0)) {
                    return this;
                }
                long j3 = i4 - j;
                long length = iArr.length + 2;
                int i5 = (int) length;
                if (length != i5) {
                    throw new ArithmeticException();
                }
                int[] iArr2 = new int[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < iArr.length; i7 += 2) {
                    int i8 = iArr[i7];
                    int i9 = iArr[i7 + 1];
                    if (i9 <= i2) {
                        i6 = m50719(i6, i8, i9, iArr2);
                    } else {
                        long j4 = i8;
                        if (j4 >= j2) {
                            long j5 = j4 + j3;
                            int i10 = (int) j5;
                            if (j5 != i10) {
                                throw new ArithmeticException();
                            }
                            long j6 = i9 + j3;
                            int i11 = (int) j6;
                            if (j6 != i11) {
                                throw new ArithmeticException();
                            }
                            i6 = m50719(i6, i10, i11, iArr2);
                        } else {
                            if (i8 < i2) {
                                i6 = m50719(i6, i8, Math.min(i9, i2), iArr2);
                            }
                            int i12 = (int) j2;
                            if (j2 != i12) {
                                throw new ArithmeticException();
                            }
                            int max = Math.max(i8, i12);
                            if (max < i9) {
                                long j7 = max + j3;
                                int i13 = (int) j7;
                                if (j7 != i13) {
                                    throw new ArithmeticException();
                                }
                                long j8 = i9 + j3;
                                int i14 = (int) j8;
                                if (j8 != i14) {
                                    throw new ArithmeticException();
                                }
                                i6 = m50719(i6, i13, i14, iArr2);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return i6 == 0 ? f73353 : m50721(i6, iArr2);
            }
        }
        throw new IndexOutOfBoundsException("Invalid syntax dirty-range edit");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14239 m50728() {
        if (this.f73354.length == 0) {
            return null;
        }
        return m50724(0);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m50729() {
        return this.f73354.length / 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14239 m50724(int i) {
        C11003.checkIndex(i, m50729());
        int i2 = i * 2;
        int[] iArr = this.f73354;
        return new C14239(iArr[i2], iArr[i2 + 1]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m50727() {
        return this.f73354;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22707 m50723(int i, int i2, int i3, int i4) {
        C22707 c22707;
        if (i < 0 || i >= i2) {
            c22707 = f73353;
        } else {
            c22707 = new C22707(new int[]{i, i2});
        }
        return c22707.m50720(i3, i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22707 m50720(int i, int i2) {
        if (i < 0 || i >= i2) {
            return this;
        }
        int[] iArr = this.f73354;
        int[] iArr2 = new int[iArr.length + 2];
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i6 < i) {
                i3 = m50719(i3, i5, i6, iArr2);
            } else if (i2 < i5) {
                if (!z) {
                    i3 = m50719(i3, i, i2, iArr2);
                    z = true;
                }
                i3 = m50719(i3, i5, i6, iArr2);
            } else {
                i = Math.min(i, i5);
                i2 = Math.max(i2, i6);
            }
        }
        if (!z) {
            i3 = m50719(i3, i, i2, iArr2);
        }
        return m50721(i3, iArr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22707 m50721(int i, int[] iArr) {
        if (i == 0) {
            return f73353;
        }
        while (i > 64) {
            long j = iArr[2] - iArr[1];
            int i2 = 2;
            for (int i3 = 4; i3 < i; i3 += 2) {
                long j2 = iArr[i3] - iArr[i3 - 1];
                if (j2 < j) {
                    i2 = i3;
                    j = j2;
                }
            }
            iArr[i2 - 1] = iArr[i2 + 1];
            System.arraycopy(iArr, i2 + 2, iArr, i2, (i - i2) - 2);
            i -= 2;
        }
        if (i != iArr.length) {
            iArr = Arrays.copyOf(iArr, i);
        }
        return new C22707(iArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50719(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return i;
        }
        if (i >= 2 && i2 <= (i5 = iArr[i - 1])) {
            iArr[i4] = Math.max(i5, i3);
            return i;
        }
        iArr[i] = i2;
        iArr[i + 1] = i3;
        return i + 2;
    }
}
