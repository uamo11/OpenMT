package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: I9N6 */
/* renamed from: l.᩵᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C19786 extends Drawable implements Drawable.Callback {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63891 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Drawable f63892;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63894;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f63895;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f63896;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f63897;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC19080 f63898;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f63899;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4263 f63900;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f63902;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Drawable f63903;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63901 = 255;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63893 = -1;

    /* renamed from: ֫ */
    public AbstractC19080 mo38227() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f63903;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f63898.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        Rect m43977 = this.f63898.m43977();
        if (m43977 != null) {
            rect.set(m43977);
            padding = (m43977.right | ((m43977.left | m43977.top) | m43977.bottom)) != 0;
        } else {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f63898.f60090 && C8184.m21687(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f63894 && this.f63901 == i) {
            return;
        }
        this.f63894 = true;
        this.f63901 = i;
        Drawable drawable = this.f63892;
        if (drawable != null) {
            if (this.f63897 == 0) {
                drawable.setAlpha(i);
            } else {
                m45479(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f63901;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080.f60095 != z) {
            abstractC19080.f60095 = z;
            Drawable drawable = this.f63892;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60118 = true;
        if (abstractC19080.f60100 != colorFilter) {
            abstractC19080.f60100 = colorFilter;
            Drawable drawable = this.f63892;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60115 = true;
        if (abstractC19080.f60103 != colorStateList) {
            abstractC19080.f60103 = colorStateList;
            C8184.m21676(this.f63892, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60094 = true;
        if (abstractC19080.f60119 != mode) {
            abstractC19080.f60119 = mode;
            C8184.m21679(this.f63892, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f63903;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080.f60090 != z) {
            abstractC19080.f60090 = z;
            Drawable drawable = this.f63892;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f63898.f60090;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f63903;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f63903 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f63894) {
                this.f63892.setAlpha(this.f63901);
            }
        }
        if (this.f63895 != 0) {
            this.f63895 = 0L;
            z = true;
        }
        if (this.f63897 != 0) {
            this.f63897 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            C8184.m21674(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f63896;
        if (rect == null) {
            this.f63896 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f63892;
        if (drawable != null) {
            C8184.m21675(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f63896;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f63903;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC19080 abstractC19080 = this.f63898;
        int i2 = this.f63893;
        int i3 = abstractC19080.f60105;
        Drawable[] drawableArr = abstractC19080.f60098;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean m21681 = Build.VERSION.SDK_INT >= 23 ? C8184.m21681(drawable, i) : false;
                if (i4 == i2) {
                    z = m21681;
                }
            }
        }
        abstractC19080.f60092 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60114;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60099;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60091;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60109;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080 != null) {
            abstractC19080.f60107 = false;
            abstractC19080.f60097 = false;
        }
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f63903;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f63892;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f63898.m43978();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45481() {
        return this.f63893;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m45480(int r10) {
        /*
            r9 = this;
            int r0 = r9.f63893
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            l.ᩴ᩻ r0 = r9.f63898
            int r0 = r0.f60117
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f63903
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f63892
            if (r0 == 0) goto L29
            r9.f63903 = r0
            l.ᩴ᩻ r0 = r9.f63898
            int r0 = r0.f60117
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f63895 = r0
            goto L35
        L29:
            r9.f63903 = r4
            r9.f63895 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f63892
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            l.ᩴ᩻ r0 = r9.f63898
            int r1 = r0.f60105
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m43973(r10)
            r9.f63892 = r0
            r9.f63893 = r10
            if (r0 == 0) goto L5a
            l.ᩴ᩻ r10 = r9.f63898
            int r10 = r10.f60108
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f63897 = r2
        L51:
            r9.m45477(r0)
            goto L5a
        L55:
            r9.f63892 = r4
            r10 = -1
            r9.f63893 = r10
        L5a:
            long r0 = r9.f63897
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f63895
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7c
        L67:
            java.lang.Runnable r0 = r9.f63902
            if (r0 != 0) goto L76
            l.ۖ᩻ r0 = new l.ۖ᩻
            r1 = r9
            l.۠᩻ r1 = (l.C8496) r1
            r0.<init>(r1)
            r9.f63902 = r0
            goto L79
        L76:
            r9.unscheduleSelf(r0)
        L79:
            r9.m45479(r10)
        L7c:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19786.m45480(int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45477(Drawable drawable) {
        if (this.f63900 == null) {
            this.f63900 = new C4263();
        }
        C4263 c4263 = this.f63900;
        c4263.m12829(drawable.getCallback());
        drawable.setCallback(c4263);
        try {
            if (this.f63898.f60108 <= 0 && this.f63894) {
                drawable.setAlpha(this.f63901);
            }
            AbstractC19080 abstractC19080 = this.f63898;
            if (abstractC19080.f60118) {
                drawable.setColorFilter(abstractC19080.f60100);
            } else {
                if (abstractC19080.f60115) {
                    C8184.m21676(drawable, abstractC19080.f60103);
                }
                AbstractC19080 abstractC190802 = this.f63898;
                if (abstractC190802.f60094) {
                    C8184.m21679(drawable, abstractC190802.f60119);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f63898.f60095);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C8184.m21681(drawable, C8184.m21687(this));
            }
            drawable.setAutoMirrored(this.f63898.f60090);
            Rect rect = this.f63896;
            if (rect != null) {
                C8184.m21675(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f63900.m12828());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m45479(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f63894 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f63892
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f63897
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f63901
            r3.setAlpha(r9)
            r13.f63897 = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            l.ᩴ᩻ r9 = r13.f63898
            int r9 = r9.f60108
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f63901
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f63897 = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f63903
            if (r9 == 0) goto L65
            long r10 = r13.f63895
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f63903 = r0
            r13.f63895 = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            l.ᩴ᩻ r4 = r13.f63898
            int r4 = r4.f60117
            int r3 = r3 / r4
            int r4 = r13.f63901
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f63895 = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f63902
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19786.m45479(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f63892;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45478(Resources resources) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (resources == null) {
            abstractC19080.getClass();
            return;
        }
        abstractC19080.f60096 = resources;
        int i = resources.getDisplayMetrics().densityDpi;
        if (i == 0) {
            i = DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        int i2 = abstractC19080.f60088;
        abstractC19080.f60088 = i;
        if (i2 != i) {
            abstractC19080.f60112 = false;
            abstractC19080.f60120 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f63898.m43974(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f63898.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f63898.m43975()) {
            return null;
        }
        this.f63898.f60110 = getChangingConfigurations();
        return this.f63898;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f63899 && super.mutate() == this) {
            AbstractC19080 mo38227 = mo38227();
            mo38227.mo4949();
            mo22191(mo38227);
            this.f63899 = true;
        }
        return this;
    }

    /* renamed from: ֫ */
    public void mo22191(AbstractC19080 abstractC19080) {
        this.f63898 = abstractC19080;
        int i = this.f63893;
        if (i >= 0) {
            Drawable m43973 = abstractC19080.m43973(i);
            this.f63892 = m43973;
            if (m43973 != null) {
                m45477(m43973);
            }
        }
        this.f63903 = null;
    }
}
