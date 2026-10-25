package l;

import bin.mt.json.JSONObject;

/* compiled from: Q75G */
/* renamed from: l.۟ܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7570 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f23377;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f23378;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f23379;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f23380;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f23381;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f23382;

    public C7570(JSONObject jSONObject) {
        this.f23381 = C23407.m51853(jSONObject, "startVirtualAddress", -1L);
        this.f23382 = C23407.m51853(jSONObject, "startPhysicalAddress", -1L);
        this.f23380 = C23407.m51853(jSONObject, "size", 0L);
        this.f23378 = jSONObject.getInt("instructionCount", 0);
        this.f23379 = jSONObject.getString("terminator", "");
        this.f23377 = jSONObject.getString("assemblyText", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7570 m20294(JSONObject jSONObject) {
        return new C7570(jSONObject);
    }
}
