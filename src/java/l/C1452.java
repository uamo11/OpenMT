package l;

import com.alipay.sdk.m.y.l;

/* compiled from: K7HV */
/* renamed from: l.֨᩻ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1452 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f5187;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5188;

    public C1452(String str, int i) {
        this.f5187 = str;
        this.f5188 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1452)) {
            return false;
        }
        C1452 c1452 = (C1452) obj;
        return this.f5188 == c1452.f5188 && C11003.equals(this.f5187, c1452.f5187);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5187) + (this.f5188 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5187, Integer.valueOf(this.f5188)};
        String[] split = "path;sortingData".length() == 0 ? new String[0] : "path;sortingData".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1452.class, sb, "[");
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
    public final String m4993() {
        return this.f5187;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4994() {
        return this.f5188;
    }
}
