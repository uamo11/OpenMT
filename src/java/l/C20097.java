package l;

import com.alipay.sdk.m.y.l;
import java.util.List;

/* compiled from: KAHM */
/* renamed from: l.᩶ۢ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20097 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f65092;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f65093;

    public C20097(List list, List list2) {
        this.f65093 = list;
        this.f65092 = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20097)) {
            return false;
        }
        C20097 c20097 = (C20097) obj;
        return C11003.equals(this.f65093, c20097.f65093) && C11003.equals(this.f65092, c20097.f65092);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f65092) + (C11003.hashCode(this.f65093) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65093, this.f65092};
        String[] split = "uidList;gidList".length() == 0 ? new String[0] : "uidList;gidList".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20097.class, sb, "[");
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
    public final List m46343() {
        return this.f65092;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m46344() {
        return this.f65093;
    }
}
