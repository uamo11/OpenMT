package l;

import java.util.ArrayList;

/* compiled from: 819P */
/* renamed from: l.ᩴܶ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18829 extends AbstractC8245 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C17417 f59402;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11568 f59403;

    public C18829(C15094 c15094) {
        super(c15094);
        C17417 c17417 = new C17417(this);
        this.f59402 = c17417;
        this.f59403 = null;
        this.f25382.f53268 = EnumC18123.TOP;
        this.f25379.f53268 = EnumC18123.BOTTOM;
        c17417.f53268 = EnumC18123.BASELINE;
        this.f25378 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f25376.m35751();
    }

    @Override // l.AbstractC8245
    /* renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
        this.f25379.m40762();
        this.f59402.m40762();
        this.f25374.m40762();
        this.f25383 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43506() {
        this.f25383 = false;
        C17417 c17417 = this.f25382;
        c17417.m40762();
        c17417.f53276 = false;
        C17417 c174172 = this.f25379;
        c174172.m40762();
        c174172.f53276 = false;
        C17417 c174173 = this.f59402;
        c174173.m40762();
        c174173.f53276 = false;
        this.f25374.f53276 = false;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܳ */
    public final boolean mo6243() {
        return this.f25377 != EnumC8040.MATCH_CONSTRAINT || this.f25376.f46170 == 0;
    }

    @Override // l.AbstractC8245, l.InterfaceC11068
    /* renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        C15094 c15094;
        int i;
        float f;
        int i2;
        if (C4012.f12741[this.f25381.ordinal()] == 3) {
            C15094 c150942 = this.f25376;
            m21830(c150942.f46161, c150942.f46133, 1);
            return;
        }
        C14594 c14594 = this.f25374;
        if (c14594.f53270 && !c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
            C15094 c150943 = this.f25376;
            int i3 = c150943.f46170;
            if (i3 != 2) {
                if (i3 == 3 && c150943.f46156.f25374.f53276) {
                    int m35776 = c150943.m35776();
                    if (m35776 == -1) {
                        c15094 = this.f25376;
                        i = c15094.f46156.f25374.f53271;
                    } else if (m35776 == 0) {
                        f = r1.f46156.f25374.f53271 * this.f25376.f46108;
                        i2 = (int) (f + 0.5f);
                        c14594.mo34849(i2);
                    } else if (m35776 == 1) {
                        c15094 = this.f25376;
                        i = c15094.f46156.f25374.f53271;
                    } else {
                        i2 = 0;
                        c14594.mo34849(i2);
                    }
                    f = i / c15094.f46108;
                    i2 = (int) (f + 0.5f);
                    c14594.mo34849(i2);
                }
            } else {
                C15094 c150944 = c150943.f46132;
                if (c150944 != null) {
                    if (c150944.f46140.f25374.f53276) {
                        c14594.mo34849((int) ((r1.f53271 * c150943.f46157) + 0.5f));
                    }
                }
            }
        }
        C17417 c17417 = this.f25382;
        boolean z = c17417.f53270;
        ArrayList arrayList = c17417.f53275;
        if (z) {
            C17417 c174172 = this.f25379;
            boolean z2 = c174172.f53270;
            ArrayList arrayList2 = c174172.f53275;
            if (z2) {
                if (c17417.f53276 && c174172.f53276 && c14594.f53276) {
                    return;
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
                    C15094 c150945 = this.f25376;
                    if (c150945.f46145 == 0 && !c150945.m35749()) {
                        C17417 c174173 = (C17417) arrayList.get(0);
                        C17417 c174174 = (C17417) arrayList2.get(0);
                        int i4 = c174173.f53271 + c17417.f53272;
                        int i5 = c174174.f53271 + c174172.f53272;
                        c17417.mo34849(i4);
                        c174172.mo34849(i5);
                        c14594.mo34849(i5 - i4);
                        return;
                    }
                }
                if (!c14594.f53276 && this.f25377 == EnumC8040.MATCH_CONSTRAINT && this.f25380 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17417 c174175 = (C17417) arrayList.get(0);
                    int i6 = (((C17417) arrayList2.get(0)).f53271 + c174172.f53272) - (c174175.f53271 + c17417.f53272);
                    int i7 = c14594.f44683;
                    if (i6 < i7) {
                        c14594.mo34849(i6);
                    } else {
                        c14594.mo34849(i7);
                    }
                }
                if (c14594.f53276 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17417 c174176 = (C17417) arrayList.get(0);
                    C17417 c174177 = (C17417) arrayList2.get(0);
                    int i8 = c174176.f53271 + c17417.f53272;
                    int i9 = c174177.f53271 + c174172.f53272;
                    float m35730 = this.f25376.m35730();
                    if (c174176 == c174177) {
                        i8 = c174176.f53271;
                        i9 = c174177.f53271;
                        m35730 = 0.5f;
                    }
                    c17417.mo34849((int) ((((i9 - i8) - c14594.f53271) * m35730) + i8 + 0.5f));
                    c174172.mo34849(c17417.f53271 + c14594.f53271);
                }
            }
        }
    }

    @Override // l.AbstractC8245
    /* renamed from: ֫ */
    public final void mo6240() {
        C15094 c15094;
        C15094 c150942;
        C15094 c150943;
        C15094 c150944;
        C15094 c150945 = this.f25376;
        boolean z = c150945.f46117;
        C14594 c14594 = this.f25374;
        if (z) {
            c14594.mo34849(c150945.m35732());
        }
        boolean z2 = c14594.f53276;
        ArrayList arrayList = c14594.f53269;
        ArrayList arrayList2 = c14594.f53275;
        C17417 c17417 = this.f25379;
        C17417 c174172 = this.f25382;
        if (!z2) {
            C15094 c150946 = this.f25376;
            this.f25377 = c150946.f46124[1];
            if (c150946.m35771()) {
                this.f59403 = new C11568(this);
            }
            EnumC8040 enumC8040 = this.f25377;
            if (enumC8040 != EnumC8040.MATCH_CONSTRAINT) {
                if (enumC8040 == EnumC8040.MATCH_PARENT && (c150944 = this.f25376.f46132) != null && c150944.f46124[1] == EnumC8040.FIXED) {
                    int m35732 = (c150944.m35732() - this.f25376.f46161.m15007()) - this.f25376.f46133.m15007();
                    AbstractC8245.m21828(c174172, c150944.f46140.f25382, this.f25376.f46161.m15007());
                    AbstractC8245.m21828(c17417, c150944.f46140.f25379, -this.f25376.f46133.m15007());
                    c14594.mo34849(m35732);
                    return;
                }
                if (enumC8040 == EnumC8040.FIXED) {
                    c14594.mo34849(this.f25376.m35732());
                }
            }
        } else if (this.f25377 == EnumC8040.MATCH_PARENT && (c150942 = (c15094 = this.f25376).f46132) != null && c150942.f46124[1] == EnumC8040.FIXED) {
            AbstractC8245.m21828(c174172, c150942.f46140.f25382, c15094.f46161.m15007());
            AbstractC8245.m21828(c17417, c150942.f46140.f25379, -this.f25376.f46133.m15007());
            return;
        }
        boolean z3 = c14594.f53276;
        C17417 c174173 = this.f59402;
        if (z3) {
            C15094 c150947 = this.f25376;
            if (c150947.f46117) {
                C5218[] c5218Arr = c150947.f46135;
                C5218 c5218 = c5218Arr[2];
                C5218 c52182 = c5218.f16339;
                if (c52182 != null && c5218Arr[3].f16339 != null) {
                    if (c150947.m35749()) {
                        c174172.f53272 = this.f25376.f46135[2].m15007();
                        c17417.f53272 = -this.f25376.f46135[3].m15007();
                    } else {
                        C17417 m21826 = AbstractC8245.m21826(this.f25376.f46135[2]);
                        if (m21826 != null) {
                            AbstractC8245.m21828(c174172, m21826, this.f25376.f46135[2].m15007());
                        }
                        C17417 m218262 = AbstractC8245.m21826(this.f25376.f46135[3]);
                        if (m218262 != null) {
                            AbstractC8245.m21828(c17417, m218262, -this.f25376.f46135[3].m15007());
                        }
                        c174172.f53265 = true;
                        c17417.f53265 = true;
                    }
                    if (this.f25376.m35771()) {
                        AbstractC8245.m21828(c174173, c174172, this.f25376.m35756());
                        return;
                    }
                    return;
                }
                if (c52182 != null) {
                    C17417 m218263 = AbstractC8245.m21826(c5218);
                    if (m218263 != null) {
                        AbstractC8245.m21828(c174172, m218263, this.f25376.f46135[2].m15007());
                        AbstractC8245.m21828(c17417, c174172, c14594.f53271);
                        if (this.f25376.m35771()) {
                            AbstractC8245.m21828(c174173, c174172, this.f25376.m35756());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5218 c52183 = c5218Arr[3];
                if (c52183.f16339 != null) {
                    C17417 m218264 = AbstractC8245.m21826(c52183);
                    if (m218264 != null) {
                        AbstractC8245.m21828(c17417, m218264, -this.f25376.f46135[3].m15007());
                        AbstractC8245.m21828(c174172, c17417, -c14594.f53271);
                    }
                    if (this.f25376.m35771()) {
                        AbstractC8245.m21828(c174173, c174172, this.f25376.m35756());
                        return;
                    }
                    return;
                }
                C5218 c52184 = c5218Arr[4];
                if (c52184.f16339 != null) {
                    C17417 m218265 = AbstractC8245.m21826(c52184);
                    if (m218265 != null) {
                        AbstractC8245.m21828(c174173, m218265, 0);
                        AbstractC8245.m21828(c174172, c174173, -this.f25376.m35756());
                        AbstractC8245.m21828(c17417, c174172, c14594.f53271);
                        return;
                    }
                    return;
                }
                if ((c150947 instanceof C12978) || c150947.f46132 == null || c150947.mo9453(EnumC0278.CENTER).f16339 != null) {
                    return;
                }
                C15094 c150948 = this.f25376;
                AbstractC8245.m21828(c174172, c150948.f46132.f46140.f25382, c150948.m35775());
                AbstractC8245.m21828(c17417, c174172, c14594.f53271);
                if (this.f25376.m35771()) {
                    AbstractC8245.m21828(c174173, c174172, this.f25376.m35756());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f25377 != EnumC8040.MATCH_CONSTRAINT) {
            c14594.m40763((AbstractC8245) this);
        } else {
            C15094 c150949 = this.f25376;
            int i = c150949.f46170;
            if (i == 2) {
                C15094 c1509410 = c150949.f46132;
                if (c1509410 != null) {
                    C14594 c145942 = c1509410.f46140.f25374;
                    arrayList2.add(c145942);
                    c145942.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c174172);
                    arrayList.add(c17417);
                }
            } else if (i == 3 && !c150949.m35749()) {
                C15094 c1509411 = this.f25376;
                if (c1509411.f46145 != 3) {
                    C14594 c145943 = c1509411.f46156.f25374;
                    arrayList2.add(c145943);
                    c145943.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c174172);
                    arrayList.add(c17417);
                }
            }
        }
        C15094 c1509412 = this.f25376;
        C5218[] c5218Arr2 = c1509412.f46135;
        C5218 c52185 = c5218Arr2[2];
        C5218 c52186 = c52185.f16339;
        if (c52186 != null && c5218Arr2[3].f16339 != null) {
            if (c1509412.m35749()) {
                c174172.f53272 = this.f25376.f46135[2].m15007();
                c17417.f53272 = -this.f25376.f46135[3].m15007();
            } else {
                C17417 m218266 = AbstractC8245.m21826(this.f25376.f46135[2]);
                C17417 m218267 = AbstractC8245.m21826(this.f25376.f46135[3]);
                m218266.m40763((AbstractC8245) this);
                m218267.m40763((AbstractC8245) this);
                this.f25381 = EnumC1189.CENTER;
            }
            if (this.f25376.m35771()) {
                m21831(c174173, c174172, 1, this.f59403);
            }
        } else if (c52186 != null) {
            C17417 m218268 = AbstractC8245.m21826(c52185);
            if (m218268 != null) {
                AbstractC8245.m21828(c174172, m218268, this.f25376.f46135[2].m15007());
                m21831(c17417, c174172, 1, c14594);
                if (this.f25376.m35771()) {
                    m21831(c174173, c174172, 1, this.f59403);
                }
                EnumC8040 enumC80402 = this.f25377;
                EnumC8040 enumC80403 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC80402 == enumC80403) {
                    C15094 c1509413 = this.f25376;
                    if (c1509413.f46108 > 0.0f) {
                        C16005 c16005 = c1509413.f46156;
                        if (c16005.f25377 == enumC80403) {
                            c16005.f25374.f53269.add(c14594);
                            arrayList2.add(this.f25376.f46156.f25374);
                            c14594.f53267 = this;
                        }
                    }
                }
            }
        } else {
            C5218 c52187 = c5218Arr2[3];
            if (c52187.f16339 != null) {
                C17417 m218269 = AbstractC8245.m21826(c52187);
                if (m218269 != null) {
                    AbstractC8245.m21828(c17417, m218269, -this.f25376.f46135[3].m15007());
                    m21831(c174172, c17417, -1, c14594);
                    if (this.f25376.m35771()) {
                        m21831(c174173, c174172, 1, this.f59403);
                    }
                }
            } else {
                C5218 c52188 = c5218Arr2[4];
                if (c52188.f16339 != null) {
                    C17417 m2182610 = AbstractC8245.m21826(c52188);
                    if (m2182610 != null) {
                        AbstractC8245.m21828(c174173, m2182610, 0);
                        m21831(c174172, c174173, -1, this.f59403);
                        m21831(c17417, c174172, 1, c14594);
                    }
                } else if (!(c1509412 instanceof C12978) && (c150943 = c1509412.f46132) != null) {
                    AbstractC8245.m21828(c174172, c150943.f46140.f25382, c1509412.m35775());
                    m21831(c17417, c174172, 1, c14594);
                    if (this.f25376.m35771()) {
                        m21831(c174173, c174172, 1, this.f59403);
                    }
                    EnumC8040 enumC80404 = this.f25377;
                    EnumC8040 enumC80405 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC80404 == enumC80405) {
                        C15094 c1509414 = this.f25376;
                        if (c1509414.f46108 > 0.0f) {
                            C16005 c160052 = c1509414.f46156;
                            if (c160052.f25377 == enumC80405) {
                                c160052.f25374.f53269.add(c14594);
                                arrayList2.add(this.f25376.f46156.f25374);
                                c14594.f53267 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c14594.f53270 = true;
        }
    }

    @Override // l.AbstractC8245
    /* renamed from: ۧ */
    public final void mo6242() {
        C17417 c17417 = this.f25382;
        if (c17417.f53276) {
            this.f25376.m35731(c17417.f53271);
        }
    }
}
