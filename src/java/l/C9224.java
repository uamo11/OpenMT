package l;

/* compiled from: 21AZ */
/* renamed from: l.ۢ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9224 extends C8518 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f27922;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f27923;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f27924;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f27925;

    public C9224(String str) {
        this.f26036 = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f27924 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i);
        this.f27922 = Double.parseDouble(str.substring(i, indexOf3).trim());
        int i2 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i2);
        this.f27923 = Double.parseDouble(str.substring(i2, indexOf4).trim());
        int i3 = indexOf4 + 1;
        this.f27925 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private double m23666(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f27923 * d5) + (this.f27924 * d4) + (d * d * d);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private double m23667(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f27925 * d5) + (this.f27922 * d4) + (d * d * d);
    }

    @Override // l.C8518
    /* renamed from: ۧ */
    public final double mo22212(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m23666(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m23667(d5) - m23667(d4)) / (m23666(d5) - m23666(d4));
    }

    @Override // l.C8518
    /* renamed from: ֫ */
    public final double mo22211(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m23666(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double m23666 = m23666(d4);
        double d5 = d3 + d2;
        double m236662 = m23666(d5);
        double m23667 = m23667(d4);
        return (((d - m23666) * (m23667(d5) - m23667)) / (m236662 - m23666)) + m23667;
    }
}
