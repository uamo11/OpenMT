package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: D1LP */
/* renamed from: l.֡ܿۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0551 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2298(CharSequence charSequence, CharSequence charSequence2, InterfaceC1173 interfaceC1173, InterfaceC1173 interfaceC11732, EnumC5491 enumC5491, EnumC21719 enumC21719, C4701 c4701) {
        InterfaceC1173 interfaceC11733 = interfaceC1173;
        InterfaceC6818 m33429 = C13977.m33429(m2297(0, interfaceC1173.mo3970(), charSequence, interfaceC11733), m2297(0, interfaceC11732.mo3970(), charSequence2, interfaceC11732), enumC5491, c4701);
        ArrayList arrayList = new ArrayList();
        Iterator mo6220 = m33429.mo6218().f41655.mo6220();
        while (mo6220.hasNext()) {
            C22340 c22340 = (C22340) mo6220.next();
            int i = c22340.f72397;
            int i2 = c22340.f72398;
            int i3 = c22340.f72395;
            int i4 = c22340.f72396;
            C21635 m2301 = m2301(interfaceC11733, i, i3);
            C21635 m23012 = m2301(interfaceC11732, i2, i4);
            arrayList.add(new C5407(i, i3, i2, i4, m2301.f69460, m2301.f69461, m23012.f69460, m23012.f69461, null));
            interfaceC11733 = interfaceC1173;
        }
        if (enumC21719 == EnumC21719.NONE) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            try {
                arrayList2.addAll(m2300(interfaceC0467, charSequence, charSequence2, enumC5491, enumC21719, c4701, i5 < 3));
            } catch (C15367 unused) {
                arrayList2.add(interfaceC0467);
                i5++;
            }
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m2300(InterfaceC0467 interfaceC0467, CharSequence charSequence, CharSequence charSequence2, EnumC5491 enumC5491, EnumC21719 enumC21719, C4701 c4701, boolean z) {
        InterfaceC1879 m30806;
        InterfaceC1879 m27621;
        if (enumC21719 == EnumC21719.NONE) {
            return Collections.singletonList(interfaceC0467);
        }
        CharSequence subSequence = charSequence.subSequence(interfaceC0467.mo15487(), interfaceC0467.mo15477());
        CharSequence subSequence2 = charSequence2.subSequence(interfaceC0467.mo15485(), interfaceC0467.mo15489());
        if (interfaceC0467.mo2065() == interfaceC0467.mo2063() || interfaceC0467.mo2068() == interfaceC0467.mo2072()) {
            if (C8313.m21915(subSequence, subSequence2, enumC5491)) {
                return Collections.singletonList(new C5407(interfaceC0467, Collections.EMPTY_LIST));
            }
            return Collections.singletonList(interfaceC0467);
        }
        if (!z) {
            return Collections.singletonList(interfaceC0467);
        }
        if (enumC21719 == EnumC21719.WORDS) {
            c4701.m13775();
            ArrayList m47825 = C21014.m47825(subSequence);
            ArrayList m478252 = C21014.m47825(subSequence2);
            InterfaceC6818 m43624 = new C4080(C23751.m52402(m47825, m478252, c4701), subSequence, subSequence2, m47825, m478252).m43624();
            ArrayList m13968 = new C4785(m43624, subSequence, subSequence2, m47825, m478252).m13968();
            ArrayList arrayList = new ArrayList(m13968.size());
            Iterator it = m13968.iterator();
            while (it.hasNext()) {
                C20308 c20308 = (C20308) it.next();
                C22340 c22340 = c20308.f65573;
                C22340 c223402 = c20308.f65574;
                int i = c223402.f72397;
                CharSequence subSequence3 = subSequence.subSequence(c22340.f72397, c22340.f72395);
                CharSequence subSequence4 = subSequence2.subSequence(c22340.f72398, c22340.f72396);
                int i2 = c223402.f72396;
                int i3 = c223402.f72398;
                int i4 = c223402.f72395;
                List subList = m47825.subList(i, i4);
                List subList2 = m478252.subList(i3, i2);
                ArrayList arrayList2 = m47825;
                InterfaceC6818 interfaceC6818 = m43624;
                ArrayList arrayList3 = arrayList;
                InterfaceC6818 m6470 = new C1963(subSequence3, subSequence4, subList, subList2, c22340.f72397, c22340.f72398, C23751.m52403(C23751.m52401(m43624, i, i4, i3, i2)), c4701).m6470();
                int i5 = C7628.f23574[enumC5491.ordinal()];
                if (i5 == 1) {
                    m27621 = new C11136(m6470, subSequence3, subSequence4).m27621();
                } else if (i5 == 2) {
                    m27621 = new C23835(new C11136(m6470, subSequence3, subSequence4).m27621(), subSequence3, subSequence4).m52531();
                } else if (i5 == 3) {
                    m27621 = new C16779(m6470, subSequence3, subSequence4).m39513();
                } else {
                    throw new IllegalArgumentException(enumC5491.name());
                }
                ArrayList m2299 = m2299(m27621);
                Iterator it2 = subList.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC18191) it2.next()) instanceof C14662) {
                        i6++;
                    }
                }
                Iterator it3 = subList2.iterator();
                int i7 = 0;
                while (it3.hasNext()) {
                    if (((InterfaceC18191) it3.next()) instanceof C14662) {
                        i7++;
                    }
                }
                arrayList3.add(new C17485(m2299, c22340, i6, i7));
                m47825 = arrayList2;
                arrayList = arrayList3;
                m43624 = interfaceC6818;
            }
            ArrayList arrayList4 = arrayList;
            int mo15487 = interfaceC0467.mo15487();
            int mo15485 = interfaceC0467.mo15485();
            int mo2065 = interfaceC0467.mo2065();
            int mo2068 = interfaceC0467.mo2068();
            ArrayList arrayList5 = new ArrayList();
            int i8 = 0;
            int i9 = mo2065;
            int i10 = mo2068;
            while (i8 < arrayList4.size()) {
                C17485 c17485 = (C17485) arrayList4.get(i8);
                C22340 c223403 = c17485.f53430;
                int mo2063 = i8 != arrayList4.size() + (-1) ? c17485.f53428 + i9 : interfaceC0467.mo2063();
                int mo2072 = i8 != arrayList4.size() + (-1) ? c17485.f53429 + i10 : interfaceC0467.mo2072();
                arrayList5.add(new C5407(i9, mo2063, i10, mo2072, c223403.f72397 + mo15487, c223403.f72395 + mo15487, c223403.f72398 + mo15485, c223403.f72396 + mo15485, c17485.f53427));
                i8++;
                mo15487 = mo15487;
                i9 = mo2063;
                i10 = mo2072;
            }
            return arrayList5;
        }
        if (enumC21719 != EnumC21719.CHARS) {
            throw new IllegalArgumentException(enumC21719.name());
        }
        if (enumC5491 == EnumC5491.DEFAULT) {
            m30806 = C12567.m30810(subSequence, subSequence2, c4701);
        } else if (enumC5491 == EnumC5491.TRIM_WHITESPACES) {
            m30806 = new C23835(C12567.m30810(subSequence, subSequence2, c4701), subSequence, subSequence2).m52531();
        } else {
            m30806 = C12567.m30806(subSequence, subSequence2, c4701);
        }
        return Collections.singletonList(new C5407(interfaceC0467, m2299(m30806)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2299(InterfaceC1879 interfaceC1879) {
        ArrayList arrayList = new ArrayList();
        Iterator mo6220 = interfaceC1879.mo6218().f41655.mo6220();
        while (mo6220.hasNext()) {
            C22340 c22340 = (C22340) mo6220.next();
            arrayList.add(new C19519(c22340.f72397, c22340.f72395, c22340.f72398, c22340.f72396));
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21635 m2301(InterfaceC1173 interfaceC1173, int i, int i2) {
        int mo3973;
        if (i == i2) {
            if (i < interfaceC1173.mo3970()) {
                mo3973 = interfaceC1173.mo3972(i);
            } else {
                mo3973 = interfaceC1173.mo3973(interfaceC1173.mo3970() - 1);
            }
            return new C21635(mo3973, mo3973);
        }
        return new C21635(interfaceC1173.mo3972(i), interfaceC1173.mo3973(i2 - 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2297(int i, int i2, CharSequence charSequence, InterfaceC1173 interfaceC1173) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(new C17673(interfaceC1173.mo3972(i), interfaceC1173.mo3971(i), charSequence));
            i++;
        }
        return arrayList;
    }
}
