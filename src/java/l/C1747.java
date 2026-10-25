package l;

/* compiled from: N6ZQ */
/* renamed from: l.֫ۢܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1747 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6031;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f6033;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f6034;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f6035;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f6036;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17975 f6038;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14986 f6039;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6040;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6041;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6042;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f6043;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f6037 = 1;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f6032 = true;

    public C1747(C17975 c17975, C14986 c14986, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7;
        this.f6038 = c17975;
        C11003.requireNonNull(c14986, "changes");
        this.f6039 = c14986;
        C11003.requireNonNull(iArr, "activeRelativeNodes");
        this.f6036 = iArr;
        int m35507 = c14986.m35507();
        i5 = c17975.f56071;
        if (m35507 == i5 && i >= 1) {
            i6 = c17975.f56069;
            if (i <= i6 && i2 >= 0) {
                long j = i + i2;
                i7 = c17975.f56069;
                if (j <= i7 && i3 >= 0 && i3 <= c14986.m35507() && i4 >= 0 && i4 <= c14986.m35509()) {
                    this.f6034 = i;
                    this.f6040 = i2;
                    this.f6033 = i + i2;
                    this.f6035 = i3;
                    this.f6042 = i4;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Syntax context checkpoint boundaries differ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5826(C14446 c14446) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        C15068[] c15068Arr;
        C11003.requireNonNull(c14446, "target");
        if (this.f6041) {
            return false;
        }
        boolean z = this.f6043;
        int[] iArr5 = this.f6036;
        int i2 = this.f6042;
        int i3 = this.f6035;
        int i4 = this.f6033;
        if (!z) {
            this.f6043 = true;
            if (c14446.m34501() != this.f6039.m35509() || c14446.m34498() != 1 || m5823(i3) != i2) {
                m5824();
                return true;
            }
            if (this.f6037 >= i4) {
                if (this.f6031 != iArr5.length) {
                    m5824();
                    return true;
                }
                this.f6041 = true;
                return true;
            }
        } else {
            int i5 = this.f6037;
            if (i5 < i4) {
                int i6 = this.f6034;
                int i7 = i5 - i6;
                int i8 = this.f6031;
                int i9 = i8 < iArr5.length ? iArr5[i8] : Integer.MAX_VALUE;
                if (i9 < i7 || i9 < 0 || i9 >= this.f6040) {
                    m5824();
                    return true;
                }
                boolean z2 = i9 == i7;
                C17975 c17975 = this.f6038;
                iArr = c17975.f56068;
                int i10 = iArr[i5];
                if (i5 >= i6 && i10 != 0 && i10 < i6) {
                    m5824();
                } else {
                    if (z2) {
                        int i11 = this.f6031;
                        if (i10 != (i11 != 0 ? iArr5[i11 - 1] + i6 : 0)) {
                            m5824();
                        }
                    }
                    iArr2 = c17975.f56067;
                    int m5823 = m5823(iArr2[i5]);
                    if (m5823 < 0 || m5823 > i2) {
                        m5824();
                    } else {
                        try {
                            if (z2) {
                                i = c14446.m34492(i10);
                            } else {
                                iArr3 = c17975.f56065;
                                int i12 = iArr3[i5];
                                int m58232 = m5823(i12);
                                if (i12 <= i3 && m58232 >= 0 && m58232 <= i2) {
                                    int i13 = m58232 - m5823;
                                    iArr4 = c17975.f56067;
                                    if (i13 == i12 - iArr4[i5]) {
                                        i = m58232;
                                    }
                                }
                                m5824();
                            }
                            c15068Arr = c17975.f56066;
                            if (!c14446.m34497(i5, m5823, i, i10, c15068Arr[i5])) {
                                m5824();
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            m5824();
                        }
                    }
                }
                if (this.f6032) {
                    if (z2) {
                        this.f6031++;
                    }
                    int i14 = this.f6037 + 1;
                    this.f6037 = i14;
                    if (i14 >= i4) {
                        if (this.f6031 != iArr5.length) {
                            m5824();
                        } else {
                            this.f6041 = true;
                        }
                    }
                }
            } else {
                if (this.f6031 != iArr5.length) {
                    m5824();
                    return false;
                }
                this.f6041 = true;
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m5823(int i) {
        int m35503;
        C14986 c14986 = this.f6039;
        try {
            m35503 = c14986.m35503(i, EnumC0875.BEFORE);
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
        if (m35503 == c14986.m35503(i, EnumC0875.AFTER)) {
            return m35503;
        }
        return -1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m5824() {
        this.f6032 = false;
        this.f6041 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5828() {
        return this.f6034;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5825() {
        return this.f6041;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5827() {
        return this.f6032;
    }
}
