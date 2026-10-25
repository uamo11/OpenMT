package l;

/* compiled from: 6428 */
/* renamed from: l.᩹۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22151 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f71881;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C5218 f71882;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20035 f71883;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f71885;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f71886;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5218 f71888;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71889;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5218 f71890;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C5218 f71894;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f71895;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f71896;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15094 f71880 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f71887 = 0;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f71879 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71891 = 0;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f71893 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f71892 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f71884 = 0;

    public C22151(C20035 c20035, int i, C5218 c5218, C5218 c52182, C5218 c52183, C5218 c52184, int i2) {
        this.f71883 = c20035;
        this.f71885 = 0;
        this.f71881 = 0;
        this.f71889 = 0;
        this.f71886 = 0;
        this.f71896 = 0;
        this.f71895 = i;
        this.f71888 = c5218;
        this.f71894 = c52182;
        this.f71882 = c52183;
        this.f71890 = c52184;
        this.f71885 = c20035.m25508();
        this.f71881 = c20035.m25503();
        this.f71889 = c20035.m25512();
        this.f71886 = c20035.m25509();
        this.f71896 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49762(int i, C5218 c5218, C5218 c52182, C5218 c52183, C5218 c52184, int i2, int i3, int i4, int i5, int i6) {
        this.f71895 = i;
        this.f71888 = c5218;
        this.f71894 = c52182;
        this.f71882 = c52183;
        this.f71890 = c52184;
        this.f71885 = i2;
        this.f71881 = i3;
        this.f71889 = i4;
        this.f71886 = i5;
        this.f71896 = i6;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49760() {
        this.f71887 = 0;
        this.f71880 = null;
        this.f71879 = 0;
        this.f71891 = 0;
        this.f71893 = 0;
        this.f71892 = 0;
        this.f71884 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49766(int i) {
        this.f71893 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49767() {
        int i;
        if (this.f71895 == 0) {
            int i2 = this.f71879;
            i = this.f71883.f64927;
            return i2 - i;
        }
        return this.f71879;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49765() {
        int i;
        if (this.f71895 == 1) {
            int i2 = this.f71891;
            i = this.f71883.f64920;
            return i2 - i;
        }
        return this.f71891;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49764(C15094 c15094) {
        int m46202;
        int m46193;
        int i;
        int m462022;
        int i2;
        int m461932;
        int i3 = this.f71895;
        C20035 c20035 = this.f71883;
        if (i3 == 0) {
            m462022 = c20035.m46202(c15094, this.f71896);
            if (c15094.f46124[0] == EnumC8040.MATCH_CONSTRAINT) {
                this.f71884++;
                m462022 = 0;
            }
            i2 = c20035.f64927;
            this.f71879 = m462022 + (c15094.m35735() != 8 ? i2 : 0) + this.f71879;
            m461932 = c20035.m46193(c15094, this.f71896);
            if (this.f71880 == null || this.f71887 < m461932) {
                this.f71880 = c15094;
                this.f71887 = m461932;
                this.f71891 = m461932;
            }
        } else {
            m46202 = c20035.m46202(c15094, this.f71896);
            m46193 = c20035.m46193(c15094, this.f71896);
            if (c15094.f46124[1] == EnumC8040.MATCH_CONSTRAINT) {
                this.f71884++;
                m46193 = 0;
            }
            i = c20035.f64920;
            this.f71891 = m46193 + (c15094.m35735() != 8 ? i : 0) + this.f71891;
            if (this.f71880 == null || this.f71887 < m46202) {
                this.f71880 = c15094;
                this.f71887 = m46202;
                this.f71879 = m46202;
            }
        }
        this.f71892++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49763(int i, boolean z, boolean z2) {
        C20035 c20035;
        int i2;
        int i3;
        C15094[] c15094Arr;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C15094 c15094;
        int i14;
        C15094[] c15094Arr2;
        C5218 c5218;
        C5218 c52182;
        int i15;
        int i16;
        int i17;
        int i18;
        float f2;
        int i19;
        int i20;
        int i21;
        int i22;
        C15094[] c15094Arr3;
        int i23;
        int i24;
        C15094[] c15094Arr4;
        int i25;
        C15094[] c15094Arr5;
        int i26 = this.f71892;
        int i27 = 0;
        while (true) {
            c20035 = this.f71883;
            if (i27 >= i26) {
                break;
            }
            int i28 = this.f71893 + i27;
            i25 = c20035.f64924;
            if (i28 >= i25) {
                break;
            }
            c15094Arr5 = c20035.f64923;
            C15094 c150942 = c15094Arr5[this.f71893 + i27];
            if (c150942 != null) {
                c150942.m35750();
            }
            i27++;
        }
        if (i26 == 0 || this.f71880 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i29 = -1;
        int i30 = -1;
        for (int i31 = 0; i31 < i26; i31++) {
            int i32 = z ? (i26 - 1) - i31 : i31;
            int i33 = this.f71893 + i32;
            i24 = c20035.f64924;
            if (i33 >= i24) {
                break;
            }
            c15094Arr4 = c20035.f64923;
            if (c15094Arr4[this.f71893 + i32].m35735() == 0) {
                if (i29 == -1) {
                    i29 = i31;
                }
                i30 = i31;
            }
        }
        if (this.f71895 != 0) {
            C15094 c150943 = this.f71880;
            i2 = c20035.f64925;
            c150943.f46148 = i2;
            C5218 c52183 = c150943.f46141;
            C5218 c52184 = c150943.f46159;
            int i34 = this.f71885;
            if (i > 0) {
                i11 = c20035.f64927;
                i34 += i11;
            }
            if (z) {
                c52184.m14998(this.f71882, i34);
                if (z2) {
                    c52183.m14998(this.f71888, this.f71889);
                }
                if (i > 0) {
                    this.f71882.f16341.f46141.m14998(c52184, 0);
                }
            } else {
                c52183.m14998(this.f71888, i34);
                if (z2) {
                    c52184.m14998(this.f71882, this.f71889);
                }
                if (i > 0) {
                    this.f71888.f16341.f46159.m14998(c52183, 0);
                }
            }
            C15094 c150944 = null;
            int i35 = 0;
            while (i35 < i26) {
                int i36 = this.f71893 + i35;
                i3 = c20035.f64924;
                if (i36 >= i3) {
                    return;
                }
                c15094Arr = c20035.f64923;
                C15094 c150945 = c15094Arr[this.f71893 + i35];
                if (i35 == 0) {
                    c150945.m35716(c150945.f46161, this.f71894, this.f71881);
                    i7 = c20035.f64913;
                    f = c20035.f64928;
                    if (this.f71893 == 0) {
                        i10 = c20035.f64914;
                        i8 = -1;
                        if (i10 != -1) {
                            i7 = c20035.f64914;
                            f = c20035.f64905;
                            c150945.f46123 = i7;
                            c150945.f46109 = f;
                        }
                    } else {
                        i8 = -1;
                    }
                    if (z2) {
                        i9 = c20035.f64918;
                        if (i9 != i8) {
                            i7 = c20035.f64918;
                            f = c20035.f64919;
                        }
                    }
                    c150945.f46123 = i7;
                    c150945.f46109 = f;
                }
                if (i35 == i26 - 1) {
                    c150945.m35716(c150945.f46133, this.f71890, this.f71886);
                }
                if (c150944 != null) {
                    C5218 c52185 = c150944.f46133;
                    C5218 c52186 = c150945.f46161;
                    i6 = c20035.f64920;
                    c52186.m14998(c52185, i6);
                    if (i35 == i29) {
                        int i37 = this.f71881;
                        if (c52186.m15010()) {
                            c52186.f16342 = i37;
                        }
                    }
                    c52185.m14998(c52186, 0);
                    if (i35 == i30 + 1) {
                        int i38 = this.f71886;
                        if (c52185.m15010()) {
                            c52185.f16342 = i38;
                        }
                    }
                }
                if (c150945 != c150943) {
                    if (z) {
                        i5 = c20035.f64921;
                        if (i5 == 0) {
                            c150945.f46159.m14998(c52184, 0);
                        } else if (i5 == 1) {
                            c150945.f46141.m14998(c52183, 0);
                        } else if (i5 == 2) {
                            c150945.f46141.m14998(c52183, 0);
                            c150945.f46159.m14998(c52184, 0);
                        }
                    } else {
                        i4 = c20035.f64921;
                        if (i4 == 0) {
                            c150945.f46141.m14998(c52183, 0);
                        } else if (i4 == 1) {
                            c150945.f46159.m14998(c52184, 0);
                        } else if (i4 == 2) {
                            if (z3) {
                                c150945.f46141.m14998(this.f71888, this.f71885);
                                c150945.f46159.m14998(this.f71882, this.f71889);
                            } else {
                                c150945.f46141.m14998(c52183, 0);
                                c150945.f46159.m14998(c52184, 0);
                            }
                        }
                    }
                }
                i35++;
                c150944 = c150945;
            }
            return;
        }
        C15094 c150946 = this.f71880;
        i12 = c20035.f64913;
        c150946.f46123 = i12;
        C5218 c52187 = c150946.f46133;
        C5218 c52188 = c150946.f46161;
        int i39 = this.f71881;
        if (i > 0) {
            i23 = c20035.f64920;
            i39 += i23;
        }
        c52188.m14998(this.f71894, i39);
        if (z2) {
            c52187.m14998(this.f71890, this.f71886);
        }
        if (i > 0) {
            this.f71894.f16341.f46133.m14998(c52188, 0);
        }
        i13 = c20035.f64917;
        if (i13 == 3 && !c150946.m35771()) {
            for (int i40 = 0; i40 < i26; i40++) {
                int i41 = z ? (i26 - 1) - i40 : i40;
                int i42 = this.f71893 + i41;
                i22 = c20035.f64924;
                if (i42 >= i22) {
                    break;
                }
                c15094Arr3 = c20035.f64923;
                c15094 = c15094Arr3[this.f71893 + i41];
                if (c15094.m35771()) {
                    break;
                }
            }
        }
        c15094 = c150946;
        C15094 c150947 = null;
        int i43 = 0;
        while (i43 < i26) {
            int i44 = z ? (i26 - 1) - i43 : i43;
            int i45 = this.f71893 + i44;
            i14 = c20035.f64924;
            if (i45 >= i14) {
                return;
            }
            c15094Arr2 = c20035.f64923;
            C15094 c150948 = c15094Arr2[this.f71893 + i44];
            if (i43 == 0) {
                c5218 = c52187;
                c150948.m35716(c150948.f46141, this.f71888, this.f71885);
            } else {
                c5218 = c52187;
            }
            if (i44 == 0) {
                i18 = c20035.f64925;
                f2 = c20035.f64926;
                if (this.f71893 == 0) {
                    i21 = c20035.f64911;
                    i19 = -1;
                    if (i21 != -1) {
                        i18 = c20035.f64911;
                        f2 = c20035.f64904;
                        c150948.f46148 = i18;
                        c150948.f46129 = f2;
                    }
                } else {
                    i19 = -1;
                }
                if (z2) {
                    i20 = c20035.f64908;
                    if (i20 != i19) {
                        i18 = c20035.f64908;
                        f2 = c20035.f64910;
                    }
                }
                c150948.f46148 = i18;
                c150948.f46129 = f2;
            }
            if (i43 == i26 - 1) {
                c150948.m35716(c150948.f46159, this.f71882, this.f71889);
            }
            if (c150947 != null) {
                C5218 c52189 = c150947.f46159;
                C5218 c521810 = c150948.f46141;
                i17 = c20035.f64927;
                c521810.m14998(c52189, i17);
                if (i43 == i29) {
                    int i46 = this.f71885;
                    if (c521810.m15010()) {
                        c521810.f16342 = i46;
                    }
                }
                c52189.m14998(c521810, 0);
                if (i43 == i30 + 1) {
                    int i47 = this.f71889;
                    if (c52189.m15010()) {
                        c52189.f16342 = i47;
                    }
                }
            }
            if (c150948 != c150946) {
                i15 = c20035.f64917;
                if (i15 == 3 && c15094.m35771() && c150948 != c15094 && c150948.m35771()) {
                    c150948.f46126.m14998(c15094.f46126, 0);
                } else {
                    i16 = c20035.f64917;
                    if (i16 == 0) {
                        c52182 = c5218;
                        c150948.f46161.m14998(c52188, 0);
                    } else if (i16 == 1) {
                        c52182 = c5218;
                        c150948.f46133.m14998(c52182, 0);
                    } else if (z3) {
                        c150948.f46161.m14998(this.f71894, this.f71881);
                        c150948.f46133.m14998(this.f71890, this.f71886);
                    } else {
                        c150948.f46161.m14998(c52188, 0);
                        c52182 = c5218;
                        c150948.f46133.m14998(c52182, 0);
                    }
                    i43++;
                    c52187 = c52182;
                    c150947 = c150948;
                }
            }
            c52182 = c5218;
            i43++;
            c52187 = c52182;
            c150947 = c150948;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49761(int i) {
        C20035 c20035;
        int i2;
        C15094[] c15094Arr;
        int m46202;
        int m46193;
        int i3;
        int i4;
        int m461932;
        int i5;
        C15094[] c15094Arr2;
        int i6 = this.f71884;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f71892;
        int i8 = i / i6;
        int i9 = 0;
        while (true) {
            c20035 = this.f71883;
            if (i9 >= i7) {
                break;
            }
            int i10 = this.f71893 + i9;
            i5 = c20035.f64924;
            if (i10 >= i5) {
                break;
            }
            c15094Arr2 = c20035.f64923;
            C15094 c15094 = c15094Arr2[this.f71893 + i9];
            if (this.f71895 == 0) {
                if (c15094 != null) {
                    EnumC8040[] enumC8040Arr = c15094.f46124;
                    if (enumC8040Arr[0] == EnumC8040.MATCH_CONSTRAINT && c15094.f46145 == 0) {
                        c20035.m25502(c15094, EnumC8040.FIXED, i8, enumC8040Arr[1], c15094.m35732());
                    }
                }
            } else if (c15094 != null) {
                EnumC8040[] enumC8040Arr2 = c15094.f46124;
                if (enumC8040Arr2[1] == EnumC8040.MATCH_CONSTRAINT && c15094.f46170 == 0) {
                    c20035.m25502(c15094, enumC8040Arr2[0], c15094.m35753(), EnumC8040.FIXED, i8);
                }
            }
            i9++;
        }
        this.f71879 = 0;
        this.f71891 = 0;
        this.f71880 = null;
        this.f71887 = 0;
        int i11 = this.f71892;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f71893 + i12;
            i2 = c20035.f64924;
            if (i13 >= i2) {
                return;
            }
            c15094Arr = c20035.f64923;
            C15094 c150942 = c15094Arr[this.f71893 + i12];
            if (this.f71895 != 0) {
                m46202 = c20035.m46202(c150942, this.f71896);
                m46193 = c20035.m46193(c150942, this.f71896);
                i3 = c20035.f64920;
                if (c150942.m35735() == 8) {
                    i3 = 0;
                }
                this.f71891 = m46193 + i3 + this.f71891;
                if (this.f71880 == null || this.f71887 < m46202) {
                    this.f71880 = c150942;
                    this.f71887 = m46202;
                    this.f71879 = m46202;
                }
            } else {
                int m35753 = c150942.m35753();
                i4 = c20035.f64927;
                if (c150942.m35735() == 8) {
                    i4 = 0;
                }
                this.f71879 = m35753 + i4 + this.f71879;
                m461932 = c20035.m46193(c150942, this.f71896);
                if (this.f71880 == null || this.f71887 < m461932) {
                    this.f71880 = c150942;
                    this.f71887 = m461932;
                    this.f71891 = m461932;
                }
            }
        }
    }
}
