package l;

/* compiled from: Z6QT */
/* renamed from: l.ᩳ֨ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17725 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7225 f54219 = C7225.m19318(15360, 0, true, false);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x001c A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7225 m41509(l.C5855 r18) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17725.m41509(l.ۛۚܽ):l.۟ۘܽ");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7225 m41508(l.C2203 r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof l.C9259
            boolean r2 = r0 instanceof l.C8553
            r3 = 0
            if (r2 != 0) goto L10
            boolean r2 = r0 instanceof l.C15607
            if (r2 == 0) goto Le
            goto L10
        Le:
            r2 = 0
            goto L11
        L10:
            r2 = 1
        L11:
            boolean r4 = r0 instanceof l.C18431
            if (r4 != 0) goto L1c
            boolean r4 = r0 instanceof l.C19137
            if (r4 == 0) goto L1a
            goto L1c
        L1a:
            r4 = 0
            goto L1d
        L1c:
            r4 = 1
        L1d:
            if (r1 != 0) goto L26
            if (r2 != 0) goto L26
            if (r4 != 0) goto L26
            l.۟ۘܽ r0 = l.C7225.f22115
            return r0
        L26:
            int[] r0 = r0.f7231
            r0 = r0[r3]
            r3 = 128(0x80, float:1.8E-43)
            r5 = 0
            r7 = 1
            r9 = 64
            if (r1 == 0) goto L53
            if (r0 < 0) goto L3c
            if (r0 >= r9) goto L3c
            long r1 = r7 << r0
            r10 = r1
            goto L3d
        L3c:
            r10 = r5
        L3d:
            if (r0 < r9) goto L45
            if (r0 >= r3) goto L45
            int r1 = r0 + (-64)
            long r5 = r7 << r1
        L45:
            r12 = r5
            if (r0 < r3) goto L4b
            r0 = 1
            r14 = 1
            goto L4d
        L4b:
            r0 = 0
            r14 = 0
        L4d:
            r15 = 0
            l.۟ۘܽ r0 = l.C7225.m19318(r10, r12, r14, r15)
            return r0
        L53:
            r10 = 0
            r11 = r5
            r13 = r11
        L56:
            if (r10 >= r3) goto L80
            if (r4 == 0) goto L63
            if (r0 == r10) goto L70
            int r5 = l.C3395.m10356(r10)
            if (r0 != r5) goto L7d
            goto L70
        L63:
            if (r2 == 0) goto L6e
            if (r0 == r10) goto L70
            int r5 = l.C22165.m49804(r10)
            if (r0 != r5) goto L7d
            goto L70
        L6e:
            if (r0 != r10) goto L7d
        L70:
            if (r10 >= r9) goto L77
            long r5 = r7 << r10
            long r5 = r5 | r11
            r11 = r5
            goto L7d
        L77:
            int r5 = r10 + (-64)
            long r5 = r7 << r5
            long r5 = r5 | r13
            r13 = r5
        L7d:
            int r10 = r10 + 1
            goto L56
        L80:
            if (r1 == 0) goto L88
            if (r0 < r3) goto L85
            goto L88
        L85:
            r0 = 0
            r15 = 0
            goto L8a
        L88:
            r0 = 1
            r15 = 1
        L8a:
            r16 = 0
            l.۟ۘܽ r0 = l.C7225.m19318(r11, r13, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17725.m41508(l.ۖ֨ܽ):l.۟ۘܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m41510(InterfaceC10795 interfaceC10795) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 128; i++) {
            if (interfaceC10795.mo2465(i)) {
                if (i < 64) {
                    j = (1 << i) | j;
                } else {
                    j2 = (1 << (i - 64)) | j2;
                }
            }
        }
        return C7225.m19318(j, j2, true, false);
    }
}
