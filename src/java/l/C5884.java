package l;

/* compiled from: P1SD */
/* renamed from: l.ۛۜ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5884 extends AbstractC13644 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18067;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f18068;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f18069;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2065 f18070;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f18071;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f18072;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11529 f18073;

    public C5884(int i, int i2, int i3, int i4, int i5, C4265 c4265) {
        super(i, i2, i3, i4, c4265);
        this.f18068 = -1;
        this.f18073 = new C11529(i, c4265);
        int i6 = i + 1;
        this.f18069 = i6;
        this.f18071 = c4265.mo4957(i6, false);
        this.f18067 = i6;
        this.f18070 = new C2065(i4 - 1);
        this.f18072 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    @Override // l.AbstractC13644
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16472(C4265 c4265) {
        c4265.mo4955(this.f18071);
        this.f18073.m28371(c4265);
        c4265.mo4954(this.f40691);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m16471() {
        int m32791 = m32791(4);
        if (m32791 != 0) {
            int i = this.f18067 + 1;
            this.f18067 = i;
            int i2 = this.f18069;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f18073.m28369(i3);
                AbstractC13644.m32779(i2, i3, this.f18071);
                this.f18067 -= i3;
            }
            int i4 = this.f18068 + 1;
            this.f18068 = i4;
            if (i4 == i2) {
                this.f18068 = 0;
            }
        }
        return m32791;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r14 >= r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[EDGE_INSN: B:41:0x00d8->B:49:0x00d8 BREAK  A[LOOP:0: B:24:0x0092->B:40:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    @Override // l.AbstractC13644
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C2065 mo16473() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5884.mo16473():l.֫᩷֨");
    }

    @Override // l.AbstractC13644
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo16474(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (m16471() != 0) {
                byte[] bArr = this.f40691;
                int i3 = this.f40694;
                C11529 c11529 = this.f18073;
                c11529.m28370(i3, bArr);
                this.f18071[this.f18068] = c11529.m28374();
                c11529.m28373(this.f18067);
            }
            i = i2;
        }
    }
}
