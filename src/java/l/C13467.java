package l;

/* compiled from: O8OV */
/* renamed from: l.ܰ֡ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13467 implements InterfaceC14773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f40205 = new C17714();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9248 f40206;

    public C13467(C9248 c9248) {
        this.f40206 = c9248;
    }

    @Override // l.InterfaceC14773
    /* renamed from: ֫ */
    public final C17596 mo27214(InterfaceC8424 interfaceC8424, long j) {
        long position = interfaceC8424.getPosition();
        int min = (int) Math.min(20000L, interfaceC8424.getLength() - position);
        C17714 c17714 = this.f40205;
        c17714.m41481(min);
        interfaceC8424.mo22061(0, min, c17714.m41482());
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (c17714.m41457() >= 4) {
            if (C7118.m19133(c17714.m41485(), c17714.m41482()) != 442) {
                c17714.m41478(1);
            } else {
                c17714.m41478(4);
                long m5495 = C1619.m5495(c17714);
                if (m5495 != -9223372036854775807L) {
                    long m23734 = this.f40206.m23734(m5495);
                    if (m23734 > j) {
                        if (j2 == -9223372036854775807L) {
                            return C17596.m41127(m23734, position);
                        }
                        return C17596.m41126(position + i2);
                    }
                    if (100000 + m23734 > j) {
                        return C17596.m41126(position + c17714.m41485());
                    }
                    i2 = c17714.m41485();
                    j2 = m23734;
                }
                int m41483 = c17714.m41483();
                if (c17714.m41457() < 10) {
                    c17714.m41484(m41483);
                } else {
                    c17714.m41478(9);
                    int m41456 = c17714.m41456() & 7;
                    if (c17714.m41457() < m41456) {
                        c17714.m41484(m41483);
                    } else {
                        c17714.m41478(m41456);
                        if (c17714.m41457() < 4) {
                            c17714.m41484(m41483);
                        } else {
                            if (C7118.m19133(c17714.m41485(), c17714.m41482()) == 443) {
                                c17714.m41478(4);
                                int m41464 = c17714.m41464();
                                if (c17714.m41457() < m41464) {
                                    c17714.m41484(m41483);
                                } else {
                                    c17714.m41478(m41464);
                                }
                            }
                            while (true) {
                                if (c17714.m41457() < 4) {
                                    break;
                                }
                                int m19133 = C7118.m19133(c17714.m41485(), c17714.m41482());
                                if (m19133 == 442 || m19133 == 441 || (m19133 >>> 8) != 1) {
                                    break;
                                }
                                c17714.m41478(4);
                                if (c17714.m41457() < 2) {
                                    c17714.m41484(m41483);
                                    break;
                                }
                                c17714.m41484(Math.min(c17714.m41483(), c17714.m41485() + c17714.m41464()));
                            }
                        }
                    }
                }
                i = c17714.m41485();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C17596.m41129(j2, position + i);
        }
        return C17596.f53767;
    }

    @Override // l.InterfaceC14773
    /* renamed from: ֫ */
    public final void mo27215() {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f40205;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
    }
}
