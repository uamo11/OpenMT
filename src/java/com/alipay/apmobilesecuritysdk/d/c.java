package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static Map a(Context context) {
        com.alipay.sdk.m.f0.b a = com.alipay.sdk.m.f0.b.a(APSecuritySdk.getInstance(context));
        HashMap hashMap = new HashMap();
        f a2 = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String a3 = a.a(context);
        String k = a.k(context);
        if (a2 != null) {
            if (com.alipay.sdk.m.d0.a.a(a3)) {
                a3 = a2.b();
            }
            if (com.alipay.sdk.m.d0.a.a(k)) {
                k = a2.e();
            }
        }
        com.alipay.apmobilesecuritysdk.e.e.a(context, new f("", a3, "", "", k));
        hashMap.put("AD1", "");
        hashMap.put("AD2", a3);
        hashMap.put("AD3", a.e(context));
        hashMap.put("AD5", a.g(context));
        hashMap.put("AD6", a.h(context));
        hashMap.put("AD7", a.i(context));
        hashMap.put("AD9", a.j(context));
        hashMap.put("AD10", k);
        hashMap.put("AD11", a.c());
        hashMap.put("AD12", a.d());
        hashMap.put("AD13", a.e());
        hashMap.put("AD14", a.g());
        hashMap.put("AD15", a.h());
        hashMap.put("AD16", a.i());
        hashMap.put("AD17", "");
        hashMap.put("AD19", a.l(context));
        hashMap.put("AD20", a.j());
        hashMap.put("AD22", "");
        hashMap.put("AD24", com.alipay.sdk.m.d0.a.g(a.f(context)));
        hashMap.put("AD26", a.d(context));
        hashMap.put("AD27", a.o());
        hashMap.put("AD28", a.q());
        hashMap.put("AD29", a.s());
        hashMap.put("AD30", a.p());
        hashMap.put("AD31", a.r());
        hashMap.put("AD32", a.m());
        hashMap.put("AD33", a.n());
        hashMap.put("AD34", a.p(context));
        hashMap.put("AD35", a.q(context));
        hashMap.put("AD36", a.m(context));
        hashMap.put("AD37", a.l());
        hashMap.put("AD38", a.k());
        hashMap.put("AD39", a.b(context));
        hashMap.put("AD40", a.c(context));
        hashMap.put("AD41", a.a());
        hashMap.put("AD42", a.b());
        return hashMap;
    }
}
