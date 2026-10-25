package l;

/* compiled from: JBNC */
/* renamed from: l.᩺ۧᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22955 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51078(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51081(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51079(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51077(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m51080(int i) {
        byte[] bArr = new byte[4];
        m51078(i, 0, bArr);
        return bArr;
    }
}
