package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import com.alipay.sdk.m.u0.b;
import com.umeng.commonsdk.statistics.idtracking.h;

/* renamed from: l.᩶ܳ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20221 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile C20221 f65411;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f65414;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1170 f65412 = new C1170("udid");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1170 f65413 = new C1170(h.d);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1170 f65417 = new C1170("vaid");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1170 f65415 = new C1170("aaid");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15280 f65416 = new C15280();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20221 m46454() {
        if (f65411 == null) {
            synchronized (C20221.class) {
                if (f65411 == null) {
                    f65411 = new C20221();
                }
            }
        }
        return f65411;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21632 m46455(Cursor cursor) {
        C21632 c21632 = new C21632();
        c21632.f69451 = null;
        c21632.f69452 = 0;
        c21632.f69453 = System.currentTimeMillis() + 86400000;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(b.d);
            if (columnIndex >= 0) {
                c21632.f69451 = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c21632.f69452 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c21632.f69453 = cursor.getLong(columnIndex3);
            }
        }
        return c21632;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m46456(Context context) {
        if (this.f65414 != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C22337 c22337 = new C22337();
        this.f65414 = c22337;
        context.registerReceiver(c22337, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m46457(android.content.Context r10, l.C1170 r11) {
        /*
            r9 = this;
            long r0 = r11.f4216
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld
            java.lang.String r10 = r11.f4217
            return r10
        Ld:
            r0 = 1
            boolean r1 = r9.m46458(r10, r0)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r4 = android.net.Uri.parse(r1)
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String r1 = r11.f4218     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String[] r7 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r3 = 0
            if (r1 == 0) goto L52
            l.᩸ܳ֨ r4 = m46455(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r2 = r4.f69451     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r11.f4217 = r2     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            long r5 = r4.f69453     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r11.f4216 = r5     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            int r11 = r4.f69452     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r4) goto L65
            r9.m46456(r10)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            boolean r11 = r9.m46458(r10, r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r11 != 0) goto L65
            boolean r10 = r9.m46458(r10, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r11 = "not support, forceQuery isSupported: "
            goto L5e
        L52:
            boolean r11 = r9.m46458(r10, r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r11 == 0) goto L65
            boolean r10 = r9.m46458(r10, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r11 = "forceQuery isSupported : "
        L5e:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r11.concat(r10)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
        L65:
            if (r1 == 0) goto L6a
            r1.close()
        L6a:
            return r2
        L6b:
            r10 = move-exception
            goto L7f
        L6d:
            r10 = move-exception
            r11 = r2
            r2 = r1
            goto L75
        L71:
            r10 = move-exception
            goto L7e
        L73:
            r10 = move-exception
            r11 = r2
        L75:
            r10.getMessage()     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L7d
            r2.close()
        L7d:
            return r11
        L7e:
            r1 = r2
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20221.m46457(android.content.Context, l.֨ܳ֨):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(10:22|23|(3:25|(1:27)(1:34)|(2:29|(2:31|32)(1:33)))|35|36|37|(3:39|(1:41)|48)(0)|43|44|45)|36|37|(0)(0)|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        if ("0".equals(r11.f69451) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (r3 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        r11.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[Catch: all -> 0x00a4, Exception -> 0x00a6, TryCatch #1 {Exception -> 0x00a6, blocks: (B:37:0x0077, B:39:0x008a, B:41:0x0094), top: B:36:0x0077, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m46458(android.content.Context r11, boolean r12) {
        /*
            r10 = this;
            l.ܶܳ֨ r0 = r10.f65416
            boolean r1 = r0.m36286()
            r2 = 0
            if (r1 == 0) goto L15
            if (r12 != 0) goto L15
            java.lang.Boolean r11 = r0.f46879
            if (r11 == 0) goto L14
            boolean r11 = r11.booleanValue()
            return r11
        L14:
            return r2
        L15:
            android.content.pm.PackageManager r12 = r11.getPackageManager()
            if (r12 != 0) goto L1c
            goto L38
        L1c:
            java.lang.String r1 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r1 = r12.resolveContentProvider(r1, r2)
            r3 = 0
            if (r1 != 0) goto L26
            goto L2e
        L26:
            android.content.pm.ApplicationInfo r4 = r1.applicationInfo
            int r4 = r4.flags
            r4 = r4 & 1
            if (r4 != 0) goto L30
        L2e:
            r1 = r3
            goto L32
        L30:
            java.lang.String r1 = r1.packageName
        L32:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L39
        L38:
            return r2
        L39:
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L42
            if (r12 == 0) goto L46
            java.lang.String r12 = r12.versionName     // Catch: java.lang.Exception -> L42
            goto L47
        L42:
            r12 = move-exception
            r12.getMessage()
        L46:
            r12 = r3
        L47:
            boolean r1 = r0.m36286()
            if (r1 == 0) goto L6f
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L55
            r1 = 0
            goto L5b
        L55:
            java.lang.String r1 = r0.f46878
            boolean r1 = android.text.TextUtils.equals(r1, r12)
        L5b:
            if (r1 == 0) goto L6f
            java.lang.String r11 = "use same version cache, safeVersion : "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11.concat(r12)
            java.lang.Boolean r11 = r0.f46879
            if (r11 == 0) goto L6e
            boolean r2 = r11.booleanValue()
        L6e:
            return r2
        L6f:
            r0.f46878 = r12
            java.lang.String r12 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r5 = android.net.Uri.parse(r12)
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r11 = "supported"
            java.lang.String[] r8 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r3 == 0) goto La1
            l.᩸ܳ֨ r11 = m46455(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            int r12 = r11.f69452     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r12) goto L9e
            java.lang.String r12 = "0"
            java.lang.String r11 = r11.f69451     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r11 == 0) goto Lac
        L9e:
            r11 = 1
            r2 = 1
            goto Lac
        La1:
            if (r3 == 0) goto Laf
            goto Lac
        La4:
            r11 = move-exception
            goto Lbf
        La6:
            r11 = move-exception
            r11.getMessage()     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto Laf
        Lac:
            r3.close()
        Laf:
            java.lang.String r11 = "query support, result : "
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r11.concat(r12)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            r0.f46879 = r11
            return r2
        Lbf:
            if (r3 == 0) goto Lc4
            r3.close()
        Lc4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20221.m46458(android.content.Context, boolean):boolean");
    }
}
