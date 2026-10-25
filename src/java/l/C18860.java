package l;

import bin.mt.json.JSONObject;

/* compiled from: J754 */
/* renamed from: l.ᩴܺۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18860 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f59464;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f59465;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f59466;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f59467;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f59468;

    public C18860(JSONObject jSONObject) {
        this.f59465 = jSONObject.getString("arch", "");
        this.f59466 = jSONObject.getInt("bits", 0);
        this.f59464 = C23407.m51853(jSONObject, "address", 0L);
        String string = jSONObject.getString("hex", "");
        this.f59467 = jSONObject.getInt("size", 0);
        int length = string.length();
        if ((length & 1) != 0) {
            throw new C23092("Invalid hex length from radare2");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int digit = Character.digit(string.charAt(i3), 16);
            int digit2 = Character.digit(string.charAt(i3 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                throw new C23092("Invalid hex digit from radare2");
            }
            bArr[i2] = (byte) (digit2 | (digit << 4));
        }
        this.f59468 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18860 m43560(JSONObject jSONObject) {
        return new C18860(jSONObject);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43561() {
        return (byte[]) this.f59468.clone();
    }
}
