package l;

/* compiled from: R9YE */
/* renamed from: l.ܺ᩵᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16149 extends AbstractC12601 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f49750;

    @Override // l.AbstractC3429
    /* renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m38067() {
        return this.f49750;
    }

    @Override // l.AbstractC3429
    /* renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        if (C1480.m5121(i, bArr) != 17) {
            throw new C17771("Expected structureSize = 17");
        }
        this.f49750 = C1480.m5123(i + 4, bArr);
        C1480.m5123(i + 8, bArr);
        return (i + 16) - i;
    }
}
