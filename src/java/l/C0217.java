package l;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: 51AH */
/* renamed from: l.֡ۛ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0217 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m1461(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m1465(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m1463(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m1464(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m1466(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m1462(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
