package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: N1X5 */
/* renamed from: l.᩹ۡᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC22188 implements ServiceConnection {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4549 f71983;

    public ServiceConnectionC22188(C4549 c4549) {
        this.f71983 = c4549;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC18866 c2638;
        int i = AbstractBinderC4049.f12863;
        if (iBinder == null) {
            c2638 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC18866)) {
                c2638 = (InterfaceC18866) queryLocalInterface;
            } else {
                c2638 = new C2638(iBinder);
            }
        }
        this.f71983.f14517 = c2638;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f71983.f14517 = null;
    }
}
