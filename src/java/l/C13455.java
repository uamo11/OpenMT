package l;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: J622 */
/* renamed from: l.ܰ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13455 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9929();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Uri f40180;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f40181;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CharSequence f40182;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f40183;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f40184;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f40185;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f40186;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f40187;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MediaDescription f40188;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C13455(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f40185 = str;
        this.f40182 = charSequence;
        this.f40183 = charSequence2;
        this.f40187 = charSequence3;
        this.f40181 = bitmap;
        this.f40180 = uri;
        this.f40186 = bundle;
        this.f40184 = uri2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32479() {
        return this.f40185;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f40188;
        if (mediaDescription == null) {
            MediaDescription.Builder m16007 = C5695.m16007();
            C5695.m16014(m16007, this.f40185);
            C5695.m16027(m16007, this.f40182);
            C5695.m16022(m16007, this.f40183);
            C5695.m16013(m16007, this.f40187);
            C5695.m16010(m16007, this.f40181);
            C5695.m16011(m16007, this.f40180);
            Bundle bundle2 = this.f40186;
            Uri uri = this.f40184;
            if (i2 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                C5695.m16012(m16007, bundle);
            } else {
                C5695.m16012(m16007, bundle2);
            }
            if (i2 >= 23) {
                C11340.m28017(m16007, uri);
            }
            mediaDescription = C5695.m16008(m16007);
            this.f40188 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.f40182) + ", " + ((Object) this.f40183) + ", " + ((Object) this.f40187);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13455 m32478(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L83
            int r1 = android.os.Build.VERSION.SDK_INT
            l.᩺ r2 = new l.᩺
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = l.C5695.m16029(r9)
            r2.m50623(r3)
            java.lang.CharSequence r3 = l.C5695.m16036(r9)
            r2.m50626(r3)
            java.lang.CharSequence r3 = l.C5695.m16024(r9)
            r2.m50625(r3)
            java.lang.CharSequence r3 = l.C5695.m16009(r9)
            r2.m50622(r3)
            android.graphics.Bitmap r3 = l.C5695.m16026(r9)
            r2.m50619(r3)
            android.net.Uri r3 = l.C5695.m16031(r9)
            r2.m50620(r3)
            android.os.Bundle r3 = l.C5695.m16021(r9)
            if (r3 == 0) goto L44
            l.C23645.m52135(r3)
            r3.isEmpty()     // Catch: android.os.BadParcelableException -> L43
            goto L44
        L43:
            r3 = r0
        L44:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L50
        L4f:
            r5 = r0
        L50:
            if (r5 == 0) goto L68
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L62
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L62
            goto L69
        L62:
            r3.remove(r4)
            r3.remove(r6)
        L68:
            r0 = r3
        L69:
            r2.m50621(r0)
            if (r5 == 0) goto L72
            r2.m50624(r5)
            goto L7d
        L72:
            r0 = 23
            if (r1 < r0) goto L7d
            android.net.Uri r0 = l.C11340.m28016(r9)
            r2.m50624(r0)
        L7d:
            l.ܰ r0 = r2.m50618()
            r0.f40188 = r9
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13455.m32478(java.lang.Object):l.ܰ");
    }
}
