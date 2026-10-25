package moe.shizuku.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public interface IRemoteProcess extends IInterface {

    public class Default implements IRemoteProcess {
        @Override // moe.shizuku.server.IRemoteProcess
        public boolean alive() {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public void destroy() {
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public int exitValue() {
            return 0;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getErrorStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getInputStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getOutputStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public int waitFor() {
            return 0;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public boolean waitForTimeout(long j, String str) {
            return false;
        }
    }

    boolean alive();

    void destroy();

    int exitValue();

    ParcelFileDescriptor getErrorStream();

    ParcelFileDescriptor getInputStream();

    ParcelFileDescriptor getOutputStream();

    int waitFor();

    boolean waitForTimeout(long j, String str);

    public abstract class Stub extends Binder implements IRemoteProcess {
        public static final String DESCRIPTOR = "moe.shizuku.server.IRemoteProcess";
        public static final int TRANSACTION_alive = 7;
        public static final int TRANSACTION_destroy = 6;
        public static final int TRANSACTION_exitValue = 5;
        public static final int TRANSACTION_getErrorStream = 3;
        public static final int TRANSACTION_getInputStream = 2;
        public static final int TRANSACTION_getOutputStream = 1;
        public static final int TRANSACTION_waitFor = 4;
        public static final int TRANSACTION_waitForTimeout = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteProcess asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRemoteProcess)) {
                return (IRemoteProcess) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor outputStream = getOutputStream();
                    parcel2.writeNoException();
                    if (outputStream != null) {
                        parcel2.writeInt(1);
                        outputStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor inputStream = getInputStream();
                    parcel2.writeNoException();
                    if (inputStream != null) {
                        parcel2.writeInt(1);
                        inputStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor errorStream = getErrorStream();
                    parcel2.writeNoException();
                    if (errorStream != null) {
                        parcel2.writeInt(1);
                        errorStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int waitFor = waitFor();
                    parcel2.writeNoException();
                    parcel2.writeInt(waitFor);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int exitValue = exitValue();
                    parcel2.writeNoException();
                    parcel2.writeInt(exitValue);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean alive = alive();
                    parcel2.writeNoException();
                    parcel2.writeInt(alive ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean waitForTimeout = waitForTimeout(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(waitForTimeout ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public class Proxy implements IRemoteProcess {
            public static IRemoteProcess sDefaultImpl;
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

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getOutputStream() {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        parcelFileDescriptor = Stub.getDefaultImpl().getOutputStream();
                    } else {
                        obtain2.readException();
                        parcelFileDescriptor = obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getInputStream() {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        parcelFileDescriptor = Stub.getDefaultImpl().getInputStream();
                    } else {
                        obtain2.readException();
                        parcelFileDescriptor = obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getErrorStream() {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        parcelFileDescriptor = Stub.getDefaultImpl().getErrorStream();
                    } else {
                        obtain2.readException();
                        parcelFileDescriptor = obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public int waitFor() {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        readInt = Stub.getDefaultImpl().waitFor();
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public int exitValue() {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        readInt = Stub.getDefaultImpl().exitValue();
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public void destroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().destroy();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public boolean alive() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().alive();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public boolean waitForTimeout(long j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().waitForTimeout(j, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemoteProcess iRemoteProcess) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteProcess == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteProcess;
            return true;
        }

        public static IRemoteProcess getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
