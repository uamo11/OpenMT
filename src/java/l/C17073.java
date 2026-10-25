package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: Z90A */
/* renamed from: l.ܿۗۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17073 implements LeadingMarginSpan {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final boolean f52343;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12881 f52344;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f52348;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f52346 = AbstractC15661.m36873();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RectF f52347 = AbstractC15661.m36875();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f52345 = AbstractC15661.m36874();

    static {
        int i = Build.VERSION.SDK_INT;
        f52343 = 24 == i || 25 == i;
    }

    public C17073(C12881 c12881, int i) {
        this.f52344 = c12881;
        this.f52348 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f52344.m31314();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        Paint.Style style;
        RectF rectF = this.f52347;
        Rect rect = this.f52345;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f52346;
            paint2.set(paint);
            C12881 c12881 = this.f52344;
            c12881.m31322(paint2);
            int save = canvas.save();
            try {
                int m31314 = c12881.m31314();
                int m31315 = c12881.m31315((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int m31321 = (m31314 - m31315) / c12881.m31321();
                boolean z2 = f52343;
                int i10 = this.f52348;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (m31314 * i10)) : (m31314 * i10) - i;
                    int i11 = (m31321 * i2) + i;
                    int i12 = (i2 * m31315) + i11;
                    int i13 = i2 * width;
                    i8 = Math.min(i11, i12) + i13;
                    i9 = Math.max(i11, i12) + i13;
                } else {
                    if (i2 <= 0) {
                        i -= m31314;
                    }
                    i8 = i + m31321;
                    i9 = i8 + m31315;
                }
                int descent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (m31315 / 2);
                int i14 = m31315 + descent;
                if (i10 != 0 && i10 != 1) {
                    rect.set(i8, descent, i9, i14);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
                rectF.set(i8, descent, i9, i14);
                if (i10 == 0) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                paint2.setStyle(style);
                canvas.drawOval(rectF, paint2);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
