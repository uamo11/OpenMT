package com.alipay.sdk.m.y;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import l.C16014;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d {
    public static final String a = "00:00:00:00:00:00";
    public static d b;

    public d(Context context) {
    }

    public static d b(Context context) {
        if (b == null) {
            b = new d(context);
        }
        return b;
    }

    public String a() {
        String m37867 = C16014.m37867(b(), "|");
        String c = c();
        return TextUtils.isEmpty(c) ? C16014.m37867(m37867, "000000000000000") : C16014.m37867(m37867, c);
    }

    public String b() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String d() {
        return a;
    }

    public static i d(Context context) {
        try {
            NetworkInfo a2 = com.alipay.sdk.m.a0.b.a(null, context);
            return (a2 == null || a2.getType() != 0) ? (a2 == null || a2.getType() != 1) ? i.NONE : i.WIFI : i.a(a2.getSubtype());
        } catch (Exception unused) {
            return i.NONE;
        }
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return b(context).a().substring(0, 8);
    }
}
