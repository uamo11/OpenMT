package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VAGS */
/* renamed from: l.۫᩻᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C12749 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f38320;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f38321;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5242 f38322;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final List f38323;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final List f38324;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static native synchronized void m31051();

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        throw new java.lang.RuntimeException("Unsupported config ver " + ((int) r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        l.C12749.f38320.addAll(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b7  */
    static {
        /*
            r0 = 102(0x66, float:1.43E-43)
            l.ApplicationC12518.m30701(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l.C12749.f38320 = r0
            java.util.List r0 = l.C20195.unmodifiableList(r0)
            l.C12749.f38324 = r0
            l.ۚۡ֫ r0 = new l.ۚۡ֫
            r0.<init>()
            l.C12749.f38322 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l.C12749.f38321 = r0
            java.util.List r0 = l.C20195.unmodifiableList(r0)
            l.C12749.f38323 = r0
            l.ܶ᩵ܿ r0 = l.C16293.f50117
            java.lang.String r1 = "config.init"
            l.ܶ᩵ܿ r0 = r0.m36526(r1)
            boolean r1 = r0.mo23113()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L37
            goto La2
        L37:
            l.ۨۤۡ r1 = new l.ۨۤۡ     // Catch: java.lang.Throwable -> Le1
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Le1
            java.lang.String r5 = r0.mo23554()     // Catch: java.lang.Throwable -> Le1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Le1
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r4 = "ftp_configs"
            byte[] r4 = r1.mo18253(r4, r2)     // Catch: java.lang.Throwable -> Le1
            if (r4 == 0) goto L9f
            int r5 = r4.length     // Catch: java.lang.Throwable -> Le1
            if (r5 != 0) goto L51
            goto L9f
        L51:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r5.<init>()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r6 = "ftp_configs_version"
            byte r1 = r1.mo18251(r3, r6)     // Catch: java.lang.Throwable -> Le1
            l.۬ۜܽ r6 = new l.۬ۜܽ     // Catch: java.lang.Throwable -> Le1
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Le1
            int r4 = r6.readInt()     // Catch: java.lang.Throwable -> Le1
            r7 = 0
        L66:
            r8 = 1
            if (r7 >= r4) goto L96
            if (r1 == 0) goto L8c
            if (r1 != r8) goto L75
            l.֫ܺ᩻ r8 = l.C7375.m19823(r6)     // Catch: java.lang.Throwable -> L9f
            r5.add(r8)     // Catch: java.lang.Throwable -> L9f
            goto L93
        L75:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r5.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = "Unsupported config ver "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9f
            r5.append(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L9f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            throw r4     // Catch: java.lang.Throwable -> L9f
        L8c:
            l.֫ܺ᩻ r8 = l.C7375.m19824(r6)     // Catch: java.lang.Throwable -> L9f
            r5.add(r8)     // Catch: java.lang.Throwable -> L9f
        L93:
            int r7 = r7 + 1
            goto L66
        L96:
            java.util.ArrayList r1 = l.C12749.f38320     // Catch: java.lang.Throwable -> Le1
            r1.addAll(r5)     // Catch: java.lang.Throwable -> Le1
            r0.mo23552()
            goto La3
        L9f:
            r0.mo23552()
        La2:
            r8 = 0
        La3:
            l.۫ۤۡ r0 = l.ApplicationC20075.f65008
            java.lang.String r1 = "ns_data"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto Lb5
            bin.mt.json.JSONArray r1 = new bin.mt.json.JSONArray     // Catch: bin.mt.json.JSONParseException -> Lb4
            r1.<init>(r0)     // Catch: bin.mt.json.JSONParseException -> Lb4
            r2 = r1
            goto Lb5
        Lb4:
        Lb5:
            if (r2 != 0) goto Lb9
            r0 = 0
            goto Lbd
        Lb9:
            int r0 = r2.size()
        Lbd:
            if (r3 >= r0) goto Ldb
            bin.mt.json.JSONObject r1 = r2.getJSONObject(r3)
            l.ۗ᩻᩻ r1 = m31030(r1)     // Catch: java.lang.RuntimeException -> Ld8
            boolean r4 = r1 instanceof l.C2292     // Catch: java.lang.RuntimeException -> Ld8
            if (r4 == 0) goto Ld3
            l.ۖۘ᩻ r1 = (l.C2292) r1     // Catch: java.lang.RuntimeException -> Ld8
            java.util.ArrayList r4 = l.C12749.f38321     // Catch: java.lang.RuntimeException -> Ld8
            r4.add(r1)     // Catch: java.lang.RuntimeException -> Ld8
            goto Ld8
        Ld3:
            java.util.ArrayList r4 = l.C12749.f38320     // Catch: java.lang.RuntimeException -> Ld8
            r4.add(r1)     // Catch: java.lang.RuntimeException -> Ld8
        Ld8:
            int r3 = r3 + 1
            goto Lbd
        Ldb:
            if (r8 == 0) goto Le0
            m31051()
        Le0:
            return
        Le1:
            r1 = move-exception
            r0.mo23552()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12749.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31030(JSONObject jSONObject) {
        switch (jSONObject.getInt("nct")) {
            case 0:
                return new C1936(jSONObject);
            case 1:
                return new C6875(jSONObject);
            case 2:
                return new C14719(jSONObject);
            case 3:
                return new C5156(jSONObject);
            case 4:
                return new C23354(jSONObject);
            case 5:
                return new C12834(jSONObject);
            case 6:
                return new C2292(jSONObject);
            default:
                throw new RuntimeException("Type: " + jSONObject.getInt("nct"));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31041(AbstractC3577 abstractC3577) {
        JSONObject mo6369 = abstractC3577.mo6369();
        Class<?> cls = abstractC3577.getClass();
        if (cls == C1936.class) {
            mo6369.put("nct", 0);
            return mo6369;
        }
        if (cls == C6875.class) {
            mo6369.put("nct", 1);
            return mo6369;
        }
        if (cls == C14719.class) {
            mo6369.put("nct", 2);
            return mo6369;
        }
        if (cls == C5156.class) {
            mo6369.put("nct", 3);
            return mo6369;
        }
        if (cls == C23354.class) {
            mo6369.put("nct", 4);
            return mo6369;
        }
        if (cls == C12834.class) {
            mo6369.put("nct", 5);
            return mo6369;
        }
        if (cls == C2292.class) {
            mo6369.put("nct", 6);
            return mo6369;
        }
        throw new RuntimeException(cls.getSimpleName());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31049() {
        JSONArray jSONArray = new JSONArray();
        synchronized (C12749.class) {
            Iterator it = f38320.iterator();
            while (it.hasNext()) {
                jSONArray.add(m31041((AbstractC3577) it.next()));
            }
            Iterator it2 = f38321.iterator();
            while (it2.hasNext()) {
                jSONArray.add(m31041((C2292) it2.next()));
            }
        }
        return jSONArray;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31036(InterfaceC1008 interfaceC1008) {
        f38322.m1665(interfaceC1008);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31038(AbstractActivityC3346 abstractActivityC3346, InterfaceC1008 interfaceC1008) {
        f38322.m1668(abstractActivityC3346, interfaceC1008);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m31046() {
        return f38324;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m31048() {
        return f38323;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31047(int i) {
        if (i == -1) {
            return null;
        }
        Iterator it = f38320.iterator();
        while (it.hasNext()) {
            AbstractC3577 abstractC3577 = (AbstractC3577) it.next();
            if (abstractC3577.f11356 == i) {
                return abstractC3577;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3577 m31031(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f38320.iterator();
        while (it.hasNext()) {
            AbstractC3577 abstractC3577 = (AbstractC3577) it.next();
            if (abstractC3577.mo6365().equals(str)) {
                return abstractC3577;
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C2292 m31050(int i) {
        if (i == -1) {
            return null;
        }
        Iterator it = f38321.iterator();
        while (it.hasNext()) {
            C2292 c2292 = (C2292) it.next();
            if (c2292.f11356 == i) {
                return c2292;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2292 m31042(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f38321.iterator();
        while (it.hasNext()) {
            C2292 c2292 = (C2292) it.next();
            if (c2292.mo6365().equals(str)) {
                return c2292;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        r2 = l.C12749.f38321.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r2.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (((l.AbstractC3577) r2.next()).f11356 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        return r1;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m31040() {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 100
            long r0 = r0 / r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r1 = (int) r0
        Lc:
            java.lang.Class<l.۫᩻᩻> r0 = l.C12749.class
            monitor-enter(r0)
            java.util.ArrayList r2 = l.C12749.f38320     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L43
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L43
            l.ۗ᩻᩻ r3 = (l.AbstractC3577) r3     // Catch: java.lang.Throwable -> L43
            int r3 = r3.f11356     // Catch: java.lang.Throwable -> L43
            if (r3 != r1) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            goto L3e
        L27:
            java.util.ArrayList r2 = l.C12749.f38321     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L43
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L43
            l.ۗ᩻᩻ r3 = (l.AbstractC3577) r3     // Catch: java.lang.Throwable -> L43
            int r3 = r3.f11356     // Catch: java.lang.Throwable -> L43
            if (r3 != r1) goto L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
        L3e:
            int r1 = r1 + 1
            goto Lc
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return r1
        L43:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12749.m31040():int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31035(ArrayList arrayList) {
        synchronized (C12749.class) {
            f38320.clear();
            f38321.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3577 abstractC3577 = (AbstractC3577) it.next();
                if (abstractC3577 instanceof C2292) {
                    f38321.add((C2292) abstractC3577);
                } else {
                    f38320.add(abstractC3577);
                }
            }
        }
        m31051();
        f38322.mo1664(f38324);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31039(AbstractC3577 abstractC3577) {
        synchronized (C12749.class) {
            if (abstractC3577 instanceof C2292) {
                f38321.add((C2292) abstractC3577);
            } else {
                f38320.add(abstractC3577);
            }
        }
        m31051();
        f38322.mo1664(f38324);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31032() {
        m31051();
        f38322.mo1664(f38324);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31034(int i, int i2) {
        synchronized (C12749.class) {
            C6055.m16890(i, i2, f38320);
        }
        m31045();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31044(int i, int i2) {
        synchronized (C12749.class) {
            C6055.m16890(i, i2, f38321);
        }
        m31045();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31033(int i) {
        synchronized (C12749.class) {
            f38320.remove(i);
        }
        m31045();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31043(int i) {
        synchronized (C12749.class) {
            f38321.remove(i);
        }
        m31045();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m31045() {
        C1802.m5991(new RunnableC13454(), C12749.class, 500L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31037(InterfaceC1022 interfaceC1022) {
        synchronized (C12749.class) {
            int size = interfaceC1022.size();
            ArrayList arrayList = f38320;
            if (size == arrayList.size()) {
                C19720 c19720 = new C19720(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3577 abstractC3577 = (AbstractC3577) it.next();
                    c19720.mo2318(abstractC3577.f11356, abstractC3577);
                }
                ArrayList arrayList2 = new ArrayList(f38320.size());
                int size2 = interfaceC1022.size();
                for (int i = 0; i < size2; i++) {
                    int i2 = interfaceC1022.getInt(i);
                    AbstractC3577 abstractC35772 = (AbstractC3577) c19720.remove(i2);
                    if (abstractC35772 == null) {
                        throw new IllegalArgumentException("Unknown config id " + i2);
                    }
                    arrayList2.add(abstractC35772);
                }
                if (!c19720.isEmpty()) {
                    throw new IllegalArgumentException("Missing config ids " + c19720.keySet());
                }
                ArrayList arrayList3 = f38320;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
            } else {
                throw new IllegalArgumentException("Unexpected config count " + interfaceC1022.size());
            }
        }
        m31045();
    }
}
