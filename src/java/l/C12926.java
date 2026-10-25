package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: M6O6 */
/* renamed from: l.۬ۛۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12926 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8694 f38794;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f38795;

    public C12926() {
        throw null;
    }

    public C12926(ArrayList arrayList, C8694 c8694) {
        this.f38795 = arrayList;
        this.f38794 = c8694;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12926)) {
            return false;
        }
        C12926 c12926 = (C12926) obj;
        return C11003.equals(this.f38795, c12926.f38795) && C11003.equals(this.f38794, c12926.f38794);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f38794) + (C11003.hashCode(this.f38795) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f38795, this.f38794};
        String[] split = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12926.class, sb, "[");
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
