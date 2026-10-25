package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: C8PP */
/* renamed from: l.ۜ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6971 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21488;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Integer f21489;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f21490;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f21491;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f21492;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f21493;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f21494;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f21495;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f21496;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Integer f21497;

    public C6971(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f21492 = str;
        this.f21488 = i;
        this.f21489 = num;
        this.f21497 = num2;
        this.f21495 = f;
        this.f21491 = z;
        this.f21494 = z2;
        this.f21490 = z3;
        this.f21496 = z4;
        this.f21493 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6971 m18845(String str, C14731 c14731) {
        int i;
        int parseInt;
        C22632.m50631(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = c14731.f44988;
        if (length != i2) {
            int length2 = split.length;
            String str2 = C3603.f11424;
            Locale locale = Locale.US;
            StringBuilder m46682 = C20361.m46682("Skipping malformed 'Style:' line (expected ", i2, " values, found ", "): '", length2);
            m46682.append(str);
            m46682.append("'");
            C19956.m46037(m46682.toString());
            return null;
        }
        try {
            String trim = split[c14731.f44993].trim();
            int i3 = c14731.f44983;
            int i4 = -1;
            int m18846 = i3 != -1 ? m18846(split[i3].trim()) : -1;
            int i5 = c14731.f44992;
            Integer m18848 = i5 != -1 ? m18848(split[i5].trim()) : null;
            int i6 = c14731.f44984;
            Integer m188482 = i6 != -1 ? m18848(split[i6].trim()) : null;
            int i7 = c14731.f44991;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String trim2 = split[i7].trim();
                try {
                    f = Float.parseFloat(trim2);
                } catch (NumberFormatException e) {
                    C19956.m46036("Failed to parse font size: '" + trim2 + "'", e);
                }
            }
            int i8 = c14731.f44987;
            boolean z = false;
            if (i8 != -1 && m18847(split[i8].trim())) {
                z = true;
            }
            int i9 = c14731.f44990;
            boolean z2 = i9 != -1 && m18847(split[i9].trim());
            int i10 = c14731.f44985;
            boolean z3 = i10 != -1 && m18847(split[i10].trim());
            int i11 = c14731.f44986;
            boolean z4 = i11 != -1 && m18847(split[i11].trim());
            int i12 = c14731.f44989;
            if (i12 != -1) {
                String trim3 = split[i12].trim();
                try {
                    parseInt = Integer.parseInt(trim3.trim());
                } catch (NumberFormatException unused) {
                }
                if (parseInt == 1 || parseInt == 3) {
                    i4 = parseInt;
                    i = i4;
                }
                C19956.m46037("Ignoring unknown BorderStyle: " + trim3);
                i = i4;
            } else {
                i = -1;
            }
            return new C6971(trim, m18846, m18848, m188482, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            C19956.m46036("Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m18846(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                C4860.m14173("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Integer m18848(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            C22632.m50631(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(C13426.m32446(((parseLong >> 24) & 255) ^ 255), C13426.m32446(parseLong & 255), C13426.m32446((parseLong >> 8) & 255), C13426.m32446((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C19956.m46036("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m18847(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            C19956.m46036("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
