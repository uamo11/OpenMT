package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.o;
import java.util.List;

/* compiled from: K4ND */
/* renamed from: l.ۜۗۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6495 extends AbstractC17366 implements InterfaceC7242, InterfaceC8194 {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final float MAX_SCROLL_FACTOR = 0.33333334f;
    public static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C16372 mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C17784 mLayoutChunkResult;
    public C17078 mLayoutState;
    public int mOrientation;
    public AbstractC2262 mOrientationHelper;
    public C23428 mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    @Override // l.AbstractC17366
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C2550 c2550, C21600 c21600, C16372 c16372, int i) {
    }

    public C6495(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public C6495(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C16372();
        this.mLayoutChunkResult = new C17784();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public C6495(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C16372();
        this.mLayoutChunkResult = new C17784();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C18072 m40694 = AbstractC17366.m40694(context, attributeSet, i, i2);
        setOrientation(m40694.f56290);
        setReverseLayout(m40694.f56291);
        setStackFromEnd(m40694.f56293);
    }

    @Override // l.AbstractC17366
    public C14543 generateDefaultLayoutParams() {
        return new C14543(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // l.AbstractC17366
    public void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        super.onDetachedFromWindow(c13132, c2550);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c2550);
            c2550.f8075.clear();
            c2550.m8082();
        }
    }

    @Override // l.AbstractC17366
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // l.AbstractC17366
    public Parcelable onSaveInstanceState() {
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 == null) {
            C23428 c234282 = new C23428();
            if (getChildCount() > 0) {
                ensureLayoutState();
                boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
                c234282.f75229 = z;
                if (z) {
                    View childClosestToEnd = getChildClosestToEnd();
                    c234282.f75230 = this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(childClosestToEnd);
                    c234282.f75228 = getPosition(childClosestToEnd);
                    return c234282;
                }
                View childClosestToStart = getChildClosestToStart();
                c234282.f75228 = getPosition(childClosestToStart);
                c234282.f75230 = this.mOrientationHelper.mo7485(childClosestToStart) - this.mOrientationHelper.mo7478();
                return c234282;
            }
            c234282.f75228 = -1;
            return c234282;
        }
        C23428 c234283 = new C23428();
        c234283.f75228 = c23428.f75228;
        c234283.f75230 = c23428.f75230;
        c234283.f75229 = c23428.f75229;
        return c234283;
    }

    @Override // l.AbstractC17366
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C23428) {
            C23428 c23428 = (C23428) parcelable;
            this.mPendingSavedState = c23428;
            if (this.mPendingScrollPosition != -1) {
                c23428.f75228 = -1;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC17366
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // l.AbstractC17366
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C19370.m44628(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC2262 m7471 = AbstractC2262.m7471(this, i);
            this.mOrientationHelper = m7471;
            this.mAnchorInfo.f50365 = m7471;
            this.mOrientation = i;
            requestLayout();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m17938() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    @Override // l.AbstractC17366
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public void calculateExtraLayoutSpace(C21600 c21600, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c21600);
        if (this.mLayoutState.f52366 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // l.AbstractC17366
    public void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext());
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }

    @Override // l.InterfaceC8194
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // l.AbstractC17366
    public void onLayoutChildren(C2550 c2550, C21600 c21600) {
        int i;
        int i2;
        int i3;
        int i4;
        int m17920;
        int i5;
        View findViewByPosition;
        int mo7485;
        int i6;
        int i7;
        int i8 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c21600.m48777() == 0) {
            removeAndRecycleAllViews(c2550);
            return;
        }
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null && (i7 = c23428.f75228) >= 0) {
            this.mPendingScrollPosition = i7;
        }
        ensureLayoutState();
        this.mLayoutState.f52358 = false;
        m17938();
        View focusedChild = getFocusedChild();
        C16372 c16372 = this.mAnchorInfo;
        if (!c16372.f50366 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c16372.m38536();
            C16372 c163722 = this.mAnchorInfo;
            c163722.f50364 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m17936(c2550, c21600, c163722);
            this.mAnchorInfo.f50366 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo7485(focusedChild) >= this.mOrientationHelper.mo7476() || this.mOrientationHelper.mo7473(focusedChild) <= this.mOrientationHelper.mo7478())) {
            this.mAnchorInfo.m38537(getPosition(focusedChild), focusedChild);
        }
        C17078 c17078 = this.mLayoutState;
        c17078.f52366 = c17078.f52360 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21600, iArr);
        int mo7478 = this.mOrientationHelper.mo7478() + Math.max(0, this.mReusableIntPair[0]);
        int mo7480 = this.mOrientationHelper.mo7480() + Math.max(0, this.mReusableIntPair[1]);
        if (c21600.f69359 && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                i6 = this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(findViewByPosition);
                mo7485 = this.mPendingScrollPositionOffset;
            } else {
                mo7485 = this.mOrientationHelper.mo7485(findViewByPosition) - this.mOrientationHelper.mo7478();
                i6 = this.mPendingScrollPositionOffset;
            }
            int i9 = i6 - mo7485;
            if (i9 > 0) {
                mo7478 += i9;
            } else {
                mo7480 -= i9;
            }
        }
        C16372 c163723 = this.mAnchorInfo;
        if (!c163723.f50364 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(c2550, c21600, c163723, i8);
        detachAndScrapAttachedViews(c2550);
        this.mLayoutState.f52364 = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f52356 = 0;
        C16372 c163724 = this.mAnchorInfo;
        if (c163724.f50364) {
            m17937(c163724);
            C17078 c170782 = this.mLayoutState;
            c170782.f52362 = mo7478;
            fill(c2550, c170782, c21600, false);
            C17078 c170783 = this.mLayoutState;
            i2 = c170783.f52365;
            int i10 = c170783.f52359;
            int i11 = c170783.f52355;
            if (i11 > 0) {
                mo7480 += i11;
            }
            m17928(this.mAnchorInfo);
            C17078 c170784 = this.mLayoutState;
            c170784.f52362 = mo7480;
            c170784.f52359 += c170784.f52363;
            fill(c2550, c170784, c21600, false);
            C17078 c170785 = this.mLayoutState;
            i = c170785.f52365;
            int i12 = c170785.f52355;
            if (i12 > 0) {
                m17934(i10, i2);
                C17078 c170786 = this.mLayoutState;
                c170786.f52362 = i12;
                fill(c2550, c170786, c21600, false);
                i2 = this.mLayoutState.f52365;
            }
        } else {
            m17928(c163724);
            C17078 c170787 = this.mLayoutState;
            c170787.f52362 = mo7480;
            fill(c2550, c170787, c21600, false);
            C17078 c170788 = this.mLayoutState;
            int i13 = c170788.f52365;
            int i14 = c170788.f52359;
            int i15 = c170788.f52355;
            if (i15 > 0) {
                mo7478 += i15;
            }
            m17937(this.mAnchorInfo);
            C17078 c170789 = this.mLayoutState;
            c170789.f52362 = mo7478;
            c170789.f52359 += c170789.f52363;
            fill(c2550, c170789, c21600, false);
            C17078 c1707810 = this.mLayoutState;
            int i16 = c1707810.f52365;
            int i17 = c1707810.f52355;
            if (i17 > 0) {
                m17923(i14, i13);
                C17078 c1707811 = this.mLayoutState;
                c1707811.f52362 = i17;
                fill(c2550, c1707811, c21600, false);
                i = this.mLayoutState.f52365;
            } else {
                i = i13;
            }
            i2 = i16;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int m179202 = m17920(i, c2550, c21600, true);
                i3 = i2 + m179202;
                i4 = i + m179202;
                m17920 = m17931(i3, c2550, c21600, false);
            } else {
                int m17931 = m17931(i2, c2550, c21600, true);
                i3 = i2 + m17931;
                i4 = i + m17931;
                m17920 = m17920(i4, c2550, c21600, false);
            }
            i2 = i3 + m17920;
            i = i4 + m17920;
        }
        m17927(c2550, c21600, i2, i);
        if (!c21600.f69359) {
            this.mOrientationHelper.m7486();
        } else {
            this.mAnchorInfo.m38536();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // l.AbstractC17366
    public void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m38536();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17936(C2550 c2550, C21600 c21600, C16372 c16372) {
        if (m17930(c21600, c16372) || m17929(c2550, c21600, c16372)) {
            return;
        }
        c16372.m38534();
        c16372.f50367 = this.mStackFromEnd ? c21600.m48777() - 1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17929(C2550 c2550, C21600 c21600, C16372 c16372) {
        View findReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                c16372.getClass();
                C14543 c14543 = (C14543) focusedChild.getLayoutParams();
                if (!c14543.f44554.isRemoved() && c14543.f44554.getLayoutPosition() >= 0 && c14543.f44554.getLayoutPosition() < c21600.m48777()) {
                    c16372.m38537(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (findReferenceChild = findReferenceChild(c2550, c21600, c16372.f50364, z3)) != null) {
                c16372.m38535(getPosition(findReferenceChild), findReferenceChild);
                if (!c21600.f69359 && supportsPredictiveItemAnimations()) {
                    int mo7485 = this.mOrientationHelper.mo7485(findReferenceChild);
                    int mo7473 = this.mOrientationHelper.mo7473(findReferenceChild);
                    int mo7478 = this.mOrientationHelper.mo7478();
                    int mo7476 = this.mOrientationHelper.mo7476();
                    boolean z4 = mo7473 <= mo7478 && mo7485 < mo7478;
                    if (mo7485 >= mo7476 && mo7473 > mo7476) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (c16372.f50364) {
                            mo7478 = mo7476;
                        }
                        c16372.f50363 = mo7478;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17920(int i, C2550 c2550, C21600 c21600, boolean z) {
        int mo7476;
        int mo74762 = this.mOrientationHelper.mo7476() - i;
        if (mo74762 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-mo74762, c2550, c21600);
        int i3 = i + i2;
        if (!z || (mo7476 = this.mOrientationHelper.mo7476() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7474(mo7476);
        return mo7476 + i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m17931(int i, C2550 c2550, C21600 c21600, boolean z) {
        int mo7478;
        int mo74782 = i - this.mOrientationHelper.mo7478();
        if (mo74782 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(mo74782, c2550, c21600);
        int i3 = i + i2;
        if (!z || (mo7478 = i3 - this.mOrientationHelper.mo7478()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7474(-mo7478);
        return i2 - mo7478;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17928(C16372 c16372) {
        m17923(c16372.f50367, c16372.f50363);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17923(int i, int i2) {
        this.mLayoutState.f52355 = this.mOrientationHelper.mo7476() - i2;
        C17078 c17078 = this.mLayoutState;
        c17078.f52363 = this.mShouldReverseLayout ? -1 : 1;
        c17078.f52359 = i;
        c17078.f52366 = 1;
        c17078.f52365 = i2;
        c17078.f52361 = Integer.MIN_VALUE;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17937(C16372 c16372) {
        m17934(c16372.f50367, c16372.f50363);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17934(int i, int i2) {
        this.mLayoutState.f52355 = i2 - this.mOrientationHelper.mo7478();
        C17078 c17078 = this.mLayoutState;
        c17078.f52359 = i;
        c17078.f52363 = this.mShouldReverseLayout ? 1 : -1;
        c17078.f52366 = -1;
        c17078.f52365 = i2;
        c17078.f52361 = Integer.MIN_VALUE;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public C17078 createLayoutState() {
        C17078 c17078 = new C17078();
        c17078.f52358 = true;
        c17078.f52362 = 0;
        c17078.f52356 = 0;
        c17078.f52357 = null;
        return c17078;
    }

    @Override // l.AbstractC17366
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null) {
            c23428.f75228 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null) {
            c23428.f75228 = -1;
        }
        requestLayout();
    }

    @Override // l.AbstractC17366
    public int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollOffset(C21600 c21600) {
        return m17932(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollOffset(C21600 c21600) {
        return m17932(c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollExtent(C21600 c21600) {
        return m17921(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollExtent(C21600 c21600) {
        return m17921(c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollRange(C21600 c21600) {
        return m17939(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollRange(C21600 c21600) {
        return m17939(c21600);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m17932(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16983(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17921(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16982(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m17939(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16984(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17924(int i, int i2, boolean z, C21600 c21600) {
        int mo7478;
        this.mLayoutState.f52364 = resolveIsInfinite();
        this.mLayoutState.f52366 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21600, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C17078 c17078 = this.mLayoutState;
        int i3 = z2 ? max2 : max;
        c17078.f52362 = i3;
        if (!z2) {
            max = max2;
        }
        c17078.f52356 = max;
        if (z2) {
            c17078.f52362 = this.mOrientationHelper.mo7480() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C17078 c170782 = this.mLayoutState;
            c170782.f52363 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C17078 c170783 = this.mLayoutState;
            c170782.f52359 = position + c170783.f52363;
            c170783.f52365 = this.mOrientationHelper.mo7473(childClosestToEnd);
            mo7478 = this.mOrientationHelper.mo7473(childClosestToEnd) - this.mOrientationHelper.mo7476();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C17078 c170784 = this.mLayoutState;
            c170784.f52362 = this.mOrientationHelper.mo7478() + c170784.f52362;
            C17078 c170785 = this.mLayoutState;
            c170785.f52363 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C17078 c170786 = this.mLayoutState;
            c170785.f52359 = position2 + c170786.f52363;
            c170786.f52365 = this.mOrientationHelper.mo7485(childClosestToStart);
            mo7478 = (-this.mOrientationHelper.mo7485(childClosestToStart)) + this.mOrientationHelper.mo7478();
        }
        C17078 c170787 = this.mLayoutState;
        c170787.f52355 = i2;
        if (z) {
            c170787.f52355 = i2 - mo7478;
        }
        c170787.f52361 = mo7478;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo7484() == 0 && this.mOrientationHelper.mo7472() == 0;
    }

    public void collectPrefetchPositionsForLayoutState(C21600 c21600, C17078 c17078, InterfaceC16660 interfaceC16660) {
        int i = c17078.f52359;
        if (i < 0 || i >= c21600.m48777()) {
            return;
        }
        ((C19238) interfaceC16660).m44373(i, Math.max(0, c17078.f52361));
    }

    @Override // l.AbstractC17366
    public void collectInitialPrefetchPositions(int i, InterfaceC16660 interfaceC16660) {
        boolean z;
        int i2;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null && (i2 = c23428.f75228) >= 0) {
            z = c23428.f75229;
        } else {
            m17938();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C19238) interfaceC16660).m44373(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // l.AbstractC17366
    public void collectAdjacentPrefetchPositions(int i, int i2, C21600 c21600, InterfaceC16660 interfaceC16660) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m17924(i > 0 ? 1 : -1, Math.abs(i), true, c21600);
        collectPrefetchPositionsForLayoutState(c21600, this.mLayoutState, interfaceC16660);
    }

    public int scrollBy(int i, C2550 c2550, C21600 c21600) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f52358 = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m17924(i2, abs, true, c21600);
        C17078 c17078 = this.mLayoutState;
        int fill = c17078.f52361 + fill(c2550, c17078, c21600, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo7474(-i);
        this.mLayoutState.f52360 = i;
        return i;
    }

    @Override // l.AbstractC17366
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17925(C2550 c2550, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c2550);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, c2550);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m17941(C2550 c2550, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo7473(childAt) > i3 || this.mOrientationHelper.mo7483(childAt) > i3) {
                    m17925(c2550, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo7473(childAt2) > i3 || this.mOrientationHelper.mo7483(childAt2) > i3) {
                m17925(c2550, i5, i6);
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17935(C2550 c2550, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int mo7472 = (this.mOrientationHelper.mo7472() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo7485(childAt) < mo7472 || this.mOrientationHelper.mo7479(childAt) < mo7472) {
                    m17925(c2550, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo7485(childAt2) < mo7472 || this.mOrientationHelper.mo7479(childAt2) < mo7472) {
                m17925(c2550, i4, i5);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17926(C2550 c2550, C17078 c17078) {
        if (!c17078.f52358 || c17078.f52364) {
            return;
        }
        int i = c17078.f52361;
        int i2 = c17078.f52356;
        if (c17078.f52366 == -1) {
            m17935(c2550, i, i2);
        } else {
            m17941(c2550, i, i2);
        }
    }

    public int fill(C2550 c2550, C17078 c17078, C21600 c21600, boolean z) {
        int i;
        int i2 = c17078.f52355;
        int i3 = c17078.f52361;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c17078.f52361 = i3 + i2;
            }
            m17926(c2550, c17078);
        }
        int i4 = c17078.f52355 + c17078.f52362;
        C17784 c17784 = this.mLayoutChunkResult;
        while (true) {
            if ((!c17078.f52364 && i4 <= 0) || (i = c17078.f52359) < 0 || i >= c21600.m48777()) {
                break;
            }
            c17784.f54394 = 0;
            c17784.f54395 = false;
            c17784.f54397 = false;
            c17784.f54396 = false;
            layoutChunk(c2550, c21600, c17078, c17784);
            if (!c17784.f54395) {
                int i5 = c17078.f52365;
                int i6 = c17784.f54394;
                c17078.f52365 = (c17078.f52366 * i6) + i5;
                if (!c17784.f54397 || c17078.f52357 != null || !c21600.f69359) {
                    c17078.f52355 -= i6;
                    i4 -= i6;
                }
                int i7 = c17078.f52361;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c17078.f52361 = i8;
                    int i9 = c17078.f52355;
                    if (i9 < 0) {
                        c17078.f52361 = i8 + i9;
                    }
                    m17926(c2550, c17078);
                }
                if (z && c17784.f54396) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c17078.f52355;
    }

    public void layoutChunk(C2550 c2550, C21600 c21600, C17078 c17078, C17784 c17784) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int mo7481;
        int i7;
        int i8;
        View m40078 = c17078.m40078(c2550);
        if (m40078 == null) {
            c17784.f54395 = true;
            return;
        }
        C14543 c14543 = (C14543) m40078.getLayoutParams();
        if (c17078.f52357 == null) {
            if (this.mShouldReverseLayout == (c17078.f52366 == -1)) {
                addView(m40078);
            } else {
                addView(m40078, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c17078.f52366 == -1)) {
                addDisappearingView(m40078);
            } else {
                addDisappearingView(m40078, 0);
            }
        }
        measureChildWithMargins(m40078, 0, 0);
        c17784.f54394 = this.mOrientationHelper.mo7477(m40078);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                mo7481 = getWidth() - getPaddingRight();
                i6 = mo7481 - this.mOrientationHelper.mo7481(m40078);
            } else {
                i6 = getPaddingLeft();
                mo7481 = this.mOrientationHelper.mo7481(m40078) + i6;
            }
            if (c17078.f52366 == -1) {
                i8 = c17078.f52365;
                i7 = i8 - c17784.f54394;
            } else {
                i7 = c17078.f52365;
                i8 = c17784.f54394 + i7;
            }
            i5 = i8;
            i3 = mo7481;
            i4 = i7;
        } else {
            int paddingTop = getPaddingTop();
            int mo74812 = this.mOrientationHelper.mo7481(m40078) + paddingTop;
            if (c17078.f52366 == -1) {
                i2 = c17078.f52365;
                i = i2 - c17784.f54394;
            } else {
                i = c17078.f52365;
                i2 = c17784.f54394 + i;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = mo74812;
            i6 = i;
        }
        layoutDecoratedWithMargins(m40078, i6, i4, i3, i5);
        if (c14543.f44554.isRemoved() || c14543.f44554.isUpdated()) {
            c17784.f54397 = true;
        }
        c17784.f54396 = m40078.hasFocusable();
    }

    @Override // l.AbstractC17366
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findReferenceChild(C2550 c2550, C21600 c21600, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z2) {
            i3 = getChildCount() - 1;
            i2 = -1;
            i = -1;
        } else {
            i = 1;
            i2 = childCount;
            i3 = 0;
        }
        int m48777 = c21600.m48777();
        int mo7478 = this.mOrientationHelper.mo7478();
        int mo7476 = this.mOrientationHelper.mo7476();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int position = getPosition(childAt);
            int mo7485 = this.mOrientationHelper.mo7485(childAt);
            int mo7473 = this.mOrientationHelper.mo7473(childAt);
            if (position >= 0 && position < m48777) {
                if (!((C14543) childAt.getLayoutParams()).f44554.isRemoved()) {
                    boolean z3 = mo7473 <= mo7478 && mo7485 < mo7478;
                    boolean z4 = mo7485 >= mo7476 && mo7473 > mo7476;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i3 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private View m17940() {
        return this.mShouldReverseLayout ? m17922() : m17933();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private View m17943() {
        return this.mShouldReverseLayout ? m17933() : m17922();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private View m17922() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private View m17933() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m8044(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m8044(i, i2, i3, i4);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo7485(getChildAt(i)) < this.mOrientationHelper.mo7478()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = o.a.a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m8044(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m8044(i, i2, i3, i4);
    }

    @Override // l.AbstractC17366
    public View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        int convertFocusDirectionToLayoutDirection;
        View m17940;
        View childClosestToEnd;
        m17938();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m17924(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo7487() * 0.33333334f), false, c21600);
        C17078 c17078 = this.mLayoutState;
        c17078.f52361 = Integer.MIN_VALUE;
        c17078.f52358 = false;
        fill(c2550, c17078, c21600, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            m17940 = m17943();
        } else {
            m17940 = m17940();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (!childClosestToEnd.hasFocusable()) {
            return m17940;
        }
        if (m17940 == null) {
            return null;
        }
        return childClosestToEnd;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17942() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo7485(childAt);
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int mo7485 = this.mOrientationHelper.mo7485(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int mo74852 = this.mOrientationHelper.mo7485(childAt);
                if (position2 < position) {
                    m17942();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(mo74852 < mo7485);
                    throw new RuntimeException(sb.toString());
                }
                if (mo74852 > mo7485) {
                    m17942();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int mo74853 = this.mOrientationHelper.mo7485(childAt2);
            if (position3 < position) {
                m17942();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(mo74853 < mo7485);
                throw new RuntimeException(sb2.toString());
            }
            if (mo74853 < mo7485) {
                m17942();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // l.AbstractC17366
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // l.InterfaceC7242
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m17938();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7476() - (this.mOrientationHelper.mo7477(view) + this.mOrientationHelper.mo7485(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(view2));
                return;
            }
        }
        if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7485(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7473(view2) - this.mOrientationHelper.mo7477(view));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17930(C21600 c21600, C16372 c16372) {
        int i;
        int mo7485;
        if (!c21600.f69359 && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= c21600.m48777()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i2 = this.mPendingScrollPosition;
                c16372.f50367 = i2;
                C23428 c23428 = this.mPendingSavedState;
                if (c23428 != null && c23428.f75228 >= 0) {
                    boolean z = c23428.f75229;
                    c16372.f50364 = z;
                    if (z) {
                        c16372.f50363 = this.mOrientationHelper.mo7476() - this.mPendingSavedState.f75230;
                        return true;
                    }
                    c16372.f50363 = this.mOrientationHelper.mo7478() + this.mPendingSavedState.f75230;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i2);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.mo7477(findViewByPosition) > this.mOrientationHelper.mo7487()) {
                            c16372.m38534();
                            return true;
                        }
                        if (this.mOrientationHelper.mo7485(findViewByPosition) - this.mOrientationHelper.mo7478() < 0) {
                            c16372.f50363 = this.mOrientationHelper.mo7478();
                            c16372.f50364 = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(findViewByPosition) < 0) {
                            c16372.f50363 = this.mOrientationHelper.mo7476();
                            c16372.f50364 = true;
                            return true;
                        }
                        if (c16372.f50364) {
                            mo7485 = this.mOrientationHelper.m7475() + this.mOrientationHelper.mo7473(findViewByPosition);
                        } else {
                            mo7485 = this.mOrientationHelper.mo7485(findViewByPosition);
                        }
                        c16372.f50363 = mo7485;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        c16372.f50364 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c16372.m38534();
                    return true;
                }
                boolean z2 = this.mShouldReverseLayout;
                c16372.f50364 = z2;
                if (z2) {
                    c16372.f50363 = this.mOrientationHelper.mo7476() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c16372.f50363 = this.mOrientationHelper.mo7478() + this.mPendingScrollPositionOffset;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17927(C2550 c2550, C21600 c21600, int i, int i2) {
        if (!c21600.f69354 || getChildCount() == 0 || c21600.f69359 || !supportsPredictiveItemAnimations()) {
            return;
        }
        List m8076 = c2550.m8076();
        int size = m8076.size();
        int position = getPosition(getChildAt(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC3255 abstractC3255 = (AbstractC3255) m8076.get(i5);
            if (!abstractC3255.isRemoved()) {
                if ((abstractC3255.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    i3 += this.mOrientationHelper.mo7477(abstractC3255.itemView);
                } else {
                    i4 += this.mOrientationHelper.mo7477(abstractC3255.itemView);
                }
            }
        }
        this.mLayoutState.f52357 = m8076;
        if (i3 > 0) {
            m17934(getPosition(getChildClosestToStart()), i);
            C17078 c17078 = this.mLayoutState;
            c17078.f52362 = i3;
            c17078.f52355 = 0;
            c17078.m40079((View) null);
            fill(c2550, this.mLayoutState, c21600, false);
        }
        if (i4 > 0) {
            m17923(getPosition(getChildClosestToEnd()), i2);
            C17078 c170782 = this.mLayoutState;
            c170782.f52362 = i4;
            c170782.f52355 = 0;
            c170782.m40079((View) null);
            fill(c2550, this.mLayoutState, c21600, false);
        }
        this.mLayoutState.f52357 = null;
    }

    @Deprecated
    public int getExtraLayoutSpace(C21600 c21600) {
        if (c21600.f69350 != -1) {
            return this.mOrientationHelper.mo7487();
        }
        return 0;
    }
}
