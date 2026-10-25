package l;

import com.alipay.sdk.m.y.l;

/* compiled from: X6VB */
/* renamed from: l.ۢۘۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9335 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28312;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f28313;

    public C9335(String str, int i) {
        this.f28313 = str;
        this.f28312 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9335)) {
            return false;
        }
        C9335 c9335 = (C9335) obj;
        return this.f28312 == c9335.f28312 && C11003.equals(this.f28313, c9335.f28313);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f28313) + (this.f28312 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28313, Integer.valueOf(this.f28312)};
        String[] split = "text;replacements".length() == 0 ? new String[0] : "text;replacements".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9335.class, sb, "[");
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
    public final int m24027() {
        return this.f28312;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m24028() {
        return this.f28313;
    }
}
