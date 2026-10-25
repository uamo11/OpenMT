package l;

/* compiled from: D8JS */
/* renamed from: l.ۘܽۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4065 implements InterfaceC19383 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12886;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f12887;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12888;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f12891;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f12893;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f12894;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 f12895;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20999 f12896;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f12897;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f12899;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8353 f12902;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8353 f12903;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f12904;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8353 f12905;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f12906;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f12909;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12911;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15036 f12918;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9004 f12914 = new C9004();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f12908 = 1000;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f12913 = new long[1000];

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long[] f12912 = new long[1000];

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long[] f12890 = new long[1000];

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f12898 = new int[1000];

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f12916 = new int[1000];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18677[] f12910 = new C18677[1000];

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3359 f12915 = new C3359(new C9710());

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f12892 = Long.MIN_VALUE;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f12907 = Long.MIN_VALUE;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f12889 = Long.MIN_VALUE;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f12901 = true;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f12917 = true;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f12900 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m12186(long j, int i, long j2, int i2, C18677 c18677) {
        int i3 = this.f12891;
        if (i3 > 0) {
            int m12193 = m12193(i3 - 1);
            C22632.m50631(this.f12912[m12193] + ((long) this.f12916[m12193]) <= j2);
        }
        this.f12897 = (536870912 & i) != 0;
        this.f12889 = Math.max(this.f12889, j);
        int m121932 = m12193(this.f12891);
        this.f12890[m121932] = j;
        this.f12912[m121932] = j2;
        this.f12916[m121932] = i2;
        this.f12898[m121932] = i;
        this.f12910[m121932] = c18677;
        this.f12913[m121932] = this.f12904;
        if (this.f12915.m10260() || !((C16058) this.f12915.m10257()).f49513.equals(this.f12902)) {
            C8353 c8353 = this.f12902;
            c8353.getClass();
            InterfaceC4454 interfaceC4454 = this.f12895;
            this.f12915.m10256(m12203(), new C16058(c8353, interfaceC4454 != null ? interfaceC4454.mo7629(this.f12918, c8353) : InterfaceC19977.f64693));
        }
        int i4 = this.f12891 + 1;
        this.f12891 = i4;
        int i5 = this.f12908;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            C18677[] c18677Arr = new C18677[i6];
            int i7 = this.f12887;
            int i8 = i5 - i7;
            System.arraycopy(this.f12912, i7, jArr2, 0, i8);
            System.arraycopy(this.f12890, this.f12887, jArr3, 0, i8);
            System.arraycopy(this.f12898, this.f12887, iArr, 0, i8);
            System.arraycopy(this.f12916, this.f12887, iArr2, 0, i8);
            System.arraycopy(this.f12910, this.f12887, c18677Arr, 0, i8);
            System.arraycopy(this.f12913, this.f12887, jArr, 0, i8);
            int i9 = this.f12887;
            System.arraycopy(this.f12912, 0, jArr2, i8, i9);
            System.arraycopy(this.f12890, 0, jArr3, i8, i9);
            System.arraycopy(this.f12898, 0, iArr, i8, i9);
            System.arraycopy(this.f12916, 0, iArr2, i8, i9);
            System.arraycopy(this.f12910, 0, c18677Arr, i8, i9);
            System.arraycopy(this.f12913, 0, jArr, i8, i9);
            this.f12912 = jArr2;
            this.f12890 = jArr3;
            this.f12898 = iArr;
            this.f12916 = iArr2;
            this.f12910 = c18677Arr;
            this.f12913 = jArr;
            this.f12887 = 0;
            this.f12908 = i6;
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private synchronized void m12192() {
        this.f12893 = 0;
        this.f12896.m47817();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m12194(long j, boolean z) {
        int m12193 = m12193(this.f12893);
        int i = this.f12893;
        int i2 = this.f12891;
        if ((i != i2) && j >= this.f12890[m12193]) {
            if (j > this.f12889 && z) {
                return i2 - i;
            }
            int m12185 = m12185(m12193, i2 - i, j, true);
            if (m12185 == -1) {
                return 0;
            }
            return m12185;
        }
        return 0;
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public /* synthetic */ void mo8454(long j) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12200(boolean z) {
        C8353 c8353;
        boolean z2 = false;
        if (this.f12893 != this.f12891) {
            if (((C16058) this.f12915.m10259(m12212())).f49513 != this.f12905) {
                return true;
            }
            return m12188(m12193(this.f12893));
        }
        if (z || this.f12897 || ((c8353 = this.f12902) != null && c8353 != this.f12905)) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12205() {
        return this.f12897;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12213() {
        return this.f12893 != this.f12891 ? this.f12913[m12193(this.f12893)] : this.f12904;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12215(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f12893 + i <= this.f12891) {
                    z = true;
                    C22632.m50631(z);
                    this.f12893 += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C22632.m50631(z);
        this.f12893 += i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12217() {
        return Math.max(this.f12907, m12189(this.f12893));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12218() {
        return this.f12889;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C8353 m12222() {
        return this.f12901 ? null : this.f12902;
    }

    public C4065(InterfaceC21725 interfaceC21725, InterfaceC4454 interfaceC4454, C15036 c15036) {
        this.f12895 = interfaceC4454;
        this.f12918 = c15036;
        this.f12896 = new C20999(interfaceC21725);
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8453(int i, C17714 c17714) {
        mo8457(c17714, i, 0);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m12202() {
        m12209(true);
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(this.f12918);
            this.f12909 = null;
            this.f12905 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12209(boolean z) {
        this.f12896.m47814();
        this.f12891 = 0;
        this.f12888 = 0;
        this.f12887 = 0;
        this.f12893 = 0;
        this.f12917 = true;
        this.f12892 = Long.MIN_VALUE;
        this.f12907 = Long.MIN_VALUE;
        this.f12889 = Long.MIN_VALUE;
        this.f12897 = false;
        this.f12915.m10254();
        if (z) {
            this.f12903 = null;
            this.f12902 = null;
            this.f12901 = true;
            this.f12900 = true;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12216(long j) {
        this.f12892 = j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12219(long j) {
        this.f12904 = j;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12220() {
        this.f12886 = true;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m12203() {
        return this.f12888 + this.f12891;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12197(int i) {
        this.f12896.m47815(m12190(i));
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12201() {
        m12196();
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(this.f12918);
            this.f12909 = null;
            this.f12905 = null;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m12204() {
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 == null || interfaceC0220.getState() != 1) {
            return;
        }
        C19272 error = this.f12909.getError();
        error.getClass();
        throw error;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12214() {
        return this.f12888;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m12212() {
        return this.f12888 + this.f12893;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12195(C3002 c3002, C21843 c21843, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C9004 c9004 = this.f12914;
        synchronized (this) {
            c21843.f69996 = false;
            i2 = -3;
            if (this.f12893 != this.f12891) {
                C8353 c8353 = ((C16058) this.f12915.m10259(m12212())).f49513;
                if (!z2 && c8353 == this.f12905) {
                    int m12193 = m12193(this.f12893);
                    if (m12188(m12193)) {
                        c21843.m12693(this.f12898[m12193]);
                        if (this.f12893 == this.f12891 - 1 && (z || this.f12897)) {
                            c21843.m12691(536870912);
                        }
                        c21843.f69997 = this.f12890[m12193];
                        c9004.f27357 = this.f12916[m12193];
                        c9004.f27356 = this.f12912[m12193];
                        c9004.f27355 = this.f12910[m12193];
                        i2 = -4;
                    } else {
                        c21843.f69996 = true;
                    }
                }
                m12187(c8353, c3002);
                i2 = -5;
            } else {
                if (!z && !this.f12897) {
                    C8353 c83532 = this.f12902;
                    if (c83532 != null && (z2 || c83532 != this.f12905)) {
                        m12187(c83532, c3002);
                        i2 = -5;
                    }
                }
                c21843.m12693(4);
                c21843.f69997 = Long.MIN_VALUE;
                i2 = -4;
            }
        }
        if (i2 == -4 && !c21843.m12697()) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    this.f12896.m47813(c21843, this.f12914);
                } else {
                    this.f12896.m47816(c21843, this.f12914);
                }
            }
            if (!z3) {
                this.f12893++;
            }
        }
        return i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12210(int i) {
        m12192();
        int i2 = this.f12888;
        if (i >= i2 && i <= this.f12891 + i2) {
            this.f12892 = Long.MIN_VALUE;
            this.f12893 = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12211(long j, boolean z) {
        int m12185;
        try {
            m12192();
            int m12193 = m12193(this.f12893);
            int i = this.f12893;
            int i2 = this.f12891;
            if ((i != i2) && j >= this.f12890[m12193] && (j <= this.f12889 || z)) {
                if (this.f12900) {
                    m12185 = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 < m12185) {
                            if (this.f12890[m12193] >= j) {
                                m12185 = i3;
                                break;
                            }
                            m12193++;
                            if (m12193 == this.f12908) {
                                m12193 = 0;
                            }
                            i3++;
                        } else if (!z) {
                            m12185 = -1;
                        }
                    }
                } else {
                    m12185 = m12185(m12193, i2 - i, j, true);
                }
                if (m12185 == -1) {
                    return false;
                }
                this.f12892 = j;
                this.f12893 += m12185;
                return true;
            }
            return false;
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12198(long j, boolean z, boolean z2) {
        long j2;
        int i;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            try {
                int i2 = this.f12891;
                j2 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f12890;
                    int i3 = this.f12887;
                    if (j >= jArr[i3]) {
                        int m12185 = m12185(i3, (!z2 || (i = this.f12893) == i2) ? i2 : i + 1, j, z);
                        if (m12185 != -1) {
                            j2 = m12191(m12185);
                        }
                    }
                }
            } finally {
            }
        }
        c20999.m47812(j2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12207() {
        long m12191;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            int i = this.f12893;
            m12191 = i == 0 ? -1L : m12191(i);
        }
        c20999.m47812(m12191);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12196() {
        long m12191;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            int i = this.f12891;
            m12191 = i == 0 ? -1L : m12191(i);
        }
        c20999.m47812(m12191);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12208(long j) {
        if (this.f12906 != j) {
            this.f12906 = j;
            this.f12899 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12199(InterfaceC2654 interfaceC2654) {
        this.f12894 = interfaceC2654;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, l.ۖܽۧ] */
    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8456(C8353 c8353) {
        C8353 mo12206 = mo12206(c8353);
        boolean z = false;
        this.f12899 = false;
        this.f12903 = c8353;
        synchronized (this) {
            this.f12901 = false;
            if (!C11003.equals(mo12206, this.f12902)) {
                if (this.f12915.m10260() || !((C16058) this.f12915.m10257()).f49513.equals(mo12206)) {
                    this.f12902 = mo12206;
                } else {
                    this.f12902 = ((C16058) this.f12915.m10257()).f49513;
                }
                boolean z2 = this.f12900;
                C8353 c83532 = this.f12902;
                this.f12900 = z2 & C9786.m24798(c83532.f25614, c83532.f25619);
                this.f12911 = false;
                z = true;
            }
        }
        ?? r5 = this.f12894;
        if (r5 == 0 || !z) {
            return;
        }
        r5.mo8321();
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f12896.m47809(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* renamed from: ۧ */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f12896.m47809(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8457(C17714 c17714, int i, int i2) {
        this.f12896.m47811(i, c17714);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8455(long r14, int r16, int r17, int r18, l.C18677 r19) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4065.mo8455(long, int, int, int, l.ᩴۢۧ):void");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12221() {
        this.f12899 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8353 mo12206(C8353 c8353) {
        if (this.f12906 == 0 || c8353.f25620 == C13132.FOREVER_NS) {
            return c8353;
        }
        C1297 m21948 = c8353.m21948();
        m21948.m4443(c8353.f25620 + this.f12906);
        return m21948.m4440();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m12190(int i) {
        int m12203 = m12203() - i;
        boolean z = false;
        C22632.m50631(m12203 >= 0 && m12203 <= this.f12891 - this.f12893);
        int i2 = this.f12891 - m12203;
        this.f12891 = i2;
        this.f12889 = Math.max(this.f12907, m12189(i2));
        if (m12203 == 0 && this.f12897) {
            z = true;
        }
        this.f12897 = z;
        this.f12915.m10255(i);
        int i3 = this.f12891;
        if (i3 == 0) {
            return 0L;
        }
        return this.f12912[m12193(i3 - 1)] + this.f12916[r8];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12187(C8353 c8353, C3002 c3002) {
        C8353 c83532 = this.f12905;
        boolean z = c83532 == null;
        C19643 c19643 = c83532 == null ? null : c83532.f25602;
        this.f12905 = c8353;
        C19643 c196432 = c8353.f25602;
        InterfaceC4454 interfaceC4454 = this.f12895;
        c3002.f9455 = interfaceC4454 != null ? c8353.m21949(interfaceC4454.mo7624(c8353)) : c8353;
        c3002.f9454 = this.f12909;
        if (interfaceC4454 == null) {
            return;
        }
        if (z || !C11003.equals(c19643, c196432)) {
            InterfaceC0220 interfaceC0220 = this.f12909;
            C15036 c15036 = this.f12918;
            InterfaceC0220 mo7625 = interfaceC4454.mo7625(c15036, c8353);
            this.f12909 = mo7625;
            c3002.f9454 = mo7625;
            if (interfaceC0220 != null) {
                interfaceC0220.mo1472(c15036);
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m12188(int i) {
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 == null || interfaceC0220.getState() == 4) {
            return true;
        }
        return (this.f12898[i] & 1073741824) == 0 && this.f12909.mo1473();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m12185(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f12890[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f12898[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f12908) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m12191(int i) {
        this.f12907 = Math.max(this.f12907, m12189(i));
        this.f12891 -= i;
        int i2 = this.f12888 + i;
        this.f12888 = i2;
        int i3 = this.f12887 + i;
        this.f12887 = i3;
        int i4 = this.f12908;
        if (i3 >= i4) {
            this.f12887 = i3 - i4;
        }
        int i5 = this.f12893 - i;
        this.f12893 = i5;
        if (i5 < 0) {
            this.f12893 = 0;
        }
        this.f12915.m10258(i2);
        if (this.f12891 == 0) {
            int i6 = this.f12887;
            if (i6 == 0) {
                i6 = this.f12908;
            }
            return this.f12912[i6 - 1] + this.f12916[r6];
        }
        return this.f12912[this.f12887];
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m12189(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int m12193 = m12193(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f12890[m12193]);
            if ((this.f12898[m12193] & 1) != 0) {
                return j;
            }
            m12193--;
            if (m12193 == -1) {
                m12193 = this.f12908 - 1;
            }
        }
        return j;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m12193(int i) {
        int i2 = this.f12887 + i;
        int i3 = this.f12908;
        return i2 < i3 ? i2 : i2 - i3;
    }
}
