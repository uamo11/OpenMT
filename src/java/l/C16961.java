package l;

/* compiled from: R78M */
/* renamed from: l.ܽ᩺᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16961 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4047 f52043 = new C4047();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39788(String str) {
        C4047 c4047 = this.f52043;
        if (str != null) {
            c4047.getClass();
            if (str.length() >= 2 && str.charAt(0) == 'L' && C7416.m19937(1, str) == ';') {
                c4047.m12161(str);
                return;
            }
        }
        c4047.m12163(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11318 m39787(C23528 c23528, C11138 c11138) {
        C16781 c16781 = c23528.f75548;
        boolean equals = "exact".equals(c16781.f51541);
        C4047 c4047 = this.f52043;
        if (equals) {
            C1965 m27623 = c11138.m27623(c4047.m12153(), "dexClassSimpleName");
            if (m27623 != null) {
                return m39785(c23528, m27623);
            }
            C1965 m276232 = c11138.m27623(c4047.m12164(), "dexClassSimpleName");
            if (m276232 != null) {
                return m39785(c23528, m276232);
            }
            C1965 m276233 = c11138.m27623(c4047.m12149(), "dexClassName");
            if (m276233 != null) {
                return m39785(c23528, m276233);
            }
            C1965 m276234 = c11138.m27623(c4047.m12151(), "dexClassName");
            if (m276234 != null) {
                return m39785(c23528, m276234);
            }
            C1965 m276235 = c11138.m27623(c4047.m12165(), "dexClassName");
            if (m276235 != null) {
                return m39785(c23528, m276235);
            }
            C1965 m276236 = c11138.m27623(c4047.m12152(), "dexClassName");
            if (m276236 == null) {
                return null;
            }
            return m39785(c23528, m276236);
        }
        if (c16781.f51540) {
            C1965 m276237 = c11138.m27623(c4047.m12149(), "dexClassName");
            if (m276237 != null) {
                return m39785(c23528, m276237);
            }
            C1965 m276238 = c11138.m27623(c4047.m12151(), "dexClassName");
            if (m276238 != null) {
                return m39785(c23528, m276238);
            }
            C1965 m276239 = c11138.m27623(c4047.m12152(), "dexClassName");
            if (m276239 != null) {
                return m39785(c23528, m276239);
            }
            C1965 m2762310 = c11138.m27623(c4047.m12165(), "dexClassName");
            if (m2762310 == null) {
                return null;
            }
            return m39785(c23528, m2762310);
        }
        C1965 m27622 = c11138.m27622(c4047.m12156(), c4047.m12160(), c4047.m12149());
        if (m27622 != null) {
            return m39785(c23528, m27622);
        }
        C1965 m276222 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12151());
        if (m276222 != null) {
            return m39785(c23528, m276222);
        }
        C1965 m276223 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12152());
        if (m276223 != null) {
            return m39785(c23528, m276223);
        }
        C1965 m276224 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12165());
        if (m276224 == null) {
            return null;
        }
        return m39785(c23528, m276224);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11318 m39785(C23528 c23528, C1965 c1965) {
        if (c23528.f75541) {
            c1965.m6475();
        } else {
            c1965 = null;
        }
        return new C11318(this.f52043.m12154(), c1965);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39786() {
        return this.f52043.m12154();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39789(C14355 c14355) {
        String str = c14355.f43285;
        if ("none".equals(str)) {
            return true;
        }
        String str2 = c14355.f43286;
        boolean equals = "descriptorExact".equals(str);
        C4047 c4047 = this.f52043;
        return equals ? str2 != null && c4047.m12150(str2) : str2 == null || str2.isEmpty() || c4047.m12155(str2) || c4047.m12157(str2) || c4047.m12159(str2);
    }
}
