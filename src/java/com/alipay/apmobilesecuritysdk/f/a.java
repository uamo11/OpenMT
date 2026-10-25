package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import com.alipay.sdk.m.g0.e;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        if (context != null && !com.alipay.sdk.m.d0.a.a(str) && !com.alipay.sdk.m.d0.a.a(str2)) {
            try {
                String b = e.b(context, str, str2, "");
                if (com.alipay.sdk.m.d0.a.a(b)) {
                    return null;
                }
                return com.alipay.sdk.m.e0.c.b(com.alipay.sdk.m.e0.c.a(), b);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (!com.alipay.sdk.m.d0.a.a(str) && !com.alipay.sdk.m.d0.a.a(str2)) {
                try {
                    String a = com.alipay.sdk.m.g0.b.a(str);
                    if (!com.alipay.sdk.m.d0.a.a(a)) {
                        String string = new JSONObject(a).getString(str2);
                        if (!com.alipay.sdk.m.d0.a.a(string)) {
                            return com.alipay.sdk.m.e0.c.b(com.alipay.sdk.m.e0.c.a(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (com.alipay.sdk.m.d0.a.a(str) || com.alipay.sdk.m.d0.a.a(str2) || context == null) {
            return;
        }
        try {
            String a = com.alipay.sdk.m.e0.c.a(com.alipay.sdk.m.e0.c.a(), str3);
            HashMap hashMap = new HashMap();
            hashMap.put(str2, a);
            e.a(context, str, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (com.alipay.sdk.m.d0.a.a(str) || com.alipay.sdk.m.d0.a.a(str2)) {
                return;
            }
            try {
                String a = com.alipay.sdk.m.g0.b.a(str);
                JSONObject jSONObject = new JSONObject();
                if (com.alipay.sdk.m.d0.a.b(a)) {
                    try {
                        jSONObject = new JSONObject(a);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, com.alipay.sdk.m.e0.c.a(com.alipay.sdk.m.e0.c.a(), str3));
                com.alipay.sdk.m.g0.b.a(str, jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
    }
}
