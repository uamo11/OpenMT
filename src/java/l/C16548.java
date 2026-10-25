package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: P55W */
/* renamed from: l.ܽۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16548 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C17960 c17960 = new C17960();
        c17960.f55990 = parcel.readInt();
        return c17960;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C17960[i];
    }
}
