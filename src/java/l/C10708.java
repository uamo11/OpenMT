package l;

import bin.mt.json.JSONObject;

/* compiled from: Q75G */
/* renamed from: l.ۧۖۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10708 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f32284;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f32285;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f32286;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f32287;

    public C10708(JSONObject jSONObject) {
        this.f32286 = C23407.m51853(jSONObject, "sourceVirtualAddress", -1L);
        this.f32284 = jSONObject.getString("flowKind", "");
        this.f32287 = C23407.m51853(jSONObject, "targetVirtualAddress", -1L);
        this.f32285 = jSONObject.getString("reason", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10708 m26888(JSONObject jSONObject) {
        return new C10708(jSONObject);
    }
}
