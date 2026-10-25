package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static synchronized Map a(Context context, Map map) {
        HashMap hashMap;
        synchronized (a.class) {
            String a = com.alipay.sdk.m.d0.a.a(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            hashMap.put("AA2", com.alipay.sdk.m.f0.a.a().a(context));
            hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            hashMap.put("AA4", "3.4.0.202507280853");
            hashMap.put("AA6", a);
        }
        return hashMap;
    }
}
