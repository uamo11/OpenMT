package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.DateKeyListener;
import android.text.method.DateTimeKeyListener;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.TimeKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: R98O */
/* renamed from: l.ۤۤᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10235 extends C12392 {

    /* renamed from: ۠ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30845 = 0;

    /* renamed from: ֡ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30846;

    /* renamed from: ֨ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30847;

    /* renamed from: ۖܿ, reason: not valid java name and contains not printable characters */
    public final Rect f30848;

    /* renamed from: ۘܿ, reason: not valid java name and contains not printable characters */
    public int f30849;

    /* renamed from: ۚܿ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f30850;

    /* renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f30851;

    /* renamed from: ۡܿ, reason: not valid java name and contains not printable characters */
    public NumberKeyListener f30852;

    /* renamed from: ۢܿ, reason: not valid java name and contains not printable characters */
    public int f30853;

    /* renamed from: ܺܿ, reason: not valid java name and contains not printable characters */
    public int f30854;

    /* renamed from: ᩴܿ, reason: not valid java name and contains not printable characters */
    public int f30855;

    /* renamed from: ᩵ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f30856;

    /* renamed from: ᩷ܿ, reason: not valid java name and contains not printable characters */
    public int f30857;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // l.C12392
    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25902() {
        return false;
    }

    @Override // l.C12392
    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo25916() {
        return false;
    }

    @Override // l.C12392
    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25925() {
        return true;
    }

    public C10235(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(C10235.this);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890(attributeSet);
    }

    public C10235(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(C10235.this);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890(attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        C10130 c10130 = new C10130();
        m30331(c10130, false);
        bundle.putByteArray("mt.memory.editor", c10130.m25427());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (C5213.m14989(bundle, "mt.memory.editor")) {
                super.onRestoreInstanceState(bundle.getParcelable("parent"));
                byte[] m14990 = C5213.m14990(bundle, "mt.memory.editor");
                if (m14990 != null) {
                    mo25896(C12951.m31485(m14990));
                    return;
                }
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // l.C12392
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25896(C12951 c12951) {
        super.mo25896(c12951);
        m25897(this.f30851);
    }

    @Override // l.C12392
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo25918() {
        super.mo25918();
        C22686 c22686 = this.f37245;
        c22686.f73275 = 0;
        c22686.f73268 = 0;
        if (!isInEditMode() && C21943.m49431()) {
            c22686.f73295 = -1433892728;
        }
        c22686.f73287 = (c22686.f73287 & 16777215) | (((int) (Color.alpha(r1) * 0.5f)) << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m25890(android.util.AttributeSet r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10235.m25890(android.util.AttributeSet):void");
    }

    @Override // l.C12392, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m30453();
        m30442();
    }

    @Override // l.C12392
    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25904() {
        return m30526() > 1000;
    }

    @Override // l.C12392, android.view.View
    public final void onDraw(Canvas canvas) {
        m25892(isAttachedToWindow() && mo25904());
        super.onDraw(canvas);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25891(C10235 c10235) {
        Rect rect = c10235.f30848;
        Rect rect2 = c10235.f30856;
        if (!c10235.mo25904()) {
            c10235.m25892(false);
            return;
        }
        if (!c10235.isShown() || !c10235.getLocalVisibleRect(rect2)) {
            rect2.setEmpty();
        }
        if (rect.equals(rect2)) {
            return;
        }
        rect.set(rect2);
        if (rect2.isEmpty()) {
            return;
        }
        c10235.invalidate();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m25892(boolean z) {
        if (this.f30847 == z) {
            return;
        }
        this.f30847 = z;
        this.f30848.setEmpty();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f30850;
        if (z) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // l.C12392, android.view.View
    public final void onDetachedFromWindow() {
        m25892(false);
        super.onDetachedFromWindow();
    }

    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25907() {
        int i;
        Drawable background = getBackground();
        if (!(background instanceof C12351)) {
            return false;
        }
        i = ((C12351) background).f37005;
        return i == 1;
    }

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25917() {
        int i;
        Drawable background = getBackground();
        if (!(background instanceof C12351)) {
            return false;
        }
        i = ((C12351) background).f37005;
        return i == 0;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m25913(int i) {
        int i2;
        Drawable background = getBackground();
        if (background instanceof C12351) {
            i2 = ((C12351) background).f37005;
            if (i2 == i) {
                return;
            }
        }
        super.setBackground(new C12351(getContext(), i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m25889(Context context, int i) {
        return new C12351(context, i);
    }

    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25927() {
        this.f37245.f73236 = false;
        this.f37315.m52261();
        invalidate();
    }

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public final void m25905() {
        this.f37245.f73236 = true;
        this.f37315.m52261();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f30854 = -1;
        } else {
            if (mode != Integer.MIN_VALUE) {
                size = Integer.MAX_VALUE;
            }
            int i3 = this.f30855;
            if (i3 != this.f30849) {
                this.f37258.mo9783((defaultSize - getPaddingLeft()) - getPaddingRight());
                i3 = m30413();
                this.f30854 = i3;
                int i4 = this.f30849;
                if (i3 > i4 || i3 < (i4 = this.f30855)) {
                    i3 = i4;
                }
            } else {
                this.f30854 = -1;
            }
            if (i3 <= 0) {
                i3 = 1;
            }
            int m24484 = ((int) ((this.f37245.m24484() * i3) + getPaddingTop() + getPaddingBottom())) + 1;
            if (m24484 <= size) {
                size = m24484;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // l.C12392
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo25908(int i) {
        int i2;
        int i3;
        if (getLayoutParams().height != -2 || (i2 = this.f30855) == (i3 = this.f30849)) {
            return;
        }
        int i4 = this.f30854;
        if (i4 != -1) {
            if (i4 <= i2 && i <= i2) {
                return;
            }
            if (i3 > 0 && i4 >= i3 && i >= i3) {
                return;
            }
        }
        requestLayout();
    }

    public C10235(Context context) {
        super(context, null);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(C10235.this);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890((AttributeSet) null);
    }

    @Override // l.C12392
    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final void mo25906() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return;
        }
        requestLayout();
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m25926(int i) {
        NumberKeyListener dialerKeyListener;
        if (this.f30853 != i) {
            this.f30853 = i;
            boolean z = !((131087 & i) == 131073);
            if (this.f30846 != z) {
                this.f30846 = z;
                m30363();
            }
            int i2 = i & 15;
            if (i2 == 2) {
                dialerKeyListener = DigitsKeyListener.getInstance((i & 4096) != 0, (i & 8192) != 0);
            } else if (i2 == 4) {
                int i3 = i & 4080;
                if (i3 == 16) {
                    dialerKeyListener = DateKeyListener.getInstance();
                } else if (i3 == 32) {
                    dialerKeyListener = TimeKeyListener.getInstance();
                } else {
                    dialerKeyListener = DateTimeKeyListener.getInstance();
                }
            } else {
                dialerKeyListener = i2 == 3 ? DialerKeyListener.getInstance() : null;
            }
            if (this.f30852 != dialerKeyListener) {
                this.f30852 = dialerKeyListener;
                m25897(this.f30851);
            }
            if (isAttachedToWindow() && hasFocus()) {
                m30380();
            }
        }
    }

    @Override // l.C12392
    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int mo25893() {
        return this.f30853;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25924(int i) {
        if (i != -1) {
            i |= 33554432;
        }
        this.f30857 = i;
        if (isAttachedToWindow() && hasFocus()) {
            m30380();
        }
    }

    @Override // l.C12392
    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int mo25920() {
        int i = this.f30857;
        if (i != -1) {
            return i;
        }
        if (this.f30846) {
            return focusSearch(130) != null ? 33554437 : 33554438;
        }
        return 33554433;
    }

    @Override // l.C12392
    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25898() {
        return this.f30846;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m25894(boolean z) {
        if (this.f30846 != z) {
            this.f30846 = z;
            m30363();
            int i = this.f30853;
            if ((i & 15) == 1) {
                if (z) {
                    this.f30853 = (-131073) & i;
                } else {
                    this.f30853 = 131072 | i;
                }
            }
            if (isAttachedToWindow() && hasFocus()) {
                m30380();
            }
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m25921(int i) {
        this.f30855 = i;
        this.f30849 = i;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public final int m25909() {
        return this.f30855;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m25901(int i) {
        this.f30855 = i;
        if (i > this.f30849) {
            this.f30849 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public final int m25923() {
        return this.f30849;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25903(int i) {
        this.f30849 = i;
        if (i < this.f30855) {
            this.f30855 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    @Override // l.C12392
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo25910(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        InterfaceC7785 m30436 = m30436();
        m30436.replace(0, m30436.length(), charSequence);
        mo25919(0);
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25912(int i) {
        this.f37245.m50688(Integer.valueOf(i));
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25911(Integer num) {
        this.f37245.m50688(num);
        invalidate();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m25915(int i) {
        this.f37245.m50685(Integer.valueOf(i));
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25895(Integer num) {
        this.f37245.m50685(num);
        invalidate();
    }

    @Override // l.C12392
    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int mo25899() {
        int i;
        Drawable background = getBackground();
        if (!(background instanceof C12351)) {
            return 0;
        }
        i = ((C12351) background).f37015;
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25897(InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new IllegalArgumentException();
        }
        this.f30851 = inputFilterArr;
        NumberKeyListener numberKeyListener = this.f30852;
        if (numberKeyListener == null) {
            m30436().setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        inputFilterArr2[0] = numberKeyListener;
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 1, inputFilterArr.length);
        m30436().setFilters(inputFilterArr2);
    }

    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final void m25900() {
        mo25922(0, m30526());
    }

    @Override // l.C12392
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo25919(int i) {
        super.mo25919(i);
        m30349(i, false);
    }

    @Override // l.C12392
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25922(int i, int i2) {
        super.mo25922(i, i2);
        m30430(false);
    }

    @Override // l.C12392
    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo25914() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49284();
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + ((int) this.f37245.m24501());
    }
}
