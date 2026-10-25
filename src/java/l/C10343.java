package l;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: OAQ1 */
/* renamed from: l.ۤܳ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10343 implements InterfaceC11754 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f31143;

    public C10343(IBinder iBinder) {
        this.f31143 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31143;
    }

    @Override // l.InterfaceC11754
    public final String a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f31143.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC11754
    public final boolean c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f31143.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
