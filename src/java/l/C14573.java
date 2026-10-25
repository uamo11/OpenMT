package l;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: 422Y */
/* renamed from: l.ܳܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14573 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34824(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3931 m34823(Configuration configuration) {
        return C3931.m11974(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34825(Configuration configuration, C3931 c3931) {
        configuration.setLocales(LocaleList.forLanguageTags(c3931.m11980()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34826(C3931 c3931) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c3931.m11980()));
    }
}
