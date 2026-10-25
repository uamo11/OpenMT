package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* compiled from: A3PC */
/* renamed from: l.ۚ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5674 extends Drawable {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final float f17516 = (float) Math.toRadians(45.0d);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f17517;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Path f17518;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f17519;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f17520;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f17521;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f17522;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17523;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f17524;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17525;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f17526;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f17527;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f17528;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C5674(Context context) {
        Paint paint = new Paint();
        this.f17528 = paint;
        this.f17518 = new Path();
        this.f17523 = false;
        this.f17525 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C3390.f10717, R.attr.MT_Protector_res_0x7f0401ad, R.style.MT_Protector_res_0x7f1300f7);
        m15982(obtainStyledAttributes.getColor(3, 0));
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f17522 = (float) (Math.cos(f17516) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f17519 != z) {
            this.f17519 = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f17524) {
            this.f17524 = round;
            invalidateSelf();
        }
        this.f17520 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f17526 = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f17517 = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f17521 = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15982(int i) {
        Paint paint = this.f17528;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15983(boolean z) {
        if (this.f17523 != z) {
            this.f17523 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.f17525;
        if (i != 0 && (i == 1 || (i == 3 ? C8184.m21687(this) == 0 : C8184.m21687(this) == 1))) {
            z = true;
        }
        float f = this.f17517;
        float sqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f17527;
        float f3 = this.f17526;
        float m15980 = m15980(f3, sqrt, f2);
        float m159802 = m15980(f3, this.f17521, this.f17527);
        float round = Math.round(m15980(0.0f, this.f17522, this.f17527));
        float m159803 = m15980(0.0f, f17516, this.f17527);
        float m159804 = m15980(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f17527);
        double d = m15980;
        double d2 = m159803;
        float round2 = Math.round(Math.cos(d2) * d);
        float round3 = Math.round(Math.sin(d2) * d);
        Path path = this.f17518;
        path.rewind();
        float f4 = this.f17524;
        Paint paint = this.f17528;
        float m159805 = m15980(f4 + paint.getStrokeWidth(), -this.f17522, this.f17527);
        float f5 = (-m159802) / 2.0f;
        path.moveTo(f5 + round, 0.0f);
        path.rLineTo(m159802 - (round * 2.0f), 0.0f);
        path.moveTo(f5, m159805);
        path.rLineTo(round2, round3);
        path.moveTo(f5, -m159805);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f17524 + ((((int) (height - (2.0f * r4))) / 4) * 2));
        if (this.f17519) {
            canvas.rotate(m159804 * (this.f17523 ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f17528;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17528.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17520;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17520;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15981(float f) {
        if (this.f17527 != f) {
            this.f17527 = f;
            invalidateSelf();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m15980(float f, float f2, float f3) {
        return C20382.m46695(f2, f, f3, f);
    }
}
