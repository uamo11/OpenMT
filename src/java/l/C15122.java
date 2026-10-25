package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* compiled from: O6XG */
/* renamed from: l.ܶۡۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15122 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f46239;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f46240;

    public C15122(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f46240 = c17760;
        this.f46239 = c20177;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8068 m35826(String str) {
        C17760 c17760 = this.f46240;
        C7383 m41607 = c17760.m41607();
        String m41605 = C17760.m41605(str, m41607, MotionUtils.EASING_TYPE_PATH);
        C10000 m41611 = c17760.m41611(m41605);
        try {
            C8068 m35823 = m35823(m41605, m41607);
            m41611.close();
            return m35823;
        } catch (Throwable th) {
            try {
                m41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8068 m35823(String str, C7383 c7383) {
        String str2;
        C7383 m41607;
        String str3;
        C1012 c1012;
        boolean z;
        boolean z2;
        C3059 m35821;
        C17760 c17760 = this.f46240;
        AbstractC15440 m41612 = c17760.m41612(str);
        m35825(m35824(m41612), str);
        m35822(m41612, c7383.f22729);
        String parent = m41612.getParent();
        do {
            C7383 m416072 = c17760.m41607();
            m416072.m19884(str);
            str2 = m416072.f22729;
            if (parent != null) {
                m416072.m19884(parent);
            }
            m416072.m19882(str);
            AbstractC15440 m416122 = c17760.m41612(str);
            c17760.m41610(m416122, new C11759(str, str2));
            m35825(m35824(m416122), str);
            m35822(m416122, str2);
            m41607 = c17760.m41607();
            str3 = m41607.f22729;
        } while (!str2.equals(str3));
        AbstractC15440 m416123 = c17760.m41612(str);
        c17760.m41610(m416123, new C11759(str, str3));
        m35825(m35824(m416123), str);
        EnumC4858 m35822 = m35822(m416123, str3);
        String str4 = m35822 == EnumC4858.ATOMIC ? "atomic" : "best_effort";
        JSONArray array = JSON.array();
        try {
            m416123.mo23558().mo8676();
            m35821 = null;
            z = true;
            z2 = true;
        } catch (C22497 e) {
            try {
                C12619 mo8672 = c17760.m41612(str).mo23558().mo8672();
                if (mo8672.m30885() == EnumC3447.MISSING) {
                    c1012 = new C1012(true, true);
                } else if (mo8672.m30885() == EnumC3447.REGULAR) {
                    c1012 = new C1012(false, true);
                } else {
                    c1012 = new C1012(true, false);
                }
            } catch (RuntimeException | C22497 unused) {
                boolean z3 = m35822 == EnumC4858.ATOMIC;
                c1012 = new C1012(!z3, z3);
            }
            C3059 m41604 = C17760.m41604(e);
            C3059 m9365 = e.m50458() != EnumC21792.IO_ERROR ? m41604 : C3059.m9365("FILE_DELETE_FAILED", "Failed to permanently delete the local file.", "warning", (JSONArray) null, new JSONObject(m41604.f9609));
            String str5 = m41607.f22729;
            z = c1012.f3733;
            z2 = c1012.f3734;
            m35821 = m35821(m9365, str, str5, str4, z, z2, array);
        }
        if (z || !z2) {
            try {
                this.f46239.getClass();
                C18081.m42150();
                C14463.m34560(str);
                C16669.m39185();
            } catch (RuntimeException unused2) {
                Iterator it = array.iterator();
                while (true) {
                    if (it.hasNext()) {
                        JSONValue jSONValue = (JSONValue) it.next();
                        if (jSONValue.isString() && "File change notification could not be completed.".equals(jSONValue.asString())) {
                            break;
                        }
                    } else {
                        array.add("File change notification could not be completed.");
                        break;
                    }
                }
            }
        }
        if (m35821 != null) {
            throw m35821(m35821, str, m41607.f22729, str4, z, z2, array);
        }
        return new C8068(new JSONArray(array), str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m35824(AbstractC15440 abstractC15440) {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f46240.getClass();
            throw C17760.m41604(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35825(C12619 c12619, String str) {
        int i = C5246.f16433[c12619.m30885().ordinal()];
        C17760 c17760 = this.f46240;
        if (i == 2) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directory paths must be deleted with mt_file_delete_directory.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links are not accepted by mt_file_delete.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general file tools.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4858 m35822(AbstractC15440 abstractC15440, String str) {
        EnumC4858 mo8669 = abstractC15440.mo23558().mo8669(EnumC13324.DELETE_FILE_OR_LINK);
        if (mo8669 != EnumC4858.UNSUPPORTED) {
            return mo8669;
        }
        throw C3059.m9369("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked permanent deletion.", "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, abstractC15440.mo23554(), "policyRevision", str).add("operation", "delete_file").add("backendReason", "unsupported").add("changed", false).add("operationMode", JSON.NULL).add("stateKnown", true).add("warnings", new JSONArray(JSON.array())));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m35821(C3059 c3059, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray2 = c3059.f9604;
        String str4 = c3059.f9611;
        String str5 = c3059.f9610;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        if (c3059.f9607) {
            return C3059.m9365(str5, c3059.getMessage(), str4, jSONArray2, jSONObject2);
        }
        return C3059.m9369(str5, c3059.getMessage(), str4, jSONArray2, jSONObject2);
    }
}
