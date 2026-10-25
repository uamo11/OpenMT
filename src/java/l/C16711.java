package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: B19P */
/* renamed from: l.ܽܶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16711 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21446 f51322;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21446 f51324;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f51326;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC13683 f51327;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22856 f51328;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51325 = true;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51329 = true;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f51323 = new ArrayList();

    public C16711(C21446 c21446) {
        new ArrayList();
        this.f51327 = null;
        this.f51328 = new C22856();
        this.f51326 = new ArrayList();
        this.f51322 = c21446;
        this.f51324 = c21446;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39332(InterfaceC13683 interfaceC13683) {
        this.f51327 = interfaceC13683;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m39326(C21446 c21446, int i) {
        ArrayList arrayList = this.f51326;
        int size = arrayList.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C2601) arrayList.get(i2)).m8228(c21446, i));
        }
        return (int) j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39334(boolean z) {
        boolean z2;
        boolean z3 = this.f51325;
        boolean z4 = false;
        C21446 c21446 = this.f51322;
        if (z3 || this.f51329) {
            Iterator it = c21446.f18169.iterator();
            while (it.hasNext()) {
                C15094 c15094 = (C15094) it.next();
                c15094.m35742();
                c15094.f46117 = false;
                c15094.f46156.m37817();
                c15094.f46140.m43506();
            }
            c21446.m35742();
            c21446.f46117 = false;
            c21446.f46156.m37817();
            c21446.f46140.m43506();
            this.f51329 = false;
        }
        m39330(this.f51324);
        c21446.m35706(0);
        c21446.m35731(0);
        EnumC8040 m35741 = c21446.m35741(0);
        EnumC8040 m357412 = c21446.m35741(1);
        if (this.f51325) {
            m39331();
        }
        int m35774 = c21446.m35774();
        int m35775 = c21446.m35775();
        c21446.f46156.f25382.mo34849(m35774);
        c21446.f46140.f25382.mo34849(m35775);
        m39337();
        EnumC8040 enumC8040 = EnumC8040.WRAP_CONTENT;
        ArrayList arrayList = this.f51323;
        if (m35741 == enumC8040 || m357412 == enumC8040) {
            if (z) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((AbstractC8245) it2.next()).mo6243()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && m35741 == EnumC8040.WRAP_CONTENT) {
                c21446.m35717(EnumC8040.FIXED);
                c21446.m35770(m39326(c21446, 0));
                c21446.f46156.f25374.mo34849(c21446.m35753());
            }
            if (z && m357412 == EnumC8040.WRAP_CONTENT) {
                c21446.m35746(EnumC8040.FIXED);
                c21446.m35733(m39326(c21446, 1));
                c21446.f46140.f25374.mo34849(c21446.m35732());
            }
        }
        EnumC8040 enumC80402 = c21446.f46124[0];
        EnumC8040 enumC80403 = EnumC8040.FIXED;
        if (enumC80402 == enumC80403 || enumC80402 == EnumC8040.MATCH_PARENT) {
            int m35753 = c21446.m35753() + m35774;
            c21446.f46156.f25379.mo34849(m35753);
            c21446.f46156.f25374.mo34849(m35753 - m35774);
            m39337();
            EnumC8040 enumC80404 = c21446.f46124[1];
            if (enumC80404 == enumC80403 || enumC80404 == EnumC8040.MATCH_PARENT) {
                int m35732 = c21446.m35732() + m35775;
                c21446.f46140.f25379.mo34849(m35732);
                c21446.f46140.f25374.mo34849(m35732 - m35775);
            }
            m39337();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC8245 abstractC8245 = (AbstractC8245) it3.next();
            if (abstractC8245.f25376 != c21446 || abstractC8245.f25383) {
                abstractC8245.mo6242();
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC8245 abstractC82452 = (AbstractC8245) it4.next();
            if (z2 || abstractC82452.f25376 != c21446) {
                if (!abstractC82452.f25382.f53276) {
                    break;
                }
                if (!abstractC82452.f25379.f53276) {
                    if (!(abstractC82452 instanceof C20946)) {
                        break;
                    }
                }
                if (!abstractC82452.f25374.f53276 && !(abstractC82452 instanceof C1895) && !(abstractC82452 instanceof C20946)) {
                    break;
                }
            }
        }
        c21446.m35717(m35741);
        c21446.m35746(m357412);
        return z4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39335() {
        boolean z = this.f51325;
        C21446 c21446 = this.f51322;
        if (z) {
            Iterator it = c21446.f18169.iterator();
            while (it.hasNext()) {
                C15094 c15094 = (C15094) it.next();
                c15094.m35742();
                c15094.f46117 = false;
                C16005 c16005 = c15094.f46156;
                c16005.f25374.f53276 = false;
                c16005.f25383 = false;
                c16005.m37817();
                C18829 c18829 = c15094.f46140;
                c18829.f25374.f53276 = false;
                c18829.f25383 = false;
                c18829.m43506();
            }
            c21446.m35742();
            c21446.f46117 = false;
            C16005 c160052 = c21446.f46156;
            c160052.f25374.f53276 = false;
            c160052.f25383 = false;
            c160052.m37817();
            C18829 c188292 = c21446.f46140;
            c188292.f25374.f53276 = false;
            c188292.f25383 = false;
            c188292.m43506();
            m39331();
        }
        m39330(this.f51324);
        c21446.m35706(0);
        c21446.m35731(0);
        c21446.f46156.f25382.mo34849(0);
        c21446.f46140.f25382.mo34849(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39333(int i, boolean z) {
        boolean z2;
        EnumC8040 enumC8040;
        C21446 c21446 = this.f51322;
        boolean z3 = false;
        EnumC8040 m35741 = c21446.m35741(0);
        EnumC8040 m357412 = c21446.m35741(1);
        int m35774 = c21446.m35774();
        int m35775 = c21446.m35775();
        ArrayList arrayList = this.f51323;
        if (z && (m35741 == (enumC8040 = EnumC8040.WRAP_CONTENT) || m357412 == enumC8040)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC8245 abstractC8245 = (AbstractC8245) it.next();
                if (abstractC8245.f25378 == i && !abstractC8245.mo6243()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && m35741 == EnumC8040.WRAP_CONTENT) {
                    c21446.m35717(EnumC8040.FIXED);
                    c21446.m35770(m39326(c21446, 0));
                    c21446.f46156.f25374.mo34849(c21446.m35753());
                }
            } else if (z && m357412 == EnumC8040.WRAP_CONTENT) {
                c21446.m35746(EnumC8040.FIXED);
                c21446.m35733(m39326(c21446, 1));
                c21446.f46140.f25374.mo34849(c21446.m35732());
            }
        }
        if (i == 0) {
            EnumC8040 enumC80402 = c21446.f46124[0];
            if (enumC80402 == EnumC8040.FIXED || enumC80402 == EnumC8040.MATCH_PARENT) {
                int m35753 = c21446.m35753() + m35774;
                c21446.f46156.f25379.mo34849(m35753);
                c21446.f46156.f25374.mo34849(m35753 - m35774);
                z2 = true;
            }
            z2 = false;
        } else {
            EnumC8040 enumC80403 = c21446.f46124[1];
            if (enumC80403 == EnumC8040.FIXED || enumC80403 == EnumC8040.MATCH_PARENT) {
                int m35732 = c21446.m35732() + m35775;
                c21446.f46140.f25379.mo34849(m35732);
                c21446.f46140.f25374.mo34849(m35732 - m35775);
                z2 = true;
            }
            z2 = false;
        }
        m39337();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC8245 abstractC82452 = (AbstractC8245) it2.next();
            if (abstractC82452.f25378 == i && (abstractC82452.f25376 != c21446 || abstractC82452.f25383)) {
                abstractC82452.mo6242();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC8245 abstractC82453 = (AbstractC8245) it3.next();
            if (abstractC82453.f25378 == i && (z2 || abstractC82453.f25376 != c21446)) {
                if (!abstractC82453.f25382.f53276) {
                    break;
                }
                if (!abstractC82453.f25379.f53276) {
                    break;
                }
                if (!(abstractC82453 instanceof C1895) && !abstractC82453.f25374.f53276) {
                    break;
                }
            }
        }
        c21446.m35717(m35741);
        c21446.m35746(m357412);
        return z3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39328(C15094 c15094, EnumC8040 enumC8040, int i, EnumC8040 enumC80402, int i2) {
        C22856 c22856 = this.f51328;
        c22856.f73745 = enumC8040;
        c22856.f73753 = enumC80402;
        c22856.f73748 = i;
        c22856.f73747 = i2;
        this.f51327.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39330(C21446 c21446) {
        char c;
        EnumC8040 enumC8040;
        int i;
        EnumC8040 enumC80402;
        EnumC8040[] enumC8040Arr;
        EnumC8040 enumC80403;
        EnumC8040 enumC80404;
        EnumC8040 enumC80405;
        EnumC8040 enumC80406;
        EnumC8040 enumC80407;
        Iterator it = c21446.f18169.iterator();
        while (it.hasNext()) {
            C15094 c15094 = (C15094) it.next();
            EnumC8040[] enumC8040Arr2 = c15094.f46124;
            C5218[] c5218Arr = c15094.f46135;
            C5218 c5218 = c15094.f46133;
            C5218 c52182 = c15094.f46161;
            C5218 c52183 = c15094.f46159;
            C5218 c52184 = c15094.f46141;
            EnumC8040 enumC80408 = enumC8040Arr2[0];
            EnumC8040 enumC80409 = enumC8040Arr2[1];
            if (c15094.m35735() == 8) {
                c15094.f46117 = true;
            } else {
                float f = c15094.f46155;
                if (f < 1.0f && enumC80408 == EnumC8040.MATCH_CONSTRAINT) {
                    c15094.f46145 = 2;
                }
                float f2 = c15094.f46157;
                if (f2 < 1.0f) {
                    c = 0;
                    if (enumC80409 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46170 = 2;
                    }
                } else {
                    c = 0;
                }
                if (c15094.f46108 > 0.0f) {
                    EnumC8040 enumC804010 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC80408 == enumC804010 && (enumC80409 == EnumC8040.WRAP_CONTENT || enumC80409 == EnumC8040.FIXED)) {
                        c15094.f46145 = 3;
                    } else if (enumC80409 == enumC804010 && (enumC80408 == EnumC8040.WRAP_CONTENT || enumC80408 == EnumC8040.FIXED)) {
                        c15094.f46170 = 3;
                    } else if (enumC80408 == enumC804010 && enumC80409 == enumC804010) {
                        if (c15094.f46145 == 0) {
                            c15094.f46145 = 3;
                        }
                        if (c15094.f46170 == 0) {
                            c15094.f46170 = 3;
                        }
                    }
                }
                EnumC8040 enumC804011 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC80408 == enumC804011 && c15094.f46145 == 1 && (c52184.f16339 == null || c52183.f16339 == null)) {
                    enumC80408 = EnumC8040.WRAP_CONTENT;
                }
                if (enumC80409 == enumC804011 && c15094.f46170 == 1 && (c52182.f16339 == null || c5218.f16339 == null)) {
                    enumC80409 = EnumC8040.WRAP_CONTENT;
                }
                EnumC8040 enumC804012 = enumC80409;
                C16005 c16005 = c15094.f46156;
                c16005.f25377 = enumC80408;
                int i2 = c15094.f46145;
                c16005.f25380 = i2;
                C18829 c18829 = c15094.f46140;
                c18829.f25377 = enumC804012;
                Iterator it2 = it;
                int i3 = c15094.f46170;
                c18829.f25380 = i3;
                EnumC8040 enumC804013 = EnumC8040.MATCH_PARENT;
                if ((enumC80408 == enumC804013 || enumC80408 == EnumC8040.FIXED || enumC80408 == EnumC8040.WRAP_CONTENT) && (enumC804012 == enumC804013 || enumC804012 == EnumC8040.FIXED || enumC804012 == EnumC8040.WRAP_CONTENT)) {
                    int m35753 = c15094.m35753();
                    if (enumC80408 == enumC804013) {
                        m35753 = (c21446.m35753() - c52184.f16343) - c52183.f16343;
                        enumC8040 = EnumC8040.FIXED;
                    } else {
                        enumC8040 = enumC80408;
                    }
                    int m35732 = c15094.m35732();
                    if (enumC804012 == enumC804013) {
                        i = (c21446.m35732() - c52182.f16343) - c5218.f16343;
                        enumC80402 = EnumC8040.FIXED;
                    } else {
                        i = m35732;
                        enumC80402 = enumC804012;
                    }
                    m39328(c15094, enumC8040, m35753, enumC80402, i);
                    c15094.f46156.f25374.mo34849(c15094.m35753());
                    c15094.f46140.f25374.mo34849(c15094.m35732());
                    c15094.f46117 = true;
                } else {
                    if (enumC80408 == enumC804011 && (enumC804012 == (enumC80407 = EnumC8040.WRAP_CONTENT) || enumC804012 == EnumC8040.FIXED)) {
                        if (i2 == 3) {
                            if (enumC804012 == enumC80407) {
                                m39328(c15094, enumC80407, 0, enumC80407, 0);
                            }
                            int m357322 = c15094.m35732();
                            int i4 = (int) ((m357322 * c15094.f46108) + 0.5f);
                            EnumC8040 enumC804014 = EnumC8040.FIXED;
                            m39328(c15094, enumC804014, i4, enumC804014, m357322);
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        } else if (i2 == 1) {
                            m39328(c15094, enumC80407, 0, enumC804012, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                        } else if (i2 == 2) {
                            EnumC8040 enumC804015 = c21446.f46124[c];
                            EnumC8040 enumC804016 = EnumC8040.FIXED;
                            if (enumC804015 == enumC804016 || enumC804015 == enumC804013) {
                                m39328(c15094, enumC804016, (int) ((f * c21446.m35753()) + 0.5f), enumC804012, c15094.m35732());
                                c15094.f46156.f25374.mo34849(c15094.m35753());
                                c15094.f46140.f25374.mo34849(c15094.m35732());
                                c15094.f46117 = true;
                            }
                        } else if (c5218Arr[c].f16339 == null || c5218Arr[1].f16339 == null) {
                            m39328(c15094, enumC80407, 0, enumC804012, 0);
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        }
                    }
                    if (enumC804012 == enumC804011 && (enumC80408 == (enumC80406 = EnumC8040.WRAP_CONTENT) || enumC80408 == EnumC8040.FIXED)) {
                        if (i3 == 3) {
                            if (enumC80408 == enumC80406) {
                                m39328(c15094, enumC80406, 0, enumC80406, 0);
                            }
                            int m357532 = c15094.m35753();
                            float f3 = c15094.f46108;
                            if (c15094.m35776() == -1) {
                                f3 = 1.0f / f3;
                            }
                            EnumC8040 enumC804017 = EnumC8040.FIXED;
                            m39328(c15094, enumC804017, m357532, enumC804017, (int) ((m357532 * f3) + 0.5f));
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        } else if (i3 == 1) {
                            m39328(c15094, enumC80408, 0, enumC80406, 0);
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        } else if (i3 == 2) {
                            EnumC8040 enumC804018 = c21446.f46124[1];
                            EnumC8040 enumC804019 = EnumC8040.FIXED;
                            if (enumC804018 == enumC804019 || enumC804018 == enumC804013) {
                                m39328(c15094, enumC80408, c15094.m35753(), enumC804019, (int) ((f2 * c21446.m35732()) + 0.5f));
                                c15094.f46156.f25374.mo34849(c15094.m35753());
                                c15094.f46140.f25374.mo34849(c15094.m35732());
                                c15094.f46117 = true;
                            }
                        } else if (c5218Arr[2].f16339 == null || c5218Arr[3].f16339 == null) {
                            m39328(c15094, enumC80406, 0, enumC804012, 0);
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        }
                    }
                    if (enumC80408 == enumC804011 && enumC804012 == enumC804011) {
                        if (i2 == 1 || i3 == 1) {
                            EnumC8040 enumC804020 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804020, 0, enumC804020, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        } else if (i3 == 2 && i2 == 2 && (((enumC80403 = (enumC8040Arr = c21446.f46124)[c]) == (enumC80404 = EnumC8040.FIXED) || enumC80403 == enumC80404) && ((enumC80405 = enumC8040Arr[1]) == enumC80404 || enumC80405 == enumC80404))) {
                            m39328(c15094, enumC80404, (int) ((f * c21446.m35753()) + 0.5f), enumC80404, (int) ((f2 * c21446.m35732()) + 0.5f));
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39337() {
        C11568 c11568;
        Iterator it = this.f51322.f18169.iterator();
        while (it.hasNext()) {
            C15094 c15094 = (C15094) it.next();
            if (!c15094.f46117) {
                EnumC8040[] enumC8040Arr = c15094.f46124;
                boolean z = false;
                EnumC8040 enumC8040 = enumC8040Arr[0];
                EnumC8040 enumC80402 = enumC8040Arr[1];
                int i = c15094.f46145;
                int i2 = c15094.f46170;
                EnumC8040 enumC80403 = EnumC8040.WRAP_CONTENT;
                boolean z2 = enumC8040 == enumC80403 || (enumC8040 == EnumC8040.MATCH_CONSTRAINT && i == 1);
                if (enumC80402 == enumC80403 || (enumC80402 == EnumC8040.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C14594 c14594 = c15094.f46156.f25374;
                boolean z3 = c14594.f53276;
                C14594 c145942 = c15094.f46140.f25374;
                boolean z4 = c145942.f53276;
                if (z3 && z4) {
                    EnumC8040 enumC80404 = EnumC8040.FIXED;
                    m39328(c15094, enumC80404, c14594.f53271, enumC80404, c145942.f53271);
                    c15094.f46117 = true;
                } else if (z3 && z) {
                    m39328(c15094, EnumC8040.FIXED, c14594.f53271, enumC80403, c145942.f53271);
                    if (enumC80402 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46140.f25374.f44683 = c15094.m35732();
                    } else {
                        c15094.f46140.f25374.mo34849(c15094.m35732());
                        c15094.f46117 = true;
                    }
                } else if (z4 && z2) {
                    m39328(c15094, enumC80403, c14594.f53271, EnumC8040.FIXED, c145942.f53271);
                    if (enumC8040 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46156.f25374.f44683 = c15094.m35753();
                    } else {
                        c15094.f46156.f25374.mo34849(c15094.m35753());
                        c15094.f46117 = true;
                    }
                }
                if (c15094.f46117 && (c11568 = c15094.f46140.f59403) != null) {
                    c11568.mo34849(c15094.m35756());
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39336() {
        this.f51325 = true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39338() {
        this.f51329 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39331() {
        ArrayList arrayList = this.f51323;
        arrayList.clear();
        C21446 c21446 = this.f51324;
        c21446.f46156.mo6244();
        c21446.f46140.mo6244();
        arrayList.add(c21446.f46156);
        arrayList.add(c21446.f46140);
        Iterator it = c21446.f18169.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C15094 c15094 = (C15094) it.next();
            if (c15094 instanceof C3101) {
                C20946 c20946 = new C20946(c15094);
                c15094.f46156.mo6244();
                c15094.f46140.mo6244();
                c20946.f25378 = ((C3101) c15094).m9463();
                arrayList.add(c20946);
            } else {
                if (c15094.m35729()) {
                    if (c15094.f46137 == null) {
                        c15094.f46137 = new C1895(c15094, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c15094.f46137);
                } else {
                    arrayList.add(c15094.f46156);
                }
                if (c15094.m35749()) {
                    if (c15094.f46136 == null) {
                        c15094.f46136 = new C1895(c15094, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c15094.f46136);
                } else {
                    arrayList.add(c15094.f46140);
                }
                if (c15094 instanceof C12978) {
                    arrayList.add(new C9657(c15094));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC8245) it2.next()).mo6244();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC8245 abstractC8245 = (AbstractC8245) it3.next();
            if (abstractC8245.f25376 != c21446) {
                abstractC8245.mo6240();
            }
        }
        ArrayList arrayList2 = this.f51326;
        arrayList2.clear();
        C21446 c214462 = this.f51322;
        m39327(c214462.f46156, 0, arrayList2);
        m39327(c214462.f46140, 1, arrayList2);
        this.f51325 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39329(C17417 c17417, int i, ArrayList arrayList, C2601 c2601) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        C2601 c26012 = abstractC8245.f25375;
        C17417 c174172 = abstractC8245.f25379;
        C17417 c174173 = abstractC8245.f25382;
        if (c26012 == null) {
            C21446 c21446 = this.f51322;
            if (abstractC8245 == c21446.f46156 || abstractC8245 == c21446.f46140) {
                return;
            }
            if (c2601 == null) {
                c2601 = new C2601();
                c2601.f8220 = null;
                c2601.f8221 = new ArrayList();
                c2601.f8220 = abstractC8245;
                arrayList.add(c2601);
            }
            abstractC8245.f25375 = c2601;
            c2601.f8221.add(abstractC8245);
            Iterator it = c174173.f53269.iterator();
            while (it.hasNext()) {
                InterfaceC11068 interfaceC11068 = (InterfaceC11068) it.next();
                if (interfaceC11068 instanceof C17417) {
                    m39329((C17417) interfaceC11068, i, arrayList, c2601);
                }
            }
            Iterator it2 = c174172.f53269.iterator();
            while (it2.hasNext()) {
                InterfaceC11068 interfaceC110682 = (InterfaceC11068) it2.next();
                if (interfaceC110682 instanceof C17417) {
                    m39329((C17417) interfaceC110682, i, arrayList, c2601);
                }
            }
            if (i == 1 && (abstractC8245 instanceof C18829)) {
                Iterator it3 = ((C18829) abstractC8245).f59402.f53269.iterator();
                while (it3.hasNext()) {
                    InterfaceC11068 interfaceC110683 = (InterfaceC11068) it3.next();
                    if (interfaceC110683 instanceof C17417) {
                        m39329((C17417) interfaceC110683, i, arrayList, c2601);
                    }
                }
            }
            Iterator it4 = c174173.f53275.iterator();
            while (it4.hasNext()) {
                m39329((C17417) it4.next(), i, arrayList, c2601);
            }
            Iterator it5 = c174172.f53275.iterator();
            while (it5.hasNext()) {
                m39329((C17417) it5.next(), i, arrayList, c2601);
            }
            if (i == 1 && (abstractC8245 instanceof C18829)) {
                Iterator it6 = ((C18829) abstractC8245).f59402.f53275.iterator();
                while (it6.hasNext()) {
                    m39329((C17417) it6.next(), i, arrayList, c2601);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39327(AbstractC8245 abstractC8245, int i, ArrayList arrayList) {
        C17417 c17417 = abstractC8245.f25382;
        C17417 c174172 = abstractC8245.f25379;
        Iterator it = c17417.f53269.iterator();
        while (it.hasNext()) {
            InterfaceC11068 interfaceC11068 = (InterfaceC11068) it.next();
            if (interfaceC11068 instanceof C17417) {
                m39329((C17417) interfaceC11068, i, arrayList, null);
            } else if (interfaceC11068 instanceof AbstractC8245) {
                m39329(((AbstractC8245) interfaceC11068).f25382, i, arrayList, null);
            }
        }
        Iterator it2 = c174172.f53269.iterator();
        while (it2.hasNext()) {
            InterfaceC11068 interfaceC110682 = (InterfaceC11068) it2.next();
            if (interfaceC110682 instanceof C17417) {
                m39329((C17417) interfaceC110682, i, arrayList, null);
            } else if (interfaceC110682 instanceof AbstractC8245) {
                m39329(((AbstractC8245) interfaceC110682).f25379, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C18829) abstractC8245).f59402.f53269.iterator();
            while (it3.hasNext()) {
                InterfaceC11068 interfaceC110683 = (InterfaceC11068) it3.next();
                if (interfaceC110683 instanceof C17417) {
                    m39329((C17417) interfaceC110683, i, arrayList, null);
                }
            }
        }
    }
}
