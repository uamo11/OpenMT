package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: J16Q */
/* renamed from: l.᩻ܶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23767 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22856 f76936 = new C22856();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52437(C15094 c15094, InterfaceC13683 interfaceC13683, boolean z) {
        C5218 c5218;
        C5218 c52182;
        C5218 c52183;
        C5218 c52184;
        C5218 c52185;
        if (!(c15094 instanceof C21446) && c15094.m35740() && m52439(c15094)) {
            C21446.m48563(c15094, interfaceC13683, new C22856());
        }
        C5218 mo9453 = c15094.mo9453(EnumC0278.LEFT);
        C5218 mo94532 = c15094.mo9453(EnumC0278.RIGHT);
        int m15004 = mo9453.m15004();
        int m150042 = mo94532.m15004();
        char c = 0;
        if (mo9453.m14995() != null && mo9453.m15001()) {
            Iterator it = mo9453.m14995().iterator();
            while (it.hasNext()) {
                C5218 c52186 = (C5218) it.next();
                C15094 c150942 = c52186.f16341;
                boolean m52439 = m52439(c150942);
                C5218 c52187 = c150942.f46141;
                C5218 c52188 = c150942.f46159;
                if (c150942.m35740() && m52439) {
                    C21446.m48563(c150942, interfaceC13683, new C22856());
                }
                EnumC8040 enumC8040 = c150942.f46124[c];
                EnumC8040 enumC80402 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8040 != enumC80402 || m52439) {
                    if (!c150942.m35740()) {
                        if (c52186 == c52187 && c52188.f16339 == null) {
                            int m15007 = c52187.m15007() + m15004;
                            c150942.m35710(m15007, c150942.m35753() + m15007);
                            m52437(c150942, interfaceC13683, z);
                        } else if (c52186 == c52188 && c52187.f16339 == null) {
                            int m150072 = m15004 - c52188.m15007();
                            c150942.m35710(m150072 - c150942.m35753(), m150072);
                            m52437(c150942, interfaceC13683, z);
                        } else if (c52186 == c52187 && (c52183 = c52188.f16339) != null && c52183.m15001() && !c150942.m35729()) {
                            m52441(c150942, interfaceC13683, z);
                        }
                    }
                } else if (enumC8040 == enumC80402 && c150942.f46113 >= 0 && c150942.f46153 >= 0 && ((c150942.m35735() == 8 || (c150942.f46145 == 0 && c150942.f46108 == 0.0f)) && !c150942.m35729() && !c150942.m35748() && (((c52186 == c52187 && (c52185 = c52188.f16339) != null && c52185.m15001()) || (c52186 == c52188 && (c52184 = c52187.f16339) != null && c52184.m15001())) && !c150942.m35729()))) {
                    m52436(c15094, interfaceC13683, c150942, z);
                }
                c = 0;
            }
        }
        if ((c15094 instanceof C3101) || mo94532.m14995() == null || !mo94532.m15001()) {
            return;
        }
        Iterator it2 = mo94532.m14995().iterator();
        while (it2.hasNext()) {
            C5218 c52189 = (C5218) it2.next();
            C15094 c150943 = c52189.f16341;
            boolean m524392 = m52439(c150943);
            C5218 c521810 = c150943.f46141;
            C5218 c521811 = c150943.f46159;
            if (c150943.m35740() && m524392) {
                C21446.m48563(c150943, interfaceC13683, new C22856());
            }
            boolean z2 = (c52189 == c521810 && (c52182 = c521811.f16339) != null && c52182.m15001()) || (c52189 == c521811 && (c5218 = c521810.f16339) != null && c5218.m15001());
            EnumC8040 enumC80403 = c150943.f46124[0];
            EnumC8040 enumC80404 = EnumC8040.MATCH_CONSTRAINT;
            if (enumC80403 != enumC80404 || m524392) {
                if (!c150943.m35740()) {
                    if (c52189 == c521810 && c521811.f16339 == null) {
                        int m150073 = c521810.m15007() + m150042;
                        c150943.m35710(m150073, c150943.m35753() + m150073);
                        m52437(c150943, interfaceC13683, z);
                    } else if (c52189 == c521811 && c521810.f16339 == null) {
                        int m150074 = m150042 - c521811.m15007();
                        c150943.m35710(m150074 - c150943.m35753(), m150074);
                        m52437(c150943, interfaceC13683, z);
                    } else if (z2 && !c150943.m35729()) {
                        m52441(c150943, interfaceC13683, z);
                    }
                }
            } else if (enumC80403 == enumC80404 && c150943.f46113 >= 0 && c150943.f46153 >= 0 && (c150943.m35735() == 8 || (c150943.f46145 == 0 && c150943.f46108 == 0.0f))) {
                if (!c150943.m35729() && !c150943.m35748() && z2 && !c150943.m35729()) {
                    m52436(c15094, interfaceC13683, c150943, z);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52440(C15094 c15094, InterfaceC13683 interfaceC13683) {
        C5218 c5218;
        C5218 c52182;
        C5218 c52183;
        C5218 c52184;
        C5218 c52185;
        if (!(c15094 instanceof C21446) && c15094.m35740() && m52439(c15094)) {
            C21446.m48563(c15094, interfaceC13683, new C22856());
        }
        C5218 mo9453 = c15094.mo9453(EnumC0278.TOP);
        C5218 mo94532 = c15094.mo9453(EnumC0278.BOTTOM);
        int m15004 = mo9453.m15004();
        int m150042 = mo94532.m15004();
        if (mo9453.m14995() != null && mo9453.m15001()) {
            Iterator it = mo9453.m14995().iterator();
            while (it.hasNext()) {
                C5218 c52186 = (C5218) it.next();
                C15094 c150942 = c52186.f16341;
                boolean m52439 = m52439(c150942);
                C5218 c52187 = c150942.f46161;
                C5218 c52188 = c150942.f46133;
                if (c150942.m35740() && m52439) {
                    C21446.m48563(c150942, interfaceC13683, new C22856());
                }
                EnumC8040 enumC8040 = c150942.f46124[1];
                EnumC8040 enumC80402 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8040 != enumC80402 || m52439) {
                    if (!c150942.m35740()) {
                        if (c52186 == c52187 && c52188.f16339 == null) {
                            int m15007 = c52187.m15007() + m15004;
                            c150942.m35744(m15007, c150942.m35732() + m15007);
                            m52440(c150942, interfaceC13683);
                        } else if (c52186 == c52188 && c52188.f16339 == null) {
                            int m150072 = m15004 - c52188.m15007();
                            c150942.m35744(m150072 - c150942.m35732(), m150072);
                            m52440(c150942, interfaceC13683);
                        } else if (c52186 == c52187 && (c52183 = c52188.f16339) != null && c52183.m15001()) {
                            m52434(c150942, interfaceC13683);
                        }
                    }
                } else if (enumC8040 == enumC80402 && c150942.f46128 >= 0 && c150942.f46138 >= 0 && (c150942.m35735() == 8 || (c150942.f46170 == 0 && c150942.f46108 == 0.0f))) {
                    if (!c150942.m35749() && !c150942.m35748() && ((c52186 == c52187 && (c52185 = c52188.f16339) != null && c52185.m15001()) || (c52186 == c52188 && (c52184 = c52187.f16339) != null && c52184.m15001()))) {
                        if (!c150942.m35749()) {
                            m52435(c15094, interfaceC13683, c150942);
                        }
                    }
                }
            }
        }
        if (c15094 instanceof C3101) {
            return;
        }
        if (mo94532.m14995() != null && mo94532.m15001()) {
            Iterator it2 = mo94532.m14995().iterator();
            while (it2.hasNext()) {
                C5218 c52189 = (C5218) it2.next();
                C15094 c150943 = c52189.f16341;
                boolean m524392 = m52439(c150943);
                C5218 c521810 = c150943.f46161;
                C5218 c521811 = c150943.f46133;
                if (c150943.m35740() && m524392) {
                    C21446.m48563(c150943, interfaceC13683, new C22856());
                }
                boolean z = (c52189 == c521810 && (c52182 = c521811.f16339) != null && c52182.m15001()) || (c52189 == c521811 && (c5218 = c521810.f16339) != null && c5218.m15001());
                EnumC8040 enumC80403 = c150943.f46124[1];
                EnumC8040 enumC80404 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC80403 != enumC80404 || m524392) {
                    if (!c150943.m35740()) {
                        if (c52189 == c521810 && c521811.f16339 == null) {
                            int m150073 = c521810.m15007() + m150042;
                            c150943.m35744(m150073, c150943.m35732() + m150073);
                            m52440(c150943, interfaceC13683);
                        } else if (c52189 == c521811 && c521810.f16339 == null) {
                            int m150074 = m150042 - c521811.m15007();
                            c150943.m35744(m150074 - c150943.m35732(), m150074);
                            m52440(c150943, interfaceC13683);
                        } else if (z && !c150943.m35749()) {
                            m52434(c150943, interfaceC13683);
                        }
                    }
                } else if (enumC80403 == enumC80404 && c150943.f46128 >= 0 && c150943.f46138 >= 0 && (c150943.m35735() == 8 || (c150943.f46170 == 0 && c150943.f46108 == 0.0f))) {
                    if (!c150943.m35749() && !c150943.m35748() && z && !c150943.m35749()) {
                        m52435(c15094, interfaceC13683, c150943);
                    }
                }
            }
        }
        C5218 mo94533 = c15094.mo9453(EnumC0278.BASELINE);
        if (mo94533.m14995() == null || !mo94533.m15001()) {
            return;
        }
        int m150043 = mo94533.m15004();
        Iterator it3 = mo94533.m14995().iterator();
        while (it3.hasNext()) {
            C5218 c521812 = (C5218) it3.next();
            C15094 c150944 = c521812.f16341;
            boolean m524393 = m52439(c150944);
            if (c150944.m35740() && m524393) {
                C21446.m48563(c150944, interfaceC13683, new C22856());
            }
            if (c150944.f46124[1] != EnumC8040.MATCH_CONSTRAINT || m524393) {
                if (!c150944.m35740() && c521812 == c150944.f46126) {
                    c150944.m35777(m150043);
                    m52440(c150944, interfaceC13683);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52441(C15094 c15094, InterfaceC13683 interfaceC13683, boolean z) {
        float m35772 = c15094.m35772();
        C5218 c5218 = c15094.f46141;
        int m15004 = c5218.f16339.m15004();
        C5218 c52182 = c15094.f46159;
        int m150042 = c52182.f16339.m15004();
        int m15007 = c5218.m15007() + m15004;
        int m150072 = m150042 - c52182.m15007();
        if (m15004 == m150042) {
            m35772 = 0.5f;
        } else {
            m15004 = m15007;
            m150042 = m150072;
        }
        int m35753 = c15094.m35753();
        int i = (m150042 - m15004) - m35753;
        if (m15004 > m150042) {
            i = (m15004 - m150042) - m35753;
        }
        int i2 = ((int) ((m35772 * i) + 0.5f)) + m15004;
        int i3 = i2 + m35753;
        if (m15004 > m150042) {
            i3 = i2 - m35753;
        }
        c15094.m35710(i2, i3);
        m52437(c15094, interfaceC13683, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52434(C15094 c15094, InterfaceC13683 interfaceC13683) {
        float m35730 = c15094.m35730();
        C5218 c5218 = c15094.f46161;
        int m15004 = c5218.f16339.m15004();
        C5218 c52182 = c15094.f46133;
        int m150042 = c52182.f16339.m15004();
        int m15007 = c5218.m15007() + m15004;
        int m150072 = m150042 - c52182.m15007();
        if (m15004 == m150042) {
            m35730 = 0.5f;
        } else {
            m15004 = m15007;
            m150042 = m150072;
        }
        int m35732 = c15094.m35732();
        int i = (m150042 - m15004) - m35732;
        if (m15004 > m150042) {
            i = (m15004 - m150042) - m35732;
        }
        int i2 = (int) ((m35730 * i) + 0.5f);
        int i3 = m15004 + i2;
        int i4 = i3 + m35732;
        if (m15004 > m150042) {
            i3 = m15004 - i2;
            i4 = i3 - m35732;
        }
        c15094.m35744(i3, i4);
        m52440(c15094, interfaceC13683);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52436(C15094 c15094, InterfaceC13683 interfaceC13683, C15094 c150942, boolean z) {
        int m35753;
        float m35772 = c150942.m35772();
        C5218 c5218 = c150942.f46141;
        int m15007 = c5218.m15007() + c5218.f16339.m15004();
        C5218 c52182 = c150942.f46159;
        int m15004 = c52182.f16339.m15004() - c52182.m15007();
        if (m15004 >= m15007) {
            int m357532 = c150942.m35753();
            if (c150942.m35735() != 8) {
                int i = c150942.f46145;
                if (i == 2) {
                    if (c15094 instanceof C21446) {
                        m35753 = c15094.m35753();
                    } else {
                        m35753 = c15094.f46132.m35753();
                    }
                    m357532 = (int) (c150942.m35772() * 0.5f * m35753);
                } else if (i == 0) {
                    m357532 = m15004 - m15007;
                }
                m357532 = Math.max(c150942.f46153, m357532);
                int i2 = c150942.f46113;
                if (i2 > 0) {
                    m357532 = Math.min(i2, m357532);
                }
            }
            int i3 = m15007 + ((int) ((m35772 * ((m15004 - m15007) - m357532)) + 0.5f));
            c150942.m35710(i3, m357532 + i3);
            m52437(c150942, interfaceC13683, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52435(C15094 c15094, InterfaceC13683 interfaceC13683, C15094 c150942) {
        int m35732;
        float m35730 = c150942.m35730();
        C5218 c5218 = c150942.f46161;
        int m15007 = c5218.m15007() + c5218.f16339.m15004();
        C5218 c52182 = c150942.f46133;
        int m15004 = c52182.f16339.m15004() - c52182.m15007();
        if (m15004 >= m15007) {
            int m357322 = c150942.m35732();
            if (c150942.m35735() != 8) {
                int i = c150942.f46170;
                if (i == 2) {
                    if (c15094 instanceof C21446) {
                        m35732 = c15094.m35732();
                    } else {
                        m35732 = c15094.f46132.m35732();
                    }
                    m357322 = (int) (m35730 * 0.5f * m35732);
                } else if (i == 0) {
                    m357322 = m15004 - m15007;
                }
                m357322 = Math.max(c150942.f46138, m357322);
                int i2 = c150942.f46128;
                if (i2 > 0) {
                    m357322 = Math.min(i2, m357322);
                }
            }
            int i3 = m15007 + ((int) ((m35730 * ((m15004 - m15007) - m357322)) + 0.5f));
            c150942.m35744(i3, m357322 + i3);
            m52440(c150942, interfaceC13683);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52438(C21446 c21446, InterfaceC13683 interfaceC13683) {
        EnumC8040[] enumC8040Arr = c21446.f46124;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        EnumC8040 enumC80402 = enumC8040Arr[1];
        c21446.m35734();
        ArrayList arrayList = c21446.f18169;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C15094) arrayList.get(i)).m35734();
        }
        boolean m48578 = c21446.m48578();
        if (enumC8040 == EnumC8040.FIXED) {
            c21446.m35710(0, c21446.m35753());
        } else {
            c21446.m35723();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C15094 c15094 = (C15094) arrayList.get(i2);
            if (c15094 instanceof C3101) {
                C3101 c3101 = (C3101) c15094;
                if (c3101.m9463() == 1) {
                    if (c3101.m9454() != -1) {
                        c3101.m9452(c3101.m9454());
                    } else if (c3101.m9461() != -1 && c21446.mo7762()) {
                        c3101.m9452(c21446.m35753() - c3101.m9461());
                    } else if (c21446.mo7762()) {
                        c3101.m9452((int) ((c3101.m9456() * c21446.m35753()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c15094 instanceof C2396) && ((C2396) c15094).m7769() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C15094 c150942 = (C15094) arrayList.get(i3);
                if (c150942 instanceof C3101) {
                    C3101 c31012 = (C3101) c150942;
                    if (c31012.m9463() == 1) {
                        m52437(c31012, interfaceC13683, m48578);
                    }
                }
            }
        }
        m52437(c21446, interfaceC13683, m48578);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C15094 c150943 = (C15094) arrayList.get(i4);
                if (c150943 instanceof C2396) {
                    C2396 c2396 = (C2396) c150943;
                    if (c2396.m7769() == 0 && c2396.m7763()) {
                        m52437(c2396, interfaceC13683, m48578);
                    }
                }
            }
        }
        if (enumC80402 == EnumC8040.FIXED) {
            c21446.m35744(0, c21446.m35732());
        } else {
            c21446.m35747();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C15094 c150944 = (C15094) arrayList.get(i5);
            if (c150944 instanceof C3101) {
                C3101 c31013 = (C3101) c150944;
                if (c31013.m9463() == 0) {
                    if (c31013.m9454() != -1) {
                        c31013.m9452(c31013.m9454());
                    } else if (c31013.m9461() != -1 && c21446.mo7768()) {
                        c31013.m9452(c21446.m35732() - c31013.m9461());
                    } else if (c21446.mo7768()) {
                        c31013.m9452((int) ((c31013.m9456() * c21446.m35732()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c150944 instanceof C2396) && ((C2396) c150944).m7769() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C15094 c150945 = (C15094) arrayList.get(i6);
                if (c150945 instanceof C3101) {
                    C3101 c31014 = (C3101) c150945;
                    if (c31014.m9463() == 0) {
                        m52440(c31014, interfaceC13683);
                    }
                }
            }
        }
        m52440(c21446, interfaceC13683);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C15094 c150946 = (C15094) arrayList.get(i7);
                if (c150946 instanceof C2396) {
                    C2396 c23962 = (C2396) c150946;
                    if (c23962.m7769() == 1 && c23962.m7763()) {
                        m52440(c23962, interfaceC13683);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C15094 c150947 = (C15094) arrayList.get(i8);
            if (c150947.m35740() && m52439(c150947)) {
                C21446.m48563(c150947, interfaceC13683, f76936);
                m52437(c150947, interfaceC13683, m48578);
                m52440(c150947, interfaceC13683);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52439(C15094 c15094) {
        EnumC8040[] enumC8040Arr = c15094.f46124;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        EnumC8040 enumC80402 = enumC8040Arr[1];
        C15094 c150942 = c15094.f46132;
        C21446 c21446 = c150942 != null ? (C21446) c150942 : null;
        if (c21446 != null) {
            EnumC8040 enumC80403 = c21446.f46124[0];
            EnumC8040 enumC80404 = EnumC8040.FIXED;
        }
        if (c21446 != null) {
            EnumC8040 enumC80405 = c21446.f46124[1];
            EnumC8040 enumC80406 = EnumC8040.FIXED;
        }
        EnumC8040 enumC80407 = EnumC8040.FIXED;
        boolean z = enumC8040 == enumC80407 || enumC8040 == EnumC8040.WRAP_CONTENT || (enumC8040 == EnumC8040.MATCH_CONSTRAINT && c15094.f46145 == 0 && c15094.f46108 == 0.0f && c15094.m35761(0)) || c15094.mo7762();
        boolean z2 = enumC80402 == enumC80407 || enumC80402 == EnumC8040.WRAP_CONTENT || (enumC80402 == EnumC8040.MATCH_CONSTRAINT && c15094.f46170 == 0 && c15094.f46108 == 0.0f && c15094.m35761(1)) || c15094.mo7768();
        return (c15094.f46108 > 0.0f && (z || z2)) || (z && z2);
    }
}
