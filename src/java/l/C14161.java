package l;

import java.util.Arrays;

/* compiled from: A1CD */
/* renamed from: l.ܳ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14161 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static double[] f42741 = new double[91];

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f42742;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f42743;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f42744;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f42745;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f42746;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double[] f42747;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f42748;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f42749;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f42750;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f42751;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f42752;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f42753;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f42754;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f42755;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f42756;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f42757;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f42758;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f42759;

    public C14161(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        double[] dArr;
        double d7;
        double d8 = d3;
        this.f42743 = false;
        boolean z = i == 1;
        this.f42745 = z;
        this.f42749 = d;
        this.f42748 = d2;
        double d9 = d2 - d;
        double d10 = 1.0d / d9;
        this.f42758 = d10;
        if (3 == i) {
            this.f42743 = true;
        }
        double d11 = d5 - d8;
        double d12 = d6 - d4;
        if (this.f42743 || Math.abs(d11) < 0.001d || Math.abs(d12) < 0.001d) {
            this.f42743 = true;
            this.f42756 = d8;
            this.f42757 = d5;
            this.f42742 = d4;
            this.f42746 = d6;
            double hypot = Math.hypot(d12, d11);
            this.f42750 = hypot;
            this.f42753 = hypot * d10;
            this.f42751 = d11 / d9;
            this.f42759 = d12 / d9;
            return;
        }
        double[] dArr2 = new double[101];
        this.f42747 = dArr2;
        this.f42755 = (z ? -1 : 1) * d11;
        this.f42754 = d12 * (z ? 1 : -1);
        this.f42751 = z ? d5 : d8;
        this.f42759 = z ? d4 : d6;
        double d13 = d4 - d6;
        int i2 = 0;
        double d14 = 0.0d;
        double d15 = 0.0d;
        double d16 = 0.0d;
        while (true) {
            dArr = f42741;
            if (i2 >= 91) {
                break;
            }
            double d17 = d14;
            double radians = Math.toRadians((i2 * 90.0d) / 90);
            double sin = Math.sin(radians) * d11;
            double cos = Math.cos(radians) * d13;
            if (i2 > 0) {
                d7 = d17 + Math.hypot(sin - d15, cos - d16);
                dArr[i2] = d7;
            } else {
                d7 = d17;
            }
            i2++;
            d16 = cos;
            d14 = d7;
            d15 = sin;
        }
        this.f42750 = d14;
        for (int i3 = 0; i3 < 91; i3++) {
            dArr[i3] = dArr[i3] / d14;
        }
        for (int i4 = 0; i4 < 101; i4++) {
            double d18 = i4 / 100;
            int binarySearch = Arrays.binarySearch(dArr, d18);
            if (binarySearch >= 0) {
                dArr2[i4] = binarySearch / 90;
            } else if (binarySearch == -1) {
                dArr2[i4] = 0.0d;
            } else {
                int i5 = -binarySearch;
                int i6 = i5 - 2;
                double d19 = dArr[i6];
                dArr2[i4] = (((d18 - d19) / (dArr[i5 - 1] - d19)) + i6) / 90;
            }
        }
        this.f42753 = this.f42750 * this.f42758;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33799(double d) {
        double d2 = (this.f42745 ? this.f42748 - d : d - this.f42749) * this.f42758;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f42747;
                double length = d2 * (dArr.length - 1);
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - i)) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f42744 = Math.sin(d5);
        this.f42752 = Math.cos(d5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m33796() {
        double d = this.f42755 * this.f42752;
        double hypot = this.f42753 / Math.hypot(d, (-this.f42754) * this.f42744);
        return this.f42745 ? (-d) * hypot : d * hypot;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m33797(double d) {
        double d2 = (d - this.f42749) * this.f42758;
        double d3 = this.f42757;
        double d4 = this.f42756;
        return ((d3 - d4) * d2) + d4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double m33798(double d) {
        double d2 = (d - this.f42749) * this.f42758;
        double d3 = this.f42746;
        double d4 = this.f42742;
        return ((d3 - d4) * d2) + d4;
    }
}
