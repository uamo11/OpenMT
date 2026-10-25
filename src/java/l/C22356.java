package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* compiled from: V1C0 */
/* renamed from: l.᩹ܶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22356 extends C10884 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f72425;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable[] f72426;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f72427;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f72428;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f72429;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RectF f72430;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Path f72431;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayerDrawable f72432;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f72433;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3306 f72434;

    public C22356(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72434 = new C3306();
        this.f72433 = 0.0f;
        this.f72427 = 0.0f;
        this.f72428 = Float.NaN;
        this.f72425 = true;
        m50094(attributeSet);
    }

    public C22356(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72434 = new C3306();
        this.f72433 = 0.0f;
        this.f72427 = 0.0f;
        this.f72428 = Float.NaN;
        this.f72425 = true;
        m50094(attributeSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50094(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69981);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f72433 = obtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C3306 c3306 = this.f72434;
                    if (index == 8) {
                        c3306.f10359 = obtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 7) {
                        c3306.f10357 = obtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 2) {
                        c3306.f10358 = obtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 5) {
                        float dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f72428 = dimension;
                            float f = this.f72427;
                            this.f72427 = -1.0f;
                            m50096(f);
                        } else {
                            boolean z = this.f72428 != dimension;
                            this.f72428 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f72431 == null) {
                                    this.f72431 = new Path();
                                }
                                if (this.f72430 == null) {
                                    this.f72430 = new RectF();
                                }
                                if (this.f72429 == null) {
                                    C21651 c21651 = new C21651(this);
                                    this.f72429 = c21651;
                                    setOutlineProvider(c21651);
                                }
                                setClipToOutline(true);
                                this.f72430.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f72431.reset();
                                Path path = this.f72431;
                                RectF rectF = this.f72430;
                                float f2 = this.f72428;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m50096(obtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f72425 = obtainStyledAttributes.getBoolean(index, this.f72425);
                    }
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f72426 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f72426[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f72426);
                this.f72432 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f72433 * 255.0f));
                super.setImageDrawable(this.f72432);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50096(float f) {
        boolean z = this.f72427 != f;
        this.f72427 = f;
        if (f != 0.0f) {
            if (this.f72431 == null) {
                this.f72431 = new Path();
            }
            if (this.f72430 == null) {
                this.f72430 = new RectF();
            }
            if (this.f72429 == null) {
                C15299 c15299 = new C15299(this);
                this.f72429 = c15299;
                setOutlineProvider(c15299);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f72427) / 2.0f;
            this.f72430.set(0.0f, 0.0f, width, height);
            this.f72431.reset();
            this.f72431.addRoundRect(this.f72430, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
