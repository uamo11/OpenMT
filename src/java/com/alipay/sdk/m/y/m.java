package com.alipay.sdk.m.y;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class m {
    public static String a;

    public static synchronized boolean a(Context context, String str) {
        boolean z;
        synchronized (m.class) {
            try {
                z = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
            } catch (Throwable th) {
                g.a(th);
                z = false;
            }
        }
        return z;
    }

    public static synchronized void b(Context context, String str) {
        synchronized (m.class) {
            try {
                PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
            } finally {
            }
        }
    }

    public static synchronized String a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        String str3;
        synchronized (m.class) {
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                str3 = TextUtils.isEmpty(string) ? null : com.alipay.sdk.m.p.e.a(a(context), string, str);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                    com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.m, com.alipay.sdk.m.m.b.F, str + "," + string);
                }
            } catch (Exception e) {
                g.a(e);
            }
        }
        return str3;
    }

    public static synchronized void b(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        synchronized (m.class) {
            try {
                String b = com.alipay.sdk.m.p.e.b(a(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(b)) {
                    com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.m, com.alipay.sdk.m.m.b.G, str + "," + str2);
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, b).apply();
            } finally {
            }
        }
    }

    public static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                g.a(th);
                str = "";
            }
            a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return a;
    }
}
