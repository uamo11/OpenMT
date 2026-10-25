package l;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* compiled from: B1CI */
/* renamed from: l.ۗܶ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3306 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f10353 = new float[20];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ColorMatrix f10356 = new ColorMatrix();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorMatrix f10355 = new ColorMatrix();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f10354 = 1.0f;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f10357 = 1.0f;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f10358 = 1.0f;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f10359 = 1.0f;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10102(ImageView imageView) {
        boolean z;
        float[] fArr;
        ColorMatrix colorMatrix;
        char c;
        char c2;
        float f;
        char c3;
        char c4;
        char c5;
        char c6;
        ColorMatrix colorMatrix2;
        float f2;
        float log;
        float f3;
        float f4;
        float f5;
        ColorMatrix colorMatrix3 = this.f10356;
        colorMatrix3.reset();
        float f6 = this.f10357;
        float[] fArr2 = this.f10353;
        boolean z2 = true;
        if (f6 != 1.0f) {
            float f7 = 1.0f - f6;
            float f8 = 0.2999f * f7;
            float f9 = 0.587f * f7;
            float f10 = f7 * 0.114f;
            fArr2[0] = f8 + f6;
            fArr2[1] = f9;
            fArr2[2] = f10;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = f8;
            fArr2[6] = f9 + f6;
            fArr2[7] = f10;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = f8;
            fArr2[11] = f9;
            fArr2[12] = f10 + f6;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            colorMatrix3.set(fArr2);
            z = true;
        } else {
            z = false;
        }
        float f11 = this.f10358;
        ColorMatrix colorMatrix4 = this.f10355;
        if (f11 != 1.0f) {
            colorMatrix4.setScale(f11, f11, f11, 1.0f);
            colorMatrix3.postConcat(colorMatrix4);
            z = true;
        }
        float f12 = this.f10359;
        if (f12 != 1.0f) {
            if (f12 <= 0.0f) {
                f12 = 0.01f;
            }
            float f13 = (5000.0f / f12) / 100.0f;
            if (f13 > 66.0f) {
                f2 = 161.11957f;
                c3 = 14;
                c4 = '\r';
                colorMatrix2 = colorMatrix4;
                double d = f13 - 60.0f;
                c = '\f';
                c5 = 11;
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                c6 = '\t';
            } else {
                colorMatrix2 = colorMatrix4;
                c = '\f';
                c3 = 14;
                f2 = 161.11957f;
                c4 = '\r';
                c5 = 11;
                c6 = '\t';
                log = (((float) Math.log(f13)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            if (f13 >= 66.0f) {
                c2 = '\n';
                f4 = 138.51773f;
                f5 = 255.0f;
            } else if (f13 > 19.0f) {
                c2 = '\n';
                f4 = 138.51773f;
                f5 = (((float) Math.log(f13 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                c2 = '\n';
                f4 = 138.51773f;
                f5 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f5, 0.0f));
            float log2 = (((float) Math.log(50.0f)) * 99.4708f) - f2;
            float log3 = (((float) Math.log(40.0f)) * f4) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log3, 0.0f));
            fArr2[0] = min / min4;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = min2 / min5;
            fArr2[7] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[c6] = 0.0f;
            fArr2[c2] = 0.0f;
            fArr2[c5] = 0.0f;
            fArr2[c] = min6;
            fArr2[c4] = 0.0f;
            fArr2[c3] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            fArr = fArr2;
            colorMatrix = colorMatrix2;
            colorMatrix.set(fArr);
            colorMatrix3.postConcat(colorMatrix);
            z = true;
            f = 1.0f;
        } else {
            fArr = fArr2;
            colorMatrix = colorMatrix4;
            c = '\f';
            c2 = '\n';
            f = 1.0f;
            c3 = 14;
            c4 = '\r';
            c5 = 11;
            c6 = '\t';
        }
        float f14 = this.f10354;
        if (f14 != f) {
            fArr[0] = f14;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f14;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[c6] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c] = f14;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            colorMatrix3.postConcat(colorMatrix);
        } else {
            z2 = z;
        }
        if (z2) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        } else {
            imageView.clearColorFilter();
        }
    }
}
