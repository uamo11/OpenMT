package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* compiled from: H79P */
/* renamed from: l.ܰۤ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13765 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10239 f41065;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject f41066;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12231 f41067;

    public C13765(C10239 c10239, JSONObject jSONObject, C12231 c12231) {
        this.f41065 = c10239;
        this.f41066 = jSONObject;
        this.f41067 = c12231;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22938 m33086(JSONObject jSONObject) {
        C22938 m51055;
        JSONValue jSONValue = jSONObject.get("id");
        JSONValue jSONValue2 = jSONObject.get("jsonrpc");
        JSONValue jSONValue3 = jSONObject.get(e.s);
        if (jSONValue2 == null || !jSONValue2.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue2.asString()) || jSONValue3 == null || !jSONValue3.isString()) {
            return C22938.m51055(EnumC1180.BAD_REQUEST, C10821.m27052(jSONValue, -32600, "Invalid Request"));
        }
        String asString = jSONValue3.asString();
        if (jSONValue == null && "tools/call".equals(asString)) {
            return C22938.m51054(EnumC1180.ACCEPTED);
        }
        try {
            if ("initialize".equals(asString)) {
                m51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(m33083(m33085(jSONObject)), jSONValue));
            } else {
                if ("notifications/initialized".equals(asString)) {
                    return C22938.m51054(EnumC1180.ACCEPTED);
                }
                if ("ping".equals(asString)) {
                    m51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(JSON.object(), jSONValue));
                } else if ("tools/list".equals(asString)) {
                    m51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(JSON.object().add("tools", this.f41067.m29736()), jSONValue));
                } else if ("tools/call".equals(asString)) {
                    m51055 = C22938.m51055(EnumC1180.OK, C10821.m27051(m33084(m33082(jSONObject, "params")), jSONValue));
                } else {
                    m51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32601, "Method not found"));
                }
            }
        } catch (C3059 e) {
            m51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32602, e.getMessage()));
        } catch (Exception unused) {
            m51055 = C22938.m51055(EnumC1180.OK, C10821.m27052(jSONValue, -32603, "Internal error"));
        }
        return jSONValue == null ? C22938.m51054(EnumC1180.ACCEPTED) : m51055;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m33083(String str) {
        return JSON.object().add("protocolVersion", str).add("serverInfo", this.f41066).add("capabilities", JSON.object().add("tools", JSON.object()));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m33085(JSONObject jSONObject) {
        JSONObject m33082 = m33082(jSONObject, "params");
        if (m33082 == null) {
            throw C3059.m9364("Missing protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = m33082.get("protocolVersion");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return this.f41065.m25930(jSONValue.asString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private JSONObject m33084(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw C3059.m9364("Missing params", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObject.get("name");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Missing name", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject m33082 = m33082(jSONObject, "arguments");
        if (m33082 == null) {
            m33082 = JSON.object();
        }
        return this.f41067.m29737(m33082, jSONValue.asString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m33082(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        if (!jSONValue.isObject()) {
            throw C3059.m9364("Invalid ".concat(str), (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asObject();
    }
}
