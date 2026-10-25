package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SDKGlobalConfiguration {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f118 = new AtomicLong(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m200(long j) {
        f118.set(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m199() {
        return f118.get();
    }
}
