package com.alipay.sdk.m.y;

import android.os.SystemClock;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static final long a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        synchronized (c.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - b < a) {
                return true;
            }
            b = elapsedRealtime;
            return false;
        }
    }
}
