package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* compiled from: I764 */
/* renamed from: l.᩻ۖۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23407 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m51854(String str) {
        try {
            return JSON.parse(str).asObject();
        } catch (RuntimeException e) {
            throw new C23092("Unable to parse radare2 native response", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51853(JSONObject jSONObject, String str, long j) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            return j;
        }
        if (!jSONValue.isNumber()) {
            return jSONValue.asLong();
        }
        String jSONValue2 = jSONValue.toString();
        try {
            return Long.parseLong(jSONValue2, 10);
        } catch (NumberFormatException e) {
            try {
                return C23202.m51497(jSONValue2);
            } catch (NumberFormatException unused) {
                throw e;
            }
        }
    }
}
