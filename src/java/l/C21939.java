package l;

import com.umeng.analytics.pro.am;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: 097P */
/* renamed from: l.᩹֡ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21939 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70247 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f70250;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f70254;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f70251 = new SecureRandom();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f70253 = Pattern.compile("[0-9A-Z]+");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC10942 f70249 = new ConcurrentMapC10942();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f70248 = true;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C20177 f70252 = new C20177();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49421() {
        f70250 = null;
        f70254 = null;
        f70248 = true;
        f70249.clear();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m49415() {
        f70249.clear();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m49417() {
        return C4925.f15523.getBoolean("enable_recycle_bin", true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m49419() {
        AbstractC15440 abstractC15440 = f70250;
        if (abstractC15440 == null) {
            abstractC15440 = C16293.m38327().m36526(".recycle");
            if (!abstractC15440.mo23120()) {
                AbstractC15440 m36526 = C16293.m38327().m36526("recycle");
                if (m36526.mo23113()) {
                    m36526.mo23551(abstractC15440);
                }
            }
            String m39859 = abstractC15440.mo36530() ? C16999.m39859(abstractC15440.mo23554()) : null;
            if (m39859 == null) {
                abstractC15440 = C16293.f50120.m36526(".recycle.bin");
                m39859 = C16999.m39859(abstractC15440.mo23554());
                C11003.requireNonNull(m39859);
            }
            if (abstractC15440.mo23120()) {
                AbstractC15440 m365262 = abstractC15440.m36526(".i");
                if (!m365262.mo23120()) {
                    AbstractC15440 m365263 = abstractC15440.m36526(am.aC);
                    if (m365263.mo23113()) {
                        m365263.mo23551(m365262);
                    }
                }
            }
            f70250 = abstractC15440;
            f70254 = m39859;
        }
        if (f70248 && abstractC15440.mo23120()) {
            try {
                abstractC15440.m36526(".nomedia").m36503(new byte[0], 0, 0);
                abstractC15440.m36526("README.txt").m36510("This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n此目录为回收站目录，请不要手动删除任何文件，如需删除可从主界面侧拉栏进入回收站再删除！\n");
            } catch (Exception unused) {
            }
            f70248 = false;
        }
        return abstractC15440;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m49420() {
        if (f70254 == null) {
            m49419();
        }
        return f70254;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static List m49422() {
        String str;
        int i = 0;
        List<C21234> list = (List) C5378.stream(m49419().m36526(".i").mo23549(true)).filter(new C18411(i)).map(new C19117()).filter(new C0065(i)).collect(C22976.toList());
        if (f70249.size() - list.size() > 50) {
            ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(list.size());
            for (C21234 c21234 : list) {
                str = c21234.f68445;
                concurrentMapC10942.put(str, c21234);
            }
            f70249 = concurrentMapC10942;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14882 m49412(final long j, boolean z, InterfaceC17066 interfaceC17066, InterfaceC7827 interfaceC7827) {
        ?? r0;
        InterfaceC17066 m38504 = C16360.m38504(interfaceC17066);
        if (m38504.mo1526()) {
            return new C14882(0, 0, true);
        }
        List<C21234> list = (List) C5378.stream(m49422()).filter(new Predicate() { // from class: l.֨֡ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C21234) obj).m48200() < j;
            }
        }).collect(C22976.toList());
        if (!z) {
            r0 = Collections.EMPTY_LIST;
        } else {
            AbstractC15440 m49419 = m49419();
            AbstractC15440 m36526 = m49419.m36526(".i");
            r0 = new ArrayList();
            for (AbstractC15440 abstractC15440 : m49419.mo23549(true)) {
                String name = abstractC15440.getName();
                if (abstractC15440.mo23113() && !name.startsWith(".") && f70253.matcher(name).matches() && !m36526.m36526(name).mo23120()) {
                    r0.add(abstractC15440);
                }
            }
        }
        int size = r0.size() + list.size();
        if (interfaceC7827 != null) {
            interfaceC7827.mo20925(size);
        }
        int i = 0;
        for (C21234 c21234 : list) {
            if (m38504.mo1526()) {
                return new C14882(size, i, true);
            }
            if (interfaceC7827 != null) {
                interfaceC7827.mo20926(c21234.m48194());
            }
            if (!c21234.delete()) {
                i++;
                m49414(Collections.singleton(c21234.m48198()));
            }
        }
        if (m38504.mo1526()) {
            return new C14882(size, i, true);
        }
        for (AbstractC15440 abstractC154402 : r0) {
            if (m38504.mo1526()) {
                return new C14882(size, i, true);
            }
            if (interfaceC7827 != null) {
                interfaceC7827.mo20926(abstractC154402.getName());
            }
            f70252.getClass();
            abstractC154402.mo23552();
            if (abstractC154402.mo23120()) {
                i++;
            }
        }
        return new C14882(size, i, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49414(Set set) {
        long j;
        AbstractC15440 m49419 = m49419();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC15440 m36526 = m49419.m36526(".i/" + str);
            C21234 m48191 = C21234.m48191(m36526);
            if (m48191 == null) {
                m36526.mo23552();
                m49419.m36526(str).mo23552();
                f70249.remove(str);
            } else if (!m48191.m48201().mo23120()) {
                m48191.delete();
                m49419.m36526(str).mo23552();
            } else {
                long m36490 = m48191.m48201().m36490(new C5005());
                j = m48191.f68444;
                if (j != m36490) {
                    C21234 m48199 = m48191.m48199(m36490);
                    f70249.put(str, m48199);
                    m48199.m48196();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21234 m49413(String str) {
        return C21234.m48191(m49419().m36526(".i/" + str));
    }
}
