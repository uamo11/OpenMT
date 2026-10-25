package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: 46X2 */
/* renamed from: l.֡ۡۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0306 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f1670;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f1671;

    public C0306(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f1671 = c17760;
        this.f1670 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19358 m1698(String str, boolean z) {
        String str2;
        C17760 c17760 = this.f1671;
        String m41605 = C17760.m41605(str, c17760.m41607(), MotionUtils.EASING_TYPE_PATH);
        C10000 m41611 = c17760.m41611(m41605);
        try {
            AbstractC15440 m41612 = c17760.m41612(m41605);
            m1695(m1688(m41612), m41605);
            String parent = m41612.getParent();
            if (!z) {
                C19358 m1689 = m1689(m41605, parent);
                m41611.close();
                return m1689;
            }
            C7383 m41607 = c17760.m41607();
            do {
                m41607.m19884(m41605);
                str2 = m41607.f22729;
                if (parent != null) {
                    m41607.m19884(parent);
                }
                m41607.m19882(m41605);
                AbstractC15440 m416122 = c17760.m41612(m41605);
                c17760.m41610(m416122, new C8774(m41605, str2));
                m1695(m1688(m416122), m41605);
                m1697(m416122, m41607, m41605);
                m41607 = c17760.m41607();
            } while (!str2.equals(m41607.f22729));
            m41607.m19884(m41605);
            if (parent != null) {
                m41607.m19884(parent);
            }
            m41607.m19882(m41605);
            AbstractC15440 m416123 = c17760.m41612(m41605);
            c17760.m41610(m416123, new C8774(m41605, m41607.f22729));
            m1695(m1688(m416123), m41605);
            C19358 m1690 = m1690(m416123, m41607, m41605);
            m41611.close();
            return m1690;
        } catch (Throwable th) {
            try {
                m41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19358 m1689(String str, String str2) {
        C17760 c17760;
        String str3;
        EnumC13324 enumC13324;
        C7383 m41607;
        String str4;
        JSONArray jSONArray;
        String str5;
        C7383 c7383;
        boolean z;
        C3059 m1683;
        ?? r6;
        JSONArray jSONArray2;
        do {
            c17760 = this.f1671;
            C7383 m416072 = c17760.m41607();
            m416072.m19884(str);
            str3 = m416072.f22729;
            if (str2 != null) {
                m416072.m19884(str2);
            }
            m416072.m19882(str);
            AbstractC15440 m41612 = c17760.m41612(str);
            c17760.m41610(m41612, new C8774(str, str3));
            m1695(m1688(m41612), str);
            enumC13324 = EnumC13324.DELETE_EMPTY_DIRECTORY;
            m1687(m41612, enumC13324, str3, "delete_directory");
            m41607 = c17760.m41607();
            str4 = m41607.f22729;
        } while (!str3.equals(str4));
        AbstractC15440 m416122 = c17760.m41612(str);
        c17760.m41610(m416122, new C8774(str, str4));
        m1695(m1688(m416122), str);
        EnumC4858 m1687 = m1687(m416122, enumC13324, str4, "delete_directory");
        String str6 = m1687 == EnumC4858.ATOMIC ? "atomic" : "best_effort";
        JSONArray array = JSON.array();
        try {
            m416122.mo23558().mo8677();
        } catch (C22497 e) {
            C3835 m1686 = m1686(str, EnumC3447.DIRECTORY, m1687);
            if (m1686.f12250) {
                m1691(array, "The backend reported an error after the directory disappeared.");
            } else {
                boolean z2 = m1686.f12251;
                boolean z3 = m1686.f12252;
                C3059 m1685 = m1685(e);
                String str7 = m41607.f22729;
                jSONArray = array;
                str5 = "delete_directory";
                c7383 = m41607;
                z = z3;
                m1683 = m1683(m1685, str, str7, str6, z2, z3, array, 0, 0, str, "delete_directory", z);
                r6 = z2;
            }
        }
        m1683 = null;
        jSONArray = array;
        str5 = "delete_directory";
        r6 = 1;
        c7383 = m41607;
        z = true;
        if (r6 != 0 || !z) {
            try {
                this.f1670.getClass();
                C18081.m42150();
                C14463.m34559(str);
                C16669.m39185();
            } catch (RuntimeException unused) {
                jSONArray2 = jSONArray;
                m1691(jSONArray2, "Directory change notification could not be completed.");
            }
        }
        jSONArray2 = jSONArray;
        if (m1683 != null) {
            throw m1683(m1683, str, c7383.f22729, str6, r6, z, jSONArray2, 0, 0, str, m1679(m1683, "operation", str5), z);
        }
        return new C19358(0, r6, new JSONArray(jSONArray2), str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1697(AbstractC15440 abstractC15440, C7383 c7383, String str) {
        String str2 = c7383.f22729;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C2424(abstractC15440));
        while (!arrayDeque.isEmpty()) {
            C2424 c2424 = (C2424) arrayDeque.peek();
            boolean z = c2424.f7718;
            AbstractC15440 abstractC154402 = c2424.f7715;
            if (!z) {
                String mo23554 = abstractC154402.mo23554();
                c7383.m19884(mo23554);
                c7383.m19882(mo23554);
                C12619 c12619 = c2424.f7717;
                if (c12619 == null) {
                    c12619 = m1688(abstractC154402);
                }
                EnumC3447 m30885 = c12619.m30885();
                EnumC3447 enumC3447 = EnumC3447.MISSING;
                C17760 c17760 = this.f1671;
                if (m30885 == enumC3447) {
                    if (mo23554.equals(str)) {
                        c17760.getClass();
                        throw C17760.m41606(str);
                    }
                    arrayDeque.pop();
                } else {
                    if (c12619.m30885() != EnumC3447.DIRECTORY) {
                        throw m1682(mo23554, c12619.m30885());
                    }
                    m1687(abstractC154402, EnumC13324.DELETE_EMPTY_DIRECTORY, str2, "preflight_delete_directory");
                    c17760.getClass();
                    try {
                        C2424.m7855(c2424, abstractC154402.mo23558().mo8668(c12619), str, str2);
                    } catch (C22497 e) {
                        throw C17760.m41604(e);
                    }
                }
            } else if (c2424.f7716 >= c2424.f7714.size()) {
                arrayDeque.pop();
            } else {
                List list = c2424.f7714;
                int i = c2424.f7716;
                c2424.f7716 = i + 1;
                String m1696 = m1696(c2424, (C12619) list.get(i), str, str2);
                c7383.m19884(m1696);
                c7383.m19882(m1696);
                C12619 c126192 = (C12619) c2424.f7714.get(c2424.f7716 - 1);
                AbstractC15440 m30882 = c126192.m30882();
                int i2 = C15828.f48907[c126192.m30885().ordinal()];
                if (i2 == 2) {
                    arrayDeque.push(new C2424(m30882, c126192, 0));
                } else if (i2 == 3 || i2 == 4) {
                    m1687(m30882, EnumC13324.DELETE_FILE_OR_LINK, str2, "preflight_delete_file");
                } else if (i2 == 5) {
                    throw m1682(m1696, c126192.m30885());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r24v0, types: [l.֡ۡۜ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C19358 m1690(l.AbstractC15440 r25, l.C7383 r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0306.m1690(l.ܶ᩵ܿ, l.۟ۢۜ, java.lang.String):l.᩵ۡۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1694(C2424 c2424, String str, C7383 c7383, C18652 c18652) {
        AbstractC15440 abstractC15440 = c2424.f7715;
        String mo23554 = abstractC15440.mo23554();
        c7383.m19884(mo23554);
        String str2 = c7383.f22729;
        c7383.m19882(mo23554);
        try {
            C12619 m1688 = m1688(abstractC15440);
            EnumC3447 m30885 = m1688.m30885();
            EnumC3447 enumC3447 = EnumC3447.MISSING;
            C17760 c17760 = this.f1671;
            if (m30885 == enumC3447) {
                if (mo23554.equals(str) && c18652.f58961 == 0 && c18652.f58962 == 0) {
                    c17760.getClass();
                    throw C17760.m41606(str);
                }
                return;
            }
            if (m1688.m30885() != EnumC3447.DIRECTORY) {
                throw m1684(m1682(mo23554, m1688.m30885()), str, c7383.f22729, c18652, mo23554, "stat_directory", true, false, JSON.array(), false);
            }
            m1687(abstractC15440, EnumC13324.DELETE_EMPTY_DIRECTORY, str2, "delete_directory");
            try {
                c17760.getClass();
                try {
                    C2424.m7855(c2424, abstractC15440.mo23558().mo8678(), str, str2);
                } catch (C22497 e) {
                    throw C17760.m41604(e);
                }
            } catch (C3059 e2) {
                throw m1684(e2, str, c7383.f22729, c18652, mo23554, "list_directory", !C18652.m43255(c18652), true, JSON.array(), false);
            }
        } catch (C3059 e3) {
            throw m1684(e3, str, c7383.f22729, c18652, mo23554, "stat_directory", !C18652.m43255(c18652), true, JSON.array(), false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1692(String str, String str2, AbstractC15440 abstractC15440, EnumC3447 enumC3447, C7383 c7383, C18652 c18652, JSONArray jSONArray) {
        EnumC4858 m1687 = m1687(abstractC15440, EnumC13324.DELETE_FILE_OR_LINK, c7383.f22729, "delete_file");
        try {
            abstractC15440.mo23558().mo8676();
            c18652.f58962++;
        } catch (C22497 e) {
            C3835 m1686 = m1686(str2, enumC3447, m1687);
            if (m1686.f12250) {
                c18652.f58962++;
                m1691(jSONArray, "The backend reported an error after a file or link disappeared.");
            } else {
                C3059 m1685 = m1685(e);
                String str3 = c7383.f22729;
                boolean z = m1686.f12252;
                throw m1684(m1685, str, str3, c18652, str2, "delete_file", z, z, jSONArray, m1686.f12251);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1693(String str, AbstractC15440 abstractC15440, C7383 c7383, C18652 c18652, JSONArray jSONArray) {
        String mo23554 = abstractC15440.mo23554();
        try {
            C12619 m1688 = m1688(abstractC15440);
            if (m1688.m30885() == EnumC3447.MISSING) {
                return;
            }
            if (m1688.m30885() != EnumC3447.DIRECTORY) {
                throw m1684(m1682(mo23554, m1688.m30885()), str, c7383.f22729, c18652, mo23554, "delete_directory", true, false, jSONArray, false);
            }
            EnumC4858 m1687 = m1687(abstractC15440, EnumC13324.DELETE_EMPTY_DIRECTORY, c7383.f22729, "delete_directory");
            try {
                abstractC15440.mo23558().mo8677();
                c18652.f58961++;
            } catch (C22497 e) {
                C3835 m1686 = m1686(mo23554, EnumC3447.DIRECTORY, m1687);
                if (m1686.f12250) {
                    c18652.f58961++;
                    m1691(jSONArray, "The backend reported an error after a directory disappeared.");
                } else {
                    C3059 m1685 = m1685(e);
                    String str2 = c7383.f22729;
                    boolean z = m1686.f12252;
                    throw m1684(m1685, str, str2, c18652, mo23554, "delete_directory", z, z, jSONArray, m1686.f12251);
                }
            }
        } catch (C3059 e2) {
            throw m1684(e2, str, c7383.f22729, c18652, mo23554, "stat_directory", !C18652.m43255(c18652), true, jSONArray, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m1688(AbstractC15440 abstractC15440) {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f1671.getClass();
            throw C17760.m41604(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3835 m1686(String str, EnumC3447 enumC3447, EnumC4858 enumC4858) {
        C12619 c12619;
        try {
            c12619 = this.f1671.m41612(str).mo23558().mo8672();
        } catch (RuntimeException | C22497 unused) {
            c12619 = null;
        }
        if (c12619 != null && c12619.m30885() == EnumC3447.MISSING) {
            return new C3835(true, true, true);
        }
        if (c12619 != null && c12619.m30885() == enumC3447) {
            return new C3835(false, true, false);
        }
        boolean z = enumC4858 == EnumC4858.ATOMIC;
        return new C3835(false, z, !z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1695(C12619 c12619, String str) {
        int i = C15828.f48907[c12619.m30885().ordinal()];
        C17760 c17760 = this.f1671;
        if (i == 1) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_DIRECTORY", "The requested delete root is not a directory.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links are not accepted as directory delete roots.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general directory tools.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m1682(String str, EnumC3447 enumC3447) {
        EnumC3447 enumC34472 = EnumC3447.LINK;
        C17760 c17760 = this.f1671;
        if (enumC3447 == enumC34472) {
            c17760.getClass();
            return C17760.m41603("FILE_IS_SYMLINK", "A directory changed into a symbolic link during deletion.", str, enumC3447);
        }
        if (enumC3447 == EnumC3447.OTHER) {
            c17760.getClass();
            return C17760.m41603("FILE_UNSUPPORTED_TYPE", "The directory tree contains an unsupported special node.", str, enumC3447);
        }
        c17760.getClass();
        return C17760.m41603("FILE_NOT_DIRECTORY", "A directory changed type during deletion.", str, enumC3447);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4858 m1687(AbstractC15440 abstractC15440, EnumC13324 enumC13324, String str, String str2) {
        EnumC4858 mo8669 = abstractC15440.mo23558().mo8669(enumC13324);
        if (mo8669 != EnumC4858.UNSUPPORTED) {
            return mo8669;
        }
        throw m1681("FILE_BACKEND_UNSUPPORTED", "The file backend does not support the required checked delete operation.", abstractC15440.mo23554(), str, str2, "unsupported", (String) null, JSON.array(), abstractC15440.mo23554(), str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m1696(C2424 c2424, C12619 c12619, String str, String str2) {
        String mo23554 = c12619.m30882().mo23554();
        try {
            if (C12301.m29847(mo23554, MotionUtils.EASING_TYPE_PATH).equals(mo23554)) {
                String str3 = "/";
                if ("/".equals(mo23554)) {
                    str3 = null;
                } else {
                    int lastIndexOf = mo23554.lastIndexOf(47);
                    if (lastIndexOf != 0) {
                        str3 = mo23554.substring(0, lastIndexOf);
                    }
                }
                if (C11003.equals(str3, c2424.f7715.mo23554()) && C12301.m29846(mo23554, str)) {
                    return mo23554;
                }
            }
            throw m1681("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), mo23554, "list_directory");
        } catch (C3059 unused) {
            throw m1681("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), mo23554, "list_directory");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m1685(C22497 c22497) {
        this.f1671.getClass();
        C3059 m41604 = C17760.m41604(c22497);
        return c22497.m50458() != EnumC21792.IO_ERROR ? m41604 : C3059.m9365("FILE_DIRECTORY_DELETE_FAILED", "Failed to permanently delete a directory tree node.", "warning", (JSONArray) null, new JSONObject(m41604.f9609));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1684(C3059 c3059, String str, String str2, C18652 c18652, String str3, String str4, boolean z, boolean z2, JSONArray jSONArray, boolean z3) {
        c18652.f58964 = str3;
        c18652.f58966 = str4;
        c18652.f58963 = z;
        c18652.f58965 = z2;
        c18652.f58967 |= z3;
        return m1683(c3059, str, str2, "non_atomic", C18652.m43255(c18652), z, jSONArray, c18652.f58962, c18652.f58961, str3, str4, z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1683(C3059 c3059, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, int i2, String str4, String str5, boolean z3) {
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray2 = c3059.f9604;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("deletedFiles", i);
        jSONObject2.put("deletedDirectories", i2);
        jSONObject2.put("failedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failureStage", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("safeToRetry", z3);
        boolean z4 = "non_atomic".equals(str3) && (i > 0 || i2 > 0 || z);
        String str6 = z4 ? "FILE_DIRECTORY_DELETE_PARTIAL" : c3059.f9610;
        if (c3059.f9607 || z4) {
            return C3059.m9365(str6, c3059.getMessage(), "warning", jSONArray2, jSONObject2);
        }
        return C3059.m9369(str6, c3059.getMessage(), c3059.f9611, jSONArray2, jSONObject2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1681(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, String str9) {
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", false).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("deletedFiles", 0).add("deletedDirectories", 0).add("failedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failureStage", JSON.value(str9)).add("safeToRetry", false);
        return ("FILE_STORAGE_ERROR".equals(str) || "FILE_DIRECTORY_DELETE_FAILED".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, add) : C3059.m9369(str, str2, "fatal", null, add);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1679(C3059 c3059, String str, String str2) {
        JSONValue jSONValue = c3059.f9609.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? str2 : jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1691(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }
}
