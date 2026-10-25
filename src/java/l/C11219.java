package l;

/* compiled from: 95AM */
/* renamed from: l.ۧ᩶ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11219 extends AbstractC13397 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7338 f33657;

    public C11219(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, String str, String str2, String[] strArr, String str3) {
        super(enumC1340, abstractC8396Arr);
        this.f33657 = new C7338(str, str2, strArr, str3);
    }

    public C11219(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, C7338 c7338) {
        super(enumC1340, abstractC8396Arr);
        this.f33657 = c7338;
    }

    @Override // l.AbstractC13397
    /* renamed from: ᩷ */
    public final C11072 mo6720() {
        return this.f33657.m19703();
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C11219(this.f25745, m15836(), this.f33657);
    }

    @Override // l.AbstractC8396
    /* renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C11219(this.f25745, m15837(c1403), this.f33657);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    @Override // l.AbstractC8396
    /* renamed from: ܳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6719() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            l.֨᩶ۖ r1 = l.EnumC1340.INVOKE_NEW
            r2 = 1
            l.۟۠ۖ r3 = r7.f33657
            r4 = 0
            l.֨᩶ۖ r5 = r7.f25745
            if (r5 != r1) goto L20
            java.lang.String r1 = "new "
            r0.append(r1)
            java.lang.String r1 = r3.m19702()
            java.lang.String r1 = l.C0459.m2045(r1)
            r0.append(r1)
            goto L3b
        L20:
            l.֨᩶ۖ r1 = l.EnumC1340.INVOKE_STATIC
            r6 = 46
            if (r5 != r1) goto L3d
            java.lang.String r1 = r3.m19702()
            java.lang.String r1 = l.C0459.m2045(r1)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r3.m19700()
            r0.append(r1)
        L3b:
            r1 = 0
            goto L4f
        L3d:
            l.۠᩶ۖ[] r1 = r7.f17269
            r1 = r1[r4]
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r3.m19700()
            r0.append(r1)
            r1 = 1
        L4f:
            r3 = 40
            r0.append(r3)
        L54:
            l.۠᩶ۖ[] r3 = r7.f17269
            int r3 = r3.length
            if (r1 >= r3) goto L6c
            if (r2 == 0) goto L5d
            r2 = 0
            goto L62
        L5d:
            r3 = 44
            r0.append(r3)
        L62:
            l.۠᩶ۖ[] r3 = r7.f17269
            r3 = r3[r1]
            r0.append(r3)
            int r1 = r1 + 1
            goto L54
        L6c:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11219.mo6719():java.lang.String");
    }
}
