package l;

/* compiled from: X4M8 */
/* renamed from: l.۬۟ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12972 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18177 f38873;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38874;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38875;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38876;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f38877;

    public C12972(C18177 c18177, int i, int i2, boolean z, long j) {
        this.f38873 = c18177;
        this.f38874 = c18177.m42385();
        this.f38876 = i;
        if (z) {
            long j2 = i2 + 1;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new ArithmeticException();
            }
            i = i3;
        }
        this.f38875 = i;
        this.f38877 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31539(C6807 c6807) {
        return c6807.f21109.m27399(this.f38873, this.f38874, this.f38877);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12972 m31538(C6807 c6807) {
        C18177 m27414 = c6807.f21109.m27414();
        C11041 c11041 = c6807.f21109;
        int m27418 = c11041.m27418();
        int m27404 = c11041.m27404();
        boolean m27406 = c11041.m27406();
        long m27385 = c11041.m27385();
        if (m27418 < 0 || m27404 < m27418) {
            return null;
        }
        if (m27406 && m27404 >= m27414.length()) {
            return null;
        }
        if (m27406 || (m27418 == m27404 && m27418 <= m27414.length())) {
            return new C12972(m27414, m27418, m27404, m27406, m27385);
        }
        return null;
    }
}
