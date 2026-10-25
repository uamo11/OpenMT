package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: 8BBR */
/* renamed from: l.ۖܽܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2656 implements InterfaceC20295 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f8350;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8300[] f8351;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21064[] f8352;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f8353;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8354;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3361 f8355;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f8356;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r6 = l.C13573.m32623(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r6 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        l.C13573.m32620(r6, r4);
        r1.m13940(r6, r0);
        r0.f8354 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6 >= r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r7 = r15.m40991get(r6);
        r9 = r7.m4089();
        r10 = r7.m4085();
        r11 = l.C13573.m32623(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r11 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r11 >= r10) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        l.C13573.m32627(r9, r5);
        l.C13573.m32627(r10, r5);
        r0.m8324(r7.m4088(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1.getClass();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5478 m8322(l.C3361 r15) {
        /*
            l.ۖܽܺ r0 = new l.ۖܽܺ
            r0.<init>(r15)
            l.ۙܽܺ r1 = r15.m10270()
            l.۠ܽܺ r15 = r15.m10271()
            int r2 = r15.size()
            r3 = 0
            int[] r4 = r0.f8356
            l.C13573.m32627(r3, r4)
            int[] r5 = r0.f8350
            l.C13573.m32627(r3, r5)
        L1c:
            int r6 = r4.length
            r7 = 0
        L1e:
            int[] r8 = r0.f8353
            if (r7 >= r6) goto L6c
            r9 = r4[r7]
            if (r9 == 0) goto L69
            r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L60
        L29:
            int r6 = l.C13573.m32623(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L60
            if (r6 >= 0) goto L57
            r6 = 0
        L30:
            if (r6 >= r2) goto L1c
            l.֨ܽܺ r7 = r15.m40991get(r6)
            int r9 = r7.m4089()
            int r10 = r7.m4085()
            int r11 = l.C13573.m32623(r9, r8)
            if (r11 < 0) goto L54
            if (r11 >= r10) goto L54
            l.C13573.m32627(r9, r5)
            l.C13573.m32627(r10, r5)
            int r7 = r7.m4088()
            r9 = 1
            r0.m8324(r7, r9)
        L54:
            int r6 = r6 + 1
            goto L30
        L57:
            l.C13573.m32620(r6, r4)     // Catch: java.lang.IllegalArgumentException -> L60
            r1.m13940(r6, r0)     // Catch: java.lang.IllegalArgumentException -> L60
            r0.f8354 = r6     // Catch: java.lang.IllegalArgumentException -> L60
            goto L29
        L60:
            r15 = move-exception
            l.ۖᩳܺ r0 = new l.ۖᩳܺ
            java.lang.String r1 = "flow of control falls off end of method"
            r0.<init>(r1, r15)
            throw r0
        L69:
            int r7 = r7 + 1
            goto L1e
        L6c:
            l.ۗܽܺ r15 = r0.f8355
            l.ۙܽܺ r15 = r15.m10270()
            int r15 = r15.m13941()
            l.֡ܽܺ[] r15 = new l.C0538[r15]
            r1 = 0
            r2 = 0
            r11 = 0
        L7b:
            int r2 = r11 + 1
            int r2 = l.C13573.m32623(r2, r5)
            if (r2 >= 0) goto L93
            l.ۚܽܺ r0 = new l.ۚܽܺ
            r0.<init>(r1)
        L88:
            if (r3 >= r1) goto L92
            r2 = r15[r3]
            r0.m38024(r3, r2)
            int r3 = r3 + 1
            goto L88
        L92:
            return r0
        L93:
            boolean r4 = l.C13573.m32626(r11, r8)
            if (r4 == 0) goto Lca
            int r4 = r2 + (-1)
            r6 = 0
        L9c:
            if (r4 < r11) goto La8
            l.᩷ᩴܺ[] r6 = r0.f8352
            r6 = r6[r4]
            if (r6 == 0) goto La5
            goto La9
        La5:
            int r4 = r4 + (-1)
            goto L9c
        La8:
            r4 = -1
        La9:
            if (r6 != 0) goto Lb4
            l.᩷ᩴܺ r4 = l.C21064.m47910(r2)
            l.۠ܽܺ r6 = l.C8300.f25495
            r13 = r4
            r14 = r6
            goto Lbe
        Lb4:
            l.۠ܽܺ[] r7 = r0.f8351
            r4 = r7[r4]
            if (r4 != 0) goto Lbc
            l.۠ܽܺ r4 = l.C8300.f25495
        Lbc:
            r14 = r4
            r13 = r6
        Lbe:
            l.֡ܽܺ r4 = new l.֡ܽܺ
            r9 = r4
            r10 = r11
            r12 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r15[r1] = r4
            int r1 = r1 + 1
        Lca:
            r11 = r2
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2656.m8322(l.ۗܽܺ):l.ۚܽܺ");
    }

    public C2656(C3361 c3361) {
        this.f8355 = c3361;
        int m13941 = c3361.m10270().m13941() + 1;
        this.f8356 = C13573.m32622(m13941);
        this.f8353 = C13573.m32622(m13941);
        this.f8350 = C13573.m32622(m13941);
        this.f8352 = new C21064[m13941];
        this.f8351 = new C8300[m13941];
        this.f8354 = -1;
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8327(int i, int i2) {
        m8323(i2, 1, true);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8331(int i, int i2, C7573 c7573) {
        if (i == 108 || i == 112) {
            m8323(i2, 1, true);
            if (c7573 == C7573.f23413 || c7573 == C7573.f23418) {
                m8325(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m8323(i2, 1, false);
            this.f8352[i2] = C21064.f67936;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m8323(i2, 1, false);
                m8325(i2, 1, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        break;
                    default:
                        switch (i) {
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            case 84:
                            case 85:
                            case HRSS1373Polynomial.K /* 86 */:
                                break;
                            default:
                                m8323(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m8323(i2, 1, true);
        m8325(i2, 1, true);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8329(int i, int i2, int i3, int i4, C7573 c7573, int i5) {
        if (i == 169) {
            m8323(i2, i3, false);
            this.f8352[i2] = C21064.f67936;
        } else {
            m8323(i2, i3, true);
        }
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8330(int i, int i2, int i3, AbstractC13717 abstractC13717, int i4) {
        m8323(i2, i3, true);
        if ((abstractC13717 instanceof AbstractC15333) || (abstractC13717 instanceof C12512) || (abstractC13717 instanceof C13217) || (abstractC13717 instanceof C18863) || (abstractC13717 instanceof C21685) || (abstractC13717 instanceof C4751)) {
            m8325(i2, i3, true);
        }
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8328(int i, int i2, int i3, int i4) {
        C21064[] c21064Arr = this.f8352;
        if (i == 167) {
            m8323(i2, i3, false);
            c21064Arr[i2] = C21064.m47910(i4);
        } else {
            if (i == 168) {
                m8324(i2, true);
            }
            int i5 = i2 + i3;
            m8323(i2, i3, true);
            m8324(i5, true);
            C21064 c21064 = new C21064(2);
            c21064.add(i5);
            c21064.add(i4);
            c21064.mo20349();
            c21064Arr[i2] = c21064;
        }
        m8324(i4, true);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8333(int i, int i2, C19632 c19632, int i3) {
        m8323(i, i2, false);
        m8324(c19632.m45145(), true);
        int size = c19632.size();
        for (int i4 = 0; i4 < size; i4++) {
            m8324(c19632.m45144(i4), true);
        }
        this.f8352[i] = c19632.m45143();
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8332(int i, int i2, C12512 c12512, ArrayList arrayList) {
        m8323(i, i2, true);
        m8325(i, i2, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8324(int i, boolean z) {
        if (!C13573.m32626(i, this.f8353)) {
            C13573.m32627(i, this.f8356);
        }
        if (z) {
            C13573.m32627(i, this.f8350);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8323(int i, int i2, boolean z) {
        C13573.m32627(i, this.f8353);
        if (z) {
            m8324(i + i2, false);
        } else {
            C13573.m32627(i + i2, this.f8350);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8325(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            m8324(i3, true);
        }
        C8300 m21903 = this.f8355.m10271().m21903(i);
        this.f8351[i] = m21903;
        if (!z) {
            i3 = -1;
        }
        this.f8352[i] = m21903.m21902(i3);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8326() {
        return this.f8354;
    }
}
