package l;

/* compiled from: B6MI */
/* renamed from: l.ۨܰۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11739 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f35027;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35028;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f35030;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f35031;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35032;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f35033;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f35034;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f35035;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f35036;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f35037;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35039;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35041;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f35043;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f35044;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f35045;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f35029 = 1.0f;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f35042 = 1.0f;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f35038 = 1.0d;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f35040 = 1.0f;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m28698(int i, double d, double d2, float f) {
        return (float) ((i * 0.5d) - (((d + d2) * f) * 0.5d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28713(int i, int i2) {
        this.f35041 = Math.max(0, i);
        int max = Math.max(0, i2);
        this.f35039 = max;
        this.f35036 = Math.hypot(this.f35041, max);
        this.f35030 = 0.0f;
        this.f35038 = 1.0d;
        this.f35031 = 0.0d;
        m28703();
        m28727();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28725(int i, int i2) {
        double d;
        double d2;
        double d3;
        boolean z = false;
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        if (this.f35028 == max && this.f35032 == max2) {
            return;
        }
        if (m28720() && !m28718()) {
            z = true;
        }
        double d4 = this.f35042 / this.f35029;
        if (m28720()) {
            double d5 = this.f35042;
            double d6 = ((this.f35028 * 0.5d) - this.f35043) / d5;
            double d7 = ((this.f35032 * 0.5d) - this.f35027) / d5;
            double d8 = this.f35038;
            d = d4;
            double d9 = this.f35031;
            d3 = ((d9 * d7) + (d8 * d6)) / this.f35041;
            d2 = ((d8 * d7) + ((-d9) * d6)) / this.f35039;
        } else {
            d = d4;
            d2 = 0.5d;
            d3 = 0.5d;
        }
        this.f35028 = max;
        this.f35032 = max2;
        m28727();
        if (z && m28720()) {
            this.f35042 = m28696(d * this.f35029, m28721(), 8.0f);
            m28699(this.f35041 * d3, this.f35039 * d2, this.f35028 * 0.5d, 0.5d * this.f35032, true);
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m28727() {
        m28705();
        this.f35042 = this.f35029;
        this.f35043 = m28720() ? m28698(this.f35028, this.f35044, this.f35045, this.f35042) : 0.0f;
        this.f35027 = m28720() ? m28698(this.f35032, this.f35035, this.f35033, this.f35042) : 0.0f;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28735() {
        if (this.f35030 == 0.0f) {
            return;
        }
        if (m28720()) {
            float f = this.f35042;
            int i = this.f35028;
            int i2 = this.f35032;
            m28710(f, 0.0f, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
            return;
        }
        m28701(0.0f);
        m28727();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m28731() {
        return Math.round(this.f35030 / 90.0f) * 90.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28708() {
        if (m28720()) {
            float f = this.f35042;
            float m28731 = m28731();
            int i = this.f35028;
            int i2 = this.f35032;
            m28710(f, m28731, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m28720() {
        return this.f35041 > 0 && this.f35039 > 0 && this.f35028 > 0 && this.f35032 > 0;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m28718() {
        if (!m28720()) {
            return false;
        }
        float abs = Math.abs(this.f35042 - this.f35029);
        float f = this.f35029;
        return abs <= 1.0E-4f * f && Math.abs(this.f35043 - m28698(this.f35028, this.f35044, this.f35045, f)) <= 0.01f && Math.abs(this.f35027 - m28698(this.f35032, this.f35035, this.f35033, this.f35029)) <= 0.01f;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28729() {
        if (!m28720()) {
            return false;
        }
        double d = this.f35034;
        float f = this.f35042;
        return d * ((double) f) <= ((double) (((float) this.f35028) + 0.01f)) && this.f35037 * ((double) f) <= ((double) (((float) this.f35032) + 0.01f));
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m28707() {
        if (!m28720()) {
            return false;
        }
        double d = this.f35037;
        double d2 = this.f35034;
        return d >= 3.0d * d2 && (((double) this.f35028) / d2) * d >= ((double) this.f35032) * 2.0d;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m28732() {
        return this.f35042;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m28730() {
        return this.f35029;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float m28721() {
        return Math.min(1.0f, this.f35029);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m28717() {
        return this.f35030;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m28733() {
        return this.f35043;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float m28706() {
        return this.f35027;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m28719() {
        return this.f35041;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m28737() {
        return this.f35039;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6094 m28736() {
        if (!m28720()) {
            return null;
        }
        double d = this.f35042;
        double d2 = ((this.f35028 * 0.5d) - this.f35043) / d;
        double d3 = ((this.f35032 * 0.5d) - this.f35027) / d;
        int i = this.f35041;
        int i2 = this.f35039;
        double d4 = d / this.f35029;
        double d5 = this.f35038;
        double d6 = this.f35031;
        return new C6094(i, i2, d4, ((d6 * d3) + (d5 * d2)) / i, ((d5 * d3) + ((-d6) * d2)) / i2, this.f35030);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28714(C6094 c6094) {
        if (m28720() && c6094.m17004() && this.f35041 == c6094.f18677 && this.f35039 == c6094.f18675) {
            m28701(c6094.f18674);
            this.f35042 = m28696(c6094.f18676 * this.f35029, m28721(), 8.0f);
            m28699(c6094.f18672 * this.f35041, c6094.f18673 * this.f35039, this.f35028 * 0.5d, this.f35032 * 0.5d, true);
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m28728() {
        return m28704(this.f35028, this.f35044, this.f35045);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m28734() {
        return m28697(this.f35028, this.f35044, this.f35045);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m28716() {
        return m28704(this.f35032, this.f35035, this.f35033);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m28722() {
        return m28697(this.f35032, this.f35035, this.f35033);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m28726() {
        if (!m28720()) {
            return this.f35029;
        }
        if (this.f35041 > 200 || this.f35039 > 200) {
            float f = this.f35029;
            if (f >= 1.5f) {
                if (this.f35042 < 0.9f * f) {
                    return f;
                }
                return 1.0f;
            }
        }
        float max = m28707() ? (float) (this.f35028 / this.f35034) : Math.max(1.0f, this.f35029 * 2.5f);
        if (this.f35041 <= 200 && this.f35039 <= 200) {
            max = Math.max(max, (float) Math.min(this.f35028 / this.f35034, this.f35032 / this.f35037));
        }
        float max2 = Math.max(this.f35029, Math.min(8.0f, max));
        return this.f35042 < 0.9f * max2 ? max2 : this.f35029;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28715(float f, float f2) {
        m28702("dx", f);
        m28702("dy", f2);
        if (!m28720()) {
            return false;
        }
        float f3 = this.f35043;
        float m28728 = m28728();
        float m28734 = m28734();
        if (f > 0.0f) {
            if (f3 < m28734) {
                return true;
            }
        } else if (f < 0.0f && f3 > m28728) {
            return true;
        }
        float f4 = this.f35027;
        return f2 > 0.0f ? f4 < m28722() : f2 < 0.0f && f4 > m28716();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m28723(float f, float f2) {
        m28702("dx", f);
        m28702("dy", f2);
        if (!m28720()) {
            return f;
        }
        float f3 = this.f35043;
        double d = f3;
        double d2 = f;
        this.f35043 = m28696(d + d2, Math.min(f3, m28728()), Math.max(f3, m28734()));
        float f4 = this.f35027;
        this.f35027 = m28696(f4 + f2, Math.min(f4, m28716()), Math.max(f4, m28722()));
        return (float) (d2 - (this.f35043 - d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28712(float f, float f2, float f3, boolean z) {
        m28711(f, this.f35030, f2, f3, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28709(float f, float f2, float f3, float f4, float f5) {
        m28710(f, this.f35030, f2, f3, f4, f5, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28724() {
        if (m28720()) {
            float f = this.f35028 * 0.5f;
            float f2 = this.f35032 * 0.5f;
            m28709(this.f35042, f, f2, f, f2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m28704(int i, double d, double d2) {
        if (!m28720()) {
            return 0.0f;
        }
        float f = this.f35042;
        double d3 = i;
        return (d2 - d) * ((double) f) <= d3 ? m28698(i, d, d2, f) : (float) (d3 - (d2 * f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m28697(int i, double d, double d2) {
        if (!m28720()) {
            return 0.0f;
        }
        float f = this.f35042;
        return (d2 - d) * ((double) f) <= ((double) i) ? m28698(i, d, d2, f) : (float) ((-d) * f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28699(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f35038;
        double d6 = this.f35031;
        double d7 = this.f35042;
        m28700(d3 - (((d5 * d) - (d6 * d2)) * d7), d4 - (((d5 * d2) + (d6 * d)) * d7), z);
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m28705() {
        this.f35029 = m28720() ? (float) Math.min((this.f35041 > 200 || this.f35039 > 200) ? 8.0f : 1.0f, Math.min(this.f35028 / this.f35034, this.f35032 / this.f35037)) : 1.0f;
        this.f35040 = m28720() ? (float) Math.min(1.0d, Math.min(this.f35028, this.f35032) / this.f35036) : 1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28701(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        if (f2 == this.f35030) {
            return;
        }
        if (f2 == 0.0f) {
            f2 = 0.0f;
        }
        this.f35030 = f2;
        if (f2 == 0.0f || f2 == -180.0f) {
            this.f35038 = f2 == 0.0f ? 1.0d : -1.0d;
            this.f35031 = 0.0d;
        } else if (f2 == 90.0f || f2 == -90.0f) {
            this.f35038 = 0.0d;
            this.f35031 = f2 == 90.0f ? 1.0d : -1.0d;
        } else {
            double radians = Math.toRadians(f2);
            this.f35038 = Math.cos(radians);
            this.f35031 = Math.sin(radians);
        }
        m28703();
        m28705();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28703() {
        int i = this.f35041;
        double d = this.f35038;
        double d2 = i * d;
        int i2 = this.f35039;
        double d3 = this.f35031;
        double d4 = (-i2) * d3;
        double d5 = i * d3;
        double d6 = i2 * d;
        this.f35044 = Math.min(0.0d, d2) + Math.min(0.0d, d4);
        this.f35045 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
        this.f35035 = Math.min(0.0d, d6) + Math.min(0.0d, d5);
        double max = Math.max(0.0d, d6) + Math.max(0.0d, d5);
        this.f35033 = max;
        this.f35034 = this.f35045 - this.f35044;
        this.f35037 = max - this.f35035;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28700(double d, double d2, boolean z) {
        float f = z ? 0.0f : this.f35028 * 0.5f;
        float f2 = z ? 0.0f : this.f35032 * 0.5f;
        this.f35043 = m28696(d, m28728() - f, m28734() + f);
        this.f35027 = m28696(d2, m28716() - f2, m28722() + f2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m28696(double d, float f, float f2) {
        return (float) Math.max(f, Math.min(f2, d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28710(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float m28696;
        m28702("scale", f);
        if (f > 0.0f) {
            m28702("rotation", f2);
            m28702("oldFocusX", f3);
            m28702("oldFocusY", f4);
            m28702("newFocusX", f5);
            m28702("newFocusY", f6);
            if (m28720()) {
                double d = this.f35042;
                double d2 = (f3 - this.f35043) / d;
                double d3 = (f4 - this.f35027) / d;
                double d4 = this.f35038;
                double d5 = this.f35031;
                double d6 = (d4 * d2) + (d5 * d3);
                double d7 = (d4 * d3) + ((-d5) * d2);
                m28701(f2);
                if (z) {
                    m28696 = m28696(f, m28721(), 8.0f);
                } else {
                    m28696 = m28696(f, this.f35040 * 0.5f, 12.0f);
                }
                this.f35042 = m28696;
                m28699(d6, d7, f5, f6, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28711(float f, float f2, float f3, float f4, boolean z) {
        float m28696;
        m28702("scale", f);
        if (f > 0.0f) {
            m28702("rotation", f2);
            m28702("x", f3);
            m28702("y", f4);
            if (m28720()) {
                m28701(f2);
                if (z) {
                    m28696 = m28696(f, m28721(), 8.0f);
                } else {
                    m28696 = m28696(f, this.f35040 * 0.5f, 12.0f);
                }
                this.f35042 = m28696;
                m28700(f3, f4, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28702(String str, float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must be finite"));
        }
    }
}
