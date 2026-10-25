package com.alipay.sdk.m.n0;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static final String a = "OpenIdHelper";
    public static Method b;

    public static String a(Context context) {
        f a2 = f.a();
        return a2.a(context.getApplicationContext(), a2.c);
    }

    public static void a(boolean z) {
        f.a();
        f.a(z);
    }

    public static final boolean a() {
        Context context = null;
        try {
            if (b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                b = method;
                method.setAccessible(true);
            }
            context = (Context) b.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return f.a().a(context, false);
    }

    public static String b(Context context) {
        f a2 = f.a();
        return a2.a(context.getApplicationContext(), a2.b);
    }

    public static String c(Context context) {
        f a2 = f.a();
        return a2.a(context.getApplicationContext(), a2.a);
    }

    public static String d(Context context) {
        f a2 = f.a();
        return a2.a(context.getApplicationContext(), a2.d);
    }
}
