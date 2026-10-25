package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: 86KX */
/* renamed from: l.ۙ᩵ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4850 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f15321;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f15322;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f15323;

    public C4850(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f15323 = C20195.unmodifiableList(arrayList);
        this.f15321 = C20195.unmodifiableList(arrayList2);
        this.f15322 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        continue;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C4850 m14119(java.util.Collection r16, java.util.ArrayList r17) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4850.m14119(java.util.Collection, java.util.ArrayList):l.ۙ᩵ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14123(TreeMap treeMap, String str, int i) {
        Integer num = (Integer) treeMap.put(str, Integer.valueOf(i));
        if (num != null && num.intValue() != i) {
            throw m14120(num.intValue(), new String[]{str}, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14122(int i, String str) {
        if (str == null || str.isEmpty()) {
            if (str == null) {
                str = "";
            }
            throw m14121("ZIP_INVALID_ENTRY_PATH", "An update entry path must not be empty.", new String[]{str}, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m14118(String str, TreeMap treeMap) {
        if (!str.endsWith("/")) {
            return Collections.singletonList((C3545) treeMap.get(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(str).entrySet()) {
            if (!((String) entry.getKey()).startsWith(str)) {
                break;
            }
            arrayList.add((C3545) entry.getValue());
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22489 m14121(String str, String str2, String[] strArr, int i) {
        return new C22489(str, str2, Collections.singletonList(Integer.valueOf(i)), Arrays.asList(strArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22489 m14120(int i, String[] strArr, int i2) {
        return new C22489("ZIP_OPERATION_CONFLICT", "Operations touch the same entry or directory range.", Arrays.asList(Integer.valueOf(Math.min(i, i2)), Integer.valueOf(Math.max(i, i2))), Arrays.asList(strArr));
    }
}
