package l;

/* compiled from: 21RU */
/* renamed from: l.ۤۜ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10118 extends AbstractC13644 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2065 f30457;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30458;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f30459;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f30460;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30461;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11529 f30462;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f30463;

    public C10118(int i, int i2, int i3, int i4, int i5, C4265 c4265) {
        super(i, i2, i3, i4, c4265);
        this.f30461 = -1;
        int i6 = i + 1;
        this.f30458 = i6;
        this.f30463 = i6;
        this.f30462 = new C11529(i, c4265);
        this.f30460 = c4265.mo4957(i6 * 2, false);
        this.f30457 = new C2065(i4 - 1);
        this.f30459 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    @Override // l.AbstractC13644
    /* renamed from: ֫ */
    public final void mo16472(C4265 c4265) {
        c4265.mo4955(this.f30460);
        this.f30462.m28371(c4265);
        c4265.mo4954(this.f40691);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m25402() {
        int m32791 = m32791(this.f40701);
        if (m32791 != 0) {
            int i = this.f30463 + 1;
            this.f30463 = i;
            int i2 = this.f30458;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f30462.m28369(i3);
                AbstractC13644.m32779(i2 * 2, i3, this.f30460);
                this.f30463 -= i3;
            }
            int i4 = this.f30461 + 1;
            this.f30461 = i4;
            if (i4 == i2) {
                this.f30461 = 0;
            }
        }
        return m32791;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        r11[r10] = r16;
        r11[r6] = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    @Override // l.AbstractC13644
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C2065 mo16473() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10118.mo16473():l.֫᩷֨");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r7[r1] = 0;
        r7[r0] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        return;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m25401(int r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.f30461
            int r1 = r0 << 1
            int r1 = r1 + 1
            int r0 = r0 << 1
            int r2 = r13.f30459
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r13.f30463
            int r5 = r5 - r15
            int r6 = r2 + (-1)
            int[] r7 = r13.f30460
            if (r2 == 0) goto L6c
            int r2 = r13.f30458
            if (r5 < r2) goto L1a
            goto L6c
        L1a:
            int r8 = r13.f30461
            int r9 = r8 - r5
            if (r5 <= r8) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            int r9 = r9 + r2
            int r2 = r9 << 1
            int r8 = java.lang.Math.min(r3, r4)
            int r9 = r13.f40694
            int r10 = r9 + r8
            int r10 = r10 - r5
            byte[] r11 = r13.f40691
            r10 = r11[r10]
            int r12 = r9 + r8
            r12 = r11[r12]
            if (r10 != r12) goto L4b
            int r8 = r8 + 1
            int r8 = l.C7295.m19544(r11, r9, r5, r8, r14)
            if (r8 != r14) goto L4b
            r14 = r7[r2]
            r7[r0] = r14
            int r2 = r2 + 1
            r14 = r7[r2]
            r7[r1] = r14
            return
        L4b:
            int r9 = r13.f40694
            int r10 = r9 + r8
            int r10 = r10 - r5
            r5 = r11[r10]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r9 = r9 + r8
            r9 = r11[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r5 >= r9) goto L64
            r7[r0] = r15
            int r2 = r2 + 1
            r15 = r7[r2]
            r0 = r2
            r4 = r8
            goto L6a
        L64:
            r7[r1] = r15
            r15 = r7[r2]
            r1 = r2
            r3 = r8
        L6a:
            r2 = r6
            goto Lc
        L6c:
            r14 = 0
            r7[r1] = r14
            r7[r0] = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10118.m25401(int, int):void");
    }

    @Override // l.AbstractC13644
    /* renamed from: ᩳ */
    public final void mo16474(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int m25402 = m25402();
            int i3 = this.f40701;
            if (m25402 >= i3) {
                m25402 = i3;
            } else if (m25402 == 0) {
                i = i2;
            }
            byte[] bArr = this.f40691;
            int i4 = this.f40694;
            C11529 c11529 = this.f30462;
            c11529.m28370(i4, bArr);
            int m28374 = c11529.m28374();
            c11529.m28373(this.f30463);
            m25401(m25402, m28374);
            i = i2;
        }
    }
}
