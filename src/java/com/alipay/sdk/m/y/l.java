package com.alipay.sdk.m.y;

import android.content.Context;
import android.text.TextUtils;
import l.C15472;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class l {
    public static final String a = "pref_trade_token";
    public static final String b = ";";
    public static final String c = "result={";
    public static final String d = "}";
    public static final String e = "trade_token=\"";
    public static final String f = "\"";
    public static final String g = "trade_token=";

    public static void a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        try {
            String a2 = a(str);
            g.b(com.alipay.sdk.m.n.a.B, "trade token: " + a2);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            m.b(aVar, context, a, a2);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.I, th);
            g.a(th);
        }
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(b);
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith(c) && split[i].endsWith(d)) {
                String str3 = split[i];
                String[] split2 = str3.substring(8, str3.length() - 1).split(com.alipay.sdk.m.w.a.p);
                int i2 = 0;
                while (true) {
                    if (i2 >= split2.length) {
                        break;
                    }
                    if (split2[i2].startsWith(e) && split2[i2].endsWith("\"")) {
                        str2 = C15472.m36561(1, 13, split2[i2]);
                        break;
                    }
                    if (split2[i2].startsWith(g)) {
                        str2 = split2[i2].substring(12);
                        break;
                    }
                    i2++;
                }
            }
        }
        return str2;
    }

    public static String a(com.alipay.sdk.m.w.a aVar, Context context) {
        String a2 = m.a(aVar, context, a, "");
        g.b(com.alipay.sdk.m.n.a.B, "get trade token: " + a2);
        return a2;
    }
}
