package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: 5BHG */
/* renamed from: l.ۡᩳܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9048 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5478 f27432;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21043[] f27433;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f27434;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3361 f27435;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18926 f27436;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27437;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17514[] f27438;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f27439;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12533[] f27440;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23864 f27441;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16102 f27442;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f27443;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f27444;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f27445;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m23347(C3361 c3361, C18199 c18199, C9733 c9733) {
        try {
            C9048 c9048 = new C9048(c3361, c18199, c9733);
            c9048.m23360();
            ArrayList arrayList = c9048.f27444;
            int size = arrayList.size();
            C17246 c17246 = new C17246(size);
            for (int i = 0; i < size; i++) {
                c17246.m40531(i, (C16540) arrayList.get(i));
            }
            c17246.mo20349();
            return new C13012(c17246, c9048.m23346(-1));
        } catch (C2698 e) {
            e.m21602("...while working on method " + c3361.mo10264().mo2463());
            throw e;
        }
    }

    public C9048(C3361 c3361, C18199 c18199, C9733 c9733) {
        this.f27435 = c3361;
        C5478 m8322 = C2656.m8322(c3361);
        this.f27432 = m8322;
        int m38023 = m8322.m38023();
        this.f27439 = m38023;
        int m10266 = c3361.m10266();
        this.f27445 = m10266;
        C16102 c16102 = new C16102(this, c3361, c18199);
        this.f27442 = c16102;
        this.f27436 = new C18926(c16102, c3361, c9733);
        C12533[] c12533Arr = new C12533[m38023];
        this.f27440 = c12533Arr;
        this.f27433 = new C21043[m38023];
        this.f27444 = new ArrayList((m8322.size() * 2) + 10);
        this.f27437 = new ArrayList((m8322.size() * 2) + 10);
        this.f27438 = new C17514[m38023];
        this.f27434 = false;
        c12533Arr[0] = new C12533(m10266, c3361.m10265());
        C23864 c23864 = new C23864(m38023);
        c23864.f77187 = c3361.m10271().size() + m38023;
        this.f27441 = c23864;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m23346(int i) {
        return this.f27435.m10271().size() + this.f27439 + (~i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23362() {
        int size = this.f27435.m10271().size() + this.f27439 + 7;
        Iterator it = this.f27444.iterator();
        while (it.hasNext()) {
            int mo2269 = ((C16540) it.next()).mo2269();
            if (mo2269 >= size) {
                size = mo2269 + 1;
            }
        }
        return size;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23366(int i) {
        int size = this.f27435.m10271().size() + this.f27439 + 7;
        ArrayList arrayList = this.f27444;
        C21064 m38911 = ((C16540) arrayList.get(i)).m38911();
        int size2 = m38911.size();
        arrayList.remove(i);
        this.f27437.remove(i);
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = m38911.get(i2);
            if (i3 >= size) {
                int m23363 = m23363(i3);
                if (m23363 < 0) {
                    throw new RuntimeException("Invalid label ".concat(C14712.m35006(i3)));
                }
                m23366(m23363);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m23365() {
        return (this.f27435.mo10269() & 32) != 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m23367() {
        return (this.f27435.mo10269() & 8) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23368() {
        int m10265 = this.f27435.m10265() + this.f27445;
        return m23365() ? m10265 + 1 : m10265;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23363(int i) {
        ArrayList arrayList = this.f27444;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C16540) arrayList.get(i2)).mo2269() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16540 m23358(int i) {
        int m23363 = m23363(i);
        if (m23363 < 0) {
            throw new IllegalArgumentException("no such label ".concat(C14712.m35006(i)));
        }
        return (C16540) this.f27444.get(m23363);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23355(C16540 c16540, C21064 c21064) {
        this.f27444.add(c16540);
        c21064.m43732();
        this.f27437.add(c21064);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23361(C9048 c9048, C16540 c16540, C21064 c21064) {
        ArrayList arrayList = c9048.f27437;
        ArrayList arrayList2 = c9048.f27444;
        int m23363 = c9048.m23363(c16540.mo2269());
        if (m23363 >= 0) {
            arrayList2.remove(m23363);
            arrayList.remove(m23363);
        }
        arrayList2.add(c16540);
        c21064.m43732();
        arrayList.add(c21064);
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.String, l.᩸ۡܺ] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23360() {
        int i;
        int[] iArr;
        int i2;
        ?? r6;
        char c;
        int i3;
        int i4;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2430 c2430;
        boolean z;
        int i5 = this.f27439;
        int[] m32622 = C13573.m32622(i5);
        int i6 = 0;
        C13573.m32627(0, m32622);
        C3361 c3361 = this.f27435;
        C23116 m10272 = c3361.m10272();
        C10191 m10261 = c3361.m10261(0);
        C13922 m51259 = c3361.mo10262().m51259();
        int size = m51259.size();
        C2430 c24302 = new C2430(size + 1);
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C7573 m40995get = m51259.m40995get(i7);
            C11828 m51308 = m10272.m51308(i6, i8);
            C23116 c23116 = m10272;
            int i9 = i7;
            c24302.m40986(i9, (AbstractC15834) new C5252(C12307.m29861(m40995get), m10261, m51308 == null ? C21480.m48631(i8, m40995get) : C21480.m48636(i8, m40995get, m51308.m28913()), C20069.f65002, C2635.m8291(i8)));
            i8 = m40995get.m20314() + i8;
            i7 = i9 + 1;
            m10272 = c23116;
            i6 = 0;
        }
        C3135 c3135 = C12307.f36802;
        C20069 c20069 = C20069.f65002;
        c24302.m40986(size, (AbstractC15834) new C1018(c3135, m10261, (C21480) null, c20069));
        c24302.mo20349();
        boolean m23365 = m23365();
        int m23346 = m23365 ? m23346(-4) : 0;
        C16540 c16540 = new C16540(m23346(-1), c24302, C21064.m47910(m23346), m23346);
        C21064 c21064 = C21064.f67936;
        m23355(c16540, c21064);
        int i10 = this.f27445;
        if (m23365) {
            int m10265 = c3361.m10265() + i10;
            if (m10265 < 1) {
                m10265 = 1;
            }
            C21480 m48631 = C21480.m48631(m10265, C7573.f23412);
            if (m23367()) {
                i = i5;
                i2 = i10;
                C11602 c11602 = new C11602(C12307.f36697, m10261, c20069, C13922.f41594, c3361.mo10267());
                C2430 c24303 = new C2430(1);
                c24303.m40986(0, (AbstractC15834) c11602);
                iArr = m32622;
                c2430 = c24303;
                z = false;
                i3 = 1;
            } else {
                i = i5;
                i2 = i10;
                iArr = m32622;
                c2430 = new C2430(2);
                c2430.m40986(0, (AbstractC15834) new C5252(C12307.f36803, m10261, m48631, c20069, C2635.f8323));
                z = false;
                i3 = 1;
                c2430.m40986(1, (AbstractC15834) new C1018(c3135, m10261, (C21480) null, c20069));
            }
            int m233462 = m23346(-5);
            c2430.mo20349();
            m23355(new C16540(m23346, c2430, C21064.m47910(m233462), m233462), c21064);
            C2430 c24304 = new C2430(m23367() ? 2 : 1);
            if (m23367()) {
                c24304.m40986(0, (AbstractC15834) new C1018(C12307.m29863(m48631), m10261, m48631, c20069));
            }
            c24304.m40986(m23367() ? 1 : 0, (AbstractC15834) new C22890(C12307.f36797, m10261, C20069.m46252(m48631), C13922.f41594));
            c24304.mo20349();
            c = 0;
            m23355(new C16540(m233462, c24304, C21064.m47910(0), 0), c21064);
            r6 = z;
        } else {
            i = i5;
            iArr = m32622;
            i2 = i10;
            r6 = 0;
            c = 0;
            i3 = 1;
        }
        C23095 mo10262 = c3361.mo10262();
        C12533[] c12533Arr = this.f27440;
        c12533Arr[c].m30749(mo10262.m51259());
        c12533Arr[c].m30753();
        int[] iArr2 = iArr;
        int i11 = 0;
        while (true) {
            int m32623 = C13573.m32623(i11, iArr2);
            if (m32623 < 0) {
                break;
            }
            int i12 = i;
            int i13 = i2;
            C13573.m32620(m32623, iArr2);
            try {
                m23351(this.f27432.m15579(m32623), c12533Arr[m32623], iArr2);
                i11 = 0;
                i3 = 1;
                i = i12;
                i2 = i13;
            } catch (C2698 e) {
                e.m21602("...while working on block ".concat(C14712.m35006(m32623)));
                throw e;
            }
        }
        C16102 c16102 = this.f27442;
        C3135 m38008 = c16102.m38008();
        if (m38008 == null) {
            i4 = i2;
        } else {
            C10191 m37997 = c16102.m37997();
            int m233463 = m23346(-2);
            if (m23365()) {
                C2430 c24305 = new C2430(i3);
                C3135 c31352 = C12307.f36791;
                i4 = i2;
                int m102652 = c3361.m10265() + i4;
                if (m102652 < i3) {
                    m102652 = 1;
                }
                c24305.m40986(i11, (AbstractC15834) new C22890(c31352, m37997, C20069.m46252(C21480.m48631(m102652, C7573.f23412)), C13922.f41594));
                c24305.mo20349();
                int m233464 = m23346(-3);
                m23355(new C16540(m233463, c24305, C21064.m47910(m233464), m233464), C21064.f67936);
                m233463 = m233464;
            } else {
                i4 = i2;
            }
            C2430 c24306 = new C2430(i3);
            InterfaceC10711 m9559 = m38008.m9559();
            c24306.m40986(i11, (AbstractC15834) new C1018(m38008, m37997, (C21480) r6, m9559.size() == 0 ? C20069.f65002 : C20069.m46252(C21480.m48631(i11, m9559.getType(i11)))));
            c24306.mo20349();
            C21064 c210642 = C21064.f67936;
            m23355(new C16540(m233463, c24306, c210642, -1), c210642);
        }
        if (this.f27434) {
            C10191 m102612 = c3361.m10261(i11);
            C7573 c7573 = C7573.f23403;
            C21480 m486312 = C21480.m48631(i11, c7573);
            C2430 c24307 = new C2430(2);
            c7573.getClass();
            C13922 c13922 = C13922.f41594;
            c24307.m40986(i11, (AbstractC15834) new C1018(new C3135(4, c7573, c13922, r6), m102612, m486312, C20069.f65002));
            C3135 c31353 = C12307.f36791;
            int m102653 = c3361.m10265() + i4;
            if (m102653 < i3) {
                m102653 = 1;
            }
            c24307.m40986(i3, (AbstractC15834) new C22890(c31353, m102612, C20069.m46252(C21480.m48631(m102653, C7573.f23412)), c13922));
            c24307.mo20349();
            int m233465 = m23346(-7);
            C16540 c165402 = new C16540(m23346(-6), c24307, C21064.m47910(m233465), m233465);
            C21064 c210643 = C21064.f67936;
            m23355(c165402, c210643);
            C2430 c24308 = new C2430(i3);
            c24308.m40986(i11, (AbstractC15834) new C22890(C12307.f36670, m102612, C20069.m46252(m486312), c13922));
            c24308.mo20349();
            m23355(new C16540(m233465, c24308, c210643, -1), c210643);
        }
        C17514[] c17514Arr = this.f27438;
        int length = c17514Arr.length;
        for (int i14 = 0; i14 < length; i14++) {
            C17514 c17514 = c17514Arr[i14];
            if (c17514 != null) {
                for (C14691 c14691 : c17514.m40927()) {
                    C10191 m37480 = m23358(i14).m38914().m37480();
                    C2430 c24309 = new C2430(2);
                    C7573 m34988 = c14691.m34988();
                    m34988.getClass();
                    C3135 c31354 = new C3135(4, m34988, C13922.f41594, r6);
                    C21480 m486313 = C21480.m48631(i4, c14691.m34988());
                    C20069 c200692 = C20069.f65002;
                    c24309.m40986(0, (AbstractC15834) new C1018(c31354, m37480, m486313, c200692));
                    c24309.m40986(1, (AbstractC15834) new C1018(C12307.f36802, m37480, (C21480) r6, c200692));
                    c24309.mo20349();
                    m23355(new C16540(c14691.m34989(), c24309, C21064.m47910(i14), i14), c12533Arr[i14].m30754());
                }
            }
        }
        if (!this.f27443) {
            return;
        }
        C21064 c210644 = new C21064(4);
        int i15 = i;
        m23354(m23358(0), new C16808(this, c210644), new BitSet(i15));
        int m23362 = m23362();
        ArrayList arrayList3 = new ArrayList(m23362);
        for (int i16 = 0; i16 < m23362; i16++) {
            arrayList3.add(r6);
        }
        int i17 = 0;
        while (true) {
            arrayList = this.f27444;
            int size2 = arrayList.size();
            arrayList2 = this.f27437;
            if (i17 >= size2) {
                break;
            }
            C16540 c165403 = (C16540) arrayList.get(i17);
            if (c165403 != null) {
                arrayList3.set(c165403.mo2269(), (C21064) arrayList2.get(i17));
            }
            i17++;
        }
        int size3 = c210644.size();
        for (int i18 = 0; i18 < size3; i18++) {
            new C9754(this, new C6931(m23362()), arrayList3).m24734(m23358(c210644.get(i18)));
        }
        C21064 c210645 = new C21064(arrayList.size());
        arrayList2.clear();
        m23354(m23358(m23346(-1)), new C18220(c210645), new BitSet(i15));
        c210645.m47914();
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            int m47912 = c210645.m47912(((C16540) arrayList.get(size4)).mo2269());
            if (m47912 < 0) {
                m47912 = -1;
            }
            if (m47912 < 0) {
                arrayList.remove(size4);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23351(C0538 c0538, C12533 c12533, int[] iArr) {
        int i;
        C21043 c21043;
        int i2;
        C21064 c21064;
        int i3;
        int i4;
        C10191 m37480;
        C21064 c210642;
        C8300 m2270 = c0538.m2270();
        C13922 m21900 = m2270.m21900();
        C16102 c16102 = this.f27442;
        c16102.m37999(m21900);
        C12533 m30742 = c12533.m30742();
        this.f27436.m43681(c0538, m30742);
        m30742.m30753();
        int m38006 = c16102.m38006();
        ArrayList m38000 = c16102.m38000();
        int size = m38000.size();
        int size2 = m2270.size();
        C21064 m2272 = c0538.m2272();
        boolean m38002 = c16102.m38002();
        C21043[] c21043Arr = this.f27433;
        if (m38002) {
            int i5 = m2272.get(1);
            if (c21043Arr[i5] == null) {
                c21043Arr[i5] = new C21043(this, i5);
            }
            c21043Arr[i5].m47879(c0538.mo2269());
            c21043 = c21043Arr[i5];
            i = 1;
        } else {
            if (c16102.m37998()) {
                int m27690 = c16102.m38007().m27690();
                C21043 c210432 = c21043Arr[m27690];
                if (c210432 == null) {
                    int mo2269 = c0538.mo2269();
                    C21043 c210433 = new C21043(this, m27690);
                    c210433.m47882(mo2269);
                    c21043Arr[m27690] = c210433;
                } else {
                    c210432.m47882(c0538.mo2269());
                }
                C21064 m47881 = c21043Arr[m27690].m47881();
                c21043Arr[m27690].m47880(m30742, iArr);
                i = m47881.size();
                m2272 = m47881;
            } else {
                i = c16102.m38005() ? size2 : 0;
            }
            c21043 = null;
        }
        C21064 c210643 = m2272;
        C21043 c210434 = c21043;
        int size3 = c210643.size();
        int i6 = i;
        while (i6 < size3) {
            int i7 = c210643.get(i6);
            try {
                int i8 = i6;
                int i9 = size3;
                C21064 c210644 = c210643;
                m23350(i7, c0538.mo2269(), c210434, m30742, iArr);
                i6 = i8 + 1;
                size3 = i9;
                c210643 = c210644;
            } catch (C2698 e) {
                e.m21602("...while merging to block ".concat(C14712.m35006(i7)));
                throw e;
            }
        }
        int i10 = size3;
        C21064 c210645 = c210643;
        if (i10 == 0 && c16102.m38003()) {
            c21064 = C21064.m47910(m23346(-2));
            i2 = 1;
        } else {
            i2 = i10;
            c21064 = c210645;
        }
        if (i2 == 0) {
            i3 = -1;
        } else {
            int m38001 = c16102.m38001();
            if (m38001 >= 0) {
                m38001 = c21064.get(m38001);
            }
            i3 = m38001;
        }
        boolean z = m23365() && c16102.m38004();
        if (z || size2 != 0) {
            C21064 c210646 = new C21064(i2);
            boolean z2 = false;
            int i11 = 0;
            while (i11 < size2) {
                C1244 m40991get = m2270.m40991get(i11);
                C12512 m4087 = m40991get.m4087();
                int m4088 = m40991get.m4088();
                boolean z3 = (m4087 == C12512.f37597) | z2;
                try {
                    C8300 c8300 = m2270;
                    int i12 = i3;
                    int i13 = i11;
                    C21064 c210647 = c210646;
                    m23350(m4088, c0538.mo2269(), null, m30742.m30744(m4087), iArr);
                    C17514[] c17514Arr = this.f27438;
                    C17514 c17514 = c17514Arr[m4088];
                    if (c17514 == null) {
                        c17514 = new C17514(this);
                        c17514Arr[m4088] = c17514;
                    }
                    c210647.add(c17514.m40928(m4087.m30696()).m34989());
                    i11 = i13 + 1;
                    i3 = i12;
                    c210646 = c210647;
                    z2 = z3;
                    m2270 = c8300;
                } catch (C2698 e2) {
                    e2.m21602("...while merging exception to block ".concat(C14712.m35006(m4088)));
                    throw e2;
                }
            }
            i4 = i3;
            C21064 c210648 = c210646;
            if (z && !z2) {
                c210648.add(m23346(-6));
                this.f27434 = true;
                for (int i14 = (size - m38006) - 1; i14 < size; i14++) {
                    AbstractC15834 abstractC15834 = (AbstractC15834) m38000.get(i14);
                    if (abstractC15834.m37481()) {
                        m38000.set(i14, abstractC15834.mo3529(C7573.f23412));
                    }
                }
            }
            if (i4 >= 0) {
                c210648.add(i4);
            }
            c210648.mo20349();
            c21064 = c210648;
        } else {
            i4 = i3;
        }
        int m47912 = c21064.m47912(i4);
        if (m47912 < 0) {
            m47912 = -1;
        }
        int i15 = i4;
        while (m38006 > 0) {
            size--;
            AbstractC15834 abstractC158342 = (AbstractC15834) m38000.get(size);
            boolean z4 = abstractC158342.m37484().m9558() == 1;
            C2430 c2430 = new C2430(z4 ? 2 : 1);
            c2430.m40986(0, abstractC158342);
            if (z4) {
                c2430.m40986(1, (AbstractC15834) new C1018(C12307.f36802, abstractC158342.m37480(), (C21480) null, C20069.f65002));
                c210642 = C21064.m47910(i15);
            } else {
                c210642 = c21064;
            }
            c2430.mo20349();
            int m23362 = m23362();
            m23355(new C16540(m23362, c2430, c210642, i15), m30742.m30754());
            c21064 = c21064.m47913();
            c21064.set(m47912, m23362);
            c21064.mo20349();
            m38006--;
            i15 = m23362;
        }
        AbstractC15834 abstractC158343 = size == 0 ? null : (AbstractC15834) m38000.get(size - 1);
        if (abstractC158343 == null || abstractC158343.m37484().m9558() == 1) {
            if (abstractC158343 == null) {
                m37480 = C10191.f30620;
            } else {
                m37480 = abstractC158343.m37480();
            }
            m38000.add(new C1018(C12307.f36802, m37480, (C21480) null, C20069.f65002));
            size++;
        }
        C2430 c24302 = new C2430(size);
        for (int i16 = 0; i16 < size; i16++) {
            c24302.m40986(i16, (AbstractC15834) m38000.get(i16));
        }
        c24302.mo20349();
        C16540 c16540 = new C16540(c0538.mo2269(), c24302, c21064, i15);
        C21064 m30754 = m30742.m30754();
        int m23363 = m23363(c16540.mo2269());
        if (m23363 >= 0) {
            m23366(m23363);
        }
        this.f27444.add(c16540);
        m30754.m43732();
        this.f27437.add(m30754);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23350(int i, int i2, C21043 c21043, C12533 c12533, int[] iArr) {
        C12533 m30745;
        C12533[] c12533Arr = this.f27440;
        C12533 c125332 = c12533Arr[i];
        if (c125332 == null) {
            if (c21043 != null) {
                c12533Arr[i] = c12533.m30743(i, i2);
            } else {
                c12533Arr[i] = c12533;
            }
            C13573.m32627(i, iArr);
            return;
        }
        if (c21043 != null) {
            m30745 = c125332.m30746(c12533, c21043.m47878(), i2);
        } else {
            m30745 = c125332.m30745(c12533);
        }
        if (m30745 != c125332) {
            c12533Arr[i] = m30745;
            C13573.m32627(i, iArr);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23356(C9048 c9048, C16540 c16540) {
        C21064 m38911 = c16540.m38911();
        if (m38911.size() < 2) {
            return false;
        }
        int i = m38911.get(1);
        C21043[] c21043Arr = c9048.f27433;
        return i < c21043Arr.length && c21043Arr[i] != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21043 m23359(C9048 c9048, int i) {
        C21043[] c21043Arr = c9048.f27433;
        int length = c21043Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            C21043 c21043 = c21043Arr[length];
            if (c21043 != null && c21043.f67899.get(i)) {
                return c21043;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23354(C16540 c16540, InterfaceC10897 interfaceC10897, BitSet bitSet) {
        interfaceC10897.mo27216(c16540);
        bitSet.set(c16540.mo2269());
        C21064 m38911 = c16540.m38911();
        int size = m38911.size();
        for (int i = 0; i < size; i++) {
            int i2 = m38911.get(i);
            if (!bitSet.get(i2)) {
                C21064 m389112 = c16540.m38911();
                if (m389112.size() >= 2) {
                    int i3 = m389112.get(1);
                    C21043[] c21043Arr = this.f27433;
                    if (i3 < c21043Arr.length && c21043Arr[i3] != null && i > 0) {
                    }
                }
                int m23363 = m23363(i2);
                if (m23363 >= 0) {
                    m23354((C16540) this.f27444.get(m23363), interfaceC10897, bitSet);
                }
            }
        }
    }
}
