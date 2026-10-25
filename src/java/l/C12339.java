package l;

import java.nio.ByteBuffer;

/* compiled from: 28IA */
/* renamed from: l.۫ۤ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12339 extends AbstractC0759 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f36940 = Float.floatToIntBits(Float.NaN);

    @Override // l.AbstractC0759
    /* renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) {
        int i = c18399.f57133;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C19105(c18399);
        }
        if (i != 4) {
            return new C18399(c18399.f57134, c18399.f57132, 4);
        }
        return C18399.f57130;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        ByteBuffer m2900;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f2818.f57133;
        if (i2 == 21) {
            m2900 = m2900((i / 3) * 4);
            while (position < limit) {
                m29943(m2900, ((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24));
                position += 3;
            }
        } else if (i2 == 22) {
            m2900 = m2900(i);
            while (position < limit) {
                m29943(m2900, (byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24));
                position += 4;
            }
        } else if (i2 == 1342177280) {
            m2900 = m2900((i / 3) * 4);
            while (position < limit) {
                m29943(m2900, ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24));
                position += 3;
            }
        } else if (i2 == 1610612736) {
            m2900 = m2900(i);
            while (position < limit) {
                m29943(m2900, (byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        m2900.flip();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29943(ByteBuffer byteBuffer, int i) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f36940) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
