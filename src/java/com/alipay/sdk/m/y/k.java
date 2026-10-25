package com.alipay.sdk.m.y;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import java.util.HashMap;
import java.util.Map;
import l.C22870;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class k {
    public static final String i = "sp_bind_failed";
    public static final String j = "failed";
    public static final String k = "scheme_failed";
    public Activity a;
    public volatile IAlixPay b;
    public boolean d;
    public f e;
    public final com.alipay.sdk.m.w.a f;
    public final Object c = IAlixPay.class;
    public boolean g = false;
    public String h = null;

    /* compiled from: N673 */
    public class a implements APayEntranceActivity.a {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            k.this.h = str;
            synchronized (this.a) {
                try {
                    this.a.notify();
                } finally {
                }
            }
        }
    }

    /* compiled from: N673 */
    public class b implements Runnable {
        public final /* synthetic */ APayEntranceActivity.a a;

        public b(APayEntranceActivity.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f == null || k.this.f.h()) {
                return;
            }
            com.alipay.sdk.m.m.a.b(k.this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.e0, "");
            if (com.alipay.sdk.m.o.b.i().y()) {
                k.this.f.b(true);
                this.a.a(com.alipay.sdk.m.l.b.a());
            }
        }
    }

    /* compiled from: N673 */
    public class c implements Runnable {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ Object b;

        public c(Intent intent, Object obj) {
            this.a = intent;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (k.this.a != null) {
                    k.this.a.startActivity(this.a);
                    return;
                }
                com.alipay.sdk.m.m.a.b(k.this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.c0, "");
                Context b = k.this.f.b();
                if (b != null) {
                    b.startActivity(this.a);
                }
            } finally {
            }
        }
    }

    /* compiled from: N673 */
    public class d extends IRemoteServiceCallback.Stub {
        public d() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) {
            com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (k.this.e != null) {
                    k.this.e.a();
                }
                if (k.this.f != null) {
                    k.this.f.c(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.Z, e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (k.this.a == null) {
                    com.alipay.sdk.m.m.a.b(k.this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.a0, "");
                    Context b = k.this.f.b();
                    if (b != null) {
                        b.startActivity(intent);
                        return;
                    }
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                k.this.a.startActivity(intent);
                com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, "stAct2", "" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.b0, th);
                throw th;
            }
        }

        public /* synthetic */ d(k kVar, a aVar) {
            this();
        }
    }

    /* compiled from: N673 */
    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, "srvCon");
            synchronized (k.this.c) {
                k.this.b = IAlixPay.Stub.asInterface(iBinder);
                k.this.c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.alipay.sdk.m.m.a.a(k.this.f, com.alipay.sdk.m.m.b.f77909l, "srvDis");
            k.this.b = null;
        }

        public /* synthetic */ e(k kVar, a aVar) {
            this();
        }
    }

    /* compiled from: N673 */
    public interface f {
        void a();

        void b();
    }

    public k(Activity activity, com.alipay.sdk.m.w.a aVar, f fVar) {
        this.a = activity;
        this.f = aVar;
        this.e = fVar;
        g.d(com.alipay.sdk.m.n.a.B, "alipaySdk");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #3 {all -> 0x00ad, blocks: (B:12:0x0023, B:14:0x002b, B:17:0x0033, B:20:0x003c, B:22:0x0040, B:25:0x004b, B:26:0x0054, B:29:0x0059, B:31:0x0063, B:72:0x0050), top: B:11:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            com.alipay.sdk.m.o.b r2 = com.alipay.sdk.m.o.b.i()     // Catch: java.lang.Throwable -> Lb0
            java.util.List r2 = r2.m()     // Catch: java.lang.Throwable -> Lb0
            com.alipay.sdk.m.o.b r3 = com.alipay.sdk.m.o.b.i()     // Catch: java.lang.Throwable -> Lb0
            boolean r3 = r3.g     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L15
            if (r2 != 0) goto L17
        L15:
            java.util.List r2 = com.alipay.sdk.m.l.a.d     // Catch: java.lang.Throwable -> Lb0
        L17:
            com.alipay.sdk.m.w.a r3 = r8.f     // Catch: java.lang.Throwable -> Lb0
            android.app.Activity r4 = r8.a     // Catch: java.lang.Throwable -> Lb0
            com.alipay.sdk.m.y.q$c r2 = com.alipay.sdk.m.y.q.a(r3, r4, r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "failed"
            if (r2 == 0) goto Laf
            com.alipay.sdk.m.w.a r4 = r8.f     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r2.a(r4)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto Laf
            boolean r4 = r2.a()     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L33
            goto Laf
        L33:
            android.content.pm.PackageInfo r4 = r2.a     // Catch: java.lang.Throwable -> Lad
            boolean r4 = com.alipay.sdk.m.y.q.a(r4)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L3c
            return r3
        L3c:
            android.content.pm.PackageInfo r3 = r2.a     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L50
            java.lang.String r4 = "com.eg.android.AlipayGphone"
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L4b
            goto L50
        L4b:
            android.content.pm.PackageInfo r3 = r2.a     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r3.packageName     // Catch: java.lang.Throwable -> Lad
            goto L54
        L50:
            java.lang.String r0 = com.alipay.sdk.m.y.q.b()     // Catch: java.lang.Throwable -> Lad
        L54:
            android.content.pm.PackageInfo r3 = r2.a     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L59
            r1 = r3
        L59:
            com.alipay.sdk.m.o.b r3 = com.alipay.sdk.m.o.b.i()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto Lbc
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lad
            if (r4 <= 0) goto Lbc
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lab
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto Lbc
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lab
            if (r4 <= 0) goto Lbc
            java.util.Iterator r4 = r3.keys()     // Catch: java.lang.Throwable -> Lab
        L7e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lab
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L7e
            int r7 = r1.versionCode     // Catch: java.lang.Throwable -> Lab
            if (r7 < r6) goto L7e
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            com.alipay.sdk.m.o.b r6 = com.alipay.sdk.m.o.b.i()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            android.app.Activity r7 = r8.a     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            boolean r5 = r6.a(r7, r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            r8.g = r5     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lab
            if (r5 == 0) goto L7e
            goto Lbc
        Lab:
            goto Lbc
        Lad:
            r3 = move-exception
            goto Lb3
        Laf:
            return r3
        Lb0:
            r2 = move-exception
            r3 = r2
            r2 = r1
        Lb3:
            com.alipay.sdk.m.w.a r4 = r8.f
            java.lang.String r5 = "biz"
            java.lang.String r6 = "CheckClientSignEx"
            com.alipay.sdk.m.m.a.a(r4, r5, r6, r3)
        Lbc:
            com.alipay.sdk.m.w.a r3 = r8.f
            boolean r3 = com.alipay.sdk.m.y.q.b(r3)
            if (r10 != 0) goto Lc8
            boolean r10 = r8.g
            if (r10 == 0) goto Ld9
        Lc8:
            if (r3 != 0) goto Ld9
            android.app.Activity r10 = r8.a
            com.alipay.sdk.m.w.a r3 = r8.f
            boolean r10 = a(r0, r10, r3)
            if (r10 == 0) goto Ld9
            java.lang.String r9 = r8.a(r9, r0, r1)
            return r9
        Ld9:
            java.lang.String r9 = r8.a(r9, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.y.k.a(java.lang.String, boolean):java.lang.String");
    }

    public final void a(q.c cVar) {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.a) == null) {
            return;
        }
        if (!com.alipay.sdk.m.o.b.i().b(this.f)) {
            com.alipay.sdk.m.w.a aVar = this.f;
            String a2 = m.a(aVar, aVar.b(), i, "false");
            g.d(com.alipay.sdk.m.n.a.B, "get SP_BIND_FAILED: " + a2);
            if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "false")) {
                return;
            }
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.a.startActivity(intent);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.g0, th);
        }
        Thread.sleep(200L);
    }

    public final String a(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        g.d(com.alipay.sdk.m.n.a.B, "pay payInvokeAct");
        com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.X, C22870.m50967(str2, "|", str3));
        Activity activity = this.a;
        com.alipay.sdk.m.w.a aVar = this.f;
        com.alipay.sdk.m.m.a.a(activity, aVar, str, aVar.d);
        return a(str, str2);
    }

    public final String a(String str, String str2, PackageInfo packageInfo, q.c cVar) {
        String str3;
        Activity activity;
        boolean z = false;
        int i2 = packageInfo != null ? packageInfo.versionCode : 0;
        g.d(com.alipay.sdk.m.n.a.B, "pay bind or scheme");
        com.alipay.sdk.m.w.a aVar = this.f;
        if (aVar != null && !TextUtils.isEmpty(aVar.g)) {
            z = this.f.g.toLowerCase().contains(com.alipay.sdk.m.m.b.n);
        }
        if (!z && q.d(this.f, str2)) {
            if (cVar != null) {
                try {
                    if (com.alipay.sdk.m.o.b.i().C()) {
                        a(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BindSkipByL");
            str3 = j;
        } else {
            if (cVar != null) {
                try {
                    if (!com.alipay.sdk.m.o.b.i().r()) {
                        a(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            Pair a2 = a(str, str2, this.f);
            str3 = (String) a2.first;
            try {
                if (j.equals(str3) && ((Boolean) a2.second).booleanValue() && com.alipay.sdk.m.o.b.i().p()) {
                    com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BindRetry");
                    str3 = (String) a(str, str2, this.f).first;
                }
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BindRetryEx", th);
            }
        }
        g.d(com.alipay.sdk.m.n.a.B, "pay bind result: " + str3);
        Activity activity2 = this.a;
        com.alipay.sdk.m.w.a aVar2 = this.f;
        com.alipay.sdk.m.m.a.a(activity2, aVar2, str, aVar2.d);
        if (j.equals(str3)) {
            if (!com.alipay.sdk.m.o.b.i().b(this.f)) {
                g.d(com.alipay.sdk.m.n.a.B, "save SP_BIND_FAILED: true");
                com.alipay.sdk.m.w.a aVar3 = this.f;
                m.b(aVar3, aVar3.b(), i, "true");
            }
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSPNotStartByAlipay", str2 + "|" + i2);
                return str3;
            }
            if (i2 >= 460 && !z && (activity = this.a) != null && a(str2, activity, this.f)) {
                return a(str, str2, packageInfo);
            }
        }
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(java.lang.String r18, java.lang.String r19, com.alipay.sdk.m.w.a r20) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.y.k.a(java.lang.String, java.lang.String, com.alipay.sdk.m.w.a):android.util.Pair");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String a(String str, String str2) {
        JSONObject jSONObject;
        String str3;
        Object obj = new Object();
        String a2 = q.a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSAStart", a2 + "|" + elapsedRealtime);
        a.C0028a.a(this.f, a2);
        a aVar = new a(obj);
        APayEntranceActivity.h.put(a2, aVar);
        try {
            HashMap a3 = com.alipay.sdk.m.w.a.a(this.f);
            a3.put("ts_intent", String.valueOf(elapsedRealtime));
            jSONObject = new JSONObject(a3);
        } catch (Throwable th) {
            try {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e2) {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSAWaiting", e2);
                com.alipay.sdk.m.l.c cVar = com.alipay.sdk.m.l.c.PAY_WAITTING;
                return com.alipay.sdk.m.l.b.a(cVar.c(), cVar.b(), "");
            } catch (Throwable th2) {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSAEx", th2);
                q.a("alipaySdk", com.alipay.sdk.m.n.b.q, this.a, this.f);
                return k;
            }
        }
        Intent intent = new Intent(this.a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.d, str);
        intent.putExtra(APayEntranceActivity.e, str2);
        intent.putExtra(APayEntranceActivity.f, a2);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.g, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(aVar), com.alipay.sdk.m.o.b.i().l());
        Activity activity = this.a;
        com.alipay.sdk.m.w.a aVar2 = this.f;
        com.alipay.sdk.m.m.a.a(activity, aVar2, str, aVar2.d);
        if (com.alipay.sdk.m.o.b.i().B()) {
            new Handler(Looper.getMainLooper()).post(new c(intent, obj));
        } else {
            try {
                Activity activity2 = this.a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    com.alipay.sdk.m.m.a.b(this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.a0, "");
                    Context b2 = this.f.b();
                    if (b2 != null) {
                        b2.startActivity(intent);
                    }
                }
            } catch (Throwable th3) {
                com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.b0, th3);
                throw th3;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str4 = this.h;
        try {
            str3 = (String) o.a(this.f, str4).get(o.a);
            if (str3 == null) {
                str3 = "null";
            }
        } catch (Throwable th4) {
            str3 = "unknown";
            com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSAStatEx", th4);
        }
        com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSADone-" + str3);
        if (!TextUtils.isEmpty(str4)) {
            return str4;
        }
        com.alipay.sdk.m.m.a.a(this.f, com.alipay.sdk.m.m.b.f77909l, "BSAEmpty");
        return k;
    }

    public void a() {
        this.a = null;
        this.e = null;
    }

    public static boolean a(String str, Context context, com.alipay.sdk.m.w.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "BSADetectFail");
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "BSADetectFail", th);
            return false;
        }
    }
}
