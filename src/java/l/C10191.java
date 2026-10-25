package l;

/* compiled from: UBJN */
/* renamed from: l.ۤۡܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10191 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10191 f30620 = new C10191(null, -1, -1);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30621;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30622;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13217 f30623;

    public C10191(C13217 c13217, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f30623 = c13217;
        this.f30621 = i;
        this.f30622 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C13217 c13217 = this.f30623;
        if (c13217 != null) {
            sb.append(c13217.mo2463());
            sb.append(":");
        }
        int i = this.f30622;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f30621;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(C14712.m35006(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f30623;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof l.C10191
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            l.ۤۡܺ r5 = (l.C10191) r5
            int r2 = r4.f30621
            int r3 = r5.f30621
            if (r2 != r3) goto L27
            int r2 = r4.f30622
            int r3 = r5.f30622
            if (r2 != r3) goto L27
            l.۬ܺܺ r5 = r5.f30623
            l.۬ܺܺ r2 = r4.f30623
            if (r2 == r5) goto L26
            if (r2 == 0) goto L27
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
        L26:
            return r0
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10191.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f30623.hashCode() + this.f30621 + this.f30622;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25589(C10191 c10191) {
        return this.f30622 == c10191.f30622;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25588() {
        return this.f30622;
    }
}
