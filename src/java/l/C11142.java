package l;

/* compiled from: 18UV */
/* renamed from: l.ۧܿۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11142 extends AbstractC18197 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f33448;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f33449;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f33450;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f33451;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f33452;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f33453;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f33454;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33455;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f33456;

    @Override // l.AbstractC18197
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ boolean mo26321(AbstractC18197 abstractC18197) {
        return false;
    }

    public C11142(int i, C13312 c13312, int i2, C23156 c23156, int i3, String str, String str2) {
        super(i, c13312, i2);
        AbstractC14545 of;
        int i4;
        int i5 = 0;
        this.f33451 = C11010.m27352(i3, false);
        int i6 = this.f56580.f25628;
        int i7 = c23156.f35567;
        AbstractC14545 abstractC14545 = c23156.f35573;
        int i8 = i6 & (~i7);
        this.f33454 = (i8 & 1) != 0;
        this.f33453 = (i8 & 2) != 0;
        if (str2 != null) {
            of = AbstractC14545.of((Object) str2);
        } else {
            of = abstractC14545.isEmpty() ? AbstractC14545.of((Object) "") : abstractC14545;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= of.size()) {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            } else {
                i4 = C6908.m18691(this.f56580, (String) of.get(i9), c23156.f35562);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f33449 = i9;
        this.f33452 = i4;
        int i10 = str2 != null ? 1088 : c23156.f35574;
        int i11 = this.f56580.f25608;
        int i12 = C6908.f21317;
        int bitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.f33456 = bitCount;
        this.f33448 = (1088 & this.f56580.f25608) != 0;
        int m18691 = C6908.m18691(this.f56580, str, C6908.m18693(str) == null);
        this.f33455 = m18691;
        boolean z = i4 > 0 || (abstractC14545.isEmpty() && bitCount > 0) || this.f33454 || (this.f33453 && m18691 > 0);
        if (C11010.m27352(i3, c23156.f74426) && z) {
            i5 = 1;
        }
        this.f33450 = i5;
    }

    @Override // l.AbstractC18197
    /* renamed from: ֫ */
    public final int mo26319() {
        return this.f33450;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C11142 c11142) {
        AbstractC6497 mo17951 = AbstractC6497.m17946().mo17952(this.f33451, c11142.f33451).mo17951(Integer.valueOf(this.f33449), Integer.valueOf(c11142.f33449), AbstractC10232.m25861().mo22482());
        int i = c11142.f33452;
        int i2 = this.f33452;
        AbstractC6497 mo17949 = mo17951.mo17949(i2, i);
        int i3 = c11142.f33456;
        int i4 = this.f33456;
        AbstractC6497 mo179492 = mo17949.mo17949(i4, i3).mo17952(this.f33454, c11142.f33454).mo17951(Boolean.valueOf(this.f33453), Boolean.valueOf(c11142.f33453), i2 == 0 ? AbstractC10232.m25861() : AbstractC10232.m25861().mo22482()).mo17949(this.f33455, c11142.f33455);
        if (i4 == 0) {
            mo179492 = mo179492.mo17953(this.f33448, c11142.f33448);
        }
        return mo179492.mo17948();
    }
}
