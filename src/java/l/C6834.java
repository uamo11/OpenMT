package l;

import java.util.ArrayList;

/* compiled from: X156 */
/* renamed from: l.ۜܶ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6834 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18517(EnumC8040 enumC8040, EnumC8040 enumC80402, EnumC8040 enumC80403, EnumC8040 enumC80404) {
        EnumC8040 enumC80405;
        EnumC8040 enumC80406;
        EnumC8040 enumC80407 = EnumC8040.FIXED;
        return (enumC80403 == enumC80407 || enumC80403 == (enumC80406 = EnumC8040.WRAP_CONTENT) || (enumC80403 == EnumC8040.MATCH_PARENT && enumC8040 != enumC80406)) || (enumC80404 == enumC80407 || enumC80404 == (enumC80405 = EnumC8040.WRAP_CONTENT) || (enumC80404 == EnumC8040.MATCH_PARENT && enumC80402 != enumC80405));
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x035f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18518(l.C21446 r16, l.InterfaceC13683 r17) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6834.m18518(l.᩸۠, l.ܰ۠):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0483 m18516(C15094 c15094, int i, ArrayList arrayList, C0483 c0483) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = c15094.f46152;
        } else {
            i2 = c15094.f46125;
        }
        if (i2 != -1 && (c0483 == null || i2 != c0483.f2089)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0483 c04832 = (C0483) arrayList.get(i4);
                if (c04832.f2089 == i2) {
                    if (c0483 != null) {
                        c0483.m2137(i, c04832);
                        arrayList.remove(c0483);
                    }
                    c0483 = c04832;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return c0483;
        }
        if (c0483 == null) {
            if (c15094 instanceof C12978) {
                C12978 c12978 = (C12978) c15094;
                int i5 = 0;
                while (true) {
                    if (i5 >= c12978.f38881) {
                        i3 = -1;
                        break;
                    }
                    C15094 c150942 = c12978.f38882[i5];
                    if ((i == 0 && (i3 = c150942.f46152) != -1) || (i == 1 && (i3 = c150942.f46125) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i3 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C0483 c04833 = (C0483) arrayList.get(i6);
                        if (c04833.f2089 == i3) {
                            c0483 = c04833;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0483 == null) {
                c0483 = new C0483(i);
            }
            arrayList.add(c0483);
        }
        int i7 = c0483.f2089;
        if (c0483.m2139(c15094)) {
            if (c15094 instanceof C3101) {
                C3101 c3101 = (C3101) c15094;
                c3101.m9458().m14997(c3101.m9463() == 0 ? 1 : 0, c0483, arrayList);
            }
            if (i == 0) {
                c15094.f46152 = i7;
                c15094.f46141.m14997(i, c0483, arrayList);
                c15094.f46159.m14997(i, c0483, arrayList);
            } else {
                c15094.f46125 = i7;
                c15094.f46161.m14997(i, c0483, arrayList);
                c15094.f46126.m14997(i, c0483, arrayList);
                c15094.f46133.m14997(i, c0483, arrayList);
            }
            c15094.f46131.m14997(i, c0483, arrayList);
        }
        return c0483;
    }
}
