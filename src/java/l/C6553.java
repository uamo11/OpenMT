package l;

/* compiled from: UBJ4 */
/* renamed from: l.ۜۚۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C6553 extends EnumC22780 {
    public /* synthetic */ C6553() {
        this("InColumnGroup", 11);
    }

    public C6553(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r3.equals("html") == false) goto L51;
     */
    @Override // l.EnumC22780
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1361(l.AbstractC2195 r8, l.C17136 r9) {
        /*
            r7 = this;
            boolean r0 = l.EnumC22780.m50854(r8)
            r1 = 1
            if (r0 == 0) goto L10
            r8.getClass()
            l.ܿ֨ۚ r8 = (l.C17011) r8
            r9.m40179(r8)
            return r1
        L10:
            int[] r0 = l.C21370.f68842
            l.ܺ֨ۚ r2 = r8.f7214
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto Lbd
            r2 = 2
            if (r0 == r2) goto Lb9
            r3 = 3
            r4 = 0
            java.lang.String r5 = "template"
            java.lang.String r6 = "html"
            if (r0 == r3) goto L72
            r2 = 4
            if (r0 == r2) goto L3e
            r2 = 6
            if (r0 == r2) goto L32
            boolean r8 = r7.m18060(r8, r9)
            return r8
        L32:
            boolean r0 = r9.m2157(r6)
            if (r0 == 0) goto L39
            return r1
        L39:
            boolean r8 = r7.m18060(r8, r9)
            return r8
        L3e:
            r0 = r8
            l.᩷֨ۚ r0 = (l.C20540) r0
            java.lang.String r0 = r0.f26122
            r0.getClass()
            boolean r2 = r0.equals(r5)
            if (r2 != 0) goto L6c
            java.lang.String r2 = "colgroup"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L59
            boolean r8 = r7.m18060(r8, r9)
            return r8
        L59:
            boolean r8 = r9.m2157(r0)
            if (r8 != 0) goto L63
            r9.m40182(r7)
            return r4
        L63:
            r9.m40190()
            l.᩺ۚۚ r8 = l.EnumC22780.f73560
            r9.m40212(r8)
            return r1
        L6c:
            l.᩺ۚۚ r0 = l.EnumC22780.f73545
            r9.m40175(r8, r0)
            return r1
        L72:
            r0 = r8
            l.ۢ֨ۚ r0 = (l.C9251) r0
            java.lang.String r3 = r0.f26122
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1321546630: goto L94;
                case 98688: goto L89;
                case 3213227: goto L82;
                default: goto L81;
            }
        L81:
            goto L9d
        L82:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L9e
            goto L9d
        L89:
            java.lang.String r2 = "col"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L92
            goto L9d
        L92:
            r2 = 1
            goto L9e
        L94:
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L9b
            goto L9d
        L9b:
            r2 = 0
            goto L9e
        L9d:
            r2 = -1
        L9e:
            switch(r2) {
                case 0: goto Lb3;
                case 1: goto Laf;
                case 2: goto La6;
                default: goto La1;
            }
        La1:
            boolean r8 = r7.m18060(r8, r9)
            return r8
        La6:
            l.᩺ۚۚ r0 = l.EnumC22780.f73546
            r9.f2106 = r8
            boolean r8 = r0.mo1361(r8, r9)
            return r8
        Laf:
            r9.m40201(r0)
            return r1
        Lb3:
            l.᩺ۚۚ r0 = l.EnumC22780.f73545
            r9.m40175(r8, r0)
            return r1
        Lb9:
            r9.m40182(r7)
            return r1
        Lbd:
            l.ܳ֨ۚ r8 = (l.C14188) r8
            r9.m40178(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6553.mo1361(l.ۖ֨ۚ, l.ܿۚۚ):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m18060(AbstractC2195 abstractC2195, C17136 c17136) {
        if (!c17136.m2157("colgroup")) {
            c17136.m40182(this);
            return false;
        }
        c17136.m40190();
        c17136.m40212(EnumC22780.f73560);
        c17136.mo2158(abstractC2195);
        return true;
    }
}
