package l;

import bin.mt.json.JSON;

/* compiled from: W77C */
/* renamed from: l.ۤ֫ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9979 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f30091 = m25144("1F2003D5");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30092 = m25144("00F020E3");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30093 = m25144("00BF");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30094 = m25144("90");

    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C4334 m25143(l.C14852 r28, l.C15799 r29, l.C22241 r30, l.C7333 r31, l.C8039 r32) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9979.m25143(l.ܳ᩻ۜ, l.ܺ۟᩻, l.᩹ۧۜ, l.۟۟᩻, l.۠۟᩻):l.ۙ֫ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25142(C8039 c8039, long j, String str) {
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", JSON.array(), JSON.object().add("workspaceId", c8039.f24787).add("editSessionId", c8039.f24790).add("locator", c8039.f24791).add("patchedFileOffset", C4511.m13257(j)).add("byteOffset", j).add("expectedHex", c8039.f24792).add("actualHex", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25141(String str, int i, long j, String str2, RuntimeException runtimeException, String str3) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = runtimeException.getClass().getSimpleName();
        }
        String replace = message.replace(str3, "<path>");
        if (replace.length() > 512) {
            replace = replace.substring(0, 512);
        }
        return C3059.m9365("NATIVE_ASSEMBLY_FAILED", "Native instruction assembly failed.", "warning", JSON.array(), JSON.object().add("arch", str).add("bits", i).add("address", C4511.m13257(j)).add("instructionMode", str2).add("message", replace));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25140(int i, int i2, String str) {
        return C3059.m9365("NATIVE_PATCH_LENGTH_MISMATCH", "Assembled bytes do not fit the expected patch window.", "warning", JSON.array(), JSON.object().add("expectedBytes", i).add("assembledBytes", i2).add("paddingMode", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25144(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) | (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
