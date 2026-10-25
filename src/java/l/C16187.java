package l;

/* compiled from: M1QD */
/* renamed from: l.ܺ᩷ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16187 implements InterfaceC4194 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C16187 f49856 = new C16187();

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 3;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i2 + 2]) == ')' && ((char) bArr[i3]) == 'C') {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC4194
    /* renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45135;
    }
}
