package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* compiled from: I749 */
/* renamed from: l.۟ۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7259 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f22273;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f22274;

    public C7259(Uri uri, byte[] bArr) {
        this.f22273 = bArr;
        this.f22274 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7259)) {
            return false;
        }
        C7259 c7259 = (C7259) obj;
        return C11003.equals(this.f22273, c7259.f22273) && C11003.equals(this.f22274, c7259.f22274);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f22274) + (C11003.hashCode(this.f22273) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22273, this.f22274};
        String[] split = "body;finalUri".length() == 0 ? new String[0] : "body;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7259.class, sb, "[");
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
    public final byte[] m19427() {
        return this.f22273;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri m19428() {
        return this.f22274;
    }
}
