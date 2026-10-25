package l;

import java.util.Locale;

/* compiled from: A7BS */
/* renamed from: l.ۖۚۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2324 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7583(Locale locale) {
        String language;
        if (locale == null || (language = locale.getLanguage()) == null) {
            return "en";
        }
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        if ("zh".equals(lowerCase)) {
            String country = locale.getCountry();
            String upperCase = country == null ? "" : country.toUpperCase(locale2);
            return ("CN".equals(upperCase) || "SG".equals(upperCase)) ? "zh-rCN" : ("TW".equals(upperCase) || "HK".equals(upperCase) || "MO".equals(upperCase)) ? "zh-rTW" : "zh-rCN";
        }
        if ("id".equals(lowerCase) || "in".equals(lowerCase)) {
            return "in";
        }
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return "en";
    }
}
