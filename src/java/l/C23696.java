package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: 8539 */
/* renamed from: l.᩻۫ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23696 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C6763 c6763 = new C6763();
        c6763.f21011 = parcel.readInt();
        c6763.f21006 = parcel.readInt();
        int readInt = parcel.readInt();
        c6763.f21004 = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            c6763.f21005 = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        c6763.f21007 = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            c6763.f21008 = iArr2;
            parcel.readIntArray(iArr2);
        }
        c6763.f21002 = parcel.readInt() == 1;
        c6763.f21010 = parcel.readInt() == 1;
        c6763.f21003 = parcel.readInt() == 1;
        c6763.f21009 = parcel.readArrayList(C17346.class.getClassLoader());
        return c6763;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C6763[i];
    }
}
