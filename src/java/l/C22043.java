package l;

/* compiled from: U707 */
/* renamed from: l.᩹ۘܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22043 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f70658;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70659;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70660;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC21338 f70661;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f70662;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f70663;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f70664;

    public C22043(int i) {
        m49604(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49604(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f70664 = i;
        this.f70658 = -1;
        this.f70659 = -1;
        this.f70662 = -1;
        this.f70660 = -1;
        this.f70663 = false;
        this.f70661 = EnumC21338.COMPLETE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49600(int i, int i2) {
        if (i == i2) {
            m49599(i);
            return;
        }
        if (i < 0 || i > i2 || i2 > this.f70664) {
            throw new IndexOutOfBoundsException("Invalid dependency read range");
        }
        int i3 = this.f70660;
        if (i3 == -1 || i < i3) {
            this.f70660 = i;
        }
        if (i2 > this.f70662) {
            this.f70662 = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49599(int i) {
        if (i < 0 || i > this.f70664) {
            throw new IndexOutOfBoundsException("Invalid dependency boundary");
        }
        int i2 = this.f70659;
        if (i2 == -1 || i < i2) {
            this.f70659 = i;
        }
        if (i > this.f70658) {
            this.f70658 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49598() {
        this.f70663 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49605() {
        this.f70661 = EnumC21338.UNKNOWN;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49601(C19927 c19927) {
        int i;
        int i2;
        int i3;
        boolean z;
        EnumC21338 enumC21338;
        int i4;
        int i5;
        C11003.requireNonNull(c19927);
        int i6 = this.f70664;
        i = c19927.f64521;
        if (i6 != i) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        i2 = c19927.f64517;
        if (i2 != -1) {
            int i7 = this.f70660;
            if (i7 == -1 || i2 < i7) {
                this.f70660 = i2;
            }
            i5 = c19927.f64519;
            if (i5 > this.f70662) {
                this.f70662 = i5;
            }
        }
        i3 = c19927.f64516;
        if (i3 != -1) {
            int i8 = this.f70659;
            if (i8 == -1 || i3 < i8) {
                this.f70659 = i3;
            }
            i4 = c19927.f64515;
            if (i4 > this.f70658) {
                this.f70658 = i4;
            }
        }
        boolean z2 = this.f70663;
        z = c19927.f64520;
        this.f70663 = z2 | z;
        enumC21338 = c19927.f64518;
        EnumC21338 enumC213382 = EnumC21338.UNKNOWN;
        if (enumC21338 == enumC213382) {
            this.f70661 = enumC213382;
            return;
        }
        EnumC21338 enumC213383 = EnumC21338.INCOMPLETE;
        if (enumC21338 == enumC213383 && this.f70661 == EnumC21338.COMPLETE) {
            this.f70661 = enumC213383;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49602(C22043 c22043) {
        C11003.requireNonNull(c22043);
        if (c22043 == this) {
            return;
        }
        if (this.f70664 != c22043.f70664) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c22043.f70660;
        if (i != -1) {
            int i2 = this.f70660;
            if (i2 == -1 || i < i2) {
                this.f70660 = i;
            }
            int i3 = c22043.f70662;
            if (i3 > this.f70662) {
                this.f70662 = i3;
            }
        }
        int i4 = c22043.f70659;
        if (i4 != -1) {
            int i5 = this.f70659;
            if (i5 == -1 || i4 < i5) {
                this.f70659 = i4;
            }
            int i6 = c22043.f70658;
            if (i6 > this.f70658) {
                this.f70658 = i6;
            }
        }
        this.f70663 |= c22043.f70663;
        EnumC21338 enumC21338 = c22043.f70661;
        EnumC21338 enumC213382 = EnumC21338.UNKNOWN;
        if (enumC21338 == enumC213382) {
            this.f70661 = enumC213382;
            return;
        }
        EnumC21338 enumC213383 = EnumC21338.INCOMPLETE;
        if (enumC21338 == enumC213383 && this.f70661 == EnumC21338.COMPLETE) {
            this.f70661 = enumC213383;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m49603() {
        return new C19927(this, this.f70661);
    }
}
