package l;

import com.alipay.sdk.m.y.l;

/* compiled from: R8AK */
/* renamed from: l.᩸᩵᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21797 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69818;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13935 f69819;

    public C21797(C13935 c13935, String str) {
        this.f69819 = c13935;
        this.f69818 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21797)) {
            return false;
        }
        C21797 c21797 = (C21797) obj;
        return C11003.equals(this.f69819, c21797.f69819) && C11003.equals(this.f69818, c21797.f69818);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f69818) + (C11003.hashCode(this.f69819) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f69819, this.f69818};
        String[] split = "share;path".length() == 0 ? new String[0] : "share;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21797.class, sb, "[");
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
