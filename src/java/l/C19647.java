package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: N6Y2 */
/* renamed from: l.᩵ᩴۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19647 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f63393;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f63394;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f63395;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Read one raw byte page from a regular local file. First call: targetVersion=\"\", byteOffset=0, maxBytes=256; maximum 65536 bytes per page. Returns uppercase hex and a whole-file targetVersion. Copy that version unchanged into later pages to avoid combining different file versions. Paths may be absolute or relative to Home. Large files are supported.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Read File Bytes";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_read_bytes";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45157(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid string argument", str, jSONValue, JSON.array().add("string"), JSON.object().add(str, "targetVersion".equals(str) ? "" : "file.bin"));
        }
        return jSONValue.asString();
    }

    public C19647(C17760 c17760) {
        this.f63395 = c17760;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f63393 == null) {
            this.f63393 = m45161();
        }
        return this.f63393;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f63394 == null) {
            this.f63394 = C1648.m5535("Result for mt_file_read_bytes.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path fixed for this call.")).add("hex", C1648.m5545("string", "Returned raw bytes as uppercase hexadecimal without separators.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset of the first returned byte.")).add("nextByteOffset", C1648.m5545("integer", "Byte offset immediately after this page.")).add("totalBytes", C1648.m5545("integer", "Total file size observed by the complete streaming scan.")).add("hasMore", C1648.m5545(ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.")), "string", "Whole-file content version as 16 lowercase hex digits.", "targetVersion", "One raw byte page bound to a whole-file version."), C3395.m10357("mt_file_read_bytes"), C1648.m5538("Contains one directly executable continuation when hasMore=true; a version mismatch error contains one restart action.", C1648.m5533(m45161(), "mt_file_read_bytes", "continue"), C1648.m5533(m45161(), "mt_file_read_bytes", "retry")));
        }
        return this.f63394;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_read_bytes", c3059);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45160(C12619 c12619, String str) {
        int i = C18941.f59741[c12619.m30885().ordinal()];
        C17760 c17760 = this.f63395;
        if (i == 2) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be read as raw file bytes.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be read by the generic byte tool.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be read as file bytes.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m45158(int i, String str, String str2, String str3, String str4) {
        return C3059.m9365("FILE_TARGET_VERSION_MISMATCH", "The file targetVersion no longer matches the current content.", "warning", JSON.array().add(m45156("retry", "Discard earlier pages and restart at byteOffset 0 using the current file version.", str, str3, 0L, i)), C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str4).add("operation", "read").add("backendReason", "target_version_mismatch").add("expectedTargetVersion", str2).add("actualTargetVersion", str3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m45159(long j, long j2, String str, String str2) {
        return C3059.m9365("FILE_OFFSET_OUT_OF_RANGE", "Byte offset is beyond the end of the file.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "policyRevision", str2).add("operation", "read").add("backendReason", "offset_after_end").add("byteOffset", j).add("totalBytes", j2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m45156(String str, String str2, String str3, String str4, long j, int i) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m45161() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Pass \"\" (empty string) on the first read; later pass the previous result unchanged.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset in 0..9007199254740991; pass 0 by default.")), "integer", "Page size from 1 through 65536; pass 256 by default.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        String str;
        C5807.m16297(jSONObject, new C4124(), "Invalid file byte read argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "byteOffset", "maxBytes");
        String m45157 = m45157(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String m451572 = m45157(jSONObject, "targetVersion");
        long m48626 = C21474.m48626(jSONObject, "byteOffset", 0L, 9007199254740991L);
        int m486262 = (int) C21474.m48626(jSONObject, "maxBytes", 1L, 65536L);
        C17760 c17760 = this.f63395;
        C7383 m41607 = c17760.m41607();
        String m41599 = C17760.m41599(m45157, m41607, MotionUtils.EASING_TYPE_PATH);
        String str2 = m41607.f22729;
        C10000 m41608 = c17760.m41608(m41599);
        try {
            C12619 m41613 = c17760.m41613(m41599);
            m45160(m41613, m41599);
            try {
                C16534 m41948 = C17946.m41948(m41613.m30882(), m48626, m486262);
                long j = m41948.f50810;
                long j2 = m41948.f50811;
                String str3 = m41948.f50812;
                C12619 m416132 = c17760.m41613(m41599);
                if (m416132.m30885() != EnumC3447.REGULAR || ((m41613.m30884() >= 0 && m41613.m30884() != j2) || (m416132.m30884() >= 0 && m416132.m30884() != j2))) {
                    throw C3059.m9365("FILE_CHANGED_DURING_READ", "The file changed while its bytes were being read.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, m41599, "policyRevision", str2).add("operation", "read").add("backendReason", "metadata_changed"));
                }
                if (!m451572.isEmpty() && !m451572.equals(str3)) {
                    throw m45158(m486262, m41599, m451572, str3, str2);
                }
                long j3 = m41948.f50811;
                if (m48626 > j3) {
                    throw m45159(m48626, j3, m41599, m41607.f22729);
                }
                JSONArray array = JSON.array();
                long j4 = m41948.f50810;
                if (j4 < j2) {
                    str = str3;
                    array.add(m45156("continue", "Continue reading the next byte page from the same file version.", m41599, m41948.f50812, j4, m486262));
                } else {
                    str = str3;
                }
                C12936 c12936 = new C12936(C19993.m46095(JSON.object().add(MotionUtils.EASING_TYPE_PATH, m41599).add("hex", C13573.m32618(m41948.f50809)).add("byteOffset", m41948.f50808).add("nextByteOffset", j).add("totalBytes", j2).add("hasMore", j < j2).add("targetVersion", str), array));
                m41608.close();
                return c12936;
            } catch (IOException e) {
                throw C17760.m41601(m41599, e);
            }
        } finally {
        }
    }
}
