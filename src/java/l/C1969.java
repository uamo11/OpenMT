package l;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* compiled from: 18UV */
/* renamed from: l.֫ܿۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1969 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f6603;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Spatializer.OnSpatializerStateChangedListener f6604;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f6605;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Spatializer f6606;

    public C1969(Context context, C6908 c6908, Boolean bool) {
        AudioManager m7181 = context == null ? null : C2171.m7181(context);
        if (m7181 == null || (bool != null && bool.booleanValue())) {
            this.f6606 = null;
            this.f6605 = false;
            this.f6603 = null;
            this.f6604 = null;
            return;
        }
        Spatializer spatializer = m7181.getSpatializer();
        this.f6606 = spatializer;
        this.f6605 = spatializer.getImmersiveAudioLevel() != 0;
        C7634 c7634 = new C7634(c6908);
        this.f6604 = c7634;
        Looper myLooper = Looper.myLooper();
        C22632.m50632(myLooper);
        Handler handler = new Handler(myLooper);
        this.f6603 = handler;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC0344(handler), c7634);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6480() {
        return this.f6605;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6477() {
        Spatializer spatializer = this.f6606;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m6479() {
        Spatializer spatializer = this.f6606;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6478(C18231 c18231, C8353 c8353) {
        String str = c8353.f25614;
        String str2 = c8353.f25614;
        int i = c8353.f25625;
        if (C11003.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (C11003.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (C11003.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int m11035 = C3603.m11035(i);
        if (m11035 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m11035);
        int i2 = c8353.f25624;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.f6606;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c18231.m42474().f51620, channelMask.build());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6481() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.f6606;
        if (spatializer == null || (onSpatializerStateChangedListener = this.f6604) == null || (handler = this.f6603) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
