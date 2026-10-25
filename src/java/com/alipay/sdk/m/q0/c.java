package com.alipay.sdk.m.q0;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }
}
