package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 31G5 */
/* renamed from: l.ۨܳܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11766 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f35119;

    static {
        HashMap hashMap = new HashMap();
        f35119 = hashMap;
        hashMap.put(AnnotationHandler.ATTRIBUTE, new C21644());
        hashMap.put("bool", new C22349());
        hashMap.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C20233());
        hashMap.put("dimen", new C3299());
        hashMap.put(ClassTransform.FLOAT, new C23054());
        hashMap.put("fraction", new C13881());
        hashMap.put("id", new C7532());
        hashMap.put("integer", new C2160());
        hashMap.put(Name.REFER, new C18388());
        hashMap.put("dynamic-reference", new C12471());
        hashMap.put("dynamic-attribute", new C13176());
        C17682 c17682 = new C17682();
        hashMap.put("string", c17682);
        hashMap.put(MotionUtils.EASING_TYPE_PATH, c17682);
        hashMap.put("complex", new C4710());
        C1182 c1182 = new C1182();
        hashMap.put("string-array", c1182);
        hashMap.put("integer-array", c1182);
        hashMap.put("array", c1182);
        hashMap.put("attr", new C15292());
        hashMap.put("plurals", new C11333());
        hashMap.put("style", new C14859());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28799(C19220 c19220, C2678 c2678, C10355 c10355, HashMap hashMap, C18116 c18116) {
        if (!c19220.m44350().equals("resources")) {
            throw new C1580("Expected tag: <resources>", c19220);
        }
        C18514 m44343 = c19220.m44343("sparse");
        if (m44343 != null && m44343.m43026().equals("true")) {
            c2678.m8397(true);
        }
        C18514 m443432 = c19220.m44343("offset16");
        if (m443432 != null && m443432.m43026().equals("true")) {
            c2678.m8395(true);
        }
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            C19220 c192202 = (C19220) m44337.next();
            C18514 m443433 = c192202.m44343("name");
            if (m443433 == null) {
                throw new C1580("Expected attr: name", c192202);
            }
            String m43026 = m443433.m43026();
            Integer num = (Integer) hashMap.get(m43026);
            if (num == null) {
                throw new C1580(C20087.m46306("Id definition not found: ", m43026, " (in ", c2678.getType().getPath() + "/type-info.xml", MotionUtils.EASING_TYPE_FORMAT_END), c192202);
            }
            int intValue = num.intValue();
            c2678.getType().m46611(intValue, m43026, false);
            C18906 m8392 = c2678.m8392(intValue);
            C18514 m443434 = c192202.m44343("public");
            if (c18116.f56383) {
                m8392.m43649(m443434 == null || m443434.m43026().equals("true"));
            } else {
                m8392.m43649(m443434 != null && m443434.m43026().equals("true"));
            }
            C18514 m443435 = c192202.m44343("weak");
            if (c18116.f56384) {
                m8392.m43650(m443435 == null || m443435.m43026().equals("true"));
            } else {
                m8392.m43650(m443435 != null && m443435.m43026().equals("true"));
            }
            C18514 m443436 = c192202.m44343("compact");
            if (c18116.f56382) {
                m8392.m43646(m443436 == null || m443436.m43026().equals("true"));
            } else {
                if (m443436 != null && m443436.m43026().equals("true")) {
                    r5 = true;
                }
                m8392.m43646(r5);
            }
            InterfaceC6121 interfaceC6121 = (InterfaceC6121) f35119.get(c192202.m44350());
            if (interfaceC6121 == null) {
                throw new C1580("Unknown tag <" + c192202.m44350() + ">", c192202);
            }
            interfaceC6121.mo3995(m8392, c10355, c192202);
            c10355.m26160(m8392.mo47884(), c192202.m22403(), c192202.m22402());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4794 m28796(C18906 c18906, C19220 c19220, C10355 c10355, boolean z) {
        Integer m28794;
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        if (!m3219.startsWith("@")) {
            throw new C1580("Expected reference value", m44347);
        }
        int i = 1;
        String substring = m3219.substring(1);
        if (substring.equals("null")) {
            m28794 = 0;
        } else if (!substring.equals(b.f)) {
            m28794 = m28794(substring);
            if (m28794 == null) {
                int mo26156 = c10355.mo26156(c18906.m43652().mo12858(), substring);
                m28794 = mo26156 == -1 ? null : Integer.valueOf(mo26156);
            }
        } else {
            if (!z) {
                throw new C1580("@empty is supported only by root <reference>", m44347);
            }
            m28794 = 1;
            i = 0;
        }
        if (m28794 != null) {
            C4794 m43639 = c18906.m43639(m28794.intValue(), i, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Resource not found: @".concat(substring), m44347);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4794 m28795(C18906 c18906, C10355 c10355, C19220 c19220) {
        Integer m28794;
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        if (!m3219.startsWith("?")) {
            throw new C1580("Expected reference value", m44347);
        }
        String substring = m3219.substring(1);
        if (substring.equals("null")) {
            m28794 = 0;
        } else {
            m28794 = m28794(substring);
            if (m28794 == null) {
                int mo26156 = c10355.mo26156(c18906.m43652().mo12858(), substring);
                m28794 = mo26156 == -1 ? null : Integer.valueOf(mo26156);
            }
        }
        if (m28794 != null) {
            C4794 m43639 = c18906.m43639(m28794.intValue(), 2, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Resource not found: ?".concat(substring), m44347);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m28794(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C4794 m28800(C18906 c18906, C10355 c10355, C19220 c19220) {
        int m22403;
        int m22402;
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        m28798(c19220.m44345(), sb, linkedList);
        C4794 m43640 = c18906.m43640(sb.toString(), linkedList.isEmpty() ? null : (C21916[]) linkedList.toArray(new C21916[0]), -1);
        if (!m43640.mo5009() && !m43640.mo5007() && !m43640.mo5005()) {
            return m43640;
        }
        ArrayList m44345 = c19220.m44345();
        if (m44345.isEmpty()) {
            m22403 = c19220.m22402();
            m22402 = m22403;
        } else {
            m22403 = ((AbstractC8636) m44345.get(0)).m22403();
            m22402 = ((AbstractC8636) m44345.get(m44345.size() - 1)).m22402();
        }
        c10355.m26161(m43640, m22403, m22402);
        return m43640;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28798(ArrayList arrayList, StringBuilder sb, LinkedList linkedList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC8636 abstractC8636 = (AbstractC8636) it.next();
            if (!abstractC8636.mo3218()) {
                if (abstractC8636.mo3218()) {
                    throw new UnsupportedOperationException();
                }
                m28797(sb, ((C0874) abstractC8636).m3219());
            } else {
                C19220 m22400 = abstractC8636.m22400();
                int length = sb.length();
                StringBuilder sb2 = new StringBuilder(m22400.m44350());
                for (C18514 c18514 : m22400.m44351()) {
                    sb2.append(';');
                    sb2.append(c18514.m43025());
                    sb2.append(a.h);
                    sb2.append(c18514.m43026());
                }
                m28798(m22400.m44345(), sb, linkedList);
                linkedList.addFirst(new C21916(sb2.toString(), length, sb.length()));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28797(StringBuilder sb, String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                if (i != str.length() - 1) {
                    i++;
                    sb.append(str.charAt(i));
                } else {
                    sb.append('\\');
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C4794 m28804(C18906 c18906, C10355 c10355, C19220 c19220) {
        int i;
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(m3219, c7073) && (i = c7073.f21767) == 4) {
            C4794 m43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Expected float value", m44347);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C4794 m28805(C18906 c18906, C10355 c10355, C19220 c19220) {
        int i;
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(m3219, c7073) && (i = c7073.f21767) == 5) {
            C4794 m43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Expected dimen value", m44347);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C4794 m28802(C18906 c18906, C10355 c10355, C19220 c19220) {
        int i;
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24995(m3219, c7073) && (i = c7073.f21767) == 6) {
            C4794 m43639 = c18906.m43639(c7073.f21766, i, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Expected fraction value", m44347);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C4794 m28806(C18906 c18906, C10355 c10355, C19220 c19220) {
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24998(m3219, c7073)) {
            C4794 m43639 = c18906.m43639(c7073.f21766, c7073.f21767, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Expected integer value", m44347);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4794 m28801(C18906 c18906, C10355 c10355, C19220 c19220) {
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        if (m3219.equals("true")) {
            C4794 m43639 = c18906.m43639(1, 18, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        if (m3219.equals("false")) {
            C4794 m436392 = c18906.m43639(0, 18, -1);
            c10355.m26162(m436392, m44347);
            return m436392;
        }
        throw new C1580("Expected bool value", m44347);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4794 m28803(C18906 c18906, C10355 c10355, C19220 c19220) {
        C0874 m44347 = c19220.m44347();
        String m3219 = m44347.m3219();
        C7073 c7073 = new C7073();
        if (C9896.m24991(m3219, c7073)) {
            C4794 m43639 = c18906.m43639(c7073.f21766, c7073.f21767, -1);
            c10355.m26162(m43639, m44347);
            return m43639;
        }
        throw new C1580("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(m3219), m44347);
    }
}
