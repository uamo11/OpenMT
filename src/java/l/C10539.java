package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: N933 */
/* renamed from: l.ۤ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C10539 extends View {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final Paint f31611;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final int f31612;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Rect f31613;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31614;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Rect f31615;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f31616;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3483 f31617;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f31618;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f31619;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f31620;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f31621;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int f31622;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public Path f31623;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int f31624;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f31625;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f31626;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f31627;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f31628;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f31629;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13360 f31630;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C21352 f31631;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public Point f31632;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int f31633;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f31634;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31635;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f31636;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C12655 f31637;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Rect f31638;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3483 f31639;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Point f31640;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31641;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f31642;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4894 f31643;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Paint f31644;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int f31645;

    public C10539(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10539(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31635 = new Paint();
        Paint paint = new Paint();
        this.f31611 = paint;
        Paint paint2 = new Paint();
        this.f31644 = paint2;
        Paint paint3 = new Paint();
        this.f31614 = paint3;
        this.f31637 = new C12655();
        this.f31630 = new C13360();
        this.f31643 = new C4894();
        this.f31641 = 255;
        this.f31627 = 360.0f;
        this.f31616 = 0.0f;
        this.f31642 = 0.0f;
        this.f31618 = true;
        this.f31629 = -9539986;
        this.f31638 = new Rect();
        this.f31613 = new Rect();
        this.f31615 = new Rect();
        this.f31640 = new Point();
        this.f31619 = new float[3];
        this.f31632 = null;
        this.f31625 = context.getResources().getDisplayMetrics().density;
        this.f31621 = m26463(180.0f);
        int m26463 = m26463(25.0f);
        this.f31645 = m26463;
        int m264632 = m26463(12.0f);
        this.f31620 = m264632;
        int m264633 = m26463(4.0f);
        this.f31628 = m264633;
        int m264634 = m26463(4.0f);
        this.f31622 = m264634;
        int m264635 = m26463(2.0f);
        this.f31612 = m264635;
        this.f31633 = (m264632 / 2) + m26463;
        this.f31624 = m26463(2.0f);
        this.f31636 = m26463(24.0f);
        this.f31634 = m26463(1.0f);
        this.f31626 = Math.max(m264633, Math.max(m264634 / 2, m264635));
        int i2 = (m26463 / 5) + 1;
        this.f31639 = new C3483(i2);
        this.f31617 = new C3483(i2);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(m26463(1.0f));
        paint.setAntiAlias(true);
        paint2.setColor(-4342339);
        paint2.setStyle(style);
        paint2.setStrokeWidth(m26463(2.0f));
        paint2.setAntiAlias(true);
        paint3.setShadowLayer(m26463(1.0f), 0.0f, 0.0f, -7829368);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f31641);
        bundle.putFloat("hue", this.f31627);
        bundle.putFloat("sat", this.f31616);
        bundle.putFloat("val", this.f31642);
        bundle.putBoolean("show_alpha", this.f31618);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f31641 = bundle.getInt("alpha");
            this.f31627 = bundle.getFloat("hue");
            this.f31616 = bundle.getFloat("sat");
            this.f31642 = bundle.getFloat("val");
            this.f31618 = bundle.getBoolean("show_alpha");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f31629;
        Paint paint = this.f31635;
        paint.setColor(i);
        Rect rect = this.f31638;
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, paint);
        float f = this.f31627;
        C12655 c12655 = this.f31637;
        c12655.m30934(rect, f);
        c12655.m30933(canvas);
        float f2 = this.f31616;
        float f3 = this.f31642;
        float height = rect.height();
        Point point = this.f31640;
        point.x = (int) ((f2 * rect.width()) + rect.left);
        point.y = (int) (((1.0f - f3) * height) + rect.top);
        Paint paint2 = this.f31611;
        paint2.setColor(-12303292);
        float f4 = point.x;
        float f5 = point.y;
        int m26463 = m26463(1.0f);
        int i2 = this.f31628;
        canvas.drawCircle(f4, f5, i2 - m26463, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i2, paint2);
        C13360 c13360 = this.f31630;
        Rect rect2 = this.f31613;
        c13360.m32370(rect2);
        c13360.m32369(canvas);
        int width = (int) (((this.f31627 * rect2.width()) / 360.0f) + rect2.left);
        point.x = width;
        point.y = rect2.top;
        float f6 = rect2.bottom + this.f31612;
        float f7 = width;
        float f8 = this.f31622 / 2.0f;
        Paint paint3 = this.f31644;
        canvas.drawRoundRect(f7 - f8, r3 - r12, f7 + f8, f6, 2.0f, 2.0f, paint3);
        if (this.f31618) {
            this.f31639.draw(canvas);
            int m26465 = m26465();
            C4894 c4894 = this.f31643;
            Rect rect3 = this.f31615;
            c4894.m14254(m26465, rect3);
            c4894.m14255(canvas);
            int width2 = (int) (((this.f31641 * rect3.width()) / 255.0f) + rect3.left);
            point.x = width2;
            point.y = rect3.top;
            float f9 = width2;
            canvas.drawRoundRect(f9 - f8, r2 - r12, f8 + f9, rect3.bottom + r12, 2.0f, 2.0f, paint3);
        }
        Path path = this.f31623;
        if (path != null) {
            Paint paint4 = this.f31614;
            paint4.setColor(0);
            canvas.drawPath(path, paint4);
            canvas.save();
            canvas.clipPath(path);
            this.f31617.draw(canvas);
            canvas.restore();
            paint.setColor(m26465());
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean m26464;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f31632 = null;
            } else if (action == 2) {
                m26464 = m26464(motionEvent);
            }
            m26464 = false;
        } else {
            if (!isFocused()) {
                requestFocus();
            }
            this.f31632 = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            m26464 = m26464(motionEvent);
        }
        if (m26464) {
            C21352 c21352 = this.f31631;
            if (c21352 != null) {
                DialogInterfaceOnClickListenerC3677.m11191((DialogInterfaceOnClickListenerC3677) c21352.f68790, Color.HSVToColor(this.f31641, new float[]{this.f31627, this.f31616, this.f31642}));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m26464(MotionEvent motionEvent) {
        Point point = this.f31632;
        int i = 0;
        if (point != null) {
            int i2 = point.x;
            int i3 = point.y;
            Rect rect = this.f31638;
            int i4 = rect.bottom;
            int i5 = this.f31620 / 2;
            if (i3 < i4 + i5) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float width = rect.width();
                float height = rect.height();
                float f = rect.left;
                float f2 = x < f ? 0.0f : x > ((float) rect.right) ? width : x - f;
                float f3 = rect.top;
                float[] fArr = {(1.0f / width) * f2, 1.0f - ((1.0f / height) * (y >= f3 ? y > ((float) rect.bottom) ? height : y - f3 : 0.0f))};
                this.f31616 = fArr[0];
                this.f31642 = fArr[1];
                return true;
            }
            if (i2 > this.f31633 * 2) {
                Rect rect2 = this.f31613;
                if (i3 < i5 + rect2.bottom) {
                    float x2 = motionEvent.getX();
                    float width2 = rect2.width();
                    float f4 = rect2.left;
                    this.f31627 = ((x2 >= f4 ? x2 > ((float) rect2.right) ? width2 : x2 - f4 : 0.0f) * 360.0f) / width2;
                    return true;
                }
                if (this.f31618) {
                    int x3 = (int) motionEvent.getX();
                    Rect rect3 = this.f31615;
                    int width3 = rect3.width();
                    int i6 = rect3.left;
                    if (x3 >= i6) {
                        i = x3 > rect3.right ? width3 : x3 - i6;
                    }
                    this.f31641 = (i * 255) / width3;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.f31618;
        int i3 = this.f31620;
        int i4 = this.f31621;
        if (z) {
            int paddingTop2 = getPaddingTop() + 1 + i4 + 1 + i3;
            int i5 = this.f31645;
            paddingBottom = C19373.m44633(paddingTop2, i5, i3, i5);
            paddingTop = getPaddingBottom();
        } else {
            paddingTop = ((this.f31636 * 2) + ((((getPaddingTop() + 1) + i4) + 1) + i3)) - this.f31634;
            paddingBottom = getPaddingBottom();
        }
        setMeasuredDimension(size, paddingTop + paddingBottom);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        boolean z2 = this.f31618;
        int i6 = paddingTop + 1;
        int i7 = this.f31621 + i6;
        Rect rect = this.f31638;
        rect.set(paddingLeft + 1, i6, width - 1, i7);
        int i8 = this.f31636;
        int i9 = this.f31633;
        int i10 = z2 ? i9 : i8;
        int i11 = z2 ? this.f31624 : this.f31634;
        Path path = new Path();
        this.f31623 = path;
        int i12 = rect.left;
        int i13 = rect.bottom + 1;
        int i14 = this.f31620;
        int i15 = i13 + i14;
        int i16 = i10 * 2;
        int i17 = i15 + i16;
        path.addCircle(i12 + i10, i15 + i10, i10 - i11, Path.Direction.CCW);
        this.f31617.setBounds(i12 + i11, i15 + i11, (i12 + i16) - i11, i17 - i11);
        Rect rect2 = this.f31613;
        int i18 = this.f31645;
        if (z2) {
            int m51496 = C23202.m51496(i9, 2, paddingLeft, i14);
            int i19 = rect.bottom + 1 + i14;
            i5 = width;
            rect2.set(m51496, i19, i5, i19 + i18);
        } else {
            i5 = width;
            int i20 = (int) (i18 * 1.2f);
            int i21 = ((i15 + i17) / 2) - (i20 / 2);
            rect2.set(C23202.m51496(i8, 2, paddingLeft, i14), i21, i5, i20 + i21);
        }
        if (z2) {
            int m514962 = C23202.m51496(i9, 2, paddingLeft, i14);
            int i22 = rect2.bottom + i14;
            Rect rect3 = this.f31615;
            rect3.set(m514962, i22, i5, i18 + i22);
            this.f31639.setBounds(rect3);
        }
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f31626);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26467(C21352 c21352) {
        this.f31631 = c21352;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26465() {
        float f = this.f31627;
        float[] fArr = this.f31619;
        fArr[0] = f;
        fArr[1] = this.f31616;
        fArr[2] = this.f31642;
        return Color.HSVToColor(this.f31641, fArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26466(int i) {
        float[] fArr = this.f31619;
        C7466.m20004(i, fArr);
        this.f31627 = fArr[0];
        this.f31616 = fArr[1];
        this.f31642 = fArr[2];
        if (this.f31618) {
            this.f31641 = Color.alpha(i);
        } else {
            this.f31641 = 255;
        }
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26468() {
        if (this.f31618) {
            this.f31618 = false;
            requestLayout();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m26463(float f) {
        return (int) ((f * this.f31625) + 0.5f);
    }
}
