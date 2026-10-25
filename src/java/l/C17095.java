package l;

import java.nio.charset.Charset;

/* compiled from: 46YI */
/* renamed from: l.ܿۘۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17095 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f52400;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52401;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Charset f52402;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52403;

    public C17095(Charset charset, String str, int i, byte[] bArr) {
        this.f52402 = charset;
        this.f52403 = str;
        this.f52401 = i;
        this.f52400 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m40113() {
        byte[] bArr = this.f52400;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40112(byte[] bArr) {
        C17801 m33924;
        m33924 = C14272.m33924(bArr);
        return m33924 == C14272.m33921(this.f52403);
    }
}
