package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* compiled from: 879T */
/* renamed from: l.ܽܳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16697 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f51257;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f51258;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f51259;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Page through an opened APK workspace: ZIP file entries, dex classes, or resource table entries. Use prefix=\"\" for no filter and limit=200 by default. Pass a dex_class item locator to mt_apk_dex_read_class_outline when you need fields and methods for one exact class. For resource table entries, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator, reads[0].variant from previewValue.variant when non-null, and required budget fields. ZIP entry locators can be inspected as raw bytes with mt_apk_read_bytes, whether the entry is text or binary. Continue pages via nextActions.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "List APK Structures";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_list";
    }

    public C16697(C19793 c19793) {
        this.f51259 = c19793;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f51257;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to list the edited session; pass an empty string to list the base workspace.\"\n  },\n  \"view\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"zip_entries\",\n      \"dex_classes\",\n      \"resource_table\"\n    ],\n    \"description\": \"Choose the structure page. zip_entries: ZIP file entry list with zip_entry locators; dex_classes: dex class list with dex_class locators for mt_apk_dex_read_class_outline; resource_table: resources.arsc compiled resource table entry list with lightweight value previews.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Pass \\\"\\\" for the default no-filter prefix. For zip_entries, match APK ZIP paths like res/layout/. For dex_classes, match dex descriptors or Java/package prefixes like Lcom/example/ or com.example. For resource_table, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Pass 200 by default; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f51257 = m12038;
        return m12038;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f51258;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m21781 = C8231.m21781();
        this.f51258 = m21781;
        return m21781;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C12031 m31972 = C13169.m31972(jSONObject);
            C19793 c19793 = this.f51259;
            String str = m31972.f35995;
            C12936 c12936 = (C12936) c19793.m45511(str, m31972.f35990, (String) null, new C18657(this, m31972));
            c19793.m45533(str);
            return c12936;
        } finally {
            int i = C8869.f27007;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m39252(C2519 c2519, JSONObject jSONObject) {
        C12031 m31932 = C13169.m31932(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = m31932.f35995;
        String str2 = m31932.f35990;
        C18657 c18657 = new C18657(this, m31932);
        C19793 c19793 = this.f51259;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, string, c18657);
        c19793.m45533(str);
        return c12936;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12936 m39251(l.C16697 r52, l.C12031 r53, int r54) {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16697.m39251(l.ܽܳۜ, l.ۨ᩻ۜ, int):l.۬ۛ᩻");
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m39250(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(C13169.m31925(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }
}
