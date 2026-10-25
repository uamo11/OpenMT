package l;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: R7UD */
/* renamed from: l.ۡ֡֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8521 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f26037;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f26038;

    public C8521(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f26038 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = C3603.f11424;
        this.f26037 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        C3603.m11023(this.f26037, new Runnable() { // from class: l.ۢ֡֫
            @Override // java.lang.Runnable
            public final void run() {
                C8521.this.f26038.onAudioFocusChange(i);
            }
        });
    }
}
