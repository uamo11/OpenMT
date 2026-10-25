package l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: UBKO */
/* renamed from: l.ܶ᩹ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15518 extends Drawable implements InterfaceC13122 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47426 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f47427 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float[] f47428;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f47429;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f47430;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8464 f47431;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Matrix f47432;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f47433;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ColorFilter f47434;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f47435;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C15518() {
        this.f47428 = new float[9];
        this.f47432 = new Matrix();
        this.f47429 = new Rect();
        C8464 c8464 = new C8464();
        c8464.f25883 = null;
        c8464.f25882 = f47427;
        c8464.f25886 = new C1408();
        this.f47431 = c8464;
    }

    public C15518(C8464 c8464) {
        this.f47428 = new float[9];
        this.f47432 = new Matrix();
        this.f47429 = new Rect();
        this.f47431 = c8464;
        this.f47433 = m36588(c8464.f25883, c8464.f25882);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f47435 && super.mutate() == this) {
            C8464 c8464 = this.f47431;
            C8464 c84642 = new C8464();
            c84642.f25883 = null;
            c84642.f25882 = f47427;
            if (c8464 != null) {
                c84642.f25881 = c8464.f25881;
                C1408 c1408 = new C1408(c8464.f25886);
                c84642.f25886 = c1408;
                if (c8464.f25886.f5069 != null) {
                    c1408.f5069 = new Paint(c8464.f25886.f5069);
                }
                if (c8464.f25886.f5068 != null) {
                    c84642.f25886.f5068 = new Paint(c8464.f25886.f5068);
                }
                c84642.f25883 = c8464.f25883;
                c84642.f25882 = c8464.f25882;
                c84642.f25880 = c8464.f25880;
            }
            this.f47431 = c84642;
            this.f47435 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f47431.f25881 = getChangingConfigurations();
        return this.f47431;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Rect rect = this.f47429;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f47434;
        if (colorFilter == null) {
            colorFilter = this.f47433;
        }
        Matrix matrix = this.f47432;
        canvas.getMatrix(matrix);
        float[] fArr = this.f47428;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (this.f47431.f25880 && C8184.m21687(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C8464 c8464 = this.f47431;
        Bitmap bitmap = c8464.f25889;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c8464.f25889.getHeight()) {
            c8464.f25889 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c8464.f25884 = true;
        }
        C8464 c84642 = this.f47431;
        if (c84642.f25884 || c84642.f25885 != c84642.f25883 || c84642.f25891 != c84642.f25882 || c84642.f25887 != c84642.f25880 || c84642.f25888 != c84642.f25886.f5073) {
            c84642.f25889.eraseColor(0);
            c84642.f25886.m4899(new Canvas(c84642.f25889), min, min2);
            C8464 c84643 = this.f47431;
            c84643.f25885 = c84643.f25883;
            c84643.f25891 = c84643.f25882;
            c84643.f25888 = c84643.f25886.f5073;
            c84643.f25887 = c84643.f25880;
            c84643.f25884 = false;
        }
        C8464 c84644 = this.f47431;
        if (c84644.f25886.f5073 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c84644.f25890 == null) {
                Paint paint2 = new Paint();
                c84644.f25890 = paint2;
                paint2.setFilterBitmap(true);
            }
            c84644.f25890.setAlpha(c84644.f25886.f5073);
            c84644.f25890.setColorFilter(colorFilter);
            paint = c84644.f25890;
        }
        canvas.drawBitmap(c84644.f25889, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f47431.f25886.f5073;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C1408 c1408 = this.f47431.f25886;
        if (c1408.f5073 != i) {
            c1408.f5073 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47434 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f47434;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m36588(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C8464 c8464 = this.f47431;
        if (c8464.f25883 != colorStateList) {
            c8464.f25883 = colorStateList;
            this.f47433 = m36588(colorStateList, c8464.f25882);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C8464 c8464 = this.f47431;
        if (c8464.f25882 != mode) {
            c8464.f25882 = mode;
            this.f47433 = m36588(c8464.f25883, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        C8464 c8464 = this.f47431;
        if (c8464 == null) {
            return false;
        }
        C1408 c1408 = c8464.f25886;
        if (c1408.f5070 == null) {
            c1408.f5070 = Boolean.valueOf(c1408.f5065.mo2788());
        }
        if (c1408.f5070.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f47431.f25883;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        C8464 c8464 = this.f47431;
        ColorStateList colorStateList = c8464.f25883;
        if (colorStateList == null || (mode = c8464.f25882) == null) {
            z = false;
        } else {
            this.f47433 = m36588(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C1408 c1408 = c8464.f25886;
        if (c1408.f5070 == null) {
            c1408.f5070 = Boolean.valueOf(c1408.f5065.mo2788());
        }
        if (c1408.f5070.booleanValue()) {
            boolean mo2789 = c8464.f25886.f5065.mo2789(iArr);
            c8464.f25884 |= mo2789;
            if (mo2789) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f47431.f25886.f5066;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f47431.f25886.f5060;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f47431.f25880;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f47431.f25880 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C15518 m36587(l.XmlResourceParserC10269 r17, l.C12534 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15518.m36587(l.ۤۨۡ, l.۫ܽܽ, boolean):l.ܶ᩹ۡ");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f47431.f25881;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36589() {
        if (!this.f47430) {
            throw new IllegalStateException("Need set savePathData to true");
        }
        return C19691.m45283(this);
    }
}
