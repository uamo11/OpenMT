package l;

import com.alipay.sdk.m.y.l;

/* compiled from: U998 */
/* renamed from: l.ܽ۬᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16668 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f51172;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f51173;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51174;

    public C16668(String str, int i, int i2) {
        this.f51173 = str;
        this.f51172 = i;
        this.f51174 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16668)) {
            return false;
        }
        C16668 c16668 = (C16668) obj;
        return this.f51172 == c16668.f51172 && this.f51174 == c16668.f51174 && this.f51173.equals(c16668.f51173);
    }

    public final int hashCode() {
        return this.f51173.hashCode() + C4153.m12551(this.f51172, 31, this.f51174, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f51173, Integer.valueOf(this.f51172), Integer.valueOf(this.f51174)};
        String[] split = "name;colorRes;styleRes".length() == 0 ? new String[0] : "name;colorRes;styleRes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16668.class, sb, "[");
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
    public final int m39184() {
        return this.f51172;
    }
}
