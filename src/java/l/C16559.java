package l;

import java.io.EOFException;

/* compiled from: M8UL */
/* renamed from: l.ܽۢۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16559 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f50876 = new C17714(10);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m38956(InterfaceC8424 interfaceC8424, InterfaceC16743 interfaceC16743) {
        C17714 c17714 = this.f50876;
        C23896 c23896 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC8424.mo22061(0, 10, c17714.m41482());
                c17714.m41484(0);
                if (c17714.m41491() != 4801587) {
                    break;
                }
                c17714.m41478(3);
                int m41467 = c17714.m41467();
                int i2 = m41467 + 10;
                if (c23896 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c17714.m41482(), 0, bArr, 0, 10);
                    interfaceC8424.mo22061(10, m41467, bArr);
                    c23896 = new C17449(interfaceC16743).m40822(i2, bArr);
                } else {
                    interfaceC8424.mo22060(m41467);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC8424.mo22066();
        interfaceC8424.mo22060(i);
        return c23896;
    }
}
