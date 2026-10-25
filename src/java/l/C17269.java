package l;

/* compiled from: T6ZS */
/* renamed from: l.ܿۢܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17269 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52926;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52927;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52928;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14446 f52929;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52930 = -1;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f52931;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52932;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52933;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f52934;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f52935;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52936;

    public C17269(C14446 c14446, int i, int i2, int i3, int i4) {
        int i5;
        this.f52929 = c14446;
        this.f52933 = i;
        this.f52926 = i2;
        this.f52935 = i3;
        this.f52934 = i4;
        i5 = c14446.f44280;
        this.f52936 = i5;
        this.f52931 = new int[i5 - i];
        this.f52928 = i;
        this.f52927 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40558() {
        boolean z;
        C17269 c17269;
        C15068[] c15068Arr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        C15068[] c15068Arr2;
        C15068[] c15068Arr3;
        int[] iArr7;
        if (this.f52932) {
            return true;
        }
        C14446 c14446 = this.f52929;
        z = c14446.f44279;
        if (!z) {
            c17269 = c14446.f44272;
            if (c17269 == this) {
                int i6 = this.f52927;
                int i7 = this.f52936;
                if (i6 < i7) {
                    this.f52927 = i6 + 1;
                    iArr = c14446.f44281;
                    int i8 = iArr[i6];
                    int[] iArr8 = this.f52931;
                    int i9 = this.f52933;
                    if (i8 >= i9) {
                        i8 = iArr8[i8 - i9];
                    }
                    int i10 = this.f52926;
                    iArr2 = c14446.f44274;
                    int max = i6 < i10 ? Math.max(iArr2[i6], this.f52935) : iArr2[i6];
                    if (i6 < i10) {
                        iArr7 = c14446.f44277;
                        i = Math.min(iArr7[i6], this.f52934);
                    } else {
                        iArr3 = c14446.f44277;
                        i = iArr3[i6];
                    }
                    if (max < i) {
                        i2 = c14446.f44275;
                        i3 = c14446.f44271;
                        if (i2 != i3) {
                            i4 = c14446.f44275;
                            if (i > i4) {
                                i5 = c14446.f44271;
                                if (max < i5) {
                                    int i11 = this.f52928;
                                    this.f52928 = i11 + 1;
                                    iArr4 = c14446.f44274;
                                    iArr4[i11] = max;
                                    iArr5 = c14446.f44277;
                                    iArr5[i11] = i;
                                    iArr6 = c14446.f44281;
                                    iArr6[i11] = i8;
                                    c15068Arr2 = c14446.f44278;
                                    c15068Arr3 = c14446.f44278;
                                    c15068Arr2[i11] = c15068Arr3[i6];
                                    iArr8[i6 - i9] = i11;
                                    return false;
                                }
                            }
                        }
                    }
                    iArr8[i6 - i9] = i8;
                    return false;
                }
                if (this.f52930 < 0) {
                    this.f52930 = this.f52928;
                }
                if (this.f52930 < i7) {
                    c15068Arr = c14446.f44278;
                    int i12 = this.f52930;
                    int i13 = i12 + 1;
                    this.f52930 = i13;
                    c15068Arr[i12] = null;
                    if (i13 < i7) {
                        return false;
                    }
                }
                c14446.f44280 = this.f52928;
                c14446.f44276 = true;
                this.f52932 = true;
                c14446.f44272 = null;
                return true;
            }
        }
        throw new IllegalStateException("Syntax context clip is not active");
    }
}
