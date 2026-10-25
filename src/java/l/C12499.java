package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import bin.mt.plus.R;

/* compiled from: J5NH */
/* renamed from: l.۫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C12499 extends C9503 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f37535;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f37536;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4738 f37537;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f37538;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f37539;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public RunnableC13204 f37540;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final Rect f37541;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C9269 f37542;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f37543;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f37544;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f37545;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f37546;

    public C12499(Context context, boolean z) {
        super(context, null, R.attr.MT_Protector_res_0x7f0401b1);
        this.f37541 = new Rect();
        this.f37546 = 0;
        this.f37538 = 0;
        this.f37544 = 0;
        this.f37545 = 0;
        this.f37535 = z;
        setCacheColorHint(0);
        setFastScrollEnabled(true);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f37535 && this.f37539) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f37535 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f37535 || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f37535 || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4738 c4738 = drawable != null ? new C4738(drawable) : null;
        this.f37537 = c4738;
        super.setSelector(c4738);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f37546 = rect.left;
        this.f37538 = rect.top;
        this.f37544 = rect.right;
        this.f37545 = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f37540 != null) {
            return;
        }
        super.drawableStateChanged();
        C4738 c4738 = this.f37537;
        if (c4738 != null) {
            c4738.m13852(true);
        }
        Drawable selector = getSelector();
        if (selector != null && this.f37543 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // l.C9503, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f37536 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC13204 runnableC13204 = this.f37540;
        if (runnableC13204 != null) {
            C12499 c12499 = runnableC13204.f39473;
            c12499.f37540 = null;
            c12499.removeCallbacks(runnableC13204);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: ֫ */
    public int mo22295(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            if (i6 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f37540 == null) {
            RunnableC13204 runnableC13204 = new RunnableC13204(this);
            this.f37540 = runnableC13204;
            post(runnableC13204);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C22377.m50241()) {
                        C22377.m50240(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f37543 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f37540 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0128 A[ADDED_TO_REGION] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m30671(android.view.MotionEvent r14, int r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12499.m30671(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30670(boolean z) {
        this.f37539 = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f37541;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
