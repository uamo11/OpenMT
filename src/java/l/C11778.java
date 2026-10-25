package l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: 51RR */
/* renamed from: l.ۨܶۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11778 {

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C11778 f35142;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35145;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f35143 = "";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f35147 = "";

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f35149 = "";

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f35151 = "";

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f35150 = "";

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f35148 = "";

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f35153 = "";

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f35144 = C16895.m39756();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f35152 = C16895.m39756();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Executor f35146 = C16926.m39770();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C11778 m28815() {
        C11778 c11778;
        synchronized (C11778.class) {
            if (f35142 == null) {
                f35142 = new C11778();
            }
            c11778 = f35142;
        }
        return c11778;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28818(Context context) {
        C9145.m23520("AttaReporter", "init");
        this.f35143 = "101492915";
        this.f35147 = C7733.m20713(context);
        this.f35151 = C18338.m42744(context, C22927.m51027());
        this.f35150 = C22927.m51027();
        this.f35148 = C7733.m20719(context) ? "1" : "0";
        this.f35153 = C18338.m42742(context);
        while (true) {
            List list = this.f35152;
            if (list.isEmpty()) {
                break;
            }
            C23066 c23066 = (C23066) list.remove(0);
            HashMap hashMap = c23066.f74196;
            hashMap.put(c.d, this.f35143);
            hashMap.put("app_name", this.f35147);
            hashMap.put("app_ver", this.f35151);
            hashMap.put("pkg_name", this.f35150);
            hashMap.put("qq_install", this.f35148);
            hashMap.put("qq_ver", this.f35153);
            hashMap.put("openid", this.f35149);
            hashMap.put("time_appid_openid", ((String) hashMap.get("time")) + "_" + this.f35143 + "_" + this.f35149);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c23066);
            C9145.m23520("AttaReporter", sb.toString());
            this.f35144.add(c23066);
        }
        Context m51019 = C22927.m51019();
        if (m51019 == null) {
            return;
        }
        m51019.deleteDatabase("sdk_report.db");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28819(String str) {
        C9145.m23520("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f35149 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28820(String str, String str2, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("attaid", "09400051119");
        hashMap.put("token", "9389887874");
        hashMap.put("time_appid_openid", currentTimeMillis + "_" + this.f35143 + "_" + this.f35149);
        hashMap.put("time", String.valueOf(currentTimeMillis));
        hashMap.put("openid", this.f35149);
        hashMap.put(c.d, this.f35143);
        hashMap.put("app_name", this.f35147);
        hashMap.put("app_ver", this.f35151);
        hashMap.put("pkg_name", this.f35150);
        hashMap.put(am.x, "AND");
        hashMap.put("os_ver", Build.VERSION.RELEASE);
        hashMap.put("sdk_ver", "3.5.18.lite");
        hashMap.put("mn", C10556.m26534().m26539());
        hashMap.put("interface_name", str);
        hashMap.put("interface_data", str2);
        hashMap.put("interface_result", obj == null ? "" : obj.toString());
        hashMap.put("qq_install", this.f35148);
        hashMap.put("qq_ver", this.f35153);
        C23066 c23066 = new C23066(hashMap);
        if (TextUtils.isEmpty(this.f35143) || TextUtils.isEmpty(this.f35147) || C22927.m51019() == null) {
            C9145.m23520("AttaReporter", "attaReport cancel appid=" + this.f35143 + ", mAppName=" + this.f35147 + ", context=" + C22927.m51019() + ", " + c23066);
            this.f35152.add(c23066);
            return;
        }
        this.f35146.execute(new RunnableC6133(this, c23066));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r1.add(r3);
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28817(l.C11778 r9) {
        /*
            java.util.List r0 = r9.f35144
            java.lang.String r1 = "attaReportAtSubThread"
            java.lang.String r2 = "AttaReporter"
            l.C9145.m23520(r2, r1)
            boolean r1 = r9.f35145
            if (r1 != 0) goto L3c
            java.util.List r1 = l.C16895.m39756()
            boolean r3 = r1.isEmpty()
            r9.f35145 = r3
            r0.addAll(r1)
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()
            java.io.Serializable r3 = (java.io.Serializable) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "attaReportAtSubThread from db = "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            l.C9145.m23520(r2, r3)
            goto L1e
        L3c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L41:
            boolean r3 = r0.isEmpty()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L86
            java.lang.Object r3 = r0.remove(r5)
            l.᩺ܶۘ r3 = (l.C23066) r3
        L4f:
            int r5 = r5 + r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r6.<init>()     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = "doAttaReportItem post "
            r6.append(r7)     // Catch: java.lang.Exception -> L79
            r6.append(r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L79
            l.C9145.m23520(r2, r6)     // Catch: java.lang.Exception -> L79
            l.᩶ܶۘ r6 = l.C20245.m46489()     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = "https://h.trace.qq.com/kv"
            java.util.HashMap r8 = r3.f74196     // Catch: java.lang.Exception -> L79
            l.ۙܶۘ r6 = r6.m46494(r8, r7)     // Catch: java.lang.Exception -> L79
            int r4 = r6.d()     // Catch: java.lang.Exception -> L79
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L82
            goto L41
        L79:
            r6 = move-exception
            java.lang.String r7 = "Exception"
            l.C9145.m23517(r2, r7, r6)
            r6 = 2
            if (r5 < r6) goto L4f
        L82:
            r1.add(r3)
            goto L41
        L86:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "attaReportAtSubThread fail size="
            r0.<init>(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            l.C9145.m23520(r2, r0)
            java.util.Iterator r0 = r1.iterator()
        La5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r0.next()
            java.io.Serializable r1 = (java.io.Serializable) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "attaReportAtSubThread fail cache to db, "
            r3.<init>(r4)
            l.᩺ܶۘ r1 = (l.C23066) r1
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            l.C9145.m23520(r2, r1)
            goto La5
        Lc5:
            r9.f35145 = r5
            goto Ld3
        Lc8:
            boolean r0 = r9.f35145
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "attaReportAtSubThread clear db"
            l.C9145.m23520(r2, r0)
            r9.f35145 = r4
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11778.m28817(l.ۨܶۘ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28816() {
        return m28815().f35143;
    }
}
