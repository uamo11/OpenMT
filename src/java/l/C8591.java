package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: O75H */
/* renamed from: l.ۡۖۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8591 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f26230;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f26231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f26232;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3652 f26233;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f26234;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f26235;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f26236;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f26237;

    public C8591(JSONObject jSONObject) {
        this.f26237 = C23407.m51853(jSONObject, "sourceVirtualAddress", -1L);
        this.f26234 = C23407.m51853(jSONObject, "sourceFileOffset", -1L);
        this.f26236 = jSONObject.getString("sourceKind", "");
        this.f26235 = jSONObject.getInt("sourceSize", 0);
        this.f26233 = C3652.m11143(jSONObject.getJSONObject("sourceSymbol"));
        this.f26230 = jSONObject.getString("bytes", "");
        this.f26231 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f26232 = jSONObject.getString("referenceKind", "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8591 m22299(JSONObject jSONObject) {
        return new C8591(jSONObject);
    }
}
