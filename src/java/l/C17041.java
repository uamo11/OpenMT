package l;

import com.alipay.sdk.m.y.l;

/* compiled from: S4H6 */
/* renamed from: l.ܿ֫ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17041 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52224;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52225;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f52226;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11459 f52227;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52228;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f52229;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52230;

    public C17041(int i, C11459 c11459, InterfaceC20445 interfaceC20445, int i2, int i3, int i4, int i5) {
        this.f52224 = i;
        this.f52227 = c11459;
        this.f52226 = interfaceC20445;
        this.f52225 = i2;
        this.f52230 = i3;
        this.f52228 = i4;
        this.f52229 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17041)) {
            return false;
        }
        C17041 c17041 = (C17041) obj;
        return this.f52224 == c17041.f52224 && this.f52225 == c17041.f52225 && this.f52230 == c17041.f52230 && this.f52228 == c17041.f52228 && this.f52229 == c17041.f52229 && C11003.equals(this.f52227, c17041.f52227) && C11003.equals(this.f52226, c17041.f52226);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f52226) + ((C11003.hashCode(this.f52227) + (((((((((this.f52224 * 31) + this.f52225) * 31) + this.f52230) * 31) + this.f52228) * 31) + this.f52229) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f52224), this.f52227, this.f52226, Integer.valueOf(this.f52225), Integer.valueOf(this.f52230), Integer.valueOf(this.f52228), Integer.valueOf(this.f52229)};
        String[] split = "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".length() == 0 ? new String[0] : "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C17041.class, sb, "[");
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

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m40004(C17041 c17041) {
        return c17041.f52228 >= 0;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m40010(C17041 c17041) {
        InterfaceC20445 interfaceC20445 = c17041.f52226;
        int mo26548 = interfaceC20445.mo26548();
        int i = c17041.f52225;
        return mo26548 == i && interfaceC20445.length() == c17041.f52230 && interfaceC20445.mo26548() == i;
    }
}
