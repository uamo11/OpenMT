package com.alipay.sdk.m.g0;

import java.io.File;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static String a(String str) {
        String str2;
        try {
            str2 = f.a(str);
        } catch (Throwable unused) {
            str2 = "";
        }
        if (!com.alipay.sdk.m.d0.a.a(str2)) {
            return str2;
        }
        return c.a(".SystemConfig" + File.separator + str);
    }

    public static void a(String str, String str2) {
        try {
            f.a(str, str2);
        } catch (Throwable unused) {
        }
        if (c.a()) {
            c.a(".SystemConfig" + File.separator + str, str2);
        }
    }
}
