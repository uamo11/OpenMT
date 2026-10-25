package l;

import android.animation.Animator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import bin.mt.plus.R;

/* compiled from: 34K8 */
/* renamed from: l.ۤܺۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10392 extends AbstractC3336 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C12508 f31247;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12508 f31248;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f31249;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f31250;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31251;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31252;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final RectF f31244 = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final RectF f31242 = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final RectF f31246 = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final C12508 f31243 = new C12508(-522.6f);

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final C12508 f31245 = new C12508(-197.6f);

    public C10392(AbstractActivityC3346 abstractActivityC3346) {
        this.f10538 = true;
        TypedArray obtainStyledAttributes = abstractActivityC3346.obtainStyledAttributes(new int[]{R.attr.MT_Protector_res_0x7f0400fc});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            setTint(color);
            this.f31249 = true;
            C12508 c12508 = new C12508(f31243);
            this.f31248 = c12508;
            C12508 c125082 = new C12508(f31245);
            this.f31247 = c125082;
            float f = abstractActivityC3346.getResources().getDisplayMetrics().density;
            this.f31251 = Math.round(4.0f * f);
            this.f31252 = Math.round(f * 16.0f);
            obtainStyledAttributes = abstractActivityC3346.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            try {
                float f2 = obtainStyledAttributes.getFloat(0, 0.0f);
                obtainStyledAttributes.recycle();
                this.f31250 = f2;
                this.f10539 = new Animator[]{C22386.m50254(c12508), C22386.m50255(c125082)};
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26205(boolean z) {
        if (this.f10538 != z) {
            this.f10538 = z;
            invalidateSelf();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26203() {
        if (this.f31249) {
            this.f31249 = false;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f10538 ? this.f31252 : this.f31251;
    }

    @Override // l.AbstractC13213
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26204(Canvas canvas, Paint paint, int i, int i2) {
        boolean z = this.f10538;
        RectF rectF = f31244;
        if (z) {
            RectF rectF2 = f31242;
            canvas.scale(i / rectF2.width(), i2 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        } else {
            canvas.scale(i / rectF.width(), i2 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.f31249) {
            paint.setAlpha(Math.round(this.f15057 * this.f31250));
            canvas.drawRect(rectF, paint);
            paint.setAlpha(this.f15057);
        }
        int save = canvas.save();
        C12508 c12508 = this.f31247;
        canvas.translate(c12508.f37572, 0.0f);
        canvas.scale(c12508.f37571, 1.0f);
        RectF rectF3 = f31246;
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        C12508 c125082 = this.f31248;
        canvas.translate(c125082.f37572, 0.0f);
        canvas.scale(c125082.f37571, 1.0f);
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(save2);
    }
}
