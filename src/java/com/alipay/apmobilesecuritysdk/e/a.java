package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static b a(String str) {
        try {
            if (com.alipay.sdk.m.d0.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(com.alipay.sdk.m.x.a.k));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.a);
                jSONObject.put("deviceInfoHash", bVar.b);
                jSONObject.put(com.alipay.sdk.m.x.a.k, bVar.c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized b c(Context context) {
        b a;
        synchronized (a.class) {
            String a2 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (com.alipay.sdk.m.d0.a.a(a2)) {
                a2 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            a = a(a2);
        }
        return a;
    }

    public static synchronized b d(Context context) {
        synchronized (a.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (com.alipay.sdk.m.d0.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }

    public static synchronized b e(Context context) {
        synchronized (a.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (com.alipay.sdk.m.d0.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }
}
