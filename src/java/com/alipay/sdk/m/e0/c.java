package com.alipay.sdk.m.e0;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import l.C5368;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static String a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String a() {
        String str = new String();
        for (int i = 0; i < a.length() - 1; i += 4) {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(a.charAt(i));
            str = m15339.toString();
        }
        return str;
    }

    public static String a(String str, String str2) {
        try {
            return a(a(b(str), str2.getBytes(), b()));
        } catch (Exception unused) {
            return null;
        }
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

    public static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] a(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpec).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] salt = pBEKeySpec.getSalt();
        ByteBuffer allocate = ByteBuffer.allocate(cipher.getOutputSize(bArr.length) + salt.length);
        allocate.put(salt);
        cipher.doFinal(ByteBuffer.wrap(bArr), allocate);
        return allocate.array();
    }

    public static String b(String str, String str2) {
        try {
            byte[] b = b(b(str), a(str2), b());
            if (b == null) {
                throw new Exception();
            }
            String str3 = new String(b);
            if (com.alipay.sdk.m.d0.a.c(str3)) {
                return str3;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static PBEKeySpec b(String str) {
        Class<?> cls = Class.forName(new String(a.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object newInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(newInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static byte[] b() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return a.a(sb.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpec.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr, 16, bArr.length - 16);
    }
}
