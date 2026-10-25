package com.alipay.sdk.m.u;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e extends com.alipay.sdk.m.t.e {
    public static final String t = "log_v";

    @Override // com.alipay.sdk.m.t.e
    public String a(com.alipay.sdk.m.w.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.t.e
    public Map a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.alipay.sdk.m.t.e.c, String.valueOf(z));
        hashMap.put(com.alipay.sdk.m.t.e.f, "application/octet-stream");
        hashMap.put(com.alipay.sdk.m.t.e.i, "CBC");
        return hashMap;
    }

    @Override // com.alipay.sdk.m.t.e
    public JSONObject a() {
        return null;
    }

    @Override // com.alipay.sdk.m.t.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.t.e
    public String a(com.alipay.sdk.m.w.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.alipay.sdk.m.t.e.k, "/sdk/log");
        hashMap.put(com.alipay.sdk.m.t.e.f77915l, "1.0.0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(t, "1.0");
        return a(aVar, hashMap, hashMap2);
    }

    @Override // com.alipay.sdk.m.t.e
    public com.alipay.sdk.m.t.b a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        return a(aVar, context, str, com.alipay.sdk.m.n.a.e, true);
    }
}
