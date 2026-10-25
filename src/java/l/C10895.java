package l;

/* compiled from: G8K7 */
/* renamed from: l.ۧۡۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10895 implements InterfaceC14773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6307 f32763;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f32764;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4896 f32765 = new C4896();

    @Override // l.InterfaceC14773
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo27215() {
    }

    public C10895(C6307 c6307, int i) {
        this.f32763 = c6307;
        this.f32764 = i;
    }

    @Override // l.InterfaceC14773
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17596 mo27214(InterfaceC8424 interfaceC8424, long j) {
        long position = interfaceC8424.getPosition();
        long m27213 = m27213(interfaceC8424);
        long mo22069 = interfaceC8424.mo22069();
        interfaceC8424.mo22060(Math.max(6, this.f32763.f19528));
        long m272132 = m27213(interfaceC8424);
        long mo220692 = interfaceC8424.mo22069();
        if (m27213 <= j && m272132 > j) {
            return C17596.m41126(mo22069);
        }
        if (m272132 <= j) {
            return C17596.m41129(m272132, mo220692);
        }
        return C17596.m41127(m27213, position);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m27213(InterfaceC8424 interfaceC8424) {
        C4896 c4896;
        C6307 c6307;
        int mo22065;
        while (true) {
            long mo22069 = interfaceC8424.mo22069();
            long length = interfaceC8424.getLength() - 6;
            c4896 = this.f32765;
            c6307 = this.f32763;
            if (mo22069 >= length) {
                break;
            }
            long mo220692 = interfaceC8424.mo22069();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean m10668 = false;
            interfaceC8424.mo22061(0, 2, bArr);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.f32764;
            if (i2 != i3) {
                interfaceC8424.mo22066();
                interfaceC8424.mo22060((int) (mo220692 - interfaceC8424.getPosition()));
            } else {
                C17714 c17714 = new C17714(16);
                System.arraycopy(bArr, 0, c17714.m41482(), 0, 2);
                byte[] m41482 = c17714.m41482();
                while (i < 14 && (mo22065 = interfaceC8424.mo22065(2 + i, 14 - i, m41482)) != -1) {
                    i += mo22065;
                }
                c17714.m41486(i);
                interfaceC8424.mo22066();
                interfaceC8424.mo22060((int) (mo220692 - interfaceC8424.getPosition()));
                m10668 = C3485.m10668(c17714, c6307, i3, c4896);
            }
            if (m10668) {
                break;
            }
            interfaceC8424.mo22060(1);
        }
        if (interfaceC8424.mo22069() >= interfaceC8424.getLength() - 6) {
            interfaceC8424.mo22060((int) (interfaceC8424.getLength() - interfaceC8424.mo22069()));
            return c6307.f19533;
        }
        return c4896.f15458;
    }
}
