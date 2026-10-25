package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;

/* compiled from: E6AF */
/* renamed from: l.֡֫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0095 extends FrameLayout implements InterfaceC1794, InterfaceC22795 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f1030;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f1031;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f1032;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f1033;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18563 f1034;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f1035;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int[] f1036;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f1037;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f1038;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public OverScroller f1039;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1040;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f1041;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f1042;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f1043;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EdgeEffect f1044;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f1045;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final float f1046;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final Rect f1047;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f1048;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C10967 f1049;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3624 f1050;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public float f1051;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f1052;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int[] f1053;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1054;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13622 f1055;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f1056;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C19147 f1057;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final float f1027 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final C8563 f1029 = new C8563();

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f1028 = {R.attr.fillViewport};

    @Override // l.InterfaceC7273
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public C0095(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector_res_0x7f040388);
    }

    public C0095(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1047 = new Rect();
        this.f1042 = true;
        this.f1035 = false;
        this.f1052 = null;
        this.f1040 = false;
        this.f1038 = true;
        this.f1054 = -1;
        this.f1053 = new int[2];
        this.f1036 = new int[2];
        this.f1034 = new C18563(getContext(), new C2213(this));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C14206.m33872(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1044 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C14206.m33872(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1032 = edgeEffect2;
        this.f1046 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1039 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1031 = viewConfiguration.getScaledTouchSlop();
        this.f1041 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1030 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1028, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f1043) {
            this.f1043 = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f1049 = new C10967();
        this.f1055 = new C13622(this);
        setNestedScrollingEnabled(true);
        C17648.m41309(this, f1029);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1055.m32750(i, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1068(int i, int i2) {
        return this.f1055.m32750(2, i2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1074(int i) {
        this.f1055.m32754(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1055.m32749(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1055.m32753(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1070(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1055.m32753(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f1055.m32745(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1055.m32746();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1074(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1055.m32751(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1055.m32748(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1055.m32747(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f1055.m32747(f, f2);
    }

    @Override // l.InterfaceC1794
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1057(i4, i5, iArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1057(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1055.m32744(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // l.InterfaceC7273
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f1049.m27277(i, i2);
        m1068(2, i2);
    }

    @Override // l.InterfaceC7273
    public final void onStopNestedScroll(View view, int i) {
        this.f1049.m27279(i);
        m1074(i);
    }

    @Override // l.InterfaceC7273
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m1057(i4, i5, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m1070(i, i2, iArr, null, 0);
    }

    @Override // l.InterfaceC7273
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m1070(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1057(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1073((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f1049.m27275();
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1066(InterfaceC3624 interfaceC3624) {
        this.f1050 = interfaceC3624;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC3624 interfaceC3624 = this.f1050;
        if (interfaceC3624 != null) {
            interfaceC3624.mo11103(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1043 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1071(keyEvent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1071(KeyEvent keyEvent) {
        this.f1047.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        if (keyEvent.isAltPressed()) {
                            return m1075(33);
                        }
                        return m1067(33);
                    }
                    if (keyCode == 20) {
                        if (keyEvent.isAltPressed()) {
                            return m1075(130);
                        }
                        return m1067(130);
                    }
                    if (keyCode == 62) {
                        m1077(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m1075(33);
                    }
                    if (keyCode == 93) {
                        return m1075(130);
                    }
                    if (keyCode == 122) {
                        m1077(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m1077(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r1 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b2, code lost:
    
        m1074(0);
        r10.onRelease();
        r11.onRelease();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ad, code lost:
    
        r1.recycle();
        r19.f1033 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        if (r1 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0095.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f1033) != null) {
            velocityTracker.recycle();
            this.f1033 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f1040) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f1056 = y;
                    this.f1054 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f1033;
                    if (velocityTracker == null) {
                        this.f1033 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f1033.addMovement(motionEvent);
                    this.f1039.computeScrollOffset();
                    if (!m1063(motionEvent) && this.f1039.isFinished()) {
                        z = false;
                    }
                    this.f1040 = z;
                    m1068(2, 0);
                }
            }
            if (!m1063(motionEvent) && this.f1039.isFinished()) {
                z = false;
            }
            this.f1040 = z;
            VelocityTracker velocityTracker2 = this.f1033;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1033 = null;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1054;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f1056) > this.f1031 && (2 & this.f1049.m27275()) == 0) {
                            this.f1040 = true;
                            this.f1056 = y2;
                            if (this.f1033 == null) {
                                this.f1033 = VelocityTracker.obtain();
                            }
                            this.f1033.addMovement(motionEvent);
                            this.f1048 = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1058(motionEvent);
                    }
                }
            }
            this.f1040 = false;
            this.f1054 = -1;
            VelocityTracker velocityTracker3 = this.f1033;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1033 = null;
            }
            if (this.f1039.springBack(getScrollX(), getScrollY(), 0, 0, 0, m1064())) {
                postInvalidateOnAnimation();
            }
            m1074(0);
        }
        return this.f1040;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m1054(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m1068(2, i3);
        }
        boolean m32753 = this.f1055.m32753(0, i, this.f1036, this.f1053, i3);
        int[] iArr = this.f1053;
        int[] iArr2 = this.f1036;
        if (m32753) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int m1064 = m1064();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && m1064() > 0)) && !z;
        boolean z3 = m1069(i4, 0, scrollY, m1064) && !this.f1055.m32749(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f1055.m32744(0, scrollY2, 0, i4 - scrollY2, this.f1053, i3, iArr2);
        int i6 = i5 + iArr[1];
        int i7 = i4 - iArr2[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f1032;
        EdgeEffect edgeEffect2 = this.f1044;
        if (i8 < 0) {
            if (z2) {
                C23379.m51832(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > m1064 && z2) {
            C23379.m51832(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f1033) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m1074(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m1062(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float m51830 = C23379.m51830(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f1046 * 0.015f;
        double log = Math.log(abs / f);
        double d = f1027;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < m51830;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m1063(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f1044;
        if (C23379.m51830(edgeEffect) != 0.0f) {
            C23379.m51832(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f1032;
        if (C23379.m51830(edgeEffect2) == 0.0f) {
            return z;
        }
        C23379.m51832(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1058(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1054) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1056 = (int) motionEvent.getY(i);
            this.f1054 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1033;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float f;
        int i2;
        if (motionEvent.getAction() == 8 && !this.f1040) {
            if ((motionEvent.getSource() & 2) != 2) {
                if ((motionEvent.getSource() & 4194304) == 4194304) {
                    i = 26;
                    f = motionEvent.getAxisValue(26);
                    i2 = getWidth() / 2;
                } else {
                    i = 0;
                    f = 0.0f;
                    i2 = 0;
                }
            } else {
                i = 9;
                f = motionEvent.getAxisValue(9);
                i2 = (int) motionEvent.getX();
            }
            if (f != 0.0f) {
                m1054(-((int) (f * m1072())), i2, 1, (motionEvent.getSource() & o.a.r) == 8194);
                if (i != 0) {
                    this.f1034.m43103(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m1072() {
        if (this.f1051 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1051 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1051;
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1069(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.f1055.m32749(1)) {
            this.f1039.springBack(i2, i4, 0, 0, 0, m1064());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1064() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m1077(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1047;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m1059(i, i2, i3);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1075(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1047;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1059(i, rect.top, rect.bottom);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m1059(int i, int i2, int i3) {
        boolean z;
        ArrayList<View> arrayList;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < size) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 >= bottom || top >= i3) {
                arrayList = focusables;
            } else {
                boolean z4 = i2 < top && bottom < i3;
                arrayList = focusables;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
            i5++;
            focusables = arrayList;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1054(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1067(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus != null && m1060(findNextFocus, height, getHeight())) {
            Rect rect = this.f1047;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m1054(m1065(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m1054(height, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && !m1060(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m1060(View view, int i, int i2) {
        Rect rect = this.f1047;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1056(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1045 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1039.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                m1068(2, 1);
            } else {
                m1074(1);
            }
            this.f1037 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1039.isFinished()) {
                this.f1039.abortAnimation();
                m1074(1);
            }
            scrollBy(i, i2);
        }
        this.f1045 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m1076(int i) {
        m1056(0 - getScrollX(), i - getScrollY(), true);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0095.computeScroll():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1065(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1042) {
            Rect rect = this.f1047;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1065 = m1065(rect);
            if (m1065 != 0) {
                scrollBy(0, m1065);
            }
        } else {
            this.f1052 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect != null && m1060(findNextFocusFromRect, 0, getHeight())) {
            return findNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1065 = m1065(rect);
        boolean z2 = m1065 != 0;
        if (z2) {
            if (!z) {
                m1056(0, m1065, false);
            } else {
                scrollBy(0, m1065);
                return z2;
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1042 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f1042 = false;
        View view = this.f1052;
        if (view != null && m1061(view, this)) {
            View view2 = this.f1052;
            Rect rect = this.f1047;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1065 = m1065(rect);
            if (m1065 != 0) {
                scrollBy(0, m1065);
            }
        }
        this.f1052 = null;
        if (!this.f1035) {
            if (this.f1057 != null) {
                scrollTo(getScrollX(), this.f1057.f60344);
                this.f1057 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1035 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1035 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1060(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f1047;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int m1065 = m1065(rect);
        if (m1065 != 0) {
            if (!this.f1038) {
                scrollBy(0, m1065);
            } else {
                m1056(0, m1065, false);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1061(View view, C0095 c0095) {
        if (view == c0095) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1061((View) parent, c0095);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1073(int i) {
        if (getChildCount() > 0) {
            this.f1039.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m1068(2, 1);
            this.f1037 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1044;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C15617.m36815(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (C15617.m36815(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1032;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(m1064(), scrollY) + height2;
        if (C15617.m36815(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (C15617.m36815(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19147)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19147 c19147 = (C19147) parcelable;
        super.onRestoreInstanceState(c19147.getSuperState());
        this.f1057 = c19147;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C19147 c19147 = new C19147(super.onSaveInstanceState());
        c19147.f60344 = getScrollY();
        return c19147;
    }
}
