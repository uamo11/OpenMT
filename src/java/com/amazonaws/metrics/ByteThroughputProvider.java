package com.amazonaws.metrics;

/* loaded from: classes.dex */
public abstract class ByteThroughputProvider {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f270;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f271;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ThroughputMetricType f272;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f272 = throughputMetricType;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m349() {
        return this.f270;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m350() {
        return this.f271;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f272, Integer.valueOf(this.f270), Long.valueOf(this.f271));
    }

    /* renamed from: ֫ */
    public void mo348(int i, long j) {
        this.f270 += i;
        this.f271 = (System.nanoTime() - j) + this.f271;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m351() {
        this.f270 = 0;
        this.f271 = 0L;
    }
}
