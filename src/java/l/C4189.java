package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: Y169 */
/* renamed from: l.ۘ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4189 extends AbstractC9128 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f13641;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f13642;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f13643;

    public C4189(C19712 c19712, Drawable drawable, int i) {
        super(c19712);
        this.f13642 = true;
        this.f13641 = drawable;
        this.f13643 = i;
        mo12638();
    }

    @Override // l.AbstractC9128
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12634(Canvas canvas, Rect rect, float f, float f2) {
        EnumC19006 enumC19006;
        EnumC19006 enumC190062;
        Drawable drawable = this.f13641;
        drawable.setAlpha((int) ((this.f13642 ? 153 : 51) * f2));
        drawable.setBounds(rect);
        float f3 = this.f13643;
        if (f3 != 0.0f) {
            C19712 c19712 = this.f27649;
            enumC19006 = c19712.f63679;
            if (enumC19006 == EnumC19006.STATE_1_2) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = (float) Math.sin(f * 1.5707964f);
            } else {
                enumC190062 = c19712.f63679;
                if (enumC190062 == EnumC19006.STATE_2_1) {
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else if (f > 1.0f) {
                        f = 1.0f;
                    }
                    f = 1.0f - ((float) Math.cos(f * 1.5707964f));
                }
            }
            f3 *= f;
        }
        float f4 = (rect.left + rect.right) / 2.0f;
        float f5 = (rect.top + rect.bottom) / 2.0f;
        canvas.rotate(f3, f4, f5);
        drawable.draw(canvas);
        canvas.rotate(-f3, f4, f5);
    }

    @Override // l.AbstractC9128
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo12637() {
        return this.f13642;
    }

    @Override // l.AbstractC9128
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo12639() {
        return this.f13642;
    }

    @Override // l.AbstractC9128
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo12638() {
        ColorFilter colorFilter;
        colorFilter = this.f27649.f63680;
        this.f13641.setColorFilter(colorFilter);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12635(boolean z) {
        this.f13642 = z;
        this.f27649.invalidate();
    }

    @Override // l.AbstractC9128
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo12636() {
        return this.f13641.getIntrinsicWidth();
    }

    @Override // l.AbstractC9128
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo12633() {
        return this.f13641.getIntrinsicHeight();
    }
}
