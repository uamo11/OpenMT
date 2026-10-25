package l;

import bin.mt.json.JSONObject;

/* compiled from: Q75G */
/* renamed from: l.֫ۖۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1535 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f5417;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5418;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f5419;

    public C1535(JSONObject jSONObject) {
        this.f5417 = C23407.m51853(jSONObject, "fromVirtualAddress", -1L);
        this.f5419 = C23407.m51853(jSONObject, "toVirtualAddress", -1L);
        this.f5418 = jSONObject.getString("kind", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1535 m5247(JSONObject jSONObject) {
        return new C1535(jSONObject);
    }
}
