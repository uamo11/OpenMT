package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.idtracking.i;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: V45U */
/* loaded from: classes.dex */
public class b {
    public static String a = null;
    public static String b = "";
    public static final String c = "EnvelopeManager";
    public static final String d = "debug.umeng.umTaskId";
    public static final String e = "debug.umeng.umCaseId";
    public static final String f = "empty";
    public static String g = "";
    public static String h = "";
    public static String i;
    public static Map j;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f77951l;
    public int k = 0;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("header", "#h");
        j.put(am.u, "#sdt");
        j.put(am.Q, "#ac");
        j.put("device_model", "#dm");
        j.put(am.g, "#umid");
        j.put(am.x, am.x);
        j.put(am.N, "#lang");
        j.put(am.ai, "#dt");
        j.put(am.z, "#rl");
        j.put(am.H, "#dmf");
        j.put(am.J, "#dn");
        j.put("platform_version", "#pv");
        j.put("font_size_setting", "#fss");
        j.put(am.y, "#ov");
        j.put(am.I, "#did");
        j.put("platform_sdk_version", "#psv");
        j.put(am.F, "#db");
        j.put("appkey", "#ak");
        j.put(am.Y, "#itr");
        j.put("id_type", "#it");
        j.put("uuid", "#ud");
        j.put("device_id", "#dd");
        j.put(am.X, "#imp");
        j.put("sdk_version", "#sv");
        j.put("st", "#st");
        j.put("analytics", "#a");
        j.put(am.o, "#pkg");
        j.put(am.p, "#sig");
        j.put(am.q, "#sis1");
        j.put(am.r, "#sis");
        j.put("app_version", "#av");
        j.put("version_code", "#vc");
        j.put("idmd5", "#imd");
        j.put(am.B, "#mnc");
        j.put(am.E, "#boa");
        j.put(am.G, "#mant");
        j.put(am.M, "#tz");
        j.put(am.O, "#ct");
        j.put(am.P, "#car");
        j.put(am.s, "#disn");
        j.put(am.T, "#nt");
        j.put(am.b, "#cv");
        j.put(am.d, "#mv");
        j.put(am.c, "#cot");
        j.put(am.e, "#mod");
        j.put(am.aj, "#al");
        j.put("session_id", "#sid");
        j.put(am.S, "#ip");
        j.put(am.U, "#sre");
        j.put(am.V, "#fre");
        j.put(am.W, "#ret");
        j.put("channel", "#chn");
        j.put("wrapper_type", "#wt");
        j.put("wrapper_version", "#wv");
        j.put(am.aV, "#tsv");
        j.put(am.aW, "#rps");
        j.put(am.aZ, "#mov");
        j.put(d.i, "#vt");
        j.put("secret", "#sec");
        j.put(d.ah, "#prv");
        j.put(d.f77932l, "#$prv");
        j.put(d.m, "#uda");
        j.put(am.a, "#tok");
        j.put(am.aN, "#iv");
        j.put(am.R, "#ast");
        j.put("backstate", "#bst");
        j.put("zdata_ver", "#zv");
        j.put("zdata_req_ts", "#zrt");
        j.put("app_b_v", "#bv");
        j.put("zdata", "#zta");
        j.put(am.ap, "#mt");
        j.put(am.am, "#zsv");
        j.put(am.ao, "#oos");
    }

    public static String a(String str) {
        return j.containsKey(str) ? (String) j.get(str) : str;
    }

    public static void a() {
        if (i != null) {
            i = null;
            e.a();
        }
    }

    public static long a(Context context) {
        return DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
    }

    private JSONObject a(int i2, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i2);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public static boolean b() {
        g = UMUtils.getSystemProperty(d, "");
        h = UMUtils.getSystemProperty(e, "");
        return (!TextUtils.isEmpty(g) && !f.equals(g)) && (!TextUtils.isEmpty(h) && !f.equals(h));
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        String str4;
        Envelope envelope;
        JSONObject optJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            int length = jSONObject.toString().getBytes().length;
            int length2 = jSONObject2.toString().getBytes().length;
        }
        if (context == null || jSONObject2 == null) {
            return a(UMErrorCode.E_UM_BE_JSON_FAILED, (JSONObject) null);
        }
        try {
            JSONObject a2 = a(context, str2, jSONObject2.has("analytics") && (optJSONObject = jSONObject2.optJSONObject("analytics")) != null && optJSONObject.has(d.n));
            if (a2 != null && jSONObject != null) {
                a2 = a(a2, jSONObject);
            }
            JSONObject jSONObject4 = a2;
            if (jSONObject4 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str5 = next;
                        if (jSONObject2.opt(str5) != null) {
                            try {
                                jSONObject4.put(a(str5), jSONObject2.opt(str5));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            String str6 = am.aH;
            if (!TextUtils.isEmpty(str2)) {
                str6 = str2;
            }
            String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
            if (jSONObject4 != null) {
                str4 = str6 + "==" + str7 + "&=";
                if (TextUtils.isEmpty(str4)) {
                    return a(101, jSONObject4);
                }
                if (str4.endsWith("&=")) {
                    str4 = str4.substring(0, str4.length() - 2);
                }
            } else {
                str4 = null;
            }
            String str8 = str4;
            if (jSONObject4 != null) {
                try {
                    e a3 = e.a(context);
                    if (a3 != null) {
                        a3.b();
                        String encodeToString = Base64.encodeToString(new be().a(a3.c()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject(a("header"));
                            jSONObject5.put(a(am.Y), encodeToString);
                            jSONObject4.put(a("header"), jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject4 != null && DataHelper.largeThanMaxSize(jSONObject4.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(i.a, sharedPreferences.getInt(i.a, 1) + 1).commit();
                }
                return a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject4);
            }
            if (jSONObject4 != null) {
                envelope = a(context, jSONObject4.toString().getBytes());
                if (envelope == null) {
                    return a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject4);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject4);
            }
            int a4 = a(context, envelope2, str8, jSONObject4 != null ? jSONObject4.optJSONObject(a("header")).optString(a("app_version")) : null, str);
            if (a4 != 0) {
                return a(a4, jSONObject4);
            }
            if (ULog.DEBUG) {
                int length3 = jSONObject4.toString().getBytes().length;
            }
            if (!str8.startsWith(am.aD) && !str8.startsWith(am.aC) && !str8.startsWith(am.aI) && !str8.startsWith(am.av) && !com.umeng.commonsdk.stateless.b.a()) {
                new com.umeng.commonsdk.stateless.b(context);
                com.umeng.commonsdk.stateless.b.b();
            }
            return jSONObject4;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            if (jSONObject != null) {
                try {
                    jSONObject3 = new JSONObject();
                    try {
                        try {
                            jSONObject3.put("header", jSONObject);
                        } catch (Exception e2) {
                            e = e2;
                            UMCrashManager.reportCrash(context, e);
                            return a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
                        }
                    } catch (JSONException unused3) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject3 = null;
                    UMCrashManager.reportCrash(context, e);
                    return a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
                }
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (next2 != null && (next2 instanceof String)) {
                    String str9 = next2;
                    if (jSONObject2.opt(str9) != null) {
                        try {
                            jSONObject3.put(str9, jSONObject2.opt(str9));
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            return a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
        }
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(i.a, sharedPreferences.getInt(i.a, 1) + 1).commit();
                }
                return a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a2 = a(context, envelope2, "h==1.2.0", "", str);
            if (a2 != 0) {
                return a(a2, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(UMErrorCode.E_UM_BE_JSON_FAILED, new JSONObject());
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", g);
                    jSONObject.put("umCaseId", h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(i.a, sharedPreferences.getInt(i.a, 1) + 1).commit();
                }
                return a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a2 = a(context, envelope2, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (a2 != 0) {
                return a(a2, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(UMErrorCode.E_UM_BE_JSON_FAILED, new JSONObject());
        }
    }

    public static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:84:0x03ad
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static org.json.JSONObject a(android.content.Context r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.b.a(android.content.Context, java.lang.String, boolean):org.json.JSONObject");
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(a("header")) != null && (jSONObject.opt(a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(a("header"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(a(d.i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i2 = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i2 = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            UMCrashManager.reportCrash(context, e2);
        }
        if (i2 == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i2 == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f77951l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String b2 = com.umeng.commonsdk.stateless.d.b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(b2);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (com.umeng.commonsdk.utils.c.a()) {
            if (str.startsWith(am.aG)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        }
        if (str.startsWith(am.aG)) {
            return 122;
        }
        if (str.startsWith(am.aD) || str.startsWith(am.aC) || str.startsWith(am.av) || str.startsWith(am.aI)) {
            return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
        }
        return com.umeng.commonsdk.stateless.d.a(context, com.umeng.commonsdk.stateless.a.f, sb.toString(), binary);
    }

    public static void a(boolean z) {
        f77951l = z;
    }
}
