package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 05LV */
/* renamed from: l.֡ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0361 implements InterfaceC1067 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f1773;

    public C0361(IBinder iBinder) {
        this.f1773 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1773;
    }

    @Override // l.InterfaceC1067
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1800(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC1067.f3915);
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1773.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
