package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: F1PL */
/* renamed from: l.ۢܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9688 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C20977();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f29295;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29296;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f29297;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f29298;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11099 f29299;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C9688(C16742 c16742) {
        this.f29296 = c16742.f51390;
        this.f29298 = c16742.f51395;
        this.f29297 = c16742.f51393;
        this.f29295 = c16742.f51397;
        this.f29299 = c16742.f51396;
    }

    public C9688(Parcel parcel) {
        String readString = parcel.readString();
        C11003.requireNonNull(readString);
        this.f29296 = readString;
        String readString2 = parcel.readString();
        C11003.requireNonNull(readString2);
        this.f29298 = readString2;
        String readString3 = parcel.readString();
        C11003.requireNonNull(readString3);
        this.f29297 = readString3;
        String readString4 = parcel.readString();
        C11003.requireNonNull(readString4);
        this.f29295 = readString4;
        String readString5 = parcel.readString();
        C11099 c11099 = new C11099();
        c11099.m27533(readString5);
        this.f29299 = c11099;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29296);
        parcel.writeString(this.f29298);
        parcel.writeString(this.f29297);
        parcel.writeString(this.f29295);
        parcel.writeString(this.f29299.m27532());
    }
}
