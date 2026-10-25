package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Z1JV */
/* renamed from: l.ܿ᩸, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C17606 extends ViewGroup {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    public static final boolean MEASURE = false;
    public static final String TAG = "ConstraintLayout";
    public static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray mChildrenByIds;
    public ArrayList mConstraintHelpers;
    public C7023 mConstraintLayoutSpec;
    public C4201 mConstraintSet;
    public int mConstraintSetId;
    public AbstractC0672 mConstraintsChangedListener;
    public HashMap mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C21446 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C18312 mMeasurer;
    public C14389 mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOnMeasureHeightMeasureSpec;
    public int mOnMeasureWidthMeasureSpec;
    public int mOptimizationLevel;
    public SparseArray mTempMapIdToWidget;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, (Integer) obj2);
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public C17606(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(null, 0, 0);
    }

    public C17606(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, 0, 0);
    }

    public C17606(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, i, 0);
    }

    @TargetApi(21)
    public C17606(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41152(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m35712(this);
        this.mLayoutWidget.m48567(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C4201 c4201 = new C4201();
                        this.mConstraintSet = c4201;
                        c4201.m12671(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m48572(this.mOptimizationLevel);
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C7023(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C15094 viewWidget = getViewWidget(view);
        if ((view instanceof C1378) && !(viewWidget instanceof C3101)) {
            C16900 c16900 = (C16900) view.getLayoutParams();
            C3101 c3101 = new C3101();
            c16900.f51902 = c3101;
            c16900.f51912 = true;
            c3101.m9462(c16900.f51941);
        }
        if (view instanceof AbstractC7539) {
            AbstractC7539 abstractC7539 = (AbstractC7539) view;
            abstractC7539.m20236();
            ((C16900) view.getLayoutParams()).f51901 = true;
            if (!this.mConstraintHelpers.contains(abstractC7539)) {
                this.mConstraintHelpers.add(abstractC7539);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C15094 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f18169.remove(viewWidget);
        viewWidget.mo16611();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m41156() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            m41155();
        }
        return z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41155() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C15094 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo16611();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m41151(childAt.getId()).m35713(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C19724)) {
                    C19724 c19724 = (C19724) childAt2;
                    if (c19724.f63745 == null) {
                        c19724.f63745 = new C4201();
                    }
                    c19724.f63745.m12677(c19724);
                    this.mConstraintSet = c19724.f63745;
                }
            }
        }
        C4201 c4201 = this.mConstraintSet;
        if (c4201 != null) {
            c4201.m12682(this);
        }
        this.mLayoutWidget.f18169.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC7539) this.mConstraintHelpers.get(i4)).m20238(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C8434) {
                ((C8434) childAt3).m22116(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C15094 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C16900 c16900 = (C16900) childAt5.getLayoutParams();
                C21446 c21446 = this.mLayoutWidget;
                c21446.f18169.add(viewWidget2);
                C15094 c15094 = viewWidget2.f46132;
                if (c15094 != null) {
                    ((C5923) c15094).f18169.remove(viewWidget2);
                    viewWidget2.mo16611();
                }
                viewWidget2.f46132 = c21446;
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, c16900, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r19, android.view.View r20, l.C15094 r21, l.C16900 r22, android.util.SparseArray r23) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17606.applyConstraintsFromLayoutParams(boolean, android.view.View, l.ܶ۠, l.ܽ᩸, android.util.SparseArray):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C15094 m41151(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = (View) this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C16900) view.getLayoutParams()).f51902;
    }

    public final C15094 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C16900) view.getLayoutParams()).f51902;
    }

    public void fillMetrics(C14389 c14389) {
        this.mLayoutWidget.m48581();
    }

    public void resolveSystem(C21446 c21446, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int m41149 = m41149();
        C18312 c18312 = this.mMeasurer;
        c18312.f56933 = max;
        c18312.f56936 = max2;
        c18312.f56937 = m41149;
        c18312.f56935 = i4;
        c18312.f56934 = i2;
        c18312.f56932 = i3;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 > 0 || max4 > 0) {
            if (isRtl()) {
                max3 = max4;
            }
        } else {
            max3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - m41149;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c21446, mode, i5, mode2, i6);
        c21446.m48565(i, mode, i5, mode2, i6, max3, max);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C18312 c18312 = this.mMeasurer;
        int i5 = c18312.f56935;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + c18312.f56937, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m35732()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m48577(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m41156()) {
                this.mLayoutWidget.m48570();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41149() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public void setSelfDimensionBehaviour(C21446 c21446, int i, int i2, int i3, int i4) {
        EnumC8040 enumC8040;
        C18312 c18312 = this.mMeasurer;
        int i5 = c18312.f56935;
        int i6 = c18312.f56937;
        EnumC8040 enumC80402 = EnumC8040.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC8040 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC8040 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            enumC8040 = enumC80402;
            i2 = 0;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC8040 = enumC80402;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC80402 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            enumC80402 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
            i4 = 0;
        }
        if (i2 != c21446.m35753() || i4 != c21446.m35732()) {
            c21446.f69049.m39338();
        }
        c21446.m35706(0);
        c21446.m35731(0);
        c21446.m35737(this.mMaxWidth - i6);
        c21446.m35739(this.mMaxHeight - i5);
        c21446.m35725(0);
        c21446.m35755(0);
        c21446.m35717(enumC8040);
        c21446.m35770(i2);
        c21446.m35746(enumC80402);
        c21446.m35733(i4);
        c21446.m35725(this.mMinWidth - i6);
        c21446.m35755(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.m18990(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View m22115;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C16900 c16900 = (C16900) childAt.getLayoutParams();
            C15094 c15094 = c16900.f51902;
            if ((childAt.getVisibility() != 8 || c16900.f51912 || c16900.f51901 || isInEditMode) && !c16900.f51916) {
                int m35774 = c15094.m35774();
                int m35775 = c15094.m35775();
                int m35753 = c15094.m35753() + m35774;
                int m35732 = c15094.m35732() + m35775;
                childAt.layout(m35774, m35775, m35753, m35732);
                if ((childAt instanceof C8434) && (m22115 = ((C8434) childAt).m22115()) != null) {
                    m22115.setVisibility(0);
                    m22115.layout(m35774, m35775, m35753, m35732);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC7539) this.mConstraintHelpers.get(i6)).mo15917();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m48572(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m48580();
    }

    @Override // android.view.ViewGroup
    public C16900 generateLayoutParams(AttributeSet attributeSet) {
        return new C16900(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C16900 generateDefaultLayoutParams() {
        return new C16900(-2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C16900(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16900;
    }

    public void setConstraintSet(C4201 c4201) {
        this.mConstraintSet = c4201;
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC7539) this.mConstraintHelpers.get(i)).mo20237(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(AbstractC0672 abstractC0672) {
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.getClass();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C7023(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m41154();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        m41154();
        super.forceLayout();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41154() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
