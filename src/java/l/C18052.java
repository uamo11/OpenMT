package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: 8539 */
/* renamed from: l.ᩳ۫ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18052 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C17346 c17346 = new C17346();
        c17346.f53136 = parcel.readInt();
        c17346.f53138 = parcel.readInt();
        c17346.f53137 = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            c17346.f53139 = iArr;
            parcel.readIntArray(iArr);
        }
        return c17346;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C17346[i];
    }
}
