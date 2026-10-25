package com.alipay.sdk.m.t;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.y.f;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.p;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public abstract class e {
    public static final String c = "msp-gzip";
    public static final String d = "Msp-Param";
    public static final String e = "Operation-Type";
    public static final String f = "content-type";
    public static final String g = "Version";
    public static final String h = "AppId";
    public static final String i = "des-mode";
    public static final String j = "namespace";
    public static final String k = "api_name";

    /* renamed from: l, reason: collision with root package name */
    public static final String f77915l = "api_version";
    public static final String m = "data";
    public static final String n = "params";
    public static final String o = "public_key";
    public static final String p = "device";
    public static final String q = "action";
    public static final String r = "type";
    public static final String s = "method";
    public boolean a = true;
    public boolean b = true;

    public Map a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(c, String.valueOf(z));
        hashMap.put(e, "alipay.msp.cashier.dispatch.bytes");
        hashMap.put(f, "application/octet-stream");
        hashMap.put(g, UMCrashManager.CM_VERSION);
        hashMap.put(h, "TAOBAO");
        hashMap.put(d, a.a(str));
        hashMap.put(i, "CBC");
        return hashMap;
    }

    public abstract JSONObject a();

    public String b() {
        return "4.9.0";
    }

    public abstract boolean c();

    public String a(com.alipay.sdk.m.w.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(p, Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put(k, "com.alipay.mcpay");
        hashMap.put(f77915l, b());
        return a(aVar, hashMap, new HashMap());
    }

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(s, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String a(com.alipay.sdk.m.w.a aVar, String str, JSONObject jSONObject) {
        com.alipay.sdk.m.w.b c2 = com.alipay.sdk.m.w.b.c();
        com.alipay.sdk.m.x.a a = com.alipay.sdk.m.x.a.a(c2.b());
        JSONObject a2 = f.a(new JSONObject(), jSONObject);
        try {
            a2.put(com.alipay.sdk.m.n.b.d, str);
            a2.put("tid", a.f());
            a2.put(com.alipay.sdk.m.n.b.b, c2.a().a(aVar, a, c()));
            a2.put(com.alipay.sdk.m.n.b.e, q.a(aVar, c2.b(), com.alipay.sdk.m.l.a.d, false));
            a2.put(com.alipay.sdk.m.n.b.f, q.h(c2.b()));
            a2.put(com.alipay.sdk.m.n.b.h, com.alipay.sdk.m.n.a.h);
            a2.put("utdid", c2.d());
            a2.put(com.alipay.sdk.m.n.b.j, a.e());
            a2.put(com.alipay.sdk.m.n.b.k, com.alipay.sdk.m.o.c.b(c2.b()));
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "BodyErr", th);
            g.a(th);
        }
        return a2.toString();
    }

    public static boolean a(b.C0025b c0025b) {
        return Boolean.valueOf(a(c0025b, c)).booleanValue();
    }

    public static String a(b.C0025b c0025b, String str) {
        Map map;
        List list;
        if (c0025b == null || str == null || (map = c0025b.a) == null || (list = (List) map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public String a(com.alipay.sdk.m.w.a aVar, HashMap hashMap, HashMap hashMap2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put(m, jSONObject2);
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str).getJSONObject(m);
        } catch (JSONException e2) {
            g.a(e2);
        }
        if (!jSONObject.has("params")) {
            return false;
        }
        String optString = jSONObject.getJSONObject("params").optString(o, null);
        if (!TextUtils.isEmpty(optString)) {
            com.alipay.sdk.m.o.c.a(optString);
            return true;
        }
        return false;
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context) {
        return a(aVar, context, "");
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        return a(aVar, context, str, p.b(context));
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        return a(aVar, context, str, str2, true);
    }

    public b a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2, boolean z) {
        g.b(com.alipay.sdk.m.n.a.B, "Packet: " + str2);
        c cVar = new c(this.b);
        b bVar = new b(a(aVar), a(aVar, str, a()));
        Map a = a(false, str);
        d a2 = cVar.a(bVar, this.a, (String) a.get("iSr"));
        b.C0025b a3 = com.alipay.sdk.m.s.b.a(context, new b.a(str2, a(a2.b(), str), a2.a()));
        if (a3 != null) {
            b a4 = cVar.a(new d(a(a3), a3.c), (String) a.get("iSr"));
            return (a4 != null && a(a4.b()) && z) ? a(aVar, context, str, str2, false) : a4;
        }
        throw new RuntimeException("Response is null.");
    }
}
