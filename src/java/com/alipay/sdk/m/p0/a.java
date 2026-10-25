package com.alipay.sdk.m.p0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: N673 */
/* loaded from: classes.dex */
public interface a extends IInterface {
    String a();

    String a(String str);

    String b(String str);

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.p0.a$a, reason: collision with other inner class name */
    public abstract class AbstractBinderC0018a extends Binder implements a {
        public static final String a = "com.samsung.android.deviceidservice.IDeviceIdService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public AbstractBinderC0018a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0019a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String b2 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                return true;
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            String a3 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a3);
            return true;
        }

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.p0.a$a$a, reason: collision with other inner class name */
        public class C0019a implements a {
            public IBinder a;

            public C0019a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
