package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Y4W0 */
/* renamed from: l.ۙ᩻ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4982 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21916[] m14468(C21916[] c21916Arr) {
        if (c21916Arr != null && c21916Arr.length > 1) {
            int i = 0;
            while (i < c21916Arr.length) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < c21916Arr.length; i3++) {
                    if (m14467(c21916Arr[i], c21916Arr[i3])) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(c21916Arr));
                        while (true) {
                            int i4 = 0;
                            while (i4 < arrayList.size()) {
                                int i5 = i4 + 1;
                                for (int i6 = i5; i6 < arrayList.size(); i6++) {
                                    C21916 c21916 = (C21916) arrayList.get(i4);
                                    C21916 c219162 = (C21916) arrayList.get(i6);
                                    boolean m14467 = m14467(c21916, c219162);
                                    String str = c21916.f70169;
                                    int i7 = c21916.f70167;
                                    String str2 = c219162.f70169;
                                    int i8 = c219162.f70167;
                                    if (m14467) {
                                        int i9 = c21916.f70168;
                                        int i10 = c219162.f70168;
                                        if (i9 < i10) {
                                            arrayList.set(i6, new C21916(str2, i10, i7));
                                            arrayList.add(i6 + 1, new C21916(str2, i7, i8));
                                        } else {
                                            arrayList.set(i4, new C21916(str, i9, i8));
                                            arrayList.add(i5, new C21916(str, i8, i7));
                                        }
                                    }
                                }
                                i4 = i5;
                            }
                            return (C21916[]) arrayList.toArray(new C21916[0]);
                        }
                    }
                }
                i = i2;
            }
        }
        return c21916Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14467(C21916 c21916, C21916 c219162) {
        int i = c21916.f70168;
        int i2 = c21916.f70167;
        int i3 = c219162.f70168;
        int i4 = c219162.f70167;
        if (i >= i3 || i3 >= i2 || i2 >= i4) {
            return i3 < i && i < i4 && i4 < i2;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21916[] m14469(C21916[] c21916Arr) {
        if (c21916Arr == null || c21916Arr.length <= 1) {
            return c21916Arr;
        }
        HashMap hashMap = new HashMap();
        for (C21916 c21916 : c21916Arr) {
            ((List) C13843.computeIfAbsent(hashMap, c21916.f70169, new C22621(0))).add(c21916);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            List list = (List) hashMap.get(str);
            C11003.requireNonNull(list);
            List list2 = list;
            C6083.sort(list2, C8200.comparingInt(new C20505()));
            int i = ((C21916) list2.get(0)).f70168;
            int i2 = ((C21916) list2.get(0)).f70167;
            for (int i3 = 1; i3 < list2.size(); i3++) {
                C21916 c219162 = (C21916) list2.get(i3);
                int i4 = c219162.f70168;
                int i5 = c219162.f70167;
                if (i4 <= i2) {
                    i2 = Math.max(i2, i5);
                } else {
                    arrayList.add(new C21916(str, i, i2));
                    i = c219162.f70168;
                    i2 = i5;
                }
            }
            arrayList.add(new C21916(str, i, i2));
        }
        return (C21916[]) arrayList.toArray(new C21916[0]);
    }
}
