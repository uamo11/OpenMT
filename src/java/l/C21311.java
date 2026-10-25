package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: N5A8 */
/* renamed from: l.᩸ۗۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21311 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48347(int i) {
        return i >= 1024 && i <= 65535;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m48346(String str) {
        String trim = str == null ? "" : str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(trim);
            if (m48347(parseInt)) {
                return Integer.valueOf(parseInt);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m48345(Context context, int i) {
        return C1566.m5349().m5356(context, i);
    }
}
