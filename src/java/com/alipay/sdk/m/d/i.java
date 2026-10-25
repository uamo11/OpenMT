package com.alipay.sdk.m.d;

import android.content.Context;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class i implements com.alipay.sdk.m.c.b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a = com.alipay.sdk.m.o0.b.a();
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(a));
        if (a) {
            return com.alipay.sdk.m.o0.b.b(context);
        }
        return null;
    }
}
