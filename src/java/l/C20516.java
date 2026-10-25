package l;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: R7UD */
/* renamed from: l.᩷֡֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20516 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18231 f66106;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Handler f66107;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66108;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f66109;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AudioManager.OnAudioFocusChangeListener f66110;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46993(C15512 c15512, Handler handler) {
        handler.getClass();
        this.f66110 = c15512;
        this.f66107 = handler;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46994(C18231 c18231) {
        c18231.getClass();
        this.f66106 = c18231;
    }

    public C20516(int i) {
        this.f66106 = C18231.f56651;
        this.f66108 = i;
    }

    public C20516(C15575 c15575) {
        this.f66108 = c15575.m36713();
        this.f66110 = c15575.m36711();
        this.f66107 = c15575.m36714();
        this.f66106 = c15575.m36710();
        this.f66109 = c15575.m36715();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46995(boolean z) {
        this.f66109 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15575 m46992() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f66110;
        if (onAudioFocusChangeListener != null) {
            Handler handler = this.f66107;
            handler.getClass();
            return new C15575(this.f66108, onAudioFocusChangeListener, handler, this.f66106, this.f66109);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }
}
