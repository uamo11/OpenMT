package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Arrays;
import java.util.List;

/* compiled from: Y6M7 */
/* renamed from: l.᩹ܿۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22426 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50347(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x041f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C15557 m50350(bin.mt.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22426.m50350(bin.mt.json.JSONObject):l.ܶ᩻ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m50348(JSONObject jSONObject, String str, String str2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().size() == 0) {
            throw m50349(jSONValue, "Expected a non-empty array", str2);
        }
        return jSONValue.asArray();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m50352(JSONObject jSONObject, String str, String str2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString() || jSONValue.asString().trim().isEmpty()) {
            throw m50349(jSONValue, "Expected a non-empty string", str2);
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50351(JSONObject jSONObject, String str, String... strArr) {
        List asList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!asList.contains(str2)) {
                throw m50349(jSONObject.get(str2), "Invalid mt_apk_resource_add argument", str.isEmpty() ? str2 : C22870.m50967(str, ".", str2));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m50349(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), (JSONObject) null);
    }
}
