package com.alipay.sdk.m.w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.m;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.am;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import l.C15472;
import l.C22870;
import l.C4860;
import l.C5368;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static final String A = "extInfo";
    public static final String B = "ap_link_token";
    public static final String C = "act_info";
    public static final String D = "UTF-8";
    public static final String E = "preheatUserToken";
    public static final String F = "preheatToken";
    public static final String G = "preheatTime";
    public static final String H = "sp_preheatUserToken";
    public static final String I = "new_external_info==";
    public static final String o = "\"&";
    public static final String p = "&";
    public static final String q = "bizcontext=\"";
    public static final String r = "bizcontext=";
    public static final String s = "\"";
    public static final String t = "appkey";
    public static final String u = "ty";
    public static final String v = "sv";
    public static final String w = "an";
    public static final String x = "setting";
    public static final String y = "av";
    public static final String z = "sdk_start_time";
    public String a;
    public String b;
    public Context c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public String h;
    public String i;
    public boolean j = false;
    public boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f77918l = false;
    public final ActivityInfo m;
    public final com.alipay.sdk.m.m.b n;

    public a(Context context, String str, String str2) {
        String str3;
        this.a = "";
        this.b = "";
        this.c = null;
        this.h = null;
        this.i = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.n = new com.alipay.sdk.m.m.b(context, isEmpty);
        String b = b(str, this.b);
        this.d = b;
        this.e = SystemClock.elapsedRealtime();
        this.f = q.g();
        ActivityInfo a = q.a(context);
        this.m = a;
        this.g = str2;
        if (!isEmpty) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "eptyp", C22870.m50967(str2, "|", b));
            if (a != null) {
                str3 = a.name + "|" + a.launchMode;
            } else {
                str3 = "null";
            }
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "actInfo", str3);
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "sys", q.a(this));
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "sdkv", "478258c-clean");
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "registerApp", AlipayApi.e + "");
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            g.a(e);
        }
        if (!isEmpty) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, am.aH + q.g());
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.Q, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.m.a.a(context, this, str, this.d);
        }
        if (!isEmpty && com.alipay.sdk.m.o.b.i().t()) {
            com.alipay.sdk.m.o.b.i().a(this, this.c, true, 2);
        }
        if (com.alipay.sdk.m.o.b.i().a((a) null)) {
            return;
        }
        this.h = m.a(this, b(), H, "");
        this.i = c(str, this.b);
    }

    public static a f() {
        return null;
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.startsWith(I) ? d(str) : f(str) ? c(str) : e(str);
    }

    public Context b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public final String e(String str) {
        try {
            String a = a(str, o, q);
            if (TextUtils.isEmpty(a)) {
                return str + p + a(q, "\"");
            }
            if (!a.endsWith("\"")) {
                a = a.concat("\"");
            }
            int indexOf = str.indexOf(a);
            return str.substring(0, indexOf) + b(a, q, "\"") + str.substring(indexOf + a.length());
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "fmt2", th, str);
            return str;
        }
    }

    public final boolean f(String str) {
        return !str.contains(o);
    }

    public String g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.f77918l;
    }

    public final String b(String str, String str2, String str3) {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z2 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            z2 = true;
            jSONObject = new JSONObject(C15472.m36561(1, 1, substring2));
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String a = a(jSONObject);
        if (z2) {
            a = C4860.m14172("\"", a, "\"");
        }
        return C22870.m50967(str2, a, str3);
    }

    public final String c(String str) {
        try {
            String a = a(str, p, r);
            if (TextUtils.isEmpty(a)) {
                return str + p + a(r, "");
            }
            int indexOf = str.indexOf(a);
            return str.substring(0, indexOf) + b(a, r, "") + str.substring(indexOf + a.length());
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "fmt1", th, str);
            return str;
        }
    }

    public final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", b(jSONObject.optString("bizcontext")));
            return I + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.w.a$a, reason: collision with other inner class name */
    public final class C0028a {
        public static final HashMap a = new HashMap();
        public static final HashMap b = new HashMap();
        public static final String c = "i_uuid_b_c";

        public static void a(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID randomUUID = UUID.randomUUID();
            a.put(randomUUID, aVar);
            intent.putExtra(c, randomUUID);
        }

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(c);
            if (serializableExtra instanceof UUID) {
                return (a) a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void a(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            b.put(str, aVar);
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (a) b.remove(str);
        }
    }

    public final String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return q.g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        } catch (Throwable th) {
            g.c(com.alipay.sdk.m.n.a.B, "generatePreheatTokenError");
            g.a(th);
            return "";
        }
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(B, this.d);
            if (a() && com.alipay.sdk.m.o.b.i().i(null)) {
                jSONObject.put(E, this.h);
                jSONObject.put(F, this.i);
                jSONObject.put(G, System.currentTimeMillis() + "");
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String a(String str, String str2) {
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(a(new JSONObject()));
        m15339.append(str2);
        return m15339.toString();
    }

    public String a(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", com.alipay.sdk.m.n.a.h);
            }
            if (!jSONObject.has(u)) {
                jSONObject.put(u, "and_lite");
            }
            if (!jSONObject.has(v)) {
                jSONObject.put(v, "h.a.3.8.40");
            }
            if (!jSONObject.has(w)) {
                jSONObject.put(w, this.b);
            }
            if (!jSONObject.has(y)) {
                jSONObject.put(y, this.a);
            }
            if (!jSONObject.has(z)) {
                jSONObject.put(z, System.currentTimeMillis());
            }
            if (!jSONObject.has(A)) {
                jSONObject.put(A, e());
            }
            if (!jSONObject.has(C)) {
                if (this.m != null) {
                    str = this.m.name + "|" + this.m.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(C, str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this, com.alipay.sdk.m.m.b.f77909l, "fmt3", th, String.valueOf(jSONObject));
            g.a(th);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public final String b(String str) {
        return a(new JSONObject(str));
    }

    public static String b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return "EP1" + q.g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())) + "_" + System.currentTimeMillis();
        } catch (Throwable unused) {
            return "-";
        }
    }

    public void c(boolean z2) {
        this.f77918l = z2;
    }

    public static HashMap a(a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.put("sdk_ver", "15.8.40");
            hashMap.put("app_name", aVar.b);
            hashMap.put("token", aVar.d);
            hashMap.put("call_type", aVar.g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.e));
            com.alipay.sdk.m.y.a.a(aVar, hashMap);
        }
        return hashMap;
    }

    public void a(boolean z2) {
        this.k = z2;
    }

    public void b(boolean z2) {
        this.j = z2;
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.h);
    }
}
