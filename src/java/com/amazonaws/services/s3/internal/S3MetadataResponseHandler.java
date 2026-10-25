package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* loaded from: classes.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.m456(httpResponse, objectMetadata);
        AmazonWebServiceResponse m457 = AbstractS3ResponseHandler.m457(httpResponse);
        m457.m165(objectMetadata);
        return m457;
    }
}
