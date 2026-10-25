package l;

/* compiled from: T9X7 */
/* renamed from: l.᩶֨᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19847 implements InterfaceC22190 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64110;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f64111;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64112;

    public C19847(byte[] bArr, int i, int i2) {
        this.f64111 = bArr;
        this.f64110 = i;
        this.f64112 = i2;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return this.f64112;
    }

    @Override // l.InterfaceC22190
    /* renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        byte[] bArr2 = this.f64111;
        int i2 = this.f64110;
        int i3 = this.f64112;
        System.arraycopy(bArr2, i2, bArr, i, i3);
        return i3;
    }
}
