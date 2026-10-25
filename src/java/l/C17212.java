package l;

import java.util.Arrays;

/* compiled from: P1JH */
/* renamed from: l.ܿ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17212 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean f52792 = false;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int f52793 = 1000;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10863 f52795;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10863[] f52802;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9452 f52804;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16506 f52805;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f52800 = false;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f52796 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52794 = 32;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52801 = 32;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f52806 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean[] f52803 = new boolean[32];

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52797 = 1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52807 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52808 = 32;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15800[] f52799 = new C15800[f52793];

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52798 = 0;

    public C17212() {
        this.f52802 = null;
        this.f52802 = new C10863[32];
        m40488();
        C16506 c16506 = new C16506();
        c16506.f50723 = new C23562();
        c16506.f50725 = new C23562();
        c16506.f50724 = new C15800[32];
        this.f52805 = c16506;
        this.f52804 = new C9452(c16506);
        this.f52795 = new C10863(c16506);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m40492() {
        int i = this.f52794 * 2;
        this.f52794 = i;
        this.f52802 = (C10863[]) Arrays.copyOf(this.f52802, i);
        C16506 c16506 = this.f52805;
        c16506.f50724 = (C15800[]) Arrays.copyOf(c16506.f50724, this.f52794);
        int i2 = this.f52794;
        this.f52803 = new boolean[i2];
        this.f52801 = i2;
        this.f52808 = i2;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m40488() {
        for (int i = 0; i < this.f52807; i++) {
            C10863 c10863 = this.f52802[i];
            if (c10863 != null) {
                this.f52805.f50723.m52028(c10863);
            }
            this.f52802[i] = null;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40505() {
        C16506 c16506;
        int i = 0;
        while (true) {
            c16506 = this.f52805;
            C15800[] c15800Arr = c16506.f50724;
            if (i >= c15800Arr.length) {
                break;
            }
            C15800 c15800 = c15800Arr[i];
            if (c15800 != null) {
                c15800.m37436();
            }
            i++;
        }
        c16506.f50725.m52027(this.f52798, this.f52799);
        this.f52798 = 0;
        Arrays.fill(c16506.f50724, (Object) null);
        this.f52796 = 0;
        this.f52804.m24289();
        this.f52797 = 1;
        for (int i2 = 0; i2 < this.f52807; i2++) {
            C10863 c10863 = this.f52802[i2];
        }
        m40488();
        this.f52807 = 0;
        this.f52795 = new C10863(c16506);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15800 m40495(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f52797 + 1 >= this.f52801) {
            m40492();
        }
        if (!(obj instanceof C5218)) {
            return null;
        }
        C5218 c5218 = (C5218) obj;
        C15800 m15008 = c5218.m15008();
        if (m15008 == null) {
            c5218.m15006();
            m15008 = c5218.m15008();
        }
        int i = m15008.f48743;
        C16506 c16506 = this.f52805;
        if (i != -1 && i <= this.f52796 && c16506.f50724[i] != null) {
            return m15008;
        }
        if (i != -1) {
            m15008.m37436();
        }
        int i2 = this.f52796 + 1;
        this.f52796 = i2;
        this.f52797++;
        m15008.f48743 = i2;
        m15008.f48744 = EnumC8746.UNRESTRICTED;
        c16506.f50724[i2] = m15008;
        return m15008;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10863 m40493() {
        C16506 c16506 = this.f52805;
        C10863 c10863 = (C10863) c16506.f50723.m52026();
        if (c10863 != null) {
            c10863.f32633 = null;
            c10863.f32635.clear();
            c10863.f32631 = 0.0f;
            c10863.f32632 = false;
            return c10863;
        }
        return new C10863(c16506);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15800 m40501() {
        if (this.f52797 + 1 >= this.f52801) {
            m40492();
        }
        C15800 m40486 = m40486(EnumC8746.SLACK);
        int i = this.f52796 + 1;
        this.f52796 = i;
        this.f52797++;
        m40486.f48743 = i;
        this.f52805.f50724[i] = m40486;
        return m40486;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15800 m40494(int i) {
        if (this.f52797 + 1 >= this.f52801) {
            m40492();
        }
        C15800 m40486 = m40486(EnumC8746.ERROR);
        int i2 = this.f52796 + 1;
        this.f52796 = i2;
        this.f52797++;
        m40486.f48743 = i2;
        m40486.f48737 = i;
        this.f52805.f50724[i2] = m40486;
        this.f52804.m24290(m40486);
        return m40486;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15800 m40486(EnumC8746 enumC8746) {
        C15800 c15800 = (C15800) this.f52805.f50725.m52026();
        if (c15800 == null) {
            c15800 = new C15800(enumC8746);
        } else {
            c15800.m37436();
        }
        c15800.f48744 = enumC8746;
        int i = this.f52798;
        int i2 = f52793;
        if (i >= i2) {
            int i3 = i2 * 2;
            f52793 = i3;
            this.f52799 = (C15800[]) Arrays.copyOf(this.f52799, i3);
        }
        C15800[] c15800Arr = this.f52799;
        int i4 = this.f52798;
        this.f52798 = i4 + 1;
        c15800Arr[i4] = c15800;
        return c15800;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40489(Object obj) {
        C15800 m15008 = ((C5218) obj).m15008();
        if (m15008 != null) {
            return (int) (m15008.f48734 + 0.5f);
        }
        return 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m40506() {
        C9452 c9452 = this.f52804;
        if (c9452.mo24288()) {
            m40491();
            return;
        }
        if (this.f52806) {
            for (int i = 0; i < this.f52807; i++) {
                if (!this.f52802[i].f32632) {
                    m40496(c9452);
                    return;
                }
            }
            m40491();
            return;
        }
        m40496(c9452);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bd, code lost:
    
        if (r13.f48740 <= 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        if (r13.f48740 <= 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e4, code lost:
    
        if (r13.f48740 <= 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f1, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ef, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ed, code lost:
    
        if (r13.f48740 <= 1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m40497(l.C10863 r17) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17212.m40497(l.ۧ۠):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m40490(C10863 c10863) {
        int i;
        if (c10863.f32632) {
            c10863.f32633.m37438(this, c10863.f32631);
        } else {
            C10863[] c10863Arr = this.f52802;
            int i2 = this.f52807;
            c10863Arr[i2] = c10863;
            C15800 c15800 = c10863.f32633;
            c15800.f48738 = i2;
            this.f52807 = i2 + 1;
            c15800.m37439(this, c10863);
        }
        if (this.f52800) {
            int i3 = 0;
            while (i3 < this.f52807) {
                if (this.f52802[i3] == null) {
                    System.out.println("WTF");
                }
                C10863 c108632 = this.f52802[i3];
                if (c108632 != null && c108632.f32632) {
                    c108632.f32633.m37438(this, c108632.f32631);
                    this.f52805.f50723.m52028(c108632);
                    this.f52802[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f52807;
                        if (i4 >= i) {
                            break;
                        }
                        C10863[] c10863Arr2 = this.f52802;
                        int i6 = i4 - 1;
                        C10863 c108633 = c10863Arr2[i4];
                        c10863Arr2[i6] = c108633;
                        C15800 c158002 = c108633.f32633;
                        if (c158002.f48738 == i4) {
                            c158002.f48738 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f52802[i5] = null;
                    }
                    this.f52807 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f52800 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m40487(InterfaceC17918 interfaceC17918) {
        for (int i = 0; i < this.f52797; i++) {
            this.f52803[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f52797 * 2) {
                return;
            }
            C15800 c15800 = ((C10863) interfaceC17918).f32633;
            if (c15800 != null) {
                this.f52803[c15800.f48743] = true;
            }
            C15800 mo24286 = interfaceC17918.mo24286(this.f52803);
            if (mo24286 != null) {
                boolean[] zArr = this.f52803;
                int i3 = mo24286.f48743;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (mo24286 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f52807; i5++) {
                    C10863 c10863 = this.f52802[i5];
                    if (c10863.f32633.f48744 != EnumC8746.UNRESTRICTED && !c10863.f32632 && c10863.f32635.mo5701(mo24286)) {
                        float mo5692 = c10863.f32635.mo5692(mo24286);
                        if (mo5692 < 0.0f) {
                            float f2 = (-c10863.f32631) / mo5692;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C10863 c108632 = this.f52802[i4];
                    c108632.f32633.f48738 = -1;
                    c108632.m27163(mo24286);
                    C15800 c158002 = c108632.f32633;
                    c158002.f48738 = i4;
                    c158002.m37439(this, c108632);
                }
            } else {
                z = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40496(C9452 c9452) {
        int i = 0;
        while (true) {
            if (i >= this.f52807) {
                break;
            }
            C10863 c10863 = this.f52802[i];
            if (c10863.f32633.f48744 != EnumC8746.UNRESTRICTED) {
                float f = 0.0f;
                if (c10863.f32631 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f52807) {
                            C10863 c108632 = this.f52802[i3];
                            if (c108632.f32633.f48744 != EnumC8746.UNRESTRICTED && !c108632.f32632 && c108632.f32631 < f) {
                                int mo5700 = c108632.f32635.mo5700();
                                int i7 = 0;
                                while (i7 < mo5700) {
                                    C15800 mo5694 = c108632.f32635.mo5694(i7);
                                    float mo5692 = c108632.f32635.mo5692(mo5694);
                                    if (mo5692 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = mo5694.f48736[i8] / mo5692;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = mo5694.f48743;
                                                i4 = i3;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            C10863 c108633 = this.f52802[i4];
                            c108633.f32633.f48738 = -1;
                            c108633.m27163(this.f52805.f50724[i5]);
                            C15800 c15800 = c108633.f32633;
                            c15800.f48738 = i4;
                            c15800.m37439(this, c108633);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f52797 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        m40487((InterfaceC17918) c9452);
        m40491();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m40491() {
        for (int i = 0; i < this.f52807; i++) {
            C10863 c10863 = this.f52802[i];
            c10863.f32633.f48734 = c10863.f32631;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16506 m40503() {
        return this.f52805;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40502(C15800 c15800, C15800 c158002, int i, int i2) {
        C10863 m40493 = m40493();
        C15800 m40501 = m40501();
        m40501.f48737 = 0;
        m40493.m27159(c15800, c158002, m40501, i);
        if (i2 != 8) {
            m40493.f32635.mo5697(m40494(i2), (int) (m40493.f32635.mo5692(m40501) * (-1.0f)));
        }
        m40497(m40493);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40504(C15800 c15800, C15800 c158002, int i, int i2) {
        C10863 m40493 = m40493();
        C15800 m40501 = m40501();
        m40501.f48737 = 0;
        m40493.m27164(c15800, c158002, m40501, i);
        if (i2 != 8) {
            m40493.f32635.mo5697(m40494(i2), (int) (m40493.f32635.mo5692(m40501) * (-1.0f)));
        }
        m40497(m40493);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40499(C15800 c15800, C15800 c158002, int i, float f, C15800 c158003, C15800 c158004, int i2, int i3) {
        C10863 m40493 = m40493();
        if (c158002 == c158003) {
            m40493.f32635.mo5697(c15800, 1.0f);
            m40493.f32635.mo5697(c158004, 1.0f);
            m40493.f32635.mo5697(c158002, -2.0f);
        } else if (f == 0.5f) {
            m40493.f32635.mo5697(c15800, 1.0f);
            m40493.f32635.mo5697(c158002, -1.0f);
            m40493.f32635.mo5697(c158003, -1.0f);
            m40493.f32635.mo5697(c158004, 1.0f);
            if (i > 0 || i2 > 0) {
                m40493.f32631 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            m40493.f32635.mo5697(c15800, -1.0f);
            m40493.f32635.mo5697(c158002, 1.0f);
            m40493.f32631 = i;
        } else if (f >= 1.0f) {
            m40493.f32635.mo5697(c158004, -1.0f);
            m40493.f32635.mo5697(c158003, 1.0f);
            m40493.f32631 = -i2;
        } else {
            float f2 = 1.0f - f;
            m40493.f32635.mo5697(c15800, f2 * 1.0f);
            m40493.f32635.mo5697(c158002, f2 * (-1.0f));
            m40493.f32635.mo5697(c158003, (-1.0f) * f);
            m40493.f32635.mo5697(c158004, 1.0f * f);
            if (i > 0 || i2 > 0) {
                m40493.f32631 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            m40493.m27161(this, i3);
        }
        m40497(m40493);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40500(C15800 c15800, C15800 c158002, int i, int i2) {
        if (i2 == 8 && c158002.f48739 && c15800.f48738 == -1) {
            c15800.m37438(this, c158002.f48734 + i);
            return;
        }
        C10863 m40493 = m40493();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m40493.f32631 = i;
        }
        if (!z) {
            m40493.f32635.mo5697(c15800, -1.0f);
            m40493.f32635.mo5697(c158002, 1.0f);
        } else {
            m40493.f32635.mo5697(c15800, 1.0f);
            m40493.f32635.mo5697(c158002, -1.0f);
        }
        if (i2 != 8) {
            m40493.m27161(this, i2);
        }
        m40497(m40493);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40498(C15800 c15800, int i) {
        int i2 = c15800.f48738;
        if (i2 == -1) {
            c15800.m37438(this, i);
            for (int i3 = 0; i3 < this.f52796 + 1; i3++) {
                C15800 c158002 = this.f52805.f50724[i3];
            }
            return;
        }
        if (i2 != -1) {
            C10863 c10863 = this.f52802[i2];
            if (c10863.f32632) {
                c10863.f32631 = i;
                return;
            }
            if (c10863.f32635.mo5700() == 0) {
                c10863.f32632 = true;
                c10863.f32631 = i;
                return;
            }
            C10863 m40493 = m40493();
            if (i < 0) {
                m40493.f32631 = i * (-1);
                m40493.f32635.mo5697(c15800, 1.0f);
            } else {
                m40493.f32631 = i;
                m40493.f32635.mo5697(c15800, -1.0f);
            }
            m40497(m40493);
            return;
        }
        C10863 m404932 = m40493();
        m404932.f32633 = c15800;
        float f = i;
        c15800.f48734 = f;
        m404932.f32631 = f;
        m404932.f32632 = true;
        m40497(m404932);
    }
}
