package l;

import android.animation.TypeEvaluator;

/* compiled from: E4MG */
/* renamed from: l.ܺ᩺ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16246 implements TypeEvaluator {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16246 f49996 = new C16246();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16246 m38211() {
        return f49996;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float m46695 = C20382.m46695(f3, f2, f, f2);
        float m466952 = C20382.m46695(pow4, pow, f, pow);
        float m466953 = C20382.m46695(pow5, pow2, f, pow2);
        float m466954 = C20382.m46695(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(m466952, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(m466953, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(m466954, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(m46695 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
