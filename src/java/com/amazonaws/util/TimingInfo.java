package com.amazonaws.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class TimingInfo {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Long f845;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f846;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo791(long j, String str) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo792(String str) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo793(String str, TimingInfo timingInfo) {
    }

    public TimingInfo(long j, Long l2) {
        this.f846 = j;
        this.f845 = l2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m795() {
        return this.f846;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m794() {
        Long l2 = this.f845;
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final String toString() {
        Double valueOf = m796() ? Double.valueOf(TimeUnit.NANOSECONDS.toMicros(this.f845.longValue() - this.f846) / 1000.0d) : null;
        return String.valueOf(valueOf == null ? -1.0d : valueOf.doubleValue());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m796() {
        return this.f845 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo790() {
        this.f845 = Long.valueOf(System.nanoTime());
    }
}
