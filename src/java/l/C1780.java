package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* compiled from: E76K */
/* renamed from: l.֫ۧۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1780 {
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017f, code lost:
    
        if ((r9 + r7) <= r11) goto L60;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C2923 m5932(l.C14852 r25, l.C15799 r26, l.C22241 r27, l.C7333 r28, l.C15093 r29) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1780.m5932(l.ܳ᩻ۜ, l.ܺ۟᩻, l.᩹ۧۜ, l.۟۟᩻, l.ܶ۟᩻):l.ۗ֫ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m5933(C15093 c15093, long j, byte[] bArr, byte[] bArr2) {
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedText.", "warning", JSON.array(), JSON.object().add("workspaceId", c15093.f46099).add("editSessionId", c15093.f46105).add("locator", c15093.f46098).add("patchedFileOffset", C4511.m13257(j)).add("byteOffset", j).add("paddingMode", c15093.f46106).add("expectedText", c15093.f46107).add("actualText", m5930(c15093, bArr2)).add("expectedHex", C4511.m13260(bArr)).add("actualHex", C4511.m13260(bArr2)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5930(C15093 c15093, byte[] bArr) {
        String str = c15093.f46106;
        if ("null_pad".equals(str)) {
            int i = 0;
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
            return m5931(bArr, i, false);
        }
        if ("space_pad".equals(str)) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 32) {
                length--;
            }
            return m5931(bArr, length, false);
        }
        return m5931(bArr, bArr.length, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5931(byte[] bArr, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            if (z && bArr[i2] == 0) {
                return "";
            }
        }
        try {
            CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)).toString();
        } catch (CharacterCodingException unused) {
            return "";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5934(C15093 c15093, int i) {
        if (i > 4096) {
            throw C3059.m9365("NATIVE_STRING_TOO_LARGE", "Native string patch window is too large.", "warning", JSON.array(), m5929(c15093).add("expectedTextByteCount", c15093.f46102.length).add("replacementTextByteCount", c15093.f46100.length).add("bytesPatched", i).add("limitBytes", 4096));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5929(C15093 c15093) {
        return JSON.object().add("workspaceId", c15093.f46099).add("editSessionId", c15093.f46105).add("locator", c15093.f46098).add("addressKind", c15093.f46103).add("address", c15093.f46101).add("paddingMode", c15093.f46106);
    }
}
