package l;

import java.util.ArrayList;

/* compiled from: S1AA */
/* renamed from: l.ܺܶ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16005 extends AbstractC8245 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int[] f49379 = new int[2];

    public C16005(C15094 c15094) {
        super(c15094);
        this.f25382.f53268 = EnumC18123.LEFT;
        this.f25379.f53268 = EnumC18123.RIGHT;
        this.f25378 = 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.f25376.m35751();
    }

    @Override // l.AbstractC8245
    /* renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
        this.f25379.m40762();
        this.f25374.m40762();
        this.f25383 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37817() {
        this.f25383 = false;
        C17417 c17417 = this.f25382;
        c17417.m40762();
        c17417.f53276 = false;
        C17417 c174172 = this.f25379;
        c174172.m40762();
        c174172.f53276 = false;
        this.f25374.f53276 = false;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܳ */
    public final boolean mo6243() {
        return this.f25377 != EnumC8040.MATCH_CONSTRAINT || this.f25376.f46145 == 0;
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
            c14594.mo34849(c150945.m35753());
        }
        boolean z2 = c14594.f53276;
        ArrayList arrayList = c14594.f53269;
        ArrayList arrayList2 = c14594.f53275;
        C17417 c17417 = this.f25379;
        C17417 c174172 = this.f25382;
        if (z2) {
            EnumC8040 enumC8040 = this.f25377;
            EnumC8040 enumC80402 = EnumC8040.MATCH_PARENT;
            if (enumC8040 == enumC80402 && (((c150942 = (c15094 = this.f25376).f46132) != null && c150942.f46124[0] == EnumC8040.FIXED) || c150942.f46124[0] == enumC80402)) {
                AbstractC8245.m21828(c174172, c150942.f46156.f25382, c15094.f46141.m15007());
                AbstractC8245.m21828(c17417, c150942.f46156.f25379, -this.f25376.f46159.m15007());
                return;
            }
        } else {
            C15094 c150946 = this.f25376;
            EnumC8040 enumC80403 = c150946.f46124[0];
            this.f25377 = enumC80403;
            if (enumC80403 != EnumC8040.MATCH_CONSTRAINT) {
                EnumC8040 enumC80404 = EnumC8040.MATCH_PARENT;
                if (enumC80403 == enumC80404 && (((c150944 = c150946.f46132) != null && c150944.f46124[0] == EnumC8040.FIXED) || c150944.f46124[0] == enumC80404)) {
                    int m35753 = (c150944.m35753() - this.f25376.f46141.m15007()) - this.f25376.f46159.m15007();
                    AbstractC8245.m21828(c174172, c150944.f46156.f25382, this.f25376.f46141.m15007());
                    AbstractC8245.m21828(c17417, c150944.f46156.f25379, -this.f25376.f46159.m15007());
                    c14594.mo34849(m35753);
                    return;
                }
                if (enumC80403 == EnumC8040.FIXED) {
                    c14594.mo34849(c150946.m35753());
                }
            }
        }
        if (c14594.f53276) {
            C15094 c150947 = this.f25376;
            if (c150947.f46117) {
                C5218[] c5218Arr = c150947.f46135;
                C5218 c5218 = c5218Arr[0];
                C5218 c52182 = c5218.f16339;
                if (c52182 != null && c5218Arr[1].f16339 != null) {
                    if (c150947.m35729()) {
                        c174172.f53272 = this.f25376.f46135[0].m15007();
                        c17417.f53272 = -this.f25376.f46135[1].m15007();
                        return;
                    }
                    C17417 m21826 = AbstractC8245.m21826(this.f25376.f46135[0]);
                    if (m21826 != null) {
                        AbstractC8245.m21828(c174172, m21826, this.f25376.f46135[0].m15007());
                    }
                    C17417 m218262 = AbstractC8245.m21826(this.f25376.f46135[1]);
                    if (m218262 != null) {
                        AbstractC8245.m21828(c17417, m218262, -this.f25376.f46135[1].m15007());
                    }
                    c174172.f53265 = true;
                    c17417.f53265 = true;
                    return;
                }
                if (c52182 != null) {
                    C17417 m218263 = AbstractC8245.m21826(c5218);
                    if (m218263 != null) {
                        AbstractC8245.m21828(c174172, m218263, this.f25376.f46135[0].m15007());
                        AbstractC8245.m21828(c17417, c174172, c14594.f53271);
                        return;
                    }
                    return;
                }
                C5218 c52183 = c5218Arr[1];
                if (c52183.f16339 != null) {
                    C17417 m218264 = AbstractC8245.m21826(c52183);
                    if (m218264 != null) {
                        AbstractC8245.m21828(c17417, m218264, -this.f25376.f46135[1].m15007());
                        AbstractC8245.m21828(c174172, c17417, -c14594.f53271);
                        return;
                    }
                    return;
                }
                if ((c150947 instanceof C12978) || c150947.f46132 == null || c150947.mo9453(EnumC0278.CENTER).f16339 != null) {
                    return;
                }
                C15094 c150948 = this.f25376;
                AbstractC8245.m21828(c174172, c150948.f46132.f46156.f25382, c150948.m35774());
                AbstractC8245.m21828(c17417, c174172, c14594.f53271);
                return;
            }
        }
        if (this.f25377 == EnumC8040.MATCH_CONSTRAINT) {
            C15094 c150949 = this.f25376;
            int i = c150949.f46145;
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
            } else if (i == 3) {
                if (c150949.f46170 == 3) {
                    c174172.f53267 = this;
                    c17417.f53267 = this;
                    C18829 c18829 = c150949.f46140;
                    c18829.f25382.f53267 = this;
                    c18829.f25379.f53267 = this;
                    c14594.f53267 = this;
                    if (c150949.m35749()) {
                        arrayList2.add(this.f25376.f46140.f25374);
                        this.f25376.f46140.f25374.f53269.add(c14594);
                        C18829 c188292 = this.f25376.f46140;
                        c188292.f25374.f53267 = this;
                        arrayList2.add(c188292.f25382);
                        arrayList2.add(this.f25376.f46140.f25379);
                        this.f25376.f46140.f25382.f53269.add(c14594);
                        this.f25376.f46140.f25379.f53269.add(c14594);
                    } else if (this.f25376.m35729()) {
                        this.f25376.f46140.f25374.f53275.add(c14594);
                        arrayList.add(this.f25376.f46140.f25374);
                    } else {
                        this.f25376.f46140.f25374.f53275.add(c14594);
                    }
                } else {
                    C14594 c145943 = c150949.f46140.f25374;
                    arrayList2.add(c145943);
                    c145943.f53269.add(c14594);
                    this.f25376.f46140.f25382.f53269.add(c14594);
                    this.f25376.f46140.f25379.f53269.add(c14594);
                    c14594.f53265 = true;
                    arrayList.add(c174172);
                    arrayList.add(c17417);
                    c174172.f53275.add(c14594);
                    c17417.f53275.add(c14594);
                }
            }
        }
        C15094 c1509411 = this.f25376;
        C5218[] c5218Arr2 = c1509411.f46135;
        C5218 c52184 = c5218Arr2[0];
        C5218 c52185 = c52184.f16339;
        if (c52185 != null && c5218Arr2[1].f16339 != null) {
            if (c1509411.m35729()) {
                c174172.f53272 = this.f25376.f46135[0].m15007();
                c17417.f53272 = -this.f25376.f46135[1].m15007();
                return;
            }
            C17417 m218265 = AbstractC8245.m21826(this.f25376.f46135[0]);
            C17417 m218266 = AbstractC8245.m21826(this.f25376.f46135[1]);
            m218265.m40763((AbstractC8245) this);
            m218266.m40763((AbstractC8245) this);
            this.f25381 = EnumC1189.CENTER;
            return;
        }
        if (c52185 != null) {
            C17417 m218267 = AbstractC8245.m21826(c52184);
            if (m218267 != null) {
                AbstractC8245.m21828(c174172, m218267, this.f25376.f46135[0].m15007());
                m21831(c17417, c174172, 1, c14594);
                return;
            }
            return;
        }
        C5218 c52186 = c5218Arr2[1];
        if (c52186.f16339 != null) {
            C17417 m218268 = AbstractC8245.m21826(c52186);
            if (m218268 != null) {
                AbstractC8245.m21828(c17417, m218268, -this.f25376.f46135[1].m15007());
                m21831(c174172, c17417, -1, c14594);
                return;
            }
            return;
        }
        if ((c1509411 instanceof C12978) || (c150943 = c1509411.f46132) == null) {
            return;
        }
        AbstractC8245.m21828(c174172, c150943.f46156.f25382, c1509411.m35774());
        m21831(c17417, c174172, 1, c14594);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37816(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0257, code lost:
    
        if (r4 != 1) goto L124;
     */
    @Override // l.AbstractC8245, l.InterfaceC11068
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6241(l.InterfaceC11068 r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16005.mo6241(l.ۧܶ):void");
    }

    @Override // l.AbstractC8245
    /* renamed from: ۧ */
    public final void mo6242() {
        C17417 c17417 = this.f25382;
        if (c17417.f53276) {
            this.f25376.m35706(c17417.f53271);
        }
    }
}
