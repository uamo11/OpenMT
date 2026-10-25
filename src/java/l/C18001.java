package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: U6BF */
/* renamed from: l.ᩳۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18001 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16589();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ResultReceiver f56148;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f56148.writeToParcel(parcel, i);
    }
}
