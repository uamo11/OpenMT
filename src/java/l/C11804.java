package l;

import bin.mt.json.JSONObject;

/* compiled from: D75Y */
/* renamed from: l.ۨܺۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11804 implements InterfaceC8276 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f35206;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f35207;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f35208;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f35209;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f35210;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f35211;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35212;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f35213;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f35214;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f35215;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f35216;

    public C11804(JSONObject jSONObject) {
        this.f35216 = jSONObject.getString("name", "");
        this.f35214 = jSONObject.getString("demangledName", "");
        this.f35212 = jSONObject.getString("className", "");
        this.f35211 = jSONObject.getString("library", "");
        this.f35206 = jSONObject.getString("bind", "");
        this.f35209 = jSONObject.getString("type", "");
        this.f35213 = jSONObject.getBoolean("imported", false);
        this.f35208 = C23407.m51853(jSONObject, "vaddr", 0L);
        this.f35207 = C23407.m51853(jSONObject, "paddr", 0L);
        this.f35215 = C23407.m51853(jSONObject, "size", 0L);
        this.f35210 = jSONObject.getInt("bits", 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11804 m28855(JSONObject jSONObject) {
        return new C11804(jSONObject);
    }
}
