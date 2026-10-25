package com.umeng.umzid;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.g;
import com.umeng.commonsdk.statistics.idtracking.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ZIDManager {
    public static ZIDManager c;
    public boolean a = false;
    public boolean b = false;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ IZIDCompletionCallback b;

        public a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.a = context;
            this.b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String a = ZIDManager.a(ZIDManager.this, this.a);
            if (TextUtils.isEmpty(a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(a);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.a(ZIDManager.this, this.a);
        }
    }

    public static /* synthetic */ String a(ZIDManager zIDManager, Context context) {
        String str = null;
        if (zIDManager.a) {
            return null;
        }
        zIDManager.a = true;
        JSONObject jSONObject = new JSONObject();
        try {
            String id = Spy.getID();
            jSONObject.put("zdata", id);
            String b2 = com.umeng.umzid.c.b(context);
            jSONObject.put(g.a, b2);
            String c2 = com.umeng.umzid.c.c(context);
            jSONObject.put(h.d, c2);
            zIDManager.a(context, jSONObject);
            String a2 = com.umeng.umzid.a.a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject2 = new JSONObject(a2);
                if (jSONObject2.optBoolean("suc")) {
                    com.umeng.umzid.c.f(context, id);
                    com.umeng.umzid.c.a(context, b2);
                    com.umeng.umzid.c.b(context, c2);
                    str = jSONObject2.optString("aaid");
                    if (!TextUtils.isEmpty(str)) {
                        com.umeng.umzid.c.e(context, str);
                    }
                    String string = jSONObject2.getString("uabc");
                    if (!TextUtils.isEmpty(string)) {
                        com.umeng.umzid.c.d(context, string);
                    }
                    String string2 = jSONObject2.getString("resetToken");
                    if (!TextUtils.isEmpty(string2)) {
                        com.umeng.umzid.c.c(context, string2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        zIDManager.a = false;
        return str;
    }

    public static synchronized ZIDManager getInstance() {
        ZIDManager zIDManager;
        synchronized (ZIDManager.class) {
            if (c == null) {
                c = new ZIDManager();
            }
            zIDManager = c;
        }
        return zIDManager;
    }

    public static String getSDKVersion() {
        return "1.4.1";
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String a2 = com.umeng.umzid.c.a(applicationContext);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        com.umeng.umzid.b.a(new c(applicationContext));
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: all -> 0x009d, TryCatch #1 {, blocks: (B:6:0x0006, B:10:0x000f, B:13:0x0017, B:16:0x0020, B:19:0x0028, B:21:0x002e, B:23:0x0034, B:25:0x003a, B:26:0x0043, B:28:0x0049, B:31:0x0050, B:33:0x005a, B:34:0x0066, B:36:0x006e, B:37:0x0076, B:39:0x007c, B:43:0x008e, B:48:0x005e), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0006, B:10:0x000f, B:13:0x0017, B:16:0x0020, B:19:0x0028, B:21:0x002e, B:23:0x0034, B:25:0x003a, B:26:0x0043, B:28:0x0049, B:31:0x0050, B:33:0x005a, B:34:0x0066, B:36:0x006e, B:37:0x0076, B:39:0x007c, B:43:0x008e, B:48:0x005e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void init(android.content.Context r5, java.lang.String r6, com.umeng.umzid.IZIDCompletionCallback r7) {
        /*
            r4 = this;
            r0 = r4
            monitor-enter(r0)
            if (r5 != 0) goto Lf
            if (r7 == 0) goto Ld
            java.lang.String r5 = "1001"
            java.lang.String r6 = "传入参数Context为null"
            r7.onFailure(r5, r6)     // Catch: java.lang.Throwable -> L9d
        Ld:
            monitor-exit(r0)
            return
        Lf:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L20
            if (r7 == 0) goto L1e
            java.lang.String r5 = "1003"
            java.lang.String r6 = "传入参数appkey为空"
            r7.onFailure(r5, r6)     // Catch: java.lang.Throwable -> L9d
        L1e:
            monitor-exit(r0)
            return
        L20:
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L43
            if (r6 == 0) goto L43
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L43
            android.content.SharedPreferences r2 = com.umeng.umzid.a.a(r1)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L43
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L43
            java.lang.String r3 = "appkey"
            android.content.SharedPreferences$Editor r6 = r2.putString(r3, r6)     // Catch: java.lang.Throwable -> L9d
            r6.commit()     // Catch: java.lang.Throwable -> L9d
        L43:
            java.lang.String r6 = com.umeng.umzid.c.a(r1)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L5e
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L50
            goto L5e
        L50:
            com.umeng.umzid.ZIDManager$b r2 = new com.umeng.umzid.ZIDManager$b     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L9d
            com.umeng.umzid.b.a(r2)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L66
            r7.onSuccess(r6)     // Catch: java.lang.Throwable -> L9d
            goto L66
        L5e:
            com.umeng.umzid.ZIDManager$a r6 = new com.umeng.umzid.ZIDManager$a     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L9d
            com.umeng.umzid.b.a(r6)     // Catch: java.lang.Throwable -> L9d
        L66:
            java.lang.String r6 = ""
            android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r5)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L76
            java.lang.String r6 = "uuid"
            java.lang.String r1 = ""
            java.lang.String r6 = r7.getString(r6, r1)     // Catch: java.lang.Throwable -> L9d
        L76:
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L9b
            java.lang.String r6 = ""
            android.content.SharedPreferences r5 = com.umeng.umzid.a.a(r5)     // Catch: java.lang.Throwable -> L9d
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L8b
            goto L8c
        L8b:
        L8c:
            if (r5 == 0) goto L9b
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "uuid"
            android.content.SharedPreferences$Editor r5 = r5.putString(r7, r6)     // Catch: java.lang.Throwable -> L9d
            r5.commit()     // Catch: java.lang.Throwable -> L9d
        L9b:
            monitor-exit(r0)
            return
        L9d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.init(android.content.Context, java.lang.String, com.umeng.umzid.IZIDCompletionCallback):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|(4:2|3|4|5)|(2:7|(42:11|12|(1:113)(1:16)|17|(5:101|102|(2:109|110)|104|(37:106|20|21|22|23|24|(2:26|(30:30|31|32|33|34|35|(3:82|83|(5:85|86|(2:89|87)|90|91))|37|(1:39)(1:81)|40|(1:42)(1:80)|43|44|45|46|47|48|49|50|51|52|(1:56)|57|58|59|60|61|(2:63|(2:67|68))|70|71))|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(2:54|56)|57|58|59|60|61|(0)|70|71))|19|20|21|22|23|24|(0)|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(0)|57|58|59|60|61|(0)|70|71))|115|12|(1:14)|113|17|(0)|19|20|21|22|23|24|(0)|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(0)|57|58|59|60|61|(0)|70|71) */
    /* JADX WARN: Can't wrap try/catch for region: R(50:0|1|2|3|4|5|(2:7|(42:11|12|(1:113)(1:16)|17|(5:101|102|(2:109|110)|104|(37:106|20|21|22|23|24|(2:26|(30:30|31|32|33|34|35|(3:82|83|(5:85|86|(2:89|87)|90|91))|37|(1:39)(1:81)|40|(1:42)(1:80)|43|44|45|46|47|48|49|50|51|52|(1:56)|57|58|59|60|61|(2:63|(2:67|68))|70|71))|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(2:54|56)|57|58|59|60|61|(0)|70|71))|19|20|21|22|23|24|(0)|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(0)|57|58|59|60|61|(0)|70|71))|115|12|(1:14)|113|17|(0)|19|20|21|22|23|24|(0)|99|31|32|33|34|35|(0)|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|50|51|52|(0)|57|58|59|60|61|(0)|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0192, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9 A[Catch: all -> 0x00cd, TryCatch #8 {all -> 0x00cd, blocks: (B:22:0x00ab, B:24:0x00af, B:26:0x00b9, B:28:0x00c6, B:30:0x00ca), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cc A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:59:0x01be, B:61:0x01c2, B:63:0x01cc, B:65:0x01d9, B:67:0x01dd), top: B:58:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a(android.content.Context r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }

    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #0 {all -> 0x00ff, blocks: (B:61:0x0019, B:63:0x001f, B:8:0x0026, B:11:0x0036, B:13:0x003c, B:15:0x0046, B:16:0x004c, B:19:0x005c, B:21:0x0062, B:23:0x006c, B:24:0x0072, B:27:0x008c, B:29:0x0092, B:30:0x0098, B:33:0x009f, B:35:0x00a5, B:36:0x00a9, B:38:0x00af, B:40:0x00b4, B:42:0x00c2, B:44:0x00cf, B:46:0x00e2, B:47:0x00e5, B:49:0x00ef, B:50:0x00f2, B:52:0x00fc), top: B:60:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[Catch: all -> 0x00ff, TryCatch #0 {all -> 0x00ff, blocks: (B:61:0x0019, B:63:0x001f, B:8:0x0026, B:11:0x0036, B:13:0x003c, B:15:0x0046, B:16:0x004c, B:19:0x005c, B:21:0x0062, B:23:0x006c, B:24:0x0072, B:27:0x008c, B:29:0x0092, B:30:0x0098, B:33:0x009f, B:35:0x00a5, B:36:0x00a9, B:38:0x00af, B:40:0x00b4, B:42:0x00c2, B:44:0x00cf, B:46:0x00e2, B:47:0x00e5, B:49:0x00ef, B:50:0x00f2, B:52:0x00fc), top: B:60:0x0019 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = "aaid"
                com.umeng.umzid.ZIDManager r1 = com.umeng.umzid.ZIDManager.this
                android.content.Context r2 = r12.a
                boolean r3 = r1.b
                if (r3 == 0) goto Lb
                return
            Lb:
                r3 = 1
                r1.b = r3
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
                java.lang.String r5 = "zdata"
                java.lang.String r6 = ""
                if (r2 == 0) goto L25
                android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r2)     // Catch: java.lang.Throwable -> Lff
                if (r7 == 0) goto L25
                r8 = 0
                java.lang.String r7 = r7.getString(r5, r8)     // Catch: java.lang.Throwable -> Lff
                goto L26
            L25:
                r7 = r6
            L26:
                java.lang.String r8 = com.umeng.umzid.Spy.getID()     // Catch: java.lang.Throwable -> Lff
                r4.put(r5, r8)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = "old_zdata"
                r4.put(r5, r7)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = "oaid"
                if (r2 == 0) goto L4b
                android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r2)     // Catch: java.lang.Throwable -> Lff
                if (r7 == 0) goto L4b
                java.lang.String r7 = r7.getString(r5, r6)     // Catch: java.lang.Throwable -> Lff
                boolean r9 = com.umeng.umzid.c.c(r7)     // Catch: java.lang.Throwable -> Lff
                if (r9 == 0) goto L4c
                java.lang.String r7 = com.umeng.umzid.c.a(r7)     // Catch: java.lang.Throwable -> Lff
                goto L4c
            L4b:
                r7 = r6
            L4c:
                java.lang.String r9 = com.umeng.umzid.c.c(r2)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r10 = "old_oaid"
                r4.put(r10, r7)     // Catch: java.lang.Throwable -> Lff
                r4.put(r5, r9)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = "mac"
                if (r2 == 0) goto L71
                android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r2)     // Catch: java.lang.Throwable -> Lff
                if (r7 == 0) goto L71
                java.lang.String r7 = r7.getString(r5, r6)     // Catch: java.lang.Throwable -> Lff
                boolean r10 = com.umeng.umzid.c.c(r7)     // Catch: java.lang.Throwable -> Lff
                if (r10 == 0) goto L72
                java.lang.String r7 = com.umeng.umzid.c.a(r7)     // Catch: java.lang.Throwable -> Lff
                goto L72
            L71:
                r7 = r6
            L72:
                java.lang.String r10 = com.umeng.umzid.c.b(r2)     // Catch: java.lang.Throwable -> Lff
                r4.put(r5, r10)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = "old_mac"
                r4.put(r5, r7)     // Catch: java.lang.Throwable -> Lff
                r1.a(r2, r4)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = com.umeng.umzid.c.a(r2)     // Catch: java.lang.Throwable -> Lff
                r4.put(r0, r5)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r5 = "uabc"
                if (r2 == 0) goto L97
                android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r2)     // Catch: java.lang.Throwable -> Lff
                if (r7 == 0) goto L97
                java.lang.String r7 = r7.getString(r5, r6)     // Catch: java.lang.Throwable -> Lff
                goto L98
            L97:
                r7 = r6
            L98:
                r4.put(r5, r7)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r7 = "resetToken"
                if (r2 == 0) goto La9
                android.content.SharedPreferences r11 = com.umeng.umzid.a.a(r2)     // Catch: java.lang.Throwable -> Lff
                if (r11 == 0) goto La9
                java.lang.String r6 = r11.getString(r7, r6)     // Catch: java.lang.Throwable -> Lff
            La9:
                boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lff
                if (r11 != 0) goto Lb2
                r4.put(r7, r6)     // Catch: java.lang.Throwable -> Lff
            Lb2:
                java.lang.String r6 = "https://aaid.umeng.com/api/updateZdata"
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lff
                java.lang.String r4 = com.umeng.umzid.a.a(r6, r4)     // Catch: java.lang.Throwable -> Lff
                boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lff
                if (r6 != 0) goto Lff
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lff
                r6.<init>(r4)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r4 = "suc"
                boolean r4 = r6.optBoolean(r4)     // Catch: java.lang.Throwable -> Lff
                if (r4 != r3) goto Lff
                com.umeng.umzid.c.f(r2, r8)     // Catch: java.lang.Throwable -> Lff
                com.umeng.umzid.c.a(r2, r10)     // Catch: java.lang.Throwable -> Lff
                com.umeng.umzid.c.b(r2, r9)     // Catch: java.lang.Throwable -> Lff
                java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> Lff
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lff
                if (r3 != 0) goto Le5
                com.umeng.umzid.c.e(r2, r0)     // Catch: java.lang.Throwable -> Lff
            Le5:
                java.lang.String r0 = r6.getString(r5)     // Catch: java.lang.Throwable -> Lff
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lff
                if (r3 != 0) goto Lf2
                com.umeng.umzid.c.d(r2, r0)     // Catch: java.lang.Throwable -> Lff
            Lf2:
                java.lang.String r0 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lff
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lff
                if (r3 != 0) goto Lff
                com.umeng.umzid.c.c(r2, r0)     // Catch: java.lang.Throwable -> Lff
            Lff:
                r0 = 0
                r1.b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.b.run():void");
        }
    }
}
