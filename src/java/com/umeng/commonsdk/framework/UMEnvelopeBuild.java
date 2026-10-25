package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag;

    public static synchronized boolean getTransmissionSendFlag() {
        boolean z;
        synchronized (UMEnvelopeBuild.class) {
            z = transmissionSendFlag;
        }
        return z;
    }

    public static synchronized void setTransmissionSendFlag(boolean z) {
        synchronized (UMEnvelopeBuild.class) {
            transmissionSendFlag = z;
        }
    }

    public static boolean isOnline(Context context) {
        return UMFrUtils.isOnline(context) && !UMConfigure.needSendZcfgEnv(context);
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (getTransmissionSendFlag()) {
            return isRet(context, uMBusinessType, false);
        }
        return false;
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        a.a(context);
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildStateless() {
        return getTransmissionSendFlag();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r3) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r4) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isRet(android.content.Context r3, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r4, boolean r5) {
        /*
            if (r3 == 0) goto L43
            android.content.Context r0 = r3.getApplicationContext()
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r0)
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            if (r1 == 0) goto L3c
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r5 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r4 != r5) goto L1b
            boolean r3 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r4)
            if (r3 == 0) goto L37
            goto L3a
        L1b:
            boolean r5 = com.umeng.commonsdk.framework.a.a()
            if (r5 == 0) goto L2a
            int r3 = com.umeng.commonsdk.framework.a.b()
            long r3 = (long) r3
            com.umeng.commonsdk.framework.UMWorkDispatch.sendDelayProcessMsg(r3)
            goto L3a
        L2a:
            boolean r4 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r4)
            if (r4 != 0) goto L3a
            boolean r3 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r3)
            if (r3 == 0) goto L37
            goto L3a
        L37:
            r3 = 1
            r5 = 1
            goto L3c
        L3a:
            r3 = 0
            r5 = 0
        L3c:
            if (r1 == 0) goto L43
            if (r2 <= 0) goto L43
            com.umeng.commonsdk.framework.a.d()
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMEnvelopeBuild.isRet(android.content.Context, com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType, boolean):boolean");
    }

    public static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        if (jSONObject == null || jSONObject2 == null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        i a = i.a(context);
        long currentTimeMillis = System.currentTimeMillis();
        UUID randomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(aq.e, str2);
        contentValues.put(aq.f, a.c(jSONObject.toString()));
        contentValues.put(aq.g, a.c(jSONObject2.toString()));
        contentValues.put(aq.h, String.valueOf(currentTimeMillis));
        contentValues.put(aq.i, randomUUID.toString());
        contentValues.put(aq.j, str);
        contentValues.put(aq.k, str3);
        ao.a(context).a(aq.c, contentValues);
        if (am.aC.equalsIgnoreCase(str2)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else if (am.aB.equalsIgnoreCase(str2)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]分享业务 返回body。");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", new JSONObject());
                jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                return jSONObject3;
            } catch (JSONException unused) {
            }
        } else if (!am.ax.equalsIgnoreCase(str2)) {
            try {
                if (am.aI.equalsIgnoreCase(str2)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(b.a("header"), new JSONObject());
                    jSONObject4.put(b.a("analytics"), jSONObject2.getJSONObject("analytics"));
                    return jSONObject4;
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 闭合报文，返回body。");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(b.a("header"), new JSONObject());
                jSONObject5.put(b.a("analytics"), jSONObject2.getJSONObject("analytics"));
                return jSONObject5;
            } catch (JSONException unused2) {
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject.has("st")) {
            str = am.aI;
        } else {
            str = jSONObject2.has(am.au) ? am.aC : am.av;
        }
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, str, "9.5.2");
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return jSONObject4;
                }
            } catch (JSONException unused4) {
                return null;
            }
        }
        if (UMConfigure.needSendZcfgEnv(context)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
            return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
        if (ao.a(context).c()) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存为空，直接打信封");
            return new b().a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存不为空，写入二级缓存");
        JSONObject add2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
        if (!UMWorkDispatch.eventHasExist(com.umeng.commonsdk.internal.a.t)) {
            UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.t, com.umeng.commonsdk.internal.b.a(context).a(), null);
        }
        return add2CacheTable;
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        return new b().b(context.getApplicationContext(), jSONObject, jSONObject2, str);
    }

    public static JSONObject buildSilentEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        return new b().a(context.getApplicationContext(), jSONObject, jSONObject2, str);
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).c().a(str, str2);
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0L;
        }
        return b.a(context.getApplicationContext());
    }

    public static void sendProcessNextMsgOnce() {
        a.d();
    }

    public static void registerNetReceiver(Context context) {
        a.b(context);
    }
}
