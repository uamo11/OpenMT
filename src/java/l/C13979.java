package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.b;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: S776 */
/* renamed from: l.ܰᩳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13979 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f41691 = new HashSet(Arrays.asList("string", MotionUtils.EASING_TYPE_PATH, "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "string-array", "integer-array", "array", "plurals", "style", "complex"));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16096 m33438(C14587 c14587) {
        return new C16096(new C12534(c14587.m34846(), c14587.m34848()).m30775());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m33439(C14587 c14587, InterfaceC21211 interfaceC21211, int i) {
        String m52500 = C23816.m52500(C23816.m52503(interfaceC21211));
        try {
            if (m33454(interfaceC21211)) {
                return C20331.m46644(m52500, "UNSUPPORTED_VALUE_XML");
            }
            m33459(interfaceC21211);
            m33457(interfaceC21211);
            String m33435 = m33435(c14587, interfaceC21211, m33438(c14587));
            int codePointCount = m33435.codePointCount(0, m33435.length());
            if (codePointCount > i) {
                return C20331.m46641(codePointCount, m52500);
            }
            return C20331.m46642(codePointCount, m52500, m33435);
        } catch (C6219 unused) {
            return C20331.m46644(m52500, "UNSUPPORTED_STYLED_TEXT_XML");
        } catch (C11864 unused2) {
            return C20331.m46644(m52500, "UNSUPPORTED_VALUE_XML");
        } catch (C23152 unused3) {
            return C20331.m46643(m52500);
        } catch (Exception unused4) {
            return C20331.m46644(m52500, "VALUE_XML_UNAVAILABLE");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15390 m33437(C9042 c9042, ArrayList arrayList) {
        C4808 c4808;
        String m23325;
        C22405 m23337 = c9042.m23337();
        C16096 m50281 = m23337.m50281();
        C20289[] c20289Arr = new C20289[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C4808 c48082 = (C4808) arrayList.get(i);
            C20289 m50280 = m23337.m50280((int) Long.parseLong(c48082.f15216.substring(2), 16), c48082.f15217);
            if (m50280 == null) {
                C3059 m9363 = C3059.m9363("RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.");
                m33441(m9363, c48082, (String) null, m50281);
                throw m9363;
            }
            c20289Arr[i] = m50280;
            InterfaceC21211 interfaceC21211 = m50280.f65537;
            strArr[i] = interfaceC21211 == null ? "missing" : C23816.m52500(C23816.m52503(interfaceC21211));
            String m52500 = C23816.m52500(C23816.m52503(m50280.f65539));
            strArr2[i] = m52500;
            if (!m52500.equals(c48082.f15214)) {
                C3059 m9365 = C3059.m9365("STALE_TARGET_VERSION", "targetVersion does not match current resource value. Re-read the resource and retry.", "warning", (JSONArray) null, JSON.object().add("currentTargetVersion", m52500));
                m33441(m9365, c48082, m52500, m50281);
                throw m9365;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C4808 c48083 = (C4808) arrayList.get(i2);
            try {
                C22405 c22405 = m23337;
                C22405 c224052 = m23337;
                c4808 = c48083;
                try {
                    C3397 m33436 = m33436(c22405, c20289Arr[i2], c48083, strArr[i2], strArr2[i2], m50281, hashMap);
                    arrayList2.add(m33436);
                    C20289 c20289 = c20289Arr[i2];
                    m23325 = C9042.m23325(c20289.f65541, c20289.f65540);
                    hashMap.put(m23325, m33436.f10754);
                    i2++;
                    m23337 = c224052;
                } catch (C3059 e) {
                    e = e;
                    m33441(e, c4808, strArr2[i2], m50281);
                    throw e;
                }
            } catch (C3059 e2) {
                e = e2;
                c4808 = c48083;
            }
        }
        return new C15390(m50281, arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33448(C22405 c22405, int i, String str, String str2) {
        C20289 m50280 = c22405.m50280(i, str);
        if (m50280 == null) {
            throw new IllegalStateException("Missing planned resource target");
        }
        return m33436(c22405, m50280, new C4808(0, C9042.m23294(i), str, "missing", str2), "missing", "missing", c22405.m50281(), new HashMap()).f10754;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21742 m33440(InterfaceC21211 interfaceC21211) {
        C20317 m21925 = C9028.m23280().m23281(interfaceC21211.mo29407().mo12858(), interfaceC21211.mo29407().getPackageName()).m21925(interfaceC21211.getType().mo2870(), interfaceC21211.getType().getTypeName());
        m21925.m46611(interfaceC21211.mo47883(), interfaceC21211.mo29406(), false);
        C2678 m46608 = m21925.m46608(interfaceC21211.mo29410().mo18743());
        m46608.m8397(interfaceC21211.mo29410().mo2345());
        m46608.m8395(interfaceC21211.mo29410().mo2349());
        m46608.m8392(interfaceC21211.mo47883());
        return new C21742(m46608);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33441(C3059 c3059, C4808 c4808, String str, C16096 c16096) {
        c3059.f9609.put("failedEditIndex", c4808.f15215).put("resourceId", c4808.f15216).put("variant", c4808.f15217).put("currentTargetVersion", str == null ? JSON.NULL : JSON.value(str)).put("resourceNamePolicy", c16096 == null ? JSON.NULL : c16096.m37986());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x021a, code lost:
    
        if (r13.mo5004() == 17) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m33435(l.C14587 r16, l.InterfaceC21211 r17, l.C16096 r18) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13979.m33435(l.ܳܳܽ, l.᩷᩻ܽ, l.ܺᩳۜ):java.lang.String");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m33454(InterfaceC21211 interfaceC21211) {
        String m8425 = C2692.m8425(interfaceC21211.getType().getTypeName());
        return "attr".equals(m8425) || "^attr-private".equals(m8425);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33442(InterfaceC13965 interfaceC13965, InterfaceC1454 interfaceC1454, C14587 c14587, C16096 c16096) {
        C10453 c10453 = (C10453) interfaceC13965;
        c10453.mo1294(m33434(interfaceC1454));
        if (interfaceC1454.mo5006() != -1) {
            c10453.mo1291("id", m33450(interfaceC1454.mo5006()));
        }
        m33451(interfaceC13965, interfaceC1454, c14587, c16096);
        c10453.mo1290(m33434(interfaceC1454));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33451(InterfaceC13965 interfaceC13965, InterfaceC1454 interfaceC1454, C14587 c14587, C16096 c16096) {
        int mo5004 = interfaceC1454.mo5004();
        if (mo5004 == 0) {
            ((C10453) interfaceC13965).text(interfaceC1454.getValue() == 1 ? "@empty" : "@null");
            return;
        }
        if (mo5004 != 1) {
            if (mo5004 != 2) {
                if (mo5004 == 3) {
                    InterfaceC3571 mo5008 = interfaceC1454.mo5008();
                    if (mo5008 == null) {
                        ((C10453) interfaceC13965).text("");
                        return;
                    } else {
                        C9650.m24590(interfaceC13965, mo5008.getValue(), mo5008.mo10888());
                        return;
                    }
                }
                if (mo5004 != 7) {
                    if (mo5004 != 8) {
                        ((C10453) interfaceC13965).text(C9650.m24585(c14587, interfaceC1454).toString());
                        return;
                    }
                }
            }
            ((C10453) interfaceC13965).text(interfaceC1454.getValue() == 0 ? "?null" : "?".concat(m33433(interfaceC1454.mo1510().mo12858(), interfaceC1454.getValue(), c14587, c16096)));
            return;
        }
        ((C10453) interfaceC13965).text(interfaceC1454.getValue() != 0 ? "@".concat(m33433(interfaceC1454.mo1510().mo12858(), interfaceC1454.getValue(), c14587, c16096)) : "@null");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33434(InterfaceC1454 interfaceC1454) {
        int mo5004 = interfaceC1454.mo5004();
        switch (mo5004) {
            case 0:
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimen";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (mo5004) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (mo5004) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: ".concat(C12534.m30763(interfaceC1454.mo5004())));
                        }
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33433(int i, int i2, C14587 c14587, C16096 c16096) {
        int i3 = (i2 >>> 24) & 255;
        if (c16096.f49590 && i3 != 1) {
            return m33450(i2);
        }
        String mo32239 = c14587.mo32239(i, i2);
        return m33460(mo32239) ? m33450(i2) : mo32239;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m33460(String str) {
        return str != null && str.length() == 8 && C9896.m24990(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m33450(int i) {
        return String.format(Locale.ROOT, "%08X", Integer.valueOf(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33457(InterfaceC21211 interfaceC21211) {
        C21916[] mo10322;
        boolean z;
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            if (interfaceC1454.mo5004() == 3 && interfaceC1454.mo5008() != null) {
                InterfaceC3571 mo5008 = interfaceC1454.mo5008();
                if (mo5008.mo10323() && (mo10322 = mo5008.mo10322()) != null) {
                    int length = mo5008.getValue().length();
                    for (C21916 c21916 : mo10322) {
                        if (c21916.m49327(length)) {
                            String str = c21916.f70169;
                            int indexOf = str.indexOf(59);
                            if (indexOf < 0) {
                                z = C7184.m19210(str);
                            } else {
                                if (C7184.m19210(str.substring(0, indexOf))) {
                                    while (indexOf >= 0) {
                                        int i = indexOf + 1;
                                        if (i >= str.length()) {
                                            break;
                                        }
                                        int indexOf2 = str.indexOf(61, i);
                                        if (indexOf2 >= 0) {
                                            String substring = str.substring(i, indexOf2);
                                            if (substring.indexOf(59) < 0 && substring.indexOf(61) < 0 && C7184.m19210(substring)) {
                                                indexOf = str.indexOf(59, indexOf2 + 1);
                                            }
                                        }
                                    }
                                    z = true;
                                }
                                z = false;
                                break;
                            }
                            if (z) {
                            }
                        }
                        throw new C6219();
                    }
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m33459(InterfaceC21211 interfaceC21211) {
        if (interfaceC21211.mo29412()) {
            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                if (interfaceC1454.mo5004() == 0 && interfaceC1454.getValue() == 1) {
                    throw new C11864();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33443(C19220 c19220) {
        if (c19220.m44346()) {
            return;
        }
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            m33452((C19220) m44337.next());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33452(C19220 c19220) {
        if (!C7184.m19210(c19220.m44350())) {
            throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text tag name: " + c19220.m44350(), "warning");
        }
        for (C18514 c18514 : c19220.m44351()) {
            String m43025 = c18514.m43025();
            String m43026 = c18514.m43026();
            if (!C7184.m19210(m43025) || m43025.indexOf(61) >= 0 || m43025.indexOf(59) >= 0) {
                throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute name: ".concat(m43025), "warning");
            }
            if (m43026.indexOf(59) >= 0) {
                throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute value.", "warning");
            }
        }
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            m33452((C19220) m44337.next());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33444(C19220 c19220, String str, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        if (c19220.m44346()) {
            try {
                if ("@empty".equals(c19220.m44347().m3219()) && (!z || !Name.REFER.equals(c19220.m44350()))) {
                    throw m33456("@empty is supported only by root <reference>.");
                }
            } catch (C1580 e) {
                throw m33456(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean m33447 = m33447(c19220, str, z);
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            m33444((C19220) m44337.next(), c19220.m44350(), false, m33447);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C19220 m33455(String str) {
        if (str.trim().isEmpty()) {
            throw m33456("valueXml must contain one XML element.");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (str.contains("<?") || upperCase.contains("<!DOCTYPE")) {
            throw m33456("valueXml must not contain processing instructions or DTD.");
        }
        try {
            int i = C5108.f16016;
            C7184 c7184 = new C7184();
            c7184.m19219(new StringReader(str));
            C5108 m14654 = C5108.m14654(c7184, true);
            if (m14654.size() != 1) {
                throw m33456("valueXml must contain exactly one root element.");
            }
            return (C19220) m14654.get(0);
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m33456(e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33453(C19220 c19220, String str, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        for (C18514 c18514 : c19220.m44351()) {
            if ("parent".equals(c18514.m43025()) && c18514.m43026().startsWith("@")) {
                m33461(c18514.m43026().substring(1));
            } else if ("item".equals(c19220.m44350()) && "name".equals(c18514.m43025())) {
                m33461(c18514.m43026());
            } else if ("enum".equals(c19220.m44350()) || "flag".equals(c19220.m44350())) {
                if ("name".equals(c18514.m43025())) {
                    m33461(c18514.m43026());
                }
            }
        }
        if (c19220.m44346()) {
            try {
                String m3219 = c19220.m44347().m3219();
                if (m3219.startsWith("@") || m3219.startsWith("?")) {
                    m33461(m3219.substring(1));
                }
            } catch (C1580 e) {
                throw m33456(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean m33447 = m33447(c19220, str, z);
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            m33453((C19220) m44337.next(), c19220.m44350(), false, m33447);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33447(C19220 c19220, String str, boolean z) {
        String m44350 = c19220.m44350();
        if ("string".equals(m44350) || MotionUtils.EASING_TYPE_PATH.equals(m44350)) {
            return z || "array".equals(str) || "attr".equals(str) || "complex".equals(str) || "style".equals(str);
        }
        if ("item".equals(m44350)) {
            return "string-array".equals(str) || "plurals".equals(str) || "style".equals(str);
        }
        return false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m33461(String str) {
        if (!str.equals("null") && !str.equals(b.f) && m33458(str) == null && !str.startsWith("android:")) {
            throw C3059.m9361(null, "APP_NAME_REFERENCES_NOT_ACCEPTED", "APP resource name references are not accepted when resources.arsc is confused; use hex resource ids.", "warning");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33445(C22405 c22405, C18906 c18906, String str) {
        if ("style".equals(str)) {
            if (c18906.getParent() != 0 && !"style".equals(c22405.m50277(c18906.getParent()))) {
                throw m33456("style parent must resolve to a style resource.");
            }
            Iterator it = c18906.values().iterator();
            while (it.hasNext()) {
                String m50277 = c22405.m50277(((InterfaceC1454) it.next()).mo5006());
                if (!"attr".equals(m50277) && !"^attr-private".equals(m50277)) {
                    throw m33456("style item name must resolve to an attr resource.");
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Integer m33458(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m33456(String str) {
        return C3059.m9361(null, "INVALID_VALUE_XML", str, "warning");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3397 m33436(C22405 c22405, C20289 c20289, C4808 c4808, String str, String str2, C16096 c16096, HashMap hashMap) {
        String m23325;
        InterfaceC21211 m52501;
        m23325 = C9042.m23325(c20289.f65541, c20289.f65540);
        byte[] bArr = (byte[]) hashMap.get(m23325);
        if (bArr == null) {
            m52501 = c20289.f65539;
        } else {
            m52501 = C23816.m52501(c20289.f65538, c20289.f65541 & 65535, bArr);
        }
        boolean z = true;
        if (!m33454(m52501)) {
            C19220 m33455 = m33455(c4808.f15218);
            String mo29406 = m52501.mo29406();
            if (!f41691.contains(m33455.m44350())) {
                throw C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "Unsupported valueXml root tag: " + m33455.m44350(), "warning");
            }
            C18514 m44343 = m33455.m44343("name");
            if (m44343 == null) {
                throw m33456("valueXml root must keep the original name attribute.");
            }
            if (!mo29406.equals(m44343.m43026())) {
                throw m33456("valueXml root name is read-only and must not change.");
            }
            Iterator it = m33455.m44351().iterator();
            while (it.hasNext()) {
                String m43025 = ((C18514) it.next()).m43025();
                if ("public".equals(m43025) || "weak".equals(m43025) || "compact".equals(m43025)) {
                    throw C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "valueXml does not support public, weak, or compact attributes.", "warning");
                }
            }
            String m44350 = m33455.m44350();
            m44350.getClass();
            switch (m44350) {
                case "string-array":
                    Iterator m44337 = C19220.m44337(m33455);
                    while (m44337.hasNext()) {
                        m33443((C19220) m44337.next());
                    }
                    break;
                case "string":
                case "path":
                    m33443(m33455);
                    break;
                case "plurals":
                    Iterator m44338 = C19220.m44338(m33455, "item");
                    while (m44338.hasNext()) {
                        m33443((C19220) m44338.next());
                    }
                    break;
                case "attr":
                case "array":
                case "complex":
                    Iterator m443372 = C19220.m44337(m33455);
                    while (m443372.hasNext()) {
                        C19220 c19220 = (C19220) m443372.next();
                        if ("string".equals(c19220.m44350()) || MotionUtils.EASING_TYPE_PATH.equals(c19220.m44350())) {
                            m33443(c19220);
                        }
                    }
                    break;
                case "style":
                    Iterator m443373 = C19220.m44337(m33455);
                    while (m443373.hasNext()) {
                        C19220 c192202 = (C19220) m443373.next();
                        if ("item".equals(c192202.m44350())) {
                            m33443(c192202);
                        } else if ("string".equals(c192202.m44350()) || MotionUtils.EASING_TYPE_PATH.equals(c192202.m44350())) {
                            m33443(c192202);
                        }
                    }
                    break;
            }
            m33444(m33455, (String) null, true, false);
            boolean mo29405 = m52501.mo29405();
            boolean mo29411 = m52501.mo29411();
            boolean mo29408 = m52501.mo29408();
            if (c16096.f49590) {
                m33453(m33455, (String) null, true, false);
            }
            try {
                C19220 m44340 = C19220.m44340("<resources>" + c4808.f15218 + "</resources>", true);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(m52501.mo29406(), Integer.valueOf(m52501.mo47883()));
                C2678 c2678 = m33440(m52501).f69712;
                C12569 c12569 = new C12569(c22405, c16096);
                c12569.m26165();
                try {
                    C11766.m28799(m44340, c2678, c12569, hashMap2, new C18116());
                    c12569.m26159();
                    C18906 mo2346 = c2678.mo2346(m52501.mo47883());
                    if (mo2346 == null || mo2346.mo29409() == 0) {
                        throw new C1580("Resource entry was not encoded", m44340);
                    }
                    mo2346.m43649(mo29405);
                    mo2346.m43650(mo29411);
                    if (!mo29408 || mo2346.mo29412()) {
                        z = false;
                    }
                    mo2346.m43646(z);
                    m33445(c22405, mo2346, m33455.m44350());
                    byte[] m52503 = C23816.m52503(mo2346);
                    return new C3397(c4808.f15215, c4808.f15216, c4808.f15217, str2, C23816.m52500(m52503), str, m52503);
                } catch (Throwable th) {
                    c12569.m26159();
                    throw th;
                }
            } catch (C3059 e) {
                throw e;
            } catch (Exception e2) {
                throw C3059.m9361(null, "INVALID_VALUE_XML", e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage(), "warning");
            }
        }
        C3059 m9361 = C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "Resource attr definitions are not supported by valueXml editing.", "warning");
        m9361.f9609.put("_suppressResourceRetry", true);
        throw m9361;
    }
}
