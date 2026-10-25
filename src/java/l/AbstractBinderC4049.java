package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: 71WO */
/* renamed from: l.ۘܺᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC4049 extends Binder implements InterfaceC18866 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12863 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            return true;
        }
        switch (i) {
            case 1:
                boolean mo8299 = ((BinderC6871) this).mo8299(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(mo8299 ? 1 : 0);
                return true;
            case 2:
                ((BinderC6871) this).exit();
                parcel2.writeNoException();
                return true;
            case 3:
                String[] mo8302 = ((BinderC6871) this).mo8302();
                parcel2.writeNoException();
                parcel2.writeStringArray(mo8302);
                return true;
            case 4:
                String mo8311 = ((BinderC6871) this).mo8311(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(mo8311);
                return true;
            case 5:
                String mo8306 = ((BinderC6871) this).mo8306(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(mo8306);
                return true;
            case 6:
                byte[] mo8304 = ((BinderC6871) this).mo8304(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo8304);
                return true;
            case 7:
                int[] mo8310 = ((BinderC6871) this).mo8310(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8310);
                return true;
            case 8:
                int[] mo8308 = ((BinderC6871) this).mo8308(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8308);
                return true;
            case 9:
                int[] mo8301 = ((BinderC6871) this).mo8301(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8301);
                return true;
            case 10:
                int mo8303 = ((BinderC6871) this).mo8303(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo8303);
                return true;
            case 11:
                String mo8305 = ((BinderC6871) this).mo8305(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(mo8305);
                return true;
            case 12:
                int[] mo8300 = ((BinderC6871) this).mo8300(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8300);
                return true;
            case 13:
                int[] mo8312 = ((BinderC6871) this).mo8312(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8312);
                return true;
            case 14:
                int[] mo8307 = ((BinderC6871) this).mo8307(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(mo8307);
                return true;
            case 15:
                C15336.m36366(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                i3 = ((BinderC6871) this).f21236.f49478;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
