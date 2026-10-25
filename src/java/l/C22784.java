package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: F993 */
/* renamed from: l.᩺ۚۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22784 implements InterfaceC7262 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f73569;

    public C22784(IBinder iBinder) {
        this.f73569 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f73569;
    }

    @Override // l.InterfaceC7262
    /* renamed from: ֫ */
    public final int mo19481() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            this.f73569.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC7262
    /* renamed from: ֫ */
    public final Bundle mo19482(int i, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            obtain.writeString("sh");
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f73569.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) (obtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
