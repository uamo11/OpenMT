package l;

/* compiled from: Q8H3 */
/* renamed from: l.ۜۖۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6475 implements InterfaceC23408 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19992;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f19993;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f19994;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f19995;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f19996;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f19997;

    @Override // l.InterfaceC9505
    /* renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6475 m17867(long j, long j2, C17265 c17265, C17714 c17714) {
        long j3;
        long j4;
        int m41456;
        c17714.m41478(6);
        long j5 = j2 + c17265.f52921;
        long m41493 = c17714.m41493() + j5;
        int m414932 = c17714.m41493();
        if (m414932 <= 0) {
            return null;
        }
        long m11013 = C3603.m11013(c17265.f52922, (m414932 * c17265.f52920) - 1);
        int m41464 = c17714.m41464();
        int m414642 = c17714.m41464();
        int m414643 = c17714.m41464();
        c17714.m41478(2);
        long j6 = j2 + c17265.f52921;
        long[] jArr = new long[m41464];
        long[] jArr2 = new long[m41464];
        int i = 0;
        while (i < m41464) {
            long j7 = m41493;
            long j8 = m11013;
            jArr[i] = (i * m11013) / m41464;
            jArr2[i] = j6;
            if (m414643 == 1) {
                m41456 = c17714.m41456();
            } else if (m414643 == 2) {
                m41456 = c17714.m41464();
            } else if (m414643 == 3) {
                m41456 = c17714.m41491();
            } else {
                if (m414643 != 4) {
                    return null;
                }
                m41456 = c17714.m41492();
            }
            j6 += m41456 * m414642;
            i++;
            m41493 = j7;
            m11013 = j8;
        }
        long j9 = m41493;
        long j10 = m11013;
        if (j == -1 || j == j9) {
            j3 = j9;
        } else {
            StringBuilder m31106 = C12803.m31106("VBRI data size mismatch: ", ", ", j);
            j3 = j9;
            m31106.append(j3);
            C19956.m46037(m31106.toString());
        }
        if (j3 != j6) {
            StringBuilder m311062 = C12803.m31106("VBRI bytes and ToC mismatch (using max): ", ", ", j3);
            m311062.append(j6);
            m311062.append("\nSeeking will be inaccurate.");
            C19956.m46037(m311062.toString());
            j4 = Math.max(j3, j6);
        } else {
            j4 = j3;
        }
        return new C6475(jArr, jArr2, j10, j5, j4, c17265.f52918);
    }

    public C6475(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f19994 = jArr;
        this.f19996 = jArr2;
        this.f19997 = j;
        this.f19995 = j2;
        this.f19993 = j3;
        this.f19992 = i;
    }

    @Override // l.InterfaceC9505
    /* renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long[] jArr = this.f19994;
        int m11036 = C3603.m11036(jArr, j, true);
        long j2 = jArr[m11036];
        long[] jArr2 = this.f19996;
        C8799 c8799 = new C8799(j2, jArr2[m11036]);
        if (j2 >= j || m11036 == jArr.length - 1) {
            return new C6682(c8799, c8799);
        }
        int i = m11036 + 1;
        return new C6682(c8799, new C8799(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC23408
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo17869(long j) {
        return this.f19994[C3603.m11036(this.f19996, j, true)];
    }

    @Override // l.InterfaceC9505
    /* renamed from: ۜ */
    public final long mo6827() {
        return this.f19997;
    }

    @Override // l.InterfaceC23408
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo17868() {
        return this.f19995;
    }

    @Override // l.InterfaceC23408
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo17870() {
        return this.f19993;
    }

    @Override // l.InterfaceC23408
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo17871() {
        return this.f19992;
    }
}
