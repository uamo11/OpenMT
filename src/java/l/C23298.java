package l;

import java.util.ArrayList;

/* compiled from: A7EF */
/* renamed from: l.᩺᩺ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23298 extends C1860 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12010 f74908 = new C12010();

    public C23298(C11738 c11738) {
        this.f6339 = c11738.f6339;
        C6615 c6615 = c11738.f6341;
        this.f6341 = c6615;
        this.f6340 = c11738;
        f74908.m29359(c6615);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x017a, code lost:
    
        r0 = r9.f6339;
        r1 = r9.f6341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
    
        throw l.C19462.m44860(r0, r1.f20363, "Incorrect TypeAnnotation TargetPath PathEntry \"{0}\"", new java.lang.Object[]{r1.f20355});
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018d, code lost:
    
        r1.m18132(l.EnumC15204.f46442);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m51696() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23298.m51696():java.util.ArrayList");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10973 m51697() {
        this.f6341.m18126();
        this.f6341.m18132(EnumC15204.f46642);
        EnumC15204 enumC15204 = this.f6341.f20355;
        InterfaceC12218 m51693 = (enumC15204 == EnumC15204.f46554 || enumC15204 == EnumC15204.f46442) ? null : m51693("default");
        this.f6341.m18132(EnumC15204.f46442);
        C10973 c10973 = new C10973(this.f6340.f35012, EnumC4662.f14806);
        c10973.f33018 = m51693;
        return c10973;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C16636 m51695() {
        C16636 c16636;
        boolean m43388 = EnumC18734.m43388(this.f6341.f20350);
        this.f6341.m18127(" - - - > [ParserAnnotation.parseAnnotation]: Begin ");
        this.f6341.m18126();
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18127(String.format("     [ParserAnnotation.parseAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
            c16636 = new C16636(this.f6340.f35012.m9311(i), m43388);
        } else {
            String str = c6615.f20350;
            c6615.m18127(C20094.m46315("     [ParserAnnotation.parseAnnotation]: value = ", str));
            c16636 = new C16636(this.f6340.f35012.m9312(str), m43388);
        }
        this.f6341.m18126();
        m51694(c16636);
        return c16636;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51694(C16636 c16636) {
        C6615 c6615;
        this.f6341.m18127(" - - - > [ParserAnnotation._scanAnnotation]: Begin");
        this.f6341.m18132(EnumC15204.f46642);
        while (true) {
            c6615 = this.f6341;
            EnumC15204 enumC15204 = c6615.f20355;
            if (enumC15204 == EnumC15204.f46554 || enumC15204 == EnumC15204.f46442) {
                break;
            }
            C15869 m28690 = this.f6340.m28690();
            this.f6341.m18132(EnumC15204.f46608);
            if (m28690.mo18355()) {
                AbstractC2465 abstractC2465 = m28690.f49042;
                if (abstractC2465.f7865 != EnumC10932.f32926) {
                    throw new C12136();
                }
                String mo7938 = abstractC2465.mo7938();
                this.f6341.m18127(C20094.m46315("     [ParserAnnotation._scanAnnotation]: Annot - Field Name: ", mo7938));
                c16636.m39168(new C10993(m28690, m51693(mo7938)));
            } else if (this.f6341.f20355 == EnumC15204.f46579) {
                C15869 m286902 = this.f6340.m28690();
                this.f6341.m18127("     [ParserAnnotation._scanAnnotation]: " + m28690.f20943 + " = " + m286902.f20943);
                c16636.m39168(new C10993(m28690, m286902));
            } else {
                c16636.m39168(new C10993(m28690, m51693("unknown")));
            }
            C6615 c66152 = this.f6341;
            if (c66152.f20355 == EnumC15204.f46591) {
                c66152.m18126();
            }
        }
        c6615.m18132(EnumC15204.f46442);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12218 m51693(String str) {
        C6615 c6615;
        int[] iArr = C20477.f66000;
        int i = 1;
        switch (iArr[this.f6341.f20355.ordinal()]) {
            case 1:
                C3917 c3917 = this.f6339;
                StringBuilder m9834 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: JASM Keyword: (annotation field name: ", str, ") keyword: ");
                m9834.append(this.f6341.f20350);
                c3917.m45778(m9834.toString(), new Object[0]);
                String str2 = this.f6341.f20350;
                int i2 = C20477.f65999[C17987.m42032(str2).ordinal()];
                if (i2 == 1) {
                    this.f6341.m18126();
                    int i3 = iArr[this.f6341.f20355.ordinal()];
                    if (i3 == 1) {
                        String str3 = this.f6341.f20350;
                        str3.getClass();
                        if (!str3.equals("true")) {
                            if (!str3.equals("false")) {
                                throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BOOLEAN.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967() + ", " + EnumC15204.f46574.m35967() + ", " + EnumC15204.f46587.m35967(), this.f6341.f20350});
                            }
                            i = 0;
                        }
                        C3917 c39172 = this.f6339;
                        StringBuilder m98342 = C3200.m9834("Boolean Field: ", str, " = ");
                        m98342.append(this.f6341.f20350);
                        c39172.m45778(m98342.toString(), new Object[0]);
                        C10599 c10599 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i)));
                        this.f6341.m18126();
                        return c10599;
                    }
                    if (i3 == 3) {
                        C10599 c105992 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105992;
                    }
                    if (i3 != 4) {
                        throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BOOLEAN.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                    }
                    C3917 c39173 = this.f6339;
                    StringBuilder m98343 = C3200.m9834("Boolean Field: ", str, " = ");
                    m98343.append(this.f6341.f20360);
                    c39173.m45778(m98343.toString(), new Object[0]);
                    int i4 = this.f6341.f20360;
                    if (i4 > 1 || i4 < 0) {
                        C3917 c39174 = this.f6339;
                        StringBuilder m98344 = C3200.m9834("Warning: Boolean Field: ", str, " value is not 0 or 1, value = ");
                        m98344.append(this.f6341.f20360);
                        c39174.m45778(m98344.toString(), new Object[0]);
                    }
                    C10599 c105993 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i4)));
                    this.f6341.m18126();
                    return c105993;
                }
                if (i2 == 2) {
                    this.f6341.m18126();
                    int i5 = iArr[this.f6341.f20355.ordinal()];
                    if (i5 == 3) {
                        C10599 c105994 = new C10599(EnumC7464.AE_BYTE.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105994;
                    }
                    if (i5 != 4) {
                        throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BYTE.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                    }
                    C3917 c39175 = this.f6339;
                    StringBuilder m98345 = C3200.m9834("Byte Field: ", str, " = ");
                    m98345.append(this.f6341.f20360);
                    c39175.m45778(m98345.toString(), new Object[0]);
                    int i6 = this.f6341.f20360;
                    if (i6 > 255) {
                        C3917 c39176 = this.f6339;
                        StringBuilder m98346 = C3200.m9834("Warning: Byte Field: ", str, " value is greater than 0xFF, value = ");
                        m98346.append(this.f6341.f20360);
                        c39176.m45778(m98346.toString(), new Object[0]);
                    }
                    C10599 c105995 = new C10599(EnumC7464.AE_BYTE.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i6)));
                    this.f6341.m18126();
                    return c105995;
                }
                if (i2 == 3) {
                    this.f6341.m18126();
                    int i7 = iArr[this.f6341.f20355.ordinal()];
                    if (i7 == 3) {
                        C10599 c105996 = new C10599(EnumC7464.AE_CHAR.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105996;
                    }
                    if (i7 == 4) {
                        C3917 c39177 = this.f6339;
                        StringBuilder m98347 = C3200.m9834("Char Field: ", str, " = ");
                        m98347.append(this.f6341.f20360);
                        c39177.m45778(m98347.toString(), new Object[0]);
                        C10599 c105997 = new C10599(EnumC7464.AE_CHAR.m19999(), this.f6340.f35012.m9323(Integer.valueOf(this.f6341.f20360)));
                        this.f6341.m18126();
                        return c105997;
                    }
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_CHAR.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                }
                if (i2 != 4) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation keyword \"{0}\"", new Object[]{str2});
                }
                this.f6341.m18126();
                int i8 = iArr[this.f6341.f20355.ordinal()];
                if (i8 == 3) {
                    C10599 c105998 = new C10599(EnumC7464.AE_SHORT.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                    this.f6341.m18126();
                    return c105998;
                }
                if (i8 != 4) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_SHORT.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                }
                C3917 c39178 = this.f6339;
                StringBuilder m98348 = C3200.m9834("Short Field: ", str, " = ");
                m98348.append(this.f6341.f20360);
                c39178.m45778(m98348.toString(), new Object[0]);
                int i9 = this.f6341.f20360;
                if (i9 > 65535) {
                    C3917 c39179 = this.f6339;
                    StringBuilder m98349 = C3200.m9834("Warning: Short Field: ", str, " value is greater than 0xFFFF, value = ");
                    m98349.append(this.f6341.f20360);
                    c39179.m45778(m98349.toString(), new Object[0]);
                }
                C10599 c105999 = new C10599(EnumC7464.AE_SHORT.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i9)));
                this.f6341.m18126();
                return c105999;
            case 2:
                C3917 c391710 = this.f6339;
                StringBuilder m983410 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: String Field: ", str, " = ");
                m983410.append(this.f6341.f20350);
                c391710.m45778(m983410.toString(), new Object[0]);
                C10599 c1059910 = new C10599(EnumC10932.f32926.m27252(), this.f6340.f35012.m9312(this.f6341.f20350));
                this.f6341.m18126();
                return c1059910;
            case 3:
                C3917 c391711 = this.f6339;
                StringBuilder m983411 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Field by index: ", str, " = #");
                m983411.append(this.f6341.f20350);
                c391711.m45778(m983411.toString(), new Object[0]);
                int parseInt = Integer.parseInt(this.f6341.f20350);
                C15869 m9311 = this.f6340.f35012.m9311(parseInt);
                EnumC10932 m37607 = m9311.m37607();
                InterfaceC12218 c1059911 = m37607.m27255(EnumC10932.f32931, EnumC10932.f32913, EnumC10932.f32923, EnumC10932.f32910, EnumC10932.f32948, EnumC10932.f32926) ? new C10599(m37607.m27252(), m9311) : new C12715(this.f6340.f35012.m9311(parseInt));
                this.f6341.m18126();
                return c1059911;
            case 4:
                C3917 c391712 = this.f6339;
                StringBuilder m983412 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Integer Field: ", str, " = ");
                m983412.append(this.f6341.f20360);
                c391712.m45778(m983412.toString(), new Object[0]);
                C10599 c1059912 = new C10599(EnumC10932.f32913.m27252(), this.f6340.f35012.m9323(Integer.valueOf(this.f6341.f20360)));
                this.f6341.m18126();
                return c1059912;
            case 5:
                C3917 c391713 = this.f6339;
                StringBuilder m983413 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Double Field: ", str, " = ");
                m983413.append(this.f6341.f20366);
                c391713.m45778(m983413.toString(), new Object[0]);
                Long valueOf = Long.valueOf(Double.doubleToLongBits(this.f6341.f20366));
                char m27252 = EnumC10932.f32948.m27252();
                C3046 c3046 = this.f6340.f35012;
                c3046.getClass();
                C10599 c1059913 = new C10599(m27252, c3046.m9314(new C23507(valueOf)));
                this.f6341.m18126();
                return c1059913;
            case 6:
                C3917 c391714 = this.f6339;
                StringBuilder m983414 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Float Field: ", str, " = ");
                m983414.append(this.f6341.f20365);
                c391714.m45778(m983414.toString(), new Object[0]);
                Integer valueOf2 = Integer.valueOf(Float.floatToIntBits(this.f6341.f20365));
                char m272522 = EnumC10932.f32923.m27252();
                C3046 c30462 = this.f6340.f35012;
                c30462.getClass();
                C10599 c1059914 = new C10599(m272522, c30462.m9314(new C9397(valueOf2)));
                this.f6341.m18126();
                return c1059914;
            case 7:
                C3917 c391715 = this.f6339;
                StringBuilder m983415 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Long Field: ", str, " = ");
                m983415.append(this.f6341.f20351);
                c391715.m45778(m983415.toString(), new Object[0]);
                char m272523 = EnumC10932.f32910.m27252();
                C3046 c30463 = this.f6340.f35012;
                Long valueOf3 = Long.valueOf(this.f6341.f20351);
                c30463.getClass();
                C10599 c1059915 = new C10599(m272523, c30463.m9314(new C3752(valueOf3)));
                this.f6341.m18126();
                return c1059915;
            case 8:
                this.f6339.m45778("[ParserAnnotation.scanAnnotationData]:: Class) keyword: " + this.f6341.f20350, new Object[0]);
                this.f6341.m18126();
                int i10 = iArr[this.f6341.f20355.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    C3917 c391716 = this.f6339;
                    StringBuilder m983416 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                    m983416.append(this.f6341.f20350);
                    c391716.m45778(m983416.toString(), new Object[0]);
                    C10599 c1059916 = new C10599(EnumC7464.AE_CLASS.m19999(), this.f6340.f35012.m9312(this.f6341.f20350));
                    this.f6341.m18126();
                    return c1059916;
                }
                if (i10 != 3) {
                    C3917 c391717 = this.f6339;
                    C6615 c66152 = this.f6341;
                    throw C19462.m44860(c391717, c66152.f20363, "Incorrect Annotation (class), expected class name or CP index, got \"{0}\"", new Object[]{c66152.f20350});
                }
                C3917 c391718 = this.f6339;
                StringBuilder m983417 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                m983417.append(this.f6341.f20350);
                c391718.m45778(m983417.toString(), new Object[0]);
                C12715 c12715 = new C12715(this.f6340.f35012.m9311(Integer.valueOf(this.f6341.f20350).intValue()));
                this.f6341.m18126();
                return c12715;
            case 9:
                this.f6339.m45778("[ParserAnnotation.scanAnnotationData]:: Enum) keyword: " + this.f6341.f20350, new Object[0]);
                this.f6341.m18126();
                int i11 = iArr[this.f6341.f20355.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    String str4 = this.f6341.f20350;
                    EnumC7464 enumC7464 = EnumC7464.AE_STRING;
                    enumC7464.m19999();
                    C15869 m9312 = this.f6340.f35012.m9312(str4);
                    this.f6341.m18126();
                    this.f6341.m18132(EnumC15204.f46599);
                    int i12 = iArr[this.f6341.f20355.ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        String str5 = this.f6341.f20350;
                        enumC7464.m19999();
                        C6365 c6365 = new C6365(m9312, this.f6340.f35012.m9312(str5));
                        this.f6341.m18126();
                        return c6365;
                    }
                    if (i12 == 3) {
                        C6365 c63652 = new C6365(m9312, this.f6340.f35012.m9311(this.f6341.f20360));
                        this.f6341.m18126();
                        return c63652;
                    }
                    C3917 c391719 = this.f6339;
                    C6615 c66153 = this.f6341;
                    throw C19462.m44860(c391719, c66153.f20363, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c66153.f20350});
                }
                if (i11 != 3) {
                    C3917 c391720 = this.f6339;
                    C6615 c66154 = this.f6341;
                    throw C19462.m44860(c391720, c66154.f20363, "Incorrect Annotation (enum), expected type_name or CP index, got \"{0}\"", new Object[]{c66154.f20350});
                }
                C6615 c66155 = this.f6341;
                int i13 = c66155.f20360;
                c66155.m18126();
                C6615 c66156 = this.f6341;
                if (c66156.f20355 == EnumC15204.f46599) {
                    c66156.m18126();
                }
                int i14 = iArr[this.f6341.f20355.ordinal()];
                if (i14 == 1 || i14 == 2) {
                    String str6 = this.f6341.f20350;
                    EnumC7464.AE_STRING.m19999();
                    C6365 c63653 = new C6365(this.f6340.f35012.m9311(i13), this.f6340.f35012.m9312(str6));
                    this.f6341.m18126();
                    return c63653;
                }
                if (i14 == 3) {
                    C6365 c63654 = new C6365(this.f6340.f35012.m9311(i13), this.f6340.f35012.m9311(this.f6341.f20360));
                    this.f6341.m18126();
                    return c63654;
                }
                C3917 c391721 = this.f6339;
                C6615 c66157 = this.f6341;
                throw C19462.m44860(c391721, c66157.f20363, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c66157.f20350});
            case 10:
                C3917 c391722 = this.f6339;
                StringBuilder m983418 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Annotation Field: ", str, " = ");
                m983418.append(this.f6341.f20350);
                c391722.m45778(m983418.toString(), new Object[0]);
                C16636 m51695 = m51695();
                C4954 c4954 = new C4954();
                c4954.f15614 = m51695;
                return c4954;
            case 11:
                this.f6339.m45778(C20094.m46315("[ParserAnnotation.scanAnnotationData]:: Annotation Array Field: ", str), new Object[0]);
                this.f6341.m18126();
                C13420 c13420 = new C13420();
                c13420.f40109 = new ArrayList();
                while (true) {
                    c6615 = this.f6341;
                    EnumC15204 enumC15204 = c6615.f20355;
                    if (enumC15204 != EnumC15204.f46554 && enumC15204 != EnumC15204.f46442) {
                        c13420.f40109.add(m51693(C16014.m37867(str, " {}")));
                        C6615 c66158 = this.f6341;
                        if (c66158.f20355 == EnumC15204.f46591) {
                            c66158.m18126();
                        }
                    }
                }
                c6615.m18132(EnumC15204.f46442);
                return c13420;
            default:
                C3917 c391723 = this.f6339;
                C6615 c66159 = this.f6341;
                throw C19462.m44860(c391723, c66159.f20363, "Incorrect Annotation, unrecognized token: \"{0}\"", new Object[]{c66159.f20355});
        }
    }
}
