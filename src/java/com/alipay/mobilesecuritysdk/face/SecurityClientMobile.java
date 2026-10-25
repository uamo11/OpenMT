package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.m.d0.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map map) {
        String b;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", a.a(map, "utdid", ""));
            hashMap.put("tid", a.a(map, "tid", ""));
            hashMap.put("userId", a.a(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            b = com.alipay.apmobilesecuritysdk.a.a.b(context);
        }
        return b;
    }
}
