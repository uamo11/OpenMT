package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* compiled from: W6LP */
/* renamed from: l.᩻᩵ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23900 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77268;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77269;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONArray f77270 = JSON.array();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17550 f77271;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f77272;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f77273;

    public C23900(String str) {
        this.f77272 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52655(JSONArray jSONArray) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            JSONArray jSONArray2 = this.f77270;
            Iterator it2 = jSONArray2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((JSONValue) it2.next()).equals(jSONValue)) {
                        break;
                    }
                } else {
                    jSONArray2.add(jSONValue);
                    break;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52656(C3059 c3059) {
        String str;
        JSONValue value;
        int i;
        JSONArray array;
        String str2;
        JSONArray array2;
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get("createdDirectories");
        int asInt = this.f77269 + ((jSONValue == null || !jSONValue.isNumber()) ? 0 : jSONValue.asInt());
        JSONValue jSONValue2 = jSONObject.get("warnings");
        if (jSONValue2 != null && jSONValue2.isArray()) {
            m52655(jSONValue2.asArray());
        }
        JSONValue jSONValue3 = jSONObject.get("changed");
        JSONValue jSONValue4 = jSONObject.get("stateKnown");
        jSONObject.put(MotionUtils.EASING_TYPE_PATH, this.f77272).put("completedFiles", this.f77268).put("createdDirectories", asInt).put("changed", this.f77268 > 0 || asInt > 0 || (jSONValue3 != null && jSONValue3.isBoolean() && jSONValue3.asBoolean())).put("stateKnown", jSONValue4 == null || !jSONValue4.isBoolean() || jSONValue4.asBoolean()).put("operationMode", "non_atomic").put("warnings", new JSONArray(this.f77270));
        if (jSONObject.get("entryPaths") == null) {
            C17550 c17550 = this.f77271;
            if (c17550 == null) {
                array2 = JSON.array();
            } else {
                str2 = c17550.f53649;
                array2 = JSON.array(str2);
            }
            jSONObject.put("entryPaths", array2);
        }
        if (jSONObject.get("operationIndexes") == null) {
            C17550 c175502 = this.f77271;
            if (c175502 == null) {
                array = JSON.array();
            } else {
                i = c175502.f53648;
                array = JSON.array(i);
            }
            jSONObject.put("operationIndexes", array);
        }
        if (jSONObject.get("destinationPath") == null) {
            C17550 c175503 = this.f77271;
            if (c175503 == null) {
                value = JSON.NULL;
            } else {
                str = c175503.f53645;
                value = JSON.value(str);
            }
            jSONObject.put("destinationPath", value);
        }
    }
}
