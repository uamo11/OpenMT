package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* compiled from: N8FX */
/* renamed from: l.ۚ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5619 extends Drawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21294 f17386;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f17387 = C4925.m14305(R.drawable.MT_Protector_res_0x7f08027b);

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C5619(AbstractC21294 abstractC21294) {
        this.f17386 = abstractC21294;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m15923() {
        return new C5619(C19883.f64200);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m15924() {
        return new C5619(C19883.f64218);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC21294 abstractC21294 = this.f17386;
        canvas.drawColor(abstractC21294.mo7429());
        Rect dirtyBounds = getDirtyBounds();
        int width = (dirtyBounds.width() * 3) / 10;
        int height = (dirtyBounds.height() * 3) / 10;
        int i = dirtyBounds.left + width;
        int i2 = dirtyBounds.top + height;
        int i3 = dirtyBounds.right - width;
        int i4 = dirtyBounds.bottom - height;
        Drawable drawable = this.f17387;
        drawable.setBounds(i, i2, i3, i4);
        drawable.setTint(abstractC21294.mo7430());
        drawable.draw(canvas);
    }
}
