package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/* compiled from: B5F4 */
/* renamed from: l.᩸ۙۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21354 extends C6495 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f68791;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0892 f68792;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Rect f68793;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View[] f68794;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f68795;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f68796;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f68797;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f68798;

    public C21354(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(AbstractC17366.m40694(context, attributeSet, i, i2).f56292);
    }

    public C21354(Context context, int i) {
        super(context);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(i);
    }

    public C21354(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(i);
    }

    @Override // l.C6495
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // l.AbstractC17366
    public final int getRowCountForAccessibility(C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 0) {
            return this.f68798;
        }
        if (c21600.m48777() < 1) {
            return 0;
        }
        return m48384(c21600.m48777() - 1, c2550, c21600) + 1;
    }

    @Override // l.AbstractC17366
    public final int getColumnCountForAccessibility(C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 1) {
            return this.f68798;
        }
        if (c21600.m48777() < 1) {
            return 0;
        }
        return m48384(c21600.m48777() - 1, c2550, c21600) + 1;
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfoForItem(C2550 c2550, C21600 c21600, View view, C14369 c14369) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C7948)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c14369);
            return;
        }
        C7948 c7948 = (C7948) layoutParams;
        int m48384 = m48384(c7948.f44554.getLayoutPosition(), c2550, c21600);
        if (this.mOrientation == 0) {
            c14369.m34286(C17898.m41877(c7948.f24586, c7948.f24585, m48384, 1, false, false));
        } else {
            c14369.m34286(C17898.m41877(m48384, 1, c7948.f24586, c7948.f24585, false, false));
        }
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfo(C2550 c2550, C21600 c21600, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(c2550, c21600, c14369);
        c14369.m34281((CharSequence) GridView.class.getName());
    }

    @Override // l.C6495, l.AbstractC17366
    public final void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.f68795 = false;
    }

    @Override // l.AbstractC17366
    public final void onItemsAdded(C13132 c13132, int i, int i2) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsChanged(C13132 c13132) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsRemoved(C13132 c13132, int i, int i2) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsUpdated(C13132 c13132, int i, int i2, Object obj) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsMoved(C13132 c13132, int i, int i2, int i3) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.C6495, l.AbstractC17366
    public final C14543 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C7948(-2, -1);
        }
        return new C7948(-1, -2);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C7948(context, attributeSet);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C7948 c7948;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c7948 = new C7948((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c7948 = new C7948(layoutParams);
        }
        c7948.f24586 = -1;
        c7948.f24585 = 0;
        return c7948;
    }

    @Override // l.AbstractC17366
    public final boolean checkLayoutParams(C14543 c14543) {
        return c14543 instanceof C7948;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48390() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m48388(height - paddingTop);
    }

    @Override // l.AbstractC17366
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int m40691;
        int m406912;
        if (this.f68791 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            m406912 = AbstractC17366.m40691(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f68791;
            m40691 = AbstractC17366.m40691(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            m40691 = AbstractC17366.m40691(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f68791;
            m406912 = AbstractC17366.m40691(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(m40691, m406912);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48388(int i) {
        int i2;
        int[] iArr = this.f68791;
        int i3 = this.f68798;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f68791 = iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48392(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f68791;
            int i3 = this.f68798;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f68791;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // l.C6495
    public final void onAnchorReady(C2550 c2550, C21600 c21600, C16372 c16372, int i) {
        super.onAnchorReady(c2550, c21600, c16372, i);
        m48390();
        if (c21600.m48777() > 0 && !c21600.f69359) {
            boolean z = i == 1;
            int m48386 = m48386(c16372.f50367, c2550, c21600);
            if (z) {
                while (m48386 > 0) {
                    int i2 = c16372.f50367;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c16372.f50367 = i3;
                    m48386 = m48386(i3, c2550, c21600);
                }
            } else {
                int m48777 = c21600.m48777() - 1;
                int i4 = c16372.f50367;
                while (i4 < m48777) {
                    int i5 = i4 + 1;
                    int m483862 = m48386(i5, c2550, c21600);
                    if (m483862 <= m48386) {
                        break;
                    }
                    i4 = i5;
                    m48386 = m483862;
                }
                c16372.f50367 = i4;
            }
        }
        m48387();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48387() {
        View[] viewArr = this.f68794;
        if (viewArr == null || viewArr.length != this.f68798) {
            this.f68794 = new View[this.f68798];
        }
    }

    @Override // l.C6495, l.AbstractC17366
    public final int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        m48390();
        m48387();
        return super.scrollHorizontallyBy(i, c2550, c21600);
    }

    @Override // l.C6495, l.AbstractC17366
    public final int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        m48390();
        m48387();
        return super.scrollVerticallyBy(i, c2550, c21600);
    }

    @Override // l.C6495
    public final View findReferenceChild(C2550 c2550, C21600 c21600, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int m48777 = c21600.m48777();
        ensureLayoutState();
        int mo7478 = this.mOrientationHelper.mo7478();
        int mo7476 = this.mOrientationHelper.mo7476();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < m48777 && m48386(position, c2550, c21600) == 0) {
                if (((C14543) childAt.getLayoutParams()).f44554.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo7485(childAt) < mo7476 && this.mOrientationHelper.mo7473(childAt) >= mo7478) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // l.C6495
    public final void collectPrefetchPositionsForLayoutState(C21600 c21600, C17078 c17078, InterfaceC16660 interfaceC16660) {
        int i;
        int i2 = this.f68798;
        for (int i3 = 0; i3 < this.f68798 && (i = c17078.f52359) >= 0 && i < c21600.m48777() && i2 > 0; i3++) {
            ((C19238) interfaceC16660).m44373(c17078.f52359, Math.max(0, c17078.f52361));
            this.f68792.getClass();
            i2--;
            c17078.f52359 += c17078.f52363;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r20.f54395 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return;
     */
    @Override // l.C6495
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void layoutChunk(l.C2550 r17, l.C21600 r18, l.C17078 r19, l.C17784 r20) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21354.layoutChunk(l.ۖ۬ۧ, l.᩸۬ۧ, l.ܿۗۧ, l.ᩳۗۧ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48385(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean shouldMeasureChild;
        C7948 c7948 = (C7948) view.getLayoutParams();
        Rect rect = c7948.f44551;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c7948).topMargin + ((ViewGroup.MarginLayoutParams) c7948).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c7948).leftMargin + ((ViewGroup.MarginLayoutParams) c7948).rightMargin;
        int m48392 = m48392(c7948.f24586, c7948.f24585);
        if (this.mOrientation == 1) {
            i3 = AbstractC17366.m40692(m48392, i, i5, ((ViewGroup.MarginLayoutParams) c7948).width, false);
            i2 = AbstractC17366.m40692(this.mOrientationHelper.mo7487(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) c7948).height, true);
        } else {
            int m40692 = AbstractC17366.m40692(m48392, i, i4, ((ViewGroup.MarginLayoutParams) c7948).height, false);
            int m406922 = AbstractC17366.m40692(this.mOrientationHelper.mo7487(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) c7948).width, true);
            i2 = m40692;
            i3 = m406922;
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, i3, i2, c14543);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i3, i2, c14543);
        }
        if (shouldMeasureChild) {
            view.measure(i3, i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48391() {
        return this.f68798;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48393(int i) {
        if (i == this.f68798) {
            return;
        }
        this.f68795 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C19370.m44628(i, "Span count should be at least 1. Provided "));
        }
        this.f68798 = i;
        this.f68792.m35539();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        if (r8 == (r2 > r14)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
    
        if (r8 == (r2 > r15)) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    @Override // l.C6495, l.AbstractC17366
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r21, int r22, l.C2550 r23, l.C21600 r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21354.onFocusSearchFailed(android.view.View, int, l.ۖ۬ۧ, l.᩸۬ۧ):android.view.View");
    }

    @Override // l.C6495, l.AbstractC17366
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f68795;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48384(int i, C2550 c2550, C21600 c21600) {
        int i2;
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (!z) {
            i2 = this.f68798;
            c0892.getClass();
        } else {
            i = c2550.m8067(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f68798;
            c0892.getClass();
        }
        return AbstractC15002.m35538(i, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m48386(int i, C2550 c2550, C21600 c21600) {
        int i2;
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (!z) {
            i2 = this.f68798;
            c0892.getClass();
        } else {
            int i3 = this.f68797.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i = c2550.m8067(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f68798;
            c0892.getClass();
        }
        return i % i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m48389(int i, C2550 c2550, C21600 c21600) {
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (!z) {
            c0892.getClass();
            return 1;
        }
        int i2 = this.f68796.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c2550.m8067(i) == -1) {
            return 1;
        }
        c0892.getClass();
        return 1;
    }

    @Override // l.C6495, l.AbstractC17366
    public final void onLayoutChildren(C2550 c2550, C21600 c21600) {
        boolean z = c21600.f69359;
        SparseIntArray sparseIntArray = this.f68797;
        SparseIntArray sparseIntArray2 = this.f68796;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C7948 c7948 = (C7948) getChildAt(i).getLayoutParams();
                int layoutPosition = c7948.f44554.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c7948.f24585);
                sparseIntArray.put(layoutPosition, c7948.f24586);
            }
        }
        super.onLayoutChildren(c2550, c21600);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }
}
