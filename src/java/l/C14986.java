package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: J703 */
/* renamed from: l.ܶۘܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14986 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f45687;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f45688;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f45689;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45690;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f45691;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f45692;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f45693;

    public C14986(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z) {
        this.f45689 = i;
        this.f45690 = i2;
        this.f45693 = iArr;
        this.f45691 = iArr2;
        this.f45692 = iArr3;
        this.f45688 = iArr4;
        this.f45687 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14986 m35494(int i, C7931... c7931Arr) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C7931[] c7931Arr2 = c7931Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Old length must not be negative");
        }
        C11003.requireNonNull(c7931Arr2, "edits");
        long j2 = i;
        int i24 = 0;
        int i25 = -1;
        boolean z2 = false;
        for (C7931 c7931 : c7931Arr2) {
            m35495(c7931, i);
            i15 = c7931.f24554;
            i16 = c7931.f24553;
            if (i15 == i16) {
                i23 = c7931.f24552;
                if (i23 == 0) {
                    continue;
                }
            }
            i17 = c7931.f24554;
            if (i17 < i25) {
                throw new IllegalArgumentException("Edits must be ordered and non-overlapping");
            }
            i18 = c7931.f24554;
            if (i18 != i25) {
                i24++;
            }
            i25 = c7931.f24553;
            i19 = c7931.f24552;
            i20 = c7931.f24553;
            i21 = c7931.f24554;
            long j3 = (i19 - (i20 - i21)) + j2;
            i22 = c7931.f24553;
            z2 = (i22 == i) | z2;
            j2 = j3;
        }
        long j4 = 0;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        int[] iArr = new int[i24];
        int[] iArr2 = new int[i24];
        int[] iArr3 = new int[i24];
        int[] iArr4 = new int[i24];
        int length = c7931Arr2.length;
        int i26 = 0;
        int i27 = -1;
        while (i26 < length) {
            C7931 c79312 = c7931Arr2[i26];
            i2 = c79312.f24554;
            i3 = c79312.f24553;
            if (i2 == i3) {
                i14 = c79312.f24552;
                if (i14 == 0) {
                    j = j2;
                    z = z2;
                    i6 = length;
                    i26++;
                    c7931Arr2 = c7931Arr;
                    z2 = z;
                    j2 = j;
                    length = i6;
                }
            }
            i4 = c79312.f24554;
            long j5 = i4 + j4;
            z = z2;
            i5 = c79312.f24552;
            j = j2;
            long j6 = i5 + j5;
            if (i27 >= 0) {
                int i28 = iArr2[i27];
                i6 = length;
                i12 = c79312.f24554;
                if (i28 == i12) {
                    i13 = c79312.f24553;
                    iArr2[i27] = i13;
                    iArr4[i27] = (int) j6;
                    i9 = c79312.f24552;
                    i10 = c79312.f24553;
                    i11 = c79312.f24554;
                    j4 = (i9 - (i10 - i11)) + j4;
                    i26++;
                    c7931Arr2 = c7931Arr;
                    z2 = z;
                    j2 = j;
                    length = i6;
                }
            } else {
                i6 = length;
            }
            i27++;
            i7 = c79312.f24554;
            iArr[i27] = i7;
            i8 = c79312.f24553;
            iArr2[i27] = i8;
            iArr3[i27] = (int) j5;
            iArr4[i27] = (int) j6;
            i9 = c79312.f24552;
            i10 = c79312.f24553;
            i11 = c79312.f24554;
            j4 = (i9 - (i10 - i11)) + j4;
            i26++;
            c7931Arr2 = c7931Arr;
            z2 = z;
            j2 = j;
            length = i6;
        }
        long j7 = j2;
        boolean z3 = z2;
        for (int i29 = 0; i29 < i24 && !z3; i29++) {
            z3 = iArr2[i29] - iArr[i29] != iArr4[i29] - iArr3[i29];
        }
        return new C14986(i, (int) j7, iArr, iArr2, iArr3, iArr4, z3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14986 m35499(C7931 c7931) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int i7;
        int m35498;
        int m354982;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f45690;
        m35495(c7931, i14);
        long j = i14;
        i = c7931.f24552;
        long j2 = j + i;
        i2 = c7931.f24553;
        i3 = c7931.f24554;
        if (j2 - (i2 - i3) > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        i4 = c7931.f24554;
        i5 = c7931.f24553;
        if (i4 == i5) {
            i13 = c7931.f24552;
            if (i13 == 0) {
                return m35496();
            }
        }
        int i15 = 0;
        while (true) {
            iArr = this.f45693;
            int length = iArr.length;
            iArr2 = this.f45688;
            if (i15 >= length) {
                break;
            }
            int i16 = iArr2[i15];
            i12 = c7931.f24554;
            if (i16 >= i12) {
                break;
            }
            i15++;
        }
        int i17 = i15;
        while (true) {
            int length2 = iArr.length;
            iArr3 = this.f45692;
            if (i17 >= length2) {
                break;
            }
            int i18 = iArr3[i17];
            i11 = c7931.f24553;
            if (i18 > i11) {
                break;
            }
            i17++;
        }
        i6 = c7931.f24554;
        i7 = c7931.f24553;
        int[] iArr4 = this.f45691;
        if (i15 < i17) {
            i6 = Math.min(i6, iArr3[i15]);
            int i19 = i17 - 1;
            i7 = Math.max(i7, iArr2[i19]);
            m35498 = Math.min(iArr[i15], m35498(i6, EnumC0875.BEFORE));
            m354982 = Math.max(iArr4[i19], m35498(i7, EnumC0875.AFTER));
        } else {
            m35498 = m35498(i6, EnumC0875.BEFORE);
            m354982 = m35498(i7, EnumC0875.AFTER);
        }
        long j3 = i7 - i6;
        i8 = c7931.f24553;
        i9 = c7931.f24554;
        i10 = c7931.f24552;
        long j4 = (j3 - (i8 - i9)) + i10;
        int i20 = (int) j4;
        if (j4 != i20) {
            throw new ArithmeticException();
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i21 = 0; i21 < i15; i21++) {
            arrayList.add(new C7931(iArr[i21], iArr4[i21], iArr2[i21] - iArr3[i21]));
        }
        arrayList.add(new C7931(m35498, m354982, i20));
        while (i17 < iArr.length) {
            arrayList.add(new C7931(iArr[i17], iArr4[i17], iArr2[i17] - iArr3[i17]));
            i17++;
        }
        return m35494(this.f45689, (C7931[]) arrayList.toArray(new C7931[0])).m35496();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35507() {
        return this.f45689;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35509() {
        return this.f45690;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C14986 m35496() {
        int[] iArr = this.f45693;
        if (iArr.length <= 64) {
            return this;
        }
        int length = iArr.length - 1;
        return m35494(this.f45689, new C7931(iArr[0], this.f45691[length], this.f45688[length] - this.f45692[0]));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m35504() {
        return this.f45693.length;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35506() {
        return this.f45693.length == 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35501() {
        int[] iArr = this.f45693;
        if (iArr.length == 0) {
            return -1;
        }
        return iArr[0];
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35508(int i) {
        return this.f45693[i];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35510(int i) {
        return this.f45691[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35497(int i) {
        int binarySearch = Arrays.binarySearch(this.f45691, i);
        return binarySearch >= 0 ? binarySearch : (-binarySearch) - 1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m35505(int i) {
        return this.f45692[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35502(int i) {
        return this.f45688[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35503(int i, EnumC0875 enumC0875) {
        return m35493(i, enumC0875, this.f45689, this.f45693, this.f45691, this.f45692, this.f45688);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35498(int i, EnumC0875 enumC0875) {
        return m35493(i, enumC0875, this.f45690, this.f45692, this.f45688, this.f45693, this.f45691);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35500() {
        return this.f45687;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35495(C7931 c7931, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C11003.requireNonNull(c7931, "edit");
        i2 = c7931.f24554;
        if (i2 >= 0) {
            i3 = c7931.f24553;
            i4 = c7931.f24554;
            if (i3 >= i4) {
                i5 = c7931.f24553;
                if (i5 <= i) {
                    i6 = c7931.f24552;
                    if (i6 < 0) {
                        throw new IllegalArgumentException("Replacement length must not be negative");
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Edit range is outside the old document");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35493(int i, EnumC0875 enumC0875, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C11003.requireNonNull(enumC0875, "affinity");
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Offset outside document: "));
        }
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch >= 0) {
            return (iArr[binarySearch] == iArr2[binarySearch] && enumC0875 == EnumC0875.AFTER) ? iArr4[binarySearch] : iArr3[binarySearch];
        }
        int i3 = (-binarySearch) - 2;
        if (i3 < 0) {
            return i;
        }
        int i4 = iArr2[i3];
        if (i < i4) {
            return -1;
        }
        return (i - i4) + iArr4[i3];
    }
}
