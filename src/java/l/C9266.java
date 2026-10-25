package l;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* compiled from: 04ZB */
/* renamed from: l.ۢ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9266 implements InterfaceC2210 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f28068;

    @Override // l.InterfaceC2210
    /* renamed from: ֫ */
    public final boolean mo7356(KeyEvent keyEvent) {
        throw null;
    }

    public C9266(IBinder iBinder) {
        this.f28068 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28068;
    }

    @Override // l.InterfaceC2210
    /* renamed from: ֫ */
    public final void mo7354(InterfaceC20555 interfaceC20555) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC20555);
            this.f28068.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
