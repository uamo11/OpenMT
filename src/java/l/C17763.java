package l;

import bin.mt.json.JSONObject;

/* compiled from: Q75G */
/* renamed from: l.ᩳۖۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17763 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f54333;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f54334;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54335;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f54336;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f54337;

    public C17763(JSONObject jSONObject) {
        this.f54337 = C23407.m51853(jSONObject, "sourceVirtualAddress", -1L);
        this.f54333 = jSONObject.getString("flowKind", "");
        boolean contains = jSONObject.contains("targetVirtualAddress");
        this.f54334 = contains;
        this.f54336 = contains ? C23407.m51853(jSONObject, "targetVirtualAddress", -1L) : -1L;
        this.f54335 = jSONObject.getString("reason", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17763 m41614(JSONObject jSONObject) {
        return new C17763(jSONObject);
    }
}
