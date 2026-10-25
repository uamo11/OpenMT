package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: P6XC */
/* renamed from: l.ۖᩴۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2713 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f8467;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f8468;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f8469;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8439(int i) {
        return C18307.m42645(i, "patches[", "]");
    }

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Patch File Bytes";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_patch_bytes";
    }

    public C2713(C12821 c12821) {
        this.f8469 = c12821;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f8467 == null) {
            this.f8467 = C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Current 16-digit lowercase hex version token; missing is not accepted.")).add("patches", C7416.m19939("type", "array", "description", "Runtime accepts 1..200 non-overlapping items.").add("items", C18736.m43390(JSON.object().add("byteOffset", C1648.m5545("integer", "Zero-based byte offset in 0..9007199254740991.")).add("expectedHex", C1648.m5545("string", "Current non-empty bytes as even-length hexadecimal without separators.")), "string", "Equal-length replacement bytes as hexadecimal without separators.", "replacementHex", "One equal-length raw byte patch."))), "Arguments for mt_file_patch_bytes.");
        }
        return this.f8467;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f8468 == null) {
            this.f8468 = C1648.m5535("Result for mt_file_patch_bytes.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute target path.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether target bytes changed.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C1648.m5545("string", "One warning message."))).add("size", C1648.m5545("integer", "Final raw byte size.")).add("targetVersion", C1648.m5545("string", "Final whole-file version token of 16 lowercase hex digits.")), "integer", "Total requested patch bytes, including no-op replacements.", "bytesPatched", "Successful local byte patch result."), C3395.m10357("mt_file_patch_bytes"), C1648.m5538("Success and expected-byte mismatch return a read_bytes action.", C1648.m5533(m8442(), "mt_file_read_bytes", "inspect"), C1648.m5533(m8442(), "mt_file_read_bytes", "retry")));
        }
        return this.f8468;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_patch_bytes", c3059);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8440(l.C14937 r9, java.io.BufferedOutputStream r10, java.util.ArrayList r11) {
        /*
            l.C10891.m27198(r9, r11)     // Catch: l.C3059 -> L7
            l.C10891.m27197(r9, r10, r11)
            return
        L7:
            r10 = move-exception
            java.lang.String r0 = "FILE_PATCH_EXPECTED_MISMATCH"
            java.lang.String r1 = r10.f9610
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            bin.mt.json.JSONObject r0 = r10.f9609
            java.lang.String r1 = "byteOffset"
            bin.mt.json.JSONValue r0 = r0.get(r1)
            if (r0 == 0) goto L2c
            boolean r1 = r0.isNumber()
            if (r1 != 0) goto L23
            goto L2c
        L23:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L2c
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2c
            goto L2e
        L2c:
            r0 = 0
        L2e:
            r6 = r0
            java.util.Iterator r11 = r11.iterator()
        L33:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r11.next()
            l.֫ۡۜ r0 = (l.C1718) r0
            long r1 = r0.f5943
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L46
            goto L33
        L46:
            byte[] r11 = r0.f5945
            int r11 = r11.length
            r8 = r11
            goto L4d
        L4b:
            r11 = 1
            r8 = 1
        L4d:
            bin.mt.json.JSONArray r11 = bin.mt.json.JSON.array()
            l.ܶ᩵ܿ r0 = r9.f45531
            java.lang.String r4 = r0.mo23554()
            java.lang.String r5 = r9.f45533
            java.lang.String r2 = "retry"
            java.lang.String r3 = "Read the current bytes at the mismatched patch window before retrying."
            bin.mt.json.JSONObject r9 = m8438(r2, r3, r4, r5, r6, r8)
            bin.mt.json.JSONArray r9 = r11.add(r9)
            l.ۗۛ᩻ r9 = r10.m9370(r9)
            throw r9
        L6a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2713.m8440(l.ܶۖۜ, java.io.BufferedOutputStream, java.util.ArrayList):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8441(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        String m51498 = C23202.m51498(new StringBuilder(), m8439(i), ".", str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid patch hex argument", m51498, jSONValue, JSON.array().add("non-empty hexadecimal string"), m8443());
        }
        String asString = jSONValue.asString();
        if (asString.isEmpty()) {
            throw C3059.m9364("Patch hex must not be empty", m51498, jSONValue, JSON.array().add("1..4096 bytes"), m8443());
        }
        if (asString.length() > 8192) {
            throw C3059.m9364("Patch item exceeds the 4096-byte limit", m51498, JSON.value((asString.length() + 1) / 2), JSON.array().add("1..4096 bytes"), m8443());
        }
        try {
            return C13573.m32621(asString);
        } catch (IllegalArgumentException e) {
            throw C3059.m9365("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C7416.m19939("operation", "parse_patches", "backendReason", "invalid_hex").add("failedPatchIndex", i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        r9 = new java.lang.String[]{"byteOffset", "expectedHex", "replacementHex"};
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (r11 >= 3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r12 = r9[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        if (r10.contains(r12) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        throw l.C3059.m9364(l.C20094.m46315("Missing patch parameter: ", r12), l.C23202.m51498(new java.lang.StringBuilder(), m8439(r15), ".", r12), (bin.mt.json.JSONValue) null, bin.mt.json.JSON.array(), m8443());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
    
        r10 = l.C21474.m48626(r8, "byteOffset", 0, 9007199254740991L);
        r0 = m8441(r15, r8, "expectedHex");
        r12 = m8441(r15, r8, "replacementHex");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        if (r0.length != r12.length) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        if (r0.length > 4096) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        r7 = r7 + r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
    
        if (r7 > 65536) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
    
        r3.add(new l.C1718(r15, r10, l.C21474.m48627(l.C9045.m23341(new java.lang.StringBuilder(), m8439(r15), ".byteOffset"), r10, r0.length), r0, r12));
        r15 = r15 + 1;
        r0 = r23;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ea, code lost:
    
        throw l.C3059.m9364("Patch byte budget exceeds 65536 bytes", "patches", bin.mt.json.JSON.value(r7), bin.mt.json.JSON.array().add("1..65536 bytes"), m8443());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0215, code lost:
    
        throw l.C3059.m9364("Patch item exceeds the 4096-byte limit", l.C9045.m23341(new java.lang.StringBuilder(), m8439(r15), ".expectedHex"), bin.mt.json.JSON.value(r0.length), bin.mt.json.JSON.array().add("1..4096 bytes"), m8443());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023f, code lost:
    
        throw l.C3059.m9364("expectedHex and replacementHex must contain the same byte count", l.C9045.m23341(new java.lang.StringBuilder(), m8439(r15), ".replacementHex"), r8.get("replacementHex"), bin.mt.json.JSON.array().add("same byte count as expectedHex"), m8443());
     */
    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12936 mo3035(bin.mt.json.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2713.mo3035(bin.mt.json.JSONObject):l.۬ۛ᩻");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8442() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path.")).add("targetVersion", C1648.m5545("string", "Whole-file targetVersion.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m8438(String str, String str2, String str3, String str4, long j, int i) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m8443() {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "<copy current targetVersion>").add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "FF")));
    }
}
