package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: A8GL */
/* renamed from: l.ۛۚۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5852 extends FrameLayout {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17950 = 0;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f17951;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC10086 f17952;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17953;

    public C5852(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17953 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C22736.f73440, 0, 0);
            try {
                this.f17953 = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f17952 = new RunnableC10086(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16410(float f) {
        if (this.f17951 != f) {
            this.f17951 = f;
            requestLayout();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16409() {
        return this.f17953;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16411(int i) {
        if (this.f17953 != i) {
            this.f17953 = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f17951 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f17951 / f5) - 1.0f;
        float abs = Math.abs(f6);
        RunnableC10086 runnableC10086 = this.f17952;
        if (abs <= 0.01f) {
            runnableC10086.m25349(this.f17951, f5, false);
            return;
        }
        int i3 = this.f17953;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f17951;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f17951;
                    } else {
                        f2 = this.f17951;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f17951;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f17951;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f17951;
            measuredWidth = (int) (f4 * f);
        }
        runnableC10086.m25349(this.f17951, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
