package l;

/* compiled from: Z6W2 */
/* renamed from: l.ۘ۠ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3821 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f12222;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12223;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12224;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12225;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f12226;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f12227;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12228;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12229;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12230;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f12231;

    public C3821(C23494 c23494, int i, C23494 c234942, C4299 c4299, C23494 c234943, C12910 c12910) {
        this.f12231 = c23494.f75432;
        this.f12226 = m11565(c23494);
        this.f12227 = i;
        this.f12228 = c234942.f75432;
        this.f12229 = m11565(c234942);
        this.f12230 = c4299 == null ? null : c4299.f20243;
        this.f12223 = c4299 == null ? 0 : c4299.f20242;
        this.f12224 = c234943.f75432;
        this.f12225 = c12910.f38738;
        this.f12222 = c12910.f38739;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3821 m11563(C12910 c12910) {
        int i;
        int i2;
        C5855 c5855;
        C5855 c58552;
        C5855 c58553;
        C0916 c0916;
        C23494 c23494;
        C23494 m11564;
        C4299 c4299;
        C23494 c234942;
        InterfaceC10795 interfaceC10795;
        C5855 c58554;
        if (c12910 != null) {
            int i3 = c12910.f38735;
            if (c12910.getClass() == C12910.class && (i = c12910.f38738) >= 0 && c12910.f38739 >= i && c12910.f38740 >= -1 && i3 >= 0 && (i2 = c12910.f38736) >= 0 && i3 != i2 && (c5855 = c12910.f38737) != null && c5855.getClass() == C5150.class) {
                C5150 c5150 = (C5150) c12910.f38737;
                boolean z = c5150.f16093;
                int i4 = c5150.f16092;
                if (z && i4 == i3 && (c58552 = c5150.f17958) != null && c58552.getClass() == C11355.class) {
                    C11355 c11355 = (C11355) c5150.f17958;
                    C5855[] c5855Arr = c11355.f33989;
                    C5855 c58555 = c11355.f33991;
                    if (c5855Arr != null && c11355.f33990 == 2 && c5855Arr.length >= 2 && c58555 != null && c58555.getClass() == C22643.class && (c58553 = c58555.f17958) != null && c58553.getClass() == C0916.class && c5150.f16094 == (c0916 = (C0916) c58555.f17958) && c0916.f3504 && c0916.f3502 == 0 && c0916.f3503 == i4 && c0916.f17958 == c12910) {
                        C23494 m115642 = m11564(c11355.f33989[0]);
                        C23494 m115643 = m11564(c11355.f33989[1]);
                        if (m115642 != null && m115643 != null) {
                            if (m115642.f17958 == c58555) {
                                c23494 = m115642;
                                m115642 = m115643;
                            } else if (m115643.f17958 == c58555) {
                                c23494 = m115643;
                            }
                            InterfaceC10795 interfaceC107952 = m115642.f75432;
                            if (m11565(m115642) && (m11564 = m11564(m115642.f17958)) != null && m11564.f17958 == c58555) {
                                C5855 c58556 = c12910.f17958;
                                if (c58556 == null || c58556.getClass() != C4299.class) {
                                    c4299 = null;
                                } else {
                                    C4299 c42992 = (C4299) c58556;
                                    if (c42992.f20242 >= 0 && c42992.f20243 != null) {
                                        c4299 = c42992;
                                        c58556 = c42992.f17958;
                                    }
                                }
                                if (m11565(c58556) && (interfaceC10795 = (c234942 = (C23494) c58556).f75432) != null && (c58554 = c234942.f17958) != null && c58554.getClass() == C15026.class) {
                                    boolean m11565 = m11565(c23494);
                                    int max = Math.max(C14403.m34421(interfaceC107952), C14403.m34421(interfaceC10795));
                                    if (c4299 != null) {
                                        max = Math.max(max, C14403.m34421(c4299.f20243));
                                    }
                                    int i5 = -1;
                                    for (int i6 = 0; i6 < max; i6++) {
                                        boolean mo2465 = interfaceC107952.mo2465(i6);
                                        if (mo2465) {
                                            if (i5 < 0 && !Character.isSurrogate((char) i6)) {
                                                i5 = i6;
                                            }
                                        }
                                        boolean mo24652 = interfaceC10795.mo2465(i6);
                                        boolean z2 = c4299 != null && c4299.f20243.mo2465(i6);
                                        if (mo24652 && z2) {
                                            return null;
                                        }
                                        boolean z3 = mo24652 || z2;
                                        if (!m11565 && z3 && Character.isSurrogate((char) i6)) {
                                            return null;
                                        }
                                        if (mo2465 && z3) {
                                            return null;
                                        }
                                        if ((mo2465 || z3) && c23494.f75432.mo2465(i6)) {
                                            return null;
                                        }
                                    }
                                    if (i5 < 0) {
                                        return null;
                                    }
                                    return new C3821(c23494, i5, m11564, c4299, c234942, c12910);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23494 m11564(C5855 c5855) {
        if (c5855 == null) {
            return null;
        }
        Class<?> cls = c5855.getClass();
        if (cls != C23494.class && cls != C8678.class && cls != C10877.class && !m11565(c5855)) {
            return null;
        }
        C23494 c23494 = (C23494) c5855;
        if (c23494.f75432 == null) {
            return null;
        }
        return c23494;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11565(C5855 c5855) {
        return c5855 != null && c5855.getClass() == C19822.class;
    }
}
