package l;

/* compiled from: N6ZQ */
/* renamed from: l.۟᩷ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7722 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23861;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10920 f23862;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23863;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f23864;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f23865;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f23866;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23867;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f23868;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23869;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f23870;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15068[] f23871;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f23872;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14071 f23873;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23874;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f23875;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f23876;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f23877;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f23879;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23880;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23881;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C17975 f23883;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23884;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f23885;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f23886;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f23887;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23888;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23878 = 1;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23882 = -1;

    public C7722(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, C15068[] c15068Arr, boolean z) {
        this.f23868 = i4;
        int i5 = i3 - i2;
        this.f23867 = i5;
        this.f23876 = i2;
        this.f23886 = iArr;
        this.f23872 = iArr2;
        this.f23864 = iArr3;
        this.f23871 = c15068Arr;
        boolean z2 = (i2 == 0 && i3 == i) ? false : true;
        this.f23865 = z2;
        if (z) {
            this.f23866 = 16;
        } else {
            if (!z2) {
                this.f23866 = 1;
                return;
            }
            iArr[0] = 0;
            iArr2[0] = i5;
            this.f23866 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02cc A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m20675() {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7722.m20675():boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17975 m20676() {
        C17975 c17975 = this.f23883;
        if (c17975 != null) {
            return c17975;
        }
        throw new IllegalStateException("Syntax context index is not complete");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20674() {
        this.f23885 = null;
        this.f23877 = null;
        this.f23879 = null;
        this.f23874 = 0;
        this.f23861 = 0;
        this.f23866 = 6;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20672() {
        int m41996;
        long m42002;
        int i = this.f23887;
        int[] iArr = this.f23872;
        int[] iArr2 = this.f23886;
        long j = C13132.FOREVER_NS;
        int i2 = this.f23868;
        if (i == 0) {
            int i3 = this.f23870;
            if (i3 < i2 || this.f23869 < i2) {
                long j2 = i3 < i2 ? iArr2[this.f23877[i3]] : Long.MAX_VALUE;
                int i4 = this.f23869;
                if (i4 < i2) {
                    j = iArr[this.f23885[i4]];
                }
                this.f23884 = (int) Math.min(j2, j);
                this.f23887 = 1;
                return false;
            }
        } else {
            if (i == 1) {
                int i5 = this.f23869;
                if (i5 < i2) {
                    int i6 = this.f23885[i5];
                    if (iArr[i6] == this.f23884) {
                        C14071 c14071 = this.f23873;
                        this.f23869 = i5 + 1;
                        c14071.m33664(i6);
                        return false;
                    }
                }
                this.f23887 = 2;
                return false;
            }
            if (i == 2) {
                int i7 = this.f23870;
                if (i7 < i2) {
                    int i8 = this.f23877[i7];
                    if (iArr2[i8] == this.f23884) {
                        C14071 c140712 = this.f23873;
                        this.f23870 = i7 + 1;
                        c140712.m33662(i8);
                        return false;
                    }
                }
                this.f23887 = 3;
                return false;
            }
            if (i == 3) {
                int i9 = this.f23870;
                if (i9 < i2 || this.f23869 < i2) {
                    long j3 = i9 < i2 ? iArr2[this.f23877[i9]] : Long.MAX_VALUE;
                    int i10 = this.f23869;
                    if (i10 < i2) {
                        j = iArr[this.f23885[i10]];
                    }
                    if (Math.min(j3, j) > this.f23884) {
                        int m33663 = this.f23873.m33663();
                        if (m33663 < 0) {
                            throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                        }
                        if (m33663 != this.f23882) {
                            if (this.f23875) {
                                long[] jArr = this.f23879;
                                int i11 = this.f23861;
                                m42002 = C17975.m42002(this.f23884, m33663);
                                jArr[i11] = m42002;
                            }
                            m41996 = C17975.m41996(this.f23861);
                            this.f23861 = m41996;
                            this.f23882 = m33663;
                        }
                    }
                    this.f23887 = 0;
                    return false;
                }
            } else {
                throw new IllegalStateException("Invalid syntax context sweep phase");
            }
        }
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20673() {
        this.f23883 = new C17975(this.f23867, this.f23868, this.f23886, this.f23872, this.f23864, this.f23871, this.f23879);
        this.f23885 = null;
        this.f23877 = null;
        this.f23862 = null;
        this.f23873 = null;
        this.f23866 = 15;
    }
}
