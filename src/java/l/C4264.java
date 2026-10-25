package l;

import java.util.Iterator;

/* compiled from: KARX */
/* renamed from: l.ۘ᩻֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4264 extends AbstractC11753 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2853 f13801;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f13802;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f13803;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5883[] f13804;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13805;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC23747 f13806;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13807;

    @Override // l.AbstractC11753
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12834() {
        C2853 c2853 = this.f13801;
        c2853.f9108 = -1;
        c2853.f9109 = 0;
        c2853.f9106 = -1;
        c2853.f9107 = null;
        this.f13802 = -1;
        this.f13803 = 1;
        this.f13805 = 0;
        this.f13807 = 0;
    }

    public C4264(AbstractC23747 abstractC23747, C21631 c21631, C5883[] c5883Arr, C17878 c17878) {
        super(c21631, c17878);
        this.f13802 = -1;
        this.f13803 = 1;
        this.f13805 = 0;
        this.f13807 = 0;
        C2853 c2853 = new C2853();
        c2853.f9108 = -1;
        c2853.f9109 = 0;
        c2853.f9106 = -1;
        this.f13801 = c2853;
        this.f13804 = c5883Arr;
        this.f13806 = abstractC23747;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12831(InterfaceC23125 interfaceC23125, int i) {
        this.f13807 = i;
        int mo6200 = interfaceC23125.mo6200();
        try {
            this.f13802 = interfaceC23125.index();
            C2853 c2853 = this.f13801;
            c2853.f9108 = -1;
            c2853.f9109 = 0;
            c2853.f9106 = -1;
            c2853.f9107 = null;
            C5883 c5883 = this.f13804[i];
            if (c5883.f18066 == null) {
                return m12842(interfaceC23125);
            }
            return m12832(interfaceC23125, c5883.f18066);
        } finally {
            interfaceC23125.mo6207(mo6200);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12842(InterfaceC23125 interfaceC23125) {
        AbstractC23041 abstractC23041 = (AbstractC23041) this.f35089.f69447.get(this.f13807);
        C21198 c21198 = C21198.f68319;
        C6380 c6380 = new C6380();
        int i = 0;
        while (i < abstractC23041.f74151.size()) {
            int i2 = i + 1;
            m12837(interfaceC23125, new C16257(abstractC23041.m51211(i).f38806, i2, c21198), c6380, false, false, false);
            i = i2;
        }
        boolean z = c6380.f39356;
        c6380.f39356 = false;
        C13643 m12833 = m12833(c6380);
        if (!z) {
            this.f13804[this.f13807].f18066 = m12833;
        }
        return m12832(interfaceC23125, m12833);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12832(InterfaceC23125 interfaceC23125, C13643 c13643) {
        C13643 m12833;
        int i;
        int i2;
        AbstractC23041 abstractC23041;
        C22336 c22336;
        boolean z = c13643.f40687;
        C2853 c2853 = this.f13801;
        if (z) {
            c2853.f9108 = interfaceC23125.index();
            c2853.f9109 = this.f13803;
            c2853.f9106 = this.f13805;
            c2853.f9107 = c13643;
        }
        C13643 c136432 = c13643;
        int mo6203 = interfaceC23125.mo6203(1);
        C4264 c4264 = this;
        InterfaceC23125 interfaceC231252 = interfaceC23125;
        while (true) {
            C13643[] c13643Arr = c136432.f40685;
            C13643 c136433 = (c13643Arr == null || mo6203 < 0 || mo6203 > 127) ? null : c13643Arr[mo6203];
            C13643 c136434 = AbstractC11753.f35088;
            if (c136433 == null) {
                C6380 c6380 = new C6380();
                Iterator it = c136432.f40683.f39354.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    C22336 c223362 = (C22336) it.next();
                    int i4 = c223362.f72390;
                    AbstractC23041 abstractC230412 = c223362.f72393;
                    boolean z2 = i4 == i3;
                    if (!z2 || !((C16257) c223362).m38231()) {
                        int size = abstractC230412.f74151.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                break;
                            }
                            AbstractC12938 m51211 = abstractC230412.m51211(i5);
                            InterfaceC23125 interfaceC231253 = interfaceC231252;
                            AbstractC23041 abstractC230413 = m51211.mo3364(mo6203, 1114111) ? m51211.f38806 : null;
                            if (abstractC230413 != null) {
                                C16257 c16257 = (C16257) c223362;
                                i = i5;
                                C19787 m38229 = c16257.m38229();
                                if (m38229 != null) {
                                    m38229 = m38229.m45483(interfaceC23125.index() - c4264.f13802);
                                }
                                i2 = size;
                                abstractC23041 = abstractC230412;
                                c22336 = c223362;
                                if (m12837(interfaceC23125, new C16257(c16257, abstractC230413, m38229), c6380, z2, true, mo6203 == -1)) {
                                    i3 = c22336.f72390;
                                    interfaceC231252 = interfaceC23125;
                                    c4264 = this;
                                    break;
                                }
                                c4264 = this;
                                interfaceC231252 = interfaceC23125;
                            } else {
                                i = i5;
                                i2 = size;
                                abstractC23041 = abstractC230412;
                                c22336 = c223362;
                                interfaceC231252 = interfaceC231253;
                            }
                            i5 = i + 1;
                            c223362 = c22336;
                            size = i2;
                            abstractC230412 = abstractC23041;
                        }
                    }
                }
                if (c6380.f39354.isEmpty()) {
                    if (!c6380.f39356) {
                        m12830(c136432, mo6203, c136434);
                    }
                    m12833 = c136434;
                } else {
                    boolean z3 = c6380.f39356;
                    c6380.f39356 = false;
                    m12833 = c4264.m12833(c6380);
                    if (!z3) {
                        m12830(c136432, mo6203, m12833);
                    }
                }
                c136432 = m12833;
            } else {
                c136432 = c136433;
            }
            if (c136432 == c136434) {
                break;
            }
            if (mo6203 != -1) {
                m12836(interfaceC23125);
            }
            if (c136432.f40687) {
                c2853.f9108 = interfaceC231252.index();
                c2853.f9109 = c4264.f13803;
                c2853.f9106 = c4264.f13805;
                c2853.f9107 = c136432;
                if (mo6203 == -1) {
                    break;
                }
            }
            mo6203 = interfaceC231252.mo6203(1);
        }
        C13643 c136435 = c2853.f9107;
        AbstractC23747 abstractC23747 = c4264.f13806;
        if (c136435 != null) {
            C19787 c19787 = c136435.f40689;
            int i6 = c4264.f13802;
            int i7 = c2853.f9108;
            int i8 = c2853.f9109;
            int i9 = c2853.f9106;
            interfaceC231252.mo6201(i7);
            c4264.f13803 = i8;
            c4264.f13805 = i9;
            if (c19787 != null) {
                c19787.m45484(abstractC23747, interfaceC231252, i6);
            }
            return c2853.f9107.f40686;
        }
        if (mo6203 == -1 && interfaceC231252.index() == c4264.f13802) {
            return -1;
        }
        throw new C6814(abstractC23747, interfaceC231252, c4264.f13802);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩵ܳ֡] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ᩴܳ֡, l.᩻ܳ֡] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m12837(l.InterfaceC23125 r17, l.C16257 r18, l.C6380 r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4264.m12837(l.᩺ܿ֡, l.ܺ᩻֡, l.ۛ᩻֡, boolean, boolean, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12830(C13643 c13643, int i, C13643 c136432) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c13643) {
            if (c13643.f40685 == null) {
                c13643.f40685 = new C13643[128];
            }
            c13643.f40685[i] = c136432;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 m12833(C6380 c6380) {
        C22336 c22336;
        C13643 c13643 = new C13643(c6380);
        Iterator it = c6380.f39354.iterator();
        while (true) {
            if (!it.hasNext()) {
                c22336 = null;
                break;
            }
            c22336 = (C22336) it.next();
            if (c22336.f72393 instanceof C9412) {
                break;
            }
        }
        if (c22336 != null) {
            c13643.f40687 = true;
            c13643.f40689 = ((C16257) c22336).m38229();
            c13643.f40686 = this.f35089.f69443[c22336.f72393.f74154];
        }
        C5883 c5883 = this.f13804[this.f13807];
        synchronized (c5883.f18065) {
            C13643 c136432 = (C13643) c5883.f18065.get(c13643);
            if (c136432 != null) {
                return c136432;
            }
            c13643.f40684 = c5883.f18065.size();
            c6380.m31897();
            c13643.f40683 = c6380;
            c5883.f18065.put(c13643, c13643);
            return c13643;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12839(InterfaceC23125 interfaceC23125) {
        return interfaceC23125.mo12025(C14763.m35067(this.f13802, interfaceC23125.index() - 1));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12841() {
        return this.f13803;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12840(int i) {
        this.f13803 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12838() {
        return this.f13805;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12835(int i) {
        this.f13805 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12836(InterfaceC23125 interfaceC23125) {
        if (interfaceC23125.mo6203(1) == 10) {
            this.f13803++;
            this.f13805 = 0;
        } else {
            this.f13805++;
        }
        interfaceC23125.mo6204();
    }
}
