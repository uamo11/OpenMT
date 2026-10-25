package l;

import android.os.Build;
import android.view.View;

/* compiled from: R54E */
/* renamed from: l.ᩴᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18934 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43699(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4117.m12348(view, charSequence);
        } else {
            ViewOnLongClickListenerC5528.m15669(view, charSequence);
        }
    }
}
