package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: I5WF */
/* renamed from: l.᩷ۙۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20649 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Comparator f66414 = new C1598();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17120 m47228(AbstractC10771 abstractC10771) {
        ArrayList arrayList;
        C23470 c23470;
        C6537 c6537;
        ArrayList arrayList2;
        int i;
        C23470 c234702;
        int i2;
        int m38674;
        int i3;
        int i4;
        int m386742;
        int i5;
        boolean z;
        int mo1336 = abstractC10771.mo1336();
        int mo1334 = abstractC10771.mo1334();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C23470 c234703 = new C23470();
        c234703.f75306 = 0;
        c234703.f75305 = mo1336;
        c234703.f75304 = 0;
        c234703.f75303 = mo1334;
        arrayList4.add(c234703);
        int i6 = mo1336 + mo1334;
        int i7 = 1;
        int i8 = (((i6 + 1) / 2) * 2) + 1;
        C16414 c16414 = new C16414(i8);
        C16414 c164142 = new C16414(i8);
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            C23470 c234704 = (C23470) C4248.m12790(arrayList4, i7);
            if (c234704.m51909() >= i7 && c234704.m51908() >= i7) {
                int m51909 = ((c234704.m51909() + c234704.m51908()) + i7) / 2;
                c16414.m38675(i7, c234704.f75306);
                c164142.m38675(i7, c234704.f75305);
                int i9 = 0;
                while (i9 < m51909) {
                    boolean z2 = Math.abs(c234704.m51909() - c234704.m51908()) % 2 == i7;
                    int m519092 = c234704.m51909() - c234704.m51908();
                    int i10 = -i9;
                    int i11 = i10;
                    while (true) {
                        if (i11 > i9) {
                            arrayList = arrayList4;
                            i2 = m51909;
                            c6537 = null;
                            break;
                        }
                        if (i11 == i10 || (i11 != i9 && c16414.m38674(i11 + 1) > c16414.m38674(i11 - 1))) {
                            m386742 = c16414.m38674(i11 + 1);
                            i5 = m386742;
                        } else {
                            m386742 = c16414.m38674(i11 - 1);
                            i5 = m386742 + 1;
                        }
                        i2 = m51909;
                        int i12 = ((i5 - c234704.f75306) + c234704.f75304) - i11;
                        int i13 = (i9 == 0 || i5 != m386742) ? i12 : i12 - 1;
                        arrayList = arrayList4;
                        while (i5 < c234704.f75305 && i12 < c234704.f75303 && abstractC10771.mo1337(i5, i12)) {
                            i5++;
                            i12++;
                        }
                        c16414.m38675(i11, i5);
                        if (z2) {
                            int i14 = m519092 - i11;
                            z = z2;
                            if (i14 >= i10 + 1 && i14 <= i9 - 1 && c164142.m38674(i14) <= i5) {
                                c6537 = new C6537();
                                c6537.f20186 = m386742;
                                c6537.f20185 = i13;
                                c6537.f20182 = i5;
                                c6537.f20183 = i12;
                                c6537.f20184 = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i11 += 2;
                        m51909 = i2;
                        arrayList4 = arrayList;
                        z2 = z;
                    }
                    if (c6537 != null) {
                        c23470 = c234704;
                        break;
                    }
                    boolean z3 = (c234704.m51909() - c234704.m51908()) % 2 == 0;
                    int m519093 = c234704.m51909() - c234704.m51908();
                    int i15 = i10;
                    while (true) {
                        if (i15 > i9) {
                            c23470 = c234704;
                            c6537 = null;
                            break;
                        }
                        if (i15 == i10 || (i15 != i9 && c164142.m38674(i15 + 1) < c164142.m38674(i15 - 1))) {
                            m38674 = c164142.m38674(i15 + 1);
                            i3 = m38674;
                        } else {
                            m38674 = c164142.m38674(i15 - 1);
                            i3 = m38674 - 1;
                        }
                        int i16 = c234704.f75303 - ((c234704.f75305 - i3) - i15);
                        int i17 = (i9 == 0 || i3 != m38674) ? i16 : i16 + 1;
                        while (i3 > c234704.f75306 && i16 > c234704.f75304) {
                            c23470 = c234704;
                            if (!abstractC10771.mo1337(i3 - 1, i16 - 1)) {
                                break;
                            }
                            i3--;
                            i16--;
                            c234704 = c23470;
                        }
                        c23470 = c234704;
                        c164142.m38675(i15, i3);
                        if (z3 && (i4 = m519093 - i15) >= i10 && i4 <= i9 && c16414.m38674(i4) >= i3) {
                            c6537 = new C6537();
                            c6537.f20186 = i3;
                            c6537.f20185 = i16;
                            c6537.f20182 = m38674;
                            c6537.f20183 = i17;
                            c6537.f20184 = true;
                            break;
                        }
                        i15 += 2;
                        c234704 = c23470;
                    }
                    if (c6537 != null) {
                        break;
                    }
                    i9++;
                    i7 = 1;
                    m51909 = i2;
                    arrayList4 = arrayList;
                    c234704 = c23470;
                }
            }
            arrayList = arrayList4;
            c23470 = c234704;
            c6537 = null;
            if (c6537 != null) {
                if (c6537.m18042() > 0) {
                    int i18 = c6537.f20183;
                    int i19 = c6537.f20185;
                    int i20 = i18 - i19;
                    int i21 = c6537.f20182;
                    int i22 = c6537.f20186;
                    int i23 = i21 - i22;
                    arrayList3.add(i20 != i23 ? c6537.f20184 ? new C17826(i22, i19, c6537.m18042()) : i20 > i23 ? new C17826(i22, i19 + 1, c6537.m18042()) : new C17826(i22 + 1, i19, c6537.m18042()) : new C17826(i22, i19, i23));
                }
                if (arrayList5.isEmpty()) {
                    c234702 = new C23470();
                    i = 1;
                } else {
                    i = 1;
                    c234702 = (C23470) C4248.m12790(arrayList5, 1);
                }
                C23470 c234705 = c23470;
                c234702.f75306 = c234705.f75306;
                c234702.f75304 = c234705.f75304;
                c234702.f75305 = c6537.f20186;
                c234702.f75303 = c6537.f20185;
                arrayList2 = arrayList;
                arrayList2.add(c234702);
                c234705.f75305 = c234705.f75305;
                c234705.f75303 = c234705.f75303;
                c234705.f75306 = c6537.f20182;
                c234705.f75304 = c6537.f20183;
                arrayList2.add(c234705);
                i7 = i;
            } else {
                arrayList2 = arrayList;
                i7 = 1;
                arrayList5.add(c23470);
            }
            arrayList4 = arrayList2;
        }
        Collections.sort(arrayList3, f66414);
        return new C17120(abstractC10771, arrayList3, c16414.m38676(), c164142.m38676());
    }
}
