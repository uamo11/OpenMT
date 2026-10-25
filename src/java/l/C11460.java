package l;

/* compiled from: 470D */
/* renamed from: l.ۨۘܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11460 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12165 f34234;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12870 f34235;

    public C11460(C12165 c12165) {
        C11003.requireNonNull(c12165);
        this.f34234 = c12165;
        this.f34235 = new C12870(c12165);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10049 m28268(C14986 c14986) {
        int i;
        int i2;
        int m29629;
        int m35503;
        C4404 m31305 = this.f34235.m31305(c14986);
        if (c14986.m35506()) {
            return new C10049(-1, -1, -1, -1, EnumC5815.NO_CHANGE, m31305);
        }
        if (m31305.m13132()) {
            return new C10049(0, 0, -1, -1, EnumC5815.UNKNOWN_DEPENDENCY, m31305);
        }
        int m35501 = c14986.m35501();
        C12165 c12165 = this.f34234;
        int m29632 = c12165.m29632(m35501);
        for (int i3 = 0; i3 < m31305.m13133(); i3++) {
            m29632 = Math.min(m29632, c12165.m29633(m31305.m13131(i3)));
        }
        int m13130 = m31305.m13130();
        if (m13130 >= c12165.m29630() || (m29629 = c12165.m29629(Math.max(c14986.m35510(c14986.m35504() - 1), m13130 + 1))) < 0 || m29629 >= c12165.m29630() || (m35503 = c14986.m35503(m29629, EnumC0875.AFTER)) < 0 || m35503 >= c14986.m35509() || c12165.m29630() - m29629 != c14986.m35509() - m35503) {
            i = -1;
            i2 = -1;
        } else {
            i = m29629;
            i2 = m35503;
        }
        return new C10049(m29632, c14986.m35503(m29632, EnumC0875.BEFORE), i, i2, m31305.m13133() == 0 ? EnumC5815.LOCAL_CHANGE : EnumC5815.AFFECTED_DEPENDENCY, m31305);
    }
}
