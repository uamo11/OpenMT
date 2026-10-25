package com.alipay.sdk.m.j;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a extends com.alipay.sdk.m.i.a {
    public static final /* synthetic */ boolean d = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a a(String str, long j, b bVar, short s, e eVar) {
        byte[] a = com.alipay.sdk.m.i.c.a((byte) 1);
        boolean z = d;
        if (!z && a.length != 1) {
            throw new AssertionError();
        }
        byte[] a2 = com.alipay.sdk.m.i.c.a(str.charAt(0), str.charAt(1));
        if (!z && a2.length != 2) {
            throw new AssertionError();
        }
        byte[] a3 = com.alipay.sdk.m.i.c.a(j);
        if (!z && a3.length != 8) {
            throw new AssertionError();
        }
        byte[] b = com.alipay.sdk.m.i.c.b();
        if (!z && b.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] a4 = com.alipay.sdk.m.i.c.a(bVar.a);
        if (!z && a4.length != 1) {
            throw new AssertionError();
        }
        byte[] a5 = com.alipay.sdk.m.i.c.a(bVar.b);
        if (!z && a5.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.c.clone();
        if (!z && bArr.length != (bVar.b & 255)) {
            throw new AssertionError();
        }
        byte[] a6 = com.alipay.sdk.m.i.c.a(s);
        if (!z && a6.length != 2) {
            throw new AssertionError();
        }
        byte[] b2 = com.alipay.sdk.m.i.c.b();
        if (!z && b2.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] a7 = com.alipay.sdk.m.i.c.a(eVar.a);
        if (!z && a7.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.b.clone();
        if (!z && bArr2.length != (eVar.a & 255)) {
            throw new AssertionError();
        }
        byte[] c = com.alipay.sdk.m.i.c.c();
        if (z || c.length == 4) {
            return new a(com.alipay.sdk.m.i.c.a(a, a2, a3, b, a4, a5, bArr, a6, b2, a7, bArr2, c));
        }
        throw new AssertionError();
    }

    public static a c() {
        try {
            return a(com.alipay.sdk.m.i.a.c, 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}
