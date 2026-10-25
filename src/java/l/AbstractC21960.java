package l;

import android.content.IIntentReceiver;
import android.content.IIntentSender;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: 28BC */
/* renamed from: l.᩹֨ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC21960 extends IIntentSender.Stub {
    public abstract void send(Intent intent);

    public int send(int i, Intent intent, String str, IIntentReceiver iIntentReceiver, String str2, Bundle bundle) {
        send(intent);
        return 0;
    }

    public void send(int i, Intent intent, String str, IBinder iBinder, IIntentReceiver iIntentReceiver, String str2, Bundle bundle) {
        send(intent);
    }
}
