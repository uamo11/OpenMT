package l;

import bin.mt.json.JSON;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: G7AI */
/* renamed from: l.ۡᩳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9042 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f27416 = "0123456789abcdef".toCharArray();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SoftReference f27417;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f27418;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SoftReference f27419;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19626 f27420;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27421;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23316(C9042 c9042, C1986 c1986, int i, C23528 c23528, boolean z, C18878 c18878, C11138 c11138, String str, HashSet hashSet, C4766 c4766, int i2, ArrayList arrayList, int i3, C13232 c13232) {
        String str2;
        C23942 c23942;
        C1965 c1965;
        c9042.getClass();
        int i4 = c1986.f6644;
        int i5 = i4 + 1;
        c1986.f6644 = i5;
        if (i4 >= i && ((str2 = c23528.f75542) == null || c13232.m32096(str2))) {
            if (!z) {
                if (!"resource_table_id".equals(str)) {
                    if ("resource_table_name".equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c13232.f39606);
                        sb.append("/");
                        String str3 = c13232.f39605;
                        sb.append(str3);
                        C1965 m27623 = c11138.m27623(sb.toString(), "resource_table_type_name");
                        C1965 m276232 = m27623 != null ? m27623 : c11138.m27623(str3, "resource_table_name");
                        if (m276232 != null) {
                            c23942 = new C23942("resource", str, "name", m276232, null, c13232, null, null, null, null);
                        }
                    }
                    c23942 = null;
                } else {
                    int i6 = c13232.f39608;
                    if (i6 != i2) {
                        c1965 = null;
                    } else {
                        String m23294 = m23294(i6);
                        c1965 = new C1965("resource_table_id", 0, m23294.length(), m23294);
                    }
                    if (c1965 != null) {
                        c23942 = new C23942("resource", str, "id", c1965, null, c13232, null, null, null, null);
                    }
                    c23942 = null;
                }
            } else {
                final C18214 c18214 = new C18214(c18878, c23528, str, c13232, hashSet, c11138);
                m23314(c18878, c13232, new InterfaceC12527() { // from class: l.ܺܽۜ
                    @Override // l.InterfaceC12527
                    /* renamed from: ֫ */
                    public final boolean mo24676(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
                        return C18214.this.m42437(interfaceC7099, interfaceC21211);
                    }
                }, c4766);
                c23942 = c18214.f56611;
            }
            if (c23942 != null) {
                arrayList.add(c23942);
                if (arrayList.size() >= i3) {
                    c1986.f6645 = true;
                    c1986.f6646 = i5;
                    return true;
                }
            }
        }
        return false;
    }

    public C9042(C19626 c19626) {
        this.f27418 = new Object();
        this.f27420 = c19626;
        this.f27421 = new ArrayList();
    }

    public C9042(C19626 c19626, ArrayList arrayList) {
        this.f27418 = new Object();
        this.f27420 = c19626;
        this.f27421 = C4103.m12318(arrayList);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m23339() {
        return new ArrayList(this.f27421);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9042 m23304(C19626 c19626) {
        C9042 c9042 = new C9042(c19626);
        c9042.m23328();
        return c9042;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9042 m23305(C19626 c19626, ArrayList arrayList) {
        C9042 c9042 = new C9042(c19626, arrayList);
        c9042.m23328();
        return c9042;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6177 m23330(int i, int i2, String str, final HashSet hashSet) {
        String str2;
        final C18878 m23328 = m23328();
        final C11822 c11822 = new C11822(str, i, i2);
        m23313(m23328, new InterfaceC10411() { // from class: l.ۜܽۜ
            @Override // l.InterfaceC10411
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean mo18654(C13232 c13232) {
                C11822 c118222 = C11822.this;
                ArrayList arrayList = c118222.f35269;
                c118222.f35273++;
                if (!c13232.m32096(c118222.f35274)) {
                    return false;
                }
                if (c118222.f35271 >= c118222.f35272 && arrayList.size() < c118222.f35270) {
                    arrayList.add(c13232);
                }
                c118222.f35271++;
                return false;
            }
        });
        ArrayList arrayList = c11822.f35269;
        int size = arrayList.size() + c11822.f35272;
        int i3 = c11822.f35273;
        int i4 = c11822.f35271;
        C6177 c6177 = new C6177(arrayList, i3, i4, size, size < i4);
        C4766 c4766 = new C4766();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13232 c13232 = (C13232) it.next();
            final C21037 c21037 = new C21037();
            m23314(m23328, c13232, new InterfaceC12527() { // from class: l.ۢܽۜ
                @Override // l.InterfaceC12527
                /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final boolean mo24676(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
                    C21037 c210372 = C21037.this;
                    c210372.f67882.add(C2692.m8426(interfaceC7099));
                    c210372.f67881.add(C9042.m23326(interfaceC21211));
                    C11159 m23308 = C9042.m23308(m23328, interfaceC7099, interfaceC21211, 300, -1, 0, 0, hashSet, null);
                    if ("item_list".equals(m23308.f33502)) {
                        return false;
                    }
                    c210372.f67880.add(m23308);
                    return false;
                }
            }, c4766);
            c13232.f39610 = c21037.m47864().size();
            LinkedHashSet linkedHashSet = c21037.f67881;
            if (linkedHashSet.size() > 1) {
                str2 = "mixed";
            } else {
                str2 = linkedHashSet.contains("item_list") ? "item_list" : "single_value";
            }
            c13232.f39604 = str2;
            Iterator it2 = c21037.f67880.iterator();
            C11159 c11159 = null;
            while (true) {
                if (it2.hasNext()) {
                    C11159 c111592 = (C11159) it2.next();
                    if ("default".equals(c111592.f33488)) {
                        c11159 = c111592;
                        break;
                    }
                    if (c11159 == null || m23291(c111592.f33488, c11159.f33488) < 0) {
                        c11159 = c111592;
                    }
                }
            }
            c13232.f39609 = c11159;
        }
        return c6177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23110 m23336(String str, HashSet hashSet) {
        C18878 m23328 = m23328();
        int m23324 = m23324(str, "locator");
        C15348 c15348 = new C15348(m23328, m23324, "default", 20, 4096, 32768, 50, 0, hashSet);
        m23312(m23328, m23324, new C20995(c15348));
        if (c15348.f47039 == null) {
            return null;
        }
        ArrayList m36385 = c15348.m36385();
        c15348.f47039.f39610 = m36385.size();
        String str2 = c15348.f47037;
        if (!"*".equals(str2) && !m36385.contains(str2)) {
            C3059 m9364 = C3059.m9364("Resource variant not found", "variant", JSON.value("default"), C0899.m3247(m36385), JSON.object().add("variant", "default"));
            m9364.f9609.put("availableVariants", C0899.m3247(m36385));
            throw m9364;
        }
        c15348.m36386();
        ArrayList arrayList = c15348.f47031;
        int size = arrayList.size();
        int i = c15348.f47035;
        return new C23110(c15348.f47039, m36385, arrayList, size, size < i, i, "default");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23110 m23335(String str, String str2, int i, int i2, int i3, int i4, HashSet hashSet) {
        C18878 m23328 = m23328();
        int m23324 = m23324(str, "locator");
        C15348 c15348 = new C15348(m23328, m23324, str2, 1, i, i2, i3, i4, hashSet);
        m23312(m23328, m23324, new C20995(c15348));
        if (c15348.f47039 == null) {
            return null;
        }
        ArrayList m36385 = c15348.m36385();
        c15348.f47039.f39610 = m36385.size();
        if (!m36385.contains(str2)) {
            return new C23110(c15348.f47039, m36385, new ArrayList(), 0, false, 0, str2);
        }
        c15348.m36386();
        C13232 c13232 = c15348.f47039;
        ArrayList arrayList = c15348.f47031;
        return new C23110(c13232, m36385, arrayList, arrayList.size(), false, c15348.f47035, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7588 m23332(final C23528 c23528, final String str, final int i, final HashSet hashSet, final int i2) {
        final int i3;
        C16781 c16781 = c23528.f75548;
        final ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return new C7588(arrayList, i, true);
        }
        if (!"resource_table_id".equals(str)) {
            i3 = 0;
        } else {
            if (!"literal".equals(c16781.f51542)) {
                return new C7588(arrayList, i, false);
            }
            long m23293 = m23293(c23528.f75538);
            if (m23293 < 0) {
                return new C7588(arrayList, i, false);
            }
            i3 = (int) m23293;
        }
        final C18878 m23328 = m23328();
        final C11138 m39517 = c16781.m39517();
        final boolean z = "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
        final C4766 c4766 = z ? new C4766() : null;
        final C1986 c1986 = new C1986();
        m23313(m23328, new InterfaceC10411() { // from class: l.ۡܽۜ
            @Override // l.InterfaceC10411
            /* renamed from: ֫ */
            public final boolean mo18654(C13232 c13232) {
                return C9042.m23316(C9042.this, c1986, i, c23528, z, m23328, m39517, str, hashSet, c4766, i3, arrayList, i2, c13232);
            }
        });
        boolean z2 = c1986.f6645;
        return new C7588(arrayList, z2 ? c1986.f6646 : c1986.f6644, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0170, code lost:
    
        if ("style".equals(l.C2692.m8425(r11.getType().getTypeName())) != false) goto L63;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C6925 m23331(java.lang.String r32, int r33, int r34, int r35, java.util.HashSet r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9042.m23331(java.lang.String, int, int, int, java.util.HashSet):l.ۜᩳۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12534 m23333() {
        C12534 c12534;
        C12534 c125342;
        SoftReference softReference = this.f27417;
        if (softReference != null && (c125342 = (C12534) softReference.get()) != null) {
            return c125342;
        }
        synchronized (this.f27418) {
            SoftReference softReference2 = this.f27417;
            if (softReference2 != null && (c12534 = (C12534) softReference2.get()) != null) {
                return c12534;
            }
            C14587 c14587 = m23328().f59510;
            C12534 c125343 = new C12534(c14587.m34846(), c14587.m34848());
            this.f27417 = new SoftReference(c125343);
            return c125343;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22405 m23337() {
        return new C22405(m23328());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22405 m23334(ArrayList arrayList) {
        C18878 m23328 = m23328();
        return new C22405(new C18878(new C14587(new C8336(m23328.f59510.m34846(), arrayList)), m23328.f59511, m23328.f59509));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C18878 m23328() {
        C18878 c18878;
        C18878 c188782;
        SoftReference softReference = this.f27419;
        if (softReference != null && (c188782 = (C18878) softReference.get()) != null) {
            return c188782;
        }
        synchronized (this.f27418) {
            SoftReference softReference2 = this.f27419;
            if (softReference2 != null && (c18878 = (C18878) softReference2.get()) != null) {
                return c18878;
            }
            C23326 m45090 = this.f27420.m45090();
            AbstractC9049 c8336 = this.f27421.isEmpty() ? m45090 : new C8336(m45090, this.f27421);
            C18878 c188783 = new C18878(new C14587(c8336), m23299(c8336), m45090);
            this.f27419 = new SoftReference(c188783);
            return c188783;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16096 m23338() {
        return C13979.m33438(m23328().f59510);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashMap m23299(AbstractC9049 abstractC9049) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f27421.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            boolean m12329 = c4103.m12329();
            String str = c4103.f13039;
            int i = c4103.f13041;
            if (!m12329) {
                InterfaceC7099 m23321 = m23321(abstractC9049, i, str);
                if (m23321 != null) {
                    int i2 = 65535 & i;
                    if (m23321.mo2347(i2)) {
                        hashMap.put(m23325(i, str), C23816.m52501(m23321, i2, c4103.f13042));
                    }
                }
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
            }
        }
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23312(C18878 c18878, int i, InterfaceC3355 interfaceC3355) {
        InterfaceC0748 m23301;
        InterfaceC21211 mo2346;
        InterfaceC4277 m23302 = m23302((i >>> 24) & 255, c18878.f59510.m34846());
        if (m23302 == null || (m23301 = m23301(m23302, (i >>> 16) & 255)) == null) {
            return;
        }
        int i2 = i & 65535;
        Iterator it = m23301.mo2876().iterator();
        while (it.hasNext()) {
            InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
            if (interfaceC7099.mo2347(i2) && (mo2346 = interfaceC7099.mo2346(i2)) != null) {
                interfaceC3355.mo10253(interfaceC7099, m23323(c18878, interfaceC7099, mo2346));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23313(C18878 c18878, InterfaceC10411 interfaceC10411) {
        InterfaceC9922 m34846 = c18878.f59510.m34846();
        HashSet hashSet = new HashSet();
        for (InterfaceC4277 interfaceC4277 : m34846.mo21936()) {
            if (hashSet.add(Integer.valueOf(interfaceC4277.mo12858()))) {
                HashSet hashSet2 = new HashSet();
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (hashSet2.add(Integer.valueOf(interfaceC0748.mo2870()))) {
                        HashSet hashSet3 = new HashSet();
                        Iterator it = interfaceC0748.mo2876().iterator();
                        while (it.hasNext()) {
                            InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
                            for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                                if (hashSet3.add(Integer.valueOf(interfaceC21211.mo47883())) && interfaceC10411.mo18654(m23327(m23323(c18878, interfaceC7099, interfaceC21211)))) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C13232 m23327(InterfaceC21211 interfaceC21211) {
        int mo47884 = interfaceC21211.mo47884();
        InterfaceC4277 mo29407 = interfaceC21211.mo29407();
        InterfaceC0748 type = interfaceC21211.getType();
        mo29407.getClass();
        int mo12858 = mo29407.mo12858();
        return new C13232(type.getTypeName(), mo47884, mo12858, type.mo2870(), interfaceC21211.mo47883(), interfaceC21211.mo29406());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23314(C18878 c18878, C13232 c13232, InterfaceC12527 interfaceC12527, C4766 c4766) {
        InterfaceC0748 m23301;
        InterfaceC21211 mo2346;
        InterfaceC9922 m34846 = c18878.f59510.m34846();
        int i = c13232.f39607;
        int i2 = c13232.f39603;
        InterfaceC4277 m23302 = m23302(i, m34846);
        if (m23302 == null || (m23301 = m23301(m23302, c13232.f39611)) == null) {
            return;
        }
        Iterator it = (c4766 == null ? m23297((Iterable) m23301.mo2876()) : c4766.m13929(m23301)).iterator();
        while (it.hasNext()) {
            InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
            if (interfaceC7099.mo2347(i2) && (mo2346 = interfaceC7099.mo2346(i2)) != null && interfaceC12527.mo24676(interfaceC7099, m23323(c18878, interfaceC7099, mo2346))) {
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23297(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC7099) it.next());
        }
        C6083.sort(arrayList, new C2650());
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21211 m23323(C18878 c18878, InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
        InterfaceC21211 interfaceC212112;
        return (c18878.f59511.isEmpty() || (interfaceC212112 = (InterfaceC21211) c18878.f59511.get(m23325(interfaceC21211.mo47884(), C2692.m8426(interfaceC7099)))) == null) ? interfaceC21211 : interfaceC212112;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23325(int i, String str) {
        return m23294(i) + '\n' + str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m23321(InterfaceC9922 interfaceC9922, int i, String str) {
        InterfaceC0748 m23301;
        InterfaceC4277 m23302 = m23302((i >>> 24) & 255, interfaceC9922);
        if (m23302 == null || (m23301 = m23301(m23302, (i >>> 16) & 255)) == null) {
            return null;
        }
        int i2 = i & 65535;
        Iterator it = m23301.mo2876().iterator();
        while (it.hasNext()) {
            InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
            if (C2692.m8426(interfaceC7099).equals(str) && interfaceC7099.mo2347(i2)) {
                return interfaceC7099;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23291(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        if ("default".equals(str)) {
            return -1;
        }
        if ("default".equals(str2)) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4277 m23302(int i, InterfaceC9922 interfaceC9922) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                return interfaceC4277;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0748 m23301(InterfaceC4277 interfaceC4277, int i) {
        for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
            if (interfaceC0748.mo2870() == i) {
                return interfaceC0748;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23294(int i) {
        char[] cArr = new char[10];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[i2 + 2] = f27416[(i >>> (28 - (i2 * 4))) & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m23319(String str, String str2) {
        return m23294(m23324(str, str2));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m23324(String str, String str2) {
        long m23293 = m23293(str);
        if (m23293 < 0) {
            throw C3059.m9364(C20094.m46315("Invalid ", str2), str2, str == null ? null : JSON.value(str), JSON.array("0x00000000..0xffffffff"), JSON.object().add(str2, "0x7f010000"));
        }
        return (int) m23293;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m23293(String str) {
        if (str == null || str.length() != 10 || !str.regionMatches(true, 0, "0x", 0, 2)) {
            return -1L;
        }
        long j = 0;
        for (int i = 2; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = (charAt < '0' || charAt > '9') ? (charAt < 'a' || charAt > 'f') ? (charAt < 'A' || charAt > 'F') ? -1 : charAt - '7' : charAt - 'W' : charAt - '0';
            if (i2 < 0) {
                return -1L;
            }
            j = (j << 4) | i2;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23315(int i, String str) {
        char c;
        if (str.length() <= 10) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 == 0) {
                    c = '0';
                } else if (i2 == 1) {
                    c = 'x';
                } else {
                    c = f27416[(i >>> (28 - ((i2 - 2) * 4))) & 15];
                }
                char charAt = str.charAt(i2);
                if (charAt == c || charAt == Character.toUpperCase(c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m23329(InterfaceC21211 interfaceC21211) {
        return interfaceC21211.mo29409() == 1 && interfaceC21211.getValue(0).mo5006() == -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23326(InterfaceC21211 interfaceC21211) {
        return (interfaceC21211.mo29409() <= 0 || m23329(interfaceC21211)) ? "single_value" : "item_list";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11159 m23308(C18878 c18878, InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211, int i, int i2, int i3, int i4, Set set, HashMap hashMap) {
        int i5;
        C14587 c14587 = c18878.f59510;
        String m8426 = C2692.m8426(interfaceC7099);
        int mo29409 = interfaceC21211.mo29409();
        if (mo29409 != 0) {
            C20331 m33439 = i2 >= 0 ? C13979.m33439(c14587, interfaceC21211, i2) : null;
            if (m23329(interfaceC21211)) {
                return m23306(c18878, interfaceC21211.getValue(0), null, null, m8426, i, i4, set, hashMap, m33439);
            }
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                if (i6 < i3) {
                    C0532 m23320 = m23320(c14587, interfaceC7099, interfaceC1454.mo5006());
                    i5 = i6;
                    arrayList.add(m23306(c18878, interfaceC1454, m23320.f2194, m23320.f2195, m8426, i, i4, set, hashMap, null));
                } else {
                    i5 = i6;
                }
                i6 = i5 + 1;
            }
            return new C11159(null, null, m8426, "item_list", false, false, null, null, null, null, null, arrayList, mo29409 > i3, mo29409, m33439);
        }
        return new C11159(null, null, m8426, "null_value", false, false, null, null, null, null, null, new ArrayList(), false, 0, i2 >= 0 ? C13979.m33439(c14587, interfaceC21211, i2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11159 m23306(l.C18878 r19, l.InterfaceC1454 r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, java.util.Set r26, java.util.HashMap r27, l.C20331 r28) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9042.m23306(l.ᩴܽۜ, l.֨᩻ܽ, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.Set, java.util.HashMap, l.᩶ᩳۜ):l.ۧᩳۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23296(InterfaceC1454 interfaceC1454, C19584 c19584, Set set) {
        if (c19584.f63272 != null) {
            return "unparsed";
        }
        int mo5004 = interfaceC1454.mo5004();
        if (mo5004 == 0) {
            return "null_value";
        }
        if (mo5004 != 3) {
            return (mo5004 == 1 || mo5004 == 7) ? Name.REFER : (mo5004 == 2 || mo5004 == 8) ? AnnotationHandler.ATTRIBUTE : mo5004 == 18 ? ClassTransform.BOOLEAN : (mo5004 < 28 || mo5004 > 31) ? mo5004 == 5 ? "dimension" : mo5004 == 6 ? "fraction" : (mo5004 == 4 || mo5004 == 16 || mo5004 == 17) ? "number" : "unparsed" : ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
        }
        if (c19584.f63274) {
            return "styled_text";
        }
        String str = c19584.f63273;
        return (str == null || !set.contains(str)) ? TextBundle.TEXT_ENTRY : "file_path";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19584 m23310(C14587 c14587, InterfaceC1454 interfaceC1454, int i) {
        CharSequence m24585;
        boolean z;
        try {
            if (interfaceC1454.mo5004() == 3 && interfaceC1454.mo5008() != null) {
                InterfaceC3571 mo5008 = interfaceC1454.mo5008();
                m24585 = mo5008.getValue();
                z = mo5008.mo10323();
            } else {
                m24585 = C9650.m24585(c14587, interfaceC1454);
                if (m24585 instanceof InterfaceC3571) {
                    InterfaceC3571 interfaceC3571 = (InterfaceC3571) m24585;
                    String value = interfaceC3571.getValue();
                    z = interfaceC3571.mo10323();
                    m24585 = value;
                } else {
                    z = false;
                }
            }
            String m21638 = C8163.m21638(m24585.toString());
            if (i > 0) {
                String m21636 = C8163.m21636(0, i, (CharSequence) m21638);
                return new C19584(m21636, null, m21638, m21636.codePointCount(0, m21636.length()) < m21638.codePointCount(0, m21638.length()), z);
            }
            return new C19584(m21638, null, m21638, false, z);
        } catch (Exception e) {
            return new C19584("", e.getMessage() == null ? "Failed to format resource value" : e.getMessage(), null, false, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23292(InterfaceC1454 interfaceC1454) {
        int mo5004 = interfaceC1454.mo5004();
        if (interfaceC1454.getValue() == 0) {
            return 0;
        }
        if (mo5004 == 1 || mo5004 == 7 || mo5004 == 2 || mo5004 == 8) {
            return interfaceC1454.getValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[ADDED_TO_REGION, LOOP:0: B:25:0x0091->B:28:0x00a7, LOOP_START, PHI: r0
  0x0091: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:24:0x008e, B:28:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C0532 m23320(l.C14587 r6, l.InterfaceC7099 r7, int r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = -1
            if (r8 != r2) goto Lb
            l.֡ܽۜ r6 = new l.֡ܽۜ
            r6.<init>(r1, r0)
            return r6
        Lb:
            java.lang.String r3 = "style"
            if (r8 != r2) goto L10
            goto L24
        L10:
            l.֡᩻ܽ r2 = r7.getType()
            java.lang.String r2 = r2.getTypeName()
            java.lang.String r2 = l.C2692.m8425(r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L24
            r2 = r8
            goto L25
        L24:
            r2 = 0
        L25:
            l.֡᩻ܽ r4 = r7.getType()
            java.lang.String r4 = r4.getTypeName()
            java.lang.String r4 = l.C2692.m8425(r4)
            java.lang.String r5 = "plurals"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L48
            r3 = 16777220(0x1000004, float:2.3509898E-38)
            int r3 = r8 - r3
            if (r3 < 0) goto L7c
            r4 = 6
            if (r3 >= r4) goto L7c
            java.lang.String[] r6 = l.InterfaceC1454.f5200
            r1 = r6[r3]
            goto Laa
        L48:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7c
            l.ܿᩳܽ r3 = r6.m34848()
            l.ܽᩳܽ r3 = r3.m40933(r8)
            if (r3 == 0) goto L7c
            int r0 = r3.f51604
            int r0 = r0 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            l.ۘ᩻ܽ r7 = r7.mo8396()
            int r7 = r7.mo12858()
            java.lang.String r6 = r6.m34844(r7, r0)
            r1.append(r6)
            java.lang.String r6 = r3.f51605
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            goto Laa
        L7c:
            l.ۘ᩻ܽ r7 = r7.mo8396()
            int r7 = r7.mo12858()
            java.lang.String r6 = r6.mo32239(r7, r8)
            int r7 = r6.length()
            r3 = 8
            if (r7 == r3) goto L91
            goto La5
        L91:
            if (r0 >= r3) goto Laa
            int r7 = r0 * 4
            int r7 = 28 - r7
            int r7 = r8 >>> r7
            r7 = r7 & 15
            char[] r4 = l.C9042.f27416
            char r7 = r4[r7]
            char r4 = r6.charAt(r0)
            if (r4 == r7) goto La7
        La5:
            r1 = r6
            goto Laa
        La7:
            int r0 = r0 + 1
            goto L91
        Laa:
            l.֡ܽۜ r6 = new l.֡ܽۜ
            if (r1 != 0) goto Lb2
            java.lang.String r1 = m23294(r8)
        Lb2:
            r6.<init>(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9042.m23320(l.ܳܳܽ, l.ۜ᩻ܽ, int):l.֡ܽۜ");
    }
}
