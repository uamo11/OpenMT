package l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* compiled from: 47UH */
/* renamed from: l.ܿۖܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17061 extends Drawable {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Path f52291;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f52292;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17356[] f52293;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f52294;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f52295;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17356[] f52296;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Paint f52297;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f52298;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f52299;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52300;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17356[] f52301;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f52302;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52303;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Path f52304;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Path f52305;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Matrix f52306;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f52307;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Path f52308;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C17061(C17356[] c17356Arr, C17356[] c17356Arr2) {
        Path path = new Path();
        this.f52308 = path;
        this.f52306 = new Matrix();
        this.f52291 = new Path();
        this.f52305 = new Path();
        this.f52307 = 0.0f;
        this.f52292 = -1.0f;
        this.f52299 = -1.0f;
        this.f52303 = -16777216;
        this.f52300 = -16777216;
        this.f52294 = 0.0f;
        Paint paint = new Paint();
        this.f52297 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        if (!C14533.m34677(c17356Arr, c17356Arr2)) {
            throw new IllegalArgumentException();
        }
        this.f52301 = c17356Arr;
        this.f52293 = c17356Arr2;
        C17356[] m34680 = C14533.m34680(c17356Arr);
        this.f52296 = m34680;
        C14533.m34676(m34680, path);
        float f = 24;
        this.f52295 = f;
        this.f52298 = (int) ((f * C4925.m14338().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40040() {
        this.f52307 = 90.0f;
        invalidateSelf();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40037(float f) {
        this.f52292 = 1.0f;
        this.f52299 = f;
        invalidateSelf();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m40044(int i) {
        if (this.f52294 == 1.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f52302;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f52302.cancel();
        }
        if (i == 0) {
            m40041(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52302 = ofFloat;
        ofFloat.setDuration(i);
        this.f52302.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ᩳۖܽ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C17061 c17061 = C17061.this;
                c17061.getClass();
                c17061.m40041(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f52302.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40036() {
        if (this.f52294 == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f52302;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f52302.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f52302 = ofFloat;
        ofFloat.setDuration(300);
        this.f52302.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܽۖܽ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C17061 c17061 = C17061.this;
                c17061.getClass();
                c17061.m40041(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f52302.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width <= 0 || height <= 0) {
            return;
        }
        canvas.save();
        float f = width;
        float f2 = this.f52295;
        float f3 = height;
        float min = Math.min(f / f2, f3 / f2);
        float f4 = f / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.f52307;
        float f7 = f6 == 0.0f ? 0.0f : f6 + ((0.0f - f6) * this.f52294);
        int i = this.f52303;
        int i2 = this.f52300;
        Paint paint = this.f52297;
        if (i == i2) {
            paint.setColor(i);
        } else {
            paint.setColor(C7191.m19267(i, i2, this.f52294));
        }
        float f8 = this.f52292;
        float f9 = this.f52299;
        if (f8 != -1.0f && f9 != -1.0f) {
            paint.setAlpha((int) ((((f9 - f8) * this.f52294) + f8) * 255.0f));
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        Path path = this.f52308;
        if (!isHardwareAccelerated) {
            canvas.translate(f4, f5);
            if (f7 != 0.0f) {
                canvas.rotate(f7);
            }
            canvas.scale(min, min);
            float f10 = (-f2) / 2.0f;
            canvas.translate(f10, f10);
            Path path2 = this.f52304;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
            canvas.drawPath(path, paint);
        } else {
            float f11 = (-f2) / 2.0f;
            Matrix matrix = this.f52306;
            matrix.setTranslate(f11, f11);
            matrix.postScale(min, min);
            if (f7 != 0.0f) {
                matrix.postRotate(f7);
            }
            matrix.postTranslate(f4, f5);
            Path path3 = this.f52291;
            path3.reset();
            path.transform(matrix, path3);
            if (this.f52304 != null) {
                Path path4 = this.f52305;
                path4.reset();
                this.f52304.transform(matrix, path4);
                canvas.clipPath(path4);
            }
            canvas.drawPath(path3, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f52298;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f52298;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f52297.setAlpha(i);
        this.f52299 = -1.0f;
        this.f52292 = -1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52297.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40039(Path path) {
        this.f52304 = path;
        invalidateSelf();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40038(int i) {
        this.f52300 = i;
        this.f52303 = i;
        invalidateSelf();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40042(int i) {
        this.f52303 = i;
        invalidateSelf();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40043(int i) {
        this.f52300 = i;
        invalidateSelf();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40041(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (this.f52294 != max) {
            this.f52294 = max;
            C17356[] c17356Arr = this.f52296;
            int length = c17356Arr.length;
            C17356[] c17356Arr2 = this.f52301;
            if (length == c17356Arr2.length) {
                int length2 = c17356Arr2.length;
                C17356[] c17356Arr3 = this.f52293;
                if (length2 == c17356Arr3.length) {
                    if (!C14533.m34677(c17356Arr2, c17356Arr3)) {
                        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                    }
                    for (int i = 0; i < c17356Arr.length; i++) {
                        c17356Arr[i].m40686(c17356Arr2[i], c17356Arr3[i], max);
                    }
                    Path path = this.f52308;
                    path.reset();
                    C14533.m34676(c17356Arr, path);
                    invalidateSelf();
                    return;
                }
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
    }

    public final void finalize() {
        ValueAnimator valueAnimator = this.f52302;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f52302.cancel();
        }
        super.finalize();
    }
}
