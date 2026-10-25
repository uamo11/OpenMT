package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 165A */
/* renamed from: l.᩹᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22524 extends AbstractC1357 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f72879;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f72880;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f72881;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public TextView f72882;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f72883;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f72884;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f72885;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f72886;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f72887;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public LinearLayout f72888;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72889;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public TextView f72890;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C22524(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector_res_0x7f04001c);
    }

    public C22524(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C22733 m50796 = C22733.m50796(context, attributeSet, C3390.f10716, i, 0);
        setBackground(m50796.m50815(0));
        this.f72885 = m50796.m50806(5, 0);
        this.f72879 = m50796.m50806(4, 0);
        this.f4923 = m50796.m50811(3, 0);
        this.f72889 = m50796.m50806(2, R.layout.MT_Protector_res_0x7f0d0005);
        m50796.m50813();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = this.f4922.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
    }

    @Override // l.AbstractC1357
    /* renamed from: ֫ */
    public final void mo4722(int i) {
        this.f4923 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50510(View view) {
        LinearLayout linearLayout;
        View view2 = this.f72884;
        if (view2 != null) {
            removeView(view2);
        }
        this.f72884 = view;
        if (view != null && (linearLayout = this.f72888) != null) {
            removeView(linearLayout);
            this.f72888 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50515(CharSequence charSequence) {
        this.f72886 = charSequence;
        m50507();
        C17648.m41305(this, charSequence);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50511(CharSequence charSequence) {
        this.f72881 = charSequence;
        m50507();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m50517() {
        return this.f72886;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence m50514() {
        return this.f72881;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m50507() {
        if (this.f72888 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector_res_0x7f0d0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f72888 = linearLayout;
            this.f72890 = (TextView) linearLayout.findViewById(R.id.MT_Protector_res_0x7f0a0048);
            this.f72882 = (TextView) this.f72888.findViewById(R.id.MT_Protector_res_0x7f0a0047);
            int i = this.f72885;
            if (i != 0) {
                this.f72890.setTextAppearance(getContext(), i);
            }
            int i2 = this.f72879;
            if (i2 != 0) {
                this.f72882.setTextAppearance(getContext(), i2);
            }
        }
        this.f72890.setText(this.f72886);
        this.f72882.setText(this.f72881);
        boolean isEmpty = TextUtils.isEmpty(this.f72886);
        boolean isEmpty2 = TextUtils.isEmpty(this.f72881);
        this.f72882.setVisibility(!isEmpty2 ? 0 : 8);
        this.f72888.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f72888.getParent() == null) {
            addView(this.f72888);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15530 m50508(int i, long j) {
        C15530 c15530 = this.f4918;
        if (c15530 != null) {
            c15530.m36598();
        }
        C5591 c5591 = this.f4919;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C15530 m41298 = C17648.m41298(this);
            m41298.m36599(1.0f);
            m41298.m36600(j);
            c5591.f17305.f4918 = m41298;
            c5591.f17304 = i;
            m41298.m36602(c5591);
            return m41298;
        }
        C15530 m412982 = C17648.m41298(this);
        m412982.m36599(0.0f);
        m412982.m36600(j);
        c5591.f17305.f4918 = m412982;
        c5591.f17304 = i;
        m412982.m36602(c5591);
        return m412982;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50512(AbstractC3557 abstractC3557) {
        View view = this.f72880;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f72889, (ViewGroup) this, false);
            this.f72880 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f72880);
        }
        View findViewById = this.f72880.findViewById(R.id.MT_Protector_res_0x7f0a0051);
        this.f72883 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC21819(abstractC3557));
        C3060 mo10836 = abstractC3557.mo10836();
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = c17254.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
        C17254 c172542 = new C17254(getContext());
        this.f4922 = c172542;
        c172542.m40553();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mo10836.addMenuPresenter(this.f4922, this.f4920);
        C8788 c8788 = (C8788) this.f4922.mo22488(this);
        this.f4916 = c8788;
        c8788.setBackground(null);
        addView(this.f4916, layoutParams);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50509() {
        if (this.f72880 == null) {
            m50518();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50518() {
        removeAllViews();
        this.f72884 = null;
        this.f4916 = null;
        this.f4922 = null;
        View view = this.f72883;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50516() {
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40547();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f4923;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f72880;
        if (view != null) {
            int m4719 = AbstractC1357.m4719(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72880.getLayoutParams();
            paddingLeft = m4719 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        C8788 c8788 = this.f4916;
        if (c8788 != null && c8788.getParent() == this) {
            paddingLeft = AbstractC1357.m4719(this.f4916, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f72888;
        if (linearLayout != null && this.f72884 == null) {
            if (this.f72887) {
                this.f72888.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f72888.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f72888.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC1357.m4719(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f72884;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f72884.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f4923 <= 0) {
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
            return;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C22461.f72738;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f72880;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72880.getLayoutParams();
            int i6 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z2 ? paddingRight - i6 : paddingRight + i6;
            int m4718 = i8 + AbstractC1357.m4718(i8, paddingTop, paddingTop2, this.f72880, z2);
            paddingRight = z2 ? m4718 - i7 : m4718 + i7;
        }
        LinearLayout linearLayout = this.f72888;
        if (linearLayout != null && this.f72884 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC1357.m4718(paddingRight, paddingTop, paddingTop2, this.f72888, z2);
        }
        View view2 = this.f72884;
        if (view2 != null) {
            AbstractC1357.m4718(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        C8788 c8788 = this.f4916;
        if (c8788 != null) {
            AbstractC1357.m4718(paddingLeft, paddingTop, paddingTop2, c8788, !z2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50513(boolean z) {
        if (z != this.f72887) {
            requestLayout();
        }
        this.f72887 = z;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50519() {
        return this.f72887;
    }
}
