package l;

/* compiled from: Z6QT */
/* renamed from: l.ᩴۚܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18556 implements InterfaceC10795 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f57591;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f57592;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f57593;

    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    public C18556(long[] jArr, int[] iArr, boolean z) {
        this.f57591 = jArr;
        this.f57593 = iArr;
        this.f57592 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[RETURN] */
    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2465(int r10) {
        /*
            r9 = this;
            long[] r0 = r9.f57591
            int r1 = r0.length
            int r1 = r1 << 6
            r2 = 0
            r3 = 1
            if (r10 >= r1) goto L18
            int r1 = r10 >>> 6
            r4 = r0[r1]
            r0 = 1
            long r0 = r0 << r10
            long r0 = r0 & r4
            r4 = 0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L42
            goto L41
        L18:
            r0 = 65536(0x10000, float:9.1835E-41)
            boolean r1 = r9.f57592
            if (r10 >= r0) goto L1f
            return r1
        L1f:
            int[] r0 = r9.f57593
            int r4 = r0.length
            int r4 = r4 / 2
            int r4 = r4 - r3
            r5 = 0
        L26:
            if (r5 > r4) goto L3e
            int r6 = r5 + r4
            int r6 = r6 >>> r3
            int r7 = r6 * 2
            r8 = r0[r7]
            int r7 = r7 + r3
            r7 = r0[r7]
            if (r10 >= r8) goto L37
            int r4 = r6 + (-1)
            goto L26
        L37:
            if (r10 <= r7) goto L3c
            int r5 = r6 + 1
            goto L26
        L3c:
            r10 = 1
            goto L3f
        L3e:
            r10 = 0
        L3f:
            if (r1 == r10) goto L42
        L41:
            return r3
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18556.mo2465(int):boolean");
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
