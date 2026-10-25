package com.alipay.sdk.m.d;

import android.content.Context;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d implements com.alipay.sdk.m.c.b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a = com.alipay.sdk.m.n0.b.a();
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(a));
        if (a) {
            return com.alipay.sdk.m.n0.b.b(context);
        }
        return null;
    }
}
