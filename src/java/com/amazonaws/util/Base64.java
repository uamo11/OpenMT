package com.amazonaws.util;

/* loaded from: classes.dex */
public enum Base64 {
    ;


    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Base64Codec f824 = new Base64Codec();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m744(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.m764(f824.m748(bArr));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m743(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : f824.m748(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m741(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        int m763 = CodecUtils.m763(str, bArr);
        f824.getClass();
        return Base64Codec.m746(m763, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m742(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64Codec base64Codec = f824;
        int length = bArr.length;
        base64Codec.getClass();
        return Base64Codec.m746(length, bArr);
    }
}
