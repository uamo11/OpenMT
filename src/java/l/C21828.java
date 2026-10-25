package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: E5ZZ */
/* renamed from: l.᩸᩷ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C21828 extends C17939 {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType f69922 = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final Bitmap.Config f69923 = Bitmap.Config.ARGB_8888;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69924 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f69925;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final RectF f69926;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f69927;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RectF f69928;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Matrix f69929;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f69930;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f69931;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69932;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69933;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ColorFilter f69934;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69935;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f69936;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f69937;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f69938;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Canvas f69939;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f69940;

    public C21828(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21828(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69928 = new RectF();
        this.f69926 = new RectF();
        this.f69929 = new Matrix();
        Paint paint = new Paint();
        this.f69937 = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f69932 = 255;
        this.f69931 = false;
        this.f69936 = 0.0f;
        this.f69940 = true;
        super.setScaleType(f69922);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.f69932);
        paint.setColorFilter(this.f69934);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(0);
        setOutlineProvider(new C15476(this));
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f69922) {
            return;
        }
        throw new IllegalArgumentException("ScaleType " + scaleType + " not supported.");
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        C0679 c0679 = drawable instanceof C0679 ? (C0679) drawable : null;
        float f = this.f69936;
        if (this.f69931) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f69925;
            if (uptimeMillis >= j) {
                f += c0679 == null ? 0.5f : 1.25f;
                if (f >= 360.0f) {
                    f -= 360.0f;
                }
                this.f69936 = f;
                this.f69925 = uptimeMillis + 15;
                postInvalidateDelayed(15L);
            } else {
                postInvalidateDelayed(j - uptimeMillis);
            }
        }
        float f2 = f;
        if (c0679 != null) {
            c0679.m2756(canvas, getWidth(), getHeight(), f2, true, C21943.m49431());
            return;
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (this.f69938 != null) {
            if (this.f69933 && this.f69939 != null) {
                this.f69933 = false;
                Drawable drawable2 = getDrawable();
                drawable2.setBounds(0, 0, this.f69939.getWidth(), this.f69939.getHeight());
                drawable2.draw(this.f69939);
            }
            boolean z = this.f69935;
            Paint paint = this.f69937;
            if (z) {
                this.f69935 = false;
                Bitmap bitmap = this.f69938;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f69929);
                paint.setShader(bitmapShader);
            }
            RectF rectF = this.f69928;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f69930, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f69933 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m49195();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.f69932) {
            return;
        }
        this.f69932 = i2;
        if (this.f69940) {
            this.f69937.setAlpha(i2);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final int getImageAlpha() {
        return this.f69932;
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f69934) {
            return;
        }
        this.f69934 = colorFilter;
        if (this.f69940) {
            this.f69937.setColorFilter(colorFilter);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final ColorFilter getColorFilter() {
        return this.f69934;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m49195() {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.getDrawable()
            r1 = 0
            if (r0 != 0) goto L8
            goto L41
        L8:
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L13
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            goto L42
        L13:
            boolean r2 = r0 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap$Config r3 = l.C21828.f69923
            if (r2 == 0) goto L1f
            r2 = 2
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r2, r3)     // Catch: java.lang.Exception -> L41
            goto L2b
        L1f:
            int r2 = r0.getIntrinsicWidth()     // Catch: java.lang.Exception -> L41
            int r4 = r0.getIntrinsicHeight()     // Catch: java.lang.Exception -> L41
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r3)     // Catch: java.lang.Exception -> L41
        L2b:
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L41
            r3.<init>(r2)     // Catch: java.lang.Exception -> L41
            int r4 = r3.getWidth()     // Catch: java.lang.Exception -> L41
            int r5 = r3.getHeight()     // Catch: java.lang.Exception -> L41
            r6 = 0
            r0.setBounds(r6, r6, r4, r5)     // Catch: java.lang.Exception -> L41
            r0.draw(r3)     // Catch: java.lang.Exception -> L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            r7.f69938 = r0
            if (r0 == 0) goto L56
            boolean r0 = r0.isMutable()
            if (r0 == 0) goto L56
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r7.f69938
            r0.<init>(r2)
            r7.f69939 = r0
            goto L58
        L56:
            r7.f69939 = r1
        L58:
            boolean r0 = r7.f69940
            if (r0 != 0) goto L5d
            goto L6a
        L5d:
            android.graphics.Bitmap r0 = r7.f69938
            if (r0 == 0) goto L65
            r7.m49193()
            goto L6a
        L65:
            android.graphics.Paint r0 = r7.f69937
            r0.setShader(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21828.m49195():void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49194() {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = ((r0 - min) / 2.0f) + getPaddingLeft();
        float paddingTop = ((r1 - min) / 2.0f) + getPaddingTop();
        float f = min;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.f69926;
        rectF2.set(rectF);
        float f2 = 0;
        this.f69927 = Math.min((rectF2.height() - f2) / 2.0f, (rectF2.width() - f2) / 2.0f);
        RectF rectF3 = this.f69928;
        rectF3.set(rectF2);
        this.f69930 = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        m49193();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49193() {
        float width;
        float height;
        if (this.f69938 == null) {
            return;
        }
        Matrix matrix = this.f69929;
        matrix.set(null);
        int height2 = this.f69938.getHeight();
        float width2 = this.f69938.getWidth();
        RectF rectF = this.f69928;
        float f = height2;
        float f2 = 0.0f;
        if (rectF.height() * width2 > rectF.width() * f) {
            width = rectF.height() / f;
            f2 = (rectF.width() - (width2 * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = rectF.width() / width2;
            height = (rectF.height() - (f * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate(((int) (f2 + 0.5f)) + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.f69935 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.f69926.isEmpty()) {
            if (Math.pow(y - r2.centerY(), 2.0d) + Math.pow(x - r2.centerX(), 2.0d) > Math.pow(this.f69927, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49197() {
        this.f69936 = 0.0f;
        this.f69925 = SystemClock.uptimeMillis() + 200;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49196(boolean z) {
        this.f69931 = z;
        if (z) {
            invalidate();
        }
    }
}
