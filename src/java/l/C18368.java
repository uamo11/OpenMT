package l;

/* compiled from: 964V */
/* renamed from: l.ᩳ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f57062;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18177 f57063;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f57064;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f57065;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f57066;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f57067;

    public C18368(C18177 c18177, long j, int i, int i2, int i3) {
        this.f57063 = c18177;
        this.f57067 = j;
        this.f57064 = i;
        this.f57065 = i2;
        long j2 = (i2 - i) + 1;
        int i4 = (int) j2;
        if (j2 != i4) {
            throw new ArithmeticException();
        }
        this.f57066 = i4;
        this.f57062 = i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42802(C6807 c6807) {
        C11041 c11041 = c6807.f21109;
        C18177 m27414 = c11041.m27414();
        C18177 c18177 = this.f57063;
        return m27414 == c18177 && c18177.m42385() == this.f57067 && c11041.m27406() && c11041.m27418() == this.f57064 && c11041.m27404() == this.f57065;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18368 m42801(C6807 c6807) {
        C11041 c11041 = c6807.f21109;
        if (!c11041.m27406()) {
            return null;
        }
        C18177 m27414 = c11041.m27414();
        int m27418 = c11041.m27418();
        int m27404 = c11041.m27404();
        int m27413 = c11041.m27413();
        if (m27418 < 0 || m27404 < m27418 || m27404 >= m27414.length() || m27413 <= 0) {
            return null;
        }
        return new C18368(m27414, m27414.m42385(), m27418, m27404, m27413);
    }
}
