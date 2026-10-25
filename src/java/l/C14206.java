package l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: Z5IZ */
/* renamed from: l.ܳ֫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14206 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EdgeEffect m33872(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m33871(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m33870(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
