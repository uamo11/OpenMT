package l;

/* compiled from: K7UL */
/* renamed from: l.ܳ۬֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14536 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44533;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837 f44536;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837 f44537;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44534 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f44538 = false;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44535 = false;

    public C14536(InterfaceC1837 interfaceC1837, InterfaceC1837 interfaceC18372, int i) {
        this.f44536 = interfaceC1837;
        this.f44533 = i;
        this.f44537 = interfaceC18372;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34723() {
        return this.f44537 != null;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34718() {
        int i;
        C22632.m50634(!m34716());
        if (m34687(this.f44536)) {
            i = 3;
        } else {
            InterfaceC1837 interfaceC1837 = this.f44537;
            i = (interfaceC1837 == null || interfaceC1837.getState() == 0) ? 2 : 4;
        }
        this.f44534 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m34716() {
        int i = this.f44534;
        return i == 2 || i == 4 || i == 3;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34722(C17071 c17071) {
        int i = this.f44534;
        return ((i == 2 || i == 4) && m34689(c17071) == this.f44536) || (this.f44534 == 3 && m34689(c17071) == this.f44537);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34711() {
        boolean m34687 = m34687(this.f44536);
        InterfaceC1837 interfaceC1837 = this.f44537;
        return (m34687 ? 1 : 0) + ((interfaceC1837 == null || !m34687(interfaceC1837)) ? 0 : 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34693(float f) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 1) {
            return;
        }
        interfaceC1837.mo13450(2, Float.valueOf(f));
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 != null) {
            interfaceC18372.mo13450(2, Float.valueOf(f));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34696(Object obj) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 2) {
            return;
        }
        int i = this.f44534;
        if (i == 4 || i == 1) {
            InterfaceC1837 interfaceC18372 = this.f44537;
            interfaceC18372.getClass();
            interfaceC18372.mo13450(1, obj);
            return;
        }
        interfaceC1837.mo13450(1, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34705(InterfaceC22618 interfaceC22618) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 2) {
            return;
        }
        interfaceC1837.mo13450(7, interfaceC22618);
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 != null) {
            interfaceC18372.mo13450(7, interfaceC22618);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m34719() {
        return this.f44536.mo6092();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m34712(C17071 c17071) {
        InterfaceC1837 m34689 = m34689(c17071);
        C11003.requireNonNull(m34689);
        return m34689.mo6083();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34724(C17071 c17071) {
        InterfaceC1837 m34689 = m34689(c17071);
        m34689.getClass();
        return m34689.mo6104();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34715(C17071 c17071, long j) {
        InterfaceC1837 m34689 = m34689(c17071);
        m34689.getClass();
        m34684(m34689, j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34698(C1263 c1263, C1263 c12632, long j) {
        int i;
        int i2 = this.f44533;
        boolean m4319 = c1263.m4319(i2);
        boolean m43192 = c12632.m4319(i2);
        InterfaceC1837 interfaceC1837 = this.f44536;
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || (i = this.f44534) == 3 || (i == 0 && m34687(interfaceC1837))) {
            interfaceC18372 = interfaceC1837;
        }
        if (!m4319 || interfaceC18372.mo6100()) {
            return;
        }
        boolean z = interfaceC1837.mo6092() == -2;
        C17359 c17359 = c1263.f4476[i2];
        C17359 c173592 = c12632.f4476[i2];
        if (!m43192 || !C11003.equals(c173592, c17359) || z || m34716()) {
            m34684(interfaceC18372, j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34695(long j) {
        int i;
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837) && (i = this.f44534) != 4 && i != 2) {
            m34684(interfaceC1837, j);
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || interfaceC18372.getState() == 0 || this.f44534 == 3) {
            return;
        }
        m34684(interfaceC18372, j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34684(InterfaceC1837 interfaceC1837, long j) {
        interfaceC1837.mo6103();
        if (interfaceC1837 instanceof C16100) {
            ((C16100) interfaceC1837).m37992(j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m34691(long j, long j2) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        long mo6097 = m34687(interfaceC1837) ? interfaceC1837.mo6097(j, j2) : C13132.FOREVER_NS;
        InterfaceC1837 interfaceC18372 = this.f44537;
        return (interfaceC18372 == null || interfaceC18372.getState() == 0) ? mo6097 : Math.min(mo6097, interfaceC18372.mo6097(j, j2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34692() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            interfaceC1837.mo6095();
            return;
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || !m34687(interfaceC18372)) {
            return;
        }
        interfaceC18372.mo6095();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34694(float f, float f2) {
        this.f44536.mo6085(f, f2);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6085(f, f2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34699(AbstractC4846 abstractC4846) {
        this.f44536.mo6089(abstractC4846);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6089(abstractC4846);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34721() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        boolean mo6098 = m34687(interfaceC1837) ? interfaceC1837.mo6098() : true;
        InterfaceC1837 interfaceC18372 = this.f44537;
        return (interfaceC18372 == null || interfaceC18372.getState() == 0) ? mo6098 : mo6098 & interfaceC18372.mo6098();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m34717(C17071 c17071) {
        return m34689(c17071) != null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34720(C17071 c17071) {
        return m34688(c17071, this.f44536) && m34688(c17071, this.f44537);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r9.mo6083() >= r1.m40074()) goto L32;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m34688(l.C17071 r8, l.InterfaceC1837 r9) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L4
            goto L57
        L4:
            l.ᩴܽۧ[] r1 = r8.f52335
            int r2 = r7.f44533
            r1 = r1[r2]
            l.ᩴܽۧ r3 = r9.mo6099()
            if (r3 == 0) goto L57
            l.ᩴܽۧ r3 = r9.mo6099()
            if (r3 != r1) goto L44
            if (r1 == 0) goto L57
            boolean r1 = r9.mo6104()
            if (r1 != 0) goto L57
            l.ܿۗ֫ r1 = r8.m40068()
            l.ܳۗ֫ r3 = r8.f52336
            boolean r3 = r3.f42931
            if (r3 == 0) goto L44
            if (r1 == 0) goto L44
            boolean r3 = r1.f52341
            if (r3 == 0) goto L44
            boolean r3 = r9 instanceof l.C16100
            if (r3 != 0) goto L43
            boolean r3 = r9 instanceof l.C5906
            if (r3 != 0) goto L43
            long r3 = r9.mo6083()
            long r5 = r1.m40074()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L44
            goto L57
        L43:
            return r0
        L44:
            l.ܿۗ֫ r8 = r8.m40068()
            if (r8 == 0) goto L55
            l.ᩴܽۧ[] r8 = r8.f52335
            r8 = r8[r2]
            l.ᩴܽۧ r9 = r9.mo6099()
            if (r8 != r9) goto L55
            goto L57
        L55:
            r8 = 0
            return r8
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14536.m34688(l.ܿۗ֫, l.֫۬֫):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34713(long j, long j2) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            interfaceC1837.mo6088(j, j2);
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || !m34687(interfaceC18372)) {
            return;
        }
        interfaceC18372.mo6088(j, j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34706(C17071 c17071) {
        InterfaceC1837 m34689 = m34689(c17071);
        return m34689 == null || m34689.mo6104() || m34689.mo6101() || m34689.mo6098();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34726(C17071 c17071) {
        InterfaceC1837 m34689 = m34689(c17071);
        m34689.getClass();
        m34689.mo6096();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m34709() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.getState() == 1 && this.f44534 != 4) {
            interfaceC1837.start();
            return;
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || interfaceC18372.getState() != 1 || this.f44534 == 3) {
            return;
        }
        interfaceC18372.start();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34707() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837) && interfaceC1837.getState() == 2) {
            interfaceC1837.stop();
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || interfaceC18372.getState() == 0 || interfaceC18372.getState() != 2) {
            return;
        }
        interfaceC18372.stop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34697(Object obj, C17071 c17071) {
        InterfaceC1837 m34689 = m34689(c17071);
        m34689.getClass();
        m34689.mo13450(11, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34704(C20888 c20888) {
        this.f44536.mo13450(18, c20888);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo13450(18, c20888);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34700(C14101 c14101) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        m34685(interfaceC1837, c14101);
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 != null) {
            boolean z = (interfaceC18372.getState() == 0 || this.f44534 == 3) ? false : true;
            m34685(interfaceC18372, c14101);
            m34686(false);
            if (z) {
                interfaceC18372.getClass();
                interfaceC18372.mo13450(17, interfaceC1837);
            }
        }
        this.f44534 = 0;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34708() {
        int i = this.f44534;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f44534 = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        InterfaceC1837 interfaceC1837 = this.f44536;
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (z) {
            interfaceC18372.getClass();
            interfaceC18372.mo13450(17, interfaceC1837);
        } else {
            interfaceC18372.getClass();
            interfaceC1837.mo13450(17, interfaceC18372);
        }
        this.f44534 = this.f44534 != 4 ? 1 : 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34714(C14101 c14101) {
        InterfaceC1837 interfaceC1837;
        if (m34716()) {
            int i = this.f44534;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            if (!z) {
                interfaceC1837 = this.f44537;
                interfaceC1837.getClass();
            } else {
                interfaceC1837 = this.f44536;
            }
            m34685(interfaceC1837, c14101);
            m34686(z);
            this.f44534 = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34703(InterfaceC18882 interfaceC18882, C14101 c14101, long j, boolean z) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            if (interfaceC18882 != interfaceC1837.mo6099()) {
                m34685(interfaceC1837, c14101);
            } else if (z) {
                interfaceC1837.mo6087(j);
            }
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || !m34687(interfaceC18372)) {
            return;
        }
        if (interfaceC18882 != interfaceC18372.mo6099()) {
            m34685(interfaceC18372, c14101);
        } else if (z) {
            interfaceC18372.mo6087(j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34685(InterfaceC1837 interfaceC1837, C14101 c14101) {
        C22632.m50634(this.f44536 == interfaceC1837 || this.f44537 == interfaceC1837);
        if (m34687(interfaceC1837)) {
            c14101.m33716(interfaceC1837);
            if (interfaceC1837.getState() == 2) {
                interfaceC1837.stop();
            }
            interfaceC1837.mo6102();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34701(C17071 c17071, long j) {
        InterfaceC1837 m34689 = m34689(c17071);
        if (m34689 != null) {
            m34689.mo6087(j);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m34710() {
        if (!m34687(this.f44536)) {
            m34686(true);
        }
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 == null || interfaceC1837.getState() != 0) {
            return;
        }
        m34686(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34686(boolean z) {
        if (z) {
            if (this.f44538) {
                this.f44536.reset();
                this.f44538 = false;
                return;
            }
            return;
        }
        if (this.f44535) {
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            interfaceC1837.reset();
            this.f44535 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34690(C17071 c17071, C1263 c1263, C14101 c14101) {
        int m34683 = m34683(this.f44536, c17071, c1263, c14101);
        return m34683 == 1 ? m34683(this.f44537, c17071, c1263, c14101) : m34683;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m34683(InterfaceC1837 interfaceC1837, C17071 c17071, C1263 c1263, C14101 c14101) {
        InterfaceC1837 interfaceC18372;
        int i;
        InterfaceC18882[] interfaceC18882Arr = c17071.f52335;
        if (interfaceC1837 == null || interfaceC1837.getState() == 0 || (interfaceC1837 == (interfaceC18372 = this.f44536) && ((i = this.f44534) == 2 || i == 4))) {
            return 1;
        }
        if (interfaceC1837 == this.f44537 && this.f44534 == 3) {
            return 1;
        }
        InterfaceC18882 mo6099 = interfaceC1837.mo6099();
        int i2 = this.f44533;
        boolean z = mo6099 != interfaceC18882Arr[i2];
        boolean m4319 = c1263.m4319(i2);
        if (!m4319 || z) {
            if (!interfaceC1837.mo6100()) {
                InterfaceC9731 interfaceC9731 = c1263.f4478[i2];
                int length = interfaceC9731 != null ? interfaceC9731.length() : 0;
                C8353[] c8353Arr = new C8353[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC9731.getClass();
                    c8353Arr[i3] = interfaceC9731.mo2377(i3);
                }
                InterfaceC18882 interfaceC18882 = interfaceC18882Arr[i2];
                interfaceC18882.getClass();
                interfaceC1837.mo6091(c8353Arr, interfaceC18882, c17071.m40074(), c17071.m40071(), c17071.f52336.f42930);
                return 3;
            }
            if (!interfaceC1837.mo6098()) {
                return 0;
            }
            m34685(interfaceC1837, c14101);
            if (!m4319 || m34716()) {
                m34686(interfaceC1837 == interfaceC18372);
                return 1;
            }
        }
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34702(C17359 c17359, InterfaceC9731 interfaceC9731, InterfaceC18882 interfaceC18882, long j, boolean z, boolean z2, long j2, long j3, C15894 c15894, C14101 c14101) {
        int length = interfaceC9731 != null ? interfaceC9731.length() : 0;
        C8353[] c8353Arr = new C8353[length];
        for (int i = 0; i < length; i++) {
            interfaceC9731.getClass();
            c8353Arr[i] = interfaceC9731.mo2377(i);
        }
        int i2 = this.f44534;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.f44538 = true;
            this.f44536.mo6090(c17359, c8353Arr, interfaceC18882, z, z2, j2, j3, c15894);
            c14101.m33718(this.f44536);
        } else {
            this.f44535 = true;
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            interfaceC1837.mo6090(c17359, c8353Arr, interfaceC18882, z, z2, j2, j3, c15894);
            c14101.m33718(interfaceC1837);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34725() {
        this.f44536.mo6084();
        this.f44538 = false;
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6084();
            this.f44535 = false;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m34727() {
        int i = this.f44534;
        if (i != 0 && i != 2 && i != 4) {
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            return interfaceC1837.getState() != 0;
        }
        return m34687(this.f44536);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34687(InterfaceC1837 interfaceC1837) {
        return interfaceC1837.getState() != 0;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private InterfaceC1837 m34689(C17071 c17071) {
        if (c17071 == null) {
            return null;
        }
        InterfaceC18882[] interfaceC18882Arr = c17071.f52335;
        int i = this.f44533;
        if (interfaceC18882Arr[i] == null) {
            return null;
        }
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6099() == interfaceC18882Arr[i]) {
            return interfaceC1837;
        }
        InterfaceC1837 interfaceC18372 = this.f44537;
        if (interfaceC18372 == null || interfaceC18372.mo6099() != interfaceC18882Arr[i]) {
            return null;
        }
        return interfaceC18372;
    }
}
