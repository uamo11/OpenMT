package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: 18GG */
/* renamed from: l.۟ۚۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7263 extends View implements InterfaceC8051 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int f22282;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f22283;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Formatter f22284;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Rect f22285;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f22286;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final Point f22287;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int f22288;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22289;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC21400 f22290;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int f22291;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f22292;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Paint f22293;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final StringBuilder f22294;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final Paint f22295;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Rect f22296;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public long f22297;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Paint f22298;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f22299;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f22300;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Rect f22301;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Paint f22302;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f22303;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int f22304;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f22305;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f22306;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f22307;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f22308;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f22309;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Rect f22310;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f22311;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final int f22312;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Drawable f22313;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f22314;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final Rect f22315;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Paint f22316;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22317;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public ValueAnimator f22318;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long[] f22319;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f22320;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f22321;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean[] f22322;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19483(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // l.InterfaceC8051
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19495(InterfaceC0995 interfaceC0995) {
        interfaceC0995.getClass();
        this.f22306.add(interfaceC0995);
    }

    public C7263(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7263(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public C7263(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f22315 = new Rect();
        this.f22296 = new Rect();
        this.f22301 = new Rect();
        this.f22285 = new Rect();
        Paint paint = new Paint();
        this.f22316 = paint;
        Paint paint2 = new Paint();
        this.f22298 = paint2;
        Paint paint3 = new Paint();
        this.f22302 = paint3;
        Paint paint4 = new Paint();
        this.f22314 = paint4;
        Paint paint5 = new Paint();
        this.f22293 = paint5;
        Paint paint6 = new Paint();
        this.f22295 = paint6;
        paint6.setAntiAlias(true);
        this.f22306 = new CopyOnWriteArraySet();
        this.f22287 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f22300 = f;
        this.f22305 = m19483(f, -50);
        int m19483 = m19483(f, 4);
        int m194832 = m19483(f, 26);
        int m194833 = m19483(f, 4);
        int m194834 = m19483(f, 12);
        int m194835 = m19483(f, 0);
        int m194836 = m19483(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C22736.f73441, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f22313 = drawable;
                if (drawable != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    m194832 = Math.max(drawable.getMinimumHeight(), m194832);
                }
                this.f22303 = obtainStyledAttributes.getDimensionPixelSize(3, m19483);
                this.f22304 = obtainStyledAttributes.getDimensionPixelSize(12, m194832);
                this.f22286 = obtainStyledAttributes.getInt(2, 0);
                this.f22289 = obtainStyledAttributes.getDimensionPixelSize(1, m194833);
                this.f22282 = obtainStyledAttributes.getDimensionPixelSize(11, m194834);
                this.f22288 = obtainStyledAttributes.getDimensionPixelSize(8, m194835);
                this.f22312 = obtainStyledAttributes.getDimensionPixelSize(9, m194836);
                int i4 = obtainStyledAttributes.getInt(6, -1);
                int i5 = obtainStyledAttributes.getInt(7, -1);
                int i6 = obtainStyledAttributes.getInt(4, -855638017);
                int i7 = obtainStyledAttributes.getInt(13, 872415231);
                int i8 = obtainStyledAttributes.getInt(0, -1291845888);
                int i9 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f22303 = m19483;
            this.f22304 = m194832;
            this.f22286 = 0;
            this.f22289 = m194833;
            this.f22282 = m194834;
            this.f22288 = m194835;
            this.f22312 = m194836;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f22313 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22294 = sb;
        this.f22284 = new Formatter(sb, Locale.getDefault());
        this.f22290 = new RunnableC21400(1, this);
        Drawable drawable2 = this.f22313;
        if (drawable2 != null) {
            this.f22291 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22291 = (Math.max(this.f22288, Math.max(this.f22282, this.f22312)) + 1) / 2;
        }
        this.f22307 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f22318 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܰۚۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C7263.m19485(C7263.this, valueAnimator2);
            }
        });
        this.f22321 = -9223372036854775807L;
        this.f22309 = -9223372036854775807L;
        this.f22299 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19485(C7263 c7263, ValueAnimator valueAnimator) {
        c7263.f22307 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7263.invalidate(c7263.f22315);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19500() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = false;
        this.f22307 = 1.0f;
        invalidate(this.f22315);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19502() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = false;
        valueAnimator.setFloatValues(this.f22307, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19496(boolean z) {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = z;
        this.f22307 = 0.0f;
        invalidate(this.f22315);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19498() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f22307, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // l.InterfaceC8051
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19494(long j) {
        if (this.f22297 == j) {
            return;
        }
        this.f22297 = j;
        setContentDescription(C3603.m11020(this.f22294, this.f22284, j));
        m19492();
    }

    @Override // l.InterfaceC8051
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo19501(long j) {
        if (this.f22292 == j) {
            return;
        }
        this.f22292 = j;
        m19492();
    }

    @Override // l.InterfaceC8051
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo19499(long j) {
        if (this.f22321 == j) {
            return;
        }
        this.f22321 = j;
        if (this.f22320 && j == -9223372036854775807L) {
            m19486(true);
        }
        m19492();
    }

    @Override // l.InterfaceC8051
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo19493() {
        int width = (int) (this.f22296.width() / this.f22300);
        if (width == 0) {
            return C13132.FOREVER_NS;
        }
        long j = this.f22321;
        return (j == 0 || j == -9223372036854775807L) ? C13132.FOREVER_NS : j / width;
    }

    @Override // l.InterfaceC8051
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19497(long[] jArr, boolean[] zArr, int i) {
        C22632.m50631(i == 0 || !(jArr == null || zArr == null));
        this.f22317 = i;
        this.f22319 = jArr;
        this.f22322 = zArr;
        m19492();
    }

    @Override // android.view.View, l.InterfaceC8051
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f22320 || z) {
            return;
        }
        m19486(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f22296;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i2 = centerY + height;
        long j = this.f22321;
        Paint paint = this.f22302;
        Rect rect2 = this.f22285;
        if (j <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f22301;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int max = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (max < i5) {
                canvas.drawRect(max, centerY, i5, i2, paint);
            }
            int max2 = Math.max(i3, rect2.right);
            if (i4 > max2) {
                canvas.drawRect(max2, centerY, i4, i2, this.f22298);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i2, this.f22316);
            }
            if (this.f22317 != 0) {
                long[] jArr = this.f22319;
                jArr.getClass();
                boolean[] zArr = this.f22322;
                zArr.getClass();
                int i6 = this.f22289;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f22317) {
                    canvas.drawRect(Math.min(rect.width() - i6, Math.max(i8, ((int) ((rect.width() * C3603.m11016(jArr[i9], 0L, this.f22321)) / this.f22321)) - i7)) + rect.left, centerY, r1 + i6, i2, zArr[i9] ? this.f22293 : this.f22314);
                    i9++;
                    i8 = 0;
                    i6 = i6;
                }
            }
        }
        if (this.f22321 > 0) {
            int m11000 = C3603.m11000(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f22313;
            if (drawable == null) {
                if (this.f22320 || isFocused()) {
                    i = this.f22312;
                } else {
                    i = isEnabled() ? this.f22282 : this.f22288;
                }
                canvas.drawCircle(m11000, centerY2, (int) ((i * this.f22307) / 2.0f), this.f22295);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f22307)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f22307)) / 2;
                drawable.setBounds(m11000 - intrinsicWidth, centerY2 - intrinsicHeight, m11000 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto L97
            long r2 = r9.f22321
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L97
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.f22287
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f22296
            android.graphics.Rect r5 = r9.f22285
            r6 = 1
            if (r3 == 0) goto L73
            r7 = 3
            if (r3 == r6) goto L64
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L64
            goto L97
        L38:
            boolean r10 = r9.f22320
            if (r10 == 0) goto L97
            int r10 = r9.f22305
            if (r2 >= r10) goto L48
            int r10 = r9.f22311
            int r10 = l.C7416.m19938(r0, r10, r7, r10)
            float r10 = (float) r10
            goto L4b
        L48:
            r9.f22311 = r0
            float r10 = (float) r0
        L4b:
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = l.C3603.m11000(r10, r0, r1)
            r5.right = r10
            long r0 = r9.m19487()
            r9.m19488(r0)
            r9.m19492()
            r9.invalidate()
            return r6
        L64:
            boolean r0 = r9.f22320
            if (r0 == 0) goto L97
            int r10 = r10.getAction()
            if (r10 != r7) goto L6f
            r1 = 1
        L6f:
            r9.m19486(r1)
            return r6
        L73:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f22315
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto L97
            int r0 = r4.left
            int r1 = r4.right
            int r10 = l.C3603.m11000(r10, r0, r1)
            r5.right = r10
            long r0 = r9.m19487()
            r9.m19490(r0)
            r9.m19492()
            r9.invalidate()
            return r6
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7263.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.m19489()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m19491(r0)
            if (r0 == 0) goto L2e
            l.᩸ۛᩳ r5 = r4.f22290
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f22320
            if (r0 == 0) goto L2e
            r5 = 0
            r4.m19486(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7263.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f22320 || z) {
            return;
        }
        m19486(false);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22313;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22313;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f22304;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f22313;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Rect rect;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f22283 ? 0 : this.f22291;
        int i10 = this.f22286;
        int i11 = this.f22303;
        int i12 = this.f22304;
        if (i10 == 1) {
            i5 = (i8 - getPaddingBottom()) - i12;
            i6 = ((i8 - getPaddingBottom()) - i11) - Math.max(i9 - (i11 / 2), 0);
        } else {
            i5 = (i8 - i12) / 2;
            i6 = (i8 - i11) / 2;
        }
        Rect rect2 = this.f22315;
        rect2.set(paddingLeft, i5, paddingRight, i12 + i5);
        this.f22296.set(rect2.left + i9, i6, rect2.right - i9, i11 + i6);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f22310) == null || rect.width() != i7 || this.f22310.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.f22310 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m19492();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f22313;
        if (drawable == null || Build.VERSION.SDK_INT < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(C3603.m11020(this.f22294, this.f22284, this.f22297));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(C3603.m11020(this.f22294, this.f22284, this.f22297));
        if (this.f22321 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f22321 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m19491(-m19489())) {
                m19486(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m19491(m19489())) {
                m19486(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m19490(long j) {
        this.f22308 = j;
        this.f22320 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3488(j);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m19488(long j) {
        if (this.f22308 == j) {
            return;
        }
        this.f22308 = j;
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3489(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m19486(boolean z) {
        removeCallbacks(this.f22290);
        this.f22320 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3487(this.f22308, z);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m19491(long j) {
        long j2 = this.f22321;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f22320 ? this.f22308 : this.f22297;
        long m11016 = C3603.m11016(j3 + j, 0L, j2);
        if (m11016 == j3) {
            return false;
        }
        if (!this.f22320) {
            m19490(m11016);
        } else {
            m19488(m11016);
        }
        m19492();
        return true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19492() {
        Rect rect = this.f22301;
        Rect rect2 = this.f22296;
        rect.set(rect2);
        Rect rect3 = this.f22285;
        rect3.set(rect2);
        long j = this.f22320 ? this.f22308 : this.f22297;
        if (this.f22321 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f22292) / this.f22321)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f22321)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f22315);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m19487() {
        if (this.f22296.width() <= 0 || this.f22321 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f22285.width() * this.f22321) / r0.width();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m19489() {
        long j = this.f22309;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f22321;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.f22299;
    }
}
