package l;

/* compiled from: V9HU */
/* renamed from: l.ۛܰۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6091 extends AbstractC23024 {
    public final String toString() {
        return "big endian";
    }

    @Override // l.AbstractC23024
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo17000(C10325 c10325) {
        c10325.getClass();
        c10325.m26087(8, new byte[8]);
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) | (r1[i] & 255);
        }
        return j;
    }

    @Override // l.AbstractC23024
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17002(C10325 c10325, String str) {
        byte[] bytes = str.getBytes(C8208.f25223);
        c10325.getClass();
        c10325.m26077(bytes.length, bytes);
    }

    @Override // l.AbstractC23024
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo17003(C10325 c10325) {
        c10325.m26087(4, new byte[4]);
        return (r1[3] & 255) | ((r1[0] << 24) & 4278190080L) | ((r1[1] << 16) & 16711680) | ((r1[2] << 8) & 65280);
    }

    @Override // l.AbstractC23024
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17001(C10325 c10325, long j) {
        c10325.m26077(8, new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
    }
}
