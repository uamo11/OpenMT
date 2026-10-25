package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: 223J */
/* renamed from: l.ܶۜ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15056 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8002();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45947;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f45949;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14576[] f45951;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f45952;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f45953;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f45948 = null;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f45946 = new ArrayList();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f45950 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f45952);
        parcel.writeStringList(this.f45953);
        parcel.writeTypedArray(this.f45951, i);
        parcel.writeInt(this.f45947);
        parcel.writeString(this.f45948);
        parcel.writeStringList(this.f45946);
        parcel.writeTypedList(this.f45950);
        parcel.writeTypedList(this.f45949);
    }
}
