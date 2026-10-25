package moe.shizuku.server;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IShizukuApplication extends IInterface {

    public class Default implements IShizukuApplication {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void bindApplication(Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void dispatchRequestPermissionResult(int i, Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void showPermissionConfirmation(int i, int i2, String str, int i3) {
        }
    }

    void bindApplication(Bundle bundle);

    void dispatchRequestPermissionResult(int i, Bundle bundle);

    void showPermissionConfirmation(int i, int i2, String str, int i3);

    public abstract class Stub extends Binder implements IShizukuApplication {
        public static final String DESCRIPTOR = "moe.shizuku.server.IShizukuApplication";
        public static final int TRANSACTION_bindApplication = 2;
        public static final int TRANSACTION_dispatchRequestPermissionResult = 3;
        public static final int TRANSACTION_showPermissionConfirmation = 10001;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShizukuApplication asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IShizukuApplication)) {
                return (IShizukuApplication) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                bindApplication(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                dispatchRequestPermissionResult(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 10001) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            showPermissionConfirmation(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public class Proxy implements IShizukuApplication {
            public static IShizukuApplication sDefaultImpl;
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // moe.shizuku.server.IShizukuApplication
            public void bindApplication(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().bindApplication(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuApplication
            public void dispatchRequestPermissionResult(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().dispatchRequestPermissionResult(i, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuApplication
            public void showPermissionConfirmation(int i, int i2, String str, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    if (!this.mRemote.transact(Stub.TRANSACTION_showPermissionConfirmation, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().showPermissionConfirmation(i, i2, str, i3);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IShizukuApplication iShizukuApplication) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iShizukuApplication == null) {
                return false;
            }
            Proxy.sDefaultImpl = iShizukuApplication;
            return true;
        }

        public static IShizukuApplication getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
