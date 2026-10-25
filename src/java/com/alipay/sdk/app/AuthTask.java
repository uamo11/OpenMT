package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.R;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.o;
import com.alipay.sdk.m.y.q;
import java.util.List;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class AuthTask {
    public static final Object c = k.class;
    public Activity a;
    public com.alipay.sdk.m.c0.a b;

    /* compiled from: N673 */
    public class a implements k.f {
        public a() {
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void a() {
            AuthTask.this.a();
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.a = activity;
        b.c().a(this.a);
        this.b = new com.alipay.sdk.m.c0.a(activity, this.a.getString(R.string.alipay_standard_sdk_loading_go_auth));
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new com.alipay.sdk.m.w.a(this.a, str, com.alipay.sdk.m.m.b.n), str, z);
    }

    public synchronized Map authV2(String str, boolean z) {
        com.alipay.sdk.m.w.a aVar;
        aVar = new com.alipay.sdk.m.w.a(this.a, str, "authV2");
        return o.a(aVar, innerAuth(aVar, str, z));
    }

    public final k.f b() {
        return new a();
    }

    public final void c() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void a() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(android.app.Activity r4, java.lang.String r5, com.alipay.sdk.m.w.a r6) {
        /*
            r3 = this;
            r3.c()
            r0 = 0
            com.alipay.sdk.m.u.a r1 = new com.alipay.sdk.m.u.a     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            com.alipay.sdk.m.t.b r4 = r1.a(r6, r4, r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            org.json.JSONObject r4 = r4.c()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "form"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "onload"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.util.List r4 = com.alipay.sdk.m.v.b.a(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.a()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r5 = 0
        L25:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r5 >= r1) goto L4a
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            com.alipay.sdk.m.v.b r1 = (com.alipay.sdk.m.v.b) r1     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            com.alipay.sdk.m.v.a r1 = r1.a()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            com.alipay.sdk.m.v.a r2 = com.alipay.sdk.m.v.a.WapPay     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r1 != r2) goto L47
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            com.alipay.sdk.m.v.b r4 = (com.alipay.sdk.m.v.b) r4     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r4 = r3.a(r6, r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.a()
            return r4
        L47:
            int r5 = r5 + 1
            goto L25
        L4a:
            r3.a()
            goto L6b
        L4e:
            r4 = move-exception
            java.lang.String r5 = "biz"
            java.lang.String r1 = "H5AuthDataAnalysisError"
            com.alipay.sdk.m.m.a.a(r6, r5, r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L68
        L57:
            r4 = move-exception
            com.alipay.sdk.m.l.c r5 = com.alipay.sdk.m.l.c.NETWORK_ERROR     // Catch: java.lang.Throwable -> L86
            int r5 = r5.c()     // Catch: java.lang.Throwable -> L86
            com.alipay.sdk.m.l.c r5 = com.alipay.sdk.m.l.c.a(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "net"
            com.alipay.sdk.m.m.a.a(r6, r0, r4)     // Catch: java.lang.Throwable -> L86
            r0 = r5
        L68:
            r3.a()
        L6b:
            if (r0 != 0) goto L77
            com.alipay.sdk.m.l.c r4 = com.alipay.sdk.m.l.c.FAILED
            int r4 = r4.c()
            com.alipay.sdk.m.l.c r0 = com.alipay.sdk.m.l.c.a(r4)
        L77:
            int r4 = r0.c()
            java.lang.String r5 = r0.b()
            java.lang.String r6 = ""
            java.lang.String r4 = com.alipay.sdk.m.l.b.a(r4, r5, r6)
            return r4
        L86:
            r4 = move-exception
            r3.a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.b(android.app.Activity, java.lang.String, com.alipay.sdk.m.w.a):java.lang.String");
    }

    public final String a(Activity activity, String str, com.alipay.sdk.m.w.a aVar) {
        String a2 = aVar.a(str);
        List m = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || m == null) {
            m = com.alipay.sdk.m.l.a.d;
        }
        if (q.a(aVar, (Context) this.a, m, true)) {
            k kVar = new k(activity, aVar, b());
            String a3 = kVar.a(a2, false);
            kVar.a();
            if (!TextUtils.equals(a3, k.j) && !TextUtils.equals(a3, k.k)) {
                return TextUtils.isEmpty(a3) ? com.alipay.sdk.m.l.b.a() : a3;
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.i0);
            return b(activity, a2, aVar);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.j0);
        return b(activity, a2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
    
        a();
        com.alipay.sdk.m.m.a.b(r8.a, r9, r10, r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        com.alipay.sdk.m.o.b.i().a(r9, r8.a, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        if (com.alipay.sdk.m.o.b.i().t() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (com.alipay.sdk.m.o.b.i().t() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String innerAuth(com.alipay.sdk.m.w.a r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(com.alipay.sdk.m.w.a, java.lang.String, boolean):java.lang.String");
    }

    public final String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.v.b bVar) {
        String[] c2 = bVar.c();
        Bundle bundle = new Bundle();
        bundle.putString("url", c2[0]);
        Intent intent = new Intent(this.a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C0028a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String d = com.alipay.sdk.m.l.b.d();
        return TextUtils.isEmpty(d) ? com.alipay.sdk.m.l.b.a() : d;
    }
}
