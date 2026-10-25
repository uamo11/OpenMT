package com.alipay.sdk.m.n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.h;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class f {
    public static volatile f g;
    public static boolean h;
    public BroadcastReceiver f;
    public a a = new a("udid");
    public a b = new a(h.d);
    public a d = new a("vaid");
    public a c = new a("aaid");
    public c e = new c();

    public static d a(Cursor cursor) {
        d dVar = new d(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return dVar;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return dVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(com.alipay.sdk.m.u0.b.d);
        if (columnIndex >= 0) {
            dVar.a = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            dVar.b = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            dVar.c = cursor.getLong(columnIndex3);
            return dVar;
        }
        a("parseExpired fail, index < 0.");
        return dVar;
    }

    public static final f a() {
        if (g == null) {
            synchronized (f.class) {
                if (g == null) {
                    g = new f();
                }
            }
        }
        return g;
    }

    public static String a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static void a(String str) {
    }

    public static void a(boolean z) {
        h = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ("0".equals(r8.a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r8) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r7 == 0) goto L39
            com.alipay.sdk.m.n0.d r8 = a(r7)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r1 = r8.b     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L34
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r8 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r7.close()
            return r0
        L39:
            if (r7 == 0) goto L59
            goto L56
        L3c:
            r8 = move-exception
            goto L5a
        L3e:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L3c
            r1.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            a(r8)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L59
        L56:
            r7.close()
        L59:
            return r0
        L5a:
            if (r7 == 0) goto L5f
            r7.close()
        L5f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.n0.f.a(android.content.Context):boolean");
    }

    public static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            a("getAppVersion, Exception : " + e.getMessage());
            return null;
        }
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.a()) {
                return aVar.b;
            }
            if (a(context, true)) {
                return b(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    public final boolean a(Context context, boolean z) {
        if (this.e.a() && !z) {
            return this.e.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String a = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String b = b(packageManager, a);
        if (this.e.a() && this.e.a(b)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(b)));
            return this.e.b();
        }
        this.e.b(b);
        boolean a2 = a(context);
        a("query support, result : ".concat(String.valueOf(a2)));
        this.e.a(a2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(android.content.Context r8, com.alipay.sdk.m.n0.a r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r9.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r3 = r9.c     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String[] r5 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L73
            com.alipay.sdk.m.n0.d r4 = a(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r0 = r4.a     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r9.a(r0)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            long r5 = r4.c     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r9.a(r5)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r5 = r4.b     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r9.a(r5)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r5.<init>()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = r9.c     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r5.append(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = " errorCode : "
            r5.append(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r9 = r9.d     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r5.append(r9)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            a(r9)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r9 = r4.b     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r9 == r4) goto L8a
            r7.b(r8)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            boolean r9 = r7.a(r8, r3)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r9 != 0) goto L8a
            boolean r8 = r7.a(r8, r2)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r9 = "not support, forceQuery isSupported: "
            goto L7f
        L73:
            boolean r9 = r7.a(r8, r3)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r9 == 0) goto L8a
            boolean r8 = r7.a(r8, r2)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r9 = "forceQuery isSupported : "
        L7f:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r8 = r9.concat(r8)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            a(r8)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
        L8a:
            if (r1 == 0) goto L8d
            goto Lb1
        L8d:
            return r0
        L8e:
            r8 = move-exception
            goto Lb7
        L90:
            r8 = move-exception
            r9 = r0
            r0 = r1
            goto L98
        L94:
            r8 = move-exception
            goto Lb6
        L96:
            r8 = move-exception
            r9 = r0
        L98:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L94
            r1.append(r8)     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L94
            a(r8)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto Lb5
            r1 = r0
            r0 = r9
        Lb1:
            r1.close()
            r9 = r0
        Lb5:
            return r9
        Lb6:
            r1 = r0
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.n0.f.b(android.content.Context, com.alipay.sdk.m.n0.a):java.lang.String");
    }

    public final synchronized void b(Context context) {
        if (this.f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
