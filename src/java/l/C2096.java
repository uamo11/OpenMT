package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: 17CG */
/* renamed from: l.֫᩸ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2096 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10630 f7020;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f7021;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5242 f7022;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f7023;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f7024;

    static {
        Object obj = new Object();
        f7024 = obj;
        ArrayList arrayList = new ArrayList();
        f7021 = arrayList;
        C10630 c10630 = new C10630();
        f7020 = c10630;
        f7022 = new C5242();
        f7023 = 1;
        synchronized (obj) {
            arrayList.clear();
            c10630.clear();
            f7023 = 1;
            String string = ApplicationC20075.f65008.getString("ndg_data", null);
            if (string != null && !string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f7023 = Math.max(1, jSONObject.getInt("nextId"));
                    JSONArray jSONArray = jSONObject.getJSONArray("groups");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        f7021.add(new C13900(jSONObject2.getInt("id"), jSONObject2.getString("name")));
                    }
                    if (jSONObject.contains("assignments")) {
                        Iterator it = jSONObject.getJSONObject("assignments").iterator();
                        while (it.hasNext()) {
                            JSONObject.Member member = (JSONObject.Member) it.next();
                            f7020.mo23658(Integer.parseInt(member.getName()), member.getValue().asInt());
                        }
                    }
                } catch (JSONParseException | NumberFormatException unused) {
                    f7021.clear();
                    f7020.clear();
                    f7023 = 1;
                }
            }
        }
        m6969();
        C12749.m31036(new C10374());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6950(Main main, C8257 c8257) {
        f7022.m1668(main, c8257);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6965() {
        ArrayList arrayList;
        synchronized (f7024) {
            arrayList = new ArrayList(f7021);
        }
        return arrayList;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m6968() {
        return f7021.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6954(C20252 c20252) {
        synchronized (f7024) {
            Iterator it = f7021.iterator();
            while (it.hasNext()) {
                c20252.accept((C13900) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m6957(int i, String str) {
        synchronized (f7024) {
            Iterator it = f7021.iterator();
            while (it.hasNext()) {
                C13900 c13900 = (C13900) it.next();
                if (c13900.f41423 != i && str.equals(c13900.f41424)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6951(String str) {
        synchronized (f7024) {
            int i = f7023;
            f7023 = i + 1;
            f7021.add(new C13900(i, str));
            m6966();
        }
        f7022.mo1664(Object.class);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m6962(int i, String str) {
        synchronized (f7024) {
            C13900 m6961 = m6961(i);
            if (m6961 == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            m6961.f41424 = str;
            m6966();
        }
        f7022.mo1664(Object.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6946(final int i) {
        ArrayList m6963 = m6963();
        synchronized (f7024) {
            if (m6961(i) == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            C5378.removeIf(f7021, new Predicate() { // from class: l.ۛܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C13900) obj).f41423 == i;
                }
            });
            C5378.removeIf(f7020.mo26663(), new Predicate() { // from class: l.ۨܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC2869) obj).mo8792() == i;
                }
            });
        }
        m6953(m6963, true, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6952(ArrayList arrayList) {
        ArrayList m6963 = m6963();
        synchronized (f7024) {
            int size = arrayList.size();
            ArrayList arrayList2 = f7021;
            if (size != arrayList2.size()) {
                throw new IllegalArgumentException("Unexpected group count " + arrayList.size());
            }
            HashMap hashMap = new HashMap(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C13900 c13900 = (C13900) it.next();
                hashMap.put(Integer.valueOf(c13900.f41423), c13900);
            }
            ArrayList arrayList3 = new ArrayList(f7021.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                if (num == null) {
                    throw new IllegalArgumentException("Group id can not be null");
                }
                C13900 c139002 = (C13900) hashMap.remove(num);
                if (c139002 == null) {
                    throw new IllegalArgumentException("Unknown or duplicate group " + num);
                }
                arrayList3.add(c139002);
            }
            if (!hashMap.isEmpty()) {
                throw new IllegalArgumentException("Missing group ids " + hashMap.keySet());
            }
            ArrayList arrayList4 = f7021;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        m6953(m6963, true, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6959() {
        ArrayList m6963 = m6963();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f7024) {
            Iterator it = f7021.iterator();
            while (it.hasNext()) {
                C13900 c13900 = (C13900) it.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", c13900.f41424);
                jSONArray.add(jSONObject3);
            }
            Iterator it2 = m6963.iterator();
            while (it2.hasNext()) {
                AbstractC3577 abstractC3577 = (AbstractC3577) it2.next();
                int m6967 = m6967(abstractC3577.f11356);
                C13900 m6961 = m6967 == -1 ? null : m6961(m6967);
                jSONObject2.put(String.valueOf(abstractC3577.f11356), m6961 == null ? "" : m6961.f41424);
            }
        }
        jSONObject.put("groups", jSONArray);
        jSONObject.put("assignments", jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6949(bin.mt.json.JSONObject r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2096.m6949(bin.mt.json.JSONObject, boolean):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m6964(int i) {
        int m6967;
        synchronized (f7024) {
            m6967 = m6967(i);
        }
        return m6967;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6947(int i, int i2, Integer num) {
        int i3;
        ArrayList m6963 = m6963();
        int m6943 = m6943(m6963, i);
        if (m6943 < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unknown config "));
        }
        synchronized (f7024) {
            i3 = -1;
            if (m6967(i) == i2) {
                if (num != null) {
                    i3 = m6943(m6963, num.intValue());
                }
                if (i3 < 0) {
                    i3 = m6943;
                }
            } else {
                int m6944 = m6944(m6963, m6943, i2, num);
                C10630 c10630 = f7020;
                if (i2 == -1) {
                    c10630.remove(i);
                } else {
                    if (m6961(i2) == null) {
                        throw new IllegalArgumentException("Unknown group " + i2);
                    }
                    c10630.mo23658(i, i2);
                }
                m6966();
                i3 = m6944;
            }
        }
        if (m6943 != i3) {
            C12749.m31034(m6943, i3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6944(ArrayList arrayList, int i, int i2, Integer num) {
        int m6943 = num == null ? -1 : m6943(arrayList, num.intValue());
        if (m6943 < 0) {
            ArrayList arrayList2 = f7021;
            int i3 = 0;
            C10630 c10630 = new C10630(arrayList2.size() + 1, 0);
            c10630.m43653();
            c10630.mo23658(-1, 0);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = ((C13900) arrayList2.get(i4)).f41423;
                i4++;
                c10630.mo23658(i5, i4);
            }
            int i6 = c10630.get(i2);
            if (i6 < 0) {
                throw new IllegalArgumentException(C19370.m44628(i2, "Unknown group "));
            }
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            while (true) {
                if (i3 >= size3) {
                    m6943 = size2;
                    break;
                }
                if (c10630.get(m6967(((AbstractC3577) arrayList.get(i3)).f11356)) > i6) {
                    m6943 = i3;
                    break;
                }
                i3++;
            }
        }
        return i < m6943 ? m6943 - 1 : m6943;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6963() {
        ArrayList arrayList;
        synchronized (C12749.class) {
            arrayList = new ArrayList(C12749.m31046());
        }
        return arrayList;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m6969() {
        m6953(m6963(), false, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6953(ArrayList arrayList, boolean z, boolean z2) {
        C7551 m6960;
        synchronized (f7024) {
            m6960 = m6960(arrayList);
            if (z || m6960.f23332) {
                m6966();
            }
        }
        InterfaceC1022 interfaceC1022 = m6960.f23333;
        if (interfaceC1022 != null) {
            C12749.m31037(interfaceC1022);
        }
        if (z2 || m6960.f23332 || m6960.f23333 != null) {
            f7022.mo1664(Object.class);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6943(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC3577) arrayList.get(i2)).f11356 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7551 m6960(ArrayList arrayList) {
        C15859 c15859;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.put(Integer.valueOf(((AbstractC3577) it.next()).f11356), Boolean.TRUE);
        }
        boolean removeIf = C5378.removeIf(f7020.mo26663(), new C5176(1, hashMap));
        ArrayList arrayList2 = f7021;
        if (!arrayList2.isEmpty()) {
            C15859 c158592 = new C15859(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c158592.add(((AbstractC3577) it2.next()).f11356);
            }
            C10630 c10630 = new C10630(arrayList2.size() + 1, 0);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
            c10630.mo23658(-1, 0);
            arrayList3.add(new C15859());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = ((C13900) arrayList2.get(i)).f41423;
                i++;
                c10630.mo23658(i2, i);
                arrayList3.add(new C15859());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC3577 abstractC3577 = (AbstractC3577) it3.next();
                ((InterfaceC1022) arrayList3.get(c10630.get(m6967(abstractC3577.f11356)))).add(abstractC3577.f11356);
            }
            c15859 = new C15859(arrayList.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c15859.mo26283((InterfaceC1022) it4.next());
            }
            if (c158592.size() == c15859.size()) {
                int size2 = c158592.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (c158592.getInt(i3) != c15859.getInt(i3)) {
                        break;
                    }
                }
            }
            return new C7551(removeIf, c15859);
        }
        c15859 = null;
        return new C7551(removeIf, c15859);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6958(HashMap hashMap, InterfaceC2869 interfaceC2869) {
        if (hashMap.containsKey(Integer.valueOf(interfaceC2869.mo8791()))) {
            return interfaceC2869.mo8792() != -1 && m6961(interfaceC2869.mo8792()) == null;
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m6967(int i) {
        int m26664 = f7020.m26664(i);
        if (m26664 == -1 || m6961(m26664) == null) {
            return -1;
        }
        return m26664;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13900 m6961(int i) {
        Iterator it = f7021.iterator();
        while (it.hasNext()) {
            C13900 c13900 = (C13900) it.next();
            if (c13900.f41423 == i) {
                return c13900;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6956(C23073 c23073, ArrayList arrayList) {
        ArrayList arrayList2 = f7021;
        arrayList2.clear();
        f7020.clear();
        f7023 = 1;
        Iterator it = c23073.f74215.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int i = f7023;
            f7023 = i + 1;
            arrayList2.add(new C13900(i, str));
        }
        HashMap m6945 = m6945();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i2 = ((AbstractC3577) it2.next()).f11356;
            m6948(i2, (String) c23073.f74214.get(Integer.valueOf(i2)), m6945);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6955(C23073 c23073) {
        ArrayList arrayList = c23073.f74215;
        ArrayList arrayList2 = f7021;
        HashMap hashMap = new HashMap(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C13900 c13900 = (C13900) it.next();
            hashMap.put(c13900.f41424, c13900);
        }
        ArrayList arrayList3 = new ArrayList(Math.max(arrayList2.size(), arrayList.size()));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            C13900 c139002 = (C13900) hashMap.remove(str);
            if (c139002 == null) {
                int i = f7023;
                f7023 = i + 1;
                c139002 = new C13900(i, str);
            }
            arrayList3.add(c139002);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C13900 c139003 = (C13900) it3.next();
            if (hashMap.containsKey(c139003.f41424)) {
                arrayList3.add(c139003);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        HashMap m6945 = m6945();
        for (Map.Entry entry : c23073.f74214.entrySet()) {
            m6948(((Integer) entry.getKey()).intValue(), (String) entry.getValue(), m6945);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m6945() {
        ArrayList arrayList = f7021;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13900 c13900 = (C13900) it.next();
            hashMap.put(c13900.f41424, Integer.valueOf(c13900.f41423));
        }
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6948(int i, String str, HashMap hashMap) {
        C10630 c10630 = f7020;
        if (str == null || str.isEmpty()) {
            c10630.remove(i);
            return;
        }
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            c10630.mo23658(i, num.intValue());
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m6966() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextId", f7023);
        JSONArray jSONArray = new JSONArray();
        Iterator it = f7021.iterator();
        while (it.hasNext()) {
            C13900 c13900 = (C13900) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", c13900.f41423);
            jSONObject2.put("name", c13900.f41424);
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("groups", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        InterfaceC12063 it2 = f7020.mo26663().iterator();
        while (it2.hasNext()) {
            InterfaceC2869 interfaceC2869 = (InterfaceC2869) it2.next();
            jSONObject3.put(String.valueOf(interfaceC2869.mo8791()), interfaceC2869.mo8792());
        }
        jSONObject.put("assignments", jSONObject3);
        ApplicationC20075.f65008.edit().putString("ndg_data", jSONObject.toString()).apply();
    }
}
