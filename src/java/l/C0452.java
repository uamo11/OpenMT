package l;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: Q69A */
/* renamed from: l.֡ܰۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C0452 extends ViewGroup {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C3981 f1968;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public ArrayList f1969;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f1970;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f1971;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f1972;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f1973;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f1974;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1975;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public Scroller f1976;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f1977;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1978;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f1979;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f1980;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f1981;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f1982;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f1983;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f1984;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1985;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f1986;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f1987;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f1988;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f1989;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Rect f1990;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1991;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C20915 f1992;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1993;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2570 f1994;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public Parcelable f1995;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f1996;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f1997;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f1998;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f1999;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f2000;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f2001;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f2002;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f2003;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f2004;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2005;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f2006;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC12014 f2007;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f2008;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f2009;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f2010;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final int[] f1967 = {R.attr.layout_gravity};

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final Comparator f1965 = new C18092();

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f1966 = new InterpolatorC17386();

    public C0452(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1984 = new ArrayList();
        this.f1992 = new C20915();
        this.f1990 = new Rect();
        this.f2006 = -1;
        this.f1995 = null;
        this.f1981 = -3.4028235E38f;
        this.f1971 = Float.MAX_VALUE;
        this.f1977 = 1;
        this.f2005 = -1;
        this.f1993 = true;
        this.f1988 = new RunnableC14563(this);
        this.f2003 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1976 = new Scroller(context2, f1966);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f1986 = viewConfiguration.getScaledPagingTouchSlop();
        this.f2001 = (int) (400.0f * f);
        this.f2000 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1974 = new EdgeEffect(context2);
        this.f2008 = new EdgeEffect(context2);
        this.f1970 = (int) (25.0f * f);
        this.f1991 = (int) (2.0f * f);
        this.f1978 = (int) (f * 16.0f);
        C17648.m41309(this, new C8920(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C17648.m41310(this, new C23736(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1988);
        Scroller scroller = this.f1976;
        if (scroller != null && !scroller.isFinished()) {
            this.f1976.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2037(int i) {
        if (this.f2003 == i) {
            return;
        }
        this.f2003 = i;
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2570 interfaceC2570 = (InterfaceC2570) this.f1969.get(i2);
                if (interfaceC2570 != null) {
                    interfaceC2570.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC2570 interfaceC25702 = this.f1994;
        if (interfaceC25702 != null) {
            interfaceC25702.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2029(AbstractC12014 abstractC12014) {
        ArrayList arrayList;
        AbstractC12014 abstractC120142 = this.f2007;
        if (abstractC120142 != null) {
            abstractC120142.m29380(null);
            this.f2007.mo13216(this);
            int i = 0;
            while (true) {
                arrayList = this.f1984;
                if (i >= arrayList.size()) {
                    break;
                }
                C20915 c20915 = (C20915) arrayList.get(i);
                this.f2007.mo11914(this, c20915.f67634, c20915.f67632);
                i++;
            }
            this.f2007.mo13214();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C9626) getChildAt(i2).getLayoutParams()).f29177) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1989 = 0;
            scrollTo(0, 0);
        }
        AbstractC12014 abstractC120143 = this.f2007;
        this.f2007 = abstractC12014;
        this.f2009 = 0;
        if (abstractC12014 != null) {
            if (this.f1968 == null) {
                this.f1968 = new C3981(this);
            }
            this.f2007.m29380(this.f1968);
            this.f1982 = false;
            boolean z = this.f1993;
            this.f1993 = true;
            this.f2009 = this.f2007.mo11916();
            if (this.f2006 >= 0) {
                this.f2007.getClass();
                m2027(this.f2006, 0, false, true);
                this.f2006 = -1;
                this.f1995 = null;
            } else if (!z) {
                m2041();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f2002;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f2002.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC15974) this.f2002.get(i3)).onAdapterChanged(this, abstractC120143, abstractC12014);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12014 m2032() {
        return this.f2007;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2030(InterfaceC15974 interfaceC15974) {
        if (this.f2002 == null) {
            this.f2002 = new ArrayList();
        }
        this.f2002.add(interfaceC15974);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2035(InterfaceC15974 interfaceC15974) {
        ArrayList arrayList = this.f2002;
        if (arrayList != null) {
            arrayList.remove(interfaceC15974);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m2021() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2043(int i) {
        this.f1982 = false;
        m2027(i, 0, !this.f1993, false);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2042(int i) {
        this.f1982 = false;
        m2027(i, 0, true, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m2038() {
        return this.f1989;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2027(int i, int i2, boolean z, boolean z2) {
        AbstractC12014 abstractC12014 = this.f2007;
        if (abstractC12014 == null || abstractC12014.mo11916() <= 0) {
            m2019(false);
            return;
        }
        ArrayList arrayList = this.f1984;
        if (!z2 && this.f1989 == i && arrayList.size() != 0) {
            m2019(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f2007.mo11916()) {
            i = this.f2007.mo11916() - 1;
        }
        int i3 = this.f1977;
        int i4 = this.f1989;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C20915) arrayList.get(i5)).f67636 = true;
            }
        }
        boolean z3 = this.f1989 != i;
        if (this.f1993) {
            this.f1989 = i;
            if (z3) {
                m2022(i);
            }
            requestLayout();
            return;
        }
        m2039(i);
        m2018(i, i2, z, z3);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m2018(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int abs;
        C20915 m2033 = m2033(i);
        int max = m2033 != null ? (int) (Math.max(this.f1981, Math.min(m2033.f67633, this.f1971)) * m2021()) : 0;
        if (!z) {
            if (z2) {
                m2022(i);
            }
            m2013(false);
            scrollTo(max, 0);
            m2017(max);
            return;
        }
        if (getChildCount() == 0) {
            m2019(false);
        } else {
            Scroller scroller = this.f1976;
            if (scroller != null && !scroller.isFinished()) {
                scrollX = this.f1980 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                m2019(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m2013(false);
                m2041();
                m2037(0);
            } else {
                m2019(true);
                m2037(2);
                int m2021 = m2021();
                int i6 = m2021 / 2;
                float f = m2021;
                float f2 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f2007.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f1980 = false;
                this.f1976.startScroll(i3, scrollY, i4, i5, min);
                int i7 = C17648.f53953;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m2022(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2028(InterfaceC2570 interfaceC2570) {
        if (this.f1969 == null) {
            this.f1969 = new ArrayList();
        }
        this.f1969.add(interfaceC2570);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2034(InterfaceC2570 interfaceC2570) {
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            arrayList.remove(interfaceC2570);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2040(InterfaceC2570 interfaceC2570) {
        this.f1994 = interfaceC2570;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2036() {
        if (3 != this.f1977) {
            this.f1977 = 3;
            m2041();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20915 m2023(int i, int i2) {
        C20915 c20915 = new C20915();
        c20915.f67634 = i;
        c20915.f67632 = this.f2007.mo11913(this, i);
        this.f2007.getClass();
        c20915.f67635 = 1.0f;
        ArrayList arrayList = this.f1984;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c20915);
            return c20915;
        }
        arrayList.add(i2, c20915);
        return c20915;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2025() {
        int mo11916 = this.f2007.mo11916();
        this.f2009 = mo11916;
        ArrayList arrayList = this.f1984;
        boolean z = arrayList.size() < (this.f1977 * 2) + 1 && arrayList.size() < mo11916;
        int i = this.f1989;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C20915 c20915 = (C20915) arrayList.get(i2);
            AbstractC12014 abstractC12014 = this.f2007;
            Object obj = c20915.f67632;
            abstractC12014.getClass();
        }
        Collections.sort(arrayList, f1965);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C9626 c9626 = (C9626) getChildAt(i3).getLayoutParams();
                if (!c9626.f29177) {
                    c9626.f29179 = 0.0f;
                }
            }
            m2027(i, 0, false, true);
            requestLayout();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2041() {
        m2039(this.f1989);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r9 == r10) goto L26;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2039(int r18) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.m2039(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C19504 c19504 = new C19504(super.onSaveInstanceState());
        c19504.f63035 = this.f1989;
        if (this.f2007 != null) {
            c19504.f63036 = null;
        }
        return c19504;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19504)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19504 c19504 = (C19504) parcelable;
        super.onRestoreInstanceState(c19504.getSuperState());
        if (this.f2007 != null) {
            m2027(c19504.f63035, 0, false, true);
        } else {
            this.f2006 = c19504.f63035;
            this.f1995 = c19504.f63036;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C9626();
        }
        C9626 c9626 = (C9626) layoutParams;
        boolean z = c9626.f29177 | (view.getClass().getAnnotation(InterfaceC6803.class) != null);
        c9626.f29177 = z;
        if (!this.f1997) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c9626.f29178 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f1997) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20915 m2024(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i >= arrayList.size()) {
                return null;
            }
            C20915 c20915 = (C20915) arrayList.get(i);
            if (this.f2007.mo11915(view, c20915.f67632)) {
                return c20915;
            }
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20915 m2033(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C20915 c20915 = (C20915) arrayList.get(i2);
            if (c20915.f67634 == i) {
                return c20915;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1993 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.f1984.isEmpty()) {
                if (!this.f1976.isFinished()) {
                    this.f1976.setFinalX(this.f1989 * m2021());
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                    return;
                }
            }
            C20915 m2033 = m2033(this.f1989);
            int min = (int) ((m2033 != null ? Math.min(m2033.f67633, this.f1971) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                m2013(false);
                scrollTo(min, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f1980 = true;
        Scroller scroller = this.f1976;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m2017(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            int i = C17648.f53953;
            postInvalidateOnAnimation();
            return;
        }
        m2013(true);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m2017(int i) {
        if (this.f1984.size() == 0) {
            if (!this.f1993) {
                this.f1975 = false;
                m2026(0, 0.0f, 0);
                if (!this.f1975) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C20915 m2016 = m2016();
        float m2021 = m2021();
        int i2 = m2016.f67634;
        float f = ((i / m2021) - m2016.f67633) / (m2016.f67635 + (0 / m2021));
        this.f1975 = false;
        m2026(i2, f, (int) (m2021 * f));
        if (this.f1975) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2026(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f1985
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            l.ۢܰۧ r9 = (l.C9626) r9
            boolean r10 = r9.f29177
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f29176
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.util.ArrayList r0 = r12.f1969
            if (r0 == 0) goto L85
            int r0 = r0.size()
        L73:
            if (r1 >= r0) goto L85
            java.util.ArrayList r3 = r12.f1969
            java.lang.Object r3 = r3.get(r1)
            l.ۖܰۧ r3 = (l.InterfaceC2570) r3
            if (r3 == 0) goto L82
            r3.onPageScrolled(r13, r14, r15)
        L82:
            int r1 = r1 + 1
            goto L73
        L85:
            l.ۖܰۧ r0 = r12.f1994
            if (r0 == 0) goto L8c
            r0.onPageScrolled(r13, r14, r15)
        L8c:
            r12.f1975 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.m2026(int, float, int):void");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m2022(int i) {
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2570 interfaceC2570 = (InterfaceC2570) this.f1969.get(i2);
                if (interfaceC2570 != null) {
                    interfaceC2570.onPageSelected(i);
                }
            }
        }
        InterfaceC2570 interfaceC25702 = this.f1994;
        if (interfaceC25702 != null) {
            interfaceC25702.onPageSelected(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2013(boolean z) {
        boolean z2 = this.f2003 == 2;
        if (z2) {
            m2019(false);
            Scroller scroller = this.f1976;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m2017(currX);
                    }
                }
            }
        }
        this.f1982 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i >= arrayList.size()) {
                break;
            }
            C20915 c20915 = (C20915) arrayList.get(i);
            if (c20915.f67636) {
                c20915.f67636 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.f1988;
            if (z) {
                int i2 = C17648.f53953;
                postOnAnimation(runnable);
            } else {
                ((RunnableC14563) runnable).run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m2020();
            return false;
        }
        if (action != 0) {
            if (this.f2010) {
                return true;
            }
            if (this.f2004) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1999 = x;
            this.f1983 = x;
            float y = motionEvent.getY();
            this.f1998 = y;
            this.f1996 = y;
            this.f2005 = motionEvent.getPointerId(0);
            this.f2004 = false;
            this.f1980 = true;
            Scroller scroller = this.f1976;
            scroller.computeScrollOffset();
            if (this.f2003 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f1991) {
                scroller.abortAnimation();
                this.f1982 = false;
                m2041();
                this.f2010 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m2037(1);
            } else {
                m2013(false);
                this.f2010 = false;
            }
        } else if (action == 2) {
            int i = this.f2005;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f1983;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f1998);
                if (f != 0.0f) {
                    float f2 = this.f1983;
                    if ((f2 >= this.f1987 || f <= 0.0f) && ((f2 <= getWidth() - this.f1987 || f >= 0.0f) && m2015((int) f, (int) x2, (int) y2, this, false))) {
                        this.f1983 = x2;
                        this.f1996 = y2;
                        this.f2004 = true;
                        return false;
                    }
                }
                int i2 = this.f1986;
                float f3 = i2;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.f2010 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m2037(1);
                    float f4 = this.f1999;
                    float f5 = i2;
                    this.f1983 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f1996 = y2;
                    m2019(true);
                } else if (abs2 > f3) {
                    this.f2004 = true;
                }
                if (this.f2010 && m2014(x2)) {
                    int i3 = C17648.f53953;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m2012(motionEvent);
        }
        if (this.f1979 == null) {
            this.f1979 = VelocityTracker.obtain();
        }
        this.f1979.addMovement(motionEvent);
        return this.f2010;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC12014 abstractC12014;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC12014 = this.f2007) == null || abstractC12014.mo11916() == 0) {
            return false;
        }
        if (this.f1979 == null) {
            this.f1979 = VelocityTracker.obtain();
        }
        this.f1979.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f1976.abortAnimation();
            this.f1982 = false;
            m2041();
            float x = motionEvent.getX();
            this.f1999 = x;
            this.f1983 = x;
            float y = motionEvent.getY();
            this.f1998 = y;
            this.f1996 = y;
            this.f2005 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f2010) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2005);
                    if (findPointerIndex == -1) {
                        z = m2020();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f1983);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f1996);
                        int i = this.f1986;
                        if (abs > i && abs > abs2) {
                            this.f2010 = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.f1999;
                            this.f1983 = x2 - f > 0.0f ? f + i : f - i;
                            this.f1996 = y2;
                            m2037(1);
                            m2019(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f2010) {
                    z = m2014(motionEvent.getX(motionEvent.findPointerIndex(this.f2005)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f1983 = motionEvent.getX(actionIndex);
                    this.f2005 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m2012(motionEvent);
                    this.f1983 = motionEvent.getX(motionEvent.findPointerIndex(this.f2005));
                }
            } else if (this.f2010) {
                m2018(this.f1989, 0, true, false);
                z = m2020();
            }
        } else if (this.f2010) {
            VelocityTracker velocityTracker = this.f1979;
            velocityTracker.computeCurrentVelocity(1000, this.f2000);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f2005);
            this.f1982 = true;
            int m2021 = m2021();
            int scrollX = getScrollX();
            C20915 m2016 = m2016();
            float f2 = m2021;
            int i2 = m2016.f67634;
            float f3 = ((scrollX / f2) - m2016.f67633) / (m2016.f67635 + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f2005)) - this.f1999)) <= this.f1970 || Math.abs(xVelocity) <= this.f2001) {
                i2 += (int) (f3 + (i2 >= this.f1989 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.f1984;
            if (arrayList.size() > 0) {
                i2 = Math.max(((C20915) arrayList.get(0)).f67634, Math.min(i2, ((C20915) C18566.m43105(arrayList, 1)).f67634));
            }
            m2027(i2, xVelocity, true, true);
            z = m2020();
        }
        if (z) {
            int i3 = C17648.f53953;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m2020() {
        this.f2005 = -1;
        this.f2010 = false;
        this.f2004 = false;
        VelocityTracker velocityTracker = this.f1979;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1979 = null;
        }
        this.f1974.onRelease();
        this.f2008.onRelease();
        return this.f1974.isFinished() || this.f2008.isFinished();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2014(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1983 - f;
        this.f1983 = f;
        float scrollX = getScrollX() + f2;
        float m2021 = m2021();
        float f3 = this.f1981 * m2021;
        float f4 = this.f1971 * m2021;
        ArrayList arrayList = this.f1984;
        boolean z3 = false;
        C20915 c20915 = (C20915) arrayList.get(0);
        C20915 c209152 = (C20915) C18566.m43105(arrayList, 1);
        if (c20915.f67634 != 0) {
            f3 = c20915.f67633 * m2021;
            z = false;
        } else {
            z = true;
        }
        if (c209152.f67634 != this.f2007.mo11916() - 1) {
            f4 = c209152.f67633 * m2021;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1974.onPull(Math.abs(f3 - scrollX) / m2021);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f2008.onPull(Math.abs(scrollX - f4) / m2021);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1983 = (scrollX - i) + this.f1983;
        scrollTo(i, getScrollY());
        m2017(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r4;
     */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C20915 m2016() {
        /*
            r12 = this;
            int r0 = r12.m2021()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r12.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = 0
        L10:
            r3 = 0
            if (r0 <= 0) goto L17
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L18
        L17:
            r3 = 0
        L18:
            r0 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
        L1d:
            java.util.ArrayList r8 = r12.f1984
            int r9 = r8.size()
            if (r6 >= r9) goto L6d
            java.lang.Object r9 = r8.get(r6)
            l.᩷ܰۧ r9 = (l.C20915) r9
            if (r7 != 0) goto L47
            int r10 = r9.f67634
            int r0 = r0 + 1
            if (r10 == r0) goto L47
            float r1 = r1 + r5
            float r1 = r1 + r3
            l.᩷ܰۧ r5 = r12.f1992
            r5.f67633 = r1
            r5.f67634 = r0
            l.ۨ᩺ۧ r0 = r12.f2007
            r0.getClass()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.f67635 = r0
            int r6 = r6 + (-1)
            goto L48
        L47:
            r5 = r9
        L48:
            float r1 = r5.f67633
            float r0 = r5.f67635
            float r0 = r0 + r1
            float r0 = r0 + r3
            if (r7 != 0) goto L54
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 < 0) goto L6d
        L54:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6c
            int r0 = r8.size()
            int r0 = r0 + (-1)
            if (r6 != r0) goto L61
            goto L6c
        L61:
            int r0 = r5.f67634
            float r4 = r5.f67635
            int r6 = r6 + 1
            r7 = 0
            r11 = r5
            r5 = r4
            r4 = r11
            goto L1d
        L6c:
            return r5
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.m2016():l.᩷ܰۧ");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC12014 abstractC12014;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f2008;
        EdgeEffect edgeEffect2 = this.f1974;
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC12014 = this.f2007) != null && abstractC12014.mo11916() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1981 * width);
                edgeEffect2.setSize(height, width);
                boolean draw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
                z = draw;
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1971 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z) {
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2012(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2005) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1983 = motionEvent.getX(i);
            this.f2005 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1979;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m2019(boolean z) {
        if (this.f1973 != z) {
            this.f1973 = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f2007 == null) {
            return false;
        }
        int m2021 = m2021();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) m2021) * this.f1981)) : i > 0 && scrollX < ((int) (((float) m2021) * this.f1971));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2015(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m2015(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L64
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5f
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5f
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m2031(r4)
            goto L60
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5f
            boolean r6 = r5.m2031(r1)
            goto L60
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m2044()
            goto L60
        L41:
            r6 = 66
            boolean r6 = r5.m2031(r6)
            goto L60
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L58
            int r6 = r5.f1989
            if (r6 <= 0) goto L5f
            int r6 = r6 - r1
            r5.m2042(r6)
            r6 = 1
            goto L60
        L58:
            r6 = 17
            boolean r6 = r5.m2031(r6)
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r0 > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        m2042(r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
    
        if (r0 <= 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2031(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L8
            goto L27
        L8:
            if (r0 == 0) goto L28
            android.view.ViewParent r2 = r0.getParent()
        Le:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1a
            if (r2 != r7) goto L15
            goto L28
        L15:
            android.view.ViewParent r2 = r2.getParent()
            goto Le
        L1a:
            android.view.ViewParent r0 = r0.getParent()
        L1e:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L27
            android.view.ViewParent r0 = r0.getParent()
            goto L1e
        L27:
            r0 = r1
        L28:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L75
            if (r1 == r0) goto L75
            android.graphics.Rect r6 = r7.f1990
            if (r8 != r5) goto L59
            android.graphics.Rect r3 = r7.m2011(r6, r1)
            int r3 = r3.left
            android.graphics.Rect r4 = r7.m2011(r6, r0)
            int r4 = r4.left
            if (r0 == 0) goto L53
            if (r3 < r4) goto L53
            int r0 = r7.f1989
            if (r0 <= 0) goto L8d
            goto L88
        L53:
            boolean r0 = r1.requestFocus()
        L57:
            r3 = r0
            goto L8f
        L59:
            if (r8 != r4) goto L8f
            android.graphics.Rect r2 = r7.m2011(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.m2011(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L70
            if (r2 > r3) goto L70
            boolean r0 = r7.m2044()
            goto L57
        L70:
            boolean r0 = r1.requestFocus()
            goto L57
        L75:
            if (r8 == r5) goto L84
            if (r8 != r2) goto L7a
            goto L84
        L7a:
            if (r8 == r4) goto L7f
            r0 = 2
            if (r8 != r0) goto L8f
        L7f:
            boolean r3 = r7.m2044()
            goto L8f
        L84:
            int r0 = r7.f1989
            if (r0 <= 0) goto L8d
        L88:
            int r0 = r0 - r2
            r7.m2042(r0)
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r3 = r2
        L8f:
            if (r3 == 0) goto L98
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0452.m2031(int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Rect m2011(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m2044() {
        AbstractC12014 abstractC12014 = this.f2007;
        if (abstractC12014 == null || this.f1989 >= abstractC12014.mo11916() - 1) {
            return false;
        }
        m2042(this.f1989 + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C20915 m2024;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m2024 = m2024(childAt)) != null && m2024.f67634 == this.f1989) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C20915 m2024;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m2024 = m2024(childAt)) != null && m2024.f67634 == this.f1989) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C20915 m2024;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m2024 = m2024(childAt)) != null && m2024.f67634 == this.f1989 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C20915 m2024;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m2024 = m2024(childAt)) != null && m2024.f67634 == this.f1989 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C9626();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C9626();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C9626) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9626(getContext(), attributeSet);
    }
}
