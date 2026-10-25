package l;

import java.util.Arrays;

/* compiled from: V702 */
/* renamed from: l.ۘۢܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3864 implements InterfaceC6311 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12316;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f12317;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12318;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f12319;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19387 f12320;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f12321;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f12322;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f12323;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f12324;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f12325;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f12326;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f12327;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C19927 f12329;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f12331;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C19927 f12332;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f12333;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12334;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f12335;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f12336;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12337;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f12338;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18681 f12339;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f12340;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f12341;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f12343;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12344;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f12346;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C10545 f12347;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12348;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C16563 f12349;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f12350;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f12351;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f12352;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f12353;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19927[] f12354;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f12356;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12357;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f12358;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f12359;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14986 f12360;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3158 f12361;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f12342 = -1;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f12345 = -1;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f12328 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12355 = -1;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f12330 = -1;

    public C3864(C3158 c3158, C10545 c10545, C14986 c14986, int i, int i2) {
        this.f12361 = c3158;
        this.f12347 = c10545;
        this.f12360 = c14986;
        this.f12321 = i;
        this.f12319 = i2;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m11667() {
        if (m11637()) {
            m11628();
            return true;
        }
        if (this.f12338) {
            return false;
        }
        int i = this.f12352;
        C10545 c10545 = this.f12347;
        if (i >= c10545.m26520() || c10545.m26531(this.f12352) >= this.f12321) {
            this.f12338 = true;
            return false;
        }
        int i2 = this.f12352;
        this.f12352 = i2 + 1;
        m11632(i2, 0);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11657(C18681 c18681) {
        int i;
        C18681 c186812 = this.f12339;
        if (c186812 == null) {
            this.f12339 = c18681;
        } else if (c186812 != c18681) {
            throw new C8097(EnumC0335.INVALID_RESULT);
        }
        if (m11637()) {
            m11628();
            return true;
        }
        boolean m51270 = this.f12361.f9928.m51270();
        int i2 = this.f12319;
        if (m51270 && this.f12355 < 0 && (i = this.f12352) <= i2) {
            this.f12355 = i;
        }
        int i3 = this.f12352;
        if (i3 <= i2) {
            this.f12352 = i3 + 1;
            m11632(i3, 1);
            return true;
        }
        m11636(c18681);
        this.f12339 = null;
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11644(C18681 c18681) {
        int m9629;
        if (this.f12355 >= 0) {
            boolean z = c18681.f59065;
            int i = c18681.f59036;
            if (!z) {
                C3158 c3158 = this.f12361;
                int i2 = i - 1;
                if (c3158.f9911[i2].f3832 == 15) {
                    if (c3158.f9872.m29229()) {
                        c3158.f9872.m29218(this.f12320);
                        return true;
                    }
                    int i3 = this.f12330;
                    C14986 c14986 = this.f12360;
                    C10545 c10545 = this.f12347;
                    if (i3 >= 0) {
                        C1041[] c1041Arr = c3158.f9911;
                        int i4 = this.f12330;
                        int i5 = c1041Arr[i4].f3795;
                        boolean z2 = i4 == i2;
                        int i6 = this.f12344;
                        if (i6 >= 0 && i6 < c10545.m26517()) {
                            int i7 = this.f12344;
                            if (c10545.m26508(i7) == c10545.m26508(i5) && c10545.m26528(i7) == c10545.m26528(i5) && c10545.m26489(i7) == c10545.m26489(i5) && c10545.m26502(i7) == c10545.m26502(i5) && c10545.m26498(i7) == c10545.m26498(i5) && c10545.m26491(i7) == c10545.m26491(i5) && c10545.m26493(i7) == c10545.m26493(i5) && c10545.m26501(i7) == c10545.m26501(i5) && c10545.m26500(i7) == c10545.m26500(i5) && c10545.m26490(i7) == c10545.m26490(i5)) {
                                AbstractC20276 abstractC20276 = c3158.f9928.f74321[c10545.m26508(i7)];
                                if (((!(abstractC20276 instanceof C22392) && !(abstractC20276 instanceof C10398)) || (c10545.m26516(i7) == c10545.m26516(i5) && c10545.m26505(i7) == c10545.m26505(i5))) && ((!(abstractC20276 instanceof C10398) || (c10545.m26507(i7) == c10545.m26507(i5) && c10545.m26495(i7) == c10545.m26495(i5) && c10545.m26483(i7) == c10545.m26483(i5) && c10545.m26523(i7) == c10545.m26523(i5))) && (z2 || (c10545.m26522(i7) == c10545.m26522(i5) && c10545.m26524(i7) == c10545.m26524(i5) && c10545.m26506(i7) == c10545.m26506(i5) && c10545.m26519(i7) == c10545.m26519(i5) && c10545.m26526(i7) == c10545.m26526(i5) && c10545.m26529(i7) == c10545.m26529(i5) && c10545.m26497(i7) == c10545.m26497(i5))))) {
                                    C19927 m26512 = c10545.m26512(this.f12344);
                                    int m26499 = c10545.m26499(this.f12344);
                                    if (m26512 != null) {
                                        try {
                                            if (m26499 > c10545.m26531(this.f12326)) {
                                                this.f12330 = -1;
                                                return true;
                                            }
                                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                                            this.f12330 = -1;
                                            return true;
                                        }
                                    }
                                    this.f12320.f62745[this.f12330] = m26512 == null ? null : m26512.m45897(c14986);
                                    this.f12320.f62746[this.f12330] = m26512 == null ? -1 : C3158.m9629(c14986, m26499);
                                    if (m26512 != null && this.f12320.f62746[this.f12330] < 0) {
                                        this.f12330 = -1;
                                        return true;
                                    }
                                    int m26509 = c10545.m26509(this.f12344);
                                    this.f12344 = m26509;
                                    int i8 = this.f12330 - 1;
                                    this.f12330 = i8;
                                    if (i8 < 0 && m26509 == -1) {
                                        C11956 c11956 = c3158.f9872;
                                        C19387 c19387 = this.f12320;
                                        c11956.m29221(c19387.f62744, c18681.f59070, c18681.f59073, this.f12332, c19387, 0);
                                        return true;
                                    }
                                }
                            }
                        }
                        this.f12330 = -1;
                        return true;
                    }
                    int i9 = this.f12355;
                    int i10 = this.f12319;
                    if (i9 > i10 || !c3158.f9872.m29227()) {
                        this.f12355 = -1;
                    } else {
                        int i11 = this.f12355;
                        this.f12355 = i11 + 1;
                        if (c10545.m26511(i11) && c10545.m26513(i11) == i && c10545.m26503(i11) == c10545.m26503(i10) && c10545.m26486(i11) <= c10545.m26486(i10) && (m9629 = C3158.m9629(c14986, c10545.m26531(i11))) >= 0 && m9629 <= c18681.f59043) {
                            try {
                                this.f12332 = c10545.m26521(i11).m45897(c14986);
                                if (this.f12320 == null) {
                                    C19387 c193872 = new C19387(c3158);
                                    this.f12320 = c193872;
                                    c193872.f62742 = i;
                                    c193872.f62745 = new C19927[i];
                                    c193872.f62746 = new int[i];
                                }
                                C19387 c193873 = this.f12320;
                                c193873.f62744 = m9629;
                                c193873.f62741 = c10545.m26486(i11);
                                this.f12326 = i11;
                                this.f12330 = i2;
                                this.f12344 = c10545.m26525(i11);
                            } catch (IllegalArgumentException | IndexOutOfBoundsException unused2) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11636(C18681 c18681) {
        if (this.f12340) {
            return;
        }
        C3158 c3158 = this.f12361;
        c3158.f9872.m29215(c18681.f59070, c18681.f59041, c18681.f59073);
        this.f12337 = 0;
        this.f12346 = 0;
        this.f12348 = 0;
        this.f12328 = c3158.f9872.m29224();
        c18681.f59075 = c3158.f9872.m29226();
        c18681.f59046 = this.f12328;
        this.f12340 = true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m11669() {
        if (this.f12340 && this.f12328 >= 0 && !m11637()) {
            C3158 c3158 = this.f12361;
            if (!c3158.f9872.m29229()) {
                c3158.f9872.m29219(true);
                this.f12318 = 0;
                this.f12337 = 0;
                this.f12336 = 0;
                this.f12346 = 0;
                this.f12348 = 0;
                this.f12328 = -1L;
                this.f12340 = false;
                return;
            }
        }
        throw new C8097(EnumC0335.INVALID_RESULT);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m11677() {
        if (this.f12340 && this.f12328 >= 0 && !m11637()) {
            C3158 c3158 = this.f12361;
            if (!c3158.f9872.m29229()) {
                c3158.f9872.m29216(this.f12328);
                this.f12318 = 0;
                this.f12337 = 0;
                this.f12336 = 0;
                this.f12346 = 0;
                this.f12348 = 0;
                this.f12328 = -1L;
                this.f12340 = false;
                return;
            }
        }
        throw new C8097(EnumC0335.INVALID_RESULT);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11643(int i, C16563 c16563) {
        this.f12342 = i;
        this.f12349 = c16563;
        this.f12318 = 0;
        this.f12337 = 0;
        this.f12336 = 0;
        this.f12346 = 0;
        this.f12348 = 0;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m11661() {
        if (m11637()) {
            m11628();
            return true;
        }
        if (this.f12342 < 0) {
            return false;
        }
        int i = this.f12352;
        C10545 c10545 = this.f12347;
        if (i >= c10545.m26520()) {
            return false;
        }
        int i2 = this.f12352;
        this.f12352 = i2 + 1;
        if (c10545.m26531(i2) >= this.f12342 && c10545.m26518(i2) >= this.f12342 && (this.f12345 < 0 || c10545.m26518(i2) <= this.f12345)) {
            m11632(i2, 2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if ((r9 - r7.f12324) == r7.f12316) goto L98;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11632(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3864.m11632(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        if (r11 == r5.m26496()) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022a, code lost:
    
        if (r13 != (-1)) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0268, code lost:
    
        if (((r9 instanceof l.C10398) && ((l.C10398) r9).f31285 != null && (r8 == 12 || r8 == 13 || r8 == 15)) == (r14 >= 0)) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0243, code lost:
    
        if (r13 != r8) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01d9, code lost:
    
        if (r11 == r5.m26493(r12)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01fc, code lost:
    
        if (r11 == r5.m26495(r12)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x028b, code lost:
    
        if (r5.m26526(r1) >= (-1)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02c0, code lost:
    
        if (m11624(r5.m26505(r1), r7) != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ca, code lost:
    
        if (r8 == 1) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0331, code lost:
    
        if (m11625(r9, r1, r7) != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0382, code lost:
    
        if (r5.m26524(r1) == r7) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03b8, code lost:
    
        if (r5.m26495(r1) == (r4.f9928.m51270() ? r5.m26493(r1) : r5.m26496())) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03c9, code lost:
    
        if (r5.m26524(r1) <= r7) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x041d, code lost:
    
        if (r5.m26495(r1) == (r4.f9928.m51270() ? r5.m26493(r1) : r5.m26496())) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0369, code lost:
    
        if (r9.f31280 != false) goto L302;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0428  */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11628() {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3864.m11628():void");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m11637() {
        return this.f12350 != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11623(boolean z) {
        int max;
        this.f12325 = z;
        if (this.f12336 == 0) {
            int[] iArr = this.f12335;
            this.f12335 = this.f12323;
            this.f12323 = iArr;
            m11631();
            return;
        }
        int[] iArr2 = this.f12335;
        if (iArr2 == null || iArr2.length < this.f12353) {
            if (iArr2 == null) {
                max = Math.max(16, this.f12353);
            } else {
                max = Math.max(this.f12353, iArr2.length << 1);
            }
            int[] iArr3 = this.f12335;
            this.f12335 = iArr3 == null ? new int[max] : Arrays.copyOf(iArr3, max);
        }
        this.f12334 = this.f12336;
        this.f12350 = 4;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m11631() {
        int max;
        int i = this.f12353;
        this.f12318 = i;
        if (!this.f12325) {
            this.f12346 = this.f12348;
            m11630();
            return;
        }
        int[] iArr = this.f12359;
        if (iArr == null || iArr.length < i) {
            if (iArr == null) {
                max = Math.max(16, i);
            } else {
                max = Math.max(i, iArr.length << 1);
            }
            int[] iArr2 = this.f12359;
            this.f12359 = iArr2 == null ? new int[max] : Arrays.copyOf(iArr2, max);
        }
        this.f12334 = this.f12348;
        this.f12350 = 5;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m11630() {
        this.f12350 = 0;
        this.f12329 = null;
        this.f12325 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m11625(C10398 c10398, int i, int i2) {
        C10545 c10545 = this.f12347;
        int m26483 = c10545.m26483(i);
        int m26523 = c10545.m26523(i);
        int m26524 = c10545.m26524(i);
        int m26507 = c10545.m26507(i);
        int m26495 = c10545.m26495(i);
        int m26492 = c10545.m26492(i);
        int m26493 = c10545.m26493(i);
        boolean z = (m26492 & 1) == 0 ? !(c10398.f31280 || m26495 != m26493) : !(c10545.m26527(i) != m26495 || c10545.m26484(i) < m26495 || c10545.m26484(i) > m26493 || c10545.m26494(i) < m26507 || c10545.m26494(i) > m26495);
        if (m26483 >= 0) {
            int[] iArr = c10398.f31285.f25454;
            if (m26483 < iArr.length && m26523 == iArr[m26483] && m26523 >= 0 && m26507 >= c10545.m26491(i) && m26507 <= m26495 && m26495 <= m26493 && m26524 >= m26507 && m26524 <= m26495 && m26524 <= i2 && z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m11624(int i, int i2) {
        if (i >= 0 && i <= i2) {
            try {
                if (m11634(i) >= 0) {
                    return true;
                }
            } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            }
        }
        return false;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m11634(int i) {
        if (i < 0) {
            return i;
        }
        boolean z = this.f12351;
        C14986 c14986 = this.f12360;
        if (!z) {
            int m9629 = C3158.m9629(c14986, i);
            if (m9629 >= 0) {
                return m9629;
            }
            throw new IllegalArgumentException("Ambiguous checkpoint offset");
        }
        int m35503 = c14986.m35503(i, EnumC0875.AFTER);
        long m35509 = c14986.m35509() - c14986.m35507();
        if (m35503 < 0 || m35503 - i != m35509) {
            throw new IllegalArgumentException("Checkpoint offset does not move with suffix");
        }
        return m35503;
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m11638(int i) {
        int checkIndex = C11003.checkIndex(i, this.f12353);
        return checkIndex < this.f12336 ? this.f12335[checkIndex] : this.f12323[checkIndex];
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private AbstractC20276 m11627(int i) {
        return this.f12361.f9928.f74321[this.f12347.m26508(m11638(i))];
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private boolean m11626(int i) {
        return (m11627(i) instanceof C10398) && this.f12347.m26489(m11638(i)) != 2;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo11655() {
        return this.f12353;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo11659(int i) {
        return this.f12347.m26508(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int mo11639(int i) {
        return this.f12347.m26498(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo11671(int i) {
        return this.f12347.m26502(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo11656(int i) {
        return this.f12347.m26489(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo11660(int i) {
        return m11634(this.f12347.m26528(m11638(i)));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo11642(int i) {
        if ((m11627(i) instanceof C22392) || m11626(i)) {
            return m11634(this.f12347.m26516(m11638(i)));
        }
        return 0;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo11675(int i) {
        boolean z = m11627(i) instanceof C22392;
        C10545 c10545 = this.f12347;
        if (!z) {
            AbstractC20276 m11627 = m11627(i);
            if (!(m11627 instanceof C10398) || ((C10398) m11627).f31281 == null || c10545.m26489(m11638(i)) == 2) {
                return 0;
            }
        }
        return m11634(c10545.m26505(m11638(i)));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo11668(int i) {
        if (m11626(i)) {
            return m11634(this.f12347.m26507(m11638(i)));
        }
        return 0;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo11673(int i) {
        if (m11626(i)) {
            return (((C10398) m11627(i)).f31285 == null && m11633(i)) ? this.f12361.f9922 : m11634(this.f12347.m26495(m11638(i)));
        }
        return 0;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo11658(int i) {
        if (m11626(i)) {
            return m11634(this.f12347.m26522(m11638(i)));
        }
        return 0;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int mo11651(int i) {
        return this.f12347.m26519(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo11676(int i) {
        return this.f12347.m26526(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11648(int i) {
        return this.f12347.m26506(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int mo11672(int i) {
        return this.f12347.m26529(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo11665(int i) {
        return this.f12347.m26497(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo11666(int i) {
        int[] iArr = this.f12358;
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19927 mo11649(int i) {
        C19927[] c19927Arr = this.f12354;
        if (c19927Arr == null) {
            return null;
        }
        return c19927Arr[i];
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo11654(int i) {
        if (m11633(i)) {
            return 0;
        }
        return m11634(this.f12347.m26491(m11638(i)));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo11662(int i) {
        return m11633(i) ? this.f12361.f9922 : m11634(this.f12347.m26493(m11638(i)));
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private boolean m11633(int i) {
        if (!this.f12361.f9928.m51270()) {
            return true;
        }
        int m11638 = m11638(i);
        C10545 c10545 = this.f12347;
        return c10545.m26491(m11638) == 0 && c10545.m26493(m11638) == c10545.m26496();
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo11645(int i) {
        if (m11629(i)) {
            return m11634(this.f12347.m26527(m11638(i)));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo11674(int i) {
        if (m11629(i)) {
            return m11634(this.f12347.m26484(m11638(i)));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo11640(int i) {
        if (m11629(i)) {
            return m11634(this.f12347.m26494(m11638(i)));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo11647(int i) {
        if (m11635(i)) {
            return this.f12347.m26483(m11638(i));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int mo11650(int i) {
        if (m11635(i)) {
            return this.f12347.m26523(m11638(i));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int mo11653(int i) {
        if (m11635(i)) {
            return m11634(this.f12347.m26524(m11638(i)));
        }
        return -1;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int mo11646(int i) {
        if (m11635(i)) {
            return this.f12347.m26492(m11638(i));
        }
        return 0;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m11635(int i) {
        AbstractC20276 m11627 = m11627(i);
        int m26489 = this.f12347.m26489(m11638(i));
        if (!(m11627 instanceof C10398) || ((C10398) m11627).f31285 == null) {
            return false;
        }
        return m26489 == 12 || m26489 == 13 || m26489 == 15;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private boolean m11629(int i) {
        return m11635(i) && (this.f12347.m26492(m11638(i)) & 1) != 0;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo11641() {
        return this.f12324;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo11664() {
        return this.f12316;
    }

    @Override // l.InterfaceC6311
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo11652(int i) {
        return this.f12347.m26501(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo11670(int i) {
        return this.f12347.m26500(m11638(i));
    }

    @Override // l.InterfaceC6311
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int mo11663(int i) {
        return this.f12347.m26490(m11638(i));
    }
}
