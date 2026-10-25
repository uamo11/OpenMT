package l;

import com.alipay.sdk.m.y.l;

/* compiled from: I7DX */
/* renamed from: l.ᩳᩳ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18209 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56601;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56602;

    public C18209(int i, int i2) {
        this.f56602 = i;
        this.f56601 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18209)) {
            return false;
        }
        C18209 c18209 = (C18209) obj;
        return this.f56602 == c18209.f56602 && this.f56601 == c18209.f56601;
    }

    public final int hashCode() {
        return (this.f56602 * 31) + this.f56601;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f56602), Integer.valueOf(this.f56601)};
        String[] split = "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".length() == 0 ? new String[0] : "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18209.class, sb, "[");
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

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42425() {
        return this.f56601;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m42426() {
        return this.f56602;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42424() {
        return this.f56602 > 0 || this.f56601 > 0;
    }
}
