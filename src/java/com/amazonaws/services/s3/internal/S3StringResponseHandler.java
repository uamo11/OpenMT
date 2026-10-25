package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

/* loaded from: classes.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        AmazonWebServiceResponse m457 = AbstractS3ResponseHandler.m457(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream m266 = httpResponse.m266();
        while (true) {
            int read = m266.read(bArr);
            if (read > 0) {
                sb.append(new String(bArr, 0, read, StringUtils.f844));
            } else {
                m457.m165(sb.toString());
                return m457;
            }
        }
    }
}
