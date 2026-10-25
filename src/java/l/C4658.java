package l;

import com.google.android.material.slider.BaseSlider;

/* compiled from: T41H */
/* renamed from: l.ۙ۬֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4658 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C4314 f14779 = new C4314();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Integer f14780 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Integer f14781 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Integer f14782 = 1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20661 f14783;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4658 m13638(C2903 c2903) {
        C4314 c4314 = f14779;
        C4658 c4658 = (C4658) c2903.m8838(c4314);
        if (c4658 != null) {
            return c4658;
        }
        C4658 c46582 = new C4658();
        c2903.m8841(c4314, c46582);
        c46582.f14783 = C20661.m47250(c2903);
        return c46582;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m13637(boolean z) {
        return z ? f14782 : f14781;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m13639(int i, AbstractC4308 abstractC4308) {
        C20661 c20661 = this.f14783;
        try {
            Object mo12915 = abstractC4308.mo12915();
            if (i == 0) {
                return abstractC4308;
            }
            if (i == 257) {
                return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() == 0));
            }
            if (i == 130) {
                return c20661.f66452.mo3257(Integer.valueOf(~((Number) mo12915).intValue()));
            }
            if (i == 131) {
                return c20661.f66470.mo3257(Long.valueOf(~((Number) mo12915).longValue()));
            }
            switch (i) {
                case 116:
                    return c20661.f66452.mo3257(Integer.valueOf(-((Number) mo12915).intValue()));
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    return c20661.f66470.mo3257(Long.valueOf(-((Number) mo12915).longValue()));
                case 118:
                    return c20661.f66483.mo3257(Float.valueOf(-((Number) mo12915).floatValue()));
                case 119:
                    return c20661.f66499.mo3257(Double.valueOf(-((Number) mo12915).doubleValue()));
                default:
                    switch (i) {
                        case 153:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() == 0));
                        case EnumC17734.f54268 /* 154 */:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() != 0));
                        case 155:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() < 0));
                        case 156:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() >= 0));
                        case 157:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() > 0));
                        case 158:
                            return c20661.f66469.mo3257(m13637(((Number) mo12915).intValue() <= 0));
                        default:
                            return null;
                    }
            }
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x049b A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:9:0x0013, B:11:0x0019, B:25:0x03df, B:27:0x03f0, B:29:0x03ff, B:32:0x0410, B:34:0x0419, B:37:0x042a, B:39:0x0433, B:42:0x0444, B:44:0x044d, B:47:0x045e, B:49:0x0467, B:52:0x0478, B:54:0x0481, B:57:0x0492, B:59:0x02f2, B:61:0x0304, B:63:0x030b, B:65:0x031d, B:67:0x0324, B:69:0x0334, B:73:0x033f, B:75:0x0346, B:77:0x034d, B:79:0x035f, B:81:0x0366, B:83:0x0378, B:85:0x037f, B:87:0x038f, B:91:0x039a, B:93:0x03a1, B:95:0x03a8, B:97:0x03ba, B:99:0x03c1, B:101:0x03d1, B:103:0x03d8, B:105:0x0229, B:107:0x0241, B:109:0x0249, B:110:0x024e, B:112:0x024c, B:113:0x0264, B:115:0x027c, B:117:0x0284, B:118:0x0289, B:120:0x0287, B:121:0x029f, B:123:0x02b7, B:125:0x02bf, B:126:0x02c4, B:128:0x02c2, B:129:0x02da, B:131:0x049b, B:133:0x04b3, B:135:0x04cb, B:137:0x04e3, B:139:0x04fb, B:141:0x0045, B:143:0x005d, B:145:0x0075, B:147:0x008d, B:149:0x00a5, B:151:0x00bd, B:153:0x00d5, B:155:0x00ed, B:157:0x0105, B:159:0x011e, B:161:0x0137, B:163:0x0150, B:165:0x0169, B:167:0x0181, B:169:0x0199, B:171:0x01b1, B:173:0x01c9, B:175:0x01e1, B:177:0x01f9, B:179:0x0211, B:181:0x0513, B:184:0x0525, B:186:0x052e, B:189:0x0540, B:191:0x0549), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:9:0x0013, B:11:0x0019, B:25:0x03df, B:27:0x03f0, B:29:0x03ff, B:32:0x0410, B:34:0x0419, B:37:0x042a, B:39:0x0433, B:42:0x0444, B:44:0x044d, B:47:0x045e, B:49:0x0467, B:52:0x0478, B:54:0x0481, B:57:0x0492, B:59:0x02f2, B:61:0x0304, B:63:0x030b, B:65:0x031d, B:67:0x0324, B:69:0x0334, B:73:0x033f, B:75:0x0346, B:77:0x034d, B:79:0x035f, B:81:0x0366, B:83:0x0378, B:85:0x037f, B:87:0x038f, B:91:0x039a, B:93:0x03a1, B:95:0x03a8, B:97:0x03ba, B:99:0x03c1, B:101:0x03d1, B:103:0x03d8, B:105:0x0229, B:107:0x0241, B:109:0x0249, B:110:0x024e, B:112:0x024c, B:113:0x0264, B:115:0x027c, B:117:0x0284, B:118:0x0289, B:120:0x0287, B:121:0x029f, B:123:0x02b7, B:125:0x02bf, B:126:0x02c4, B:128:0x02c2, B:129:0x02da, B:131:0x049b, B:133:0x04b3, B:135:0x04cb, B:137:0x04e3, B:139:0x04fb, B:141:0x0045, B:143:0x005d, B:145:0x0075, B:147:0x008d, B:149:0x00a5, B:151:0x00bd, B:153:0x00d5, B:155:0x00ed, B:157:0x0105, B:159:0x011e, B:161:0x0137, B:163:0x0150, B:165:0x0169, B:167:0x0181, B:169:0x0199, B:171:0x01b1, B:173:0x01c9, B:175:0x01e1, B:177:0x01f9, B:179:0x0211, B:181:0x0513, B:184:0x0525, B:186:0x052e, B:189:0x0540, B:191:0x0549), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04cb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:9:0x0013, B:11:0x0019, B:25:0x03df, B:27:0x03f0, B:29:0x03ff, B:32:0x0410, B:34:0x0419, B:37:0x042a, B:39:0x0433, B:42:0x0444, B:44:0x044d, B:47:0x045e, B:49:0x0467, B:52:0x0478, B:54:0x0481, B:57:0x0492, B:59:0x02f2, B:61:0x0304, B:63:0x030b, B:65:0x031d, B:67:0x0324, B:69:0x0334, B:73:0x033f, B:75:0x0346, B:77:0x034d, B:79:0x035f, B:81:0x0366, B:83:0x0378, B:85:0x037f, B:87:0x038f, B:91:0x039a, B:93:0x03a1, B:95:0x03a8, B:97:0x03ba, B:99:0x03c1, B:101:0x03d1, B:103:0x03d8, B:105:0x0229, B:107:0x0241, B:109:0x0249, B:110:0x024e, B:112:0x024c, B:113:0x0264, B:115:0x027c, B:117:0x0284, B:118:0x0289, B:120:0x0287, B:121:0x029f, B:123:0x02b7, B:125:0x02bf, B:126:0x02c4, B:128:0x02c2, B:129:0x02da, B:131:0x049b, B:133:0x04b3, B:135:0x04cb, B:137:0x04e3, B:139:0x04fb, B:141:0x0045, B:143:0x005d, B:145:0x0075, B:147:0x008d, B:149:0x00a5, B:151:0x00bd, B:153:0x00d5, B:155:0x00ed, B:157:0x0105, B:159:0x011e, B:161:0x0137, B:163:0x0150, B:165:0x0169, B:167:0x0181, B:169:0x0199, B:171:0x01b1, B:173:0x01c9, B:175:0x01e1, B:177:0x01f9, B:179:0x0211, B:181:0x0513, B:184:0x0525, B:186:0x052e, B:189:0x0540, B:191:0x0549), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:9:0x0013, B:11:0x0019, B:25:0x03df, B:27:0x03f0, B:29:0x03ff, B:32:0x0410, B:34:0x0419, B:37:0x042a, B:39:0x0433, B:42:0x0444, B:44:0x044d, B:47:0x045e, B:49:0x0467, B:52:0x0478, B:54:0x0481, B:57:0x0492, B:59:0x02f2, B:61:0x0304, B:63:0x030b, B:65:0x031d, B:67:0x0324, B:69:0x0334, B:73:0x033f, B:75:0x0346, B:77:0x034d, B:79:0x035f, B:81:0x0366, B:83:0x0378, B:85:0x037f, B:87:0x038f, B:91:0x039a, B:93:0x03a1, B:95:0x03a8, B:97:0x03ba, B:99:0x03c1, B:101:0x03d1, B:103:0x03d8, B:105:0x0229, B:107:0x0241, B:109:0x0249, B:110:0x024e, B:112:0x024c, B:113:0x0264, B:115:0x027c, B:117:0x0284, B:118:0x0289, B:120:0x0287, B:121:0x029f, B:123:0x02b7, B:125:0x02bf, B:126:0x02c4, B:128:0x02c2, B:129:0x02da, B:131:0x049b, B:133:0x04b3, B:135:0x04cb, B:137:0x04e3, B:139:0x04fb, B:141:0x0045, B:143:0x005d, B:145:0x0075, B:147:0x008d, B:149:0x00a5, B:151:0x00bd, B:153:0x00d5, B:155:0x00ed, B:157:0x0105, B:159:0x011e, B:161:0x0137, B:163:0x0150, B:165:0x0169, B:167:0x0181, B:169:0x0199, B:171:0x01b1, B:173:0x01c9, B:175:0x01e1, B:177:0x01f9, B:179:0x0211, B:181:0x0513, B:184:0x0525, B:186:0x052e, B:189:0x0540, B:191:0x0549), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04fb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:9:0x0013, B:11:0x0019, B:25:0x03df, B:27:0x03f0, B:29:0x03ff, B:32:0x0410, B:34:0x0419, B:37:0x042a, B:39:0x0433, B:42:0x0444, B:44:0x044d, B:47:0x045e, B:49:0x0467, B:52:0x0478, B:54:0x0481, B:57:0x0492, B:59:0x02f2, B:61:0x0304, B:63:0x030b, B:65:0x031d, B:67:0x0324, B:69:0x0334, B:73:0x033f, B:75:0x0346, B:77:0x034d, B:79:0x035f, B:81:0x0366, B:83:0x0378, B:85:0x037f, B:87:0x038f, B:91:0x039a, B:93:0x03a1, B:95:0x03a8, B:97:0x03ba, B:99:0x03c1, B:101:0x03d1, B:103:0x03d8, B:105:0x0229, B:107:0x0241, B:109:0x0249, B:110:0x024e, B:112:0x024c, B:113:0x0264, B:115:0x027c, B:117:0x0284, B:118:0x0289, B:120:0x0287, B:121:0x029f, B:123:0x02b7, B:125:0x02bf, B:126:0x02c4, B:128:0x02c2, B:129:0x02da, B:131:0x049b, B:133:0x04b3, B:135:0x04cb, B:137:0x04e3, B:139:0x04fb, B:141:0x0045, B:143:0x005d, B:145:0x0075, B:147:0x008d, B:149:0x00a5, B:151:0x00bd, B:153:0x00d5, B:155:0x00ed, B:157:0x0105, B:159:0x011e, B:161:0x0137, B:163:0x0150, B:165:0x0169, B:167:0x0181, B:169:0x0199, B:171:0x01b1, B:173:0x01c9, B:175:0x01e1, B:177:0x01f9, B:179:0x0211, B:181:0x0513, B:184:0x0525, B:186:0x052e, B:189:0x0540, B:191:0x0549), top: B:2:0x0004 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC4308 m13640(int r10, l.AbstractC4308 r11, l.AbstractC4308 r12) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4658.m13640(int, l.ۙ֨֨, l.ۙ֨֨):l.ۙ֨֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m13641(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C20661 c20661 = this.f14783;
        if (abstractC4308.f13890.f17560 == abstractC43082.f13890.f17560) {
            return abstractC4308;
        }
        if (abstractC4308.mo12914()) {
            Object mo12915 = abstractC4308.mo12915();
            switch (C20181.f65309[abstractC43082.mo3258().ordinal()]) {
                case 1:
                    return c20661.f66502.mo3257(Integer.valueOf((byte) ((Number) mo12915).intValue()));
                case 2:
                    return c20661.f66454.mo3257(Integer.valueOf((char) ((Number) mo12915).intValue()));
                case 3:
                    return c20661.f66513.mo3257(Integer.valueOf((short) ((Number) mo12915).intValue()));
                case 4:
                    return c20661.f66452.mo3257(Integer.valueOf(((Number) mo12915).intValue()));
                case 5:
                    return c20661.f66470.mo3257(Long.valueOf(((Number) mo12915).longValue()));
                case 6:
                    return c20661.f66483.mo3257(Float.valueOf(((Number) mo12915).floatValue()));
                case 7:
                    return c20661.f66499.mo3257(Double.valueOf(((Number) mo12915).doubleValue()));
            }
        }
        return abstractC43082;
    }
}
