package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: X7AT */
/* renamed from: l.ܿܳۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17403 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f53249;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f53250;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f53251;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_list or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_list with view=dex_classes and prefix to discover classes first. Returned field and method locators can be passed with the same workspaceId and editSessionId to mt_apk_read_text. Continue pages via nextActions.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Outline APK Dex Class";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_dex_read_class_outline";
    }

    public C17403(C19793 c19793) {
        this.f53251 = c19793;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f53249;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_list or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f53249 = m12038;
        return m12038;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f53250;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m5535 = C1648.m5535("Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this outline result.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls.")).add("locator", C1648.m5542("string", "dex_class locator for this outline result.")).add("javaName", C1648.m5542("string", "Java-style class name.")).add("classHeader", C1648.m5542("string", "Raw .class header line, or null.")).add("super", C1648.m5542("string", "Superclass descriptor, or null.")).add("implements", C1648.m5541("Implemented interfaces.")).add("source", C1648.m5542("string", "Smali .source debug file name, or null; not a ZIP entry locator.")).add("fields", C7416.m19939("type", "array", "description", "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member.").add("items", C18736.m43390(JSON.object().add("locator", C1648.m5545("string", "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C1648.m5545("string", "Field name.")).add("sig", C1648.m5545("string", "Field signature.")).add(am.Q, C1648.m5545("string", "Smali access flags text.")).add("constantValue", C1648.m5542("string", "Static final dex initial value preview, or null.")), ClassTransform.BOOLEAN, "Whether constantValue was truncated.", "constantValueTruncated", "One field outline item."))).add("methods", C7416.m19939("type", "array", "description", "Current class-outline method page with method features; pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_read_text to read the member.").add("items", C1648.m5532(JSON.object().add("locator", C1648.m5545("string", "dex_method locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C1648.m5545("string", "Method name.")).add("sig", C1648.m5545("string", "Method signature.")).add(am.Q, C1648.m5545("string", "Smali access flags text.")).add("instructionCount", C1648.m5545("integer", "Instruction count.")).add("stringRefCount", C1648.m5545("integer", "String reference count.")).add("resourceRefCount", C1648.m5545("integer", "Resource reference count.")).add("invokeCount", C1648.m5545("integer", "Invoke count.")).add("interestingStrings", C1648.m5541("Interesting string previews.")).add("interestingInvokes", C1648.m5541("Interesting invoke previews.")), "One method outline item."))).add("pagination", C1648.m5544(C1648.m5537("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_read_class_outline data."), C1648.m5540(C12464.m30621()), C1648.m5538("Executable continue or recovery actions; copy arguments directly.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
        this.f53250 = m5535;
        return m5535;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C12031 m31947 = C13169.m31947(jSONObject);
            C15923 c15923 = new C15923();
            C19793 c19793 = this.f53251;
            String str = m31947.f35995;
            C12936 c12936 = (C12936) c19793.m45511(str, m31947.f35990, (String) null, new C17848(this, m31947, c15923));
            c19793.m45533(str);
            return c12936;
        } finally {
            int i = C8869.f27007;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m40758(C2519 c2519, JSONObject jSONObject, C15923 c15923) {
        C12031 m31964 = C13169.m31964(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = m31964.f35995;
        String str2 = m31964.f35990;
        C17848 c17848 = new C17848(this, m31964, c15923);
        C19793 c19793 = this.f53251;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, string, c17848);
        c19793.m45533(str);
        return c12936;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m40757(C17403 c17403, C12031 c12031, C15923 c15923, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str6;
        C20001 m45530 = c17403.f53251.m45530(c12031, c15923);
        int i2 = C8869.f27007;
        String str7 = c12031.f35990;
        JSONObject object = JSON.object();
        String str8 = m45530.f64730;
        JSONObject add = object.add("workspaceId", str8).add("editSessionId", str7).add("locator", C13169.m31925("dex_class", (String) null, m45530.f64727, (String) null, (String) null, (String) null)).add("javaName", m45530.f64743);
        C3556 c3556 = m45530.f64736;
        JSONObject add2 = add.add("classHeader", c3556.f11291).add("super", c3556.f11294).add("implements", C0899.m3247(c3556.f11292)).add("source", c3556.f11295);
        String str9 = m45530.f64727;
        JSONObject add3 = add2.add("fields", m40756(str9, m45530.f64735)).add("methods", m40756(str9, m45530.f64742)).add("nextActions", JSON.array());
        JSONObject object2 = JSON.object();
        boolean z = m45530.f64741;
        int i3 = m45530.f64731;
        JSONObject add4 = object2.add("hasMore", z).add("returnedCount", m45530.f64737).add("limitMax", 1000).add("totalAvailableCount", m45530.f64740);
        if (z) {
            JSONObject add5 = JSON.object().add("memberOffset", m45530.f64733);
            String str10 = m45530.f64730;
            JSONObject add6 = JSON.object().add("locator", C13169.m31925("dex_class", (String) null, m45530.f64727, (String) null, (String) null, (String) null)).add("recommendedLimit", i3).add("limitMax", 1000);
            str2 = "methods";
            str6 = "classHeader";
            str3 = "fields";
            jSONObject2 = add3;
            str5 = "javaName";
            str4 = "source";
            jSONObject = add4;
            str = "implements";
            String m43398 = C18747.m43398("outline_class", str10, str7, i, add6, add5);
            jSONObject.add("nextCursor", m43398);
            jSONObject2.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str8, i3, str7, m43398), "mt_apk_continue", "continue", "Continue class outline next page"));
        } else {
            str = "implements";
            str2 = "methods";
            str3 = "fields";
            str4 = "source";
            str5 = "javaName";
            jSONObject = add4;
            jSONObject2 = add3;
            str6 = "classHeader";
        }
        jSONObject2.add("pagination", jSONObject);
        String str11 = str5;
        JSONObject add7 = JSON.object().add("workspaceId", jSONObject2.getString("workspaceId", null)).add("editSessionId", jSONObject2.getString("editSessionId", "")).add("locator", C0899.m3254(jSONObject2.get("locator"))).add(str11, jSONObject2.getString(str11, null));
        String str12 = str6;
        JSONObject add8 = add7.add(str12, jSONObject2.getString(str12, null)).add("super", jSONObject2.getString("super", null)).add(str, C0899.m3246(jSONObject2.getJSONArray(str)));
        String str13 = str4;
        JSONObject add9 = add8.add(str13, jSONObject2.getString(str13, null));
        String str14 = str3;
        JSONArray jSONArray = jSONObject2.getJSONArray(str14);
        JSONArray array = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject asObject = ((JSONValue) it.next()).asObject();
                array.add(JSON.object().add("locator", C0899.m3254(asObject.get("locator"))).add("name", asObject.getString("name", null)).add("sig", asObject.getString("sig", null)).add(am.Q, asObject.getString(am.Q, null)).add("constantValue", asObject.getString("constantValue", null)).add("constantValueTruncated", asObject.getBoolean("constantValueTruncated", false)));
            }
        }
        JSONObject add10 = add9.add(str14, array);
        String str15 = str2;
        JSONArray jSONArray2 = jSONObject2.getJSONArray(str15);
        JSONArray array2 = JSON.array();
        if (jSONArray2 != null) {
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                JSONObject asObject2 = ((JSONValue) it2.next()).asObject();
                array2.add(JSON.object().add("locator", C0899.m3254(asObject2.get("locator"))).add("name", asObject2.getString("name", null)).add("sig", asObject2.getString("sig", null)).add(am.Q, asObject2.getString(am.Q, null)).add("instructionCount", C0899.m3255(asObject2.get("instructionCount"))).add("stringRefCount", C0899.m3255(asObject2.get("stringRefCount"))).add("resourceRefCount", C0899.m3255(asObject2.get("resourceRefCount"))).add("invokeCount", C0899.m3255(asObject2.get("invokeCount"))).add("interestingStrings", C0899.m3246(asObject2.getJSONArray("interestingStrings"))).add("interestingInvokes", C0899.m3246(asObject2.getJSONArray("interestingInvokes"))));
            }
        }
        return new C12936(C19993.m46095(add10.add(str15, array2).add("pagination", C0899.m3248(jSONObject2.getJSONObject("pagination"))), jSONObject2.getJSONArray("nextActions")));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m40756(String str, ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20490 c20490 = (C20490) it.next();
            String str2 = "field".equals(c20490.f66061) ? "dex_field" : "dex_method";
            JSONObject add = JSON.object().add("name", c20490.f66058).add("sig", c20490.f66062).add(am.Q, c20490.f66055);
            if ("dex_field".equals(str2)) {
                add.add("locator", C13169.m31925(str2, (String) null, str, (String) null, c20490.f66062, (String) null));
                C21901 c21901 = c20490.f66057;
                if (c21901 != null) {
                    add.add("constantValue", c21901.f70113).add("constantValueTruncated", c20490.f66057.f70112);
                }
            } else {
                C4967 c4967 = c20490.f66060;
                add.add("instructionCount", c4967.f15653).add("stringRefCount", c4967.f15655).add("resourceRefCount", c4967.f15657).add("invokeCount", c4967.f15658).add("interestingStrings", C0899.m3247(c4967.f15656)).add("interestingInvokes", C0899.m3247(c4967.f15654));
                add.add("locator", C13169.m31925(str2, (String) null, str, c20490.f66062, (String) null, (String) null));
            }
            array.add(add);
        }
        return array;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }
}
