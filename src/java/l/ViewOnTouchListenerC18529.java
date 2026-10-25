package l;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: T5PO */
/* renamed from: l.ᩴۙ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC18529 implements InterfaceC20646, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f57407 = new AccelerateDecelerateInterpolator();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f57408;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public RunnableC3712 f57409;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public WeakReference f57411;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f57413;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public GestureDetector f57415;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f57417;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f57420;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0183 f57423;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f57426;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f57427;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f57428;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f57429;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f57424 = 1.0f;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f57422 = 3.0f;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f57410 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Matrix f57425 = new Matrix();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Matrix f57418 = new Matrix();

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Matrix f57412 = new Matrix();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RectF f57419 = new RectF();

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final float[] f57416 = new float[9];

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f57430 = 2;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f57421 = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final float[] f57414 = new float[9];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43065(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
        }
        if (scaleType == null || scaleType == this.f57421) {
            return;
        }
        this.f57421 = scaleType;
        m43074();
    }

    public ViewOnTouchListenerC18529(C9357 c9357) {
        this.f57411 = new WeakReference(c9357);
        c9357.setDrawingCacheEnabled(true);
        c9357.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = c9357.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (c9357.isInEditMode()) {
            return;
        }
        this.f57423 = C19235.m44369(c9357.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(c9357.getContext(), new C8651(this));
        this.f57415 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6534(this));
        this.f57426 = true;
        m43074();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43060() {
        WeakReference weakReference = this.f57411;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            RunnableC3712 runnableC3712 = this.f57409;
            if (runnableC3712 != null) {
                runnableC3712.m11296();
                this.f57409 = null;
            }
        }
        GestureDetector gestureDetector = this.f57415;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f57411 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF m43067() {
        m43055();
        return m43051(m43070());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ImageView m43073() {
        WeakReference weakReference = this.f57411;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m43060();
        }
        return imageView;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m43069() {
        return this.f57424;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m43072() {
        return this.f57422;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ImageView.ScaleType m43066() {
        return this.f57421;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43061(float f, float f2) {
        InterfaceC0183 interfaceC0183 = this.f57423;
        if (interfaceC0183.mo1323()) {
            return;
        }
        ImageView m43073 = m43073();
        boolean z = this.f57410;
        Matrix matrix = this.f57412;
        if (!z) {
            float[] fArr = this.f57414;
            matrix.getValues(fArr);
            float round = Math.round(fArr[2]);
            float round2 = Math.round(fArr[5]);
            matrix.postTranslate(f, f2);
            m43056();
            matrix.getValues(fArr);
            float round3 = Math.round(fArr[2]);
            float round4 = Math.round(fArr[5]);
            if (round != round3 || round2 != round4) {
                this.f57410 = true;
            }
        } else {
            matrix.postTranslate(f, f2);
            m43056();
        }
        ViewParent parent = m43073.getParent();
        if (interfaceC0183.mo1323() || this.f57410) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.f57430;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43068(float f, float f2) {
        ImageView m43073 = m43073();
        RunnableC3712 runnableC3712 = new RunnableC3712(m43073.getContext(), this);
        this.f57409 = runnableC3712;
        runnableC3712.m11297(m43057(m43073), m43050(m43073), (int) f, (int) f2);
        m43073.post(this.f57409);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView m43073 = m43073();
        if (m43073 != null) {
            if (this.f57426) {
                int top = m43073.getTop();
                int right = m43073.getRight();
                int bottom = m43073.getBottom();
                int left = m43073.getLeft();
                if (top == this.f57413 && bottom == this.f57417 && left == this.f57429 && right == this.f57420) {
                    return;
                }
                m43053(m43073.getDrawable());
                this.f57413 = top;
                this.f57420 = right;
                this.f57417 = bottom;
                this.f57429 = left;
                return;
            }
            m43053(m43073.getDrawable());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43062(float f, float f2, float f3) {
        if (m43075() > this.f57424 / 2.0f || f > 1.0f) {
            this.f57427 = f2;
            this.f57428 = f3;
            this.f57412.postScale(f, f, f2, f3);
            m43056();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView;
        boolean z = false;
        if (this.f57426 && (imageView = (ImageView) view) != null && imageView.getDrawable() != null) {
            ViewParent parent = view.getParent();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                RunnableC3712 runnableC3712 = this.f57409;
                if (runnableC3712 != null) {
                    runnableC3712.m11296();
                    this.f57409 = null;
                }
                this.f57410 = false;
            } else if (actionMasked == 1 || actionMasked == 3) {
                float m43075 = m43075();
                float f = this.f57424;
                if (m43075 < f) {
                    view.post(new RunnableC2301(this, m43075, f, this.f57427, this.f57428));
                } else {
                    float f2 = this.f57422;
                    if (m43075 > f2) {
                        view.post(new RunnableC2301(this, m43075, f2, this.f57427, this.f57428));
                    }
                }
                z = true;
            } else if (actionMasked == 5) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f57410 = true;
            }
            InterfaceC0183 interfaceC0183 = this.f57423;
            if (interfaceC0183 != null) {
                interfaceC0183.mo1322(motionEvent);
                z = true;
            }
            GestureDetector gestureDetector = this.f57415;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43071(float f, float f2) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MaxZoom");
        }
        this.f57424 = f;
        this.f57422 = f2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43064(View.OnLongClickListener onLongClickListener) {
        this.f57408 = onLongClickListener;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43063(float f, float f2, float f3, boolean z) {
        ImageView m43073 = m43073();
        if (m43073 == null || f < this.f57424 || f > this.f57422) {
            return;
        }
        if (z) {
            m43073.post(new RunnableC2301(this, m43075(), f, f2, f3));
        } else {
            this.f57412.setScale(f, f, f2, f3);
            m43056();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43074() {
        ImageView m43073 = m43073();
        if (m43073 != null) {
            if (this.f57426) {
                if (!(m43073 instanceof InterfaceC20646)) {
                    ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
                    if (!scaleType.equals(m43073.getScaleType())) {
                        m43073.setScaleType(scaleType);
                    }
                }
                m43053(m43073.getDrawable());
                return;
            }
            Matrix matrix = this.f57412;
            matrix.reset();
            matrix.postRotate(0.0f);
            m43056();
            m43059(m43070());
            m43055();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix m43070() {
        Matrix matrix = this.f57425;
        Matrix matrix2 = this.f57418;
        matrix2.set(matrix);
        matrix2.postConcat(this.f57412);
        return matrix2;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m43056() {
        if (m43055()) {
            m43059(m43070());
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m43055() {
        RectF m43051;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ImageView m43073 = m43073();
        if (m43073 == null || (m43051 = m43051(m43070())) == null) {
            return false;
        }
        float height = m43051.height();
        float width = m43051.width();
        float m43050 = m43050(m43073);
        float f7 = 0.0f;
        if (height <= m43050) {
            int i = C15705.f48457[this.f57421.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m43050 -= height;
                    f2 = m43051.top;
                } else {
                    m43050 = (m43050 - height) / 2.0f;
                    f2 = m43051.top;
                }
                f3 = m43050 - f2;
            } else {
                f = m43051.top;
                f3 = -f;
            }
        } else {
            f = m43051.top;
            if (f <= 0.0f) {
                f2 = m43051.bottom;
                if (f2 >= m43050) {
                    f3 = 0.0f;
                }
                f3 = m43050 - f2;
            }
            f3 = -f;
        }
        float m43057 = m43057(m43073);
        if (width <= m43057) {
            int i2 = C15705.f48457[this.f57421.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f5 = m43057 - width;
                    f6 = m43051.left;
                } else {
                    f5 = (m43057 - width) / 2.0f;
                    f6 = m43051.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -m43051.left;
            }
            f7 = f4;
            this.f57430 = 2;
        } else {
            float f8 = m43051.left;
            if (f8 > 0.0f) {
                this.f57430 = 0;
                f7 = -f8;
            } else {
                float f9 = m43051.right;
                if (f9 < m43057) {
                    f7 = m43057 - f9;
                    this.f57430 = 1;
                } else {
                    this.f57430 = -1;
                }
            }
        }
        this.f57412.postTranslate(f7, f3);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private RectF m43051(Matrix matrix) {
        Drawable drawable;
        ImageView m43073 = m43073();
        if (m43073 == null || (drawable = m43073.getDrawable()) == null) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f57419;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m43075() {
        Matrix matrix = this.f57412;
        float[] fArr = this.f57416;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m43059(Matrix matrix) {
        ImageView m43073 = m43073();
        if (m43073 != null) {
            ImageView m430732 = m43073();
            if (m430732 != null && !(m430732 instanceof InterfaceC20646) && !ImageView.ScaleType.MATRIX.equals(m430732.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
            }
            m43073.setImageMatrix(matrix);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43053(Drawable drawable) {
        ImageView m43073 = m43073();
        if (m43073 == null || drawable == null) {
            return;
        }
        float m43057 = m43057(m43073);
        float m43050 = m43050(m43073);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f57425;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = m43057 / f;
        float f3 = intrinsicHeight;
        float f4 = m43050 / f3;
        ImageView.ScaleType scaleType = this.f57421;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((m43057 - f) / 2.0f, (m43050 - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            matrix.postScale(max, max);
            matrix.postTranslate((m43057 - (f * max)) / 2.0f, (m43050 - (f3 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(min, min);
            matrix.postTranslate((m43057 - (f * min)) / 2.0f, (m43050 - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, m43057, m43050);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C15705.f48457[this.f57421.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f57412;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        m43056();
        m43059(m43070());
        m43055();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43057(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m43050(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
