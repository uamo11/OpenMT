package l;

import android.app.Application;
import android.content.res.Configuration;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: F7BL */
/* renamed from: l.ܺۚۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15728 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f48506 = Pattern.compile("(?is)(<title\\b[^>]*>).*?(</title>)");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f48505 = Pattern.compile("(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"'])(.*?)(\\2[^>]*>)");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m37118(C15996 c15996) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        String str;
        byte[] bArr2;
        String str2;
        EnumC4003 m37807 = c15996.m37807();
        if (EnumC4003.GET.equals(m37807) || EnumC4003.HEAD.equals(m37807)) {
            String m37804 = c15996.m37804();
            if (TextUtils.isEmpty(m37804) || "/".equals(m37804)) {
                m37804 = "index.html";
            }
            if (m37804.startsWith("/")) {
                m37804 = m37804.substring(1);
            }
            if (!TextUtils.isEmpty(m37804)) {
                if (!m37804.startsWith("/") && !m37804.contains("\\") && m37804.indexOf(0) < 0) {
                    for (String str3 : m37804.split("/")) {
                        if (!str3.isEmpty() && !".".equals(str3) && !"..".equals(str3)) {
                        }
                    }
                }
                m37804 = null;
                break;
            } else {
                m37804 = "index.html";
            }
            if (m37804 != null) {
                C8674 m37116 = m37116(m37804, false);
                if (m37116 == null && !"index.html".equals(m37804)) {
                    m37116 = m37116("index.html", true);
                }
                if (m37116 != null) {
                    if (EnumC4003.HEAD.equals(m37807)) {
                        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        bArr = m37116.f26450;
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                    }
                    EnumC1180 enumC1180 = EnumC1180.OK;
                    str = m37116.f26452;
                    bArr2 = m37116.f26450;
                    C8236 m13783 = AbstractC4708.m13783(enumC1180, str, byteArrayInputStream, bArr2.length);
                    m13783.m21806(m37807);
                    str2 = m37116.f26451;
                    m13783.m21805("Cache-Control", str2);
                    m13783.m21805("Referrer-Policy", "no-referrer");
                    return m13783;
                }
                return AbstractC4708.m13784(EnumC1180.NOT_FOUND, "text/plain", "");
            }
            return AbstractC4708.m13784(EnumC1180.NOT_FOUND, "text/plain", "");
        }
        return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8674 m37116(String str, boolean z) {
        String str2;
        try {
            InputStream open = C4925.m14325().open("web-manager/".concat(str));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!z && !"index.html".equals(str) && str.startsWith("assets/")) {
                    String substring = str.substring(str.lastIndexOf(47) + 1);
                    int lastIndexOf = substring.lastIndexOf(46);
                    int lastIndexOf2 = substring.lastIndexOf(45, lastIndexOf);
                    if (lastIndexOf > 0 && lastIndexOf2 >= 0 && lastIndexOf - lastIndexOf2 > 8) {
                        str2 = "public, max-age=31536000, immutable";
                        if (!z || "index.html".equals(str)) {
                            Charset charset = StandardCharsets.UTF_8;
                            byteArray = m37115(new String(byteArray, charset)).getBytes(charset);
                        }
                        C8674 c8674 = new C8674(m37117(str), byteArray, str2);
                        open.close();
                        return c8674;
                    }
                }
                str2 = "no-cache";
                if (!z) {
                }
                Charset charset2 = StandardCharsets.UTF_8;
                byteArray = m37115(new String(byteArray, charset2)).getBytes(charset2);
                C8674 c86742 = new C8674(m37117(str), byteArray, str2);
                open.close();
                return c86742;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37115(String str) {
        Locale m24394 = C9523.m24394(C4925.m14335());
        String m7583 = C2324.m7583(m24394);
        Application m14335 = C4925.m14335();
        Configuration configuration = new Configuration(m14335.getResources().getConfiguration());
        configuration.setLocale(m24394);
        configuration.setLayoutDirection(m24394);
        String m46315 = C20094.m46315(m7583.startsWith("zh-") ? "MT" : "MT ", m14335.createConfigurationContext(configuration).getString(R.string.MT_Protector_res_0x7f12084e));
        Matcher matcher = f48506.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + matcher.group(1) + m46315.replace(a.p, "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") + matcher.group(2) + str.substring(matcher.end());
        }
        if ("zh-rCN".equals(m7583)) {
            m7583 = "zh-CN";
        } else if ("zh-rTW".equals(m7583)) {
            m7583 = "zh-TW";
        } else if ("in".equals(m7583)) {
            m7583 = "id";
        }
        Matcher matcher2 = f48505.matcher(str);
        if (!matcher2.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, matcher2.start()));
        sb.append(matcher2.group(1));
        sb.append(matcher2.group(2));
        sb.append(m7583);
        sb.append(matcher2.group(4));
        return C20087.m46305(matcher2.end(), str, sb);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m37117(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.endsWith(".html") ? "text/html; charset=UTF-8" : (lowerCase.endsWith(".js") || lowerCase.endsWith(".mjs")) ? "application/javascript; charset=UTF-8" : lowerCase.endsWith(".css") ? "text/css; charset=UTF-8" : (lowerCase.endsWith(".json") || lowerCase.endsWith(".map")) ? "application/json; charset=UTF-8" : lowerCase.endsWith(".svg") ? "image/svg+xml" : lowerCase.endsWith(".png") ? "image/png" : (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) ? "image/jpeg" : lowerCase.endsWith(".webp") ? "image/webp" : lowerCase.endsWith(".ico") ? "image/x-icon" : lowerCase.endsWith(".woff") ? "font/woff" : lowerCase.endsWith(".woff2") ? "font/woff2" : lowerCase.endsWith(".txt") ? "text/plain; charset=UTF-8" : "application/octet-stream";
    }
}
