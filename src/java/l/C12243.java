package l;

/* compiled from: O8UK */
/* renamed from: l.۫ۜۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12243 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f36496 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f36495 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12948 m29741(C16302 c16302, boolean z) {
        int m38343 = c16302.m38343(5);
        if (m38343 == 31) {
            m38343 = c16302.m38343(6) + 32;
        }
        int m29740 = m29740(c16302);
        int m383432 = c16302.m38343(4);
        String m44628 = C19370.m44628(m38343, "mp4a.40.");
        if (m38343 == 5 || m38343 == 29) {
            m29740 = m29740(c16302);
            int m383433 = c16302.m38343(5);
            if (m383433 == 31) {
                m383433 = c16302.m38343(6) + 32;
            }
            m38343 = m383433;
            if (m38343 == 22) {
                m383432 = c16302.m38343(4);
            }
        }
        if (z) {
            if (m38343 != 1 && m38343 != 2 && m38343 != 3 && m38343 != 4 && m38343 != 6 && m38343 != 7 && m38343 != 17) {
                switch (m38343) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C9080.m23441("Unsupported audio object type: " + m38343);
                }
            }
            if (c16302.m38352()) {
                C19956.m46037("Unexpected frameLengthFlag = 1");
            }
            if (c16302.m38352()) {
                c16302.m38351(14);
            }
            boolean m38352 = c16302.m38352();
            if (m383432 == 0) {
                throw new UnsupportedOperationException();
            }
            if (m38343 == 6 || m38343 == 20) {
                c16302.m38351(3);
            }
            if (m38352) {
                if (m38343 == 22) {
                    c16302.m38351(16);
                }
                if (m38343 == 17 || m38343 == 19 || m38343 == 20 || m38343 == 23) {
                    c16302.m38351(3);
                }
                c16302.m38351(1);
            }
            switch (m38343) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m383434 = c16302.m38343(2);
                    if (m383434 == 2 || m383434 == 3) {
                        throw C9080.m23441("Unsupported epConfig: " + m383434);
                    }
            }
        }
        int i = f36495[m383432];
        if (i != -1) {
            return new C12948(m29740, i, m44628);
        }
        throw C9080.m23440((String) null, (Throwable) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29740(C16302 c16302) {
        int m38343 = c16302.m38343(4);
        if (m38343 == 15) {
            if (c16302.m38339() < 24) {
                throw C9080.m23440("AAC header insufficient data", (Throwable) null);
            }
            return c16302.m38343(24);
        }
        if (m38343 < 13) {
            return f36496[m38343];
        }
        throw C9080.m23440("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }
}
