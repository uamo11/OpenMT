package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d {
    public static synchronized Map a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            com.alipay.sdk.m.f0.e a = com.alipay.sdk.m.f0.e.a();
            com.alipay.sdk.m.f0.b a2 = com.alipay.sdk.m.f0.b.a(APSecuritySdk.getInstance(context));
            hashMap = new HashMap();
            hashMap.put("AE1", a.b());
            hashMap.put("AE2", a.c() ? "1" : "0");
            hashMap.put("AE3", a.a(context) ? "1" : "0");
            hashMap.put("AE4", a.d());
            hashMap.put("AE5", a.e());
            hashMap.put("AE6", a.f());
            hashMap.put("AE7", a.g());
            hashMap.put("AE8", a.h());
            hashMap.put("AE9", a.i());
            hashMap.put("AE10", a.j());
            hashMap.put("AE11", a.k());
            hashMap.put("AE12", a.l());
            hashMap.put("AE13", a.m());
            hashMap.put("AE14", a.n());
            hashMap.put("AE15", a.o());
            hashMap.put("AE21", a2.f());
        }
        return hashMap;
    }

    public static synchronized Map b(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            try {
                hashMap.put("AE16", com.alipay.apmobilesecuritysdk.c.c.a(context).a());
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }
}
