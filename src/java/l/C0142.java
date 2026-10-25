package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* compiled from: R1V9 */
/* renamed from: l.֡ۗۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0142 extends AbstractC2821 implements InterfaceC8898 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f1265;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5082 f1266;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f1267;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f1268;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TreeSet f1269;

    public C0142(C22016 c22016, C5082 c5082, InterfaceC7397 interfaceC7397) {
        super(2);
        this.f1267 = new HashSet();
        TreeSet treeSet = new TreeSet();
        this.f1269 = treeSet;
        this.f1268 = new HashMap();
        this.f1265 = new HashMap();
        this.f1266 = c5082;
        c22016.m49537(new C19194(this, interfaceC7397));
        ArrayList arrayList = new ArrayList(treeSet.size());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C18488 c18488 = new C18488();
            c18488.f57313 = -1;
            c18488.f57314 = -1;
            c18488.f57316 = str;
            c18488.f57315 = str;
            arrayList.add(c18488);
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18488 c184882 = (C18488) arrayList.get(i2);
                String str2 = c184882.f57315;
                if (i < 0) {
                    throw new IllegalArgumentException();
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 < i) {
                        i4 = str2.indexOf(47, i4) + 1;
                        if (i4 == 0) {
                            c184882.f57314 = -1;
                            c184882.f57313 = -1;
                            c184882.f57317 = null;
                            c184882.f57318 = str2;
                            break;
                        }
                        i3++;
                    } else {
                        int indexOf = str2.indexOf(47, i4 + 1);
                        indexOf = indexOf == -1 ? str2.length() : indexOf;
                        c184882.f57313 = i4;
                        c184882.f57314 = indexOf;
                        c184882.f57317 = str2.substring(i4, indexOf);
                        c184882.f57318 = str2.substring(0, i4);
                    }
                }
            }
            i++;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C18488 c184883 = (C18488) it2.next();
                String str3 = c184883.f57317;
                if (str3 != null) {
                    String m23341 = C9045.m23341(new StringBuilder(), c184883.f57318, str3);
                    List list = (List) linkedHashMap.get(m23341);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(m23341, list);
                    }
                    list.add(c184883);
                }
            }
            Collection<List> values = linkedHashMap.values();
            if (values.isEmpty()) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    C18488 c184884 = (C18488) arrayList.get(i5);
                    if (c5082.m14633(c184884.f57315)) {
                        c184884.f57313 = 0;
                        c184884.m42983(m1224("pkg/"), false);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C18488 c184885 = (C18488) it3.next();
                    this.f1265.put(c184885.f57316, c184885.f57315);
                }
                return;
            }
            for (List<C18488> list2 : values) {
                C18488 c184886 = (C18488) list2.get(0);
                if (c5082.m14634(c184886.f57317)) {
                    String m1224 = m1224(c184886.f57318);
                    for (C18488 c184887 : list2) {
                        c184887.m42983(m1224, true);
                        this.f1267.add(c184887.f57315);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1225(C2966 c2966) {
        String m20585 = C7695.m20585(c2966);
        if (m20585 == null) {
            throw new IllegalStateException();
        }
        int lastIndexOf = m20585.lastIndexOf(47);
        String substring = lastIndexOf == -1 ? "" : m20585.substring(0, lastIndexOf);
        String str = (String) this.f1265.get(substring);
        if (str != null) {
            if (substring.isEmpty()) {
                str = str.concat("/");
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(m20585.substring(substring.length()));
            c2966.mo13103((Object) m15339.toString());
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m1224(String str) {
        String sb;
        HashSet hashSet;
        HashMap hashMap = this.f1268;
        AbstractC0890 abstractC0890 = (AbstractC0890) hashMap.get(str);
        if (abstractC0890 == null) {
            abstractC0890 = AbstractC0890.m3238();
            hashMap.put(str, abstractC0890);
        }
        do {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(abstractC0890.mo3239());
            sb = m15339.toString();
            hashSet = this.f1267;
        } while (hashSet.contains(sb));
        hashSet.add(sb);
        return sb;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m1222(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }
}
