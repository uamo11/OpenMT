package l;

import android.media.metrics.LogSessionId;

/* compiled from: W8Q2 */
/* renamed from: l.ۜ۟֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6612 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18120(C23023 c23023, C13830 c13830) {
        LogSessionId logSessionId;
        LogSessionId m33184 = c13830.m33184();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (m33184.equals(logSessionId)) {
            return;
        }
        c23023.f74105.setString("log-session-id", m33184.getStringId());
    }
}
