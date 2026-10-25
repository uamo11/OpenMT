package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import l.C20696;
import l.C5693;

/* loaded from: classes.dex */
public final class DynamicColor {
    public final Function background;
    public final ContrastCurve contrastCurve;
    public final HashMap hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function opacity;
    public final Function palette;
    public final Function secondBackground;
    public final Function tone;
    public final Function toneDeltaPair;

    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public DynamicColor(String str, Function function, Function function2, boolean z, Function function3, Function function4, ContrastCurve contrastCurve, Function function5) {
        this.hctCache = new HashMap();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public DynamicColor(String str, Function function, Function function2, boolean z, Function function3, Function function4, ContrastCurve contrastCurve, Function function5, Function function6) {
        this.hctCache = new HashMap();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    public static DynamicColor fromPalette(String str, Function function, Function function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    public static DynamicColor fromPalette(String str, Function function, Function function2, boolean z) {
        return new DynamicColor(str, function, function2, z, null, null, null, null);
    }

    public static DynamicColor fromArgb(String str, int i) {
        Hct fromInt = Hct.fromInt(i);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette lambda$fromArgb$0;
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }, new C5693(1, fromInt));
    }

    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        Function function = this.opacity;
        if (function == null) {
            return i;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) function.apply(dynamicScheme)).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = (Hct) this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = ((TonalPalette) this.palette.apply(dynamicScheme)).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(DynamicScheme dynamicScheme) {
        double min;
        double max;
        boolean z = dynamicScheme.contrastLevel < 0.0d;
        Function function = this.toneDeltaPair;
        if (function != null) {
            ToneDeltaPair toneDeltaPair = (ToneDeltaPair) function.apply(dynamicScheme);
            DynamicColor roleA = toneDeltaPair.getRoleA();
            DynamicColor roleB = toneDeltaPair.getRoleB();
            double delta = toneDeltaPair.getDelta();
            TonePolarity polarity = toneDeltaPair.getPolarity();
            boolean stayTogether = toneDeltaPair.getStayTogether();
            double tone = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
            boolean z2 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
            DynamicColor dynamicColor = z2 ? roleA : roleB;
            if (!z2) {
                roleB = roleA;
            }
            boolean equals = this.name.equals(dynamicColor.name);
            double d = dynamicScheme.isDark ? 1.0d : -1.0d;
            double d2 = 60.0d;
            double contrast = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double contrast2 = roleB.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double doubleValue = ((Double) dynamicColor.tone.apply(dynamicScheme)).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue) < contrast) {
                doubleValue = foregroundTone(tone, contrast);
            }
            double d3 = doubleValue;
            double doubleValue2 = ((Double) roleB.tone.apply(dynamicScheme)).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue2) < contrast2) {
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if (z) {
                d3 = foregroundTone(tone, contrast);
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if ((doubleValue2 - d3) * d < delta) {
                double d4 = delta * d;
                doubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, d3 + d4);
                if ((doubleValue2 - d3) * d < delta) {
                    d3 = MathUtils.clampDouble(0.0d, 100.0d, doubleValue2 - d4);
                }
            }
            if (50.0d > d3 || d3 >= 60.0d) {
                if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
                    d2 = doubleValue2;
                } else if (stayTogether) {
                    if (d > 0.0d) {
                        max = Math.max(doubleValue2, (delta * d) + 60.0d);
                        d3 = 60.0d;
                        d2 = max;
                    } else {
                        min = Math.min(doubleValue2, (delta * d) + 49.0d);
                        d2 = min;
                        d3 = 49.0d;
                    }
                } else if (d <= 0.0d) {
                    d2 = 49.0d;
                }
            } else if (d > 0.0d) {
                max = Math.max(doubleValue2, (delta * d) + 60.0d);
                d3 = 60.0d;
                d2 = max;
            } else {
                min = Math.min(doubleValue2, (delta * d) + 49.0d);
                d2 = min;
                d3 = 49.0d;
            }
            return equals ? d3 : d2;
        }
        double d5 = 60.0d;
        double doubleValue3 = ((Double) this.tone.apply(dynamicScheme)).doubleValue();
        Function function2 = this.background;
        if (function2 == null) {
            return doubleValue3;
        }
        double tone2 = ((DynamicColor) function2.apply(dynamicScheme)).getTone(dynamicScheme);
        double contrast3 = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(tone2, doubleValue3) < contrast3) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (z) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (!this.isBackground || 50.0d > doubleValue3 || doubleValue3 >= 60.0d) {
            d5 = doubleValue3;
        } else if (Contrast.ratioOfTones(49.0d, tone2) >= contrast3) {
            d5 = 49.0d;
        }
        if (this.secondBackground == null) {
            return d5;
        }
        double tone3 = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
        double tone4 = ((DynamicColor) this.secondBackground.apply(dynamicScheme)).getTone(dynamicScheme);
        double max2 = Math.max(tone3, tone4);
        double min2 = Math.min(tone3, tone4);
        if (Contrast.ratioOfTones(max2, d5) >= contrast3 && Contrast.ratioOfTones(min2, d5) >= contrast3) {
            return d5;
        }
        double lighter = Contrast.lighter(max2, contrast3);
        double darker = Contrast.darker(min2, contrast3);
        ArrayList arrayList = new ArrayList();
        if (lighter != -1.0d) {
            arrayList.add(Double.valueOf(lighter));
        }
        if (darker != -1.0d) {
            arrayList.add(Double.valueOf(darker));
        }
        if (tonePrefersLightForeground(tone3) || tonePrefersLightForeground(tone4)) {
            if (lighter == -1.0d) {
                return 100.0d;
            }
            return lighter;
        }
        if (arrayList.size() == 1) {
            return ((Double) arrayList.get(0)).doubleValue();
        }
        if (darker == -1.0d) {
            return 0.0d;
        }
        return darker;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double foregroundTone(double r11, double r13) {
        /*
            double r0 = com.google.android.material.color.utilities.Contrast.lighterUnsafe(r11, r13)
            double r2 = com.google.android.material.color.utilities.Contrast.darkerUnsafe(r11, r13)
            double r4 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r0, r11)
            double r6 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r2, r11)
            boolean r11 = tonePrefersLightForeground(r11)
            if (r11 == 0) goto L3b
            double r11 = r4 - r6
            double r11 = java.lang.Math.abs(r11)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 >= 0) goto L2f
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 >= 0) goto L2f
            r11 = 1
            goto L30
        L2f:
            r11 = 0
        L30:
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 >= 0) goto L44
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 >= 0) goto L44
            if (r11 == 0) goto L45
            goto L44
        L3b:
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 >= 0) goto L45
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 < 0) goto L44
            goto L45
        L44:
            return r0
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.DynamicColor.foregroundTone(double, double):double");
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) < 60;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }
}
