package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* compiled from: I73O */
/* renamed from: l.֡֨ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0078 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f996;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f997;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f998;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f999;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3104 f1000;

    public C0078(String str, String str2, byte[] bArr, Uri uri, C3104 c3104) {
        this.f998 = str;
        this.f999 = str2;
        this.f996 = bArr;
        this.f997 = uri;
        this.f1000 = c3104;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0078)) {
            return false;
        }
        C0078 c0078 = (C0078) obj;
        return C11003.equals(this.f998, c0078.f998) && C11003.equals(this.f999, c0078.f999) && C11003.equals(this.f996, c0078.f996) && C11003.equals(this.f997, c0078.f997) && C11003.equals(this.f1000, c0078.f1000);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f1000) + ((C11003.hashCode(this.f997) + ((C11003.hashCode(this.f996) + C20361.m46680(C11003.hashCode(this.f998) * 31, 31, this.f999)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f998, this.f999, this.f996, this.f997, this.f1000};
        String[] split = "identity;stableKey;body;finalUri;originalSpec".length() == 0 ? new String[0] : "identity;stableKey;body;finalUri;originalSpec".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0078.class, sb, "[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m1033() {
        return this.f996;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3104 m1034() {
        return this.f1000;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri m1035() {
        return this.f997;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m1036() {
        return this.f998;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m1037() {
        return this.f999;
    }
}
