package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: N5JQ */
/* renamed from: l.ۚۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5094 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C0860(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0860(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0860[i];
    }
}
