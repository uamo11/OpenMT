package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VAIY */
/* renamed from: l.ۤܺܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10395 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f31270 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f31269 = C16895.m39756();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m26214(String str, String str2) {
        synchronized (C10395.class) {
            HashMap hashMap = f31270;
            if (C11003.equals(hashMap.get(str), str2)) {
                hashMap.remove(str);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized void m26221(String str, String str2) {
        synchronized (C10395.class) {
            if (!TextUtils.isEmpty(str2)) {
                HashMap hashMap = f31270;
                if (TextUtils.isEmpty((CharSequence) hashMap.get(str))) {
                    hashMap.put(str, str2);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized String m26212(String str) {
        String str2;
        synchronized (C10395.class) {
            str2 = (String) C13843.getOrDefault(f31270, str, "");
            if (str2 != null && !str2.isEmpty()) {
                System.out.println(">> Get password: " + str + " -> " + str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (l.C10395.f31270.remove(r4) != null) goto L11;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m26217(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r1 = "<< Set password: "
            java.lang.Class<l.ۤܺܳ> r0 = l.C10395.class
            monitor-enter(r0)
            if (r5 == 0) goto L14
            boolean r2 = r5.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Le
            goto L14
        Le:
            java.util.HashMap r2 = l.C10395.f31270     // Catch: java.lang.Throwable -> L37
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            goto L1c
        L14:
            java.util.HashMap r2 = l.C10395.f31270     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.remove(r4)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L35
        L1c:
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
            r3.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = " -> "
            r3.append(r4)     // Catch: java.lang.Throwable -> L37
            r3.append(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L37
            r2.println(r4)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r0)
            return
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10395.m26217(java.lang.String, java.lang.String):void");
    }

    static {
        m26222();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m26222() {
        List list = f31269;
        list.clear();
        String string = ApplicationC20075.f65008.getString("cpwsj", null);
        try {
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        list.add(new C12511(jSONArray2.getString(0), jSONArray2.getString(1)));
                    } else if (obj != null && obj != JSONObject.NULL) {
                        list.add(new C12511(obj.toString(), null));
                    }
                }
                return;
            }
            String[] mo18255 = ApplicationC20075.f65008.mo18255("cpws", (String[]) null);
            if (mo18255 != null) {
                for (String str : mo18255) {
                    list.add(new C12511(str, null));
                }
                ApplicationC20075.f65008.edit().remove("cpws").putString("cpwsj", new JSONArray(mo18255).toString()).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26215(ArrayList arrayList) {
        List<C12511> list = f31269;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C12511 c12511 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C12511 c125112 = (C12511) it.next();
                    if (C11003.equals(c12511.f37581, c125112.f37581)) {
                        if (!C11003.equals(c12511.f37580, c125112.f37580)) {
                            c125112.f37580 = c12511.f37580;
                        }
                    }
                } else {
                    arrayList.add(c12511);
                    break;
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        synchronized (f31269) {
            m26224();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m26216() {
        Iterator it;
        List list = f31269;
        synchronized (list) {
            it = ((List) C5378.stream(list).map(new C13216(0)).collect(C22976.toUnmodifiableList())).iterator();
        }
        return it;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m26220() {
        return f31269;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m26223() {
        List unmodifiableList;
        List<C12511> list = f31269;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C12511 c12511 : list) {
                arrayList.add(new C12511(c12511.f37581, c12511.f37580));
            }
            unmodifiableList = C20195.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26219() {
        C1802.m5991(new RunnableC0318(1), f31269, 500L);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26218(ArrayList arrayList) {
        List list = f31269;
        synchronized (list) {
            list.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12511 c12511 = (C12511) it.next();
                f31269.add(new C12511(c12511.f37581, c12511.f37580));
            }
            m26224();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26213() {
        synchronized (f31269) {
            m26224();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m26224() {
        JSONArray jSONArray = new JSONArray();
        for (C12511 c12511 : f31269) {
            if (TextUtils.isEmpty(c12511.f37580)) {
                jSONArray.put(c12511.f37581);
            } else {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(c12511.f37581);
                jSONArray2.put(c12511.f37580);
                jSONArray.put(jSONArray2);
            }
        }
        ApplicationC20075.f65008.edit().putString("cpwsj", jSONArray.toString()).apply();
    }
}
