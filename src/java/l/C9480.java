package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;

/* compiled from: F6Y2 */
/* renamed from: l.ۢۡۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9480 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24319(String str, boolean z, int i, String str2, C20769 c20769, String str3) {
        JSONObject add = JSON.object().add("version", str3.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").add("directoryPath", str).add("recursive", z).add("limit", i).add("order", "normalized-name-asc-depth-first-v1").add("policyRevision", str2).add("lastPath", c20769.f67275).add("traversalId", c20769.f67276);
        if (!str3.isEmpty()) {
            add.add("queryKey", str3);
        }
        byte[] bytes = add.toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(C14460.m34534().digest(bytes), 11);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20769 m24321(String str, String str2, boolean z, int i, String str3, String str4) {
        if (str.isEmpty()) {
            return new C20769("", UUID.randomUUID().toString());
        }
        if (str.length() > 65536) {
            throw m24320(str2, str3);
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf <= 0 || indexOf != str.lastIndexOf(46) || indexOf == str.length() - 1) {
                throw m24320(str2, str3);
            }
            byte[] decode = Base64.decode(str.substring(0, indexOf), 11);
            if (!MessageDigest.isEqual(C14460.m34534().digest(decode), Base64.decode(str.substring(indexOf + 1), 11))) {
                throw m24320(str2, str3);
            }
            JSONObject asObject = JSON.parse(new String(decode, StandardCharsets.UTF_8)).asObject();
            m24322(asObject, str2, str3, !str4.isEmpty());
            if ((str4.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").equals(m24318(asObject, "version")) && ((str4.isEmpty() || str4.equals(m24318(asObject, "queryKey"))) && str2.equals(m24318(asObject, "directoryPath")))) {
                JSONValue jSONValue = asObject.get("recursive");
                if (jSONValue == null || !jSONValue.isBoolean()) {
                    throw new IllegalArgumentException("Invalid cursor boolean field");
                }
                if (z == jSONValue.asBoolean()) {
                    JSONValue jSONValue2 = asObject.get("limit");
                    if (jSONValue2 == null || !jSONValue2.isNumber()) {
                        throw new IllegalArgumentException("Invalid cursor integer field");
                    }
                    if (i == jSONValue2.asInt() && "normalized-name-asc-depth-first-v1".equals(m24318(asObject, "order")) && str3.equals(m24318(asObject, "policyRevision"))) {
                        String m24318 = m24318(asObject, "lastPath");
                        String m243182 = m24318(asObject, "traversalId");
                        if (m24318.isEmpty() || m243182.isEmpty()) {
                            throw m24320(str2, str3);
                        }
                        for (String str5 : m24318.split("/", -1)) {
                            if (str5.isEmpty() || str5.equals(".") || str5.equals("..")) {
                                throw m24320(str2, str3);
                            }
                        }
                        if (!z && m24318.indexOf(47) >= 0) {
                            throw m24320(str2, str3);
                        }
                        return new C20769(m24318, m243182);
                    }
                }
            }
            throw m24320(str2, str3);
        } catch (RuntimeException unused) {
            throw m24320(str2, str3);
        } catch (C3059 e) {
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24322(JSONObject jSONObject, String str, String str2, boolean z) {
        Object[] objArr = {"version", "directoryPath", "recursive", "limit", "order", "policyRevision", "lastPath", "traversalId"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C20195.unmodifiableSet(hashSet));
        if (z) {
            linkedHashSet.add("queryKey");
        }
        HashSet hashSet2 = new HashSet();
        for (String str3 : jSONObject.names()) {
            if (!linkedHashSet.contains(str3) || !hashSet2.add(str3)) {
                throw m24320(str, str2);
            }
        }
        if (!hashSet2.equals(linkedHashSet)) {
            throw m24320(str, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24318(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw new IllegalArgumentException("Invalid cursor string field");
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m24320(String str, String str2) {
        JSONObject add = JSON.object().add("operation", "list_cursor");
        if (str != null) {
            add.add(MotionUtils.EASING_TYPE_PATH, str);
        }
        if (str2 != null) {
            add.add("policyRevision", str2);
        }
        return C3059.m9365("FILE_INVALID_CURSOR", "The file cursor is invalid or no longer matches this request. Restart the traversal with cursor=\"\".", "warning", (JSONArray) null, add);
    }
}
