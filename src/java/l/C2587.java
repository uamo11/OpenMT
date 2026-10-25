package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: Q7AJ */
/* renamed from: l.ۖܳۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2587 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19793 f8183;

    public C2587(C19793 c19793) {
        this.f8183 = c19793;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m8197(C1656 c1656, C15923 c15923) {
        String str = c1656.f5788;
        String str2 = c1656.f5782;
        C15991 c15991 = new C15991(this, c1656, c15923);
        C19793 c19793 = this.f8183;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, (String) null, c15991);
        c19793.m45533(str);
        return c12936;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m8196(C2587 c2587, C1656 c1656, C15923 c15923, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        JSONValue add;
        JSONObject m46095;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONValue add2;
        AbstractC2821 m45516 = c2587.f8183.m45516(c1656, c15923);
        int i2 = C8869.f27007;
        String str16 = c1656.f5782;
        if (m45516 instanceof C11243) {
            throw C3059.m9368("UNSUPPORTED_RESOURCE_READ", "Resource reads must use mt_apk_resource_read batch arguments.");
        }
        if (m45516 instanceof C22117) {
            C22117 c22117 = (C22117) m45516;
            long j = c22117.f71808;
            String str17 = c22117.f71811;
            int i3 = c22117.f71809;
            byte[] bArr = c22117.f71806;
            int i4 = c22117.f71807;
            C17884 c17884 = c22117.f71805;
            if (j < 0 || j > 9007199254740991L) {
                j = -1;
            }
            String str18 = "hex";
            JSONObject add3 = C7416.m19939("workspaceId", str17, "editSessionId", str16).add("locator", C13169.m31926(c17884)).add("name", c17884.m41856()).add("maxBytes", i4).add(e.m, JSON.object().add("hex", C13573.m32618(bArr)).add("byteOffset", i3).add("nextByteOffset", i3 + bArr.length).add("totalBytes", j)).add("nextActions", JSON.array());
            if (c22117.f71810) {
                String str19 = c22117.f71811;
                JSONObject add4 = JSON.object().add("target", C13169.m31926(c17884)).add("format", str18).add("recommendedLimit", i4).add("limitMax", 65536);
                JSONObject add5 = JSON.object().add("hexOffset", c22117.f71812);
                str12 = "totalBytes";
                str9 = "nextByteOffset";
                str18 = str18;
                str10 = "byteOffset";
                str11 = e.m;
                str13 = "locator";
                String m43398 = C18747.m43398("read", str19, str16, i, add4, add5);
                str14 = "pagination";
                add3.add(str14, m8193(m43398, true));
                add3.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str17, i4, str16, m43398), "mt_apk_continue", "continue", "Continue reading next hex byte page"));
                str15 = null;
            } else {
                str9 = "nextByteOffset";
                str10 = "byteOffset";
                str11 = e.m;
                str12 = "totalBytes";
                str13 = "locator";
                str14 = "pagination";
                add3.add(str14, m8193((String) null, false));
                str15 = null;
            }
            JSONObject add6 = JSON.object().add("workspaceId", add3.getString("workspaceId", str15)).add("editSessionId", add3.getString("editSessionId", "")).add(str13, C0899.m3254(add3.get(str13))).add("name", add3.getString("name", str15)).add("maxBytes", add3.get("maxBytes") == null ? JSON.NULL : add3.get("maxBytes"));
            JSONObject jSONObject = add3.getJSONObject(str11);
            if (jSONObject == null) {
                add2 = JSON.NULL;
            } else {
                String str20 = str18;
                String str21 = str10;
                String str22 = str9;
                JSONObject add7 = JSON.object().add(str20, jSONObject.getString(str20, "")).add(str21, jSONObject.get(str21) == null ? JSON.NULL : jSONObject.get(str21)).add(str22, jSONObject.getLong(str22, 0L));
                String str23 = str12;
                add2 = add7.add(str23, jSONObject.getLong(str23, -1L));
            }
            m46095 = C19993.m46095(add6.add("byteWindow", add2).add(str14, add3.getJSONObject(str14)), add3.getJSONArray("nextActions"));
        } else {
            C9832 c9832 = (C9832) m45516;
            C1107 c1107 = c9832.f29707;
            int i5 = c9832.f29712;
            String str24 = c9832.f29706;
            Integer num = c9832.f29708;
            C17884 c178842 = c9832.f29713;
            String m31926 = C13169.m31926(c178842);
            JSONObject object = JSON.object();
            String str25 = c1107.f4031;
            boolean z = c1107.f4029;
            JSONObject add8 = object.add(TextBundle.TEXT_ENTRY, str25);
            int i6 = c1107.f4034;
            JSONObject add9 = add8.add("startLine", i6).add("startColumn", c1107.f4033);
            int i7 = c1107.f4036;
            JSONObject add10 = add9.add("nextLine", i7).add("nextColumn", c1107.f4037).add("returnedLineCount", c1107.f4035);
            String str26 = c1107.f4031;
            JSONObject add11 = add10.add("returnedCodePoints", str26.codePointCount(0, str26.length()));
            boolean z2 = c9832.f29714;
            JSONObject add12 = add11.add("totalLineCount", z2 ? -1 : c1107.f4032).add("lineTruncated", c1107.f4039);
            if (num != null) {
                add12.add("absoluteStartLine", num.intValue() + i6).add("absoluteEndLine", num.intValue() + i7);
            }
            JSONObject add13 = C7416.m19939("workspaceId", str24, "editSessionId", str16).add("locator", m31926).add("name", c178842.m41856()).add("textSourceKind", c9832.f29709).add("targetVersion", c9832.f29710).add("truncated", z || z2).add("limit", i5).add(e.m, add12).add("nextActions", JSON.array());
            String str27 = c9832.f29705;
            if (str27 != null) {
                add13.add("truncatedReason", str27);
            } else if (z) {
                add13.add("truncatedReason", "window");
            }
            if (!z || c1107.f4038 == null) {
                str = "limit";
                str2 = "truncated";
                str3 = "textSourceKind";
                str4 = "pagination";
                str5 = TextBundle.TEXT_ENTRY;
                str6 = "";
                str7 = "truncatedReason";
                add13.add(str4, m8193((String) null, false));
                str8 = null;
            } else {
                String str28 = c9832.f29706;
                str = "limit";
                JSONObject add14 = JSON.object().add("target", C13169.m31926(c178842)).add("format", TextBundle.TEXT_ENTRY).add("recommendedLimit", i5).add("limitMax", 2000).add("maxChars", c9832.f29711);
                JSONObject add15 = JSON.object().add("lineOffset", c1107.f4038.intValue());
                Integer num2 = c1107.f4030;
                JSONObject add16 = add15.add("lineCharOffset", num2 == null ? 0 : num2.intValue());
                str7 = "truncatedReason";
                str2 = "truncated";
                str6 = "";
                str5 = TextBundle.TEXT_ENTRY;
                str3 = "textSourceKind";
                str4 = "pagination";
                String m433982 = C18747.m43398("read", str28, str16, i, add14, add16);
                add13.add(str4, m8193(m433982, true));
                add13.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str24, i5, str16, m433982), "mt_apk_continue", "continue", "Continue reading next page"));
                str8 = null;
            }
            String str29 = str3;
            JSONObject add17 = JSON.object().add("workspaceId", add13.getString("workspaceId", str8)).add("editSessionId", add13.getString("editSessionId", str6)).add("locator", C0899.m3254(add13.get("locator"))).add("name", add13.getString("name", str8)).add(str29, add13.getString(str29, str8)).add("targetVersion", add13.getString("targetVersion", str8));
            String str30 = str;
            String str31 = str2;
            JSONObject add18 = add17.add(str30, add13.get(str30) == null ? JSON.NULL : add13.get(str30)).add(str31, add13.getBoolean(str31, false));
            String str32 = str7;
            JSONObject add19 = add18.add(str32, add13.getString(str32, str8));
            JSONObject jSONObject2 = add13.getJSONObject(e.m);
            if (jSONObject2 == null) {
                add = JSON.NULL;
            } else {
                String str33 = str5;
                add = JSON.object().add(str33, jSONObject2.getString(str33, str6)).add("startLine", jSONObject2.getInt("startLine", 0)).add("startColumn", jSONObject2.getInt("startColumn", 0)).add("nextLine", jSONObject2.getInt("nextLine", 0)).add("nextColumn", jSONObject2.getInt("nextColumn", 0)).add("returnedLineCount", jSONObject2.getInt("returnedLineCount", 0)).add("returnedCodePoints", jSONObject2.getInt("returnedCodePoints", 0)).add("totalLineCount", jSONObject2.getInt("totalLineCount", -1)).add("lineTruncated", jSONObject2.getBoolean("lineTruncated", false)).add("absoluteStartLine", C0899.m3255(jSONObject2.get("absoluteStartLine"))).add("absoluteEndLine", C0899.m3255(jSONObject2.get("absoluteEndLine")));
            }
            m46095 = C19993.m46095(add19.add("textWindow", add).add(str4, add13.getJSONObject(str4)), add13.getJSONArray("nextActions"));
        }
        return new C12936(m46095);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e3  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12936 m8199(l.C16472 r36) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2587.m8199(l.ܽۜۜ):l.۬ۛ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m8198(C2519 c2519, JSONObject jSONObject, C15923 c15923) {
        C1656 m31977 = C13169.m31977(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = m31977.f5788;
        String str2 = m31977.f5782;
        C15991 c15991 = new C15991(this, m31977, c15923);
        C19793 c19793 = this.f8183;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, string, c15991);
        c19793.m45533(str);
        return c12936;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m8193(String str, boolean z) {
        return JSON.object().add("hasMore", z).add("nextCursor", str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8195(String str) {
        return C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, str.toLowerCase(Locale.ROOT));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m8194(C13937 c13937) {
        if (c13937 == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m8195(c13937.f41614)).add("missing", c13937.f41616).add("type", c13937.f41619).add("name", c13937.f41618).add("variant", c13937.f41615).add("valueKind", c13937.f41617).add("valueSnippet", c13937.f41621).add("valueTruncated", c13937.f41620);
    }
}
