package com.alipay.sdk.m.s0;

import android.content.Context;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static String a(Context context) {
        b b = c.b(context);
        return (b == null || com.alipay.sdk.m.q0.f.b(b.c())) ? "ffffffffffffffffffffffff" : b.c();
    }

    public static String b(Context context) {
        String d = d.a(context).d();
        return (d == null || com.alipay.sdk.m.q0.f.b(d)) ? "ffffffffffffffffffffffff" : d;
    }

    @Deprecated
    public static String c(Context context) {
        return a(context);
    }

    @Deprecated
    public static String d(Context context) {
        return b(context);
    }
}
