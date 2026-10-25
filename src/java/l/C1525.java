package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* compiled from: O5DB */
/* renamed from: l.֫ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1525 extends ViewGroup {
    public static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    public static final int INDEX_BOTTOM = 2;
    public static final int INDEX_CENTER_VERTICAL = 0;
    public static final int INDEX_FILL = 3;
    public static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GRAVITY_COUNT = 4;
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1525(Context context) {
        this(context, null);
    }

    public C1525(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1525(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C3390.f10718;
        C22733 m50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, m50796.m50810(), i);
        int m50809 = m50796.m50809(1, -1);
        if (m50809 >= 0) {
            setOrientation(m50809);
        }
        int m508092 = m50796.m50809(0, -1);
        if (m508092 >= 0) {
            setGravity(m508092);
        }
        boolean m50801 = m50796.m50801(2, true);
        if (!m50801) {
            setBaselineAligned(m50801);
        }
        this.mWeightSum = m50796.m50797();
        this.mBaselineAlignedChildIndex = m50796.m50809(3, -1);
        this.mUseLargestChild = m50796.m50801(7, false);
        setDividerDrawable(m50796.m50815(5));
        this.mShowDividers = m50796.m50809(8, 0);
        this.mDividerPadding = m50796.m50803(6, 0);
        m50796.m50813();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((C7560) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((C7560) virtualChildAt2.getLayoutParams())).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        int i2 = C22461.f72738;
        boolean z = getLayoutDirection() == 1;
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i3)) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (z) {
                    left2 = virtualChildAt.getRight() + ((LinearLayout.LayoutParams) c7560).rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) c7560).leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                C7560 c75602 = (C7560) virtualChildAt2.getLayoutParams();
                if (z) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) c75602).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) c75602).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 48) {
            if (i == 16) {
                i3 = C7416.m19938(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C7560) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0320, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measureVertical(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1525.measureVertical(int, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5209(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c7560).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c7560).height;
                    ((LinearLayout.LayoutParams) c7560).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c7560).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measureHorizontal(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1525.measureHorizontal(int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5207(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c7560).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c7560).width;
                    ((LinearLayout.LayoutParams) c7560).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c7560).width = i4;
                }
            }
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutVertical(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            int r7 = r18.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r18.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r18.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r18.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            r12 = 2
            if (r1 == r0) goto L3c
            r0 = 80
            if (r1 == r0) goto L30
            int r0 = r18.getPaddingTop()
            goto L48
        L30:
            int r0 = r18.getPaddingTop()
            int r0 = r0 + r22
            int r0 = r0 - r20
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L48
        L3c:
            int r0 = r18.getPaddingTop()
            int r1 = r22 - r20
            int r2 = r6.mTotalLength
            int r0 = l.C7416.m19938(r1, r2, r12, r0)
        L48:
            r1 = 0
            r13 = 0
        L4a:
            if (r13 >= r10) goto Lcd
            android.view.View r14 = r6.getVirtualChildAt(r13)
            r15 = 1
            if (r14 != 0) goto L5b
            int r1 = r6.measureNullChild(r13)
            int r1 = r1 + r0
            r0 = r1
            goto Lc9
        L5b:
            int r1 = r14.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc9
            int r4 = r14.getMeasuredWidth()
            int r16 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            r5 = r1
            l.۟ܺ r5 = (l.C7560) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L77
            r1 = r11
        L77:
            int r2 = r18.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r15) goto L8f
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L99
        L8a:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L98
        L8f:
            int r1 = l.C7416.m19938(r9, r4, r12, r7)
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L98:
            int r1 = r1 - r2
        L99:
            r2 = r1
            boolean r1 = r6.hasDividerBeforeChildAt(r13)
            if (r1 == 0) goto La3
            int r1 = r6.mDividerHeight
            int r0 = r0 + r1
        La3:
            int r1 = r5.topMargin
            int r17 = r1 + r0
            int r0 = r6.getLocationOffset(r14)
            int r3 = r0 + r17
            r0 = r18
            r1 = r14
            r12 = r5
            r5 = r16
            r0.m5208(r1, r2, r3, r4, r5)
            int r0 = r12.bottomMargin
            int r16 = r16 + r0
            int r0 = r6.getNextLocationOffset(r14)
            int r16 = r16 + r0
            int r16 = r16 + r17
            int r0 = r6.getChildrenSkipCount(r14, r13)
            int r13 = r13 + r0
            r0 = r16
        Lc9:
            int r13 = r13 + r15
            r12 = 2
            goto L4a
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1525.layoutVertical(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutHorizontal(int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1525.layoutHorizontal(int, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5208(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i3 = this.mGravity;
        if ((i3 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public C7560 generateLayoutParams(AttributeSet attributeSet) {
        return new C7560(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C7560 generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new C7560(-2, -2);
        }
        if (i == 1) {
            return new C7560(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public C7560 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C7560)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return new C7560(layoutParams);
            }
            return new C7560((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C7560((C7560) layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7560;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }
}
