package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* compiled from: O607 */
/* renamed from: l.۬ۧ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13064 extends ViewGroup {

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f39105;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static boolean f39106;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final boolean f39107;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C3187 f39108;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f39109;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f39110;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Paint f39111;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Matrix f39112;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f39113;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f39114;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f39115;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C15886 f39116;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C3187 f39117;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39118;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C15886 f39119;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39120;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f39121;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39122;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f39123;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f39124;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f39125;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f39126;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f39127;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f39128;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public Drawable f39129;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Rect f39130;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f39131;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5198 f39132;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1070 f39133;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f39134;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f39135;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39104 = {R.attr.colorPrimaryDark};

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39103 = {R.attr.layout_gravity};

    static {
        int i = Build.VERSION.SDK_INT;
        f39107 = true;
        f39105 = true;
        f39106 = i >= 29;
    }

    public C13064(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector_res_0x7f0401af);
    }

    public C13064(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39133 = new C1070();
        this.f39125 = DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
        this.f39111 = new Paint();
        this.f39113 = true;
        this.f39127 = 3;
        this.f39124 = 3;
        this.f39135 = 3;
        this.f39128 = 3;
        this.f39132 = new C19416(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f39114 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C3187 c3187 = new C3187(this, 3);
        this.f39108 = c3187;
        C3187 c31872 = new C3187(this, 5);
        this.f39117 = c31872;
        C15886 m37622 = C15886.m37622(this, 1.0f, c3187);
        this.f39119 = m37622;
        m37622.m37647(1);
        m37622.m37635(f2);
        c3187.m9803(m37622);
        C15886 m376222 = C15886.m37622(this, 1.0f, c31872);
        this.f39116 = m376222;
        m376222.m37647(2);
        m376222.m37635(f2);
        c31872.m9803(m376222);
        setFocusableInTouchMode(true);
        int i2 = C17648.f53953;
        setImportantForAccessibility(1);
        C17648.m41309(this, new C5304(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0364());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f39104);
            try {
                this.f39129 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C18710.f59149, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f39121 = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f39121 = getResources().getDimension(bin.mt.plus.R.dimen.MT_Protector_res_0x7f070061);
            }
            obtainStyledAttributes2.recycle();
            this.f39131 = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31650(WindowInsets windowInsets, boolean z) {
        this.f39115 = windowInsets;
        this.f39122 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31660(int i) {
        this.f39125 = i;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31651(InterfaceC8126 interfaceC8126) {
        if (interfaceC8126 == null) {
            return;
        }
        if (this.f39126 == null) {
            this.f39126 = new ArrayList();
        }
        this.f39126.add(interfaceC8126);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31659(InterfaceC8126 interfaceC8126) {
        ArrayList arrayList;
        if (interfaceC8126 == null || (arrayList = this.f39126) == null) {
            return;
        }
        arrayList.remove(interfaceC8126);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31648(int i, int i2) {
        View m31656;
        int i3 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f39127 = i;
        } else if (i2 == 5) {
            this.f39124 = i;
        } else if (i2 == 8388611) {
            this.f39135 = i;
        } else if (i2 == 8388613) {
            this.f39128 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f39119 : this.f39116).m37641();
        }
        if (i != 1) {
            if (i == 2 && (m31656 = m31656(absoluteGravity)) != null) {
                m31663(m31656);
                return;
            }
            return;
        }
        View m316562 = m31656(absoluteGravity);
        if (m316562 != null) {
            m31649(m316562, true);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31658(int i, View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        m31648(i, ((C15180) view.getLayoutParams()).f46371);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31661(int i) {
        int i2 = C17648.f53953;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f39127;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f39135 : this.f39128;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i == 5) {
            int i5 = this.f39124;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f39128 : this.f39135;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 8388611) {
            int i7 = this.f39135;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f39127 : this.f39124;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i9 = this.f39128;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f39124 : this.f39127;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31644(View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m31661(((C15180) view.getLayoutParams()).f46371);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31662(int i, View view) {
        int i2;
        View rootView;
        int m37651 = this.f39119.m37651();
        int m376512 = this.f39116.m37651();
        if (m37651 == 1 || m376512 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (m37651 != 2 && m376512 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C15180) view.getLayoutParams()).f46373;
            if (f == 0.0f) {
                C15180 c15180 = (C15180) view.getLayoutParams();
                if ((c15180.f46374 & 1) == 1) {
                    c15180.f46374 = 0;
                    ArrayList arrayList = this.f39126;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC8126) this.f39126.get(size)).onDrawerClosed(view);
                        }
                    }
                    m31637(view, false);
                    m31641(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C15180 c151802 = (C15180) view.getLayoutParams();
                if ((c151802.f46374 & 1) == 0) {
                    c151802.f46374 = 1;
                    ArrayList arrayList2 = this.f39126;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC8126) this.f39126.get(size2)).onDrawerOpened(view);
                        }
                    }
                    m31637(view, true);
                    m31641(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f39118) {
            this.f39118 = i2;
            ArrayList arrayList3 = this.f39126;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC8126) this.f39126.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31637(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !m31643(childAt)) || (z && childAt == view)) {
                int i3 = C17648.f53953;
                i = 1;
            } else {
                int i4 = C17648.f53953;
                i = 4;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31641(View view) {
        C13847 c13847 = C13847.f41298;
        C17648.m41337(c13847.m33204(), view);
        if (!m31638(view) || m31644(view) == 2) {
            return;
        }
        C17648.m41308(view, c13847, null, this.f39132);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31657(float f, View view) {
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (f == c15180.f46373) {
            return;
        }
        c15180.f46373 = f;
        ArrayList arrayList = this.f39126;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC8126) this.f39126.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31646(float f, View view) {
        float f2 = ((C15180) view.getLayoutParams()).f46373;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m31653(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m31657(f, view);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31654(View view) {
        int i = ((C15180) view.getLayoutParams()).f46371;
        int i2 = C17648.f53953;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31653(int i, View view) {
        return (m31654(view) & i) == i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m31656(int i) {
        int i2 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m31654(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m31642(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39113 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39113 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13064.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f39105) {
            return;
        }
        int i2 = C17648.f53953;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f39120 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C15180 c15180 = (C15180) childAt.getLayoutParams();
                if (m31639(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c15180).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c15180).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c15180).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m31653(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c15180.f46373 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r10) / f3;
                        i5 = i6 - ((int) (c15180.f46373 * f3));
                    }
                    boolean z2 = f != c15180.f46373;
                    int i9 = c15180.f46371 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) c15180).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) c15180).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin);
                    }
                    if (z2) {
                        m31657(f, childAt);
                    }
                    int i17 = c15180.f46373 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
        }
        if (f39106 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C11007 m48829 = C21610.m48814(null, rootWindowInsets).m48829();
            C15886 c15886 = this.f39119;
            c15886.m37642(Math.max(c15886.m37646(), m48829.f33109));
            C15886 c158862 = this.f39116;
            c158862.m37642(Math.max(c158862.m37646(), m48829.f33110));
        }
        this.f39120 = false;
        this.f39113 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f39120) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C15180) getChildAt(i).getLayoutParams()).f46373);
        }
        this.f39109 = f;
        boolean m37650 = this.f39119.m37650();
        boolean m376502 = this.f39116.m37650();
        if (m37650 || m376502) {
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f39122 || (drawable = this.f39129) == null) {
            return;
        }
        Object obj = this.f39115;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean m31639 = m31639(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m31639) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m31643(childAt) && childAt.getHeight() >= height) {
                    if (m31653(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f39109;
        if (f > 0.0f && m31639) {
            int i4 = this.f39125;
            Paint paint = this.f39111;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m31639(View view) {
        return ((C15180) view.getLayoutParams()).f46371 == 0;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m31643(View view) {
        int i = ((C15180) view.getLayoutParams()).f46371;
        int i2 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L14;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            l.ܺۧ֫ r1 = r7.f39119
            boolean r2 = r1.m37645(r8)
            l.ܺۧ֫ r3 = r7.f39116
            boolean r3 = r3.m37645(r8)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2f
            r8 = 2
            if (r0 == r8) goto L1e
            r8 = 3
            if (r0 == r8) goto L2f
            goto L34
        L1e:
            boolean r8 = r1.m37648()
            if (r8 == 0) goto L34
            l.ۗۧ֫ r8 = r7.f39108
            r8.m9804()
            l.ۗۧ֫ r8 = r7.f39117
            r8.m9804()
            goto L34
        L2f:
            r7.m31652(r3)
            r7.f39110 = r4
        L34:
            r8 = 0
            goto L5c
        L36:
            float r0 = r8.getX()
            float r8 = r8.getY()
            r7.f39134 = r0
            r7.f39123 = r8
            float r5 = r7.f39109
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L59
            int r0 = (int) r0
            int r8 = (int) r8
            android.view.View r8 = r1.m37633(r0, r8)
            if (r8 == 0) goto L59
            boolean r8 = m31639(r8)
            if (r8 == 0) goto L59
            r8 = 1
            goto L5a
        L59:
            r8 = 0
        L5a:
            r7.f39110 = r4
        L5c:
            if (r2 != 0) goto L7f
            if (r8 != 0) goto L7f
            int r8 = r7.getChildCount()
            r0 = 0
        L65:
            if (r0 >= r8) goto L79
            android.view.View r1 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            l.ܶۧ֫ r1 = (l.C15180) r1
            boolean r1 = r1.f46372
            if (r1 == 0) goto L76
            goto L7f
        L76:
            int r0 = r0 + 1
            goto L65
        L79:
            boolean r8 = r7.f39110
            if (r8 == 0) goto L7e
            goto L7f
        L7e:
            return r4
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13064.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f39109 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f39130 == null) {
                this.f39130 = new Rect();
            }
            childAt.getHitRect(this.f39130);
            if (this.f39130.contains((int) x, (int) y) && !m31639(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f39112 == null) {
                            this.f39112 = new Matrix();
                        }
                        matrix.invert(this.f39112);
                        obtain.transform(this.f39112);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (m31644(r1) != 2) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            l.ܺۧ֫ r0 = r6.f39119
            r0.m37638(r7)
            l.ܺۧ֫ r1 = r6.f39116
            r1.m37638(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L75
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.m31652(r3)
            r6.f39110 = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m37633(r4, r5)
            if (r4 == 0) goto L70
            boolean r4 = m31639(r4)
            if (r4 == 0) goto L70
            float r4 = r6.f39134
            float r1 = r1 - r4
            float r4 = r6.f39123
            float r7 = r7 - r4
            int r0 = r0.m37640()
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L70
            int r7 = r6.getChildCount()
            r0 = 0
        L51:
            if (r0 >= r7) goto L66
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            l.ܶۧ֫ r4 = (l.C15180) r4
            int r4 = r4.f46374
            r4 = r4 & r3
            if (r4 != r3) goto L63
            goto L67
        L63:
            int r0 = r0 + 1
            goto L51
        L66:
            r1 = 0
        L67:
            if (r1 == 0) goto L70
            int r7 = r6.m31644(r1)
            r0 = 2
            if (r7 != r0) goto L71
        L70:
            r2 = 1
        L71:
            r6.m31652(r2)
            return r3
        L75:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f39134 = r0
            r6.f39123 = r7
            r6.f39110 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13064.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m31652(true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31652(boolean z) {
        boolean m37639;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C15180 c15180 = (C15180) childAt.getLayoutParams();
            if (m31643(childAt) && (!z || c15180.f46372)) {
                int width = childAt.getWidth();
                if (m31653(3, childAt)) {
                    int top = childAt.getTop();
                    m37639 = this.f39119.m37639(childAt, -width, top);
                } else {
                    m37639 = this.f39116.m37639(childAt, getWidth(), childAt.getTop());
                }
                z2 |= m37639;
                c15180.f46372 = false;
            }
        }
        this.f39108.m9804();
        this.f39117.m9804();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31663(View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (this.f39113) {
            c15180.f46373 = 1.0f;
            c15180.f46374 = 1;
            m31637(view, true);
            m31641(view);
        } else {
            c15180.f46374 |= 2;
            if (m31653(3, view)) {
                this.f39119.m37639(view, 0, view.getTop());
            } else {
                this.f39116.m37639(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31665(int i) {
        View m31656 = m31656(i);
        if (m31656 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m31642(i));
        }
        m31663(m31656);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31649(View view, boolean z) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (this.f39113) {
            c15180.f46373 = 0.0f;
            c15180.f46374 = 0;
        } else if (z) {
            c15180.f46374 |= 4;
            if (m31653(3, view)) {
                this.f39119.m37639(view, -view.getWidth(), view.getTop());
            } else {
                this.f39116.m37639(view, getWidth(), view.getTop());
            }
        } else {
            m31646(0.0f, view);
            m31662(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31647(int i) {
        View m31656 = m31656(i);
        if (m31656 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m31642(i));
        }
        m31649(m31656, true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m31638(View view) {
        if (m31643(view)) {
            return (((C15180) view.getLayoutParams()).f46374 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m31666(int i) {
        View m31656 = m31656(i);
        if (m31656 != null) {
            return m31638(m31656);
        }
        return false;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m31636(View view) {
        if (m31643(view)) {
            return ((C15180) view.getLayoutParams()).f46373 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31664() {
        View m31656 = m31656(8388611);
        if (m31656 != null) {
            return m31636(m31656);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C15180 c15180 = new C15180(-1, -1);
        c15180.f46371 = 0;
        return c15180;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C15180)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                C15180 c15180 = new C15180(layoutParams);
                c15180.f46371 = 0;
                return c15180;
            }
            C15180 c151802 = new C15180((ViewGroup.MarginLayoutParams) layoutParams);
            c151802.f46371 = 0;
            return c151802;
        }
        C15180 c151803 = (C15180) layoutParams;
        C15180 c151804 = new C15180(c151803);
        c151804.f46371 = 0;
        c151804.f46371 = c151803.f46371;
        return c151804;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C15180) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C15180(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f39131;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (m31643(childAt)) {
                if (m31638(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m31655() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m31655() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m31643(childAt) && m31636(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31645() {
        if (this.f39110) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f39110 = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m31655 = m31655();
            if (m31655 != null && m31644(m31655) == 0) {
                m31652(false);
            }
            return m31655 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View m31656;
        if (!(parcelable instanceof C22237)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22237 c22237 = (C22237) parcelable;
        super.onRestoreInstanceState(c22237.getSuperState());
        int i = c22237.f72165;
        if (i != 0 && (m31656 = m31656(i)) != null) {
            m31663(m31656);
        }
        int i2 = c22237.f72169;
        if (i2 != 3) {
            m31648(i2, 3);
        }
        int i3 = c22237.f72167;
        if (i3 != 3) {
            m31648(i3, 5);
        }
        int i4 = c22237.f72166;
        if (i4 != 3) {
            m31648(i4, 8388611);
        }
        int i5 = c22237.f72168;
        if (i5 != 3) {
            m31648(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C22237 c22237 = new C22237(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C15180 c15180 = (C15180) getChildAt(i).getLayoutParams();
            int i2 = c15180.f46374;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c22237.f72165 = c15180.f46371;
                break;
            }
        }
        c22237.f72169 = this.f39127;
        c22237.f72167 = this.f39124;
        c22237.f72166 = this.f39135;
        c22237.f72168 = this.f39128;
        return c22237;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View view2;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                view2 = null;
                break;
            }
            view2 = getChildAt(i2);
            if ((((C15180) view2.getLayoutParams()).f46374 & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (view2 != null || m31643(view)) {
            int i3 = C17648.f53953;
            view.setImportantForAccessibility(4);
        } else {
            int i4 = C17648.f53953;
            view.setImportantForAccessibility(1);
        }
        if (f39107) {
            return;
        }
        C17648.m41309(view, this.f39133);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m31640(View view) {
        int i = C17648.f53953;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }
}
