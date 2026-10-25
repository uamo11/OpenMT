package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: 25NL */
/* renamed from: l.۠ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8123 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC1067 c0361;
        C21529 c21529 = new C21529();
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC5301.f16543;
        if (readStrongBinder == null) {
            c0361 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC1067.f3915);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1067)) {
                c0361 = (InterfaceC1067) queryLocalInterface;
            } else {
                c0361 = new C0361(readStrongBinder);
            }
        }
        c21529.f69209 = c0361;
        return c21529;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C21529[i];
    }
}
