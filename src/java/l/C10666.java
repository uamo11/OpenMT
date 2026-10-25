package l;

/* compiled from: C5F4 */
/* renamed from: l.ۧ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10666 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f32079;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f32080;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32081;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f32082;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f32083;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C10666) obj).f32083.length() - this.f32083.length();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32082);
        sb.append(" ");
        sb.append(this.f32083);
        sb.append(" ");
        sb.append(this.f32080);
        sb.append(" ");
        sb.append(this.f32081 ? "rw" : "ro");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10666.class != obj.getClass()) {
            return false;
        }
        return C11003.equals(this.f32083, ((C10666) obj).f32083);
    }

    public final int hashCode() {
        String str = this.f32083;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
