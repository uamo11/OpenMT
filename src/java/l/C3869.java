package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: W79N */
/* renamed from: l.ۘۢ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3869 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12372 = new LinkedHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12373 = new LinkedHashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12376 = new LinkedHashSet();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12374 = new LinkedHashSet();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12375 = new LinkedHashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11687(int i, String str) {
        ArrayList arrayList;
        boolean z;
        C10925 c10925;
        int i2;
        C10925 c109252;
        String str2;
        this.f12375.add(m11685(i, str));
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f12372.entrySet()) {
            C18686 c18686 = (C18686) entry.getValue();
            z = c18686.f59093;
            if (z) {
                c10925 = c18686.f59092;
                i2 = c10925.f32833;
                if (i2 == i) {
                    c109252 = c18686.f59092;
                    str2 = c109252.f32831;
                    if (C11003.equals(str2, str)) {
                        arrayList.add((String) entry.getKey());
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11683((String) it.next());
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11688(String str, String str2) {
        ArrayList arrayList;
        this.f12376.add(str);
        this.f12374.add(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f12373.get(str2);
        if (linkedHashSet2 != null) {
            linkedHashSet.addAll(linkedHashSet2);
        }
        arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (m11683(str3) != null) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11689(String str, String str2, C10925 c10925) {
        String str3;
        int i;
        ArrayList m11682;
        String str4;
        int i2;
        str3 = c10925.f32831;
        i = c10925.f32833;
        m11682 = m11682(i, str, str3);
        Iterator it = m11682.iterator();
        while (it.hasNext()) {
            m11683((String) it.next());
        }
        this.f12376.remove(str);
        this.f12374.remove(str2);
        LinkedHashSet linkedHashSet = this.f12375;
        str4 = c10925.f32831;
        i2 = c10925.f32833;
        linkedHashSet.remove(m11685(i2, str4));
        m11684(str, str2, c10925, false);
        return m11682;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11690(String str, String str2, C10925 c10925) {
        String str3;
        int i;
        String str4;
        int i2;
        if (!this.f12376.contains(str) && !this.f12374.contains(str2)) {
            LinkedHashSet linkedHashSet = this.f12375;
            str3 = c10925.f32831;
            i = c10925.f32833;
            if (!linkedHashSet.contains(m11685(i, str3))) {
                str4 = c10925.f32831;
                i2 = c10925.f32833;
                if (!m11686(i2, str, str4)) {
                    m11684(str, str2, c10925, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m11686(int i, String str, String str2) {
        boolean z;
        C10925 c10925;
        int i2;
        C10925 c109252;
        String str3;
        boolean z2;
        LinkedHashMap linkedHashMap = this.f12372;
        C18686 c18686 = (C18686) linkedHashMap.get(str);
        if (c18686 != null) {
            z2 = c18686.f59093;
            if (!z2) {
                return true;
            }
        }
        for (C18686 c186862 : linkedHashMap.values()) {
            z = c186862.f59093;
            if (!z) {
                c10925 = c186862.f59092;
                i2 = c10925.f32833;
                if (i2 == i) {
                    c109252 = c186862.f59092;
                    str3 = c109252.f32831;
                    if (C11003.equals(str3, str2)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m11682(int i, String str, String str2) {
        boolean z;
        C10925 c10925;
        int i2;
        C10925 c109252;
        String str3;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f12372.entrySet()) {
            C18686 c18686 = (C18686) entry.getValue();
            z = c18686.f59093;
            if (z) {
                if (!((String) entry.getKey()).equals(str)) {
                    c10925 = c18686.f59092;
                    i2 = c10925.f32833;
                    if (i2 == i) {
                        c109252 = c18686.f59092;
                        str3 = c109252.f32831;
                        if (C11003.equals(str3, str2)) {
                        }
                    }
                }
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11684(String str, String str2, C10925 c10925, boolean z) {
        m11683(str);
        this.f12372.put(str, new C18686(str2, c10925, z));
        LinkedHashMap linkedHashMap = this.f12373;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str2, linkedHashSet);
        }
        linkedHashSet.add(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18686 m11683(String str) {
        String str2;
        String str3;
        C18686 c18686 = (C18686) this.f12372.remove(str);
        if (c18686 == null) {
            return null;
        }
        str2 = c18686.f59091;
        LinkedHashMap linkedHashMap = this.f12373;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str);
            if (linkedHashSet.isEmpty()) {
                str3 = c18686.f59091;
                linkedHashMap.remove(str3);
            }
        }
        return c18686;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11685(int i, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = C0340.f1745;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        sb.append(i);
        return sb.toString();
    }
}
