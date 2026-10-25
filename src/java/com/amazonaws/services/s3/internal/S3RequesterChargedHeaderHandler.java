package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* loaded from: classes.dex */
public class S3RequesterChargedHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* renamed from: ֫ */
    public final void mo463(Object obj, HttpResponse httpResponse) {
        ((S3RequesterChargedResult) obj).mo465(httpResponse.m267().get("x-amz-request-charged") != null);
    }
}
