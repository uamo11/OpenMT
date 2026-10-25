package l;

import java.nio.ByteBuffer;

/* compiled from: 18KE */
/* renamed from: l.֨ܺۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1221 extends AbstractC15126 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f4384 = new C17714();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16302 f4385 = new C16302();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9248 f4386;

    @Override // l.AbstractC15126
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        InterfaceC14723 c21683;
        C9248 c9248 = this.f4386;
        if (c9248 == null || c8072.f24876 != c9248.m23735()) {
            C9248 c92482 = new C9248(c8072.f69997);
            this.f4386 = c92482;
            c92482.m23731(c8072.f69997 - c8072.f24876);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C17714 c17714 = this.f4384;
        c17714.m41462(limit, array);
        C16302 c16302 = this.f4385;
        c16302.m38350(limit, array);
        c16302.m38351(39);
        long m38343 = (c16302.m38343(1) << 32) | c16302.m38343(32);
        c16302.m38351(20);
        int m383432 = c16302.m38343(12);
        int m383433 = c16302.m38343(8);
        c17714.m41478(14);
        if (m383433 == 0) {
            c21683 = new C21683();
        } else if (m383433 == 255) {
            c21683 = C0515.m2226(c17714, m383432, m38343);
        } else if (m383433 == 4) {
            c21683 = C4749.m13897(c17714);
        } else if (m383433 == 5) {
            c21683 = C15331.m36362(c17714, m38343, this.f4386);
        } else {
            c21683 = m383433 != 6 ? null : C3338.m10195(c17714, m38343, this.f4386);
        }
        return c21683 == null ? new C23896(new InterfaceC14723[0]) : new C23896(c21683);
    }
}
