package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: S952 */
/* renamed from: l.ۚ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5600 extends Drawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f17319;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f17320;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f17323;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f17324;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f17326;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f17331;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f17332;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17333;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f17330 = new Paint(1);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Path f17329 = new Path();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f17327 = 0.5f;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f17321 = 48;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RectF f17328 = new RectF();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RectF f17322 = new RectF();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final RectF f17334 = new RectF();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF f17325 = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        C11233.m27805(rect, "padding");
        float f4 = this.f17319;
        float f5 = this.f17326;
        float f6 = f4 + f5;
        float f7 = f5 + this.f17332;
        int i = this.f17321;
        if (i == 3) {
            f = f6;
            f6 = this.f17331 + f6;
        } else if (i == 5) {
            f = this.f17331 + f6;
        } else {
            if (i == 48) {
                f3 = f7;
                f7 = this.f17320 + f7;
            } else {
                if (i != 80) {
                    return false;
                }
                f3 = this.f17320 + f7;
            }
            f2 = f3;
            f = f6;
            rect.set((int) f6, (int) f7, (int) f, (int) f2);
            return true;
        }
        f2 = f7;
        rect.set((int) f6, (int) f7, (int) f, (int) f2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C11233.m27805(canvas, "canvas");
        Rect bounds = getBounds();
        int i = this.f17321;
        float f = bounds.left;
        if (i == 3) {
            f += this.f17331;
        }
        RectF rectF = this.f17328;
        rectF.left = f;
        float f2 = bounds.top + (i == 48 ? this.f17320 : this.f17323);
        rectF.top = f2;
        float f3 = 2;
        float f4 = this.f17326 * f3;
        rectF.bottom = f4 + f2;
        float f5 = this.f17323;
        rectF.left = f + f5;
        rectF.right = f4 + f + f5;
        float f6 = getBounds().right;
        if (i == 5) {
            f6 -= this.f17331;
        }
        RectF rectF2 = this.f17322;
        rectF2.right = f6;
        float f7 = r0.top + (i == 48 ? this.f17320 : this.f17323);
        rectF2.top = f7;
        float f8 = this.f17326 * f3;
        rectF2.bottom = f8 + f7;
        float f9 = this.f17323;
        rectF2.left = (f6 - f8) - f9;
        rectF2.right = f6 - f9;
        Rect bounds2 = getBounds();
        float f10 = bounds2.right;
        if (i == 5) {
            f10 -= this.f17331;
        }
        RectF rectF3 = this.f17334;
        rectF3.right = f10;
        float f11 = bounds2.bottom;
        if (i == 80) {
            f11 -= this.f17320;
        }
        float f12 = this.f17326 * f3;
        float f13 = this.f17323;
        rectF3.left = (f10 - f12) - f13;
        rectF3.right = f10 - f13;
        rectF3.top = (f11 - f12) - f13;
        rectF3.bottom = f11 - f13;
        Rect bounds3 = getBounds();
        float f14 = bounds3.left;
        if (i == 3) {
            f14 += this.f17331;
        }
        RectF rectF4 = this.f17325;
        rectF4.left = f14;
        float f15 = bounds3.bottom;
        if (i == 80) {
            f15 -= this.f17320;
        }
        float f16 = this.f17326 * f3;
        float f17 = this.f17323;
        rectF4.left = f14 + f17;
        rectF4.right = f16 + f14 + f17;
        rectF4.top = (f15 - f16) - f17;
        rectF4.bottom = f15 - f17;
        Path path = this.f17329;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.f17326);
        path.arcTo(rectF, 180.0f, 90.0f);
        if (i == 48) {
            path.lineTo(((getBounds().width() * this.f17327) + getBounds().left) - (this.f17331 / f3), getBounds().top + this.f17320);
            path.lineTo((getBounds().width() * this.f17327) + getBounds().left, getBounds().top);
            path.lineTo((this.f17331 / f3) + (getBounds().width() * this.f17327) + getBounds().left, getBounds().top + this.f17320);
        }
        path.lineTo(rectF2.left + this.f17326, rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        if (i == 5) {
            path.lineTo(rectF2.right, ((getBounds().height() * this.f17327) + getBounds().top) - (this.f17320 / f3));
            path.lineTo(getBounds().right - this.f17323, (getBounds().height() * this.f17327) + getBounds().top);
            path.lineTo(rectF3.right, (this.f17320 / f3) + (getBounds().height() * this.f17327) + getBounds().top);
        }
        path.lineTo(rectF3.right, rectF3.top + this.f17326);
        path.arcTo(rectF3, 0.0f, 90.0f);
        if (i == 80) {
            path.lineTo((this.f17331 / f3) + (getBounds().right - (getBounds().width() * this.f17327)), rectF3.bottom);
            path.lineTo(getBounds().right - (getBounds().width() * this.f17327), getBounds().bottom - this.f17323);
            path.lineTo((getBounds().right - (getBounds().width() * this.f17327)) - (this.f17331 / f3), rectF3.bottom);
        }
        path.lineTo(rectF4.right - this.f17326, rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        if (i == 3) {
            path.lineTo(rectF4.left, (this.f17320 / f3) + (rectF4.bottom - (getBounds().height() * this.f17327)));
            path.lineTo(getBounds().left, rectF4.bottom - (getBounds().height() * this.f17327));
            path.lineTo(rectF.left, (rectF4.bottom - (getBounds().height() * this.f17327)) - (this.f17320 / f3));
        }
        path.close();
        int i2 = this.f17333;
        Paint paint = this.f17330;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(this.f17324);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f17323 / 2.0f);
        canvas.drawPath(path, paint);
    }

    public C5600() {
        float m27878 = C11266.m27878(6.0f);
        this.f17331 = m27878;
        this.f17320 = m27878;
        this.f17326 = C11266.m27878(4.0f);
        this.f17323 = C11266.m27878(1.0f);
        float m278782 = C11266.m27878(4.0f);
        float m278783 = C11266.m27878(2.0f);
        this.f17319 = m278782;
        this.f17332 = m278783;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f17330.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17330.setColorFilter(colorFilter);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15890(float f) {
        this.f17327 = f;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15891() {
        this.f17324 = -986896;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15889() {
        this.f17333 = -12566464;
    }
}
