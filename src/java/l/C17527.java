package l;

/* compiled from: 78BU */
/* renamed from: l.ܿᩴۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17527 extends C6944 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f53532;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double[] f53533;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f53534;

    public C17527(C8355 c8355, double d) {
        super(c8355, d);
        this.f53533 = new double[8];
        this.f53532 = c8355;
    }

    @Override // l.C6944
    /* renamed from: ᩳ */
    public final double mo18768() {
        return this.f53534;
    }

    @Override // l.C6944
    /* renamed from: ֫ */
    public final void mo18762(double d) {
        this.f53534 = d;
        super.mo18762(d);
    }

    @Override // l.C6944
    /* renamed from: ܿ */
    public final double[] mo18767() {
        double[] mo18767;
        int i;
        double[] dArr;
        double[] dArr2;
        int m18766 = m18766();
        if (m18766 == 0) {
            dArr2 = super.mo18767();
        } else {
            if (this.f53532.m21957()) {
                mo18767 = super.mo18767();
                i = 0;
            } else {
                mo18767 = m18760(0).mo18767();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                dArr = this.f53533;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = mo18767[i2];
                i2++;
            }
            while (i < m18766) {
                double[] mo187672 = m18760(i).mo18767();
                for (int i3 = 0; i3 < dArr.length; i3++) {
                    dArr[i3] = dArr[i3] + mo187672[i3];
                }
                i++;
            }
            dArr2 = dArr;
        }
        this.f53534 = dArr2[0];
        return dArr2;
    }
}
