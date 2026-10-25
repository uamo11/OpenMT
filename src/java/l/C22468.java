package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: N6WI */
/* renamed from: l.᩹ᩴۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22468 extends AbstractC4470 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f72766 = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "contentPattern", "contentPatternType", "contentCaseSensitive", "writeText", "replacementMode", "replaceMode", "expectedReplacements"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f72767;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f72768;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f72769;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Replace text in one existing regular file. First call mt_file_read_text and copy path, encoding and targetVersion. Matches are non-overlapping and evaluated against the whole original text; inserted text is never searched again. Regex uses multiline ^/$; dot excludes newlines unless enabled in the expression. Zero-width regex matches use the regex engine's UTF-16 position advancement, including EOF once. Zero matches are a successful no-op unless expectedReplacements disagrees. A timeout, stack limit, cancellation, invalid encoding or replacement count mismatch aborts preparation without changing the file. Original raw bytes are limited to 524288 bytes; encoded output is limited to 10485760 bytes (10 MiB); contentPattern plus writeText are limited to 524288 Unicode code points. Preserves encoding, BOM and original newline characters, with no automatic backup or transcoding. Rejects replacements that change the physical BOM, including exposing a leading U+FEFF. Publication guarantees depend on the file backend; inspect error state before retrying a failed write.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Replace File Text";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_replace_text";
    }

    public C22468(C12821 c12821) {
        this.f72769 = c12821;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f72767 == null) {
            this.f72767 = C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C1648.m5545("string", "Copy the existing file's version from mt_file_read_text or mt_file_stat. Empty and missing are invalid.")).add("encoding", C1648.m5545("string", "Copy the non-empty exact token from mt_file_read_text, including its BOM suffix.")).add("contentPattern", C1648.m5545("string", "Non-empty literal or regex to find in the original whole-file text.")).add("contentPatternType", C1648.m5539("Pattern syntax; recommended literal.", "literal", "regex")).add("contentCaseSensitive", C1648.m5545(ClassTransform.BOOLEAN, "Recommended true; false uses Unicode case-insensitive matching.")).add("writeText", C1648.m5545("string", "Replacement text. Empty deletes selected matches. No automatic newline.")).add("replacementMode", C1648.m5539("literal preserves writeText exactly. template requires regex and supports $0..$9, ${number}, ${name}, and escapes \\n, \\r, \\t, \\\\, \\$. Other escapes or unknown groups are invalid; unmatched optional groups expand to empty. Use ${12} for group 12; $12 means group 1 followed by 2. Recommended literal.", "literal", "template")).add("replaceMode", C1648.m5539("first selects the first non-overlapping match; all selects every non-overlapping match. Recommended all.", "first", ProviderConfigurationPermission.ALL_STR)), "integer", "Expected selected count after applying replaceMode, 0..9007199254740991; -1 disables the check. A mismatch rejects the entire operation before publication.", "expectedReplacements", "Arguments for mt_file_replace_text; all fields are required.");
        }
        return this.f72767;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f72768 == null) {
            this.f72768 = C1648.m5535("Result for mt_file_replace_text.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path.")).add("encoding", C1648.m5545("string", "Actual encoding token, including any physical BOM.")).add("size", C1648.m5545("integer", "Final raw file size in bytes.")).add("targetVersion", C1648.m5545("string", "Final raw-byte version; copy unchanged for subsequent operations.")).add("replacements", C1648.m5545("integer", "Number of original matches selected for replacement, even when writeText leaves their content unchanged.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation file.")).add("warnings", C1648.m5541("Metadata or publication guarantee limitations; empty when none.")), "Final file state after text replacement."), C3395.m10357("mt_file_replace_text"), C23879.m52593());
        }
        return this.f72768;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_replace_text", c3059);
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        int i;
        String str;
        C5807.m16297(jSONObject, new C8357(), "Invalid mt_file_replace_text argument", f72766);
        String m50406 = m50406(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String m504062 = m50406(jSONObject, "targetVersion");
        if (m504062.length() == 16) {
            while (i < m504062.length()) {
                char charAt = m504062.charAt(i);
                i = ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) ? i + 1 : 0;
            }
            String m504063 = m50406(jSONObject, "encoding");
            if (m504063.isEmpty()) {
                throw m50413(jSONObject.get("encoding"), "Copy the encoding returned by mt_file_read_text", "encoding");
            }
            C17095 m33925 = C14272.m33925(m504063);
            String m504064 = m50406(jSONObject, "contentPattern");
            if (m504064.isEmpty()) {
                throw m50413(jSONObject.get("contentPattern"), "contentPattern must not be empty", "contentPattern");
            }
            String m504065 = m50406(jSONObject, "writeText");
            if (m504064.codePointCount(0, m504064.length()) + m504065.codePointCount(0, m504065.length()) > 524288) {
                throw m50413(jSONObject.get("writeText"), "contentPattern plus writeText exceed 524288 Unicode code points", "writeText");
            }
            boolean equals = m50407(jSONObject, "contentPatternType", "literal", "regex").equals("regex");
            JSONValue jSONValue = jSONObject.get("contentCaseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m50413(jSONValue, "Invalid contentCaseSensitive", "contentCaseSensitive");
            }
            boolean asBoolean = jSONValue.asBoolean();
            boolean equals2 = m50407(jSONObject, "replacementMode", "literal", "template").equals("template");
            if (equals2 && !equals) {
                throw m50413(jSONObject.get("replacementMode"), "template requires contentPatternType=regex", "replacementMode");
            }
            boolean equals3 = m50407(jSONObject, "replaceMode", "first", ProviderConfigurationPermission.ALL_STR).equals("first");
            JSONValue jSONValue2 = jSONObject.get("expectedReplacements");
            if (jSONValue2 == null || !jSONValue2.isNumber()) {
                str = "expectedReplacements";
            } else {
                str = "expectedReplacements";
                try {
                    long longValueExact = new BigDecimal(jSONValue2.toString()).longValueExact();
                    if (longValueExact >= -1 && longValueExact <= 9007199254740991L) {
                        int i2 = equals ? 8 : 16;
                        if (!asBoolean) {
                            i2 |= 66;
                        }
                        try {
                            try {
                                C8629 c8629 = new C8629(C11459.m28259(i2, m504064), m504065, equals2);
                                try {
                                    C8629.m22387();
                                    String[] strArr = {m504063};
                                    int[] iArr = {0};
                                    C4745[] c4745Arr = {null};
                                    C7882 m31189 = this.f72769.m31189(m50406, m504062, new C15411(m50406, m504063, strArr, c8629, equals3, iArr, longValueExact, c4745Arr, m33925));
                                    String str2 = m31189.f24428;
                                    String str3 = m31189.f24425;
                                    C4745 c4745 = c4745Arr[0];
                                    if (c4745 != null) {
                                        C13211.m32048(c4745);
                                    }
                                    return new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("encoding", strArr[0]).add("size", m31189.f24426).add("targetVersion", str2).add("replacements", iArr[0]).add("changed", m31189.f24424).add("warnings", m31189.f24427), JSON.array().add(C23879.m52586("inspect", "Read text from the final file version.", str3, strArr[0], str2))));
                                } catch (C23445 e) {
                                    throw m50415(e, (String) null);
                                }
                            } catch (IllegalArgumentException e2) {
                                throw m50413(jSONObject.get("writeText"), e2.getMessage(), "writeText");
                            }
                        } catch (PatternSyntaxException e3) {
                            throw m50413(jSONObject.get("contentPattern"), "Invalid regular expression: " + e3.getDescription(), "contentPattern");
                        }
                    }
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            throw m50413(jSONValue2, "Expected -1 or a non-negative safe integer", str);
        }
        throw m50413(jSONObject.get("targetVersion"), "Copy an existing file's 16 lowercase hex targetVersion", "targetVersion");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m50410(String str, String str2, String str3) {
        return C3059.m9365(str, str2, "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m50415(C23445 c23445, String str) {
        int i = C21763.f69732[c23445.f75261.ordinal()];
        if (i == 1) {
            return C3059.m9365("FILE_TEXT_REPLACE_CANCELED", "Text replacement was canceled before publication.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i == 2) {
            return C3059.m9365("FILE_TEXT_REPLACE_FAILED", "Regex matching did not complete. Simplify the expression before retrying.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        return m50414(str, JSON.NULL);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m50414(String str, JSONValue jSONValue) {
        return C3059.m9365("FILE_TEXT_RESULT_TOO_LARGE", "The replacement result exceeds the 10485760-byte text limit.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("limit", 10485760).add("actual", jSONValue));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50412(String str) {
        try {
            C8629.m22387();
        } catch (C23445 e) {
            throw m50415(e, str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50406(JSONObject jSONObject, String str) {
        String concat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m50413(jSONValue, concat, str);
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50407(JSONObject jSONObject, String str, String str2, String str3) {
        String m50406 = m50406(jSONObject, str);
        if (m50406.equals(str2) || m50406.equals(str3)) {
            return m50406;
        }
        throw m50413(jSONObject.get(str), C19462.m44858("Expected ", str2, " or ", str3), str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m50413(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), JSON.object());
    }
}
