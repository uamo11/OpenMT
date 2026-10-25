package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FBGP */
/* renamed from: l.᩻ܳܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23759 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9733 f76907;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f76908;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f76912;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f76913;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f76914;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76910 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f76911 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f76909 = false;

    public C23759(C9733 c9733, int i, int i2, int i3) {
        this.f76907 = c9733;
        this.f76908 = i2;
        this.f76913 = new ArrayList(i);
        this.f76912 = i3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m52423() {
        return this.f76911;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m52421() {
        return this.f76909;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m52420() {
        HashSet hashSet = new HashSet(20);
        Iterator it = this.f76913.iterator();
        while (it.hasNext()) {
            AbstractC4793 abstractC4793 = (AbstractC4793) it.next();
            if (abstractC4793 instanceof C21727) {
                hashSet.add(((C21727) abstractC4793).m49053());
            } else {
                int i = 0;
                if (abstractC4793 instanceof C18115) {
                    C18115 c18115 = (C18115) abstractC4793;
                    while (i < c18115.m42238()) {
                        hashSet.add(c18115.m42239(i));
                        i++;
                    }
                } else if (abstractC4793 instanceof C11060) {
                    C4546 m27446 = ((C11060) abstractC4793).m27446();
                    int size = m27446.size();
                    while (i < size) {
                        m52410(hashSet, m27446.get(i));
                        i++;
                    }
                } else if (abstractC4793 instanceof C16703) {
                    m52410(hashSet, ((C16703) abstractC4793).m39269());
                }
            }
        }
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52410(HashSet hashSet, C21480 c21480) {
        if (c21480 == null) {
            return;
        }
        C18658 m48653 = c21480.m48653();
        C13217 name = m48653.getName();
        C13217 signature = m48653.getSignature();
        C7573 type = c21480.getType();
        if (type != C7573.f23417) {
            hashSet.add(C12512.m30694(type));
        } else {
            hashSet.add(C12512.m30694(C7573.f23412));
        }
        if (name != null) {
            hashSet.add(name);
        }
        if (signature != null) {
            hashSet.add(signature);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52417(AbstractC4793 abstractC4793) {
        C21480 m39269;
        this.f76913.add(abstractC4793);
        if (!this.f76911 && abstractC4793.m13983().m25588() >= 0) {
            this.f76911 = true;
        }
        if (this.f76909) {
            return;
        }
        if (abstractC4793 instanceof C11060) {
            C4546 m27446 = ((C11060) abstractC4793).m27446();
            int size = m27446.size();
            for (int i = 0; i < size; i++) {
                C21480 c21480 = m27446.get(i);
                if (c21480 == null || c21480.m48653().getName() == null) {
                }
            }
            return;
        }
        if (!(abstractC4793 instanceof C16703) || (m39269 = ((C16703) abstractC4793).m39269()) == null || m39269.m48653().getName() == null) {
            return;
        }
        this.f76909 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m52416(int i) {
        return (AbstractC4793) this.f76913.get(i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52422() {
        return this.f76913.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52418(C15375 c15375) {
        int size = this.f76913.size() - 2;
        try {
            C5415 c5415 = (C5415) this.f76913.get(size);
            this.f76913.set(size, new C5415(c5415.m13994().m32169(), c5415.m13983(), c5415.m13993(), c15375));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52419(InterfaceC22432 interfaceC22432) {
        int mo31029;
        Iterator it = this.f76913.iterator();
        while (it.hasNext()) {
            AbstractC4793 abstractC4793 = (AbstractC4793) it.next();
            if (abstractC4793 instanceof C21727) {
                C21727 c21727 = (C21727) abstractC4793;
                AbstractC13717 m49053 = c21727.m49053();
                int mo310292 = interfaceC22432.mo31029(m49053);
                if (mo310292 >= 0) {
                    c21727.m49056(mo310292);
                }
                if ((m49053 instanceof AbstractC15333) && (mo31029 = interfaceC22432.mo31029(((AbstractC15333) m49053).m36363())) >= 0) {
                    c21727.m49055(mo31029);
                }
            } else if (abstractC4793 instanceof C18115) {
                C18115 c18115 = (C18115) abstractC4793;
                for (int i = 0; i < c18115.m42238(); i++) {
                    AbstractC13717 m42239 = c18115.m42239(i);
                    c18115.m42237(i, interfaceC22432.mo31029(m42239));
                    if (m42239 instanceof AbstractC15333) {
                        c18115.m42240(interfaceC22432.mo31029(((AbstractC15333) m42239).m36363()));
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3382 m52415() {
        int i;
        C18821 m13986;
        C6204 c6204;
        boolean z;
        if (this.f76910 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f76913.size();
        C13259[] c13259Arr = new C13259[size];
        for (int i2 = 0; i2 < size; i2++) {
            c13259Arr[i2] = ((AbstractC4793) this.f76913.get(i2)).m13994();
        }
        m52411(c13259Arr);
        this.f76907.getClass();
        do {
            int i3 = this.f76910;
            i = this.f76908;
            int i4 = i3 + i + this.f76914;
            int i5 = this.f76912;
            int i6 = i4 - i5;
            Iterator it = this.f76913.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                C20069 m13993 = ((AbstractC4793) it.next()).m13993();
                for (int i11 = 0; i11 < m13993.size(); i11++) {
                    C21480 m41004get = m13993.m41004get(i11);
                    if (m41004get.m48643()) {
                        boolean z2 = m41004get.m48652() >= i6;
                        if (m41004get.m48638()) {
                            if (z2) {
                                i8++;
                            } else {
                                i10++;
                            }
                        } else if (z2) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (i7 > i8 && i9 > i10) {
                m52414();
            } else if (i7 > i8) {
                m52413();
            } else {
                if (i9 <= i10) {
                    break;
                }
                m52414();
                if (i5 != 0 && i8 > i7) {
                    m52413();
                }
            }
        } while (m52411(c13259Arr));
        if (this.f76910 == 0) {
            int size2 = this.f76913.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i12);
                C13259 m13994 = abstractC4793.m13994();
                C13259 c13259 = c13259Arr[i12];
                if (m13994 != c13259) {
                    this.f76913.set(i12, abstractC4793.mo3993(c13259));
                }
            }
        } else {
            int size3 = this.f76913.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC4793 abstractC47932 = (AbstractC4793) this.f76913.get(i13);
                C13259 m139942 = abstractC47932.m13994();
                C13259 c132592 = c13259Arr[i13];
                if (c132592 != null) {
                    c6204 = null;
                    m13986 = null;
                } else {
                    c132592 = m52412(abstractC47932);
                    BitSet mo7131 = c132592.m32168().mo7131(abstractC47932);
                    C6204 m13981 = abstractC47932.m13981(mo7131);
                    m13986 = abstractC47932.m13986(mo7131);
                    abstractC47932 = abstractC47932.m13989(mo7131);
                    c6204 = m13981;
                }
                if (abstractC47932 instanceof C15375) {
                    C15375 c15375 = (C15375) abstractC47932;
                    if (c15375.m36410()) {
                        arrayList2.add(c15375);
                    }
                }
                if (c6204 != null) {
                    arrayList.add(c6204);
                }
                if (!(abstractC47932 instanceof AbstractC8237) && arrayList2.size() > 0) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((C15375) it2.next());
                    }
                    arrayList2.clear();
                }
                if (c132592 != m139942) {
                    abstractC47932 = abstractC47932.mo3993(c132592);
                }
                arrayList.add(abstractC47932);
                if (m13986 != null) {
                    arrayList.add(m13986);
                }
            }
            this.f76913 = arrayList;
        }
        do {
            int size4 = this.f76913.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size4; i15++) {
                AbstractC4793 abstractC47933 = (AbstractC4793) this.f76913.get(i15);
                abstractC47933.m13982(i14);
                i14 += abstractC47933.mo2084();
            }
            int size5 = this.f76913.size();
            int i16 = 0;
            z = false;
            while (i16 < size5) {
                AbstractC4793 abstractC47934 = (AbstractC4793) this.f76913.get(i16);
                if (abstractC47934 instanceof C5415) {
                    C13259 m139943 = abstractC47934.m13994();
                    C5415 c5415 = (C5415) abstractC47934;
                    if (m139943.m32168().mo10098(c5415)) {
                        continue;
                    } else {
                        if (m139943.m32167() == 40) {
                            C13259 m52409 = m52409(abstractC47934, m139943);
                            if (m52409 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f76913.set(i16, abstractC47934.mo3993(m52409));
                        } else {
                            try {
                                int i17 = i16 + 1;
                                C15375 c153752 = (C15375) this.f76913.get(i17);
                                this.f76913.set(i16, new C5415(C12554.f37822, c5415.m13983(), C20069.f65002, c5415.m15495()));
                                this.f76913.add(i16, new C5415(c5415.m13994().m32169(), c5415.m13983(), c5415.m13993(), c153752));
                                size5++;
                                i16 = i17;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i16++;
            }
        } while (z);
        return C3382.m10314(this.f76913, this.f76910 + i + this.f76914);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52411(C13259[] c13259Arr) {
        int i;
        int i2 = this.f76910;
        if (i2 < 0) {
            i2 = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f76913.size();
            int i3 = this.f76910;
            while (i < size) {
                AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i);
                C13259 c13259 = c13259Arr[i];
                C13259 m52409 = m52409(abstractC4793, c13259);
                if (m52409 == null) {
                    int m13991 = abstractC4793.m13991(m52412(abstractC4793).m32168().mo7131(abstractC4793));
                    if (m13991 > i3) {
                        i3 = m13991;
                    }
                } else {
                    i = c13259 == m52409 ? i + 1 : 0;
                }
                c13259Arr[i] = m52409;
            }
            if (i2 < i3) {
                int i4 = i3 - i2;
                int size2 = this.f76913.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC4793 abstractC47932 = (AbstractC4793) this.f76913.get(i5);
                    if (!(abstractC47932 instanceof C15375)) {
                        this.f76913.set(i5, abstractC47932.mo3994(i4));
                    }
                }
                z = true;
                i2 = i3;
            } else {
                this.f76910 = i2;
                return z;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13259 m52409(AbstractC4793 abstractC4793, C13259 c13259) {
        while (c13259 != null) {
            if (c13259.m32168().mo7134(abstractC4793)) {
                this.f76907.getClass();
                return c13259;
            }
            c13259 = C12554.m30789(c13259);
        }
        return c13259;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13259 m52412(AbstractC4793 abstractC4793) {
        C13259 m52409 = m52409(abstractC4793.m13987(), abstractC4793.m13994());
        if (m52409 != null) {
            return m52409;
        }
        throw new C0374("No expanded opcode for " + abstractC4793, null);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52414() {
        int size = this.f76913.size();
        for (int i = 0; i < size; i++) {
            AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i);
            if (!(abstractC4793 instanceof C15375)) {
                this.f76913.set(i, abstractC4793.mo3994(1));
            }
        }
        this.f76910++;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m52413() {
        int size = this.f76913.size();
        int i = this.f76908 + this.f76910 + this.f76914;
        int i2 = i - this.f76912;
        C16354 c16354 = new C16354(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c16354.mo21169(i3, i3 + 1, 1);
            } else {
                c16354.mo21169(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i4);
            if (!(abstractC4793 instanceof C15375)) {
                this.f76913.set(i4, abstractC4793.mo13980(c16354));
            }
        }
        this.f76914++;
    }
}
