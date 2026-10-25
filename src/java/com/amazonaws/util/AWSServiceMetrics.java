package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

@Deprecated
/* loaded from: classes.dex */
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime("HttpClient");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f821;

    AWSServiceMetrics(String str) {
        this.f821 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m737() {
        return this.f821;
    }
}
