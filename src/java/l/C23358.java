package l;

import android.os.Handler;
import android.os.Message;

/* compiled from: 78OY */
/* renamed from: l.᩻֨֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23358 implements InterfaceC18545 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Message f75036;

    public /* synthetic */ C23358(int i) {
        this();
    }

    public C23358() {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51767(Message message) {
        this.f75036 = message;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51768(Handler handler) {
        Message message = this.f75036;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f75036 = null;
        C6425.m17752(this);
        return sendMessageAtFrontOfQueue;
    }

    @Override // l.InterfaceC18545
    /* renamed from: ֫ */
    public final void mo43089() {
        Message message = this.f75036;
        message.getClass();
        message.sendToTarget();
        this.f75036 = null;
        C6425.m17752(this);
    }
}
