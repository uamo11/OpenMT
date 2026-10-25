package l;

import com.alipay.sdk.m.y.l;

/* compiled from: D8GL */
/* renamed from: l.֨ۤۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1054 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f3886;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f3887;

    public C1054(String str, String str2) {
        this.f3886 = str;
        this.f3887 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1054)) {
            return false;
        }
        C1054 c1054 = (C1054) obj;
        return C11003.equals(this.f3886, c1054.f3886) && C11003.equals(this.f3887, c1054.f3887);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f3887) + (C11003.hashCode(this.f3886) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f3886, this.f3887};
        String[] split = "playbackPositionKey;subtitlePath".length() == 0 ? new String[0] : "playbackPositionKey;subtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1054.class, sb, "[");
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
    public final String m3623() {
        return this.f3886;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m3624() {
        return this.f3887;
    }
}
