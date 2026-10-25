package l;

import android.opengl.Matrix;
import android.view.View;

/* compiled from: 86WH */
/* renamed from: l.ۗ۠ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC3110 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f9721;

    public RunnableC3110(C5932 c5932) {
        this.f9721 = c5932;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long j;
        long j2;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        float[] fArr10;
        float[] fArr11;
        Runnable runnable;
        View view;
        float[] fArr12;
        Runnable runnable2;
        C5932 c5932 = this.f9721;
        float[] fArr13 = c5932.f18182;
        z = c5932.f18179;
        if (z) {
            z2 = c5932.f18197;
            if (z2) {
                long nanoTime = System.nanoTime();
                j = c5932.f18205;
                c5932.f18190 = nanoTime - j;
                j2 = c5932.f18190;
                double d = (j2 * 1.0E-9d) / 30.0d;
                if (d >= 4.0d) {
                    c5932.f18178 = true;
                    c5932.m16648();
                    fArr12 = c5932.f18193;
                    System.arraycopy(fArr12, 0, fArr13, 0, 16);
                    runnable2 = c5932.f18185;
                    ((RunnableC7968) runnable2).run();
                    return;
                }
                float f = (float) ((d % 1.0d) * 360.0d);
                float sin = (float) Math.sin((d % 4.0d) * 1.5707963267948966d);
                fArr = c5932.f18188;
                Matrix.setRotateM(fArr, 0, f, 0.0f, 1.0f, 0.0f);
                fArr2 = c5932.f18191;
                fArr3 = c5932.f18188;
                fArr4 = c5932.f18193;
                Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr4, 0);
                fArr5 = c5932.f18188;
                Matrix.setRotateM(fArr5, 0, 20.0f * sin, 1.0f, 0.0f, 0.0f);
                fArr6 = c5932.f18188;
                fArr7 = c5932.f18191;
                Matrix.multiplyMM(fArr13, 0, fArr6, 0, fArr7, 0);
                fArr8 = c5932.f18188;
                Matrix.setRotateM(fArr8, 0, sin * 10.0f, 0.0f, 0.0f, 1.0f);
                fArr9 = c5932.f18191;
                fArr10 = c5932.f18188;
                Matrix.multiplyMM(fArr9, 0, fArr10, 0, fArr13, 0);
                fArr11 = c5932.f18191;
                System.arraycopy(fArr11, 0, fArr13, 0, 16);
                runnable = c5932.f18185;
                ((RunnableC7968) runnable).run();
                view = c5932.f18192;
                view.postDelayed(this, 34L);
            }
        }
    }
}
