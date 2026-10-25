package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: T6Y7 */
/* renamed from: l.֨ᩴۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1301 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f4631;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f4632;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f4633;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Read one strict text page from a regular local file while preserving LF, CRLF, and CR exactly. On the first call pass encoding=\"\", targetVersion=\"\", startLine=0, startColumn=0, limit=500, and maxChars=49152. Positions and maxChars count Unicode code points. maxChars must be 2..131072 so a CRLF pair is never split; limit is 1..2000 logical lines touched by the page. An empty encoding selects automatic detection. A non-empty encoding reloads with that exact lowercase token and does not transcode. Copy the returned encoding and targetVersion unchanged into continuation calls.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Read File Text";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_read_text";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4482(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m4483(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    public C1301(C17760 c17760) {
        this.f4633 = c17760;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f4631 == null) {
            this.f4631 = m4489();
        }
        return this.f4631;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f4632 == null) {
            this.f4632 = C1648.m5535("Result for mt_file_read_text.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path fixed for this call.")).add(TextBundle.TEXT_ENTRY, C1648.m5545("string", "Strictly decoded text with original LF, CRLF, and CR preserved.")).add("encoding", C1648.m5545("string", "Actual lowercase editor encoding token; physical BOM is included in the token.")).add("targetVersion", C1648.m5545("string", "Whole-file raw-byte version as 16 lowercase hex digits.")).add("startLine", C1648.m5545("integer", "Zero-based logical line requested for this page.")).add("startColumn", C1648.m5545("integer", "Zero-based Unicode code-point column requested for this page.")).add("nextLine", C1648.m5545("integer", "Logical line at which a continuation should start.")).add("nextColumn", C1648.m5545("integer", "Unicode code-point column at which a continuation should start.")).add("returnedLineCount", C1648.m5545("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C1648.m5545("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether decoded text remains at nextLine and nextColumn.", "hasMore", "One original-newline text page bound to a whole-file version."), C3395.m10357("mt_file_read_text"), C1648.m5538("Contains one directly executable continuation when hasMore=true; a version mismatch contains one restart action.", C1648.m5533(m4489(), "mt_file_read_text", "continue"), C1648.m5533(m4489(), "mt_file_read_text", "retry")));
        }
        return this.f4632;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_read_text", c3059);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4487(C12619 c12619, String str) {
        int i = C5535.f17130[c12619.m30885().ordinal()];
        C17760 c17760 = this.f4633;
        if (i == 2) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be read as text.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic text tool.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as text.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4488(C12619 c12619, C12619 c126192, long j) {
        if (c126192.m30885() != EnumC3447.REGULAR) {
            return true;
        }
        if (c12619.m30884() < 0 || c12619.m30884() == j) {
            return c126192.m30884() >= 0 && c126192.m30884() != j;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4484(String str, long j, long j2, C7567 c7567) {
        return C3059.m9365("FILE_OFFSET_OUT_OF_RANGE", "The requested text line and column are outside the file.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "read_text").add("backendReason", "text_position_out_of_range").add("startLine", j).add("startColumn", j2).add("finalLine", c7567.f23370).add("finalColumn", c7567.f23367));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4485(String str, String str2) {
        return C3059.m9365("FILE_CHANGED_DURING_READ", "The file changed while its text was being read.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read_text").add("backendReason", "metadata_changed"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4486(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return C3059.m9365("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m4481("retry", "Discard earlier pages and restart from the current file version.", str, str4, str3, i, i2, 0L, 0L)), C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str5).add("operation", "read_text").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m4481(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", i).add("maxChars", i2).add("startLine", j).add("startColumn", j2), "mt_file_read_text", str, str2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m4489() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("encoding", C1648.m5545("string", "Pass \"\" (empty string) for editor-compatible automatic detection, or an exact lowercase token returned by this tool.")).add("targetVersion", C1648.m5545("string", "Pass \"\" (empty string) on the first read; later copy the previous result unchanged.")).add("limit", C1648.m5545("integer", "Maximum logical lines touched, 1..2000; pass 500 by default.")).add("maxChars", C1648.m5545("integer", "Maximum Unicode code points, 2..131072; pass 49152 by default. Minimum 2 keeps CRLF indivisible.")).add("startLine", C1648.m5545("integer", "Zero-based logical line in 0..9007199254740991; pass 0 initially.")), "integer", "Zero-based Unicode code-point column in 0..9007199254740991; pass 0 initially.", "startColumn", "Arguments for mt_file_read_text.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r28v0, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v8 */
    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12936 mo3035(bin.mt.json.JSONObject r28) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1301.mo3035(bin.mt.json.JSONObject):l.۬ۛ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m4483(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), C7416.m19939(MotionUtils.EASING_TYPE_PATH, "file.txt", "encoding", "").add("targetVersion", "").add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0));
    }
}
