package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.R;
import com.alipay.sdk.app.PayResultActivity;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.m;
import com.alipay.sdk.m.y.o;
import com.alipay.sdk.m.y.q;
import com.alipay.sdk.util.H5PayResultModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.C16014;
import l.C2912;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class PayTask {
    public static final Object h = k.class;
    public static long i;
    public Activity a;
    public com.alipay.sdk.m.c0.a b;
    public final String c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map g = new HashMap();

    /* compiled from: N673 */
    public class b implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ H5PayCallback c;

        public b(String str, boolean z, H5PayCallback h5PayCallback) {
            this.a = str;
            this.b = z;
            this.c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5Pay = PayTask.this.h5Pay(new com.alipay.sdk.m.w.a(PayTask.this.a, this.a, "payInterceptorWithUrl"), this.a, this.b);
            g.d(com.alipay.sdk.m.n.a.B, "inc finished: " + h5Pay.getResultCode());
            this.c.onPayResult(h5Pay);
        }
    }

    /* compiled from: N673 */
    public class c implements k.f {
        public c() {
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void b() {
        }
    }

    /* compiled from: N673 */
    public class d implements Runnable {
        public final /* synthetic */ com.alipay.sdk.m.w.a a;
        public final /* synthetic */ String b;

        public d(com.alipay.sdk.m.w.a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayTask.this.b(this.a, this.b);
        }
    }

    /* compiled from: N673 */
    public class e {
        public String a;
        public String b;
        public String c;
        public String d;

        public e() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.d;
        }

        public void a(String str) {
            this.c = str;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(String str) {
            this.b = str;
        }

        public void d(String str) {
            this.d = str;
        }
    }

    public PayTask(Activity activity) {
        this.a = activity;
        com.alipay.sdk.m.w.b.c().a(this.a);
        this.b = new com.alipay.sdk.m.c0.a(activity, this.a.getString(R.string.alipay_standard_sdk_loading_go_pay));
    }

    public final void b(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString(com.alipay.sdk.m.x.a.j);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            com.alipay.sdk.m.x.a.a(com.alipay.sdk.m.w.b.c().b()).a(optString, optString2);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.P, th);
        }
    }

    public final void c(com.alipay.sdk.m.w.a aVar, String str) {
        if (aVar.a() && com.alipay.sdk.m.o.b.i().i(aVar)) {
            new Thread(new d(aVar, str)).start();
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
    }

    public synchronized String fetchTradeToken() {
        return l.a(new com.alipay.sdk.m.w.a(this.a, "", "fetchTradeToken"), this.a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.40";
    }

    public synchronized H5PayResultModel h5Pay(com.alipay.sdk.m.w.a aVar, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] split = a(aVar, str, z).split(l.b);
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                int indexOf = str2.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str2.substring(0, indexOf);
                    hashMap.put(substring, a(str2, substring));
                }
            }
            if (hashMap.containsKey(o.a)) {
                h5PayResultModel.setResultCode((String) hashMap.get(o.a));
            }
            h5PayResultModel.setReturnUrl(a(str, hashMap));
            if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.n0, "");
            }
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.o0, th);
            g.a(th);
        }
        return h5PayResultModel;
    }

    public synchronized String pay(String str, boolean z) {
        if (com.alipay.sdk.m.y.c.a()) {
            return com.alipay.sdk.m.l.b.b();
        }
        return a(new com.alipay.sdk.m.w.a(this.a, str, "pay"), str, z);
    }

    public synchronized Map payV2(String str, boolean z) {
        String a2;
        com.alipay.sdk.m.w.a aVar;
        if (com.alipay.sdk.m.y.c.a()) {
            a2 = com.alipay.sdk.m.l.b.b();
            aVar = null;
        } else {
            com.alipay.sdk.m.w.a aVar2 = new com.alipay.sdk.m.w.a(this.a, str, "payV2");
            a2 = a(aVar2, str, z);
            aVar = aVar2;
        }
        return o.a(aVar, a2);
    }

    public void showLoading() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                com.alipay.sdk.m.w.b.c().a(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - i < com.alipay.sdk.m.o.b.i().e()) {
                    return false;
                }
                i = elapsedRealtime;
                com.alipay.sdk.m.o.b.i().a(com.alipay.sdk.m.w.a.f(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e2) {
                g.a(e2);
                return false;
            }
        }
    }

    public final synchronized String a(com.alipay.sdk.m.w.a aVar, String str, boolean z) {
        String str2;
        JSONObject jSONObject;
        AlipayDebugOptions alipayDebugOptions;
        String str3 = str;
        synchronized (this) {
            com.alipay.sdk.m.o.b.i().c(aVar);
            com.alipay.sdk.m.o.b.i().e(aVar);
            com.alipay.sdk.m.o.b.i().g(aVar);
            boolean z2 = AlipayApi.e;
            if (z) {
                showLoading();
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "isDebugApp", "false");
            if (str3.contains("payment_inst=")) {
                String substring = str3.substring(str3.indexOf("payment_inst=") + 13);
                int indexOf = substring.indexOf(38);
                if (indexOf > 0) {
                    substring = substring.substring(0, indexOf);
                }
                com.alipay.sdk.m.l.a.a(substring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                com.alipay.sdk.m.l.a.a("");
            }
            if (str3.contains(com.alipay.sdk.m.n.a.x)) {
                com.alipay.sdk.m.n.a.y = true;
            }
            if (com.alipay.sdk.m.n.a.y) {
                if (str3.startsWith(com.alipay.sdk.m.n.a.z)) {
                    str3 = str3.substring(str3.indexOf(com.alipay.sdk.m.n.a.z) + 53);
                } else if (str3.startsWith(com.alipay.sdk.m.n.a.A)) {
                    str3 = str3.substring(str3.indexOf(com.alipay.sdk.m.n.a.A) + 52);
                }
            }
            String str4 = str3;
            str2 = "";
            try {
                g.d(com.alipay.sdk.m.n.a.B, "pay prepared: " + str4);
                str2 = a(str4, aVar);
                g.d(com.alipay.sdk.m.n.a.B, "pay raw result: " + str2);
                l.a(aVar, this.a.getApplicationContext(), str2);
                if (!com.alipay.sdk.m.o.b.i().a(aVar)) {
                    String b2 = o.b(str2, o.d);
                    if (!TextUtils.isEmpty(b2)) {
                        try {
                            String optString = new JSONObject(b2).optString(com.alipay.sdk.m.w.a.E);
                            if (!TextUtils.isEmpty(optString)) {
                                m.b(aVar, this.a, com.alipay.sdk.m.w.a.H, optString);
                            }
                        } catch (Throwable th) {
                            g.a(th);
                        }
                    }
                }
                if (com.alipay.sdk.m.o.b.i().h(null)) {
                    com.alipay.sdk.m.r.b.e().a();
                    com.alipay.sdk.m.r.b.e().d();
                }
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(str2, o.a) + "|" + o.a(str2, o.b));
                if (!com.alipay.sdk.m.o.b.i().t()) {
                    com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                }
                dismissLoading();
                a(aVar);
                com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str4, aVar.d);
                alipayDebugOptions = AlipayApi.g;
            } catch (Throwable th2) {
                try {
                    str2 = com.alipay.sdk.m.l.b.a();
                    g.a(th2);
                    if (!com.alipay.sdk.m.o.b.i().a(aVar)) {
                        String b3 = o.b(str2, o.d);
                        if (!TextUtils.isEmpty(b3)) {
                            try {
                                String optString2 = new JSONObject(b3).optString(com.alipay.sdk.m.w.a.E);
                                if (!TextUtils.isEmpty(optString2)) {
                                    m.b(aVar, this.a, com.alipay.sdk.m.w.a.H, optString2);
                                }
                            } catch (Throwable th3) {
                                g.a(th3);
                            }
                        }
                    }
                    if (com.alipay.sdk.m.o.b.i().h(null)) {
                        com.alipay.sdk.m.r.b.e().a();
                        com.alipay.sdk.m.r.b.e().d();
                    }
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(str2, o.a) + "|" + o.a(str2, o.b));
                    if (!com.alipay.sdk.m.o.b.i().t()) {
                        com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    a(aVar);
                    com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str4, aVar.d);
                    AlipayDebugOptions alipayDebugOptions2 = AlipayApi.g;
                    if (alipayDebugOptions2 != null && alipayDebugOptions2.getAlipayPayLifeCycle() != null) {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("isHitPreHeatApp", z2);
                        } catch (Throwable th4) {
                            g.a(th4);
                        }
                    }
                } finally {
                }
            }
            if (alipayDebugOptions != null && alipayDebugOptions.getAlipayPayLifeCycle() != null) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("isHitPreHeatApp", z2);
                } catch (Throwable th5) {
                    g.a(th5);
                }
                AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
            }
            g.d(com.alipay.sdk.m.n.a.B, "pay returning: " + str2);
        }
        return str2;
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            g.d(com.alipay.sdk.m.n.a.B, "intercepted: " + fetchOrderInfoFromH5PayUrl);
            new Thread(new b(fetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public final void b(com.alipay.sdk.m.w.a aVar, String str) {
        g.b(com.alipay.sdk.m.n.a.B, "requestPreheatPay");
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatStart", aVar.g());
        try {
            g.b(com.alipay.sdk.m.n.a.B, "requestPreheatPay respData:" + new h().a(aVar, this.a.getApplicationContext(), str).c());
        } catch (Throwable th) {
            g.a(th);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatError", th);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatEnd", aVar.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x009a A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:4:0x0013, B:6:0x0019, B:8:0x0025, B:11:0x0078, B:13:0x0080, B:15:0x00cf, B:17:0x00d7, B:19:0x0128, B:21:0x0139, B:23:0x0147, B:25:0x0166, B:27:0x0193, B:30:0x01c8, B:36:0x01fa, B:39:0x01a4, B:41:0x01aa, B:43:0x01b8, B:46:0x0260, B:48:0x0268, B:50:0x0270, B:52:0x0276, B:55:0x0280, B:57:0x028a, B:59:0x029a, B:62:0x02f5, B:65:0x0306, B:68:0x0317, B:70:0x0353, B:72:0x0359, B:74:0x035f, B:80:0x03b6, B:83:0x00df, B:85:0x00e7, B:87:0x00ef, B:89:0x0101, B:92:0x0088, B:94:0x009a, B:97:0x0031, B:99:0x0043), top: B:3:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public final void a(com.alipay.sdk.m.w.a aVar) {
        WeakReference weakReference;
        if (com.alipay.sdk.m.o.b.i().c(null)) {
            return;
        }
        g.d(com.alipay.sdk.m.n.a.B, "unbindRegisterAppService registerAppServiceConnectSuccess=" + AlipayApi.e);
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "registerApp", "unbindServiceStart");
        if (AlipayApi.d != null && AlipayApi.e && (weakReference = AlipayApi.f) != null && weakReference.get() != null) {
            try {
                ((Context) AlipayApi.f.get()).unbindService(AlipayApi.d);
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "registerApp", "unbindServiceEnd");
            } catch (Throwable th) {
                g.a(th);
                com.alipay.sdk.m.m.a.a(aVar, "wr", "registerAppUnbindServiceError", th);
            }
        }
        AlipayApi.f = null;
        AlipayApi.e = false;
        AlipayApi.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:9:0x001e, B:11:0x0051, B:12:0x0056), top: B:8:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "sc"
            java.lang.String r1 = ""
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L18
            r3 = 0
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r6.versionName     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r6 = move-exception
            goto L1a
        L18:
            r6 = move-exception
            r2 = r1
        L1a:
            com.alipay.sdk.m.y.g.a(r6)
            r6 = r1
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "appkey"
            java.lang.String r5 = "2014052600006128"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "ty"
            java.lang.String r5 = "and_lite"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "sv"
            java.lang.String r5 = "h.a.3.8.40"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "an"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "av"
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "sdk_start_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L5b
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L56
            java.lang.String r6 = "h5tonative"
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L5b
        L56:
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            return r6
        L5b:
            r6 = move-exception
            com.alipay.sdk.m.y.g.a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(android.content.Context):java.lang.String");
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public final boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty((CharSequence) map.get(str3))) {
                str2 = (String) map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, "=\"", str2, "\"");
            return true;
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, com.alipay.sdk.m.w.a.p, str, "=\"", str2);
        sb.append("\"");
        return true;
    }

    public final String a(String str, Map map) {
        boolean equals = "9000".equals(map.get(o.a));
        String str2 = (String) map.get(o.c);
        e eVar = (e) this.g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return (String) map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String a2 = a(q.a("&callBackUrl=\"", "\"", str2), q.a("&call_back_url=\"", "\"", str2), q.a(com.alipay.sdk.m.n.a.v, "\"", str2), C2912.decode(q.a(com.alipay.sdk.m.n.a.w, com.alipay.sdk.m.w.a.p, str2), "utf-8"), C2912.decode(q.a("&callBackUrl=", com.alipay.sdk.m.w.a.p, str2), "utf-8"), q.a("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        if (eVar != null) {
            String b2 = equals ? eVar.b() : eVar.c();
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
        }
        return eVar != null ? com.alipay.sdk.m.o.b.i().s() : "";
    }

    public final String a(String str, String str2) {
        String m37867 = C16014.m37867(str2, "={");
        return str.substring(m37867.length() + str.indexOf(m37867), str.lastIndexOf(l.d));
    }

    public final k.f a() {
        return new c();
    }

    public final String a(String str, com.alipay.sdk.m.w.a aVar) {
        String a2 = aVar.a(str);
        g.b(com.alipay.sdk.m.n.a.B, "payResult orderInfo=" + a2);
        if (a2.contains("paymethod=\"expressGateway\"")) {
            return a(aVar, a2);
        }
        List m = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || m == null) {
            m = com.alipay.sdk.m.l.a.d;
        }
        if (q.a(aVar, (Context) this.a, m, true)) {
            k kVar = new k(this.a, aVar, a());
            g.d(com.alipay.sdk.m.n.a.B, "pay inner started: ".concat(a2));
            c(aVar, a2);
            String a3 = kVar.a(a2, false);
            if (!TextUtils.isEmpty(a3)) {
                if (a3.contains("resultStatus={" + com.alipay.sdk.m.l.c.ACTIVITY_NOT_START_EXIT.c() + l.d)) {
                    q.a("alipaySdk", com.alipay.sdk.m.n.b.q, this.a, aVar);
                    a3 = kVar.a(a2, true);
                }
            }
            g.d(com.alipay.sdk.m.n.a.B, "pay inner raw result: " + a3);
            kVar.a();
            boolean y = com.alipay.sdk.m.o.b.i().y();
            if (!TextUtils.equals(a3, k.j) && !TextUtils.equals(a3, k.k) && (!y || !aVar.i())) {
                if (TextUtils.isEmpty(a3)) {
                    return com.alipay.sdk.m.l.b.a();
                }
                if (!a3.contains(PayResultActivity.b)) {
                    return a3;
                }
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.k0);
                return a(aVar, a2, m, a3, this.a);
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.i0);
            return a(aVar, a2);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.j0);
        return a(aVar, a2);
    }

    public static String a(com.alipay.sdk.m.w.a aVar, String str, List list, String str2, Activity activity) {
        q.c a2 = q.a(aVar, activity, list);
        if (a2 == null || a2.a(aVar) || a2.a() || !TextUtils.equals(a2.a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        g.b(com.alipay.sdk.m.n.a.B, "PayTask not_login");
        String valueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap hashMap = PayResultActivity.c;
        hashMap.put(valueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f, str);
        intent.putExtra(PayResultActivity.g, activity.getPackageName());
        intent.putExtra(PayResultActivity.e, valueOf);
        a.C0028a.a(aVar, intent);
        activity.startActivity(intent);
        synchronized (hashMap.get(valueOf)) {
            try {
                g.b(com.alipay.sdk.m.n.a.B, "PayTask wait");
                hashMap.get(valueOf).wait();
            } catch (InterruptedException unused) {
                g.b(com.alipay.sdk.m.n.a.B, "PayTask interrupted");
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String str3 = PayResultActivity.b.b;
        g.b(com.alipay.sdk.m.n.a.B, "PayTask ret: " + str3);
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.alipay.sdk.m.w.a r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.m.w.a, java.lang.String):java.lang.String");
    }

    public final String a(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject) {
        g.b(com.alipay.sdk.m.n.a.B, "processLocalWebPay");
        com.alipay.sdk.m.l.b.a(false);
        com.alipay.sdk.m.l.b.a((String) null);
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(com.alipay.sdk.m.t.e.m).optJSONObject("local_web_pay_data");
            String optString = optJSONObject.optString("h5_cashier_url");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("h5_local_data");
            String optString2 = optJSONObject2.optString("sha256", "");
            String optString3 = optJSONObject2.optString("source_url", "");
            String optString4 = optJSONObject2.optString("update_strategy");
            com.alipay.sdk.m.r.b.e().a(new com.alipay.sdk.m.r.a(optString2, optString3, optString4));
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "h5LocalDataUpdateStrategy", optString4);
            intent.putExtra("url", optString);
            intent.putExtra("version", com.alipay.sdk.m.c0.c.c);
            intent.putExtra("cashierBizData", jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putBoolean("backisexit", com.alipay.sdk.m.o.b.i().d(aVar));
            intent.putExtras(bundle);
            a.C0028a.a(aVar, intent);
            this.a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e2) {
                    g.a(e2);
                    return com.alipay.sdk.m.l.b.a();
                }
            }
            String d2 = com.alipay.sdk.m.l.b.d();
            return TextUtils.isEmpty(d2) ? com.alipay.sdk.m.l.b.a() : d2;
        } catch (Throwable th) {
            g.a(th);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "processLocalWebPay", th);
            return com.alipay.sdk.m.l.b.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r0 = r6.c();
        r11 = com.alipay.sdk.m.l.b.a(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], com.alipay.sdk.m.y.q.e(r10, r0[2]));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.alipay.sdk.m.w.a r10, com.alipay.sdk.m.v.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.m.w.a, com.alipay.sdk.m.v.b, java.lang.String):java.lang.String");
    }

    public final String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.v.b bVar) {
        com.alipay.sdk.m.l.b.a(false);
        com.alipay.sdk.m.l.b.a((String) null);
        String[] c2 = bVar.c();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", c2[0]);
        if (c2.length == 2) {
            bundle.putString("cookie", c2[1]);
        }
        intent.putExtras(bundle);
        a.C0028a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e2) {
                g.a(e2);
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String d2 = com.alipay.sdk.m.l.b.d();
        return TextUtils.isEmpty(d2) ? com.alipay.sdk.m.l.b.a() : d2;
    }
}
