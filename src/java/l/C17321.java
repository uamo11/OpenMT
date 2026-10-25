package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: E8ZU */
/* renamed from: l.ܿۨۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17321 extends Drawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f53038;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f53039;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f53040 = false;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f53041;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53042;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14498 f53043;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f53044;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f53045;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22260 f53046;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f53047;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Drawable f53048;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C17321(String str, AbstractC14498 abstractC14498, AbstractC2821 abstractC2821, C22260 c22260) {
        this.f53044 = str;
        this.f53043 = abstractC14498;
        this.f53045 = abstractC2821;
        this.f53046 = c22260;
        abstractC14498.getClass();
        this.f53048 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40639() {
        return this.f53044;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40643() {
        return this.f53039 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40641(Drawable.Callback callback) {
        this.f53038 = callback == null ? null : new C18027(this, callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f53038;
        AbstractC14498 abstractC14498 = this.f53043;
        if (callback2 != null) {
            Drawable drawable = this.f53039;
            if (drawable != null && drawable.getCallback() == null) {
                this.f53039.setCallback(this.f53038);
            }
            Drawable drawable2 = this.f53039;
            boolean z = drawable2 == null || drawable2 == this.f53048;
            if (drawable2 != null) {
                drawable2.setCallback(this.f53038);
                Object obj = this.f53039;
                if ((obj instanceof Animatable) && this.f53040) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                abstractC14498.mo22881(this);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f53039;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            Object obj2 = this.f53039;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean isRunning = animatable.isRunning();
                this.f53040 = isRunning;
                if (isRunning) {
                    animatable.stop();
                }
            }
        }
        abstractC14498.mo22880(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40642(Drawable drawable) {
        this.f53040 = false;
        Drawable drawable2 = this.f53039;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f53039 = drawable;
        m40638();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3.isEmpty() == false) goto L13;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40638() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17321.m40638():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40640(float f, int i) {
        this.f53042 = i;
        this.f53047 = f;
        if (this.f53041) {
            m40638();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m40643()) {
            this.f53039.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m40643()) {
            return this.f53039.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m40643()) {
            return this.f53039.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m40643()) {
            return this.f53039.getIntrinsicHeight();
        }
        return 1;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f53044 + "', imageSize=" + this.f53046 + ", result=" + this.f53039 + ", canvasWidth=" + this.f53042 + ", textSize=" + this.f53047 + ", waitingForDimensions=" + this.f53041 + '}';
    }
}
