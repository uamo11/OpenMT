package l;

import java.util.zip.CRC32;

/* compiled from: R9L1 */
/* renamed from: l.ܳ֫᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42893;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f42894;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42895;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33882() {
        CRC32 crc32 = new CRC32();
        crc32.update(this.f42895 & 255);
        crc32.update((this.f42895 >>> 8) & 255);
        crc32.update((this.f42895 >>> 16) & 255);
        crc32.update((this.f42895 >>> 24) & 255);
        crc32.update(this.f42894);
        this.f42893 = (int) crc32.getValue();
    }

    public final String toString() {
        byte[] bArr = new byte[4];
        C15972.m37746(0, this.f42895, bArr);
        return new String(bArr) + " dataLen=" + this.f42894.length;
    }
}
