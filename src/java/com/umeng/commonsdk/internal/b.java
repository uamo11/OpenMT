package com.umeng.commonsdk.internal;

import android.content.Context;

/* compiled from: 0478 */
/* loaded from: classes.dex */
public class b {
    public static b b;
    public Context a;
    public c c;

    public b(Context context) {
        this.a = context;
        this.c = new c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b(context.getApplicationContext());
            }
            bVar = b;
        }
        return bVar;
    }

    public c a() {
        return this.c;
    }
}
