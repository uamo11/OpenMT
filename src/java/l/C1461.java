package l;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 43G9 */
/* renamed from: l.֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1461 implements InterfaceC16277 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f5212;

    public C1461(IBinder iBinder) {
        this.f5212 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5212;
    }

    @Override // l.InterfaceC16277
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5014(String str, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC16277.f50046);
            obtain.writeString(str);
            obtain.writeInt(1006);
            obtain.writeString(null);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5212.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
