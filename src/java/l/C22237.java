package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: O607 */
/* renamed from: l.᩹ۧ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22237 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C21532();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72165;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72166;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72167;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72168;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72169;

    public C22237(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f72165 = 0;
        this.f72165 = parcel.readInt();
        this.f72169 = parcel.readInt();
        this.f72167 = parcel.readInt();
        this.f72166 = parcel.readInt();
        this.f72168 = parcel.readInt();
    }

    public C22237(Parcelable parcelable) {
        super(parcelable);
        this.f72165 = 0;
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f72165);
        parcel.writeInt(this.f72169);
        parcel.writeInt(this.f72167);
        parcel.writeInt(this.f72166);
        parcel.writeInt(this.f72168);
    }
}
