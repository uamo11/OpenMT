package com.alipay.sdk.interior;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.g;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class Log {
    public static long a;

    /* compiled from: N673 */
    public interface ISdkLogCallback {
        void onLogLine(String str);
    }

    public static boolean forcedLogReport(Context context) {
        try {
            b.c().a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (elapsedRealtime - a < 600) {
                return false;
            }
            a = elapsedRealtime;
            a.a(context);
            return true;
        } catch (Exception e) {
            g.a(e);
            return false;
        }
    }

    public static void setupLogCallback(ISdkLogCallback iSdkLogCallback) {
        g.a(iSdkLogCallback);
    }
}
