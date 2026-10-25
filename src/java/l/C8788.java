package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* compiled from: M5Y2 */
/* renamed from: l.ۡۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8788 extends C1525 implements InterfaceC4471, InterfaceC7002 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3060 f26761;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26762;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Context f26763;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC9494 f26764;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26765;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f26766;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC19994 f26767;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26768;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26769;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f26770;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f26771;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C17254 f26772;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C7560 generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C7560 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public C8788(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f26766 = (int) (56.0f * f);
        this.f26762 = (int) (f * 4.0f);
        this.f26763 = context;
        this.f26765 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22680(int i) {
        if (this.f26765 != i) {
            this.f26765 = i;
            if (i == 0) {
                this.f26763 = getContext();
            } else {
                this.f26763 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22681() {
        return this.f26765;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22672(C17254 c17254) {
        this.f26772 = c17254;
        c17254.m40546(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            c17254.updateMenuView(false);
            if (this.f26772.m40552()) {
                this.f26772.m40550();
                this.f26772.m40547();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // l.C1525, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ?? r5;
        int i7;
        int i8;
        int i9;
        C3060 c3060;
        boolean z2 = this.f26771;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f26771 = z3;
        if (z2 != z3) {
            this.f26769 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f26771 && (c3060 = this.f26761) != null && size != this.f26769) {
            this.f26769 = size;
            c3060.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f26771 || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C6671 c6671 = (C6671) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) c6671).rightMargin = 0;
                ((LinearLayout.LayoutParams) c6671).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.f26766;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z4 = false;
        int i20 = 0;
        long j = 0;
        while (true) {
            i3 = this.f26762;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = i11;
            if (childAt.getVisibility() == 8) {
                i7 = mode;
                i8 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ViewOnClickListenerC9411;
                int i23 = i17 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C6671 c66712 = (C6671) childAt.getLayoutParams();
                c66712.f20729 = false;
                c66712.f20731 = 0;
                c66712.f20726 = 0;
                c66712.f20727 = false;
                ((LinearLayout.LayoutParams) c66712).leftMargin = 0;
                ((LinearLayout.LayoutParams) c66712).rightMargin = 0;
                c66712.f20728 = z5 && !TextUtils.isEmpty(((ViewOnClickListenerC9411) childAt).getText());
                int i24 = c66712.f20730 ? 1 : i13;
                C6671 c66713 = (C6671) childAt.getLayoutParams();
                i7 = mode;
                i8 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ViewOnClickListenerC9411 viewOnClickListenerC9411 = z5 ? (ViewOnClickListenerC9411) childAt : null;
                boolean z6 = (viewOnClickListenerC9411 == null || TextUtils.isEmpty(viewOnClickListenerC9411.getText())) ? false : true;
                if (i24 <= 0 || (z6 && i24 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i15, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i9++;
                    }
                    if (z6 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c66713.f20727 = !c66713.f20730 && z6;
                c66713.f20726 = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i15, 1073741824), makeMeasureSpec);
                int max = Math.max(i18, i9);
                if (c66712.f20727) {
                    i20++;
                }
                if (c66712.f20730) {
                    z4 = true;
                }
                i13 -= i9;
                int max2 = Math.max(i16, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    i18 = max;
                    j |= 1 << i19;
                    i17 = i23;
                    i16 = max2;
                } else {
                    i18 = max;
                    i16 = max2;
                    i17 = i23;
                }
            }
            i19++;
            size3 = i21;
            i11 = i22;
            paddingBottom = i8;
            mode = i7;
        }
        int i25 = mode;
        int i26 = i11;
        int i27 = size3;
        boolean z7 = z4 && i17 == 2;
        boolean z8 = false;
        while (i20 > 0 && i13 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j2 = 0;
            while (i30 < childCount2) {
                C6671 c66714 = (C6671) getChildAt(i30).getLayoutParams();
                boolean z9 = z8;
                if (c66714.f20727) {
                    int i31 = c66714.f20726;
                    if (i31 < i28) {
                        j2 = 1 << i30;
                        i28 = i31;
                        i29 = 1;
                    } else if (i31 == i28) {
                        j2 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z8 = z9;
            }
            z = z8;
            j |= j2;
            if (i29 > i13) {
                break;
            }
            int i32 = i28 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C6671 c66715 = (C6671) childAt2.getLayoutParams();
                int i34 = childMeasureSpec;
                int i35 = i16;
                long j3 = 1 << i33;
                if ((j2 & j3) == 0) {
                    if (c66715.f20726 == i32) {
                        j |= j3;
                    }
                } else {
                    if (z7 && c66715.f20728) {
                        r5 = 1;
                        r5 = 1;
                        if (i13 == 1) {
                            childAt2.setPadding(i3 + i15, 0, i3, 0);
                        }
                    } else {
                        r5 = 1;
                    }
                    c66715.f20726 += r5;
                    c66715.f20729 = r5;
                    i13--;
                }
                i33++;
                childMeasureSpec = i34;
                i16 = i35;
            }
            z8 = true;
        }
        z = z8;
        int i36 = childMeasureSpec;
        int i37 = i16;
        boolean z10 = !z4 && i17 == 1;
        if (i13 > 0 && j != 0 && (i13 < i17 - 1 || z10 || i18 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C6671) getChildAt(0).getLayoutParams()).f20728) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount2 - 1;
                if ((j & (1 << i38)) != 0 && !((C6671) getChildAt(i38).getLayoutParams()).f20728) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i13 * i15) / bitCount) : 0;
            for (int i40 = 0; i40 < childCount2; i40++) {
                if ((j & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    C6671 c66716 = (C6671) childAt3.getLayoutParams();
                    if (childAt3 instanceof ViewOnClickListenerC9411) {
                        c66716.f20731 = i39;
                        c66716.f20729 = true;
                        if (i40 == 0 && !c66716.f20728) {
                            ((LinearLayout.LayoutParams) c66716).leftMargin = (-i39) / 2;
                        }
                    } else if (c66716.f20730) {
                        c66716.f20731 = i39;
                        c66716.f20729 = true;
                        ((LinearLayout.LayoutParams) c66716).rightMargin = (-i39) / 2;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) c66716).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c66716).rightMargin = i39 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt4 = getChildAt(i41);
                C6671 c66717 = (C6671) childAt4.getLayoutParams();
                if (c66717.f20729) {
                    i6 = i36;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c66717.f20726 * i15) + c66717.f20731, 1073741824), i6);
                } else {
                    i6 = i36;
                }
                i41++;
                i36 = i6;
            }
        }
        if (i25 != 1073741824) {
            i5 = i26;
            i4 = i37;
        } else {
            i4 = i27;
            i5 = i26;
        }
        setMeasuredDimension(i5, i4);
    }

    @Override // l.C1525, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f26771) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        int i8 = C22461.f72738;
        boolean z2 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C6671 c6671 = (C6671) childAt.getLayoutParams();
                if (c6671.f20730) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m22675(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c6671).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c6671).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c6671).leftMargin) + ((LinearLayout.LayoutParams) c6671).rightMargin;
                    m22675(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i7 / 2) - (measuredWidth2 / 2);
            int i14 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C6671 c66712 = (C6671) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c66712.f20730) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c66712).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c66712).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C6671 c66713 = (C6671) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c66713.f20730) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c66713).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = C19373.m44633(measuredWidth4, ((LinearLayout.LayoutParams) c66713).rightMargin, max, i20);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m22683();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22671(Drawable drawable) {
        m22685();
        this.f26772.m40545(drawable);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable m22684() {
        m22685();
        return this.f26772.m40548();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m22679() {
        return this.f26768;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22674(boolean z) {
        this.f26768 = z;
    }

    public static C6671 generateDefaultLayoutParams() {
        C6671 c6671 = new C6671(-2, -2);
        c6671.f20730 = false;
        ((LinearLayout.LayoutParams) c6671).gravity = 16;
        return c6671;
    }

    @Override // l.C1525, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6671(getContext(), attributeSet);
    }

    @Override // l.C1525, android.view.ViewGroup
    public final C7560 generateLayoutParams(AttributeSet attributeSet) {
        return new C6671(getContext(), attributeSet);
    }

    public static C6671 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C6671 c6671;
        if (layoutParams != null) {
            if (layoutParams instanceof C6671) {
                C6671 c66712 = (C6671) layoutParams;
                c6671 = new C6671(c66712);
                c6671.f20730 = c66712.f20730;
            } else {
                c6671 = new C6671(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c6671).gravity <= 0) {
                ((LinearLayout.LayoutParams) c6671).gravity = 16;
            }
            return c6671;
        }
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6671;
    }

    @Override // l.InterfaceC4471
    /* renamed from: ֫ */
    public final boolean mo3362(C5882 c5882) {
        return this.f26761.performItemAction(c5882, 0);
    }

    @Override // l.InterfaceC7002
    public final void initialize(C3060 c3060) {
        this.f26761 = c3060;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Menu m22685() {
        if (this.f26761 == null) {
            Context context = getContext();
            C3060 c3060 = new C3060(context);
            this.f26761 = c3060;
            c3060.setCallback(new C20783(this));
            C17254 c17254 = new C17254(context);
            this.f26772 = c17254;
            c17254.m40553();
            C17254 c172542 = this.f26772;
            InterfaceC17585 interfaceC17585 = this.f26770;
            if (interfaceC17585 == null) {
                interfaceC17585 = new C23604();
            }
            c172542.setCallback(interfaceC17585);
            this.f26761.addMenuPresenter(this.f26772, this.f26763);
            this.f26772.m40546(this);
        }
        return this.f26761;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22673(InterfaceC17585 interfaceC17585, InterfaceC19994 interfaceC19994) {
        this.f26770 = interfaceC17585;
        this.f26767 = interfaceC19994;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C3060 m22678() {
        return this.f26761;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m22676() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40547();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m22687() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40550();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m22686() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40552();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m22677() {
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            return c17254.f52900 != null || c17254.m40552();
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22683() {
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = c17254.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22675(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC14431)) {
            z = ((InterfaceC14431) childAt).mo20623();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC14431)) ? z : ((InterfaceC14431) childAt2).mo20624() | z;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22682() {
        this.f26772.m40549();
    }
}
