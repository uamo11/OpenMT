package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: 8539 */
/* renamed from: l.ۢ۫ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9586 extends AbstractC17366 implements InterfaceC8194 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f29085;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10997 f29086;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f29087;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public BitSet f29088;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29089;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f29090;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f29091;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f29094;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10729 f29095;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20875[] f29096;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f29097;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29098;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f29099;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f29100;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f29101;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f29102;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6763 f29103;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Rect f29104;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14523 f29105;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f29084 = false;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f29093 = -1;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f29092 = Integer.MIN_VALUE;

    public C9586(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f29091 = -1;
        this.f29101 = false;
        C14523 c14523 = new C14523();
        this.f29105 = c14523;
        this.f29098 = 2;
        this.f29104 = new Rect();
        this.f29086 = new C10997(this);
        this.f29085 = true;
        this.f29094 = new RunnableC1824(this);
        C18072 m40694 = AbstractC17366.m40694(context, attributeSet, i, i2);
        int i3 = m40694.f56290;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f29090) {
            this.f29090 = i3;
            AbstractC2262 abstractC2262 = this.f29087;
            this.f29087 = this.f29102;
            this.f29102 = abstractC2262;
            requestLayout();
        }
        int i4 = m40694.f56292;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f29091) {
            c14523.m34671();
            requestLayout();
            this.f29091 = i4;
            this.f29088 = new BitSet(this.f29091);
            this.f29096 = new C20875[this.f29091];
            for (int i5 = 0; i5 < this.f29091; i5++) {
                this.f29096[i5] = new C20875(this, i5);
            }
            requestLayout();
        }
        boolean z = m40694.f56291;
        assertNotInLayoutOrScroll(null);
        C6763 c6763 = this.f29103;
        if (c6763 != null && c6763.f21002 != z) {
            c6763.f21002 = z;
        }
        this.f29101 = z;
        requestLayout();
        C10729 c10729 = new C10729();
        c10729.f32325 = true;
        c10729.f32318 = 0;
        c10729.f32321 = 0;
        this.f29095 = c10729;
        this.f29087 = AbstractC2262.m7471(this, this.f29090);
        this.f29102 = AbstractC2262.m7471(this, 1 - this.f29090);
    }

    @Override // l.AbstractC17366
    public final boolean isAutoMeasureEnabled() {
        return this.f29098 != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24525() {
        int m24526;
        if (getChildCount() != 0 && this.f29098 != 0 && isAttachedToWindow()) {
            if (this.f29084) {
                m24526 = m24528();
                m24526();
            } else {
                m24526 = m24526();
                m24528();
            }
            if (m24526 == 0 && m24529() != null) {
                this.f29105.m34671();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC17366
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m24525();
        }
    }

    @Override // l.AbstractC17366
    public final void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        super.onDetachedFromWindow(c13132, c2550);
        removeCallbacks(this.f29094);
        for (int i = 0; i < this.f29091; i++) {
            this.f29096[i].m47704();
        }
        c13132.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m24529() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.m24529():android.view.View");
    }

    @Override // l.AbstractC17366
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f29103 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24520() {
        if (this.f29090 == 1 || !isLayoutRTL()) {
            this.f29084 = this.f29101;
        } else {
            this.f29084 = !this.f29101;
        }
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // l.AbstractC17366
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int m40691;
        int m406912;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f29090 == 1) {
            m406912 = AbstractC17366.m40691(i2, rect.height() + paddingBottom, getMinimumHeight());
            m40691 = AbstractC17366.m40691(i, (this.f29089 * this.f29091) + paddingRight, getMinimumWidth());
        } else {
            m40691 = AbstractC17366.m40691(i, rect.width() + paddingRight, getMinimumWidth());
            m406912 = AbstractC17366.m40691(i2, (this.f29089 * this.f29091) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(m40691, m406912);
    }

    @Override // l.AbstractC17366
    public final void onLayoutChildren(C2550 c2550, C21600 c21600) {
        m24518(c2550, c21600, true);
    }

    @Override // l.AbstractC17366
    public final void onAdapterChanged(AbstractC19902 abstractC19902, AbstractC19902 abstractC199022) {
        this.f29105.m34671();
        for (int i = 0; i < this.f29091; i++) {
            this.f29096[i].m47704();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a9, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a5, code lost:
    
        if ((r11 < m24526()) != r16.f29084) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0413, code lost:
    
        if (m24525() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0197, code lost:
    
        if (r16.f29084 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        r11 = false;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m24518(l.C2550 r17, l.C21600 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.m24518(l.ۖ۬ۧ, l.᩸۬ۧ, boolean):void");
    }

    @Override // l.AbstractC17366
    public final void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.f29093 = -1;
        this.f29092 = Integer.MIN_VALUE;
        this.f29103 = null;
        this.f29086.m27306();
    }

    @Override // l.AbstractC17366
    public final boolean supportsPredictiveItemAnimations() {
        return this.f29103 == null;
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollOffset(C21600 c21600) {
        return m24507(c21600);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24507(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16983(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085, this.f29084);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollOffset(C21600 c21600) {
        return m24507(c21600);
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16982(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16982(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeHorizontalScrollRange(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16984(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    @Override // l.AbstractC17366
    public final int computeVerticalScrollRange(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f29085;
        return C6077.m16984(c21600, this.f29087, m24527(z), m24523(z), this, this.f29085);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24508(View view, int i, int i2) {
        Rect rect = this.f29104;
        calculateItemDecorationsForChild(view, rect);
        C16640 c16640 = (C16640) view.getLayoutParams();
        int m24521 = m24521(i, ((ViewGroup.MarginLayoutParams) c16640).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c16640).rightMargin + rect.right);
        int m245212 = m24521(i2, ((ViewGroup.MarginLayoutParams) c16640).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c16640).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, m24521, m245212, c16640)) {
            view.measure(m24521, m245212);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m24521(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // l.AbstractC17366
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C6763) {
            C6763 c6763 = (C6763) parcelable;
            this.f29103 = c6763;
            if (this.f29093 != -1) {
                c6763.f21011 = -1;
                c6763.f21006 = -1;
                c6763.f21005 = null;
                c6763.f21004 = 0;
                c6763.f21007 = 0;
                c6763.f21008 = null;
                c6763.f21009 = null;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC17366
    public final Parcelable onSaveInstanceState() {
        int m47702;
        int mo7478;
        int[] iArr;
        C6763 c6763 = this.f29103;
        if (c6763 == null) {
            C6763 c67632 = new C6763();
            c67632.f21002 = this.f29101;
            c67632.f21010 = this.f29100;
            c67632.f21003 = this.f29099;
            C14523 c14523 = this.f29105;
            if (c14523 != null && (iArr = c14523.f44508) != null) {
                c67632.f21008 = iArr;
                c67632.f21007 = iArr.length;
                c67632.f21009 = c14523.f44509;
            } else {
                c67632.f21007 = 0;
            }
            if (getChildCount() > 0) {
                c67632.f21011 = this.f29100 ? m24528() : m24526();
                View m24523 = this.f29084 ? m24523(true) : m24527(true);
                c67632.f21006 = m24523 != null ? getPosition(m24523) : -1;
                int i = this.f29091;
                c67632.f21004 = i;
                c67632.f21005 = new int[i];
                for (int i2 = 0; i2 < this.f29091; i2++) {
                    if (this.f29100) {
                        m47702 = this.f29096[i2].m47699(Integer.MIN_VALUE);
                        if (m47702 != Integer.MIN_VALUE) {
                            mo7478 = this.f29087.mo7476();
                            m47702 -= mo7478;
                            c67632.f21005[i2] = m47702;
                        } else {
                            c67632.f21005[i2] = m47702;
                        }
                    } else {
                        m47702 = this.f29096[i2].m47702(Integer.MIN_VALUE);
                        if (m47702 != Integer.MIN_VALUE) {
                            mo7478 = this.f29087.mo7478();
                            m47702 -= mo7478;
                            c67632.f21005[i2] = m47702;
                        } else {
                            c67632.f21005[i2] = m47702;
                        }
                    }
                }
                return c67632;
            }
            c67632.f21011 = -1;
            c67632.f21006 = -1;
            c67632.f21004 = 0;
            return c67632;
        }
        C6763 c67633 = new C6763();
        c67633.f21004 = c6763.f21004;
        c67633.f21011 = c6763.f21011;
        c67633.f21006 = c6763.f21006;
        c67633.f21005 = c6763.f21005;
        c67633.f21007 = c6763.f21007;
        c67633.f21008 = c6763.f21008;
        c67633.f21002 = c6763.f21002;
        c67633.f21010 = c6763.f21010;
        c67633.f21003 = c6763.f21003;
        c67633.f21009 = c6763.f21009;
        return c67633;
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View m24527 = m24527(false);
            View m24523 = m24523(false);
            if (m24527 == null || m24523 == null) {
                return;
            }
            int position = getPosition(m24527);
            int position2 = getPosition(m24523);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m24527(boolean z) {
        int mo7478 = this.f29087.mo7478();
        int mo7476 = this.f29087.mo7476();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int mo7485 = this.f29087.mo7485(childAt);
            if (this.f29087.mo7473(childAt) > mo7478 && mo7485 < mo7476) {
                if (mo7485 >= mo7478 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m24523(boolean z) {
        int mo7478 = this.f29087.mo7478();
        int mo7476 = this.f29087.mo7476();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int mo7485 = this.f29087.mo7485(childAt);
            int mo7473 = this.f29087.mo7473(childAt);
            if (mo7473 > mo7478 && mo7485 < mo7476) {
                if (mo7473 <= mo7476 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24511(C2550 c2550, C21600 c21600, boolean z) {
        int mo7476;
        int m24505 = m24505(Integer.MIN_VALUE);
        if (m24505 != Integer.MIN_VALUE && (mo7476 = this.f29087.mo7476() - m24505) > 0) {
            int i = mo7476 - (-scrollBy(-mo7476, c2550, c21600));
            if (!z || i <= 0) {
                return;
            }
            this.f29087.mo7474(i);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24516(C2550 c2550, C21600 c21600, boolean z) {
        int mo7478;
        int m24513 = m24513(Integer.MAX_VALUE);
        if (m24513 != Integer.MAX_VALUE && (mo7478 = m24513 - this.f29087.mo7478()) > 0) {
            int scrollBy = mo7478 - scrollBy(mo7478, c2550, c21600);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.f29087.mo7474(-scrollBy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m24514(int r5, l.C21600 r6) {
        /*
            r4 = this;
            l.ۧۗۧ r0 = r4.f29095
            r1 = 0
            r0.f32317 = r1
            r0.f32319 = r5
            boolean r2 = r4.isSmoothScrolling()
            r3 = 1
            if (r2 == 0) goto L2b
            int r6 = r6.f69350
            r2 = -1
            if (r6 == r2) goto L2b
            boolean r2 = r4.f29084
            if (r6 >= r5) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r2 != r5) goto L23
            l.ۖۗۧ r5 = r4.f29087
            int r5 = r5.mo7487()
            goto L2c
        L23:
            l.ۖۗۧ r5 = r4.f29087
            int r5 = r5.mo7487()
            r6 = 0
            goto L2f
        L2b:
            r5 = 0
        L2c:
            r6 = 0
            r6 = r5
            r5 = 0
        L2f:
            boolean r2 = r4.getClipToPadding()
            if (r2 == 0) goto L48
            l.ۖۗۧ r2 = r4.f29087
            int r2 = r2.mo7478()
            int r2 = r2 - r5
            r0.f32318 = r2
            l.ۖۗۧ r5 = r4.f29087
            int r5 = r5.mo7476()
            int r5 = r5 + r6
            r0.f32321 = r5
            goto L54
        L48:
            l.ۖۗۧ r2 = r4.f29087
            int r2 = r2.mo7472()
            int r2 = r2 + r6
            r0.f32321 = r2
            int r5 = -r5
            r0.f32318 = r5
        L54:
            r0.f32324 = r1
            r0.f32325 = r3
            l.ۖۗۧ r5 = r4.f29087
            int r5 = r5.mo7484()
            if (r5 != 0) goto L69
            l.ۖۗۧ r5 = r4.f29087
            int r5 = r5.mo7472()
            if (r5 != 0) goto L69
            r1 = 1
        L69:
            r0.f32323 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.m24514(int, l.᩸۬ۧ):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24522(int i) {
        C10729 c10729 = this.f29095;
        c10729.f32320 = i;
        c10729.f32322 = this.f29084 != (i == -1) ? -1 : 1;
    }

    @Override // l.AbstractC17366
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f29091; i2++) {
            C20875 c20875 = this.f29096[i2];
            int i3 = c20875.f67552;
            if (i3 != Integer.MIN_VALUE) {
                c20875.f67552 = i3 + i;
            }
            int i4 = c20875.f67551;
            if (i4 != Integer.MIN_VALUE) {
                c20875.f67551 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC17366
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f29091; i2++) {
            C20875 c20875 = this.f29096[i2];
            int i3 = c20875.f67552;
            if (i3 != Integer.MIN_VALUE) {
                c20875.f67552 = i3 + i;
            }
            int i4 = c20875.f67551;
            if (i4 != Integer.MIN_VALUE) {
                c20875.f67551 = i4 + i;
            }
        }
    }

    @Override // l.AbstractC17366
    public final void onItemsRemoved(C13132 c13132, int i, int i2) {
        m24517(i, i2, 2);
    }

    @Override // l.AbstractC17366
    public final void onItemsAdded(C13132 c13132, int i, int i2) {
        m24517(i, i2, 1);
    }

    @Override // l.AbstractC17366
    public final void onItemsChanged(C13132 c13132) {
        this.f29105.m34671();
        requestLayout();
    }

    @Override // l.AbstractC17366
    public final void onItemsMoved(C13132 c13132, int i, int i2, int i3) {
        m24517(i, i2, 8);
    }

    @Override // l.AbstractC17366
    public final void onItemsUpdated(C13132 c13132, int i, int i2, Object obj) {
        m24517(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m24517(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f29084
            if (r0 == 0) goto L9
            int r0 = r9.m24528()
            goto Ld
        L9:
            int r0 = r9.m24526()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1a
            if (r10 >= r11) goto L16
            int r2 = r11 + 1
            goto L1c
        L16:
            int r2 = r10 + 1
            r3 = r11
            goto L1d
        L1a:
            int r2 = r10 + r11
        L1c:
            r3 = r10
        L1d:
            l.ܳ۫ۧ r4 = r9.f29105
            int[] r5 = r4.f44508
            if (r5 != 0) goto L25
            goto L97
        L25:
            int r5 = r5.length
            if (r3 < r5) goto L2a
            goto L97
        L2a:
            java.util.ArrayList r5 = r4.f44509
            r6 = -1
            if (r5 != 0) goto L30
            goto L7c
        L30:
            if (r5 != 0) goto L33
            goto L48
        L33:
            int r5 = r5.size()
        L37:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L48
            java.util.ArrayList r7 = r4.f44509
            java.lang.Object r7 = r7.get(r5)
            l.ܿ۫ۧ r7 = (l.C17346) r7
            int r8 = r7.f53136
            if (r8 != r3) goto L37
            goto L49
        L48:
            r7 = 0
        L49:
            if (r7 == 0) goto L50
            java.util.ArrayList r5 = r4.f44509
            r5.remove(r7)
        L50:
            java.util.ArrayList r5 = r4.f44509
            int r5 = r5.size()
            r7 = 0
        L57:
            if (r7 >= r5) goto L69
            java.util.ArrayList r8 = r4.f44509
            java.lang.Object r8 = r8.get(r7)
            l.ܿ۫ۧ r8 = (l.C17346) r8
            int r8 = r8.f53136
            if (r8 < r3) goto L66
            goto L6a
        L66:
            int r7 = r7 + 1
            goto L57
        L69:
            r7 = -1
        L6a:
            if (r7 == r6) goto L7c
            java.util.ArrayList r5 = r4.f44509
            java.lang.Object r5 = r5.get(r7)
            l.ܿ۫ۧ r5 = (l.C17346) r5
            java.util.ArrayList r8 = r4.f44509
            r8.remove(r7)
            int r5 = r5.f53136
            goto L7d
        L7c:
            r5 = -1
        L7d:
            if (r5 != r6) goto L89
            int[] r5 = r4.f44508
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f44508
            int r5 = r5.length
            goto L97
        L89:
            int r5 = r5 + 1
            int[] r7 = r4.f44508
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f44508
            java.util.Arrays.fill(r7, r3, r5, r6)
        L97:
            r5 = 1
            if (r12 == r5) goto Lab
            r6 = 2
            if (r12 == r6) goto La7
            if (r12 == r1) goto La0
            goto Lae
        La0:
            r4.m34674(r10, r5)
            r4.m34673(r11, r5)
            goto Lae
        La7:
            r4.m34674(r10, r11)
            goto Lae
        Lab:
            r4.m34673(r10, r11)
        Lae:
            if (r2 > r0) goto Lb1
            goto Lc3
        Lb1:
            boolean r10 = r9.f29084
            if (r10 == 0) goto Lba
            int r10 = r9.m24526()
            goto Lbe
        Lba:
            int r10 = r9.m24528()
        Lbe:
            if (r3 > r10) goto Lc3
            r9.requestLayout()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.m24517(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0276, code lost:
    
        r14.m24510(r1, r3);
     */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m24506(l.C2550 r19, l.C10729 r20, l.C21600 r21) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.m24506(l.ۖ۬ۧ, l.ۧۗۧ, l.᩸۬ۧ):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24510(C2550 c2550, C10729 c10729) {
        int min;
        int min2;
        if (!c10729.f32325 || c10729.f32323) {
            return;
        }
        if (c10729.f32317 == 0) {
            if (c10729.f32320 == -1) {
                m24509(c2550, c10729.f32321);
                return;
            } else {
                m24515(c2550, c10729.f32318);
                return;
            }
        }
        int i = 1;
        if (c10729.f32320 == -1) {
            int i2 = c10729.f32318;
            int m47702 = this.f29096[0].m47702(i2);
            while (i < this.f29091) {
                int m477022 = this.f29096[i].m47702(i2);
                if (m477022 > m47702) {
                    m47702 = m477022;
                }
                i++;
            }
            int i3 = i2 - m47702;
            if (i3 < 0) {
                min2 = c10729.f32321;
            } else {
                min2 = c10729.f32321 - Math.min(i3, c10729.f32317);
            }
            m24509(c2550, min2);
            return;
        }
        int i4 = c10729.f32321;
        int m47699 = this.f29096[0].m47699(i4);
        while (i < this.f29091) {
            int m476992 = this.f29096[i].m47699(i4);
            if (m476992 < m47699) {
                m47699 = m476992;
            }
            i++;
        }
        int i5 = m47699 - c10729.f32321;
        if (i5 < 0) {
            min = c10729.f32318;
        } else {
            min = Math.min(i5, c10729.f32317) + c10729.f32318;
        }
        m24515(c2550, min);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24513(int i) {
        int m47702 = this.f29096[0].m47702(i);
        for (int i2 = 1; i2 < this.f29091; i2++) {
            int m477022 = this.f29096[i2].m47702(i);
            if (m477022 < m47702) {
                m47702 = m477022;
            }
        }
        return m47702;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24505(int i) {
        int m47699 = this.f29096[0].m47699(i);
        for (int i2 = 1; i2 < this.f29091; i2++) {
            int m476992 = this.f29096[i2].m47699(i);
            if (m476992 > m47699) {
                m47699 = m476992;
            }
        }
        return m47699;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24515(C2550 c2550, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f29087.mo7473(childAt) > i || this.f29087.mo7483(childAt) > i) {
                return;
            }
            C16640 c16640 = (C16640) childAt.getLayoutParams();
            c16640.getClass();
            if (c16640.f51098.f67555.size() == 1) {
                return;
            }
            C20875 c20875 = c16640.f51098;
            ArrayList arrayList = c20875.f67555;
            View view = (View) arrayList.remove(0);
            C16640 c166402 = (C16640) view.getLayoutParams();
            c166402.f51098 = null;
            if (arrayList.size() == 0) {
                c20875.f67551 = Integer.MIN_VALUE;
            }
            if (c166402.f44554.isRemoved() || c166402.f44554.isUpdated()) {
                c20875.f67554 -= c20875.f67553.f29087.mo7477(view);
            }
            c20875.f67552 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2550);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24509(C2550 c2550, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f29087.mo7485(childAt) < i || this.f29087.mo7479(childAt) < i) {
                return;
            }
            C16640 c16640 = (C16640) childAt.getLayoutParams();
            c16640.getClass();
            if (c16640.f51098.f67555.size() == 1) {
                return;
            }
            C20875 c20875 = c16640.f51098;
            ArrayList arrayList = c20875.f67555;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C16640 c166402 = (C16640) view.getLayoutParams();
            c166402.f51098 = null;
            if (c166402.f44554.isRemoved() || c166402.f44554.isUpdated()) {
                c20875.f67554 -= c20875.f67553.f29087.mo7477(view);
            }
            if (size == 1) {
                c20875.f67552 = Integer.MIN_VALUE;
            }
            c20875.f67551 = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c2550);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24519(int i) {
        if (this.f29090 == 0) {
            return (i == -1) != this.f29084;
        }
        return ((i == -1) == this.f29084) == isLayoutRTL();
    }

    @Override // l.AbstractC17366
    public final boolean canScrollVertically() {
        return this.f29090 == 1;
    }

    @Override // l.AbstractC17366
    public final boolean canScrollHorizontally() {
        return this.f29090 == 0;
    }

    @Override // l.AbstractC17366
    public final int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public final int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        return scrollBy(i, c2550, c21600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if ((r4 < m24526()) != r3.f29084) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r3.f29084 != false) goto L14;
     */
    @Override // l.InterfaceC8194
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            if (r0 != 0) goto Lc
            boolean r4 = r3.f29084
            if (r4 == 0) goto L1b
            goto L1a
        Lc:
            int r0 = r3.m24526()
            if (r4 >= r0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            boolean r0 = r3.f29084
            if (r4 == r0) goto L1a
            goto L1b
        L1a:
            r1 = 1
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f29090
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // l.AbstractC17366
    public final void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext());
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }

    @Override // l.AbstractC17366
    public final void scrollToPosition(int i) {
        C6763 c6763 = this.f29103;
        if (c6763 != null && c6763.f21011 != i) {
            c6763.f21005 = null;
            c6763.f21004 = 0;
            c6763.f21011 = -1;
            c6763.f21006 = -1;
        }
        this.f29093 = i;
        this.f29092 = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // l.AbstractC17366
    public final void collectAdjacentPrefetchPositions(int i, int i2, C21600 c21600, InterfaceC16660 interfaceC16660) {
        C10729 c10729;
        int m47699;
        int i3;
        if (this.f29090 != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m24524(i, c21600);
        int[] iArr = this.f29097;
        if (iArr == null || iArr.length < this.f29091) {
            this.f29097 = new int[this.f29091];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f29091;
            c10729 = this.f29095;
            if (i4 >= i6) {
                break;
            }
            if (c10729.f32322 == -1) {
                m47699 = c10729.f32318;
                i3 = this.f29096[i4].m47702(m47699);
            } else {
                m47699 = this.f29096[i4].m47699(c10729.f32321);
                i3 = c10729.f32321;
            }
            int i7 = m47699 - i3;
            if (i7 >= 0) {
                this.f29097[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f29097, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c10729.f32319;
            if (i9 < 0 || i9 >= c21600.m48777()) {
                return;
            }
            ((C19238) interfaceC16660).m44373(c10729.f32319, this.f29097[i8]);
            c10729.f32319 += c10729.f32322;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24524(int i, C21600 c21600) {
        int m24526;
        int i2;
        if (i > 0) {
            m24526 = m24528();
            i2 = 1;
        } else {
            m24526 = m24526();
            i2 = -1;
        }
        C10729 c10729 = this.f29095;
        c10729.f32325 = true;
        m24514(m24526, c21600);
        m24522(i2);
        c10729.f32319 = m24526 + c10729.f32322;
        c10729.f32317 = Math.abs(i);
    }

    public final int scrollBy(int i, C2550 c2550, C21600 c21600) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m24524(i, c21600);
        C10729 c10729 = this.f29095;
        int m24506 = m24506(c2550, c10729, c21600);
        if (c10729.f32317 >= m24506) {
            i = i < 0 ? -m24506 : m24506;
        }
        this.f29087.mo7474(-i);
        this.f29100 = this.f29084;
        c10729.f32317 = 0;
        m24510(c2550, c10729);
        return i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m24528() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24526() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // l.AbstractC17366
    public final C14543 generateDefaultLayoutParams() {
        return this.f29090 == 0 ? new C16640(-2, -1) : new C16640(-1, -2);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C16640(context, attributeSet);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16640((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16640(layoutParams);
    }

    @Override // l.AbstractC17366
    public final boolean checkLayoutParams(C14543 c14543) {
        return c14543 instanceof C16640;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0038, code lost:
    
        if (r8.f29090 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003d, code lost:
    
        if (r8.f29090 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004c, code lost:
    
        if (isLayoutRTL() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (isLayoutRTL() == false) goto L46;
     */
    @Override // l.AbstractC17366
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, l.C2550 r11, l.C21600 r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9586.onFocusSearchFailed(android.view.View, int, l.ۖ۬ۧ, l.᩸۬ۧ):android.view.View");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24512(C20875 c20875, int i, int i2) {
        int i3 = c20875.f67554;
        int i4 = c20875.f67556;
        if (i == -1) {
            int i5 = c20875.f67552;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) c20875.f67555.get(0);
                C16640 c16640 = (C16640) view.getLayoutParams();
                c20875.f67552 = c20875.f67553.f29087.mo7485(view);
                c16640.getClass();
                i5 = c20875.f67552;
            }
            if (i5 + i3 <= i2) {
                this.f29088.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c20875.f67551;
        if (i6 == Integer.MIN_VALUE) {
            c20875.m47701();
            i6 = c20875.f67551;
        }
        if (i6 - i3 >= i2) {
            this.f29088.set(i4, false);
        }
    }
}
