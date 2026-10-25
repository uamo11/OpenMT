package l;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* compiled from: L1CU */
/* renamed from: l.᩸ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21364 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Paint f68815;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10075 f68816;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Path f68817;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float[] f68818;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float[] f68819;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Paint f68820;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Paint f68821;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68823;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Paint f68824;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float[] f68825;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f68826;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Paint f68827;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Rect f68814 = new Rect();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f68822 = 1;

    public C21364(C10075 c10075) {
        this.f68816 = c10075;
        Paint paint = new Paint();
        this.f68824 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f68827 = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f68821 = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f68815 = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c10075.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f68818 = new float[8];
        Paint paint5 = new Paint();
        this.f68820 = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f68825 = new float[100];
        this.f68826 = new int[50];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48412(Canvas canvas, HashMap hashMap, int i, int i2) {
        int i3;
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        canvas.save();
        C10075 c10075 = this.f68816;
        boolean isInEditMode = c10075.isInEditMode();
        Paint paint = this.f68824;
        if (!isInEditMode && (i2 & 1) == 2) {
            StringBuilder sb = new StringBuilder();
            Resources resources = c10075.getContext().getResources();
            i3 = c10075.f30326;
            sb.append(resources.getResourceName(i3));
            sb.append(":");
            sb.append(c10075.f30343);
            String sb2 = sb.toString();
            canvas.drawText(sb2, 10.0f, c10075.getHeight() - 30, this.f68815);
            canvas.drawText(sb2, 11.0f, c10075.getHeight() - 29, paint);
        }
        for (C19248 c19248 : hashMap.values()) {
            int m44398 = c19248.m44398();
            if (i2 > 0 && m44398 == 0) {
                m44398 = 1;
            }
            if (m44398 != 0) {
                this.f68823 = c19248.m44399(this.f68825, this.f68826);
                if (m44398 >= 1) {
                    int i4 = i / 16;
                    float[] fArr = this.f68819;
                    if (fArr == null || fArr.length != i4 * 2) {
                        this.f68819 = new float[i4 * 2];
                        this.f68817 = new Path();
                    }
                    int i5 = this.f68822;
                    float f = i5;
                    canvas.translate(f, f);
                    paint.setColor(1996488704);
                    Paint paint2 = this.f68820;
                    paint2.setColor(1996488704);
                    Paint paint3 = this.f68827;
                    paint3.setColor(1996488704);
                    Paint paint4 = this.f68821;
                    paint4.setColor(1996488704);
                    c19248.m44405(i4, this.f68819);
                    m48411(canvas, m44398, this.f68823, c19248);
                    paint.setColor(-21965);
                    paint3.setColor(-2067046);
                    paint2.setColor(-2067046);
                    paint4.setColor(-13391360);
                    float f2 = -i5;
                    canvas.translate(f2, f2);
                    m48411(canvas, m44398, this.f68823, c19248);
                    if (m44398 == 5) {
                        this.f68817.reset();
                        for (int i6 = 0; i6 <= 50; i6++) {
                            float[] fArr2 = this.f68818;
                            c19248.m44402(i6 / 50, fArr2);
                            this.f68817.moveTo(fArr2[0], fArr2[1]);
                            this.f68817.lineTo(fArr2[2], fArr2[3]);
                            this.f68817.lineTo(fArr2[4], fArr2[5]);
                            this.f68817.lineTo(fArr2[6], fArr2[7]);
                            this.f68817.close();
                        }
                        paint.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(this.f68817, paint);
                        canvas.translate(-2.0f, -2.0f);
                        paint.setColor(-65536);
                        canvas.drawPath(this.f68817, paint);
                    }
                }
            }
        }
        canvas.restore();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48411(Canvas canvas, int i, int i2, C19248 c19248) {
        int i3;
        int i4;
        Paint paint;
        float f;
        float f2;
        Paint paint2 = this.f68821;
        int[] iArr = this.f68826;
        int i5 = 1;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i6 = 0; i6 < this.f68823; i6++) {
                int i7 = iArr[i6];
                if (i7 == 1) {
                    z = true;
                }
                if (i7 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.f68819;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint2);
            }
            if (z2) {
                m48407(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f68819;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint2);
        }
        if (i == 3) {
            m48407(canvas);
        }
        canvas.drawLines(this.f68819, this.f68824);
        View view = c19248.f60588;
        if (view != null) {
            i3 = view.getWidth();
            i4 = c19248.f60588.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i8 = 4;
        int i9 = 1;
        while (i9 < i2 - 1) {
            if (i != i8 || iArr[i9 - 1] != 0) {
                int i10 = i9 * 2;
                float[] fArr3 = this.f68825;
                float f3 = fArr3[i10];
                float f4 = fArr3[i10 + i5];
                this.f68817.reset();
                this.f68817.moveTo(f3, f4 + 10.0f);
                this.f68817.lineTo(f3 + 10.0f, f4);
                this.f68817.lineTo(f3, f4 - 10.0f);
                this.f68817.lineTo(f3 - 10.0f, f4);
                this.f68817.close();
                int i11 = i9 - 1;
                c19248.m44403(i11);
                Paint paint3 = this.f68820;
                if (i == i8) {
                    int i12 = iArr[i11];
                    if (i12 == i5) {
                        m48410(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i12 == 2) {
                        m48408(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i12 == 3) {
                        paint = paint3;
                        f = f4;
                        f2 = f3;
                        m48409(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                        canvas.drawPath(this.f68817, paint);
                    }
                    paint = paint3;
                    f = f4;
                    f2 = f3;
                    canvas.drawPath(this.f68817, paint);
                } else {
                    paint = paint3;
                    f = f4;
                    f2 = f3;
                }
                if (i == 2) {
                    m48410(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (i == 3) {
                    m48408(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (i == 6) {
                    m48409(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                }
                canvas.drawPath(this.f68817, paint);
            }
            i9++;
            i8 = 4;
            i5 = 1;
        }
        float[] fArr4 = this.f68819;
        if (fArr4.length > 1) {
            float f5 = fArr4[0];
            float f6 = fArr4[1];
            Paint paint4 = this.f68827;
            canvas.drawCircle(f5, f6, 8.0f, paint4);
            float[] fArr5 = this.f68819;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint4);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48410(Canvas canvas, float f, float f2) {
        float[] fArr = this.f68819;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f68815;
        paint.getTextBounds(str, 0, length, this.f68814);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (r8.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f68821);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48407(Canvas canvas) {
        float[] fArr = this.f68819;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float min = Math.min(f, f3);
        float max = Math.max(f2, f4);
        float max2 = Math.max(f, f3);
        float max3 = Math.max(f2, f4);
        Paint paint = this.f68821;
        canvas.drawLine(min, max, max2, max3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48408(Canvas canvas, float f, float f2) {
        float[] fArr = this.f68819;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float min = Math.min(f3, f5);
        float max = Math.max(f4, f6);
        float min2 = f - Math.min(f3, f5);
        float max2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f68815;
        Rect rect = this.f68814;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f2 - 20.0f, paint);
        float min3 = Math.min(f3, f5);
        Paint paint2 = this.f68821;
        canvas.drawLine(f, f2, min3, f2, paint2);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48409(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        C10075 c10075 = this.f68816;
        sb.append(((int) ((((f - (i / 2)) * 100.0f) / (c10075.getWidth() - i)) + 0.5d)) / 100.0f);
        String sb2 = sb.toString();
        int length = sb2.length();
        Paint paint = this.f68815;
        Rect rect = this.f68814;
        paint.getTextBounds(sb2, 0, length, rect);
        canvas.drawText(sb2, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float min = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f68821;
        canvas.drawLine(f, f2, min, f2, paint2);
        String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (c10075.getHeight() - i2)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
