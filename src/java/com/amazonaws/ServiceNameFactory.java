package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* loaded from: classes.dex */
public enum ServiceNameFactory {
    ;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m201(String str) {
        HttpClientConfig m286 = InternalConfig.Factory.m289().m286(str);
        if (m286 == null) {
            return null;
        }
        return m286.m285();
    }
}
