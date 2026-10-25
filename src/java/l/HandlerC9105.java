package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: Q8UX */
/* renamed from: l.ۡ᩶ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC9105 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference;
        WeakReference weakReference2;
        if (message.what == 0) {
            weakReference = ServiceC4166.f13588;
            if (weakReference != null) {
                weakReference2 = ServiceC4166.f13588;
                ServiceC4166 serviceC4166 = (ServiceC4166) weakReference2.get();
                if (serviceC4166 != null) {
                    ServiceC4166.m12603(serviceC4166);
                }
            }
        }
    }
}
