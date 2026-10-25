package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.y.l;

/* compiled from: 46W4 */
/* renamed from: l.ܺܺۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16033 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONArray f49453;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18151 f49454;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONArray f49455;

    public C16033(C18151 c18151, JSONArray jSONArray, JSONArray jSONArray2) {
        this.f49454 = c18151;
        this.f49455 = jSONArray;
        this.f49453 = jSONArray2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16033)) {
            return false;
        }
        C16033 c16033 = (C16033) obj;
        return C11003.equals(this.f49454, c16033.f49454) && C11003.equals(this.f49455, c16033.f49455) && C11003.equals(this.f49453, c16033.f49453);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f49453) + ((C11003.hashCode(this.f49455) + (C11003.hashCode(this.f49454) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49454, this.f49455, this.f49453};
        String[] split = "page;warnings;failedFiles".length() == 0 ? new String[0] : "page;warnings;failedFiles".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16033.class, sb, "[");
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
    public final JSONArray m37901() {
        return this.f49453;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18151 m37902() {
        return this.f49454;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONArray m37903() {
        return this.f49455;
    }
}
