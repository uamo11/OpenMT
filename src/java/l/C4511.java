package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: E762 */
/* renamed from: l.ۙ۟᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4511 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C0277 m13272(JSONObject jSONObject) {
        String str;
        String str2;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        str = m13268.f64903;
        str2 = m13268.f64902;
        return new C0277(m13258, m132582, str, str2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C21445 m13276(JSONObject jSONObject) {
        String str;
        String str2;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "itemKind", "namePrefix", "demangle", "limit");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        String m132583 = m13258(jSONObject, "itemKind");
        if (C15330.m36360(m132583)) {
            String m132584 = m13258(jSONObject, "namePrefix");
            JSONValue jSONValue = jSONObject.get("demangle");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m13269("demangle");
            }
            if (!jSONValue.isBoolean()) {
                throw m13263("demangle", jSONValue);
            }
            boolean asBoolean = jSONValue.asBoolean();
            int m13255 = m13255(jSONObject, "limit", 1, 500);
            str = m13268.f64903;
            str2 = m13268.f64902;
            return new C21445(m13258, m132582, str, str2, m132583, m132584, asBoolean, m13255, 0, -1, 0L, 0L);
        }
        throw C3059.m9364("Invalid itemKind", "itemKind", JSON.value(m132583), m13256(C15330.f46987), JSON.object().add("itemKind", "sections"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C5217 m13274(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        str = m13268.f64903;
        str2 = m13268.f64902;
        j = m13275.f3681;
        str3 = m13275.f3680;
        return new C5217(m13258, m132582, str, str2, m13259, j, str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18623 m13264(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "stopAtSymbolBoundary", "maxBytes", "maxInstructions");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        String m132592 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        JSONValue jSONValue = jSONObject.get("stopAtSymbolBoundary");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269("stopAtSymbolBoundary");
        }
        if (!jSONValue.isBoolean()) {
            throw m13263("stopAtSymbolBoundary", jSONValue);
        }
        boolean asBoolean = jSONValue.asBoolean();
        int m13255 = m13255(jSONObject, "maxBytes", 1, 4096);
        int m132552 = m13255(jSONObject, "maxInstructions", 1, 200);
        str = m13268.f64903;
        str2 = m13268.f64902;
        j = m13275.f3681;
        str3 = m13275.f3680;
        return new C18623(m13258, m132582, str, str2, m13259, j, str3, m132592, asBoolean, m13255, m132552);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19329 m13270(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "outputMode", "maxAnalysisBytes", "maxBlocks", "maxInstructions");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        String m132592 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String m132593 = m13259(jSONObject, "outputMode", "full", ErrorBundle.SUMMARY_ENTRY);
        int m13255 = m13255(jSONObject, "maxAnalysisBytes", 16, 65536);
        int m132552 = m13255(jSONObject, "maxBlocks", 1, 4096);
        int m132553 = m13255(jSONObject, "maxInstructions", 1, 10000);
        str = m13268.f64903;
        str2 = m13268.f64902;
        j = m13275.f3681;
        str3 = m13275.f3680;
        return new C19329(m13258, m132582, str, str2, m13259, j, str3, m132592, m132593, m13255, m132552, m132553);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8039 m13273(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        String[] strArr;
        char charAt;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "expectedHex", "replacementAssembly", "paddingMode");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        if (m132582.isEmpty()) {
            throw C3059.m9364("editSessionId must not be empty for native patch", "editSessionId", JSON.value(m132582), (JSONArray) null, (JSONObject) null);
        }
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        String m132592 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String m132583 = m13258(jSONObject, "expectedHex");
        if (m132583.isEmpty() || (m132583.length() & 1) != 0) {
            throw m13263("expectedHex", JSON.value(m132583));
        }
        int length = m132583.length() / 2;
        if (length > 256) {
            throw C3059.m9365("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "fatal", JSON.array(), JSON.object().add("expectedBytes", length));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(m132583.charAt(i2), 16);
            int digit2 = Character.digit(m132583.charAt(i2 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                throw m13263("expectedHex", JSON.value(m132583));
            }
            bArr[i] = (byte) (digit2 | (digit << 4));
        }
        String m132584 = m13258(jSONObject, "replacementAssembly");
        if (m132584.trim().isEmpty()) {
            throw m13263("replacementAssembly", JSON.value(m132584));
        }
        if (m132584.length() > 4096) {
            throw C3059.m9364("Invalid replacementAssembly", "replacementAssembly", JSON.value(m132584), JSON.array("1..4096"), (JSONObject) null);
        }
        String[] split = m132584.replace(",,", "\n").split("[;\\r\\n]", -1);
        int length2 = split.length;
        int i3 = 0;
        while (i3 < length2) {
            String str4 = split[i3];
            int i4 = 0;
            while (true) {
                strArr = split;
                if (i4 >= str4.length() || !((charAt = str4.charAt(i4)) == ' ' || charAt == '\t' || charAt == '\n' || charAt == '\r' || charAt == ',' || charAt == ';' || charAt == ':' || charAt == '[' || charAt == ']' || charAt == '(' || charAt == ')' || charAt == '{' || charAt == '}')) {
                    break;
                }
                i4++;
                split = strArr;
            }
            String substring = str4.substring(i4);
            int indexOf = substring.indexOf(58);
            int i5 = length2;
            if (indexOf >= 0) {
                String trim = substring.substring(indexOf + 1).trim();
                if (trim.startsWith(".")) {
                    throw C3059.m9364("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(m132584), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
                }
                if (substring.indexOf(32) < 0) {
                    substring = trim;
                }
            }
            if (substring.startsWith(".")) {
                throw C3059.m9364("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(m132584), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
            }
            i3++;
            split = strArr;
            length2 = i5;
        }
        String m132593 = m13259(jSONObject, "paddingMode", "none", "nop");
        str = m13268.f64903;
        str2 = m13268.f64902;
        j = m13275.f3681;
        str3 = m13275.f3680;
        return new C8039(m13258, m132582, str, str2, m13259, j, str3, m132592, bArr, m13260(bArr), m132584, m132593);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15093 m13271(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "expectedText", "replacementText", "paddingMode");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        if (m132582.isEmpty()) {
            throw C3059.m9364("editSessionId must not be empty for native string patch", "editSessionId", JSON.value(m132582), (JSONArray) null, (JSONObject) null);
        }
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        String m132583 = m13258(jSONObject, "expectedText");
        if (m132583.isEmpty()) {
            throw m13263("expectedText", JSON.value(m132583));
        }
        String m132584 = m13258(jSONObject, "replacementText");
        byte[] m13266 = m13266(jSONObject, "expectedText", m132583);
        byte[] m132662 = m13266(jSONObject, "replacementText", m132584);
        String m132592 = m13259(jSONObject, "paddingMode", "none", "null_pad", "space_pad");
        str = m13268.f64903;
        str2 = m13268.f64902;
        j = m13275.f3681;
        str3 = m13275.f3680;
        return new C15093(m13258, m132582, str, str2, m13259, j, str3, m132583, m13266, m132662, m132592);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C22150 m13267(JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        String str3;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "scanKind", "referenceKinds", "maxScanBytes", "limit");
        String m13258 = m13258(jSONObject, "workspaceId");
        String m132582 = m13258(jSONObject, "editSessionId");
        C20034 m13268 = m13268(jSONObject);
        String m13259 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 m13275 = m13275(jSONObject);
        String m132592 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String m132583 = m13258(jSONObject, "scanKind");
        try {
            C3863.m11620(m132583);
            JSONValue jSONValue = jSONObject.get("referenceKinds");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m13269("referenceKinds");
            }
            if (!jSONValue.isArray()) {
                throw m13261(jSONValue);
            }
            ArrayList arrayList = new ArrayList(jSONValue.asArray().size());
            Iterator it = jSONValue.asArray().iterator();
            while (it.hasNext()) {
                JSONValue jSONValue2 = (JSONValue) it.next();
                if (!jSONValue2.isString()) {
                    throw m13261(jSONValue2);
                }
                arrayList.add(jSONValue2.asString());
            }
            try {
                List m7423 = C2241.m7423(C2241.m7421(arrayList));
                int m13255 = m13255(jSONObject, "maxScanBytes", 16, 4194304);
                int m132552 = m13255(jSONObject, "limit", 1, 200);
                str = m13268.f64903;
                str2 = m13268.f64902;
                j = m13275.f3681;
                str3 = m13275.f3680;
                C22150 c22150 = new C22150(m13258, m132582, str, str2, m13259, j, str3, m132592, m132583, m7423, m13255, m132552, 0, 0, 0L, 0, 0L, 0L, 0L, null, 0, null);
                List list = c22150.f71861;
                try {
                    String str4 = c22150.f71868;
                    C3863.m11619(C2241.m7421(list), str4);
                    if (!e.m.equals(str4) || "auto".equals(m132592)) {
                        return c22150;
                    }
                    throw C6450.m17822(c22150);
                } catch (IllegalArgumentException unused) {
                    JSONArray array = JSON.array();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        array.add((String) it2.next());
                    }
                    throw m13261(array);
                }
            } catch (IllegalArgumentException unused2) {
                throw m13261(jSONValue);
            }
        } catch (IllegalArgumentException unused3) {
            throw C3059.m9364("Invalid scanKind", "scanKind", JSON.value(m132583), m13256("code", e.m, "both"), JSON.object().add("scanKind", "both"));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13265(JSONObject jSONObject, String... strArr) {
        Iterator it = jSONObject.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                JSONObject.Member member = (JSONObject.Member) it.next();
                String name = member.getName();
                int length = strArr.length;
                while (i < length) {
                    if (strArr[i].equals(name)) {
                        break;
                    } else {
                        i++;
                    }
                }
                throw C3059.m9364("Invalid native tool argument", name, member.getValue(), (JSONArray) null, (JSONObject) null);
            }
            int length2 = strArr.length;
            while (i < length2) {
                String str = strArr[i];
                if (jSONObject.get(str) == null) {
                    throw m13269(str);
                }
                i++;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13258(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269(str);
        }
        if (!jSONValue.isString()) {
            throw m13263(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C20034 m13268(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269("locator");
        }
        if (!jSONValue.isString()) {
            throw m13263("locator", jSONValue);
        }
        String asString = jSONValue.asString();
        if (!asString.startsWith("zip_entry:") || asString.length() == 10) {
            throw C3059.m9364("native tools accept only zip_entry locators", "locator", jSONValue, JSON.array("zip_entry:<entryName>"), JSON.object().add("locator", "zip_entry:lib/arm64-v8a/libexample.so"));
        }
        return new C20034(asString, asString.substring(10));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13259(JSONObject jSONObject, String str, String... strArr) {
        String m13258 = m13258(jSONObject, str);
        for (String str2 : strArr) {
            if (str2.equals(m13258)) {
                return m13258;
            }
        }
        throw C3059.m9364("Invalid ".concat(str), str, JSON.value(m13258), m13256(strArr), (JSONObject) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13255(JSONObject jSONObject, String str, int i, int i2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269(str);
        }
        if (!jSONValue.isNumber()) {
            throw m13263(str, jSONValue);
        }
        try {
            int m3253 = C0899.m3253(jSONValue);
            if (m3253 >= i && m3253 <= i2) {
                return m3253;
            }
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(m3253), JSON.array(String.valueOf(i) + ".." + i2), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw m13263(str, jSONValue);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0983 m13275(JSONObject jSONObject) {
        long m43885;
        String m13258 = m13258(jSONObject, "address");
        String trim = m13258.trim();
        if (trim.isEmpty() || trim.charAt(0) == '-' || trim.charAt(0) == '+') {
            throw m13262(m13258);
        }
        try {
            if (!trim.startsWith("0x") && !trim.startsWith("0X")) {
                m43885 = Long.parseLong(trim, 10);
                return new C0983(m43885, m13257(m43885));
            }
            String substring = trim.substring(2);
            if (substring.isEmpty()) {
                throw new NumberFormatException("empty hex");
            }
            m43885 = C19033.m43885(substring);
            if (m43885 < 0) {
                throw new NumberFormatException("address overflow");
            }
            return new C0983(m43885, m13257(m43885));
        } catch (NumberFormatException unused) {
            throw m13262(m13258);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13257(long j) {
        return "0x" + Long.toHexString(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13260(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i).toUpperCase(Locale.ROOT));
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m13266(JSONObject jSONObject, String str, String str2) {
        if (str2.indexOf(0) >= 0) {
            throw m13263(str, jSONObject.get(str));
        }
        try {
            CharsetEncoder newEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str2));
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            return bArr;
        } catch (CharacterCodingException unused) {
            throw m13263(str, jSONObject.get(str));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m13256(String... strArr) {
        JSONArray array = JSON.array();
        for (String str : strArr) {
            array.add(str);
        }
        return array;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13262(String str) {
        return C3059.m9364("Invalid address", "address", JSON.value(str), JSON.array("0..9223372036854775807", "0x0..0x7fffffffffffffff"), JSON.object().add("address", "0x1000"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13263(String str, JSONValue jSONValue) {
        return C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13261(JSONValue jSONValue) {
        return C3059.m9364("Invalid referenceKinds", "referenceKinds", jSONValue, m13256(C2241.f7309), JSON.object().add("referenceKinds", JSON.array("call", "jump", e.m, "unknown")));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m13269(String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }
}
