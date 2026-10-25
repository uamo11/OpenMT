package l;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 67BH */
/* renamed from: l.᩵ܺᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19572 implements InterfaceC5460 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f63257;

    public C19572(IBinder iBinder) {
        this.f63257 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f63257;
    }

    @Override // l.InterfaceC5460
    /* renamed from: ۡ */
    public final boolean mo15565() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f63257.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC5460
    public final void exit() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f63257.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
