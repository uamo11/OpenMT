package l;

import java.util.List;

/* compiled from: 58Q9 */
/* renamed from: l.ܿۖۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17058 implements InterfaceC1368 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C7187 f52267 = new C7187();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f52268;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19714 f52269;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f52270;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f52271;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f52272;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC23408 f52273;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f52274;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17265 f52275;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f52276;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C16559 f52277;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f52278;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f52279;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f52280;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23896 f52281;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52282;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f52283;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f52284;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f52285;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17714 f52286;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7718 f52287;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52288;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C17058(int i) {
        this(i, -9223372036854775807L);
    }

    public C17058(int i, long j) {
        this.f52288 = (i & 2) != 0 ? i | 1 : i;
        this.f52274 = j;
        this.f52286 = new C17714(10);
        this.f52275 = new C17265();
        this.f52287 = new C7718();
        this.f52270 = -9223372036854775807L;
        this.f52277 = new C16559();
        C19714 c19714 = new C19714();
        this.f52269 = c19714;
        this.f52278 = c19714;
        this.f52284 = -1L;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return m40032(interfaceC8424, true);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f52283 = interfaceC21830;
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(0, 1);
        this.f52271 = mo3429;
        this.f52278 = mo3429;
        this.f52283.mo3431();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f52280 = 0;
        this.f52270 = -9223372036854775807L;
        this.f52285 = 0L;
        this.f52272 = 0;
        this.f52268 = j2;
        InterfaceC23408 interfaceC23408 = this.f52273;
        if (!(interfaceC23408 instanceof C16352) || ((C16352) interfaceC23408).m38498(j2)) {
            return;
        }
        this.f52276 = true;
        this.f52278 = this.f52269;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40035() {
        this.f52282 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        if (r18 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        r17.mo22070(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        r16.f52280 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r17.mo22066();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m40032(l.InterfaceC8424 r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r18 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 524288(0x80000, float:7.34684E-40)
        Lc:
            r17.mo22066()
            long r3 = r17.getPosition()
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L3f
            int r3 = r0.f52288
            r3 = r3 & 8
            if (r3 != 0) goto L22
            r3 = 0
            goto L24
        L22:
            l.۟ۖᩴ r3 = l.C17058.f52267
        L24:
            l.ܽۢۧ r4 = r0.f52277
            l.᩻᩵֫ r3 = r4.m38956(r1, r3)
            r0.f52281 = r3
            if (r3 == 0) goto L33
            l.۟᩷ۧ r4 = r0.f52287
            r4.m20671(r3)
        L33:
            long r3 = r17.mo22069()
            int r4 = (int) r3
            if (r18 != 0) goto L3d
            r1.mo22070(r4)
        L3d:
            r3 = 0
            goto L41
        L3f:
            r3 = 0
            r4 = 0
        L41:
            r5 = 0
            r6 = 0
        L43:
            boolean r8 = r16.m40033(r17)
            r9 = 1
            if (r8 == 0) goto L56
            if (r5 <= 0) goto L4d
            goto La8
        L4d:
            r16.m40034()
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L56:
            l.ᩳ֨֫ r8 = r0.f52286
            r8.m41484(r7)
            int r8 = r8.m41493()
            if (r3 == 0) goto L6f
            long r10 = (long) r3
            r12 = -128000(0xfffffffffffe0c00, float:NaN)
            r12 = r12 & r8
            long r12 = (long) r12
            r14 = -128000(0xfffffffffffe0c00, double:NaN)
            long r10 = r10 & r14
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L76
        L6f:
            int r10 = l.C14442.m34471(r8)
            r11 = -1
            if (r10 != r11) goto L9a
        L76:
            int r3 = r6 + 1
            if (r6 != r2) goto L86
            if (r18 == 0) goto L7d
            return r7
        L7d:
            r16.m40034()
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L86:
            if (r18 == 0) goto L91
            r17.mo22066()
            int r5 = r4 + r3
            r1.mo22060(r5)
            goto L94
        L91:
            r1.mo22070(r9)
        L94:
            r5 = 0
            r6 = 0
            r6 = r3
            r3 = 0
            r5 = 0
            goto L43
        L9a:
            int r5 = r5 + 1
            if (r5 != r9) goto La5
            l.ܿۢۧ r3 = r0.f52275
            r3.m40557(r8)
            r3 = r8
            goto Lb5
        La5:
            r8 = 4
            if (r5 != r8) goto Lb5
        La8:
            if (r18 == 0) goto Laf
            int r4 = r4 + r6
            r1.mo22070(r4)
            goto Lb2
        Laf:
            r17.mo22066()
        Lb2:
            r0.f52280 = r3
            return r9
        Lb5:
            int r10 = r10 + (-4)
            r1.mo22060(r10)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17058.m40032(l.۠᩷ۧ, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.mo22069() > (r2 - 4)) goto L12;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m40033(l.InterfaceC8424 r9) {
        /*
            r8 = this;
            l.᩻ۖۧ r0 = r8.f52273
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.mo17870()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.mo22069()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L29
        L1b:
            l.ᩳ֨֫ r0 = r8.f52286     // Catch: java.io.EOFException -> L29
            byte[] r0 = r0.m41482()     // Catch: java.io.EOFException -> L29
            r2 = 0
            r3 = 4
            boolean r9 = r9.mo22068(r1, r2, r3, r0)     // Catch: java.io.EOFException -> L29
            r9 = r9 ^ r1
            return r9
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17058.m40033(l.۠᩷ۧ):boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40034() {
        InterfaceC9505 interfaceC9505 = this.f52273;
        if ((interfaceC9505 instanceof C10709) && ((C9130) interfaceC9505).mo6829()) {
            long j = this.f52284;
            if (j == -1 || j == this.f52273.mo17870()) {
                return;
            }
            this.f52273 = ((C10709) this.f52273).m26889(this.f52284);
            InterfaceC21830 interfaceC21830 = this.f52283;
            interfaceC21830.getClass();
            interfaceC21830.mo3430(this.f52273);
            InterfaceC19383 interfaceC19383 = this.f52271;
            interfaceC19383.getClass();
            interfaceC19383.mo8454(this.f52273.mo6827());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r2 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r37, l.C23615 r38) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17058.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m40031(C23896 c23896) {
        if (c23896 == null) {
            return -9223372036854775807L;
        }
        int m52639 = c23896.m52639();
        for (int i = 0; i < m52639; i++) {
            InterfaceC14723 m52640 = c23896.m52640(i);
            if (m52640 instanceof C8983) {
                C8983 c8983 = (C8983) m52640;
                if (c8983.f44734.equals("TLEN")) {
                    return C3603.m11014(Long.parseLong((String) c8983.f27301.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
