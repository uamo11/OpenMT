package l;

import com.alipay.sdk.m.y.l;

/* compiled from: 097P */
/* renamed from: l.ܶ֡ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14882 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f45422;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f45423;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45424;

    public C14882(int i, int i2, boolean z) {
        this.f45424 = i;
        this.f45423 = i2;
        this.f45422 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14882)) {
            return false;
        }
        C14882 c14882 = (C14882) obj;
        return this.f45422 == c14882.f45422 && this.f45424 == c14882.f45424 && this.f45423 == c14882.f45423;
    }

    public final int hashCode() {
        return ((((this.f45422 ? 1231 : 1237) * 31) + this.f45424) * 31) + this.f45423;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f45424), Integer.valueOf(this.f45423), Boolean.valueOf(this.f45422)};
        String[] split = "total;failed;canceled".length() == 0 ? new String[0] : "total;failed;canceled".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14882.class, sb, "[");
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
    public final boolean m35316() {
        return this.f45422;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m35317() {
        return this.f45423;
    }
}
