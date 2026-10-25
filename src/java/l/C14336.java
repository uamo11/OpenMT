package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: J1PQ */
/* renamed from: l.ܳۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14336 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C23300 f43228 = new C23300(3);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Collection f43231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43230 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Comparator f43229 = f43228;

    public C14336(Collection collection) {
        this.f43231 = collection;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14336 m34211(Collection collection) {
        return new C14336(collection);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34216(int i) {
        this.f43230 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34217(C3404 c3404) {
        this.f43229 = c3404;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17159 m34215() {
        String[] strArr;
        ArrayList arrayList;
        Collection<String> collection = this.f43231;
        int i = this.f43230;
        Comparator comparator = this.f43229;
        boolean z = i == 1;
        boolean z2 = i == 2;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                HashMap hashMap = new HashMap();
                C17159 m34212 = m34212("", hashMap, z2);
                for (String str : collection) {
                    int lastIndexOf = str.lastIndexOf(47);
                    if (lastIndexOf == -1) {
                        strArr = new String[]{"", str};
                    } else {
                        strArr = new String[]{str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1)};
                    }
                    arrayList = m34212(strArr[0], hashMap, z2).f52565;
                    arrayList.add(new C10810(strArr[1], str));
                }
                if (z) {
                    m34213(m34212);
                }
                m34212.m40253(comparator);
                return m34212;
            } catch (ConcurrentModificationException unused) {
                Thread.yield();
            }
        }
        return new C17159(null, "", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17159 m34212(String str, HashMap hashMap, boolean z) {
        String[] strArr;
        C17159 c17159;
        ArrayList arrayList;
        C17159 c171592;
        ArrayList arrayList2;
        C17159 c171593 = (C17159) hashMap.get(str);
        if (c171593 != null) {
            return c171593;
        }
        if (str.isEmpty()) {
            c171592 = new C17159(null, "", str);
        } else {
            if (z) {
                C17159 m34212 = m34212("", hashMap, true);
                c17159 = new C17159(m34212, str.replace('/', '.'), str);
                arrayList2 = m34212.f52564;
                arrayList2.add(c17159);
            } else {
                int lastIndexOf = str.lastIndexOf(47);
                if (lastIndexOf == -1) {
                    strArr = new String[]{"", str};
                } else {
                    strArr = new String[]{str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1)};
                }
                C17159 m342122 = m34212(strArr[0], hashMap, false);
                c17159 = new C17159(m342122, strArr[1], str);
                arrayList = m342122.f52564;
                arrayList.add(c17159);
            }
            c171592 = c17159;
        }
        hashMap.put(str, c171592);
        return c171592;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34210(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34214(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34213(C17159 c17159) {
        C17159 c171592;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        String str2;
        String str3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        c171592 = c17159.f52568;
        if (c171592 != null) {
            arrayList2 = c17159.f52564;
            if (arrayList2.size() == 1) {
                arrayList3 = c17159.f52565;
                if (arrayList3.isEmpty()) {
                    arrayList4 = c17159.f52564;
                    C17159 c171593 = (C17159) arrayList4.remove(0);
                    StringBuilder sb = new StringBuilder();
                    str = c17159.f52566;
                    sb.append(str);
                    sb.append(".");
                    str2 = c171593.f52566;
                    sb.append(str2);
                    c17159.f52566 = sb.toString();
                    str3 = c171593.f52567;
                    c17159.f52567 = str3;
                    arrayList5 = c17159.f52564;
                    arrayList6 = c171593.f52564;
                    arrayList5.addAll(arrayList6);
                    arrayList7 = c17159.f52565;
                    arrayList8 = c171593.f52565;
                    arrayList7.addAll(arrayList8);
                    arrayList9 = c17159.f52564;
                    Iterator it = arrayList9.iterator();
                    while (it.hasNext()) {
                        ((C17159) it.next()).f52568 = c17159;
                    }
                    arrayList10 = c17159.f52565;
                    Iterator it2 = arrayList10.iterator();
                    while (it2.hasNext()) {
                        ((C10810) it2.next()).getClass();
                    }
                    m34213(c17159);
                }
            }
        }
        arrayList = c17159.f52564;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m34213((C17159) it3.next());
        }
    }
}
