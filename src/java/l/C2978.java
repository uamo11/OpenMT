package l;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* compiled from: V51X */
/* renamed from: l.ۗۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2978 extends CompoundButton {
    public static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    public static final int MONOSPACE = 3;
    public static final int SANS = 1;
    public static final int SERIF = 2;
    public static final int THUMB_ANIMATION_DURATION = 250;
    public static final int TOUCH_MODE_DOWN = 1;
    public static final int TOUCH_MODE_DRAGGING = 2;
    public static final int TOUCH_MODE_IDLE = 0;
    public C7376 mAppCompatEmojiTextHelper;
    public C4389 mEmojiCompatInitCallback;
    public boolean mEnforceSwitchWidth;
    public boolean mHasThumbTint;
    public boolean mHasThumbTintMode;
    public boolean mHasTrackTint;
    public boolean mHasTrackTintMode;
    public int mMinFlingVelocity;
    public Layout mOffLayout;
    public Layout mOnLayout;
    public ObjectAnimator mPositionAnimator;
    public boolean mShowText;
    public boolean mSplitTrack;
    public int mSwitchBottom;
    public int mSwitchHeight;
    public int mSwitchLeft;
    public int mSwitchMinWidth;
    public int mSwitchPadding;
    public int mSwitchRight;
    public int mSwitchTop;
    public TransformationMethod mSwitchTransformationMethod;
    public int mSwitchWidth;
    public final Rect mTempRect;
    public ColorStateList mTextColors;
    public final C1916 mTextHelper;
    public CharSequence mTextOff;
    public CharSequence mTextOffTransformed;
    public CharSequence mTextOn;
    public CharSequence mTextOnTransformed;
    public final TextPaint mTextPaint;
    public Drawable mThumbDrawable;
    public float mThumbPosition;
    public int mThumbTextPadding;
    public ColorStateList mThumbTintList;
    public PorterDuff.Mode mThumbTintMode;
    public int mThumbWidth;
    public int mTouchMode;
    public int mTouchSlop;
    public float mTouchX;
    public float mTouchY;
    public Drawable mTrackDrawable;
    public ColorStateList mTrackTintList;
    public PorterDuff.Mode mTrackTintMode;
    public VelocityTracker mVelocityTracker;
    public static final Property THUMB_POS = new C19912(Float.class, "thumbPos");
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m9086(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public C2978(Context context) {
        this(context, null);
    }

    public C2978(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector_res_0x7f040489);
    }

    public C2978(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        C12855.m31289(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C3390.f10700;
        C22733 m50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, m50796.m50810(), i);
        Drawable m50815 = m50796.m50815(2);
        this.mThumbDrawable = m50815;
        if (m50815 != null) {
            m50815.setCallback(this);
        }
        Drawable m508152 = m50796.m50815(11);
        this.mTrackDrawable = m508152;
        if (m508152 != null) {
            m508152.setCallback(this);
        }
        m9103(m50796.m50817(0));
        m9100(m50796.m50817(1));
        this.mShowText = m50796.m50801(3, true);
        this.mThumbTextPadding = m50796.m50803(8, 0);
        this.mSwitchMinWidth = m50796.m50803(5, 0);
        this.mSwitchPadding = m50796.m50803(6, 0);
        this.mSplitTrack = m50796.m50801(4, false);
        ColorStateList m50804 = m50796.m50804(9);
        if (m50804 != null) {
            this.mThumbTintList = m50804;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode m36346 = C15320.m36346(m50796.m50809(10, -1), null);
        if (this.mThumbTintMode != m36346) {
            this.mThumbTintMode = m36346;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            m9088();
        }
        ColorStateList m508042 = m50796.m50804(12);
        if (m508042 != null) {
            this.mTrackTintList = m508042;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode m363462 = C15320.m36346(m50796.m50809(13, -1), null);
        if (this.mTrackTintMode != m363462) {
            this.mTrackTintMode = m363462;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            m9096();
        }
        int m50806 = m50796.m50806(7, 0);
        if (m50806 != 0) {
            setSwitchTextAppearance(context, m50806);
        }
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        m50796.m50813();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        m9102().m19826(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C22733 m50794 = C22733.m50794(context, i, C3390.f10698);
        ColorStateList m50804 = m50794.m50804(3);
        if (m50804 != null) {
            this.mTextColors = m50804;
        } else {
            this.mTextColors = getTextColors();
        }
        int m50803 = m50794.m50803(0, 0);
        if (m50803 != 0) {
            float f = m50803;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        m9089(m50794.m50809(1, -1), m50794.m50809(2, -1));
        if (m50794.m50801(14, false)) {
            this.mSwitchTransformationMethod = new C22607(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        m50794.m50813();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9089(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C21311.m48345(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        m9096();
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        m9096();
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9096() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = C8184.m21684(drawable).mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    C8184.m21676(mutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C8184.m21679(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C21311.m48345(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        m9088();
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        m9088();
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9088() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = C8184.m21684(drawable).mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    C8184.m21676(mutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C8184.m21679(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m9103(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = m9087(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m9094();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        m9103(charSequence);
        requestLayout();
        if (isChecked()) {
            m9104();
        }
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9100(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = m9087(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m9094();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        m9100(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m9093();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private CharSequence m9087(CharSequence charSequence) {
        TransformationMethod m19825 = m9102().m19825(this.mSwitchTransformationMethod);
        return m19825 != null ? m19825.getTransformation(charSequence, this) : charSequence;
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                m9094();
            }
        }
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = m9095(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = m9095(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.mShowText) {
            i5 = (this.mThumbTextPadding * 2) + Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth());
        } else {
            i5 = 0;
        }
        this.mThumbWidth = Math.max(i5, i3);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect m36348 = C15320.m36348(drawable3);
            i8 = Math.max(i8, m36348.left);
            i9 = Math.max(i9, m36348.right);
        }
        if (this.mEnforceSwitchWidth) {
            i6 = Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i8 + i9);
        } else {
            i6 = this.mSwitchMinWidth;
        }
        int max = Math.max(i7, i4);
        this.mSwitchWidth = i6;
        this.mSwitchHeight = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Layout m9095(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9092(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int m9098 = m9098();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + m9098) - i2;
        int i5 = this.mThumbWidth + i4;
        Rect rect = this.mTempRect;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.mSwitchBottom + i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.mTouchMode
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.m9105()
            float r2 = r6.mTouchX
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3b
        L39:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3b:
            int r0 = l.C22461.f72738
            int r0 = r6.getLayoutDirection()
            if (r0 != r1) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.mThumbPosition
            float r0 = r0 + r2
            float r0 = m9086(r0, r4, r3)
            float r2 = r6.mThumbPosition
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.mTouchX = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.mTouchX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.mTouchY
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.mTouchMode = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.mTouchX = r0
            r6.mTouchY = r3
            return r1
        L8b:
            int r0 = r6.mTouchMode
            if (r0 != r2) goto L96
            r6.m9097(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.mTouchMode = r0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m9092(r0, r2)
            if (r3 == 0) goto Lb9
            r6.mTouchMode = r1
            r6.mTouchX = r0
            r6.mTouchY = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2978.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9090(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9097(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                int i = C22461.f72738;
                if (getLayoutDirection() != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z = false;
                }
            } else {
                z = m9101();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m9090(motionEvent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9091(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C2978, Float>) THUMB_POS, z ? 1.0f : 0.0f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9099() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m9101() {
        return this.mThumbPosition > 0.5f;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m9104();
        } else {
            m9093();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m9091(isChecked);
        } else {
            m9099();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m36348 = C15320.m36348(this.mThumbDrawable);
            i5 = Math.max(0, m36348.left - rect.left);
            i9 = Math.max(0, m36348.right - rect.right);
        } else {
            i5 = 0;
        }
        int i10 = C22461.f72738;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.mSwitchHeight;
            int i12 = height - (i11 / 2);
            i7 = i11 + i12;
            i8 = i12;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.mSwitchHeight + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.mSwitchHeight;
        }
        this.mSwitchLeft = i6;
        this.mSwitchTop = i8;
        this.mSwitchBottom = i7;
        this.mSwitchRight = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int m9098 = m9098() + i3;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            rect = C15320.m36348(drawable);
        } else {
            rect = C15320.f46973;
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            m9098 += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.mTrackDrawable.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = m9098 - rect2.left;
            int i16 = m9098 + this.mThumbWidth + rect2.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C8184.m21675(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mSplitTrack && drawable2 != null) {
                Rect m36348 = C15320.m36348(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m36348.left;
                rect.right -= m36348.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m9101() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int i = C22461.f72738;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        int i = C22461.f72738;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m9098() {
        float f;
        int i = C22461.f72738;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * m9105()) + 0.5f);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m9105() {
        Rect rect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.mTempRect;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            rect = C15320.m36348(drawable2);
        } else {
            rect = C15320.f46973;
        }
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C8184.m21674(drawable, f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C8184.m21674(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9104() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = getResources().getString(bin.mt.plus.R.string.MT_Protector_res_0x7f120008);
            }
            C17648.m41316(this, charSequence);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m9093() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = getResources().getString(bin.mt.plus.R.string.MT_Protector_res_0x7f120007);
            }
            C17648.m41316(this, charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m9102().m19827(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m9102().m19829(inputFilterArr));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C7376 m9102() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C7376(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public void setEmojiCompatEnabled(boolean z) {
        m9102().m19830(z);
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        requestLayout();
    }

    public boolean isEmojiCompatEnabled() {
        return m9102().m19828();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m9094() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m19828() && C6921.m18716()) {
            C6921 m18717 = C6921.m18717();
            int m18718 = m18717.m18718();
            if (m18718 == 3 || m18718 == 0) {
                C4389 c4389 = new C4389(this);
                this.mEmojiCompatInitCallback = c4389;
                m18717.m18722(c4389);
            }
        }
    }

    public void onEmojiCompatInitializedForSwitchText() {
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        requestLayout();
    }
}
