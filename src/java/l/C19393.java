package l;

import android.icu.util.ULocale;
import java.util.Locale;

/* compiled from: O529 */
/* renamed from: l.᩵ۤ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19393 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ULocale m44666(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ULocale m44665(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m44667(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
