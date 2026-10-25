package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: 58LL */
/* renamed from: l.ۧ֫ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10688 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1515();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f32163;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f32164;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C10688(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        C22632.m50631(readLong2 >= 0 || readLong2 == -9223372036854775807L);
        this.f32164 = readLong;
        this.f32163 = readLong2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10688)) {
            return false;
        }
        C10688 c10688 = (C10688) obj;
        return this.f32164 == c10688.f32164 && this.f32163 == c10688.f32163;
    }

    public final int hashCode() {
        return (((int) this.f32164) * 961) + ((int) this.f32163);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f32164);
        parcel.writeLong(this.f32163);
    }
}
