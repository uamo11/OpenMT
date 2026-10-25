package l;

/* compiled from: B1QD */
/* renamed from: l.ۡ᩷ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9133 implements InterfaceC4194 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9133 f27661 = new C9133();

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 2;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i3]) == 'B') {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45124;
    }
}
