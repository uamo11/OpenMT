package l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: M2AR */
/* renamed from: l.۟۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7489 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23073 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f23075 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23074 = Pattern.compile("[0-9]+|\\.?[^.0-9]*");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20112(int i) {
        if (i >= 4) {
            i -= 4;
        }
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20122(int i) {
        return i >= 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20113(int i, boolean z) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException();
        }
        return i + (z ? 4 : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20120(l.C16560 r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7489.m20120(l.ܽۢܳ, java.util.List):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20119(ArrayList arrayList, int i, boolean z) {
        Comparator c11723;
        HashMap hashMap = new HashMap();
        Collator collator = Collator.getInstance();
        boolean m12003 = C3962.m12003(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            hashMap.put(interfaceC17889.getName(), new C10312(collator, interfaceC17889.getName(), m12003));
        }
        if (i == 0) {
            c11723 = new C11723(hashMap, z);
        } else if (i == 1) {
            c11723 = new C12428(hashMap, z, true);
        } else if (i == 2) {
            c11723 = new C23011(hashMap, z);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C19370.m44628(i, "method="));
            }
            c11723 = new C13838(hashMap, z);
        }
        try {
            Collections.sort(arrayList, c11723);
        } catch (IllegalArgumentException e) {
            if (m12003) {
                throw e;
            }
            hashMap.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC17889 interfaceC178892 = (InterfaceC17889) it2.next();
                hashMap.put(interfaceC178892.getName(), new C10312(collator, interfaceC178892.getName(), true));
            }
            Collections.sort(arrayList, c11723);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20115(AbstractC16891 abstractC16891) {
        switch (abstractC16891.mo6007()) {
            case "payload":
                return m20114("payload", ((C21965) abstractC16891).m49453());
            case "archive":
                return m20114("archive", ((C5168) abstractC16891).m14826());
            case "tar":
                return m20114("tar", ((C9160) abstractC16891).m23569());
            case "zip":
                return m20114("zip", ((C10738) abstractC16891).m26937());
            default:
                return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20114(String str, String str2) {
        StringBuilder m19190 = C7166.m19190(str, "\nidentityLength=");
        m19190.append(str2.length());
        m19190.append("\n");
        m19190.append(str2);
        return m19190.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Integer m20121(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f23075.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20117(int i, String str, boolean z) {
        f23075.put(str, Integer.valueOf(m20113(i, z)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20118(String str) {
        if (str != null) {
            f23075.remove(str);
        }
    }
}
