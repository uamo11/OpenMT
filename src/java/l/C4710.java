package l;

import java.util.Iterator;

/* compiled from: 91EZ */
/* renamed from: l.ۙܳܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4710 implements InterfaceC6121 {
    @Override // l.InterfaceC6121
    /* renamed from: ֫ */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) {
        boolean z = true;
        c18906.m43647(true);
        C7073 c7073 = new C7073();
        C18514 m44343 = c19220.m44343("parent");
        if (m44343 != null) {
            String m43026 = m44343.m43026();
            Integer m13803 = m13803(m43026);
            if (m13803 != null) {
                c7073.f21766 = m13803.intValue();
                c7073.f21767 = 17;
            } else {
                z = C9896.m24998(m43026, c7073);
            }
            if (!z) {
                throw new C1580(C4860.m14172("Expected integer value: parent=\"", m44343.m43026(), "\""), m44343);
            }
            c18906.m43638(c7073.f21766);
        }
        Iterator m44337 = C19220.m44337(c19220);
        while (m44337.hasNext()) {
            C19220 c192202 = (C19220) m44337.next();
            m13804(c18906, c10355, c192202).m13997(m13802(c192202, c7073));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13802(C19220 c19220, C7073 c7073) {
        boolean m24998;
        C18514 m44343 = c19220.m44343("id");
        if (m44343 == null) {
            return -1;
        }
        String m43026 = m44343.m43026();
        Integer m13803 = m13803(m43026);
        if (m13803 != null) {
            c7073.f21766 = m13803.intValue();
            c7073.f21767 = 17;
            m24998 = true;
        } else {
            m24998 = C9896.m24998(m43026, c7073);
        }
        if (m24998) {
            return c7073.f21766;
        }
        throw new C1580(C4860.m14172("Expected integer value: id=\"", m44343.m43026(), "\""), m44343);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m13803(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4794 m13804(C18906 c18906, C10355 c10355, C19220 c19220) {
        String m44350 = c19220.m44350();
        m44350.getClass();
        switch (m44350) {
            case "dynamic-attribute":
                C4794 m28795 = C11766.m28795(c18906, c10355, c19220);
                m28795.m13998(8);
                return m28795;
            case "fraction":
                return C11766.m28802(c18906, c10355, c19220);
            case "reference":
                return C11766.m28796(c18906, c19220, c10355, true);
            case "string":
                return C11766.m28800(c18906, c10355, c19220);
            case "bool":
                return C11766.m28801(c18906, c10355, c19220);
            case "attribute":
                return C11766.m28795(c18906, c10355, c19220);
            case "color":
                return C11766.m28803(c18906, c10355, c19220);
            case "dimen":
                return C11766.m28805(c18906, c10355, c19220);
            case "float":
                return C11766.m28804(c18906, c10355, c19220);
            case "dynamic-reference":
                C4794 m28796 = C11766.m28796(c18906, c19220, c10355, false);
                m28796.m13998(7);
                return m28796;
            case "integer":
                return C11766.m28806(c18906, c10355, c19220);
            default:
                throw new C1580("Unknown tag <" + c19220.m44350() + ">", c19220);
        }
    }
}
