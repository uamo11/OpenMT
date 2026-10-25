package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: I6LL */
/* renamed from: l.۫ܶۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12484 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f37512 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f37509 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f37510 = new HashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f37513 = new HashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37511 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30644(String... strArr) {
        for (String str : strArr) {
            C16990.m39823(str);
            this.f37512.add(new C3312(str));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30643(String str, String... strArr) {
        C16990.m39823(str);
        if (!(strArr.length > 0)) {
            throw new C14167("No attribute names supplied.");
        }
        C3312 c3312 = new C3312(str);
        this.f37512.add(c3312);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C16990.m39823(str2);
            hashSet.add(new C22362(str2));
        }
        HashMap hashMap = this.f37509;
        if (hashMap.containsKey(c3312)) {
            ((Set) hashMap.get(c3312)).addAll(hashSet);
        } else {
            hashMap.put(c3312, hashSet);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30641(String str, String str2) {
        C16990.m39823("input");
        C16990.m39823(str);
        C16990.m39823(str2);
        C3312 c3312 = new C3312("input");
        this.f37512.add(c3312);
        C22362 c22362 = new C22362(str);
        C20246 c20246 = new C20246(str2);
        HashMap hashMap = this.f37510;
        if (hashMap.containsKey(c3312)) {
            ((Map) hashMap.get(c3312)).put(c22362, c20246);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(c22362, c20246);
        hashMap.put(c3312, hashMap2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30640() {
        this.f37511 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30642(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C16990.m39823(str);
        C16990.m39823(str2);
        C3312 c3312 = new C3312(str);
        C22362 c22362 = new C22362(str2);
        HashMap hashMap = this.f37513;
        if (hashMap.containsKey(c3312)) {
            map = (Map) hashMap.get(c3312);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap.put(c3312, hashMap2);
            map = hashMap2;
        }
        if (map.containsKey(c22362)) {
            set = (Set) map.get(c22362);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c22362, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C16990.m39823(str3);
            set.add(new C4723(str3));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15578 m30639(String str) {
        C15578 c15578 = new C15578();
        C3312 c3312 = new C3312(str);
        HashMap hashMap = this.f37510;
        if (hashMap.containsKey(c3312)) {
            for (Map.Entry entry : ((Map) hashMap.get(c3312)).entrySet()) {
                c15578.put(((C22362) entry.getKey()).toString(), ((C20246) entry.getValue()).toString());
            }
        }
        return c15578;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30645(String str, C19814 c19814, C9230 c9230) {
        C3312 c3312 = new C3312(str);
        C22362 c22362 = new C22362(c9230.getKey());
        Set set = (Set) this.f37509.get(c3312);
        if (set != null && set.contains(c22362)) {
            HashMap hashMap = this.f37513;
            if (!hashMap.containsKey(c3312)) {
                return true;
            }
            Map map = (Map) hashMap.get(c3312);
            if (!map.containsKey(c22362)) {
                return true;
            }
            Set set2 = (Set) map.get(c22362);
            String mo25043 = c19814.mo25043(c9230.getKey());
            if (mo25043.length() == 0) {
                mo25043 = c9230.getValue();
            }
            if (!this.f37511) {
                c9230.setValue(mo25043);
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String abstractC13189 = ((C4723) it.next()).toString();
                if (!abstractC13189.equals("#")) {
                    if (C23340.m51750(mo25043).startsWith(abstractC13189.concat(":"))) {
                        return true;
                    }
                } else if (mo25043.startsWith("#") && !mo25043.matches(".*\\s.*")) {
                    return true;
                }
            }
            return false;
        }
        if (((Map) this.f37510.get(c3312)) != null) {
            C15578 m30639 = m30639(str);
            String key = c9230.getKey();
            if (m30639.m36738(key)) {
                return m30639.m36725(key).equals(c9230.getValue());
            }
        }
        return !str.equals(":all") && m30645(":all", c19814, c9230);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30646(String str) {
        return this.f37512.contains(new C3312(str));
    }
}
