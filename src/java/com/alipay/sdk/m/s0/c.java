package com.alipay.sdk.m.s0;

import android.content.Context;
import java.util.zip.Adler32;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static b a;
    public static final Object b = new Object();

    public static long a(b bVar) {
        if (bVar == null) {
            return 0L;
        }
        String str = bVar.c() + bVar.d() + bVar.a() + bVar.e() + bVar.b();
        if (com.alipay.sdk.m.q0.f.b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    public static synchronized b b(Context context) {
        synchronized (c.class) {
            b bVar = a;
            if (bVar != null) {
                return bVar;
            }
            if (context == null) {
                return null;
            }
            b a2 = a(context);
            a = a2;
            return a2;
        }
    }

    public static b a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (b) {
            String e = d.a(context).e();
            if (com.alipay.sdk.m.q0.f.b(e)) {
                return null;
            }
            if (e.endsWith("\n")) {
                e = e.substring(0, e.length() - 1);
            }
            b bVar = new b();
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = com.alipay.sdk.m.q0.d.a(context);
            String b2 = com.alipay.sdk.m.q0.d.b(context);
            bVar.c(a2);
            bVar.a(a2);
            bVar.b(currentTimeMillis);
            bVar.b(b2);
            bVar.d(e);
            bVar.a(a(bVar));
            return bVar;
        }
    }
}
