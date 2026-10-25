package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: F8CE */
/* renamed from: l.ۜۨܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6744 implements InterfaceC9567 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f20947 = {1, 5, 9, 13, 17};

    @Override // l.InterfaceC9567
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18360(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            while (wrap.remaining() >= 4) {
                int i3 = wrap.getInt();
                if (i3 != 407708164) {
                    if ((i3 >>> 4) != 25481893 || wrap.remaining() < 4 || wrap.remaining() < (i2 = wrap.getInt())) {
                        break;
                    }
                    wrap.position(wrap.position() + i2);
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC9567
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo18357(InterfaceC7889 interfaceC7889) {
        try {
            interfaceC7889.seek(4L);
            if (C8161.m21630(interfaceC7889.readByte()).m21633(EnumC1105.CONTENT_SIZE)) {
                interfaceC7889.skipBytes(1);
                return interfaceC7889.readLong();
            }
        } catch (RuntimeException unused) {
        }
        return -1L;
    }

    @Override // l.InterfaceC9567
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo18358(InputStream inputStream) {
        return new C19451(inputStream);
    }

    @Override // l.InterfaceC9567
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream mo18359(OutputStream outputStream, int i, long j) {
        return new C21567(outputStream, f20947[i], j);
    }
}
