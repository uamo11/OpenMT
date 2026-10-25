package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: G5V7 */
/* renamed from: l.᩹᩺ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22597 extends AbstractC4253 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f73034 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f73035;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73036;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15540 f73037;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f73038;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f73039;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Rect f73040;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ColorFilter f73041;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73042;

    public C22597() {
        this.f73042 = true;
        this.f73039 = new float[9];
        this.f73038 = new Matrix();
        this.f73040 = new Rect();
        C15540 c15540 = new C15540();
        c15540.f47891 = null;
        c15540.f47890 = f73034;
        c15540.f47894 = new C8486();
        this.f73037 = c15540;
    }

    public C22597(C15540 c15540) {
        this.f73042 = true;
        this.f73039 = new float[9];
        this.f73038 = new Matrix();
        this.f73040 = new Rect();
        this.f73037 = c15540;
        this.f73035 = m50573(c15540.f47891, c15540.f47890);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m50573(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f73036 && super.mutate() == this) {
            C15540 c15540 = this.f73037;
            C15540 c155402 = new C15540();
            c155402.f47891 = null;
            c155402.f47890 = f73034;
            if (c15540 != null) {
                c155402.f47889 = c15540.f47889;
                C8486 c8486 = new C8486(c15540.f47894);
                c155402.f47894 = c8486;
                if (c15540.f47894.f25938 != null) {
                    c8486.f25938 = new Paint(c15540.f47894.f25938);
                }
                if (c15540.f47894.f25937 != null) {
                    c155402.f47894.f25937 = new Paint(c15540.f47894.f25937);
                }
                c155402.f47891 = c15540.f47891;
                c155402.f47890 = c15540.f47890;
                c155402.f47888 = c15540.f47888;
            }
            this.f73037 = c155402;
            this.f73036 = true;
        }
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50574(String str) {
        return this.f73037.f47894.f25930.getOrDefault(str, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13777 != null && Build.VERSION.SDK_INT >= 24) {
            return new C21892(this.f13777.getConstantState());
        }
        this.f73037.f47889 = getChangingConfigurations();
        return this.f73037;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f73040;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f73041;
        if (colorFilter == null) {
            colorFilter = this.f73035;
        }
        Matrix matrix = this.f73038;
        canvas.getMatrix(matrix);
        float[] fArr = this.f73039;
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
        if (isAutoMirrored() && C8184.m21687(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C15540 c15540 = this.f73037;
        Bitmap bitmap = c15540.f47897;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c15540.f47897.getHeight()) {
            c15540.f47897 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c15540.f47892 = true;
        }
        if (!this.f73042) {
            C15540 c155402 = this.f73037;
            c155402.f47897.eraseColor(0);
            c155402.f47894.m22162(new Canvas(c155402.f47897), min, min2);
        } else {
            C15540 c155403 = this.f73037;
            if (c155403.f47892 || c155403.f47893 != c155403.f47891 || c155403.f47899 != c155403.f47890 || c155403.f47895 != c155403.f47888 || c155403.f47896 != c155403.f47894.getRootAlpha()) {
                C15540 c155404 = this.f73037;
                c155404.f47897.eraseColor(0);
                c155404.f47894.m22162(new Canvas(c155404.f47897), min, min2);
                C15540 c155405 = this.f73037;
                c155405.f47893 = c155405.f47891;
                c155405.f47899 = c155405.f47890;
                c155405.f47896 = c155405.f47894.getRootAlpha();
                c155405.f47895 = c155405.f47888;
                c155405.f47892 = false;
            }
        }
        C15540 c155406 = this.f73037;
        if (c155406.f47894.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c155406.f47898 == null) {
                Paint paint2 = new Paint();
                c155406.f47898 = paint2;
                paint2.setFilterBitmap(true);
            }
            c155406.f47898.setAlpha(c155406.f47894.getRootAlpha());
            c155406.f47898.setColorFilter(colorFilter);
            paint = c155406.f47898;
        }
        canvas.drawBitmap(c155406.f47897, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f73037.f47894.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f73037.f47894.getRootAlpha() != i) {
            this.f73037.f47894.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f73041 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21685(drawable);
        }
        return this.f73041;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21683(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21676(drawable, colorStateList);
            return;
        }
        C15540 c15540 = this.f73037;
        if (c15540.f47891 != colorStateList) {
            c15540.f47891 = colorStateList;
            this.f73035 = m50573(colorStateList, c15540.f47890);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21679(drawable, mode);
            return;
        }
        C15540 c15540 = this.f73037;
        if (c15540.f47890 != mode) {
            c15540.f47890 = mode;
            this.f73035 = m50573(c15540.f47891, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C15540 c15540 = this.f73037;
        if (c15540 == null) {
            return false;
        }
        C8486 c8486 = c15540.f47894;
        if (c8486.f25939 == null) {
            c8486.f25939 = Boolean.valueOf(c8486.f25934.mo2834());
        }
        if (c8486.f25939.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f73037.f47891;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C15540 c15540 = this.f73037;
        ColorStateList colorStateList = c15540.f47891;
        if (colorStateList == null || (mode = c15540.f47890) == null) {
            z = false;
        } else {
            this.f73035 = m50573(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C8486 c8486 = c15540.f47894;
        if (c8486.f25939 == null) {
            c8486.f25939 = Boolean.valueOf(c8486.f25934.mo2834());
        }
        if (c8486.f25939.booleanValue()) {
            boolean mo2835 = c15540.f47894.f25934.mo2835(iArr);
            c15540.f47892 |= mo2835;
            if (mo2835) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f73037.f47894.f25935;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f73037.f47894.f25929;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13777;
        if (drawable == null) {
            return false;
        }
        C8184.m21680(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f73037.f47888;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f73037.f47888 = z;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22597 m50571(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C22597 c22597 = new C22597();
            c22597.f13777 = C4369.m13097(resources, i, theme);
            new C21892(c22597.f13777.getConstantState());
            return c22597;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m50572(resources, xml, asAttributeSet, theme);
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22597 m50572(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        C22597 c22597 = new C22597();
        c22597.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c22597;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22597.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50575() {
        this.f73042 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f73037.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
