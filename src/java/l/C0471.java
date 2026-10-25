package l;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;

/* compiled from: X54K */
/* renamed from: l.֡ܳۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0471 extends ColorDrawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2043;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f2044;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2045;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f2046;

    public C0471(int i) {
        super(i);
        this.f2044 = new AccelerateInterpolator();
        this.f2045 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2074(int i) {
        this.f2043 = i;
        this.f2046 = System.currentTimeMillis();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        if (!this.f2045) {
            this.f2045 = true;
            setAlpha(255);
        }
        super.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f2045) {
            super.draw(canvas);
            return;
        }
        if (this.f2046 != 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f2046);
            int i = this.f2043;
            z = false;
            if (currentTimeMillis < i) {
                setAlpha((int) ((1.0f - this.f2044.getInterpolation(currentTimeMillis / i)) * 255.0f));
            } else {
                setAlpha(0);
            }
        } else {
            this.f2046 = 0L;
            z = true;
        }
        super.draw(canvas);
        if (z) {
            return;
        }
        invalidateSelf();
    }
}
