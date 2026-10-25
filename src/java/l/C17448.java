package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: B1PU */
/* renamed from: l.ܿܺۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17448 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40800() {
        return C16293.m38327().m36526("protector/tasks/" + C23196.m51459().toLowerCase());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40796(C16742 c16742) {
        return C16293.m38327().m36526("protector/export/" + C23196.m51459().toLowerCase() + "_" + c16742.f51390 + ".apk");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40799(C16742 c16742) {
        c16742.f51390.getClass();
        return m40800().m36526(c16742.f51390);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40797(AbstractC15440 abstractC15440, C16742 c16742) {
        if (c16742.f51390.equals(abstractC15440.getName()) && c16742.f51391.equalsIgnoreCase(C23196.m51459())) {
            return c16742.f51387.equals(C20812.m47627(abstractC15440.m36526("packageLocal"), "MD5"));
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m40795() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC15440 abstractC15440 : m40800().mo23549(true)) {
            if (abstractC15440.mo23113()) {
                AbstractC15440 m36526 = abstractC15440.m36526("info");
                AbstractC15440 m365262 = abstractC15440.m36526("packageLocal");
                AbstractC15440 m365263 = abstractC15440.m36526("packageUpload");
                if (m36526.mo23120() && m365262.mo23120() && m365263.mo23120()) {
                    try {
                        C16742 m39383 = C16742.m39383(m36526.m36506());
                        if (!m40797(abstractC15440, m39383)) {
                            throw new Exception();
                        }
                        if (ServiceC8982.m23217(m39383.f51390)) {
                            m39383.f51392 = -1;
                        } else if (ServiceC8982.f27297.contains(m39383.f51390)) {
                            m39383.f51392 = -2;
                        } else {
                            m39383.f51392 = -3;
                        }
                        arrayList.add(m39383);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m40798() {
        List<C16742> m6343 = C1926.m6343();
        for (C16742 c16742 : m6343) {
            AbstractC15440 m40799 = m40799(c16742);
            AbstractC15440 m36526 = m40799.m36526("info");
            AbstractC15440 m365262 = m40799.m36526("packageLocal");
            AbstractC15440 m365263 = m40799.m36526("packageUpload");
            if (!m36526.mo23120() || !m365262.mo23120()) {
                c16742.f51392 = -4;
            } else {
                if (m365263.mo23120()) {
                    m365263.mo23552();
                }
                try {
                    C16742 m39383 = C16742.m39383(m36526.m36506());
                    if (m39383.f51390.equals(c16742.f51390) && m40797(m40799, m39383)) {
                        c16742.f51394 = m39383.f51394;
                        c16742.f51387 = m39383.f51387;
                        c16742.f51396 = m39383.f51396;
                    }
                } catch (Exception unused) {
                }
                c16742.f51392 = -4;
            }
        }
        Collections.sort(m6343);
        return m6343;
    }
}
