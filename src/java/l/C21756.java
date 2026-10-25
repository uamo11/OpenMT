package l;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: R697 */
/* renamed from: l.᩸ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21756 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49071(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
