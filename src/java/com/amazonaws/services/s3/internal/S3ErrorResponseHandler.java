package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* loaded from: classes.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Log f498 = LogFactory.m302(S3ErrorResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* renamed from: ֫ */
    public final boolean mo277() {
        return false;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        Log log = f498;
        InputStream m266 = httpResponse.m266();
        if (m266 == null) {
            return m474(httpResponse.m269(), httpResponse);
        }
        try {
            String m781 = IOUtils.m781(m266);
            try {
                Document m801 = XpathUtils.m801(m781);
                String m800 = XpathUtils.m800("Error/Message", m801);
                String m8002 = XpathUtils.m800("Error/Code", m801);
                String m8003 = XpathUtils.m800("Error/RequestId", m801);
                String m8004 = XpathUtils.m800("Error/HostId", m801);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(m800);
                amazonS3Exception.m143(httpResponse.m270());
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m144(m8002);
                amazonS3Exception.m148(m8003);
                amazonS3Exception.m525(m8004);
                return amazonS3Exception;
            } catch (Exception e) {
                if (log.mo293()) {
                    log.mo292("Failed in parsing the response as XML: " + m781, e);
                }
                return m474(m781, httpResponse);
            }
        } catch (IOException e2) {
            if (log.mo293()) {
                log.mo292("Failed in reading the error response", e2);
            }
            return m474(httpResponse.m269(), httpResponse);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AmazonS3Exception m474(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int m270 = httpResponse.m270();
        amazonS3Exception.m144(m270 + " " + httpResponse.m269());
        amazonS3Exception.m143(m270);
        AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
        Map m267 = httpResponse.m267();
        amazonS3Exception.m148((String) m267.get("x-amz-request-id"));
        amazonS3Exception.m525((String) m267.get("x-amz-id-2"));
        HashMap hashMap = new HashMap();
        hashMap.put("x-amz-bucket-region", m267.get("x-amz-bucket-region"));
        amazonS3Exception.m523(hashMap);
        return amazonS3Exception;
    }
}
