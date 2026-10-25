package l;

/* compiled from: SB7W */
/* renamed from: l.֨֡ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0769 implements Cloneable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC7265 f2854;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f2855;

    public C0769(float f, EnumC7265 enumC7265) {
        this.f2855 = f;
        this.f2854 = enumC7265;
    }

    public C0769(float f) {
        this.f2855 = f;
        this.f2854 = EnumC7265.px;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m2932(C18430 c18430) {
        int ordinal = this.f2854.ordinal();
        float f = this.f2855;
        switch (ordinal) {
            case 1:
                return f * c18430.m42899();
            case 2:
                return f * c18430.m42901();
            case 3:
                return f * c18430.m42903();
            case 4:
                return (f * c18430.m42903()) / 2.54f;
            case 5:
                return (f * c18430.m42903()) / 25.4f;
            case 6:
                return (f * c18430.m42903()) / 72.0f;
            case 7:
                return (f * c18430.m42903()) / 6.0f;
            case 8:
                C16997 m42902 = c18430.m42902();
                return m42902 == null ? f : (f * m42902.f52134) / 100.0f;
            default:
                return f;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m2933(C18430 c18430) {
        if (this.f2854 == EnumC7265.percent) {
            C16997 m42902 = c18430.m42902();
            float f = this.f2855;
            return m42902 == null ? f : (f * m42902.f52131) / 100.0f;
        }
        return m2932(c18430);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m2929(C18430 c18430) {
        float sqrt;
        if (this.f2854 == EnumC7265.percent) {
            C16997 m42902 = c18430.m42902();
            float f = this.f2855;
            if (m42902 == null) {
                return f;
            }
            float f2 = m42902.f52134;
            if (f2 == m42902.f52131) {
                sqrt = f * f2;
            } else {
                sqrt = f * ((float) (Math.sqrt((r8 * r8) + (f2 * f2)) / 1.414213562373095d));
            }
            return sqrt / 100.0f;
        }
        return m2932(c18430);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m2930(C18430 c18430, float f) {
        if (this.f2854 == EnumC7265.percent) {
            return (this.f2855 * f) / 100.0f;
        }
        return m2932(c18430);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m2928(float f) {
        float f2;
        float f3;
        int ordinal = this.f2854.ordinal();
        float f4 = this.f2855;
        if (ordinal == 0) {
            return f4;
        }
        if (ordinal == 3) {
            return f4 * f;
        }
        if (ordinal == 4) {
            f2 = f4 * f;
            f3 = 2.54f;
        } else if (ordinal == 5) {
            f2 = f4 * f;
            f3 = 25.4f;
        } else if (ordinal == 6) {
            f2 = f4 * f;
            f3 = 72.0f;
        } else {
            if (ordinal != 7) {
                return f4;
            }
            f2 = f4 * f;
            f3 = 6.0f;
        }
        return f2 / f3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2934() {
        return this.f2855 == 0.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2931() {
        return this.f2855 < 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f2855) + this.f2854;
    }
}
