package l;

/* compiled from: Y4W0 */
/* renamed from: l.᩸᩻ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21916 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f70167;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f70168;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f70169;

    public C21916(String str, int i, int i2) {
        str.getClass();
        this.f70169 = str;
        this.f70168 = i;
        this.f70167 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49327(int i) {
        int i2;
        int i3 = this.f70168;
        if (i3 >= 0 && (i2 = this.f70167) <= i && i3 <= i2) {
            String str = this.f70169;
            int indexOf = str.indexOf(59);
            if (indexOf == -1) {
                return C7184.m19210(str);
            }
            if (C7184.m19210(str.substring(0, indexOf))) {
                boolean z = true;
                while (z) {
                    int i4 = indexOf + 1;
                    int indexOf2 = str.indexOf(61, i4);
                    if (indexOf2 != -1) {
                        String substring = str.substring(i4, indexOf2);
                        int indexOf3 = str.indexOf(59, indexOf2 + 1);
                        if (indexOf3 == -1) {
                            z = false;
                        }
                        if (C7184.m19210(substring)) {
                            indexOf = indexOf3;
                        }
                    } else {
                        z = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21916.class == obj.getClass()) {
            C21916 c21916 = (C21916) obj;
            if (this.f70168 == c21916.f70168 && this.f70167 == c21916.f70167 && this.f70169.equals(c21916.f70169)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f70169.hashCode() * 31) + this.f70168) * 31) + this.f70167;
    }

    public final String toString() {
        return "Style{value='" + this.f70169 + "', start=" + this.f70168 + ", end=" + this.f70167 + '}';
    }
}
