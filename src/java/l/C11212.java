package l;

import java.util.LinkedList;

/* compiled from: P9V5 */
/* renamed from: l.ۧ᩵᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11212 extends AbstractC12601 implements InterfaceC14242 {

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f33639 = C11321.m27961(C11212.class);

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f33640;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final String f33641;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public byte[] f33642;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f33643;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23184[] f33644;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public long f33645;

    @Override // l.AbstractC3429
    /* renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C11212(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f33642 = new byte[16];
        this.f33641 = str;
    }

    @Override // l.AbstractC12601, l.InterfaceC1543
    /* renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
        if (mo28213() && (interfaceC7578 instanceof InterfaceC4840)) {
            ((InterfaceC4840) interfaceC7578).mo8489(this.f33642);
        }
        super.mo5288(interfaceC7578);
    }

    @Override // l.InterfaceC14242
    /* renamed from: ۛ */
    public final long mo7549() {
        return this.f33643;
    }

    @Override // l.InterfaceC14242
    public final long getSize() {
        return this.f33645;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final long m27781() {
        return this.f33645;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f33640;
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final byte[] m27780() {
        return this.f33642;
    }

    @Override // l.AbstractC3429
    /* renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        int m5123;
        if (C1480.m5121(i, bArr) != 89) {
            throw new C17771("Structure size is not 89");
        }
        byte b = bArr[i + 2];
        byte b2 = bArr[i + 3];
        C1480.m5123(i + 4, bArr);
        C1480.m5127(i + 8, bArr);
        C1480.m5127(i + 16, bArr);
        this.f33643 = C1480.m5127(i + 24, bArr);
        C1480.m5127(i + 32, bArr);
        C1480.m5125(i + 40, bArr);
        this.f33645 = C1480.m5125(i + 48, bArr);
        this.f33640 = C1480.m5123(i + 56, bArr);
        byte[] bArr2 = this.f33642;
        System.arraycopy(bArr, i + 64, bArr2, 0, 16);
        int m51232 = C1480.m5123(i + 80, bArr);
        int m51233 = C1480.m5123(i + 84, bArr);
        int i2 = i + 88;
        if (m51232 > 0 && m51233 > 0) {
            LinkedList linkedList = new LinkedList();
            int m10453 = m10453() + m51232;
            do {
                m5123 = C1480.m5123(m10453, bArr);
                int m5121 = C1480.m5121(m10453 + 4, bArr);
                int m51212 = C1480.m5121(m10453 + 6, bArr);
                int m51213 = C1480.m5121(m10453 + 10, bArr);
                int m51234 = C1480.m5123(m10453 + 12, bArr);
                int i3 = m5121 + m10453;
                System.arraycopy(bArr, i3, new byte[m51212], 0, m51212);
                int max = Math.max(Math.max(m10453 + 16, i3 + m51212), m51213 + m10453 + m51234);
                if (m5123 > 0) {
                    m10453 += m5123;
                }
                i2 = Math.max(i2, max);
            } while (m5123 > 0);
            this.f33644 = (InterfaceC23184[]) linkedList.toArray(new InterfaceC23184[0]);
        }
        InterfaceC2148 interfaceC2148 = f33639;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Opened " + this.f33641 + ": " + C12085.m29468(bArr2, 0, bArr2.length));
        }
        return i2 - i;
    }
}
