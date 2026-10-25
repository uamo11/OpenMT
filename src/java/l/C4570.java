package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: G4YY */
/* renamed from: l.ۙۢᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4570 {
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m13429(AbstractC7479 abstractC7479) {
        return abstractC7479.mo3975() == EnumC0841.f3075;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m13428(AbstractC7479 abstractC7479) {
        EnumC0841 mo3975 = abstractC7479.mo3975();
        return mo3975 == EnumC0841.f3287 || mo3975 == EnumC0841.f3295 || mo3975 == EnumC0841.f3271;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13426(AbstractC7479 abstractC7479) {
        EnumC0841 mo3975 = abstractC7479.mo3975();
        return mo3975 == EnumC0841.f3099 || mo3975 == EnumC0841.f3051 || mo3975 == EnumC0841.f3215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13424(AbstractC7479 abstractC7479) {
        return (abstractC7479.mo3975().f3319 & 4) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13425(AbstractC7479 abstractC7479, Set set) {
        Iterator it = abstractC7479.m20099().m37705().iterator();
        while (it.hasNext()) {
            if (!set.contains((C17337) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13420(C15152 c15152, int i, int i2) {
        List list = c15152.f46302;
        Set set = c15152.f46304;
        while (i2 >= 0) {
            AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i2);
            if (m13428(abstractC7479) && ((InterfaceC1779) abstractC7479).mo1790() == i) {
                return ((InterfaceC23651) abstractC7479).mo7930();
            }
            if (!m13424(abstractC7479) || m13425(abstractC7479, set)) {
                return -1;
            }
            i2--;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13421(InterfaceC5471 interfaceC5471) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13422(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it.next();
            switch (interfaceC22677.mo3975().f3318) {
                case 1:
                    if (!set.contains(((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType())) {
                        break;
                    } else {
                        return true;
                    }
                case 2:
                    if (!set.contains(((InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference()).mo8192())) {
                        break;
                    } else {
                        return true;
                    }
                case 3:
                    if (!set.contains(((InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference()).mo3566())) {
                        break;
                    } else {
                        return true;
                    }
                case 4:
                case 5:
                case 6:
                    return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13427(C15152 c15152, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C16631 c16631 : c15152.f46303) {
            C22209 c22209 = new C22209();
            c22209.f72086 = c16631.f51074.m40667().m37704();
            c22209.f72084 = c16631.f51072.m40667().m37704();
            AbstractC14545 of = AbstractC14545.of((Object) c16631.f51073);
            c22209.f72085 = new int[of.size()];
            for (int i3 = 0; i3 < of.size(); i3++) {
                c22209.f72085[i3] = ((AbstractC13828) of.get(i3)).m33182().m40667().m37704();
            }
            linkedList.add(c22209);
        }
        return m13423(c15152.f46302, linkedList, i, i2, new HashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (m13423(r8, r9, r10, r11 + 1, r12) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        r11 = ((l.AbstractC10988) ((l.AbstractC1815) r3).m6037().m40667().m37706()).mo8107().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        if (r11.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (m13423(r8, r9, r10, ((l.C11632) r11.next()).m28523().m40667().m37704(), r12) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0109, code lost:
    
        r0 = ((l.AbstractC1815) r3).m6037().m40667().m37704();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        if (m13423(r8, r9, r10, r11 + 1, r12) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        if (m13423(r8, r9, r10, r0, r12) == false) goto L71;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m13423(java.util.List r8, java.util.LinkedList r9, int r10, int r11, java.util.HashSet r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4570.m13423(java.util.List, java.util.LinkedList, int, int, java.util.HashSet):boolean");
    }
}
