package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: R811 */
/* renamed from: l.ۨܺ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11814 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28880(String str, String str2, HashMap hashMap) {
        String str3;
        String str4;
        String str5;
        String str6;
        Iterator it;
        String str7 = "=";
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String str8 = (currentTimeMillis - 60) + l.b + (currentTimeMillis - (-3540));
            Mac mac = Mac.getInstance("HmacSHA1");
            Charset charset = StandardCharsets.UTF_8;
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            String m28881 = m28881(mac.doFinal(str8.getBytes(charset)));
            if (hashMap.isEmpty()) {
                str3 = "";
                str4 = str3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = hashMap.keySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((String) it2.next()).toLowerCase());
                }
                Collections.sort(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str9 = (String) it3.next();
                    Iterator it4 = hashMap.keySet().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            str5 = str9;
                            break;
                        }
                        str5 = (String) it4.next();
                        if (str5.toLowerCase().equals(str9)) {
                            break;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str9);
                    sb.append(str7);
                    String str10 = (String) hashMap.get(str5);
                    try {
                        str6 = str7;
                        it = it3;
                        try {
                            str10 = C12789.encode(str10, a.D).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20").replace("*", "%2A").replace("%7E", "~");
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        str6 = str7;
                        it = it3;
                    }
                    sb.append(str10);
                    arrayList2.add(sb.toString());
                    it3 = it;
                    str7 = str6;
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it5.next());
                        if (!it5.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) l.b);
                    }
                }
                str3 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it6.next());
                        if (!it6.hasNext()) {
                            break;
                        }
                        sb3.append((CharSequence) a.p);
                    }
                }
                str4 = sb3.toString();
            }
            String str11 = "GET".toLowerCase() + "\n/\n\n" + str4 + "\n";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("sha1\n");
            sb4.append(str8);
            sb4.append("\n");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Charset charset2 = StandardCharsets.UTF_8;
            sb4.append(m28881(messageDigest.digest(str11.getBytes(charset2))));
            sb4.append("\n");
            String sb5 = sb4.toString();
            Mac mac2 = Mac.getInstance("HmacSHA1");
            mac2.init(new SecretKeySpec(m28881.getBytes(charset2), "HmacSHA1"));
            return "q-sign-algorithm=sha1&q-ak=" + str + "&q-sign-time=" + str8 + "&q-key-time=" + str8 + "&q-header-list=" + str3 + "&q-url-param-list=&q-signature=" + m28881(mac2.doFinal(sb5.getBytes(charset2)));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28881(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
