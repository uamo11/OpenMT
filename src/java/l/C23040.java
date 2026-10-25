package l;

/* compiled from: X5E9 */
/* renamed from: l.᩺ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23040 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C23040 f74144;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74145;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f74146;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f74147;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23040 m51208() {
        if (f74144 == null) {
            f74144 = new C23040();
        }
        return f74144;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51209(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f74145 = 1;
            this.f74147 = -1L;
            this.f74146 = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f74145 = 0;
                this.f74147 = -1L;
                this.f74146 = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f74147 = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f74146 = round;
            if (round < j && this.f74147 > j) {
                this.f74145 = 0;
            } else {
                this.f74145 = 1;
            }
        }
    }
}
