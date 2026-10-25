package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ResponseHeaderHandlerChain extends S3XmlResponseHandler {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f496;

    public ResponseHeaderHandlerChain(Unmarshaller unmarshaller, HeaderHandler... headerHandlerArr) {
        super(unmarshaller);
        this.f496 = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* renamed from: ֫ */
    public final AmazonWebServiceResponse mo276(HttpResponse httpResponse) {
        AmazonWebServiceResponse mo276 = super.mo276(httpResponse);
        Object m166 = mo276.m166();
        if (m166 != null) {
            Iterator it = this.f496.iterator();
            while (it.hasNext()) {
                ((HeaderHandler) it.next()).mo463(m166, httpResponse);
            }
        }
        return mo276;
    }
}
