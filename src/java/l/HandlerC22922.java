package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.UUID;

/* compiled from: 58TM */
/* renamed from: l.᩺ۤ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC22922 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f73886;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10805 f73887;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m51012() {
        removeCallbacksAndMessages(null);
        this.f73886 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22922(C10805 c10805, Looper looper) {
        super(looper);
        this.f73887 = c10805;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th;
        InterfaceC11058 interfaceC11058;
        HandlerC7400 handlerC7400;
        InterfaceC23669 interfaceC23669;
        InterfaceC23669 interfaceC236692;
        UUID uuid;
        C13749 c13749 = (C13749) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                interfaceC23669 = this.f73887.f32496;
                th = ((C17319) interfaceC23669).m40637((C13625) c13749.f41042);
            } else if (i == 2) {
                interfaceC236692 = this.f73887.f32496;
                uuid = this.f73887.f32513;
                th = ((C17319) interfaceC236692).m40636(uuid, (C5865) c13749.f41042);
            } else {
                throw new RuntimeException();
            }
        } catch (C6736 e) {
            boolean m51011 = m51011(message, e);
            th = e;
            if (m51011) {
                return;
            }
        } catch (Exception e2) {
            C19956.m46036("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            th = e2;
        }
        Throwable th2 = th;
        interfaceC11058 = this.f73887.f32514;
        long j = c13749.f41043;
        interfaceC11058.getClass();
        synchronized (this) {
            if (!this.f73886) {
                handlerC7400 = this.f73887.f32501;
                handlerC7400.obtainMessage(message.what, Pair.create(c13749.f41042, th2)).sendToTarget();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m51011(Message message, C6736 c6736) {
        InterfaceC11058 interfaceC11058;
        IOException c1632;
        InterfaceC11058 interfaceC110582;
        C13749 c13749 = (C13749) message.obj;
        if (c13749.f41040) {
            int i = c13749.f41041 + 1;
            c13749.f41041 = i;
            interfaceC11058 = this.f73887.f32514;
            if (i <= interfaceC11058.mo27440(3)) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                if (!(c6736.getCause() instanceof IOException)) {
                    c1632 = new C1632(c6736.getCause());
                } else {
                    c1632 = (IOException) c6736.getCause();
                }
                interfaceC110582 = this.f73887.f32514;
                long mo27441 = interfaceC110582.mo27441(new C1885(c1632, c13749.f41041));
                if (mo27441 != -9223372036854775807L) {
                    synchronized (this) {
                        if (this.f73886) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), mo27441);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
