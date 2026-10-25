package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: H6L4 */
/* renamed from: l.ܰ᩵ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14021 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1393 f42400 = new C12611();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12821 f42401;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f42402;

    public C14021(C17760 c17760, C12821 c12821) {
        this.f42402 = c17760;
        this.f42401 = c12821;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m33634(JSONObject jSONObject) {
        C5556.m15717(jSONObject, "outputPath", "sources", "overwrite", "level", "password");
        String m15720 = C5556.m15720(jSONObject, "outputPath");
        boolean m15719 = C5556.m15719(jSONObject, "overwrite");
        int m15710 = C5556.m15710(jSONObject, "level", 0, 9);
        int i = m15710 == 0 ? 0 : 8;
        String m157202 = C5556.m15720(jSONObject, "password");
        C17760 c17760 = this.f42402;
        C7383 m41607 = c17760.m41607();
        String m41605 = C17760.m41605(m15720, m41607, "outputPath");
        ArrayList arrayList = new ArrayList();
        JSONArray m15711 = C5556.m15711(jSONObject, "sources");
        for (int i2 = 0; i2 < m15711.size(); i2++) {
            try {
                JSONObject m15712 = C5556.m15712("sources", m15711.get(i2));
                C5556.m15717(m15712, "sourcePath", "entryPath");
                arrayList.add(m33632(m15712, m41607));
            } catch (C3059 e) {
                e.f9609.put(MotionUtils.EASING_TYPE_PATH, m41605).put("operationIndexes", JSON.array(i2));
                throw e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(m41605);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C11906) it.next()).f35584);
        }
        try {
            C10000 m41609 = c17760.m41609(arrayList2);
            try {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList3.add(C21784.m49116(m33628((C11906) arrayList.get(i3), m41605, m41607, i3), false));
                }
                JSONObject m33627 = m33627(m41605, m15719, m41607, m33631(Collections.EMPTY_LIST, arrayList3), null, m157202, i, m15710);
                m41609.close();
                return m33627;
            } finally {
            }
        } catch (C3059 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = C5556.m15713(e.f9609, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
            }
            e.f9609.put(MotionUtils.EASING_TYPE_PATH, m41605);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m33635(JSONObject jSONObject) {
        String str;
        String str2;
        Throwable th;
        JSONObject m15712;
        JSONArray jSONArray;
        String m15720;
        String str3;
        String m157202;
        String str4;
        String str5;
        String str6 = "overwrite";
        String str7 = "entryPath";
        String str8 = MotionUtils.EASING_TYPE_PATH;
        String str9 = "operations";
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "operations", "password");
        String m157203 = C5556.m15720(jSONObject, "password");
        C17760 c17760 = this.f42402;
        C7383 m41607 = c17760.m41607();
        String m41605 = C17760.m41605(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), m41607, MotionUtils.EASING_TYPE_PATH);
        m41607.m19883(m41605);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m41605);
        ArrayList arrayList2 = new ArrayList();
        JSONArray m15711 = C5556.m15711(jSONObject, "operations");
        int i = 0;
        while (true) {
            String str10 = m157203;
            C17760 c177602 = c17760;
            if (i < m15711.size()) {
                try {
                    m15712 = C5556.m15712(str9, m15711.get(i));
                    jSONArray = m15711;
                    m15720 = C5556.m15720(m15712, "type");
                    str3 = str9;
                    m157202 = C5556.m15720(m15712, str7);
                    str = str8;
                } catch (C3059 e) {
                    e = e;
                    str = str8;
                }
                try {
                    C5556.m15718(m157202, str7, m15720.equals("add"));
                    if (m15720.equals("add")) {
                        C5556.m15717(m15712, "type", "sourcePath", str7, str6);
                        C11906 m33632 = m33632(m15712, m41607);
                        arrayList2.add(new C10495(m15720, m157202, "", C5556.m15719(m15712, str6), m33632));
                        arrayList.add(m33632.f35584);
                    } else if (m15720.equals("delete")) {
                        boolean endsWith = m157202.endsWith("/");
                        C5556.m15717(m15712, endsWith ? new String[]{"type", str7, "recursive"} : new String[]{"type", str7});
                        arrayList2.add(new C10495(m15720, m157202, "", endsWith && C5556.m15719(m15712, "recursive"), null));
                    } else {
                        if (!m15720.equals("rename")) {
                            throw C5556.m15714(JSON.value(m15720), "type", "Expected add, delete, or rename");
                        }
                        boolean endsWith2 = m157202.endsWith("/");
                        str4 = str6;
                        C5556.m15717(m15712, endsWith2 ? new String[]{"type", str7, "newEntryPath", "mergeDirectories"} : new String[]{"type", str7, "newEntryPath"});
                        String m157204 = C5556.m15720(m15712, "newEntryPath");
                        str5 = str7;
                        C5556.m15718(m157204, "newEntryPath", false);
                        if (endsWith2 != m157204.endsWith("/")) {
                            throw C5556.m15714(JSON.value(m157204), "newEntryPath", "Renaming must preserve the entry type");
                        }
                        arrayList2.add(new C10495(m15720, m157202, m157204, endsWith2 && C5556.m15719(m15712, "mergeDirectories"), null));
                        i++;
                        m15711 = jSONArray;
                        m157203 = str10;
                        c17760 = c177602;
                        str9 = str3;
                        str8 = str;
                        str6 = str4;
                        str7 = str5;
                    }
                    str4 = str6;
                    str5 = str7;
                    i++;
                    m15711 = jSONArray;
                    m157203 = str10;
                    c17760 = c177602;
                    str9 = str3;
                    str8 = str;
                    str6 = str4;
                    str7 = str5;
                } catch (C3059 e2) {
                    e = e2;
                    e.f9609.put(str, m41605).put("operationIndexes", JSON.array(i));
                    throw e;
                }
            } else {
                try {
                    C10000 m41609 = c177602.m41609(arrayList);
                    int i2 = 0;
                    try {
                        try {
                            try {
                                C5556.m15715(c177602, m41605, false);
                                C18090 m42167 = C18090.m42167(c177602.m41612(m41605), false);
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < arrayList2.size()) {
                                        C10495 c10495 = (C10495) arrayList2.get(i2);
                                        String str11 = c10495.f31481;
                                        String str12 = c10495.f31478;
                                        boolean z = c10495.f31482;
                                        ArrayList arrayList4 = arrayList2;
                                        int hashCode = str11.hashCode();
                                        str = str8;
                                        if (hashCode != -1335458389) {
                                            if (hashCode != -934594754) {
                                                if (hashCode == 96417) {
                                                    try {
                                                        if (str11.equals("add")) {
                                                            arrayList3.add(C21784.m49116(m33628(c10495.f31479, m41605, m41607, i2), z));
                                                            i2++;
                                                            arrayList2 = arrayList4;
                                                            str8 = str;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            m42167.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            if (!str11.equals("rename")) {
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            arrayList3.add(C21784.m49114(str12, c10495.f31480, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str8 = str;
                                        } else {
                                            if (!str11.equals("delete")) {
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            arrayList3.add(C21784.m49115(str12, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str8 = str;
                                        }
                                    }
                                    JSONObject m33627 = m33627(m41605, true, m41607, m33631(m42167.m42210(), arrayList3), m42167, str10, 8, -1);
                                    m42167.close();
                                    m41609.close();
                                    return m33627;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str = str8;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    m41609.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str = str8;
                            th = th;
                            m41609.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = str;
                        throw C3059.m9369("ZIP_IO_ERROR", C5127.m14678(e, new StringBuilder("ZIP I/O failed: ")), "fatal", null, JSON.object().add(str2, m41605));
                    } catch (C3059 e4) {
                        e = e4;
                        if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                            e = C5556.m15713(e.f9609, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
                        }
                        e.f9609.put(str, m41605);
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    str2 = str8;
                } catch (C3059 e6) {
                    e = e6;
                    str = str8;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m33627(String str, boolean z, C7383 c7383, C4850 c4850, C18090 c18090, String str2, int i, int i2) {
        if (c18090 != null && !c4850.f15322) {
            C5556.m15716();
            C17760 c17760 = this.f42402;
            C7383 m41607 = c17760.m41607();
            m41607.m19883(str);
            m41607.m19884(str);
            m41607.m19882(str);
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("size", C5556.m15715(c17760, str, false).m30884()).add("changed", false).add("warnings", JSON.array());
        }
        C0120 m31187 = this.f42401.m31187(str, z, c7383, new C3439(this, c18090, c4850, i, i2, str2, str));
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, m31187.f1121).add("size", m31187.f1124).add("changed", m31187.f1120).add("warnings", m31187.f1123);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11906 m33632(JSONObject jSONObject, C7383 c7383) {
        String m15720 = C5556.m15720(jSONObject, "sourcePath");
        String m157202 = C5556.m15720(jSONObject, "entryPath");
        boolean z = true;
        C5556.m15718(m157202, "entryPath", true);
        boolean endsWith = m15720.endsWith("/");
        if (!m157202.isEmpty() && !m157202.endsWith("/")) {
            z = false;
        }
        if (endsWith != z) {
            throw C5556.m15714(JSON.value(m157202), "entryPath", "Source and ZIP destination must declare the same file or directory type");
        }
        return new C11906(C17760.m41599(m15720, c7383, "sourcePath"), m157202, endsWith);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m33628(C11906 c11906, String str, C7383 c7383, int i) {
        C11906 c119062;
        C17760 c17760;
        C17760 c177602 = this.f42402;
        try {
            if (C16999.m39878(c11906.f35584, str) || (c11906.f35582 && C12301.m29846(str, c11906.f35584))) {
                throw C5556.m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(c11906);
            while (!arrayDeque.isEmpty()) {
                C5556.m15716();
                c119062 = (C11906) arrayDeque.removeFirst();
                try {
                    String str2 = c119062.f35584;
                    boolean z = c119062.f35582;
                    String str3 = c119062.f35583;
                    c7383.m19883(str2);
                    C12619 m15715 = C5556.m15715(c177602, str2, z);
                    AbstractC15440 m41612 = c177602.m41612(str2);
                    if (z) {
                        C17760 c177603 = c177602;
                        try {
                            List<C12619> mo8668 = m41612.mo23558().mo8668(m15715);
                            if (!mo8668.isEmpty() || str3.isEmpty()) {
                                c11906 = c119062;
                                c17760 = c177603;
                            } else {
                                c11906 = c119062;
                                c17760 = c177603;
                                try {
                                    linkedHashMap.put(str3, new C6261(m41612, true, m15715.m30883()));
                                } catch (C3059 e) {
                                    e = e;
                                    c119062 = c11906;
                                    e.f9609.put("sourcePath", c119062.f35584).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c119062.f35583));
                                    throw e;
                                }
                            }
                            for (C12619 c12619 : mo8668) {
                                AbstractC15440 m30882 = c12619.m30882();
                                boolean z2 = c12619.m30885() == EnumC3447.DIRECTORY;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(m30882.getName());
                                sb.append(z2 ? "/" : "");
                                String sb2 = sb.toString();
                                C5556.m15718(sb2, "entryPath", false);
                                arrayDeque.addLast(new C11906(m30882.mo23554(), sb2, z2));
                            }
                        } catch (C22497 e2) {
                            c11906 = c119062;
                            throw C17760.m41604(e2);
                        }
                    } else {
                        try {
                            if (C16999.m39878(str2, str)) {
                                throw C5556.m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
                            }
                            linkedHashMap.put(str3, new C6261(m41612, false, m15715.m30883()));
                            c11906 = c119062;
                            c17760 = c177602;
                        } catch (C3059 e3) {
                            e = e3;
                            e.f9609.put("sourcePath", c119062.f35584).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c119062.f35583));
                            throw e;
                        }
                    }
                    c177602 = c17760;
                } catch (C3059 e4) {
                    e = e4;
                    c11906 = c119062;
                }
            }
            return linkedHashMap;
        } catch (C3059 e5) {
            e = e5;
            c119062 = c11906;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4850 m33631(Collection collection, ArrayList arrayList) {
        try {
            return C4850.m14119(collection, arrayList);
        } catch (C22489 e) {
            JSONArray array = JSON.array();
            Iterator it = e.f72812.iterator();
            while (it.hasNext()) {
                array.add(((Integer) it.next()).intValue());
            }
            JSONArray array2 = JSON.array();
            Iterator it2 = e.f72814.iterator();
            while (it2.hasNext()) {
                array2.add((String) it2.next());
            }
            throw C5556.m15713(JSON.object().add("operationIndexes", array).add("entryPaths", array2), e.f72813, e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m33630(int i, IOException iOException, String str) {
        return C3059.m9369("ZIP_SOURCE_READ_FAILED", C5127.m14678(iOException, new StringBuilder("Failed to read ZIP source content: ")), "fatal", null, JSON.object().add("operationIndexes", JSON.array(i)).add("entryPaths", JSON.array(str)));
    }
}
