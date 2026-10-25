package l;

/* compiled from: UBEJ */
/* renamed from: l.ۘܳܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4004 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19611 f12698;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12699;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0312 f12700;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12701;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13012 f12702;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14586 f12703;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f12704 = null;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2593 f12705;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f12706;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20316 m12061(C13012 c13012, C0312 c0312, int i, C9733 c9733) {
        C16540 c16540;
        int i2;
        C4004 c4004 = new C4004(c13012, c0312, i, c9733);
        C17246 m31591 = c13012.m31591();
        int size = m31591.size();
        int m38023 = m31591.m38023();
        int[] m32622 = C13573.m32622(m38023);
        int[] m326222 = C13573.m32622(m38023);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C13573.m32627(m31591.m41002get(i4).mo2269(), m32622);
        }
        int[] iArr = new int[size];
        int m31593 = c13012.m31593();
        int i5 = 0;
        while (m31593 != -1) {
            while (true) {
                C21064 m31592 = c13012.m31592(m31593);
                int size2 = m31592.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    i2 = m31592.get(i6);
                    if (C13573.m32626(i2, m326222)) {
                        break;
                    }
                    if (C13573.m32626(i2, m32622) && m31591.m40535(i2).m38913() == m31593) {
                        break;
                    }
                }
                C13573.m32627(i2, m326222);
                m31593 = i2;
            }
            while (m31593 != -1) {
                C13573.m32620(m31593, m32622);
                C13573.m32620(m31593, m326222);
                iArr[i5] = m31593;
                i5++;
                C16540 m40535 = m31591.m40535(m31593);
                int m38913 = m40535.m38913();
                C21064 m38911 = m40535.m38911();
                int size3 = m38911.size();
                if (size3 == 0) {
                    c16540 = null;
                } else if (size3 == 1) {
                    c16540 = m31591.m40535(m38911.get(0));
                } else if (m38913 != -1) {
                    c16540 = m31591.m40535(m38913);
                } else {
                    c16540 = m31591.m40535(m38911.get(0));
                }
                if (c16540 == null) {
                    break;
                }
                int mo2269 = c16540.mo2269();
                int m389132 = m40535.m38913();
                if (C13573.m32626(mo2269, m32622)) {
                    m31593 = mo2269;
                } else if (m389132 == mo2269 || m389132 < 0 || !C13573.m32626(m389132, m32622)) {
                    C21064 m389112 = m40535.m38911();
                    int size4 = m389112.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            m31593 = -1;
                            break;
                        }
                        int i8 = m389112.get(i7);
                        if (C13573.m32626(i8, m32622)) {
                            m31593 = i8;
                            break;
                        }
                        i7++;
                    }
                } else {
                    m31593 = m389132;
                }
            }
            m31593 = C13573.m32623(0, m32622);
        }
        if (i5 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        c4004.f12704 = iArr;
        C17246 m315912 = c13012.m31591();
        int[] iArr2 = c4004.f12704;
        int length = iArr2.length;
        while (true) {
            C14586 c14586 = c4004.f12703;
            C19611 c19611 = c4004.f12698;
            if (i3 >= length) {
                return new C20316(c14586.m34837(), new C19527(c13012, c4004.f12704, c19611));
            }
            int i9 = i3 + 1;
            int i10 = i9 == iArr2.length ? -1 : iArr2[i9];
            C16540 m405352 = m315912.m40535(iArr2[i3]);
            C15375 m45054 = c19611.m45054(m405352);
            c14586.m34838((AbstractC4793) m45054);
            C0312 c03122 = c4004.f12700;
            if (c03122 != null) {
                c14586.m34838(new C11060(m45054.m13983(), c03122.m1723(m405352)));
            }
            C15375 m45053 = c19611.m45053(m405352);
            C2593 c2593 = c4004.f12705;
            c2593.m8218(m405352, m45053);
            m405352.m38916().m7866(c2593);
            c14586.m34838((AbstractC4793) c19611.m45052(m405352));
            int m389133 = m405352.m38913();
            AbstractC15834 m38915 = m405352.m38915();
            if (m389133 >= 0 && m389133 != i10) {
                if (m38915.m37484().m9558() == 4 && m405352.m38918() == i10) {
                    c14586.m34839(c19611.m45051(m389133));
                } else {
                    c14586.m34838(new C5415(C12554.f37822, m38915.m37480(), C20069.f65002, c19611.m45051(m389133)));
                }
            }
            i3 = i9;
        }
    }

    public C4004(C13012 c13012, C0312 c0312, int i, C9733 c9733) {
        this.f12702 = c13012;
        this.f12700 = c0312;
        this.f12698 = new C19611(c13012);
        this.f12701 = i;
        boolean[] zArr = {true};
        c13012.m31591().m40532(new C8943(zArr, c13012.m31591().m40536(), i));
        boolean z = zArr[0];
        this.f12706 = z;
        C17246 m31591 = c13012.m31591();
        int size = m31591.size();
        int i2 = size * 3;
        int m40533 = m31591.m40533() + i2;
        int m1727 = c0312 != null ? m40533 + c0312.m1727() + size : m40533;
        int m40536 = m31591.m40536() + (z ? 0 : i);
        this.f12699 = m40536;
        C14586 c14586 = new C14586(c9733, m1727, i2, m40536, i);
        this.f12703 = c14586;
        if (c0312 != null) {
            this.f12705 = new C15997(this, c14586, c0312);
        } else {
            this.f12705 = new C2593(this, c14586);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20069 m12059(AbstractC15834 abstractC15834) {
        return m12063(abstractC15834, abstractC15834.m37483());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20069 m12063(AbstractC15834 abstractC15834, C21480 c21480) {
        C20069 m37479 = abstractC15834.m37479();
        if (abstractC15834.m37484().m9557() && m37479.size() == 2 && c21480.m48652() == m37479.m41004get(1).m48652()) {
            m37479 = C20069.m46250(m37479.m41004get(1), m37479.m41004get(0));
        }
        return c21480 == null ? m37479 : m37479.m46255(c21480);
    }
}
