package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* compiled from: N1O9 */
/* renamed from: l.ۤܰۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10331 extends AbstractC9606 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31108;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f31109;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31110;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12447 f31111;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16496 f31112;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6495 f31113;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2386 f31114;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f31115;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31116;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f31117;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31118;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13132 f31119;

    public C10331(C2386 c2386) {
        this.f31114 = c2386;
        C13132 c13132 = c2386.f7607;
        this.f31119 = c13132;
        this.f31113 = (C6495) c13132.getLayoutManager();
        this.f31111 = new C12447();
        m26118();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m26118() {
        this.f31108 = 0;
        this.f31118 = 0;
        C12447 c12447 = this.f31111;
        c12447.f37447 = -1;
        c12447.f37445 = 0.0f;
        c12447.f37446 = 0;
        this.f31116 = -1;
        this.f31110 = -1;
        this.f31117 = false;
        this.f31109 = false;
        this.f31115 = false;
    }

    @Override // l.AbstractC9606
    public final void onScrollStateChanged(C13132 c13132, int i) {
        AbstractC16496 abstractC16496;
        AbstractC16496 abstractC164962;
        int i2 = this.f31108;
        if (!(i2 == 1 && this.f31118 == 1) && i == 1) {
            this.f31108 = 1;
            int i3 = this.f31110;
            if (i3 != -1) {
                this.f31116 = i3;
                this.f31110 = -1;
            } else if (this.f31116 == -1) {
                this.f31116 = this.f31113.findFirstVisibleItemPosition();
            }
            m26116(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f31109) {
                m26116(2);
                this.f31117 = true;
                return;
            }
            return;
        }
        C12447 c12447 = this.f31111;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m26117();
            if (!this.f31109) {
                int i4 = c12447.f37447;
                if (i4 != -1 && (abstractC164962 = this.f31112) != null) {
                    abstractC164962.onPageScrolled(i4, 0.0f, 0);
                }
            } else if (c12447.f37446 == 0) {
                int i5 = this.f31116;
                int i6 = c12447.f37447;
                if (i5 != i6 && (abstractC16496 = this.f31112) != null) {
                    abstractC16496.onPageSelected(i6);
                }
            }
            m26116(0);
            m26118();
        }
        if (this.f31108 == 2 && i == 0 && this.f31115) {
            m26117();
            if (c12447.f37446 == 0) {
                int i7 = this.f31110;
                int i8 = c12447.f37447;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC16496 abstractC164963 = this.f31112;
                    if (abstractC164963 != null) {
                        abstractC164963.onPageSelected(i8);
                    }
                }
                m26116(0);
                m26118();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.f31114.f7606.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r8.onPageSelected(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0048, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // l.AbstractC9606
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(l.C13132 r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f31109 = r6
            r5.m26117()
            boolean r0 = r5.f31117
            r1 = -1
            l.۫ܰۧ r2 = r5.f31111
            r3 = 0
            if (r0 == 0) goto L3d
            r5.f31117 = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            l.ۖ۟ۧ r8 = r5.f31114
            l.ۜۗۧ r8 = r8.f7606
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = 1
            goto L26
        L25:
            r8 = 0
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f37446
            if (r7 == 0) goto L30
            int r7 = r2.f37447
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f37447
        L32:
            r5.f31110 = r7
            int r8 = r5.f31116
            if (r8 == r7) goto L4d
            l.ܽ۟ۧ r8 = r5.f31112
            if (r8 == 0) goto L4d
            goto L4a
        L3d:
            int r7 = r5.f31108
            if (r7 != 0) goto L4d
            int r7 = r2.f37447
            if (r7 != r1) goto L46
            r7 = 0
        L46:
            l.ܽ۟ۧ r8 = r5.f31112
            if (r8 == 0) goto L4d
        L4a:
            r8.onPageSelected(r7)
        L4d:
            int r7 = r2.f37447
            if (r7 != r1) goto L52
            r7 = 0
        L52:
            float r8 = r2.f37445
            int r0 = r2.f37446
            l.ܽ۟ۧ r4 = r5.f31112
            if (r4 == 0) goto L5d
            r4.onPageScrolled(r7, r8, r0)
        L5d:
            int r7 = r2.f37447
            int r8 = r5.f31110
            if (r7 == r8) goto L65
            if (r8 != r1) goto L73
        L65:
            int r7 = r2.f37446
            if (r7 != 0) goto L73
            int r7 = r5.f31118
            if (r7 == r6) goto L73
            r5.m26116(r3)
            r5.m26118()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10331.onScrolled(l.۬۬ۧ, int, int):void");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m26117() {
        View findViewByPosition;
        int top;
        C6495 c6495 = this.f31113;
        int findFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        C12447 c12447 = this.f31111;
        c12447.f37447 = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1 || (findViewByPosition = c6495.findViewByPosition(findFirstVisibleItemPosition)) == null) {
            c12447.f37447 = -1;
            c12447.f37445 = 0.0f;
            c12447.f37446 = 0;
            return;
        }
        int leftDecorationWidth = c6495.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = c6495.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = c6495.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = c6495.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = c6495.getOrientation();
        C13132 c13132 = this.f31119;
        if (orientation == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - c13132.getPaddingLeft();
            if (this.f31114.f7606.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - c13132.getPaddingTop();
        }
        int i = -top;
        c12447.f37446 = i;
        if (i >= 0) {
            c12447.f37445 = height != 0 ? i / height : 0.0f;
        } else {
            if (new C20209(c6495).m46442()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(C19370.m44628(c12447.f37446, "Page can only be offset by a positive amount, not by "));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26124() {
        this.f31115 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26120(int i, boolean z) {
        AbstractC16496 abstractC16496;
        this.f31108 = z ? 2 : 3;
        boolean z2 = this.f31110 != i;
        this.f31110 = i;
        m26116(2);
        if (!z2 || (abstractC16496 = this.f31112) == null) {
            return;
        }
        abstractC16496.onPageSelected(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26121(AbstractC16496 abstractC16496) {
        this.f31112 = abstractC16496;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26122() {
        return this.f31118;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26123() {
        return this.f31118 == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m26119() {
        m26117();
        C12447 c12447 = this.f31111;
        return c12447.f37447 + c12447.f37445;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26116(int i) {
        if ((this.f31108 == 3 && this.f31118 == 0) || this.f31118 == i) {
            return;
        }
        this.f31118 = i;
        AbstractC16496 abstractC16496 = this.f31112;
        if (abstractC16496 != null) {
            abstractC16496.onPageScrollStateChanged(i);
        }
    }
}
