package l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* compiled from: O8SZ */
/* renamed from: l.ܿ۫֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17339 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40670(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        C2171.m7181(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40669(Context context, AudioDeviceCallback audioDeviceCallback) {
        C2171.m7181(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
