package l;

import com.alipay.sdk.m.y.l;

/* compiled from: C766 */
/* renamed from: l.֡ۧۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0368 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4043 f1783;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f1784;

    public C0368(C4043 c4043, long j) {
        this.f1783 = c4043;
        this.f1784 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0368)) {
            return false;
        }
        C0368 c0368 = (C0368) obj;
        return this.f1784 == c0368.f1784 && C11003.equals(this.f1783, c0368.f1783);
    }

    public final int hashCode() {
        long j = this.f1784;
        return C11003.hashCode(this.f1783) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1783, Long.valueOf(this.f1784)};
        String[] split = "mapping;targetVirtualAddress".length() == 0 ? new String[0] : "mapping;targetVirtualAddress".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0368.class, sb, "[");
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
