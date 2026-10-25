package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: D6X1 */
/* renamed from: l.᩻ᩴۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23879 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f77209;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f77210;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f77211;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Edit File Text";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_edit_text";
    }

    public C23879(C12821 c12821) {
        this.f77211 = c12821;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f77209 == null) {
            this.f77209 = C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file.")).add("encoding", C1648.m5545("string", "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed.")).add("edits", C7416.m19939("type", "array", "description", "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points.").add("items", C18736.m43390(JSON.object().add("mode", C1648.m5539("write_target, replace_match, insert_before_match, or insert_after_match.", "write_target", "replace_match", "insert_before_match", "insert_after_match")).add("matchText", C1648.m5545("string", "Empty for write_target; otherwise exact non-empty text occurring once in the original file.")), "string", "Exact text to write; no newline is added. May be empty for write_target or replace_match.", "writeText", "One edit against the same original text."))), "Arguments for mt_file_edit_text.");
        }
        return this.f77209;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f77210 == null) {
            this.f77210 = C1648.m5535("Result for mt_file_edit_text.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path fixed for this operation.")).add("encoding", C1648.m5545("string", "Actual lowercase editor encoding token used for decode and encode.")).add("size", C1648.m5545("integer", "Final raw file size in bytes.")).add("targetVersion", C1648.m5545("string", "Final raw-byte version as 16 lowercase hex digits.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation state.")).add("warnings", C1648.m5541("Metadata or publication guarantee limitations; empty when none.")), "Final state after the complete text edit was published."), C3395.m10357("mt_file_edit_text"), m52593());
        }
        return this.f77210;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_edit_text", c3059);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52591(String str, String[] strArr, ArrayList arrayList, C4745[] c4745Arr, C14937 c14937, BufferedOutputStream bufferedOutputStream) {
        String str2;
        String m23341;
        String str3;
        String str4;
        boolean z = c14937.f45530;
        String str5 = c14937.f45533;
        AbstractC15440 abstractC15440 = c14937.f45531;
        if (z) {
            try {
                C20268 m32047 = C13211.m32047(str, m52592(c14937, 10485760));
                str2 = m32047.f65503;
                strArr[0] = m32047.f65502;
            } catch (CharacterCodingException unused) {
                String mo23554 = abstractC15440.mo23554();
                throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", JSON.array().add(C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, mo23554, "targetVersion", str5).add("byteOffset", 0).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Inspect the current raw bytes before choosing another text encoding.")), m52584(mo23554, "decode_failed"));
            } catch (C22384 unused2) {
                throw m52590("FILE_TEXT_ENCODING_MISMATCH", "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding.", abstractC15440.mo23554(), c14937.f45533, "bom_mismatch", "");
            }
        } else {
            strArr[0] = str;
            str2 = "";
        }
        try {
            try {
                C4745 m32046 = C13211.m32046(10485760, C16389.m38586(str2, arrayList), strArr[0]);
                c4745Arr[0] = m32046;
                bufferedOutputStream.write(m32046.f15051);
            } catch (CharacterCodingException unused3) {
                throw m52590("FILE_TEXT_ENCODE_FAILED", "The edited text contains characters that cannot be represented in the selected encoding.", abstractC15440.mo23554(), c14937.f45533, "unmappable_text", strArr[0]);
            } catch (C3334 e) {
                throw m52589("FILE_TEXT_RESULT_TOO_LARGE", "The encoded text exceeds the 10485760-byte result limit.", abstractC15440.mo23554(), "encoded_result", 10485760L, e.f10537, strArr[0], c14937.f45533);
            }
        } catch (C13526 e2) {
            String mo235542 = abstractC15440.mo23554();
            String str6 = strArr[0];
            int i = C14706.f44913[e2.f40342.ordinal()];
            int i2 = e2.f40343;
            int i3 = e2.f40344;
            if (i == 1) {
                m23341 = C9045.m23341(new StringBuilder(), m52587(i3, "matchText"), " was not found in the current text. Re-read and retry with current text.");
                str3 = "FILE_TEXT_MATCH_NOT_FOUND";
                str4 = "match_not_found";
            } else if (i == 2) {
                m23341 = C9045.m23341(new StringBuilder(), m52587(i3, "matchText"), " appears multiple times. Use longer surrounding context that appears once.");
                str3 = "FILE_TEXT_MATCH_AMBIGUOUS";
                str4 = "match_ambiguous";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(e2);
                }
                m23341 = C19373.m44634("edits[", i3, "] overlaps edits[", "]; matched ranges cannot overlap.", i2);
                str3 = "FILE_TEXT_MATCH_OVERLAP";
                str4 = "match_overlap";
            }
            throw C3059.m9365(str3, m23341, "warning", JSON.array().add(m52586("retry", "Re-read the current file from the beginning; continue pagination if needed.", mo235542, str6, str5)), m52584(mo235542, str4).add("failedEditIndex", i3).add("conflictingEditIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52592(C14937 c14937, int i) {
        long j = c14937.f45532;
        AbstractC15440 abstractC15440 = c14937.f45531;
        long j2 = i;
        if (j > j2) {
            throw m52589("FILE_TEXT_TARGET_TOO_LARGE", C18307.m42645(i, "The existing file exceeds the ", "-byte text edit limit."), abstractC15440.mo23554(), "target_too_large", j2, c14937.f45532, "", c14937.f45533);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j >= 0 ? (int) j : Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        InputStream m35392 = c14937.m35392();
        do {
            try {
                int read = m35392.read(bArr, 0, Math.min(8192, (i + 1) - byteArrayOutputStream.size()));
                if (read >= 0) {
                    if (read == 0) {
                        int read2 = m35392.read();
                        if (read2 >= 0) {
                            byteArrayOutputStream.write(read2);
                        }
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                m35392.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                if (m35392 != null) {
                    try {
                        m35392.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (byteArrayOutputStream.size() <= i);
        throw m52589("FILE_TEXT_TARGET_TOO_LARGE", "The existing file exceeds the " + i + "-byte text edit limit.", abstractC15440.mo23554(), "target_too_large", j2, byteArrayOutputStream.size(), "", c14937.f45533);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        if ("insert_after_match".equals(r4) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0205, code lost:
    
        throw l.C3059.m9364("Invalid text edit mode", m52587(r14, "mode"), bin.mt.json.JSON.value(r4), bin.mt.json.JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r8.isEmpty() != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        if (r6.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0285, code lost:
    
        throw l.C3059.m9364(l.C16014.m37867(r4, " requires non-empty writeText"), m52587(r14, "writeText"), bin.mt.json.JSON.value(r6), bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x029c, code lost:
    
        throw l.C3059.m9364(l.C16014.m37867(r4, " requires non-empty matchText"), m52587(r14, "matchText"), bin.mt.json.JSON.value(r8), bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02af, code lost:
    
        throw l.C3059.m9364("Invalid edits item", l.C18307.m42645(r14, "edits[", "]"), r6, bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        throw l.C3059.m9364("Unknown edit item argument", m52587(r14, r4), r6.get(r4), bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r26 = r4;
        r4 = new java.lang.String[]{"mode", "matchText", "writeText"};
        r23 = r11;
        r27 = r12;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0159, code lost:
    
        if (r11 >= 3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0161, code lost:
    
        if (r8.contains(r12) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0163, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0183, code lost:
    
        throw l.C3059.m9364("Missing parameter: " + m52587(r14, r12), m52587(r14, r12), (bin.mt.json.JSONValue) null, bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0184, code lost:
    
        r4 = m52588(r6, "mode", r10, m52587(r14, "mode"));
        r8 = m52588(r6, "matchText", r10, m52587(r14, "matchText"));
        r6 = m52588(r6, "writeText", r10, m52587(r14, "writeText"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        if ("write_target".equals(r4) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        if (r8.isEmpty() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0216, code lost:
    
        if ("write_target".equals(r4) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0218, code lost:
    
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021c, code lost:
    
        r12 = (r27 + r8.codePointCount(0, r8.length())) + r6.codePointCount(0, r6.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0237, code lost:
    
        if (r12 > 524288) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x026e, code lost:
    
        throw l.C3059.m9364("All matchText and writeText values may contain at most 524288 Unicode code points in total", r26, bin.mt.json.JSON.value(r12), bin.mt.json.JSON.array("0..524288"), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021a, code lost:
    
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        throw l.C3059.m9364("write_target requires empty matchText", m52587(r14, "matchText"), bin.mt.json.JSON.value(r8), bin.mt.json.JSON.array(""), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c6, code lost:
    
        if ("replace_match".equals(r4) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cc, code lost:
    
        if (r8.isEmpty() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e1, code lost:
    
        throw l.C3059.m9364("replace_match requires non-empty matchText", m52587(r14, "matchText"), bin.mt.json.JSON.value(r8), bin.mt.json.JSON.array(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
    
        if ("insert_before_match".equals(r4) != false) goto L84;
     */
    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12936 mo3035(bin.mt.json.JSONObject r30) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23879.mo3035(bin.mt.json.JSONObject):l.۬ۛ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52588(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid string argument", str2, jSONValue, JSON.array(), jSONObject2);
        }
        return jSONValue.asString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m52590(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONArray array = "missing".equals(str4) ? JSON.array() : JSON.array().add(m52586("retry", "Re-read the current file from the beginning; continue pagination if needed.", str3, str6, str4));
        JSONObject m52584 = m52584(str3, str5);
        JSONValue jSONValue = JSON.NULL;
        return C3059.m9365(str, str2, "warning", array, m52584.add("limit", jSONValue).add("actual", jSONValue));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m52589(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        JSONObject add = m52584(str3, str4).add("limit", j).add("actual", j2 < 0 ? JSON.NULL : JSON.value(j2));
        JSONArray array = (str6 == null || str6.isEmpty() || "missing".equals(str6)) ? JSON.array() : JSON.array().add(m52586("inspect", "Read the file in pages.", str3, str5, str6));
        if ("FILE_TEXT_RESULT_TOO_LARGE".equals(str)) {
            return C3059.m9365(str, str2, "warning", array, add);
        }
        return C3059.m9369(str, str2, "fatal", array, add);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52584(String str, String str2) {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "edit_text").add("backendReason", str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52586(String str, String str2, String str3, String str4, String str5) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_file_read_text", str, str2);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m52593() {
        JSONObject m43390 = C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path.")).add("encoding", C1648.m5545("string", "Exact token for verification or empty string to auto-detect.")).add("targetVersion", C1648.m5545("string", "Exact current version bound to this read.")).add("limit", C1648.m5545("integer", "Logical line limit.")).add("maxChars", C1648.m5545("integer", "Unicode code-point limit.")).add("startLine", C1648.m5545("integer", "Zero-based line.")), "integer", "Zero-based column.", "startColumn", "Arguments for mt_file_read_text.");
        return C1648.m5538("Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure.", C1648.m5533(m43390, "mt_file_read_text", "inspect"), C1648.m5533(m43390, "mt_file_read_text", "retry"), C1648.m5533(C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path.")).add("targetVersion", C1648.m5545("string", "Exact current version bound to this read.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset.")), "integer", "Maximum raw bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52587(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("edits[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m52594() {
        return m52585("file.txt", "<copy from mt_file_read_text>", "utf-8");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52585(String str, String str2, String str3) {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "targetVersion", str2).add("encoding", str3).add("edits", JSON.array().add(C7416.m19939("mode", "replace_match", "matchText", "old text").add("writeText", "new text")));
    }
}
