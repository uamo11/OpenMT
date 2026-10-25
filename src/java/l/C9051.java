package l;

import com.alipay.sdk.m.y.l;

/* compiled from: PB28 */
/* renamed from: l.ۡᩳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9051 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f27451;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f27452;

    public C9051(int i, byte[] bArr) {
        this.f27451 = i;
        this.f27452 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9051)) {
            return false;
        }
        C9051 c9051 = (C9051) obj;
        return this.f27451 == c9051.f27451 && C11003.equals(this.f27452, c9051.f27452);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f27452) + (this.f27451 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27451), this.f27452};
        String[] split = "algorithmId;signature".length() == 0 ? new String[0] : "algorithmId;signature".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9051.class, sb, "[");
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
