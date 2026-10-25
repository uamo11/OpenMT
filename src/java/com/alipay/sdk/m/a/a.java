package com.alipay.sdk.m.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: N673 */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.a.a$a, reason: collision with other inner class name */
    public abstract class AbstractBinderC0001a extends Binder implements a {

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.a.a$a$a, reason: collision with other inner class name */
        public class C0002a implements a {
            public IBinder a;

            public C0002a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
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
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0002a(iBinder) : (a) queryLocalInterface;
        }
    }
}
