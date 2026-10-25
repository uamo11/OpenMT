package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: I4NO */
/* renamed from: l.ܺ۟ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15794 extends ViewGroup {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48722;

    public C15794(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15794(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19743.f63783);
        int i2 = obtainStyledAttributes.getInt(0, 8);
        this.f48722 = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37253(int i) {
        if (this.f48722 != i) {
            this.f48722 = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = this.f48722;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = -1;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (i6 == -1) {
                i6 = childAt.getMeasuredHeight();
            }
            if (i7 != 0 && i7 % i5 == 0) {
                paddingLeft = getPaddingLeft();
                paddingTop += i6;
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, paddingTop + i6);
            paddingLeft += childAt.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft / this.f48722, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
        if (getChildCount() == 0) {
            paddingBottom = getPaddingBottom() + getPaddingTop();
        } else {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
            }
            int measuredHeight = getChildAt(0).getMeasuredHeight();
            int i4 = this.f48722;
            int childCount2 = getChildCount();
            int i5 = childCount2 / i4;
            if (childCount2 % i4 != 0) {
                i5++;
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + (measuredHeight * i5);
        }
        setMeasuredDimension(size, paddingBottom);
    }
}
