package com.alipay.sdk.m.y;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C16014;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class o {
    public static final String a = "resultStatus";
    public static final String b = "memo";
    public static final String c = "result";
    public static final String d = "externalSdkData";

    public static Map a(com.alipay.sdk.m.w.a aVar, String str) {
        Map a2 = a();
        try {
            return a(str);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.q, th);
            return a2;
        }
    }

    public static String b(String str, String str2) {
        String str3 = null;
        try {
            for (String str4 : str.split(l.b)) {
                String[] split = str4.split("=", 2);
                if (split.length == 2) {
                    String trim = split[0].trim();
                    String trim2 = split[1].trim();
                    if (TextUtils.equals(trim, str2)) {
                        str3 = trim2.substring(1, trim2.length() - 1);
                    }
                }
            }
            return str3;
        } catch (Throwable th) {
            g.a(th);
            return str3;
        }
    }

    public static String c(String str, String str2) {
        String m37867 = C16014.m37867(str2, "={");
        return str.substring(m37867.length() + str.indexOf(m37867), str.lastIndexOf(l.d));
    }

    public static Map a() {
        com.alipay.sdk.m.l.c a2 = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.CANCELED.c());
        HashMap hashMap = new HashMap();
        hashMap.put(a, Integer.toString(a2.c()));
        hashMap.put(b, a2.b());
        hashMap.put(c, "");
        return hashMap;
    }

    public static Map a(String str) {
        String[] split = str.split(l.b);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, c(str2, substring));
        }
        return hashMap;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            g.a(th);
            return "?";
        }
    }
}
