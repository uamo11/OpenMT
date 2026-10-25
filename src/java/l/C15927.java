package l;

/* compiled from: X8TF */
/* renamed from: l.ܺ۫֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15927 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15927 f49192 = new C8873().m22924();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f49193;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f49194;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f49195;

    public C15927(C8873 c8873) {
        boolean z;
        boolean z2;
        boolean z3;
        z = c8873.f27011;
        this.f49193 = z;
        z2 = c8873.f27012;
        this.f49194 = z2;
        z3 = c8873.f27013;
        this.f49195 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15927.class == obj.getClass()) {
            C15927 c15927 = (C15927) obj;
            if (this.f49193 == c15927.f49193 && this.f49194 == c15927.f49194 && this.f49195 == c15927.f49195) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49193 ? 1 : 0) << 2) + ((this.f49194 ? 1 : 0) << 1) + (this.f49195 ? 1 : 0);
    }
}
