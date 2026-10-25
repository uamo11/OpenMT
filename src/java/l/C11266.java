package l;

import android.graphics.Point;
import android.util.DisplayMetrics;

/* compiled from: C57W */
/* renamed from: l.ۧ᩸ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11266 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float f33761;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static float f33765;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Point f33764 = new Point();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Point f33763 = new Point();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f33762 = false;

    static {
        DisplayMetrics displayMetrics = C4925.m14338().getDisplayMetrics();
        f33765 = displayMetrics.density;
        f33761 = displayMetrics.scaledDensity;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27878(float f) {
        return (int) ((f * f33765) + 0.5f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m27879(float f) {
        return (int) ((f / f33761) + 0.5f);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m27880(float f) {
        return (int) ((f * f33761) + 0.5f);
    }
}
