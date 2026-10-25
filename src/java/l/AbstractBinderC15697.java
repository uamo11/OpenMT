package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: 5B1T */
/* renamed from: l.ܺۙ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC15697 extends Binder implements InterfaceC2293 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC8643 c9349;
        String str = InterfaceC2293.f7416;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c9349 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC8643.f26390);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8643)) {
                    c9349 = (InterfaceC8643) queryLocalInterface;
                } else {
                    c9349 = new C9349(readStrongBinder);
                }
            }
            mo7557(c9349);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
