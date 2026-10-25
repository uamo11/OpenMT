package l;

/* compiled from: U1BV */
/* renamed from: l.᩵֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19102 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f60171;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f60172;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f60173;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f60174;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f60175;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f60176;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44024() {
        this.f60171 = 0.0f;
        this.f60175 = 0.0f;
        this.f60176 = 0.0f;
        this.f60174 = 0.0f;
        this.f60172 = 0.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44028(AbstractC19123 abstractC19123, float f) {
        if (abstractC19123 != null) {
            this.f60171 = abstractC19123.m44148(f);
            this.f60173 = abstractC19123.m44146(f);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44031(AbstractC19123 abstractC19123, AbstractC19123 abstractC191232, float f) {
        if (abstractC19123 != null) {
            this.f60176 = abstractC19123.m44148(f);
        }
        if (abstractC191232 != null) {
            this.f60175 = abstractC191232.m44148(f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44029(AbstractC19123 abstractC19123, AbstractC19123 abstractC191232, float f) {
        if (abstractC19123 != null) {
            this.f60172 = abstractC19123.m44148(f);
        }
        if (abstractC191232 != null) {
            this.f60174 = abstractC191232.m44148(f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44026(AbstractC14307 abstractC14307, float f) {
        if (abstractC14307 != null) {
            this.f60171 = abstractC14307.m34137(f);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44030(AbstractC14307 abstractC14307, AbstractC14307 abstractC143072, float f) {
        if (abstractC14307 != null) {
            this.f60176 = abstractC14307.m34137(f);
        }
        if (abstractC143072 != null) {
            this.f60175 = abstractC143072.m34137(f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44027(AbstractC14307 abstractC14307, AbstractC14307 abstractC143072, float f) {
        if (abstractC14307 == null && abstractC143072 == null) {
            return;
        }
        if (abstractC14307 == null) {
            this.f60172 = abstractC14307.m34137(f);
        }
        if (abstractC143072 == null) {
            this.f60174 = abstractC143072.m34137(f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44025(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f2 - 0.5f) * 2.0f;
        float f6 = f3 + this.f60176;
        float f7 = f4 + this.f60175;
        float f8 = (this.f60172 * (f - 0.5f) * 2.0f) + f6;
        float f9 = (this.f60174 * f5) + f7;
        float radians = (float) Math.toRadians(this.f60173);
        float radians2 = (float) Math.toRadians(this.f60171);
        double d = radians;
        double d2 = i2 * f5;
        float sin = (((float) ((Math.sin(d) * ((-i) * r7)) - (Math.cos(d) * d2))) * radians2) + f8;
        float cos = (radians2 * ((float) ((Math.cos(d) * (i * r7)) - (Math.sin(d) * d2)))) + f9;
        fArr[0] = sin;
        fArr[1] = cos;
    }
}
