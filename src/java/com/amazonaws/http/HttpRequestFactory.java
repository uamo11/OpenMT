package com.amazonaws.http;

import com.alipay.sdk.m.w.a;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import l.C22870;
import l.C7166;

/* loaded from: classes.dex */
public class HttpRequestFactory {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HttpRequest m265(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String m774 = HttpUtils.m774(defaultRequest.m188().toString(), defaultRequest.m195(), true);
        String m773 = HttpUtils.m773(defaultRequest);
        HttpMethodName m193 = defaultRequest.m193();
        boolean z2 = defaultRequest.m177() != null;
        if (m193 == HttpMethodName.POST && !z2) {
            z = false;
        }
        if (m773 != null && z) {
            m774 = C22870.m50967(m774, "?", m773);
        }
        HashMap hashMap = new HashMap();
        URI m188 = defaultRequest.m188();
        String host = m188.getHost();
        if (HttpUtils.m776(m188)) {
            StringBuilder m19190 = C7166.m19190(host, ":");
            m19190.append(m188.getPort());
            host = m19190.toString();
        }
        hashMap.put("Host", host);
        for (Map.Entry entry : defaultRequest.m191().entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        if (hashMap.get("Content-Type") == null || ((String) hashMap.get("Content-Type")).isEmpty()) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.m789(a.D));
        }
        InputStream m177 = defaultRequest.m177();
        HttpMethodName httpMethodName = HttpMethodName.PATCH;
        if (m193 == httpMethodName) {
            m193 = HttpMethodName.POST;
            hashMap.put("X-HTTP-Method-Override", httpMethodName.toString());
        }
        if (m193 == HttpMethodName.POST && defaultRequest.m177() == null && m773 != null) {
            byte[] bytes = m773.getBytes(StringUtils.f844);
            m177 = new ByteArrayInputStream(bytes);
            hashMap.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        hashMap.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(m193.toString(), URI.create(m774), hashMap, m177);
        httpRequest.m259(defaultRequest.m194());
        return httpRequest;
    }
}
