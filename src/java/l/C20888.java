package l;

/* compiled from: N7T6 */
/* renamed from: l.᩷۬֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20888 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20888 f67585 = new C20888(new C6776());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f67586;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 f67587;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f67588;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f67589;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f67590;

    public C20888(C6776 c6776) {
        AbstractC6079 abstractC6079;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        abstractC6079 = c6776.f21035;
        this.f67587 = abstractC6079;
        z = c6776.f21038;
        this.f67590 = z;
        z2 = c6776.f21034;
        this.f67586 = z2;
        z3 = c6776.f21036;
        this.f67588 = z3;
        z4 = c6776.f21037;
        this.f67589 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20888)) {
            return false;
        }
        C20888 c20888 = (C20888) obj;
        return this.f67587.equals(c20888.f67587) && this.f67586 == c20888.f67586 && this.f67590 == c20888.f67590 && this.f67588 == c20888.f67588 && this.f67589 == c20888.f67589;
    }

    public final int hashCode() {
        return C11003.hash(this.f67587, null, null, Boolean.valueOf(this.f67590), Boolean.valueOf(this.f67586), Boolean.valueOf(this.f67588), Boolean.valueOf(this.f67589));
    }
}
