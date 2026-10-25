package l;

/* compiled from: QA04 */
/* renamed from: l.᩶᩵᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20384 implements InterfaceC21795, InterfaceC22500 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f65781;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f65782;

    @Override // l.InterfaceC21795, l.InterfaceC22500
    /* renamed from: ֫ */
    public final int mo36537() {
        return 1;
    }

    public C20384(byte[] bArr, int[] iArr) {
        this.f65781 = iArr;
        this.f65782 = bArr;
    }

    public C20384() {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m46698() {
        return this.f65781;
    }

    @Override // l.InterfaceC22190
    /* renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        C1480.m5122(this.f65781 != null ? r0.length : 0L, i, bArr);
        C1480.m5122(this.f65782 != null ? r0.length : 0L, i + 2, bArr);
        int i2 = i + 4;
        int[] iArr = this.f65781;
        if (iArr != null) {
            for (int i3 : iArr) {
                C1480.m5122(i3, i2, bArr);
                i2 += 2;
            }
        }
        byte[] bArr2 = this.f65782;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += this.f65782.length;
        }
        return i2 - i;
    }

    @Override // l.InterfaceC8079
    /* renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int m5121 = C1480.m5121(i, bArr);
        int m51212 = C1480.m5121(i + 2, bArr);
        int i3 = i + 4;
        this.f65781 = new int[m5121];
        for (int i4 = 0; i4 < m5121; i4++) {
            this.f65781[i4] = C1480.m5121(i3, bArr);
            i3 += 2;
        }
        byte[] bArr2 = new byte[m51212];
        this.f65782 = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, m51212);
        return (i3 + m51212) - i;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        int[] iArr = this.f65781;
        int length = (iArr != null ? iArr.length * 2 : 0) + 4;
        byte[] bArr = this.f65782;
        return length + (bArr != null ? bArr.length : 0);
    }
}
