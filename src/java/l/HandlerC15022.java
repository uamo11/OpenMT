package l;

import android.os.Handler;
import android.os.Message;

/* compiled from: Z1XI */
/* renamed from: l.ܶۚۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC15022 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f45796;

    public HandlerC15022(Handler handler) {
        this.f45796 = handler;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f45796.handleMessage(message);
    }
}
