package l;

import android.media.Image;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: A75O */
/* renamed from: l.ۨܶۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11780 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35154;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f35155;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f35156;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f35157;

    public C11780(Image.Plane plane) {
        ByteBuffer buffer = plane.getBuffer();
        this.f35155 = buffer;
        this.f35154 = buffer.position();
        this.f35157 = plane.getRowStride();
        this.f35156 = plane.getPixelStride();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28822(C11780 c11780, int i, int i2) {
        ByteBuffer byteBuffer = c11780.f35155;
        long j = c11780.f35154;
        long j2 = (i * c11780.f35156) + (i2 * c11780.f35157) + j;
        if (j2 < j || j2 >= byteBuffer.limit()) {
            throw new IOException("MPEG-TS decoder plane is truncated");
        }
        return byteBuffer.get((int) j2) & 255;
    }
}
