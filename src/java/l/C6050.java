package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: 18H2 */
/* renamed from: l.ۛ۫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6050 extends AbstractC0759 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f18549;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f18550;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16879(int[] iArr) {
        this.f18549 = iArr;
    }

    @Override // l.AbstractC0759
    /* renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) {
        int i = c18399.f57133;
        int[] iArr = this.f18549;
        if (iArr == null) {
            return C18399.f57130;
        }
        int i2 = c18399.f57132;
        if (!C3603.m11034(i)) {
            throw new C19105(c18399);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C19105("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c18399);
            }
            z |= i4 != i3;
            i3++;
        }
        if (z) {
            return new C18399(c18399.f57134, iArr.length, i);
        }
        return C18399.f57130;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        int[] iArr = this.f18550;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m2900 = m2900(((limit - position) / this.f2818.f57131) * this.f2819.f57131);
        while (position < limit) {
            for (int i : iArr) {
                int m11047 = (C3603.m11047(this.f2818.f57133) * i) + position;
                int i2 = this.f2818.f57133;
                if (i2 != 2) {
                    if (i2 == 3) {
                        m2900.put(byteBuffer.get(m11047));
                    } else if (i2 == 4) {
                        m2900.putFloat(byteBuffer.getFloat(m11047));
                    } else {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.f2818.f57133);
                                        }
                                    }
                                }
                            }
                            m2900.putInt(byteBuffer.getInt(m11047));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? m11047 : m11047 + 2);
                        byte b2 = byteBuffer.get(m11047 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            m11047 += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(m11047) << 8) & 65280)) >> 8;
                        C22632.m50630("Value out of range of 24-bit integer: " + Integer.toHexString(i3), (i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608);
                        C22632.m50631(m2900.remaining() >= 3);
                        m2900.put((byte) (m2900.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (m2900.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    }
                }
                m2900.putShort(byteBuffer.getShort(m11047));
            }
            position += this.f2818.f57131;
        }
        byteBuffer.position(limit);
        m2900.flip();
    }

    @Override // l.AbstractC0759
    /* renamed from: ܳ */
    public final void mo2904() {
        this.f18550 = this.f18549;
    }

    @Override // l.AbstractC0759
    /* renamed from: ۜ */
    public final void mo2902() {
        this.f18550 = null;
        this.f18549 = null;
    }
}
