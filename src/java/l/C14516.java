package l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: O8SZ */
/* renamed from: l.ܳ۫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14516 extends AudioDeviceCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20868 f44497;

    public C14516(C20868 c20868) {
        this.f44497 = c20868;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        C18231 c18231;
        C9579 c9579;
        C20868 c20868 = this.f44497;
        context = c20868.f67536;
        c18231 = this.f44497.f67529;
        c9579 = this.f44497.f67531;
        c20868.m47686(C18045.m42101(context, c18231, c9579));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C9579 c9579;
        Context context;
        C18231 c18231;
        C9579 c95792;
        c9579 = this.f44497.f67531;
        if (C3603.m11029(c9579, audioDeviceInfoArr)) {
            this.f44497.f67531 = null;
        }
        C20868 c20868 = this.f44497;
        context = c20868.f67536;
        c18231 = this.f44497.f67529;
        c95792 = this.f44497.f67531;
        c20868.m47686(C18045.m42101(context, c18231, c95792));
    }
}
