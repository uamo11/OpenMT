package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e {
    public static f a(Context context) {
        if (context == null) {
            return null;
        }
        String a = com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (com.alipay.sdk.m.d0.a.a(a)) {
            a = com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key");
        }
        if (com.alipay.sdk.m.d0.a.a(a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            f fVar = new f();
            fVar.a(jSONObject.getString(com.umeng.commonsdk.statistics.idtracking.f.a));
            fVar.b(jSONObject.getString("imsi"));
            fVar.c(jSONObject.getString(com.umeng.commonsdk.statistics.idtracking.g.a));
            fVar.d(jSONObject.getString("bluetoothmac"));
            fVar.e(jSONObject.getString("gsi"));
            return fVar;
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static void a(Context context, f fVar) {
        if (fVar == null || context == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.idtracking.f.a, fVar.a());
            jSONObject.put("imsi", fVar.b());
            jSONObject.put(com.umeng.commonsdk.statistics.idtracking.g.a, fVar.c());
            jSONObject.put("bluetoothmac", fVar.d());
            jSONObject.put("gsi", fVar.e());
            String jSONObject2 = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", jSONObject2);
            com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
    }
}
