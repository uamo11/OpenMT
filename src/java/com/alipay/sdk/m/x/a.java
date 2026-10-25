package com.alipay.sdk.m.x;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.p.e;
import com.alipay.sdk.m.y.g;
import java.util.Random;
import l.C5368;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static final String g = "alipay_tid_storage";
    public static final String h = "tidinfo";
    public static final String i = "tid";
    public static final String j = "client_key";
    public static final String k = "timestamp";

    /* renamed from: l, reason: collision with root package name */
    public static final String f77919l = "vimei";
    public static final String m = "vimsi";
    public static Context n;
    public static a o;
    public String a;
    public String b;
    public long c;
    public String d;
    public String e;
    public boolean f = false;

    public final void b(Context context) {
        if (context != null) {
            n = context.getApplicationContext();
        }
        if (this.f) {
            return;
        }
        this.f = true;
        l();
    }

    public String c() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public final String d() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder m15339 = C5368.m15339(hexString);
        m15339.append(random.nextInt(OpenAuthTask.OK) + 1000);
        return m15339.toString();
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.a;
    }

    public Long g() {
        return Long.valueOf(this.c);
    }

    public String h() {
        return this.d;
    }

    public String i() {
        return this.e;
    }

    public boolean j() {
        return k();
    }

    public boolean k() {
        return TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            java.lang.String r3 = "alipay_tid_storage"
            java.lang.String r4 = "tidinfo"
            r5 = 1
            java.lang.String r3 = com.alipay.sdk.m.x.a.C0030a.a(r3, r4, r5)     // Catch: java.lang.Exception -> L52
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L52
            if (r4 != 0) goto L4e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r4.<init>(r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "tid"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = "client_key"
            java.lang.String r5 = r4.optString(r5, r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r6 = "timestamp"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L49
            long r6 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L49
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L49
            java.lang.String r6 = "vimei"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L49
            java.lang.String r7 = "vimsi"
            java.lang.String r0 = r4.optString(r7, r0)     // Catch: java.lang.Exception -> L47
            r2 = r0
            goto L59
        L47:
            r0 = move-exception
            goto L56
        L49:
            r0 = move-exception
            r6 = r2
            goto L56
        L4c:
            r0 = move-exception
            goto L54
        L4e:
            r0 = r2
            r5 = r0
            r6 = r5
            goto L5b
        L52:
            r0 = move-exception
            r3 = r2
        L54:
            r5 = r2
            r6 = r5
        L56:
            com.alipay.sdk.m.y.g.a(r0)
        L59:
            r0 = r2
            r2 = r3
        L5b:
            java.lang.String r3 = "mspl"
            java.lang.String r4 = "tid_str: load"
            com.alipay.sdk.m.y.g.b(r3, r4)
            boolean r3 = r9.a(r2, r5, r6, r0)
            if (r3 == 0) goto L6c
            r9.m()
            goto L7a
        L6c:
            r9.a = r2
            r9.b = r5
            long r1 = r1.longValue()
            r9.c = r1
            r9.d = r6
            r9.e = r0
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.x.a.l():void");
    }

    public final void m() {
        this.a = "";
        this.b = c();
        this.c = System.currentTimeMillis();
        this.d = d();
        this.e = d();
        C0030a.b(g, h);
    }

    public final void n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.a);
            jSONObject.put(j, this.b);
            jSONObject.put(k, this.c);
            jSONObject.put(f77919l, this.d);
            jSONObject.put(m, this.e);
            C0030a.a(g, h, jSONObject.toString(), true);
        } catch (Exception e) {
            g.a(e);
        }
    }

    public final void o() {
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (o == null) {
                o = new a();
            }
            if (n == null) {
                o.b(context);
            }
            aVar = o;
        }
        return aVar;
    }

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.x.a$a, reason: collision with other inner class name */
    public class C0030a {
        public static boolean a(String str, String str2) {
            if (a.n == null) {
                return false;
            }
            return a.n.getSharedPreferences(str, 0).contains(str2);
        }

        public static void b(String str, String str2) {
            if (a.n == null) {
                return;
            }
            a.n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static boolean c(String str, String str2) {
            if (a.n == null) {
                return false;
            }
            return a.n.getSharedPreferences(str, 0).contains(str2);
        }

        public static String d(String str, String str2) {
            return a(str, str2, true);
        }

        public static String a(String str, String str2, boolean z) {
            if (a.n == null) {
                return null;
            }
            String string = a.n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    g.b(com.alipay.sdk.m.n.a.B, "tid_str: pref failed");
                }
            }
            g.b(com.alipay.sdk.m.n.a.B, "tid_str: from local");
            return string;
        }

        public static void a(String str, String str2, String str3) {
            a(str, str2, str3, true);
        }

        public static void a(String str, String str2, String str3, boolean z) {
            if (a.n == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.n.getSharedPreferences(str, 0);
            if (z) {
                str3 = e.b(a(), str3, str3);
                TextUtils.isEmpty(str3);
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static String a() {
            String str;
            try {
                str = a.n.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                g.a(th);
                str = "";
            }
            return (str + "0000000000000000000000000000").substring(0, 24);
        }
    }

    public final boolean a(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public void b() {
        g.b(com.alipay.sdk.m.n.a.B, "tid_str: del");
        m();
    }

    public void a(String str, String str2) {
        g.b(com.alipay.sdk.m.n.a.B, "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a = str;
        this.b = str2;
        this.c = System.currentTimeMillis();
        n();
        o();
    }

    public final void a(String str, String str2, String str3, String str4, Long l2) {
        if (a(str, str2, str3, str4)) {
            return;
        }
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = str4;
        if (l2 == null) {
            this.c = System.currentTimeMillis();
        } else {
            this.c = l2.longValue();
        }
        n();
    }
}
