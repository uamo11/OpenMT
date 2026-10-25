package l;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.m.u0.c;

/* compiled from: OBMG */
/* renamed from: l.ۗܳ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class HandlerC3287 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C23714 c23714;
        Object obj;
        Object obj2;
        if (message.what == 11) {
            int i = message.getData().getInt("type");
            String string = message.getData().getString(c.d);
            c23714 = C13164.f39366;
            C13164.f39371 = c23714.m52290(i, string);
            obj = C13164.f39367;
            synchronized (obj) {
                obj2 = C13164.f39367;
                obj2.notify();
            }
        }
    }
}
