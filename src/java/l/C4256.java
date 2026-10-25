package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: F15V */
/* renamed from: l.ۘ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4256 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f13781;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f13782;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f13783;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f13784;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f13785;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f13786;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13273 f13787;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f13788;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f13789;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f13790;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f13791;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f13792;

    public C4256(String str) {
        C13273 c13273 = new C13273(str, am.av, AbstractC14545.of((Object) "Z"));
        C13273 c132732 = new C13273(str, am.av, AbstractC14545.of((Object) "D"));
        C13273 c132733 = new C13273(str, am.av, AbstractC14545.of((Object) "F"));
        C13273 c132734 = new C13273(str, am.av, AbstractC14545.of((Object) "J"));
        C13273 c132735 = new C13273(str, am.av, AbstractC14545.of((Object) "I"));
        String str2 = "C";
        C13273 c132736 = new C13273(str, am.av, AbstractC14545.of((Object) "C"));
        C13273 c132737 = new C13273(str, am.av, AbstractC14545.of((Object) "Ljava/lang/Object;"));
        C13273 c132738 = new C13273(str, "b", AbstractC14545.of());
        ArrayList arrayList = new ArrayList(6);
        ArrayList arrayList2 = new ArrayList(6);
        ArrayList arrayList3 = new ArrayList(6);
        ArrayList arrayList4 = new ArrayList(6);
        ArrayList arrayList5 = new ArrayList(6);
        ArrayList arrayList6 = new ArrayList(6);
        ArrayList arrayList7 = new ArrayList(6);
        int i = 1;
        for (int i2 = 6; i <= i2; i2 = 6) {
            ArrayList arrayList8 = arrayList6;
            String str3 = str2;
            arrayList.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "Z")));
            arrayList2.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "D")));
            arrayList3.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "F")));
            arrayList4.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "J")));
            arrayList5.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "I")));
            arrayList8.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) str3)));
            arrayList7.add(new C13273(str, C19370.m44628(i, "b"), AbstractC14545.of((Object) "Ljava/lang/Object;")));
            i++;
            arrayList6 = arrayList8;
            str2 = str3;
        }
        ArrayList arrayList9 = arrayList6;
        String str4 = str2;
        C13273 c132739 = new C13273(str, am.aF, AbstractC14545.of((Object) "Z"));
        C13273 c1327310 = new C13273(str, am.aF, AbstractC14545.of((Object) "D"));
        C13273 c1327311 = new C13273(str, am.aF, AbstractC14545.of((Object) "F"));
        C13273 c1327312 = new C13273(str, am.aF, AbstractC14545.of((Object) "J"));
        C13273 c1327313 = new C13273(str, am.aF, AbstractC14545.of((Object) "I"));
        C13273 c1327314 = new C13273(str, am.aF, AbstractC14545.of((Object) str4));
        C13273 c1327315 = new C13273(str, am.aF, AbstractC14545.of((Object) "Ljava/lang/Object;"));
        C13273 c1327316 = new C13273(str, "d", AbstractC14545.of((Object) "Z"));
        C13273 c1327317 = new C13273(str, "d", AbstractC14545.of((Object) "D"));
        C13273 c1327318 = new C13273(str, "d", AbstractC14545.of((Object) "F"));
        C13273 c1327319 = new C13273(str, "d", AbstractC14545.of((Object) "J"));
        C13273 c1327320 = new C13273(str, "d", AbstractC14545.of((Object) "I"));
        C13273 c1327321 = new C13273(str, "d", AbstractC14545.of((Object) str4));
        C13273 c1327322 = new C13273(str, "d", AbstractC14545.of((Object) "Ljava/lang/Object;"));
        this.f13787 = c132738;
        this.f13792 = C20195.unmodifiableList(arrayList);
        this.f13785 = C20195.unmodifiableList(arrayList2);
        this.f13788 = C20195.unmodifiableList(arrayList3);
        this.f13789 = C20195.unmodifiableList(arrayList4);
        this.f13790 = C20195.unmodifiableList(arrayList5);
        this.f13781 = C20195.unmodifiableList(arrayList9);
        this.f13786 = C20195.unmodifiableList(arrayList7);
        this.f13791 = AbstractC14545.of((Object) c13273, (Object) c132732, (Object) c132733, (Object) c132734, (Object) c132735, (Object) c132736, (Object) c132737);
        this.f13782 = AbstractC14545.of((Object) arrayList, (Object) arrayList2, (Object) arrayList3, (Object) arrayList4, (Object) arrayList5, (Object) arrayList9, (Object) arrayList7);
        this.f13784 = AbstractC14545.of((Object) c132739, (Object) c1327310, (Object) c1327311, (Object) c1327312, (Object) c1327313, (Object) c1327314, (Object) c1327315);
        this.f13783 = AbstractC14545.of((Object) c1327316, (Object) c1327317, (Object) c1327318, (Object) c1327319, (Object) c1327320, (Object) c1327321, (Object) c1327322);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12804(String str) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case 66:
                if (str.equals("B")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 67:
                if (str.equals("C")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 68:
                if (str.equals("D")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 70:
                if (str.equals("F")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 73:
                if (str.equals("I")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 74:
                if (str.equals("J")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                if (str.equals("S")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case HRSS1373Polynomial.K /* 86 */:
                if (str.equals("V")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 90:
                if (str.equals("Z")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 4:
            case 6:
                return 4;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 2;
            case 5:
                return 3;
            case 7:
                return -1;
            case '\b':
                return 0;
            default:
                return 6;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12810(C19357 c19357, InterfaceC10952 interfaceC10952, InterfaceC1779 interfaceC1779, C1109 c1109, int i) {
        int m12804 = m12804(((InterfaceC5471) interfaceC10952.getReference()).mo3568());
        if (m12804 == -1) {
            return false;
        }
        m12807(c19357, (InterfaceC5471) this.f13791.get(m12804), interfaceC1779.mo1790(), m12804 == 3 || m12804 == 1, c1109, i);
        ArrayList m3804 = c1109.m3804();
        C17337 c17337 = null;
        C17337 c173372 = null;
        for (int size = m3804.size() - 1; size >= 0; size--) {
            C16631 c16631 = (C16631) m3804.get(size);
            C17337 c173373 = c16631.f51074;
            AbstractC13828 abstractC13828 = c16631.f51073;
            C17337 c173374 = c16631.f51072;
            int m37704 = c173373.m40667().m37704();
            int m377042 = c173374.m40667().m37704();
            if (i >= m37704 && i < m377042) {
                m3804.remove(size);
                if (i != m37704) {
                    if (c17337 == null) {
                        c17337 = c1109.m3805(i);
                    }
                    m3804.add(size, new C16631(c16631.f51074, c17337, abstractC13828));
                }
                int i2 = i + 1;
                if (i2 != m377042) {
                    if (c173372 == null) {
                        c173372 = c1109.m3805(i2);
                    }
                    m3804.add(size, new C16631(c173372, c173374, abstractC13828));
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12809(C19357 c19357, AbstractC7479 abstractC7479, C1109 c1109, int i) {
        int m12804 = m12804(((InterfaceC18877) ((InterfaceC10952) abstractC7479).getReference()).getType());
        if (m12804 == -1) {
            return false;
        }
        m12807(c19357, (InterfaceC5471) this.f13784.get(m12804), ((InterfaceC1779) abstractC7479).mo1790(), m12804 == 3 || m12804 == 1, c1109, i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12811(C19357 c19357, AbstractC7479 abstractC7479, C1109 c1109, int i) {
        int m12804 = m12804(((InterfaceC18877) ((InterfaceC10952) abstractC7479).getReference()).getType());
        if (m12804 == -1) {
            return false;
        }
        m12807(c19357, (InterfaceC5471) this.f13783.get(m12804), ((InterfaceC1779) abstractC7479).mo1790(), m12804 == 3 || m12804 == 1, c1109, i);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12807(C19357 c19357, InterfaceC5471 interfaceC5471, int i, boolean z, C1109 c1109, int i2) {
        AbstractC7479 c21510;
        C12321 m9577 = c19357.f68923.m9577(interfaceC5471);
        if ((!z && i <= 15) || i < 15) {
            c21510 = new C1048(EnumC0841.f3052, z ? 2 : 1, i, z ? i + 1 : 0, 0, 0, 0, m9577);
        } else {
            c21510 = new C21510(EnumC0841.f3133, i, z ? 2 : 1, m9577);
        }
        c1109.m3807(i2, c21510);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m12808(InterfaceC10952 interfaceC10952) {
        int i;
        EnumC0841 mo3975 = interfaceC10952.mo3975();
        InterfaceC5471 interfaceC5471 = (InterfaceC5471) interfaceC10952.getReference();
        ArrayList arrayList = new ArrayList();
        List<CharSequence> mo3565 = interfaceC5471.mo3565();
        if (mo3975 == EnumC0841.f3052 || mo3975 == EnumC0841.f3133) {
            i = 0;
        } else {
            arrayList.add(new C2845(this, arrayList.size(), m12805(interfaceC10952, 0), m12804(interfaceC5471.mo3566()), false));
            i = 1;
        }
        for (CharSequence charSequence : mo3565) {
            int i2 = i + 1;
            int m12805 = m12805(interfaceC10952, i);
            int m12804 = m12804(charSequence.toString());
            boolean z = m12804 == 3 || m12804 == 1;
            arrayList.add(new C2845(this, arrayList.size(), m12805, m12804, z));
            i = z ? i + 2 : i2;
            if (arrayList.size() == 6) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12805(InterfaceC10952 interfaceC10952, int i) {
        if (interfaceC10952 instanceof InterfaceC9978) {
            InterfaceC9978 interfaceC9978 = (InterfaceC9978) interfaceC10952;
            if (i >= interfaceC9978.mo3615()) {
                return -1;
            }
            if (i == 0) {
                return interfaceC9978.mo3614();
            }
            if (i == 1) {
                return interfaceC9978.mo3612();
            }
            if (i == 2) {
                return interfaceC9978.mo3611();
            }
            if (i == 3) {
                return interfaceC9978.mo3613();
            }
            if (i == 4) {
                return interfaceC9978.mo3610();
            }
        } else if (interfaceC10952 instanceof InterfaceC16595) {
            InterfaceC16595 interfaceC16595 = (InterfaceC16595) interfaceC10952;
            if (i >= interfaceC16595.mo3615()) {
                return -1;
            }
            return interfaceC16595.mo9712() + i;
        }
        throw new RuntimeException();
    }
}
