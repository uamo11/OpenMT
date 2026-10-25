package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* compiled from: 577G */
/* renamed from: l.۫ܳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12464 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m30621() {
        return C1648.m5532(JSON.object(), "No tool-specific diagnostics.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m30620(JSONArray jSONArray) {
        JSONArray array = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject asObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue = asObject.get("line");
                JSONValue jSONValue2 = asObject.get("column");
                array.add(JSON.object().add("locator", m30622(asObject)).add("className", asObject.getString("className", null)).add("errorCode", asObject.getString("errorCode", null)).add("message", asObject.getString("message", null)).add("line", (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : JSON.value(asObject.getInt("line", -1))).add("column", (jSONValue2 == null || jSONValue2.isNull()) ? JSON.NULL : JSON.value(asObject.getInt("column", -1))));
            }
        }
        return array;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m30622(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C0899.m3254(jSONValue);
        }
        return C13169.m31959(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
