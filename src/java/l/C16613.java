package l;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* compiled from: J8KC */
/* renamed from: l.ܽۨ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16613 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39137(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39136(MediaDrm mediaDrm, byte[] bArr, C13830 c13830) {
        LogSessionId logSessionId;
        LogSessionId m33184 = c13830.m33184();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (m33184.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(m33184);
    }
}
