package l;

/* compiled from: 48PJ */
/* renamed from: l.ܰۜۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13653 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f40720 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0122, code lost:
    
        if (r10 == 2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C8353 m32805(l.C17714 r17, java.lang.String r18, java.lang.String r19, l.C19643 r20) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13653.m32805(l.ᩳ֨֫, java.lang.String, java.lang.String, l.᩵ᩴ֫):l.۠ᩴ֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32808(C16302 c16302, C11538 c11538) {
        int m38343 = c16302.m38343(5);
        c16302.m38351(2);
        if (c16302.m38352()) {
            c16302.m38351(5);
        }
        if (m38343 >= 7 && m38343 <= 10) {
            c16302.m38346();
        }
        if (c16302.m38352()) {
            int m383432 = c16302.m38343(3);
            if (c11538.f34449 == -1 && m38343 >= 0 && m38343 <= 15 && (m383432 == 0 || m383432 == 1)) {
                c11538.f34449 = m38343;
            }
            if (c16302.m38352()) {
                m32809(c16302);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32810(C16302 c16302, C11538 c11538) {
        c16302.m38351(2);
        boolean m38352 = c16302.m38352();
        int m38343 = c16302.m38343(8);
        for (int i = 0; i < m38343; i++) {
            c16302.m38351(2);
            if (c16302.m38352()) {
                c16302.m38351(5);
            }
            if (m38352) {
                c16302.m38351(24);
            } else {
                if (c16302.m38352()) {
                    if (!c16302.m38352()) {
                        c16302.m38351(4);
                    }
                    c11538.f34453 = c16302.m38343(6) + 1;
                }
                c16302.m38351(4);
            }
        }
        if (c16302.m38352()) {
            c16302.m38351(3);
            if (c16302.m38352()) {
                m32809(c16302);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32809(C16302 c16302) {
        int m38343 = c16302.m38343(6);
        if (m38343 < 2 || m38343 > 42) {
            throw C9080.m23441(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(m38343)));
        }
        c16302.m38351(m38343 * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22826 m32806(l.C16302 r9) {
        /*
            r0 = 16
            int r1 = r9.m38343(r0)
            int r0 = r9.m38343(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m38343(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.m38343(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m38343(r1)
            boolean r2 = r9.m38352()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m38343(r2)
            boolean r5 = r9.m38352()
            if (r5 == 0) goto L47
            int r5 = r9.m38343(r4)
            if (r5 <= 0) goto L47
            r9.m38351(r1)
        L47:
            boolean r5 = r9.m38352()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L57
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L5a
        L57:
            r5 = 44100(0xac44, float:6.1797E-41)
        L5a:
            int r9 = r9.m38343(r3)
            int[] r8 = l.C13653.f40720
            if (r5 != r6) goto L69
            r6 = 13
            if (r9 != r6) goto L69
            r9 = r8[r9]
            goto L98
        L69:
            if (r5 != r7) goto L97
            r6 = 14
            if (r9 >= r6) goto L97
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8d
            r8 = 11
            if (r2 == r1) goto L88
            if (r2 == r4) goto L8d
            if (r2 == r3) goto L81
            goto L92
        L81:
            if (r9 == r4) goto L94
            if (r9 == r7) goto L94
            if (r9 != r8) goto L92
            goto L94
        L88:
            if (r9 == r7) goto L94
            if (r9 != r8) goto L92
            goto L94
        L8d:
            if (r9 == r4) goto L94
            if (r9 != r7) goto L92
            goto L94
        L92:
            r9 = r6
            goto L98
        L94:
            int r9 = r6 + 1
            goto L98
        L97:
            r9 = 0
        L98:
            l.᩺ۜۧ r1 = new l.᩺ۜۧ
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13653.m32806(l.ܽ֨֫):l.᩺ۜۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32807(int i, C17714 c17714) {
        c17714.m41481(7);
        byte[] m41482 = c17714.m41482();
        m41482[0] = -84;
        m41482[1] = 64;
        m41482[2] = -1;
        m41482[3] = -1;
        m41482[4] = (byte) ((i >> 16) & 255);
        m41482[5] = (byte) ((i >> 8) & 255);
        m41482[6] = (byte) (i & 255);
    }
}
