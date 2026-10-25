package l;

import java.util.ArrayList;

/* compiled from: A9XQ */
/* renamed from: l.ᩳ᩵᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18267 extends AbstractC12601 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final byte f56802;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public InterfaceC14325[] f56803;

    @Override // l.AbstractC3429
    /* renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C18267(InterfaceC1023 interfaceC1023, byte b) {
        super(interfaceC1023);
        this.f56802 = b;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325[] m42599() {
        return this.f56803;
    }

    @Override // l.AbstractC3429
    /* renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        if (C1480.m5121(i, bArr) != 9) {
            throw new C17771("Expected structureSize = 9");
        }
        int m10453 = m10453() + C1480.m5121(i + 2, bArr);
        int m5123 = C1480.m5123(i + 4, bArr);
        int i2 = i + 8;
        ArrayList arrayList = new ArrayList();
        do {
            C0837 c0837 = this.f56802 == 3 ? new C0837(m10458(), true) : null;
            if (c0837 != null) {
                c0837.mo2557(i2, m5123, bArr);
                arrayList.add(c0837);
                int m3112 = c0837.m3112();
                if (m3112 <= 0) {
                    break;
                }
                i2 += m3112;
            } else {
                break;
            }
        } while (i2 < m10453 + m5123);
        this.f56803 = (InterfaceC14325[]) arrayList.toArray(new InterfaceC14325[arrayList.size()]);
        return i2 - i;
    }
}
