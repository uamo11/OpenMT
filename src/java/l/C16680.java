package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;

/* compiled from: I5V7 */
@InterfaceC6803
/* renamed from: l.ܽܰۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16680 extends ViewGroup {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int[] f51193 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f51194 = {R.attr.textAllCaps};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f51195;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f51196;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f51197;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public WeakReference f51198;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f51199;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51200;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0452 f51201;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1864 f51202;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51203;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51204;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f51205;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51206;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f51207;

    public C16680(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51204 = -1;
        this.f51196 = -1.0f;
        this.f51202 = new C1864(this);
        TextView textView = new TextView(context);
        this.f51199 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f51205 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f51195 = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f51193);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C4330.m12997(textView, resourceId);
            C4330.m12997(textView2, resourceId);
            C4330.m12997(textView3, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            textView.setTextSize(0, f);
            textView2.setTextSize(0, f);
            textView3.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f51206 = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f51200 = defaultColor;
        int i = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i);
        textView3.setTextColor(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f51194);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            textView.setTransformationMethod(new C11037(textView.getContext()));
            textView2.setTransformationMethod(new C11037(textView2.getContext()));
            textView3.setTransformationMethod(new C11037(textView3.getContext()));
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f51197 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39208(int i) {
        this.f51197 = i;
        requestLayout();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39211() {
        return this.f51197;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C0452)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C0452 c0452 = (C0452) parent;
        AbstractC12014 abstractC12014 = c0452.f2007;
        C1864 c1864 = this.f51202;
        c0452.m2040(c1864);
        c0452.m2030((InterfaceC15974) c1864);
        this.f51201 = c0452;
        WeakReference weakReference = this.f51198;
        m39210(weakReference != null ? (AbstractC12014) weakReference.get() : null, abstractC12014);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0452 c0452 = this.f51201;
        if (c0452 != null) {
            m39210(c0452.f2007, (AbstractC12014) null);
            this.f51201.m2040((InterfaceC2570) null);
            this.f51201.m2035((InterfaceC15974) this.f51202);
            this.f51201 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39209(int i, AbstractC12014 abstractC12014) {
        int mo11916 = abstractC12014 != null ? abstractC12014.mo11916() : 0;
        this.f51203 = true;
        CharSequence charSequence = null;
        CharSequence mo11912 = (i < 1 || abstractC12014 == null) ? null : abstractC12014.mo11912(i - 1);
        TextView textView = this.f51199;
        textView.setText(mo11912);
        CharSequence mo119122 = (abstractC12014 == null || i >= mo11916) ? null : abstractC12014.mo11912(i);
        TextView textView2 = this.f51205;
        textView2.setText(mo119122);
        int i2 = i + 1;
        if (i2 < mo11916 && abstractC12014 != null) {
            charSequence = abstractC12014.mo11912(i2);
        }
        TextView textView3 = this.f51195;
        textView3.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f51204 = i;
        if (!this.f51207) {
            mo20806(this.f51196, false, i);
        }
        this.f51203 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f51203) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39210(AbstractC12014 abstractC12014, AbstractC12014 abstractC120142) {
        C1864 c1864 = this.f51202;
        if (abstractC12014 != null) {
            abstractC12014.m29382(c1864);
            this.f51198 = null;
        }
        if (abstractC120142 != null) {
            abstractC120142.m29379((DataSetObserver) c1864);
            this.f51198 = new WeakReference(abstractC120142);
        }
        C0452 c0452 = this.f51201;
        if (c0452 != null) {
            this.f51204 = -1;
            this.f51196 = -1.0f;
            m39209(c0452.f1989, abstractC120142);
            requestLayout();
        }
    }

    /* renamed from: ֫ */
    public void mo20806(float f, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f51204) {
            m39209(i, this.f51201.f2007);
        } else if (!z && f == this.f51196) {
            return;
        }
        this.f51207 = true;
        TextView textView = this.f51199;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f51205;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f51195;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.f51206 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.f51197) - measuredWidth);
                textView.layout(min, i3, measuredWidth + min, textView.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f51197);
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f51196 = f;
                this.f51207 = false;
            }
            i2 = (height - paddingBottom) - max2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.f51197) - measuredWidth);
        textView.layout(min2, i3, measuredWidth + min2, textView.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f51197);
        textView3.layout(max32, i5, max32 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f51196 = f;
        this.f51207 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f51199.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f51205;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f51195.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(mo20805(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f51201 != null) {
            float f = this.f51196;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo20806(f, true, this.f51204);
        }
    }

    /* renamed from: ֫ */
    public int mo20805() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
