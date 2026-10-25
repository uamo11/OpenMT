package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* compiled from: 16LA */
/* renamed from: l.ܿ֡ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16991 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0616 f52123;

    /* renamed from: ۜ */
    public String[] mo33818() {
        return new String[0];
    }

    /* renamed from: ۧ */
    public abstract JSONObject mo26701(JSONObject jSONObject);

    /* renamed from: ᩻ */
    public abstract JSONObject mo26702();

    public AbstractC16991(C0616 c0616) {
        this.f52123 = c0616;
    }

    /* renamed from: ֫ */
    public JSONArray mo26700(JSONObject jSONObject, JSONObject jSONObject2) {
        return JSON.array();
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r6.equals("finalColumn") == false) goto L19;
     */
    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.json.JSONObject mo3039() {
        /*
            r8 = this;
            bin.mt.json.JSONObject r0 = bin.mt.json.JSON.object()
            java.lang.String r1 = "string"
            java.lang.String r2 = "Normalized archive path when available."
            bin.mt.json.JSONObject r2 = l.C1648.m5542(r1, r2)
            java.lang.String r3 = "path"
            bin.mt.json.JSONObject r0 = r0.add(r3, r2)
            java.lang.String r2 = "Affected ZIP entry when available; empty for the archive."
            bin.mt.json.JSONObject r1 = l.C1648.m5542(r1, r2)
            java.lang.String r2 = "entryPath"
            bin.mt.json.JSONObject r0 = r0.add(r2, r1)
            java.lang.String[] r1 = r8.mo33818()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L25:
            r5 = 2
            r6 = 1
            if (r4 >= r2) goto L70
            r6 = r1[r4]
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case 3530753: goto L4a;
                case 355023498: goto L3f;
                case 1623003244: goto L36;
                default: goto L35;
            }
        L35:
            goto L55
        L36:
            java.lang.String r7 = "finalColumn"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L56
            goto L55
        L3f:
            java.lang.String r5 = "finalLine"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L48
            goto L55
        L48:
            r5 = 1
            goto L56
        L4a:
            java.lang.String r5 = "size"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L53
            goto L55
        L53:
            r5 = 0
            goto L56
        L55:
            r5 = -1
        L56:
            switch(r5) {
                case 0: goto L62;
                case 1: goto L5f;
                case 2: goto L5c;
                default: goto L59;
            }
        L59:
            java.lang.String r5 = "Number of ordinary entries fully validated before testing stopped."
            goto L64
        L5c:
            java.lang.String r5 = "Zero-based Unicode code-point column at the observed entry EOF."
            goto L64
        L5f:
            java.lang.String r5 = "Zero-based logical line at the observed entry EOF."
            goto L64
        L62:
            java.lang.String r5 = "Observed uncompressed entry length in bytes for an offset error."
        L64:
            java.lang.String r7 = "integer"
            bin.mt.json.JSONObject r5 = l.C1648.m5542(r7, r5)
            r0.add(r6, r5)
            int r4 = r4 + 1
            goto L25
        L70:
            boolean r1 = r8 instanceof l.C14168
            if (r1 == 0) goto L7b
            java.lang.String r1 = "No automatic follow-up action."
            bin.mt.json.JSONObject r1 = l.C1648.m5534(r1)
            goto La3
        L7b:
            java.lang.String r1 = r8.mo3040()
            java.lang.String r2 = "continue"
            bin.mt.json.JSONObject r4 = r8.mo3038()
            bin.mt.json.JSONObject r1 = l.C1648.m5533(r4, r1, r2)
            java.lang.String r2 = r8.mo3040()
            java.lang.String r4 = "retry"
            bin.mt.json.JSONObject r7 = r8.mo3038()
            bin.mt.json.JSONObject r2 = l.C1648.m5533(r7, r2, r4)
            bin.mt.json.JSONObject[] r4 = new bin.mt.json.JSONObject[r5]
            r4[r3] = r1
            r4[r6] = r2
            java.lang.String r1 = "Executable continuation; list cursor errors may provide a restart."
            bin.mt.json.JSONObject r1 = l.C1648.m5538(r1, r4)
        La3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Result for "
            r2.<init>(r3)
            java.lang.String r3 = r8.mo3040()
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            bin.mt.json.JSONObject r3 = r8.mo26702()
            java.lang.String r4 = "ZIP read diagnostics."
            bin.mt.json.JSONObject r0 = l.C1648.m5532(r0, r4)
            bin.mt.json.JSONObject r0 = l.C1648.m5540(r0)
            bin.mt.json.JSONObject r0 = l.C1648.m5535(r2, r3, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16991.mo3039():bin.mt.json.JSONObject");
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject object = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject add = object.add(MotionUtils.EASING_TYPE_PATH, jSONValue);
        JSONValue jSONValue2 = jSONObject.get("entryPath");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject add2 = add.add("entryPath", jSONValue2);
        for (String str : mo33818()) {
            JSONValue jSONValue3 = jSONObject.get(str);
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            add2.add(str, jSONValue3);
        }
        return C19993.m46097(c3059, add2, c3059.f9604);
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            JSONObject mo26701 = mo26701(jSONObject);
            return new C12936(C19993.m46095(mo26701, mo26700(jSONObject, mo26701)));
        } catch (C3059 e) {
            if ((this instanceof C10642) && "ZIP_INVALID_CURSOR".equals(e.f9610)) {
                throw e.m9370(JSON.array().add(C10115.m25398(new JSONObject(jSONObject).put("cursor", "").put(MotionUtils.EASING_TYPE_PATH, e.f9609.getString(MotionUtils.EASING_TYPE_PATH)), "mt_zip_list", "retry", "Discard earlier pages and restart the ZIP listing.")));
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m39826(boolean z) {
        JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative ZIP file path; split archives are not supported."));
        if (z) {
            add.add("password", C1648.m5545("string", "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."));
        }
        return add;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m39827() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute archive path.")).add("entryPath", C1648.m5545("string", "Exact case-sensitive path inside the ZIP."));
    }
}
