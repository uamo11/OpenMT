package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: CBKJ */
/* renamed from: l.ܺ᩹ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16224 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49949;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f49950;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f49951;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f49952;

    public C16224(C0639 c0639, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (f3 == 0.0f || f4 == 0.0f) {
            return;
        }
        boolean z = f6 != 0.0f;
        boolean z2 = f7 != 0.0f;
        double d = f5;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double d2 = (f - f8) / 2.0f;
        double d3 = (f2 - f9) / 2.0f;
        double d4 = (sin * d3) + (cos * d2);
        double d5 = (d3 * cos) + ((-sin) * d2);
        double d6 = f3 * f3;
        double d7 = f4 * f4;
        double d8 = d5 * d5 * d6;
        double d9 = (d6 * d7) - d8;
        double d10 = d7 * d4 * d4;
        double d11 = (d9 - d10) / (d8 + d10);
        double sqrt = Math.sqrt(d11 < 0.0d ? 0.0d : d11);
        sqrt = z == z2 ? -sqrt : sqrt;
        double d12 = f3;
        double d13 = sqrt * d12 * d5;
        double d14 = f4;
        double d15 = d13 / d14;
        double d16 = (((-sqrt) * d14) * d4) / d12;
        C8401 c8401 = new C8401(((cos * d15) - (sin * d16)) + ((f + f8) / 2.0f), (cos * d16) + (sin * d15) + ((f2 + f9) / 2.0f));
        C8401 c84012 = new C8401(d12, 0.0d);
        C8401 c84013 = new C8401(0.0d, d14);
        C8401 m38179 = m38179(c84012, d);
        C8401 m381792 = m38179(c84013, d);
        m38179.f25752 += c8401.f25752;
        m38179.f25753 += c8401.f25753;
        m381792.f25752 += c8401.f25752;
        m381792.f25753 += c8401.f25753;
        double hypot = (f3 * f4) / Math.hypot(d14 * Math.cos(0.7853981633974483d), Math.sin(0.7853981633974483d) * d12);
        C8401 m381793 = m38179(new C8401(Math.cos(0.7853981633974483d) * hypot, Math.sin(0.7853981633974483d) * hypot), d);
        m381793.f25752 += c8401.f25752;
        m381793.f25753 += c8401.f25753;
        C8401 c84014 = (C8401) c0639.m2602(m381793);
        C8401 c84015 = (C8401) c0639.m2602(m38179);
        C8401 c84016 = (C8401) c0639.m2602(m381792);
        C8401 c84017 = (C8401) c0639.m2602(c8401);
        double d17 = c84017.f25752;
        double d18 = c84017.f25753;
        double d19 = c84014.f25752;
        double d20 = d19 - d17;
        double d21 = c84014.f25753;
        double d22 = d21 - d18;
        double d23 = c84015.f25752;
        double d24 = d23 - d17;
        double d25 = c84015.f25753;
        double d26 = d25 - d18;
        double d27 = c84016.f25752;
        double d28 = d27 - d17;
        double d29 = c84016.f25753;
        double d30 = d29 - d18;
        double d31 = m38179.f25752;
        double d32 = m381793.f25752;
        double d33 = m38179.f25753;
        double d34 = m381793.f25753;
        this.f49949 = (((d29 - d21) * (d23 - d19)) - ((d25 - d21) * (d27 - d19))) * (((m381792.f25753 - d34) * (d31 - d32)) - ((d33 - d34) * (m381792.f25752 - d32))) < 0.0d;
        double d35 = d20 * d20;
        double d36 = d20 * d22;
        double d37 = d22 * d22;
        double d38 = d24 * d24;
        double d39 = d24 * d26;
        double d40 = d26 * d26;
        double d41 = d28 * d28;
        double d42 = d28 * d30;
        double d43 = d30 * d30;
        double d44 = d36 * d40;
        double d45 = d37 * d38;
        double d46 = d35 * d40;
        double d47 = d36 * d38;
        double d48 = d35 * d39;
        double d49 = -(((d47 * d43) + ((d46 * d42) + ((((d37 * d39) * d41) - (d44 * d41)) - (d45 * d42)))) - (d48 * d43));
        if (d49 != 0.0d) {
            double m12787 = C4248.m12787(d39, d43, (((d37 * d42) + (((-d37) * d39) + d44)) - (d40 * d42)) - (d36 * d43), d49);
            double d50 = (((d35 * d43) + ((d40 * d41) + ((d45 - d46) - (d37 * d41)))) - (d43 * d38)) / d49;
            double d51 = (((d35 * d42) + ((d39 * d41) + ((d47 - d48) - (d36 * d41)))) - (d38 * d42)) / (-d49);
            double d52 = m12787 - d51;
            if (d52 == 0.0d) {
                float hypot2 = (float) Math.hypot(d24, d26);
                this.f49951 = hypot2;
                this.f49950 = hypot2;
                this.f49952 = 0.0f;
                return;
            }
            double atan = Math.atan(d50 / d52);
            double d53 = atan / 2.0d;
            if (Math.sin(atan) == 0.0d) {
                this.f49951 = (float) Math.sqrt(1.0d / d51);
                this.f49950 = (float) Math.sqrt(1.0d / m12787);
                this.f49952 = 0.0f;
                return;
            }
            double d54 = m12787 + d51;
            double sin2 = ((d50 / Math.sin(atan)) + d54) / 2.0d;
            double d55 = d54 - sin2;
            if (sin2 != 0.0d && d55 != 0.0d) {
                this.f49951 = (float) Math.sqrt(1.0d / sin2);
                this.f49950 = (float) Math.sqrt(1.0d / d55);
                this.f49952 = (float) Math.toDegrees(d53 + 1.5707963267948966d);
                return;
            }
        }
        Logger.getLogger("EllipseSolver").log(Level.WARNING, "Early return in the ellipse transformation computation!");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m38181() {
        return this.f49950;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m38182() {
        return this.f49951;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m38183() {
        return this.f49952;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38180() {
        return this.f49949;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8401 m38179(C8401 c8401, double d) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double d2 = c8401.f25752;
        double d3 = c8401.f25753;
        return new C8401((d2 * cos) - (d3 * sin), (d3 * cos) + (d2 * sin));
    }
}
