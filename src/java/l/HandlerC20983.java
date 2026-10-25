package l;

import android.os.Handler;
import android.os.Message;

/* compiled from: K1X4 */
/* renamed from: l.᩷ܺᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC20983 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC9694 interfaceC9694;
        Object obj = message.obj;
        if (obj instanceof C8988) {
            C8988 c8988 = (C8988) obj;
            try {
                try {
                    interfaceC9694 = c8988.f27309;
                    c8988.f27311 = interfaceC9694.call();
                } finally {
                    c8988.f27312 = false;
                }
            } catch (Exception e) {
                c8988.f27310 = e;
            } catch (Throwable th) {
                c8988.f27310 = new Exception(th);
            }
        }
    }
}
