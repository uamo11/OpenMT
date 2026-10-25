package l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: F8CE */
/* renamed from: l.᩻ۨܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23677 implements InterfaceC9567 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f76704 = {-5, -1, 3, 19, 22};

    @Override // l.InterfaceC9567
    /* renamed from: ֫ */
    public final boolean mo18360(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            while (wrap.remaining() >= 4) {
                int i3 = wrap.getInt();
                if (i3 != -47205080) {
                    if (i3 != 407710288 || wrap.remaining() < 4 || wrap.remaining() < (i2 = wrap.getInt())) {
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
    /* renamed from: ֫ */
    public final long mo18357(InterfaceC7889 interfaceC7889) {
        byte[] bArr = new byte[(int) Math.min(22L, interfaceC7889.length())];
        interfaceC7889.seek(0L);
        interfaceC7889.readFully(bArr);
        try {
            long frameContentSize = Zstd.getFrameContentSize(bArr);
            if (frameContentSize <= 0) {
                return -1L;
            }
            return frameContentSize;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // l.InterfaceC9567
    /* renamed from: ֫ */
    public final InputStream mo18358(InputStream inputStream) {
        return new ZstdInputStream(inputStream);
    }

    @Override // l.InterfaceC9567
    /* renamed from: ֫ */
    public final OutputStream mo18359(OutputStream outputStream, int i, long j) {
        return new ZstdOutputStream(outputStream, f76704[i]);
    }
}
