package l;

import java.util.Locale;

/* compiled from: S3QK */
/* renamed from: l.ܺ۫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15924 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Locale[] f49184 = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37698(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f49184;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    int length2 = localeArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            String m1788 = C0341.m1788(locale);
                            if (m1788.isEmpty()) {
                                String country = locale.getCountry();
                                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                    return true;
                                }
                            } else {
                                return m1788.equals(C0341.m1788(locale2));
                            }
                        } else {
                            if (localeArr[i2].equals(locale2)) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (localeArr[i].equals(locale)) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale m37697(String str) {
        return Locale.forLanguageTag(str);
    }
}
