package l;

/* compiled from: U707 */
/* renamed from: l.᩶ۘܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19927 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f64515;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f64516;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f64517;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC21338 f64518;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f64519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f64520;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f64521;

    public C19927(C22043 c22043, EnumC21338 enumC21338) {
        this(c22043.f70664, c22043.f70660, c22043.f70662, c22043.f70659, c22043.f70658, c22043.f70663, enumC21338);
    }

    public C19927(int i, int i2, int i3, int i4, int i5, boolean z, EnumC21338 enumC21338) {
        this.f64521 = i;
        this.f64517 = i2;
        this.f64519 = i3;
        this.f64516 = i4;
        this.f64515 = i5;
        this.f64520 = z;
        this.f64518 = enumC21338;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m45903() {
        return this.f64521;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m45898() {
        return this.f64517;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m45900() {
        return this.f64519;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45896() {
        return this.f64516;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45891() {
        return this.f64515;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m45901() {
        return this.f64520;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC21338 m45899() {
        return this.f64518;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45894(C14986 c14986) {
        C11003.requireNonNull(c14986);
        if (c14986.m35507() != this.f64521) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (c14986.m35506()) {
            return false;
        }
        if (this.f64518 != EnumC21338.COMPLETE) {
            return true;
        }
        if (this.f64520 && c14986.m35500()) {
            return true;
        }
        int m45902 = m45902();
        if (m45902 == -1) {
            return false;
        }
        int m45895 = m45895();
        for (int m35497 = c14986.m35497(m45902); m35497 < c14986.m35504() && c14986.m35508(m35497) <= m45895; m35497++) {
            if (m45893(c14986.m35508(m35497), c14986.m35510(m35497))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m45897(C14986 c14986) {
        C11003.requireNonNull(c14986, "changes");
        m45888(c14986);
        if (m45894(c14986)) {
            throw new IllegalArgumentException("Affected dependency cannot be remapped");
        }
        return m45885(c14986);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19927 m45892(C14986 c14986, int i) {
        C11003.requireNonNull(c14986, "changes");
        m45888(c14986);
        int i2 = this.f64521;
        C11003.checkFromToIndex(i, i, i2);
        if (!c14986.m35506()) {
            int m35504 = c14986.m35504() - 1;
            if (c14986.m35510(m35504) == i2 || i < c14986.m35510(m35504)) {
                throw new IllegalArgumentException("Dependency is not in a stable suffix");
            }
        }
        int m45902 = m45902();
        if (m45902 != -1) {
            int m45895 = m45895();
            int min = Math.min(i, m45902);
            int max = Math.max(i, m45895);
            for (int m35497 = c14986.m35497(min); m35497 < c14986.m35504() && c14986.m35508(m35497) <= max; m35497++) {
                int m35508 = c14986.m35508(m35497);
                int m35510 = c14986.m35510(m35497);
                if (m45893(m35508, m35510) || (m35510 - m35508 != c14986.m35502(m35497) - c14986.m35505(m35497) && min <= m35510 && m35508 <= max)) {
                    throw new IllegalArgumentException("Affected suffix dependency cannot be remapped");
                }
            }
        }
        int m35503 = c14986.m35503(i, EnumC0875.AFTER);
        long m35509 = c14986.m35509() - i2;
        if (m35503 < 0 || m35503 - i != m35509) {
            throw new IllegalArgumentException("Suffix replay entry does not move with EOF");
        }
        return m45885(c14986);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45888(C14986 c14986) {
        if (c14986.m35507() != this.f64521) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (this.f64518 != EnumC21338.COMPLETE) {
            throw new IllegalArgumentException("Only complete dependencies can be remapped");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C19927 m45885(C14986 c14986) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f64519;
        int i6 = this.f64517;
        if (i6 != -1) {
            int m45882 = m45882(c14986, i6);
            int m458822 = m45882(c14986, i5);
            if (m458822 <= m45882) {
                throw new IllegalArgumentException("Invalid remapped read range");
            }
            i = m45882;
            i2 = m458822;
        } else {
            i = -1;
            i2 = -1;
        }
        int i7 = this.f64515;
        int i8 = this.f64516;
        if (i8 != -1) {
            int m458823 = m45882(c14986, i8);
            int m458824 = m45882(c14986, i7);
            if (m458824 < m458823) {
                throw new IllegalArgumentException("Invalid remapped boundary range");
            }
            i3 = m458823;
            i4 = m458824;
        } else {
            i3 = -1;
            i4 = -1;
        }
        return (c14986.m35509() == this.f64521 && i == i6 && i2 == i5 && i3 == i8 && i4 == i7) ? this : new C19927(c14986.m35509(), i, i2, i3, i4, this.f64520, EnumC21338.COMPLETE);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m45882(C14986 c14986, int i) {
        int m35503 = c14986.m35503(i, EnumC0875.BEFORE);
        int m355032 = c14986.m35503(i, EnumC0875.AFTER);
        if (m35503 < 0 || m35503 != m355032) {
            throw new IllegalArgumentException("Dependency endpoint cannot be remapped uniquely");
        }
        return m35503;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45893(int i, int i2) {
        int i3 = this.f64517;
        if (i3 != -1) {
            int i4 = this.f64519;
            if (i == i2) {
                if (i3 <= i && i <= i4) {
                    return true;
                }
            } else if (i < i4 && i3 < i2) {
                return true;
            }
        }
        int i5 = this.f64516;
        return i5 != -1 && i <= this.f64515 && i5 <= i2;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m45902() {
        int i = this.f64516;
        int i2 = this.f64517;
        return i2 == -1 ? i : i == -1 ? i2 : Math.min(i2, i);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m45895() {
        return Math.max(this.f64519, this.f64515);
    }
}
