package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: E6AF */
/* renamed from: l.ᩴ֫֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18441 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C19147 c19147 = new C19147(parcel);
        c19147.f60344 = parcel.readInt();
        return c19147;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C19147[i];
    }
}
