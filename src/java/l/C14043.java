package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;
import moe.shizuku.server.IShizukuService;

/* compiled from: H9RQ */
/* renamed from: l.ܰ᩶۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14043 implements IBinder {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final IBinder f42451;

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }

    public C14043(IBinder iBinder) {
        C11003.requireNonNull(iBinder);
        this.f42451 = iBinder;
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = !C23216.m51521() && C23216.m51525() >= 13;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            obtain.writeStrongBinder(this.f42451);
            obtain.writeInt(i);
            if (z) {
                obtain.writeInt(i2);
            }
            obtain.appendFrom(parcel, 0, parcel.dataSize());
            if (z) {
                try {
                    C23216.m51515().asBinder().transact(1, obtain, parcel2, 0);
                    return true;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                C23216.m51515().asBinder().transact(1, obtain, parcel2, i2);
                return true;
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.f42451.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return this.f42451.pingBinder();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.f42451.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) {
        this.f42451.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        this.f42451.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f42451.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f42451.unlinkToDeath(deathRecipient, i);
    }
}
