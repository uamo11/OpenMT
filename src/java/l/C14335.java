package l;

import com.alipay.sdk.m.y.l;

/* compiled from: O7FP */
/* renamed from: l.ܳۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14335 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f43225;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f43226;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6575 f43227;

    public C14335(EnumC6575 enumC6575, int i, String str) {
        this.f43227 = enumC6575;
        this.f43225 = i;
        this.f43226 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14335)) {
            return false;
        }
        C14335 c14335 = (C14335) obj;
        return this.f43225 == c14335.f43225 && C11003.equals(this.f43227, c14335.f43227) && C11003.equals(this.f43226, c14335.f43226);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f43226) + ((C11003.hashCode(this.f43227) + (this.f43225 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f43227, Integer.valueOf(this.f43225), this.f43226};
        String[] split = "type;logicalIndex;subtitleFilename".length() == 0 ? new String[0] : "type;logicalIndex;subtitleFilename".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14335.class, sb, "[");
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
    public final int m34207() {
        return this.f43225;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m34208() {
        return this.f43226;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC6575 m34209() {
        return this.f43227;
    }
}
