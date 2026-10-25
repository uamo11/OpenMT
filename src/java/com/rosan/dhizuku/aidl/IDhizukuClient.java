package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IDhizukuClient extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizukuClient";

    public class Default implements IDhizukuClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuClient
        public int getVersionCode() {
            return 0;
        }
    }

    int getVersionCode();

    public abstract class Stub extends Binder implements IDhizukuClient {
        public static final int TRANSACTION_getVersionCode = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizukuClient.DESCRIPTOR);
        }

        public static IDhizukuClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IDhizukuClient.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDhizukuClient)) {
                return (IDhizukuClient) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizukuClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizukuClient.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int versionCode = getVersionCode();
                parcel2.writeNoException();
                parcel2.writeInt(versionCode);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IDhizukuClient {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizukuClient.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuClient
            public int getVersionCode() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDhizukuClient.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
