package l;

import android.content.res.Resources;
import android.os.Build;

/* compiled from: Z4TG */
/* renamed from: l.᩶ۗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19892 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45746(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C22008.m49530(theme);
        } else if (i >= 23) {
            C21303.m48333(theme);
        }
    }
}
