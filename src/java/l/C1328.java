package l;

/* compiled from: UB7S */
/* renamed from: l.֨᩵ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1328 implements InterfaceC5562 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4782;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4783;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f4784;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4785;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f4786;

    public C1328(String str, int i, int i2, boolean z, boolean z2) {
        this.f4782 = i;
        this.f4783 = i2;
        this.f4784 = z;
        this.f4786 = z2;
        this.f4785 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
    @Override // l.InterfaceC5562
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4662(l.AbstractC19261 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f4786
            java.lang.String r1 = r7.f4785
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.mo1457()
        Lc:
            l.ۘۚܺ r0 = r8.f16091
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.getChildren()
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
            r5 = 0
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            l.ۚۚܺ r6 = (l.C5149) r6
            l.᩵ۚܺ r6 = (l.AbstractC19261) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.mo1457()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = 0
            r5 = 1
        L3e:
            boolean r8 = r7.f4784
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.f4782
            int r0 = r7.f4783
            if (r8 != 0) goto L4f
            if (r4 != r0) goto L65
            goto L64
        L4f:
            int r4 = r4 - r0
            int r0 = r4 % r8
            if (r0 != 0) goto L65
            int r0 = java.lang.Integer.signum(r4)
            if (r0 == 0) goto L64
            int r0 = java.lang.Integer.signum(r4)
            int r8 = java.lang.Integer.signum(r8)
            if (r0 != r8) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1328.mo4662(l.᩵ۚܺ):boolean");
    }

    public final String toString() {
        String str = this.f4784 ? "" : "last-";
        boolean z = this.f4786;
        int i = this.f4783;
        int i2 = this.f4782;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f4785) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
