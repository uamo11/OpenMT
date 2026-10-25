package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: M6O6 */
/* renamed from: l.۫ۛۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12221 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29716(CharSequence charSequence, C3463 c3463, C19012 c19012) {
        try {
            C4460 c4460 = new C4460();
            c4460.m13206();
            if (charSequence.length() > 1048576) {
                throw m29712(EnumC19402.LIMIT, "Source length limit exceeded");
            }
            if (c19012.length() != 0) {
                throw new IllegalArgumentException("Output must be empty");
            }
            String m28343 = C11516.m28343(charSequence, c4460);
            C19012 m43853 = c19012.m43853();
            int i = 0;
            try {
                try {
                    m29715(charSequence, c3463, m28343, c4460, m43853);
                } catch (Throwable th) {
                    try {
                        m43853.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (C0350 e) {
                if (e.f1759 != EnumC19402.SYNTAX) {
                    throw e;
                }
                m43853.m43855(0);
                C15042.m35583(charSequence, c3463, m28343, c4460, m43853);
            }
            while (i < m43853.length()) {
                c4460.m13206();
                int i2 = i + 4096;
                c19012.m43854(i, Math.min(m43853.length(), i2), m43853);
                i = i2;
            }
            c4460.m13206();
            m43853.close();
        } catch (StackOverflowError unused) {
            throw m29712(EnumC19402.LIMIT, "Parser stack limit exceeded");
        } catch (C6701 unused2) {
            throw new InterruptedException("Code formatting cancelled");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29715(CharSequence charSequence, C3463 c3463, String str, C4460 c4460, C19012 c19012) {
        List list;
        C8694 c8694;
        C8694 c86942;
        C8694 c86943;
        List list2;
        List list3;
        C12926 m29717 = m29717(charSequence, c4460);
        list = m29717.f38795;
        c8694 = m29717.f38794;
        new C11516(charSequence, list, c8694, c3463, str, c4460).m28346(c19012);
        try {
            C12926 m297172 = m29717(c19012, c4460);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            c86942 = m29717.f38794;
            arrayDeque.push(c86942);
            c86943 = m297172.f38794;
            arrayDeque2.push(c86943);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c4460.m13206();
                InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque.pop();
                InterfaceC16174 interfaceC161742 = (InterfaceC16174) arrayDeque2.pop();
                if (interfaceC16174.getChildCount() == interfaceC161742.getChildCount()) {
                    boolean z = interfaceC16174 instanceof C8931;
                    if (z) {
                        C8931 c8931 = (C8931) interfaceC16174;
                        if (interfaceC161742 instanceof C8931) {
                            if (c8931.mo1085() != ((C8931) interfaceC161742).mo1085()) {
                            }
                        }
                    }
                    if (z || !(interfaceC161742 instanceof C8931)) {
                        int childCount = interfaceC16174.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(interfaceC16174.mo23040(childCount));
                                arrayDeque2.push(interfaceC161742.mo23040(childCount));
                            }
                        }
                    }
                }
                throw m29712(EnumC19402.CHANGED, "Syntax structure changed during formatting");
            }
            if (!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()) {
                throw m29712(EnumC19402.CHANGED, "Syntax length changed");
            }
            list2 = m29717.f38795;
            list3 = m297172.f38795;
            m29714(charSequence, list2, c19012, list3, c4460);
        } catch (C0350 e) {
            if (e.f1759 == EnumC19402.SYNTAX) {
                throw m29712(EnumC19402.CHANGED, "Formatted output could not be parsed");
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1875 m29713(CharSequence charSequence, C4460 c4460) {
        C1056 c1056 = new C1056(new C20813(new C3049(charSequence, c4460)));
        c1056.m43458();
        c1056.m43456(new C21394());
        C22099 c22099 = new C22099(c1056, c4460);
        c22099.m6206();
        if (c22099.m6213(c22099.size() - 1).getType() == -1) {
            return c22099;
        }
        throw m29712(EnumC19402.LIMIT, "Token count limit exceeded");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12926 m29717(CharSequence charSequence, C4460 c4460) {
        C1875 m29713 = m29713(charSequence, c4460);
        C19983 c19983 = new C19983(m29713, c4460);
        c19983.m43458();
        c19983.m43456(new C21394());
        return new C12926(m29713.m6210(), c19983.m14818());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29714(CharSequence charSequence, List list, C19012 c19012, List list2, C4460 c4460) {
        Iterator it = list.iterator();
        InterfaceC0463 interfaceC0463 = null;
        InterfaceC0463 interfaceC04632 = null;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC0463 interfaceC04633 = (InterfaceC0463) it.next();
            c4460.m13206();
            if (interfaceC04633.getType() != 65) {
                while (i < list2.size() && ((InterfaceC0463) list2.get(i)).getType() == 65) {
                    i++;
                }
                if (i == list2.size()) {
                    throw m29712(EnumC19402.CHANGED, "Token count changed");
                }
                int i2 = i + 1;
                InterfaceC0463 interfaceC04634 = (InterfaceC0463) list2.get(i);
                int mo2053 = (interfaceC04633.mo2053() - interfaceC04633.mo2054()) + 1;
                if (interfaceC04633.getType() != interfaceC04634.getType() || mo2053 != (interfaceC04634.mo2053() - interfaceC04634.mo2054()) + 1) {
                    throw m29712(EnumC19402.CHANGED, "Token content changed");
                }
                for (int i3 = 0; i3 < mo2053; i3++) {
                    if ((i3 & 1023) == 0) {
                        c4460.m13206();
                    }
                    if (charSequence.charAt(interfaceC04633.mo2054() + i3) != c19012.charAt(interfaceC04634.mo2054() + i3)) {
                        throw m29712(EnumC19402.CHANGED, "Token content changed");
                    }
                }
                if (interfaceC0463 != null && ((C11516.m28345(interfaceC04633) || C11516.m28345(interfaceC0463)) && C11516.m28344(interfaceC0463.mo2053() + 1, interfaceC04633.mo2054(), charSequence) != C11516.m28344(interfaceC04632.mo2053() + 1, interfaceC04634.mo2054(), c19012))) {
                    throw m29712(EnumC19402.CHANGED, "Comment ownership changed");
                }
                interfaceC04632 = interfaceC04634;
                interfaceC0463 = interfaceC04633;
                i = i2;
            }
        }
        if (i != list2.size()) {
            throw m29712(EnumC19402.CHANGED, "Token count changed");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0350 m29712(EnumC19402 enumC19402, String str) {
        return new C0350(enumC19402, 1, 0, str);
    }
}
