package l;

/* compiled from: 71RJ */
/* renamed from: l.ۘ᩷֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4182 extends AbstractC2771 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2065 f13629;

    public C4182(C15469 c15469, int i, int i2, int i3, int i4, int i5, int i6, int i7, C4265 c4265) {
        super(c15469, AbstractC13644.m32778(i3, Math.max(i4, 1), 272, i5, i6, i7, c4265), i, i2, i3, i5);
        this.f13629 = null;
    }

    @Override // l.AbstractC2771
    /* renamed from: ܿ */
    public final int mo8560() {
        int i;
        int i2;
        int i3;
        if (this.f8626 == -1) {
            this.f13629 = m8561();
        }
        this.f8631 = -1;
        AbstractC13644 abstractC13644 = this.f8630;
        int min = Math.min(abstractC13644.m32781(), 273);
        int i4 = 1;
        if (min < 2) {
            return 1;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f8635;
            int[] iArr = this.f53746;
            if (i5 < 4) {
                int m32787 = abstractC13644.m32787(iArr[i5], min);
                if (m32787 >= 2) {
                    if (m32787 >= i8) {
                        this.f8631 = i5;
                        m8554(m32787 - 1);
                        return m32787;
                    }
                    if (m32787 > i6) {
                        i7 = i5;
                        i6 = m32787;
                    }
                }
                i5++;
            } else {
                C2065 c2065 = this.f13629;
                int i9 = c2065.f6889;
                if (i9 > 0) {
                    int i10 = i9 - 1;
                    i2 = c2065.f6891[i10];
                    i = c2065.f6890[i10];
                    if (i2 >= i8) {
                        this.f8631 = i + 4;
                        m8554(i2 - 1);
                        return i2;
                    }
                    while (true) {
                        C2065 c20652 = this.f13629;
                        int i11 = c20652.f6889;
                        if (i11 <= i4) {
                            break;
                        }
                        int[] iArr2 = c20652.f6891;
                        int i12 = i11 - 2;
                        if (i2 != iArr2[i12] + 1) {
                            break;
                        }
                        int[] iArr3 = c20652.f6890;
                        if (iArr3[i12] >= (i >>> 7)) {
                            break;
                        }
                        c20652.f6889 = i11 - 1;
                        int i13 = i11 - 2;
                        i2 = iArr2[i13];
                        i = iArr3[i13];
                        i4 = 1;
                    }
                    i3 = 1;
                    if (i2 == 2 && i >= 128) {
                        i2 = 1;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 1;
                }
                if (i6 >= 2 && (i6 + 1 >= i2 || ((i6 + 2 >= i2 && i >= 512) || (i6 + 3 >= i2 && i >= 32768)))) {
                    this.f8631 = i7;
                    m8554(i6 - 1);
                    return i6;
                }
                if (i2 >= 2 && min > 2) {
                    C2065 m8561 = m8561();
                    this.f13629 = m8561;
                    int i14 = m8561.f6889;
                    if (i14 > 0) {
                        int i15 = i14 - 1;
                        int i16 = m8561.f6891[i15];
                        int i17 = m8561.f6890[i15];
                        if (i16 < i2 || i17 >= i) {
                            int i18 = i2 + 1;
                            if (i16 == i18 && i >= (i17 >>> 7)) {
                                return i3;
                            }
                            if (i16 <= i18) {
                                if (i16 + 1 >= i2 && i2 >= 3 && i17 < (i >>> 7)) {
                                    return i3;
                                }
                            }
                        }
                    }
                    int max = Math.max(i2 - 1, 2);
                    for (int i19 = 0; i19 < 4; i19++) {
                        if (abstractC13644.m32787(iArr[i19], max) != max) {
                        }
                    }
                    this.f8631 = i + 4;
                    m8554(i2 - 2);
                    return i2;
                }
                return i3;
            }
        }
    }
}
