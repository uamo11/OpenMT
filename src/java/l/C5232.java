package l;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;

/* compiled from: X6W3 */
/* renamed from: l.ۚ۠ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5232 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C22927 f16385;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16388;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15108 f16389 = new C15108();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16390;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f16391;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long[] f16392;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f16393;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16394;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f16395;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1476 f16396;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8054 f16397;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16398;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Thread f16399;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f16400;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9466 f16401;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f16402;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f16403;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16404;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f16405;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f16406;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f16407;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f16408;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16409;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16410;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f16387 = new int[0];

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long[] f16386 = new long[0];

    static {
        C19344 c19344 = new C19344();
        Arrays.fill(new int[32], -1);
        Arrays.fill(new int[9], -1);
        f16385 = c19344;
    }

    public C5232(C8054 c8054) {
        int[] iArr = f16387;
        this.f16391 = iArr;
        this.f16402 = iArr;
        this.f16408 = iArr;
        long[] jArr = f16386;
        this.f16392 = jArr;
        this.f16405 = iArr;
        this.f16407 = jArr;
        this.f16393 = iArr;
        this.f16404 = -1;
        this.f16397 = c8054;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15076() {
        if (this.f16406) {
            throw new IllegalStateException("Regex matcher is already executing");
        }
        C1476 c1476 = this.f16397.f24845;
        if (this.f16396 != c1476) {
            this.f16401 = c1476.m5105();
            this.f16396 = c1476;
            this.f16391 = f16387;
        }
        this.f16406 = true;
        this.f16390 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r13.f28781 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15111(int r12, java.lang.CharSequence r13) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15111(int, java.lang.CharSequence):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15112(int i, CharSequence charSequence) {
        boolean z;
        C8054 c8054 = this.f16397;
        C1476 c1476 = c8054.f24845;
        if (c1476.f5287 == c1476.f5296) {
            return m15111(i, charSequence);
        }
        int i2 = c8054.f24828;
        int i3 = c8054.f24844;
        int i4 = c8054.f24830;
        m15076();
        try {
            try {
                z = m15105();
                try {
                    C5855 c5855 = this.f16396.f5287;
                    C9466 c9466 = this.f16401;
                    C2410 c2410 = c9466.f28785;
                    if (c2410 != null) {
                        boolean m15059 = m15059(c2410, i, charSequence);
                        m15052(i2, i3, i4, z);
                        return m15059;
                    }
                    C16292 c16292 = c9466.f28779;
                    if (c16292 == null) {
                        boolean m15082 = m15082(c5855, i, charSequence);
                        m15052(i2, i3, i4, z);
                        return m15082;
                    }
                    if (c16292.f50105 && c5855.getClass() == C0085.class) {
                        boolean m15088 = m15088(i, this.f16401.f28779, charSequence);
                        m15052(i2, i3, i4, z);
                        return m15088;
                    }
                    boolean m15060 = m15060(c5855, i, charSequence);
                    m15052(i2, i3, i4, z);
                    return m15060;
                } catch (Throwable th) {
                    th = th;
                    m15052(i2, i3, i4, z);
                    throw th;
                }
            } catch (C0292 e) {
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    m15052(i2, i3, i4, z);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m15105() {
        int length = this.f16391.length;
        int i = this.f16401.f28772;
        if (length >= i) {
            return false;
        }
        m15093(i, this.f16402.length, this.f16408.length);
        this.f16391 = new int[this.f16401.f28772];
        return m15090() > 65536;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15052(int i, int i2, int i3, boolean z) {
        C8054 c8054 = this.f16397;
        c8054.f24828 = i;
        c8054.f24844 = i2;
        c8054.f24830 = i3;
        this.f16399 = null;
        this.f16406 = false;
        if (z) {
            int[] iArr = f16387;
            this.f16393 = iArr;
            this.f16405 = iArr;
            this.f16408 = iArr;
            this.f16402 = iArr;
            this.f16391 = iArr;
            long[] jArr = f16386;
            this.f16392 = jArr;
            this.f16407 = jArr;
            this.f16410 = 0;
            this.f16388 = 0;
            this.f16404 = -1;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15094(int i, int i2, CharSequence charSequence) {
        C9466 c9466 = this.f16401;
        int i3 = c9466.f28777;
        if (i3 == 1) {
            return m15064(c9466.f28778, i2, charSequence);
        }
        if (i3 == 3) {
            return m15100(i2, charSequence);
        }
        if (i3 == 4) {
            return m15062(c9466.f28783, i2, charSequence);
        }
        return m15081(i, i2, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r8.f28781 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b7, code lost:
    
        if (r7.f28781 == false) goto L66;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15082(l.C5855 r7, int r8, java.lang.CharSequence r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15082(l.ۛۚܽ, int, java.lang.CharSequence):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15078(boolean z) {
        if (!z) {
            m15069(0);
            int i = this.f16388;
            while (true) {
                i -= 32;
                if (i < 0) {
                    break;
                } else {
                    m15048(i);
                }
            }
            this.f16388 = 0;
            this.f16404 = -1;
        }
        this.f16409 = 0;
        this.f16398 = 0;
        this.f16388 = 0;
        this.f16404 = -1;
        if (m15090() > 65536) {
            int[] iArr = f16387;
            this.f16393 = iArr;
            this.f16405 = iArr;
            this.f16408 = iArr;
            this.f16402 = iArr;
            this.f16391 = iArr;
            long[] jArr = f16386;
            this.f16392 = jArr;
            this.f16407 = jArr;
            this.f16410 = 0;
            this.f16388 = 0;
            this.f16404 = -1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15063(C12618 c12618, int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int[] iArr = c12618.f38032;
        int[] iArr2 = c12618.f38030;
        int length = iArr.length;
        C8054 c8054 = this.f16397;
        int i6 = c8054.f24844 - length;
        int i7 = length - 1;
        char c = (char) iArr[i7];
        boolean z2 = charSequence instanceof InterfaceC23008;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        int i10 = i;
        while (i10 <= i6) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return z3;
            }
            if (z2) {
                int i11 = i10 + length;
                char charAt = charSequence.charAt(i11 - 1);
                if (charAt != c) {
                    int i12 = length - iArr2[charAt & 127];
                    i2 = i6;
                    if (i12 > 2) {
                        i10 += i12;
                        i3 = i7;
                        z3 = false;
                        i6 = i2;
                        i7 = i3;
                    } else {
                        c8054.m21413();
                        int i13 = c8054.f24844;
                        int i14 = i13 - 1;
                        i3 = i7;
                        if (!(charSequence instanceof InterfaceC23008)) {
                            while (true) {
                                if (i11 > i14) {
                                    i5 = -1;
                                    break;
                                }
                                if (charSequence.charAt(i11) == c) {
                                    i5 = i11;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i5 = ((InterfaceC23008) charSequence).indexOf(c, i11, i13);
                        }
                        if (c8054.m21411()) {
                            this.f16390 = true;
                            return false;
                        }
                        if (i5 < 0) {
                            c8054.f24842 = true;
                            return false;
                        }
                        int i15 = (i5 - length) + 1;
                        if (i8 < 64) {
                            i8++;
                            i9 += i15 - i10;
                            if (i8 == 64 && i9 < 128) {
                                i10 = i15;
                                z2 = false;
                            }
                        }
                        i10 = i15;
                    }
                } else {
                    i2 = i6;
                    i3 = i7;
                }
                i4 = length - 2;
                z = false;
            } else {
                i2 = i6;
                i3 = i7;
                z = false;
                i4 = i3;
            }
            while (true) {
                if (i4 < 0) {
                    c8054.f24855 = i10;
                    if (m15081(c12618.f38031, i10 + length, charSequence)) {
                        return m15079(i10);
                    }
                    if (this.f16390) {
                        return z;
                    }
                    i10++;
                } else {
                    if (c8054.m21407()) {
                        this.f16390 = true;
                        return z;
                    }
                    char charAt2 = charSequence.charAt(i10 + i4);
                    if (charAt2 != iArr[i4]) {
                        i10 += Math.max((i4 + 1) - iArr2[charAt2 & 127], c12618.f38028[i4]);
                        break;
                    }
                    i4--;
                }
            }
        }
        c8054.f24842 = true;
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15083(C12618 c12618, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844 - c12618.f38027;
        int[] iArr = c12618.f38032;
        while (i <= i2) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            int m15040 = m15040(i, iArr.length, charSequence);
            if (this.f16390) {
                return false;
            }
            int length = iArr.length - 1;
            while (true) {
                if (m15040 <= 0) {
                    c8054.f24855 = i;
                    if (m15081(c12618.f38031, c12618.f38027 + i, charSequence)) {
                        return m15079(i);
                    }
                    if (this.f16390) {
                        return false;
                    }
                    i += m15040(i, 1, charSequence);
                    if (this.f16390) {
                        return false;
                    }
                } else {
                    if (c8054.m21407()) {
                        this.f16390 = true;
                        return false;
                    }
                    int codePointBefore = Character.codePointBefore(charSequence, i + m15040);
                    if (codePointBefore != iArr[length]) {
                        i += m15040(i, Math.max((length + 1) - c12618.f38030[codePointBefore & 127], c12618.f38028[length]), charSequence);
                        if (this.f16390) {
                            return false;
                        }
                    } else {
                        m15040 -= Character.charCount(codePointBefore);
                        length--;
                    }
                }
            }
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1.f28781 == false) goto L13;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15079(int r5) {
        /*
            r4 = this;
            l.۠۠ܽ r0 = r4.f16397
            boolean r1 = r0.f24837
            r2 = 0
            if (r1 != 0) goto L15
            l.ۢ۠ܽ r1 = r4.f16401
            boolean r3 = r1.f28786
            if (r3 != 0) goto L15
            boolean r3 = r1.f28775
            if (r3 != 0) goto L15
            boolean r1 = r1.f28781
            if (r1 == 0) goto L1c
        L15:
            boolean r1 = r4.m15087(r2)
            if (r1 != 0) goto L1c
            return r2
        L1c:
            int[] r1 = r0.f24832
            r1[r2] = r5
            r0.f24855 = r5
            int r5 = r0.f24822
            r0 = 1
            r1[r0] = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15079(int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15060(C5855 c5855, int i, CharSequence charSequence) {
        C16292 c16292 = this.f16401.f28779;
        if (!(c5855 instanceof C0085)) {
            if (c5855.getClass() != C5004.class) {
                throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c5855.getClass().getName()));
            }
            return m15057(i, c16292, charSequence);
        }
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844 - ((C0085) c5855).f1019;
        boolean z = c5855 instanceof C21959;
        while (i <= i2) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            this.f16403 = i;
            if ((i >= c8054.f24844 || c16292.m38318(charSequence.charAt(i))) && m15057(i, c16292, charSequence)) {
                c8054.f24832[0] = i;
                c8054.f24855 = i;
                return true;
            }
            if (this.f16390) {
                return false;
            }
            int i3 = this.f16403;
            if (i3 > i && (!c16292.f50100 || z || c16292.f50107)) {
                i = i3;
            }
            if (!z || i >= i2) {
                i++;
            } else {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
            }
        }
        c8054.f24842 = true;
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15059(C2410 c2410, int i, CharSequence charSequence) {
        C15108 c15108 = this.f16389;
        try {
            c15108.m35810(c2410, this.f16397, charSequence, i);
            while (true) {
                if (c15108.m35811()) {
                    if (m15081(c15108.f46213, c15108.f46212, charSequence)) {
                        boolean m15079 = m15079(c15108.f46209);
                        c15108.m35809();
                        m15078(m15079);
                        return m15079;
                    }
                    if (this.f16390) {
                        break;
                    }
                } else {
                    this.f16390 |= c15108.f46203;
                    break;
                }
            }
            return false;
        } finally {
            c15108.m35809();
            m15078(false);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15088(int i, C16292 c16292, CharSequence charSequence) {
        int i2 = c16292.f50109;
        int i3 = c16292.f50094;
        C8054 c8054 = this.f16397;
        int i4 = c8054.f24844 - 1;
        EnumC1497 enumC1497 = c16292.f50087.f26708;
        boolean z = enumC1497 == EnumC1497.LAZY;
        boolean z2 = enumC1497 == EnumC1497.GREEDY;
        while (i <= i4) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            if (i >= c8054.f24844 || c16292.m38318(charSequence.charAt(i))) {
                if (i >= c8054.f24844) {
                    c8054.f24842 = true;
                } else {
                    if (z && charSequence.charAt(i) == i3 && (c8054.f24820 != 1 || i + 1 == c8054.f24844)) {
                        m15091(i + 1);
                        c8054.f24832[0] = i;
                        c8054.f24855 = i;
                        return true;
                    }
                    if (i >= c8054.f24844) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i) == i2) {
                        int i5 = i + 1;
                        m15091(i5);
                        if (i5 >= c8054.f24844) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i5) == i3 && (c8054.f24820 != 1 || i + 2 == c8054.f24844)) {
                            m15091(i + 2);
                            c8054.f24832[0] = i;
                            c8054.f24855 = i;
                            return true;
                        }
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z) {
                        continue;
                    } else if (i >= c8054.f24844) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i) == i3 && (c8054.f24820 != 1 || i + 1 == c8054.f24844)) {
                        m15091(i + 1);
                        c8054.f24832[0] = i;
                        c8054.f24855 = i;
                        return true;
                    }
                }
            }
            i++;
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x02f2, code lost:
    
        if (r0 >= r1) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02f5, code lost:
    
        m15056(r24, r14, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02f8, code lost:
    
        if (r10 < 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x02fa, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02fd, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0302, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0303, code lost:
    
        if (r0 >= r4) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0305, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0308, code lost:
    
        r18 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x030b, code lost:
    
        if (r12 >= r6) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x030d, code lost:
    
        r23 = r14;
        r14 = r25.charAt(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x031b, code lost:
    
        if (r14 >= 0) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x031d, code lost:
    
        r19 = r1;
        r11.f24842 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x034d, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0333, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0350, code lost:
    
        if (r17 == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0352, code lost:
    
        if (r0 < r4) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x035f, code lost:
    
        if (r12 < r6) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0372, code lost:
    
        if (r14 == r3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0383, code lost:
    
        r1 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0385, code lost:
    
        if (r1 < r6) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x039c, code lost:
    
        if (r25.charAt(r1) == r2) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03ad, code lost:
    
        r12 = r12 + 2;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03b5, code lost:
    
        if (r11.m21407() == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03c5, code lost:
    
        r14 = r23;
        r10 = r12;
        r16 = r18;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0400, code lost:
    
        r18 = r16;
        r16 = r5;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03b7, code lost:
    
        r22.f16390 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03ba, code lost:
    
        if (r12 < 0) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03bc, code lost:
    
        r11.m21416(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x03bf, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03c4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ce, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x040a, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x039e, code lost:
    
        m15056(r24, r12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x03a2, code lost:
    
        if (r10 < 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x03a4, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x03a7, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x03ac, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0388, code lost:
    
        r11.f24842 = true;
        m15056(r24, r12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x038d, code lost:
    
        if (r10 < 0) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x038f, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0392, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0397, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0375, code lost:
    
        m15056(r24, r12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0378, code lost:
    
        if (r10 < 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x037a, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x037d, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0382, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0362, code lost:
    
        r11.f24842 = true;
        m15056(r24, r12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0367, code lost:
    
        if (r10 < 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0369, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x036c, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0371, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0354, code lost:
    
        if (r10 < 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0356, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0359, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x035e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03d0, code lost:
    
        r1 = r19;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03d4, code lost:
    
        if (r0 > r1) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03e6, code lost:
    
        r16 = r18;
        r12 = r12 - 2;
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03f0, code lost:
    
        if (r11.m21407() == false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03f2, code lost:
    
        r22.f16390 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03f5, code lost:
    
        if (r10 < 0) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03f7, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03fa, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03ff, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x03d8, code lost:
    
        m15056(r24, r14, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x03db, code lost:
    
        if (r10 < 0) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x03dd, code lost:
    
        r11.m21416(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x03e0, code lost:
    
        r22.f16391[r13] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x03e5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0323, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0326, code lost:
    
        if (r14 != r5) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0328, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x032c, code lost:
    
        if (r11.f24820 != 1) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0330, code lost:
    
        if ((r12 + 1) != r6) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0336, code lost:
    
        if (r0 <= 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0338, code lost:
    
        r0 = r11.f24832;
        r1 = r16.f26703;
        r0[r1] = r12 - 2;
        r0[r1 + 1] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0346, code lost:
    
        m15091(r12 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x034c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0316, code lost:
    
        r23 = r14;
        r14 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0307, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x05d1, code lost:
    
        if (r0 != l.EnumC1497.GREEDY) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x05d9, code lost:
    
        r0 = m15075(r23, r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x05df, code lost:
    
        if (r22.f16390 != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x05e1, code lost:
    
        if (r0 < 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x05e3, code lost:
    
        m15091(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x05d5, code lost:
    
        if (r0 == r2) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0634 A[LOOP:15: B:565:0x0634->B:574:0x066a, LOOP_START, PHI: r5 r6
  0x0634: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:564:0x0631, B:574:0x066a] A[DONT_GENERATE, DONT_INLINE]
  0x0634: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:564:0x0631, B:574:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:586:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15057(int r23, l.C16292 r24, java.lang.CharSequence r25) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15057(int, l.ܽ֡ܽ, java.lang.CharSequence):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15051(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f16391[i] = i3;
        C8054 c8054 = this.f16397;
        int[] iArr = c8054.f24832;
        iArr[i2] = i4;
        iArr[i2 + 1] = i5;
        if (i6 >= 0) {
            c8054.f24823.m43233(i6);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15084(C16292 c16292, int i, int i2, CharSequence charSequence) {
        C8760 c8760 = c16292.f50087;
        int i3 = c8760.f26707;
        int i4 = c8760.f26703;
        int i5 = c16292.f50102;
        int i6 = c16292.f50096;
        int i7 = c16292.f50094;
        int i8 = i;
        int i9 = i2;
        while (true) {
            C8054 c8054 = this.f16397;
            int m15038 = m15038(i7, i8, c8054.f24844, charSequence);
            if (m15038 >= 0 && c8054.f24820 == 1 && m15038 != c8054.f24844) {
                m15038 = -1;
            }
            if (m15038 >= 0) {
                m15091(m15038);
                return true;
            }
            if (i9 >= i3) {
                return false;
            }
            int i10 = i3;
            int m15041 = m15041(i5, i6, charSequence, i8, c8054.f24844);
            if (m15041 < 0) {
                m15056(c16292, i8, true);
                return false;
            }
            c8054.m21416(m15041);
            m15049(i4, i8, m15041);
            i9++;
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            i8 = m15041;
            i3 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r11 >= r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        r4 = r0;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r3 != r26) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r12 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r15.m43233(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r2 = r14.f24832;
        r2[r10] = r16;
        r2[r17] = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r2 = m15038(r13, r4, r14.f24844, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r2 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r14.f24820 != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r2 == r14.f24844) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r2 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r3 > r26) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r2 = r4 - 2;
        r3 = r3 - 1;
        m15049(r10, r4 - 4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r14.m21407() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        m15056(r24, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r3 <= r26) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        m15049(r10, r4 - 2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        m15091(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r1 = false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15065(l.C16292 r24, int r25, int r26, java.lang.CharSequence r27) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r26
            l.ۡ۠ܽ r0 = r7.f50087
            int r9 = r0.f26707
            int r10 = r0.f26703
            int r11 = r7.f50102
            int r12 = r7.f50096
            int r13 = r7.f50094
            l.۠۠ܽ r14 = r6.f16397
            l.ᩴ۠ܽ r15 = r14.f24823
            int[] r0 = r14.f24832
            r16 = r0[r10]
            int r17 = r10 + 1
            r18 = r0[r17]
            boolean r0 = r14.f24837
            if (r0 == 0) goto L2a
            java.util.ArrayList r0 = r15.f58949
            int r0 = r0.size()
            r5 = r0
            goto L2c
        L2a:
            r0 = -1
            r5 = -1
        L2c:
            r4 = r25
            r3 = r8
        L2f:
            r19 = 0
            if (r3 >= r9) goto L6a
            int r2 = r14.f24844
            r0 = r23
            r1 = r11
            r20 = r2
            r2 = r12
            r21 = r11
            r11 = r3
            r3 = r27
            r25 = r4
            r22 = r12
            r12 = r5
            r5 = r20
            int r4 = r0.m15041(r1, r2, r3, r4, r5)
            if (r4 >= 0) goto L50
            r0 = r25
            goto L6d
        L50:
            r14.m21416(r4)
            r0 = r25
            r6.m15049(r10, r0, r4)
            int r3 = r11 + 1
            boolean r0 = r14.m21407()
            if (r0 == 0) goto L64
        L60:
            r0 = 1
            r6.f16390 = r0
            return r19
        L64:
            r5 = r12
            r11 = r21
            r12 = r22
            goto L2f
        L6a:
            r11 = r3
            r0 = r4
            r12 = r5
        L6d:
            if (r11 >= r9) goto L71
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            r4 = r0
            r3 = r11
        L74:
            if (r3 != r8) goto L81
            if (r12 < 0) goto L7b
            r15.m43233(r12)
        L7b:
            int[] r2 = r14.f24832
            r2[r10] = r16
            r2[r17] = r18
        L81:
            int r2 = r14.f24844
            r5 = r27
            int r2 = r6.m15038(r13, r4, r2, r5)
            if (r2 < 0) goto L95
            int r9 = r14.f24820
            r11 = 1
            if (r9 != r11) goto L95
            int r9 = r14.f24844
            if (r2 == r9) goto L95
            r2 = -1
        L95:
            if (r2 < 0) goto La3
            if (r3 <= r8) goto L9e
            int r0 = r4 + (-2)
            r6.m15049(r10, r0, r4)
        L9e:
            r6.m15091(r2)
            r0 = 1
            return r0
        La3:
            if (r3 > r8) goto La9
            r6.m15056(r7, r0, r1)
            return r19
        La9:
            int r2 = r4 + (-2)
            int r3 = r3 + (-1)
            int r4 = r4 + (-4)
            r6.m15049(r10, r4, r2)
            boolean r4 = r14.m21407()
            if (r4 == 0) goto Lb9
            goto L60
        Lb9:
            r4 = r2
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15065(l.ܽ֡ܽ, int, int, java.lang.CharSequence):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15041(int i, int i2, CharSequence charSequence, int i3, int i4) {
        C8054 c8054 = this.f16397;
        if (i3 >= i4) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i3) != i) {
            return -1;
        }
        int i5 = i3 + 1;
        if (i5 >= i4) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == i2) {
            return i3 + 2;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15049(int i, int i2, int i3) {
        C8054 c8054 = this.f16397;
        if (c8054.f24837) {
            c8054.f24823.m43234(i, i2, i3, c8054.f24832);
        }
        int[] iArr = c8054.f24832;
        iArr[i] = i2;
        iArr[i + 1] = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0219, code lost:
    
        if (r8 >= r5) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x021b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x021e, code lost:
    
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0224, code lost:
    
        if (r18 != l.EnumC1497.POSSESSIVE) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0226, code lost:
    
        r2 = m15075(r9, r0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022e, code lost:
    
        if (r23.f16390 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0230, code lost:
    
        if (r7 < 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0232, code lost:
    
        r23.f16391[r7] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0236, code lost:
    
        if (r11 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0238, code lost:
    
        r0 = r3.f24832;
        r0[r12] = r14;
        r0[r12 + 1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0240, code lost:
    
        if (r6 < 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0245, code lost:
    
        if (r2 < 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0247, code lost:
    
        m15091(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x024a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x024b, code lost:
    
        m15056(r0, r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x024e, code lost:
    
        if (r7 < 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0250, code lost:
    
        r23.f16391[r7] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0254, code lost:
    
        if (r11 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0256, code lost:
    
        r0 = r3.f24832;
        r0[r12] = r14;
        r0[r12 + 1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x025e, code lost:
    
        if (r6 < 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0262, code lost:
    
        r8 = r26;
        r18 = r5;
        r5 = r9;
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0269, code lost:
    
        r21 = r9;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x026d, code lost:
    
        if (r7 < 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x026f, code lost:
    
        if (r10 != r9) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0271, code lost:
    
        if (r11 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0273, code lost:
    
        if (r17 < 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0275, code lost:
    
        r19 = r2;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0279, code lost:
    
        r4.m43233(r2);
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0281, code lost:
    
        r2 = r3.f24832;
        r2[r12] = r20;
        r2[r12 + 1] = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x028c, code lost:
    
        r2 = m15075(r5, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0292, code lost:
    
        if (r23.f16390 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02a8, code lost:
    
        if (r2 < 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02ba, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02bc, code lost:
    
        if (r10 > r9) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02d9, code lost:
    
        r19 = r9;
        r9 = r18;
        r5 = r5 - r6;
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e5, code lost:
    
        m15054(r8, r5 - r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02ec, code lost:
    
        if (r3.m21407() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0309, code lost:
    
        r0 = r25;
        r18 = r9;
        r9 = r21;
        r2 = r8;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02ee, code lost:
    
        r23.f16390 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f1, code lost:
    
        if (r7 < 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02f3, code lost:
    
        r23.f16391[r7] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02f7, code lost:
    
        if (r11 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02f9, code lost:
    
        r0 = r3.f24832;
        r0[r12] = r14;
        r0[r12 + 1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0301, code lost:
    
        if (r6 < 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0303, code lost:
    
        r4.m43233(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02be, code lost:
    
        m15056(r0, r21, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02c5, code lost:
    
        if (r7 < 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02c7, code lost:
    
        r23.f16391[r7] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02cb, code lost:
    
        if (r11 == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02cd, code lost:
    
        r0 = r3.f24832;
        r0[r12] = r14;
        r0[r12 + 1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02d5, code lost:
    
        if (r6 < 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02aa, code lost:
    
        if (r7 < 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02ac, code lost:
    
        if (r10 <= r9) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02b2, code lost:
    
        m15054(r19, r5 - r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02b5, code lost:
    
        m15091(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02b9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0294, code lost:
    
        if (r7 < 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0296, code lost:
    
        r23.f16391[r7] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x029a, code lost:
    
        if (r11 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x029c, code lost:
    
        r0 = r3.f24832;
        r0[r12] = r14;
        r0[r12 + 1] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02a4, code lost:
    
        if (r6 < 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x027f, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x028a, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x021d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r4.m43233(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        return false;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c2 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:20:0x005a, B:39:0x007f, B:23:0x0095, B:27:0x00a3, B:63:0x00c1, B:66:0x00c7, B:68:0x00cb, B:75:0x00e1, B:77:0x00e7, B:121:0x010a, B:83:0x0126, B:99:0x0145, B:87:0x015c, B:91:0x016c, B:133:0x0190, B:135:0x019a, B:137:0x01a8, B:139:0x01ae, B:142:0x01c2, B:160:0x021e, B:162:0x0226, B:172:0x0247, B:174:0x024b, B:188:0x0279, B:189:0x0281, B:190:0x028c, B:221:0x02b2, B:222:0x02b5, B:210:0x02be, B:196:0x02e5, B:200:0x02ee, B:145:0x01e9, B:149:0x01f7), top: B:19:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0217 A[SYNTHETIC] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15096(int r24, l.C16292 r25, java.lang.CharSequence r26) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15096(int, l.ܽ֡ܽ, java.lang.CharSequence):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m15101(int i, C16292 c16292, CharSequence charSequence) {
        int i2 = c16292.f50109;
        int i3 = c16292.f50087.f26706;
        C8054 c8054 = this.f16397;
        int i4 = c8054.f24844;
        int i5 = 0;
        while (i5 < i3) {
            if (i >= i4) {
                c8054.f24842 = true;
                m15056(c16292, i, true);
                return false;
            }
            if (charSequence.charAt(i) != i2) {
                m15056(c16292, i, true);
                return false;
            }
            i++;
            m15091(i);
            i5++;
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
        }
        if (!c8054.f24831) {
            return true;
        }
        this.f16390 = true;
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15056(C16292 c16292, int i, boolean z) {
        if (z && c16292.f50104) {
            this.f16403 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15055(C16292 c16292, int i, int i2) {
        boolean z = c16292.f50098;
        C8054 c8054 = this.f16397;
        if (z) {
            int[] iArr = c8054.f24832;
            int i3 = c16292.f50090;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5];
            iArr[i3] = i;
            iArr[i5] = i2;
            if (c8054.f24837 && i4 != -1 && i6 != -1) {
                C18638 c18638 = c8054.f24823;
                c18638.f58949.add(new C2992(i3 / 2, i4, i6));
            }
        }
        c8054.m21416(i2);
        if (c16292.f50087.f26705 < 0) {
            int[] iArr2 = c8054.f24832;
            iArr2[0] = c8054.f24855;
            iArr2[1] = i2;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m15102(int i, C16292 c16292, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844;
        if (!c16292.f50093) {
            int i3 = c16292.f50109;
            if (i3 >= 0) {
                return m15038(i3, i, i2, charSequence);
            }
            int i4 = c16292.f50103;
            return i4 >= 0 ? m15039(i4, i, i2, c16292.f50106, charSequence) : m15042(i, i2, charSequence, c16292.f50101);
        }
        if (i >= i2) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i) != c16292.f50102) {
            return -1;
        }
        int i5 = i + 1;
        if (i5 >= i2) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == c16292.f50096) {
            return i + 2;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15038(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f16397.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i2) == i) {
            return i2 + 1;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15039(int i, int i2, int i3, InterfaceC10795 interfaceC10795, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f16397.f24842 = true;
            return -1;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt >= 128 ? interfaceC10795 == null || !interfaceC10795.mo2465(charAt) : charAt != i) {
            return -1;
        }
        return i2 + 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m15075(int i, C16292 c16292, CharSequence charSequence) {
        int m15039;
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844;
        int i3 = c16292.f50094;
        if (i3 >= 0) {
            m15039 = m15038(i3, i, i2, charSequence);
        } else {
            int i4 = c16292.f50088;
            m15039 = i4 >= 0 ? m15039(i4, i, i2, c16292.f50099, charSequence) : m15042(i, i2, charSequence, c16292.f50092);
        }
        if (m15039 < 0) {
            return -1;
        }
        if (c8054.f24820 != 1 || m15039 == c8054.f24844) {
            return m15039;
        }
        return -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15091(int i) {
        C8054 c8054 = this.f16397;
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(i);
        iArr[1] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        return false;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15106(int r12, java.lang.CharSequence r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15106(int, java.lang.CharSequence):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m15100(int i, CharSequence charSequence) {
        C9466 c9466 = this.f16401;
        int i2 = c9466.f28787;
        int[] iArr = c9466.f28782;
        Object[] objArr = c9466.f28780;
        C8054 c8054 = this.f16397;
        int i3 = c8054.f24844;
        loop0: while (true) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 1) {
                if (i4 == 16) {
                    if (!C21460.m48607(iArr[i2 + 2], iArr[i2 + 3] != 0, c8054, i, charSequence)) {
                        break;
                    }
                    i2 = iArr[i2 + 1];
                } else if (i4 == 20) {
                    int m15044 = m15044((C3821) objArr[iArr[i2 + 2]], charSequence, i, i3);
                    if (!this.f16390 && m15044 >= 0) {
                        int[] iArr2 = c8054.f24832;
                        iArr2[0] = c8054.f24855;
                        c8054.m21416(m15044);
                        iArr2[1] = m15044;
                        return true;
                    }
                } else if (i4 == 3) {
                    int[] iArr3 = (int[]) objArr[iArr[i2 + 2]];
                    int i5 = 0;
                    while (i5 < iArr3.length) {
                        if (i >= i3) {
                            c8054.f24842 = true;
                            return false;
                        }
                        int i6 = i + 1;
                        if (iArr3[i5] != charSequence.charAt(i)) {
                            break loop0;
                        }
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return false;
                        }
                        i5++;
                        i = i6;
                    }
                    i2 = iArr[i2 + 1];
                } else if (i4 == 4) {
                    InterfaceC10795 interfaceC10795 = (InterfaceC10795) objArr[iArr[i2 + 2]];
                    int i7 = i;
                    while (i7 < i3 && interfaceC10795.mo2465(charSequence.charAt(i7))) {
                        i7++;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return false;
                        }
                    }
                    if (i7 >= i3) {
                        c8054.f24842 = true;
                    }
                    if (i7 - i < iArr[i2 + 3]) {
                        break;
                    }
                    i = i7;
                    i2 = iArr[i2 + 1];
                } else {
                    throw new IllegalStateException("Invalid terminal regex prefix opcode");
                }
            } else {
                if (i >= i3) {
                    c8054.f24842 = true;
                    return false;
                }
                int i8 = i + 1;
                if (!((InterfaceC10795) objArr[iArr[i2 + 2]]).mo2465(charSequence.charAt(i))) {
                    break;
                }
                i = i8;
                i2 = iArr[i2 + 1];
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x00b6, code lost:
    
        if (r0.mo2465(r2) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x013a, code lost:
    
        if (r9 == (-1)) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x012b, code lost:
    
        if (r0 > r9) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0522, code lost:
    
        if (l.C21460.m48609((l.C3446) r8[r7[r16 + 2]], r4, r9, r5) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0c43, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06d9, code lost:
    
        if (r6 >= 0) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06e7, code lost:
    
        r15 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06ea, code lost:
    
        if (r15 >= r8.length) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x06ec, code lost:
    
        r3.m15050(5, r16, r9, r2, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06f5, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x06fb, code lost:
    
        if (r3.m15086() == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x076d, code lost:
    
        r0 = r23[r16 + 4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0773, code lost:
    
        if (r4.f24837 == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0775, code lost:
    
        r3.m15099(r0, r9);
        r3.m15099(r0 + 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0784, code lost:
    
        r0 = r4.f24832;
        r0[0] = r4.f24855;
        r4.m21416(r7);
        r0[1] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0790, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x077d, code lost:
    
        r1 = r4.f24832;
        r1[r0] = r9;
        r1[r0 + 1] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0c0a, code lost:
    
        r19 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0c0c, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0a7a, code lost:
    
        if (((l.InterfaceC10795) r22[r23[r16 + 2]]).mo2465(r0) == false) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0af4, code lost:
    
        r15.m21416(r9);
        r0 = r15.f24832;
        r0[0] = r15.f24855;
        r0[1] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x0b01, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x09b2  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15081(int r27, int r28, java.lang.CharSequence r29) {
        /*
            Method dump skipped, instructions count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15081(int, int, java.lang.CharSequence):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15061(C6643 c6643, int i, int i2, CharSequence charSequence) {
        char charAt;
        int[] iArr = c6643.f20613;
        return iArr == null || iArr[i] < 0 || i2 >= this.f16397.f24844 || (charAt = charSequence.charAt(i2)) >= 128 || charAt == iArr[i];
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C8760 m15073(int i) {
        return (C8760) this.f16401.f28780[this.f16393[i + 16]];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15037(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        m15098();
        C8760 c8760 = (C8760) this.f16401.f28780[i];
        int i7 = this.f16388;
        int[] iArr = this.f16393;
        iArr[i7] = z ? 6 : 5;
        iArr[i7 + 1] = i3;
        iArr[i7 + 2] = i4;
        iArr[i7 + 3] = i2;
        iArr[i7 + 4] = this.f16398;
        iArr[i7 + 5] = this.f16409;
        int i8 = i7 + 6;
        C8054 c8054 = this.f16397;
        iArr[i8] = (!c8054.f24837 || (!c8760.f26702 && (z || c8760.f26705 >= 0))) ? -1 : c8054.f24823.f58949.size();
        int[] iArr2 = this.f16393;
        iArr2[i7 + 12] = this.f16404;
        iArr2[i7 + 13] = 0;
        iArr2[i7 + 16] = i;
        iArr2[i7 + 17] = 0;
        iArr2[i7 + 18] = i5;
        iArr2[i7 + 19] = 0;
        iArr2[i7 + 20] = i5;
        iArr2[i7 + 21] = this.f16409;
        int i9 = i7 + 22;
        int i10 = c8760.f26705;
        int i11 = c8760.f26703;
        iArr2[i9] = i10 >= 0 ? m15097(i10) : 0;
        int[] iArr3 = this.f16393;
        int i12 = i7 + 23;
        boolean z2 = c8760.f26702;
        iArr3[i12] = z2 ? c8054.f24832[i11] : 0;
        iArr3[i7 + 24] = z2 ? c8054.f24832[i11 + 1] : 0;
        this.f16388 += 32;
        if (!z && (i6 = c8760.f26705) >= 0) {
            m15108(i6, -1);
        }
        m15050(7, 0, i4, i7, 0);
        return i7;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15053(int i, int i2, boolean z) {
        int[] iArr = this.f16393;
        iArr[i + 17] = i2;
        iArr[i + 13] = !z ? 1 : 0;
        int i3 = this.f16409;
        iArr[i + 21] = i3;
        this.f16402[iArr[i + 4] + 3] = i3;
        this.f16404 = z ? i : iArr[i + 12];
        this.f16395 = iArr[(z ? 3 : 1) + i];
        this.f16400 = iArr[i + 2];
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m15107(int i) {
        C8760 m15073 = m15073(i);
        if (m15073.f26705 < 0 && this.f16397.f24831) {
            this.f16390 = true;
            return false;
        }
        EnumC1497 enumC1497 = m15073.f26708;
        if (enumC1497 == EnumC1497.GREEDY) {
            int[] iArr = this.f16393;
            iArr[i + 17] = 1;
            m15077(i, iArr[i + 2], iArr[i + 18]);
            return true;
        }
        if (enumC1497 == EnumC1497.LAZY) {
            m15053(i, 2, false);
            return true;
        }
        if (this.f16393[i + 18] < m15073.f26707) {
            m15053(i, 4, true);
            return true;
        }
        m15053(i, 1, false);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15077(int i, int i2, int i3) {
        C8760 m15073 = m15073(i);
        int[] iArr = this.f16393;
        iArr[i + 13] = 1;
        this.f16404 = iArr[i + 12];
        int i4 = m15073.f26705;
        int i5 = m15073.f26707;
        if (i4 < 0 && i3 >= i5) {
            m15053(i, iArr[i + 17], false);
            this.f16400 = i2;
            return;
        }
        int m15037 = m15037(iArr[i + 16], iArr[i + 3], iArr[i + 1], i2, i3, true);
        if (i3 < i5) {
            m15053(m15037, 5, true);
        } else {
            m15072(m15037);
            m15053(m15037, 9, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15058(int i, boolean z) {
        int i2;
        int i3;
        C8760 m15073 = m15073(i);
        int[] iArr = this.f16393;
        int i4 = i + 17;
        int i5 = iArr[i4];
        int i6 = i + 2;
        int i7 = iArr[i6];
        int i8 = i + 18;
        int i9 = iArr[i8];
        C8054 c8054 = this.f16397;
        switch (i5) {
            case 0:
                if (!z) {
                    m15103(i);
                    return false;
                }
                m15054(m15073, i7, c8054.f24822);
                int[] iArr2 = this.f16393;
                iArr2[i6] = c8054.f24822;
                int i10 = i9 + 1;
                iArr2[i8] = i10;
                if (i10 >= m15073.f26706) {
                    return m15107(i);
                }
                m15053(i, 0, true);
                return true;
            case 1:
            case 9:
            case 13:
                m15103(i);
                return false;
            case 2:
                if (i9 < m15073.f26707) {
                    m15053(i, 3, true);
                    return true;
                }
                m15103(i);
                return false;
            case 3:
                if (!z || i7 == (i2 = c8054.f24822)) {
                    m15103(i);
                    return false;
                }
                m15054(m15073, i7, i2);
                int[] iArr3 = this.f16393;
                iArr3[i6] = c8054.f24822;
                iArr3[i8] = i9 + 1;
                m15053(i, 2, false);
                return true;
            case 4:
                if (z) {
                    m15054(m15073, i7, c8054.f24822);
                    int i11 = c8054.f24822;
                    if (i7 != i11) {
                        int[] iArr4 = this.f16393;
                        iArr4[i6] = i11;
                        int i12 = i9 + 1;
                        iArr4[i8] = i12;
                        if (i12 < m15073.f26707) {
                            m15053(i, 4, true);
                            return true;
                        }
                    }
                }
                m15053(i, 1, false);
                return true;
            case 5:
                if (!z || (i3 = c8054.f24822) == i7 || (m15073.f26705 >= 0 && i3 < i7)) {
                    if (z && m15073.f26705 >= 0) {
                        iArr[i6] = c8054.f24822;
                    }
                    m15072(i);
                    m15053(i, 9, false);
                    return true;
                }
                iArr[i + 19] = i3 - i7;
                return m15071(i);
            case 6:
                if (!z) {
                    return m15109(i);
                }
                int i13 = iArr[i + 19] + i7;
                int i14 = c8054.f24822;
                if (i13 != i14) {
                    iArr[i4] = 7;
                    int i15 = m15073.f26705;
                    if (i15 < 0) {
                        i7 = i14;
                    }
                    if (i15 < 0) {
                        i9++;
                    }
                    m15077(i, i7, i9);
                    return true;
                }
                return m15071(i);
            case 7:
                return m15109(i);
            case 8:
                int i16 = iArr[i + 19];
                int i17 = i7 - i16;
                m15054(m15073, i17 - i16, i17);
                int[] iArr5 = this.f16393;
                iArr5[i6] = i17;
                iArr5[i8] = i9 - 1;
                return m15109(i);
            case 10:
                if (z) {
                    iArr[i6] = c8054.f24822;
                    iArr[i + 20] = i7;
                    m15053(i, 11, false);
                    return true;
                }
                if (m15073.f26708 != EnumC1497.LAZY) {
                    m15053(i, 13, false);
                    return true;
                }
                m15103(i);
                return false;
            case 11:
                if (m15073.f26708 == EnumC1497.GREEDY) {
                    iArr[i6] = iArr[i + 20];
                    m15053(i, 13, false);
                    return true;
                }
                m15103(i);
                return false;
            case 12:
                m15053(i, 10, true);
                return true;
            default:
                throw new IllegalStateException("Invalid quantifier continuation");
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m15071(int i) {
        int[] iArr = this.f16393;
        int i2 = i + 2;
        int i3 = iArr[i2];
        int i4 = iArr[i + 19] + i3;
        C8760 m15073 = m15073(i);
        m15054(m15073, i3, i4);
        int[] iArr2 = this.f16393;
        iArr2[i2] = i4;
        int i5 = i + 18;
        int i6 = iArr2[i5] + 1;
        iArr2[i5] = i6;
        if (i6 >= m15073.f26707) {
            return m15109(i);
        }
        m15053(i, 6, true);
        return true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m15109(int i) {
        int[] iArr = this.f16393;
        int i2 = iArr[i + 18];
        int i3 = iArr[i + 20];
        if (m15073(i).f26705 >= 0) {
            if (i2 <= i3) {
                m15072(i);
                m15053(i, 9, false);
                return true;
            }
        } else if (i2 < i3) {
            m15103(i);
            return false;
        }
        m15053(i, 8, false);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15054(C8760 c8760, int i, int i2) {
        boolean z = c8760.f26702;
        int i3 = c8760.f26703;
        if (z) {
            C8054 c8054 = this.f16397;
            if (c8054.f24837) {
                c8054.f24823.m43234(i3, i, i2, c8054.f24832);
            }
            int[] iArr = c8054.f24832;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m15072(int i) {
        C8760 m15073 = m15073(i);
        if (m15073.f26702) {
            int i2 = this.f16393[i + 6];
            C8054 c8054 = this.f16397;
            if (i2 >= 0) {
                c8054.f24823.m43233(i2);
            }
            int[] iArr = c8054.f24832;
            int i3 = m15073.f26703;
            int[] iArr2 = this.f16393;
            iArr[i3] = iArr2[i + 23];
            iArr[i3 + 1] = iArr2[i + 24];
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15103(int i) {
        m15048(i);
        int[] iArr = this.f16393;
        this.f16398 = iArr[i + 4];
        this.f16388 = i;
        this.f16404 = iArr[i + 12];
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15098() {
        int[] iArr = this.f16393;
        int length = iArr.length;
        int i = this.f16388;
        if (length - i >= 32) {
            return;
        }
        int m15043 = m15043(iArr.length, i + 32);
        long m15090 = m15090();
        int[] iArr2 = this.f16393;
        if (((m15043 - iArr2.length) * 4) + m15090 > 33554432) {
            throw new C0292();
        }
        this.f16393 = Arrays.copyOf(iArr2, m15043);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r7.f28781 == false) goto L23;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15068(boolean r13) {
        /*
            r12 = this;
            int r0 = r12.f16404
            if (r0 < 0) goto Lac
            int[] r1 = r12.f16393
            r2 = r1[r0]
            r3 = 5
            r4 = 0
            r5 = 1
            if (r2 < r3) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L14
            r3 = 21
        L14:
            int r3 = r3 + r0
            r1 = r1[r3]
            l.۠۠ܽ r3 = r12.f16397
            r6 = 2
            if (r13 == 0) goto L59
            boolean r7 = r3.f24837
            if (r7 != 0) goto L2e
            l.ۢ۠ܽ r7 = r12.f16401
            boolean r8 = r7.f28786
            if (r8 != 0) goto L2e
            boolean r8 = r7.f28775
            if (r8 != 0) goto L2e
            boolean r7 = r7.f28781
            if (r7 == 0) goto L35
        L2e:
            boolean r7 = r12.m15087(r1)
            if (r7 != 0) goto L35
            return r4
        L35:
            l.ۢ۠ܽ r7 = r12.f16401
            boolean r7 = r7.f28781
            if (r7 != 0) goto L56
            int r7 = r12.f16409
            int r7 = r7 - r6
        L3e:
            if (r7 < r1) goto L56
            int[] r8 = r12.f16408
            r9 = r8[r7]
            if (r9 >= 0) goto L53
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r10) goto L53
            int[] r10 = r12.f16391
            int r9 = ~r9
            int r11 = r7 + 1
            r8 = r8[r11]
            r10[r9] = r8
        L53:
            int r7 = r7 + (-2)
            goto L3e
        L56:
            r12.f16409 = r1
            goto L5c
        L59:
            r12.m15069(r1)
        L5c:
            int r1 = r0 + 32
            r12.f16388 = r1
            int[] r1 = r12.f16393
            int r7 = r0 + 4
            r8 = r1[r7]
            int r8 = r8 + 6
            r12.f16398 = r8
            int r8 = r0 + 12
            r1 = r1[r8]
            r12.f16404 = r1
            if (r2 == 0) goto L77
            boolean r13 = r12.m15058(r0, r13)
            return r13
        L77:
            r12.m15089(r0)
            int[] r1 = r12.f16393
            r2 = r1[r0]
            r8 = 4
            if (r2 == 0) goto L88
            if (r2 == r6) goto L88
            if (r2 != r8) goto L86
            goto L88
        L86:
            r9 = 0
            goto L89
        L88:
            r9 = 1
        L89:
            if (r13 == r9) goto L97
            r12.m15048(r0)
            int[] r13 = r12.f16393
            r13 = r13[r7]
            r12.f16398 = r13
            r12.f16388 = r0
            return r4
        L97:
            int r13 = r0 + 13
            r1[r13] = r5
            int r13 = r0 + 1
            r13 = r1[r13]
            r12.f16395 = r13
            if (r2 != r8) goto La6
            int r13 = r3.f24822
            goto La9
        La6:
            int r0 = r0 + r6
            r13 = r1[r0]
        La9:
            r12.f16400 = r13
            return r5
        Lac:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Regex condition returned without a control scope"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5232.m15068(boolean):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15095(int i, CharSequence charSequence) {
        int[] iArr = this.f16393;
        int i2 = iArr[i];
        if (i2 >= 5) {
            if (iArr[i + 13] == 0) {
                this.f16404 = i;
                return m15068(false);
            }
            return m15058(i, false);
        }
        if (iArr[i + 13] == 0) {
            this.f16404 = i;
            if (i2 == 2 || i2 == 3) {
                int i3 = i + 10;
                int i4 = iArr[i3];
                int i5 = iArr[i + 11];
                int m15040 = i4 - ((iArr[i + 14] == 0 || i4 <= i5) ? 1 : m15040(i4, -1, charSequence));
                if (this.f16390) {
                    return false;
                }
                if (m15040 >= i5) {
                    int[] iArr2 = this.f16393;
                    iArr2[i3] = m15040;
                    this.f16395 = iArr2[i + 3];
                    this.f16400 = m15040;
                    return true;
                }
            }
            return m15068(false);
        }
        m15048(i);
        int[] iArr3 = this.f16393;
        this.f16398 = iArr3[i + 4];
        this.f16388 = i;
        this.f16404 = iArr3[i + 12];
        return false;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m15089(int i) {
        int[] iArr = this.f16393;
        int i2 = iArr[i];
        C8054 c8054 = this.f16397;
        if (i2 == 0 || i2 == 1) {
            c8054.f24844 = iArr[i + 7];
        } else if (i2 == 2 || i2 == 3) {
            c8054.f24828 = iArr[i + 8];
            c8054.f24830 = iArr[i + 9];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15048(int i) {
        int i2;
        int[] iArr = this.f16393;
        if (iArr[i + 13] == 2) {
            return;
        }
        if (iArr[i] >= 5) {
            C8760 m15073 = m15073(i);
            int[] iArr2 = this.f16393;
            if (iArr2[i] == 5 && (i2 = m15073.f26705) >= 0) {
                m15108(i2, iArr2[i + 22]);
            }
            m15072(i);
        } else {
            m15089(i);
        }
        int i3 = this.f16393[i + 6];
        if (i3 >= 0) {
            this.f16397.f24823.m43233(i3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15040(int i, int i2, CharSequence charSequence) {
        if (i2 == 1 && i >= 0 && i < charSequence.length() && !Character.isHighSurrogate(charSequence.charAt(i))) {
            return 1;
        }
        int length = charSequence.length();
        C8054 c8054 = this.f16397;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = i;
            while (i4 < length && i3 < i2) {
                int i5 = i4 + 1;
                i4 = (Character.isHighSurrogate(charSequence.charAt(i4)) && i5 < length && Character.isLowSurrogate(charSequence.charAt(i5))) ? i4 + 2 : i5;
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return i4 - i;
                }
                i3++;
            }
            return i4 - i;
        }
        int i6 = -i2;
        int i7 = i;
        while (i7 > 0 && i3 < i6) {
            int i8 = i7 - 1;
            i7 = (Character.isLowSurrogate(charSequence.charAt(i8)) && i8 > 0 && Character.isHighSurrogate(charSequence.charAt(i7 + (-2)))) ? i7 - 2 : i8;
            if (c8054.m21407()) {
                this.f16390 = true;
                return i - i7;
            }
            i3++;
        }
        return i - i7;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15045(C10502 c10502, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c10502.f31501;
            C8054 c8054 = this.f16397;
            if (i4 < i5) {
                if (i >= i2) {
                    c8054.f24842 = true;
                } else {
                    char charAt = charSequence.charAt(i);
                    int[] iArr = c10502.f31500;
                    if (charAt >= iArr.length) {
                        int i6 = 0;
                        while (true) {
                            InterfaceC10795[] interfaceC10795Arr = c10502.f31503;
                            if (i6 >= interfaceC10795Arr.length) {
                                i3 = 0;
                                break;
                            }
                            if (interfaceC10795Arr[i6].mo2465(charAt)) {
                                i3 = c10502.f31504[i6];
                                break;
                            }
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return -1;
                            }
                            i6++;
                        }
                    } else {
                        i3 = iArr[charAt];
                    }
                    if (i3 != 0) {
                        m15099(i3, i);
                        i++;
                        m15099(i3 + 1, i);
                        i4++;
                    }
                }
            }
            if (i4 >= c10502.f31502 && (c8054.f24820 != 1 || i == i2)) {
                return i;
            }
            return -1;
        } while (!m15086());
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15044(C3821 c3821, CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = c3821.f12222;
            InterfaceC10795 interfaceC10795 = c3821.f12230;
            boolean z = c3821.f12229;
            boolean z2 = c3821.f12226;
            C8054 c8054 = this.f16397;
            if (i3 < i4) {
                if (i >= i2) {
                    c8054.f24842 = true;
                } else {
                    int charAt = z2 ? charSequence.charAt(i) : Character.codePointAt(charSequence, i);
                    int charCount = (z2 ? 1 : Character.charCount(charAt)) + i;
                    if (charCount > i2) {
                        c8054.f24842 = true;
                    }
                    if (charCount <= i2 && c3821.f12231.mo2465(charAt)) {
                        i = charCount;
                    } else if (charAt == c3821.f12227) {
                        int i5 = i + 1;
                        if (i5 >= i2) {
                            c8054.f24842 = true;
                        } else {
                            int charAt2 = z ? charSequence.charAt(i5) : Character.codePointAt(charSequence, i5);
                            int charCount2 = i5 + (z ? 1 : Character.charCount(charAt2));
                            if (charCount2 > i2) {
                                c8054.f24842 = true;
                            } else if (c3821.f12228.mo2465(charAt2)) {
                                i = charCount2;
                            }
                        }
                    }
                    i3++;
                }
            }
            if (i3 >= c3821.f12225) {
                if (interfaceC10795 != null) {
                    int i6 = i;
                    while (i6 < i2 && interfaceC10795.mo2465(charSequence.charAt(i6))) {
                        i6++;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return -1;
                        }
                    }
                    if (i6 >= i2) {
                        c8054.f24842 = true;
                    }
                    if (i6 - i >= c3821.f12223) {
                        i = i6;
                    }
                }
                if (i >= i2) {
                    c8054.f24842 = true;
                    return -1;
                }
                if (c3821.f12224.mo2465(charSequence.charAt(i))) {
                    int i7 = i + 1;
                    if (c8054.f24820 != 1 || i7 == i2) {
                        return i7;
                    }
                }
            }
            return -1;
        } while (!m15086());
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15046(C13323 c13323, CharSequence charSequence, int i, int i2) {
        char charAt;
        C3446 c3446 = c13323.f39878;
        int[][] iArr = c13323.f39879;
        C8054 c8054 = this.f16397;
        if (C21460.m48609(c3446, c8054, i, charSequence)) {
            int[] iArr2 = (i >= i2 || (charAt = charSequence.charAt(i)) >= 128) ? null : c13323.f39877[charAt];
            int length = iArr2 == null ? iArr.length : iArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return -1;
                }
                int m15042 = m15042(i, i2, charSequence, iArr[iArr2 == null ? i3 : iArr2[i3]]);
                if (this.f16390) {
                    break;
                }
                if (m15042 >= 0 && C21460.m48609(c13323.f39876, c8054, m15042, charSequence) && (c8054.f24820 != 1 || m15042 == i2)) {
                    return m15042;
                }
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15042(int i, int i2, CharSequence charSequence, Object obj) {
        boolean z = obj instanceof InterfaceC10795;
        C8054 c8054 = this.f16397;
        if (z) {
            InterfaceC10795 interfaceC10795 = (InterfaceC10795) obj;
            if (i >= i2) {
                c8054.f24842 = true;
                return -1;
            }
            if (interfaceC10795.mo2465(charSequence.charAt(i))) {
                return i + 1;
            }
            return -1;
        }
        int[] iArr = (int[]) obj;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i + i3;
            if (i4 >= i2) {
                c8054.f24842 = true;
                return -1;
            }
            if (iArr[i3] != charSequence.charAt(i4)) {
                return -1;
            }
            if (c8054.m21407()) {
                this.f16390 = true;
                return -1;
            }
        }
        return i + iArr.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15050(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f16402;
        int length = iArr.length;
        int i6 = this.f16398;
        if (length - i6 < 6) {
            int m15043 = m15043(iArr.length, i6 + 6);
            m15093(this.f16391.length, m15043, this.f16408.length);
            this.f16402 = Arrays.copyOf(this.f16402, m15043);
        }
        int i7 = this.f16398;
        int[] iArr2 = this.f16402;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        iArr2[i7 + 2] = i3;
        iArr2[i7 + 3] = this.f16409;
        iArr2[i7 + 4] = i4;
        iArr2[i7 + 5] = i5;
        this.f16398 = i7 + 6;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m15097(int i) {
        return this.f16401.f28781 ? this.f16397.f24826[i] : this.f16391[i];
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m15108(int i, int i2) {
        if (this.f16401.f28781) {
            this.f16397.f24826[i] = i2;
        } else {
            this.f16391[i] = i2;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m15070(int i) {
        if ((i & 1073741824) != 0) {
            throw new C0292();
        }
        m15104(~(1073741824 | i), m15097(i));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m15085(int i, int i2) {
        if (this.f16401.f28781 || this.f16398 != 0) {
            m15104(~i, m15097(i));
        }
        m15108(i, i2);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15099(int i, int i2) {
        C8054 c8054 = this.f16397;
        m15104(i, c8054.f24832[i]);
        c8054.f24832[i] = i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15104(int i, int i2) {
        int[] iArr = this.f16408;
        int length = iArr.length;
        int i3 = this.f16409;
        if (length - i3 < 2) {
            int m15043 = m15043(iArr.length, i3 + 2);
            m15093(this.f16391.length, this.f16402.length, m15043);
            this.f16408 = Arrays.copyOf(this.f16408, m15043);
        }
        int[] iArr2 = this.f16408;
        int i4 = this.f16409;
        int i5 = i4 + 1;
        this.f16409 = i5;
        iArr2[i4] = i;
        this.f16409 = i4 + 2;
        iArr2[i5] = i2;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m15069(int i) {
        while (true) {
            int i2 = this.f16409;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.f16408;
            int i3 = i2 - 1;
            this.f16409 = i3;
            int i4 = iArr[i3];
            int i5 = i2 - 2;
            this.f16409 = i5;
            int i6 = iArr[i5];
            if (i6 != Integer.MIN_VALUE && i6 != -2147483647) {
                if (i6 < 0) {
                    m15108((~i6) & (-1073741825), i4);
                } else {
                    this.f16397.f24832[i6] = i4;
                }
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15087(int i) {
        int i2 = this.f16388 - 32;
        int i3 = this.f16409 - 2;
        boolean z = true;
        while (i3 >= i) {
            i2 = m15036(i2, i3 + 2);
            if (!this.f16390) {
                int i4 = this.f16408[i3];
                if (i4 != -2147483647) {
                    boolean z2 = (i4 >= 0 || i4 == Integer.MIN_VALUE || ((~i4) & 1073741824) == 0) ? false : true;
                    C8054 c8054 = this.f16397;
                    if (z && i4 != Integer.MIN_VALUE && !z2) {
                        if (m15086()) {
                        }
                    } else if (c8054.m21407()) {
                        this.f16390 = true;
                        return false;
                    }
                    if (z2) {
                        m15108((~i4) & (-1073741825), this.f16408[i3 + 1]);
                        this.f16408[i3] = -2147483647;
                    } else if (this.f16401.f28781 && i4 < 0 && i4 != Integer.MIN_VALUE) {
                        this.f16408[i3] = -2147483647;
                    } else if (i4 == Integer.MIN_VALUE) {
                        int[] iArr = c8054.f24832;
                        int i5 = this.f16408[i3 + 1];
                        iArr[0] = i5;
                        c8054.f24855 = i5;
                        iArr[1] = c8054.f24822;
                    } else if (i4 > 1 && (i4 & 1) != 0) {
                        int[] iArr2 = this.f16408;
                        int i6 = iArr2[i3 + 1];
                        int i7 = iArr2[i3 - 1];
                        if (c8054.f24837 && i7 != -1 && i6 != -1) {
                            c8054.f24823.f58949.add(new C2992(i4 / 2, i7, i6));
                        }
                        i3 -= 2;
                    }
                    z = false;
                }
                i3 -= 2;
            }
            return false;
        }
        m15036(i2, i);
        return !this.f16390;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15036(int i, int i2) {
        while (true) {
            if (i >= 0) {
                int[] iArr = this.f16393;
                int i3 = i + 13;
                int i4 = iArr[i3];
                if (i4 == 0 || iArr[i + 5] < i2) {
                    break;
                }
                if (i4 != 2 && iArr[i] == 6 && iArr[i + 17] == 8) {
                    int i5 = iArr[i + 2];
                    m15054(m15073(i), i5 - this.f16393[i + 19], i5);
                }
                this.f16393[i3] = 2;
                i -= 32;
                if (this.f16397.m21407()) {
                    this.f16390 = true;
                    break;
                }
            } else {
                break;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15110() {
        if (this.f16410 != 0) {
            this.f16394++;
            Arrays.fill(this.f16407, 0L);
            this.f16410 = 0;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15080(int i, int i2) {
        if (this.f16401.f28781) {
            this.f16397.f24819[i].getClass();
        }
        long[] jArr = this.f16407;
        if (jArr.length == 0) {
            return false;
        }
        long j = (i2 + 1) | (i << 32);
        return !this.f16390 && this.f16394 == this.f16394 && this.f16407[m15047(jArr, j)] == j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15092(int i, int i2) {
        boolean z = this.f16401.f28781;
        C8054 c8054 = this.f16397;
        if (z) {
            c8054.f24819[i].getClass();
        }
        int i3 = this.f16394;
        long j = (i2 + 1) | (i << 32);
        long[] jArr = this.f16407;
        if (jArr.length != 0) {
            int m15047 = m15047(jArr, j);
            if (this.f16390 || i3 != this.f16394 || this.f16407[m15047] == j) {
                return;
            }
        }
        int i4 = this.f16410;
        long[] jArr2 = this.f16407;
        if (i4 >= jArr2.length / 2) {
            int m15043 = m15043(jArr2.length, jArr2.length + 1);
            if (((m15043 - 1) & m15043) == 0) {
                if (((m15043 - this.f16407.length) * 8) + m15090() <= 33554432) {
                    long[] jArr3 = new long[m15043];
                    for (int i5 = 0; i5 < this.f16407.length; i5++) {
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return;
                        }
                        if (i3 != this.f16394) {
                            return;
                        }
                        long j2 = this.f16407[i5];
                        if (j2 != 0) {
                            int m150472 = m15047(jArr3, j2);
                            if (this.f16390 || i3 != this.f16394) {
                                return;
                            } else {
                                jArr3[m150472] = j2;
                            }
                        }
                    }
                    if (i3 != this.f16394) {
                        return;
                    } else {
                        this.f16407 = jArr3;
                    }
                }
            }
            throw new C0292();
        }
        int m150473 = m15047(this.f16407, j);
        if (this.f16390 || i3 != this.f16394) {
            return;
        }
        this.f16407[m150473] = j;
        this.f16410++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15047(long[] jArr, long j) {
        long j2 = ((j >>> 33) ^ j) * (-49064778989728563L);
        int length = jArr.length - 1;
        int i = ((int) (j2 ^ (j2 >>> 33))) & length;
        while (true) {
            long j3 = jArr[i];
            if (j3 == 0 || j3 == j) {
                break;
            }
            if (this.f16397.m21407()) {
                this.f16390 = true;
                return 0;
            }
            i = (i + 1) & length;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15062(C10502 c10502, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int m15045 = m15045(c10502, charSequence, i, c8054.f24844);
        if (this.f16390 || m15045 < 0) {
            m15069(0);
            return false;
        }
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(m15045);
        iArr[1] = m15045;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15064(C13323 c13323, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int m15046 = m15046(c13323, charSequence, i, c8054.f24844);
        if (this.f16390 || m15046 < 0) {
            return false;
        }
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(m15046);
        iArr[1] = m15046;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15066(C20755 c20755, int i, CharSequence charSequence) {
        char charAt;
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int i2 = c8054.f24844;
        C6643 c6643 = c20755.f67235;
        int[] iArr = c6643.f20614;
        if (i < i2 && (charAt = charSequence.charAt(i)) < 128) {
            int i3 = c6643.f20612[charAt];
            return i3 != 0 && m15081(iArr[Integer.numberOfTrailingZeros(i3)], i, charSequence);
        }
        m15050(3, c20755.f67236, i, 1, 0);
        return m15081(iArr[0], i, charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m15074(int i, int i2, int i3, InterfaceC10795 interfaceC10795, CharSequence charSequence) {
        while (i2 < i3) {
            C8054 c8054 = this.f16397;
            if (!c8054.m21407()) {
                c8054.m21413();
                String normalize = Normalizer.normalize(TextUtils.substring(charSequence, i, i3), Normalizer.Form.NFC);
                if (!c8054.m21411()) {
                    Thread thread = this.f16399;
                    if (thread == null) {
                        thread = Thread.currentThread();
                        this.f16399 = thread;
                    }
                    if (!c8054.m21397(thread)) {
                        if (normalize.codePointCount(0, normalize.length()) == 1 && interfaceC10795.mo2465(normalize.codePointAt(0))) {
                            return i3;
                        }
                        i3 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                    }
                }
                this.f16390 = true;
                break;
            }
            this.f16390 = true;
            return -1;
        }
        return -1;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15086() {
        C8054 c8054 = this.f16397;
        if (!c8054.m21407()) {
            if (c8054.f24827) {
                return false;
            }
            Thread thread = this.f16399;
            if (thread == null) {
                thread = Thread.currentThread();
                this.f16399 = thread;
            }
            if (!c8054.m21397(thread)) {
                return false;
            }
        }
        this.f16390 = true;
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15093(int i, int i2, int i3) {
        if (((this.f16405.length + this.f16393.length) * 4) + ((this.f16392.length + this.f16407.length) * 8) + ((i + i2 + i3) * 4) > 33554432) {
            throw new C0292();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15043(int i, long j) {
        if (j > 2147483639) {
            throw new C0292();
        }
        return (int) Math.min(2147483639L, Math.max(j, Math.max(64L, i * 2)));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m15090() {
        return ((this.f16392.length + this.f16407.length) * 8) + ((this.f16391.length + this.f16402.length + this.f16408.length + this.f16405.length + this.f16393.length) * 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15067(C23576 c23576, C8054 c8054, int i, CharSequence charSequence) {
        int i2 = c23576.f76465;
        Object obj = c23576.f76467;
        if (i2 != 16) {
            if (i2 == 1) {
                if (i >= c8054.f24844) {
                    c8054.f24842 = true;
                    return true;
                }
                return !((InterfaceC10795) obj).mo2465(charSequence.charAt(i));
            }
            C23369 c23369 = (C23369) obj;
            int i3 = c23369.f75067 + i;
            if (i3 >= i && i3 < c8054.f24844) {
                char charAt = charSequence.charAt(i3);
                if (!c23369.f75066 ? c23369.f75068.mo2465(charAt) : charAt == c23369.f75065) {
                }
            }
            return false;
        }
        boolean z = c8054.f24842;
        boolean z2 = c8054.f24833;
        if (C21460.m48607(c23576.f76464, c23576.f76466, c8054, i, charSequence)) {
            c8054.f24842 = z;
            c8054.f24833 = z2;
            return false;
        }
        return true;
    }
}
