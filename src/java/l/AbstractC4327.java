package l;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: U6BF */
/* renamed from: l.ۙ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4327 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HandlerC21966 f13921;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f13924;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f13922 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaSession.Callback f13920 = new C19850(this);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WeakReference f13923 = new WeakReference(null);

    /* renamed from: ֫ */
    public void mo8508() {
    }

    /* renamed from: ֫ */
    public void mo8509(long j) {
    }

    /* renamed from: ۧ */
    public void mo8511() {
    }

    /* renamed from: ܽ */
    public void mo8512() {
    }

    /* renamed from: ᩳ */
    public void mo8513() {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12984(InterfaceC2916 interfaceC2916, Handler handler) {
        synchronized (this.f13922) {
            this.f13923 = new WeakReference(interfaceC2916);
            HandlerC21966 handlerC21966 = this.f13921;
            HandlerC21966 handlerC219662 = null;
            if (handlerC21966 != null) {
                handlerC21966.removeCallbacksAndMessages(null);
            }
            if (interfaceC2916 != null && handler != null) {
                handlerC219662 = new HandlerC21966(this, handler.getLooper());
            }
            this.f13921 = handlerC219662;
        }
    }

    /* renamed from: ֫ */
    public boolean mo8510(Intent intent) {
        InterfaceC2916 interfaceC2916;
        HandlerC21966 handlerC21966;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f13922) {
                interfaceC2916 = (InterfaceC2916) this.f13923.get();
                handlerC21966 = this.f13921;
            }
            if (interfaceC2916 != null && handlerC21966 != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C21326 mo8909 = interfaceC2916.mo8909();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() == 0) {
                        if (this.f13924) {
                            handlerC21966.removeMessages(1);
                            this.f13924 = false;
                            C19413 mo8910 = interfaceC2916.mo8910();
                            if (((mo8910 == null ? 0L : mo8910.f62808) & 32) != 0) {
                                mo8512();
                            }
                            return true;
                        }
                        this.f13924 = true;
                        handlerC21966.sendMessageDelayed(handlerC21966.obtainMessage(1, mo8909), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    m12983(interfaceC2916, handlerC21966);
                    return true;
                }
                m12983(interfaceC2916, handlerC21966);
                return false;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12983(InterfaceC2916 interfaceC2916, Handler handler) {
        if (this.f13924) {
            this.f13924 = false;
            handler.removeMessages(1);
            C19413 mo8910 = interfaceC2916.mo8910();
            long j = mo8910 == null ? 0L : mo8910.f62808;
            boolean z = mo8910 != null && mo8910.f62803 == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                mo8508();
            } else {
                if (z || !z2) {
                    return;
                }
                mo8511();
            }
        }
    }
}
