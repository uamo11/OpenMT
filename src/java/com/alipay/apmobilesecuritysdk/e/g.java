package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class g {
    public static synchronized String a(Context context, String str) {
        synchronized (g.class) {
            String b = com.alipay.sdk.m.g0.e.b(context, "openapi_file_pri", "openApi" + str, "");
            if (com.alipay.sdk.m.d0.a.a(b)) {
                return "";
            }
            String b2 = com.alipay.sdk.m.e0.c.b(com.alipay.sdk.m.e0.c.a(), b);
            return com.alipay.sdk.m.d0.a.a(b2) ? "" : b2;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, com.alipay.sdk.m.e0.c.a(com.alipay.sdk.m.e0.c.a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void b(Context context, String str) {
        synchronized (g.class) {
        }
    }
}
