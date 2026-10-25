package l;

import android.graphics.drawable.Drawable;

/* compiled from: 93YB */
/* renamed from: l.ۡ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9077 extends Drawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final double f27514 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m23432(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f27514) * f2) + (f * 1.5f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m23431(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f27514) * f2) + f);
    }
}
