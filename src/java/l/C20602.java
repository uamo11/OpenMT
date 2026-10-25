package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: 08Y1 */
/* renamed from: l.᩷ۗۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20602 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12881 f66305;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f66307;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f66306 = AbstractC15661.m36874();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Paint f66308 = AbstractC15661.m36873();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C20602(C12881 c12881, int i) {
        this.f66305 = c12881;
        this.f66307 = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f66305.m31318(textPaint, this.f66307);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f66305.m31318(textPaint, this.f66307);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.f66307;
        if ((i9 == 1 || i9 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f66308;
            paint2.set(paint);
            this.f66305.m31316(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f66306;
                rect.set(i, i10, i8, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }
}
