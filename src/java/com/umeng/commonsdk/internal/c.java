package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import l.C9045;
import org.json.JSONObject;

/* compiled from: 1474 */
/* loaded from: classes.dex */
public class c implements UMLogDataProtocol {
    public static final String a = "um_policy_grant";
    public static final String b = "preInitInvokedFlag";
    public static final String c = "policyGrantInvokedFlag";
    public static final String d = "policyGrantResult";
    public static int f = 1;
    public static final String g = "info";
    public static final String h = "stat";
    public static Class i;
    public static Method j;
    public static Method k;

    /* renamed from: l, reason: collision with root package name */
    public static Method f77948l;
    public static boolean m;
    public Context e;

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j2) {
        return null;
    }

    static {
        c();
    }

    public static void c() {
        try {
            i = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", null);
            if (declaredMethod != null) {
                j = declaredMethod;
            }
            Method declaredMethod2 = i.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                k = declaredMethod2;
            }
            Method declaredMethod3 = i.getDeclaredMethod("getSDKVersion", null);
            if (declaredMethod3 != null) {
                f77948l = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    public String a() {
        Method method;
        Class cls = i;
        if (cls == null || (method = j) == null || k == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, null);
            return invoke != null ? (String) k.invoke(invoke, this.e) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        Method method;
        Class cls = i;
        if (cls == null || (method = j) == null || f77948l == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, null);
            return invoke != null ? (String) f77948l.invoke(invoke, null) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public c(Context context) {
        if (context != null) {
            this.e = context.getApplicationContext();
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(am.x), "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (buildZeroEnvelopeWithExtHeader != null && buildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void b(Context context) {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, am.g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(am.g), imprintProperty);
            JSONObject buildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (buildSilentEnvelopeWithExtHeader != null && buildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        ao a2 = ao.a(this.e);
        ap a3 = a2.a(aq.c);
        if (a3 != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = a3.a;
                String str2 = a3.b;
                JSONObject a4 = new com.umeng.commonsdk.statistics.b().a(this.e.getApplicationContext(), new JSONObject(a3.c), new JSONObject(a3.d), a3.e, str2, a3.f);
                if (a4 != null && a4.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                }
                a2.a(aq.c, str);
                a2.b();
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = aa.a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(a2) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(h.c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(h.b, a2);
                        edit2.commit();
                    }
                    UMConfigureImpl.removeInterruptFlag();
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    public static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String a2 = aa.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(a2);
                }
            }
        }).start();
    }

    public static void d(final Context context) {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                        if (sharedPreferences == null || sharedPreferences.getString(h.b, "").equalsIgnoreCase(str)) {
                            return;
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(h.b, str);
                        edit.commit();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void e() {
        if (!m) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                m = true;
                a(this.e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                SharedPreferences sharedPreferences = c.this.e.getSharedPreferences(h.a, 0);
                                if (sharedPreferences != null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putString(h.b, str);
                                    edit.commit();
                                }
                            } catch (Throwable unused) {
                            }
                            UMWorkDispatch.sendEvent(c.this.e, a.w, b.a(c.this.e).a(), null);
                            return;
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                    }
                });
                return;
            }
            return;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        m = false;
    }

    private void f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.e);
            f++;
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (c.this.e != null) {
                        UMWorkDispatch.sendEvent(c.this.e, a.x, b.a(c.this.e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            c(this.e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.content.Context r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L4
            goto L8a
        L4:
            java.lang.String r0 = "um_rtd_conf"
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = com.umeng.common.b.a(r12, r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L8a
            java.lang.String r3 = "startTime"
            java.lang.String r3 = com.umeng.common.b.a(r12, r0, r3)
            java.lang.String r4 = "period"
            java.lang.String r4 = com.umeng.common.b.a(r12, r0, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            if (r5 != 0) goto L2f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            long r8 = r3.longValue()     // Catch: java.lang.Throwable -> L2f
            goto L30
        L2f:
            r8 = r6
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L3f
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L3f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L3f
            goto L40
        L3f:
            r3 = r6
        L40:
            java.lang.String r5 = "MobclickRT"
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L82
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 != 0) goto L4b
            goto L82
        L4b:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r8
            r8 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 * r8
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L6b
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r1)
            com.umeng.common.b.a(r12, r0)
            boolean r12 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r12 == 0) goto L8a
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L8a
        L6b:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r12.put(r1, r2)
            boolean r0 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r0 != 0) goto L8a
            java.lang.String r0 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r0)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r12)
            goto L8a
        L82:
            java.lang.String r1 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r1)
            com.umeng.common.b.a(r12, r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.e(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024e A[Catch: all -> 0x0410, TryCatch #0 {all -> 0x0410, blocks: (B:40:0x00dc, B:44:0x0105, B:51:0x011d, B:53:0x0137, B:55:0x013d, B:56:0x014d, B:58:0x0176, B:64:0x0180, B:66:0x0184, B:68:0x0196, B:86:0x020a, B:88:0x0221, B:90:0x022c, B:93:0x0233, B:95:0x0239, B:97:0x0244, B:101:0x024e, B:103:0x0254, B:105:0x025f, B:107:0x0265), top: B:19:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0265 A[Catch: all -> 0x0410, TRY_LEAVE, TryCatch #0 {all -> 0x0410, blocks: (B:40:0x00dc, B:44:0x0105, B:51:0x011d, B:53:0x0137, B:55:0x013d, B:56:0x014d, B:58:0x0176, B:64:0x0180, B:66:0x0184, B:68:0x0196, B:86:0x020a, B:88:0x0221, B:90:0x022c, B:93:0x0233, B:95:0x0239, B:97:0x0244, B:101:0x024e, B:103:0x0254, B:105:0x025f, B:107:0x0265), top: B:19:0x007d }] */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r12, int r13) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.workEvent(java.lang.Object, int):void");
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private void f(Context context) {
        Object invoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class a2 = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = a2.getDeclaredMethod("getInstance", null);
            if (declaredMethod2 == null || (invoke = declaredMethod2.invoke(a2, null)) == null || (declaredMethod = a2.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(invoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    private void g() {
        if (f <= 0) {
            h();
            f(this.e);
        }
    }

    public static void g(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        File file = new File(C9045.m23341(sb, File.separator, aq.f77926l));
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.e)) {
            g(this.e);
            com.umeng.commonsdk.a.a(this.e);
            Context context = this.e;
            UMWorkDispatch.sendEvent(context, o.a.y, CoreProtocol.getInstance(context), null);
            Context context2 = this.e;
            UMWorkDispatch.sendEvent(context2, a.t, b.a(context2).a(), null);
        }
    }
}
