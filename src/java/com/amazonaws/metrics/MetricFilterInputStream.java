package com.amazonaws.metrics;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MetricFilterInputStream extends SdkFilterInputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteThroughputHelper f274;

    @Override // com.amazonaws.internal.SdkFilterInputStream, com.amazonaws.internal.MetricAware
    /* renamed from: ֫ */
    public final boolean mo279() {
        return true;
    }

    public MetricFilterInputStream(ThroughputMetricType throughputMetricType, InputStream inputStream) {
        super(inputStream);
        this.f274 = new ByteThroughputHelper(throughputMetricType);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        m281();
        ByteThroughputHelper byteThroughputHelper = this.f274;
        byteThroughputHelper.getClass();
        if (TimeUnit.NANOSECONDS.toSeconds(byteThroughputHelper.m350()) > 10 && byteThroughputHelper.m349() > 0) {
            AwsSdkMetrics.m339().getClass();
            byteThroughputHelper.m351();
        }
        long nanoTime = System.nanoTime();
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            this.f274.mo348(read, nanoTime);
        }
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteThroughputHelper byteThroughputHelper = this.f274;
        if (byteThroughputHelper.m349() > 0) {
            AwsSdkMetrics.m339().getClass();
            byteThroughputHelper.m351();
        }
        ((FilterInputStream) this).in.close();
        m281();
    }
}
