package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: 98XI */
/* renamed from: l.ۘۗۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3668 extends MetricAffectingSpan {
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
