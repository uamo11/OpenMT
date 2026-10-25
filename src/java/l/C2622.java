package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* compiled from: 34ZC */
/* renamed from: l.ۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2622 extends LinearLayout {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8253;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f8254;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f8255;

    public C2622(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8255 = -1;
        int[] iArr = C3390.f10713;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C17648.m41302(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        this.f8254 = z;
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m8255(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        boolean z2 = this.f8254;
        if (z2) {
            if (size > this.f8255 && this.f8253) {
                m8255(false);
            }
            this.f8255 = size;
        }
        if (this.f8253 || View.MeasureSpec.getMode(i) != 1073741824) {
            z = false;
            i3 = i;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (z2 && !this.f8253 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            m8255(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i5 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin;
            if (this.f8253) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 += paddingBottom;
        }
        int i8 = C17648.f53953;
        if (getMinimumHeight() != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8255(boolean z) {
        if (this.f8253 != z) {
            if (!z || this.f8254) {
                this.f8253 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.MT_Protector_res_0x7f0a0543);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}
