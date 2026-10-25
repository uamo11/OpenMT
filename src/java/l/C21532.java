package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: O607 */
/* renamed from: l.᩸ۧ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21532 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C22237(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C22237(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C22237[i];
    }
}
