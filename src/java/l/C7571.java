package l;

/* compiled from: T8TF */
/* renamed from: l.۟ܺۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7571 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f23384 = new C17714(8);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        return false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m20296(l.C16184 r15) {
        /*
            r14 = this;
            long r0 = r15.getLength()
            r2 = -1
            r4 = 1024(0x400, double:5.06E-321)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L12
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L11
            goto L12
        L11:
            r4 = r0
        L12:
            int r2 = (int) r4
            l.ᩳ֨֫ r3 = r14.f23384
            byte[] r4 = r3.m41482()
            r5 = 0
            r7 = 4
            r15.mo22068(r5, r5, r7, r4)
            long r8 = r3.m41479()
            r14.f23383 = r7
        L24:
            r10 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r14.f23383
            int r7 = r7 + r4
            r14.f23383 = r7
            if (r7 != r2) goto L34
            goto L97
        L34:
            byte[] r7 = r3.m41482()
            r15.mo22068(r5, r5, r4, r7)
            r4 = 8
            long r7 = r8 << r4
            r9 = -256(0xffffffffffffff00, double:NaN)
            long r7 = r7 & r9
            byte[] r4 = r3.m41482()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r9 = (long) r4
            long r8 = r7 | r9
            goto L24
        L4e:
            long r2 = r14.m20295(r15)
            int r7 = r14.f23383
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 == 0) goto L97
            if (r6 == 0) goto L64
            long r11 = r7 + r2
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 < 0) goto L64
            goto L97
        L64:
            int r0 = r14.f23383
            long r0 = (long) r0
            long r11 = r7 + r2
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 >= 0) goto L94
            long r0 = r14.m20295(r15)
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 != 0) goto L76
            goto L97
        L76:
            long r0 = r14.m20295(r15)
            r11 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 < 0) goto L97
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 <= 0) goto L88
            goto L97
        L88:
            if (r6 == 0) goto L64
            int r1 = (int) r0
            r15.mo22067(r1, r5)
            int r0 = r14.f23383
            int r0 = r0 + r1
            r14.f23383 = r0
            goto L64
        L94:
            if (r6 != 0) goto L97
            return r4
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7571.m20296(l.ܺ᩷ۧ):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m20295(C16184 c16184) {
        C17714 c17714 = this.f23384;
        int i = 0;
        c16184.mo22068(false, 0, 1, c17714.m41482());
        int i2 = c17714.m41482()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c16184.mo22068(false, 1, i4, c17714.m41482());
        while (i < i4) {
            i++;
            i5 = (c17714.m41482()[i] & 255) + (i5 << 8);
        }
        this.f23383 = i4 + 1 + this.f23383;
        return i5;
    }
}
