package com.alipay.sdk.m.e0;

import java.security.MessageDigest;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static String a(String str) {
        try {
            if (com.alipay.sdk.m.d0.a.a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(com.alipay.sdk.m.w.a.D));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
