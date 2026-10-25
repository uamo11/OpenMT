package com.alipay.sdk.m.g0;

import android.content.Context;
import java.util.HashMap;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String b;
        synchronized (a.class) {
            String str3 = null;
            if (context != null) {
                if (!com.alipay.sdk.m.d0.a.a(str) && !com.alipay.sdk.m.d0.a.a(str2)) {
                    try {
                        b = e.b(context, str, str2, "");
                    } catch (Throwable unused) {
                    }
                    if (!com.alipay.sdk.m.d0.a.a(b)) {
                        str3 = com.alipay.sdk.m.e0.c.b(com.alipay.sdk.m.e0.c.a(), b);
                        return str3;
                    }
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            if (com.alipay.sdk.m.d0.a.a(str) || com.alipay.sdk.m.d0.a.a(str2) || context == null) {
                return;
            }
            try {
                String a = com.alipay.sdk.m.e0.c.a(com.alipay.sdk.m.e0.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, a);
                e.a(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }
}
