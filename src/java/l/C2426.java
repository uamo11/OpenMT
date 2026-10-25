package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;

/* compiled from: S593 */
/* renamed from: l.ۖۡۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2426 extends View {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final RectF f7721;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f7722;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f7723;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float f7724;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Paint f7725;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Paint f7726;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f7727;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f7728;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f7729;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f7730;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f7731;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f7732;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f7733;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f7734;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f7735;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Paint f7736;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7737;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final RectF f7738;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f7739;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7740;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f7741;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f7742;

    public C2426(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2426(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7727 = 100;
        this.f7740 = 0;
        this.f7728 = "%";
        this.f7729 = "";
        int rgb = Color.rgb(66, 145, 241);
        int rgb2 = Color.rgb(66, 145, 241);
        int argb = Color.argb(180, 194, 194, 194);
        this.f7738 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f7721 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f7731 = true;
        this.f7737 = true;
        this.f7730 = true;
        float f = (getResources().getDisplayMetrics().density * 1.5f) + 0.5f;
        float f2 = (getResources().getDisplayMetrics().density * 1.0f) + 0.5f;
        float f3 = getResources().getDisplayMetrics().scaledDensity * 10.0f;
        float f4 = (getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19743.f63785);
        this.f7741 = obtainStyledAttributes.getColor(3, rgb2);
        this.f7733 = obtainStyledAttributes.getColor(9, argb);
        this.f7734 = obtainStyledAttributes.getColor(4, rgb);
        this.f7735 = obtainStyledAttributes.getDimension(6, f3);
        this.f7732 = obtainStyledAttributes.getDimension(2, f);
        this.f7742 = obtainStyledAttributes.getDimension(8, f2);
        this.f7724 = obtainStyledAttributes.getDimension(5, f4);
        if (obtainStyledAttributes.getInt(7, 0) != 0) {
            this.f7730 = false;
        }
        m7859(obtainStyledAttributes.getInt(0, 0));
        int i2 = obtainStyledAttributes.getInt(1, 100);
        if (i2 > 0) {
            this.f7727 = i2;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        m7858();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return (int) this.f7735;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max((int) this.f7735, Math.max((int) this.f7732, (int) this.f7742));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m7857(i, true), m7857(i2, false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m7857(int i, boolean z) {
        int paddingTop;
        int paddingBottom;
        int suggestedMinimumHeight;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i2 = paddingBottom + paddingTop;
        if (mode == 1073741824) {
            return size;
        }
        if (z) {
            suggestedMinimumHeight = (int) this.f7735;
        } else {
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        }
        int i3 = suggestedMinimumHeight + i2;
        if (mode != Integer.MIN_VALUE) {
            return i3;
        }
        if (z) {
            return Math.max(i3, size);
        }
        return Math.min(i3, size);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.f7730;
        RectF rectF = this.f7721;
        RectF rectF2 = this.f7738;
        if (z) {
            this.f7739 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf((this.f7740 * 100) / this.f7727));
            String str = this.f7729 + this.f7739 + this.f7728;
            this.f7739 = str;
            float measureText = this.f7736.measureText(str);
            int i = this.f7740;
            float f = this.f7724;
            if (i == 0) {
                this.f7737 = false;
                this.f7722 = getPaddingLeft();
            } else {
                this.f7737 = true;
                rectF.left = getPaddingLeft();
                rectF.top = (getHeight() / 2.0f) - (this.f7732 / 2.0f);
                rectF.right = (((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f7727 * 1.0f)) * this.f7740) - f) + getPaddingLeft();
                rectF.bottom = (this.f7732 / 2.0f) + (getHeight() / 2.0f);
                this.f7722 = rectF.right + f;
            }
            this.f7723 = (int) ((getHeight() / 2.0f) - ((this.f7736.ascent() + this.f7736.descent()) / 2.0f));
            if (this.f7722 + measureText >= getWidth() - getPaddingRight()) {
                float width = (getWidth() - getPaddingRight()) - measureText;
                this.f7722 = width;
                rectF.right = width - f;
            }
            float f2 = this.f7722 + measureText + f;
            if (f2 >= getWidth() - getPaddingRight()) {
                this.f7731 = false;
            } else {
                this.f7731 = true;
                rectF2.left = f2;
                rectF2.right = getWidth() - getPaddingRight();
                rectF2.top = ((-this.f7742) / 2.0f) + (getHeight() / 2.0f);
                rectF2.bottom = (this.f7742 / 2.0f) + (getHeight() / 2.0f);
            }
        } else {
            rectF.left = getPaddingLeft();
            rectF.top = (getHeight() / 2.0f) - (this.f7732 / 2.0f);
            rectF.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f7727 * 1.0f)) * this.f7740) + getPaddingLeft();
            rectF.bottom = (this.f7732 / 2.0f) + (getHeight() / 2.0f);
            rectF2.left = rectF.right;
            rectF2.right = getWidth() - getPaddingRight();
            rectF2.top = ((-this.f7742) / 2.0f) + (getHeight() / 2.0f);
            rectF2.bottom = (this.f7742 / 2.0f) + (getHeight() / 2.0f);
        }
        if (this.f7737) {
            canvas.drawRect(rectF, this.f7726);
        }
        if (this.f7731) {
            canvas.drawRect(rectF2, this.f7725);
        }
        if (this.f7730) {
            canvas.drawText(this.f7739, this.f7722, this.f7723, this.f7736);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7858() {
        Paint paint = new Paint(1);
        this.f7726 = paint;
        paint.setColor(this.f7741);
        Paint paint2 = new Paint(1);
        this.f7725 = paint2;
        paint2.setColor(this.f7733);
        Paint paint3 = new Paint(1);
        this.f7736 = paint3;
        paint3.setColor(this.f7734);
        this.f7736.setTextSize(this.f7735);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7859(int i) {
        if (i > this.f7727 || i < 0) {
            return;
        }
        this.f7740 = i;
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7861(int i) {
        this.f7734 = i;
        this.f7736.setColor(i);
        invalidate();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7862(int i) {
        this.f7741 = i;
        this.f7726.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", this.f7734);
        bundle.putFloat("text_size", this.f7735);
        bundle.putFloat("reached_bar_height", this.f7732);
        bundle.putFloat("unreached_bar_height", this.f7742);
        bundle.putInt("reached_bar_color", this.f7741);
        bundle.putInt("unreached_bar_color", this.f7733);
        bundle.putInt("max", this.f7727);
        bundle.putInt("progress", this.f7740);
        bundle.putString("suffix", this.f7728);
        bundle.putString("prefix", this.f7729);
        bundle.putBoolean("text_visibility", this.f7730);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7734 = bundle.getInt("text_color");
            this.f7735 = bundle.getFloat("text_size");
            this.f7732 = bundle.getFloat("reached_bar_height");
            this.f7742 = bundle.getFloat("unreached_bar_height");
            this.f7741 = bundle.getInt("reached_bar_color");
            this.f7733 = bundle.getInt("unreached_bar_color");
            m7858();
            int i = bundle.getInt("max");
            if (i > 0) {
                this.f7727 = i;
                invalidate();
            }
            m7859(bundle.getInt("progress"));
            String string = bundle.getString("prefix");
            if (string == null) {
                this.f7729 = "";
            } else {
                this.f7729 = string;
            }
            String string2 = bundle.getString("suffix");
            if (string2 == null) {
                this.f7728 = "";
            } else {
                this.f7728 = string2;
            }
            m7860(bundle.getBoolean("text_visibility") ? EnumC15830.Visible : EnumC15830.Invisible);
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7860(EnumC15830 enumC15830) {
        this.f7730 = enumC15830 == EnumC15830.Visible;
        invalidate();
    }
}
