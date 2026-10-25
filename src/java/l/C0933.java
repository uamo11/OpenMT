package l;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: 55K6 */
/* renamed from: l.֨ۛۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0933 implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) ((rect2.left - r0) * f)), rect.top + ((int) ((rect2.top - r1) * f)), rect.right + ((int) ((rect2.right - r2) * f)), rect.bottom + ((int) ((rect2.bottom - r6) * f)));
    }
}
