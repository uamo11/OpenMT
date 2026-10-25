package l;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 64W0 */
/* renamed from: l.ܳ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14203 implements InterfaceC20555 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f42866;

    public C14203(IBinder iBinder) {
        this.f42866 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f42866;
    }

    @Override // l.InterfaceC20555
    /* renamed from: ۘ */
    public final void mo14541() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f42866.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC20555
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33867(C19413 c19413) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c19413 != null) {
                obtain.writeInt(1);
                c19413.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f42866.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC20555
    /* renamed from: ֫ */
    public final void mo14538(C10677 c10677) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c10677 != null) {
                obtain.writeInt(1);
                c10677.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f42866.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
