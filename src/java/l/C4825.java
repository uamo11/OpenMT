package l;

/* compiled from: 78PS */
/* renamed from: l.ۙᩴ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C4825 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15252;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f15253;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f15254;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f15255;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f15256;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f15257;

    static {
        new C4825(new C20348());
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
        C3603.m11056(7);
    }

    public C4825(C20348 c20348) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str = C3603.f11424;
        j = c20348.f65716;
        this.f15256 = j;
        j2 = c20348.f65713;
        this.f15253 = j2;
        z = c20348.f65717;
        this.f15257 = z;
        z2 = c20348.f65715;
        this.f15255 = z2;
        z3 = c20348.f65714;
        this.f15254 = z3;
        z4 = c20348.f65712;
        this.f15252 = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825)) {
            return false;
        }
        C4825 c4825 = (C4825) obj;
        return this.f15256 == c4825.f15256 && this.f15253 == c4825.f15253 && this.f15257 == c4825.f15257 && this.f15255 == c4825.f15255 && this.f15254 == c4825.f15254 && this.f15252 == c4825.f15252;
    }

    public final int hashCode() {
        long j = this.f15256;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f15253;
        return ((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f15257 ? 1 : 0)) * 31) + (this.f15255 ? 1 : 0)) * 31) + (this.f15254 ? 1 : 0)) * 31) + (this.f15252 ? 1 : 0);
    }
}
