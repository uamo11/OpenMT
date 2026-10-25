package l;

/* compiled from: 81Q9 */
/* renamed from: l.ۚ᩺ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5659 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f17466 = new byte[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m15967(int i, int i2, byte[] bArr) {
        if (i <= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) Math.max(Math.min(bArr.length + (bArr.length >> 1), 2147483639L), i)];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
