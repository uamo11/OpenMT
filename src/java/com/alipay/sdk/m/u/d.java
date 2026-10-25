package com.alipay.sdk.m.u;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d extends com.alipay.sdk.m.t.e {
    @Override // com.alipay.sdk.m.t.e
    public JSONObject a() {
        return com.alipay.sdk.m.t.e.a("cashier", "main");
    }

    @Override // com.alipay.sdk.m.t.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.t.e
    public Map a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.alipay.sdk.m.t.e.i, "CBC");
        return hashMap;
    }

    @Override // com.alipay.sdk.m.t.e
    public String a(com.alipay.sdk.m.w.a aVar) {
        return a(aVar, new HashMap(), new HashMap());
    }

    @Override // com.alipay.sdk.m.t.e
    public String a(com.alipay.sdk.m.w.a aVar, String str, JSONObject jSONObject) {
        String a = super.a(aVar, str, jSONObject);
        try {
            String f = com.alipay.sdk.m.r.b.e().f();
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "localConfigVersion", f);
            JSONObject jSONObject2 = new JSONObject(a);
            jSONObject2.put("h5_local", "true");
            jSONObject2.put("h5_local_version", f);
            jSONObject2.put("route_pay_from", "h5");
            jSONObject2.put("init_from", "SDKLite");
            jSONObject2.put("cc", "y");
            return jSONObject2.toString();
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "buildBody", th);
            com.alipay.sdk.m.y.g.a(th);
            return a;
        }
    }
}
