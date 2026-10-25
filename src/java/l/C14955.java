package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: K608 */
/* renamed from: l.ܶۗۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14955 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5637 f45603;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f45604 = new ArrayList();

    public C14955(C5637 c5637) {
        this.f45603 = c5637;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35429(C21307 c21307, EnumC7900 enumC7900) {
        Set mo1218 = enumC7900.mo1218(c21307);
        if (mo1218 != null) {
            if (mo1218.size() > 1) {
                ArrayList arrayList = new ArrayList(mo1218);
                C21307 m48337 = ((C21307) arrayList.get(0)).m48337();
                for (int i = 1; i < arrayList.size(); i++) {
                    m48337.m48339((C21307) arrayList.get(i));
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35430(String str, String str2) {
        String[] strArr;
        if (!str.equals(str2)) {
            EnumC3520 m10714 = EnumC3520.m10714(str);
            EnumC3520 m107142 = EnumC3520.m10714(str2);
            boolean z = m10714.f11198;
            if (!z || m107142.f11198) {
                if (!z && m107142.f11198) {
                    return str2;
                }
                if (z) {
                    EnumC3520 enumC3520 = EnumC3520.INT;
                    if ((m10714 == enumC3520 && m107142 == EnumC3520.BOOLEAN) || (m107142 == enumC3520 && m10714 == EnumC3520.BOOLEAN)) {
                        return "I";
                    }
                    if (m10714 != m107142) {
                        throw new RuntimeException();
                    }
                    if (m10714 == enumC3520) {
                        for (int i = 3; i >= 0; i--) {
                            strArr = C22012.f70566;
                            String str3 = strArr[i];
                            if (str.equals(str3) || str2.equals(str3)) {
                                return str3;
                            }
                        }
                        return "I";
                    }
                    if (m10714 == EnumC3520.OBJECT) {
                        int m35421 = m35421(str);
                        int m354212 = m35421(str2);
                        if (m35421 == 0 || m354212 == 0) {
                            if (!str.equals(str2) && ("L".endsWith(str) || (!"L".equals(str2) && str.compareTo(str2) <= 0))) {
                                return str2;
                            }
                        } else {
                            String substring = str.substring(m35421);
                            String substring2 = str2.substring(m354212);
                            if (m35421 < m354212) {
                                if (substring2.charAt(0) != 'L') {
                                    m354212--;
                                }
                                return m35422(m354212, "L");
                            }
                            if (m35421 > m354212) {
                                if (substring.charAt(0) != 'L') {
                                    m35421--;
                                }
                                return m35422(m35421, "L");
                            }
                            if (substring.charAt(0) != 'L' || substring2.charAt(0) != 'L') {
                                return m35422(m35421 - 1, "L");
                            }
                            return m35422(m35421, "L");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return EnumC3520.m10715(m10714, m107142).f11199;
                }
            }
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35422(int i, String str) {
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35421(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35427(AbstractC8396 abstractC8396, boolean z) {
        int i = C2256.f7331[abstractC8396.f25747.ordinal()];
        if (i == 1) {
            AbstractC18980 abstractC18980 = (AbstractC18980) abstractC8396;
            EnumC1340 enumC1340 = abstractC18980.f25745;
            switch (C2256.f7333[enumC1340.ordinal()]) {
                case 2:
                    C17568 c17568 = (C17568) abstractC18980;
                    m35425(c17568, c17568.f53685);
                    return;
                case 3:
                case 4:
                case 5:
                    C21097 c21097 = (C21097) abstractC18980;
                    String str = c21097.f68039;
                    if (str == null && enumC1340 == EnumC1340.EXCEPTION_REF) {
                        str = "Ljava/lang/Throwable;";
                    }
                    m35425(c21097, str);
                    return;
                case 6:
                    C9808 c9808 = (C9808) abstractC18980;
                    String str2 = c9808.f29646;
                    if (z) {
                        m35425(c9808, str2);
                        return;
                    } else {
                        m35431(c9808, str2);
                        return;
                    }
                case 7:
                    C11987 c11987 = (C11987) abstractC18980;
                    Object obj = c11987.f35889;
                    if (obj instanceof String) {
                        m35425(c11987, "Ljava/lang/String;");
                        return;
                    }
                    if (obj instanceof C22860) {
                        m35425(c11987, "Ljava/lang/Class;");
                        return;
                    }
                    if (!(obj instanceof Number)) {
                        if (obj instanceof Character) {
                            m35425(c11987, "C");
                            return;
                        } else {
                            m35425(c11987, "L");
                            return;
                        }
                    }
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        int intValue = ((Number) obj).intValue();
                        if (intValue == 0) {
                            m35425(c11987, EnumC3520.ZIFL.f11199);
                            return;
                        } else if (intValue == 1) {
                            m35425(c11987, EnumC3520.ZIF.f11199);
                            return;
                        } else {
                            m35425(c11987, EnumC3520.IF.f11199);
                            return;
                        }
                    }
                    if (obj instanceof Long) {
                        m35425(c11987, "w");
                        return;
                    } else if (obj instanceof Float) {
                        m35425(c11987, "F");
                        return;
                    } else {
                        if (obj instanceof Double) {
                            m35425(c11987, "D");
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        if (i == 2) {
            AbstractC19686 abstractC19686 = (AbstractC19686) abstractC8396;
            AbstractC8396 abstractC83962 = abstractC19686.f63597;
            switch (C2256.f7333[abstractC19686.f25745.ordinal()]) {
                case 8:
                    C6342 c6342 = (C6342) abstractC19686;
                    String str3 = c6342.f19648;
                    if (str3.equals("B")) {
                        EnumC3520 enumC3520 = EnumC3520.ZI;
                        m35431(abstractC83962, enumC3520.f11199);
                        m35425(abstractC19686, enumC3520.f11199);
                        break;
                    } else {
                        m35431(abstractC83962, c6342.f19649);
                        m35425(abstractC19686, str3);
                        break;
                    }
                case 9:
                    C14102 c14102 = (C14102) abstractC19686;
                    String str4 = c14102.f42578;
                    if (z) {
                        m35425(c14102, str4);
                    } else {
                        m35431(c14102, str4);
                    }
                    if (abstractC83962 != null) {
                        m35431(abstractC83962, c14102.f42579);
                        break;
                    }
                    break;
                case 10:
                    C16156 c16156 = (C16156) abstractC19686;
                    m35425(c16156, c16156.f49779);
                    m35431(abstractC83962, "L");
                    break;
                case 11:
                    m35425((C16156) abstractC19686, "Z");
                    m35431(abstractC83962, "L");
                    break;
                case 12:
                    C16156 c161562 = (C16156) abstractC19686;
                    m35425(c161562, "[" + c161562.f49779);
                    m35431(abstractC83962, "I");
                    break;
                case 13:
                    m35425((C4163) abstractC19686, "I");
                    m35431(abstractC83962, "[?");
                    break;
                case 14:
                case 15:
                    C4163 c4163 = (C4163) abstractC19686;
                    String str5 = c4163.f13577;
                    m35425(c4163, str5);
                    m35431(abstractC83962, str5);
                    break;
            }
            if (abstractC83962 != null) {
                m35427(abstractC83962, true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            AbstractC5574 abstractC5574 = (AbstractC5574) abstractC8396;
            AbstractC8396[] abstractC8396Arr = abstractC5574.f17269;
            switch (C2256.f7333[abstractC5574.f25745.ordinal()]) {
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                    AbstractC13397 abstractC13397 = (AbstractC13397) abstractC5574;
                    String m27469 = abstractC13397.mo6720().m27469();
                    m35425(abstractC5574, m27469);
                    m35431(abstractC5574, m27469);
                    String[] m27468 = abstractC13397.mo6720().m27468();
                    if (m27468.length != abstractC8396Arr.length) {
                        if (m27468.length + 1 != abstractC8396Arr.length) {
                            throw new RuntimeException();
                        }
                        m35431(abstractC8396Arr[0], "L");
                        for (int i2 = 1; i2 < abstractC8396Arr.length; i2++) {
                            m35431(abstractC8396Arr[i2], m27468[i2 - 1]);
                        }
                        break;
                    } else {
                        for (int i3 = 0; i3 < abstractC8396Arr.length; i3++) {
                            m35431(abstractC8396Arr[i3], m27468[i3]);
                        }
                        break;
                    }
                case 49:
                    C7753 c7753 = (C7753) abstractC5574;
                    String str6 = c7753.f23980;
                    for (AbstractC8396 abstractC83963 : abstractC8396Arr) {
                        m35431(abstractC83963, str6);
                    }
                    m35425(c7753, C20094.m46315("[", str6));
                    break;
                case 50:
                    C14745 c14745 = (C14745) abstractC5574;
                    for (AbstractC8396 abstractC83964 : abstractC8396Arr) {
                        m35431(abstractC83964, "I");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < c14745.f45025; i4++) {
                        sb.append('[');
                    }
                    sb.append(c14745.f45026);
                    m35425(c14745, sb.toString());
                    break;
                case 51:
                    for (AbstractC8396 abstractC83965 : abstractC8396Arr) {
                        m35426(abstractC83965, abstractC5574);
                    }
                    break;
            }
            for (AbstractC8396 abstractC83966 : abstractC5574.f17269) {
                m35427(abstractC83966, true);
            }
            return;
        }
        AbstractC0634 abstractC0634 = (AbstractC0634) abstractC8396;
        AbstractC8396 abstractC83967 = abstractC0634.f2428;
        abstractC83967.getClass();
        AbstractC8396 abstractC83968 = abstractC0634.f2429;
        abstractC83968.getClass();
        switch (C2256.f7333[abstractC0634.f25745.ordinal()]) {
            case 16:
                m35431(abstractC83968, "I");
                String str7 = ((C12692) abstractC0634).f38211;
                m35431(abstractC83967, C20094.m46315("[", str7));
                if (z) {
                    m35425(abstractC0634, str7);
                    C21307 m35424 = m35424(abstractC83967);
                    C21307 m354242 = m35424(abstractC0634);
                    if (m35424.f68687 == null) {
                        m35424.f68687 = new HashSet(3);
                    }
                    m35424.f68687.add(m354242);
                    if (m354242.f68679 == null) {
                        m354242.f68679 = new HashSet(3);
                    }
                    m354242.f68679.add(m35424);
                    break;
                } else {
                    m35431(abstractC0634, str7);
                    C21307 m354243 = m35424(abstractC83967);
                    C21307 m354244 = m35424(abstractC0634);
                    if (m354243.f68680 == null) {
                        m354243.f68680 = new HashSet(3);
                    }
                    m354243.f68680.add(m354244);
                    if (m354244.f68679 == null) {
                        m354244.f68679 = new HashSet(3);
                    }
                    m354244.f68679.add(m354243);
                    break;
                }
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                String str8 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83967, str8);
                m35431(abstractC83968, str8);
                m35425(abstractC0634, "I");
                break;
            case 22:
            case 23:
                AbstractC8396 abstractC83969 = abstractC0634.f2429;
                EnumC3520 enumC35202 = EnumC3520.ZIL;
                m35431(abstractC83969, enumC35202.f11199);
                m35431(abstractC0634.f2428, enumC35202.f11199);
                AbstractC8396 abstractC839610 = abstractC0634.f2428;
                AbstractC8396 abstractC839611 = abstractC0634.f2429;
                C21307 m354245 = m35424(abstractC839610);
                C21307 m354246 = m35424(abstractC839611);
                if (m354245.f68688 == null) {
                    m354245.f68688 = new HashSet(3);
                }
                if (m354246.f68688 == null) {
                    m354246.f68688 = new HashSet(3);
                }
                m354245.f68688.add(m354246);
                m354246.f68688.add(m354245);
                m35425(abstractC0634, "Z");
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                String str9 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83967, str9);
                m35431(abstractC83968, str9);
                m35425(abstractC0634, "Z");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                String str10 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83967, str10);
                m35431(abstractC83968, str10);
                m35425(abstractC0634, str10);
                break;
            case 36:
            case 37:
            case 38:
                String str11 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83967, str11);
                m35431(abstractC83968, str11);
                if (!"J".equals(str11) && !"w".equals(str11)) {
                    m35425(abstractC0634, EnumC3520.ZI.f11199);
                    break;
                } else {
                    m35425(abstractC0634, str11);
                    break;
                }
                break;
            case 39:
            case 40:
            case 41:
                String str12 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83967, str12);
                m35431(abstractC83968, "I");
                m35425(abstractC0634, str12);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        m35427(abstractC83967, true);
        m35427(abstractC83968, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21307 m35424(AbstractC8396 abstractC8396) {
        Object obj = abstractC8396.f25748;
        if (!(obj instanceof C21307)) {
            C21307 c21307 = new C21307(abstractC8396);
            this.f45604.add(c21307);
            abstractC8396.f25748 = c21307;
            return c21307;
        }
        return (C21307) obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35426(AbstractC8396 abstractC8396, AbstractC8396 abstractC83962) {
        C21307 m35424 = m35424(abstractC8396);
        C21307 m354242 = m35424(abstractC83962);
        if (m35424.f68683 == null) {
            m35424.f68683 = new HashSet();
        }
        m35424.f68683.add(m354242);
        if (m354242.f68684 == null) {
            m354242.f68684 = new HashSet();
        }
        m354242.f68684.add(m35424);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35425(AbstractC8396 abstractC8396, String str) {
        C21307 m48337 = m35424(abstractC8396).m48337();
        m48337.f68689 = str;
        m48337.m48340(EnumC3520.m10714(str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35428(AbstractC14039 abstractC14039) {
        if (abstractC14039.f5638 == EnumC7690.FILL_ARRAY_DATA) {
            m35426(abstractC14039.f42444, abstractC14039.f42445);
            return;
        }
        AbstractC8396 abstractC8396 = abstractC14039.f42445;
        AbstractC8396 abstractC83962 = abstractC14039.f42444;
        m35426(abstractC8396, abstractC83962);
        m35427(abstractC8396, true);
        m35427(abstractC83962, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.֫ۙۖ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m35432() {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14955.m35432():java.util.ArrayList");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f45604.iterator();
        while (it.hasNext()) {
            sb.append((C21307) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35431(AbstractC8396 abstractC8396, String str) {
        C21307 m35424 = m35424(abstractC8396);
        if (m35424.f68682 == null) {
            m35424.f68682 = new HashSet();
        }
        m35424.f68682.add(str);
        m35424.m48340(EnumC3520.m10714(str));
    }
}
