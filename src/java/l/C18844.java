package l;

import android.net.Uri;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.Main;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: I9S8 */
/* renamed from: l.ᩴܶܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18844 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59431 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Iterable f59432;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f59433;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f59434;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C5242 f59435;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f59436;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final List f59437;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m43543() {
        String jSONValue;
        String jSONValue2;
        synchronized (C18844.class) {
            synchronized (C18844.class) {
                jSONValue = m43530(f59436).toString();
                jSONValue2 = m43530(f59434).toString();
            }
        }
        C4925.f15527.edit().putString("utsd", jSONValue).putString("utsd_h", jSONValue2).apply();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f59436 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f59434 = arrayList2;
        f59437 = C20195.unmodifiableList(arrayList);
        f59433 = C20195.unmodifiableList(arrayList2);
        f59432 = C8882.m22948(arrayList, arrayList2);
        f59435 = new C5242();
        String string = C4925.f15527.getString("utsd", null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C4027(Uri.parse(jSONObject.getString(am.av)), jSONObject.getString("b"), jSONObject.getString(am.aF)));
                }
            } catch (JSONParseException unused) {
            }
        }
        String string2 = C4925.f15527.getString("utsd_h", null);
        if (string2 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                ArrayList arrayList3 = f59434;
                C11003.requireNonNull(arrayList3);
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    arrayList3.add(new C4027(Uri.parse(jSONObject2.getString(am.av)), jSONObject2.getString("b"), jSONObject2.getString(am.aF)));
                }
            } catch (JSONParseException unused2) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m43530(List list) {
        JSONArray jSONArray = new JSONArray();
        synchronized (C18844.class) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4027 c4027 = (C4027) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(am.av, c4027.f12779.toString());
                jSONObject.put("b", c4027.f12783);
                jSONObject.put(am.aF, c4027.f12781);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43537(Main main, C1390 c1390) {
        f59435.m1668(main, c1390);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m43546() {
        return f59437;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m43547() {
        return f59433;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Iterable m43544() {
        return f59432;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4027 m43540(String str) {
        for (C4027 c4027 : f59432) {
            if (c4027.f12779.getAuthority().endsWith(".MTDataFilesProvider") && m43539(c4027.f12779).equals(str)) {
                return c4027;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43539(Uri uri) {
        return C15472.m36561(20, 0, uri.getAuthority());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4027 m43531(String str) {
        synchronized (C18844.class) {
            for (C4027 c4027 : f59432) {
                if (c4027.f12783.equals(str)) {
                    return c4027;
                }
            }
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4027 m43545(String str) {
        synchronized (C18844.class) {
            Iterator it = f59436.iterator();
            while (it.hasNext()) {
                C4027 c4027 = (C4027) it.next();
                if (c4027.f12783.equals(str)) {
                    return c4027;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        r3 = r2.getDescription(l.C4925.m14335());
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m43536(android.net.Uri r7) {
        /*
            boolean r0 = l.C20159.m46407(r7)
            if (r0 != 0) goto L7
            goto L4a
        L7:
            r0 = 3
            android.content.ContentResolver r1 = l.C4925.m14336()
            r1.takePersistableUriPermission(r7, r0)
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.lang.String r1 = r7.toString()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            r0.update(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "%08X"
            long r3 = r0.getValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.<init>(r0)
            r0 = 4
            r2 = 45
            r1.insert(r0, r2)
            java.lang.String r1 = r1.toString()
            l.ۘܶܿ r3 = m43545(r1)
            if (r3 == 0) goto L4b
        L4a:
            return
        L4b:
            java.lang.String r3 = r7.getAuthority()
            java.lang.String r5 = ".MTDataFilesProvider"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L6e
            java.lang.String r3 = m43539(r7)
            android.content.pm.PackageManager r5 = l.C4925.m14320()     // Catch: java.lang.Exception -> L6e
            android.content.pm.PackageInfo r3 = r5.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> L6e
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L6e
            java.lang.CharSequence r3 = r3.loadLabel(r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6e
            goto L6f
        L6e:
            r3 = 0
        L6f:
            if (r3 != 0) goto L87
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "content://com.termux"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L87
            java.lang.String r6 = "home"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L87
            java.lang.String r3 = "Termux Home"
        L87:
            if (r3 != 0) goto L95
            android.app.Application r3 = l.C4925.m14335()
            l.ۖۧ֫ r3 = l.AbstractC2482.m7969(r3, r7)
            java.lang.String r3 = r3.mo7970()
        L95:
            if (r3 != 0) goto L9b
            java.lang.String r3 = l.C14609.m34870(r7)
        L9b:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto Le7
            int r5 = r3.length()
            r6 = 9
            if (r5 != r6) goto Le7
            char r0 = r3.charAt(r0)
            if (r0 != r2) goto Le7
            java.lang.String r0 = "storage"
            android.app.Application r2 = l.C4925.m14335()
            java.lang.Object r0 = r2.getSystemService(r0)
            boolean r2 = r0 instanceof android.os.storage.StorageManager
            if (r2 == 0) goto Le7
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            java.util.List r0 = r0.getStorageVolumes()     // Catch: java.lang.Exception -> Le7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Le7
        Lc7:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> Le7
            if (r2 == 0) goto Le7
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> Le7
            android.os.storage.StorageVolume r2 = l.C7166.m19187(r2)     // Catch: java.lang.Exception -> Le7
            java.lang.String r5 = r2.getUuid()     // Catch: java.lang.Exception -> Le7
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Exception -> Le7
            if (r5 == 0) goto Lc7
            android.app.Application r0 = l.C4925.m14335()     // Catch: java.lang.Exception -> Le7
            java.lang.String r3 = r2.getDescription(r0)     // Catch: java.lang.Exception -> Le7
        Le7:
            java.lang.Class<l.ᩴܶܿ> r0 = l.C18844.class
            monitor-enter(r0)
            java.util.ArrayList r2 = l.C18844.f59436     // Catch: java.lang.Throwable -> L10a
            l.ۘܶܿ r5 = new l.ۘܶܿ     // Catch: java.lang.Throwable -> L10a
            r5.<init>(r7, r1, r3)     // Catch: java.lang.Throwable -> L10a
            r2.add(r5)     // Catch: java.lang.Throwable -> L10a
            java.util.ArrayList r7 = l.C18844.f59434     // Catch: java.lang.Throwable -> L10a
            l.ܺܶܿ r2 = new l.ܺܶܿ     // Catch: java.lang.Throwable -> L10a
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10a
            l.C5378.removeIf(r7, r2)     // Catch: java.lang.Throwable -> L10a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10a
            m43543()
            l.ۚۡ֫ r7 = l.C18844.f59435
            java.util.List r0 = l.C18844.f59437
            r7.mo1664(r0)
            return
        L10a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18844.m43536(android.net.Uri):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43541() {
        m43543();
        f59435.mo1664(f59437);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43535(int i, int i2) {
        synchronized (C18844.class) {
            C6055.m16890(i, i2, f59436);
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43534(int i) {
        synchronized (C18844.class) {
            ((C4027) f59436.remove(i)).m12122();
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43542(int i) {
        synchronized (C18844.class) {
            f59434.add((C4027) f59436.remove(i));
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43538(Set set) {
        synchronized (C18844.class) {
            Iterator it = f59432.iterator();
            while (it.hasNext()) {
                C4027 c4027 = (C4027) it.next();
                if (set.contains(c4027.f12783)) {
                    c4027.m12122();
                    it.remove();
                }
            }
        }
        m43543();
        f59435.mo1664(f59437);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C8966 m43532(java.io.File r8) {
        /*
            java.lang.String r0 = r8.getPath()
            java.lang.String r1 = "/storage/"
            boolean r1 = l.C9679.m24619(r1, r0)
            r2 = 0
            if (r1 != 0) goto Le
            goto L48
        Le:
            r1 = 47
            r3 = 9
            int r1 = r0.indexOf(r1, r3)
            r4 = 18
            if (r1 != r4) goto L25
            java.lang.String r1 = r0.substring(r3, r4)
            r4 = 19
            java.lang.String r0 = r0.substring(r4)
            goto L31
        L25:
            r4 = -1
            if (r1 != r4) goto L2f
            java.lang.String r1 = r0.substring(r3)
            java.lang.String r0 = ""
            goto L31
        L2f:
            r0 = r2
            r1 = r0
        L31:
            if (r1 == 0) goto L48
            int r4 = r1.length()
            if (r4 != r3) goto L48
            r3 = 4
            char r3 = r1.charAt(r3)
            r4 = 45
            if (r3 == r4) goto L43
            goto L48
        L43:
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 != 0) goto L4c
            return r2
        L4c:
            r1 = 0
            r1 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            java.lang.Class<l.ᩴܶܿ> r0 = l.C18844.class
            monitor-enter(r0)
            java.lang.Iterable r5 = l.C18844.f59432     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L95
        L5b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L93
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L95
            l.ۘܶܿ r6 = (l.C4027) r6     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r6.f12783     // Catch: java.lang.Throwable -> L95
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L5b
            java.lang.String r1 = r6.m12121(r4, r3)     // Catch: java.lang.Throwable -> L95
            android.net.Uri r2 = r6.f12779     // Catch: java.lang.Throwable -> L95
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r1)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = r1.getAuthority()     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = ".MTDataFilesProvider"
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L8c
            l.۬ܶܿ r2 = new l.۬ܶܿ     // Catch: java.lang.Throwable -> L95
            r2.<init>(r8, r1, r6)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            return r2
        L8c:
            l.ۡܶܿ r2 = new l.ۡܶܿ     // Catch: java.lang.Throwable -> L95
            r2.<init>(r8, r1, r6)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            return r2
        L93:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            return r2
        L95:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18844.m43532(java.io.File):l.ۡܶܿ");
    }
}
