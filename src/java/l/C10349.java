package l;

/* compiled from: 8412 */
/* renamed from: l.ۤܳ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10349 extends AbstractC11760 {
    @Override // l.AbstractC11760, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35100.compareTo(((AbstractC11760) obj).f35100);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10349(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.length()
            if (r0 == 0) goto L13
            java.lang.String r0 = "/"
            boolean r1 = r3.endsWith(r0)
            if (r1 == 0) goto Lf
            goto L13
        Lf:
            java.lang.String r3 = r3.concat(r0)
        L13:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10349.<init>(java.lang.String):void");
    }

    @Override // l.AbstractC11760
    public final String toString() {
        return C9045.m23341(new StringBuilder("RelativeDirectory["), this.f35100, "]");
    }
}
