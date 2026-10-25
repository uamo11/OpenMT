package l;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: AARN */
/* renamed from: l.᩺᩻֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23313 extends AbstractC11753 {

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean f74933;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5883[] f74934;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC9637 f74935;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EnumC23522 f74936;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8931 f74937;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1875 f74938;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5883 f74939;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11237 f74940;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74941;

    @Override // l.AbstractC11753
    /* renamed from: ֫ */
    public final void mo12834() {
    }

    /* renamed from: ۧ */
    public boolean mo22944() {
        return false;
    }

    /* renamed from: ֫ */
    public void mo22942(C22336 c22336, AbstractC23041 abstractC23041, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        int i2;
        if (abstractC23041.f74150) {
            int i3 = 0;
            while (i3 < abstractC23041.f74151.size()) {
                AbstractC23041 abstractC230412 = abstractC23041.m51211(i3).f38806;
                if (m51700(abstractC230412, z3)) {
                    mo22942(c22336, abstractC230412, c13163, hashSet, z, z2, i, z3);
                    i2 = i3;
                } else {
                    i2 = i3;
                    mo22941(new C22336(c22336, abstractC230412, c22336.f72391, c22336.f72394), c13163, hashSet, z, z2, i, z3);
                }
                i3 = i2 + 1;
            }
            return;
        }
        c13163.m31895(c22336, abstractC23041, c22336.f72391, c22336.f72394, this.f74940);
    }

    public C23313(AbstractC9637 abstractC9637, C21631 c21631, C5883[] c5883Arr, C17878 c17878) {
        super(c21631, c17878);
        this.f74936 = EnumC23522.LL;
        this.f74935 = abstractC9637;
        this.f74934 = c5883Arr;
    }

    /* renamed from: ֫ */
    public int mo22933(int i, C1875 c1875, C8931 c8931) {
        C13643 c13643;
        this.f74938 = c1875;
        this.f74941 = c1875.index();
        this.f74937 = c8931;
        C5883 c5883 = this.f74934[i];
        this.f74939 = c5883;
        c1875.mo6200();
        int i2 = this.f74941;
        try {
            if (c5883.m16470()) {
                c13643 = c5883.m16468(this.f74935.m24556());
            } else {
                c13643 = c5883.f18066;
            }
            if (c13643 == null) {
                if (c8931 == null) {
                    c8931 = C8931.f27153;
                }
                C13163 m51707 = m51707((AbstractC23041) c5883.f18062, C8931.f27153, false);
                if (c5883.m16470()) {
                    c5883.f18066.f40683 = m51707;
                    c13643 = mo22938(c5883, new C13643(m51706(m51707)));
                    c5883.m16469(this.f74935.m24556(), c13643);
                } else {
                    c13643 = mo22938(c5883, new C13643(m51707));
                    c5883.f18066 = c13643;
                }
            }
            int m51703 = m51703(c5883, c13643, c1875, i2, c8931);
            this.f74940 = null;
            this.f74939 = null;
            c1875.mo6201(i2);
            c1875.getClass();
            return m51703;
        } catch (Throwable th) {
            this.f74940 = null;
            this.f74939 = null;
            c1875.mo6201(i2);
            c1875.getClass();
            throw th;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m51701(C13163 c13163) {
        Iterator it = c13163.f39354.iterator();
        int i = 0;
        while (it.hasNext()) {
            C22336 c22336 = (C22336) it.next();
            if (i == 0) {
                i = c22336.f72390;
            } else if (c22336.f72390 != i) {
                return 0;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51703(C5883 c5883, C13643 c13643, C1875 c1875, int i, C8931 c8931) {
        BitSet bitSet;
        int mo6203 = c1875.mo6203(1);
        C13643 c136432 = c13643;
        while (true) {
            C13643 mo22937 = mo22937(mo6203, c136432);
            if (mo22937 == null) {
                mo22937 = mo22939(c5883, c136432, mo6203);
            }
            C13643 c136433 = mo22937;
            if (c136433 == AbstractC11753.f35088) {
                C20926 m51711 = m51711(i, c1875, c8931);
                c1875.mo6201(i);
                int m51704 = m51704(c136432.f40683, c8931);
                if (m51704 != 0) {
                    return m51704;
                }
                throw m51711;
            }
            if (c136433.f40690 && this.f74936 != EnumC23522.SLL) {
                BitSet bitSet2 = c136433.f40683.f39353;
                if (c136433.f40688 != null) {
                    int index = c1875.index();
                    if (index != i) {
                        c1875.mo6201(i);
                    }
                    BitSet m51705 = m51705(c136433.f40688, c8931);
                    if (m51705.cardinality() == 1) {
                        return m51705.nextSetBit(0);
                    }
                    if (index != i) {
                        c1875.mo6201(index);
                    }
                    bitSet = m51705;
                } else {
                    bitSet = bitSet2;
                }
                C13163 m51707 = m51707((AbstractC23041) c5883.f18062, c8931, true);
                C13163 c13163 = c136433.f40683;
                int index2 = c1875.index();
                AbstractC9637 abstractC9637 = this.f74935;
                if (abstractC9637 != null) {
                    abstractC9637.m43461().mo17111(this.f74935, c5883, i, index2, bitSet, c13163);
                }
                return mo22934(c5883, c136433, m51707, c1875, i, c8931);
            }
            if (c136433.f40687) {
                if (c136433.f40688 == null) {
                    return c136433.f40686;
                }
                int index3 = c1875.index();
                c1875.mo6201(i);
                BitSet m517052 = m51705(c136433.f40688, c8931);
                int cardinality = m517052.cardinality();
                if (cardinality == 0) {
                    throw m51711(i, c1875, c8931);
                }
                if (cardinality == 1) {
                    return m517052.nextSetBit(0);
                }
                m51709(c5883, i, index3, false, m517052, c136433.f40683);
                return m517052.nextSetBit(0);
            }
            if (mo6203 != -1) {
                c1875.mo6204();
                mo6203 = c1875.mo6203(1);
            }
            c136432 = c136433;
        }
    }

    /* renamed from: ֫ */
    public C13643 mo22937(int i, C13643 c13643) {
        int i2;
        C13643[] c13643Arr = c13643.f40685;
        if (c13643Arr == null || (i2 = i + 1) < 0 || i2 >= c13643Arr.length) {
            return null;
        }
        return c13643Arr[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫ */
    public C13643 mo22939(C5883 c5883, C13643 c13643, int i) {
        BitSet bitSet;
        C13163 mo22935 = mo22935(c13643.f40683, i, false);
        if (mo22935 == null) {
            C13643 c136432 = AbstractC11753.f35088;
            m51708(c5883, c13643, i, c136432);
            return c136432;
        }
        C13643 c136433 = new C13643(mo22935);
        int m51701 = m51701(mo22935);
        if (m51701 != 0) {
            c136433.f40687 = true;
            c136433.f40683.f39357 = m51701;
            c136433.f40686 = m51701;
        } else if (mo22945(mo22935)) {
            c136433.f40683.f39353 = mo22943(mo22935);
            c136433.f40690 = true;
            c136433.f40687 = true;
            c136433.f40686 = c136433.f40683.f39353.nextSetBit(0);
        }
        if (c136433.f40687 && c136433.f40683.f39356) {
            int size = this.f35089.m48892(c5883.f18063).f74151.size();
            C13163 c13163 = c136433.f40683;
            if (c13163.f39357 != 0) {
                bitSet = new BitSet();
                bitSet.set(c13163.f39357);
            } else {
                bitSet = c13163.f39353;
            }
            AbstractC5178[] abstractC5178Arr = new AbstractC5178[size + 1];
            Iterator it = c136433.f40683.f39354.iterator();
            while (it.hasNext()) {
                C22336 c22336 = (C22336) it.next();
                if (bitSet.get(c22336.f72390)) {
                    int i2 = c22336.f72390;
                    AbstractC5178 abstractC5178 = abstractC5178Arr[i2];
                    AbstractC5178 abstractC51782 = c22336.f72394;
                    if (abstractC5178 == null) {
                        abstractC5178 = abstractC51782;
                    } else if (abstractC51782 != null) {
                        C2356 c2356 = C2356.f7548;
                        C2356 c23562 = c2356;
                        c23562 = c2356;
                        if (abstractC5178 != c2356 && abstractC51782 != c2356) {
                            C3767 c3767 = new C3767(abstractC5178, abstractC51782);
                            AbstractC5178[] abstractC5178Arr2 = c3767.f11880;
                            c23562 = c3767;
                            if (abstractC5178Arr2.length == 1) {
                                abstractC5178 = abstractC5178Arr2[0];
                            }
                        }
                        abstractC5178 = c23562;
                    }
                    abstractC5178Arr[i2] = abstractC5178;
                }
            }
            int i3 = 0;
            for (int i4 = 1; i4 <= size; i4++) {
                AbstractC5178 abstractC51783 = abstractC5178Arr[i4];
                if (abstractC51783 == null) {
                    abstractC5178Arr[i4] = C2356.f7548;
                } else if (abstractC51783 != C2356.f7548) {
                    i3++;
                }
            }
            if (i3 == 0) {
                abstractC5178Arr = null;
            }
            if (abstractC5178Arr == null) {
                c136433.f40686 = bitSet.nextSetBit(0);
            } else {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i5 = 1; i5 < abstractC5178Arr.length; i5++) {
                    AbstractC5178 abstractC51784 = abstractC5178Arr[i5];
                    if (bitSet != null && bitSet.get(i5)) {
                        C22816 c22816 = new C22816();
                        c22816.f73664 = i5;
                        c22816.f73665 = abstractC51784;
                        arrayList.add(c22816);
                    }
                    if (abstractC51784 != C2356.f7548) {
                        z = true;
                    }
                }
                c136433.f40688 = z ? (C22816[]) arrayList.toArray(new C22816[0]) : null;
                c136433.f40686 = 0;
            }
            if (c136433.f40688 != null) {
                c136433.f40686 = 0;
            }
        }
        return m51708(c5883, c13643, i, c136433);
    }

    /* renamed from: ܽ */
    public boolean mo22945(C13163 c13163) {
        return EnumC23522.m51952(this.f74936, c13163);
    }

    /* renamed from: ֫ */
    public int mo22934(C5883 c5883, C13643 c13643, C13163 c13163, C1875 c1875, int i, C8931 c8931) {
        C13163 mo22935;
        int m51701;
        int i2;
        boolean z;
        c1875.mo6201(i);
        int mo6203 = c1875.mo6203(1);
        while (true) {
            mo22935 = mo22935(c13163, mo6203, true);
            if (mo22935 == null) {
                C20926 m51711 = m51711(i, c1875, c8931);
                c1875.mo6201(i);
                int m51704 = m51704(c13163, c8931);
                if (m51704 != 0) {
                    return m51704;
                }
                throw m51711;
            }
            Collection m51960 = EnumC23522.m51960(mo22935);
            m51701 = m51701(mo22935);
            mo22935.f39357 = m51701;
            if (m51701 != 0) {
                break;
            }
            if (this.f74936 != EnumC23522.LL_EXACT_AMBIG_DETECTION) {
                m51701 = EnumC23522.m51954(m51960);
                if (m51701 != 0) {
                    break;
                }
            } else if (EnumC23522.m51950(m51960) && EnumC23522.m51956(m51960)) {
                i2 = EnumC23522.m51963(m51960);
                z = true;
                break;
            }
            if (mo6203 != -1) {
                c1875.mo6204();
                mo6203 = c1875.mo6203(1);
            }
            c13163 = mo22935;
        }
        i2 = m51701;
        z = false;
        if (mo22935.f39357 != 0) {
            m51710(c5883, i2, mo22935, i, c1875.index());
            return i2;
        }
        m51709(c5883, i, c1875.index(), z, mo22935.m31896(), mo22935);
        return i2;
    }

    /* renamed from: ֫ */
    public C13163 mo22936(boolean z) {
        return new C13163(z, false);
    }

    /* renamed from: ֫ */
    public C13163 mo22935(C13163 c13163, int i, boolean z) {
        C21631 c21631;
        int i2;
        int i3;
        int i4;
        if (this.f74940 == null) {
            this.f74940 = new C11237();
        }
        C13163 mo22936 = mo22936(z);
        ArrayList arrayList = mo22936.f39354;
        Iterator it = c13163.f39354.iterator();
        ArrayList arrayList2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            c21631 = this.f35089;
            if (!hasNext) {
                break;
            }
            C22336 c22336 = (C22336) it.next();
            AbstractC23041 abstractC23041 = c22336.f72393;
            if (!(abstractC23041 instanceof C9412)) {
                int size = abstractC23041.f74151.size();
                int i5 = 0;
                while (i5 < size) {
                    AbstractC12938 m51211 = c22336.f72393.m51211(i5);
                    AbstractC23041 abstractC230412 = m51211.mo3364(i, c21631.f69448) ? m51211.f38806 : null;
                    if (abstractC230412 != null) {
                        i3 = i5;
                        i4 = size;
                        mo22936.m31895(c22336, abstractC230412, c22336.f72391, c22336.f72394, this.f74940);
                    } else {
                        i3 = i5;
                        i4 = size;
                    }
                    i5 = i3 + 1;
                    size = i4;
                }
            } else if (z || i == -1) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c22336);
            }
        }
        C13163 c131632 = (arrayList2 != null || i == -1 || (arrayList.size() != 1 && m51701(mo22936) == 0)) ? null : mo22936;
        if (c131632 == null) {
            C13163 mo229362 = mo22936(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mo22941((C22336) it2.next(), mo229362, hashSet, false, z, 0, z2);
            }
            i2 = -1;
            c131632 = mo229362;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c131632 == mo22936;
            if (!EnumC23522.m51951(c131632)) {
                C13163 mo229363 = mo22936(c131632.f39358);
                Iterator it3 = c131632.f39354.iterator();
                while (it3.hasNext()) {
                    C22336 c223362 = (C22336) it3.next();
                    AbstractC23041 abstractC230413 = c223362.f72393;
                    if (!(abstractC230413 instanceof C9412)) {
                        if (z3 && abstractC230413.f74150 && c21631.m48894(abstractC230413).m52723(-2)) {
                            mo229363.m31895(c223362, c21631.f69450[c223362.f72393.f74154], c223362.f72391, c223362.f72394, this.f74940);
                        }
                    } else {
                        mo229363.m31894(c223362, this.f74940);
                    }
                }
                c131632 = mo229363;
            }
        }
        if (arrayList2 != null && (!z || !EnumC23522.m51962(c131632))) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                c131632.m31894((C22336) it4.next(), this.f74940);
            }
        }
        if (c131632.f39354.isEmpty()) {
            return null;
        }
        return c131632;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 m51707(AbstractC23041 abstractC23041, C8931 c8931, boolean z) {
        C8000 m38769 = AbstractC16466.m38769(this.f35089, c8931);
        C13163 mo22936 = mo22936(z);
        int i = 0;
        while (i < abstractC23041.f74151.size()) {
            int i2 = i + 1;
            mo22941(new C22336(abstractC23041.m51211(i).f38806, i2, m38769), mo22936, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return mo22936;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 m51706(C13163 c13163) {
        AbstractC16466 abstractC16466;
        AbstractC5178 mo11420;
        HashMap hashMap = new HashMap();
        C13163 mo22936 = mo22936(c13163.f39358);
        ArrayList arrayList = c13163.f39354;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22336 c22336 = (C22336) it.next();
            int i = c22336.f72390;
            AbstractC5178 abstractC5178 = c22336.f72394;
            if (i == 1 && (mo11420 = abstractC5178.mo11420(this.f74935, this.f74937)) != null) {
                hashMap.put(Integer.valueOf(c22336.f72393.f74153), c22336.f72391);
                if (mo11420 != abstractC5178) {
                    mo22936.m31895(c22336, c22336.f72393, c22336.f72391, mo11420, this.f74940);
                } else {
                    mo22936.m31894(c22336, this.f74940);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C22336 c223362 = (C22336) it2.next();
            if (c223362.f72390 != 1 && ((c223362.f72392 & 1073741824) != 0 || (abstractC16466 = (AbstractC16466) hashMap.get(Integer.valueOf(c223362.f72393.f74153))) == null || !abstractC16466.equals(c223362.f72391))) {
                mo22936.m31894(c223362, this.f74940);
            }
        }
        return mo22936;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m51702(C13163 c13163) {
        C23936 c23936 = new C23936(new int[0]);
        Iterator it = c13163.f39354.iterator();
        while (it.hasNext()) {
            C22336 c22336 = (C22336) it.next();
            if ((c22336.f72392 & (-1073741825)) > 0 || ((c22336.f72393 instanceof C9412) && c22336.f72391.m38772())) {
                c23936.m52719(c22336.f72390);
            }
        }
        if (c23936.m52725() == 0) {
            return 0;
        }
        return c23936.m52717();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51704(C13163 c13163, C8931 c8931) {
        int m51702;
        C13163 mo22936 = mo22936(c13163.f39358);
        C13163 mo229362 = mo22936(c13163.f39358);
        Iterator it = c13163.f39354.iterator();
        while (it.hasNext()) {
            C22336 c22336 = (C22336) it.next();
            AbstractC5178 abstractC5178 = c22336.f72394;
            if (abstractC5178 == C2356.f7548 || abstractC5178.mo1496(this.f74935, c8931)) {
                mo22936.m31894(c22336, null);
            } else {
                mo229362.m31894(c22336, null);
            }
        }
        int m517022 = m51702(mo22936);
        if (m517022 != 0) {
            return m517022;
        }
        if (mo229362.f39354.size() <= 0 || (m51702 = m51702(mo229362)) == 0) {
            return 0;
        }
        return m51702;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet m51705(C22816[] c22816Arr, C8931 c8931) {
        BitSet bitSet = new BitSet();
        for (C22816 c22816 : c22816Arr) {
            AbstractC5178 abstractC5178 = c22816.f73665;
            int i = c22816.f73664;
            if (abstractC5178 == C2356.f7548) {
                bitSet.set(i);
            } else if (abstractC5178.mo1496(this.f74935, c8931)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* renamed from: ֫ */
    public void mo22941(C22336 c22336, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c22336.f72393 instanceof C9412) {
            if (!c22336.f72391.mo27960()) {
                for (int i2 = 0; i2 < c22336.f72391.mo21317(); i2++) {
                    if (c22336.f72391.mo21316(i2) != Integer.MAX_VALUE) {
                        C22336 c223362 = new C22336((AbstractC23041) this.f35089.f69449.get(c22336.f72391.mo21316(i2)), c22336.f72390, c22336.f72391.mo21315(i2), c22336.f72394);
                        c223362.f72392 = c22336.f72392;
                        mo22941(c223362, c13163, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c13163.m31895(c22336, c22336.f72393, C21198.f68319, c22336.f72394, this.f74940);
                    } else {
                        m51712(c22336, c13163, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c13163.m31894(c22336, this.f74940);
                return;
            }
        }
        m51712(c22336, c13163, hashSet, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0238  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m51712(l.C22336 r18, l.C13163 r19, java.util.HashSet r20, boolean r21, boolean r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23313.m51712(l.᩹ܳ֡, l.۬ܳ֡, java.util.HashSet, boolean, boolean, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51700(AbstractC23041 abstractC23041, boolean z) {
        if ((abstractC23041 instanceof C9412) || (abstractC23041 instanceof C22111)) {
            return false;
        }
        boolean z2 = abstractC23041.f74150;
        for (int i = 0; i < abstractC23041.f74151.size(); i++) {
            AbstractC12938 m51211 = abstractC23041.m51211(i);
            int mo3363 = m51211.mo3363();
            if (!z2) {
                if (!m51211.mo5546()) {
                    if (z && ((mo3363 == 5 || mo3363 == 2 || mo3363 == 7) && m51211.mo3364(-1, 1))) {
                    }
                }
                return false;
            }
            if (mo3363 != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ */
    public BitSet mo22943(C13163 c13163) {
        return EnumC23522.m51959(EnumC23522.m51960(c13163));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20926 m51711(int i, C1875 c1875, C8931 c8931) {
        return new C20926(this.f74935, c1875, c1875.m6213(i), c1875.mo6211(1), c8931);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 m51708(C5883 c5883, C13643 c13643, int i, C13643 c136432) {
        if (c136432 == null) {
            return null;
        }
        C13643 mo22938 = mo22938(c5883, c136432);
        if (c13643 == null || i < -1 || i > this.f35089.f69448) {
            return mo22938;
        }
        synchronized (c13643) {
            if (c13643.f40685 == null) {
                c13643.f40685 = new C13643[this.f35089.f69448 + 2];
            }
            c13643.f40685[i + 1] = mo22938;
        }
        return mo22938;
    }

    /* renamed from: ֫ */
    public C13643 mo22938(C5883 c5883, C13643 c13643) {
        if (c13643 == AbstractC11753.f35088) {
            return c13643;
        }
        synchronized (c5883.f18065) {
            C13643 c136432 = (C13643) c5883.f18065.get(c13643);
            if (c136432 != null) {
                return c136432;
            }
            c13643.f40684 = c5883.f18065.size();
            C13163 c13163 = c13643.f40683;
            boolean z = c13163.f39355;
            if (!z) {
                ArrayList arrayList = c13163.f39354;
                if (z) {
                    throw new IllegalStateException("This set is readonly");
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C22336 c22336 = (C22336) it.next();
                        c22336.f72391 = mo22940(c22336.f72391);
                    }
                }
                c13643.f40683.m31897();
            }
            c5883.f18065.put(c13643, c13643);
            return c13643;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51710(C5883 c5883, int i, C13163 c13163, int i2, int i3) {
        AbstractC9637 abstractC9637 = this.f74935;
        if (abstractC9637 != null) {
            abstractC9637.m43461().mo17110(this.f74935, c5883, i2, i3, i, c13163);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51709(C5883 c5883, int i, int i2, boolean z, BitSet bitSet, C13163 c13163) {
        AbstractC9637 abstractC9637 = this.f74935;
        if (abstractC9637 != null) {
            abstractC9637.m43461().mo17112(this.f74935, c5883, i, i2, z, bitSet, c13163);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC23522 m51713() {
        return this.f74936;
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C12025());
        } catch (SecurityException unused) {
            str = null;
        }
        f74933 = Boolean.parseBoolean(str);
    }
}
