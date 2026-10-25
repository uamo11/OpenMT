package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PAK1 */
/* renamed from: l.ۘۡۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3837 extends ViewGroup {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f12254;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12255;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f12256;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12257;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12258;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12259;

    public C3837(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3837(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19743.f63784);
        this.f12258 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12259 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12254 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12256 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount() / 2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            int i7 = i6 * 2;
            View childAt = getChildAt(i7);
            View childAt2 = getChildAt(i7 + 1);
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            childAt2.measure(makeMeasureSpec, makeMeasureSpec2);
            if (childAt.getMeasuredWidth() > i4) {
                i4 = childAt.getMeasuredWidth();
            }
            if (childAt2.getMeasuredWidth() > i5) {
                i5 = childAt2.getMeasuredWidth();
            }
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f12258 + i4 + i5 > paddingLeft) {
            this.f12257 = false;
            while (i3 < childCount) {
                int i8 = i3 * 2;
                View childAt3 = getChildAt(i8);
                View childAt4 = getChildAt(i8 + 1);
                if (i3 != 0) {
                    paddingBottom += this.f12256;
                }
                paddingBottom += childAt4.getMeasuredHeight() + childAt3.getMeasuredHeight() + this.f12254;
                i3++;
            }
        } else {
            this.f12257 = true;
            this.f12255 = i4;
            while (i3 < childCount) {
                int i9 = i3 * 2;
                View childAt5 = getChildAt(i9);
                View childAt6 = getChildAt(i9 + 1);
                if (i3 != 0) {
                    paddingBottom += this.f12259;
                }
                paddingBottom += Math.max(childAt5.getMeasuredHeight(), childAt6.getMeasuredHeight());
                i3++;
            }
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int childCount = getChildCount() / 2;
        if (!this.f12257) {
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int i10 = i9 * 2;
                View childAt = getChildAt(i10);
                View childAt2 = getChildAt(i10 + 1);
                childAt.layout(0, i8, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i8);
                int measuredHeight = childAt.getMeasuredHeight() + i8 + this.f12254;
                childAt2.layout(0, measuredHeight, i7, childAt2.getMeasuredHeight() + measuredHeight);
                i8 = childAt2.getMeasuredHeight() + measuredHeight + this.f12256;
            }
            return;
        }
        int i11 = this.f12255;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int i14 = i13 * 2;
            View childAt3 = getChildAt(i14);
            View childAt4 = getChildAt(i14 + 1);
            int measuredHeight2 = childAt3.getMeasuredHeight();
            int measuredHeight3 = childAt4.getMeasuredHeight();
            if (measuredHeight2 > measuredHeight3) {
                i6 = (measuredHeight2 - measuredHeight3) / 2;
                i5 = 0;
            } else {
                i5 = (measuredHeight3 - measuredHeight2) / 2;
                i6 = 0;
            }
            int i15 = i5 + i12;
            childAt3.layout(0, i15, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight() + i15);
            int i16 = i6 + i12;
            childAt4.layout(this.f12258 + i11, i16, i7, childAt4.getMeasuredHeight() + i16);
            i12 = this.f12259 + Math.max(measuredHeight2, measuredHeight3) + i12;
        }
    }
}
