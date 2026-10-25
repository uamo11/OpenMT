package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* compiled from: 274F */
/* renamed from: l.ۘ֨ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3607 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4951 f11433;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f11434;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21885 f11435;

    public C3607(Uri uri, C4951 c4951, C21885 c21885) {
        this.f11434 = uri;
        this.f11433 = c4951;
        this.f11435 = c21885;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3607)) {
            return false;
        }
        C3607 c3607 = (C3607) obj;
        return C11003.equals(this.f11434, c3607.f11434) && C11003.equals(this.f11433, c3607.f11433) && C11003.equals(this.f11435, c3607.f11435);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f11435) + ((C11003.hashCode(this.f11433) + (C11003.hashCode(this.f11434) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f11434, this.f11433, this.f11435};
        String[] split = "playlistUri;playlist;segment".length() == 0 ? new String[0] : "playlistUri;playlist;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C3607.class, sb, "[");
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
}
