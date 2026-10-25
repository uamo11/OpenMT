package com.amazonaws.http;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ExecutionContext {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AWSRequestMetrics f183;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AWSCredentials f184;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f185;

    public ExecutionContext(CopyOnWriteArrayList copyOnWriteArrayList, boolean z) {
        this.f185 = copyOnWriteArrayList;
        this.f183 = z ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m257() {
        return this.f185;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AWSRequestMetrics m254() {
        return this.f183;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AWSCredentials m256() {
        return this.f184;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m255(AWSCredentials aWSCredentials) {
        this.f184 = aWSCredentials;
    }
}
