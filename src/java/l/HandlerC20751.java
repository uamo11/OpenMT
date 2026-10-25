package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: VAJH */
/* renamed from: l.᩷۠ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC20751 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5242 c5242;
        AbstractC3817 abstractC3817 = (AbstractC3817) ((WeakReference) message.obj).get();
        if (abstractC3817 != null) {
            c5242 = abstractC3817.f12053;
            c5242.mo1669(abstractC3817);
        }
    }
}
