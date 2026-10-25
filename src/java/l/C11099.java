package l;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: W1P7 */
/* renamed from: l.ۧܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11099 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f33311;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f33312;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f33313;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f33314;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f33315;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f33316;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27532() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pattern", this.f33316);
            jSONObject.put("obf", this.f33314);
            jSONObject.put("keep", this.f33311);
            jSONObject.put("xp", this.f33313);
            jSONObject.put("vfy", this.f33315);
            jSONObject.put("map", this.f33312);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27533(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pattern")) {
                this.f33316 = jSONObject.getString("pattern");
            }
            if (jSONObject.has("obf")) {
                this.f33314 = jSONObject.getBoolean("obf");
            }
            if (jSONObject.has("keep")) {
                this.f33311 = jSONObject.getBoolean("keep");
            }
            if (jSONObject.has("xp")) {
                this.f33313 = jSONObject.getBoolean("xp");
            }
            if (jSONObject.has("vfy")) {
                this.f33315 = jSONObject.getBoolean("vfy");
            }
            if (jSONObject.has("map")) {
                this.f33312 = jSONObject.getString("map");
            }
        } catch (JSONException unused) {
        }
    }
}
