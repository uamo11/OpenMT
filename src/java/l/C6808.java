package l;

import com.alipay.sdk.m.y.l;

/* compiled from: Q5YY */
/* renamed from: l.ۜܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6808 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21132;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f21133;

    public C6808(int i, int i2) {
        this.f21132 = i;
        this.f21133 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6808)) {
            return false;
        }
        C6808 c6808 = (C6808) obj;
        return this.f21132 == c6808.f21132 && this.f21133 == c6808.f21133;
    }

    public final int hashCode() {
        return (this.f21132 * 31) + this.f21133;
    }

    public final int length() {
        return this.f21133;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f21132), Integer.valueOf(this.f21133)};
        String[] split = "index;length".length() == 0 ? new String[0] : "index;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6808.class, sb, "[");
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
    public final int m18498() {
        return this.f21132;
    }
}
