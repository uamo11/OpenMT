package l;

import android.net.Uri;
import android.os.Parcel;
import java.io.Serializable;

/* compiled from: U170 */
/* renamed from: l.۫ܶܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12493 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Uri f37530;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f37531;

    public C12493(Uri uri) {
        this.f37530 = uri;
        Parcel obtain = Parcel.obtain();
        uri.writeToParcel(obtain, 0);
        this.f37531 = obtain.marshall();
        obtain.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri m30660() {
        if (this.f37530 == null) {
            Parcel obtain = Parcel.obtain();
            byte[] bArr = this.f37531;
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            this.f37530 = (Uri) Uri.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f37530;
    }

    public final String toString() {
        return this.f37530.toString();
    }
}
