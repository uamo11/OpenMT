package l;

/* compiled from: D4GD */
/* renamed from: l.᩸ܰۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21618 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22323 f69399;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15266 f69400 = null;

    public C21618(C22323 c22323) {
        this.f69399 = c22323;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48836(int i, byte[] bArr) {
        bArr.getClass();
        if (this.f69400 == null) {
            this.f69400 = new C15266();
        }
        this.f69400.m36281(bArr);
        int i2 = i == 0 ? this.f69400.f46848 : i;
        C15266 c15266 = this.f69400;
        byte[] bArr2 = this.f69399.f72346;
        int i3 = c15266.f46848;
        int i4 = 0;
        int i5 = (i2 / i3) + (i2 % i3 > 0 ? 1 : 0);
        int i6 = i2 - ((i5 - 1) * i3);
        byte[] bArr3 = new byte[i5 * i3];
        int i7 = 0;
        for (int i8 = 1; i8 <= i5; i8++) {
            int i9 = c15266.f46848;
            byte[] bArr4 = new byte[i9];
            byte[] bArr5 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, i4, bArr5, i4, bArr2.length);
            int length = bArr2.length;
            bArr5[length] = (byte) (i8 / 16777216);
            bArr5[length + 1] = (byte) (i8 / 65536);
            bArr5[length + 2] = (byte) (i8 / 256);
            bArr5[length + 3] = (byte) i8;
            for (int i10 = 0; i10 < 1000; i10++) {
                bArr5 = c15266.f46849.doFinal(bArr5);
                for (int i11 = 0; i11 < i9; i11++) {
                    bArr4[i11] = (byte) (bArr4[i11] ^ bArr5[i11]);
                }
            }
            i4 = 0;
            System.arraycopy(bArr4, 0, bArr3, i7, i9);
            i7 += i3;
        }
        if (i6 >= i3) {
            return bArr3;
        }
        byte[] bArr6 = new byte[i2];
        System.arraycopy(bArr3, i4, bArr6, i4, i2);
        return bArr6;
    }
}
