package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: H5YD */
/* renamed from: l.ܶ᩶, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC15446 extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
