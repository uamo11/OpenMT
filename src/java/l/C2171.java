package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* compiled from: E7TV */
/* renamed from: l.ۖ֡֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2171 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AudioManager f7166;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized AudioManager m7181(Context context) {
        synchronized (C2171.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f7166 = null;
            }
            AudioManager audioManager = f7166;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && myLooper != Looper.getMainLooper()) {
                C14310 c14310 = new C14310();
                C10881.m27178().execute(new RunnableC9960(1, applicationContext, c14310));
                c14310.m34149();
                AudioManager audioManager2 = f7166;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f7166 = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7182(Context context, C14310 c14310) {
        f7166 = (AudioManager) context.getSystemService("audio");
        c14310.m34151();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m7184(AudioManager audioManager, C15575 c15575) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(c15575.m36712());
        }
        AudioManager.OnAudioFocusChangeListener m36711 = c15575.m36711();
        c15575.m36710().getClass();
        return audioManager.requestAudioFocus(m36711, 3, c15575.m36713());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7183(AudioManager audioManager, C15575 c15575) {
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(c15575.m36712());
        } else {
            audioManager.abandonAudioFocus(c15575.m36711());
        }
    }
}
