package l;

import com.alipay.sdk.m.y.l;

/* compiled from: 28WH */
/* renamed from: l.ܰ۫ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13822 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f41229;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f41230;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f41231;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f41232;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f41233;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41234;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f41235;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f41236;

    public C13822(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f41230 = i;
        this.f41229 = i2;
        this.f41235 = i3;
        this.f41231 = i4;
        this.f41236 = i5;
        this.f41234 = i6;
        this.f41233 = i7;
        this.f41232 = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13822)) {
            return false;
        }
        C13822 c13822 = (C13822) obj;
        return this.f41230 == c13822.f41230 && this.f41229 == c13822.f41229 && this.f41235 == c13822.f41235 && this.f41231 == c13822.f41231 && this.f41236 == c13822.f41236 && this.f41234 == c13822.f41234 && this.f41233 == c13822.f41233 && this.f41232 == c13822.f41232;
    }

    public final int hashCode() {
        return (((((((((((((this.f41230 * 31) + this.f41229) * 31) + this.f41235) * 31) + this.f41231) * 31) + this.f41236) * 31) + this.f41234) * 31) + this.f41233) * 31) + this.f41232;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f41230), Integer.valueOf(this.f41229), Integer.valueOf(this.f41235), Integer.valueOf(this.f41231), Integer.valueOf(this.f41236), Integer.valueOf(this.f41234), Integer.valueOf(this.f41233), Integer.valueOf(this.f41232)};
        String[] split = "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".length() == 0 ? new String[0] : "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C13822.class, sb, "[");
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
