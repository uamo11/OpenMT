package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.sdk.m.k0.d;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static d a(Context context, Map map) {
        d dVar = new d();
        a(context, dVar, map);
        dVar.f = e.a(context, map);
        return dVar;
    }

    public static void a(Context context, d dVar, Map map) {
        String str;
        String str2;
        String str3;
        com.alipay.apmobilesecuritysdk.e.b e;
        com.alipay.apmobilesecuritysdk.e.b d;
        String str4 = "";
        String a = com.alipay.sdk.m.d0.a.a(map, "appName", "");
        String a2 = com.alipay.sdk.m.d0.a.a(map, "sessionId", "");
        String a3 = com.alipay.sdk.m.d0.a.a(map, "rpcVersion", "");
        String a4 = a.a(context, a);
        String securityToken = UmidSdkWrapper.getSecurityToken(context);
        String d2 = h.d(context);
        if (com.alipay.sdk.m.d0.a.b(a2)) {
            dVar.c = a2;
        } else {
            dVar.c = a4;
        }
        dVar.d = securityToken;
        dVar.e = d2;
        dVar.a = "android";
        c d3 = com.alipay.apmobilesecuritysdk.e.d.d(context);
        if (d3 != null) {
            str2 = d3.a;
            str = d3.c;
        } else {
            str = "";
            str2 = str;
        }
        if (com.alipay.sdk.m.d0.a.a(str2) && (d = com.alipay.apmobilesecuritysdk.e.a.d(context)) != null) {
            str2 = d.a;
            str = d.c;
        }
        c e2 = com.alipay.apmobilesecuritysdk.e.d.e(context);
        if (e2 != null) {
            str4 = e2.a;
            str3 = e2.c;
        } else {
            str3 = "";
        }
        if (com.alipay.sdk.m.d0.a.a(str4) && (e = com.alipay.apmobilesecuritysdk.e.a.e(context)) != null) {
            str4 = e.a;
            str3 = e.c;
        }
        dVar.h = str2;
        dVar.g = str4;
        dVar.j = a3;
        if (com.alipay.sdk.m.d0.a.a(str2)) {
            dVar.b = str4;
            dVar.i = str3;
        } else {
            dVar.b = str2;
            dVar.i = str;
        }
    }
}
