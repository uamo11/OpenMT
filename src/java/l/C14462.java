package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: U6BG */
/* renamed from: l.ܳۤۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C14462 extends ViewGroup {

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static boolean f44313;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f44314;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6057 f44315;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14486 f44316;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f44317;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f44318;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44319;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public View f44320;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f44321;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f44322;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f44323;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f44324;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Rect f44325;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44326;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44327;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15886 f44328;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f44329;

    static {
        f44313 = Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34550() {
        this.f44317 = 3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34542() {
        return this.f44317;
    }

    public C14462(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14462(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44318 = 1.0f;
        this.f44321 = new CopyOnWriteArrayList();
        this.f44326 = true;
        this.f44325 = new Rect();
        this.f44329 = new ArrayList();
        C11702 c11702 = new C11702(this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C17648.m41309(this, new C22990(this));
        setImportantForAccessibility(1);
        C15886 m37622 = C15886.m37622(this, 0.5f, new C7468(this));
        this.f44328 = m37622;
        m37622.m37635(f * 400.0f);
        int i2 = C22953.f73940;
        InterfaceC7431.f22845.getClass();
        C6057 c6057 = new C6057(C13780.m33091(context), C0881.m3231(context));
        this.f44315 = c6057;
        c6057.m16896(c11702);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34540(InterfaceC10936 interfaceC10936) {
        this.f44321.add(interfaceC10936);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34543(View view) {
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27260(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34539(View view) {
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27261(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34548(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean m34545 = m34545();
        int width = m34545 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = m34545 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = m34545;
            } else {
                z = m34545;
                childAt.setVisibility((Math.max(m34545 ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(m34545 ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            m34545 = z;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            C17285 c17285 = new C17285(view.getContext());
            c17285.addView(view);
            super.addView(c17285, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C17285) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f44326 = true;
        if (this.f44315 != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                this.f44315.m16895(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44326 = true;
        C6057 c6057 = this.f44315;
        if (c6057 != null) {
            c6057.m16894();
        }
        ArrayList arrayList = this.f44329;
        if (arrayList.size() > 0) {
            ((RunnableC13817) arrayList.get(0)).getClass();
            throw null;
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e5, code lost:
    
        if (r4.width() < (r12 ? ((l.C17285) r2).getChildAt(r14).getMinimumWidth() : r2.getMinimumWidth())) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0273  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14462.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean m34545 = m34545();
        int i8 = i3 - i;
        int paddingRight = m34545 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = m34545 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f44326) {
            this.f44318 = (this.f44327 && this.f44324) ? 0.0f : 1.0f;
        }
        int i9 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1763 c1763 = (C1763) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c1763.f6115) {
                    int i11 = i8 - paddingLeft;
                    int min = (Math.min(paddingRight, i11) - i9) - (((ViewGroup.MarginLayoutParams) c1763).leftMargin + ((ViewGroup.MarginLayoutParams) c1763).rightMargin);
                    this.f44314 = min;
                    int i12 = m34545 ? ((ViewGroup.MarginLayoutParams) c1763).rightMargin : ((ViewGroup.MarginLayoutParams) c1763).leftMargin;
                    c1763.f6114 = (measuredWidth / 2) + ((i9 + i12) + min) > i11;
                    float f = min;
                    int i13 = (int) (this.f44318 * f);
                    i5 = i12 + i13 + i9;
                    this.f44318 = i13 / f;
                } else {
                    i5 = paddingRight;
                }
                if (m34545) {
                    i6 = i8 - i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i6 = i5 + measuredWidth;
                    i7 = i5;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC14486 interfaceC14486 = this.f44316;
                paddingRight = Math.abs((interfaceC14486 != null && interfaceC14486.mo18305() == C18015.f56184 && this.f44316.mo18304()) ? this.f44316.mo18303().width() : 0) + childAt.getWidth() + paddingRight;
                i9 = i5;
            }
        }
        if (this.f44326) {
            m34548(this.f44320);
        }
        this.f44326 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f44326 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f44327) {
            return;
        }
        this.f44324 = view == this.f44320;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f44327;
        C15886 c15886 = this.f44328;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c15886.getClass();
            this.f44324 = C15886.m37630(childAt, x, y);
        }
        if (!this.f44327 || (this.f44319 && actionMasked != 0)) {
            c15886.m37641();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c15886.m37641();
            return false;
        }
        if (actionMasked == 0) {
            this.f44319 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f44323 = x2;
            this.f44322 = y2;
            c15886.getClass();
            if (C15886.m37630(this.f44320, (int) x2, (int) y2) && m34546(this.f44320)) {
                z = true;
                return !c15886.m37645(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float abs = Math.abs(x3 - this.f44323);
            float abs2 = Math.abs(y3 - this.f44322);
            if (abs > c15886.m37640() && abs2 > abs) {
                c15886.m37641();
                this.f44319 = true;
                return false;
            }
        }
        z = false;
        if (c15886.m37645(motionEvent)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44327) {
            return super.onTouchEvent(motionEvent);
        }
        C15886 c15886 = this.f44328;
        c15886.m37638(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f44323 = x;
            this.f44322 = y;
            return true;
        }
        if (actionMasked == 1 && m34546(this.f44320)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f44323;
            float f2 = y2 - this.f44322;
            int m37640 = c15886.m37640();
            if ((f2 * f2) + (f * f) < m37640 * m37640 && C15886.m37630(this.f44320, (int) x2, (int) y2)) {
                m34536();
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m34536() {
        if (!this.f44327) {
            this.f44324 = false;
        }
        if (!this.f44326 && !m34541(1.0f)) {
            return false;
        }
        this.f44324 = false;
        return true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34544() {
        if (!this.f44327) {
            this.f44324 = true;
        }
        if (this.f44326 || m34541(0.0f)) {
            this.f44324 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34537() {
        m34536();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34549() {
        return !this.f44327 || this.f44318 == 0.0f;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34547() {
        return this.f44327;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34538(int i) {
        if (this.f44320 == null) {
            this.f44318 = 0.0f;
            return;
        }
        boolean m34545 = m34545();
        C1763 c1763 = (C1763) this.f44320.getLayoutParams();
        int width = this.f44320.getWidth();
        if (m34545) {
            i = (getWidth() - i) - width;
        }
        this.f44318 = (i - ((m34545 ? getPaddingRight() : getPaddingLeft()) + (m34545 ? ((ViewGroup.MarginLayoutParams) c1763).rightMargin : ((ViewGroup.MarginLayoutParams) c1763).leftMargin))) / this.f44314;
        View view = this.f44320;
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27259(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C21610 m41340;
        C21610 m413402;
        boolean m34545 = m34545() ^ m34549();
        boolean z = f44313;
        C11007 c11007 = null;
        C15886 c15886 = this.f44328;
        if (m34545) {
            c15886.m37647(1);
            if (z && (m413402 = C17648.m41340(this)) != null) {
                c11007 = m413402.m48829();
            }
            if (c11007 != null) {
                c15886.m37642(Math.max(c15886.m37646(), c11007.f33109));
            }
        } else {
            c15886.m37647(2);
            if (z && (m41340 = C17648.m41340(this)) != null) {
                c11007 = m41340.m48829();
            }
            if (c11007 != null) {
                c15886.m37642(Math.max(c15886.m37646(), c11007.f33110));
            }
        }
        C1763 c1763 = (C1763) view.getLayoutParams();
        int save = canvas.save();
        if (this.f44327 && !c1763.f6115 && this.f44320 != null) {
            Rect rect = this.f44325;
            canvas.getClipBounds(rect);
            if (m34545()) {
                rect.left = Math.max(rect.left, this.f44320.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f44320.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34541(float f) {
        int paddingLeft;
        if (this.f44327) {
            boolean m34545 = m34545();
            C1763 c1763 = (C1763) this.f44320.getLayoutParams();
            if (m34545) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1763).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f44314) + paddingRight) + this.f44320.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f44314) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1763).leftMargin);
            }
            View view = this.f44320;
            if (this.f44328.m37639(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                int i2 = C17648.f53953;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C15886 c15886 = this.f44328;
        if (c15886.m37650()) {
            if (!this.f44327) {
                c15886.m37634();
            } else {
                int i = C17648.f53953;
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        m34545();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34546(View view) {
        if (view == null) {
            return false;
        }
        return this.f44327 && ((C1763) view.getLayoutParams()).f6114 && this.f44318 > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1763();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1763 c1763;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c1763 = new C1763(layoutParams);
        } else {
            c1763 = new C1763((ViewGroup.MarginLayoutParams) layoutParams);
        }
        c1763.f6116 = 0.0f;
        return c1763;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1763) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1763(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C17991 c17991 = new C17991(super.onSaveInstanceState());
        c17991.f56131 = this.f44327 ? m34549() : this.f44324;
        c17991.f56132 = this.f44317;
        return c17991;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C17991)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17991 c17991 = (C17991) parcelable;
        super.onRestoreInstanceState(c17991.getSuperState());
        if (!c17991.f56131) {
            m34536();
        } else {
            m34544();
        }
        this.f44324 = c17991.f56131;
        this.f44317 = c17991.f56132;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34545() {
        int i = C17648.f53953;
        return getLayoutDirection() == 1;
    }
}
