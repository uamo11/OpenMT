package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: UAR2 */
/* renamed from: l.ۢ᩷ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9840 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m24912() {
        C13657 m18976;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        List<AbstractC15440> mo23549 = C16293.f50117.m36526("syntax/custom").mo23549(true);
        HashSet hashSet2 = new HashSet();
        for (AbstractC15440 abstractC15440 : mo23549) {
            if (abstractC15440.mo23119()) {
                int i = C7017.f21654;
                String name = abstractC15440.getName();
                String str = null;
                if (name.endsWith(".cache")) {
                    String m36561 = C15472.m36561(6, 0, name);
                    String lowerCase = m36561.toLowerCase(Locale.ROOT);
                    if (m36561.equals(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (str != null) {
                    hashSet2.add(str);
                }
            }
        }
        for (AbstractC15440 abstractC154402 : mo23549) {
            if (abstractC154402.mo23119() && abstractC154402.getName().endsWith(".cache") && (m18976 = C7017.m18976(abstractC154402)) != null) {
                String str2 = m18976.f40725;
                if (str2 != null) {
                    hashSet.add(str2);
                    hashMap.remove(str2);
                    hashMap2.remove(str2);
                } else {
                    C15068 c15068 = m18976.f40726;
                    String lowerCase2 = c15068.m35657().toLowerCase(Locale.ROOT);
                    if (!hashSet.contains(lowerCase2) && (!hashSet2.contains(lowerCase2) || abstractC154402.getName().equals(C7017.m18956(abstractC154402.m36514(), lowerCase2).getName()))) {
                        C15068 c150682 = (C15068) hashMap.get(lowerCase2);
                        AbstractC15440 abstractC154403 = (AbstractC15440) hashMap2.get(lowerCase2);
                        if (c150682 != null) {
                            int m24907 = m24907(abstractC154402, c15068);
                            int m249072 = m24907(abstractC154403, c150682);
                            if (m24907 != m249072) {
                                if (m24907 > m249072) {
                                }
                            } else if (abstractC154402.getName().compareTo(abstractC154403.getName()) < 0) {
                            }
                        }
                        hashMap.put(lowerCase2, c15068);
                        hashMap2.put(lowerCase2, abstractC154402);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24907(AbstractC15440 abstractC15440, C15068 c15068) {
        String name = abstractC15440.getName();
        if (name.equals(C7017.m18956(abstractC15440.m36514(), c15068.m35657()).getName())) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c15068.m35657());
        sb.append(".cache");
        return name.equals(sb.toString()) ? 1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m24908() {
        return C7017.m18985();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15068 m24909(String str, String str2) {
        C19180.m44257(str);
        C16894 c16894 = new C16894(str2);
        String m44263 = C19180.m44263(str2, str);
        C14502 c14502 = new C14502(new C11837(m44263, new RunnableC0709()));
        c14502.m43456(c16894);
        C14562 c14562 = new C14562(new C1875(c14502));
        c14562.m43456(c16894);
        C15068 c15068 = new C15068(c14562.m34772());
        c15068.m35659();
        C23097.m51264(c15068);
        C7017.m18964(c15068, m44263);
        return c15068;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24910(AbstractC15440 abstractC15440) {
        C7017.m18966(abstractC15440);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24911(C15068 c15068) {
        return C7017.m18982(c15068);
    }
}
