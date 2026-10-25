package l;

/* compiled from: V702 */
/* renamed from: l.᩵ۢܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19387 implements InterfaceC6311 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62741;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62742;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3158 f62743;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f62744 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19927[] f62745;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f62746;

    public C19387(C3158 c3158) {
        this.f62743 = c3158;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۧ */
    public final int mo11655() {
        int i;
        if (this.f62744 >= 0) {
            return this.f62742;
        }
        i = this.f62743.f9924;
        return i;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۬ */
    public final int mo11659(int i) {
        return this.f62743.f9911[i].f3826.f65062;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֡ */
    public final int mo11639(int i) {
        return this.f62743.f9911[i].f3812;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩵ */
    public final int mo11671(int i) {
        return this.f62743.f9911[i].f3826.f65067;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۧ */
    public final int mo11656(int i) {
        return this.f62743.f9911[i].f3832;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܳ */
    public final int mo11660(int i) {
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3808);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֫ */
    public final int mo11642(int i) {
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3798);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩹ */
    public final int mo11675(int i) {
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3802);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩳ */
    public final int mo11668(int i) {
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3834);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩷ */
    public final int mo11673(int i) {
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3800);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۫ */
    public final int mo11658(int i) {
        int i2 = this.f62744;
        if (i2 >= 0 && i == this.f62742 - 1) {
            return i2;
        }
        long j = this.f62743.f9911[i].f3822;
        if (j < 0) {
            return (int) j;
        }
        long j2 = r0.f9911[i].f3804 + ((int) j);
        int i3 = (int) j2;
        if (j2 == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۠ */
    public final int mo11651(int i) {
        return this.f62743.f9911[i].f3854;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩻ */
    public final int mo11676(int i) {
        return this.f62743.f9911[i].f3807;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۙ */
    public final int mo11648(int i) {
        return this.f62743.f9911[i].f3842;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩶ */
    public final int mo11672(int i) {
        return this.f62743.f9911[i].f3844;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܽ */
    public final long mo11665(int i) {
        return this.f62743.f9911[i].f3793;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܿ */
    public final int mo11666(int i) {
        return this.f62744 >= 0 ? this.f62746[i] : this.f62743.f9911[i].f3847;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۚ */
    public final C19927 mo11649(int i) {
        return this.f62744 >= 0 ? this.f62745[i] : this.f62743.f9911[i].f3815;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۤ */
    public final int mo11654(int i) {
        return this.f62743.f9911[i].f3816.f46299;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܶ */
    public final int mo11662(int i) {
        C15151 c15151 = this.f62743.f9911[i].f3816;
        long j = c15151.f46299 + c15151.f46298;
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۖ */
    public final int mo11645(int i) {
        if (!m44648(i)) {
            return -1;
        }
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3830);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩸ */
    public final int mo11674(int i) {
        if (!m44648(i)) {
            return -1;
        }
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3827);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֨ */
    public final int mo11640(int i) {
        if (!m44648(i)) {
            return -1;
        }
        C3158 c3158 = this.f62743;
        return m44647(c3158.f9911[i], c3158.f9911[i].f3853);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۘ */
    public final int mo11647(int i) {
        return this.f62743.f9911[i].f3821;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۜ */
    public final int mo11650(int i) {
        return this.f62743.f9911[i].f3825;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۢ */
    public final int mo11653(int i) {
        int i2 = this.f62744;
        if (i2 >= 0 && i == this.f62742 - 1) {
            return i2;
        }
        if (this.f62743.f9911[i].f3797 == null) {
            return -1;
        }
        long j = r0.f46299 + r6.f3823;
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // l.InterfaceC6311
    /* renamed from: ۗ */
    public final int mo11646(int i) {
        C1041 c1041 = this.f62743.f9911[i];
        boolean z = c1041.f3794;
        boolean z2 = z;
        if (c1041.f3801) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (c1041.f3791) {
            r0 = (z2 ? 1 : 0) | 4;
        }
        if (c1041.f3832 == 15) {
            return c1041.f3843 ? r0 | 24 : r0 | 8;
        }
        return r0;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private boolean m44648(int i) {
        C1041 c1041 = this.f62743.f9911[i];
        AbstractC20276 abstractC20276 = c1041.f3814;
        if (!(abstractC20276 instanceof C10398) || ((C10398) abstractC20276).f31285 == null) {
            return false;
        }
        int i2 = c1041.f3832;
        return (i2 == 12 || i2 == 13 || i2 == 15) && c1041.f3794;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֫ */
    public final int mo11641() {
        C14446 c14446;
        C3158 c3158 = this.f62743;
        c14446 = c3158.f9870;
        if (c14446 == null) {
            return 1;
        }
        return c3158.f9911[0].f3789;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܽ */
    public final int mo11664() {
        C14446 c14446;
        C14446 c144462;
        if (this.f62744 >= 0) {
            return this.f62741;
        }
        C3158 c3158 = this.f62743;
        c14446 = c3158.f9870;
        if (c14446 == null) {
            return 0;
        }
        c144462 = c3158.f9870;
        return c144462.m34498() - c3158.f9911[0].f3789;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۡ */
    public final int mo11652(int i) {
        C14446 c14446;
        C3158 c3158 = this.f62743;
        c14446 = c3158.f9870;
        if (c14446 == null) {
            return 0;
        }
        return c3158.f9911[i].f3789 - c3158.f9911[0].f3789;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩴ */
    public final int mo11670(int i) {
        return m44649(this.f62743.f9911[i].f3803);
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܺ */
    public final int mo11663(int i) {
        C1041 c1041 = this.f62743.f9911[i];
        AbstractC20276 abstractC20276 = c1041.f3814;
        if (!(abstractC20276 instanceof C10398) || ((C10398) abstractC20276).f31285 == null) {
            return -1;
        }
        int i2 = c1041.f3832;
        if (i2 == 12 || i2 == 13 || i2 == 15) {
            return m44649(c1041.f3831);
        }
        return -1;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m44649(int i) {
        C14446 c14446;
        C3158 c3158 = this.f62743;
        c14446 = c3158.f9870;
        if (c14446 == null || i == 0) {
            return -1;
        }
        int i2 = i - c3158.f9911[0].f3789;
        if (i2 >= 0) {
            return i2;
        }
        throw new C8097(EnumC0335.INVALID_RESULT);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44647(C1041 c1041, int i) {
        if (i < 0) {
            return i;
        }
        long j = c1041.f3804 + i;
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }
}
