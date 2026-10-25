package l;

/* compiled from: D77D */
/* renamed from: l.۬᩸ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13386 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13902 f40010;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13902 f40011;

    public C13386(C13902 c13902, C13902 c139022) {
        this.f40010 = c13902;
        this.f40011 = c139022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13386) {
            C13386 c13386 = (C13386) obj;
            if (this.f40010 == c13386.f40010 && this.f40011 == c13386.f40011) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f40011) + (System.identityHashCode(this.f40010) * 31);
    }
}
