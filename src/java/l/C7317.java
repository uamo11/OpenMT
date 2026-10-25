package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: 58LL */
/* renamed from: l.۟۟֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7317 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C13666();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f22473;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f22474;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C7317(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        C22632.m50631(readLong >= 0);
        C22632.m50631(readLong2 >= 0 || readLong2 == -1);
        this.f22474 = readLong;
        this.f22473 = readLong2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7317)) {
            return false;
        }
        C7317 c7317 = (C7317) obj;
        return this.f22474 == c7317.f22474 && this.f22473 == c7317.f22473;
    }

    public final int hashCode() {
        return (((int) this.f22474) * 961) + ((int) this.f22473);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22474);
        parcel.writeLong(this.f22473);
    }
}
