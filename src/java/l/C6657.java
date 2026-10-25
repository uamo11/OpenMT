package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: D6WW */
/* renamed from: l.ۜۡۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6657 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f20673;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f20674;

    public C6657(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f20674 = c17760;
        this.f20673 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23590 m18192(String str) {
        C17760 c17760 = this.f20674;
        C7383 m41607 = c17760.m41607();
        String m29843 = C12301.m29843(m41607, str, MotionUtils.EASING_TYPE_PATH, false);
        m41607.m19884(m29843);
        C10000 m41611 = c17760.m41611(m29843);
        try {
            C23590 m18193 = m18193(m29843);
            m41611.close();
            return m18193;
        } catch (Throwable th) {
            try {
                m41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r5 = r15.f22729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r11 <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        r18 = r8;
        r19 = r9;
        r20 = r11;
        r21 = r12;
        r22 = "Directory change notification could not be completed.";
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        throw m18184("FILE_PARENT_NOT_FOUND", "The directory has no writable parent.", r26, r5, "create_directory", "parent_missing", r0, r16, r13, r11, r12, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00aa, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v5, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r15v0, types: [l.۟ۢۜ] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v21, types: [l.۟ۢۜ] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C23590 m18193(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6657.m18193(java.lang.String):l.᩻ۡۜ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18194(String str) {
        m18189(str, this.f20674.m41607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14417 m18189(String str, C7383 c7383) {
        ArrayDeque arrayDeque = new ArrayDeque();
        C17760 c17760 = this.f20674;
        AbstractC15440 m41612 = c17760.m41612(str);
        String str2 = str;
        do {
            c7383.m19884(str2);
            String str3 = c7383.f22729;
            AbstractC15440 m416122 = c17760.m41612(str2);
            C12619 m18188 = m18188(m416122);
            if (m18188.m30885() == EnumC3447.DIRECTORY) {
                if (!arrayDeque.isEmpty()) {
                    c7383.m19884(str2);
                }
                if (m41612.mo27917() || (m41612 instanceof C13198) || (m41612 instanceof C12993)) {
                    String m18191 = m18191(str2);
                    while (m18191 != null) {
                        AbstractC15440 m416123 = c17760.m41612(m18191);
                        try {
                            C12619 mo8672 = m416123.mo23558().mo8672();
                            if (mo8672.m30885() == EnumC3447.LINK) {
                                throw m18183("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a modifying file tool.", str, str3, "parent_is_link");
                            }
                            if (mo8672.m30885() != EnumC3447.DIRECTORY) {
                                throw m18183(mo8672.m30885() != EnumC3447.MISSING ? "FILE_NOT_DIRECTORY" : "FILE_LINK_CHECK_FAILED", "The existing parent chain could not be verified safely.", str, str3, mo8672.m30885().name().toLowerCase(Locale.ROOT));
                            }
                            m18191 = m416123.getParent();
                        } catch (C22497 e) {
                            throw m18183("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", str, str3, e.m50458().name().toLowerCase(Locale.ROOT));
                        }
                    }
                }
                return new C14417(new ArrayList(arrayDeque));
            }
            if (m18188.m30885() != EnumC3447.MISSING) {
                throw m18185(str2, m18188.m30885());
            }
            m18187(m416122, str3);
            arrayDeque.addFirst(str2);
            str2 = m18191(str2);
        } while (str2 != null);
        throw m18184("FILE_PARENT_NOT_FOUND", "No existing writable parent directory was found.", str, c7383.f22729, "preflight", "parent_missing", false, (String) null, JSON.array(), 0, (String) null, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18183(String str, String str2, String str3, String str4, String str5) {
        return C3059.m9369(str, str2, "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", "check_parent_links").add("backendReason", str5).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m18188(AbstractC15440 abstractC15440) {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f20674.getClass();
            throw C17760.m41604(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m18185(String str, EnumC3447 enumC3447) {
        int i = C17240.f52854[enumC3447.ordinal()];
        C17760 c17760 = this.f20674;
        if (i == 1) {
            c17760.getClass();
            return C17760.m41603("FILE_IS_SYMLINK", "A symbolic link cannot be used as a mkdir -p directory component.", str, enumC3447);
        }
        if (i == 2) {
            c17760.getClass();
            return C17760.m41603("FILE_UNSUPPORTED_TYPE", "A special node cannot be used as a mkdir -p directory component.", str, enumC3447);
        }
        c17760.getClass();
        return C17760.m41603("FILE_NOT_DIRECTORY", "An existing mkdir -p path component is not a directory.", str, enumC3447);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4858 m18187(AbstractC15440 abstractC15440, String str) {
        EnumC4858 mo8669 = abstractC15440.mo23558().mo8669(EnumC13324.CREATE_DIRECTORY_SINGLE);
        if (mo8669 != EnumC4858.UNSUPPORTED) {
            return mo8669;
        }
        throw m18184("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked directory creation.", abstractC15440.mo23554(), str, "create_directory", "unsupported", false, (String) null, JSON.array(), 0, (String) null, abstractC15440.mo23554());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18186(C3059 c3059, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, String str4, String str5, String str6, boolean z3) {
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray2 = c3059.f9604;
        String str7 = c3059.f9611;
        String str8 = c3059.f9610;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("createdDirectories", i);
        jSONObject2.put("deepestCreatedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failedPath", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("failureStage", str6 == null ? JSON.NULL : JSON.value(str6));
        jSONObject2.put("safeToRetry", z3);
        if (c3059.f9607) {
            return C3059.m9365(str8, c3059.getMessage(), str7, jSONArray2, jSONObject2);
        }
        return C3059.m9369(str8, c3059.getMessage(), str7, jSONArray2, jSONObject2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18184(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, JSONArray jSONArray, int i, String str8, String str9) {
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("createdDirectories", i).add("deepestCreatedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failedPath", str9 == null ? JSON.NULL : JSON.value(str9)).add("failureStage", str5).add("safeToRetry", true);
        return "FILE_STORAGE_ERROR".equals(str) ? C3059.m9365(str, str2, "warning", (JSONArray) null, add) : C3059.m9369(str, str2, "fatal", null, add);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m18191(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == 0 ? "/" : str.substring(0, lastIndexOf);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18190(JSONArray jSONArray, String str) {
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
