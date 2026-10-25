package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: N1X5 */
/* renamed from: l.᩸ۡᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ServiceConnectionC21483 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final InterfaceC5460 c19572;
        int i = AbstractBinderC0520.f2174;
        if (iBinder == null) {
            c19572 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5460)) {
                c19572 = (InterfaceC5460) queryLocalInterface;
            } else {
                c19572 = new C19572(iBinder);
            }
        }
        C1802.f6208.submit(new Runnable() { // from class: l.ܶۡᩳ
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC21483 serviceConnectionC21483 = ServiceConnectionC21483.this;
                InterfaceC5460 interfaceC5460 = c19572;
                try {
                    C4549.f14514 = Boolean.valueOf(interfaceC5460.mo15565());
                } catch (Exception unused) {
                    C4549.f14514 = Boolean.FALSE;
                }
                try {
                    interfaceC5460.exit();
                } catch (Exception unused2) {
                }
                try {
                    C4925.m14335().unbindService(serviceConnectionC21483);
                } catch (Exception unused3) {
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Boolean bool;
        bool = C4549.f14514;
        if (bool == null) {
            C4549.f14514 = Boolean.FALSE;
        }
    }
}
