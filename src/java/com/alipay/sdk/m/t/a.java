package com.alipay.sdk.m.t;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import l.C15472;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(com.alipay.sdk.m.w.a.p);
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                str2 = e(str6);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = d(str6);
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = f(str6);
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = c(str6);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("biz_type=" + str2 + l.b);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("biz_no=" + str3 + l.b);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("trade_no=" + str4 + l.b);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("app_userid=" + str5 + l.b);
        }
        String sb2 = sb.toString();
        return sb2.endsWith(l.b) ? C15472.m36561(1, 0, sb2) : sb2;
    }

    public static String b(String str) {
        String[] split = str.split("=");
        if (split.length <= 1) {
            return null;
        }
        String str2 = split[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }

    public static String c(String str) {
        if (str.contains("app_userid")) {
            return b(str);
        }
        return null;
    }

    public static String d(String str) {
        if (str.contains("biz_no")) {
            return b(str);
        }
        return null;
    }

    public static String e(String str) {
        if (str.contains("biz_type")) {
            return b(str);
        }
        return null;
    }

    public static String f(String str) {
        if (!str.contains(com.alipay.sdk.m.m.b.B0) || str.startsWith(com.alipay.sdk.m.m.b.A0)) {
            return null;
        }
        return b(str);
    }
}
