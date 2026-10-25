package l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: H1CY */
/* renamed from: l.᩵֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC19123 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60267;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC20513 f60268;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f60269 = new int[10];

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float[] f60270 = new float[10];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f60271;

    /* renamed from: ֫ */
    public abstract void mo5144(float f, View view);

    public final String toString() {
        String str = this.f60271;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f60267; i++) {
            StringBuilder m19190 = C7166.m19190(str, "[");
            m19190.append(this.f60269[i]);
            m19190.append(" , ");
            m19190.append(decimalFormat.format(this.f60270[i]));
            m19190.append("] ");
            str = m19190.toString();
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44147(String str) {
        this.f60271 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m44146(float f) {
        return (float) this.f60268.mo7168(f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m44148(float f) {
        return (float) this.f60268.mo7172(f);
    }

    /* renamed from: ֫ */
    public void mo26745(float f, int i) {
        int[] iArr = this.f60269;
        if (iArr.length < this.f60267 + 1) {
            this.f60269 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f60270;
            this.f60270 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f60269;
        int i2 = this.f60267;
        iArr2[i2] = i;
        this.f60270[i2] = f;
        this.f60267 = i2 + 1;
    }

    /* renamed from: ֫ */
    public void mo26746(int i) {
        int i2;
        int i3 = this.f60267;
        if (i3 == 0) {
            return;
        }
        int[] iArr = this.f60269;
        float[] fArr = this.f60270;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            int i7 = i4 - 2;
            int i8 = iArr2[i7];
            if (i6 < i8) {
                int i9 = iArr[i8];
                int i10 = i6;
                int i11 = i10;
                while (i10 < i8) {
                    int i12 = iArr[i10];
                    if (i12 <= i9) {
                        int i13 = iArr[i11];
                        iArr[i11] = i12;
                        iArr[i10] = i13;
                        float f = fArr[i11];
                        fArr[i11] = fArr[i10];
                        fArr[i10] = f;
                        i11++;
                    }
                    i10++;
                }
                int i14 = iArr[i11];
                iArr[i11] = iArr[i8];
                iArr[i8] = i14;
                float f2 = fArr[i11];
                fArr[i11] = fArr[i8];
                fArr[i8] = f2;
                iArr2[i7] = i11 - 1;
                iArr2[i5] = i6;
                int i15 = i4 + 1;
                iArr2[i4] = i8;
                i4 += 2;
                iArr2[i15] = i11 + 1;
            } else {
                i4 = i7;
            }
        }
        int i16 = 1;
        for (int i17 = 1; i17 < this.f60267; i17++) {
            int[] iArr3 = this.f60269;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 1);
        int i18 = 0;
        while (i2 < this.f60267) {
            if (i2 > 0) {
                int[] iArr4 = this.f60269;
                i2 = iArr4[i2] == iArr4[i2 + (-1)] ? i2 + 1 : 0;
            }
            dArr[i18] = this.f60269[i2] * 0.01d;
            dArr2[i18][0] = this.f60270[i2];
            i18++;
        }
        this.f60268 = AbstractC20513.m46987(i, dArr, dArr2);
    }
}
