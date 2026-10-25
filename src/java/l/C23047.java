package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* compiled from: D77Z */
/* renamed from: l.᩺ܳۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23047 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f74158;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f74159;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f74160;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only; to inspect the containing method, pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Find APK Dex Xrefs";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_dex_xref";
    }

    public C23047(C19793 c19793) {
        this.f74160 = c19793;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f74158;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f74158 = m12038;
        return m12038;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f74159;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m21794 = C8231.m21794();
        this.f74159 = m21794;
        return m21794;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C8231.m21791(c3059);
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            return m51217(C13169.m31970(jSONObject), false, (String) null);
        } finally {
            int i = C8869.f27007;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m51219(C2519 c2519, JSONObject jSONObject) {
        return m51217(C13169.m31983(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject), true, jSONObject.getString("nextCursor", null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12936 m51217(C9418 c9418, boolean z, String str) {
        String str2 = c9418.f28566;
        C19793 c19793 = this.f74160;
        c19793.m45537(str2);
        try {
            InterfaceC19785 m45535 = c19793.m45535();
            try {
                C12936 c12936 = (C12936) c19793.m45511(str2, c9418.f28567, str, new C11759(this, c9418));
                m45535.close();
                return c12936;
            } finally {
            }
        } catch (OutOfMemoryError e) {
            try {
                C19926.m45880("MT MCP xref out of memory: workspaceId=" + str2 + ", methodResolution=" + c9418.f28570 + ", continuation=" + z + ", error=" + e.getMessage());
            } catch (OutOfMemoryError unused) {
            }
            throw C18081.m42152();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 l.ￛﾬￛﾛ￡ﾩﾻ, still in use, count: 2, list:
          (r3v2 l.ￛﾬￛﾛ￡ﾩﾻ) from 0x0174: MOVE (r21v1 l.ￛﾬￛﾛ￡ﾩﾻ) = (r3v2 l.ￛﾬￛﾛ￡ﾩﾻ)
          (r3v2 l.ￛﾬￛﾛ￡ﾩﾻ) from 0x010f: MOVE (r21v3 l.ￛﾬￛﾛ￡ﾩﾻ) = (r3v2 l.ￛﾬￛﾛ￡ﾩﾻ)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C12936 m51218(l.C23047 r21, l.C9418 r22, int r23) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23047.m51218(l.᩺ܳۜ, l.ۢۜۜ, int):l.۬ۛ᩻");
    }
}
