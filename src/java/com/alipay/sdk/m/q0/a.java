package com.alipay.sdk.m.q0;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static String a(String str) {
        byte[] bArr;
        try {
            bArr = a(a(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            return a(bArr);
        }
        return null;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    public static String c(String str) {
        try {
            return new String(b(a(), b(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] a() {
        return e.a(new byte[]{PublicSuffixDatabase.EXCEPTION_MARKER, 83, -50, -89, -84, -114, UTF8.S_P4A, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    public static byte[] b() {
        try {
            byte[] a = b.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes(com.alipay.sdk.m.w.a.D), 2);
            if (a != null) {
                return e.a(a);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            a(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public static void a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
    }
}
