package l;

/* compiled from: P1Q9 */
/* renamed from: l.ۚ᩷ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5605 implements InterfaceC4194 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5605 f17348 = new C5605();

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && i4 == 0 && i5 == 0) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45133;
    }
}
