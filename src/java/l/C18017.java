package l;

import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: P3YK */
/* renamed from: l.ᩳۧᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18017 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] f56188;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] f56189;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f56190;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String f56191;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42071(String str, String str2, String str3) {
        String str4;
        String str5 = str2;
        if (str5.equals("zh")) {
            str4 = str3;
            str5 = "zh-CHS";
        } else {
            str4 = str3;
        }
        if (str4.equals("zh")) {
            str4 = "zh-CHS";
        }
        if (f56190 == null) {
            String headerField = new C14488("https://fanyi.youdao.com/", false).m34583().getHeaderField("Set-Cookie");
            if (headerField == null) {
                throw new IOException("Can not get cookie");
            }
            int indexOf = headerField.indexOf(59);
            if (indexOf != -1) {
                headerField = headerField.substring(0, indexOf);
            }
            f56190 = headerField;
            long currentTimeMillis = System.currentTimeMillis();
            C14488 c14488 = new C14488("https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign=" + C14460.m34524("client=fanyideskweb&mysticTime=" + currentTimeMillis + "&product=webfanyi&key=yU5nT5dK3eZ1pI4j") + "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime=" + currentTimeMillis + "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg", false);
            c14488.m34586("Cookie", f56190);
            c14488.m34586("Referer", "https://fanyi.youdao.com/");
            JSONObject jSONObject = new JSONObject(c14488.m34585());
            if (jSONObject.getInt("code") != 0) {
                throw new IOException(jSONObject.getString("msg"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(e.m);
            f56191 = jSONObject2.getString("secretKey");
            f56189 = C14460.m34526().digest(jSONObject2.getString("aesKey").getBytes());
            f56188 = C14460.m34526().digest(jSONObject2.getString("aesIv").getBytes());
        }
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            C14488 c144882 = new C14488("https://dict.youdao.com/webtranslate", true);
            c144882.m34586("Cookie", f56190);
            c144882.m34586("Referer", "https://fanyi.youdao.com/");
            c144882.m34584(am.aC, str);
            c144882.m34584("from", str5);
            c144882.m34584("to", str4);
            c144882.m34584("useTerm", "false");
            c144882.m34584("domain", "0");
            c144882.m34584("dictResult", "true");
            c144882.m34584("keyid", "webfanyi");
            c144882.m34584("sign", C14460.m34524("client=fanyideskweb&mysticTime=" + currentTimeMillis2 + "&product=webfanyi&key=" + f56191));
            c144882.m34584("client", "fanyideskweb");
            c144882.m34584("product", "webfanyi");
            c144882.m34584("appVersion", "1.0.0");
            c144882.m34584("vendor", "web");
            c144882.m34584("pointParam", "client,mysticTime,product");
            c144882.m34584("mysticTime", String.valueOf(currentTimeMillis2));
            c144882.m34584("keyfrom", "fanyi.web");
            c144882.m34584("mid", "1");
            c144882.m34584("screen", "1");
            c144882.m34584("model", "1");
            c144882.m34584("network", "wifi");
            c144882.m34584("abtest", "0");
            c144882.m34584("yduuid", "abcdefg");
            byte[] decode = Base64.decode(c144882.m34585().replace('_', '/').replace('-', '+'), 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f56189, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f56188);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            JSONObject jSONObject3 = new JSONObject(new String(cipher.doFinal(decode), StandardCharsets.UTF_8));
            int i = jSONObject3.getInt("code");
            if (i == 0) {
                JSONArray jSONArray = jSONObject3.getJSONArray("translateResult");
                StringBuilder sb = new StringBuilder();
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append(jSONArray.getJSONArray(i2).getJSONObject(0).getString("tgt"));
                }
                return sb.toString();
            }
            if (i == 50) {
                f56190 = null;
            }
            throw new IOException(jSONObject3.toString());
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
