package l;

/* compiled from: 78R7 */
/* renamed from: l.֡۬֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0425 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 f1891;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 f1892;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f1893;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f1894;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15894 f1895;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 f1896;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f1897;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f1898;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f1899;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f1900;

    public C0425(long j, AbstractC4846 abstractC4846, int i, C15894 c15894, long j2, AbstractC4846 abstractC48462, int i2, C15894 c158942, long j3, long j4) {
        this.f1900 = j;
        this.f1892 = abstractC4846;
        this.f1893 = i;
        this.f1895 = c15894;
        this.f1897 = j2;
        this.f1896 = abstractC48462;
        this.f1898 = i2;
        this.f1891 = c158942;
        this.f1894 = j3;
        this.f1899 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0425.class == obj.getClass()) {
            C0425 c0425 = (C0425) obj;
            if (this.f1900 == c0425.f1900 && this.f1893 == c0425.f1893 && this.f1897 == c0425.f1897 && this.f1898 == c0425.f1898 && this.f1894 == c0425.f1894 && this.f1899 == c0425.f1899 && C11003.equals(this.f1892, c0425.f1892) && C11003.equals(this.f1895, c0425.f1895) && C11003.equals(this.f1896, c0425.f1896) && C11003.equals(this.f1891, c0425.f1891)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f1900), this.f1892, Integer.valueOf(this.f1893), this.f1895, Long.valueOf(this.f1897), this.f1896, Integer.valueOf(this.f1898), this.f1891, Long.valueOf(this.f1894), Long.valueOf(this.f1899));
    }
}
