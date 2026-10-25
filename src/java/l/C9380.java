package l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* compiled from: M7AP */
/* renamed from: l.ۢۚۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9380 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f28494 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
    
        r3 = r7.f20231;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8236 m24219(l.C15996 r7) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9380.m24219(l.ܺܳܳ):l.۠ܳܳ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m24211(C23490 c23490, C11273 c11273) {
        int i;
        ?? r2;
        HashMap hashMap = new HashMap();
        String str = c23490.f75423;
        hashMap.put(MotionUtils.EASING_TYPE_PATH, str);
        InterfaceC17889 interfaceC17889 = c23490.f75422;
        hashMap.put("name", interfaceC17889.getName());
        hashMap.put("lineBreak", c11273.f33776);
        C23077 c23077 = c11273.f33778;
        String str2 = "?";
        if (c23077 != null) {
            if (c23077.m51241()) {
                str2 = "AXML";
            } else if (c23077.m51240()) {
                str2 = "ABX";
            } else if (c23077.m51242()) {
                str2 = "Class";
            } else {
                int i2 = c23077.f74223;
                if (i2 >= 0 && i2 < C14776.f45125) {
                    str2 = C14776.m35153(i2);
                }
            }
        }
        hashMap.put("textFormatName", str2);
        String str3 = "unknown";
        if (c23077 != null) {
            if (c23077.f74226 == 0) {
                str3 = TextBundle.TEXT_ENTRY;
            } else if (c23077.m51241()) {
                str3 = "axml";
            } else if (c23077.m51240()) {
                str3 = "abx";
            } else if (c23077.m51242()) {
                str3 = Name.LABEL;
            }
        }
        hashMap.put("textFormatType", str3);
        if (c23077 == null || c23077.f74226 != 0 || (i = c23077.f74223) < 0 || i >= C14776.f45125) {
            i = -1;
        }
        hashMap.put("charsetIndex", Integer.valueOf(i));
        if (c23077 == null || c23077.f74226 != 0) {
            r2 = Collections.EMPTY_LIST;
        } else {
            r2 = new ArrayList(C14776.f45125);
            for (int i3 = 0; i3 < C14776.f45125; i3++) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("index", Integer.valueOf(i3));
                hashMap2.put("name", C14776.m35153(i3));
                r2.add(hashMap2);
            }
        }
        hashMap.put("availableCharsets", r2);
        C10130 c10130 = new C10130();
        c10130.writeInt(1297373268);
        c10130.writeInt(1);
        c10130.m25439(str);
        c23077.m51239(c10130);
        byte[] m25427 = c10130.m25427();
        hashMap.put("parametersToken", Base64.encodeToString(m25427, 11) + "." + Base64.encodeToString(m24217(m25427), 11));
        hashMap.put("size", Long.valueOf(interfaceC17889.getSize()));
        hashMap.put("time", C17283.m40576(interfaceC17889.getTime()));
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m24212(HashMap hashMap, CharSequence charSequence) {
        byte[] bytes = C6411.m17735((Map) hashMap).toString().getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = C3200.m9831(bytes.length, "\n", new StringBuilder("MTTEXTREAD/1\n")).getBytes(StandardCharsets.US_ASCII);
        int length = bytes2.length + bytes.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        System.arraycopy(bytes, 0, bArr, bytes2.length, bytes.length);
        return AbstractC4708.m13783(EnumC1180.OK, "application/vnd.mt.text-file+raw; charset=UTF-8", new C14317(bArr, charSequence), length + C5773.m16233(charSequence));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23490 m24214(String str, boolean z) {
        String m43784 = C18965.m43784(str);
        C9555 m18837 = C6970.m18837(m43784);
        if (m18837 == null || !m18837.mo24433().mo23120()) {
            return C23490.m51941(m43784, C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f120822, new Object[0])));
        }
        if (m18837.isDirectory()) {
            return C23490.m51941(m43784, C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120828, new Object[0])));
        }
        if (z && m18837.getSize() > 5242880) {
            return C23490.m51941(m43784, C2884.m8818(EnumC1180.PAYLOAD_TOO_LARGE, C4925.m14306(R.string.MT_Protector_res_0x7f12085e, new Object[0])));
        }
        return C23490.m51942(m43784, m18837);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24215(C11273 c11273) {
        ArrayList arrayList = c11273.f33777;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC15440) it.next()).mo23552();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6557 m24218(C15996 c15996) {
        String str;
        C6557 c6557 = new C6557();
        c6557.f20235 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        if (c15996.m37808()) {
            str = c15996.m37809();
        } else {
            if (C17140.m40235(c15996)) {
                throw new IllegalArgumentException("Transfer-Encoding is not supported");
            }
            str = C17140.m40232(c15996, C17140.m40236(c15996)).f54518;
        }
        c6557.f20233 = str;
        c6557.f20234 = C17140.m40234(c15996, "lineBreak");
        c6557.f20236 = C17140.m40231(c15996, "X-MT-Text-Parameters-Token");
        String m40234 = C17140.m40234(c15996, "charsetIndex");
        if (TextUtils.isEmpty(m40234)) {
            return c6557;
        }
        c6557.f20232 = true;
        try {
            c6557.f20231 = Integer.parseInt(m40234);
            return c6557;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("charsetIndex is invalid", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20669 m24213(String str) {
        int indexOf = str == null ? -1 : str.indexOf(46);
        if (indexOf <= 0 || indexOf != str.lastIndexOf(46) || indexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid token");
        }
        byte[] decode = Base64.decode(str.substring(0, indexOf), 11);
        if (!MessageDigest.isEqual(m24217(decode), Base64.decode(str.substring(indexOf + 1), 11))) {
            throw new IllegalArgumentException("Invalid token signature");
        }
        C12951 m31485 = C12951.m31485(decode);
        if (m31485.readInt() != 1297373268 || m31485.readInt() != 1) {
            throw new IllegalArgumentException("Invalid token version");
        }
        String m31506 = m31485.m31506();
        C23077 c23077 = new C23077(m31485);
        if (m31485.available() != 0) {
            throw new IllegalArgumentException("Unexpected token tail");
        }
        return new C20669(m31506, c23077);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24216() {
        synchronized (f28494) {
            SharedPreferences sharedPreferences = C4925.m14335().getSharedPreferences("remote_text", 0);
            String string = sharedPreferences.getString("parameters_hmac_key", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] decode = Base64.decode(string, 11);
                    if (decode.length == 32) {
                        return decode;
                    }
                } catch (RuntimeException unused) {
                }
            }
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            sharedPreferences.edit().putString("parameters_hmac_key", Base64.encodeToString(bArr, 11)).commit();
            return bArr;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24217(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(m24216(), "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
