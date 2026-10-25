package l;

import com.alipay.sdk.m.y.l;

/* compiled from: D6VU */
/* renamed from: l.۫ۖܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12124 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f36211;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f36212;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 f36213;

    public C12124(int i, int i2, C21834 c21834) {
        this.f36212 = i;
        this.f36211 = i2;
        this.f36213 = c21834;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12124)) {
            return false;
        }
        C12124 c12124 = (C12124) obj;
        return this.f36212 == c12124.f36212 && this.f36211 == c12124.f36211 && C11003.equals(this.f36213, c12124.f36213);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f36213) + C4153.m12551(this.f36212, 31, this.f36211, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f36212), Integer.valueOf(this.f36211), this.f36213};
        String[] split = "start;end;style".length() == 0 ? new String[0] : "start;end;style".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12124.class, sb, "[");
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
