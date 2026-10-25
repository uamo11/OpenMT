package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* compiled from: 5BHG */
/* renamed from: l.ۢᩳܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9754 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6931 f29524;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29525;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f29526;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f29527 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f29528;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29529;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BitSet f29530;

    public C9754(C9048 c9048, C6931 c6931, ArrayList arrayList) {
        int i;
        this.f29526 = c9048;
        i = c9048.f27439;
        this.f29530 = new BitSet(i);
        this.f29524 = c6931;
        this.f29525 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24734(C16540 c16540) {
        C16540 m23358;
        C21064 c21064;
        int i;
        int i2;
        C16540 m233582;
        C16540 m233583;
        int i3 = 0;
        this.f29528 = c16540.m38911().get(0);
        int i4 = 1;
        int i5 = c16540.m38911().get(1);
        this.f29529 = i5;
        int m24733 = m24733(i5);
        BitSet bitSet = this.f29530;
        int nextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f29525;
            C9048 c9048 = this.f29526;
            if (nextSetBit >= 0) {
                bitSet.clear(nextSetBit);
                int intValue = ((Integer) this.f29527.get(Integer.valueOf(nextSetBit))).intValue();
                m23358 = c9048.m23358(nextSetBit);
                C21064 m38911 = m23358.m38911();
                int i6 = -1;
                if (C9048.m23356(c9048, m23358)) {
                    int m247332 = m24733(m38911.get(i3));
                    int i7 = m38911.get(i4);
                    c21064 = new C21064(2);
                    c21064.add(m247332);
                    c21064.add(i7);
                    c21064.mo20349();
                } else {
                    C21043 m23359 = C9048.m23359(c9048, nextSetBit);
                    if (m23359 != null) {
                        i = m23359.f67900;
                        if (i != this.f29529) {
                            StringBuilder sb = new StringBuilder("ret instruction returns to label ");
                            i2 = m23359.f67900;
                            sb.append(C14712.m35006(i2));
                            sb.append(" expected: ");
                            sb.append(C14712.m35006(this.f29529));
                            throw new RuntimeException(sb.toString());
                        }
                        c21064 = C21064.m47910(this.f29528);
                        i6 = this.f29528;
                    } else {
                        int m38913 = m23358.m38913();
                        int size = m38911.size();
                        C21064 c210642 = new C21064(size);
                        for (int i8 = 0; i8 < size; i8++) {
                            int i9 = m38911.get(i8);
                            int m247333 = m24733(i9);
                            c210642.add(m247333);
                            if (m38913 == i9) {
                                i6 = m247333;
                            }
                        }
                        c210642.mo20349();
                        c21064 = c210642;
                    }
                }
                C2430 m38916 = m23358.m38916();
                int size2 = m38916.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    if (m38916.m41001get(i11).m37484() != C12307.f36809) {
                        i10++;
                    }
                }
                if (i10 != size2) {
                    C2430 c2430 = new C2430(i10);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < size2) {
                        AbstractC15834 m41001get = m38916.m41001get(i12);
                        C2430 c24302 = m38916;
                        int i14 = size2;
                        if (m41001get.m37484() != C12307.f36809) {
                            c2430.m40986(i13, m41001get);
                            i13++;
                        }
                        i12++;
                        m38916 = c24302;
                        size2 = i14;
                    }
                    c2430.mo20349();
                    m38916 = c2430;
                }
                c9048.m23355(new C16540(intValue, m38916, c21064, i6), (C21064) arrayList.get(intValue));
                m233582 = c9048.m23358(nextSetBit);
                if (C9048.m23356(c9048, m233582)) {
                    C9754 c9754 = new C9754(c9048, this.f29524, arrayList);
                    m233583 = c9048.m23358(intValue);
                    c9754.m24734(m233583);
                }
                i3 = 0;
                nextSetBit = bitSet.nextSetBit(0);
                i4 = 1;
            } else {
                C9048.m23361(c9048, new C16540(c16540.mo2269(), c16540.m38916(), C21064.m47910(m24733), m24733), (C21064) arrayList.get(c16540.mo2269()));
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24733(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f29527;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f29529;
        ArrayList arrayList = this.f29525;
        C21064 c21064 = (C21064) arrayList.get(i);
        if (c21064 == null || c21064.size() <= 0 || c21064.m47917() != i2) {
            return i;
        }
        int mo18741 = this.f29524.mo18741();
        this.f29530.set(i);
        hashMap.put(Integer.valueOf(i), Integer.valueOf(mo18741));
        while (arrayList.size() <= mo18741) {
            arrayList.add(null);
        }
        arrayList.set(mo18741, (C21064) arrayList.get(i));
        return mo18741;
    }
}
