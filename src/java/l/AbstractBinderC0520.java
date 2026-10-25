package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: 67BH */
/* renamed from: l.֡ܺᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0520 extends Binder implements InterfaceC5460 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2174 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            return true;
        }
        if (i == 1) {
            boolean mo15565 = ((BinderC21688) this).mo15565();
            parcel2.writeNoException();
            parcel2.writeInt(mo15565 ? 1 : 0);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                ((BinderC21688) this).exit();
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ServiceC22393 serviceC22393 = ((BinderC21688) this).f69566;
        th = serviceC22393.f72549;
        String[] strArr = null;
        if (th != null) {
            th2 = serviceC22393.f72549;
            String message = th2.getMessage();
            if (message == null || message.isEmpty()) {
                th3 = serviceC22393.f72549;
                message = th3.toString();
            }
            th4 = serviceC22393.f72549;
            String stackTraceString = Log.getStackTraceString(th4);
            serviceC22393.f72549 = null;
            strArr = new String[]{message, stackTraceString};
        }
        parcel2.writeNoException();
        parcel2.writeStringArray(strArr);
        return true;
    }
}
