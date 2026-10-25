package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: M73F */
/* renamed from: l.᩹۟ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22142 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20177 f71844 = new C20177();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f71845;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f71846;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f71847;

    public C22142(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, boolean z) {
        this.f71845 = abstractC15440;
        this.f71847 = abstractC154402;
        this.f71846 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22142 m49744(AbstractC15440 abstractC15440, boolean z) {
        AbstractC15440 abstractC154402;
        if (z) {
            abstractC154402 = abstractC15440.m36520(".compress" + abstractC15440.m36505());
        } else {
            abstractC154402 = abstractC15440;
        }
        return new C22142(abstractC15440, abstractC154402, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m49751() {
        return this.f71847;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m49750(List list, EnumC21437 enumC21437) {
        if (!this.f71846) {
            return list;
        }
        try {
            ArrayList m49748 = m49748(list, enumC21437);
            m49749(m49748);
            m49745(m49748);
            m49746(list, enumC21437, null);
            ArrayList arrayList = new ArrayList(m49748.size());
            Iterator it = m49748.iterator();
            while (it.hasNext()) {
                arrayList.add(((C15085) it.next()).f46080);
            }
            return arrayList;
        } catch (IOException e) {
            m49746(list, enumC21437, e);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m49748(List list, EnumC21437 enumC21437) {
        boolean z;
        if (list.isEmpty()) {
            throw new IOException("Compression output list is empty");
        }
        EnumC21437 enumC214372 = EnumC21437.NONE;
        AbstractC15440 abstractC15440 = this.f71847;
        if (enumC21437 == enumC214372 && (list.size() != 1 || !abstractC15440.equals(list.get(0)))) {
            throw new IOException("Unexpected non-split compression output");
        }
        ArrayList arrayList = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractC15440 abstractC154402 = (AbstractC15440) it.next();
            AbstractC15440 m49743 = m49743(abstractC154402, enumC21437);
            if (!hashSet.add(m49743.mo23554())) {
                throw new IOException(C4153.m12552(m49743, new StringBuilder("Duplicate compression output target: ")));
            }
            arrayList.add(new C15085(abstractC154402, m49743));
            z2 |= abstractC154402.equals(abstractC15440);
            if (enumC21437 == EnumC21437.SEVEN_ZIP) {
                if (abstractC154402.getName().equals(abstractC15440.getName() + ".001")) {
                    z = true;
                    z3 |= z;
                }
            }
            z = false;
            z3 |= z;
        }
        if (enumC21437 == EnumC21437.ZIP && !z2) {
            throw new IOException("ZIP split output is missing the final volume");
        }
        if (enumC21437 != EnumC21437.SEVEN_ZIP || z3) {
            return arrayList;
        }
        throw new IOException("7z split output is missing the first volume");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC15440 m49743(AbstractC15440 abstractC15440, EnumC21437 enumC21437) {
        AbstractC15440 abstractC154402 = this.f71847;
        if (!C11003.equals(abstractC154402.getParent(), abstractC15440.getParent())) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Compression output is outside the working directory: ")));
        }
        EnumC21437 enumC214372 = EnumC21437.NONE;
        AbstractC15440 abstractC154403 = this.f71845;
        if (enumC21437 == enumC214372) {
            if (abstractC154402.equals(abstractC15440)) {
                return abstractC154403;
            }
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unexpected non-split compression output: ")));
        }
        if (enumC21437 != EnumC21437.ZIP) {
            String m49742 = m49742(abstractC15440.getName(), 3, abstractC154402.getName(), ".");
            return abstractC154403.m36514().m36526(abstractC154403.getName() + m49742);
        }
        if (abstractC154402.equals(abstractC15440)) {
            return abstractC154403;
        }
        String m497422 = m49742(abstractC15440.getName(), 2, C2439.m7878(abstractC154402.getName()), ".z");
        String m7878 = C2439.m7878(abstractC154403.getName());
        return abstractC154403.m36514().m36526(m7878 + m497422);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49742(String str, int i, String str2, String str3) {
        boolean z;
        String m37867 = C16014.m37867(str2, str3);
        if (!str.startsWith(m37867)) {
            throw new IOException("Unexpected compression volume name: ".concat(str));
        }
        String substring = str.substring(m37867.length());
        if (substring.length() >= i) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i2 >= substring.length()) {
                    z = true ^ z2;
                    break;
                }
                char charAt = substring.charAt(i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if (charAt == '0') {
                    z = false;
                }
                z2 |= z;
                i2++;
            }
            if (!z) {
                return str3.concat(substring);
            }
        }
        throw new IOException("Unexpected compression volume name: ".concat(str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49749(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15085 c15085 = (C15085) it.next();
            AbstractC15440 abstractC15440 = c15085.f46077;
            AbstractC15440 abstractC154402 = c15085.f46080;
            if (!abstractC15440.mo23120() || !abstractC15440.mo23119()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Compression output file is missing: ")));
            }
            boolean mo23120 = abstractC154402.mo23120();
            c15085.f46079 = mo23120;
            if (mo23120 && abstractC154402.mo23113()) {
                throw new IOException(C4153.m12552(abstractC154402, new StringBuilder("Compression output target is a directory: ")));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49745(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C15085 c15085 = (C15085) it.next();
                boolean z = c15085.f46079;
                AbstractC15440 abstractC15440 = c15085.f46080;
                if (z) {
                    if (abstractC15440.mo27917() || (abstractC15440 instanceof C13198) || (abstractC15440 instanceof C12993)) {
                        C17558 c17558 = new C17558();
                        c15085.f46076 = c17558;
                        c17558.m41050(abstractC15440);
                    }
                    AbstractC15440 m36520 = abstractC15440.m36520(".compress_rollback");
                    if (!abstractC15440.mo23551(m36520)) {
                        throw new IOException("Unable to move compression target to rollback file: " + abstractC15440.mo23554());
                    }
                    c15085.f46078 = m36520;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C15085 c150852 = (C15085) it2.next();
                c150852.f46075 = true;
                AbstractC15440 abstractC154402 = c150852.f46080;
                c150852.f46077.m36498(abstractC154402, (Runnable) null);
                C17558 c175582 = c150852.f46076;
                if (c175582 != null) {
                    c175582.m41052(abstractC154402);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C15085 c150853 = (C15085) it3.next();
                AbstractC15440 abstractC154403 = c150853.f46078;
                if (abstractC154403 != null && abstractC154403.mo23120()) {
                    c150853.f46078.mo23552();
                }
            }
        } catch (IOException e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15085 c150854 = (C15085) arrayList.get(size);
                AbstractC15440 abstractC154404 = c150854.f46078;
                AbstractC15440 abstractC154405 = c150854.f46080;
                if (abstractC154404 != null) {
                    if (abstractC154404.mo23120()) {
                        if (c150854.f46075) {
                            m49747(c150854, e);
                        }
                        try {
                            c150854.f46078.m36501(abstractC154405, false, false, null);
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else {
                        e.addSuppressed(new IOException(C4153.m12552(abstractC154405, new StringBuilder("Compression rollback file is missing: "))));
                    }
                } else if (!c150854.f46079 && c150854.f46075) {
                    m49747(c150854, e);
                }
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49747(C15085 c15085, IOException iOException) {
        AbstractC15440 abstractC15440 = c15085.f46080;
        if (!abstractC15440.mo23120() || abstractC15440.mo23552()) {
            return;
        }
        iOException.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete published compression output: "))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49746(List list, EnumC21437 enumC21437, IOException iOException) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            try {
                m49743(abstractC15440, enumC21437);
                if (abstractC15440.mo23120() && !abstractC15440.mo23552() && iOException != null) {
                    iOException.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete temporary compression output: "))));
                }
            } catch (IOException unused) {
            }
        }
    }
}
