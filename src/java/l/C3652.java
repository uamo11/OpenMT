package l;

import bin.mt.json.JSONObject;

/* compiled from: N75J */
/* renamed from: l.ۘۖۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3652 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f11512;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f11513;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f11514;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f11515;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f11516;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f11517;

    public C3652(JSONObject jSONObject) {
        this.f11513 = jSONObject.getString("name", "");
        this.f11512 = jSONObject.getString("demangledName", "");
        this.f11514 = C23407.m51853(jSONObject, "startVirtualAddress", -1L);
        this.f11516 = C23407.m51853(jSONObject, "startPhysicalAddress", -1L);
        this.f11515 = C23407.m51853(jSONObject, "offset", -1L);
        this.f11517 = C23407.m51853(jSONObject, "size", 0L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3652 m11143(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C3652(jSONObject);
    }
}
