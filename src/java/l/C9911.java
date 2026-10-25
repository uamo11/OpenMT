package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: J4LB */
/* renamed from: l.ۢ᩻֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9911 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C21200();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f29980;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C9911(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f29980 = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f29980);
    }
}
