package l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: 68UW */
/* renamed from: l.ܿۤ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17278 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40568(AudioTrack audioTrack, C13830 c13830) {
        LogSessionId logSessionId;
        LogSessionId m33184 = c13830.m33184();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (m33184.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(m33184);
    }
}
