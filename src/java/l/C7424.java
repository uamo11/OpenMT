package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.HashSet;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 26KG */
/* renamed from: l.۟ۧۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7424 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashSet f22814 = new HashSet(Arrays.asList("array", "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", "plurals", "string", "style"));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f22813 = new HashSet(Arrays.asList(MotionUtils.EASING_TYPE_PATH, Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "complex"));

    /* JADX WARN: Removed duplicated region for block: B:105:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0399  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22946 m19953(l.C9042 r35, l.C15557 r36) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7424.m19953(l.ۡᩳۜ, l.ܶ᩻ۜ):l.᩺ۧۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4277 m19951(int i, InterfaceC9922 interfaceC9922) {
        InterfaceC4277 interfaceC4277 = null;
        for (InterfaceC4277 interfaceC42772 : interfaceC9922.mo21936()) {
            if (interfaceC42772.mo12858() == i) {
                if (interfaceC4277 != null) {
                    throw m19957("RESOURCE_TARGET_AMBIGUOUS", "Duplicate package IDs prevent adding resources safely.");
                }
                interfaceC4277 = interfaceC42772;
            }
        }
        if (interfaceC4277 != null) {
            return interfaceC4277;
        }
        JSONArray array = JSON.array();
        HashSet hashSet = new HashSet();
        for (InterfaceC4277 interfaceC42773 : interfaceC9922.mo21936()) {
            if (hashSet.add(Integer.valueOf(interfaceC42773.mo12858()))) {
                array.add("0x" + C9042.m23294(interfaceC42773.mo12858()).substring(8));
            }
        }
        C3059 m19957 = m19957("RESOURCE_PACKAGE_NOT_FOUND", "Resource package not found; creating packages is not supported.");
        m19957.f9609.put("availablePackageIds", array);
        throw m19957;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19948(C19220 c19220) {
        C18514 m44343 = c19220.m44343("name");
        if (m44343 == null || m44343.m43026().isEmpty() || m44343.m43026().indexOf(0) >= 0) {
            throw m19957("INVALID_VALUE_XML", "valueXml requires a non-empty resource name without NUL.");
        }
        return m44343.m43026();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19949(C19220 c19220, String str) {
        String m44350 = c19220.m44350();
        C18514 m44343 = c19220.m44343("type");
        String m43026 = m44343 == null ? null : m44343.m43026();
        Object obj = ("string-array".equals(m44350) || "integer-array".equals(m44350)) ? "array" : m44350;
        boolean contains = f22813.contains(m44350);
        if (!contains && !f22814.contains(obj)) {
            throw m19957("UNSUPPORTED_VALUE_XML", C20094.m46315("Unsupported valueXml root: ", m44350));
        }
        if (str != null) {
            if (m43026 != null && !m43026.equals(str)) {
                throw m19957("INVALID_VALUE_XML", "valueXml type attribute does not match the target resource type.");
            }
            m19954(str);
            return str;
        }
        if (contains) {
            if (m43026 == null) {
                throw m19957("INVALID_VALUE_XML", "This valueXml root requires a type attribute when creating a resource.");
            }
            if (m43026.isEmpty()) {
                throw m19957("INVALID_VALUE_XML", "Resource type must not be empty.");
            }
            for (int i = 0; i < m43026.length(); i++) {
                char charAt = m43026.charAt(i);
                if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (i <= 0 || i >= m43026.length() - 1 || charAt < '0' || charAt > '9'))) {
                    throw m19957("INVALID_VALUE_XML", "Resource type must contain lowercase ASCII letters, digits, or underscores, start with a letter or underscore, and not end in a digit.");
                }
            }
        } else {
            if (m43026 != null && !m43026.equals(obj)) {
                throw m19957("INVALID_VALUE_XML", "valueXml type attribute conflicts with its root element.");
            }
            m43026 = obj;
        }
        m19954(m43026);
        return m43026;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19954(String str) {
        if ("attr".equals(str) || "^attr-private".equals(str)) {
            throw m19957("UNSUPPORTED_VALUE_XML", "Adding attr definitions or their variants is not supported.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m19952(String str, InterfaceC4277 interfaceC4277) {
        String str2 = "default";
        try {
            C21707 m48999 = C21707.m48999("default".equals(str) ? "" : str, interfaceC4277.mo12848());
            if (!m48999.m49025().isEmpty()) {
                str2 = m48999.m49025();
            }
            if (str2.equals(str)) {
                return m48999;
            }
            throw new IllegalArgumentException("Use canonical variant: ".concat(str2));
        } catch (Exception e) {
            throw m19957("INVALID_RESOURCE_VARIANT", e.getMessage() == null ? "Invalid resource variant." : e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m19956(InterfaceC4277 interfaceC4277, C13773 c13773, int i, String str, C21707 c21707, InterfaceC21211 interfaceC21211) {
        C8322 m23281 = C9028.m23280().m23281(interfaceC4277.mo12858(), interfaceC4277.getPackageName());
        m23281.m21922(interfaceC4277.mo12848());
        C20317 m21925 = m23281.m21925(c13773.f41077, c13773.f41079);
        m21925.m46611(i, str, false);
        C18906 m8392 = m21925.m46608(c21707).m8392(i);
        m8392.m43648();
        if (interfaceC21211 != null) {
            m8392.m43649(interfaceC21211.mo29405());
            m8392.m43650(interfaceC21211.mo29411());
        }
        return C23816.m52503(m8392);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m19957(String str, String str2) {
        return C3059.m9361(null, str, str2, "warning");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19955(C3059 c3059, int i, int i2, String str, String str2) {
        c3059.f9609.put("failedAddIndex", i).put("failedValueIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)).put("locator", str == null ? JSON.NULL : JSON.value("resource:".concat(str))).put("variant", str2 == null ? JSON.NULL : JSON.value(str2));
    }
}
