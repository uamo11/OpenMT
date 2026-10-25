package l;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: N8XS */
/* renamed from: l.۫֡֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12047 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f36034 = Pattern.compile("[\\\\&]");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f36035 = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C18515 f36036;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f36037;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f36037 = Pattern.compile("[ \t\r\n]+");
        f36036 = new C18515();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29418(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                str2 = "&quot;";
            } else if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt == '<') {
                str2 = "&lt;";
            } else if (charAt != '>') {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else {
                str2 = "&gt;";
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m29420(String str) {
        if (!f36034.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f36035.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, matcher.start());
            String group = matcher.group();
            f36036.getClass();
            if (group.charAt(0) == '\\') {
                sb.append((CharSequence) group, 1, group.length());
            } else {
                sb.append(C9931.m25038(group));
            }
            i = matcher.end();
        } while (matcher.find());
        if (i != str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m29419(String str) {
        String trim = str.trim();
        Locale locale = Locale.ROOT;
        return f36037.matcher(trim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }
}
