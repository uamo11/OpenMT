package l;

/* compiled from: 38EG */
/* renamed from: l.ۨܶ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11793 extends C15688 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C1358 f35182;

    @Override // l.C15688
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28850() {
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1358 m28851() {
        return this.f35182;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ֨ۧ */
    public final C16477 mo24428() {
        int i;
        int i2;
        C1358 c1358 = this.f35182;
        int m4739 = c1358.m4739() & 4095;
        if (c1358.m4770()) {
            i = 40960;
        } else {
            if (c1358.m4768()) {
                i2 = m4739 | 16384;
                return new C16477(i2, c1358.m4746(), c1358.m4756());
            }
            i = 32768;
        }
        i2 = m4739 | i;
        return new C16477(i2, c1358.m4746(), c1358.m4756());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11793(l.C1358 r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.m4741()
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = ""
            r3 = 47
            if (r1 == 0) goto L10
            r5 = r2
            goto L2b
        L10:
            int r1 = r0.length()
            int r4 = r1 + (-1)
            char r5 = r0.charAt(r4)
            if (r5 != r3) goto L1e
            int r4 = r1 + (-2)
        L1e:
            int r1 = r0.lastIndexOf(r3, r4)
            int r1 = r1 + 1
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r1, r4)
            r5 = r0
        L2b:
            java.lang.String r0 = r14.m4741()
            boolean r1 = r0.isEmpty()
            r4 = 0
            if (r1 == 0) goto L38
            r6 = r4
            goto L55
        L38:
            int r1 = r0.length()
            int r6 = r1 + (-1)
            char r7 = r0.charAt(r6)
            if (r7 != r3) goto L46
            int r6 = r1 + (-2)
        L46:
            int r1 = r0.lastIndexOf(r3, r6)
            int r1 = r1 + 1
            if (r1 != 0) goto L4f
            goto L54
        L4f:
            r2 = 0
            java.lang.String r2 = r0.substring(r2, r1)
        L54:
            r6 = r2
        L55:
            boolean r0 = r14.m4770()
            if (r0 == 0) goto L61
            java.lang.String r0 = r14.m4767()
            r7 = r0
            goto L62
        L61:
            r7 = r4
        L62:
            long r8 = r14.m4765()
            java.util.Date r0 = r14.m4758()
            long r10 = r0.getTime()
            boolean r12 = r14.m4766()
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r10, r12)
            r13.f35182 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11793.<init>(l.֨᩷֡):void");
    }
}
