package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* compiled from: J79S */
/* renamed from: l.۬ܳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13169 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String f39376;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39378 = 0;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f39391;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String[] f39380 = {"workspaceId", "editSessionId", "target", "query", "queryType", "caseSensitive", "matchMode", "prefix", "includeMatchOffsets", "limit", "snippetMaxChars"};

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String[] f39392 = {"overview", "files", "resource_table_names", "resource_table_values", "resource_table_file_paths", "dex_names", "dex_strings", "dex_string_members", "smali", "native_symbols", "native_strings"};

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String[] f39387 = {"workspaceId", "editSessionId", "reads", "maxValueChars", "maxValueXmlChars", "maxItemsPerValue", "resolveDepth"};

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f39379 = {"locator", "variant"};

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f39381 = {"workspaceId", "editSessionId", "locator", "methodResolution", "limit"};

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f39377 = {"exact", "slot", "dispatch", "not_applicable"};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f39394 = {"workspaceId", "editSessionId", "locator", "targetVersion", "edits"};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f39388 = {"workspaceId", "editSessionId", "locator"};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f39384 = {"workspaceId", "editSessionId", "locator", "patches"};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f39383 = {"byteOffset", "expectedHex", "replacementHex"};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f39389 = {"workspaceId", "editSessionId", "edits"};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39390 = {"workspaceId", "editSessionId", "runBuildChecks"};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f39382 = {"mode", "matchText", "writeText"};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39386 = {"locator", "variant", "targetVersion", "valueXml"};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f39385 = {"workspaceId", "editSessionId", "outputName", "overwrite", "sign"};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f39393 = {"workspaceId", "editSessionId", "outputName", "overwrite"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31909(char c) {
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31919(int i) {
        return C18307.m42645(i, "edits[", "]");
    }

    static {
        String[] strArr = {"zip_entries", "axml", "resource_table_id", "resource_table_name", "resource_table_value", "resource_table_file_path", "dex_class", "dex_field", "dex_method", "dex_string", "smali", "native_symbol", "native_string"};
        f39391 = strArr;
        StringBuilder sb = new StringBuilder("Valid scopes are: ");
        StringBuilder sb2 = new StringBuilder();
        if (strArr.length > 0) {
            sb2.append((CharSequence) strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb2.append((CharSequence) ", ");
                sb2.append((CharSequence) strArr[i]);
            }
        }
        sb.append(sb2.toString());
        sb.append(". Pass scopes as a JSON array even for one scope, for example [\"dex_class\"] or [\"dex_string\", \"smali\", \"resource_table_value\", \"axml\"]. Single strings and comma-separated strings such as \"dex_string,smali\" are invalid.");
        f39376 = sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31915(String str, int i, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("nextCursor", str3).add("limit", i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31973(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(m31925(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C23319 m31945(JSONObject jSONObject) {
        m31937(jSONObject, "open", MotionUtils.EASING_TYPE_PATH, "temporary");
        String m31967 = m31967(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("temporary");
        if (jSONValue != null && jSONValue.isNull()) {
            throw C3059.m9364("Invalid temporary", "temporary", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        boolean m31942 = m31942(jSONObject, "temporary");
        if ("mt://current-apk".equals(m31967)) {
            return new C23319(null, null, !m31942, m31942);
        }
        if (m31967.startsWith("mt://workspace/")) {
            String substring = m31967.substring(15);
            if (substring.isEmpty()) {
                throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, JSON.value(m31967), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            if (m31942) {
                throw C3059.m9364("temporary is invalid when reopening a workspace", "temporary", JSON.value(true), JSON.array(false), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            return new C23319(null, substring, true, false);
        }
        C7383 m48690 = C22233.m49903().m48690();
        String m29843 = C12301.m29843(m48690, m31967, MotionUtils.EASING_TYPE_PATH, false);
        m48690.m19883(m29843);
        return new C23319(m29843, null, !m31942, m31942);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m31948(JSONObject jSONObject) {
        m31937(jSONObject, "read_signature", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return m31967(jSONObject, "workspaceId");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C22614 m31984(JSONObject jSONObject) {
        m31937(jSONObject, "close", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return new C22614(m31967(jSONObject, "workspaceId"));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C12031 m31972(JSONObject jSONObject) {
        m31937(jSONObject, "list", "workspaceId", "editSessionId", "view", "prefix", "limit");
        m31938(jSONObject, "workspaceId", "editSessionId", "view");
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        String m319672 = m31967(jSONObject, "view");
        if ("zip_entries".equals(m319672) || "dex_classes".equals(m319672) || "resource_table".equals(m319672)) {
            String m31922 = m31922(jSONObject, "prefix", "");
            int m31910 = m31910(200, jSONObject, "limit");
            m31935(m31910, 1, 1000, "limit");
            return new C12031(m31967, m31999, m319672, m31922, null, m31910, 0, 0, 200);
        }
        throw C3059.m9364("Unsupported view", "view", JSON.value(m319672), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C12031 m31947(JSONObject jSONObject) {
        m31937(jSONObject, "mt_apk_dex_read_class_outline", "workspaceId", "editSessionId", "locator", "limit");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator", "limit");
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        String m31971 = m31971(m31975(jSONObject));
        int m31981 = m31981(jSONObject, "limit");
        m31935(m31981, 1, 1000, "limit");
        return new C12031(m31967, m31999, "dex_class_outline", "", m31971, m31981, 0, 0, m31981);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C1656 m31908(JSONObject jSONObject) {
        m31937(jSONObject, "read_text", "workspaceId", "editSessionId", "locator", "limit", "maxChars", "startLine", "startColumn");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator");
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        C17884 m31995 = m31995(m31975(jSONObject));
        String str = m31995.f54616;
        if (!"entry_text".equals(str) && !"axml".equals(str) && !"dex_class_smali".equals(str) && !"dex_method_smali".equals(str) && !"dex_field_smali".equals(str)) {
            throw C3059.m9364("mt_apk_read_text accepts only text locators", "locator", JSON.value(m31968(m31926(m31995))), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field"), JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
        }
        int m31957 = m31957(49152, jSONObject, "maxChars");
        m31935(m31957, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int m319572 = m31957(500, jSONObject, "limit");
        m31935(m319572, 1, 2000, "limit");
        int m319573 = m31957(0, jSONObject, "startLine");
        m31935(m319573, 0, Integer.MAX_VALUE, "startLine");
        int m319574 = m31957(0, jSONObject, "startColumn");
        m31935(m319574, 0, Integer.MAX_VALUE, "startColumn");
        return new C1656(m31967, m31999, m31995, TextBundle.TEXT_ENTRY, m319573, m319574, m319572, m31957, 0, 256, "startColumn", JSON.value(m319574));
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C1656 m31994(JSONObject jSONObject) {
        m31937(jSONObject, "read_bytes", "workspaceId", "editSessionId", "locator", "byteOffset", "maxBytes");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator");
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        C17884 m31995 = m31995(m31975(jSONObject));
        if (!"entry_text".equals(m31995.f54616)) {
            throw C3059.m9364("mt_apk_read_bytes accepts only zip_entry locators", "locator", JSON.value(m31968(m31926(m31995))), JSON.array("zip_entry"), JSON.object().add("locator", m31925("zip_entry", "classes.dex", (String) null, (String) null, (String) null, (String) null)));
        }
        int m31957 = m31957(0, jSONObject, "byteOffset");
        m31935(m31957, 0, Integer.MAX_VALUE, "byteOffset");
        int m319572 = m31957(256, jSONObject, "maxBytes");
        m31935(m319572, 1, 65536, "maxBytes");
        return new C1656(m31967, m31999, m31995, "hex", 0, 0, 500, 49152, m31957, m319572, null, null);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C16472 m31907(JSONObject jSONObject) {
        String[] strArr = f39387;
        m31937(jSONObject, "resource_read", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        String str = "locator";
        JSONObject add = C7416.m19939("workspaceId", m31967, "editSessionId", m31999).add("reads", JSON.array().add(JSON.object().add("locator", m31925("resource", (String) null, (String) null, (String) null, (String) null, "0x7F010000")).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
        JSONArray m31912 = m31912(jSONObject, "reads", add);
        if (m31912.size() == 0 || m31912.size() > 200) {
            throw C3059.m9364("Invalid reads", "reads", JSON.value(m31912.size()), JSON.array(1, 200), add);
        }
        ArrayList arrayList = new ArrayList(m31912.size());
        int i = 0;
        while (i < m31912.size()) {
            JSONValue jSONValue = m31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid reads item", C18307.m42645(i, "reads[", "]"), jSONValue, JSON.array(), add);
            }
            JSONObject asObject = jSONValue.asObject();
            List asList = Arrays.asList(f39379);
            for (String str2 : asObject.names()) {
                JSONArray jSONArray = m31912;
                if (!asList.contains(str2)) {
                    throw C3059.m9364("Invalid resource_read item argument", m31974(i, str2), asObject.get(str2), C0899.m3247(asList), add);
                }
                m31912 = jSONArray;
            }
            JSONArray jSONArray2 = m31912;
            String m31974 = m31974(i, str);
            JSONValue jSONValue2 = asObject.get(str);
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m31949(add, m31974);
            }
            C22342 m31933 = m31933(add, jSONValue2, m31974);
            String str3 = str;
            String str4 = m31933.f72399;
            String str5 = m31999;
            if (!"resource".equals(str4)) {
                throw C3059.m9364("mt_apk_resource_read accepts only resource locators", m31974, JSON.value(str4), JSON.array("resource"), add);
            }
            String m23319 = C9042.m23319(m31933.f72400, m31974);
            String m319742 = m31974(i, "variant");
            JSONValue jSONValue3 = asObject.get("variant");
            if (jSONValue3 == null || jSONValue3.isNull()) {
                throw m31949(add, m319742);
            }
            if (!jSONValue3.isString()) {
                throw C3059.m9364(C20094.m46315("Invalid ", m319742), m319742, jSONValue3, (JSONArray) null, add);
            }
            String asString = jSONValue3.asString();
            if (asString.isEmpty()) {
                throw C3059.m9364(C20094.m46315("Invalid ", m319742), m319742, JSON.value(asString), (JSONArray) null, add);
            }
            if ("*".equals(asString)) {
                throw C3059.m9364("Invalid reads item variant", m31974(i, "variant"), JSON.value(asString), JSON.array("default"), add);
            }
            arrayList.add(new C10829(m23319, asString));
            i++;
            str = str3;
            m31999 = str5;
            m31912 = jSONArray2;
        }
        int m31981 = m31981(jSONObject, "maxValueChars");
        m31935(m31981, 1, 32768, "maxValueChars");
        int m319812 = m31981(jSONObject, "maxValueXmlChars");
        m31935(m319812, 1, 1048576, "maxValueXmlChars");
        int m319813 = m31981(jSONObject, "maxItemsPerValue");
        m31935(m319813, 0, 2000, "maxItemsPerValue");
        int m319814 = m31981(jSONObject, "resolveDepth");
        m31935(m319814, 0, 1, "resolveDepth");
        return new C16472(m31967, m31999, arrayList, m31981, m319812, m319813, m319814);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31974(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("reads[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23528 m31934(C20226 c20226, C14769 c14769) {
        String str;
        ArrayList m31928;
        String str2 = c20226.f65427;
        String str3 = c14769.f45093;
        String str4 = c20226.f65431;
        String str5 = c20226.f65429;
        String str6 = c20226.f65425;
        if (!str3.equals(str4)) {
            throw C3059.m9364("Invalid workspaceId", "workspaceId", JSON.value(str4), (JSONArray) null, (JSONObject) null);
        }
        if ("overview".equals(str6)) {
            str = str4;
            m31928 = m31927((JSONArray) null, c14769.f45090, c14769.f45091, c14769.f45092);
        } else {
            str = str4;
            if ("files".equals(str6)) {
                m31928 = m31928("zip_entries", "axml");
            } else if ("resource_table_names".equals(str6)) {
                m31928 = m31928("resource_table_id", "resource_table_name");
            } else if ("resource_table_values".equals(str6)) {
                m31928 = m31928("resource_table_value");
            } else if ("resource_table_file_paths".equals(str6)) {
                m31928 = m31928("resource_table_file_path");
            } else if ("dex_names".equals(str6)) {
                m31928 = m31928("dex_class", "dex_field", "dex_method");
            } else if ("dex_strings".equals(str6) || "dex_string_members".equals(str6)) {
                m31928 = m31928("dex_string");
            } else if ("smali".equals(str6)) {
                m31928 = m31928("smali");
            } else if ("native_symbols".equals(str6)) {
                m31928 = m31928("native_symbol");
            } else if ("native_strings".equals(str6)) {
                m31928 = m31928("native_string");
            } else {
                throw C3059.m9364("Invalid target", "target", JSON.value(str6), C0899.m3247(Arrays.asList(f39392)), m31987("overview", "AndroidManifest"));
            }
        }
        ArrayList arrayList = m31928;
        String str7 = c20226.f65424;
        String str8 = c20226.f65425;
        int i = c20226.f65428;
        int i2 = c20226.f65432;
        return new C23528(str, str7, str8, str2, arrayList, i, i2 > 0, i2, !"overview".equals(str8), c20226.f65426, (("files".equals(str6) || "native_symbols".equals(str6) || "native_strings".equals(str6)) && !str5.isEmpty()) ? str5 : null, ("resource_table_names".equals(str6) || "resource_table_values".equals(str6) || "resource_table_file_paths".equals(str6)) ? m31953(str5) : null, (!m31966(str6) || str5.isEmpty()) ? C14355.f43284 : m31998(m31987(str6, str2).put("prefix", "com.example."), str5), "dex_string_members".equals(str6) ? "member" : Name.LABEL, c20226.f65430, new C18193(0, 0, 0, -1, 0));
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C9418 m31970(JSONObject jSONObject) {
        String[] strArr = f39381;
        m31937(jSONObject, "dex_xref", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        C3292 m31988 = m31988(m31975(jSONObject), jSONObject.get("locator"));
        String m319672 = m31967(jSONObject, "methodResolution");
        m31978(m319672, jSONObject.get("methodResolution"));
        m31941(m31988, m319672, jSONObject.get("methodResolution"));
        int m31981 = m31981(jSONObject, "limit");
        m31935(m31981, 1, 200, "limit");
        return new C9418(m31967, m31999, m31988.f10331, m31988.f10330, m31988.f10332, m319672, m31981, new C1739(0, 0, 0));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3564 m31997(JSONObject jSONObject) {
        m31937(jSONObject, "mt_apk_session_create", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return new C3564(m31967(jSONObject, "workspaceId"));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C20498 m32001(JSONObject jSONObject) {
        C21637 c21637;
        String[] strArr = f39388;
        m31937(jSONObject, "mt_apk_delete_target", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m319672 = m31967(jSONObject, "editSessionId");
        if (m319672.isEmpty()) {
            throw C3059.m9364("mt_apk_delete_target requires a non-empty editSessionId", "editSessionId", JSON.value(m319672), JSON.array("edit session id returned by mt_apk_session_create"), m31916(m31967, "edit1234", "dex_class"));
        }
        C22342 m31933 = m31933(m31916("<workspaceId>", "<editSessionId>", "smali_class"), JSON.value(m31975(jSONObject)), "locator");
        String str = m31933.f72400;
        String str2 = m31933.f72399;
        if ("dex_class".equals(str2)) {
            c21637 = new C21637("smali_class", m31996(str));
        } else if ("dex_method".equals(str2)) {
            C4703 m31963 = m31963(str, e.s, true);
            c21637 = new C21637("smali_method", m31982(m31963.f14932, m31963.f14933));
        } else {
            if (!"axml".equals(str2) && !"zip_entry".equals(str2)) {
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), m31916("<workspaceId>", "<editSessionId>", "smali_class"));
            }
            if (str == null || !str.endsWith("/")) {
                m31956(str);
            } else {
                m31956(C15472.m36561(1, 0, str));
            }
            c21637 = new C21637(str2, str);
        }
        return new C20498(m31967, m319672, c21637.f69463, c21637.f69462);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C7797 m31993(JSONObject jSONObject) {
        String[] strArr = f39384;
        m31937(jSONObject, "patch_bytes", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m319672 = m31967(jSONObject, "editSessionId");
        if (m319672.isEmpty()) {
            throw C3059.m9364("mt_apk_patch_bytes requires a non-empty editSessionId", "editSessionId", JSON.value(m319672), JSON.array("edit session id returned by mt_apk_session_create"), m31958(m31967, "edit1234", "assets/data.bin"));
        }
        C22342 m31933 = m31933(m31958(m31967, m319672, "assets/data.bin"), JSON.value(m31975(jSONObject)), "locator");
        String str = m31933.f72399;
        if (!"zip_entry".equals(str)) {
            throw C3059.m9364("mt_apk_patch_bytes accepts only zip_entry locators", "locator", JSON.value(str), JSON.array("zip_entry"), m31958(m31967, m319672, "assets/data.bin"));
        }
        String str2 = m31933.f72400;
        m31956(str2);
        JSONArray m31912 = m31912(jSONObject, "patches", m31958(m31967, m319672, str2));
        JSONObject m31958 = m31958(m31967, m319672, str2);
        if (m31912.size() == 0) {
            throw C3059.m9364("patches must contain at least one item", "patches", m31912, JSON.array("1..200"), m31958);
        }
        if (m31912.size() > 200) {
            throw C3059.m9364("patches must contain at most 200 items", "patches", JSON.value(m31912.size()), JSON.array("1..200"), m31958);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < m31912.size()) {
            JSONValue jSONValue = m31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid patches item", C18307.m42645(i, "patches[", "]"), jSONValue, JSON.array(), m31958);
            }
            JSONObject asObject = jSONValue.asObject();
            List asList = Arrays.asList(f39383);
            for (String str3 : asObject.names()) {
                if (!asList.contains(str3)) {
                    throw C3059.m9364("Invalid patch item argument", m31960(i, str3), asObject.get(str3), C0899.m3247(asList), m31958);
                }
            }
            String m31960 = m31960(i, "byteOffset");
            JSONValue jSONValue2 = asObject.get("byteOffset");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m31949(m31958, m31960);
            }
            if (!jSONValue2.isNumber()) {
                throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, jSONValue2, (JSONArray) null, m31958);
            }
            try {
                int m3253 = C0899.m3253(jSONValue2);
                if (m3253 < 0) {
                    throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, jSONValue2, JSON.array(0, Integer.MAX_VALUE), m31958);
                }
                byte[] m31943 = m31943(asObject, i, "expectedHex", m31958);
                byte[] m319432 = m31943(asObject, i, "replacementHex", m31958);
                JSONArray jSONArray = m31912;
                if (m31943.length != m319432.length) {
                    throw C3059.m9364("expectedHex and replacementHex must contain the same byte count", m31960(i, "replacementHex"), asObject.get("replacementHex"), JSON.array("same byte count as expectedHex"), m31958);
                }
                if (m31943.length > 4096) {
                    throw C3059.m9364("Patch item is too large", m31960(i, "replacementHex"), JSON.value(m31943.length), JSON.array("1..4096"), m31958);
                }
                i2 += m31943.length;
                if (i2 > 65536) {
                    throw C3059.m9364("Patch byte budget exceeded", "patches", JSON.value(i2), JSON.array("1..65536"), m31958);
                }
                arrayList.add(new C14146(m3253, m31943, m319432));
                i++;
                m31912 = jSONArray;
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, jSONValue2, (JSONArray) null, m31958);
            }
        }
        return new C7797(m31967, m319672, str2, arrayList);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C12736 m31955(JSONObject jSONObject) {
        String[] strArr = f39389;
        m31937(jSONObject, "mt_apk_resource_edit", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m319672 = m31967(jSONObject, "editSessionId");
        String str = "default";
        JSONArray m31912 = m31912(jSONObject, "edits", m31917(m31967, m319672, "0x7f010000", "default"));
        JSONObject m31917 = m31917(m31967, m319672, "0x7f010000", "default");
        if (m31912.size() == 0) {
            C3059 m9364 = C3059.m9364("edits must contain at least one item", "edits", m31912, JSON.array("1..200"), m31917);
            m31939(m9364, m31967, m319672);
            throw m9364;
        }
        if (m31912.size() > 200) {
            C3059 m93642 = C3059.m9364("edits must contain at most 200 items", "edits", JSON.value(m31912.size()), JSON.array("1..200"), m31917);
            m31939(m93642, m31967, m319672);
            throw m93642;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < m31912.size()) {
            JSONValue jSONValue = m31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                C3059 m93643 = C3059.m9364("Invalid edits item", m31919(i), jSONValue, JSON.array(), m31917);
                m31940(m93643, m31967, m319672, i, (String) null, (String) null);
                throw m93643;
            }
            JSONObject asObject = jSONValue.asObject();
            List asList = Arrays.asList(f39386);
            for (String str2 : asObject.names()) {
                if (!asList.contains(str2)) {
                    C3059 m93644 = C3059.m9364("Invalid edit resource item argument", m31920(i, str2), asObject.get(str2), C0899.m3247(asList), m31917);
                    m31940(m93644, m31967, m319672, i, (String) null, (String) null);
                    throw m93644;
                }
            }
            JSONValue jSONValue2 = asObject.get("locator");
            String m31920 = m31920(i, "locator");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                C3059 m31949 = m31949(m31917, m31920);
                m31940(m31949, m31967, m319672, i, (String) null, (String) null);
                throw m31949;
            }
            try {
                C22342 m31933 = m31933(m31917, jSONValue2, m31920);
                String str3 = m31933.f72399;
                if (!"resource".equals(str3)) {
                    C3059 m93645 = C3059.m9364("mt_apk_resource_edit accepts only resource locators", m31920, JSON.value(str3), JSON.array("resource"), m31917);
                    m31940(m93645, m31967, m319672, i, (String) null, (String) null);
                    throw m93645;
                }
                try {
                    String m23319 = C9042.m23319(m31933.f72400, m31920);
                    JSONObject m319172 = m31917(m31967, m319672, m23319, str);
                    JSONArray jSONArray = m31912;
                    String m31923 = m31923(asObject, m31967, m319672, i, m23319, null, "variant", m319172);
                    if ("*".equals(m31923)) {
                        C3059 m93646 = C3059.m9364("Invalid variant", m31920(i, "variant"), JSON.value(m31923), JSON.array(str), m319172);
                        m31940(m93646, m31967, m319672, i, m23319, m31923);
                        throw m93646;
                    }
                    int i2 = i;
                    JSONObject jSONObject2 = m31917;
                    String m319232 = m31923(asObject, m31967, m319672, i2, m23319, m31923, "targetVersion", m31917(m31967, m319672, m23319, m31923));
                    String str4 = str;
                    String m319233 = m31923(asObject, m31967, m319672, i2, m23319, m31923, "valueXml", m31917(m31967, m319672, m23319, m31923));
                    if (m319233.trim().isEmpty()) {
                        C3059 m93647 = C3059.m9364("valueXml is required", m31920(i, "valueXml"), JSON.value(m319233), JSON.array(), m31917(m31967, m319672, m23319, m31923));
                        m31940(m93647, m31967, m319672, i, m23319, m31923);
                        throw m93647;
                    }
                    if (!linkedHashSet.add(m23319 + '\n' + m31923)) {
                        C3059 m93648 = C3059.m9364("Duplicate resource edit target", m31920(i, "locator"), JSON.value(m31925("resource", (String) null, (String) null, (String) null, (String) null, m23319)), JSON.array(), m31917(m31967, m319672, m23319, m31923));
                        m31940(m93648, m31967, m319672, i, m23319, m31923);
                        throw m93648;
                    }
                    arrayList.add(new C13441(m23319, m31923, m319232, m319233));
                    i++;
                    str = str4;
                    m31912 = jSONArray;
                    m31917 = jSONObject2;
                } catch (C3059 e) {
                    m31940(e, m31967, m319672, i, (String) null, (String) null);
                    throw e;
                }
            } catch (C3059 e2) {
                m31940(e2, m31967, m319672, i, (String) null, (String) null);
                throw e2;
            }
        }
        return new C12736(m31967, m319672, arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31923(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject2) {
        JSONValue jSONValue = jSONObject.get(str5);
        String m31920 = m31920(i, str5);
        if (jSONValue == null || jSONValue.isNull()) {
            C3059 m31949 = m31949(jSONObject2, m31920);
            m31940(m31949, str, str2, i, str3, str4);
            throw m31949;
        }
        if (!jSONValue.isString()) {
            C3059 m9364 = C3059.m9364(C20094.m46315("Invalid ", m31920), m31920, jSONValue, (JSONArray) null, jSONObject2);
            m31940(m9364, str, str2, i, str3, str4);
            throw m9364;
        }
        String asString = jSONValue.asString();
        if (!asString.isEmpty()) {
            return asString;
        }
        C3059 m93642 = C3059.m9364(C20094.m46315("Invalid ", m31920), m31920, JSON.value(asString), (JSONArray) null, jSONObject2);
        m31940(m93642, str, str2, i, str3, str4);
        throw m93642;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31940(C3059 c3059, String str, String str2, int i, String str3, String str4) {
        JSONValue value;
        JSONObject put = c3059.f9609.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i);
        if (str3 == null) {
            value = JSON.NULL;
        } else {
            value = JSON.value(m31925("resource", (String) null, (String) null, (String) null, (String) null, str3));
        }
        JSONObject put2 = put.put("locator", value).put("variant", str4 == null ? JSON.NULL : JSON.value(str4));
        JSONValue jSONValue = JSON.NULL;
        put2.put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31939(C3059 c3059, String str, String str2) {
        JSONObject put = c3059.f9609.put("workspaceId", str).put("editSessionId", str2);
        JSONValue jSONValue = JSON.NULL;
        put.put("failedEditIndex", jSONValue).put("locator", jSONValue).put("variant", jSONValue).put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31921(JSONObject jSONObject, int i, String str, boolean z, JSONObject jSONObject2) {
        JSONValue jSONValue = jSONObject.get(str);
        String m31920 = m31920(i, str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31949(jSONObject2, m31920);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", m31920), m31920, jSONValue, (JSONArray) null, jSONObject2);
        }
        String asString = jSONValue.asString();
        if (z || !asString.isEmpty()) {
            return asString;
        }
        throw C3059.m9364(C20094.m46315("Invalid ", m31920), m31920, JSON.value(asString), (JSONArray) null, jSONObject2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31980(String str) {
        return "write_target".equals(str) || "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31920(int i, String str) {
        return C23202.m51498(new StringBuilder(), m31919(i), ".", str);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C6386 m31954(JSONObject jSONObject) {
        C21637 c21637;
        String[] strArr = f39394;
        List asList = Arrays.asList(strArr);
        for (String str : jSONObject.names()) {
            if (!asList.contains(str)) {
                throw C3059.m9364("Invalid edit_text argument", str, jSONObject.get(str), C0899.m3247(asList), m31914(jSONObject));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (!jSONObject.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            JSONObject m31914 = m31914(jSONObject);
            if (arrayList.size() == 1) {
                throw m31949(m31914, (String) arrayList.get(0));
            }
            StringBuilder sb = new StringBuilder("Missing parameters: ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) arrayList.get(i2));
            }
            throw C3059.m9364(sb.toString(), "parameters", (JSONValue) null, C0899.m3247(arrayList), m31914);
        }
        String m31967 = m31967(jSONObject, "workspaceId");
        String m319672 = m31967(jSONObject, "editSessionId");
        C22342 m31933 = m31933(JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)), JSON.value(m31975(jSONObject)), "locator");
        String str3 = m31933.f72399;
        String str4 = m31933.f72400;
        if ("dex_class".equals(str3)) {
            c21637 = new C21637("smali_class", m31996(str4));
        } else if ("dex_method".equals(str3)) {
            C4703 m31963 = m31963(str4, e.s, true);
            c21637 = new C21637("smali_method", m31982(m31963.f14932, m31963.f14933));
        } else {
            if (!"axml".equals(str3) && !"zip_entry".equals(str3)) {
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str3), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
            }
            m31956(str4);
            c21637 = new C21637(str3, str4);
        }
        String m31999 = m31999(jSONObject, "targetVersion");
        boolean isEmpty = m31999.isEmpty();
        String str5 = c21637.f69463;
        String str6 = c21637.f69462;
        if (isEmpty) {
            throw C3059.m9364("targetVersion is required", "targetVersion", JSON.value(m31999), JSON.array(), m31918(m31967, m319672, str5, m31961(jSONObject), str6));
        }
        JSONArray m31912 = m31912(jSONObject, "edits", m31918(m31967, m319672, str5, "replace_match", str6));
        if (m31912.size() == 0) {
            throw C3059.m9364("edits must contain at least one item", "edits", m31912, JSON.array(), m31918(m31967, m319672, str5, "replace_match", str6));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        while (i4 < m31912.size()) {
            JSONObject m31918 = m31918(m31967, m319672, str5, "replace_match", str6);
            JSONValue jSONValue = m31912.get(i4);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid edits item", m31919(i4), jSONValue, JSON.array(), m31918);
            }
            JSONObject asObject = jSONValue.asObject();
            JSONArray jSONArray = m31912;
            List asList2 = Arrays.asList(f39382);
            for (String str7 : asObject.names()) {
                String str8 = m31999;
                if (!asList2.contains(str7)) {
                    throw C3059.m9364("Invalid edit item argument", m31920(i4, str7), asObject.get(str7), C0899.m3247(asList2), m31918);
                }
                m31999 = str8;
            }
            String str9 = m31999;
            String m31921 = m31921(asObject, i4, "mode", false, m31918);
            if (m31980(m31921)) {
                m31918 = m31918(m31967, m319672, str5, m31921, str6);
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            String m319212 = m31921(asObject, i4, "matchText", true, m31918);
            String m319213 = m31921(asObject, i4, "writeText", true, m31918);
            if ("write_target".equals(m31921)) {
                if (!m319212.isEmpty()) {
                    throw C3059.m9364("write_target requires empty matchText", m31920(i4, "matchText"), JSON.value(m319212), JSON.array(""), m31918(m31967, m319672, str5, m31921, str6));
                }
                if (m319213.isEmpty() && !"zip_entry".equals(str5)) {
                    throw C3059.m9364("write_target requires non-empty writeText", m31920(i4, "writeText"), JSON.value(m319213), JSON.array(), m31918(m31967, m319672, str5, m31921, str6));
                }
            } else if (!"replace_match".equals(m31921)) {
                if (!"insert_before_match".equals(m31921) && !"insert_after_match".equals(m31921)) {
                    throw C3059.m9364("Invalid mode", m31920(i4, "mode"), JSON.value(m31921), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), m31918(m31967, m319672, str5, "replace_match", str6));
                }
                if (m319212.isEmpty()) {
                    throw C3059.m9364(C16014.m37867(m31921, " requires non-empty matchText"), m31920(i4, "matchText"), JSON.value(m319212), JSON.array(), m31918(m31967, m319672, str5, m31921, str6));
                }
                if (m319213.isEmpty()) {
                    throw C3059.m9364(C16014.m37867(m31921, " requires non-empty writeText"), m31920(i4, "writeText"), JSON.value(m319213), JSON.array(), m31918(m31967, m319672, str5, m31921, str6));
                }
            } else if (m319212.isEmpty()) {
                throw C3059.m9364("replace_match requires non-empty matchText", m31920(i4, "matchText"), JSON.value(m319212), JSON.array(), m31918(m31967, m319672, str5, m31921, str6));
            }
            if ("write_target".equals(m31921)) {
                i5 = i4;
            }
            C10620 c10620 = new C10620(m31921, m319212, m319213);
            arrayList2 = arrayList3;
            arrayList2.add(c10620);
            i4++;
            m31912 = jSONArray;
            i3 = i5;
            m31999 = str9;
        }
        int i6 = i3;
        String str10 = m31999;
        if (arrayList2.size() <= 1 || i6 < 0) {
            return new C6386(m31967, m319672, str5, str6, str10, arrayList2);
        }
        throw C3059.m9364("write_target must be the only edit", m31920(i6, "mode"), JSON.value(((C10620) arrayList2.get(i6)).f31899), JSON.array("replace_match", "insert_before_match", "insert_after_match"), m31918(m31967, m319672, str5, "replace_match", str6));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m31943(JSONObject jSONObject, int i, String str, JSONObject jSONObject2) {
        String m31960 = m31960(i, str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31949(jSONObject2, m31960);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, jSONValue, (JSONArray) null, jSONObject2);
        }
        String asString = jSONValue.asString();
        if (asString.isEmpty() || (asString.length() & 1) != 0) {
            throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, JSON.value(asString), JSON.array("non-empty even-length hex"), jSONObject2);
        }
        int length = asString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int m31909 = m31909(asString.charAt(i3));
            int m319092 = m31909(asString.charAt(i3 + 1));
            if (m31909 < 0 || m319092 < 0) {
                throw C3059.m9364(C20094.m46315("Invalid ", m31960), m31960, JSON.value(asString), JSON.array("hex characters 0-9, a-f, A-F"), jSONObject2);
            }
            bArr[i2] = (byte) (m319092 | (m31909 << 4));
        }
        return bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31960(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("patches[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31914(JSONObject jSONObject) {
        C21637 c21637;
        C21637 c216372;
        JSONValue jSONValue = jSONObject.get("workspaceId");
        String asString = (jSONValue == null || !jSONValue.isString() || jSONValue.asString().isEmpty()) ? "<workspaceId>" : jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("editSessionId");
        String asString2 = (jSONValue2 == null || !jSONValue2.isString() || jSONValue2.asString().isEmpty()) ? "<editSessionId>" : jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("locator");
        String str = "Lcom/example/EditTarget;";
        if (jSONValue3 == null || !jSONValue3.isString()) {
            c21637 = new C21637("smali_class", "Lcom/example/EditTarget;");
        } else {
            String asString3 = jSONValue3.asString();
            String m31968 = m31968(asString3);
            String m32000 = m32000(asString3);
            if (m31968 == null || m32000 == null) {
                c21637 = new C21637("smali_class", "Lcom/example/EditTarget;");
            } else {
                if ("dex_method".equals(m31968)) {
                    if (m32000.isEmpty()) {
                        m32000 = "Lcom/example/EditTarget;->target()V";
                    }
                    c216372 = new C21637("smali_method", m32000);
                } else if ("axml".equals(m31968)) {
                    if (m32000.isEmpty()) {
                        m32000 = "AndroidManifest.xml";
                    }
                    c216372 = new C21637("axml", m32000);
                } else if ("zip_entry".equals(m31968)) {
                    if (m32000.isEmpty()) {
                        m32000 = "assets/example.txt";
                    }
                    c216372 = new C21637("zip_entry", m32000);
                } else {
                    if (!m32000.isEmpty()) {
                        try {
                            str = C15799.m37341(m32000);
                        } catch (RuntimeException | C3059 unused) {
                        }
                    }
                    c216372 = new C21637("smali_class", str);
                }
                return m31918(asString, asString2, c216372.f69463, m31961(jSONObject), c216372.f69462);
            }
        }
        c216372 = c21637;
        return m31918(asString, asString2, c216372.f69463, m31961(jSONObject), c216372.f69462);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31961(JSONObject jSONObject) {
        JSONValue jSONValue;
        JSONValue jSONValue2 = jSONObject.get("mode");
        if (jSONValue2 != null && jSONValue2.isString() && m31980(jSONValue2.asString())) {
            return jSONValue2.asString();
        }
        JSONValue jSONValue3 = jSONObject.get("edits");
        return (jSONValue3 != null && jSONValue3.isArray() && jSONValue3.asArray().size() > 0 && jSONValue3.asArray().get(0).isObject() && (jSONValue = jSONValue3.asArray().get(0).asObject().get("mode")) != null && jSONValue.isString() && m31980(jSONValue.asString())) ? jSONValue.asString() : "replace_match";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31918(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        String str9 = ".class public ";
        String str10 = "";
        if ("write_target".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str8 = "\n.super Ljava/lang/Object;\n";
                str6 = C4860.m14172(str9, str5, str8);
            } else if ("smali_method".equals(str3)) {
                StringBuilder sb = new StringBuilder(".method public ");
                int indexOf = str5.indexOf("->");
                str6 = C9045.m23341(sb, indexOf < 0 ? "method()V" : str5.substring(indexOf + 2), "\n    .registers 1\n    return-void\n.end method");
            } else {
                str6 = "axml".equals(str3) ? "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" />\n" : "text\n";
            }
        } else if ("replace_match".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str8 = "\n";
                str10 = C4860.m14172(".class public ", str5, "\n");
                str9 = ".class public final ";
                str6 = C4860.m14172(str9, str5, str8);
            } else if ("smali_method".equals(str3)) {
                str7 = "    # inserted marker\n    return-void\n";
                str6 = str7;
                str10 = "    return-void\n";
            } else {
                str10 = "old";
                str6 = "new";
            }
        } else if (!"insert_before_match".equals(str4) && !"insert_after_match".equals(str4)) {
            str6 = "";
        } else if ("smali_class".equals(str3)) {
            str10 = ".super Ljava/lang/Object;\n";
            str6 = "# inserted comment\n";
        } else if ("smali_method".equals(str3)) {
            str7 = "    # inserted marker\n";
            str6 = str7;
            str10 = "    return-void\n";
        } else {
            str10 = "</";
            str6 = "inserted";
        }
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31924(str3, str5)).add("targetVersion", "<copy data.targetVersion from mt_apk_read_text>").add("edits", JSON.array().add(C7416.m19939("mode", str4, "matchText", str10).add("writeText", str6)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31916(String str, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31924(str3, "Lcom/example/EditTarget;"));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31958(String str, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31925("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "01")));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31917(String str, String str2, String str3, String str4) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("edits", JSON.array().add(JSON.object().add("locator", m31925("resource", (String) null, (String) null, (String) null, (String) null, str3)).add("variant", str4).add("targetVersion", "<copy results[0].targetVersion from mt_apk_resource_read>").add("valueXml", "<string name=\"example\">text</string>")));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C4975 m31951(JSONObject jSONObject) {
        String[] strArr = f39390;
        m31937(jSONObject, "mt_apk_session_check", strArr);
        m31938(jSONObject, strArr);
        return new C4975(m31967(jSONObject, "workspaceId"), m31967(jSONObject, "editSessionId"), m31979(jSONObject, "runBuildChecks"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C21909 m31989(bin.mt.json.JSONObject r11) {
        /*
            java.lang.String r0 = "build"
            java.lang.String[] r1 = l.C13169.f39385
            m31937(r11, r0, r1)
            java.lang.String[] r0 = l.C13169.f39393
            m31938(r11, r0)
            java.lang.String r0 = "workspaceId"
            java.lang.String r2 = m31967(r11, r0)
            java.lang.String r0 = "editSessionId"
            java.lang.String r3 = m31967(r11, r0)
            java.lang.String r0 = "outputName"
            java.lang.String r1 = m31999(r11, r0)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L26
            goto L9b
        L26:
            java.lang.String r4 = "/"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L35
            java.lang.String r0 = l.C12301.m29847(r1, r0)
            r4 = r0
            goto L9c
        L35:
            java.lang.String r4 = "."
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lbc
            java.lang.String r4 = ".."
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lbc
            r4 = 47
            int r4 = r1.indexOf(r4)
            if (r4 >= 0) goto Lbc
            r4 = 92
            int r4 = r1.indexOf(r4)
            if (r4 >= 0) goto Lbc
            r4 = 0
            int r5 = r1.indexOf(r4)
            if (r5 >= 0) goto Lbc
            r5 = 58
            int r5 = r1.indexOf(r5)
            if (r5 > 0) goto L65
            goto L9b
        L65:
            if (r4 >= r5) goto Lbc
            char r6 = r1.charAt(r4)
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 97
            r9 = 90
            r10 = 65
            if (r4 != 0) goto L7e
            if (r6 < r10) goto L79
            if (r6 <= r9) goto Lb9
        L79:
            if (r6 < r8) goto L9b
            if (r6 > r7) goto L9b
            goto Lb9
        L7e:
            if (r6 < r10) goto L82
            if (r6 <= r9) goto Lb9
        L82:
            if (r6 < r8) goto L86
            if (r6 <= r7) goto Lb9
        L86:
            r7 = 48
            if (r6 < r7) goto L8e
            r7 = 57
            if (r6 <= r7) goto Lb9
        L8e:
            r7 = 43
            if (r6 == r7) goto Lb9
            r7 = 45
            if (r6 == r7) goto Lb9
            r7 = 46
            if (r6 != r7) goto L9b
            goto Lb9
        L9b:
            r4 = r1
        L9c:
            java.lang.String r0 = "overwrite"
            boolean r5 = m31979(r11, r0)
            java.lang.String r0 = "sign"
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Lb0
            boolean r11 = m31979(r11, r0)
            r6 = r11
            goto Lb2
        Lb0:
            r11 = 1
            r6 = 1
        Lb2:
            l.᩸᩻ۜ r11 = new l.᩸᩻ۜ
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        Lb9:
            int r4 = r4 + 1
            goto L65
        Lbc:
            bin.mt.json.JSONValue r11 = bin.mt.json.JSON.value(r1)
            bin.mt.json.JSONArray r1 = bin.mt.json.JSON.array()
            bin.mt.json.JSONObject r2 = bin.mt.json.JSON.object()
            java.lang.String r3 = "built.apk"
            bin.mt.json.JSONObject r2 = r2.add(r0, r3)
            java.lang.String r3 = "Invalid outputName"
            l.ۗۛ᩻ r11 = l.C3059.m9364(r3, r0, r11, r1, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13169.m31989(bin.mt.json.JSONObject):l.᩸᩻ۜ");
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m31956(String str) {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0 || str.endsWith("/")) {
            throw C3059.m9364("Invalid locator", "locator", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("locator", m31925("zip_entry", "res/layout/activity_main.xml", (String) null, (String) null, (String) null, (String) null)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31926(C17884 c17884) {
        String str = c17884.f54616;
        String str2 = c17884.f54616;
        if ("entry_text".equals(str)) {
            return m31925("zip_entry", c17884.f54612, (String) null, (String) null, (String) null, (String) null);
        }
        if ("axml".equals(str2)) {
            return m31925("axml", c17884.f54612, (String) null, (String) null, (String) null, (String) null);
        }
        if ("dex_class_smali".equals(str2)) {
            return m31925("dex_class", (String) null, c17884.f54611, (String) null, (String) null, (String) null);
        }
        if ("dex_method_smali".equals(str2)) {
            return m31925("dex_method", (String) null, c17884.f54611, c17884.f54615, (String) null, (String) null);
        }
        if ("dex_field_smali".equals(str2)) {
            return m31925("dex_field", (String) null, c17884.f54611, (String) null, c17884.f54614, (String) null);
        }
        return m31925("resource", (String) null, (String) null, (String) null, (String) null, c17884.f54613);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31925(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!"zip_entry".equals(str) && !"axml".equals(str)) {
            if ("dex_class".equals(str)) {
                str2 = C18373.m42807(str3);
            } else if ("dex_method".equals(str)) {
                str2 = m31982(str3, str4);
            } else if ("dex_field".equals(str)) {
                str2 = m31982(str3, str5);
            } else {
                if (!"resource".equals(str)) {
                    throw new IllegalArgumentException(C20094.m46315("Unsupported target kind: ", str));
                }
                str2 = str6 == null ? null : str6.toLowerCase(Locale.ROOT);
            }
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException(C20094.m46315("Empty target for locator kind: ", str));
        }
        return str + ':' + str2;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m31944(String str) {
        JSONObject add = JSON.object().add("locator", m31925("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null));
        C22342 m31933 = m31933(add, JSON.value(str), "locator");
        String str2 = m31933.f72399;
        if (!"zip_entry".equals(str2)) {
            throw C3059.m9364("Only zip_entry locators are accepted", "locator", JSON.value(str2), JSON.array("zip_entry"), add);
        }
        String str3 = m31933.f72400;
        if (str3 == null || !str3.endsWith("/")) {
            m31956(str3);
        } else {
            m31956(C15472.m36561(1, 0, str3));
        }
        return str3;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m31968(String str) {
        int indexOf = str == null ? -1 : str.indexOf(58);
        if (indexOf <= 0) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m32000(String str) {
        int indexOf = str == null ? -1 : str.indexOf(58);
        if (indexOf <= 0 || indexOf == str.length() - 1) {
            return null;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31959(String str, String str2) {
        if (str == null || str2 == null) {
            return JSON.NULL;
        }
        if ("axml".equals(str) || "zip_entry".equals(str) || "smali_method".equals(str) || "smali_class".equals(str)) {
            return JSON.value(m31924(str, str2));
        }
        return JSON.NULL;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31924(String str, String str2) {
        if ("axml".equals(str)) {
            return m31925("axml", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("zip_entry".equals(str)) {
            return m31925("zip_entry", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("smali_method".equals(str)) {
            return C20094.m46315("dex_method:", str2);
        }
        if ("smali_class".equals(str)) {
            return m31925("dex_class", (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported edit target type: ", str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31976(String str, String str2, String str3) {
        if ("dex_method".equals(str)) {
            return m31925(str, (String) null, str2, str3, (String) null, (String) null);
        }
        if ("dex_field".equals(str)) {
            return m31925(str, (String) null, str2, (String) null, str3, (String) null);
        }
        if ("dex_class".equals(str)) {
            return m31925(str, (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported xref target kind: ", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12031 m31932(String str, String str2, C2519 c2519, JSONObject jSONObject) {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        String m31967 = m31967(jSONObject2, "view");
        if ("zip_entries".equals(m31967) || "dex_classes".equals(m31967) || "resource_table".equals(m31967)) {
            if (!jSONObject2.contains("prefix")) {
                throw m31950("prefix");
            }
            String m31922 = m31922(jSONObject2, "prefix", "");
            int m31911 = m31911(c2519, jSONObject);
            int m31986 = m31986(jSONObject3, "offset");
            m31935(m31986, 0, Integer.MAX_VALUE, "offset");
            return new C12031(str, str2, m31967, m31922, null, m31911, m31986, 0, 200);
        }
        throw C3059.m9364("Unsupported view", "view", JSON.value(m31967), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12031 m31964(String str, String str2, C2519 c2519, JSONObject jSONObject) {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        String m31971 = m31971(m31967(jSONObject2, "locator"));
        int m31911 = m31911(c2519, jSONObject);
        int m31986 = m31986(jSONObject3, "memberOffset");
        m31935(m31986, 0, Integer.MAX_VALUE, "memberOffset");
        return new C12031(str, str2, "dex_class_outline", "", m31971, m31911, 0, m31986, m31911);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C1656 m31977(String str, String str2, C2519 c2519, JSONObject jSONObject) {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        C17884 m31995 = m31995(m31967(jSONObject2, "target"));
        String str3 = m31995.f54616;
        String m31922 = m31922(jSONObject2, "format", TextBundle.TEXT_ENTRY);
        if ("hex".equals(m31922)) {
            if (!"entry_text".equals(str3)) {
                throw C3059.m9364("Byte read cursor is valid only for zip_entry locators", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            int m31911 = m31911(c2519, jSONObject);
            int m31986 = m31986(jSONObject3, "hexOffset");
            m31935(m31986, 0, Integer.MAX_VALUE, "hexOffset");
            return new C1656(str, str2, m31995, m31922, 0, 0, 500, 49152, m31986, m31911, null, null);
        }
        if (!TextBundle.TEXT_ENTRY.equals(m31922)) {
            throw C3059.m9364("Invalid read cursor format", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        if ("resource_item".equals(str3)) {
            throw C3059.m9364("Resource read cursors are no longer supported", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        int m319112 = m31911(c2519, jSONObject);
        int m319862 = m31986(jSONObject2, "maxChars");
        m31935(m319862, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int m319863 = m31986(jSONObject3, "lineOffset");
        m31935(m319863, 0, Integer.MAX_VALUE, "lineOffset");
        int m319864 = m31986(jSONObject3, "lineCharOffset");
        m31935(m319864, 0, Integer.MAX_VALUE, "lineCharOffset");
        return new C1656(str, str2, m31995, m31922, m319863, m319864, m319112, m319862, 0, 256, "nextCursor", jSONObject.get("nextCursor"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C23528 m31990(String str, String str2, C2519 c2519, JSONObject jSONObject) {
        String str3;
        C14355 c14355;
        JSONObject jSONObject2 = c2519.f7996;
        String m31967 = m31967(jSONObject2, "query");
        String m319672 = m31967(jSONObject2, "queryType");
        boolean m31965 = m31965(jSONObject2, "caseSensitive");
        String m319673 = m31967(jSONObject2, "matchMode");
        C16781 m39514 = C16781.m39514(m31967, m319672, m319673, m31965);
        JSONValue jSONValue = jSONObject2.get("scopes");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962("scopes", jSONValue);
        }
        String str4 = null;
        if (!jSONValue.isArray()) {
            throw C3059.m9364("Invalid scopes", "scopes", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        int i = 0;
        ArrayList m31927 = m31927(jSONValue.asArray(), false, false, false);
        if ("exact".equals(m319673)) {
            Iterator it = m31927.iterator();
            while (it.hasNext()) {
                if ("smali".equals((String) it.next())) {
                    throw C3059.m9364("matchMode=exact is invalid for smali scope", "matchMode", JSON.value(m319673), JSON.array("contains"), JSON.object().add("scopes", JSON.array("smali")).add("matchMode", "contains"));
                }
            }
        }
        int m31911 = m31911(c2519, jSONObject);
        boolean m319652 = m31965(jSONObject2, "includeSnippet");
        int m31986 = m31986(jSONObject2, "snippetMaxChars");
        m31935(m31986, 0, 1000, "snippetMaxChars");
        boolean m319653 = m31965(jSONObject2, "explicitScopes");
        JSONValue jSONValue2 = jSONObject.get("nextCursor");
        String m31922 = m31922(jSONObject2, "target", (String) null);
        if (m31922 != null) {
            while (i < 11) {
                if (f39392[i].equals(m31922)) {
                    str3 = m31922;
                } else {
                    i++;
                    str4 = null;
                }
            }
            throw C3059.m9364("Invalid cursor", "nextCursor", jSONValue2, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        str3 = m319653 ? "" : "overview";
        boolean m319654 = m31965(jSONObject2, "includeMatchOffsets");
        String m319222 = m31922(jSONObject2, "zipEntryPrefix", str4);
        String m319223 = m31922(jSONObject2, "resourcePrefix", str4);
        String m31953 = m319223 == null ? str4 : m31953(m319223);
        String m319674 = m31967(jSONObject2, "classPrefixMode");
        String m319224 = m31922(jSONObject2, "classPrefix", str4);
        if ("none".equals(m319674)) {
            if (m319224 != null) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(m319224), (JSONArray) null, (JSONObject) null);
            }
            c14355 = C14355.f43284;
        } else {
            if (m319224 == null || m319224.isEmpty()) {
                throw C3059.m9364("Invalid prefix", "prefix", m319224 == null ? null : JSON.value(m319224), (JSONArray) null, (JSONObject) null);
            }
            if (!"prefix".equals(m319674) && !"descriptorExact".equals(m319674)) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(m319224), (JSONArray) null, (JSONObject) null);
            }
            c14355 = new C14355(m319674, m319224);
        }
        String m319675 = m31967(jSONObject2, "dexStringResultMode");
        if (Name.LABEL.equals(m319675) || "member".equals(m319675)) {
            return new C23528(str, str2, str3, m31967, m31927, m31911, m319652, m31986, m319653, m319654, m319222, m31953, c14355, m319675, m39514, C18193.m42416(c2519.f7997, jSONObject.get("nextCursor")));
        }
        throw C3059.m9364("Invalid cursor", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9418 m31983(String str, String str2, C2519 c2519, JSONObject jSONObject) {
        JSONObject jSONObject2 = c2519.f7996;
        int m31911 = m31911(c2519, jSONObject);
        try {
            C3292 m31988 = m31988(m31967(jSONObject2, "targetLocator"), jSONObject.get("nextCursor"));
            String m31967 = m31967(jSONObject2, "methodResolution");
            m31978(m31967, jSONObject.get("nextCursor"));
            m31941(m31988, m31967, jSONObject.get("nextCursor"));
            return new C9418(str, str2, m31988.f10331, m31988.f10330, m31988.f10332, m31967, m31911, C1739.m5814(c2519.f7997, jSONObject.get("nextCursor")));
        } catch (C3059 unused) {
            throw C3059.m9364("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C3292 m31988(String str, JSONValue jSONValue) {
        C22342 m31933 = m31933(m31906("dex_method"), JSON.value(str), "locator");
        String str2 = m31933.f72399;
        try {
            String str3 = m31933.f72400;
            if (!"dex_method".equals(str2)) {
                if (!"dex_field".equals(str2)) {
                    if ("dex_class".equals(str2)) {
                        return new C3292(str2, m31996(str3), null);
                    }
                    throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_method", "dex_field", "dex_class"), m31906("dex_method"));
                }
                C4703 m31963 = m31963(str3, "field", true);
                return new C3292(str2, m31963.f14932, m31963.f14933);
            }
            C4703 m319632 = m31963(str3, e.s, true);
            return new C3292(str2, m319632.f14932, m319632.f14933);
        } catch (C3059 unused) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, JSON.array(), m31906(str2));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31978(String str, JSONValue jSONValue) {
        int i = 0;
        while (true) {
            String[] strArr = f39377;
            if (i < 4) {
                if (strArr[i].equals(str)) {
                    return;
                } else {
                    i++;
                }
            } else {
                throw C3059.m9364("Invalid methodResolution", "methodResolution", jSONValue, C0899.m3247(Arrays.asList(strArr)), JSON.object().add("methodResolution", "dispatch"));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31941(C3292 c3292, String str, JSONValue jSONValue) {
        if ("dex_method".equals(c3292.f10331)) {
            if ("not_applicable".equals(str)) {
                throw C3059.m9364("Invalid methodResolution for dex_method", "methodResolution", jSONValue, C0899.m3247(Arrays.asList("exact", "slot", "dispatch")), JSON.object().add("methodResolution", "dispatch"));
            }
        } else if (!"not_applicable".equals(str)) {
            throw C3059.m9364("Invalid methodResolution for xref target", "methodResolution", jSONValue, JSON.array("not_applicable"), JSON.object().add("methodResolution", "not_applicable"));
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C17884 m31995(String str) {
        C22342 m31933 = m31933(JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)), JSON.value(str), "locator");
        String str2 = m31933.f72399;
        String str3 = m31933.f72400;
        if ("zip_entry".equals(str2)) {
            return C17884.m41854(str3);
        }
        if ("axml".equals(str2)) {
            return C17884.m41850(str3);
        }
        if ("dex_class".equals(str2)) {
            return C17884.m41852(m31996(str3));
        }
        if (!"dex_method".equals(str2)) {
            if (!"dex_field".equals(str2)) {
                if ("resource".equals(str2)) {
                    return C17884.m41855(C9042.m23319(str3, "locator"));
                }
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field", "resource"), JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
            }
            C4703 m31963 = m31963(str3, "field", true);
            return C17884.m41851(m31963.f14932, m31963.f14933);
        }
        C4703 m319632 = m31963(str3, e.s, true);
        return C17884.m41853(m319632.f14932, m319632.f14933);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m31971(String str) {
        JSONObject add = JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        C22342 m31933 = m31933(add, JSON.value(str), "locator");
        String str2 = m31933.f72399;
        if (!"dex_class".equals(str2)) {
            throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class"), add);
        }
        return m31996(m31933.f72400);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31975(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962("locator", jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        String asString = jSONValue.asString();
        if (asString.isEmpty()) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return asString;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22342 m31933(JSONObject jSONObject, JSONValue jSONValue, String str) {
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        String asString = jSONValue.asString();
        int indexOf = asString.indexOf(58);
        if (indexOf <= 0 || indexOf == asString.length() - 1) {
            throw C3059.m9364(C20094.m46315("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        return new C22342(asString.substring(0, indexOf), asString.substring(indexOf + 1));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31957(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) ? i : m31910(i, jSONObject, str);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String m31946(String str) {
        return m31963(str, e.s, false).f14932;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m31992(String str) {
        return m31963(str, e.s, false).f14933;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m31982(String str, String str2) {
        return C18373.m42807(str) + "->" + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r0 != false) goto L50;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C4703 m31963(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = "->"
            int r1 = r7.indexOf(r0)
            if (r1 <= 0) goto Lcf
            int r0 = r7.lastIndexOf(r0)
            if (r1 != r0) goto Lcf
            r0 = 0
            java.lang.String r2 = r7.substring(r0, r1)
            r3 = 2
            int r1 = r1 + r3
            java.lang.String r1 = r7.substring(r1)
            java.lang.String r4 = "L"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto Lca
            java.lang.String r4 = ";"
            boolean r4 = r2.endsWith(r4)
            if (r4 == 0) goto Lca
            int r4 = r2.length()
            if (r4 <= r3) goto Lca
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Lca
            java.lang.String r3 = "method"
            boolean r3 = r3.equals(r8)
            r4 = 41
            r5 = 40
            if (r3 == 0) goto L5d
            int r0 = r1.indexOf(r5)
            int r3 = r0 + 1
            int r3 = r1.indexOf(r4, r3)
            if (r0 <= 0) goto L58
            if (r3 <= r0) goto L58
            int r0 = r1.length()
            int r0 = r0 + (-1)
            if (r3 >= r0) goto L58
            goto Lb3
        L58:
            l.ۗۛ᩻ r7 = m31931(r7, r8, r9)
            throw r7
        L5d:
            java.lang.String r3 = "field"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto Lbe
            r3 = 58
            int r3 = r1.indexOf(r3)
            if (r3 <= 0) goto Lb9
            int r6 = r1.length()
            int r6 = r6 + (-1)
            if (r3 >= r6) goto Lb9
            int r5 = r1.indexOf(r5)
            if (r5 >= 0) goto Lb9
            int r4 = r1.indexOf(r4)
            if (r4 >= 0) goto Lb9
            int r3 = r3 + 1
            java.lang.String r3 = r1.substring(r3)
            if (r3 == 0) goto Lb1
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L90
            goto Lb1
        L90:
            r4 = 0
        L91:
            int r5 = r3.length()
            if (r4 >= r5) goto La2
            char r5 = r3.charAt(r4)
            r6 = 91
            if (r5 != r6) goto La2
            int r4 = r4 + 1
            goto L91
        La2:
            int r5 = r3.length()
            if (r4 < r5) goto La9
            goto Lb1
        La9:
            java.lang.String r0 = r3.substring(r4)
            boolean r0 = m31985(r0)
        Lb1:
            if (r0 == 0) goto Lb9
        Lb3:
            l.ۙܳۜ r7 = new l.ۙܳۜ
            r7.<init>(r2, r1)
            return r7
        Lb9:
            l.ۗۛ᩻ r7 = m31931(r7, r8, r9)
            throw r7
        Lbe:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Unsupported smali reference kind: "
            java.lang.String r8 = r9.concat(r8)
            r7.<init>(r8)
            throw r7
        Lca:
            l.ۗۛ᩻ r7 = m31931(r7, r8, r9)
            throw r7
        Lcf:
            l.ۗۛ᩻ r7 = m31931(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13169.m31963(java.lang.String, java.lang.String, boolean):l.ۙܳۜ");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m31985(String str) {
        return str.length() == 1 ? "ZBCSIJFD".indexOf(str.charAt(0)) >= 0 : str.startsWith("L") && str.endsWith(l.b) && str.length() > 2 && str.indexOf(91) < 0 && str.indexOf(58) < 0 && str.indexOf(40) < 0 && str.indexOf(41) < 0 && str.indexOf(59) == str.length() - 1;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m31996(String str) {
        if (!m31985(str) || str.indexOf(46) >= 0 || str.indexOf(59) != str.length() - 1) {
            throw C3059.m9364("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
        }
        return C18373.m42807(str);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static JSONObject m31906(String str) {
        if ("dex_field".equals(str)) {
            return JSON.object().add("locator", m31925("dex_field", (String) null, "Lcom/example/Foo;", (String) null, "fieldFlag:Z", (String) null));
        }
        if ("dex_class".equals(str)) {
            return JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        }
        return JSON.object().add("locator", m31925("dex_method", (String) null, "Lcom/example/Foo;", "onCreate(Landroid/os/Bundle;)V", (String) null, (String) null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31931(String str, String str2, boolean z) {
        String str3 = e.s.equals(str2) ? "Lcom/example/Foo;->onCreate(Landroid/os/Bundle;)V" : "Lcom/example/Foo;->fieldFlag:Z";
        if (z) {
            return C3059.m9364("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", "dex_" + str2 + ':' + str3));
        }
        return C3059.m9364("Invalid target", "target", JSON.value(str), JSON.array(), JSON.object().add("target", "Lcom/example/Foo;->bar()V"));
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C20226 m31952(JSONObject jSONObject) {
        String[] strArr = f39380;
        m31937(jSONObject, "search", strArr);
        m31938(jSONObject, strArr);
        String m31967 = m31967(jSONObject, "workspaceId");
        String m31999 = m31999(jSONObject, "editSessionId");
        String m319992 = m31999(jSONObject, "target");
        int i = 0;
        while (true) {
            String[] strArr2 = f39392;
            if (i >= 11) {
                throw C3059.m9364("Invalid target", "target", JSON.value(m319992), C0899.m3247(Arrays.asList(strArr2)), m31987("overview", "AndroidManifest"));
            }
            if (strArr2[i].equals(m319992)) {
                String m319993 = m31999(jSONObject, "query");
                if (m319993.isEmpty()) {
                    throw C3059.m9364("Invalid query", "query", JSON.value(m319993), (JSONArray) null, m31987(m319992, "AndroidManifest"));
                }
                String m319994 = m31999(jSONObject, "queryType");
                boolean m31979 = m31979(jSONObject, "caseSensitive");
                String m319995 = m31999(jSONObject, "matchMode");
                String m319996 = m31999(jSONObject, "prefix");
                boolean m319792 = m31979(jSONObject, "includeMatchOffsets");
                int m31981 = m31981(jSONObject, "limit");
                m31936(m31981, 1, 200, "limit", m31987(m319992, m319993));
                int m319812 = m31981(jSONObject, "snippetMaxChars");
                m31936(m319812, 0, 1000, "snippetMaxChars", m31987(m319992, m319993));
                if ("overview".equals(m319992) && !m319996.isEmpty()) {
                    throw C3059.m9364("prefix must be empty for target=overview", "prefix", JSON.value(m319996), JSON.array(""), m31987("overview", "AndroidManifest"));
                }
                if ("smali".equals(m319992) && "exact".equals(m319995)) {
                    throw C3059.m9364("matchMode=exact is invalid for target=smali", "matchMode", JSON.value(m319995), JSON.array("contains"), m31987("smali", "onCreate"));
                }
                if ("resource_table_names".equals(m319992) || "resource_table_values".equals(m319992) || "resource_table_file_paths".equals(m319992)) {
                    m31953(m319996);
                } else if (m31966(m319992) && !m319996.isEmpty()) {
                    m31998(m31987(m319992, "Outer").put("prefix", "com.example."), m319996);
                }
                try {
                    return new C20226(m31967, m31999, m319992, m319993, m319996, m319792, m31981, m319812, C16781.m39514(m319993, m319994, m319995, m31979));
                } catch (C3059 e) {
                    if (!e.f9605) {
                        throw e;
                    }
                    JSONObject jSONObject2 = e.f9609;
                    String string = jSONObject2.getString("argument", null);
                    if (!"query".equals(string) && !"queryType".equals(string) && !"matchMode".equals(string)) {
                        throw e;
                    }
                    throw C3059.m9364(e.getMessage(), string, e.f9608, jSONObject2.getJSONArray("allowedValues"), m31987(m319992, "query".equals(string) ? "AndroidManifest" : m319993));
                }
            }
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31966(String str) {
        return "dex_names".equals(str) || "dex_strings".equals(str) || "dex_string_members".equals(str) || "smali".equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m31928(String... strArr) {
        JSONArray array = JSON.array();
        for (String str : strArr) {
            array.add(str);
        }
        return m31927(array, false, false, false);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m31953(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("/") || str.contains("//")) {
            throw m31929(str);
        }
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0 || indexOf != str.lastIndexOf(47)) {
                throw m31929(str);
            }
            if (str.substring(0, indexOf).isEmpty()) {
                throw m31929(str);
            }
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31929(String str) {
        return C3059.m9364("Invalid prefix", "prefix", JSON.value(str), JSON.array("", "0x7f", "string", "string/app_", "app_"), m31987("resource_table_names", "app_name").put("prefix", "string/"));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14355 m31998(JSONObject jSONObject, String str) {
        if (str == null) {
            return C14355.f43284;
        }
        if (!str.contains(l.b)) {
            String replace = (str.startsWith("L") ? str.substring(1) : str).replace('.', '/');
            if (replace.isEmpty()) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
            }
            return new C14355("prefix", replace);
        }
        if (str.startsWith("L") && str.endsWith(l.b) && str.indexOf(59) == str.length() - 1 && str.length() > 3 && C7416.m19937(2, str) != '/') {
            return new C14355("descriptorExact", str);
        }
        throw C3059.m9364("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m31927(JSONArray jSONArray, boolean z, boolean z2, boolean z3) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = f39391;
        String str2 = "resource_table_value";
        String str3 = f39376;
        if (jSONArray == null || jSONArray.isNull()) {
            linkedHashSet.add("zip_entries");
            linkedHashSet.add("axml");
            if (z3) {
                linkedHashSet.add("resource_table_id");
                linkedHashSet.add("resource_table_name");
                linkedHashSet.add("resource_table_value");
            }
            if (z) {
                linkedHashSet.add("dex_class");
                linkedHashSet.add("dex_field");
                linkedHashSet.add("dex_method");
            }
            if (z2) {
                linkedHashSet.add("dex_string");
            }
        } else {
            if (!jSONArray.isArray()) {
                throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONArray, C0899.m3247(Arrays.asList(strArr)), m31913());
            }
            Iterator it = jSONArray.asArray().iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                JSONValue jSONValue = (JSONValue) it.next();
                if (!jSONValue.isString()) {
                    throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONValue, C0899.m3247(Arrays.asList(strArr)), m31913());
                }
                String asString = jSONValue.asString();
                if ("zip_entries".equals(asString) || "axml".equals(asString) || "resource_table_id".equals(asString) || "resource_table_name".equals(asString) || str2.equals(asString)) {
                    str = str2;
                } else {
                    str = str2;
                    if (!"resource_table_file_path".equals(asString) && !"dex_class".equals(asString) && !"dex_field".equals(asString) && !"dex_method".equals(asString) && !"dex_string".equals(asString) && !"smali".equals(asString) && !"native_symbol".equals(asString) && !"native_string".equals(asString)) {
                        throw C3059.m9364(C19462.m44858("Invalid scope: ", asString, ". ", str3), "scopes", JSON.value(asString), C0899.m3247(Arrays.asList(strArr)), m31913());
                    }
                }
                linkedHashSet.add(asString);
                it = it2;
                str2 = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 13; i++) {
            String str4 = strArr[i];
            if (linkedHashSet.contains(str4)) {
                arrayList.add(str4);
            }
        }
        if (arrayList.isEmpty()) {
            throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONArray, C0899.m3247(Arrays.asList(strArr)), m31913());
        }
        return arrayList;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m31991(String str) {
        return "resource_table_id".equals(str) || "resource_table_name".equals(str) || "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31937(JSONObject jSONObject, String str, String... strArr) {
        List asList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!asList.contains(str2)) {
                throw C3059.m9364(C4860.m14172("Invalid ", str, " argument"), str2, jSONObject.get(str2), C0899.m3247(asList), JSON.object());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31938(JSONObject jSONObject, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!jSONObject.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            throw m31950((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("Missing parameters: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i));
        }
        throw C3059.m9364(sb.toString(), "parameters", (JSONValue) null, C0899.m3247(arrayList), JSON.object());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15285 m31969(JSONObject jSONObject) {
        for (String str : jSONObject.names()) {
            if (!"workspaceId".equals(str) && !"editSessionId".equals(str) && !"nextCursor".equals(str) && !"limit".equals(str)) {
                throw C3059.m9364("Invalid continue continuation argument", str, jSONObject.get(str), JSON.array("workspaceId", "editSessionId", "nextCursor", "limit"), JSON.object().add("nextCursor", "<cursor>"));
            }
        }
        m31938(jSONObject, "workspaceId", "editSessionId", "nextCursor", "limit");
        return new C15285(m31967(jSONObject, "workspaceId"), m31999(jSONObject, "editSessionId"), m31967(jSONObject, "nextCursor"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31911(C2519 c2519, JSONObject jSONObject) {
        int m31981 = m31981(jSONObject, "limit");
        m31935(m31981, 1, c2519.f7995, "limit");
        return m31981;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31987(String str, String str2) {
        return C7416.m19939("workspaceId", "ab12cd34", "editSessionId", "").add("target", str).add("query", str2).add("queryType", "literal").add("caseSensitive", false).add("matchMode", "contains").add("prefix", "").add("includeMatchOffsets", false).add("limit", 50).add("snippetMaxChars", 240);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m31967(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962(str, jSONValue);
        }
        String m31922 = m31922(jSONObject, str, (String) null);
        if (m31922.isEmpty()) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(m31922), (JSONArray) null, (JSONObject) null);
        }
        return m31922;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m31999(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962(str, jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m31912(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw C3059.m9364("Missing ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        if (!jSONValue.isArray()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        return jSONValue.asArray();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31922(JSONObject jSONObject, String str, String str2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return str2;
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31910(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return i;
        }
        if (!jSONValue.isNumber()) {
            throw m31930(str, jSONValue);
        }
        try {
            return C0899.m3253(jSONValue);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m31930(str, jSONValue);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m31986(JSONObject jSONObject, String str) {
        if (!jSONObject.contains(str)) {
            throw m31950(str);
        }
        return m31910(0, jSONObject, str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m31981(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m31950(str);
        }
        if (jSONValue.isNull()) {
            throw m31930(str, jSONValue);
        }
        return m31910(0, jSONObject, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31942(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return false;
        }
        if (!jSONValue.isBoolean()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asBoolean();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31965(JSONObject jSONObject, String str) {
        if (!jSONObject.contains(str)) {
            throw m31950(str);
        }
        return m31942(jSONObject, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31979(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m31950(str);
        }
        if (jSONValue.isNull()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return m31942(jSONObject, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31935(int i, int i2, int i3, String str) {
        if (i < i2 || i > i3) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), JSON.object());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31936(int i, int i2, int i3, String str, JSONObject jSONObject) {
        if (i < i2 || i > i3) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), jSONObject);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31930(String str, JSONValue jSONValue) {
        return C3059.m9364(C4860.m14172("Invalid ", str, ": expected a 32-bit integer JSON number"), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m31950(String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m31962(String str, JSONValue jSONValue) {
        return C3059.m9364("Missing ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m31949(JSONObject jSONObject, String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, jSONObject);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31913() {
        return JSON.object().add("scopes", JSON.array("dex_string", "smali"));
    }
}
