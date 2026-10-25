package com.alipay.sdk.m.y;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.m.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static final String a = "ap_req";
    public static final String b = "ap_args";
    public static final String c = "ap_resp";

    public static com.alipay.sdk.m.i.a a() {
        try {
            try {
                return com.alipay.sdk.m.j.a.a("NP", System.currentTimeMillis(), new com.alipay.sdk.m.j.c(com.alipay.sdk.m.w.b.c().d()), (short) a.d.a(com.alipay.sdk.m.w.b.c().b()), new com.alipay.sdk.m.j.f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return com.alipay.sdk.m.j.a.c();
        }
    }

    public static HashMap a(com.alipay.sdk.m.w.a aVar) {
        HashMap hashMap = new HashMap();
        try {
            com.alipay.sdk.m.i.a a2 = a();
            JSONObject jSONObject = new JSONObject();
            Context b2 = aVar != null ? aVar.b() : null;
            if (b2 == null) {
                b2 = com.alipay.sdk.m.w.b.c().b().getApplicationContext();
            }
            String a3 = q.a(aVar, b2);
            String b3 = com.alipay.sdk.m.a0.b.b(aVar, b2);
            jSONObject.put("ap_q", a2 != null ? a2.a() : "");
            jSONObject.put(com.alipay.sdk.m.w.a.B, aVar != null ? aVar.d : "");
            jSONObject.put("u_pd", String.valueOf(q.g()));
            jSONObject.put("u_lk", String.valueOf(q.e(q.b())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.g : "_"));
            jSONObject.put("u_fu", a3);
            jSONObject.put("u_oi", b3);
            hashMap.put(a, jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(a2 != null ? a2.a() : "");
            sb.append("|");
            sb.append(a3);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "ap_q", sb.toString());
            return hashMap;
        } catch (Exception e) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "APMEx1", e);
            return hashMap;
        }
    }

    public static JSONObject a(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(c);
        try {
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            return new JSONObject(optString);
        } catch (JSONException e) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "APMEx2", e);
            return null;
        }
    }

    public static void a(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt(b, jSONObject2);
        } catch (JSONException e) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "APMEx2", e);
        }
    }

    public static void a(com.alipay.sdk.m.w.a aVar, HashMap hashMap) {
        JSONObject a2 = com.alipay.sdk.m.o.b.i().a();
        if (hashMap == null || a2 == null) {
            return;
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "ap_r", a2.optString("ap_r"));
        hashMap.putAll(q.a(a2));
    }
}
