package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: N5WL */
/* renamed from: l.ۗۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3122 extends Spinner {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"ResourceType"})
    public static final int[] f9746 = {R.attr.spinnerMode};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Context f9747;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4533 f9748;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f9749;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SpinnerAdapter f9750;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f9751;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC13909 f9752;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22193 f9753;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9754;

    public C3122(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector_res_0x7f04044f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3122(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f9749 = r0
            android.content.Context r0 = r8.getContext()
            l.C12855.m31289(r0, r8)
            int[] r0 = l.C3390.f10719
            r1 = 0
            l.᩺ۘ r2 = l.C22733.m50796(r9, r10, r0, r11, r1)
            l.᩹ۢ r3 = new l.᩹ۢ
            r3.<init>(r8)
            r8.f9753 = r3
            r3 = 4
            int r3 = r2.m50806(r3, r1)
            if (r3 == 0) goto L2e
            l.۫᩻ r4 = new l.۫᩻
            r4.<init>(r9, r3)
            r8.f9747 = r4
            goto L30
        L2e:
            r8.f9747 = r9
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = l.C3122.f9746     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5, r11, r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4f
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r6 == 0) goto L52
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L52
        L43:
            r9 = move-exception
            r4 = r5
            goto L49
        L46:
            goto L50
        L48:
            r9 = move-exception
        L49:
            if (r4 == 0) goto L4e
            r4.recycle()
        L4e:
            throw r9
        L4f:
            r5 = r4
        L50:
            if (r5 == 0) goto L55
        L52:
            r5.recycle()
        L55:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L8c
            if (r3 == r6) goto L5c
            goto L9a
        L5c:
            l.᩸ۡ r3 = new l.᩸ۡ
            android.content.Context r7 = r8.f9747
            r3.<init>(r8, r7, r10, r11)
            android.content.Context r7 = r8.f9747
            l.᩺ۘ r0 = l.C22733.m50796(r7, r10, r0, r11, r1)
            r1 = 3
            r7 = -2
            int r1 = r0.m50811(r1, r7)
            r8.f9754 = r1
            android.graphics.drawable.Drawable r1 = r0.m50815(r6)
            r3.setBackgroundDrawable(r1)
            java.lang.String r1 = r2.m50807(r5)
            r3.mo1655(r1)
            r0.m50813()
            r8.f9748 = r3
            l.ۘۡ r0 = new l.ۘۡ
            r0.<init>(r8, r8, r3)
            r8.f9752 = r0
            goto L9a
        L8c:
            l.֡ۡ r0 = new l.֡ۡ
            r0.<init>(r8)
            r8.f9748 = r0
            java.lang.String r1 = r2.m50807(r5)
            r0.mo1655(r1)
        L9a:
            java.lang.CharSequence[] r0 = r2.m50805()
            if (r0 == 0) goto Lb1
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r9, r3, r0)
            r9 = 2131558859(0x7f0d01cb, float:1.8743046E38)
            r1.setDropDownViewResource(r9)
            r8.setAdapter(r1)
        Lb1:
            r2.m50813()
            r8.f9751 = r6
            android.widget.SpinnerAdapter r9 = r8.f9750
            if (r9 == 0) goto Lbf
            r8.setAdapter(r9)
            r8.f9750 = r4
        Lbf:
            l.᩹ۢ r9 = r8.f9753
            r9.m49839(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3122.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f9747;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C21311.m48345(this.f9747, i));
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1657(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.mo1658();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1659(i);
            interfaceC4533.mo1652(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.mo1651();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f9748 != null) {
            this.f9754 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.f9748 != null) {
            return this.f9754;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9751) {
            this.f9750 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            Context context = this.f9747;
            if (context == null) {
                context = getContext();
            }
            interfaceC4533.mo1654(new C5239(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 == null || !interfaceC4533.isShowing()) {
            return;
        }
        interfaceC4533.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC13909 abstractViewOnTouchListenerC13909 = this.f9752;
        if (abstractViewOnTouchListenerC13909 == null || !abstractViewOnTouchListenerC13909.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9748 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m9499(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            if (interfaceC4533.isShowing()) {
                return true;
            }
            m9501();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1655(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        return interfaceC4533 != null ? interfaceC4533.mo1656() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49835();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9499(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.f9749;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4533 m9500() {
        return this.f9748;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9501() {
        this.f9748.mo1653(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C20056 c20056 = new C20056(super.onSaveInstanceState());
        InterfaceC4533 interfaceC4533 = this.f9748;
        c20056.f64973 = interfaceC4533 != null && interfaceC4533.isShowing();
        return c20056;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C20056 c20056 = (C20056) parcelable;
        super.onRestoreInstanceState(c20056.getSuperState());
        if (!c20056.f64973 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18645(this));
    }
}
