package com.alipay.sdk.m.y;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e {
    public static WebResourceResponse a(String str) {
        WebResourceResponse webResourceResponse = null;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(c(str));
                    HashMap hashMap = new HashMap();
                    hashMap.put("Access-Control-Allow-Origin", "*");
                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(mimeTypeFromExtension, com.alipay.sdk.m.w.a.D, fileInputStream);
                    try {
                        webResourceResponse2.setResponseHeaders(hashMap);
                        return webResourceResponse2;
                    } catch (Throwable th) {
                        th = th;
                        webResourceResponse = webResourceResponse2;
                        g.a(th);
                        return webResourceResponse;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return webResourceResponse;
    }

    public static void b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        b(file2.getAbsolutePath());
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static String c(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    public static JSONObject d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    String sb2 = sb.toString();
                    g.b(com.alipay.sdk.m.n.a.B, "readFileToJSON result=" + sb2);
                    return new JSONObject(sb2);
                }
                sb.append(readLine);
            }
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }
}
