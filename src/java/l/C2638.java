package l;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 71WO */
/* renamed from: l.ۖܺᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2638 implements InterfaceC18866 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f8328;

    public C2638(IBinder iBinder) {
        this.f8328 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8328;
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8299(String str, boolean z, boolean z2, boolean z3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            this.f8328.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    public final void exit() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] mo8302() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo8311(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo8306(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo8304(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] mo8310(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] mo8308(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] mo8301(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeByteArray(bArr);
            this.f8328.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo8303(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo8305(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] mo8300(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] mo8312(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] mo8307(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo8309(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f8328.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo8298() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
