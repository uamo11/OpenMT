package l;

import com.umeng.analytics.pro.i;

/* compiled from: V8DT */
/* renamed from: l.۟ᩴۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7649 extends AbstractC23898 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static double[] f23619 = new double[i.b];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f23621;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15409 f23622;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f23623 = 0.0d;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f23620 = 1.0d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f23619;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(2.0d, i / 2048.0d);
            i++;
        }
    }

    public C7649() {
        C8355 c8355 = new C8355("Input");
        this.f23621 = c8355;
        m52649(c8355);
        c8355.m21953(-8.0d, 0.0d, 8.0d);
        C15409 c15409 = new C15409(0);
        this.f23622 = c15409;
        m52649(c15409);
    }

    @Override // l.AbstractC23898
    /* renamed from: ۧ */
    public final void mo6591() {
        double[] m38021 = this.f23621.m38021();
        double[] m380212 = this.f23622.m38021();
        for (int i = 0; i < 8; i++) {
            double d = m38021[i];
            if (d == this.f23623) {
                m380212[i] = this.f23620;
            } else {
                this.f23623 = d;
                int floor = (int) Math.floor(d);
                double d2 = (d - floor) * 2048.0d;
                int i2 = (int) d2;
                double[] dArr = f23619;
                double d3 = dArr[i2];
                double d4 = ((dArr[i2 + 1] - d3) * (d2 - i2)) + d3;
                while (floor > 0) {
                    floor--;
                    d4 *= 2.0d;
                }
                while (floor < 0) {
                    floor++;
                    d4 *= 0.5d;
                }
                m380212[i] = d4;
                this.f23620 = d4;
            }
        }
    }
}
