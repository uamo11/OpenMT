package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* loaded from: classes.dex */
public class CompleteMultipartUploadResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, Serializable {
    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* renamed from: ֫ */
    public final void mo468(Date date) {
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* renamed from: ֫ */
    public final void mo465(boolean z) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* renamed from: ܽ */
    public final void mo469(String str) {
    }
}
