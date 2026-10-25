package l;

/* compiled from: H8LH */
/* renamed from: l.ۘ֫ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3632 implements InterfaceC9546, InterfaceC20835 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f11480;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 f11481;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f11482;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2221[] f11483 = new C2221[0];

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f11484;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20835 f11485;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0103 f11486;

    @Override // l.InterfaceC19588
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835 = this.f11485;
        interfaceC20835.getClass();
        interfaceC20835.mo11119((InterfaceC0536) this);
    }

    public C3632(InterfaceC9546 interfaceC9546, boolean z, long j, long j2) {
        this.f11481 = interfaceC9546;
        this.f11480 = z ? j : -9223372036854775807L;
        this.f11482 = j;
        this.f11484 = j2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11123(long j) {
        this.f11482 = 0L;
        this.f11484 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11118(C0103 c0103) {
        this.f11486 = c0103;
    }

    @Override // l.InterfaceC9546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11121(InterfaceC20835 interfaceC20835, long j) {
        this.f11485 = interfaceC20835;
        this.f11481.mo11121(this, j);
    }

    @Override // l.InterfaceC9546
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo11124() {
        C0103 c0103 = this.f11486;
        if (c0103 != null) {
            throw c0103;
        }
        this.f11481.mo11124();
    }

    @Override // l.InterfaceC9546
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6181 mo11126() {
        return this.f11481.mo11126();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    @Override // l.InterfaceC9546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo11116(l.InterfaceC9731[] r10, boolean[] r11, l.InterfaceC18882[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            l.ۖ֫ۧ[] r0 = new l.C2221[r0]
            r9.f11483 = r0
            int r0 = r12.length
            l.ᩴܽۧ[] r0 = new l.InterfaceC18882[r0]
            r1 = 0
        L9:
            int r2 = r12.length
            if (r1 >= r2) goto L1f
            l.ۖ֫ۧ[] r2 = r9.f11483
            r3 = r12[r1]
            l.ۖ֫ۧ r3 = (l.C2221) r3
            r2[r1] = r3
            if (r3 == 0) goto L19
            l.ᩴܽۧ r2 = r3.f7269
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L1f:
            l.ۢۧۧ r1 = r9.f11481
            r2 = r10
            r3 = r11
            r4 = r0
            r5 = r13
            r6 = r14
            long r1 = r1.mo11116(r2, r3, r4, r5, r6)
            long r3 = r9.f11484
            r11 = 0
            long r5 = java.lang.Math.max(r1, r14)
            r7 = -9223372036854775808
            int r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r13 == 0) goto L3b
            long r5 = java.lang.Math.min(r5, r3)
        L3b:
            boolean r13 = r9.m11125()
            if (r13 == 0) goto L67
            int r13 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r13 >= 0) goto L46
            goto L62
        L46:
            r13 = 0
            int r15 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r15 == 0) goto L67
            int r13 = r10.length
            r14 = 0
        L4e:
            if (r14 >= r13) goto L67
            r15 = r10[r14]
            if (r15 == 0) goto L64
            l.۠ᩴ֫ r15 = r15.mo2382()
            java.lang.String r1 = r15.f25614
            java.lang.String r15 = r15.f25619
            boolean r15 = l.C9786.m24798(r1, r15)
            if (r15 != 0) goto L64
        L62:
            r13 = r5
            goto L6c
        L64:
            int r14 = r14 + 1
            goto L4e
        L67:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6c:
            r9.f11480 = r13
            r10 = 0
        L6f:
            int r13 = r12.length
            if (r10 >= r13) goto L95
            r13 = r0[r10]
            if (r13 != 0) goto L7b
            l.ۖ֫ۧ[] r13 = r9.f11483
            r13[r10] = r11
            goto L8c
        L7b:
            l.ۖ֫ۧ[] r14 = r9.f11483
            r15 = r14[r10]
            if (r15 == 0) goto L85
            l.ᩴܽۧ r15 = r15.f7269
            if (r15 == r13) goto L8c
        L85:
            l.ۖ֫ۧ r15 = new l.ۖ֫ۧ
            r15.<init>(r9, r13)
            r14[r10] = r15
        L8c:
            l.ۖ֫ۧ[] r13 = r9.f11483
            r13 = r13[r10]
            r12[r10] = r13
            int r10 = r10 + 1
            goto L6f
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3632.mo11116(l.ۢܿۧ[], boolean[], l.ᩴܽۧ[], boolean[], long):long");
    }

    @Override // l.InterfaceC9546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11117(long j, boolean z) {
        this.f11481.mo11117(j, z);
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final void mo2268(long j) {
        this.f11481.mo2268(j);
    }

    @Override // l.InterfaceC9546
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo11122() {
        if (m11125()) {
            long j = this.f11480;
            this.f11480 = -9223372036854775807L;
            long mo11122 = mo11122();
            return mo11122 != -9223372036854775807L ? mo11122 : j;
        }
        long mo111222 = this.f11481.mo11122();
        if (mo111222 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f11482;
        long j3 = this.f11484;
        long max = Math.max(mo111222, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۜ */
    public final long mo2266() {
        long mo2266 = this.f11481.mo2266();
        if (mo2266 != Long.MIN_VALUE) {
            long j = this.f11484;
            if (j == Long.MIN_VALUE || mo2266 < j) {
                return mo2266;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC9546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo11114(long j) {
        this.f11480 = -9223372036854775807L;
        for (C2221 c2221 : this.f11483) {
            if (c2221 != null) {
                c2221.m7396();
            }
        }
        long mo11114 = this.f11481.mo11114(j);
        long j2 = this.f11482;
        long j3 = this.f11484;
        long max = Math.max(mo11114, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // l.InterfaceC9546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo11115(long j, C9599 c9599) {
        long j2 = this.f11482;
        if (j == j2) {
            return j2;
        }
        long m11016 = C3603.m11016(c9599.f29130, 0L, j - j2);
        long j3 = c9599.f29129;
        long j4 = this.f11484;
        long m110162 = C3603.m11016(j3, 0L, j4 == Long.MIN_VALUE ? C13132.FOREVER_NS : j4 - j);
        if (m11016 != c9599.f29130 || m110162 != c9599.f29129) {
            c9599 = new C9599(m11016, m110162);
        }
        return this.f11481.mo11115(j, c9599);
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final long mo2267() {
        long mo2267 = this.f11481.mo2267();
        if (mo2267 != Long.MIN_VALUE) {
            long j = this.f11484;
            if (j == Long.MIN_VALUE || mo2267 < j) {
                return mo2267;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        return this.f11481.mo2265(c11469);
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2264() {
        return this.f11481.mo2264();
    }

    @Override // l.InterfaceC20835
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        if (this.f11486 != null) {
            return;
        }
        InterfaceC20835 interfaceC20835 = this.f11485;
        interfaceC20835.getClass();
        interfaceC20835.mo11120((InterfaceC9546) this);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m11125() {
        return this.f11480 != -9223372036854775807L;
    }
}
