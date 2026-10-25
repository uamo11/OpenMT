package l;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: N5WL */
/* renamed from: l.᩵ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19351 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44573(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (C11003.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
