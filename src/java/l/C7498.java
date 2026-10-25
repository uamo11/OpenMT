package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: 44RH */
/* renamed from: l.۟ܰ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7498 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20128(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m20126(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m20127(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }
}
