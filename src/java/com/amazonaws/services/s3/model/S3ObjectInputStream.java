package com.amazonaws.services.s3.model;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;

/* loaded from: classes.dex */
public class S3ObjectInputStream extends SdkFilterInputStream {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public S3ObjectInputStream(java.io.InputStream r3) {
        /*
            r2 = this;
            boolean r0 = com.amazonaws.metrics.AwsSdkMetrics.m317()
            if (r0 != 0) goto L8
            r0 = 0
            goto L17
        L8:
            boolean r0 = r3 instanceof com.amazonaws.internal.MetricAware
            if (r0 == 0) goto L16
            r0 = r3
            com.amazonaws.internal.MetricAware r0 = (com.amazonaws.internal.MetricAware) r0
            boolean r0 = r0.mo279()
            r0 = r0 ^ 1
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L21
            com.amazonaws.metrics.MetricFilterInputStream r0 = new com.amazonaws.metrics.MetricFilterInputStream
            com.amazonaws.services.s3.metrics.S3ServiceMetric$1 r1 = com.amazonaws.services.s3.metrics.S3ServiceMetric.f517
            r0.<init>(r1, r3)
            r3 = r0
        L21:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.model.S3ObjectInputStream.<init>(java.io.InputStream):void");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream
    /* renamed from: ܽ */
    public final void mo280() {
        try {
            close();
        } catch (IOException e) {
            LogFactory.m302(getClass()).mo292("FYI", e);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int available = super.available();
        if (available == 0) {
            return 1;
        }
        return available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return super.read(bArr, 0, bArr.length);
    }
}
