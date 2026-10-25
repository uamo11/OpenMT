package l;

import bin.mt.json.JSONObject;

/* compiled from: K75F */
/* renamed from: l.ۚܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5454 implements InterfaceC8276 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f16974;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f16975;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f16976;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f16977;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f16978;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f16979;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f16980;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f16981;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f16982;

    public C5454(JSONObject jSONObject) {
        this.f16982 = jSONObject.getString("name", "");
        this.f16978 = jSONObject.getString("demangledName", "");
        this.f16977 = jSONObject.getString("library", "");
        this.f16974 = jSONObject.getString("bind", "");
        this.f16981 = jSONObject.getString("type", "");
        this.f16976 = jSONObject.getString("className", "");
        this.f16980 = jSONObject.getString("descriptor", "");
        this.f16975 = C23407.m51853(jSONObject, "ordinal", 0L);
        this.f16979 = jSONObject.getBoolean("inSectionHeader", false);
        jSONObject.getBoolean("imported", false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5454 m15558(JSONObject jSONObject) {
        return new C5454(jSONObject);
    }
}
